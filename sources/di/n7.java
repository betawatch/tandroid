package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ q7 a;

    public /* synthetic */ n7(q7 q7Var) {
        this.a = q7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        q7 q7Var = this.a;
        p7 p7Var = q7Var.a;
        if (q7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(p7Var.getCameraSessionObject(), q7Var.b, false, new n7(q7Var), new m7(q7Var, 1), p7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        q7 q7Var = this.a;
        q7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(q7Var.h);
        if (q7Var.x) {
            return;
        }
        if (j3 <= 1000) {
            q7Var.a(false);
            return;
        }
        q7Var.a.destroy(true, null);
        bi.j0 j0Var = q7Var.n;
        if (j0Var != null) {
            j0Var.run(q7Var.b, str, Long.valueOf(j3));
        }
    }
}
