package ci;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb b;

    public /* synthetic */ db(fb fbVar, int i10) {
        this.a = i10;
        this.b = fbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kc kcVar = this.b.a;
                f7 f7Var = kcVar.C0;
                if (f7Var != null) {
                    f7Var.c(false);
                }
                if (kcVar.Q1 && kcVar.R1 && kcVar.B0 != null) {
                    kcVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(kcVar.B0.getCameraSessionRecording(), false, false);
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
