package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public class u {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final s b = new s();
    public static final u c = new u();

    public String a(j$.time.chrono.a aVar, j$.time.temporal.a aVar2, long j, TextStyle textStyle, Locale locale) {
        if (aVar == j$.time.chrono.q.c || !j$.time.d.b(aVar2)) {
            return b(aVar2, j, textStyle, locale);
        }
        return null;
    }

    public String b(j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        Object obj;
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
                        long j2 = i;
                        hashMap2.put(Long.valueOf(j2), eras[i]);
                        Long valueOf = Long.valueOf(j2);
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
                long j3 = 1;
                if (aVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                    int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (long j4 = 1; j4 <= length; j4++) {
                        String C = j$.time.a.C(j4, "LLLL", locale);
                        linkedHashMap.put(Long.valueOf(j4), C);
                        linkedHashMap2.put(Long.valueOf(j4), C.substring(0, Character.charCount(C.codePointAt(0))));
                        linkedHashMap3.put(Long.valueOf(j4), j$.time.a.C(j4, "LLL", locale));
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
                    long j5 = 1;
                    while (j5 <= length2) {
                        String B = j$.time.a.B(j5, "cccc", locale);
                        linkedHashMap4.put(Long.valueOf(j5), B);
                        long j6 = j3;
                        linkedHashMap5.put(Long.valueOf(j5), z ? new StringBuilder().appendCodePoint(B.codePointBefore(B.length())).toString() : B.substring(0, Character.charCount(B.codePointAt(0))));
                        linkedHashMap6.put(Long.valueOf(j5), j$.time.a.B(j5, "ccc", locale));
                        j5 += j6;
                        j3 = j6;
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
                            Long valueOf2 = Long.valueOf(j7);
                            String str2 = amPmStrings[i2];
                            hashMap5.put(valueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
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
