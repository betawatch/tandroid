// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class on3 extends ReplacementSpan {
    public final long a;
    public final int b;
    public int c;

    public on3(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        on3 on3Var = this;
        CharSequence charSequence2 = charSequence;
        long uptimeMillis = SystemClock.uptimeMillis();
        int color = paint.getColor();
        float f4 = i4;
        float textSize = f4 - (paint.getTextSize() * 0.35f);
        int i6 = on3Var.b;
        paint.setColor(i6);
        int i7 = i;
        while (i7 < i2) {
            int charCount = Character.charCount(Character.codePointAt(charSequence2, i7)) + i7;
            while (charCount < i2 && Character.getType(charSequence2.charAt(charCount)) == 6) {
                charCount++;
            }
            float f5 = f4;
            float w = ls6.w((uptimeMillis - on3Var.a) - ((i7 - i) * 22), 320.0f, 1.0f, 0.0f);
            if (w > 0.0f) {
                float measureText = paint.measureText(charSequence2, i, i7) + f;
                float measureText2 = paint.measureText(charSequence2, i7, charCount);
                float f6 = w - 1.0f;
                float f7 = (((1.4f * f6 * f6) + (2.4f * f6 * f6 * f6) + 1.0f) * 0.39999998f) + 0.6f;
                float alpha = Color.alpha(i6);
                float min = 1.0f - Math.min(1.0f, w * 1.6f);
                float f8 = (1.0f - ((min * min) * min)) * alpha;
                if (charSequence2 instanceof Spanned) {
                    f2 = f8;
                    mn3[] mn3VarArr = (mn3[]) ((Spanned) charSequence2).getSpans(i7, i7 + 1, mn3.class);
                    int length = mn3VarArr.length;
                    int i8 = 0;
                    float f9 = 1.0f;
                    while (i8 < length) {
                        mn3[] mn3VarArr2 = mn3VarArr;
                        f9 *= mn3VarArr2[i8].a(uptimeMillis);
                        i8++;
                        mn3VarArr = mn3VarArr2;
                    }
                    f3 = f9;
                } else {
                    f2 = f8;
                    f3 = 1.0f;
                }
                paint.setAlpha((int) (f2 * f3));
                canvas.save();
                canvas.scale(f7, f7, (measureText2 / 2.0f) + measureText, textSize);
                f4 = f5;
                canvas.drawText(charSequence2, i7, charCount, measureText, f4, paint);
                canvas.restore();
            } else {
                f4 = f5;
            }
            on3Var = this;
            charSequence2 = charSequence;
            i7 = charCount;
        }
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return Math.round(paint.measureText(charSequence, i, i2));
    }
}
