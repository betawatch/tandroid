package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q20 extends s4.r0 {
    public final /* synthetic */ u50 a;

    public q20(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.wl0 wl0Var;
        u50 u50Var = this.a;
        z40 z40Var = u50Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.r40 r40Var = u50Var.m0;
            if (r40Var != null) {
                r40Var.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = u50Var.n0;
            if (r40Var2 != null) {
                r40Var2.b(true);
                return;
            }
            return;
        }
        float dp = u50Var.y0 - AndroidUtilities.dp(74.0f);
        z40Var.getChildAt(0);
        i11 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !z40Var.canScrollVertically(1) || (wl0Var = (org.telegram.ui.Components.wl0) z40Var.K(0)) == null) {
            return;
        }
        View view = wl0Var.a;
        if (view.getTop() > 0) {
            z40Var.v0(0, view.getTop(), null);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        u50 u50Var = this.a;
        if (u50Var.Q.getChildCount() <= 0 || (call = u50Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && u50Var.Y.N0() > u50Var.P.F - 5) {
            u50Var.a1.loadMembers(false);
        }
        u50.J0(u50Var);
        j50 j50Var = u50Var.U0;
        if (j50Var != null) {
            j50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
    }
}
