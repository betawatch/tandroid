// default package

import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
