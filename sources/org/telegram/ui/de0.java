package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ sd0 c;

    public /* synthetic */ de0(int i7, f fVar, sd0 sd0Var) {
        this.a = i7;
        this.b = fVar;
        this.c = sd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        sd0 sd0Var = this.c;
        f fVar = this.b;
        switch (i7) {
            case 0:
                int i10 = sd0.F;
                sd0Var.a();
                org.telegram.messenger.g0.i3(new de0(1, fVar, sd0Var), 150L);
                break;
            default:
                ee0 ee0Var = (ee0) fVar.b;
                ee0Var.h(null);
                RadialProgressView radialProgressView = ee0Var.g0.N.d;
                RadialProgressView radialProgressView2 = sd0Var.h.d;
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
