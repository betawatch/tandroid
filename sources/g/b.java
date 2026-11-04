package g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fz;
import org.telegram.ui.j30;
import org.telegram.ui.k30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        ly0 ly0Var = (ly0) this.f;
        ly0Var.p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(i0.a.f(f11, this.b, k6.x0(null, k6.hh, false)));
        float d = ((u5) this.j).d(this.a);
        float k10 = ly0Var.k() + g0.L(86.0f) + g0.L(14.0f);
        float L = g0.L(28.0f);
        float L2 = g0.L(232.0f);
        float i3 = ((ly0) this.g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L2, f11);
        float T12 = g0.T1(L, i3, f11);
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
        k30[] k30VarArr = (k30[]) this.e;
        boolean b10 = k30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L5) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (k30VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        ly0 ly0Var2 = (ly0) this.f;
        ly0Var2.c(f15 - (ly0Var2.k() / 2.0f), L / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L5 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (k30VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L5 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        boolean z11 = k30VarArr[3].b(canvas, rectF3, f11) ? true : z10;
        if (f11 > 0.0f) {
            ((ly0) this.g).c((rectF.centerX() - (L2 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i3 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i3 - g0.L(40.0f)), paint);
            ((ly0) this.h).c(rectF.centerX() - (((ly0) this.h).k() / 2.0f), i3 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public void b(String[] strArr) {
        this.a = strArr == null;
        for (int i3 = 0; i3 < 4; i3++) {
            k30 k30Var = ((k30[]) this.e)[i3];
            String str = strArr == null ? null : strArr[i3];
            j30 j30Var = k30Var.k;
            boolean z10 = k30Var.f;
            k30Var.f = str != null;
            if (str != null && (k30Var.d == null || !TextUtils.equals(k30Var.l, str))) {
                g5 g5Var = k30Var.d;
                if (g5Var != null) {
                    g5Var.o(j30Var);
                }
                k30Var.c = i6.g(str);
                int l10 = h10.l();
                g5 g5Var2 = new g5();
                g5Var2.l = 1.0f;
                g5Var2.n = null;
                g5Var2.o = null;
                g5Var2.g = 21;
                g5Var2.h = l10;
                g5Var2.x();
                g5.w();
                k30Var.d = g5Var2;
                k30Var.l = str;
                g5Var2.q(str);
                k30Var.c();
                if (k30Var.j) {
                    k30Var.d.b(j30Var);
                }
            }
            if (k30Var.f && !z10) {
                k30Var.e = false;
            }
        }
        r0 r0Var = (r0) this.i;
        if (r0Var != null) {
            r0Var.invalidate();
        }
    }

    public b() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new k30[4];
        this.a = true;
        this.j = new u5(new fz(this, 7), 320L, xq.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i3 = 0;
        while (true) {
            k30[] k30VarArr = (k30[]) this.e;
            if (i3 < k30VarArr.length) {
                k30VarArr[i3] = new k30(i3);
                i3++;
            } else {
                ((Paint) this.c).setColor(k6.x0(null, k6.hh, false));
                this.f = new ly0(bd.M0(2131751821, null), 12.0f, g0.o());
                ly0 ly0Var = new ly0(bd.M0(2131751819, null), 11.0f, null);
                ly0Var.m(99);
                ly0Var.p(g0.L(200.0f));
                ly0Var.l(g0.L(2.66f));
                this.g = ly0Var;
                this.h = new ly0(bd.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
