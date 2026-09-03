package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m0 extends ze.c {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public m0(n4 n4Var, f3 f3Var, org.telegram.ui.Components.g90 g90Var) {
        this.e = n4Var;
        this.f = f3Var;
        this.g = g90Var;
    }

    @Override // ze.c
    public void b() {
        switch (this.d) {
            case 0:
                n4 n4Var = (n4) this.e;
                n4Var.c.l(n4Var.v, true);
                View view = n4Var.s;
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

    @Override // ze.c
    public void c(boolean z4) {
        switch (this.d) {
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z4);
                break;
        }
    }

    @Override // ze.c
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) this.g;
                n4 n4Var = (n4) this.e;
                org.telegram.ui.Components.c90 c90Var = n4Var.c;
                f3 f3Var = (f3) this.f;
                n4Var.s = f3Var != null ? f3Var.b : null;
                c90Var.l(n4Var.v, true);
                if (f3Var != null) {
                    n4Var.v = org.telegram.ui.Components.c90.i(f3Var.d, g90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    n4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    n4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    c90Var.b(n4Var.v, f3Var);
                }
                View view = n4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                ln lnVar = (ln) this.g;
                lnVar.a.tb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.a;
                znVar.ub = 0;
                znVar.vb = null;
                ((org.telegram.ui.Cells.s1) this.f).invalidate();
                break;
        }
    }

    public m0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.g = lnVar;
        this.e = messageObject;
        this.f = s1Var;
    }
}
