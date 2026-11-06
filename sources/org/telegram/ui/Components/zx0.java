package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zx0 extends ReplacementSpan {
    public float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Paint d;

    public zx0(int i7, Paint paint, String str) {
        this.b = str;
        this.c = i7;
        this.d = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = (i11 + i13) / 2.0f;
        float L = org.telegram.messenger.g0.L(19.0f);
        paint.setColor(this.c);
        float f12 = L / 2.0f;
        canvas.drawRoundRect(f10, f11 - f12, f10 + this.a + org.telegram.messenger.g0.L(11.33f), f11 + f12, f12, f12, this.d);
        canvas.drawText(this.b, org.telegram.messenger.g0.N(5.66f) + f10, i13 - org.telegram.messenger.g0.L(6.0f), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float N = org.telegram.messenger.g0.N(11.33f);
        float measureText = paint.measureText(this.b);
        this.a = measureText;
        return (int) (N + measureText);
    }
}
