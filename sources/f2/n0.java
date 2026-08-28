package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class n0 extends m1 {
    public static final boolean q = BuildVars.DEBUG_VERSION;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public n0(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // f2.m1
    public final void d(int i9, int i10, l1 l1Var) {
        PointF pointF;
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        if (q && (pointF = this.k) != null && (pointF.x * i9 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        }
        int i11 = this.o;
        int i12 = i11 - i9;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.o = i12;
        int i13 = this.p;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.p = i15;
        if (i12 == 0 && i15 == 0) {
            q(l1Var);
        }
    }

    @Override // f2.m1
    public final void f() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // f2.m1
    public void g(View view, l1 l1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            l1Var.b(-j10, -k10, m10, this.j);
        }
    }

    public int i(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i9;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i9;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public final int j(int i9, View view) {
        z0 z0Var = this.c;
        if (z0Var == null || !z0Var.d()) {
            return 0;
        }
        a1 a1Var = (a1) view.getLayoutParams();
        return i(z0.x(view) - ((ViewGroup.MarginLayoutParams) a1Var).leftMargin, z0.y(view) + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, z0Var.D(), z0Var.m - z0Var.E(), i9);
    }

    public int k(int i9, View view) {
        z0 z0Var = this.c;
        if (z0Var == null || !z0Var.e()) {
            return 0;
        }
        a1 a1Var = (a1) view.getLayoutParams();
        return i(z0.z(view) - ((ViewGroup.MarginLayoutParams) a1Var).topMargin, z0.v(view) + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin, z0Var.F(), z0Var.n - z0Var.C(), i9);
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i9) {
        return (int) Math.ceil(n(i9) / 0.3356d);
    }

    public int n(int i9) {
        float abs = Math.abs(i9);
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

    public void q(l1 l1Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            l1Var.d = this.a;
            h();
            return;
        }
        m1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        l1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.i);
    }

    @Override // f2.m1
    public final void e() {
    }
}
