package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c21 extends v4.t0 {
    public final /* synthetic */ p21 a;

    public c21(p21 p21Var) {
        this.a = p21Var;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        p21 p21Var = this.a;
        b21 b21Var = p21Var.H1;
        if (i7 == 0) {
            p21Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && p21Var.L0(false) > 0.0f && p21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && b21Var.canScrollVertically(1) && p21.I0(p21Var)) {
            p21Var.G1 = true;
            b21Var.w0(0, (int) p21Var.L0(false), null);
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        p21 p21Var = this.a;
        p21Var.b.invalidate();
        boolean canScrollVertically = p21Var.H1.canScrollVertically(1);
        View view = p21Var.L1;
        Boolean bool = p21Var.R1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            p21Var.R1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.i20.n(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), er.h, 320L);
        }
    }
}
