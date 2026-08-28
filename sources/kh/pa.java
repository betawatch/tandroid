package kh;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra b;

    public /* synthetic */ pa(ra raVar, int i9) {
        this.a = i9;
        this.b = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wb wbVar = this.b.a;
                v6 v6Var = wbVar.y0;
                if (v6Var != null) {
                    v6Var.c(false);
                }
                if (wbVar.M1 && wbVar.N1 && wbVar.x0 != null) {
                    wbVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(wbVar.x0.getCameraSessionRecording(), false, false);
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
