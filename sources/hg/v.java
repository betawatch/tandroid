package hg;

import org.telegram.ui.aw;
import org.telegram.ui.t10;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                t10 t10Var = h0Var.A0;
                if (t10Var != null) {
                    ((aw) t10Var).i(false, null, h0Var.y0, h0Var.z0);
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
