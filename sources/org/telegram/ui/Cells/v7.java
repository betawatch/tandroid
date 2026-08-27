package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.n91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v7 extends org.telegram.ui.Components.n9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 C;
    public final /* synthetic */ x7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(x7 x7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = x7Var;
        this.C = c6Var;
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        x7 x7Var = this.D;
        n91 n91Var = x7Var.v;
        if (n91Var == null || !(n91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        x7Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        jh.h7 h7Var = x7Var.r;
        h7Var.a = false;
        h7Var.b = false;
        h7Var.v = true;
        h7Var.o = false;
        h7Var.z = 1;
        h7Var.J = this.C;
        jh.l7.h(0L, canvas, this.a, h7Var);
    }
}
