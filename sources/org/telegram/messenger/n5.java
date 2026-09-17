package org.telegram.messenger;

import org.telegram.messenger.LocationController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ LocationController.SharingLocationInfo c;

    public /* synthetic */ n5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
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
