package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.util.A;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.k, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = t(LocalDate.d, h.e);
    public static final LocalDateTime d = t(LocalDate.e, h.f);
    private final LocalDate a;
    private final h b;

    private LocalDateTime(LocalDate localDate, h hVar) {
        this.a = localDate;
        this.b = hVar;
    }

    private int n(LocalDateTime localDateTime) {
        int n = this.a.n(localDateTime.a);
        return n == 0 ? this.b.compareTo(localDateTime.b) : n;
    }

    public static LocalDateTime s(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), h.q());
    }

    public static LocalDateTime t(LocalDate localDate, h hVar) {
        A.z(localDate, "date");
        A.z(hVar, "time");
        return new LocalDateTime(localDate, hVar);
    }

    public static LocalDateTime u(long j, int i, ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.n(j2);
        return new LocalDateTime(LocalDate.v(j$.com.android.tools.r8.a.j(j + zoneOffset.getTotalSeconds(), 86400L)), h.r((((int) j$.com.android.tools.r8.a.i(r5, 86400L)) * 1000000000) + j2));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final h a() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.e b() {
        this.a.getClass();
        return j$.time.chrono.f.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalDate d() {
        return this.a;
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

    @Override // j$.time.temporal.k
    public final q f(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.j(this);
        }
        if (!((j$.time.temporal.a) lVar).o()) {
            return this.a.f(lVar);
        }
        h hVar = this.b;
        hVar.getClass();
        return j$.time.temporal.j.c(hVar, lVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        A.z(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).o() ? this.b.h(lVar) : this.a.h(lVar) : lVar.h(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return this.a;
        }
        if (nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g()) {
            return null;
        }
        return nVar == j$.time.temporal.j.f() ? this.b : nVar == j$.time.temporal.j.d() ? b() : nVar == j$.time.temporal.j.h() ? j$.time.temporal.b.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final int j(j$.time.temporal.a aVar) {
        return aVar instanceof j$.time.temporal.a ? aVar.o() ? this.b.j(aVar) : this.a.j(aVar) : j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar != null && lVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        return aVar.k() || aVar.o();
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return n((LocalDateTime) chronoLocalDateTime);
        }
        int compareTo = this.a.compareTo(chronoLocalDateTime.d());
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

    public final int o() {
        return this.b.p();
    }

    public final int p() {
        return this.a.getYear();
    }

    public final boolean q(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return n(localDateTime) > 0;
        }
        long y = this.a.y();
        long y2 = localDateTime.a.y();
        return y > y2 || (y == y2 && this.b.s() > localDateTime.b.s());
    }

    public final boolean r(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return n(localDateTime) < 0;
        }
        long y = this.a.y();
        long y2 = localDateTime.a.y();
        return y < y2 || (y == y2 && this.b.s() < localDateTime.b.s());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.s(w(zoneOffset), a().o());
    }

    public final String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }

    public final LocalDateTime v(long j) {
        if (j != 0) {
            long j2 = 1;
            long j3 = (j / 86400) * j2;
            h hVar = this.b;
            long s = hVar.s();
            long j4 = ((j % 86400) * 1000000000 * j2) + s;
            long j5 = j$.com.android.tools.r8.a.j(j4, 86400000000000L) + j3;
            long i = j$.com.android.tools.r8.a.i(j4, 86400000000000L);
            h r = i == s ? hVar : h.r(i);
            LocalDate localDate = this.a;
            LocalDate plusDays = localDate.plusDays(j5);
            if (localDate != plusDays || hVar != r) {
                return new LocalDateTime(plusDays, r);
            }
        }
        return this;
    }

    public final long w(ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        return ((this.a.y() * 86400) + this.b.t()) - zoneOffset.getTotalSeconds();
    }

    public final LocalDate x() {
        return this.a;
    }
}
