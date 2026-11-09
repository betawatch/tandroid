package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ej extends mi.l {
    public Runnable W;
    public final /* synthetic */ cn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(cn cnVar, cn cnVar2, cj cjVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(cnVar2, cjVar, g6Var);
        this.X = cnVar;
    }

    @Override // v4.k
    public final void F() {
        cn cnVar = this.X;
        if (cnVar.ca == -1) {
            cnVar.ca = cnVar.getNotificationCenter().q(cn.qd, cnVar.ca, false);
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
        dj djVar = new dj(this, 1);
        this.W = djVar;
        org.telegram.messenger.g0.h3(djVar);
    }

    @Override // mi.l
    public final void W() {
        cn cnVar = this.X;
        cnVar.ca = cnVar.getNotificationCenter().q(cn.qd, cnVar.ca, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        m.f3 f3Var = cnVar.Z.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(f3Var);
        f3Var.run();
        org.telegram.ui.Components.je jeVar = cnVar.Z.Y3;
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
        dj djVar = new dj(this, 0);
        this.W = djVar;
        org.telegram.messenger.g0.h3(djVar);
    }
}
