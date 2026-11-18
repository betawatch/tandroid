package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wv extends v4.o0 {
    public final /* synthetic */ ry a;

    public wv(ry ryVar) {
        this.a = ryVar;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R = RecyclerView.R(view);
        ry ryVar = this.a;
        v4.i0 adapter = ryVar.i0.getAdapter();
        vx vxVar = ryVar.o0;
        if (adapter == vxVar && R == vxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            vxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        wx wxVar = ryVar.j0;
        vxVar.getClass();
        rect.right = wxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
