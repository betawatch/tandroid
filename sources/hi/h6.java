package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ k6 a;

    public /* synthetic */ h6(k6 k6Var) {
        this.a = k6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        k6 k6Var = this.a;
        j6 j6Var = k6Var.a;
        if (k6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(j6Var.getCameraSessionObject(), k6Var.b, false, new h6(k6Var), new g6(k6Var, 1), j6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        k6 k6Var = this.a;
        k6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(k6Var.h);
        if (k6Var.y) {
            return;
        }
        if (j3 <= 1000) {
            k6Var.a(false);
            return;
        }
        k6Var.a.destroy(true, null);
        fi.b0 b0Var = k6Var.n;
        if (b0Var != null) {
            b0Var.a(k6Var.b, str, Long.valueOf(j3));
        }
    }
}
