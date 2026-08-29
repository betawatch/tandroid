package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                int i11 = tf0.A;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new cg0(1, tf0Var, dg0Var), 150L);
                break;
            default:
                eg0 eg0Var = dg0Var.a;
                eg0Var.h(null);
                RadialProgressView radialProgressView = eg0Var.R.J.d;
                RadialProgressView radialProgressView2 = tf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.y = radialProgressView2.y;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.A = radialProgressView2.A;
                radialProgressView.b(85L);
                break;
        }
    }
}
