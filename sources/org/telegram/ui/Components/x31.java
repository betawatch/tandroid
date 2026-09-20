package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x31 extends s4.s0 {
    public final /* synthetic */ j41 a;

    public x31(j41 j41Var) {
        this.a = j41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        j41 j41Var = this.a;
        w31 w31Var = j41Var.H;
        if (i10 == 0) {
            j41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && j41Var.z(false) > 0.0f && j41Var.z(false) < AndroidUtilities.dp(96.0f) && w31Var.canScrollVertically(1) && j41.u(j41Var)) {
            j41Var.G = true;
            w31Var.w0(0, (int) j41Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        j41 j41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) j41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = j41Var.H.canScrollVertically(1);
        View view = j41Var.L;
        Boolean bool = j41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            j41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.rk.s(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), qr.h, 320L);
        }
    }
}
