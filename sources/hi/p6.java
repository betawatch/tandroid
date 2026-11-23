package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ s6 a;

    public /* synthetic */ p6(s6 s6Var) {
        this.a = s6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        s6 s6Var = this.a;
        r6 r6Var = s6Var.a;
        if (s6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(r6Var.getCameraSessionObject(), s6Var.b, false, new p6(s6Var), new o6(s6Var, 1), r6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        s6 s6Var = this.a;
        s6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(s6Var.h);
        if (s6Var.y) {
            return;
        }
        if (j3 <= 1000) {
            s6Var.a(false);
            return;
        }
        s6Var.a.destroy(true, null);
        fi.b0 b0Var = s6Var.n;
        if (b0Var != null) {
            b0Var.a(s6Var.b, str, Long.valueOf(j3));
        }
    }
}
