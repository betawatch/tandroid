package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l20 extends f2.d1 {
    public final /* synthetic */ o50 a;

    public l20(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        int i10;
        o50 o50Var = this.a;
        u40 u40Var = o50Var.M;
        if (i9 != 0) {
            org.telegram.ui.Components.s30 s30Var = o50Var.i0;
            if (s30Var != null) {
                s30Var.b(true);
            }
            org.telegram.ui.Components.s30 s30Var2 = o50Var.j0;
            if (s30Var2 != null) {
                s30Var2.b(true);
                return;
            }
            return;
        }
        float dp = o50Var.u0 - AndroidUtilities.dp(74.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
        if (dp + i10 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !u40Var.canScrollVertically(1)) {
            return;
        }
        u40Var.getChildAt(0);
        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) u40Var.K(0);
        if (ik0Var != null) {
            View view = ik0Var.a;
            if (view.getTop() > 0) {
                u40Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        o50 o50Var = this.a;
        if (o50Var.M.getChildCount() <= 0 || (call = o50Var.W0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && o50Var.U.N0() > o50Var.L.B - 5) {
            o50Var.W0.loadMembers(false);
        }
        o50.I0(o50Var);
        d50 d50Var = o50Var.Q0;
        if (d50Var != null) {
            d50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
    }
}
