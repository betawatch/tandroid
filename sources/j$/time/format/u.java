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

    public String a(j$.time.chrono.k kVar, j$.time.temporal.o oVar, long j10, TextStyle textStyle, Locale locale) {
        if (kVar == j$.time.chrono.r.c || !(oVar instanceof j$.time.temporal.a)) {
            return b(oVar, j10, textStyle, locale);
        }
        return null;
    }

    public String b(j$.time.temporal.o oVar, long j10, TextStyle textStyle, Locale locale) {
        Object obj;
        long j11;
        String substring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(oVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            if (oVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i10 = 0; i10 < eras.length; i10++) {
                    if (!eras[i10].isEmpty()) {
                        long j12 = i10;
                        hashMap2.put(Long.valueOf(j12), eras[i10]);
                        Long valueOf = Long.valueOf(j12);
                        String str = eras[i10];
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
                long j13 = 1;
                if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                    int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (long j14 = 1; j14 <= length; j14++) {
                        String D = j$.com.android.tools.r8.a.D(j14, "LLLL", locale);
                        linkedHashMap.put(Long.valueOf(j14), D);
                        linkedHashMap2.put(Long.valueOf(j14), D.substring(0, Character.charCount(D.codePointAt(0))));
                        linkedHashMap3.put(Long.valueOf(j14), j$.com.android.tools.r8.a.D(j14, "LLL", locale));
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
                } else if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
                    int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    boolean z4 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                    long j15 = 1;
                    while (j15 <= length2) {
                        String C = j$.com.android.tools.r8.a.C(j15, "cccc", locale);
                        linkedHashMap4.put(Long.valueOf(j15), C);
                        Long valueOf2 = Long.valueOf(j15);
                        if (!z4) {
                            j11 = j13;
                            substring = C.substring(0, Character.charCount(C.codePointAt(0)));
                        } else {
                            j11 = j13;
                            substring = new StringBuilder().appendCodePoint(C.codePointBefore(C.length())).toString();
                        }
                        linkedHashMap5.put(valueOf2, substring);
                        linkedHashMap6.put(Long.valueOf(j15), j$.com.android.tools.r8.a.C(j15, "ccc", locale));
                        j15 += j11;
                        j13 = j11;
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
                } else if (oVar == j$.time.temporal.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap4 = new HashMap();
                    HashMap hashMap5 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                    for (int i11 = 0; i11 < amPmStrings.length; i11++) {
                        if (!amPmStrings[i11].isEmpty()) {
                            long j16 = i11;
                            hashMap4.put(Long.valueOf(j16), amPmStrings[i11]);
                            Long valueOf3 = Long.valueOf(j16);
                            String str2 = amPmStrings[i11];
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
            return ((t) obj2).a(j10, textStyle);
        }
        return null;
    }
}
