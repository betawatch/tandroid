package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ b7 a;

    public /* synthetic */ y6(b7 b7Var) {
        this.a = b7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        b7 b7Var = this.a;
        a7 a7Var = b7Var.a;
        if (b7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(a7Var.getCameraSessionObject(), b7Var.b, false, new y6(b7Var), new x6(b7Var, 1), a7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        b7 b7Var = this.a;
        b7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(b7Var.h);
        if (b7Var.x) {
            return;
        }
        if (j10 <= 1000) {
            b7Var.a(false);
            return;
        }
        b7Var.a.destroy(true, null);
        di.c0 c0Var = b7Var.n;
        if (c0Var != null) {
            c0Var.run(b7Var.b, str, Long.valueOf(j10));
        }
    }
}
