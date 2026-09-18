package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i80 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ j80 b;

    public i80(j80 j80Var, String str) {
        this.b = j80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        j80 j80Var = this.b;
        try {
            j80Var.f.cancel();
            j80Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new h80(this, this.a, 0));
    }
}
