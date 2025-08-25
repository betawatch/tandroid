package j$.time.chrono;

import j$.time.LocalDate;
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

    static q J(o oVar, int i, int i2, int i3) {
        return new q(oVar, i, i2, i3);
    }

    static q K(o oVar, long j) {
        return new q(oVar, j);
    }

    private q(o oVar, int i, int i2, int i3) {
        oVar.v(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private q(o oVar, long j) {
        int[] B = oVar.B((int) j);
        this.a = oVar;
        this.b = B[0];
        this.c = B[1];
        this.d = B[2];
    }

    @Override // j$.time.chrono.d
    public final m C() {
        return r.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        if (!h.h(this, rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = p.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.F(aVar) : j$.time.temporal.w.j(1L, 5L) : j$.time.temporal.w.j(1L, r3.D(i2)) : j$.time.temporal.w.j(1L, r3.C(i2, this.c));
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.j(this);
        }
        int i = p.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return I();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((I() - 1) % 7) + 1;
            case 7:
                return s();
            case 8:
                return ((I() - 1) / 7) + 1;
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
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final q d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (q) super.d(j, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        o oVar = this.a;
        oVar.F(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return N(i5, i4, i);
            case 2:
                return E(Math.min(i, oVar.D(i5)) - I());
            case 3:
                return E((j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return E(j - (((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1));
            case 5:
                return E(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return E(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return E((j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return N(i5, i, i3);
            case 10:
                return F(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return N(i, i4, i3);
            case 12:
                return N(i, i4, i3);
            case 13:
                return N(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    private q N(int i, int i2, int i3) {
        o oVar = this.a;
        int C = oVar.C(i, i2);
        if (i3 > C) {
            i3 = C;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d
    /* renamed from: H */
    public final b l(j$.time.temporal.p pVar) {
        return (q) super.l(pVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        return (q) super.l(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long s() {
        return this.a.v(this.b, this.c, this.d);
    }

    private int I() {
        return this.a.u(this.b, this.c) + this.d;
    }

    @Override // j$.time.chrono.d
    final b G(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return N(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.d
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final q F(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return N(this.a.m(j$.com.android.tools.r8.a.k(j2, 12L)), ((int) j$.com.android.tools.r8.a.j(j2, 12L)) + 1, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.d
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final q E(long j) {
        return new q(this.a, s() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b e(long j, j$.time.temporal.u uVar) {
        return (q) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (q) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: D */
    public final b i(long j, j$.time.temporal.u uVar) {
        return (q) super.i(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return (q) super.i(j, bVar);
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
    public final ChronoLocalDateTime t(j$.time.j jVar) {
        return f.C(this, jVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
