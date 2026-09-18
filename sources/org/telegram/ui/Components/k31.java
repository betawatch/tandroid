package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k31 extends s4.s0 {
    public final /* synthetic */ w31 a;

    public k31(w31 w31Var) {
        this.a = w31Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        w31 w31Var = this.a;
        j31 j31Var = w31Var.H;
        if (i10 == 0) {
            w31Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && w31Var.z(false) > 0.0f && w31Var.z(false) < AndroidUtilities.dp(96.0f) && j31Var.canScrollVertically(1) && w31.u(w31Var)) {
            w31Var.G = true;
            j31Var.w0(0, (int) w31Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        w31 w31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) w31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = w31Var.H.canScrollVertically(1);
        View view = w31Var.L;
        Boolean bool = w31Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            w31Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.wl.q(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), qr.h, 320L);
        }
    }
}
