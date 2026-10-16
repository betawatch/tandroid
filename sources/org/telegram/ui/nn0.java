package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nn0 extends TimerTask {
    public final /* synthetic */ on0 a;

    public nn0(on0 on0Var) {
        this.a = on0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        on0 on0Var = this.a;
        if (on0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        on0Var.y = (int) (on0Var.y - (currentTimeMillis - on0Var.F));
        on0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new xk0(this, 7));
    }
}
