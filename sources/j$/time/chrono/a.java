package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;

/* loaded from: classes2.dex */
public abstract class a implements l {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((l) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static l l(a aVar, String str) {
        String r;
        l lVar = (l) a.putIfAbsent(str, aVar);
        if (lVar == null && (r = aVar.r()) != null) {
            b.putIfAbsent(r, aVar);
        }
        return lVar;
    }

    static l k(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            l lVar = (l) concurrentHashMap.get(str);
            if (lVar == null) {
                lVar = (l) b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(l.class).iterator();
                while (it.hasNext()) {
                    l lVar2 = (l) it.next();
                    if (str.equals(lVar2.getId()) || str.equals(lVar2.r())) {
                        return lVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: " + str);
            }
            o oVar = o.o;
            l(oVar, oVar.getId());
            v vVar = v.d;
            l(vVar, vVar.getId());
            A a2 = A.d;
            l(a2, a2.getId());
            G g = G.d;
            l(g, g.getId());
            Iterator it2 = ServiceLoader.load(a.class, null).iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (!aVar.getId().equals("ISO")) {
                    l(aVar, aVar.getId());
                }
            }
            s sVar = s.d;
            l(sVar, sVar.getId());
        }
    }

    protected a() {
    }

    @Override // j$.time.chrono.l
    public ChronoLocalDateTime x(Temporal temporal) {
        try {
            return m(temporal).u(j$.time.j.K(temporal));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // j$.time.chrono.l
    public ChronoZonedDateTime v(Temporal temporal) {
        try {
            ZoneId I = ZoneId.I(temporal);
            try {
                temporal = D(Instant.J(temporal), I);
                return temporal;
            } catch (j$.time.c unused) {
                return k.I(I, null, f.I(this, x(temporal)));
            }
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public final String toString() {
        return getId();
    }
}
