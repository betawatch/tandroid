package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
