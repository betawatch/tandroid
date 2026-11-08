package l2;

import a8.ia;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class b implements m1 {
    public boolean D;
    public boolean E;
    public x2.g0 G;
    public a3.s H;
    public final int b;
    public q1 d;
    public int e;
    public m2.j f;
    public h2.g0 h;
    public int n;
    public x2.c1 r;
    public e2.u[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final wf.b c = new wf.b(27, false);
    public long y = Long.MIN_VALUE;
    public e2.l1 F = e2.l1.a;

    public b(int i7) {
        this.b = i7;
    }

    public final int B(long j3) {
        x2.c1 c1Var = this.r;
        c1Var.getClass();
        return c1Var.l(j3 - this.w);
    }

    public abstract int C(e2.u uVar);

    public int D() {
        return 0;
    }

    public boolean E(long j3) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l d(Throwable th2, e2.u uVar, boolean z9, int i7) {
        int i10;
        if (uVar != null && !this.E) {
            this.E = true;
            try {
                i10 = C(uVar) & 7;
            } catch (l unused) {
            } finally {
                this.E = false;
            }
            return new l(1, th2, i7, i(), this.e, uVar, uVar != null ? 4 : i10, this.G, z9);
        }
        i10 = 4;
        return new l(1, th2, i7, i(), this.e, uVar, uVar != null ? 4 : i10, this.G, z9);
    }

    public long g(long j3, long j10) {
        if (this.n == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public w0 h() {
        return null;
    }

    public abstract String i();

    public final boolean k() {
        return this.y == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z9, boolean z10);

    public final int w(wf.b bVar, k2.h hVar, int i7) {
        x2.c1 c1Var = this.r;
        c1Var.getClass();
        int m10 = c1Var.m(bVar, hVar, i7);
        if (m10 == -4) {
            if (hVar.isEndOfStream()) {
                this.y = Long.MIN_VALUE;
                return this.D ? -4 : -3;
            }
            long j3 = hVar.e + this.w;
            hVar.e = j3;
            this.y = Math.max(this.y, j3);
            return m10;
        }
        if (m10 == -5) {
            e2.u uVar = (e2.u) bVar.c;
            uVar.getClass();
            long j10 = uVar.x;
            if (j10 != Long.MAX_VALUE) {
                e2.t a10 = uVar.a();
                a10.w = j10 + this.w;
                bVar.c = new e2.u(a10);
            }
        }
        return m10;
    }

    public abstract void x(long j3, long j10);

    public final void y(e2.u[] uVarArr, x2.c1 c1Var, long j3, long j10, x2.g0 g0Var) {
        ia.p(!this.D);
        this.r = c1Var;
        this.G = g0Var;
        if (this.y == Long.MIN_VALUE) {
            this.y = j3;
        }
        this.s = uVarArr;
        this.w = j10;
        u(uVarArr, j3, j10, g0Var);
    }

    public final void z(long j3, boolean z9, boolean z10) {
        this.D = false;
        this.x = j3;
        this.y = j3;
        if (!z10) {
            z10 = B(j3) != 0;
        }
        p(j3, z9, z10);
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

    public void A(float f10, float f11) {
    }

    @Override // l2.m1
    public void c(int i7, Object obj) {
    }

    public void o(boolean z9, boolean z10) {
    }

    public void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
    }
}
