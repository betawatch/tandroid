package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b30 extends f2.z0 {
    public final /* synthetic */ c60 a;

    public b30(c60 c60Var) {
        this.a = c60Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        c60 c60Var = this.a;
        j50 j50Var = c60Var.N;
        if (i10 != 0) {
            org.telegram.ui.Components.k40 k40Var = c60Var.j0;
            if (k40Var != null) {
                k40Var.b(true);
            }
            org.telegram.ui.Components.k40 k40Var2 = c60Var.k0;
            if (k40Var2 != null) {
                k40Var2.b(true);
                return;
            }
            return;
        }
        float dp = c60Var.v0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !j50Var.canScrollVertically(1)) {
            return;
        }
        j50Var.getChildAt(0);
        org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) j50Var.K(0);
        if (el0Var != null) {
            View view = el0Var.a;
            if (view.getTop() > 0) {
                j50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        c60 c60Var = this.a;
        if (c60Var.N.getChildCount() <= 0 || (call = c60Var.X0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && c60Var.V.N0() > c60Var.M.C - 5) {
            c60Var.X0.loadMembers(false);
        }
        c60.J0(c60Var);
        r50 r50Var = c60Var.R0;
        if (r50Var != null) {
            r50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
    }
}
