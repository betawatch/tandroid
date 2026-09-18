package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i30 extends s4.s0 {
    public final /* synthetic */ k60 a;

    public i30(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        k60 k60Var = this.a;
        q50 q50Var = k60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.i40 i40Var = k60Var.m0;
            if (i40Var != null) {
                i40Var.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = k60Var.n0;
            if (i40Var2 != null) {
                i40Var2.b(true);
                return;
            }
            return;
        }
        float dp = k60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !q50Var.canScrollVertically(1)) {
            return;
        }
        q50Var.getChildAt(0);
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) q50Var.L(0);
        if (wk0Var != null) {
            View view = wk0Var.a;
            if (view.getTop() > 0) {
                q50Var.w0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        k60 k60Var = this.a;
        if (k60Var.Q.getChildCount() <= 0 || (call = k60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && k60Var.Y.N0() > k60Var.P.F - 5) {
            k60Var.a1.loadMembers(false);
        }
        k60.J0(k60Var);
        z50 z50Var = k60Var.U0;
        if (z50Var != null) {
            z50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
    }
}
