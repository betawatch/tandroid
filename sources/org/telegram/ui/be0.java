package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ qd0 c;

    public /* synthetic */ be0(int i7, f fVar, qd0 qd0Var) {
        this.a = i7;
        this.b = fVar;
        this.c = qd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qd0 qd0Var = this.c;
        f fVar = this.b;
        switch (i7) {
            case 0:
                int i10 = qd0.G;
                qd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, qd0Var), 150L);
                break;
            default:
                ce0 ce0Var = (ce0) fVar.b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.h0.O.d;
                RadialProgressView radialProgressView2 = qd0Var.h.d;
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
