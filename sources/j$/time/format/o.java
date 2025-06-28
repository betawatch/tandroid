package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.A;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class o extends n {
    private static final ConcurrentHashMap d = new ConcurrentHashMap();
    private final TextStyle c;

    o(TextStyle textStyle) {
        super(j$.time.temporal.j.i(), "ZoneText(" + textStyle + ")");
        new HashMap();
        new HashMap();
        A.z(textStyle, "textStyle");
        this.c = textStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.n, j$.time.format.f
    public final boolean f(r rVar, StringBuilder sb) {
        String[] strArr;
        ZoneId zoneId = (ZoneId) rVar.f(j$.time.temporal.j.j());
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.k d2 = rVar.d();
            char c = d2.k(j$.time.temporal.a.INSTANT_SECONDS) ? zoneId.getRules().g(Instant.o(d2)) ? (char) 1 : (char) 0 : (char) 2;
            Locale c2 = rVar.c();
            TextStyle textStyle = TextStyle.NARROW;
            String str = null;
            Map map = null;
            TextStyle textStyle2 = this.c;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap = d;
                SoftReference softReference = (SoftReference) concurrentHashMap.get(id);
                if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(c2)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, c2), timeZone.getDisplayName(false, 0, c2), timeZone.getDisplayName(true, 1, c2), timeZone.getDisplayName(true, 0, c2), id, id};
                    if (map == null) {
                        map = new ConcurrentHashMap();
                    }
                    map.put(c2, strArr2);
                    concurrentHashMap.put(id, new SoftReference(map));
                    strArr = strArr2;
                }
                int f = textStyle2.f();
                str = c != 0 ? c != 1 ? strArr[f + 5] : strArr[f + 3] : strArr[f + 1];
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
