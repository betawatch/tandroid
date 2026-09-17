package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.a, 0));
    }
}
