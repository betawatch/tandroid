package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.o41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t7 extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 H;
    public final /* synthetic */ v7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(v7 v7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.I = v7Var;
        this.H = e6Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        v7 v7Var = this.I;
        o41 o41Var = v7Var.w;
        if (o41Var == null || !(o41Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        v7Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ei.o7 o7Var = v7Var.r;
        o7Var.a = false;
        o7Var.b = false;
        o7Var.v = true;
        o7Var.o = false;
        o7Var.z = 1;
        o7Var.J = this.H;
        ei.s7.h(0L, canvas, this.a, o7Var);
    }
}
