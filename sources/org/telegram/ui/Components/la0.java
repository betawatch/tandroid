package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class la0 extends s4.n0 {
    public final /* synthetic */ ma0 a;

    public la0(ma0 ma0Var) {
        this.a = ma0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        na0 na0Var = this.a.b3;
        if (layoutManager != na0Var.d || (R = RecyclerView.R(view)) == 0 || na0Var.f.N()) {
            return;
        }
        if (na0Var.f.I() == null && na0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ga0 ga0Var = na0Var.d;
            ga0Var.B1();
            if (R > ga0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = na0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
