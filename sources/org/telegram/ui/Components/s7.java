package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s7 extends jl0 {
    public boolean T2;
    public final /* synthetic */ g8 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(g8 g8Var, Context context) {
        super(context, null);
        this.U2 = g8Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean E0(float f9) {
        g8 g8Var = this.U2;
        return f9 < g8Var.A.getY() - ((float) g8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g8 g8Var = this.U2;
        int i14 = g8Var.o0;
        if (i14 != -1 && !g8Var.c.j0) {
            this.T2 = true;
            g8Var.r.h1(i14, g8Var.p0 - g8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.T2 = false;
            g8Var.o0 = -1;
            return;
        }
        if (g8Var.n0) {
            g8Var.n0 = false;
            this.T2 = true;
            if (g8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.T2 = false;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
