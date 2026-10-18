package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;
    public final /* synthetic */ tf0 c;

    public /* synthetic */ cg0(int i10, tf0 tf0Var, dg0 dg0Var) {
        this.a = i10;
        this.b = dg0Var;
        this.c = tf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        tf0 tf0Var = this.c;
        dg0 dg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = tf0.E;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new cg0(1, tf0Var, dg0Var), 150L);
                break;
            default:
                eg0 eg0Var = dg0Var.a;
                eg0Var.h(null);
                RadialProgressView radialProgressView = eg0Var.V.N.d;
                RadialProgressView radialProgressView2 = tf0Var.h.d;
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
