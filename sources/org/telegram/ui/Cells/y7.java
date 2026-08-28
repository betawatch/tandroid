package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.p91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.Components.o9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 C;
    public final /* synthetic */ a8 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = a8Var;
        this.C = b6Var;
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        a8 a8Var = this.D;
        p91 p91Var = a8Var.v;
        if (p91Var == null || !(p91Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ih.l7 l7Var = a8Var.r;
        l7Var.a = false;
        l7Var.b = false;
        l7Var.v = true;
        l7Var.o = false;
        l7Var.z = 1;
        l7Var.J = this.C;
        ih.p7.h(0L, canvas, this.a, l7Var);
    }
}
