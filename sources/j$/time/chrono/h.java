package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static boolean i(m mVar, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.ERA : rVar != null && rVar.l(mVar);
    }

    public static l p(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        Object obj = (l) oVar.u(j$.time.temporal.n.e());
        s sVar = s.d;
        if (obj == null) {
            obj = Objects.requireNonNull(sVar, "defaultObj");
        }
        return (l) obj;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return chronoZonedDateTime.g().getTotalSeconds();
            }
            return chronoZonedDateTime.x().j(rVar);
        }
        return j$.time.temporal.n.a(chronoZonedDateTime, rVar);
    }

    public static int f(m mVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        return j$.time.temporal.n.a(mVar, aVar);
    }

    public static long g(m mVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.j(mVar);
    }

    public static Object m(m mVar, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.ERAS;
        }
        return j$.time.temporal.n.c(mVar, tVar);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return chronoLocalDateTime.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return chronoLocalDateTime.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(chronoLocalDateTime);
    }

    public static boolean h(b bVar, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).u();
        }
        return rVar != null && rVar.l(bVar);
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.c().s() * 86400) + chronoLocalDateTime.b().S()) - zoneOffset.getTotalSeconds();
    }

    public static Object l(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.k()) {
            return chronoZonedDateTime.p();
        }
        if (tVar == j$.time.temporal.n.h()) {
            return chronoZonedDateTime.g();
        }
        if (tVar == j$.time.temporal.n.g()) {
            return chronoZonedDateTime.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return chronoZonedDateTime.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(chronoZonedDateTime);
    }

    public static int c(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.c().compareTo(chronoLocalDateTime2.c());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((a) chronoLocalDateTime.a()).getId().compareTo(chronoLocalDateTime2.a().getId());
    }

    public static Object j(b bVar, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.e()) {
            return bVar.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.DAYS;
        }
        return tVar.a(bVar);
    }

    public static j$.time.temporal.m a(b bVar, j$.time.temporal.m mVar) {
        return mVar.d(bVar.s(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long o(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().s() * 86400) + chronoZonedDateTime.b().S()) - chronoZonedDateTime.g().getTotalSeconds();
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.A(), chronoZonedDateTime2.A());
        if (compare != 0) {
            return compare;
        }
        int G = chronoZonedDateTime.b().G() - chronoZonedDateTime2.b().G();
        if (G != 0) {
            return G;
        }
        int compareTo = chronoZonedDateTime.x().compareTo(chronoZonedDateTime2.x());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = chronoZonedDateTime.p().getId().compareTo(chronoZonedDateTime2.p().getId());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((a) chronoZonedDateTime.a()).getId().compareTo(chronoZonedDateTime2.a().getId());
    }

    public static int b(b bVar, b bVar2) {
        int compare = Long.compare(bVar.s(), bVar2.s());
        if (compare != 0) {
            return compare;
        }
        return ((a) bVar.a()).getId().compareTo(bVar2.a().getId());
    }
}
