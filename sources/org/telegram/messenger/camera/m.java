package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ CameraView.CameraGLThread c;

    public /* synthetic */ m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
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
