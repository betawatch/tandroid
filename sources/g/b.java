package g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import bi.t0;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.m40;
import org.telegram.ui.n40;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    public boolean a(Canvas canvas, float f7, float f10) {
        Paint paint = (Paint) this.d;
        canvas.save();
        rz0 rz0Var = (rz0) this.f;
        rz0Var.p = f7 - i0.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(i0.b.f(f10, this.b, t6.x0(null, t6.hh, false)));
        float d = ((t5) this.j).d(this.a);
        float k10 = rz0Var.k() + i0.L(86.0f) + i0.L(14.0f);
        float L = i0.L(28.0f);
        float L2 = i0.L(232.0f);
        float i10 = ((rz0) this.g).i() + i0.L(54.0f) + i0.L(50.0f);
        float T1 = i0.T1(k10, L2, f10);
        float T12 = i0.T1(L, i10, f10);
        float W1 = i0.W1(f10, i0.L(14.0f), i0.L(16.0f));
        RectF rectF = i0.P;
        rectF.set((f7 - T1) / 2.0f, 0.0f, (f7 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L3 = i0.L(18.0f);
        int L4 = i0.L(30.0f);
        int i11 = L3 / 2;
        int centerY = ((int) rectF.centerY()) - i11;
        int centerY2 = ((int) rectF.centerY()) + i11;
        RectF rectF2 = (RectF) this.k;
        float f11 = L3 / 2.0f;
        float f12 = centerY;
        float f13 = centerY2;
        rectF2.set((i0.L(10.0f) + (i0.L(7.0f) + ((int) rectF.left))) - f11, f12, i0.L(10.0f) + i0.L(7.0f) + ((int) rectF.left) + f11, f13);
        float f14 = f7 / 2.0f;
        float f15 = f14 - (r2 * 2);
        float L5 = (int) ((L2 - i0.L(32.0f)) / 4.0f);
        int i12 = (int) ((0.5f * L5) + f15);
        RectF rectF3 = (RectF) this.l;
        float f16 = i12;
        float f17 = L4 / 2.0f;
        rectF3.set(f16 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f16 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        n40[] n40VarArr = (n40[]) this.e;
        boolean b10 = n40VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((i0.L(10.0f) + (i0.L(27.0f) + ((int) rectF.left))) - f11, f12, i0.L(10.0f) + i0.L(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * L5) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f18 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        if (n40VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rz0 rz0Var2 = (rz0) this.f;
        rz0Var2.c(f14 - (rz0Var2.k() / 2.0f), L / 2.0f, i0.T1(1.0f, 0.75f, d) * (1.0f - f10), -1, canvas);
        rectF2.set((i0.L(10.0f) + (((int) rectF.right) - i0.L(47.0f))) - f11, f12, i0.L(10.0f) + (((int) rectF.right) - i0.L(47.0f)) + f11, f13);
        float f19 = (int) ((L5 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f19 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        if (n40VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((i0.L(10.0f) + (((int) rectF.right) - i0.L(27.0f))) - f11, f12, i0.L(10.0f) + (((int) rectF.right) - i0.L(27.0f)) + f11, f13);
        float f20 = (int) ((L5 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f20 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        boolean z11 = n40VarArr[3].b(canvas, rectF3, f10) ? true : z10;
        if (f10 > 0.0f) {
            ((rz0) this.g).c((rectF.centerX() - (L2 / 2.0f)) + i0.L(16.0f), i0.L(54.0f), f10, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, i10 - i0.L(40.0f), rectF.right, i0.L(0.66f) + (i10 - i0.L(40.0f)), paint);
            ((rz0) this.h).c(rectF.centerX() - (((rz0) this.h).k() / 2.0f), i10 - i0.L(20.0f), f10, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public void b(String[] strArr) {
        this.a = strArr == null;
        for (int i10 = 0; i10 < 4; i10++) {
            n40 n40Var = ((n40[]) this.e)[i10];
            String str = strArr == null ? null : strArr[i10];
            m40 m40Var = n40Var.k;
            boolean z10 = n40Var.f;
            n40Var.f = str != null;
            if (str != null && (n40Var.d == null || !TextUtils.equals(n40Var.l, str))) {
                f5 f5Var = n40Var.d;
                if (f5Var != null) {
                    f5Var.o(m40Var);
                }
                n40Var.c = k6.g(str);
                int l4 = e20.l();
                f5 f5Var2 = new f5();
                f5Var2.l = 1.0f;
                f5Var2.n = null;
                f5Var2.o = null;
                f5Var2.g = 21;
                f5Var2.h = l4;
                f5Var2.x();
                f5.w();
                n40Var.d = f5Var2;
                n40Var.l = str;
                f5Var2.q(str);
                n40Var.c();
                if (n40Var.j) {
                    n40Var.d.b(m40Var);
                }
            }
            if (n40Var.f && !z10) {
                n40Var.e = false;
            }
        }
        t0 t0Var = (t0) this.i;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    public b() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new n40[4];
        this.a = true;
        this.j = new t5(new yy(this, 8), 320L, gr.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i10 = 0;
        while (true) {
            n40[] n40VarArr = (n40[]) this.e;
            if (i10 < n40VarArr.length) {
                n40VarArr[i10] = new n40(i10);
                i10++;
            } else {
                ((Paint) this.c).setColor(t6.x0(null, t6.hh, false));
                this.f = new rz0(dd.L0(2131751821, null), 12.0f, i0.o());
                rz0 rz0Var = new rz0(dd.L0(2131751819, null), 11.0f, null);
                rz0Var.m(99);
                rz0Var.p(i0.L(200.0f));
                rz0Var.l(i0.L(2.66f));
                this.g = rz0Var;
                this.h = new rz0(dd.L0(2131751820, null), 14.0f, i0.o());
                b(null);
                return;
            }
        }
    }
}
