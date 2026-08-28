package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dz0 extends ReplacementSpan {
    public float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Paint d;

    public dz0(int i9, Paint paint, String str) {
        this.b = str;
        this.c = i9;
        this.d = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = (i11 + i13) / 2.0f;
        float dp = AndroidUtilities.dp(19.0f);
        paint.setColor(this.c);
        float f12 = dp / 2.0f;
        canvas.drawRoundRect(f10, f11 - f12, f10 + this.a + AndroidUtilities.dp(11.33f), f11 + f12, f12, f12, this.d);
        canvas.drawText(this.b, AndroidUtilities.dpf2(5.66f) + f10, i13 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.b);
        this.a = measureText;
        return (int) (dpf2 + measureText);
    }
}
