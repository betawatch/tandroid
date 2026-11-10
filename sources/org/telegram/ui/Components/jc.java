package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.h6 a;
    public final Paint b = new Paint(1);
    public final my0 c;
    public final Runnable d;
    public hc e;
    public Integer f;

    public jc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = h6Var;
        this.d = runnable;
        this.c = new my0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        jc jcVar = new jc(charSequence, runnable, h6Var);
        spannableString.setSpan(jcVar, 0, spannableString.length(), 33);
        jcVar.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(ic icVar, boolean z9) {
        if (this.e == null) {
            this.e = new hc(icVar);
        }
        this.e.c(z9);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float N = org.telegram.messenger.g0.N(17.0f);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = N / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        hc hcVar = this.e;
        float a10 = hcVar == null ? 1.0f : hcVar.a(0.025f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.a);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
