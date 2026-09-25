package ci;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ eb(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lc lcVar = this.b.a;
                f7 f7Var = lcVar.C0;
                if (f7Var != null) {
                    f7Var.c(false);
                }
                if (lcVar.Q1 && lcVar.R1 && lcVar.B0 != null) {
                    lcVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(lcVar.B0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                this.b.a.K(1, true);
                break;
            case 2:
                this.b.a.K(1, true);
                break;
            default:
                this.b.a.K(1, true);
                break;
        }
    }
}
