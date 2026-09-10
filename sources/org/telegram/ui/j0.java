package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j0 extends nf.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(j4 j4Var, c3 c3Var, org.telegram.ui.Components.n90 n90Var) {
        this.e = j4Var;
        this.f = c3Var;
        this.g = n90Var;
    }

    @Override // nf.e
    public void b() {
        switch (this.d) {
            case 0:
                j4 j4Var = (j4) this.e;
                j4Var.c.l(j4Var.v, true);
                View view = j4Var.s;
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

    @Override // nf.e
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) this.g;
                j4 j4Var = (j4) this.e;
                org.telegram.ui.Components.j90 j90Var = j4Var.c;
                c3 c3Var = (c3) this.f;
                j4Var.s = c3Var != null ? c3Var.b : null;
                j90Var.l(j4Var.v, true);
                if (c3Var != null) {
                    j4Var.v = org.telegram.ui.Components.j90.i(c3Var.d, n90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    j4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    j4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    j90Var.b(j4Var.v, c3Var);
                }
                View view = j4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                pn pnVar = (pn) this.g;
                pnVar.a.wb = ((MessageObject) this.e).getId();
                eo eoVar = pnVar.a;
                eoVar.xb = 0;
                eoVar.yb = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public j0(pn pnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = pnVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
