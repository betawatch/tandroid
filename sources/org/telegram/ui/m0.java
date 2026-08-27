package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m0 extends we.d {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public m0(m4 m4Var, f3 f3Var, org.telegram.ui.Components.q80 q80Var) {
        this.e = m4Var;
        this.f = f3Var;
        this.g = q80Var;
    }

    @Override // we.d
    public void b() {
        switch (this.d) {
            case 0:
                m4 m4Var = (m4) this.e;
                m4Var.c.l(m4Var.v, true);
                View view = m4Var.s;
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

    @Override // we.d
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // we.d
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.q80 q80Var = (org.telegram.ui.Components.q80) this.g;
                m4 m4Var = (m4) this.e;
                org.telegram.ui.Components.m80 m80Var = m4Var.c;
                f3 f3Var = (f3) this.f;
                m4Var.s = f3Var != null ? f3Var.b : null;
                m80Var.l(m4Var.v, true);
                if (f3Var != null) {
                    m4Var.v = org.telegram.ui.Components.m80.i(f3Var.d, q80Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ld, false);
                    m4Var.v.f(org.telegram.ui.ActionBar.g6.l1(0.8f, w02), org.telegram.ui.ActionBar.g6.l1(1.3f, w02), org.telegram.ui.ActionBar.g6.l1(1.0f, w02), org.telegram.ui.ActionBar.g6.l1(4.0f, w02));
                    m4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    m80Var.b(m4Var.v, f3Var);
                }
                View view = m4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                dn dnVar = (dn) this.g;
                dnVar.a.sb = ((MessageObject) this.e).getId();
                rn rnVar = dnVar.a;
                rnVar.tb = 0;
                rnVar.ub = null;
                ((org.telegram.ui.Cells.s1) this.f).invalidate();
                break;
        }
    }

    public m0(dn dnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.g = dnVar;
        this.e = messageObject;
        this.f = s1Var;
    }
}
