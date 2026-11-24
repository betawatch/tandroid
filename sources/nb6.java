// default package

import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class nb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ nb6(LocationSharingService locationSharingService, byte b) {
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
                Utilities.d.c(new ql3((byte) 25));
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
