package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ o70 b;

    public n70(o70 o70Var, String str) {
        this.b = o70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        o70 o70Var = this.b;
        try {
            o70Var.f.cancel();
            o70Var.f = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new m70(this, this.a, 0));
    }
}
