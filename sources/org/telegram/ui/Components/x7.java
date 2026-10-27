package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x7 extends nm0 {
    public boolean f3;
    public final /* synthetic */ m8 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(m8 m8Var, Context context) {
        super(context, null);
        this.g3 = m8Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean E0(float f7) {
        m8 m8Var = this.g3;
        return f7 < m8Var.y.getY() - ((float) m8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.g3;
        int i14 = m8Var.r0;
        if (i14 != -1 && !m8Var.c.n0) {
            this.f3 = true;
            m8Var.r.h1(i14, m8Var.s0 - m8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.f3 = false;
            m8Var.r0 = -1;
            return;
        }
        if (m8Var.q0) {
            m8Var.q0 = false;
            this.f3 = true;
            if (m8Var.D0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.f3 = false;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
