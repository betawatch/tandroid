package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class z7 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 G;
    public final /* synthetic */ b8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(b8 b8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = b8Var;
        this.G = d6Var;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        b8 b8Var = this.H;
        m91 m91Var = b8Var.v;
        if (m91Var == null || !(m91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        b8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ci.y7 y7Var = b8Var.r;
        y7Var.a = false;
        y7Var.b = false;
        y7Var.v = true;
        y7Var.o = false;
        y7Var.z = 1;
        y7Var.J = this.G;
        ci.d8.h(0L, canvas, this.a, y7Var);
    }
}
