package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView b;
    public final /* synthetic */ CameraView.CameraGLThread c;

    public /* synthetic */ m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
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
