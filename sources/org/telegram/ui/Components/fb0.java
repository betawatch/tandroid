package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fb0 extends s4.n0 {
    public final /* synthetic */ gb0 a;

    public fb0(gb0 gb0Var) {
        this.a = gb0Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        hb0 hb0Var = this.a.j3;
        if (layoutManager != hb0Var.d || (R = RecyclerView.R(view)) == 0 || hb0Var.f.N()) {
            return;
        }
        if (hb0Var.f.I() == null && hb0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ab0 ab0Var = hb0Var.d;
            ab0Var.C1();
            if (R > ab0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = hb0Var.d.F1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
