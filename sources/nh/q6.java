package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ t6 a;

    public /* synthetic */ q6(t6 t6Var) {
        this.a = t6Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        t6 t6Var = this.a;
        s6 s6Var = t6Var.a;
        if (t6Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(s6Var.getCameraSessionObject(), t6Var.b, false, new q6(t6Var), new p6(t6Var, 1), s6Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        t6 t6Var = this.a;
        t6Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(t6Var.h);
        if (t6Var.x) {
            return;
        }
        if (j10 <= 1000) {
            t6Var.a(false);
            return;
        }
        t6Var.a.destroy(true, null);
        lh.z zVar = t6Var.n;
        if (zVar != null) {
            zVar.run(t6Var.b, str, Long.valueOf(j10));
        }
    }
}
