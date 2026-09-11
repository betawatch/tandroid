package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class kn0 extends TimerTask {
    public final /* synthetic */ ln0 a;

    public kn0(ln0 ln0Var) {
        this.a = ln0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ln0 ln0Var = this.a;
        if (ln0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ln0Var.y = (int) (ln0Var.y - (currentTimeMillis - ln0Var.F));
        ln0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new rl0(this, 6));
    }
}
