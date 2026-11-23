package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zv extends v4.o0 {
    public final /* synthetic */ ty a;

    public zv(ty tyVar) {
        this.a = tyVar;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R = RecyclerView.R(view);
        ty tyVar = this.a;
        v4.i0 adapter = tyVar.i0.getAdapter();
        xx xxVar = tyVar.o0;
        if (adapter == xxVar && R == xxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            xxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        yx yxVar = tyVar.j0;
        xxVar.getClass();
        rect.right = yxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
