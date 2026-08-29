package l4;

import j3.r2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class m1 extends j {
    public final a k;

    public m1(a aVar) {
        this.k = aVar;
    }

    @Override // l4.a
    public r2 g() {
        return this.k.g();
    }

    @Override // l4.a
    public final j3.f1 h() {
        return this.k.h();
    }

    @Override // l4.a
    public boolean i() {
        return this.k.i();
    }

    @Override // l4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.j = y0Var;
        this.i = f5.d0.k(null);
        z();
    }

    @Override // l4.j
    public final c0 s(Object obj, c0 c0Var) {
        return x(c0Var);
    }

    @Override // l4.j
    public final long t(Object obj, long j10) {
        return j10;
    }

    @Override // l4.j
    public final int u(int i10, Object obj) {
        return i10;
    }

    @Override // l4.j
    public final void v(Object obj, a aVar, r2 r2Var) {
        y(r2Var);
    }

    public abstract void y(r2 r2Var);

    public void z() {
        w(null, this.k);
    }

    public c0 x(c0 c0Var) {
        return c0Var;
    }
}
