package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ j6 a;

    public /* synthetic */ g6(j6 j6Var) {
        this.a = j6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        j6 j6Var = this.a;
        i6 i6Var = j6Var.a;
        if (j6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(i6Var.getCameraSessionObject(), j6Var.b, false, new g6(j6Var), new f6(j6Var, 1), i6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        j6 j6Var = this.a;
        j6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(j6Var.h);
        if (j6Var.y) {
            return;
        }
        if (j3 <= 1000) {
            j6Var.a(false);
            return;
        }
        j6Var.a.destroy(true, null);
        fi.b0 b0Var = j6Var.n;
        if (b0Var != null) {
            b0Var.a(j6Var.b, str, Long.valueOf(j3));
        }
    }
}
