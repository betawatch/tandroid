package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fi0 extends uh.m {
    public Runnable W;

    @Override // uh.m, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        ei0 ei0Var = new ei0(this, 0);
        this.W = ei0Var;
        AndroidUtilities.runOnUIThread(ei0Var);
    }

    @Override // uh.m
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
    }

    @Override // uh.m, f2.l, f2.u0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ei0 ei0Var = new ei0(this, 1);
        this.W = ei0Var;
        AndroidUtilities.runOnUIThread(ei0Var);
    }

    @Override // f2.l
    public final void F() {
    }
}
