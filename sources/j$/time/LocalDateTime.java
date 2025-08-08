package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.util.A;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.k, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = s(LocalDate.d, h.e);
    public static final LocalDateTime d = s(LocalDate.e, h.f);
    private final LocalDate a;
    private final h b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalDate c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.e b() {
        this.a.getClass();
        return j$.time.chrono.f.a;
    }

    public static LocalDateTime r(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), h.p());
    }

    public static LocalDateTime s(LocalDate localDate, h hVar) {
        A.z(localDate, "date");
        A.z(hVar, "time");
        return new LocalDateTime(localDate, hVar);
    }

    public static LocalDateTime t(long j, int i, ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.j(j2);
        return new LocalDateTime(LocalDate.u(j$.com.android.tools.r8.a.i(j + zoneOffset.getTotalSeconds(), 86400L)), h.q((((int) j$.com.android.tools.r8.a.h(r5, 86400L)) * 1000000000) + j2));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.r(v(zoneOffset), a().n());
    }

    public final long v(ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        return ((this.a.x() * 86400) + this.b.s()) - zoneOffset.getTotalSeconds();
    }

    private LocalDateTime(LocalDate localDate, h hVar) {
        this.a = localDate;
        this.b = hVar;
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar != null && lVar.g(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        return aVar.h() || aVar.l();
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            if (aVar.l()) {
                h hVar = this.b;
                hVar.getClass();
                return j$.time.temporal.j.c(hVar, aVar);
            }
            return this.a.i(aVar);
        }
        aVar.getClass();
        return i(aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            return aVar.l() ? this.b.h(aVar) : this.a.h(aVar);
        }
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).l() ? this.b.f(lVar) : this.a.f(lVar);
        }
        return lVar.f(this);
    }

    private int m(LocalDateTime localDateTime) {
        int m = this.a.m(localDateTime.a);
        return m == 0 ? this.b.compareTo(localDateTime.b) : m;
    }

    public final LocalDate w() {
        return this.a;
    }

    public final int o() {
        return this.a.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final h a() {
        return this.b;
    }

    public final int n() {
        return this.b.o();
    }

    public final LocalDateTime u(long j) {
        if (j != 0) {
            long j2 = 1;
            long j3 = (j / 86400) * j2;
            h hVar = this.b;
            long r = hVar.r();
            long j4 = ((j % 86400) * 1000000000 * j2) + r;
            long i = j$.com.android.tools.r8.a.i(j4, 86400000000000L) + j3;
            long h = j$.com.android.tools.r8.a.h(j4, 86400000000000L);
            h q = h == r ? hVar : h.q(h);
            LocalDate localDate = this.a;
            LocalDate plusDays = localDate.plusDays(i);
            if (localDate != plusDays || hVar != q) {
                return new LocalDateTime(plusDays, q);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar != j$.time.temporal.j.e()) {
            if (nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g()) {
                return null;
            }
            if (nVar == j$.time.temporal.j.f()) {
                return this.b;
            }
            if (nVar == j$.time.temporal.j.d()) {
                return b();
            }
            if (nVar == j$.time.temporal.j.h()) {
                return j$.time.temporal.b.NANOS;
            }
            return nVar.a(this);
        }
        return this.a;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        A.z(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (!(chronoLocalDateTime instanceof LocalDateTime)) {
            int compareTo = this.a.compareTo(chronoLocalDateTime.c());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = this.b.compareTo(chronoLocalDateTime.a());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            j$.time.chrono.e b = b();
            j$.time.chrono.e b2 = chronoLocalDateTime.b();
            ((j$.time.chrono.a) b).getClass();
            b2.getClass();
            return 0;
        }
        return m((LocalDateTime) chronoLocalDateTime);
    }

    public final boolean p(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m(localDateTime) > 0;
        }
        long x = this.a.x();
        long x2 = localDateTime.a.x();
        return x > x2 || (x == x2 && this.b.r() > localDateTime.b.r());
    }

    public final boolean q(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m(localDateTime) < 0;
        }
        long x = this.a.x();
        long x2 = localDateTime.a.x();
        return x < x2 || (x == x2 && this.b.r() < localDateTime.b.r());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }
}
