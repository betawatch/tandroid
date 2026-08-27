package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ p70 b;

    public o70(p70 p70Var, String str) {
        this.b = p70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        p70 p70Var = this.b;
        try {
            p70Var.f.cancel();
            p70Var.f = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new n70(this, this.a, 0));
    }
}
