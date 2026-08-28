package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fb extends rh.m {
    public int W;
    public kt0 X;
    public final /* synthetic */ pb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(pb pbVar, eb ebVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null, ebVar, b6Var);
        this.Y = pbVar;
        this.W = -1;
    }

    @Override // rh.m, f2.n
    public final void N() {
        super.N();
        kt0 kt0Var = this.X;
        if (kt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kt0Var);
        }
        kt0 kt0Var2 = new kt0(this, 20);
        this.X = kt0Var2;
        AndroidUtilities.runOnUIThread(kt0Var2);
    }

    @Override // rh.m
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, pb.U0, false);
        }
        kt0 kt0Var = this.X;
        if (kt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
