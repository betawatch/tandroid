package fg;

import org.telegram.ui.q10;
import org.telegram.ui.yv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                q10 q10Var = h0Var.A0;
                if (q10Var != null) {
                    ((yv) q10Var).i(false, null, h0Var.y0, h0Var.z0);
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
