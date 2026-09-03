package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;
    public final /* synthetic */ dg0 c;

    public /* synthetic */ mg0(int i10, dg0 dg0Var, ng0 ng0Var) {
        this.a = i10;
        this.b = ng0Var;
        this.c = dg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        dg0 dg0Var = this.c;
        ng0 ng0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = dg0.B;
                dg0Var.a();
                AndroidUtilities.runOnUIThread(new mg0(1, dg0Var, ng0Var), 150L);
                break;
            default:
                og0 og0Var = ng0Var.a;
                og0Var.h(null);
                RadialProgressView radialProgressView = og0Var.S.K.d;
                RadialProgressView radialProgressView2 = dg0Var.h.d;
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
