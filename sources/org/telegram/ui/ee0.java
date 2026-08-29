package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ee0 extends TimerTask {
    public final /* synthetic */ fe0 a;

    public ee0(fe0 fe0Var) {
        this.a = fe0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.J == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new q00(this, 22));
    }
}
