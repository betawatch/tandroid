package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n7 extends qj0 {
    public boolean e3;
    public final /* synthetic */ b8 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(b8 b8Var, Context context) {
        super(context, null);
        this.f3 = b8Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final boolean E0(float f10) {
        b8 b8Var = this.f3;
        return f10 < b8Var.u1.getY() - ((float) b8Var.o1.getTop());
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b8 b8Var = this.f3;
        int i13 = b8Var.i2;
        if (i13 != -1 && !b8Var.j1.n0) {
            this.e3 = true;
            b8Var.p1.h1(i13, b8Var.j2 - b8Var.o1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.e3 = false;
            b8Var.i2 = -1;
            return;
        }
        if (b8Var.h2) {
            b8Var.h2 = false;
            this.e3 = true;
            if (b8Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.e3 = false;
        }
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
