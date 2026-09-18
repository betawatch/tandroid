package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ o2 b;
    public final /* synthetic */ o2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public w(ActionBarLayout actionBarLayout, boolean z10, o2 o2Var, o2 o2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.a = z10;
        this.b = o2Var;
        this.c = o2Var2;
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
            o2 o2Var = this.b;
            if (o2Var != null) {
                o2Var.onTransitionAnimationStart(false, false);
            }
            this.c.onTransitionAnimationStart(true, false);
            actionBarLayout.d0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.e;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            if (actionBarLayout.R0) {
                actionBarLayout.e.run();
            } else {
                AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
            }
        }
    }
}
