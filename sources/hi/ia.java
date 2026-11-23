package hi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka b;

    public /* synthetic */ ia(ka kaVar, int i7) {
        this.a = i7;
        this.b = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nb nbVar = this.b.a;
                j6 j6Var = nbVar.D0;
                if (j6Var != null) {
                    j6Var.c(false);
                }
                if (nbVar.R1 && nbVar.S1 && nbVar.C0 != null) {
                    nbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(nbVar.C0.getCameraSessionRecording(), false, false);
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
