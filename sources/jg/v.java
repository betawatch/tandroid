package jg;

import org.telegram.ui.ju;
import org.telegram.ui.tz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ v(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                tz tzVar = h0Var.B0;
                if (tzVar != null) {
                    ((ju) tzVar).j(false, null, h0Var.z0, h0Var.A0);
                    break;
                }
                break;
            default:
                e0 e0Var = e0.d;
                h0 h0Var2 = this.b;
                h0Var2.c = e0Var;
                h0Var2.J.clear();
                int i7 = h0Var2.G0;
                if (i7 >= 0 && i7 < h0Var2.b()) {
                    h0Var2.g(h0Var2.G0);
                }
                h0Var2.P();
                break;
        }
    }
}
