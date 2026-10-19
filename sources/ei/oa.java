package ei;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ oa(qa qaVar, int i10) {
        this.a = i10;
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vb vbVar = this.b.a;
                v6 v6Var = vbVar.C0;
                if (v6Var != null) {
                    v6Var.c(false);
                }
                if (vbVar.Q1 && vbVar.R1 && vbVar.B0 != null) {
                    vbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(vbVar.B0.getCameraSessionRecording(), false, false);
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
