package jg;

import org.telegram.ui.iu;
import org.telegram.ui.sz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                sz szVar = h0Var.A0;
                if (szVar != null) {
                    ((iu) szVar).j(false, null, h0Var.y0, h0Var.z0);
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
