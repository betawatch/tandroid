package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m0 extends ye.c {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public m0(m4 m4Var, f3 f3Var, org.telegram.ui.Components.z80 z80Var) {
        this.e = m4Var;
        this.f = f3Var;
        this.g = z80Var;
    }

    @Override // ye.c
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

    @Override // ye.c
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // ye.c
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.z80 z80Var = (org.telegram.ui.Components.z80) this.g;
                m4 m4Var = (m4) this.e;
                org.telegram.ui.Components.v80 v80Var = m4Var.c;
                f3 f3Var = (f3) this.f;
                m4Var.s = f3Var != null ? f3Var.b : null;
                v80Var.l(m4Var.v, true);
                if (f3Var != null) {
                    m4Var.v = org.telegram.ui.Components.v80.i(f3Var.d, z80Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ld, false);
                    m4Var.v.f(org.telegram.ui.ActionBar.g6.l1(0.8f, w02), org.telegram.ui.ActionBar.g6.l1(1.3f, w02), org.telegram.ui.ActionBar.g6.l1(1.0f, w02), org.telegram.ui.ActionBar.g6.l1(4.0f, w02));
                    m4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    v80Var.b(m4Var.v, f3Var);
                }
                View view = m4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                fn fnVar = (fn) this.g;
                fnVar.a.sb = ((MessageObject) this.e).getId();
                tn tnVar = fnVar.a;
                tnVar.tb = 0;
                tnVar.ub = null;
                ((org.telegram.ui.Cells.s1) this.f).invalidate();
                break;
        }
    }

    public m0(fn fnVar, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var) {
        this.g = fnVar;
        this.e = messageObject;
        this.f = s1Var;
    }
}
