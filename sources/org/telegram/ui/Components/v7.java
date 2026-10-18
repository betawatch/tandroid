package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class v7 extends im0 {
    public boolean V2;
    public final /* synthetic */ k8 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(k8 k8Var, Context context) {
        super(context, null);
        this.W2 = k8Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean E0(float f7) {
        k8 k8Var = this.W2;
        return f7 < k8Var.E.getY() - ((float) k8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.W2;
        int i14 = k8Var.s0;
        if (i14 != -1 && !k8Var.c.n0) {
            this.V2 = true;
            k8Var.r.h1(i14, k8Var.t0 - k8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.V2 = false;
            k8Var.s0 = -1;
            return;
        }
        if (k8Var.r0) {
            k8Var.r0 = false;
            this.V2 = true;
            if (k8Var.x0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.V2 = false;
        }
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
