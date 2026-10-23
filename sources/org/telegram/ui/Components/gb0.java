package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gb0 extends s4.m0 {
    public final /* synthetic */ hb0 a;

    public gb0(hb0 hb0Var) {
        this.a = hb0Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        ib0 ib0Var = this.a.Z2;
        if (layoutManager != ib0Var.d || (R = RecyclerView.R(view)) == 0 || ib0Var.f.N()) {
            return;
        }
        if (ib0Var.f.I() == null && ib0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            bb0 bb0Var = ib0Var.d;
            bb0Var.B1();
            if (R > bb0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = ib0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
