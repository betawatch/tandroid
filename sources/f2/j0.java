package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class j0 extends h1 {
    public static final boolean q = BuildVars.DEBUG_VERSION;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public j0(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // f2.h1
    public final void d(int i10, int i11, g1 g1Var) {
        PointF pointF;
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        if (q && (pointF = this.k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        }
        int i12 = this.o;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.o = i13;
        int i14 = this.p;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.p = i16;
        if (i13 == 0 && i16 == 0) {
            q(g1Var);
        }
    }

    @Override // f2.h1
    public final void f() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // f2.h1
    public void g(View view, g1 g1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m9 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m9 > 0) {
            g1Var.b(-j10, -k10, m9, this.j);
        }
    }

    public int i(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public final int j(int i10, View view) {
        v0 v0Var = this.c;
        if (v0Var == null || !v0Var.d()) {
            return 0;
        }
        w0 w0Var = (w0) view.getLayoutParams();
        return i(v0.x(view) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, v0.y(view) + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, v0Var.D(), v0Var.m - v0Var.E(), i10);
    }

    public int k(int i10, View view) {
        v0 v0Var = this.c;
        if (v0Var == null || !v0Var.e()) {
            return 0;
        }
        w0 w0Var = (w0) view.getLayoutParams();
        return i(v0.z(view) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, v0.v(view) + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, v0Var.F(), v0Var.n - v0Var.C(), i10);
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i10) {
        return (int) Math.ceil(n(i10) / 0.3356d);
    }

    public int n(int i10) {
        float abs = Math.abs(i10);
        if (!this.m) {
            this.n = l(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public final int o() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public int p() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public void q(g1 g1Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            g1Var.d = this.a;
            h();
            return;
        }
        h1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        g1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.i);
    }

    @Override // f2.h1
    public final void e() {
    }
}
