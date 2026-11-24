// default package

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dy8 extends MetricAffectingSpan implements LineHeightSpan {
    public ey8 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        ey8 ey8Var = this.a;
        if (ey8Var.b) {
            int i5 = ey8Var.f ? 7 : 2;
            if (i <= ey8Var.c) {
                fontMetricsInt.ascent -= gl.L((ey8Var.n ? 2 : 0) + i5);
                fontMetricsInt.top -= gl.L((this.a.n ? 2 : 0) + i5);
            }
            if (i2 >= this.a.d) {
                float f = i5;
                fontMetricsInt.descent = gl.L(f) + fontMetricsInt.descent;
                fontMetricsInt.bottom = gl.L(f) + fontMetricsInt.bottom;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(gl.L(this.a.a ? 16.0f : gba.S0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(gl.L(this.a.a ? 16.0f : gba.S0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
