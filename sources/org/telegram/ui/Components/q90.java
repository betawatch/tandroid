package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q90 extends v4.o0 {
    public final /* synthetic */ r90 a;

    public q90(r90 r90Var) {
        this.a = r90Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.p0 layoutManager = recyclerView.getLayoutManager();
        s90 s90Var = this.a.j3;
        if (layoutManager != s90Var.d || (R = RecyclerView.R(view)) == 0 || s90Var.f.N()) {
            return;
        }
        if (s90Var.f.I() == null && s90Var.f.V == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            l90 l90Var = s90Var.d;
            l90Var.B1();
            if (R > l90Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = s90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
