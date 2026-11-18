package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class eq extends v4.k {
    public final h2.f F = new h2.f((int[]) null);
    public final /* synthetic */ rq G;

    public eq(rq rqVar) {
        this.G = rqVar;
    }

    @Override // v4.k
    public final void N() {
        this.F.e();
    }

    @Override // v4.k
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // v4.k
    public final void P(v4.f1 f1Var) {
        this.G.c.invalidate();
    }

    @Override // v4.k, v4.n0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
