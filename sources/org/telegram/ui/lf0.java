package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lf0 extends TimerTask {
    public final /* synthetic */ mf0 a;

    public lf0(mf0 mf0Var) {
        this.a = mf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 26));
    }
}
