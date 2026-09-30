package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class za0 extends s4.n0 {
    public final /* synthetic */ ab0 a;

    public za0(ab0 ab0Var) {
        this.a = ab0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        bb0 bb0Var = this.a.b3;
        if (layoutManager != bb0Var.d || (R = RecyclerView.R(view)) == 0 || bb0Var.f.N()) {
            return;
        }
        if (bb0Var.f.I() == null && bb0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ua0 ua0Var = bb0Var.d;
            ua0Var.B1();
            if (R > ua0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = bb0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
