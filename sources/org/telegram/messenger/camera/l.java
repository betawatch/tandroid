package org.telegram.messenger.camera;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;

    public /* synthetic */ l(CameraView cameraView, int i7) {
        this.a = i7;
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
