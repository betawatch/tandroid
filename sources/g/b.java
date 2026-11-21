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
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.lz;
import org.telegram.ui.r30;
import org.telegram.ui.s30;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        xy0 xy0Var = (xy0) this.f;
        xy0Var.p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(i0.a.f(f11, this.b, m6.x0(null, m6.kh, false)));
        float d = ((d6) this.j).d(this.a);
        float k10 = xy0Var.k() + g0.L(86.0f) + g0.L(14.0f);
        float L = g0.L(28.0f);
        float L2 = g0.L(232.0f);
        float i7 = ((xy0) this.g).i() + g0.L(54.0f) + g0.L(50.0f);
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
        s30[] s30VarArr = (s30[]) this.e;
        boolean b10 = s30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L5) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        xy0 xy0Var2 = (xy0) this.f;
        xy0Var2.c(f15 - (xy0Var2.k() / 2.0f), L / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L5 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L5 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        boolean z11 = s30VarArr[3].b(canvas, rectF3, f11) ? true : z10;
        if (f11 > 0.0f) {
            ((xy0) this.g).c((rectF.centerX() - (L2 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((xy0) this.h).c(rectF.centerX() - (((xy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public void b(String[] strArr) {
        this.a = strArr == null;
        for (int i7 = 0; i7 < 4; i7++) {
            s30 s30Var = ((s30[]) this.e)[i7];
            String str = strArr == null ? null : strArr[i7];
            r30 r30Var = s30Var.k;
            boolean z10 = s30Var.f;
            s30Var.f = str != null;
            if (str != null && (s30Var.d == null || !TextUtils.equals(s30Var.l, str))) {
                p5 p5Var = s30Var.d;
                if (p5Var != null) {
                    p5Var.o(r30Var);
                }
                s30Var.c = j6.g(str);
                int l10 = j10.l();
                p5 p5Var2 = new p5();
                p5Var2.l = 1.0f;
                p5Var2.n = null;
                p5Var2.o = null;
                p5Var2.g = 21;
                p5Var2.h = l10;
                p5Var2.x();
                p5.w();
                s30Var.d = p5Var2;
                s30Var.l = str;
                p5Var2.q(str);
                s30Var.c();
                if (s30Var.j) {
                    s30Var.d.b(r30Var);
                }
            }
            if (s30Var.f && !z10) {
                s30Var.e = false;
            }
        }
        uv uvVar = (uv) this.i;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    public b() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new s30[4];
        this.a = true;
        this.j = new d6(new lz(this, 8), 320L, nr.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i7 = 0;
        while (true) {
            s30[] s30VarArr = (s30[]) this.e;
            if (i7 < s30VarArr.length) {
                s30VarArr[i7] = new s30(i7);
                i7++;
            } else {
                ((Paint) this.c).setColor(m6.x0(null, m6.kh, false));
                this.f = new xy0(gd.N0(2131751809, null), 12.0f, g0.o());
                xy0 xy0Var = new xy0(gd.N0(2131751807, null), 11.0f, null);
                xy0Var.m(99);
                xy0Var.p(g0.L(200.0f));
                xy0Var.l(g0.L(2.66f));
                this.g = xy0Var;
                this.h = new xy0(gd.N0(2131751808, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
