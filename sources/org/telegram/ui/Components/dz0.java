package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dz0 extends ReplacementSpan {
    public float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Paint d;

    public dz0(int i10, Paint paint, String str) {
        this.b = str;
        this.c = i10;
        this.d = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = (i12 + i14) / 2.0f;
        float L = org.telegram.messenger.i0.L(19.0f);
        paint.setColor(this.c);
        float f11 = L / 2.0f;
        canvas.drawRoundRect(f7, f10 - f11, f7 + this.a + org.telegram.messenger.i0.L(11.33f), f10 + f11, f11, f11, this.d);
        canvas.drawText(this.b, org.telegram.messenger.i0.N(5.66f) + f7, i14 - org.telegram.messenger.i0.L(6.0f), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float N = org.telegram.messenger.i0.N(11.33f);
        float measureText = paint.measureText(this.b);
        this.a = measureText;
        return (int) (N + measureText);
    }
}
