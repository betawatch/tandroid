package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o7 extends tl0 {
    public boolean U2;
    public final /* synthetic */ c8 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(c8 c8Var, Context context) {
        super(context, null);
        this.V2 = c8Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean E0(float f10) {
        c8 c8Var = this.V2;
        return f10 < c8Var.B.getY() - ((float) c8Var.n.getTop());
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        c8 c8Var = this.V2;
        int i14 = c8Var.p0;
        if (i14 != -1 && !c8Var.c.k0) {
            this.U2 = true;
            c8Var.r.h1(i14, c8Var.q0 - c8Var.n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.U2 = false;
            c8Var.p0 = -1;
            return;
        }
        if (c8Var.o0) {
            c8Var.o0 = false;
            this.U2 = true;
            if (c8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.U2 = false;
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
