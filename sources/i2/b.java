package i2;

import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class b implements m1 {
    public boolean E;
    public u2.g0 G;
    public x2.n H;
    public final int b;
    public q1 d;
    public int e;
    public j2.k f;
    public e2.g0 h;
    public int n;
    public u2.d1 r;
    public b2.x[] s;
    public long v;
    public long w;
    public boolean y;
    public final Object a = new Object();
    public final qf.b c = new qf.b(24);
    public long x = Long.MIN_VALUE;
    public b2.p1 F = b2.p1.a;

    public b(int i10) {
        this.b = i10;
    }

    public final int B(long j10) {
        u2.d1 d1Var = this.r;
        d1Var.getClass();
        return d1Var.m(j10 - this.v);
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
    public final m d(Throwable th2, b2.x xVar, boolean z10, int i10) {
        int i11;
        if (xVar != null && !this.E) {
            this.E = true;
            try {
                i11 = C(xVar) & 7;
            } catch (m unused) {
            } finally {
                this.E = false;
            }
            return new m(1, th2, i10, j(), this.e, xVar, xVar != null ? 4 : i11, this.G, z10);
        }
        i11 = 4;
        return new m(1, th2, i10, j(), this.e, xVar, xVar != null ? 4 : i11, this.G, z10);
    }

    public long g(long j10, long j11) {
        if (this.n == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public w0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.x == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(qf.b bVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.r;
        d1Var.getClass();
        int f7 = d1Var.f(bVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.x = Long.MIN_VALUE;
                return this.y ? -4 : -3;
            }
            long j10 = hVar.e + this.v;
            hVar.e = j10;
            this.x = Math.max(this.x, j10);
            return f7;
        }
        if (f7 == -5) {
            b2.x xVar = (b2.x) bVar.c;
            xVar.getClass();
            long j11 = xVar.x;
            if (j11 != Long.MAX_VALUE) {
                b2.w a2 = xVar.a();
                a2.w = j11 + this.v;
                bVar.c = new b2.x(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.x[] xVarArr, u2.d1 d1Var, long j10, long j11, u2.g0 g0Var) {
        u6.p(!this.y);
        this.r = d1Var;
        this.G = g0Var;
        if (this.x == Long.MIN_VALUE) {
            this.x = j10;
        }
        this.s = xVarArr;
        this.v = j11;
        u(xVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.y = false;
        this.w = j10;
        this.x = j10;
        if (!z11) {
            z11 = B(j10) != 0;
        }
        p(j10, z10, z11);
    }

    public void e() {
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

    @Override // i2.m1
    public void c(int i10, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(b2.x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
