package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.da1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 D;
    public final /* synthetic */ a8 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = a8Var;
        this.D = f6Var;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        a8 a8Var = this.E;
        da1 da1Var = a8Var.v;
        if (da1Var == null || !(da1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        nh.i7 i7Var = a8Var.r;
        i7Var.a = false;
        i7Var.b = false;
        i7Var.v = true;
        i7Var.o = false;
        i7Var.z = 1;
        i7Var.J = this.D;
        nh.m7.h(0L, canvas, this.a, i7Var);
    }
}
