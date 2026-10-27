package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class he0 extends TimerTask {
    public final /* synthetic */ ie0 a;

    public he0(ie0 ie0Var) {
        this.a = ie0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r00(this, 24));
    }
}
