package j4;

import h3.r2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l1 extends k {
    public final a k;

    public l1(a aVar) {
        this.k = aVar;
    }

    @Override // j4.a
    public r2 g() {
        return this.k.g();
    }

    @Override // j4.a
    public final h3.f1 h() {
        return this.k.h();
    }

    @Override // j4.a
    public boolean i() {
        return this.k.i();
    }

    @Override // j4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.j = y0Var;
        this.i = d5.f0.k(null);
        z();
    }

    @Override // j4.k
    public final d0 s(Object obj, d0 d0Var) {
        return x(d0Var);
    }

    @Override // j4.k
    public final long t(Object obj, long j10) {
        return j10;
    }

    @Override // j4.k
    public final int u(int i9, Object obj) {
        return i9;
    }

    @Override // j4.k
    public final void v(Object obj, a aVar, r2 r2Var) {
        y(r2Var);
    }

    public abstract void y(r2 r2Var);

    public void z() {
        w(null, this.k);
    }

    public d0 x(d0 d0Var) {
        return d0Var;
    }
}
