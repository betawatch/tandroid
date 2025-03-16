package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.util.A;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.k, j$.time.chrono.c, Serializable {
    public static final LocalDateTime c;
    public static final LocalDateTime d;
    private final LocalDate a;
    private final h b;

    static {
        LocalDate localDate = LocalDate.d;
        h hVar = h.e;
        A.z(localDate, "date");
        A.z(hVar, "time");
        c = new LocalDateTime(localDate, hVar);
        LocalDate localDate2 = LocalDate.e;
        h hVar2 = h.f;
        A.z(localDate2, "date");
        A.z(hVar2, "time");
        d = new LocalDateTime(localDate2, hVar2);
    }

    private LocalDateTime(LocalDate localDate, h hVar) {
        this.a = localDate;
        this.b = hVar;
    }

    public static LocalDateTime i(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), h.j());
    }

    public static LocalDateTime j(long j, int i, ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.g(j2);
        return new LocalDateTime(LocalDate.p(j$.com.android.tools.r8.a.j(j + zoneOffset.getTotalSeconds(), 86400L)), h.k((((int) j$.com.android.tools.r8.a.i(r5, 86400L)) * 1000000000) + j2));
    }

    @Override // j$.time.temporal.k
    public final q a(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.d(this);
        }
        if (!((j$.time.temporal.a) lVar).h()) {
            return this.a.a(lVar);
        }
        h hVar = this.b;
        hVar.getClass();
        return j$.time.temporal.j.c(hVar, lVar);
    }

    @Override // j$.time.temporal.k
    public final long b(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).h() ? this.b.b(lVar) : this.a.b(lVar) : lVar.b(this);
    }

    @Override // j$.time.temporal.k
    public final Object c(j$.time.temporal.n nVar) {
        j$.time.temporal.m e = j$.time.temporal.j.e();
        LocalDate localDate = this.a;
        if (nVar == e) {
            return localDate;
        }
        if (nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g()) {
            return null;
        }
        if (nVar == j$.time.temporal.j.f()) {
            return this.b;
        }
        if (nVar != j$.time.temporal.j.d()) {
            return nVar == j$.time.temporal.j.h() ? j$.time.temporal.b.NANOS : nVar.a(this);
        }
        localDate.getClass();
        return j$.time.chrono.g.a;
    }

    @Override // j$.time.temporal.k
    public final int d(j$.time.temporal.a aVar) {
        return aVar instanceof j$.time.temporal.a ? aVar.h() ? this.b.d(aVar) : this.a.d(aVar) : j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean e(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar != null && lVar.c(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        return aVar.e() || aVar.h();
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

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.c cVar) {
        boolean z = cVar instanceof LocalDateTime;
        h hVar = this.b;
        LocalDate localDate = this.a;
        if (z) {
            LocalDateTime localDateTime = (LocalDateTime) cVar;
            int g = localDate.g(localDateTime.a);
            return g == 0 ? hVar.compareTo(localDateTime.b) : g;
        }
        LocalDateTime localDateTime2 = (LocalDateTime) cVar;
        int compareTo = localDate.compareTo(localDateTime2.a);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = hVar.compareTo(localDateTime2.b);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        localDate.getClass();
        j$.time.chrono.g gVar = j$.time.chrono.g.a;
        localDateTime2.a.getClass();
        gVar.getClass();
        gVar.getClass();
        return 0;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        A.z(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public final int g() {
        return this.b.i();
    }

    public final int h() {
        return this.a.m();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final long k(ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        return ((this.a.s() * 86400) + this.b.m()) - zoneOffset.getTotalSeconds();
    }

    public final LocalDate l() {
        return this.a;
    }

    public final h m() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }
}
