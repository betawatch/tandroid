package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x7 extends mm0 {
    public boolean V2;
    public final /* synthetic */ m8 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(m8 m8Var, Context context) {
        super(context, null);
        this.W2 = m8Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        m8 m8Var = this.W2;
        return f7 < m8Var.E.getY() - ((float) m8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.W2;
        int i14 = m8Var.s0;
        if (i14 != -1 && !m8Var.c.n0) {
            this.V2 = true;
            m8Var.r.h1(i14, m8Var.t0 - m8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.V2 = false;
            m8Var.s0 = -1;
            return;
        }
        if (m8Var.r0) {
            m8Var.r0 = false;
            this.V2 = true;
            if (m8Var.x0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.V2 = false;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
