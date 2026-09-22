package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ns0 extends s4.n0 {
    public final /* synthetic */ hs0 a;

    public ns0(hs0 hs0Var) {
        this.a = hs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        if (!(view instanceof org.telegram.ui.Cells.u7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        hs0 hs0Var = this.a;
        hs0Var.r.getClass();
        int S = RecyclerView.S(u7Var);
        int i10 = hs0Var.s.J;
        u7Var.a0 = S < i10;
        int i11 = S % i10;
        u7Var.V = i11 == 0;
        u7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
