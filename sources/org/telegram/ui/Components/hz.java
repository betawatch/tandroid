package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hz extends View {
    public int E;
    public int F;
    public RectF G;
    public float H;
    public ValueAnimator I;
    public boolean a;
    public boolean b;
    public boolean c;
    public String d;
    public TextPaint e;
    public Paint f;
    public Paint h;
    public Paint n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public final void a(boolean z10, boolean z11) {
        this.b = z10;
        if (!this.a || !z11) {
            this.H = z10 ? 1.0f : 0.0f;
            return;
        }
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z10 ? 1.0f : 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 24));
        this.I.setDuration(300L);
        this.I.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i3 = this.x;
        RectF rectF = this.G;
        Paint paint = this.h;
        Paint paint2 = this.n;
        Paint paint3 = this.f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f11 = this.H;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.r) + ((int) ((Color.red(this.s) - Color.red(this.r)) * f10)), Color.green(this.r) + ((int) ((Color.green(this.s) - Color.green(this.r)) * f10)), Color.blue(this.r) + ((int) ((Color.blue(this.s) - Color.blue(this.r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.s) + ((int) ((Color.red(this.w) - Color.red(this.s)) * f10)), Color.green(this.s) + ((int) ((Color.green(this.w) - Color.green(this.s)) * f10)), Color.blue(this.s) + ((int) ((Color.blue(this.w) - Color.blue(this.s)) * f10))));
        } else {
            textPaint.setColor(this.w);
            paint3.setColor(this.s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.s);
        canvas.drawRoundRect(rectF, i3 / 2.0f, i3 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i3 / 2.0f, i3 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.E) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.H / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, org.telegram.messenger.g0.N(7.0f), measuredHeight);
        canvas.translate(org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(9.0f));
        if (this.H > 0.5f) {
            paint2.setColor(this.w);
            float f13 = 1.0f - f12;
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.N(7.0f) - (org.telegram.messenger.g0.L(4.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(4.0f) * f13)), paint2);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(8.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(8.0f) * f13)), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        Paint paint = this.h;
        RectF rectF = this.G;
        int i11 = this.F;
        String str = this.d;
        setMeasuredDimension((i11 * 2) + (str == null ? 0 : (int) this.e.measureText(str)) + (this.y << 1), org.telegram.messenger.g0.L(4.0f) + this.x);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i11, (paint.getStrokeWidth() / 2.0f) + i11);
        }
    }

    public void setChecked(boolean z10) {
        a(z10, true);
    }

    public void setText(String str) {
        this.d = str;
        requestLayout();
    }
}
