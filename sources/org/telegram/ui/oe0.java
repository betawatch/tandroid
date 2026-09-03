package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oe0 extends TimerTask {
    public final /* synthetic */ pe0 a;

    public oe0(pe0 pe0Var) {
        this.a = pe0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.K == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 22));
    }
}
