package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rv extends v4.n0 {
    public final /* synthetic */ ly a;

    public rv(ly lyVar) {
        this.a = lyVar;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int R = RecyclerView.R(view);
        ly lyVar = this.a;
        v4.h0 adapter = lyVar.i0.getAdapter();
        qx qxVar = lyVar.o0;
        if (adapter == qxVar && R == qxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            qxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        rx rxVar = lyVar.j0;
        qxVar.getClass();
        rect.right = rxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
