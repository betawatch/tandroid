package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
    public final void P(v4.e1 e1Var) {
        this.G.c.invalidate();
    }

    @Override // v4.k, v4.m0
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
