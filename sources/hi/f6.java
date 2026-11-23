package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ i6 a;

    public /* synthetic */ f6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        i6 i6Var = this.a;
        h6 h6Var = i6Var.a;
        if (i6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(h6Var.getCameraSessionObject(), i6Var.b, false, new f6(i6Var), new e6(i6Var, 1), h6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        i6 i6Var = this.a;
        i6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(i6Var.h);
        if (i6Var.y) {
            return;
        }
        if (j3 <= 1000) {
            i6Var.a(false);
            return;
        }
        i6Var.a.destroy(true, null);
        fi.b0 b0Var = i6Var.n;
        if (b0Var != null) {
            b0Var.a(i6Var.b, str, Long.valueOf(j3));
        }
    }
}
