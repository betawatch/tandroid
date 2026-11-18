package ai;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f2 extends ReplacementSpan {
    public final long a;
    public final int b;
    public int c;

    public f2(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        f2 f2Var = this;
        CharSequence charSequence2 = charSequence;
        long uptimeMillis = SystemClock.uptimeMillis();
        int color = paint.getColor();
        float f13 = i12;
        float textSize = f13 - (paint.getTextSize() * 0.35f);
        int i14 = f2Var.b;
        paint.setColor(i14);
        int i15 = i7;
        while (i15 < i10) {
            int charCount = Character.charCount(Character.codePointAt(charSequence2, i15)) + i15;
            while (charCount < i10 && Character.getType(charSequence2.charAt(charCount)) == 6) {
                charCount++;
            }
            float f14 = f13;
            float C = a8.p0.C((uptimeMillis - f2Var.a) - ((i15 - i7) * 22), 320.0f, 1.0f, 0.0f);
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
                    d2[] d2VarArr = (d2[]) ((Spanned) charSequence2).getSpans(i15, i15 + 1, d2.class);
                    int length = d2VarArr.length;
                    int i16 = 0;
                    float f18 = 1.0f;
                    while (i16 < length) {
                        d2[] d2VarArr2 = d2VarArr;
                        f18 *= d2VarArr2[i16].a(uptimeMillis);
                        i16++;
                        d2VarArr = d2VarArr2;
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
            f2Var = this;
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
