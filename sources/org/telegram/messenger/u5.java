package org.telegram.messenger;

import org.telegram.messenger.LocationController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ LocationController.SharingLocationInfo c;

    public /* synthetic */ u5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.a = i10;
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
