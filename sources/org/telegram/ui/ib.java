package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ib extends wh.n {
    public int W;
    public rt0 X;
    public final /* synthetic */ sb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(sb sbVar, hb hbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, hbVar, f6Var);
        this.Y = sbVar;
        this.W = -1;
    }

    @Override // wh.n, f2.l
    public final void N() {
        super.N();
        rt0 rt0Var = this.X;
        if (rt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rt0Var);
        }
        rt0 rt0Var2 = new rt0(this, 20);
        this.X = rt0Var2;
        AndroidUtilities.runOnUIThread(rt0Var2);
    }

    @Override // wh.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, sb.V0, false);
        }
        rt0 rt0Var = this.X;
        if (rt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
