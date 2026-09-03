package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c30 extends f2.a1 {
    public final /* synthetic */ d60 a;

    public c30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        d60 d60Var = this.a;
        k50 k50Var = d60Var.N;
        if (i10 != 0) {
            org.telegram.ui.Components.m40 m40Var = d60Var.j0;
            if (m40Var != null) {
                m40Var.b(true);
            }
            org.telegram.ui.Components.m40 m40Var2 = d60Var.k0;
            if (m40Var2 != null) {
                m40Var2.b(true);
                return;
            }
            return;
        }
        float dp = d60Var.v0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !k50Var.canScrollVertically(1)) {
            return;
        }
        k50Var.getChildAt(0);
        org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) k50Var.K(0);
        if (el0Var != null) {
            View view = el0Var.a;
            if (view.getTop() > 0) {
                k50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        d60 d60Var = this.a;
        if (d60Var.N.getChildCount() <= 0 || (call = d60Var.X0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && d60Var.V.N0() > d60Var.M.C - 5) {
            d60Var.X0.loadMembers(false);
        }
        d60.J0(d60Var);
        s50 s50Var = d60Var.R0;
        if (s50Var != null) {
            s50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
    }
}
