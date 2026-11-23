package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wv extends v4.o0 {
    public final /* synthetic */ qy a;

    public wv(qy qyVar) {
        this.a = qyVar;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R = RecyclerView.R(view);
        qy qyVar = this.a;
        v4.i0 adapter = qyVar.i0.getAdapter();
        ux uxVar = qyVar.o0;
        if (adapter == uxVar && R == uxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            uxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        vx vxVar = qyVar.j0;
        uxVar.getClass();
        rect.right = vxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
