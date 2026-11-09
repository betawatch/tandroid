package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.a51;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u7 extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 G;
    public final /* synthetic */ w7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = w7Var;
        this.G = g6Var;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        w7 w7Var = this.H;
        a51 a51Var = w7Var.w;
        if (a51Var == null || !(a51Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        w7Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        di.o7 o7Var = w7Var.r;
        o7Var.a = false;
        o7Var.b = false;
        o7Var.v = true;
        o7Var.o = false;
        o7Var.z = 1;
        o7Var.J = this.G;
        di.s7.h(0L, canvas, this.a, o7Var);
    }
}
