package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fs extends ReplacementSpan {
    public int b;
    public final Paint a = new Paint(1);
    public float c = 3.0f;
    public float d = 3.0f;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f10 + (org.telegram.messenger.g0.N(this.c) / 2.0f), ((i13 - i11) / 2) + this.b, org.telegram.messenger.g0.N(this.d) / 2.0f, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.c);
    }
}
