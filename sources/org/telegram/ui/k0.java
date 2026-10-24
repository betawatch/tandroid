package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k0 extends pf.c {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public k0(k4 k4Var, c3 c3Var, org.telegram.ui.Components.z90 z90Var) {
        this.e = k4Var;
        this.f = c3Var;
        this.g = z90Var;
    }

    @Override // pf.c
    public void b() {
        switch (this.d) {
            case 0:
                k4 k4Var = (k4) this.e;
                k4Var.c.l(k4Var.v, true);
                View view = k4Var.s;
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

    @Override // pf.c
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) this.g;
                k4 k4Var = (k4) this.e;
                org.telegram.ui.Components.v90 v90Var = k4Var.c;
                c3 c3Var = (c3) this.f;
                k4Var.s = c3Var != null ? c3Var.b : null;
                v90Var.l(k4Var.v, true);
                if (c3Var != null) {
                    k4Var.v = org.telegram.ui.Components.v90.i(c3Var.d, z90Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ld, false);
                    k4Var.v.g(org.telegram.ui.ActionBar.k6.o1(0.8f, x02), org.telegram.ui.ActionBar.k6.o1(1.3f, x02), org.telegram.ui.ActionBar.k6.o1(1.0f, x02), org.telegram.ui.ActionBar.k6.o1(4.0f, x02));
                    k4Var.v.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    v90Var.b(k4Var.v, c3Var);
                }
                View view = k4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                dn dnVar = (dn) this.g;
                dnVar.a.Jb = ((MessageObject) this.e).getId();
                sn snVar = dnVar.a;
                snVar.Kb = 0;
                snVar.Lb = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public k0(dn dnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = dnVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
