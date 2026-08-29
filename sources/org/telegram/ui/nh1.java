package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nh1 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.g9 b;
    public org.telegram.ui.Components.zz0 c;

    public nh1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this, false);
        this.b = g9Var;
        g9Var.p = AndroidUtilities.dp(100.0f);
        g9Var.o = AndroidUtilities.dp(30.0f);
        g9Var.x = false;
        g9Var.s = AndroidUtilities.dp(24.0f);
        g9Var.j(AndroidUtilities.dp(18.0f));
        g9Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float dp = AndroidUtilities.dp(4.0f);
        org.telegram.ui.Components.g9 g9Var = this.b;
        float e10 = g9Var.e() + dp + AndroidUtilities.dp(7.0f) + this.c.c + AndroidUtilities.dp(13.0f);
        float dp2 = AndroidUtilities.dp(30.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e10) / 2.0f, 0.0f, (getWidth() + e10) / 2.0f, getHeight());
        float f9 = dp2 / 2.0f;
        canvas.drawRoundRect(rectF, f9, f9, this.a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        g9Var.i(canvas);
        canvas.translate(g9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.c.c(0.0f, f9, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
