package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lf0 extends TimerTask {
    public final /* synthetic */ mf0 a;

    public lf0(mf0 mf0Var) {
        this.a = mf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 26));
    }
}
