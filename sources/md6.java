// default package

import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class md6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ md6(LocationSharingService locationSharingService, byte b) {
        this.a = b;
        this.b = locationSharingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LocationSharingService locationSharingService = this.b;
        switch (b) {
            case 0:
                int i = LocationSharingService.d;
                locationSharingService.b.postDelayed(locationSharingService.c, 1000L);
                Utilities.d.c(new bn3((byte) 25));
                break;
            default:
                if (!LocationSharingService.a().isEmpty()) {
                    locationSharingService.c(true);
                    break;
                } else {
                    locationSharingService.stopSelf();
                    break;
                }
        }
    }
}
