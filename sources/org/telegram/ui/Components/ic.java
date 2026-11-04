package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ic extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Paint b = new Paint(1);
    public final ly0 c;
    public final Runnable d;
    public gc e;
    public Integer f;

    public ic(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = e6Var;
        this.d = runnable;
        this.c = new ly0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        ic icVar = new ic(charSequence, runnable, e6Var);
        spannableString.setSpan(icVar, 0, spannableString.length(), 33);
        icVar.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(hc hcVar, boolean z10) {
        if (this.e == null) {
            this.e = new gc(hcVar);
        }
        this.e.c(z10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float N = org.telegram.messenger.g0.N(17.0f);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = N / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        gc gcVar = this.e;
        float a10 = gcVar == null ? 1.0f : gcVar.a(0.025f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.a);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
