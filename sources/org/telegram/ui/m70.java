package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
