package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l21 extends v4.u0 {
    public final /* synthetic */ y21 a;

    public l21(y21 y21Var) {
        this.a = y21Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        y21 y21Var = this.a;
        k21 k21Var = y21Var.H1;
        if (i7 == 0) {
            y21Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && y21Var.M0(false) > 0.0f && y21Var.M0(false) < org.telegram.messenger.g0.L(96.0f) && k21Var.canScrollVertically(1) && y21.J0(y21Var)) {
            y21Var.G1 = true;
            k21Var.w0(0, (int) y21Var.M0(false), null);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        y21 y21Var = this.a;
        y21Var.b.invalidate();
        boolean canScrollVertically = y21Var.H1.canScrollVertically(1);
        View view = y21Var.L1;
        Boolean bool = y21Var.R1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            y21Var.R1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.n10.o(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), lr.h, 320L);
        }
    }
}
