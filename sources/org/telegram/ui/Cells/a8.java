package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a8 extends org.telegram.ui.Components.x9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ c8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = c8Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        c8 c8Var = this.H;
        ya1 ya1Var = c8Var.v;
        if (ya1Var == null || !(ya1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        c8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        bi.j9 j9Var = c8Var.r;
        j9Var.a = false;
        j9Var.b = false;
        j9Var.v = true;
        j9Var.o = false;
        j9Var.z = 1;
        j9Var.J = this.G;
        bi.p9.h(0L, canvas, this.a, j9Var);
    }
}
