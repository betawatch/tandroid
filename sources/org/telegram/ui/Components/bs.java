package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bs {
    public int a;
    public int b;
    public xy0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static bs b(org.telegram.ui.Cells.u2 u2Var, org.telegram.messenger.so soVar) {
        bs bsVar = new bs();
        bsVar.a = soVar.a;
        bsVar.b = soVar.m;
        String str = soVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        xy0 xy0Var = new xy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        xy0Var.r(u2Var);
        bsVar.c = xy0Var;
        bsVar.c.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, xy0Var.a.getFontMetricsInt(), false, null, 0), soVar.c, bsVar.c.a.getFontMetricsInt(), false));
        bsVar.c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        xy0 xy0Var2 = bsVar.c;
        bsVar.g = L + ((int) xy0Var2.c);
        xy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.m6.r8;
        int i7 = iArr[soVar.m % iArr.length];
        bsVar.f = i7;
        bsVar.e = true;
        bsVar.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        return bsVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.m6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.m6.A0.setColor(org.telegram.ui.ActionBar.m6.r1(org.telegram.ui.ActionBar.m6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.A0);
        this.c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
