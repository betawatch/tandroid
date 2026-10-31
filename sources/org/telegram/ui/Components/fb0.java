package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fb0 extends org.telegram.ui.ActionBar.u5 {
    public final Paint M0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.N0 = p6Var;
        this.M0 = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.K5, this.N0);
        Paint paint = this.M0;
        paint.setColor(w02);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - org.telegram.messenger.i0.L(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + org.telegram.messenger.i0.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
