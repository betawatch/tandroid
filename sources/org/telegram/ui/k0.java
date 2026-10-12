package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k0 extends pf.c {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public k0(k4 k4Var, d3 d3Var, org.telegram.ui.Components.ea0 ea0Var) {
        this.e = k4Var;
        this.f = d3Var;
        this.g = ea0Var;
    }

    @Override // pf.c
    public void b() {
        switch (this.d) {
            case 0:
                k4 k4Var = (k4) this.e;
                k4Var.c.l(k4Var.v, true);
                View view = k4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                break;
            default:
                super.b();
                break;
        }
    }

    @Override // pf.c
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) this.g;
                k4 k4Var = (k4) this.e;
                org.telegram.ui.Components.aa0 aa0Var = k4Var.c;
                d3 d3Var = (d3) this.f;
                k4Var.s = d3Var != null ? d3Var.b : null;
                aa0Var.l(k4Var.v, true);
                if (d3Var != null) {
                    k4Var.v = org.telegram.ui.Components.aa0.i(d3Var.d, ea0Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ld, false);
                    k4Var.v.g(org.telegram.ui.ActionBar.g6.m1(0.8f, x02), org.telegram.ui.ActionBar.g6.m1(1.3f, x02), org.telegram.ui.ActionBar.g6.m1(1.0f, x02), org.telegram.ui.ActionBar.g6.m1(4.0f, x02));
                    k4Var.v.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    aa0Var.b(k4Var.v, d3Var);
                }
                View view = k4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                qn qnVar = (qn) this.g;
                qnVar.a.wb = ((MessageObject) this.e).getId();
                fo foVar = qnVar.a;
                foVar.xb = 0;
                foVar.yb = null;
                ((org.telegram.ui.Cells.u1) this.f).invalidate();
                break;
        }
    }

    public k0(qn qnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.g = qnVar;
        this.e = messageObject;
        this.f = u1Var;
    }
}
