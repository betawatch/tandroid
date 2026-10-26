package fi;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma b;

    public /* synthetic */ ka(ma maVar, int i10) {
        this.a = i10;
        this.b = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb sbVar = this.b.a;
                s6 s6Var = sbVar.C0;
                if (s6Var != null) {
                    s6Var.c(false);
                }
                if (sbVar.Q1 && sbVar.R1 && sbVar.B0 != null) {
                    sbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(sbVar.B0.getCameraSessionRecording(), false, false);
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
