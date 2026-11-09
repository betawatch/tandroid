package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ rd0 c;

    public /* synthetic */ ce0(int i7, f fVar, rd0 rd0Var) {
        this.a = i7;
        this.b = fVar;
        this.c = rd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        rd0 rd0Var = this.c;
        f fVar = this.b;
        switch (i7) {
            case 0:
                int i10 = rd0.F;
                rd0Var.a();
                org.telegram.messenger.g0.i3(new ce0(1, fVar, rd0Var), 150L);
                break;
            default:
                de0 de0Var = (de0) fVar.b;
                de0Var.h(null);
                RadialProgressView radialProgressView = de0Var.g0.N.d;
                RadialProgressView radialProgressView2 = rd0Var.h.d;
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
