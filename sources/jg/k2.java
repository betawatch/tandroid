package jg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.ui.Components.h01;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ k2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                t2 t2Var = v2Var.W;
                if (t2Var != null) {
                    if (t2Var.r != null) {
                        MediaController.B().i(v2Var.W.r);
                        b8.G(v2Var.a).b(v2Var.W.b, false);
                        v2Var.W.getClass();
                    }
                    v2Var.W.a();
                    v2Var.W = null;
                }
                v2Var.d0.a();
                v2Var.d0 = null;
                break;
            default:
                v2 v2Var2 = this.b;
                h01 h01Var = v2Var2.S;
                if (h01Var != null) {
                    v2Var2.S = null;
                    v2Var2.removeView(h01Var);
                    break;
                }
                break;
        }
    }
}
