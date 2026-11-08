package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mv extends v4.m0 {
    public final /* synthetic */ hy a;

    public mv(hy hyVar) {
        this.a = hyVar;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R = RecyclerView.R(view);
        hy hyVar = this.a;
        v4.g0 adapter = hyVar.h0.getAdapter();
        mx mxVar = hyVar.n0;
        if (adapter == mxVar && R == mxVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            mxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        nx nxVar = hyVar.i0;
        mxVar.getClass();
        rect.right = nxVar.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
