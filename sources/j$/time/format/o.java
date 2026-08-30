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
    public final boolean j(r rVar, StringBuilder sb) {
        ?? r02;
        String[] strArr;
        ZoneId zoneId = (ZoneId) rVar.b(j$.time.temporal.p.a);
        if (zoneId == null) {
            return false;
        }
        String id2 = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.l lVar = rVar.a;
            String str = null;
            Map map = null;
            if (lVar.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                r02 = zoneId.getRules().g(Instant.H(lVar));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (lVar.e(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (lVar.e(aVar2)) {
                        LocalDateTime J = LocalDateTime.J(LocalDate.R(lVar.y(aVar)), j$.time.h.K(lVar.y(aVar2)));
                        if (zoneId.getRules().e(J) == null) {
                            r02 = zoneId.getRules().g(Instant.I(ZonedDateTime.H(J, zoneId, null).F(), r0.b().d));
                        }
                    }
                }
                r02 = 2;
            }
            Locale locale = rVar.b.b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.c;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap = d;
                SoftReference softReference = (SoftReference) concurrentHashMap.get(id2);
                if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id2);
                    String[] strArr2 = {id2, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id2, id2};
                    if (map == null) {
                        map = new ConcurrentHashMap();
                    }
                    map.put(locale, strArr2);
                    concurrentHashMap.put(id2, new SoftReference(map));
                    strArr = strArr2;
                }
                if (r02 == 0) {
                    str = strArr[textStyle2.a + 1];
                } else if (r02 == 1) {
                    str = strArr[textStyle2.a + 3];
                } else {
                    str = strArr[textStyle2.a + 5];
                }
            }
            if (str != null) {
                id2 = str;
            }
        }
        sb.append(id2);
        return true;
    }
}
