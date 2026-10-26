package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;
    public final /* synthetic */ tf0 c;

    public /* synthetic */ dg0(int i10, tf0 tf0Var, eg0 eg0Var) {
        this.a = i10;
        this.b = eg0Var;
        this.c = tf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        tf0 tf0Var = this.c;
        eg0 eg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = tf0.F;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new dg0(1, tf0Var, eg0Var), 150L);
                break;
            default:
                fg0 fg0Var = eg0Var.a;
                fg0Var.h(null);
                RadialProgressView radialProgressView = fg0Var.a0.N.d;
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
