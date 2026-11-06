package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e90 extends v4.m0 {
    public final /* synthetic */ f90 a;

    public e90(f90 f90Var) {
        this.a = f90Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.n0 layoutManager = recyclerView.getLayoutManager();
        g90 g90Var = this.a.i3;
        if (layoutManager != g90Var.d || (R = RecyclerView.R(view)) == 0 || g90Var.f.N()) {
            return;
        }
        if (g90Var.f.I() == null && g90Var.f.U == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            z80 z80Var = g90Var.d;
            z80Var.B1();
            if (R > z80Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = g90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
