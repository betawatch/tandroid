package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d30 extends f2.z0 {
    public final /* synthetic */ e60 a;

    public d30(e60 e60Var) {
        this.a = e60Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        e60 e60Var = this.a;
        l50 l50Var = e60Var.N;
        if (i10 != 0) {
            org.telegram.ui.Components.l40 l40Var = e60Var.j0;
            if (l40Var != null) {
                l40Var.b(true);
            }
            org.telegram.ui.Components.l40 l40Var2 = e60Var.k0;
            if (l40Var2 != null) {
                l40Var2.b(true);
                return;
            }
            return;
        }
        float dp = e60Var.v0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !l50Var.canScrollVertically(1)) {
            return;
        }
        l50Var.getChildAt(0);
        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) l50Var.K(0);
        if (dl0Var != null) {
            View view = dl0Var.a;
            if (view.getTop() > 0) {
                l50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        e60 e60Var = this.a;
        if (e60Var.N.getChildCount() <= 0 || (call = e60Var.X0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && e60Var.V.N0() > e60Var.M.C - 5) {
            e60Var.X0.loadMembers(false);
        }
        e60.J0(e60Var);
        t50 t50Var = e60Var.R0;
        if (t50Var != null) {
            t50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
    }
}
