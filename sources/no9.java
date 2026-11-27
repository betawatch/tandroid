// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class no9 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ qo9 a;

    public /* synthetic */ no9(qo9 qo9Var) {
        this.a = qo9Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        qo9 qo9Var = this.a;
        oo9 oo9Var = qo9Var.a;
        if (qo9Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(oo9Var.getCameraSessionObject(), qo9Var.b, false, new no9(qo9Var), new mo9(qo9Var, (byte) 1), oo9Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public final void onFinishVideoRecording(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        qo9 qo9Var = this.a;
        qo9Var.d = currentTimeMillis;
        hl.r(qo9Var.h);
        if (qo9Var.y) {
            return;
        }
        if (j <= 1000) {
            qo9Var.a(false);
            return;
        }
        qo9Var.a.destroy(true, null);
        qo0 qo0Var = qo9Var.n;
        if (qo0Var != null) {
            qo0Var.a(qo9Var.b, str, Long.valueOf(j));
        }
    }
}
