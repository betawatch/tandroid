package gg;

import org.telegram.ui.n10;
import org.telegram.ui.vv;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ v(h0 h0Var, int i10) {
        this.a = i10;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                n10 n10Var = h0Var.A0;
                if (n10Var != null) {
                    ((vv) n10Var).i(false, null, h0Var.y0, h0Var.z0);
                    break;
                }
                break;
            default:
                h0 h0Var2 = this.b;
                h0Var2.getClass();
                h0Var2.c = e0.d;
                h0Var2.I.clear();
                int i10 = h0Var2.F0;
                if (i10 >= 0 && i10 < h0Var2.h()) {
                    h0Var2.m(h0Var2.F0);
                }
                h0Var2.Q();
                break;
        }
    }
}
