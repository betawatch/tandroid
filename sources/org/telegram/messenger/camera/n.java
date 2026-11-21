package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ CameraView.CameraGLThread c;

    public /* synthetic */ n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.a = i7;
        this.b = cameraView;
        this.c = cameraGLThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$createCamera$10(this.c);
                break;
            default:
                this.b.lambda$createCamera$8(this.c);
                break;
        }
    }
}
