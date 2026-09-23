package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j0 extends nf.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.e90 e90Var) {
        this.e = i4Var;
        this.f = b3Var;
        this.g = e90Var;
    }

    @Override // nf.e
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

    @Override // nf.e
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.g).a, 9), 250L);
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
                org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) this.g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.a90 a90Var = i4Var.c;
                b3 b3Var = (b3) this.f;
                i4Var.s = b3Var != null ? b3Var.b : null;
                a90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.a90.i(b3Var.d, e90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.h6.l1(0.8f, w02), org.telegram.ui.ActionBar.h6.l1(1.3f, w02), org.telegram.ui.ActionBar.h6.l1(1.0f, w02), org.telegram.ui.ActionBar.h6.l1(4.0f, w02));
                    i4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    a90Var.b(i4Var.v, b3Var);
                }
                View view = i4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                jn jnVar = (jn) this.g;
                jnVar.a.vb = ((MessageObject) this.e).getId();
                xn xnVar = jnVar.a;
                xnVar.wb = 0;
                xnVar.xb = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public j0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = jnVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
