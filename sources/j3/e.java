package j3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class e implements b2 {
    public final int b;
    public g2 d;
    public int e;
    public k3.k f;
    public int h;
    public o4.l0 n;
    public n0[] r;
    public long s;
    public boolean w;
    public boolean x;
    public f5.p y;
    public final Object a = new Object();
    public final f7.b c = new f7.b((char) 0, 17);
    public long v = Long.MIN_VALUE;

    public e(int i10) {
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(Throwable th2, n0 n0Var, boolean z4, int i10) {
        int i11;
        if (n0Var != null && !this.x) {
            this.x = true;
            try {
                i11 = x(n0Var) & 7;
            } catch (n unused) {
            } finally {
                this.x = false;
            }
            return new n(1, th2, i10, g(), this.e, n0Var, n0Var != null ? 4 : i11, z4);
        }
        i11 = 4;
        return new n(1, th2, i10, g(), this.e, n0Var, n0Var != null ? 4 : i11, z4);
    }

    public h5.n f() {
        return null;
    }

    public abstract String g();

    public final boolean h() {
        return this.v == Long.MIN_VALUE;
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void m(long j10, boolean z4);

    public abstract void r(n0[] n0VarArr, long j10, long j11);

    public final int s(f7.b bVar, n3.i iVar, int i10) {
        o4.l0 l0Var = this.n;
        l0Var.getClass();
        int f10 = l0Var.f(bVar, iVar, i10);
        if (f10 == -4) {
            if (iVar.e(4)) {
                this.v = Long.MIN_VALUE;
                return this.w ? -4 : -3;
            }
            long j10 = iVar.f + this.s;
            iVar.f = j10;
            this.v = Math.max(this.v, j10);
            return f10;
        }
        if (f10 == -5) {
            n0 n0Var = (n0) bVar.c;
            n0Var.getClass();
            long j11 = n0Var.G;
            if (j11 != Long.MAX_VALUE) {
                m0 a2 = n0Var.a();
                a2.s = j11 + this.s;
                bVar.c = new n0(a2);
            }
        }
        return f10;
    }

    public abstract void t(long j10, long j11);

    public final void u(n0[] n0VarArr, o4.l0 l0Var, long j10, long j11) {
        h5.a.i(!this.w);
        this.n = l0Var;
        if (this.v == Long.MIN_VALUE) {
            this.v = j10;
        }
        this.r = n0VarArr;
        this.s = j11;
        r(n0VarArr, j10, j11);
    }

    public final void v() {
        h5.a.i(this.h == 0);
        this.c.l();
        o();
    }

    public abstract int x(n0 n0Var);

    public int y() {
        return 0;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    @Override // j3.b2
    public void b(int i10, Object obj) {
    }

    public void l(boolean z4, boolean z10) {
    }

    public void w(float f10, float f11) {
    }
}
