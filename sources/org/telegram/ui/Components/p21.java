package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p21 extends f2.b1 {
    public final /* synthetic */ b31 a;

    public p21(b31 b31Var) {
        this.a = b31Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        b31 b31Var = this.a;
        o21 o21Var = b31Var.D;
        if (i10 == 0) {
            b31Var.C = false;
        }
        if ((i10 == 0 || i10 == 2) && b31Var.B(false) > 0.0f && b31Var.B(false) < AndroidUtilities.dp(96.0f) && o21Var.canScrollVertically(1) && b31.v(b31Var)) {
            b31Var.C = true;
            o21Var.v0(0, (int) b31Var.B(false), null);
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        b31 b31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) b31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = b31Var.D.canScrollVertically(1);
        View view = b31Var.H;
        Boolean bool = b31Var.M;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            b31Var.M = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.rl.o(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), er.h, 320L);
        }
    }
}
