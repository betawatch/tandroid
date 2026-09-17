package di;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
