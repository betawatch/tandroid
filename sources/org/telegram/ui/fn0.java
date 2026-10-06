package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        AndroidUtilities.runOnUIThread(new nl0(this, 6));
    }
}
