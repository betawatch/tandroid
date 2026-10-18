package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nb extends li.m {
    public int W;
    public ut0 X;
    public final /* synthetic */ xb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(xb xbVar, mb mbVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, mbVar, d6Var);
        this.Y = xbVar;
        this.W = -1;
    }

    @Override // li.m, s4.k
    public final void N() {
        super.N();
        ut0 ut0Var = this.X;
        if (ut0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ut0Var);
        }
        ut0 ut0Var2 = new ut0(this, 20);
        this.X = ut0Var2;
        AndroidUtilities.runOnUIThread(ut0Var2);
    }

    @Override // li.m
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, xb.R0, false);
        }
        ut0 ut0Var = this.X;
        if (ut0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ut0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
