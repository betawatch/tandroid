package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o20 extends f2.b1 {
    public final /* synthetic */ s50 a;

    public o20(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        s50 s50Var = this.a;
        y40 y40Var = s50Var.M;
        if (i10 != 0) {
            org.telegram.ui.Components.x30 x30Var = s50Var.i0;
            if (x30Var != null) {
                x30Var.b(true);
            }
            org.telegram.ui.Components.x30 x30Var2 = s50Var.j0;
            if (x30Var2 != null) {
                x30Var2.b(true);
                return;
            }
            return;
        }
        float dp = s50Var.u0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !y40Var.canScrollVertically(1)) {
            return;
        }
        y40Var.getChildAt(0);
        org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) y40Var.K(0);
        if (lk0Var != null) {
            View view = lk0Var.a;
            if (view.getTop() > 0) {
                y40Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        if (s50Var.M.getChildCount() <= 0 || (call = s50Var.W0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && s50Var.U.N0() > s50Var.L.B - 5) {
            s50Var.W0.loadMembers(false);
        }
        s50.J0(s50Var);
        h50 h50Var = s50Var.Q0;
        if (h50Var != null) {
            h50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
        viewGroup.invalidate();
    }
}
