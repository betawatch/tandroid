package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.b6 a;
    public final Paint b = new Paint(1);
    public final nz0 c;
    public final Runnable d;
    public pc e;
    public Integer f;

    public rc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = b6Var;
        this.d = runnable;
        this.c = new nz0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        rc rcVar = new rc(charSequence, runnable, b6Var);
        spannableString.setSpan(rcVar, 0, spannableString.length(), 33);
        rcVar.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + AndroidUtilities.dp(14.0f));
    }

    public final void c(qc qcVar, boolean z10) {
        if (this.e == null) {
            this.e = new pc(qcVar);
        }
        this.e.c(z10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        pc pcVar = this.e;
        float a2 = pcVar == null ? 1.0f : pcVar.a(0.025f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.a);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.c.c(f10 + AndroidUtilities.dp(7.0f), f11, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
