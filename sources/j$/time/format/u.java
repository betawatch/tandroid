package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public class u {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final s b = new s();
    public static final u c = new u();

    public String a(j$.time.chrono.k kVar, j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        if (kVar == j$.time.chrono.r.c || !j$.time.c.b(aVar)) {
            return b(aVar, j, textStyle, locale);
        }
        return null;
    }

    public String b(j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        Object obj;
        long j2;
        String substring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(aVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            if (aVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i = 0; i < eras.length; i++) {
                    if (!eras[i].isEmpty()) {
                        long j3 = i;
                        hashMap2.put(Long.valueOf(j3), eras[i]);
                        Long valueOf = Long.valueOf(j3);
                        String str = eras[i];
                        hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                    }
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap2);
                    hashMap.put(TextStyle.SHORT, hashMap2);
                    hashMap.put(TextStyle.NARROW, hashMap3);
                }
                obj = new t(hashMap);
            } else {
                long j4 = 1;
                if (aVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                    int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (long j5 = 1; j5 <= length; j5++) {
                        String D = j$.com.android.tools.r8.a.D(j5, "LLLL", locale);
                        linkedHashMap.put(Long.valueOf(j5), D);
                        linkedHashMap2.put(Long.valueOf(j5), D.substring(0, Character.charCount(D.codePointAt(0))));
                        linkedHashMap3.put(Long.valueOf(j5), j$.com.android.tools.r8.a.D(j5, "LLL", locale));
                    }
                    if (length > 0) {
                        hashMap.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                        hashMap.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                        hashMap.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                        hashMap.put(TextStyle.FULL, linkedHashMap);
                        hashMap.put(TextStyle.NARROW, linkedHashMap2);
                        hashMap.put(TextStyle.SHORT, linkedHashMap3);
                    }
                    obj = new t(hashMap);
                } else if (aVar == j$.time.temporal.a.DAY_OF_WEEK) {
                    int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                    long j6 = 1;
                    while (j6 <= length2) {
                        String C = j$.com.android.tools.r8.a.C(j6, "cccc", locale);
                        linkedHashMap4.put(Long.valueOf(j6), C);
                        Long valueOf2 = Long.valueOf(j6);
                        if (!z) {
                            j2 = j4;
                            substring = C.substring(0, Character.charCount(C.codePointAt(0)));
                        } else {
                            j2 = j4;
                            substring = new StringBuilder().appendCodePoint(C.codePointBefore(C.length())).toString();
                        }
                        linkedHashMap5.put(valueOf2, substring);
                        linkedHashMap6.put(Long.valueOf(j6), j$.com.android.tools.r8.a.C(j6, "ccc", locale));
                        j6 += j2;
                        j4 = j2;
                    }
                    if (length2 > 0) {
                        hashMap.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                        hashMap.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                        hashMap.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                        hashMap.put(TextStyle.FULL, linkedHashMap4);
                        hashMap.put(TextStyle.NARROW, linkedHashMap5);
                        hashMap.put(TextStyle.SHORT, linkedHashMap6);
                    }
                    obj = new t(hashMap);
                } else if (aVar == j$.time.temporal.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap4 = new HashMap();
                    HashMap hashMap5 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                    for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                        if (!amPmStrings[i2].isEmpty()) {
                            long j7 = i2;
                            hashMap4.put(Long.valueOf(j7), amPmStrings[i2]);
                            Long valueOf3 = Long.valueOf(j7);
                            String str2 = amPmStrings[i2];
                            hashMap5.put(valueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                        }
                    }
                    if (!hashMap4.isEmpty()) {
                        hashMap.put(TextStyle.FULL, hashMap4);
                        hashMap.put(TextStyle.SHORT, hashMap4);
                        hashMap.put(TextStyle.NARROW, hashMap5);
                    }
                    obj = new t(hashMap);
                } else {
                    obj = "";
                }
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            obj2 = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj2 instanceof t) {
            return ((t) obj2).a(j, textStyle);
        }
        return null;
    }
}
