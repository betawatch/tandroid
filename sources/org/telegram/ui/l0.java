package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l0 extends ve.d {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public l0(l4 l4Var, e3 e3Var, org.telegram.ui.Components.m80 m80Var) {
        this.e = l4Var;
        this.f = e3Var;
        this.g = m80Var;
    }

    @Override // ve.d
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

    @Override // ve.d
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // ve.d
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.g;
                l4 l4Var = (l4) this.e;
                org.telegram.ui.Components.i80 i80Var = l4Var.c;
                e3 e3Var = (e3) this.f;
                l4Var.s = e3Var != null ? e3Var.b : null;
                i80Var.l(l4Var.v, true);
                if (e3Var != null) {
                    l4Var.v = org.telegram.ui.Components.i80.i(e3Var.d, m80Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ld, false);
                    l4Var.v.f(org.telegram.ui.ActionBar.f6.l1(0.8f, w02), org.telegram.ui.ActionBar.f6.l1(1.3f, w02), org.telegram.ui.ActionBar.f6.l1(1.0f, w02), org.telegram.ui.ActionBar.f6.l1(4.0f, w02));
                    l4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    i80Var.b(l4Var.v, e3Var);
                }
                View view = l4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                cn cnVar = (cn) this.g;
                cnVar.a.sb = ((MessageObject) this.e).getId();
                qn qnVar = cnVar.a;
                qnVar.tb = 0;
                qnVar.ub = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public l0(cn cnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = cnVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
