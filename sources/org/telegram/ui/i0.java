package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i0 extends nf.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.o90 o90Var) {
        this.e = h4Var;
        this.f = a3Var;
        this.g = o90Var;
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
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.g).a, 9), 250L);
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
                org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) this.g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.k90 k90Var = h4Var.c;
                a3 a3Var = (a3) this.f;
                h4Var.s = a3Var != null ? a3Var.b : null;
                k90Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.k90.i(a3Var.d, o90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    h4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    k90Var.b(h4Var.v, a3Var);
                }
                View view = h4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                ln lnVar = (ln) this.g;
                lnVar.a.vb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.a;
                znVar.wb = 0;
                znVar.xb = null;
                ((org.telegram.ui.Cells.u1) this.f).invalidate();
                break;
        }
    }

    public i0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.g = lnVar;
        this.e = messageObject;
        this.f = u1Var;
    }
}
