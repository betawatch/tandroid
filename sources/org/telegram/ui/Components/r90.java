package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r90 extends v4.o0 {
    public final /* synthetic */ s90 a;

    public r90(s90 s90Var) {
        this.a = s90Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.p0 layoutManager = recyclerView.getLayoutManager();
        t90 t90Var = this.a.j3;
        if (layoutManager != t90Var.d || (R = RecyclerView.R(view)) == 0 || t90Var.f.N()) {
            return;
        }
        if (t90Var.f.I() == null && t90Var.f.V == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            m90 m90Var = t90Var.d;
            m90Var.B1();
            if (R > m90Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = t90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
