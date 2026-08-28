package org.telegram.messenger;

import org.telegram.messenger.LocationController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ LocationController.SharingLocationInfo c;

    public /* synthetic */ n5(int i9, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.a = i9;
        this.b = locationController;
        this.c = sharingLocationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$broadcastLastKnownLocation$6(this.c);
                break;
            case 1:
                this.b.lambda$removeSharingLocation$20(this.c);
                break;
            default:
                this.b.lambda$update$8(this.c);
                break;
        }
    }
}
