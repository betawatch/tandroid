package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qb extends ki.n {
    public int W;
    public tu0 X;
    public final /* synthetic */ ac Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(ac acVar, pb pbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, pbVar, c6Var);
        this.Y = acVar;
        this.W = -1;
    }

    @Override // ki.n, s4.k
    public final void N() {
        super.N();
        tu0 tu0Var = this.X;
        if (tu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tu0Var);
        }
        tu0 tu0Var2 = new tu0(this, 20);
        this.X = tu0Var2;
        AndroidUtilities.runOnUIThread(tu0Var2);
    }

    @Override // ki.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ac.R0, false);
        }
        tu0 tu0Var = this.X;
        if (tu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
