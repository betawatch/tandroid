package i2;

import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b implements o1 {
    public boolean D;
    public boolean E;
    public u2.g0 G;
    public x2.o H;
    public final int b;
    public s1 d;
    public int e;
    public j2.l f;
    public e2.g0 h;
    public int n;
    public u2.d1 r;
    public b2.x[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final hf.b c = new hf.b(23, false);
    public long y = Long.MIN_VALUE;
    public b2.o1 F = b2.o1.a;

    public b(int i10) {
        this.b = i10;
    }

    public final int B(long j10) {
        u2.d1 d1Var = this.r;
        d1Var.getClass();
        return d1Var.i(j10 - this.w);
    }

    public abstract int C(b2.x xVar);

    public int D() {
        return 0;
    }

    public boolean E(long j10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l e(Throwable th2, b2.x xVar, boolean z10, int i10) {
        int i11;
        if (xVar != null && !this.E) {
            this.E = true;
            try {
                i11 = C(xVar) & 7;
            } catch (l unused) {
            } finally {
                this.E = false;
            }
            return new l(1, th2, i10, j(), this.e, xVar, xVar != null ? 4 : i11, this.G, z10);
        }
        i11 = 4;
        return new l(1, th2, i10, j(), this.e, xVar, xVar != null ? 4 : i11, this.G, z10);
    }

    public long h(long j10, long j11) {
        if (this.n == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public x0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.y == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(hf.b bVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.r;
        d1Var.getClass();
        int r10 = d1Var.r(bVar, hVar, i10);
        if (r10 == -4) {
            if (hVar.isEndOfStream()) {
                this.y = Long.MIN_VALUE;
                return this.D ? -4 : -3;
            }
            long j10 = hVar.e + this.w;
            hVar.e = j10;
            this.y = Math.max(this.y, j10);
            return r10;
        }
        if (r10 == -5) {
            b2.x xVar = (b2.x) bVar.c;
            xVar.getClass();
            long j11 = xVar.x;
            if (j11 != Long.MAX_VALUE) {
                b2.w a2 = xVar.a();
                a2.w = j11 + this.w;
                bVar.c = new b2.x(a2);
            }
        }
        return r10;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.x[] xVarArr, u2.d1 d1Var, long j10, long j11, u2.g0 g0Var) {
        t6.p(!this.D);
        this.r = d1Var;
        this.G = g0Var;
        if (this.y == Long.MIN_VALUE) {
            this.y = j10;
        }
        this.s = xVarArr;
        this.w = j11;
        u(xVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.D = false;
        this.x = j10;
        this.y = j10;
        if (!z11) {
            z11 = B(j10) != 0;
        }
        p(j10, z10, z11);
    }

    public void f() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void v() {
    }

    public void A(float f7, float f10) {
    }

    @Override // i2.o1
    public void d(int i10, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(b2.x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
