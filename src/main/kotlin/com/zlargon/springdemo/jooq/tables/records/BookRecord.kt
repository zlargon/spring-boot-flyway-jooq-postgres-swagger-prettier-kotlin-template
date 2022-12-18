/*
 * This file is generated by jOOQ.
 */
package com.zlargon.springdemo.jooq.tables.records

import com.zlargon.springdemo.jooq.tables.Book
import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl

/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookRecord() : UpdatableRecordImpl<BookRecord>(Book.BOOK), Record2<Int?, String?> {

  var id: Int?
    set(value): Unit = set(0, value)
    get(): Int? = get(0) as Int?

  var title: String?
    set(value): Unit = set(1, value)
    get(): String? = get(1) as String?

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override fun key(): Record1<Int?> = super.key() as Record1<Int?>

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  override fun fieldsRow(): Row2<Int?, String?> = super.fieldsRow() as Row2<Int?, String?>
  override fun valuesRow(): Row2<Int?, String?> = super.valuesRow() as Row2<Int?, String?>
  override fun field1(): Field<Int?> = Book.BOOK.ID
  override fun field2(): Field<String?> = Book.BOOK.TITLE
  override fun component1(): Int? = id
  override fun component2(): String? = title
  override fun value1(): Int? = id
  override fun value2(): String? = title

  override fun value1(value: Int?): BookRecord {
    this.id = value
    return this
  }

  override fun value2(value: String?): BookRecord {
    this.title = value
    return this
  }

  override fun values(value1: Int?, value2: String?): BookRecord {
    this.value1(value1)
    this.value2(value2)
    return this
  }

  /**
   * Create a detached, initialised BookRecord
   */
  constructor(id: Int? = null, title: String? = null) : this() {
    this.id = id
    this.title = title
  }
}