package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter b;

    public /* synthetic */ xg(NotificationCenter notificationCenter, int i10) {
        this.a = i10;
        this.b = notificationCenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkForExpiredNotifications$0();
                break;
            default:
                this.b.checkForExpiredNotifications();
                break;
        }
    }
}
