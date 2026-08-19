package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
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

    public static k l(a aVar, String str) {
        String m;
        k kVar = (k) a.putIfAbsent(str, aVar);
        if (kVar == null && (m = aVar.m()) != null) {
            b.putIfAbsent(m, aVar);
        }
        return kVar;
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDateTime s(Temporal temporal) {
        try {
            return a(temporal).w(j$.time.h.I(temporal));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // j$.time.chrono.k
    public ChronoZonedDateTime n(Temporal temporal) {
        try {
            ZoneId E = ZoneId.E(temporal);
            try {
                temporal = A(Instant.H(temporal), E);
                return temporal;
            } catch (j$.time.b unused) {
                return j.E(E, null, f.E(this, s(temporal)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e);
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
