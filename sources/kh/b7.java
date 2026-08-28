package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ e7 a;

    public /* synthetic */ b7(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        e7 e7Var = this.a;
        d7 d7Var = e7Var.a;
        if (e7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(d7Var.getCameraSessionObject(), e7Var.b, false, new b7(e7Var), new a7(e7Var, 1), d7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        e7 e7Var = this.a;
        e7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(e7Var.h);
        if (e7Var.x) {
            return;
        }
        if (j10 <= 1000) {
            e7Var.a(false);
            return;
        }
        e7Var.a.destroy(true, null);
        ih.b0 b0Var = e7Var.n;
        if (b0Var != null) {
            b0Var.run(e7Var.b, str, Long.valueOf(j10));
        }
    }
}
