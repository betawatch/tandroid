package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mb0 extends s4.m0 {
    public final /* synthetic */ nb0 a;

    public mb0(nb0 nb0Var) {
        this.a = nb0Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        ob0 ob0Var = this.a.Z2;
        if (layoutManager != ob0Var.d || (R = RecyclerView.R(view)) == 0 || ob0Var.f.N()) {
            return;
        }
        if (ob0Var.f.I() == null && ob0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            hb0 hb0Var = ob0Var.d;
            hb0Var.B1();
            if (R > hb0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = ob0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
