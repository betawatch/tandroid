package di;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class hb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb b;

    public /* synthetic */ hb(jb jbVar, int i10) {
        this.a = i10;
        this.b = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc pcVar = this.b.a;
                h7 h7Var = pcVar.C0;
                if (h7Var != null) {
                    h7Var.c(false);
                }
                if (pcVar.Q1 && pcVar.R1 && pcVar.B0 != null) {
                    pcVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(pcVar.B0.getCameraSessionRecording(), false, false);
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
