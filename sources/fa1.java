// default package

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CameraView b;

    public /* synthetic */ fa1(CameraView cameraView, byte b) {
        this.a = b;
        this.b = cameraView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CameraView cameraView = this.b;
        switch (b) {
            case 0:
                cameraView.lambda$resetCamera$4();
                break;
            case 1:
                cameraView.lambda$new$7();
                break;
            case 2:
                cameraView.lambda$toggleDual$2();
                break;
            case 3:
                cameraView.lambda$switchCamera$3();
                break;
            case 4:
                cameraView.lambda$onSurfaceTextureDestroyed$5();
                break;
            case 5:
                cameraView.onSurfaceTextureUpdatedInternal();
                break;
            default:
                cameraView.lambda$enableDualInternal$0();
                break;
        }
    }
}
