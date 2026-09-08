package i2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class f implements i1 {
    public boolean E;
    public u2.f0 G;
    public x2.p H;
    public final int b;
    public m1 d;
    public int e;
    public j2.k f;
    public e2.x h;
    public int n;
    public u2.b1 r;
    public b2.s[] s;
    public long v;
    public long w;
    public boolean y;
    public final Object a = new Object();
    public final n4.y c = new n4.y(17, false);
    public long x = Long.MIN_VALUE;
    public b2.k1 F = b2.k1.a;

    public f(int i10) {
        this.b = i10;
    }

    public abstract int A(b2.s sVar);

    public int B() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o c(Throwable th2, b2.s sVar, boolean z10, int i10) {
        int i11;
        if (sVar != null && !this.E) {
            this.E = true;
            try {
                i11 = A(sVar) & 7;
            } catch (o unused) {
            } finally {
                this.E = false;
            }
            return new o(1, th2, i10, j(), this.e, sVar, sVar != null ? 4 : i11, this.G, z10);
        }
        i11 = 4;
        return new o(1, th2, i10, j(), this.e, sVar, sVar != null ? 4 : i11, this.G, z10);
    }

    public long g(long j3, long j10) {
        if (this.n == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public s0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.x == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public final boolean n() {
        if (k()) {
            return this.y;
        }
        u2.b1 b1Var = this.r;
        b1Var.getClass();
        return b1Var.e();
    }

    public abstract void o();

    public abstract void q(long j3, boolean z10);

    public final int w(n4.y yVar, h2.h hVar, int i10) {
        u2.b1 b1Var = this.r;
        b1Var.getClass();
        int f7 = b1Var.f(yVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.x = Long.MIN_VALUE;
                return this.y ? -4 : -3;
            }
            long j3 = hVar.e + this.v;
            hVar.e = j3;
            this.x = Math.max(this.x, j3);
            return f7;
        }
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.c;
            sVar.getClass();
            long j10 = sVar.w;
            if (j10 != Long.MAX_VALUE) {
                b2.r a2 = sVar.a();
                a2.v = j10 + this.v;
                yVar.c = new b2.s(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j3, long j10);

    public final void y(b2.s[] sVarArr, u2.b1 b1Var, long j3, long j10, u2.f0 f0Var) {
        e2.d.g(!this.y);
        this.r = b1Var;
        this.G = f0Var;
        if (this.x == Long.MIN_VALUE) {
            this.x = j3;
        }
        this.s = sVarArr;
        this.v = j10;
        v(sVarArr, j3, j10, f0Var);
    }

    public void e() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    @Override // i2.i1
    public void d(int i10, Object obj) {
    }

    public void p(boolean z10, boolean z11) {
    }

    public void z(float f7, float f10) {
    }

    public void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
    }
}
