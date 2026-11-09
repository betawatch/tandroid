package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                Utilities.d.c(new rc(3));
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
