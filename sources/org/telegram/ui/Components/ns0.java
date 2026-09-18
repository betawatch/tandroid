package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ns0 extends s4.n0 {
    public final /* synthetic */ gs0 a;
    public final /* synthetic */ kv0 b;

    public ns0(kv0 kv0Var, gs0 gs0Var) {
        this.b = kv0Var;
        this.a = gs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        gs0 gs0Var = this.a;
        if (gs0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            hs0 hs0Var = gs0Var.x;
            hs0Var.B1();
            if (S <= hs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = gs0Var.x.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.t7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        gs0Var.h.getClass();
        int S2 = RecyclerView.S(t7Var);
        int i10 = gs0Var.x.J;
        t7Var.a0 = S2 < i10;
        int i11 = S2 % i10;
        t7Var.V = i11 == 0;
        t7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
