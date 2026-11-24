// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class imc extends ReplacementSpan {
    public static Typeface x;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final wjb e;
    public final TextPaint f;
    public final Paint h;
    public final RectF n;
    public LinearGradient r;
    public float s;
    public int w;

    public imc(String str, String str2, String str3, String str4, wjb wjbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.h = new Paint(1);
        this.n = new RectF();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = wjbVar;
        Typeface typeface = x;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fk.e();
                typeface = new Typeface.Builder(a.b.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                x = typeface;
            } else {
                typeface = gl.n1("fonts/rmono.ttf");
                x = typeface;
            }
        }
        textPaint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        float textSize = paint.getTextSize() * 0.95f;
        Paint paint2 = this.f;
        paint2.setTextSize(textSize);
        int color = paint.getColor();
        paint2.setColor(color);
        int v0 = bkb.v0(bkb.Z6, this.e);
        Paint paint3 = this.h;
        paint3.setColor(v0);
        Paint.FontMetricsInt fontMetricsInt = paint2.getFontMetricsInt();
        float f4 = i4;
        float f5 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + f4;
        float L = gl.L(6.0f);
        float L2 = gl.L(21.0f);
        float L3 = gl.L(5.0f);
        String str = this.a;
        float f6 = L2 / 2.0f;
        float f7 = f5 - f6;
        float f8 = 2.0f * L3;
        float measureText = paint2.measureText(str) + f + f8;
        float f9 = f5 + f6;
        RectF rectF = this.n;
        rectF.set(f, f7, measureText, f9);
        canvas.drawRoundRect(rectF, L, L, paint3);
        canvas.drawText(str, f + L3, f4, paint2);
        float L4 = gl.L(3.0f) + rectF.right;
        String str2 = this.b;
        float measureText2 = (paint2.measureText(" ") * 0.3f) + paint2.measureText(str2);
        String str3 = this.c;
        float measureText3 = paint2.measureText(str3) + measureText2;
        rectF.set(L4, f7, L4 + measureText3 + f8, f9);
        canvas.drawRoundRect(rectF, L, L, paint3);
        float f10 = L4 + L3;
        LinearGradient linearGradient = this.r;
        if (linearGradient != null && this.s == f10 && this.w == color) {
            f2 = f8;
            f3 = f10;
        } else {
            float max = Math.max(0.0f, Math.min(0.4f, paint2.measureText("0") / measureText3));
            f2 = f8;
            float min = Math.min(0.49f, ((0.5f - max) * 0.75f) + max);
            int p1 = bkb.p1(0.0f, color);
            linearGradient = new LinearGradient(f10, 0.0f, f10 + measureText3, 0.0f, new int[]{color, color, p1, p1, color, color}, new float[]{0.0f, max, min, 1.0f - min, 1.0f - max, 1.0f}, Shader.TileMode.CLAMP);
            f3 = f10;
            this.r = linearGradient;
            this.s = f3;
            this.w = color;
        }
        paint2.setShader(linearGradient);
        canvas.drawText(str2, f3, f4, paint2);
        canvas.drawText(str3, (f3 + measureText3) - paint2.measureText(str3), f4, paint2);
        paint2.setShader(null);
        float L5 = gl.L(3.0f) + rectF.right;
        String str4 = this.d;
        rectF.set(L5, f7, paint2.measureText(str4) + L5 + f2, f9);
        canvas.drawRoundRect(rectF, L, L, paint3);
        canvas.drawText(str4, L5 + L3, f4, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float textSize = paint.getTextSize() * 0.95f;
        TextPaint textPaint = this.f;
        textPaint.setTextSize(textSize);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            float f = (fontMetricsInt2.ascent + fontMetricsInt2.descent) / 2.0f;
            int floor = (int) Math.floor(f - (gl.L(21.0f) / 2.0f));
            fontMetricsInt.top = floor;
            fontMetricsInt.ascent = floor;
            int ceil = (int) Math.ceil((gl.L(21.0f) / 2.0f) + f);
            fontMetricsInt.bottom = ceil;
            fontMetricsInt.descent = ceil;
            fontMetricsInt.leading = 0;
        }
        float L = gl.L(5.0f) * 2.0f;
        return (int) Math.ceil((gl.L(3.0f) * 2.0f) + textPaint.measureText(this.d) + textPaint.measureText(this.c) + (textPaint.measureText(" ") * 0.3f) + textPaint.measureText(this.b) + textPaint.measureText(this.a) + L + L + L);
    }
}
