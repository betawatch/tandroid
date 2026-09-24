package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class b30 extends s4.s0 {
    public final /* synthetic */ d60 a;

    public b30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        d60 d60Var = this.a;
        j50 j50Var = d60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.j40 j40Var = d60Var.m0;
            if (j40Var != null) {
                j40Var.b(true);
            }
            org.telegram.ui.Components.j40 j40Var2 = d60Var.n0;
            if (j40Var2 != null) {
                j40Var2.b(true);
                return;
            }
            return;
        }
        float dp = d60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !j50Var.canScrollVertically(1)) {
            return;
        }
        j50Var.getChildAt(0);
        org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) j50Var.K(0);
        if (gl0Var != null) {
            View view = gl0Var.a;
            if (view.getTop() > 0) {
                j50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        d60 d60Var = this.a;
        if (d60Var.Q.getChildCount() <= 0 || (call = d60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && d60Var.Y.N0() > d60Var.P.F - 5) {
            d60Var.a1.loadMembers(false);
        }
        d60.J0(d60Var);
        s50 s50Var = d60Var.U0;
        if (s50Var != null) {
            s50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
    }
}
