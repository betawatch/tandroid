package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        AndroidUtilities.runOnUIThread(new pl0(this, 6));
    }
}
