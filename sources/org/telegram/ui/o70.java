package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ p70 b;

    public o70(p70 p70Var, String str) {
        this.b = p70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        p70 p70Var = this.b;
        try {
            p70Var.f.cancel();
            p70Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new n70(this, this.a, 0));
    }
}
