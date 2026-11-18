package org.telegram.messenger.camera;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
