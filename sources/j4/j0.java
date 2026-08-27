package j4;

import h3.j2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 implements z, y {
    public final z a;
    public final long b;
    public y c;

    public j0(z zVar, long j10) {
        this.a = zVar;
        this.b = j10;
    }

    @Override // j4.z
    public final long B(long j10, j2 j2Var) {
        long j11 = this.b;
        return this.a.B(j10 - j11, j2Var) + j11;
    }

    @Override // j4.d1
    public final long D() {
        long D = this.a.D();
        if (D == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return D + this.b;
    }

    @Override // j4.z
    public final void E(y yVar, long j10) {
        this.c = yVar;
        this.a.E(this, j10 - this.b);
    }

    @Override // j4.z
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            k0 k0Var = (k0) b1VarArr[i10];
            if (k0Var != null) {
                b1Var = k0Var.a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        z zVar = this.a;
        long j11 = this.b;
        long F = zVar.F(sVarArr, zArr, b1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((k0) b1Var3).a != b1Var2) {
                    b1VarArr[i11] = new k0(b1Var2, j11);
                }
            }
        }
        return F + j11;
    }

    @Override // j4.d1
    public final void I(long j10) {
        this.a.I(j10 - this.b);
    }

    @Override // j4.c1
    public final void a(d1 d1Var) {
        y yVar = this.c;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // j4.d1
    public final boolean b() {
        return this.a.b();
    }

    @Override // j4.y
    public final void e(z zVar) {
        y yVar = this.c;
        yVar.getClass();
        yVar.e(this);
    }

    @Override // j4.d1
    public final long g() {
        long g10 = this.a.g();
        if (g10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g10 + this.b;
    }

    @Override // j4.z
    public final void m() {
        this.a.m();
    }

    @Override // j4.z
    public final long o(long j10) {
        long j11 = this.b;
        return this.a.o(j10 - j11) + j11;
    }

    @Override // j4.z
    public final void p(long j10) {
        this.a.p(j10 - this.b);
    }

    @Override // j4.d1
    public final boolean q(long j10) {
        return this.a.q(j10 - this.b);
    }

    @Override // j4.z
    public final long w() {
        long w10 = this.a.w();
        if (w10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return w10 + this.b;
    }

    @Override // j4.z
    public final j1 z() {
        return this.a.z();
    }
}
