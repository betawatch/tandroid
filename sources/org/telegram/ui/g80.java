package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
