package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class xa0 extends s4.n0 {
    public final /* synthetic */ ya0 a;

    public xa0(ya0 ya0Var) {
        this.a = ya0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        za0 za0Var = this.a.b3;
        if (layoutManager != za0Var.d || (R = RecyclerView.R(view)) == 0 || za0Var.f.N()) {
            return;
        }
        if (za0Var.f.I() == null && za0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            sa0 sa0Var = za0Var.d;
            sa0Var.B1();
            if (R > sa0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = za0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
