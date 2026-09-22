package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class sy0 extends uc0 {
    public final /* synthetic */ ty0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ty0 ty0Var, Context context) {
        super(context, 13, null);
        this.w0 = ty0Var;
    }

    @Override // org.telegram.ui.Components.uc0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        ty0 ty0Var = this.w0;
        ty0Var.d.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, ty0Var.d);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, ty0Var.d);
    }
}
