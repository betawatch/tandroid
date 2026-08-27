package j4;

import h3.s2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l1 extends j {
    public final a k;

    public l1(a aVar) {
        this.k = aVar;
    }

    @Override // j4.a
    public s2 g() {
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
        this.i = d5.g0.k(null);
        z();
    }

    @Override // j4.j
    public final c0 s(Object obj, c0 c0Var) {
        return x(c0Var);
    }

    @Override // j4.j
    public final long t(Object obj, long j10) {
        return j10;
    }

    @Override // j4.j
    public final int u(int i10, Object obj) {
        return i10;
    }

    @Override // j4.j
    public final void v(Object obj, a aVar, s2 s2Var) {
        y(s2Var);
    }

    public abstract void y(s2 s2Var);

    public void z() {
        w(null, this.k);
    }

    public c0 x(c0 c0Var) {
        return c0Var;
    }
}
