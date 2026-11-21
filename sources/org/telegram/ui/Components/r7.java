package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r7 extends ek0 {
    public boolean f3;
    public final /* synthetic */ f8 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(f8 f8Var, Context context) {
        super(context, null);
        this.g3 = f8Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean E0(float f10) {
        f8 f8Var = this.g3;
        return f10 < f8Var.y1.getY() - ((float) f8Var.s1.getTop());
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        f8 f8Var = this.g3;
        int i13 = f8Var.m2;
        if (i13 != -1 && !f8Var.n1.o0) {
            this.f3 = true;
            f8Var.t1.h1(i13, f8Var.n2 - f8Var.s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f3 = false;
            f8Var.m2 = -1;
            return;
        }
        if (f8Var.l2) {
            f8Var.l2 = false;
            this.f3 = true;
            if (f8Var.T0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f3 = false;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
