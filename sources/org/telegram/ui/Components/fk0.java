package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fk0 extends FrameLayout {
    public final Paint a;
    public final t30 b;
    public final RectF c;
    public final float d;
    public float e;

    public fk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        t30 t30Var = new t30(this, 1);
        this.b = t30Var;
        this.c = new RectF();
        this.d = (org.telegram.messenger.g0.L(3.0f) * 0.5f) + org.telegram.messenger.g0.L(5.0f);
        a(paint, 0.2f);
        a(t30Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f10) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f10 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float width = getWidth();
        float f10 = this.d;
        RectF rectF = this.c;
        rectF.set(f10, f10, width - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.b);
    }

    public Paint getPaint() {
        return this.b;
    }

    public void setProgress(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (this.e == max) {
            return;
        }
        this.e = max;
        invalidate();
    }
}
