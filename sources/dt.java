// default package

import org.telegram.messenger.MediaController;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fn7 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dt(fn7 fn7Var, Object obj, float f, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.d = obj;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                o oVar = (o) fn7Var;
                fu5 fu5Var = (fu5) obj;
                oVar.i0.N.c(true, 0.0f);
                fu5Var.p = new jt(oVar, f, (byte) 0);
                fu5Var.a0();
                break;
            default:
                MediaController mediaController = (MediaController) fn7Var;
                r47 r47Var = (r47) obj;
                String[] strArr = MediaController.W1;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.K(r47Var)) {
                        mediaController.k0(mediaController.v0, f);
                    }
                    mediaController.j0.g0();
                    break;
                }
                break;
        }
    }
}
