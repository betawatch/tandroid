package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r7 extends ck0 {
    public boolean f3;
    public final /* synthetic */ g8 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(g8 g8Var, Context context) {
        super(context, null);
        this.g3 = g8Var;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean E0(float f10) {
        g8 g8Var = this.g3;
        return f10 < g8Var.y1.getY() - ((float) g8Var.s1.getTop());
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g8 g8Var = this.g3;
        int i13 = g8Var.m2;
        if (i13 != -1 && !g8Var.n1.o0) {
            this.f3 = true;
            g8Var.t1.h1(i13, g8Var.n2 - g8Var.s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f3 = false;
            g8Var.m2 = -1;
            return;
        }
        if (g8Var.l2) {
            g8Var.l2 = false;
            this.f3 = true;
            if (g8Var.T0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f3 = false;
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
