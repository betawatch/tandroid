package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s2 extends ReplacementSpan {
    public final int a;

    public s2(int i7) {
        this.a = i7;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null) {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        if (fontMetricsInt != null) {
            int i11 = 1 - (fontMetricsInt.descent - fontMetricsInt.ascent);
            fontMetricsInt.descent = i11;
            fontMetricsInt.bottom = i11;
            fontMetricsInt.ascent = -1;
            fontMetricsInt.top = -1;
        }
        return this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
