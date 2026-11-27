// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mf3 extends ReplacementSpan {
    public final int a;

    public mf3(int i) {
        this.a = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null) {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        if (fontMetricsInt != null) {
            int i3 = 1 - (fontMetricsInt.descent - fontMetricsInt.ascent);
            fontMetricsInt.descent = i3;
            fontMetricsInt.bottom = i3;
            fontMetricsInt.ascent = -1;
            fontMetricsInt.top = -1;
        }
        return this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
