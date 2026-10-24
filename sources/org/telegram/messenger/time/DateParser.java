package org.telegram.messenger.time;

import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
