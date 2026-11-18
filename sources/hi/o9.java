package hi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ o9(q9 q9Var, int i7) {
        this.a = i7;
        this.b = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ta taVar = this.b.a;
                a6 a6Var = taVar.D0;
                if (a6Var != null) {
                    a6Var.c(false);
                }
                if (taVar.R1 && taVar.S1 && taVar.C0 != null) {
                    taVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(taVar.C0.getCameraSessionRecording(), false, false);
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
