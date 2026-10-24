package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v7 extends mm0 {
    public boolean Y2;
    public final /* synthetic */ k8 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(k8 k8Var, Context context) {
        super(context, null);
        this.Z2 = k8Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        k8 k8Var = this.Z2;
        return f7 < k8Var.y.getY() - ((float) k8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.Z2;
        int i14 = k8Var.r0;
        if (i14 != -1 && !k8Var.c.n0) {
            this.Y2 = true;
            k8Var.r.h1(i14, k8Var.s0 - k8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.Y2 = false;
            k8Var.r0 = -1;
            return;
        }
        if (k8Var.q0) {
            k8Var.q0 = false;
            this.Y2 = true;
            if (k8Var.D0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.Y2 = false;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
