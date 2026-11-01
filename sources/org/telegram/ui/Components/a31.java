package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a31 extends s4.s0 {
    public final /* synthetic */ n31 a;

    public a31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        n31 n31Var = this.a;
        z21 z21Var = n31Var.D1;
        if (i10 == 0) {
            n31Var.C1 = false;
        }
        if ((i10 == 0 || i10 == 2) && n31Var.L0(false) > 0.0f && n31Var.L0(false) < org.telegram.messenger.i0.L(96.0f) && z21Var.canScrollVertically(1) && n31.I0(n31Var)) {
            n31Var.C1 = true;
            z21Var.w0(0, (int) n31Var.L0(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n31 n31Var = this.a;
        n31Var.b.invalidate();
        boolean canScrollVertically = n31Var.D1.canScrollVertically(1);
        View view = n31Var.H1;
        Boolean bool = n31Var.N1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            n31Var.N1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.a30.m(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), gr.h, 320L);
        }
    }
}
