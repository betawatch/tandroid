package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i81 extends ReplacementSpan {
    public final org.telegram.ui.Components.nz0 a = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
    public final Paint b = new Paint(1);
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;

    public i81(org.telegram.ui.ActionBar.b6 b6Var) {
        this.c = b6Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float dp = ((i11 + i13) / 2.0f) + AndroidUtilities.dp(1.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.c);
        Paint paint2 = this.b;
        paint2.setColor(v02);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, dp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f10 + this.a.c, AndroidUtilities.dp(9.0f) + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
        this.a.c(f10 + AndroidUtilities.dp(8.0f), dp, 1.0f, -1, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(16.0f) + this.a.c);
    }
}
