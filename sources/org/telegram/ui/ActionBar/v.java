package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ r2 b;
    public final /* synthetic */ r2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, r2 r2Var, r2 r2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = r2Var;
        this.c = r2Var2;
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
            r2 r2Var = this.b;
            if (r2Var != null) {
                r2Var.onTransitionAnimationStart(false, false);
            }
            this.c.onTransitionAnimationStart(true, false);
            actionBarLayout.g0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.e;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            if (actionBarLayout.X0) {
                actionBarLayout.e.run();
            } else {
                AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
            }
        }
    }
}
