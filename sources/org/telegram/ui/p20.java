package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p20 extends f2.a1 {
    public final /* synthetic */ r50 a;

    public p20(r50 r50Var) {
        this.a = r50Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        r50 r50Var = this.a;
        x40 x40Var = r50Var.M;
        if (i10 != 0) {
            org.telegram.ui.Components.g40 g40Var = r50Var.i0;
            if (g40Var != null) {
                g40Var.b(true);
            }
            org.telegram.ui.Components.g40 g40Var2 = r50Var.j0;
            if (g40Var2 != null) {
                g40Var2.b(true);
                return;
            }
            return;
        }
        float dp = r50Var.u0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() || !x40Var.canScrollVertically(1)) {
            return;
        }
        x40Var.getChildAt(0);
        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) x40Var.K(0);
        if (vk0Var != null) {
            View view = vk0Var.a;
            if (view.getTop() > 0) {
                x40Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        r50 r50Var = this.a;
        if (r50Var.M.getChildCount() <= 0 || (call = r50Var.W0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && r50Var.U.N0() > r50Var.L.B - 5) {
            r50Var.W0.loadMembers(false);
        }
        r50.J0(r50Var);
        g50 g50Var = r50Var.Q0;
        if (g50Var != null) {
            g50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
    }
}
