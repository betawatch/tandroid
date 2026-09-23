package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d80 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ e80 b;

    public d80(e80 e80Var, String str) {
        this.b = e80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        e80 e80Var = this.b;
        try {
            e80Var.f.cancel();
            e80Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new c80(this, this.a, 0));
    }
}
