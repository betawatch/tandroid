package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ic1 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.x8 b;
    public org.telegram.ui.Components.my0 c;

    public ic1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(this, false);
        this.b = x8Var;
        x8Var.p = org.telegram.messenger.g0.L(100.0f);
        x8Var.o = org.telegram.messenger.g0.L(30.0f);
        x8Var.x = false;
        x8Var.s = org.telegram.messenger.g0.L(24.0f);
        x8Var.h(org.telegram.messenger.g0.L(18.0f));
        x8Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float L = org.telegram.messenger.g0.L(4.0f);
        org.telegram.ui.Components.x8 x8Var = this.b;
        float c10 = x8Var.c() + L + org.telegram.messenger.g0.L(7.0f) + this.c.c + org.telegram.messenger.g0.L(13.0f);
        float L2 = org.telegram.messenger.g0.L(30.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float f10 = L2 / 2.0f;
        canvas.drawRoundRect(rectF, f10, f10, this.a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        x8Var.g(canvas);
        canvas.translate(x8Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.c.c(0.0f, f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
