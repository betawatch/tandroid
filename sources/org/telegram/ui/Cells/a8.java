package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.pa1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class a8 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 G;
    public final /* synthetic */ c8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = c8Var;
        this.G = d6Var;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        c8 c8Var = this.H;
        pa1 pa1Var = c8Var.v;
        if (pa1Var == null || !(pa1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        c8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ai.ca caVar = c8Var.r;
        caVar.a = false;
        caVar.b = false;
        caVar.v = true;
        caVar.o = false;
        caVar.z = 1;
        caVar.J = this.G;
        ai.ia.h(0L, canvas, this.a, caVar);
    }
}
