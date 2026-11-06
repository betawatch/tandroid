package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r11 extends v4.s0 {
    public final /* synthetic */ e21 a;

    public r11(e21 e21Var) {
        this.a = e21Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        e21 e21Var = this.a;
        q11 q11Var = e21Var.D1;
        if (i7 == 0) {
            e21Var.C1 = false;
        }
        if ((i7 == 0 || i7 == 2) && e21Var.L0(false) > 0.0f && e21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && q11Var.canScrollVertically(1) && e21.I0(e21Var)) {
            e21Var.C1 = true;
            q11Var.w0(0, (int) e21Var.L0(false), null);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        e21 e21Var = this.a;
        e21Var.b.invalidate();
        boolean canScrollVertically = e21Var.D1.canScrollVertically(1);
        View view = e21Var.H1;
        Boolean bool = e21Var.N1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            e21Var.N1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.camera.q.l(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), xq.h, 320L);
        }
    }
}
