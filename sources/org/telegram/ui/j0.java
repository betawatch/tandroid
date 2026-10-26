package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j0 extends qf.c {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(j4 j4Var, a3 a3Var, org.telegram.ui.Components.aa0 aa0Var) {
        this.e = j4Var;
        this.f = a3Var;
        this.g = aa0Var;
    }

    @Override // qf.c
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

    @Override // qf.c
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.g).a, 11), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // qf.c
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.aa0 aa0Var = (org.telegram.ui.Components.aa0) this.g;
                j4 j4Var = (j4) this.e;
                org.telegram.ui.Components.w90 w90Var = j4Var.c;
                a3 a3Var = (a3) this.f;
                j4Var.s = a3Var != null ? a3Var.b : null;
                w90Var.l(j4Var.v, true);
                if (a3Var != null) {
                    j4Var.v = org.telegram.ui.Components.w90.i(a3Var.d, aa0Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ld, false);
                    j4Var.v.g(org.telegram.ui.ActionBar.y6.o1(0.8f, x02), org.telegram.ui.ActionBar.y6.o1(1.3f, x02), org.telegram.ui.ActionBar.y6.o1(1.0f, x02), org.telegram.ui.ActionBar.y6.o1(4.0f, x02));
                    j4Var.v.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    w90Var.b(j4Var.v, a3Var);
                }
                View view = j4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                fn fnVar = (fn) this.g;
                fnVar.a.Sb = ((MessageObject) this.e).getId();
                un unVar = fnVar.a;
                unVar.Tb = 0;
                unVar.Ub = null;
                ((org.telegram.ui.Cells.s1) this.f).invalidate();
                break;
        }
    }

    public j0(fn fnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.g = fnVar;
        this.e = messageObject;
        this.f = s1Var;
    }
}
