package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController) this.c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.b);
                break;
            default:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) this.c;
                p70 p70Var = (p70) this.d;
                n4Var.e0.J.c(0.0f, true);
                p70Var.p = new org.telegram.ui.e0(n4Var, this.b, 0);
                p70Var.Z();
                break;
        }
    }
}
