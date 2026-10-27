package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p00 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.u6 a;
    public final Paint b;
    public final int c;
    public final org.telegram.ui.Components.r11 d;

    public p00(String str, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = u6Var;
        this.c = i10;
        this.d = new org.telegram.ui.Components.r11(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(this.c, this.a);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.15f, w02);
        Paint paint2 = this.b;
        paint2.setColor(o12);
        float f10 = (i14 + i12) / 2.0f;
        float dp = AndroidUtilities.dp(14.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = dp / 2.0f;
        rectF.set(f7, f10 - f11, this.d.l() + f7 + AndroidUtilities.dp(9.33f), f11 + f10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f7 + AndroidUtilities.dp(4.66f), f10, 1.0f, w02, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
