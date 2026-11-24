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
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class o extends n {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public final TextStyle c;

    public o(TextStyle textStyle) {
        super(j$.time.temporal.p.e, "ZoneText(" + textStyle + ")");
        this.c = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.n, j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb) {
        boolean z;
        String[] strArr;
        ZoneId zoneId = (ZoneId) rVar.b(j$.time.temporal.p.a);
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.l lVar = rVar.a;
            String str = null;
            Map map = null;
            if (lVar.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                z = zoneId.getRules().g(Instant.q(lVar));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (lVar.e(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (lVar.e(aVar2)) {
                        LocalDateTime w = LocalDateTime.w(LocalDate.K(lVar.y(aVar)), j$.time.j.x(lVar.y(aVar2)));
                        if (zoneId.getRules().e(w) == null) {
                            z = zoneId.getRules().g(Instant.v(ZonedDateTime.q(w, zoneId, null).E(), r0.b().d));
                        }
                    }
                }
                z = 2;
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
                str = z ? !z ? strArr[(textStyle2.a ? 1 : 0) + 5] : strArr[(textStyle2.a ? 1 : 0) + 3] : strArr[(textStyle2.a ? 1 : 0) + 1];
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
