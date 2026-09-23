package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d30 extends s4.s0 {
    public final /* synthetic */ f60 a;

    public d30(f60 f60Var) {
        this.a = f60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        f60 f60Var = this.a;
        l50 l50Var = f60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.j40 j40Var = f60Var.m0;
            if (j40Var != null) {
                j40Var.b(true);
            }
            org.telegram.ui.Components.j40 j40Var2 = f60Var.n0;
            if (j40Var2 != null) {
                j40Var2.b(true);
                return;
            }
            return;
        }
        float dp = f60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !l50Var.canScrollVertically(1)) {
            return;
        }
        l50Var.getChildAt(0);
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) l50Var.K(0);
        if (wk0Var != null) {
            View view = wk0Var.a;
            if (view.getTop() > 0) {
                l50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        f60 f60Var = this.a;
        if (f60Var.Q.getChildCount() <= 0 || (call = f60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && f60Var.Y.N0() > f60Var.P.F - 5) {
            f60Var.a1.loadMembers(false);
        }
        f60.J0(f60Var);
        u50 u50Var = f60Var.U0;
        if (u50Var != null) {
            u50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
    }
}
