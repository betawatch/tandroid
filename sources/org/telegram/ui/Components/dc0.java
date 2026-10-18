package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class dc0 extends li.m {
    public int W;
    public Runnable X;
    public final /* synthetic */ ic0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(ic0 ic0Var, bc0 bc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, bc0Var, d6Var);
        this.Y = ic0Var;
        this.W = -1;
    }

    @Override // li.m, s4.k
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

    @Override // li.m
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

    @Override // li.m, s4.k, s4.l0
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
