package hi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ n9(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sa saVar = this.b.a;
                z5 z5Var = saVar.D0;
                if (z5Var != null) {
                    z5Var.c(false);
                }
                if (saVar.R1 && saVar.S1 && saVar.C0 != null) {
                    saVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(saVar.C0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                this.b.a.J(1, true);
                break;
            case 2:
                this.b.a.J(1, true);
                break;
            default:
                this.b.a.J(1, true);
                break;
        }
    }
}
