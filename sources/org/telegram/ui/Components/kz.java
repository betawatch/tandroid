package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class kz extends View {
    public int D;
    public int E;
    public RectF F;
    public float G;
    public ValueAnimator H;
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

    public final void a(boolean z9, boolean z10) {
        this.b = z9;
        if (!this.a || !z10) {
            this.G = z9 ? 1.0f : 0.0f;
            return;
        }
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z9 ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 24));
        this.H.setDuration(300L);
        this.H.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i7 = this.x;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.n;
        Paint paint3 = this.f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f11 = this.G;
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
        canvas.drawRoundRect(rectF, i7 / 2.0f, i7 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i7 / 2.0f, i7 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.D) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.G / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, org.telegram.messenger.g0.N(7.0f), measuredHeight);
        canvas.translate(org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(9.0f));
        if (this.G > 0.5f) {
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
    public final void onMeasure(int i7, int i10) {
        Paint paint = this.h;
        RectF rectF = this.F;
        int i11 = this.E;
        String str = this.d;
        setMeasuredDimension((i11 * 2) + (str == null ? 0 : (int) this.e.measureText(str)) + (this.y << 1), org.telegram.messenger.g0.L(4.0f) + this.x);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i11, (paint.getStrokeWidth() / 2.0f) + i11);
        }
    }

    public void setChecked(boolean z9) {
        a(z9, true);
    }

    public void setText(String str) {
        this.d = str;
        requestLayout();
    }
}
