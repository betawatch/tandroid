package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class x extends d {
    static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient LocalDate a;
    private transient y b;
    private transient int c;

    @Override // j$.time.chrono.d
    public final m J() {
        return this.b;
    }

    x(LocalDate localDate) {
        if (localDate.Q(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        y m = y.m(localDate);
        this.b = m;
        this.c = (localDate.getYear() - m.v().getYear()) + 1;
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final l a() {
        return v.d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w();
        }
        return pVar != null && pVar.n(this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        if (!g(pVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = w.a[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 1) {
            return j$.time.temporal.u.j(1L, localDate.S());
        }
        y yVar = this.b;
        if (i != 2) {
            if (i != 3) {
                return v.d.C(aVar);
            }
            int year = yVar.v().getYear();
            return yVar.x() != null ? j$.time.temporal.u.j(1L, (r0.v().getYear() - year) + 1) : j$.time.temporal.u.j(1L, 999999999 - year);
        }
        y x = yVar.x();
        int N = (x == null || x.v().getYear() != localDate.getYear()) ? localDate.R() ? 366 : 365 : x.v().N() - 1;
        if (this.c == 1) {
            N -= yVar.v().N() - 1;
        }
        return j$.time.temporal.u.j(1L, N);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.N() - yVar.v().N()) + 1 : localDate.N();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
            case 8:
                return yVar.getValue();
            default:
                return localDate.s(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final x d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (s(aVar) == j) {
                return this;
            }
            int[] iArr = w.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                int a = v.d.C(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return R(this.b, a);
                }
                if (i2 == 8) {
                    return R(y.C(a), this.c);
                }
                if (i2 == 9) {
                    return Q(localDate.d0(a));
                }
            }
            return Q(localDate.d(j, pVar));
        }
        return (x) super.d(j, pVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: O */
    public final b n(j$.time.temporal.n nVar) {
        return (x) super.n(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return (x) super.n(localDate);
    }

    private x R(y yVar, int i) {
        v.d.getClass();
        if (!(yVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (yVar.v().getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < yVar.v().getYear() || yVar != y.m(LocalDate.of(year, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return Q(this.a.d0(year));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime u(j$.time.j jVar) {
        return f.J(this, jVar);
    }

    @Override // j$.time.chrono.d
    final b N(long j) {
        return Q(this.a.Y(j));
    }

    @Override // j$.time.chrono.d
    final b M(long j) {
        return Q(this.a.X(j));
    }

    @Override // j$.time.chrono.d
    final b L(long j) {
        return Q(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b e(long j, j$.time.temporal.s sVar) {
        return (x) super.e(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.s sVar) {
        return (x) super.e(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: E */
    public final b k(long j, j$.time.temporal.s sVar) {
        return (x) super.k(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (x) super.k(j, chronoUnit);
    }

    private x Q(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new x(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long t() {
        return this.a.t();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 4, this);
    }
}
