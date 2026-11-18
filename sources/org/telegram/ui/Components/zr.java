package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zr {
    public int a;
    public int b;
    public vy0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static zr b(org.telegram.ui.Cells.u2 u2Var, org.telegram.messenger.ro roVar) {
        zr zrVar = new zr();
        zrVar.a = roVar.a;
        zrVar.b = roVar.m;
        String str = roVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        vy0 vy0Var = new vy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        vy0Var.r(u2Var);
        zrVar.c = vy0Var;
        zrVar.c.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, vy0Var.a.getFontMetricsInt(), false, null, 0), roVar.c, zrVar.c.a.getFontMetricsInt(), false));
        zrVar.c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        vy0 vy0Var2 = zrVar.c;
        zrVar.g = L + ((int) vy0Var2.c);
        vy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.n6.r8;
        int i7 = iArr[roVar.m % iArr.length];
        zrVar.f = i7;
        zrVar.e = true;
        zrVar.d = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        return zrVar;
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
