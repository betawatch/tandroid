package ci;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                oc ocVar = this.b.a;
                h7 h7Var = ocVar.C0;
                if (h7Var != null) {
                    h7Var.c(false);
                }
                if (ocVar.Q1 && ocVar.R1 && ocVar.B0 != null) {
                    ocVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(ocVar.B0.getCameraSessionRecording(), false, false);
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
