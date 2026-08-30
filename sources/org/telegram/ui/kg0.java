package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;
    public final /* synthetic */ bg0 c;

    public /* synthetic */ kg0(int i10, bg0 bg0Var, lg0 lg0Var) {
        this.a = i10;
        this.b = lg0Var;
        this.c = bg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        bg0 bg0Var = this.c;
        lg0 lg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = bg0.B;
                bg0Var.a();
                AndroidUtilities.runOnUIThread(new kg0(1, bg0Var, lg0Var), 150L);
                break;
            default:
                mg0 mg0Var = lg0Var.a;
                mg0Var.h(null);
                RadialProgressView radialProgressView = mg0Var.S.K.d;
                RadialProgressView radialProgressView2 = bg0Var.h.d;
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
