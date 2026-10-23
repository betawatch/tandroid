package org.telegram.messenger;

import org.telegram.messenger.LocationController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ LocationController.SharingLocationInfo c;

    public /* synthetic */ t5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
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
