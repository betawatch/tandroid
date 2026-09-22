package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Paint b = new Paint(1);
    public final g01 c;
    public final Runnable d;
    public wc e;
    public Integer f;

    public yc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = e6Var;
        this.d = runnable;
        this.c = new g01(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        yc ycVar = new yc(charSequence, runnable, e6Var);
        spannableString.setSpan(ycVar, 0, spannableString.length(), 33);
        ycVar.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + AndroidUtilities.dp(14.0f));
    }

    public final void c(xc xcVar, boolean z10) {
        if (this.e == null) {
            this.e = new wc(xcVar);
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
        wc wcVar = this.e;
        float a2 = wcVar == null ? 1.0f : wcVar.a(0.025f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.a);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
