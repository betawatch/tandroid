package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s11 extends u4.t0 {
    public final /* synthetic */ f21 a;

    public s11(f21 f21Var) {
        this.a = f21Var;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        f21 f21Var = this.a;
        r11 r11Var = f21Var.E1;
        if (i3 == 0) {
            f21Var.D1 = false;
        }
        if ((i3 == 0 || i3 == 2) && f21Var.L0(false) > 0.0f && f21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && r11Var.canScrollVertically(1) && f21.I0(f21Var)) {
            f21Var.D1 = true;
            r11Var.w0(0, (int) f21Var.L0(false), null);
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        f21 f21Var = this.a;
        f21Var.b.invalidate();
        boolean canScrollVertically = f21Var.E1.canScrollVertically(1);
        View view = f21Var.I1;
        Boolean bool = f21Var.O1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            f21Var.O1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.camera.q.l(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), xq.h, 320L);
        }
    }
}
