package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m00 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.b6 a;
    public final Paint b;
    public final int c;
    public final org.telegram.ui.Components.nz0 d;

    public m00(String str, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = b6Var;
        this.c = i9;
        this.d = new org.telegram.ui.Components.nz0(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(this.c, this.a);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, v02);
        Paint paint2 = this.b;
        paint2.setColor(l1);
        float f11 = (i13 + i11) / 2.0f;
        float dp = AndroidUtilities.dp(14.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dp / 2.0f;
        rectF.set(f10, f11 - f12, this.d.l() + f10 + AndroidUtilities.dp(9.33f), f12 + f11);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f10 + AndroidUtilities.dp(4.66f), f11, 1.0f, v02, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
