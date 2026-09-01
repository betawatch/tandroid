package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k0 extends af.f {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public k0(l4 l4Var, d3 d3Var, org.telegram.ui.Components.h90 h90Var) {
        this.e = l4Var;
        this.f = d3Var;
        this.g = h90Var;
    }

    @Override // af.f
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.e;
                l4Var.c.l(l4Var.v, true);
                View view = l4Var.s;
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

    @Override // af.f
    public void c(boolean z4) {
        switch (this.d) {
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z4);
                break;
        }
    }

    @Override // af.f
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) this.g;
                l4 l4Var = (l4) this.e;
                org.telegram.ui.Components.d90 d90Var = l4Var.c;
                d3 d3Var = (d3) this.f;
                l4Var.s = d3Var != null ? d3Var.b : null;
                d90Var.l(l4Var.v, true);
                if (d3Var != null) {
                    l4Var.v = org.telegram.ui.Components.d90.i(d3Var.d, h90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ld, false);
                    l4Var.v.f(org.telegram.ui.ActionBar.k6.l1(0.8f, w02), org.telegram.ui.ActionBar.k6.l1(1.3f, w02), org.telegram.ui.ActionBar.k6.l1(1.0f, w02), org.telegram.ui.ActionBar.k6.l1(4.0f, w02));
                    l4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    d90Var.b(l4Var.v, d3Var);
                }
                View view = l4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                jn jnVar = (jn) this.g;
                jnVar.a.tb = ((MessageObject) this.e).getId();
                xn xnVar = jnVar.a;
                xnVar.ub = 0;
                xnVar.vb = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public k0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = jnVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
