package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ we0 c;

    public /* synthetic */ ff0(int i10, e eVar, we0 we0Var) {
        this.a = i10;
        this.b = eVar;
        this.c = we0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        we0 we0Var = this.c;
        e eVar = this.b;
        switch (i10) {
            case 0:
                int i11 = we0.F;
                we0Var.a();
                org.telegram.messenger.i0.h3(new ff0(1, eVar, we0Var), 150L);
                break;
            default:
                gf0 gf0Var = (gf0) eVar.b;
                gf0Var.h(null);
                RadialProgressView radialProgressView = gf0Var.a0.N.d;
                RadialProgressView radialProgressView2 = we0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                break;
        }
    }
}
