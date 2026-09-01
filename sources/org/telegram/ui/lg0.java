package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;
    public final /* synthetic */ cg0 c;

    public /* synthetic */ lg0(int i10, cg0 cg0Var, mg0 mg0Var) {
        this.a = i10;
        this.b = mg0Var;
        this.c = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        cg0 cg0Var = this.c;
        mg0 mg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = cg0.B;
                cg0Var.a();
                AndroidUtilities.runOnUIThread(new lg0(1, cg0Var, mg0Var), 150L);
                break;
            default:
                ng0 ng0Var = mg0Var.a;
                ng0Var.h(null);
                RadialProgressView radialProgressView = ng0Var.S.K.d;
                RadialProgressView radialProgressView2 = cg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.y = radialProgressView2.y;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.b(85L);
                break;
        }
    }
}
