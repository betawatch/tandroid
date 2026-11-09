package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mr {
    public int a;
    public int b;
    public ny0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        mr mrVar = new mr();
        mrVar.a = voVar.a;
        mrVar.b = voVar.m;
        String str = voVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        ny0 ny0Var = new ny0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        ny0Var.r(t2Var);
        mrVar.c = ny0Var;
        mrVar.c.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, ny0Var.a.getFontMetricsInt(), false, null, 0), voVar.c, mrVar.c.a.getFontMetricsInt(), false));
        mrVar.c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        ny0 ny0Var2 = mrVar.c;
        mrVar.g = L + ((int) ny0Var2.c);
        ny0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.l6.r8;
        int i7 = iArr[voVar.m % iArr.length];
        mrVar.f = i7;
        mrVar.e = true;
        mrVar.d = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        return mrVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.l6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.l6.A0.setColor(org.telegram.ui.ActionBar.l6.r1(org.telegram.ui.ActionBar.l6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.l6.A0);
        this.c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
