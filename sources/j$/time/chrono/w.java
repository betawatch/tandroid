package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class w extends d {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient x b;
    public final transient int c;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime w(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public w(LocalDate localDate) {
        if (localDate.N(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        x a = x.a(localDate);
        this.b = a;
        this.c = (localDate.getYear() - a.b.getYear()) + 1;
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final k b() {
        return u.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        u.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d
    public final l H() {
        return this.b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).u();
        }
        return oVar != null && oVar.p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // j$.time.chrono.d, j$.time.temporal.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        int i;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.r(this);
        }
        if (!h(oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i2 = v.a[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i2 == 1) {
            return j$.time.temporal.s.e(1L, localDate.P());
        }
        x xVar = this.b;
        if (i2 != 2) {
            if (i2 != 3) {
                return u.c.y(aVar);
            }
            int year = xVar.b.getYear();
            return xVar.m() != null ? j$.time.temporal.s.e(1L, (r0.b.getYear() - year) + 1) : j$.time.temporal.s.e(1L, 999999999 - year);
        }
        x m = xVar.m();
        if (m != null) {
            LocalDate localDate2 = m.b;
            if (localDate2.getYear() == localDate.getYear()) {
                i = localDate2.L() - 1;
                if (this.c == 1) {
                    i -= xVar.b.L() - 1;
                }
                return j$.time.temporal.s.e(1L, i);
            }
        }
        i = localDate.O() ? 366 : 365;
        if (this.c == 1) {
        }
        return j$.time.temporal.s.e(1L, i);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i = v.a[((j$.time.temporal.a) oVar).ordinal()];
        int i2 = this.c;
        x xVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.L() - xVar.b.L()) + 1 : localDate.L();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
            case 8:
                return xVar.a;
            default:
                return localDate.u(oVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final w e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (u(aVar) == j) {
                return this;
            }
            int[] iArr = v.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                int a = u.c.y(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return P(this.b, a);
                }
                if (i2 == 8) {
                    return P(x.n(a), this.c);
                }
                if (i2 == 9) {
                    return O(localDate.Y(a));
                }
            }
            return O(localDate.e(j, oVar));
        }
        return (w) super.e(j, oVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b p(j$.time.temporal.m mVar) {
        return (w) super.p(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        return (w) super.p(localDate);
    }

    public final w P(x xVar, int i) {
        u.c.getClass();
        if (xVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (xVar.b.getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < xVar.b.getYear() || xVar != x.a(LocalDate.of(year, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return O(this.a.Y(year));
    }

    @Override // j$.time.chrono.d
    public final b L(long j) {
        return O(this.a.U(j));
    }

    @Override // j$.time.chrono.d
    public final b K(long j) {
        return O(this.a.T(j));
    }

    @Override // j$.time.chrono.d
    public final b J(long j) {
        return O(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b f(long j, j$.time.temporal.q qVar) {
        return (w) super.f(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal f(long j, j$.time.temporal.q qVar) {
        return (w) super.f(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: D */
    public final b l(long j, j$.time.temporal.q qVar) {
        return (w) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return (w) super.l(j, chronoUnit);
    }

    public final w O(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new w(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long v() {
        return this.a.v();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.a.equals(((w) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 4, this);
    }
}
