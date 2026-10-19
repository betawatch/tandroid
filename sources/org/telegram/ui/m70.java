package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class m70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ n70 b;

    public m70(n70 n70Var, String str) {
        this.b = n70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        n70 n70Var = this.b;
        try {
            n70Var.f.cancel();
            n70Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new l70(this, this.a, 0));
    }
}
