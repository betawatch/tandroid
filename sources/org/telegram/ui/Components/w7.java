package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w7 extends qm0 {
    public boolean V2;
    public final /* synthetic */ l8 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(l8 l8Var, Context context) {
        super(context, null);
        this.W2 = l8Var;
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean E0(float f7) {
        l8 l8Var = this.W2;
        return f7 < l8Var.E.getY() - ((float) l8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        l8 l8Var = this.W2;
        int i14 = l8Var.s0;
        if (i14 != -1 && !l8Var.c.n0) {
            this.V2 = true;
            l8Var.r.h1(i14, l8Var.t0 - l8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.V2 = false;
            l8Var.s0 = -1;
            return;
        }
        if (l8Var.r0) {
            l8Var.r0 = false;
            this.V2 = true;
            if (l8Var.x0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.V2 = false;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
