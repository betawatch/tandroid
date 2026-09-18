package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i0 extends nf.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.d90 d90Var) {
        this.e = h4Var;
        this.f = a3Var;
        this.g = d90Var;
    }

    @Override // nf.e
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.c.l(h4Var.v, true);
                View view = h4Var.s;
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
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.g).a, 9), 250L);
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
                org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) this.g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.z80 z80Var = h4Var.c;
                a3 a3Var = (a3) this.f;
                h4Var.s = a3Var != null ? a3Var.b : null;
                z80Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.z80.i(a3Var.d, d90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    h4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    z80Var.b(h4Var.v, a3Var);
                }
                View view = h4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                nn nnVar = (nn) this.g;
                nnVar.a.vb = ((MessageObject) this.e).getId();
                bo boVar = nnVar.a;
                boVar.wb = 0;
                boVar.xb = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public i0(nn nnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = nnVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
