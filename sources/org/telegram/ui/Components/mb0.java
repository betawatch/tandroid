package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mb0 extends xh.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ sb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(sb0 sb0Var, kb0 kb0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, kb0Var, g6Var);
        this.Y = sb0Var;
        this.W = -1;
    }

    @Override // xh.n, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        lb0 lb0Var = new lb0(this, 0);
        this.X = lb0Var;
        AndroidUtilities.runOnUIThread(lb0Var);
        sb0 sb0Var = this.Y;
        if (sb0Var.S) {
            sb0Var.S = false;
            AndroidUtilities.runOnUIThread(new lb0(this, 1));
        }
    }

    @Override // xh.n
    public final void W() {
        yb0 yb0Var = this.Y.W;
        AndroidUtilities.cancelRunOnUIThread(yb0Var.y);
        yb0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(yb0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // xh.n, f2.l, f2.u0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        lb0 lb0Var = new lb0(this, 2);
        this.X = lb0Var;
        AndroidUtilities.runOnUIThread(lb0Var);
    }
}
