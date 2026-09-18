package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class u7 extends wl0 {
    public boolean X2;
    public final /* synthetic */ j8 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(j8 j8Var, Context context) {
        super(context, null);
        this.Y2 = j8Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean F0(float f7) {
        j8 j8Var = this.Y2;
        return f7 < j8Var.E.getY() - ((float) j8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j8 j8Var = this.Y2;
        int i14 = j8Var.s0;
        if (i14 != -1 && !j8Var.c.n0) {
            this.X2 = true;
            j8Var.r.h1(i14, j8Var.t0 - j8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            j8Var.s0 = -1;
            return;
        }
        if (j8Var.r0) {
            j8Var.r0 = false;
            this.X2 = true;
            if (j8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.X2 = false;
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
