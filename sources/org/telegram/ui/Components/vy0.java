package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vy0 extends yc0 {
    public final /* synthetic */ wy0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(wy0 wy0Var, Context context) {
        super(context, 13, null);
        this.t0 = wy0Var;
    }

    @Override // org.telegram.ui.Components.yc0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        wy0 wy0Var = this.t0;
        wy0Var.d.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, wy0Var.d);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, wy0Var.d);
    }
}
