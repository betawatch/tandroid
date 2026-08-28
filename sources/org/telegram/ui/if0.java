package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class if0 extends TimerTask {
    public final /* synthetic */ jf0 a;

    public if0(jf0 jf0Var) {
        this.a = jf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new o00(this, 24));
    }
}
