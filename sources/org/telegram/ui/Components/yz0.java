package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yz0 extends md0 {
    public final /* synthetic */ zz0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0(zz0 zz0Var, Context context) {
        super(context, 13, null);
        this.y0 = zz0Var;
    }

    @Override // org.telegram.ui.Components.md0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false);
        zz0 zz0Var = this.y0;
        if (x02 != zz0Var.a) {
            zz0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        zz0Var.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, zz0Var.e);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, zz0Var.e);
    }
}
