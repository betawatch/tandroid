package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yr {
    public int a;
    public int b;
    public wy0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static yr b(org.telegram.ui.Cells.u2 u2Var, org.telegram.messenger.ro roVar) {
        yr yrVar = new yr();
        yrVar.a = roVar.a;
        yrVar.b = roVar.m;
        String str = roVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        wy0 wy0Var = new wy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        wy0Var.r(u2Var);
        yrVar.c = wy0Var;
        yrVar.c.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, wy0Var.a.getFontMetricsInt(), false, null, 0), roVar.c, yrVar.c.a.getFontMetricsInt(), false));
        yrVar.c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        wy0 wy0Var2 = yrVar.c;
        yrVar.g = L + ((int) wy0Var2.c);
        wy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.n6.r8;
        int i7 = iArr[roVar.m % iArr.length];
        yrVar.f = i7;
        yrVar.e = true;
        yrVar.d = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        return yrVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.n6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.n6.A0.setColor(org.telegram.ui.ActionBar.n6.r1(org.telegram.ui.ActionBar.n6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.A0);
        this.c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
