package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ e2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, e2 e2Var, e2 e2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = e2Var;
        this.c = e2Var2;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d != this) {
            return;
        }
        actionBarLayout.d = null;
        if (this.a) {
            e2 e2Var = this.b;
            if (e2Var != null) {
                e2Var.onTransitionAnimationStart(false, false);
            }
            this.c.onTransitionAnimationStart(true, false);
            actionBarLayout.h0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            if (actionBarLayout.Y0) {
                actionBarLayout.e.run();
            } else {
                org.telegram.messenger.g0.i3(actionBarLayout.e, 200L);
            }
        }
    }
}
