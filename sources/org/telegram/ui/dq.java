package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dq extends v4.k {
    public final h2.f F = new h2.f((int[]) null);
    public final /* synthetic */ qq G;

    public dq(qq qqVar) {
        this.G = qqVar;
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
    public final void P(v4.d1 d1Var) {
        this.G.c.invalidate();
    }

    @Override // v4.k, v4.l0
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
