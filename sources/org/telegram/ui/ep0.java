package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq0 b;

    public /* synthetic */ ep0(gq0 gq0Var, int i10) {
        this.a = i10;
        this.b = gq0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                gq0 gq0Var = this.b;
                gq0Var.r = false;
                gq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    gq0Var.x0();
                    gq0Var.finishFragment();
                    gq0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                di.h1 h1Var = this.b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
