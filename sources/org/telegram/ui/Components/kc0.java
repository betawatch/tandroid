package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kc0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ pc0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc0(pc0 pc0Var, ic0 ic0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, ic0Var, e6Var);
        this.Y = pc0Var;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jc0 jc0Var = new jc0(this, 0);
        this.X = jc0Var;
        AndroidUtilities.runOnUIThread(jc0Var);
        pc0 pc0Var = this.Y;
        if (pc0Var.V) {
            pc0Var.V = false;
            AndroidUtilities.runOnUIThread(new jc0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        vc0 vc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(vc0Var.y);
        vc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(vc0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // ji.n, s4.j, s4.n0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jc0 jc0Var = new jc0(this, 2);
        this.X = jc0Var;
        AndroidUtilities.runOnUIThread(jc0Var);
    }
}
