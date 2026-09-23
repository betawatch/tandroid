package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class og0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;
    public final /* synthetic */ fg0 c;

    public /* synthetic */ og0(int i10, fg0 fg0Var, pg0 pg0Var) {
        this.a = i10;
        this.b = pg0Var;
        this.c = fg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        fg0 fg0Var = this.c;
        pg0 pg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = fg0.E;
                fg0Var.a();
                AndroidUtilities.runOnUIThread(new og0(1, fg0Var, pg0Var), 150L);
                break;
            default:
                qg0 qg0Var = pg0Var.a;
                qg0Var.h(null);
                RadialProgressView radialProgressView = qg0Var.V.N.d;
                RadialProgressView radialProgressView2 = fg0Var.h.d;
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
