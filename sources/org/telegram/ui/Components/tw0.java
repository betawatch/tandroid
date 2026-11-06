package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class tw0 extends hb0 {
    public final /* synthetic */ uw0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(uw0 uw0Var, Context context) {
        super(13, context, null);
        this.y0 = uw0Var;
    }

    @Override // org.telegram.ui.Components.hb0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        uw0 uw0Var = this.y0;
        if (x02 != uw0Var.a) {
            uw0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        uw0Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, uw0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, uw0Var.e);
    }
}
