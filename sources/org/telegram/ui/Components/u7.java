package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class u7 extends zl0 {
    public boolean e3;
    public final /* synthetic */ j8 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(j8 j8Var, Context context) {
        super(context, null);
        this.f3 = j8Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        j8 j8Var = this.f3;
        return f7 < j8Var.E.getY() - ((float) j8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j8 j8Var = this.f3;
        int i14 = j8Var.s0;
        if (i14 != -1 && !j8Var.c.n0) {
            this.e3 = true;
            j8Var.r.h1(i14, j8Var.t0 - j8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.e3 = false;
            j8Var.s0 = -1;
            return;
        }
        if (j8Var.r0) {
            j8Var.r0 = false;
            this.e3 = true;
            if (j8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.e3 = false;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
