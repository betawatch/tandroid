package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gi0 extends rh.m {
    public Runnable W;

    @Override // rh.m, f2.n
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        fi0 fi0Var = new fi0(this, 0);
        this.W = fi0Var;
        AndroidUtilities.runOnUIThread(fi0Var);
    }

    @Override // rh.m
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

    @Override // rh.m, f2.n, f2.w0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fi0 fi0Var = new fi0(this, 1);
        this.W = fi0Var;
        AndroidUtilities.runOnUIThread(fi0Var);
    }

    @Override // f2.n
    public final void F() {
    }
}
