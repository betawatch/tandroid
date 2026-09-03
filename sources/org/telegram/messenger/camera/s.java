package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
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
