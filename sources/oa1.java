// default package

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class oa1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CameraView.CameraGLThread b;

    public /* synthetic */ oa1(CameraView.CameraGLThread cameraGLThread, byte b) {
        this.a = b;
        this.b = cameraGLThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CameraView.CameraGLThread cameraGLThread = this.b;
        switch (b) {
            case 0:
                cameraGLThread.lambda$onDraw$4();
                break;
            case 1:
                cameraGLThread.lambda$onDraw$5();
                break;
            case 2:
                cameraGLThread.lambda$new$0();
                break;
            case 3:
                cameraGLThread.lambda$new$1();
                break;
            case 4:
                cameraGLThread.lambda$new$2();
                break;
            default:
                cameraGLThread.lambda$new$3();
                break;
        }
    }
}
