package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ae1 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.t8 b;
    public org.telegram.ui.Components.qz0 c;

    public ae1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(this, false);
        this.b = t8Var;
        t8Var.p = org.telegram.messenger.i0.L(100.0f);
        t8Var.o = org.telegram.messenger.i0.L(30.0f);
        t8Var.x = false;
        t8Var.s = org.telegram.messenger.i0.L(24.0f);
        t8Var.h(org.telegram.messenger.i0.L(18.0f));
        t8Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float L = org.telegram.messenger.i0.L(4.0f);
        org.telegram.ui.Components.t8 t8Var = this.b;
        float c10 = t8Var.c() + L + org.telegram.messenger.i0.L(7.0f) + this.c.c + org.telegram.messenger.i0.L(13.0f);
        float L2 = org.telegram.messenger.i0.L(30.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float f7 = L2 / 2.0f;
        canvas.drawRoundRect(rectF, f7, f7, this.a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.i0.L(4.0f), 0.0f);
        t8Var.g(canvas);
        canvas.translate(t8Var.A + org.telegram.messenger.i0.L(7.0f), 0.0f);
        this.c.c(0.0f, f7, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(30.0f));
    }
}
