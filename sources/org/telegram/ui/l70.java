package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ m70 b;

    public l70(m70 m70Var, String str) {
        this.b = m70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        m70 m70Var = this.b;
        try {
            m70Var.f.cancel();
            m70Var.f = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new k70(this, this.a, 0));
    }
}
