package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fb0 extends org.telegram.ui.ActionBar.h5 {
    public final Paint I0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.J0 = b6Var;
        this.I0 = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K5, this.J0);
        Paint paint = this.I0;
        paint.setColor(v02);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
