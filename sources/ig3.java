// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ig3 {
    public int a;
    public int b;
    public uib c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static ig3 b(hg3 hg3Var, ub7 ub7Var) {
        ig3 ig3Var = new ig3();
        ig3Var.a = ub7Var.a;
        ig3Var.b = ub7Var.m;
        String str = ub7Var.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        uib uibVar = new uib(spannableStringBuilder, 10.0f, gm.o());
        uibVar.q(hg3Var);
        ig3Var.c = uibVar;
        ig3Var.c.p(k47.A5(gw3.m(spannableStringBuilder, uibVar.a.getFontMetricsInt(), false, null, 0), ub7Var.c, ig3Var.c.a.getFontMetricsInt(), false));
        ig3Var.c.n(26);
        int L = gm.L(9.32f);
        uib uibVar2 = ig3Var.c;
        ig3Var.g = L + ((int) uibVar2.c);
        uibVar2.h();
        int[] iArr = cmb.q8;
        int i = iArr[ub7Var.m % iArr.length];
        ig3Var.f = i;
        ig3Var.e = true;
        ig3Var.d = cmb.w0(null, i, false);
        return ig3Var;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = cmb.w0(null, this.f, false);
        }
        cmb.z0.setColor(cmb.p1(cmb.I.o() ? 0.2f : 0.1f, this.d));
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, this.g, gm.L(14.66f));
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), cmb.z0);
        this.c.c(gm.L(4.66f), gm.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
