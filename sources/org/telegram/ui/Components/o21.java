package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o21 extends v4.u0 {
    public final /* synthetic */ b31 a;

    public o21(b31 b31Var) {
        this.a = b31Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        b31 b31Var = this.a;
        n21 n21Var = b31Var.H1;
        if (i7 == 0) {
            b31Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && b31Var.M0(false) > 0.0f && b31Var.M0(false) < org.telegram.messenger.g0.L(96.0f) && n21Var.canScrollVertically(1) && b31.J0(b31Var)) {
            b31Var.G1 = true;
            n21Var.w0(0, (int) b31Var.M0(false), null);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        b31 b31Var = this.a;
        b31Var.b.invalidate();
        boolean canScrollVertically = b31Var.H1.canScrollVertically(1);
        View view = b31Var.L1;
        Boolean bool = b31Var.R1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            b31Var.R1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.n10.o(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), nr.h, 320L);
        }
    }
}
