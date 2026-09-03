package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ka1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 D;
    public final /* synthetic */ a8 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = a8Var;
        this.D = g6Var;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        a8 a8Var = this.E;
        ka1 ka1Var = a8Var.v;
        if (ka1Var == null || !(ka1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        oh.i7 i7Var = a8Var.r;
        i7Var.a = false;
        i7Var.b = false;
        i7Var.v = true;
        i7Var.o = false;
        i7Var.z = 1;
        i7Var.J = this.D;
        oh.m7.h(0L, canvas, this.a, i7Var);
    }
}
