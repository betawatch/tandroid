package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
