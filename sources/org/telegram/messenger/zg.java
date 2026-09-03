package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter b;

    public /* synthetic */ zg(NotificationCenter notificationCenter, int i10) {
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
