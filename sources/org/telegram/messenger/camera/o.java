package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView.CameraGLThread b;

    public /* synthetic */ o(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.a = i10;
        this.b = cameraGLThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onDraw$4();
                break;
            case 1:
                this.b.lambda$onDraw$5();
                break;
            case 2:
                this.b.lambda$new$0();
                break;
            case 3:
                this.b.lambda$new$1();
                break;
            case 4:
                this.b.lambda$new$2();
                break;
            default:
                this.b.lambda$new$3();
                break;
        }
    }
}
