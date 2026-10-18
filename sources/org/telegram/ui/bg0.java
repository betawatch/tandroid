package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;
    public final /* synthetic */ sf0 c;

    public /* synthetic */ bg0(int i10, sf0 sf0Var, cg0 cg0Var) {
        this.a = i10;
        this.b = cg0Var;
        this.c = sf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        sf0 sf0Var = this.c;
        cg0 cg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = sf0.E;
                sf0Var.a();
                AndroidUtilities.runOnUIThread(new bg0(1, sf0Var, cg0Var), 150L);
                break;
            default:
                dg0 dg0Var = cg0Var.a;
                dg0Var.h(null);
                RadialProgressView radialProgressView = dg0Var.V.N.d;
                RadialProgressView radialProgressView2 = sf0Var.h.d;
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
