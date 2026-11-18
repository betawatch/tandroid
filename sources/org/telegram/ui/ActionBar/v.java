package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ h2 b;
    public final /* synthetic */ h2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, h2 h2Var, h2 h2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = h2Var;
        this.c = h2Var2;
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
            h2 h2Var = this.b;
            if (h2Var != null) {
                h2Var.onTransitionAnimationStart(false, false);
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
