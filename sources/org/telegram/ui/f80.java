package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.a, 0));
    }
}
