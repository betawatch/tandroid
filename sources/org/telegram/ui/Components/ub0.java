package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ub0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ zb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(zb0 zb0Var, sb0 sb0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, sb0Var, d6Var);
        this.Y = zb0Var;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        tb0 tb0Var = new tb0(this, 0);
        this.X = tb0Var;
        AndroidUtilities.runOnUIThread(tb0Var);
        zb0 zb0Var = this.Y;
        if (zb0Var.V) {
            zb0Var.V = false;
            AndroidUtilities.runOnUIThread(new tb0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        fc0 fc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(fc0Var.y);
        fc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(fc0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // ji.n, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        tb0 tb0Var = new tb0(this, 2);
        this.X = tb0Var;
        AndroidUtilities.runOnUIThread(tb0Var);
    }
}
