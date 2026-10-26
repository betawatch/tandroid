package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cc0 extends mi.m {
    public int W;
    public Runnable X;
    public final /* synthetic */ hc0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(hc0 hc0Var, ac0 ac0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, ac0Var, u6Var);
        this.Y = hc0Var;
        this.W = -1;
    }

    @Override // mi.m, s4.l
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        bc0 bc0Var = new bc0(this, 0);
        this.X = bc0Var;
        AndroidUtilities.runOnUIThread(bc0Var);
        hc0 hc0Var = this.Y;
        if (hc0Var.V) {
            hc0Var.V = false;
            AndroidUtilities.runOnUIThread(new bc0(this, 1));
        }
    }

    @Override // mi.m
    public final void W() {
        nc0 nc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(nc0Var.y);
        nc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(nc0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // mi.m, s4.l, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        bc0 bc0Var = new bc0(this, 2);
        this.X = bc0Var;
        AndroidUtilities.runOnUIThread(bc0Var);
    }
}
