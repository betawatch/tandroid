package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l7 extends tj0 {
    public boolean f3;
    public final /* synthetic */ z7 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(z7 z7Var, Context context) {
        super(context, null);
        this.g3 = z7Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean E0(float f10) {
        z7 z7Var = this.g3;
        return f10 < z7Var.v1.getY() - ((float) z7Var.p1.getTop());
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        z7 z7Var = this.g3;
        int i13 = z7Var.j2;
        if (i13 != -1 && !z7Var.k1.o0) {
            this.f3 = true;
            z7Var.q1.h1(i13, z7Var.k2 - z7Var.p1.getPaddingTop());
            super.onLayout(false, i3, i10, i11, i12);
            this.f3 = false;
            z7Var.j2 = -1;
            return;
        }
        if (z7Var.i2) {
            z7Var.i2 = false;
            this.f3 = true;
            if (z7Var.S0(true)) {
                super.onLayout(false, i3, i10, i11, i12);
            }
            this.f3 = false;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
