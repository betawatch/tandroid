package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pi0 extends wh.n {
    public Runnable W;

    @Override // wh.n, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        oi0 oi0Var = new oi0(this, 0);
        this.W = oi0Var;
        AndroidUtilities.runOnUIThread(oi0Var);
    }

    @Override // wh.n
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

    @Override // wh.n, f2.l, f2.t0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        oi0 oi0Var = new oi0(this, 1);
        this.W = oi0Var;
        AndroidUtilities.runOnUIThread(oi0Var);
    }

    @Override // f2.l
    public final void F() {
    }
}
