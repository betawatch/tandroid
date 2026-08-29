package l4;

import j3.j2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j0 implements z, y {
    public final z a;
    public final long b;
    public y c;

    public j0(z zVar, long j10) {
        this.a = zVar;
        this.b = j10;
    }

    @Override // l4.z
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            k0 k0Var = (k0) c1VarArr[i10];
            if (k0Var != null) {
                c1Var = k0Var.a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        z zVar = this.a;
        long j11 = this.b;
        long A = zVar.A(rVarArr, zArr, c1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((k0) c1Var3).a != c1Var2) {
                    c1VarArr[i11] = new k0(c1Var2, j11);
                }
            }
        }
        return A + j11;
    }

    @Override // l4.z
    public final long E() {
        long E = this.a.E();
        if (E == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return E + this.b;
    }

    @Override // l4.z
    public final k1 J() {
        return this.a.J();
    }

    @Override // l4.e1
    public final long L() {
        long L = this.a.L();
        if (L == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return L + this.b;
    }

    @Override // l4.e1
    public final void U(long j10) {
        this.a.U(j10 - this.b);
    }

    @Override // l4.d1
    public final void a(e1 e1Var) {
        y yVar = this.c;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // l4.e1
    public final boolean b() {
        return this.a.b();
    }

    @Override // l4.y
    public final void c(z zVar) {
        y yVar = this.c;
        yVar.getClass();
        yVar.c(this);
    }

    @Override // l4.z
    public final long f(long j10, j2 j2Var) {
        long j11 = this.b;
        return this.a.f(j10 - j11, j2Var) + j11;
    }

    @Override // l4.e1
    public final long h() {
        long h = this.a.h();
        if (h == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return h + this.b;
    }

    @Override // l4.z
    public final void n(y yVar, long j10) {
        this.c = yVar;
        this.a.n(this, j10 - this.b);
    }

    @Override // l4.z
    public final void o() {
        this.a.o();
    }

    @Override // l4.z
    public final long p(long j10) {
        long j11 = this.b;
        return this.a.p(j10 - j11) + j11;
    }

    @Override // l4.z
    public final void r(long j10) {
        this.a.r(j10 - this.b);
    }

    @Override // l4.e1
    public final boolean s(long j10) {
        return this.a.s(j10 - this.b);
    }
}
