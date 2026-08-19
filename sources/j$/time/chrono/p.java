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
    public final ChronoLocalDateTime w(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public p(n nVar, int i, int i2, int i3) {
        nVar.q(i, i2, i3);
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public p(n nVar, long j) {
        int i = (int) j;
        nVar.o();
        if (i < nVar.e || i >= nVar.f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(nVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int i2 = nVar.g;
        int[] iArr = {(binarySearch + i2) / 12, ((i2 + binarySearch) % 12) + 1, (i - nVar.d[binarySearch]) + 1};
        this.a = nVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final k b() {
        return this.a;
    }

    @Override // j$.time.chrono.d
    public final l H() {
        return q.AH;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.r(this);
        }
        if (!j$.com.android.tools.r8.a.q(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = o.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.y(aVar) : j$.time.temporal.s.e(1L, 5L) : j$.time.temporal.s.e(1L, r3.x(i2, 12)) : j$.time.temporal.s.e(1L, r3.r(i2, this.c));
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i = o.a[((j$.time.temporal.a) oVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return N();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.R(v() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((N() - 1) % 7) + 1;
            case 7:
                return v();
            case 8:
                return ((N() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final p e(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (p) super.e(j, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        n nVar = this.a;
        nVar.y(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = o.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return Q(i5, i4, i);
            case 2:
                return J(Math.min(i, nVar.x(i5, 12)) - N());
            case 3:
                return J((j - u(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return J(j - (((int) j$.com.android.tools.r8.a.R(v() + 3, 7)) + 1));
            case 5:
                return J(j - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return J(j - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(nVar, j);
            case 8:
                return J((j - u(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Q(i5, i, i3);
            case 10:
                return K(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return Q(i, i4, i3);
            case 12:
                return Q(i, i4, i3);
            case 13:
                return Q(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
    }

    public final p Q(int i, int i2, int i3) {
        n nVar = this.a;
        int r = nVar.r(i, i2);
        if (i3 > r) {
            i3 = r;
        }
        return new p(nVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b p(j$.time.temporal.m mVar) {
        return (p) super.p(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        return (p) super.p(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long v() {
        return this.a.q(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.d
    public final b L(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return Q(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final p K(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long S = j$.com.android.tools.r8.a.S(j2, 12L);
        int i = this.a.g;
        if (S >= i / 12 && S <= (((r4.d.length - 1) + i) / 12) - 1) {
            return Q((int) S, ((int) j$.com.android.tools.r8.a.R(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + S);
    }

    @Override // j$.time.chrono.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final p J(long j) {
        return new p(this.a, v() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b f(long j, j$.time.temporal.q qVar) {
        return (p) super.f(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal f(long j, j$.time.temporal.q qVar) {
        return (p) super.f(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: D */
    public final b l(long j, j$.time.temporal.q qVar) {
        return (p) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return (p) super.l(j, chronoUnit);
    }

    public final int N() {
        return this.a.x(this.b, this.c - 1) + this.d;
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

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 6, this);
    }
}
