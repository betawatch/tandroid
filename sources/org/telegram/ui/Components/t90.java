package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t90 extends v4.o0 {
    public final /* synthetic */ u90 a;

    public t90(u90 u90Var) {
        this.a = u90Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.p0 layoutManager = recyclerView.getLayoutManager();
        v90 v90Var = this.a.j3;
        if (layoutManager != v90Var.d || (R = RecyclerView.R(view)) == 0 || v90Var.f.N()) {
            return;
        }
        if (v90Var.f.I() == null && v90Var.f.V == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            o90 o90Var = v90Var.d;
            o90Var.B1();
            if (R > o90Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = v90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
