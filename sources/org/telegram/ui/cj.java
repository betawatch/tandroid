package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cj extends pi.k {
    public Runnable W;
    public final /* synthetic */ an X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(an anVar, an anVar2, aj ajVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(anVar2, ajVar, e6Var);
        this.X = anVar;
    }

    @Override // v4.k
    public final void F() {
        an anVar = this.X;
        if (anVar.da == -1) {
            anVar.da = anVar.getNotificationCenter().q(an.rd, anVar.da, false);
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
        bj bjVar = new bj(this, 1);
        this.W = bjVar;
        org.telegram.messenger.g0.h3(bjVar);
    }

    @Override // pi.k
    public final void W() {
        an anVar = this.X;
        anVar.da = anVar.getNotificationCenter().q(an.rd, anVar.da, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        j6.o oVar = anVar.a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(oVar);
        oVar.run();
        org.telegram.ui.Components.ke keVar = anVar.a0.G4;
        org.telegram.messenger.g0.r(keVar);
        keVar.run();
    }

    @Override // pi.k, v4.k, v4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        bj bjVar = new bj(this, 0);
        this.W = bjVar;
        org.telegram.messenger.g0.h3(bjVar);
    }
}
