package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bj0 extends ki.n {
    public Runnable W;

    @Override // ki.n, s4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        aj0 aj0Var = new aj0(this, 0);
        this.W = aj0Var;
        AndroidUtilities.runOnUIThread(aj0Var);
    }

    @Override // ki.n
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

    @Override // ki.n, s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        aj0 aj0Var = new aj0(this, 1);
        this.W = aj0Var;
        AndroidUtilities.runOnUIThread(aj0Var);
    }

    @Override // s4.k
    public final void F() {
    }
}
