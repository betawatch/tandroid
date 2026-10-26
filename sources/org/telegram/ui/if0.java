package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class if0 extends TimerTask {
    public final /* synthetic */ jf0 a;

    public if0(jf0 jf0Var) {
        this.a = jf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new p00(this, 26));
    }
}
