package org.telegram.messenger.time;

import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public interface DateParser {
    Locale getLocale();

    String getPattern();

    TimeZone getTimeZone();

    Date parse(String str);

    Date parse(String str, ParsePosition parsePosition);

    Object parseObject(String str);

    Object parseObject(String str, ParsePosition parsePosition);
}
