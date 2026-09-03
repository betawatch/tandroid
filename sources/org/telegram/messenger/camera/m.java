package org.telegram.messenger.camera;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;

    public /* synthetic */ m(CameraView cameraView, int i10) {
        this.a = i10;
        this.b = cameraView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$resetCamera$4();
                break;
            case 1:
                this.b.lambda$new$7();
                break;
            case 2:
                this.b.lambda$toggleDual$2();
                break;
            case 3:
                this.b.lambda$switchCamera$3();
                break;
            case 4:
                this.b.lambda$onSurfaceTextureDestroyed$5();
                break;
            case 5:
                this.b.onSurfaceTextureUpdatedInternal();
                break;
            default:
                this.b.lambda$enableDualInternal$0();
                break;
        }
    }
}
