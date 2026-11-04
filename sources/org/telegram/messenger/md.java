package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ md(LocationSharingService locationSharingService, int i3) {
        this.a = i3;
        this.b = locationSharingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LocationSharingService locationSharingService = this.b;
                locationSharingService.b.postDelayed(locationSharingService.c, 1000L);
                Utilities.d.c(new hc(5));
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
