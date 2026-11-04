package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kv extends u4.n0 {
    public final /* synthetic */ ey a;

    public kv(ey eyVar) {
        this.a = eyVar;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int R = RecyclerView.R(view);
        ey eyVar = this.a;
        u4.h0 adapter = eyVar.i0.getAdapter();
        jx jxVar = eyVar.o0;
        if (adapter == jxVar && R == jxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            jxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        kx kxVar = eyVar.j0;
        jxVar.getClass();
        rect.right = kxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
