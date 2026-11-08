package jg;

import org.telegram.ui.fu;
import org.telegram.ui.pz;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ w(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                pz pzVar = h0Var.A0;
                if (pzVar != null) {
                    ((fu) pzVar).j(false, null, h0Var.y0, h0Var.z0);
                    break;
                }
                break;
            default:
                e0 e0Var = e0.d;
                h0 h0Var2 = this.b;
                h0Var2.c = e0Var;
                h0Var2.I.clear();
                int i7 = h0Var2.F0;
                if (i7 >= 0 && i7 < h0Var2.b()) {
                    h0Var2.g(h0Var2.F0);
                }
                h0Var2.P();
                break;
        }
    }
}
