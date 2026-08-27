package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g00 extends View {
    public int A;
    public RectF B;
    public float C;
    public ValueAnimator D;
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
            this.C = z10 ? 1.0f : 0.0f;
            return;
        }
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.D.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, z10 ? 1.0f : 0.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 24));
        this.D.setDuration(300L);
        this.D.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i10 = this.w;
        RectF rectF = this.B;
        Paint paint = this.h;
        Paint paint2 = this.n;
        Paint paint3 = this.f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f11 = this.C;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.r) + ((int) ((Color.red(this.s) - Color.red(this.r)) * f10)), Color.green(this.r) + ((int) ((Color.green(this.s) - Color.green(this.r)) * f10)), Color.blue(this.r) + ((int) ((Color.blue(this.s) - Color.blue(this.r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.s) + ((int) ((Color.red(this.v) - Color.red(this.s)) * f10)), Color.green(this.s) + ((int) ((Color.green(this.v) - Color.green(this.s)) * f10)), Color.blue(this.s) + ((int) ((Color.blue(this.v) - Color.blue(this.s)) * f10))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.C / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.C > 0.5f) {
            paint2.setColor(this.v);
            float f13 = 1.0f - f12;
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dpf2(7.0f) - (AndroidUtilities.dp(4.0f) * f13)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(4.0f) * f13)), paint2);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(8.0f) * f13) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(8.0f) * f13)), paint2);
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
        RectF rectF = this.B;
        int i12 = this.A;
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
