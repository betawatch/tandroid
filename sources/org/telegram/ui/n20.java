package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class n20 extends s4.r0 {
    public final /* synthetic */ q50 a;

    public n20(q50 q50Var) {
        this.a = q50Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        q50 q50Var = this.a;
        w40 w40Var = q50Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.r40 r40Var = q50Var.m0;
            if (r40Var != null) {
                r40Var.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = q50Var.n0;
            if (r40Var2 != null) {
                r40Var2.b(true);
                return;
            }
            return;
        }
        float dp = q50Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !w40Var.canScrollVertically(1)) {
            return;
        }
        w40Var.getChildAt(0);
        org.telegram.ui.Components.tl0 tl0Var = (org.telegram.ui.Components.tl0) w40Var.K(0);
        if (tl0Var != null) {
            View view = tl0Var.a;
            if (view.getTop() > 0) {
                w40Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        q50 q50Var = this.a;
        if (q50Var.Q.getChildCount() <= 0 || (call = q50Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && q50Var.Y.N0() > q50Var.P.F - 5) {
            q50Var.a1.loadMembers(false);
        }
        q50.K0(q50Var);
        f50 f50Var = q50Var.U0;
        if (f50Var != null) {
            f50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
    }
}
