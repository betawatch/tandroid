package org.telegram.messenger.camera;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraController b;
    public final /* synthetic */ CameraSession c;

    public /* synthetic */ h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.a = i10;
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
