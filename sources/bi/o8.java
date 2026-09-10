package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ r8 a;

    public /* synthetic */ o8(r8 r8Var) {
        this.a = r8Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        r8 r8Var = this.a;
        q8 q8Var = r8Var.a;
        if (r8Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(q8Var.getCameraSessionObject(), r8Var.b, false, new o8(r8Var), new n8(r8Var, 1), q8Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        r8 r8Var = this.a;
        r8Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(r8Var.h);
        if (r8Var.x) {
            return;
        }
        if (j3 <= 1000) {
            r8Var.a(false);
            return;
        }
        r8Var.a.destroy(true, null);
        od odVar = r8Var.n;
        if (odVar != null) {
            odVar.run(r8Var.b, str, Long.valueOf(j3));
        }
    }
}
