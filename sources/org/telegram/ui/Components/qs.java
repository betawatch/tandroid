package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qs extends ReplacementSpan {
    public int b;
    public final Paint a = new Paint(1);
    public float c = 3.0f;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f10 + (AndroidUtilities.dpf2(this.c) / 2.0f), ((i13 - i11) / 2) + this.b, AndroidUtilities.dpf2(3.0f) / 2.0f, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.c);
    }
}
