package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ e7 a;

    public /* synthetic */ b7(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        e7 e7Var = this.a;
        d7 d7Var = e7Var.a;
        if (e7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(d7Var.getCameraSessionObject(), e7Var.b, false, new b7(e7Var), new a7(e7Var, 1), d7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        e7 e7Var = this.a;
        e7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(e7Var.h);
        if (e7Var.x) {
            return;
        }
        if (j10 <= 1000) {
            e7Var.a(false);
            return;
        }
        e7Var.a.destroy(true, null);
        ci.c0 c0Var = e7Var.n;
        if (c0Var != null) {
            c0Var.run(e7Var.b, str, Long.valueOf(j10));
        }
    }
}
