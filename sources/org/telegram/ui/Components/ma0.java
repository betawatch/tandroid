package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ma0 extends s4.n0 {
    public final /* synthetic */ na0 a;

    public ma0(na0 na0Var) {
        this.a = na0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        oa0 oa0Var = this.a.b3;
        if (layoutManager != oa0Var.d || (R = RecyclerView.R(view)) == 0 || oa0Var.f.N()) {
            return;
        }
        if (oa0Var.f.I() == null && oa0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ha0 ha0Var = oa0Var.d;
            ha0Var.B1();
            if (R > ha0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = oa0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
