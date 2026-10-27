package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ki0 extends mi.m {
    public Runnable W;

    @Override // mi.m, s4.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        ji0 ji0Var = new ji0(this, 0);
        this.W = ji0Var;
        AndroidUtilities.runOnUIThread(ji0Var);
    }

    @Override // mi.m
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

    @Override // mi.m, s4.l, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ji0 ji0Var = new ji0(this, 1);
        this.W = ji0Var;
        AndroidUtilities.runOnUIThread(ji0Var);
    }

    @Override // s4.l
    public final void F() {
    }
}
