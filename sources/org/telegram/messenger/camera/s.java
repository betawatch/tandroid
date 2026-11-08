package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CameraView.VideoRecorder) this.b).lambda$handleStopRecording$0((CountDownLatch) this.c);
                break;
            case 1:
                ((Camera2Session) this.b).lambda$open$1((SurfaceTexture) this.c);
                break;
            case 2:
                ((CameraController) this.b).lambda$initCamera$2((Runnable) this.c);
                break;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.b, (CameraSession) this.c);
                break;
            default:
                ((CameraView) this.b).lambda$enableDualInternal$1((Handler) this.c);
                break;
        }
    }
}
