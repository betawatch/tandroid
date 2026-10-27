package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n2 extends ReplacementSpan {
    public final int a;

    public n2(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null) {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        if (fontMetricsInt != null) {
            int i12 = 1 - (fontMetricsInt.descent - fontMetricsInt.ascent);
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
            fontMetricsInt.ascent = -1;
            fontMetricsInt.top = -1;
        }
        return this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
