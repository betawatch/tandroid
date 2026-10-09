package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j0 extends of.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.fa0 fa0Var) {
        this.e = i4Var;
        this.f = b3Var;
        this.g = fa0Var;
    }

    @Override // of.e
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.c.l(i4Var.v, true);
                View view = i4Var.s;
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

    @Override // of.e
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // of.e
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) this.g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.ba0 ba0Var = i4Var.c;
                b3 b3Var = (b3) this.f;
                i4Var.s = b3Var != null ? b3Var.b : null;
                ba0Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.ba0.i(b3Var.d, fa0Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ld, false);
                    i4Var.v.g(org.telegram.ui.ActionBar.i6.m1(0.8f, x02), org.telegram.ui.ActionBar.i6.m1(1.3f, x02), org.telegram.ui.ActionBar.i6.m1(1.0f, x02), org.telegram.ui.ActionBar.i6.m1(4.0f, x02));
                    i4Var.v.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    ba0Var.b(i4Var.v, b3Var);
                }
                View view = i4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                ln lnVar = (ln) this.g;
                lnVar.a.wb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.a;
                znVar.xb = 0;
                znVar.yb = null;
                ((org.telegram.ui.Cells.u1) this.f).invalidate();
                break;
        }
    }

    public j0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.g = lnVar;
        this.e = messageObject;
        this.f = u1Var;
    }
}
