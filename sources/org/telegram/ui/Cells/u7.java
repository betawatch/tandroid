package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.b51;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u7 extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 G;
    public final /* synthetic */ w7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.H = w7Var;
        this.G = h6Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        w7 w7Var = this.H;
        b51 b51Var = w7Var.w;
        if (b51Var == null || !(b51Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
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
