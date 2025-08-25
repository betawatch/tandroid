package j$.time.chrono;

import j$.time.LocalDateTime;
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

    static l j(a aVar, String str) {
        String q;
        l lVar = (l) a.putIfAbsent(str, aVar);
        if (lVar == null && (q = aVar.q()) != null) {
            b.putIfAbsent(q, aVar);
        }
        return lVar;
    }

    static l i(String str) {
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
                    if (str.equals(lVar2.getId()) || str.equals(lVar2.q())) {
                        return lVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: " + str);
            }
            o oVar = o.o;
            j(oVar, oVar.getId());
            v vVar = v.d;
            j(vVar, vVar.getId());
            A a2 = A.d;
            j(a2, a2.getId());
            G g = G.d;
            j(g, g.getId());
            Iterator it2 = ServiceLoader.load(a.class, null).iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (!aVar.getId().equals("ISO")) {
                    j(aVar, aVar.getId());
                }
            }
            s sVar = s.d;
            j(sVar, sVar.getId());
        }
    }

    protected a() {
    }

    @Override // j$.time.chrono.l
    public ChronoLocalDateTime n(LocalDateTime localDateTime) {
        try {
            return k(localDateTime).t(j$.time.j.D(localDateTime));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
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
