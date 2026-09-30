package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
