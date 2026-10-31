package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wr {
    public int a;
    public int b;
    public qz0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static wr b(org.telegram.ui.Cells.v2 v2Var, org.telegram.messenger.ap apVar) {
        wr wrVar = new wr();
        wrVar.a = apVar.a;
        wrVar.b = apVar.m;
        String str = apVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        qz0 qz0Var = new qz0(spannableStringBuilder, 10.0f, org.telegram.messenger.i0.o());
        qz0Var.r(v2Var);
        wrVar.c = qz0Var;
        wrVar.c.q(org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, qz0Var.a.getFontMetricsInt(), false, null, 0), apVar.c, wrVar.c.a.getFontMetricsInt(), false));
        wrVar.c.o(26);
        int L = org.telegram.messenger.i0.L(9.32f);
        qz0 qz0Var2 = wrVar.c;
        wrVar.g = L + ((int) qz0Var2.c);
        qz0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.t6.r8;
        int i10 = iArr[apVar.m % iArr.length];
        wrVar.f = i10;
        wrVar.e = true;
        wrVar.d = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        return wrVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.t6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.t6.A0.setColor(org.telegram.ui.ActionBar.t6.r1(org.telegram.ui.ActionBar.t6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, this.g, org.telegram.messenger.i0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.A0);
        this.c.c(org.telegram.messenger.i0.L(4.66f), org.telegram.messenger.i0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
