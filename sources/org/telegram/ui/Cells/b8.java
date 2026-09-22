package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.Components.v9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ d8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(d8 d8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = d8Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
    public final void onDraw(Canvas canvas) {
        d8 d8Var = this.H;
        ya1 ya1Var = d8Var.v;
        if (ya1Var == null || !(ya1Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        d8Var.r.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ai.ca caVar = d8Var.r;
        caVar.a = false;
        caVar.b = false;
        caVar.v = true;
        caVar.o = false;
        caVar.z = 1;
        caVar.J = this.G;
        ai.ia.h(0L, canvas, this.a, caVar);
    }
}
