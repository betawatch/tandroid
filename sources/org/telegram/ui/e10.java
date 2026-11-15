package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e10 extends v4.t0 {
    public final /* synthetic */ c40 a;

    public e10(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.cj0 cj0Var;
        c40 c40Var = this.a;
        k30 k30Var = c40Var.L1;
        if (i7 != 0) {
            org.telegram.ui.Components.b30 b30Var = c40Var.h2;
            if (b30Var != null) {
                b30Var.a();
            }
            org.telegram.ui.Components.b30 b30Var2 = c40Var.i2;
            if (b30Var2 != null) {
                b30Var2.a();
                return;
            }
            return;
        }
        float L = c40Var.t2 - org.telegram.messenger.g0.L(74.0f);
        k30Var.getChildAt(0);
        if (L + c40Var.t0 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !k30Var.canScrollVertically(1) || (cj0Var = (org.telegram.ui.Components.cj0) k30Var.K(0)) == null) {
            return;
        }
        View view = cj0Var.a;
        if (view.getTop() > 0) {
            k30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        c40 c40Var = this.a;
        if (c40Var.L1.getChildCount() <= 0 || (r3Var = c40Var.V2) == null) {
            return;
        }
        if (!r3Var.u && !r3Var.t && c40Var.T1.N0() > c40Var.K1.G - 5) {
            c40Var.V2.k(false);
        }
        c40.P0(c40Var);
        r30 r30Var = c40Var.P2;
        if (r30Var != null) {
            r30Var.invalidate();
        }
        c40Var.b.invalidate();
    }
}
