package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;

    public /* synthetic */ s5(LocationController locationController, int i10) {
        this.a = i10;
        this.b = locationController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onConnected$3();
                break;
            case 1:
                this.b.lambda$setProximityLocation$13();
                break;
            case 2:
                this.b.lambda$new$0();
                break;
            case 3:
                this.b.lambda$removeAllLocationSharings$23();
                break;
            case 4:
                this.b.lambda$removeAllLocationSharings$24();
                break;
            case 5:
                this.b.lambda$cleanup$9();
                break;
            default:
                this.b.lambda$loadSharingLocations$17();
                break;
        }
    }
}
