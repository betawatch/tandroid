package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vz0 extends ReplacementSpan {
    public float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Paint d;

    public vz0(int i10, Paint paint, String str) {
        this.b = str;
        this.c = i10;
        this.d = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = (i12 + i14) / 2.0f;
        float dp = AndroidUtilities.dp(19.0f);
        paint.setColor(this.c);
        float f11 = dp / 2.0f;
        canvas.drawRoundRect(f7, f10 - f11, f7 + this.a + AndroidUtilities.dp(11.33f), f10 + f11, f11, f11, this.d);
        canvas.drawText(this.b, AndroidUtilities.dpf2(5.66f) + f7, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.b);
        this.a = measureText;
        return (int) (dpf2 + measureText);
    }
}
