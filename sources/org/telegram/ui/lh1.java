package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lh1 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.b9 b;
    public org.telegram.ui.Components.nz0 c;

    public lh1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(this, false);
        this.b = b9Var;
        b9Var.p = AndroidUtilities.dp(100.0f);
        b9Var.o = AndroidUtilities.dp(30.0f);
        b9Var.x = false;
        b9Var.s = AndroidUtilities.dp(24.0f);
        b9Var.j(AndroidUtilities.dp(18.0f));
        b9Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float dp = AndroidUtilities.dp(4.0f);
        org.telegram.ui.Components.b9 b9Var = this.b;
        float e10 = b9Var.e() + dp + AndroidUtilities.dp(7.0f) + this.c.c + AndroidUtilities.dp(13.0f);
        float dp2 = AndroidUtilities.dp(30.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e10) / 2.0f, 0.0f, (getWidth() + e10) / 2.0f, getHeight());
        float f10 = dp2 / 2.0f;
        canvas.drawRoundRect(rectF, f10, f10, this.a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        b9Var.i(canvas);
        canvas.translate(b9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.c.c(0.0f, f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(30.0f));
    }
}
