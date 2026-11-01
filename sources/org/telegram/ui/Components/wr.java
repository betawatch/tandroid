package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wr {
    public int a;
    public int b;
    public rz0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static wr b(org.telegram.ui.Cells.v2 v2Var, org.telegram.messenger.bp bpVar) {
        wr wrVar = new wr();
        wrVar.a = bpVar.a;
        wrVar.b = bpVar.m;
        String str = bpVar.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        rz0 rz0Var = new rz0(spannableStringBuilder, 10.0f, org.telegram.messenger.i0.o());
        rz0Var.r(v2Var);
        wrVar.c = rz0Var;
        wrVar.c.q(org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, rz0Var.a.getFontMetricsInt(), false, null, 0), bpVar.c, wrVar.c.a.getFontMetricsInt(), false));
        wrVar.c.o(26);
        int L = org.telegram.messenger.i0.L(9.32f);
        rz0 rz0Var2 = wrVar.c;
        wrVar.g = L + ((int) rz0Var2.c);
        rz0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.t6.r8;
        int i10 = iArr[bpVar.m % iArr.length];
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
