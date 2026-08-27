package org.telegram.messenger.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class FastDateFormat extends Format implements DateParser, DatePrinter {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final FormatCache<FastDateFormat> cache = new FormatCache<FastDateFormat>() { // from class: org.telegram.messenger.time.FastDateFormat.1
        @Override // org.telegram.messenger.time.FormatCache
        public FastDateFormat createInstance(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    };
    private static final long serialVersionUID = 2;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static FastDateFormat getDateInstance(int i10) {
        return cache.getDateInstance(i10, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11) {
        return cache.getDateTimeInstance(i10, i11, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getInstance() {
        return cache.getInstance();
    }

    public static FastDateFormat getTimeInstance(int i10) {
        return cache.getTimeInstance(i10, null, null);
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.applyRules(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.printer.equals(((FastDateFormat) obj).printer);
        }
        return false;
    }

    @Override // java.text.Format, org.telegram.messenger.time.DatePrinter
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.printer.format(obj, stringBuffer, fieldPosition);
    }

    @Override // org.telegram.messenger.time.DateParser, org.telegram.messenger.time.DatePrinter
    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    @Override // org.telegram.messenger.time.DateParser, org.telegram.messenger.time.DatePrinter
    public String getPattern() {
        return this.printer.getPattern();
    }

    @Override // org.telegram.messenger.time.DateParser, org.telegram.messenger.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    @Override // org.telegram.messenger.time.DateParser
    public Date parse(String str) {
        return this.parser.parse(str);
    }

    @Override // java.text.Format, org.telegram.messenger.time.DateParser
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + "," + this.printer.getLocale() + "," + this.printer.getTimeZone().getID() + "]";
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static FastDateFormat getDateInstance(int i10, Locale locale) {
        return cache.getDateInstance(i10, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11, Locale locale) {
        return cache.getDateTimeInstance(i10, i11, (TimeZone) null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return cache.getInstance(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i10, Locale locale) {
        return cache.getTimeInstance(i10, null, locale);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String format(long j10) {
        return this.printer.format(j10);
    }

    @Override // org.telegram.messenger.time.DateParser
    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public static FastDateFormat getDateInstance(int i10, TimeZone timeZone) {
        return cache.getDateInstance(i10, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11, TimeZone timeZone) {
        return getDateTimeInstance(i10, i11, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return cache.getInstance(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i10, TimeZone timeZone) {
        return cache.getTimeInstance(i10, timeZone, null);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String format(Date date) {
        return this.printer.format(date);
    }

    public static FastDateFormat getDateInstance(int i10, TimeZone timeZone, Locale locale) {
        return cache.getDateInstance(i10, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11, TimeZone timeZone, Locale locale) {
        return cache.getDateTimeInstance(i10, i11, timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return cache.getInstance(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i10, TimeZone timeZone, Locale locale) {
        return cache.getTimeInstance(i10, timeZone, locale);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return cache.getInstance(str, timeZone, locale);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(long j10, StringBuffer stringBuffer) {
        return this.printer.format(j10, stringBuffer);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.printer.format(date, stringBuffer);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }
}
