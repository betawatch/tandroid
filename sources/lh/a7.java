package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ d7 a;

    public /* synthetic */ a7(d7 d7Var) {
        this.a = d7Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        d7 d7Var = this.a;
        c7 c7Var = d7Var.a;
        if (d7Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(c7Var.getCameraSessionObject(), d7Var.b, false, new a7(d7Var), new z6(d7Var, 1), c7Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        d7 d7Var = this.a;
        d7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(d7Var.h);
        if (d7Var.x) {
            return;
        }
        if (j10 <= 1000) {
            d7Var.a(false);
            return;
        }
        d7Var.a.destroy(true, null);
        jh.z zVar = d7Var.n;
        if (zVar != null) {
            zVar.run(d7Var.b, str, Long.valueOf(j10));
        }
    }
}
