package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class g30 extends s4.s0 {
    public final /* synthetic */ h60 a;

    public g30(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        h60 h60Var = this.a;
        o50 o50Var = h60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.m40 m40Var = h60Var.m0;
            if (m40Var != null) {
                m40Var.b(true);
            }
            org.telegram.ui.Components.m40 m40Var2 = h60Var.n0;
            if (m40Var2 != null) {
                m40Var2.b(true);
                return;
            }
            return;
        }
        float dp = h60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) h60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !o50Var.canScrollVertically(1)) {
            return;
        }
        o50Var.getChildAt(0);
        org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) o50Var.K(0);
        if (il0Var != null) {
            View view = il0Var.a;
            if (view.getTop() > 0) {
                o50Var.w0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        h60 h60Var = this.a;
        if (h60Var.Q.getChildCount() <= 0 || (call = h60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && h60Var.Y.N0() > h60Var.P.F - 5) {
            h60Var.a1.loadMembers(false);
        }
        h60.J0(h60Var);
        w50 w50Var = h60Var.U0;
        if (w50Var != null) {
            w50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
    }
}
