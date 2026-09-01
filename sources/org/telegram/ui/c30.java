package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) k50Var.K(0);
        if (fl0Var != null) {
            View view = fl0Var.a;
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
