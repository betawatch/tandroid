package org.telegram.messenger.camera;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraController b;
    public final /* synthetic */ CameraSession c;

    public /* synthetic */ h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.a = i7;
        this.b = cameraController;
        this.c = cameraSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$stopPreview$8(this.c);
                break;
            default:
                this.b.lambda$startPreview$7(this.c);
                break;
        }
    }
}
