package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gb0 extends uh.m {
    public int W;
    public Runnable X;
    public final /* synthetic */ lb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(lb0 lb0Var, eb0 eb0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, eb0Var, c6Var);
        this.Y = lb0Var;
        this.W = -1;
    }

    @Override // uh.m, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fb0 fb0Var = new fb0(this, 0);
        this.X = fb0Var;
        AndroidUtilities.runOnUIThread(fb0Var);
        lb0 lb0Var = this.Y;
        if (lb0Var.R) {
            lb0Var.R = false;
            AndroidUtilities.runOnUIThread(new fb0(this, 1));
        }
    }

    @Override // uh.m
    public final void W() {
        rb0 rb0Var = this.Y.V;
        AndroidUtilities.cancelRunOnUIThread(rb0Var.y);
        rb0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(rb0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // uh.m, f2.l, f2.u0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fb0 fb0Var = new fb0(this, 2);
        this.X = fb0Var;
        AndroidUtilities.runOnUIThread(fb0Var);
    }
}
