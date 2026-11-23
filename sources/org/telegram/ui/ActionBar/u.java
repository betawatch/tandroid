package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ g2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, g2 g2Var, g2 g2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = g2Var;
        this.c = g2Var2;
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
            g2 g2Var = this.b;
            if (g2Var != null) {
                g2Var.onTransitionAnimationStart(false, false);
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
                org.telegram.messenger.g0.h3(actionBarLayout.e, 200L);
            }
        }
    }
}
