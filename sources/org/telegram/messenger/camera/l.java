package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ CameraView.CameraGLThread d;

    public /* synthetic */ l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.b = cameraView;
        this.c = i10;
        this.d = cameraGLThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$createCamera$12(this.d, this.c);
                break;
            default:
                this.b.lambda$createCamera$9(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.b = cameraView;
        this.d = cameraGLThread;
        this.c = i10;
    }
}
