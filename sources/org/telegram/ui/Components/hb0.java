package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hb0 extends s4.m0 {
    public final /* synthetic */ ib0 a;

    public hb0(ib0 ib0Var) {
        this.a = ib0Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        jb0 jb0Var = this.a.c3;
        if (layoutManager != jb0Var.d || (R = RecyclerView.R(view)) == 0 || jb0Var.f.N()) {
            return;
        }
        if (jb0Var.f.I() == null && jb0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            cb0 cb0Var = jb0Var.d;
            cb0Var.B1();
            if (R > cb0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = jb0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
