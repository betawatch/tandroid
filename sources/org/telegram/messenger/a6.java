package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                b80 b80Var = (b80) this.d;
                i4Var.h0.M.c(0.0f, true);
                b80Var.p = new org.telegram.ui.c0(i4Var, this.b, 0);
                b80Var.Z();
                break;
        }
    }
}
