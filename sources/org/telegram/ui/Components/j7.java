package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j7 extends tk0 {
    public boolean e3;
    public final /* synthetic */ w7 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(w7 w7Var, Context context) {
        super(context, null);
        this.f3 = w7Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E0(float f7) {
        w7 w7Var = this.f3;
        return f7 < w7Var.u1.getY() - ((float) w7Var.o1.getTop());
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w7 w7Var = this.f3;
        int i14 = w7Var.i2;
        if (i14 != -1 && !w7Var.j1.n0) {
            this.e3 = true;
            w7Var.p1.h1(i14, w7Var.j2 - w7Var.o1.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.e3 = false;
            w7Var.i2 = -1;
            return;
        }
        if (w7Var.h2) {
            w7Var.h2 = false;
            this.e3 = true;
            if (w7Var.S0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.e3 = false;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
