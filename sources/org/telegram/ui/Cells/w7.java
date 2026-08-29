package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w7 extends org.telegram.ui.Components.t9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 C;
    public final /* synthetic */ y7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(y7 y7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = y7Var;
        this.C = c6Var;
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        y7 y7Var = this.D;
        q91 q91Var = y7Var.v;
        if (q91Var == null || !(q91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        y7Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        lh.h7 h7Var = y7Var.r;
        h7Var.a = false;
        h7Var.b = false;
        h7Var.v = true;
        h7Var.o = false;
        h7Var.z = 1;
        h7Var.J = this.C;
        lh.l7.h(0L, canvas, this.a, h7Var);
    }
}
