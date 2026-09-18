package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class g80 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ h80 b;

    public g80(h80 h80Var, String str) {
        this.b = h80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        h80 h80Var = this.b;
        try {
            h80Var.f.cancel();
            h80Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.a, 0));
    }
}
