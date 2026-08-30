package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class na0 extends f2.u0 {
    public final /* synthetic */ oa0 a;

    public na0(oa0 oa0Var) {
        this.a = oa0Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.v0 layoutManager = recyclerView.getLayoutManager();
        pa0 pa0Var = this.a.Y2;
        if (layoutManager != pa0Var.d || (R = RecyclerView.R(view)) == 0 || pa0Var.f.N()) {
            return;
        }
        if (pa0Var.f.I() == null && pa0Var.f.R == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ia0 ia0Var = pa0Var.d;
            ia0Var.B1();
            if (R > ia0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = pa0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
