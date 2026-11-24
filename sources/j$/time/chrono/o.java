package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class o extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient m a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public o(m mVar, long j) {
        int i = (int) j;
        mVar.x();
        if (i < mVar.e || i >= mVar.f) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(mVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        short s = mVar.g;
        int[] iArr = {(binarySearch + s) / 12, ((s + binarySearch) % 12) + 1, (i - mVar.d[binarySearch]) + 1};
        this.a = mVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 6, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime A(j$.time.j jVar) {
        return new f(this, jVar);
    }

    @Override // j$.time.chrono.d
    public final b C(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return J(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: F */
    public final b k(j$.time.temporal.m mVar) {
        return (o) super.k(mVar);
    }

    public final int G() {
        return this.a.H(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final o w(long j) {
        return new o(this.a, z() + j);
    }

    @Override // j$.time.chrono.d
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final o x(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        m mVar = this.a;
        long Q = j$.time.a.Q(j2, 12L);
        short s = mVar.g;
        if (Q >= s / 12 && Q <= (((mVar.d.length - 1) + s) / 12) - 1) {
            return J((int) Q, ((int) j$.time.a.P(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + Q);
    }

    public final o J(int i, int i2, int i3) {
        int F = this.a.F(i, i2);
        if (i3 > F) {
            i3 = F;
        }
        return new o(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final o c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (o) super.c(j, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        this.a.r(aVar).b(j, aVar);
        int i = (int) j;
        switch (n.a[aVar.ordinal()]) {
            case 1:
                return J(this.b, this.c, i);
            case 2:
                return w(Math.min(i, this.a.H(this.b, 12)) - G());
            case 3:
                return w((j - y(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return w(j - (((int) j$.time.a.P(z() + 3, 7L)) + 1));
            case 5:
                return w(j - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return w(j - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new o(this.a, j);
            case 8:
                return w((j - y(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return J(this.b, i, this.d);
            case 10:
                return x(j - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return J(i, this.c, this.d);
            case 12:
                return J(i, this.c, this.d);
            case 13:
                return J(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.chrono.b
    public final a a() {
        return this.a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j, j$.time.temporal.q qVar) {
        return (o) super.d(j, qVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.a.equals(oVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (2100100019 ^ (i & (-2048))) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (o) super.k(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!j$.time.a.p(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = n.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.r(aVar) : j$.time.temporal.s.e(1L, 5L) : j$.time.temporal.s.e(1L, this.a.H(this.b, 12)) : j$.time.temporal.s.e(1L, this.a.F(this.b, this.c));
    }

    @Override // j$.time.chrono.d
    public final k q() {
        return p.AH;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b u(long j, j$.time.temporal.q qVar) {
        return (o) super.u(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        return (o) super.u(j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i;
        int i2;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        switch (n.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                i = this.d;
                return i;
            case 2:
                i = G();
                return i;
            case 3:
                i2 = (this.d - 1) / 7;
                i = i2 + 1;
                return i;
            case 4:
                i2 = (int) j$.time.a.P(z() + 3, 7L);
                i = i2 + 1;
                return i;
            case 5:
                i2 = (this.d - 1) % 7;
                i = i2 + 1;
                return i;
            case 6:
                i2 = (G() - 1) % 7;
                i = i2 + 1;
                return i;
            case 7:
                return z();
            case 8:
                i2 = (G() - 1) / 7;
                i = i2 + 1;
                return i;
            case 9:
                i = this.c;
                return i;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                i = this.b;
                return i;
            case 12:
                i = this.b;
                return i;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long z() {
        return this.a.C(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        return (o) super.d(j, qVar);
    }

    public o(m mVar, int i, int i2, int i3) {
        mVar.C(i, i2, i3);
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
