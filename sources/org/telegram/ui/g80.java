package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
