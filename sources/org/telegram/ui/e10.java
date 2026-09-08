package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e10 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Paint b;
    public final int c;
    public final org.telegram.ui.Components.f01 d;

    public e10(String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f6Var;
        this.c = i10;
        this.d = new org.telegram.ui.Components.f01(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(this.c, this.a);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, v02);
        Paint paint2 = this.b;
        paint2.setColor(l1);
        float f10 = (i14 + i12) / 2.0f;
        float dp = AndroidUtilities.dp(14.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = dp / 2.0f;
        rectF.set(f7, f10 - f11, this.d.l() + f7 + AndroidUtilities.dp(9.33f), f11 + f10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f7 + AndroidUtilities.dp(4.66f), f10, 1.0f, v02, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
