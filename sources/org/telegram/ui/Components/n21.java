package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n21 extends v4.u0 {
    public final /* synthetic */ a31 a;

    public n21(a31 a31Var) {
        this.a = a31Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        a31 a31Var = this.a;
        m21 m21Var = a31Var.H1;
        if (i7 == 0) {
            a31Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && a31Var.M0(false) > 0.0f && a31Var.M0(false) < org.telegram.messenger.g0.L(96.0f) && m21Var.canScrollVertically(1) && a31.J0(a31Var)) {
            a31Var.G1 = true;
            m21Var.w0(0, (int) a31Var.M0(false), null);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        a31 a31Var = this.a;
        a31Var.b.invalidate();
        boolean canScrollVertically = a31Var.H1.canScrollVertically(1);
        View view = a31Var.L1;
        Boolean bool = a31Var.R1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            a31Var.R1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.m10.o(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), kr.h, 320L);
        }
    }
}
