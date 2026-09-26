package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jc0 extends org.telegram.ui.ActionBar.h5 {
    public final Paint M0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.N0 = d6Var;
        this.M0 = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.K5, this.N0);
        Paint paint = this.M0;
        paint.setColor(v02);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
