package org.telegram.messenger.time;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface DatePrinter {
    String format(long j10);

    String format(Calendar calendar);

    String format(Date date);

    StringBuffer format(long j10, StringBuffer stringBuffer);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    StringBuffer format(Calendar calendar, StringBuffer stringBuffer);

    StringBuffer format(Date date, StringBuffer stringBuffer);

    Locale getLocale();

    String getPattern();

    TimeZone getTimeZone();
}
