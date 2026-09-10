package bi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc b;

    public /* synthetic */ qc(sc scVar, int i10) {
        this.a = i10;
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ce ceVar = this.b.a;
                i8 i8Var = ceVar.C0;
                if (i8Var != null) {
                    i8Var.c(false);
                }
                if (ceVar.Q1 && ceVar.R1 && ceVar.B0 != null) {
                    ceVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(ceVar.B0.getCameraSessionRecording(), false, false);
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
