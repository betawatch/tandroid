package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ii0 extends sh.m {
    public Runnable W;

    @Override // sh.m, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        hi0 hi0Var = new hi0(this, 0);
        this.W = hi0Var;
        AndroidUtilities.runOnUIThread(hi0Var);
    }

    @Override // sh.m
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

    @Override // sh.m, f2.l, f2.v0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        hi0 hi0Var = new hi0(this, 1);
        this.W = hi0Var;
        AndroidUtilities.runOnUIThread(hi0Var);
    }

    @Override // f2.l
    public final void F() {
    }
}
