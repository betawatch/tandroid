// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CameraController b;
    public final /* synthetic */ CameraSession c;

    public /* synthetic */ aa1(CameraController cameraController, CameraSession cameraSession, byte b) {
        this.a = b;
        this.b = cameraController;
        this.c = cameraSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CameraSession cameraSession = this.c;
        CameraController cameraController = this.b;
        switch (b) {
            case 0:
                cameraController.lambda$stopPreview$8(cameraSession);
                break;
            default:
                cameraController.lambda$startPreview$7(cameraSession);
                break;
        }
    }
}
