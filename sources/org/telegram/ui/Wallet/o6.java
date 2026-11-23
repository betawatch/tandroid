package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class o6 extends ReplacementSpan {
    public static Typeface x;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final org.telegram.ui.ActionBar.h6 e;
    public final TextPaint f;
    public final Paint h;
    public final RectF n;
    public LinearGradient r;
    public float s;
    public int w;

    public o6(String str, String str2, String str3, String str4, org.telegram.ui.ActionBar.h6 h6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.h = new Paint(1);
        this.n = new RectF();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h6Var;
        if (x == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                x = new Typeface.Builder(org.telegram.messenger.t0.b.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                x = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        textPaint.setTypeface(x);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        float textSize = paint.getTextSize() * 0.95f;
        TextPaint textPaint = this.f;
        textPaint.setTextSize(textSize);
        int color = paint.getColor();
        textPaint.setColor(color);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.e);
        Paint paint2 = this.h;
        paint2.setColor(w02);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        float f13 = i12;
        float f14 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + f13;
        float L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(21.0f);
        float L3 = org.telegram.messenger.g0.L(5.0f);
        String str = this.a;
        float f15 = L2 / 2.0f;
        float f16 = f14 - f15;
        float f17 = 2.0f * L3;
        float measureText = textPaint.measureText(str) + f10 + f17;
        float f18 = f14 + f15;
        RectF rectF = this.n;
        rectF.set(f10, f16, measureText, f18);
        canvas.drawRoundRect(rectF, L, L, paint2);
        canvas.drawText(str, f10 + L3, f13, textPaint);
        float L4 = org.telegram.messenger.g0.L(3.0f) + rectF.right;
        String str2 = this.b;
        float measureText2 = (textPaint.measureText(" ") * 0.3f) + textPaint.measureText(str2);
        String str3 = this.c;
        float measureText3 = textPaint.measureText(str3) + measureText2;
        rectF.set(L4, f16, L4 + measureText3 + f17, f18);
        canvas.drawRoundRect(rectF, L, L, paint2);
        float f19 = L4 + L3;
        if (this.r != null && this.s == f19 && this.w == color) {
            f11 = f17;
            f12 = f19;
        } else {
            float max = Math.max(0.0f, Math.min(0.4f, textPaint.measureText("0") / measureText3));
            f11 = f17;
            float min = Math.min(0.49f, ((0.5f - max) * 0.75f) + max);
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.0f, color);
            f12 = f19;
            this.r = new LinearGradient(f19, 0.0f, f19 + measureText3, 0.0f, new int[]{color, color, r12, r12, color, color}, new float[]{0.0f, max, min, 1.0f - min, 1.0f - max, 1.0f}, Shader.TileMode.CLAMP);
            this.s = f12;
            this.w = color;
        }
        textPaint.setShader(this.r);
        canvas.drawText(str2, f12, f13, textPaint);
        canvas.drawText(str3, (f12 + measureText3) - textPaint.measureText(str3), f13, textPaint);
        textPaint.setShader(null);
        float L5 = org.telegram.messenger.g0.L(3.0f) + rectF.right;
        String str4 = this.d;
        rectF.set(L5, f16, textPaint.measureText(str4) + L5 + f11, f18);
        canvas.drawRoundRect(rectF, L, L, paint2);
        canvas.drawText(str4, L5 + L3, f13, textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float textSize = paint.getTextSize() * 0.95f;
        TextPaint textPaint = this.f;
        textPaint.setTextSize(textSize);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            float f10 = (fontMetricsInt2.ascent + fontMetricsInt2.descent) / 2.0f;
            int floor = (int) Math.floor(f10 - (org.telegram.messenger.g0.L(21.0f) / 2.0f));
            fontMetricsInt.top = floor;
            fontMetricsInt.ascent = floor;
            int ceil = (int) Math.ceil((org.telegram.messenger.g0.L(21.0f) / 2.0f) + f10);
            fontMetricsInt.bottom = ceil;
            fontMetricsInt.descent = ceil;
            fontMetricsInt.leading = 0;
        }
        float L = org.telegram.messenger.g0.L(5.0f) * 2.0f;
        return (int) Math.ceil((org.telegram.messenger.g0.L(3.0f) * 2.0f) + textPaint.measureText(this.d) + textPaint.measureText(this.c) + (textPaint.measureText(" ") * 0.3f) + textPaint.measureText(this.b) + textPaint.measureText(this.a) + L + L + L);
    }
}
