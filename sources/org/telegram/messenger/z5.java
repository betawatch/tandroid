package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i9) {
        this.a = i9;
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
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.c;
                x60 x60Var = (x60) this.d;
                l4Var.d0.I.c(0.0f, true);
                x60Var.p = new org.telegram.ui.d0(l4Var, this.b, 0);
                x60Var.Z();
                break;
        }
    }
}
