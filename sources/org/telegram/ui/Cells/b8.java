package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.cb1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ d8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(d8 d8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = d8Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        d8 d8Var = this.H;
        cb1 cb1Var = d8Var.v;
        if (cb1Var == null || !(cb1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        d8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        zh.x5 x5Var = d8Var.r;
        x5Var.a = false;
        x5Var.b = false;
        x5Var.v = true;
        x5Var.o = false;
        x5Var.z = 1;
        x5Var.J = this.G;
        zh.a6.h(0L, canvas, this.a, x5Var);
    }
}
