package ai;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i2 extends ReplacementSpan {
    public final long a;
    public final int b;
    public int c;

    public i2(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        i2 i2Var = this;
        CharSequence charSequence2 = charSequence;
        long uptimeMillis = SystemClock.uptimeMillis();
        int color = paint.getColor();
        float f13 = i12;
        float textSize = f13 - (paint.getTextSize() * 0.35f);
        int i14 = i2Var.b;
        paint.setColor(i14);
        int i15 = i7;
        while (i15 < i10) {
            int charCount = Character.charCount(Character.codePointAt(charSequence2, i15)) + i15;
            while (charCount < i10 && Character.getType(charSequence2.charAt(charCount)) == 6) {
                charCount++;
            }
            float f14 = f13;
            float C = a8.p0.C((uptimeMillis - i2Var.a) - ((i15 - i7) * 22), 320.0f, 1.0f, 0.0f);
            if (C > 0.0f) {
                float measureText = paint.measureText(charSequence2, i7, i15) + f10;
                float measureText2 = paint.measureText(charSequence2, i15, charCount);
                float f15 = C - 1.0f;
                float f16 = (((1.4f * f15 * f15) + (2.4f * f15 * f15 * f15) + 1.0f) * 0.39999998f) + 0.6f;
                float alpha = Color.alpha(i14);
                float min = 1.0f - Math.min(1.0f, C * 1.6f);
                float f17 = (1.0f - ((min * min) * min)) * alpha;
                if (charSequence2 instanceof Spanned) {
                    f11 = f17;
                    g2[] g2VarArr = (g2[]) ((Spanned) charSequence2).getSpans(i15, i15 + 1, g2.class);
                    int length = g2VarArr.length;
                    int i16 = 0;
                    float f18 = 1.0f;
                    while (i16 < length) {
                        g2[] g2VarArr2 = g2VarArr;
                        f18 *= g2VarArr2[i16].a(uptimeMillis);
                        i16++;
                        g2VarArr = g2VarArr2;
                    }
                    f12 = f18;
                } else {
                    f11 = f17;
                    f12 = 1.0f;
                }
                paint.setAlpha((int) (f11 * f12));
                canvas.save();
                canvas.scale(f16, f16, (measureText2 / 2.0f) + measureText, textSize);
                f13 = f14;
                canvas.drawText(charSequence2, i15, charCount, measureText, f13, paint);
                canvas.restore();
            } else {
                f13 = f14;
            }
            i2Var = this;
            charSequence2 = charSequence;
            i15 = charCount;
        }
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return Math.round(paint.measureText(charSequence, i7, i10));
    }
}
