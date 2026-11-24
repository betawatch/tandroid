package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class v extends d {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient w b;
    public final transient int c;

    public v(LocalDate localDate) {
        if (localDate.G(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        w o = w.o(localDate);
        this.b = o;
        this.c = (localDate.getYear() - o.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 4, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime A(j$.time.j jVar) {
        return new f(this, jVar);
    }

    @Override // j$.time.chrono.d
    public final b C(long j) {
        return H(this.a.N(j));
    }

    @Override // j$.time.chrono.d
    /* renamed from: F */
    public final b k(j$.time.temporal.m mVar) {
        return (v) super.k(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final v c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (v) super.c(j, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (y(aVar) == j) {
            return this;
        }
        int[] iArr = u.a;
        int i = iArr[aVar.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            int a = t.c.r(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return I(this.b, a);
            }
            if (i2 == 8) {
                return I(w.v(a), this.c);
            }
            if (i2 == 9) {
                return H(this.a.R(a));
            }
        }
        return H(this.a.c(j, oVar));
    }

    public final v H(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new v(localDate);
    }

    public final v I(w wVar, int i) {
        t.c.getClass();
        if (wVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (wVar.b.getYear() + i) - 1;
        if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= wVar.b.getYear() && wVar == w.o(LocalDate.of(year, 1, 1)))) {
            return H(this.a.R(year));
        }
        throw new j$.time.c("Invalid yearOfEra value");
    }

    @Override // j$.time.chrono.b
    public final a a() {
        return t.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j, j$.time.temporal.q qVar) {
        return (v) super.d(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isDateBased() : oVar != null && oVar.j(this);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        t.c.getClass();
        return (-688086063) ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (v) super.k(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!e(oVar)) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = u.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.e(1L, this.a.I());
        }
        if (i != 2) {
            if (i != 3) {
                return t.c.r(aVar);
            }
            int year = this.b.b.getYear();
            return this.b.q() != null ? j$.time.temporal.s.e(1L, (r5.b.getYear() - year) + 1) : j$.time.temporal.s.e(1L, 999999999 - year);
        }
        w q = this.b.q();
        int C = (q == null || q.b.getYear() != this.a.getYear()) ? this.a.H() ? 366 : 365 : q.b.C() - 1;
        if (this.c == 1) {
            C -= this.b.b.C() - 1;
        }
        return j$.time.temporal.s.e(1L, C);
    }

    @Override // j$.time.chrono.d
    public final k q() {
        return this.b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b u(long j, j$.time.temporal.q qVar) {
        return (v) super.u(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        return (v) super.u(j, chronoUnit);
    }

    @Override // j$.time.chrono.d
    public final b w(long j) {
        return H(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d
    public final b x(long j) {
        return H(this.a.M(j));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        switch (u.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.C() - this.b.b.C()) + 1 : localDate.C();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
            case 8:
                return this.b.a;
            default:
                return this.a.y(oVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long z() {
        return this.a.z();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        return (v) super.d(j, qVar);
    }
}
