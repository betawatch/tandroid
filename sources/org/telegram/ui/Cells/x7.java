package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.la1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x7 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 D;
    public final /* synthetic */ z7 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(z7 z7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = z7Var;
        this.D = f6Var;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        z7 z7Var = this.E;
        la1 la1Var = z7Var.v;
        if (la1Var == null || !(la1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        z7Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        nh.i7 i7Var = z7Var.r;
        i7Var.a = false;
        i7Var.b = false;
        i7Var.v = true;
        i7Var.o = false;
        i7Var.z = 1;
        i7Var.J = this.D;
        nh.m7.h(0L, canvas, this.a, i7Var);
    }
}
