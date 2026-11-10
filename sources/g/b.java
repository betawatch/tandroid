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
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.kz;
import org.telegram.ui.o00;
import org.telegram.ui.r30;
import org.telegram.ui.s30;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        my0 my0Var = (my0) this.f;
        my0Var.p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(i0.a.f(f11, this.b, m6.x0(null, m6.hh, false)));
        float d = ((v5) this.j).d(this.a);
        float k10 = my0Var.k() + g0.L(86.0f) + g0.L(14.0f);
        float L = g0.L(28.0f);
        float L2 = g0.L(232.0f);
        float i7 = ((my0) this.g).i() + g0.L(54.0f) + g0.L(50.0f);
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
        boolean z9 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[1].b(canvas, rectF3, f11)) {
            z9 = true;
        }
        my0 my0Var2 = (my0) this.f;
        my0Var2.c(f15 - (my0Var2.k() / 2.0f), L / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L5 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[2].b(canvas, rectF3, f11)) {
            z9 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L5 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        boolean z10 = s30VarArr[3].b(canvas, rectF3, f11) ? true : z9;
        if (f11 > 0.0f) {
            ((my0) this.g).c((rectF.centerX() - (L2 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((my0) this.h).c(rectF.centerX() - (((my0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z10;
    }

    public void b(String[] strArr) {
        this.a = strArr == null;
        for (int i7 = 0; i7 < 4; i7++) {
            s30 s30Var = ((s30[]) this.e)[i7];
            String str = strArr == null ? null : strArr[i7];
            r30 r30Var = s30Var.k;
            boolean z9 = s30Var.f;
            s30Var.f = str != null;
            if (str != null && (s30Var.d == null || !TextUtils.equals(s30Var.l, str))) {
                h5 h5Var = s30Var.d;
                if (h5Var != null) {
                    h5Var.o(r30Var);
                }
                s30Var.c = i6.g(str);
                int l10 = p10.l();
                h5 h5Var2 = new h5();
                h5Var2.l = 1.0f;
                h5Var2.n = null;
                h5Var2.o = null;
                h5Var2.g = 21;
                h5Var2.h = l10;
                h5Var2.x();
                h5.w();
                s30Var.d = h5Var2;
                s30Var.l = str;
                h5Var2.q(str);
                s30Var.c();
                if (s30Var.j) {
                    s30Var.d.b(r30Var);
                }
            }
            if (s30Var.f && !z9) {
                s30Var.e = false;
            }
        }
        o00 o00Var = (o00) this.i;
        if (o00Var != null) {
            o00Var.invalidate();
        }
    }

    public b() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new s30[4];
        this.a = true;
        this.j = new v5(new kz(this, 8), 320L, wq.h, 0);
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
                ((Paint) this.c).setColor(m6.x0(null, m6.hh, false));
                this.f = new my0(id.M0(2131751821, null), 12.0f, g0.o());
                my0 my0Var = new my0(id.M0(2131751819, null), 11.0f, null);
                my0Var.m(99);
                my0Var.p(g0.L(200.0f));
                my0Var.l(g0.L(2.66f));
                this.g = my0Var;
                this.h = new my0(id.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
