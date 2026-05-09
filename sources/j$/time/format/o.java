package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.util.Objects;
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
        super(j$.time.temporal.l.j(), "ZoneText(" + textStyle + ")");
        new HashMap();
        new HashMap();
        this.c = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // j$.time.format.n, j$.time.format.f
    public final boolean k(r rVar, StringBuilder sb) {
        ?? r0;
        String[] strArr;
        ZoneId zoneId = (ZoneId) rVar.f(j$.time.temporal.l.k());
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.m d2 = rVar.d();
            String str = null;
            Map map = null;
            if (d2.g(j$.time.temporal.a.INSTANT_SECONDS)) {
                r0 = zoneId.getRules().g(Instant.H(d2));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (d2.g(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (d2.g(aVar2)) {
                        LocalDateTime O = LocalDateTime.O(LocalDate.T(d2.r(aVar)), j$.time.i.O(d2.r(aVar2)));
                        if (zoneId.getRules().e(O) == null) {
                            r0 = zoneId.getRules().g(Instant.K(ZonedDateTime.I(O, zoneId, null).F(), r0.b().L()));
                        }
                    }
                }
                r0 = 2;
            }
            Locale c = rVar.c();
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.c;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap = d;
                SoftReference softReference = (SoftReference) concurrentHashMap.get(id);
                if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(c)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, c), timeZone.getDisplayName(false, 0, c), timeZone.getDisplayName(true, 1, c), timeZone.getDisplayName(true, 0, c), id, id};
                    if (map == null) {
                        map = new ConcurrentHashMap();
                    }
                    map.put(c, strArr2);
                    concurrentHashMap.put(id, new SoftReference(map));
                    strArr = strArr2;
                }
                if (r0 == 0) {
                    str = strArr[textStyle2.k() + 1];
                } else if (r0 == 1) {
                    str = strArr[textStyle2.k() + 3];
                } else {
                    str = strArr[textStyle2.k() + 5];
                }
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
