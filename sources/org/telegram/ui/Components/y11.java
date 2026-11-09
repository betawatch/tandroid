package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y11 extends v4.s0 {
    public final /* synthetic */ l21 a;

    public y11(l21 l21Var) {
        this.a = l21Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        l21 l21Var = this.a;
        x11 x11Var = l21Var.D1;
        if (i7 == 0) {
            l21Var.C1 = false;
        }
        if ((i7 == 0 || i7 == 2) && l21Var.L0(false) > 0.0f && l21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && x11Var.canScrollVertically(1) && l21.I0(l21Var)) {
            l21Var.C1 = true;
            x11Var.w0(0, (int) l21Var.L0(false), null);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        l21 l21Var = this.a;
        l21Var.b.invalidate();
        boolean canScrollVertically = l21Var.D1.canScrollVertically(1);
        View view = l21Var.H1;
        Boolean bool = l21Var.N1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            l21Var.N1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.camera.q.l(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), xq.h, 320L);
        }
    }
}
