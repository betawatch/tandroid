package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u7 extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ w7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = w7Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        w7 w7Var = this.H;
        z41 z41Var = w7Var.w;
        if (z41Var == null || !(z41Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        w7Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        di.n7 n7Var = w7Var.r;
        n7Var.a = false;
        n7Var.b = false;
        n7Var.v = true;
        n7Var.o = false;
        n7Var.z = 1;
        n7Var.J = this.G;
        di.r7.h(0L, canvas, this.a, n7Var);
    }
}
