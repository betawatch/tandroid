package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ sd(LocationSharingService locationSharingService, int i7) {
        this.a = i7;
        this.b = locationSharingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LocationSharingService locationSharingService = this.b;
                locationSharingService.b.postDelayed(locationSharingService.c, 1000L);
                Utilities.d.c(new c6(7));
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
