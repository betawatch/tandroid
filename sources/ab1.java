// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ab1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CameraController b;
    public final /* synthetic */ CameraSession c;

    public /* synthetic */ ab1(CameraController cameraController, CameraSession cameraSession, byte b) {
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
