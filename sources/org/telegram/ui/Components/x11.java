package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x11 extends v4.s0 {
    public final /* synthetic */ k21 a;

    public x11(k21 k21Var) {
        this.a = k21Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        k21 k21Var = this.a;
        w11 w11Var = k21Var.G1;
        if (i7 == 0) {
            k21Var.F1 = false;
        }
        if ((i7 == 0 || i7 == 2) && k21Var.L0(false) > 0.0f && k21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && w11Var.canScrollVertically(1) && k21.I0(k21Var)) {
            k21Var.F1 = true;
            w11Var.w0(0, (int) k21Var.L0(false), null);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        k21 k21Var = this.a;
        k21Var.b.invalidate();
        boolean canScrollVertically = k21Var.G1.canScrollVertically(1);
        View view = k21Var.K1;
        Boolean bool = k21Var.Q1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            k21Var.Q1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.camera.q.l(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), wq.h, 320L);
        }
    }
}
