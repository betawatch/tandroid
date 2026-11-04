package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ d2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, d2 d2Var, d2 d2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = d2Var;
        this.c = d2Var2;
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
            d2 d2Var = this.b;
            if (d2Var != null) {
                d2Var.onTransitionAnimationStart(false, false);
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
