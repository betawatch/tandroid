package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient n a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime A(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public p(n nVar, int i7, int i10, int i11) {
        nVar.m(i7, i10, i11);
        this.a = nVar;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    public p(n nVar, long j3) {
        int i7 = (int) j3;
        nVar.k();
        if (i7 < nVar.e || i7 >= nVar.f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(nVar.d, i7);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int i10 = nVar.g;
        int[] iArr = {(binarySearch + i10) / 12, ((i10 + binarySearch) % 12) + 1, (i7 - nVar.d[binarySearch]) + 1};
        this.a = nVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final k a() {
        return this.a;
    }

    @Override // j$.time.chrono.d
    public final l H() {
        return q.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!j$.com.android.tools.r8.a.p(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i7 = o.a[aVar.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? this.a.s(aVar) : j$.time.temporal.s.e(1L, 5L) : j$.time.temporal.s.e(1L, this.a.y(this.b, 12)) : j$.time.temporal.s.e(1L, this.a.q(this.b, this.c));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        switch (o.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return N();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.Q(z() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((N() - 1) % 7) + 1;
            case 7:
                return z();
            case 8:
                return ((N() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final p c(long j3, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (p) super.c(j3, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        this.a.s(aVar).b(j3, aVar);
        int i7 = (int) j3;
        switch (o.a[aVar.ordinal()]) {
            case 1:
                return Q(this.b, this.c, i7);
            case 2:
                return J(Math.min(i7, this.a.y(this.b, 12)) - N());
            case 3:
                return J((j3 - y(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return J(j3 - (((int) j$.com.android.tools.r8.a.Q(z() + 3, 7)) + 1));
            case 5:
                return J(j3 - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return J(j3 - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(this.a, j3);
            case 8:
                return J((j3 - y(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Q(this.b, i7, this.d);
            case 10:
                return K(j3 - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i7 = 1 - i7;
                }
                return Q(i7, this.c, this.d);
            case 12:
                return Q(i7, this.c, this.d);
            case 13:
                return Q(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
    }

    public final p Q(int i7, int i10, int i11) {
        int q10 = this.a.q(i7, i10);
        if (i11 > q10) {
            i11 = q10;
        }
        return new p(this.a, i7, i10, i11);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b k(j$.time.temporal.m mVar) {
        return (p) super.k(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (p) super.k(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long z() {
        return this.a.m(this.b, this.c, this.d);
    }

    public final int N() {
        return this.a.y(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    public final b L(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j10 = this.b + ((int) j3);
        int i7 = (int) j10;
        if (j10 == i7) {
            return Q(i7, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final p K(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j10 = (this.b * 12) + (this.c - 1) + j3;
        n nVar = this.a;
        long R = j$.com.android.tools.r8.a.R(j10, 12L);
        int i7 = nVar.g;
        if (R >= i7 / 12 && R <= (((nVar.d.length - 1) + i7) / 12) - 1) {
            return Q((int) R, ((int) j$.com.android.tools.r8.a.Q(j10, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + R);
    }

    @Override // j$.time.chrono.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final p J(long j3) {
        return new p(this.a, z() + j3);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j3, j$.time.temporal.q qVar) {
        return (p) super.d(j3, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j3, j$.time.temporal.q qVar) {
        return (p) super.d(j3, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b w(long j3, j$.time.temporal.q qVar) {
        return (p) super.w(j3, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal w(long j3, ChronoUnit chronoUnit) {
        return (p) super.w(j3, chronoUnit);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.a.equals(pVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i7 = this.b;
        int i10 = this.c;
        int i11 = this.d;
        this.a.getClass();
        return (((i7 << 11) + (i10 << 6)) + i11) ^ ((i7 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 6, this);
    }
}
