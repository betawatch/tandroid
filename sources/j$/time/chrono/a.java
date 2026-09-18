package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a implements k {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((k) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static k j(k kVar, String str) {
        String o9;
        k kVar2 = (k) a.putIfAbsent(str, kVar);
        if (kVar2 == null && (o9 = kVar.o()) != null) {
            b.putIfAbsent(o9, kVar);
        }
        return kVar2;
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDateTime B(j$.time.temporal.l lVar) {
        try {
            return x(lVar).A(j$.time.h.I(lVar));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + lVar.getClass(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // j$.time.chrono.k
    public ChronoZonedDateTime p(j$.time.temporal.l lVar) {
        try {
            ZoneId G = ZoneId.G(lVar);
            try {
                lVar = D(Instant.H(lVar), G);
                return lVar;
            } catch (j$.time.b unused) {
                return j.G(G, null, f.G(this, B(lVar)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + lVar.getClass(), e);
        }
    }

    @Override // j$.time.chrono.k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.k
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.k
    public final String toString() {
        return getId();
    }
}
