package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class cj extends mi.l {
    public Runnable W;
    public final /* synthetic */ an X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(an anVar, an anVar2, aj ajVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(anVar2, ajVar, f6Var);
        this.X = anVar;
    }

    @Override // v4.k
    public final void F() {
        an anVar = this.X;
        if (anVar.aa == -1) {
            anVar.aa = anVar.getNotificationCenter().q(an.od, anVar.aa, false);
        }
    }

    @Override // mi.l, v4.k
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

    @Override // mi.l
    public final void W() {
        an anVar = this.X;
        anVar.aa = anVar.getNotificationCenter().q(an.od, anVar.aa, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        m.f3 f3Var = anVar.Z.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(f3Var);
        f3Var.run();
        org.telegram.ui.Components.je jeVar = anVar.Z.Y3;
        org.telegram.messenger.g0.r(jeVar);
        jeVar.run();
    }

    @Override // mi.l, v4.k, v4.l0
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
