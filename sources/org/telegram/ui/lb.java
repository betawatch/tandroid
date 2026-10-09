package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lb extends ji.n {
    public int W;
    public nu0 X;
    public final /* synthetic */ vb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(vb vbVar, kb kbVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, kbVar, e6Var);
        this.Y = vbVar;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        nu0 nu0Var = this.X;
        if (nu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nu0Var);
        }
        nu0 nu0Var2 = new nu0(this, 20);
        this.X = nu0Var2;
        AndroidUtilities.runOnUIThread(nu0Var2);
    }

    @Override // ji.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, vb.R0, false);
        }
        nu0 nu0Var = this.X;
        if (nu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
