package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public abstract class a implements Comparable {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static a q(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            a aVar = (a) concurrentHashMap.get(str);
            if (aVar == null) {
                aVar = (a) b.get(str);
            }
            if (aVar != null) {
                return aVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(a.class).iterator();
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    if (str.equals(aVar2.n()) || str.equals(aVar2.l())) {
                        return aVar2;
                    }
                }
                j$.time.g.i(str, "Unknown chronology: ");
                return null;
            }
            m mVar = m.l;
            u(mVar, mVar.n());
            t tVar = t.c;
            u(tVar, tVar.n());
            y yVar = y.c;
            u(yVar, yVar.n());
            e0 e0Var = e0.c;
            u(e0Var, e0Var.n());
            try {
                for (a aVar3 : Arrays.asList(new a[0])) {
                    if (!aVar3.n().equals("ISO")) {
                        u(aVar3, aVar3.n());
                    }
                }
                q qVar = q.c;
                u(qVar, qVar.n());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static a u(a aVar, String str) {
        String l;
        a aVar2 = (a) a.putIfAbsent(str, aVar);
        if (aVar2 == null && (l = aVar.l()) != null) {
            b.putIfAbsent(l, aVar);
        }
        return aVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return n().compareTo(((a) obj).n());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && n().compareTo(((a) obj).n()) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ n().hashCode();
    }

    public b j(j$.time.temporal.l lVar) {
        return LocalDate.v(lVar);
    }

    public k k(int i) {
        if (i == 1) {
            return p.AH;
        }
        throw new j$.time.c("invalid Hijrah era");
    }

    public String l() {
        return "islamic-umalqura";
    }

    public String n() {
        return "Hijrah-umalqura";
    }

    public ChronoLocalDateTime o(Temporal temporal) {
        try {
            return j(temporal).A(j$.time.j.v(temporal));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    public j$.time.temporal.s r(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    public final String toString() {
        return n();
    }

    public ChronoZonedDateTime v(Instant instant, ZoneId zoneId) {
        return j.q(this, instant, zoneId);
    }

    public ChronoZonedDateTime w(Temporal temporal) {
        try {
            ZoneId o = ZoneId.o(temporal);
            try {
                return v(Instant.q(temporal), o);
            } catch (j$.time.c unused) {
                return j.o(o, null, f.o(this, this.o(temporal)));
            }
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }
}
