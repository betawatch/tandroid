package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fe0 extends TimerTask {
    public final /* synthetic */ ge0 a;

    public fe0(ge0 ge0Var) {
        this.a = ge0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.J == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new o00(this, 22));
    }
}
