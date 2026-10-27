package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fn0 extends TimerTask {
    public final /* synthetic */ gn0 a;

    public fn0(gn0 gn0Var) {
        this.a = gn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        gn0 gn0Var = this.a;
        if (gn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        gn0Var.y = (int) (gn0Var.y - (currentTimeMillis - gn0Var.F));
        gn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new nj0(this, 8));
    }
}
