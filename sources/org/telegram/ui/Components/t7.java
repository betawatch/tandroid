package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class t7 extends vl0 {
    public boolean X2;
    public final /* synthetic */ i8 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(i8 i8Var, Context context) {
        super(context, null);
        this.Y2 = i8Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean F0(float f7) {
        i8 i8Var = this.Y2;
        return f7 < i8Var.E.getY() - ((float) i8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i8 i8Var = this.Y2;
        int i14 = i8Var.s0;
        if (i14 != -1 && !i8Var.c.n0) {
            this.X2 = true;
            i8Var.r.h1(i14, i8Var.t0 - i8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            i8Var.s0 = -1;
            return;
        }
        if (i8Var.r0) {
            i8Var.r0 = false;
            this.X2 = true;
            if (i8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.X2 = false;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
