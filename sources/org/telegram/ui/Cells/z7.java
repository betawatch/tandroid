package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.o91;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        o91 o91Var = b8Var.v;
        if (o91Var == null || !(o91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
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
