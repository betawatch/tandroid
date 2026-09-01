package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oi0 extends xh.n {
    public Runnable W;

    @Override // xh.n, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        ni0 ni0Var = new ni0(this, 0);
        this.W = ni0Var;
        AndroidUtilities.runOnUIThread(ni0Var);
    }

    @Override // xh.n
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

    @Override // xh.n, f2.l, f2.u0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ni0 ni0Var = new ni0(this, 1);
        this.W = ni0Var;
        AndroidUtilities.runOnUIThread(ni0Var);
    }

    @Override // f2.l
    public final void F() {
    }
}
