package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p2 b;
    public final /* synthetic */ p2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z4, p2 p2Var, p2 p2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.a = z4;
        this.b = p2Var;
        this.c = p2Var2;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d != this) {
            return;
        }
        actionBarLayout.d = null;
        if (this.a) {
            p2 p2Var = this.b;
            if (p2Var != null) {
                p2Var.onTransitionAnimationStart(false, false);
            }
            this.c.onTransitionAnimationStart(true, false);
            actionBarLayout.d0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.e;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            if (actionBarLayout.O0) {
                actionBarLayout.e.run();
            } else {
                AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
            }
        }
    }
}
