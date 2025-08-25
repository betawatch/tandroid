package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
class u {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator b = new s();
    private static final u c = new u();
    public static final /* synthetic */ int d = 0;

    static u b() {
        return c;
    }

    public String c(j$.time.chrono.l lVar, j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        if (lVar == j$.time.chrono.s.d || !(aVar instanceof j$.time.temporal.a)) {
            return d(aVar, j, textStyle, locale);
        }
        return null;
    }

    public String d(j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
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
            } else if (aVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                j$.com.android.tools.r8.a.o(hashMap, DateFormatSymbols.getInstance(locale), locale);
                obj = new t(hashMap);
            } else if (aVar == j$.time.temporal.a.DAY_OF_WEEK) {
                j$.com.android.tools.r8.a.n(hashMap, DateFormatSymbols.getInstance(locale), locale);
                obj = new t(hashMap);
            } else if (aVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j3 = i2;
                        hashMap4.put(Long.valueOf(j3), amPmStrings[i2]);
                        Long valueOf2 = Long.valueOf(j3);
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
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            obj2 = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj2 instanceof t) {
            return ((t) obj2).a(j, textStyle);
        }
        return null;
    }
}
