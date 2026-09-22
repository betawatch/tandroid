package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kb extends ji.n {
    public int W;
    public mu0 X;
    public final /* synthetic */ ub Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(ub ubVar, jb jbVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, jbVar, e6Var);
        this.Y = ubVar;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        mu0 mu0Var = this.X;
        if (mu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mu0Var);
        }
        mu0 mu0Var2 = new mu0(this, 20);
        this.X = mu0Var2;
        AndroidUtilities.runOnUIThread(mu0Var2);
    }

    @Override // ji.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ub.R0, false);
        }
        mu0 mu0Var = this.X;
        if (mu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
