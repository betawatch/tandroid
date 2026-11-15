package g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.iz;
import org.telegram.ui.o30;
import org.telegram.ui.p30;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public View i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.b = -1;
        this.c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        Paint paint = (Paint) this.d;
        canvas.save();
        oy0 oy0Var = (oy0) this.f;
        oy0Var.p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(i0.a.f(f11, this.b, j6.x0(null, j6.kh, false)));
        float d = ((u5) this.j).d(this.a);
        float k10 = oy0Var.k() + g0.L(86.0f) + g0.L(14.0f);
        float L = g0.L(28.0f);
        float L2 = g0.L(232.0f);
        float i7 = ((oy0) this.g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L2, f11);
        float T12 = g0.T1(L, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L3 = g0.L(18.0f);
        int L4 = g0.L(30.0f);
        int i10 = L3 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.k;
        float f12 = L3 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (g0.L(7.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (r2 * 2);
        float L5 = (int) ((L2 - g0.L(32.0f)) / 4.0f);
        int i11 = (int) ((0.5f * L5) + f16);
        RectF rectF3 = (RectF) this.l;
        float f17 = i11;
        float f18 = L4 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        p30[] p30VarArr = (p30[]) this.e;
        boolean b10 = p30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L5) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        oy0 oy0Var2 = (oy0) this.f;
        oy0Var2.c(f15 - (oy0Var2.k() / 2.0f), L / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L5 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L5 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        boolean z11 = p30VarArr[3].b(canvas, rectF3, f11) ? true : z10;
        if (f11 > 0.0f) {
            ((oy0) this.g).c((rectF.centerX() - (L2 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((oy0) this.h).c(rectF.centerX() - (((oy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public void b(String[] strArr) {
        this.a = strArr == null;
        for (int i7 = 0; i7 < 4; i7++) {
            p30 p30Var = ((p30[]) this.e)[i7];
            String str = strArr == null ? null : strArr[i7];
            o30 o30Var = p30Var.k;
            boolean z10 = p30Var.f;
            p30Var.f = str != null;
            if (str != null && (p30Var.d == null || !TextUtils.equals(p30Var.l, str))) {
                g5 g5Var = p30Var.d;
                if (g5Var != null) {
                    g5Var.o(o30Var);
                }
                p30Var.c = org.telegram.messenger.j6.g(str);
                int l10 = m10.l();
                g5 g5Var2 = new g5();
                g5Var2.l = 1.0f;
                g5Var2.n = null;
                g5Var2.o = null;
                g5Var2.g = 21;
                g5Var2.h = l10;
                g5Var2.x();
                g5.w();
                p30Var.d = g5Var2;
                p30Var.l = str;
                g5Var2.q(str);
                p30Var.c();
                if (p30Var.j) {
                    p30Var.d.b(o30Var);
                }
            }
            if (p30Var.f && !z10) {
                p30Var.e = false;
            }
        }
        rv rvVar = (rv) this.i;
        if (rvVar != null) {
            rvVar.invalidate();
        }
    }

    public b() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new p30[4];
        this.a = true;
        this.j = new u5(new iz(this, 8), 320L, er.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i7 = 0;
        while (true) {
            p30[] p30VarArr = (p30[]) this.e;
            if (i7 < p30VarArr.length) {
                p30VarArr[i7] = new p30(i7);
                i7++;
            } else {
                ((Paint) this.c).setColor(j6.x0(null, j6.kh, false));
                this.f = new oy0(hd.M0(2131751821, null), 12.0f, g0.o());
                oy0 oy0Var = new oy0(hd.M0(2131751819, null), 11.0f, null);
                oy0Var.m(99);
                oy0Var.p(g0.L(200.0f));
                oy0Var.l(g0.L(2.66f));
                this.g = oy0Var;
                this.h = new oy0(hd.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
