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
public final class o extends n {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public final TextStyle c;

    public o(TextStyle textStyle) {
        super(j$.time.temporal.p.e, "ZoneText(" + textStyle + ")");
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
    public final boolean l(r rVar, StringBuilder sb) {
        ?? r0;
        String[] strArr;
        ZoneId zoneId = (ZoneId) rVar.b(j$.time.temporal.p.a);
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            j$.time.temporal.l lVar = rVar.a;
            String str = null;
            Map map = null;
            if (lVar.h(aVar)) {
                r0 = zoneId.getRules().g(Instant.H(lVar));
            } else {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (lVar.h(aVar2)) {
                    j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                    if (lVar.h(aVar3)) {
                        LocalDateTime J = LocalDateTime.J(LocalDate.R(lVar.u(aVar2)), j$.time.h.K(lVar.u(aVar3)));
                        if (zoneId.getRules().e(J) == null) {
                            r0 = zoneId.getRules().g(Instant.I(ZonedDateTime.H(J, zoneId, null).G(), r0.c().d));
                        }
                    }
                }
                r0 = 2;
            }
            Locale locale = rVar.b.b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.c;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap = d;
                SoftReference softReference = (SoftReference) concurrentHashMap.get(id);
                if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id, id};
                    if (map == null) {
                        map = new ConcurrentHashMap();
                    }
                    map.put(locale, strArr2);
                    concurrentHashMap.put(id, new SoftReference(map));
                    strArr = strArr2;
                }
                if (r0 == 0) {
                    str = strArr[textStyle2.a + 1];
                } else if (r0 == 1) {
                    str = strArr[textStyle2.a + 3];
                } else {
                    str = strArr[textStyle2.a + 5];
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
