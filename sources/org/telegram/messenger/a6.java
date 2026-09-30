package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a80;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                a80 a80Var = (a80) this.d;
                i4Var.h0.M.c(0.0f, true);
                a80Var.p = new org.telegram.ui.c0(i4Var, this.b, 0);
                a80Var.Z();
                break;
        }
    }
}
