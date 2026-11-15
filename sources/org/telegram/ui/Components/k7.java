package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k7 extends uj0 {
    public boolean f3;
    public final /* synthetic */ y7 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(y7 y7Var, Context context) {
        super(context, null);
        this.g3 = y7Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean E0(float f10) {
        y7 y7Var = this.g3;
        return f10 < y7Var.y1.getY() - ((float) y7Var.s1.getTop());
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y7 y7Var = this.g3;
        int i13 = y7Var.m2;
        if (i13 != -1 && !y7Var.n1.o0) {
            this.f3 = true;
            y7Var.t1.h1(i13, y7Var.n2 - y7Var.s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f3 = false;
            y7Var.m2 = -1;
            return;
        }
        if (y7Var.l2) {
            y7Var.l2 = false;
            this.f3 = true;
            if (y7Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f3 = false;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
