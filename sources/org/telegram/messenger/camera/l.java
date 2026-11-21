package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ CameraView.CameraGLThread d;

    public /* synthetic */ l(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.b = cameraView;
        this.c = i7;
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

    public /* synthetic */ l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.b = cameraView;
        this.d = cameraGLThread;
        this.c = i7;
    }
}
