package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mb extends ii.n {
    public int W;
    public mu0 X;
    public final /* synthetic */ wb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, lbVar, f6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override // ii.n, s4.j
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

    @Override // ii.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.Y0, false);
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
