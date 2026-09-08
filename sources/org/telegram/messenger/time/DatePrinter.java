package org.telegram.messenger.time;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public interface DatePrinter {
    String format(long j3);

    String format(Calendar calendar);

    String format(Date date);

    StringBuffer format(long j3, StringBuffer stringBuffer);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    StringBuffer format(Calendar calendar, StringBuffer stringBuffer);

    StringBuffer format(Date date, StringBuffer stringBuffer);

    Locale getLocale();

    String getPattern();

    TimeZone getTimeZone();
}
