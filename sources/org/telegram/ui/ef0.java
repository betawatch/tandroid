package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ ve0 c;

    public /* synthetic */ ef0(int i10, e eVar, ve0 ve0Var) {
        this.a = i10;
        this.b = eVar;
        this.c = ve0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ve0 ve0Var = this.c;
        e eVar = this.b;
        switch (i10) {
            case 0:
                int i11 = ve0.F;
                ve0Var.a();
                org.telegram.messenger.i0.h3(new ef0(1, eVar, ve0Var), 150L);
                break;
            default:
                ff0 ff0Var = (ff0) eVar.b;
                ff0Var.h(null);
                RadialProgressView radialProgressView = ff0Var.a0.N.d;
                RadialProgressView radialProgressView2 = ve0Var.h.d;
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
