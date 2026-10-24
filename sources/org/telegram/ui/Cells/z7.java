package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.r91;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z7 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 G;
    public final /* synthetic */ b8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(b8 b8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = b8Var;
        this.G = g6Var;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        b8 b8Var = this.H;
        r91 r91Var = b8Var.v;
        if (r91Var == null || !(r91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        b8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ci.x7 x7Var = b8Var.r;
        x7Var.a = false;
        x7Var.b = false;
        x7Var.v = true;
        x7Var.o = false;
        x7Var.z = 1;
        x7Var.J = this.G;
        ci.c8.h(0L, canvas, this.a, x7Var);
    }
}
