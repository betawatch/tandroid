package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dc0 extends mi.m {
    public int W;
    public Runnable X;
    public final /* synthetic */ ic0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(ic0 ic0Var, bc0 bc0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, bc0Var, u6Var);
        this.Y = ic0Var;
        this.W = -1;
    }

    @Override // mi.m, s4.l
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        cc0 cc0Var = new cc0(this, 0);
        this.X = cc0Var;
        AndroidUtilities.runOnUIThread(cc0Var);
        ic0 ic0Var = this.Y;
        if (ic0Var.V) {
            ic0Var.V = false;
            AndroidUtilities.runOnUIThread(new cc0(this, 1));
        }
    }

    @Override // mi.m
    public final void W() {
        oc0 oc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(oc0Var.y);
        oc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(oc0Var.w).setAnimationInProgress(this.W, null, false);
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
        cc0 cc0Var = new cc0(this, 2);
        this.X = cc0Var;
        AndroidUtilities.runOnUIThread(cc0Var);
    }
}
