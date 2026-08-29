package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lo0 extends org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ to0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(to0 to0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.U2 = to0Var;
        this.T2 = i10;
    }

    @Override // org.telegram.ui.Components.jl0
    public final Integer W0(int i10) {
        to0 to0Var = this.U2;
        if ((i10 < to0Var.P || i10 >= to0Var.Q) && (i10 < to0Var.R || i10 >= to0Var.S)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        O0(canvas, this.U2.P, Math.max(r0.S, r0.Q) - 1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.l2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        to0 to0Var = this.U2;
        yo0 yo0Var = to0Var.f0;
        to0.a(to0Var);
        if (to0Var.B != null) {
            if (to0Var.A == null || !to0Var.c()) {
                return;
            }
            to0Var.A.g(false);
            return;
        }
        jh.k7 k7Var = this.T2 == 1 ? yo0Var.c : yo0Var.b;
        if (k7Var == null || !to0Var.c()) {
            return;
        }
        k7Var.a();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        to0.a(this.U2);
    }
}
