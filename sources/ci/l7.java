package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ o7 a;

    public /* synthetic */ l7(o7 o7Var) {
        this.a = o7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        o7 o7Var = this.a;
        n7 n7Var = o7Var.a;
        if (o7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(n7Var.getCameraSessionObject(), o7Var.b, false, new l7(o7Var), new k7(o7Var, 1), n7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        o7 o7Var = this.a;
        o7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(o7Var.h);
        if (o7Var.x) {
            return;
        }
        if (j3 <= 1000) {
            o7Var.a(false);
            return;
        }
        o7Var.a.destroy(true, null);
        ai.q0 q0Var = o7Var.n;
        if (q0Var != null) {
            q0Var.run(o7Var.b, str, Long.valueOf(j3));
        }
    }
}
