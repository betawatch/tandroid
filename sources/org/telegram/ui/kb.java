package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kb extends wh.n {
    public int W;
    public yt0 X;
    public final /* synthetic */ ub Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(ub ubVar, jb jbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, jbVar, f6Var);
        this.Y = ubVar;
        this.W = -1;
    }

    @Override // wh.n, f2.l
    public final void N() {
        super.N();
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yt0Var);
        }
        yt0 yt0Var2 = new yt0(this, 20);
        this.X = yt0Var2;
        AndroidUtilities.runOnUIThread(yt0Var2);
    }

    @Override // wh.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ub.V0, false);
        }
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
