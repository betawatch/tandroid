package j$.time.chrono;

import j$.time.LocalDate;
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
    public final m C() {
        return this.b;
    }

    x(LocalDate localDate) {
        if (localDate.J(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        y k = y.k(localDate);
        this.b = k;
        this.c = (localDate.getYear() - k.q().getYear()) + 1;
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

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).u();
        }
        return rVar != null && rVar.l(this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        if (!f(rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = w.a[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 1) {
            return j$.time.temporal.w.j(1L, localDate.L());
        }
        y yVar = this.b;
        if (i != 2) {
            if (i != 3) {
                return v.d.l(aVar);
            }
            int year = yVar.q().getYear();
            return yVar.z() != null ? j$.time.temporal.w.j(1L, (r0.q().getYear() - year) + 1) : j$.time.temporal.w.j(1L, 999999999 - year);
        }
        y z = yVar.z();
        int G = (z == null || z.q().getYear() != localDate.getYear()) ? localDate.K() ? 366 : 365 : z.q().G() - 1;
        if (this.c == 1) {
            G -= yVar.q().G() - 1;
        }
        return j$.time.temporal.w.j(1L, G);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.j(this);
        }
        int i = w.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.G() - yVar.q().G()) + 1 : localDate.G();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return yVar.getValue();
            default:
                return localDate.r(rVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final x d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (r(aVar) == j) {
                return this;
            }
            int[] iArr = w.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                int a = v.d.l(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return K(this.b, a);
                }
                if (i2 == 8) {
                    return K(y.B(a), this.c);
                }
                if (i2 == 9) {
                    return J(localDate.V(a));
                }
            }
            return J(localDate.d(j, rVar));
        }
        return (x) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: H */
    public final b l(j$.time.temporal.p pVar) {
        return (x) super.l(pVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        return (x) super.l(localDate);
    }

    private x K(y yVar, int i) {
        v.d.getClass();
        if (!(yVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (yVar.q().getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < yVar.q().getYear() || yVar != y.k(LocalDate.of(year, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return J(this.a.V(year));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime t(j$.time.j jVar) {
        return f.C(this, jVar);
    }

    @Override // j$.time.chrono.d
    final b G(long j) {
        return J(this.a.Q(j));
    }

    @Override // j$.time.chrono.d
    final b F(long j) {
        return J(this.a.P(j));
    }

    @Override // j$.time.chrono.d
    final b E(long j) {
        return J(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b e(long j, j$.time.temporal.u uVar) {
        return (x) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (x) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: D */
    public final b i(long j, j$.time.temporal.u uVar) {
        return (x) super.i(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return (x) super.i(j, bVar);
    }

    private x J(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new x(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long s() {
        return this.a.s();
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
