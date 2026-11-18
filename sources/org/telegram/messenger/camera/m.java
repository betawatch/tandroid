package org.telegram.messenger.camera;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;

    public /* synthetic */ m(CameraView cameraView, int i7) {
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
