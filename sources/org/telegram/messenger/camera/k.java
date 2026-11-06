package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ CameraView.CameraGLThread d;

    public /* synthetic */ k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
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

    public /* synthetic */ k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.b = cameraView;
        this.d = cameraGLThread;
        this.c = i7;
    }
}
