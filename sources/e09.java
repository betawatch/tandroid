// default package

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e09 extends MetricAffectingSpan implements LineHeightSpan {
    public f09 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        f09 f09Var = this.a;
        if (f09Var.b) {
            int i5 = f09Var.f ? 7 : 2;
            if (i <= f09Var.c) {
                fontMetricsInt.ascent -= gm.L((f09Var.n ? 2 : 0) + i5);
                fontMetricsInt.top -= gm.L((this.a.n ? 2 : 0) + i5);
            }
            if (i2 >= this.a.d) {
                float f = i5;
                fontMetricsInt.descent = gm.L(f) + fontMetricsInt.descent;
                fontMetricsInt.bottom = gm.L(f) + fontMetricsInt.bottom;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(gm.L(this.a.a ? 16.0f : gda.S0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(gm.L(this.a.a ? 16.0f : gda.S0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
