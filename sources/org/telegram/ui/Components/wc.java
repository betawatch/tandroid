package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.c6 a;
    public final Paint b = new Paint(1);
    public final zz0 c;
    public final Runnable d;
    public uc e;
    public Integer f;

    public wc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = c6Var;
        this.d = runnable;
        this.c = new zz0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        wc wcVar = new wc(charSequence, runnable, c6Var);
        spannableString.setSpan(wcVar, 0, spannableString.length(), 33);
        wcVar.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + AndroidUtilities.dp(14.0f));
    }

    public final void c(vc vcVar, boolean z10) {
        if (this.e == null) {
            this.e = new uc(vcVar);
        }
        this.e.c(z10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = dpf2 / 2.0f;
        rectF.set(f9, f10 - f11, a() + f9, f10 + f11);
        uc ucVar = this.e;
        float a2 = ucVar == null ? 1.0f : ucVar.a(0.025f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.a);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.c.c(f9 + AndroidUtilities.dp(7.0f), f10, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
