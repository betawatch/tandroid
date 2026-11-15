package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sr {
    public int a;
    public int b;
    public oy0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static sr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.so soVar) {
        sr srVar = new sr();
        srVar.a = soVar.a;
        srVar.b = soVar.m;
        String str = soVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        oy0 oy0Var = new oy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        oy0Var.r(t2Var);
        srVar.c = oy0Var;
        srVar.c.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, oy0Var.a.getFontMetricsInt(), false, null, 0), soVar.c, srVar.c.a.getFontMetricsInt(), false));
        srVar.c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        oy0 oy0Var2 = srVar.c;
        srVar.g = L + ((int) oy0Var2.c);
        oy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.j6.r8;
        int i7 = iArr[soVar.m % iArr.length];
        srVar.f = i7;
        srVar.e = true;
        srVar.d = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        return srVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.j6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.j6.A0.setColor(org.telegram.ui.ActionBar.j6.r1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
