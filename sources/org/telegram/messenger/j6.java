package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
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
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.c;
                l80 l80Var = (l80) this.d;
                j4Var.h0.M.c(0.0f, true);
                l80Var.p = new org.telegram.ui.b0(j4Var, this.b, 0);
                l80Var.Z();
                break;
        }
    }
}
