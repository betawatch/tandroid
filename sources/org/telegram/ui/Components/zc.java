package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.u6 a;
    public final Paint b = new Paint(1);
    public final q11 c;
    public final Runnable d;
    public xc e;
    public Integer f;

    public zc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = u6Var;
        this.d = runnable;
        this.c = new q11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        zc zcVar = new zc(charSequence, runnable, u6Var);
        spannableString.setSpan(zcVar, 0, spannableString.length(), 33);
        zcVar.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + AndroidUtilities.dp(14.0f));
    }

    public final void c(yc ycVar, boolean z10) {
        if (this.e == null) {
            this.e = new xc(ycVar);
        }
        this.e.c(z10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = dpf2 / 2.0f;
        rectF.set(f7, f10 - f11, a() + f7, f10 + f11);
        xc xcVar = this.e;
        float a2 = xcVar == null ? 1.0f : xcVar.a(0.025f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.a);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(o12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
