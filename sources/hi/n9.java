package hi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
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
                b6 b6Var = saVar.D0;
                if (b6Var != null) {
                    b6Var.c(false);
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
