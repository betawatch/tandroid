package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h30 extends s4.s0 {
    public final /* synthetic */ j60 a;

    public h30(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        j60 j60Var = this.a;
        p50 p50Var = j60Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.s40 s40Var = j60Var.m0;
            if (s40Var != null) {
                s40Var.b(true);
            }
            org.telegram.ui.Components.s40 s40Var2 = j60Var.n0;
            if (s40Var2 != null) {
                s40Var2.b(true);
                return;
            }
            return;
        }
        float dp = j60Var.y0 - AndroidUtilities.dp(74.0f);
        i11 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() || !p50Var.canScrollVertically(1)) {
            return;
        }
        p50Var.getChildAt(0);
        org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) p50Var.K(0);
        if (fl0Var != null) {
            View view = fl0Var.a;
            if (view.getTop() > 0) {
                p50Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        j60 j60Var = this.a;
        if (j60Var.Q.getChildCount() <= 0 || (call = j60Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && j60Var.Y.N0() > j60Var.P.F - 5) {
            j60Var.a1.loadMembers(false);
        }
        j60.J0(j60Var);
        y50 y50Var = j60Var.U0;
        if (y50Var != null) {
            y50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.invalidate();
    }
}
