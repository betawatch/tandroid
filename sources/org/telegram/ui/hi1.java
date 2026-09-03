package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hi1 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.c9 b;
    public org.telegram.ui.Components.k01 c;

    public hi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.b = c9Var;
        c9Var.p = AndroidUtilities.dp(100.0f);
        c9Var.o = AndroidUtilities.dp(30.0f);
        c9Var.x = false;
        c9Var.s = AndroidUtilities.dp(24.0f);
        c9Var.j(AndroidUtilities.dp(18.0f));
        c9Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float dp = AndroidUtilities.dp(4.0f);
        org.telegram.ui.Components.c9 c9Var = this.b;
        float e = c9Var.e() + dp + AndroidUtilities.dp(7.0f) + this.c.c + AndroidUtilities.dp(13.0f);
        float dp2 = AndroidUtilities.dp(30.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float f10 = dp2 / 2.0f;
        canvas.drawRoundRect(rectF, f10, f10, this.a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        c9Var.i(canvas);
        canvas.translate(c9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.c.c(0.0f, f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
