package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;
    public final /* synthetic */ wf0 c;

    public /* synthetic */ fg0(int i10, wf0 wf0Var, gg0 gg0Var) {
        this.a = i10;
        this.b = gg0Var;
        this.c = wf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wf0 wf0Var = this.c;
        gg0 gg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = wf0.A;
                wf0Var.a();
                AndroidUtilities.runOnUIThread(new fg0(1, wf0Var, gg0Var), 150L);
                break;
            default:
                hg0 hg0Var = gg0Var.a;
                hg0Var.h(null);
                RadialProgressView radialProgressView = hg0Var.R.J.d;
                RadialProgressView radialProgressView2 = wf0Var.h.d;
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
