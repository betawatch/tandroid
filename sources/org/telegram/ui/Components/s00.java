package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class s00 extends View {
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
    public int v;
    public int w;
    public int x;
    public int y;

    public final void a(boolean z10, boolean z11) {
        this.b = z10;
        if (!this.a || !z11) {
            this.G = z10 ? 1.0f : 0.0f;
            return;
        }
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z10 ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 24));
        this.H.setDuration(300L);
        this.H.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int i10 = this.w;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.n;
        Paint paint3 = this.f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f10 = this.G;
        if (f10 <= 0.5f) {
            f7 = f10 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.r) + ((int) ((Color.red(this.s) - Color.red(this.r)) * f7)), Color.green(this.r) + ((int) ((Color.green(this.s) - Color.green(this.r)) * f7)), Color.blue(this.r) + ((int) ((Color.blue(this.s) - Color.blue(this.r)) * f7))));
            textPaint.setColor(Color.rgb(Color.red(this.s) + ((int) ((Color.red(this.v) - Color.red(this.s)) * f7)), Color.green(this.s) + ((int) ((Color.green(this.v) - Color.green(this.s)) * f7)), Color.blue(this.s) + ((int) ((Color.blue(this.v) - Color.blue(this.s)) * f7))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.s);
            f7 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f7 * this.y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f11 = 2.0f - (this.G / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.G > 0.5f) {
            paint2.setColor(this.v);
            float f12 = 1.0f - f11;
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dpf2(7.0f) - (AndroidUtilities.dp(4.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(4.0f) * f12)), paint2);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(8.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(8.0f) * f12)), paint2);
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
    public final void onMeasure(int i10, int i11) {
        Paint paint = this.h;
        RectF rectF = this.F;
        int i12 = this.E;
        String str = this.d;
        setMeasuredDimension((i12 * 2) + (str == null ? 0 : (int) this.e.measureText(str)) + (this.x << 1), AndroidUtilities.dp(4.0f) + this.w);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i12, (paint.getStrokeWidth() / 2.0f) + i12);
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
