package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class oa implements LeadingMarginSpan {
    public final int a;
    public final int b;

    public oa(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z9, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i14) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                i13 -= layout.getLineForOffset(i14) != layout.getLineCount() + (-1) ? (int) layout.getSpacingAdd() : 0;
            }
            canvas.drawCircle((i10 * r7) + i7, (i11 + i13) / 2.0f, this.b, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z9) {
        return (this.b * 2) + this.a;
    }
}
