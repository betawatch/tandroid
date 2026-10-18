package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p20 extends s4.r0 {
    public final /* synthetic */ s50 a;

    public p20(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        s50 s50Var = this.a;
        y40 y40Var = s50Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.r40 r40Var = s50Var.m0;
            if (r40Var != null) {
                r40Var.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = s50Var.n0;
            if (r40Var2 != null) {
                r40Var2.b(true);
                return;
            }
            return;
        }
        float dp = s50Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !y40Var.canScrollVertically(1)) {
            return;
        }
        y40Var.getChildAt(0);
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) y40Var.K(0);
        if (sl0Var != null) {
            View view = sl0Var.a;
            if (view.getTop() > 0) {
                y40Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        if (s50Var.Q.getChildCount() <= 0 || (call = s50Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && s50Var.Y.N0() > s50Var.P.F - 5) {
            s50Var.a1.loadMembers(false);
        }
        s50.K0(s50Var);
        h50 h50Var = s50Var.U0;
        if (h50Var != null) {
            h50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
    }
}
