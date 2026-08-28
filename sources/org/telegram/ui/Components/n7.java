package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n7 extends wk0 {
    public boolean T2;
    public final /* synthetic */ c8 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(c8 c8Var, Context context) {
        super(context, null);
        this.U2 = c8Var;
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean E0(float f10) {
        c8 c8Var = this.U2;
        return f10 < c8Var.A.getY() - ((float) c8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        c8 c8Var = this.U2;
        int i13 = c8Var.o0;
        if (i13 != -1 && !c8Var.c.j0) {
            this.T2 = true;
            c8Var.r.h1(i13, c8Var.p0 - c8Var.n.getPaddingTop());
            super.onLayout(false, i9, i10, i11, i12);
            this.T2 = false;
            c8Var.o0 = -1;
            return;
        }
        if (c8Var.n0) {
            c8Var.n0 = false;
            this.T2 = true;
            if (c8Var.v0(true)) {
                super.onLayout(false, i9, i10, i11, i12);
            }
            this.T2 = false;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
