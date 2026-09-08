package ki;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import s4.c0;
import s4.o0;
import s4.p0;
import s4.x0;
import s4.y0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class p extends y0 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final int n;
    public final float o;
    public int p;

    public p(Context context, int i10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i10;
    }

    @Override // s4.y0
    public final PointF a(int i10) {
        o0 o0Var = this.c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override // s4.y0
    public final void d(int i10, int i11, x0 x0Var) {
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        int i12 = this.l;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.l = i13;
        int i14 = this.m;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.m = i16;
        if (i13 == 0 && i16 == 0) {
            PointF a2 = a(this.a);
            if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                x0Var.d = this.a;
                h();
            } else {
                y0.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // s4.y0
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @Override // s4.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, x0 x0Var) {
        int i10;
        int ceil;
        o0 o0Var = this.c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            int z10 = o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
            int v = o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            int C = (o0Var.n - o0Var.C()) - o0Var.F();
            int i11 = v - z10;
            int i12 = this.n;
            int F = i12 == 2 ? o0Var.F() + this.p : i11 > C ? 0 : i12 == 0 ? (C - i11) / 2 : (o0Var.F() + this.p) - AndroidUtilities.dp(88.0f);
            int i13 = i11 + F;
            i10 = F - z10;
            if (i10 <= 0) {
                i10 = i13 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                x0Var.b(0, -i10, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i10 = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public p(Context context, int i10, float f7) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f7;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.n = i10;
    }

    @Override // s4.y0
    public void e() {
    }

    public void i() {
    }
}
