package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ n7 a;

    public /* synthetic */ k7(n7 n7Var) {
        this.a = n7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        n7 n7Var = this.a;
        m7 m7Var = n7Var.a;
        if (n7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(m7Var.getCameraSessionObject(), n7Var.b, false, new k7(n7Var), new j7(n7Var, 1), m7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        n7 n7Var = this.a;
        n7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(n7Var.h);
        if (n7Var.x) {
            return;
        }
        if (j10 <= 1000) {
            n7Var.a(false);
            return;
        }
        n7Var.a.destroy(true, null);
        bi.j0 j0Var = n7Var.n;
        if (j0Var != null) {
            j0Var.run(n7Var.b, str, Long.valueOf(j10));
        }
    }
}
