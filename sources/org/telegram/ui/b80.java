package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class b80 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ c80 b;

    public b80(c80 c80Var, String str) {
        this.b = c80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c80 c80Var = this.b;
        try {
            c80Var.f.cancel();
            c80Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a80(this, this.a, 0));
    }
}
