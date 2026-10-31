package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jl0 extends FrameLayout {
    public final Paint a;
    public final l40 b;
    public final RectF c;
    public final float d;
    public float e;

    public jl0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        l40 l40Var = new l40(this, 1);
        this.b = l40Var;
        this.c = new RectF();
        this.d = (org.telegram.messenger.i0.L(3.0f) * 0.5f) + org.telegram.messenger.i0.L(5.0f);
        a(paint, 0.2f);
        a(l40Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f7) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f7 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float width = getWidth();
        float f7 = this.d;
        RectF rectF = this.c;
        rectF.set(f7, f7, width - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.b);
    }

    public Paint getPaint() {
        return this.b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.e == max) {
            return;
        }
        this.e = max;
        invalidate();
    }
}
