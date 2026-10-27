package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.v91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d8 extends org.telegram.ui.Components.y9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 G;
    public final /* synthetic */ f8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(f8 f8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.H = f8Var;
        this.G = u6Var;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        f8 f8Var = this.H;
        v91 v91Var = f8Var.v;
        if (v91Var == null || !(v91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        f8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        di.w7 w7Var = f8Var.r;
        w7Var.a = false;
        w7Var.b = false;
        w7Var.v = true;
        w7Var.o = false;
        w7Var.z = 1;
        w7Var.J = this.G;
        di.a8.h(0L, canvas, this.a, w7Var);
    }
}
