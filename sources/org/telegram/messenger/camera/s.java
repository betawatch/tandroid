package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
