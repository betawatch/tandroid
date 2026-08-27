package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraView.CameraGLThread b;

    public /* synthetic */ p(CameraView.CameraGLThread cameraGLThread, int i10) {
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
