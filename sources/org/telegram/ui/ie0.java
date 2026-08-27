package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ie0 extends TimerTask {
    public final /* synthetic */ je0 a;

    public ie0(je0 je0Var) {
        this.a = je0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.J == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r00(this, 22));
    }
}
