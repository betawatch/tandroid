package nh;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ aa(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gb gbVar = this.b.a;
                j6 j6Var = gbVar.y0;
                if (j6Var != null) {
                    j6Var.c(false);
                }
                if (gbVar.M1 && gbVar.N1 && gbVar.x0 != null) {
                    gbVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(gbVar.x0.getCameraSessionRecording(), false, false);
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
