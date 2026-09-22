package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class os0 extends s4.n0 {
    public final /* synthetic */ hs0 a;
    public final /* synthetic */ lv0 b;

    public os0(lv0 lv0Var, hs0 hs0Var) {
        this.b = lv0Var;
        this.a = hs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        hs0 hs0Var = this.a;
        if (hs0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            is0 is0Var = hs0Var.x;
            is0Var.B1();
            if (S <= is0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = hs0Var.x.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.u7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        hs0Var.h.getClass();
        int S2 = RecyclerView.S(u7Var);
        int i10 = hs0Var.x.J;
        u7Var.a0 = S2 < i10;
        int i11 = S2 % i10;
        u7Var.V = i11 == 0;
        u7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
