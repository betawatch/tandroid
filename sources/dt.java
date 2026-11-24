// default package

import org.telegram.messenger.MediaController;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ gk7 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dt(gk7 gk7Var, Object obj, float f, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.d = obj;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                o oVar = (o) gk7Var;
                cs5 cs5Var = (cs5) obj;
                oVar.i0.N.c(true, 0.0f);
                cs5Var.p = new kt(oVar, f, (byte) 0);
                cs5Var.a0();
                break;
            default:
                MediaController mediaController = (MediaController) gk7Var;
                k27 k27Var = (k27) obj;
                String[] strArr = MediaController.W1;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.G(k27Var)) {
                        mediaController.h0(mediaController.v0, f);
                    }
                    mediaController.j0.g0();
                    break;
                }
                break;
        }
    }
}
