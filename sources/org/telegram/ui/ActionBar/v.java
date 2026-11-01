package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ k2 b;
    public final /* synthetic */ k2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, k2 k2Var, k2 k2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = k2Var;
        this.c = k2Var2;
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
            k2 k2Var = this.b;
            if (k2Var != null) {
                k2Var.onTransitionAnimationStart(false, false);
            }
            this.c.onTransitionAnimationStart(true, false);
            actionBarLayout.g0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.e;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            if (actionBarLayout.X0) {
                actionBarLayout.e.run();
            } else {
                org.telegram.messenger.i0.h3(actionBarLayout.e, 200L);
            }
        }
    }
}
