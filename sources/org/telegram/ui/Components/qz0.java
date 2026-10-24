package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qz0 extends qd0 {
    public final /* synthetic */ rz0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(rz0 rz0Var, Context context) {
        super(context, 13, null);
        this.y0 = rz0Var;
    }

    @Override // org.telegram.ui.Components.qd0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        rz0 rz0Var = this.y0;
        if (x02 != rz0Var.a) {
            rz0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        rz0Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, rz0Var.e);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, rz0Var.e);
    }
}
