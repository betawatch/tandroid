package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g30 extends s4.s0 {
    public final /* synthetic */ j60 a;

    public g30(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        j60 j60Var = this.a;
        p50 p50Var = j60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.i40 i40Var = j60Var.m0;
            if (i40Var != null) {
                i40Var.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = j60Var.n0;
            if (i40Var2 != null) {
                i40Var2.b(true);
                return;
            }
            return;
        }
        float dp = j60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !p50Var.canScrollVertically(1)) {
            return;
        }
        p50Var.getChildAt(0);
        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) p50Var.K(0);
        if (vk0Var != null) {
            View view = vk0Var.a;
            if (view.getTop() > 0) {
                p50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        j60 j60Var = this.a;
        if (j60Var.Q.getChildCount() <= 0 || (call = j60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && j60Var.Y.N0() > j60Var.P.F - 5) {
            j60Var.a1.loadMembers(false);
        }
        j60.J0(j60Var);
        y50 y50Var = j60Var.U0;
        if (y50Var != null) {
            y50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.invalidate();
    }
}
