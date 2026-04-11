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

    static q Q(o oVar, int i, int i2, int i3) {
        return new q(oVar, i, i2, i3);
    }

    static q R(o oVar, long j) {
        return new q(oVar, j);
    }

    private q(o oVar, int i, int i2, int i3) {
        oVar.z(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private q(o oVar, long j) {
        int[] I = oVar.I((int) j);
        this.a = oVar;
        this.b = I[0];
        this.c = I[1];
        this.d = I[2];
    }

    @Override // j$.time.chrono.d
    public final m J() {
        return r.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        if (!h.h(this, pVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = p.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.C(aVar) : j$.time.temporal.u.j(1L, 5L) : j$.time.temporal.u.j(1L, r3.K(i2)) : j$.time.temporal.u.j(1L, r3.J(i2, this.c));
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
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
                return P();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.j(t() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((P() - 1) % 7) + 1;
            case 7:
                return t();
            case 8:
                return ((P() - 1) / 7) + 1;
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
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final q d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) super.d(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        o oVar = this.a;
        oVar.C(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return U(i5, i4, i);
            case 2:
                return L(Math.min(i, oVar.K(i5)) - P());
            case 3:
                return L((j - s(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return L(j - (((int) j$.com.android.tools.r8.a.j(t() + 3, 7)) + 1));
            case 5:
                return L(j - s(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return L(j - s(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return L((j - s(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return U(i5, i, i3);
            case 10:
                return M(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return U(i, i4, i3);
            case 12:
                return U(i, i4, i3);
            case 13:
                return U(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    private q U(int i, int i2, int i3) {
        o oVar = this.a;
        int J = oVar.J(i, i2);
        if (i3 > J) {
            i3 = J;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d
    /* renamed from: O */
    public final b n(j$.time.temporal.n nVar) {
        return (q) super.n(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return (q) super.n(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long t() {
        return this.a.z(this.b, this.c, this.d);
    }

    private int P() {
        return this.a.w(this.b, this.c) + this.d;
    }

    @Override // j$.time.chrono.d
    final b N(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return U(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final q M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return U(this.a.o(j$.com.android.tools.r8.a.k(j2, 12L)), ((int) j$.com.android.tools.r8.a.j(j2, 12L)) + 1, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final q L(long j) {
        return new q(this.a, t() + j);
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
    /* renamed from: E */
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
    public final ChronoLocalDateTime u(j$.time.j jVar) {
        return f.J(this, jVar);
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
