package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ CameraView.CameraGLThread c;

    public /* synthetic */ n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.a = i10;
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
