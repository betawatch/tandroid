package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s7 extends ml0 {
    public boolean X2;
    public final /* synthetic */ h8 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(h8 h8Var, Context context) {
        super(context, null);
        this.Y2 = h8Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean F0(float f7) {
        h8 h8Var = this.Y2;
        return f7 < h8Var.E.getY() - ((float) h8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        h8 h8Var = this.Y2;
        int i14 = h8Var.s0;
        if (i14 != -1 && !h8Var.c.n0) {
            this.X2 = true;
            h8Var.r.h1(i14, h8Var.t0 - h8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            h8Var.s0 = -1;
            return;
        }
        if (h8Var.r0) {
            h8Var.r0 = false;
            this.X2 = true;
            if (h8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.X2 = false;
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
