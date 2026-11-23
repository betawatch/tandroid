package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ pd0 c;

    public /* synthetic */ be0(int i7, f fVar, pd0 pd0Var) {
        this.a = i7;
        this.b = fVar;
        this.c = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        pd0 pd0Var = this.c;
        f fVar = this.b;
        switch (i7) {
            case 0:
                int i10 = pd0.G;
                pd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, pd0Var), 150L);
                break;
            default:
                ce0 ce0Var = (ce0) fVar.b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.h0.O.d;
                RadialProgressView radialProgressView2 = pd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                break;
        }
    }
}
