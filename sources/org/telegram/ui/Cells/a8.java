package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.eb1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a8 extends org.telegram.ui.Components.z9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 G;
    public final /* synthetic */ c8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.H = c8Var;
        this.G = c6Var;
    }

    @Override // org.telegram.ui.Components.z9, android.view.View
    public final void onDraw(Canvas canvas) {
        c8 c8Var = this.H;
        eb1 eb1Var = c8Var.v;
        if (eb1Var == null || !(eb1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        c8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        bi.m9 m9Var = c8Var.r;
        m9Var.a = false;
        m9Var.b = false;
        m9Var.v = true;
        m9Var.o = false;
        m9Var.z = 1;
        m9Var.J = this.G;
        bi.s9.h(0L, canvas, this.a, m9Var);
    }
}
