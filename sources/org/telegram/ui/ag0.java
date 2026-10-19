package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;
    public final /* synthetic */ rf0 c;

    public /* synthetic */ ag0(int i10, rf0 rf0Var, bg0 bg0Var) {
        this.a = i10;
        this.b = bg0Var;
        this.c = rf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        rf0 rf0Var = this.c;
        bg0 bg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = rf0.E;
                rf0Var.a();
                AndroidUtilities.runOnUIThread(new ag0(1, rf0Var, bg0Var), 150L);
                break;
            default:
                cg0 cg0Var = bg0Var.a;
                cg0Var.h(null);
                RadialProgressView radialProgressView = cg0Var.V.N.d;
                RadialProgressView radialProgressView2 = rf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.y = radialProgressView2.y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                break;
        }
    }
}
