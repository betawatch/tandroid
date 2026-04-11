package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static boolean i(m mVar, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.n(mVar);
    }

    public static l q(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "temporal");
        Object obj = (l) mVar.w(j$.time.temporal.l.e());
        s sVar = s.d;
        if (obj == null) {
            obj = Objects.requireNonNull(sVar, "defaultObj");
        }
        return (l) obj;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return chronoZonedDateTime.h().getTotalSeconds();
            }
            return chronoZonedDateTime.B().l(pVar);
        }
        return j$.time.temporal.l.a(chronoZonedDateTime, pVar);
    }

    public static int f(m mVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        return j$.time.temporal.l.a(mVar, aVar);
    }

    public static long g(m mVar, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        return pVar.l(mVar);
    }

    public static Object m(m mVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.ERAS;
        }
        return j$.time.temporal.l.c(mVar, rVar);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return chronoLocalDateTime.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return chronoLocalDateTime.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.a(chronoLocalDateTime);
    }

    public static boolean h(b bVar, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w();
        }
        return pVar != null && pVar.n(bVar);
    }

    public static Instant p(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.M(chronoLocalDateTime.y(zoneOffset), chronoLocalDateTime.b().N());
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.c().t() * 86400) + chronoLocalDateTime.b().Z()) - zoneOffset.getTotalSeconds();
    }

    public static Object l(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.k()) {
            return chronoZonedDateTime.q();
        }
        if (rVar == j$.time.temporal.l.h()) {
            return chronoZonedDateTime.h();
        }
        if (rVar == j$.time.temporal.l.g()) {
            return chronoZonedDateTime.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return chronoZonedDateTime.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.a(chronoZonedDateTime);
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

    public static Object j(b bVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.e()) {
            return bVar.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.DAYS;
        }
        return rVar.a(bVar);
    }

    public static Temporal a(b bVar, Temporal temporal) {
        return temporal.d(bVar.t(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long o(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().t() * 86400) + chronoZonedDateTime.b().Z()) - chronoZonedDateTime.h().getTotalSeconds();
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.H(), chronoZonedDateTime2.H());
        if (compare != 0) {
            return compare;
        }
        int N = chronoZonedDateTime.b().N() - chronoZonedDateTime2.b().N();
        if (N != 0) {
            return N;
        }
        int compareTo = chronoZonedDateTime.B().compareTo(chronoZonedDateTime2.B());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = chronoZonedDateTime.q().getId().compareTo(chronoZonedDateTime2.q().getId());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((a) chronoZonedDateTime.a()).getId().compareTo(chronoZonedDateTime2.a().getId());
    }

    public static int b(b bVar, b bVar2) {
        int compare = Long.compare(bVar.t(), bVar2.t());
        if (compare != 0) {
            return compare;
        }
        return ((a) bVar.a()).getId().compareTo(bVar2.a().getId());
    }
}
