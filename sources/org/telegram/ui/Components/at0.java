package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class at0 extends s4.m0 {
    public final /* synthetic */ ts0 a;
    public final /* synthetic */ xv0 b;

    public at0(xv0 xv0Var, ts0 ts0Var) {
        this.b = xv0Var;
        this.a = ts0Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        ts0 ts0Var = this.a;
        if (ts0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            us0 us0Var = ts0Var.x;
            us0Var.B1();
            if (R <= us0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ts0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.s7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        ts0Var.h.getClass();
        int R2 = RecyclerView.R(s7Var);
        int i10 = ts0Var.x.J;
        s7Var.a0 = R2 < i10;
        int i11 = R2 % i10;
        s7Var.V = i11 == 0;
        s7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
