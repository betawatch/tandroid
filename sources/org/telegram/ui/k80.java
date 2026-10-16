package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class k80 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ l80 b;

    public k80(l80 l80Var, String str) {
        this.b = l80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        l80 l80Var = this.b;
        try {
            l80Var.f.cancel();
            l80Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new j80(this, this.a, 0));
    }
}
