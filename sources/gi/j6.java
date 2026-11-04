package gi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ m6 a;

    public /* synthetic */ j6(m6 m6Var) {
        this.a = m6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        m6 m6Var = this.a;
        l6 l6Var = m6Var.a;
        if (m6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(l6Var.getCameraSessionObject(), m6Var.b, false, new j6(m6Var), new i6(m6Var, 1), l6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        m6 m6Var = this.a;
        m6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(m6Var.h);
        if (m6Var.y) {
            return;
        }
        if (j10 <= 1000) {
            m6Var.a(false);
            return;
        }
        m6Var.a.destroy(true, null);
        ei.d0 d0Var = m6Var.n;
        if (d0Var != null) {
            d0Var.a(m6Var.b, str, Long.valueOf(j10));
        }
    }
}
