package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ ko0(lp0 lp0Var, int i10) {
        this.a = i10;
        this.b = lp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                lp0 lp0Var = this.b;
                lp0Var.r = false;
                lp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    lp0Var.x0();
                    lp0Var.finishFragment();
                    lp0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ei.h1 h1Var = this.b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
