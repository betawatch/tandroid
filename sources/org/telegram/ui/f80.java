package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class f80 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ g80 b;

    public f80(g80 g80Var, String str) {
        this.b = g80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        g80 g80Var = this.b;
        try {
            g80Var.f.cancel();
            g80Var.f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.a, 0));
    }
}
