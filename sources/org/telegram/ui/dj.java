package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dj extends pi.k {
    public Runnable W;
    public final /* synthetic */ bn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(bn bnVar, bn bnVar2, bj bjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bnVar2, bjVar, i6Var);
        this.X = bnVar;
    }

    @Override // v4.k
    public final void F() {
        bn bnVar = this.X;
        if (bnVar.ea == -1) {
            bnVar.ea = bnVar.getNotificationCenter().q(bn.sd, bnVar.ea, false);
        }
    }

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        cj cjVar = new cj(this, 1);
        this.W = cjVar;
        org.telegram.messenger.g0.g3(cjVar);
    }

    @Override // pi.k
    public final void W() {
        bn bnVar = this.X;
        bnVar.ea = bnVar.getNotificationCenter().q(bn.sd, bnVar.ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        j6.o oVar = bnVar.a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(oVar);
        oVar.run();
        org.telegram.ui.Components.te teVar = bnVar.a0.M4;
        org.telegram.messenger.g0.r(teVar);
        teVar.run();
    }

    @Override // pi.k, v4.k, v4.n0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        cj cjVar = new cj(this, 0);
        this.W = cjVar;
        org.telegram.messenger.g0.g3(cjVar);
    }
}
