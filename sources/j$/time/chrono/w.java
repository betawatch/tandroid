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
    public final ChronoLocalDateTime A(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public w(LocalDate localDate) {
        if (localDate.N(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        x o10 = x.o(localDate);
        this.b = o10;
        this.c = (localDate.getYear() - o10.b.getYear()) + 1;
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final k a() {
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
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).isDateBased();
        }
        return oVar != null && oVar.j(this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!e(oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i10 = v.a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.s.e(1L, this.a.P());
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return u.c.s(aVar);
            }
            int year = this.b.b.getYear();
            return this.b.p() != null ? j$.time.temporal.s.e(1L, (r0.b.getYear() - year) + 1) : j$.time.temporal.s.e(1L, 999999999 - year);
        }
        x p10 = this.b.p();
        int L = (p10 == null || p10.b.getYear() != this.a.getYear()) ? this.a.O() ? 366 : 365 : p10.b.L() - 1;
        if (this.c == 1) {
            L -= this.b.b.L() - 1;
        }
        return j$.time.temporal.s.e(1L, L);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        switch (v.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.L() - this.b.b.L()) + 1 : this.a.L();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
            case 8:
                return this.b.a;
            default:
                return this.a.y(oVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final w c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (y(aVar) == j10) {
                return this;
            }
            int[] iArr = v.a;
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                int a2 = u.c.s(aVar).a(j10, aVar);
                int i11 = iArr[aVar.ordinal()];
                if (i11 == 3) {
                    return P(this.b, a2);
                }
                if (i11 == 8) {
                    return P(x.s(a2), this.c);
                }
                if (i11 == 9) {
                    return O(this.a.Y(a2));
                }
            }
            return O(this.a.c(j10, oVar));
        }
        return (w) super.c(j10, oVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b k(j$.time.temporal.m mVar) {
        return (w) super.k(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (w) super.k(localDate);
    }

    public final w P(x xVar, int i10) {
        u.c.getClass();
        if (xVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (xVar.b.getYear() + i10) - 1;
        if (i10 != 1 && (year < -999999999 || year > 999999999 || year < xVar.b.getYear() || xVar != x.o(LocalDate.of(year, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return O(this.a.Y(year));
    }

    @Override // j$.time.chrono.d
    public final b L(long j10) {
        return O(this.a.U(j10));
    }

    @Override // j$.time.chrono.d
    public final b K(long j10) {
        return O(this.a.T(j10));
    }

    @Override // j$.time.chrono.d
    public final b J(long j10) {
        return O(this.a.plusDays(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j10, j$.time.temporal.q qVar) {
        return (w) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j10, j$.time.temporal.q qVar) {
        return (w) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b w(long j10, j$.time.temporal.q qVar) {
        return (w) super.w(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return (w) super.w(j10, chronoUnit);
    }

    public final w O(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new w(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long z() {
        return this.a.z();
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
        return new d0((byte) 4, this);
    }
}
