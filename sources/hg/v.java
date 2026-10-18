package hg;

import org.telegram.ui.jv;
import org.telegram.ui.x00;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                x00 x00Var = h0Var.A0;
                if (x00Var != null) {
                    ((jv) x00Var).i(false, null, h0Var.y0, h0Var.z0);
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
