package fi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ l6 a;

    public /* synthetic */ i6(l6 l6Var) {
        this.a = l6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        l6 l6Var = this.a;
        k6 k6Var = l6Var.a;
        if (l6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(k6Var.getCameraSessionObject(), l6Var.b, false, new i6(l6Var), new h6(l6Var, 1), k6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        l6 l6Var = this.a;
        l6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(l6Var.h);
        if (l6Var.y) {
            return;
        }
        if (j3 <= 1000) {
            l6Var.a(false);
            return;
        }
        l6Var.a.destroy(true, null);
        di.b0 b0Var = l6Var.n;
        if (b0Var != null) {
            b0Var.a(l6Var.b, str, Long.valueOf(j3));
        }
    }
}
