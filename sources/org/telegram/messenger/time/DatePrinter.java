package org.telegram.messenger.time;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface DatePrinter {
    String format(long j);

    String format(Calendar calendar);

    String format(Date date);

    StringBuffer format(long j, StringBuffer stringBuffer);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    StringBuffer format(Calendar calendar, StringBuffer stringBuffer);

    StringBuffer format(Date date, StringBuffer stringBuffer);

    Locale getLocale();

    String getPattern();

    TimeZone getTimeZone();
}
