package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lv extends v4.m0 {
    public final /* synthetic */ gy a;

    public lv(gy gyVar) {
        this.a = gyVar;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R = RecyclerView.R(view);
        gy gyVar = this.a;
        v4.g0 adapter = gyVar.h0.getAdapter();
        lx lxVar = gyVar.n0;
        if (adapter == lxVar && R == lxVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            lxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        mx mxVar = gyVar.i0;
        lxVar.getClass();
        rect.right = mxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
