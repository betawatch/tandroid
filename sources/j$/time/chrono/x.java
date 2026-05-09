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
    public final m H() {
        return this.b;
    }

    x(LocalDate localDate) {
        if (localDate.O(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        y m = y.m(localDate);
        this.b = m;
        this.c = (localDate.getYear() - m.u().getYear()) + 1;
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
            return ((j$.time.temporal.a) pVar).v();
        }
        return pVar != null && pVar.n(this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.r(this);
        }
        if (!g(pVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = w.a[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 1) {
            return j$.time.temporal.u.j(1L, localDate.Q());
        }
        y yVar = this.b;
        if (i != 2) {
            if (i != 3) {
                return v.d.A(aVar);
            }
            int year = yVar.u().getYear();
            return yVar.w() != null ? j$.time.temporal.u.j(1L, (r0.u().getYear() - year) + 1) : j$.time.temporal.u.j(1L, 999999999 - year);
        }
        y w = yVar.w();
        int L = (w == null || w.u().getYear() != localDate.getYear()) ? localDate.P() ? 366 : 365 : w.u().L() - 1;
        if (this.c == 1) {
            L -= yVar.u().L() - 1;
        }
        return j$.time.temporal.u.j(1L, L);
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.L() - yVar.u().L()) + 1 : localDate.L();
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
                return localDate.r(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final x d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (r(aVar) == j) {
                return this;
            }
            int[] iArr = w.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                int a = v.d.A(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return P(this.b, a);
                }
                if (i2 == 8) {
                    return P(y.A(a), this.c);
                }
                if (i2 == 9) {
                    return O(localDate.b0(a));
                }
            }
            return O(localDate.d(j, pVar));
        }
        return (x) super.d(j, pVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b n(j$.time.temporal.n nVar) {
        return (x) super.n(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return (x) super.n(localDate);
    }

    private x P(y yVar, int i) {
        v.d.getClass();
        if (!(yVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (yVar.u().getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < yVar.u().getYear() || yVar != y.m(LocalDate.of(year, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return O(this.a.b0(year));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime t(j$.time.i iVar) {
        return f.H(this, iVar);
    }

    @Override // j$.time.chrono.d
    final b L(long j) {
        return O(this.a.W(j));
    }

    @Override // j$.time.chrono.d
    final b K(long j) {
        return O(this.a.V(j));
    }

    @Override // j$.time.chrono.d
    final b J(long j) {
        return O(this.a.plusDays(j));
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
    /* renamed from: C */
    public final b k(long j, j$.time.temporal.s sVar) {
        return (x) super.k(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (x) super.k(j, chronoUnit);
    }

    private x O(LocalDate localDate) {
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
