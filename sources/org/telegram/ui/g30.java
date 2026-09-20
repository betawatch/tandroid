package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class g30 extends s4.s0 {
    public final /* synthetic */ i60 a;

    public g30(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        i60 i60Var = this.a;
        o50 o50Var = i60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.i40 i40Var = i60Var.m0;
            if (i40Var != null) {
                i40Var.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = i60Var.n0;
            if (i40Var2 != null) {
                i40Var2.b(true);
                return;
            }
            return;
        }
        float dp = i60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !o50Var.canScrollVertically(1)) {
            return;
        }
        o50Var.getChildAt(0);
        org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) o50Var.L(0);
        if (fl0Var != null) {
            View view = fl0Var.a;
            if (view.getTop() > 0) {
                o50Var.w0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        i60 i60Var = this.a;
        if (i60Var.Q.getChildCount() <= 0 || (call = i60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && i60Var.Y.N0() > i60Var.P.F - 5) {
            i60Var.a1.loadMembers(false);
        }
        i60.J0(i60Var);
        x50 x50Var = i60Var.U0;
        if (x50Var != null) {
            x50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
    }
}
