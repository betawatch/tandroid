package org.telegram.messenger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
