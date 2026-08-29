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

    public p(n nVar, int i10, int i11, int i12) {
        nVar.m(i10, i11, i12);
        this.a = nVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public p(n nVar, long j10) {
        int i10 = (int) j10;
        nVar.k();
        if (i10 < nVar.e || i10 >= nVar.f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(nVar.d, i10);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int i11 = nVar.g;
        int[] iArr = {(binarySearch + i11) / 12, ((i11 + binarySearch) % 12) + 1, (i10 - nVar.d[binarySearch]) + 1};
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
        if (!j$.com.android.tools.r8.a.q(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i10 = o.a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.a.s(aVar) : j$.time.temporal.s.e(1L, 5L) : j$.time.temporal.s.e(1L, this.a.y(this.b, 12)) : j$.time.temporal.s.e(1L, this.a.q(this.b, this.c));
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
                return ((int) j$.com.android.tools.r8.a.R(z() + 3, 7)) + 1;
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
    public final p c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (p) super.c(j10, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        this.a.s(aVar).b(j10, aVar);
        int i10 = (int) j10;
        switch (o.a[aVar.ordinal()]) {
            case 1:
                return Q(this.b, this.c, i10);
            case 2:
                return J(Math.min(i10, this.a.y(this.b, 12)) - N());
            case 3:
                return J((j10 - y(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return J(j10 - (((int) j$.com.android.tools.r8.a.R(z() + 3, 7)) + 1));
            case 5:
                return J(j10 - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return J(j10 - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(this.a, j10);
            case 8:
                return J((j10 - y(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Q(this.b, i10, this.d);
            case 10:
                return K(j10 - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i10 = 1 - i10;
                }
                return Q(i10, this.c, this.d);
            case 12:
                return Q(i10, this.c, this.d);
            case 13:
                return Q(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
    }

    public final p Q(int i10, int i11, int i12) {
        int q6 = this.a.q(i10, i11);
        if (i12 > q6) {
            i12 = q6;
        }
        return new p(this.a, i10, i11, i12);
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
    public final b L(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.b + ((int) j10);
        int i10 = (int) j11;
        if (j11 == i10) {
            return Q(i10, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final p K(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.b * 12) + (this.c - 1) + j10;
        n nVar = this.a;
        long S = j$.com.android.tools.r8.a.S(j11, 12L);
        int i10 = nVar.g;
        if (S >= i10 / 12 && S <= (((nVar.d.length - 1) + i10) / 12) - 1) {
            return Q((int) S, ((int) j$.com.android.tools.r8.a.R(j11, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + S);
    }

    @Override // j$.time.chrono.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final p J(long j10) {
        return new p(this.a, z() + j10);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j10, j$.time.temporal.q qVar) {
        return (p) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j10, j$.time.temporal.q qVar) {
        return (p) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b w(long j10, j$.time.temporal.q qVar) {
        return (p) super.w(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return (p) super.w(j10, chronoUnit);
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
        int i10 = this.b;
        int i11 = this.c;
        int i12 = this.d;
        this.a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 6, this);
    }
}
