package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView.CameraGLThread b;

    public /* synthetic */ p(CameraView.CameraGLThread cameraGLThread, int i7) {
        this.a = i7;
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
