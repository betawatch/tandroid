package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xv extends s4.m0 {
    public final /* synthetic */ vy a;

    public xv(vy vyVar) {
        this.a = vyVar;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R = RecyclerView.R(view);
        vy vyVar = this.a;
        s4.g0 adapter = vyVar.h0.getAdapter();
        zx zxVar = vyVar.n0;
        if (adapter == zxVar && R == zxVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            zxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.i0.L(2.0f);
        ay ayVar = vyVar.i0;
        zxVar.getClass();
        rect.right = ayVar.E1(R) ? 0 : org.telegram.messenger.i0.L(2.0f);
    }
}
