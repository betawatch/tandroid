package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e30 extends s4.t0 {
    public final /* synthetic */ g60 a;

    public e30(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        g60 g60Var = this.a;
        m50 m50Var = g60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.z40 z40Var = g60Var.m0;
            if (z40Var != null) {
                z40Var.b(true);
            }
            org.telegram.ui.Components.z40 z40Var2 = g60Var.n0;
            if (z40Var2 != null) {
                z40Var2.b(true);
                return;
            }
            return;
        }
        float dp = g60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !m50Var.canScrollVertically(1)) {
            return;
        }
        m50Var.getChildAt(0);
        org.telegram.ui.Components.am0 am0Var = (org.telegram.ui.Components.am0) m50Var.K(0);
        if (am0Var != null) {
            View view = am0Var.a;
            if (view.getTop() > 0) {
                m50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        g60 g60Var = this.a;
        if (g60Var.Q.getChildCount() <= 0 || (call = g60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && g60Var.Y.N0() > g60Var.P.F - 5) {
            g60Var.a1.loadMembers(false);
        }
        g60.K0(g60Var);
        v50 v50Var = g60Var.U0;
        if (v50Var != null) {
            v50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.invalidate();
    }
}
