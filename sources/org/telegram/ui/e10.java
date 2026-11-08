package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e10 extends v4.s0 {
    public final /* synthetic */ c40 a;

    public e10(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.xi0 xi0Var;
        c40 c40Var = this.a;
        k30 k30Var = c40Var.H1;
        if (i7 != 0) {
            org.telegram.ui.Components.y20 y20Var = c40Var.d2;
            if (y20Var != null) {
                y20Var.a();
            }
            org.telegram.ui.Components.y20 y20Var2 = c40Var.e2;
            if (y20Var2 != null) {
                y20Var2.a();
                return;
            }
            return;
        }
        float L = c40Var.p2 - org.telegram.messenger.g0.L(74.0f);
        k30Var.getChildAt(0);
        if (L + c40Var.s0 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !k30Var.canScrollVertically(1) || (xi0Var = (org.telegram.ui.Components.xi0) k30Var.K(0)) == null) {
            return;
        }
        View view = xi0Var.a;
        if (view.getTop() > 0) {
            k30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        c40 c40Var = this.a;
        if (c40Var.H1.getChildCount() <= 0 || (r3Var = c40Var.R2) == null) {
            return;
        }
        if (!r3Var.u && !r3Var.t && c40Var.P1.N0() > c40Var.G1.F - 5) {
            c40Var.R2.k(false);
        }
        c40.P0(c40Var);
        r30 r30Var = c40Var.L2;
        if (r30Var != null) {
            r30Var.invalidate();
        }
        c40Var.b.invalidate();
    }
}
