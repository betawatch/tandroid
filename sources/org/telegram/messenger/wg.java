package org.telegram.messenger;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter b;

    public /* synthetic */ wg(NotificationCenter notificationCenter, int i10) {
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
