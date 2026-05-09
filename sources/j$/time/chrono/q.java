package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient o a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    @Override // j$.time.chrono.b
    public final l a() {
        return this.a;
    }

    static q O(o oVar, int i, int i2, int i3) {
        return new q(oVar, i, i2, i3);
    }

    static q P(o oVar, long j) {
        return new q(oVar, j);
    }

    private q(o oVar, int i, int i2, int i3) {
        oVar.x(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private q(o oVar, long j) {
        int[] G = oVar.G((int) j);
        this.a = oVar;
        this.b = G[0];
        this.c = G[1];
        this.d = G[2];
    }

    @Override // j$.time.chrono.d
    public final m H() {
        return r.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.r(this);
        }
        if (!h.h(this, pVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = p.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.A(aVar) : j$.time.temporal.u.j(1L, 5L) : j$.time.temporal.u.j(1L, r3.I(i2)) : j$.time.temporal.u.j(1L, r3.H(i2, this.c));
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = p.a[((j$.time.temporal.a) pVar).ordinal()];
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
                return ((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((N() - 1) % 7) + 1;
            case 7:
                return s();
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
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final q d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) super.d(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        o oVar = this.a;
        oVar.A(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return S(i5, i4, i);
            case 2:
                return J(Math.min(i, oVar.I(i5)) - N());
            case 3:
                return J((j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return J(j - (((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1));
            case 5:
                return J(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return J(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return J((j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return S(i5, i, i3);
            case 10:
                return K(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return S(i, i4, i3);
            case 12:
                return S(i, i4, i3);
            case 13:
                return S(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    private q S(int i, int i2, int i3) {
        o oVar = this.a;
        int H = oVar.H(i, i2);
        if (i3 > H) {
            i3 = H;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b n(j$.time.temporal.n nVar) {
        return (q) super.n(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return (q) super.n(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long s() {
        return this.a.x(this.b, this.c, this.d);
    }

    private int N() {
        return this.a.v(this.b, this.c) + this.d;
    }

    @Override // j$.time.chrono.d
    final b L(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return S(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final q K(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return S(this.a.o(j$.com.android.tools.r8.a.k(j2, 12L)), ((int) j$.com.android.tools.r8.a.j(j2, 12L)) + 1, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final q J(long j) {
        return new q(this.a, s() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b e(long j, j$.time.temporal.s sVar) {
        return (q) super.e(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.s sVar) {
        return (q) super.e(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: C */
    public final b k(long j, j$.time.temporal.s sVar) {
        return (q) super.k(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (q) super.k(j, chronoUnit);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int hashCode = this.a.getId().hashCode();
        int i = this.b;
        return (hashCode ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime t(j$.time.i iVar) {
        return f.H(this, iVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.l.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
