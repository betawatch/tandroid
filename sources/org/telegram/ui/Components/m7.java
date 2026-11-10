package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m7 extends pj0 {
    public boolean e3;
    public final /* synthetic */ a8 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(a8 a8Var, Context context) {
        super(context, null);
        this.f3 = a8Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        a8 a8Var = this.f3;
        return f10 < a8Var.x1.getY() - ((float) a8Var.r1.getTop());
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a8 a8Var = this.f3;
        int i13 = a8Var.l2;
        if (i13 != -1 && !a8Var.m1.n0) {
            this.e3 = true;
            a8Var.s1.h1(i13, a8Var.m2 - a8Var.r1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.e3 = false;
            a8Var.l2 = -1;
            return;
        }
        if (a8Var.k2) {
            a8Var.k2 = false;
            this.e3 = true;
            if (a8Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.e3 = false;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
