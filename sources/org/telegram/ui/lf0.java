package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
