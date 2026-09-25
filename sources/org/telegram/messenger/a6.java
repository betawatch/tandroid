package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController) this.c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.b);
                break;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                y70 y70Var = (y70) this.d;
                i4Var.h0.M.c(0.0f, true);
                y70Var.p = new org.telegram.ui.c0(i4Var, this.b, 0);
                y70Var.Z();
                break;
        }
    }
}
