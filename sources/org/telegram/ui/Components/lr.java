package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lr {
    public int a;
    public int b;
    public my0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static lr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        lr lrVar = new lr();
        lrVar.a = voVar.a;
        lrVar.b = voVar.m;
        String str = voVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        my0 my0Var = new my0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        my0Var.r(t2Var);
        lrVar.c = my0Var;
        lrVar.c.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, my0Var.a.getFontMetricsInt(), false, null, 0), voVar.c, lrVar.c.a.getFontMetricsInt(), false));
        lrVar.c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        my0 my0Var2 = lrVar.c;
        lrVar.g = L + ((int) my0Var2.c);
        my0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.m6.r8;
        int i7 = iArr[voVar.m % iArr.length];
        lrVar.f = i7;
        lrVar.e = true;
        lrVar.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        return lrVar;
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
