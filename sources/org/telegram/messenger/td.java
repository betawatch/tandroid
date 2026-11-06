package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ td(LocationSharingService locationSharingService, int i7) {
        this.a = i7;
        this.b = locationSharingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LocationSharingService locationSharingService = this.b;
                locationSharingService.b.postDelayed(locationSharingService.c, 1000L);
                Utilities.d.c(new pd(1));
                break;
            default:
                LocationSharingService locationSharingService2 = this.b;
                if (!LocationSharingService.a().isEmpty()) {
                    locationSharingService2.c(true);
                    break;
                } else {
                    locationSharingService2.stopSelf();
                    break;
                }
        }
    }
}
