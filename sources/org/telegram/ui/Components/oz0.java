package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class oz0 extends gd0 {
    public final /* synthetic */ pz0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz0(pz0 pz0Var, Context context) {
        super(context, 13, null);
        this.w0 = pz0Var;
    }

    @Override // org.telegram.ui.Components.gd0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        pz0 pz0Var = this.w0;
        pz0Var.d.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, pz0Var.d);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, pz0Var.d);
    }
}
