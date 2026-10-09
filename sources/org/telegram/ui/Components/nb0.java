package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nb0 extends s4.o0 {
    public final /* synthetic */ ob0 a;

    public nb0(ob0 ob0Var) {
        this.a = ob0Var;
    }

    @Override // s4.o0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        pb0 pb0Var = this.a.Z2;
        if (layoutManager != pb0Var.d || (R = RecyclerView.R(view)) == 0 || pb0Var.f.N()) {
            return;
        }
        if (pb0Var.f.I() == null && pb0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ib0 ib0Var = pb0Var.d;
            ib0Var.B1();
            if (R > ib0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = pb0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
