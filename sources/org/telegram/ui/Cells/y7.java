package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.r61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.Components.g9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 G;
    public final /* synthetic */ a8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.H = a8Var;
        this.G = p6Var;
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        a8 a8Var = this.H;
        r61 r61Var = a8Var.w;
        if (r61Var == null || !(r61Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.i0.L(1.0f);
        a8Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        th.t5 t5Var = a8Var.r;
        t5Var.a = false;
        t5Var.b = false;
        t5Var.v = true;
        t5Var.o = false;
        t5Var.z = 1;
        t5Var.J = this.G;
        th.w5.h(0L, canvas, this.a, t5Var);
    }
}
