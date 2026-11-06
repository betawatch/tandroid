package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ pd0 c;

    public /* synthetic */ ae0(int i7, f fVar, pd0 pd0Var) {
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
                int i10 = pd0.F;
                pd0Var.a();
                org.telegram.messenger.g0.i3(new ae0(1, fVar, pd0Var), 150L);
                break;
            default:
                be0 be0Var = (be0) fVar.b;
                be0Var.h(null);
                RadialProgressView radialProgressView = be0Var.g0.N.d;
                RadialProgressView radialProgressView2 = pd0Var.h.d;
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
