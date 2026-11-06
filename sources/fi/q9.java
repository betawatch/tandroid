package fi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ q9(s9 s9Var, int i7) {
        this.a = i7;
        this.b = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                va vaVar = this.b.a;
                c6 c6Var = vaVar.C0;
                if (c6Var != null) {
                    c6Var.c(false);
                }
                if (vaVar.Q1 && vaVar.R1 && vaVar.B0 != null) {
                    vaVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(vaVar.B0.getCameraSessionRecording(), false, false);
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
