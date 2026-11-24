// default package

import org.telegram.messenger.MediaController;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ jm7 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eu(jm7 jm7Var, Object obj, float f, byte b) {
        this.a = b;
        this.c = jm7Var;
        this.d = obj;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                o oVar = (o) jm7Var;
                bu5 bu5Var = (bu5) obj;
                oVar.i0.N.c(true, 0.0f);
                bu5Var.p = new ku(oVar, f, (byte) 0);
                bu5Var.a0();
                break;
            default:
                MediaController mediaController = (MediaController) jm7Var;
                k47 k47Var = (k47) obj;
                String[] strArr = MediaController.W1;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.G(k47Var)) {
                        mediaController.h0(mediaController.v0, f);
                    }
                    mediaController.j0.g0();
                    break;
                }
                break;
        }
    }
}
