package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q7 extends ek0 {
    public boolean f3;
    public final /* synthetic */ e8 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(e8 e8Var, Context context) {
        super(context, null);
        this.g3 = e8Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean E0(float f10) {
        e8 e8Var = this.g3;
        return f10 < e8Var.y1.getY() - ((float) e8Var.s1.getTop());
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e8 e8Var = this.g3;
        int i13 = e8Var.m2;
        if (i13 != -1 && !e8Var.n1.o0) {
            this.f3 = true;
            e8Var.t1.h1(i13, e8Var.n2 - e8Var.s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f3 = false;
            e8Var.m2 = -1;
            return;
        }
        if (e8Var.l2) {
            e8Var.l2 = false;
            this.f3 = true;
            if (e8Var.T0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f3 = false;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
