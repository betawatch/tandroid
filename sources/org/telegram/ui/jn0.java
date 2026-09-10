package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jn0 extends TimerTask {
    public final /* synthetic */ kn0 a;

    public jn0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        kn0 kn0Var = this.a;
        if (kn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        kn0Var.y = (int) (kn0Var.y - (currentTimeMillis - kn0Var.F));
        kn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ql0(this, 6));
    }
}
