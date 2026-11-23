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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.kz;
import org.telegram.ui.q30;
import org.telegram.ui.r30;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        wy0 wy0Var = (wy0) this.f;
        wy0Var.p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(i0.a.f(f11, this.b, n6.x0(null, n6.kh, false)));
        float d = ((c6) this.j).d(this.a);
        float k10 = wy0Var.k() + g0.L(86.0f) + g0.L(14.0f);
        float L = g0.L(28.0f);
        float L2 = g0.L(232.0f);
        float i7 = ((wy0) this.g).i() + g0.L(54.0f) + g0.L(50.0f);
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
        r30[] r30VarArr = (r30[]) this.e;
        boolean b10 = r30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L5) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (r30VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        wy0 wy0Var2 = (wy0) this.f;
        wy0Var2.c(f15 - (wy0Var2.k() / 2.0f), L / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L5 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (r30VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L5 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        boolean z11 = r30VarArr[3].b(canvas, rectF3, f11) ? true : z10;
        if (f11 > 0.0f) {
            ((wy0) this.g).c((rectF.centerX() - (L2 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((wy0) this.h).c(rectF.centerX() - (((wy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public void b(String[] strArr) {
        this.a = strArr == null;
        for (int i7 = 0; i7 < 4; i7++) {
            r30 r30Var = ((r30[]) this.e)[i7];
            String str = strArr == null ? null : strArr[i7];
            q30 q30Var = r30Var.k;
            boolean z10 = r30Var.f;
            r30Var.f = str != null;
            if (str != null && (r30Var.d == null || !TextUtils.equals(r30Var.l, str))) {
                o5 o5Var = r30Var.d;
                if (o5Var != null) {
                    o5Var.o(q30Var);
                }
                r30Var.c = j6.g(str);
                int l10 = i10.l();
                o5 o5Var2 = new o5();
                o5Var2.l = 1.0f;
                o5Var2.n = null;
                o5Var2.o = null;
                o5Var2.g = 21;
                o5Var2.h = l10;
                o5Var2.x();
                o5.w();
                r30Var.d = o5Var2;
                r30Var.l = str;
                o5Var2.q(str);
                r30Var.c();
                if (r30Var.j) {
                    r30Var.d.b(q30Var);
                }
            }
            if (r30Var.f && !z10) {
                r30Var.e = false;
            }
        }
        tv tvVar = (tv) this.i;
        if (tvVar != null) {
            tvVar.invalidate();
        }
    }

    public b() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new r30[4];
        this.a = true;
        this.j = new c6(new kz(this, 8), 320L, kr.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i7 = 0;
        while (true) {
            r30[] r30VarArr = (r30[]) this.e;
            if (i7 < r30VarArr.length) {
                r30VarArr[i7] = new r30(i7);
                i7++;
            } else {
                ((Paint) this.c).setColor(n6.x0(null, n6.kh, false));
                this.f = new wy0(gd.N0(2131751809, null), 12.0f, g0.o());
                wy0 wy0Var = new wy0(gd.N0(2131751807, null), 11.0f, null);
                wy0Var.m(99);
                wy0Var.p(g0.L(200.0f));
                wy0Var.l(g0.L(2.66f));
                this.g = wy0Var;
                this.h = new wy0(gd.N0(2131751808, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
