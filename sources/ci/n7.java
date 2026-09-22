package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        ai.q0 q0Var = q7Var.n;
        if (q0Var != null) {
            q0Var.run(q7Var.b, str, Long.valueOf(j3));
        }
    }
}
