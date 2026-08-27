package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n7 extends zk0 {
    public boolean T2;
    public final /* synthetic */ b8 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(b8 b8Var, Context context) {
        super(context, null);
        this.U2 = b8Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean E0(float f10) {
        b8 b8Var = this.U2;
        return f10 < b8Var.A.getY() - ((float) b8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b8 b8Var = this.U2;
        int i14 = b8Var.o0;
        if (i14 != -1 && !b8Var.c.j0) {
            this.T2 = true;
            b8Var.r.h1(i14, b8Var.p0 - b8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.T2 = false;
            b8Var.o0 = -1;
            return;
        }
        if (b8Var.n0) {
            b8Var.n0 = false;
            this.T2 = true;
            if (b8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.T2 = false;
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
