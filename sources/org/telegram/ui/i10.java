package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i10 extends v4.s0 {
    public final /* synthetic */ f40 a;

    public i10(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.xi0 xi0Var;
        f40 f40Var = this.a;
        n30 n30Var = f40Var.K1;
        if (i7 != 0) {
            org.telegram.ui.Components.y20 y20Var = f40Var.g2;
            if (y20Var != null) {
                y20Var.a();
            }
            org.telegram.ui.Components.y20 y20Var2 = f40Var.h2;
            if (y20Var2 != null) {
                y20Var2.a();
                return;
            }
            return;
        }
        float L = f40Var.s2 - org.telegram.messenger.g0.L(74.0f);
        n30Var.getChildAt(0);
        if (L + f40Var.s0 >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() || !n30Var.canScrollVertically(1) || (xi0Var = (org.telegram.ui.Components.xi0) n30Var.K(0)) == null) {
            return;
        }
        View view = xi0Var.a;
        if (view.getTop() > 0) {
            n30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        f40 f40Var = this.a;
        if (f40Var.K1.getChildCount() <= 0 || (r3Var = f40Var.U2) == null) {
            return;
        }
        if (!r3Var.u && !r3Var.t && f40Var.S1.N0() > f40Var.J1.F - 5) {
            f40Var.U2.k(false);
        }
        f40.P0(f40Var);
        u30 u30Var = f40Var.O2;
        if (u30Var != null) {
            u30Var.invalidate();
        }
        f40Var.b.invalidate();
    }
}
