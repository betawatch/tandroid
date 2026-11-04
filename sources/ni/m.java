package ni;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.g0;
import u4.b0;
import u4.o0;
import u4.p0;
import u4.y0;
import u4.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class m extends z0 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final int n;
    public final float o;
    public int p;

    public m(Context context, int i3) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i3;
    }

    @Override // u4.z0
    public final PointF a(int i3) {
        o0 o0Var = this.c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i3);
        }
        return null;
    }

    @Override // u4.z0
    public final void d(int i3, int i10, y0 y0Var) {
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        int i11 = this.l;
        int i12 = i11 - i3;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.l = i12;
        int i13 = this.m;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.m = i15;
        if (i12 == 0 && i15 == 0) {
            PointF a10 = a(this.a);
            if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
                y0Var.d = this.a;
                h();
            } else {
                z0.b(a10);
                this.l = (int) (a10.x * 10000.0f);
                this.m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // u4.z0
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // u4.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, y0 y0Var) {
        int i3;
        int ceil;
        o0 o0Var = this.c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            int z10 = o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
            int v = o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            int C = (o0Var.n - o0Var.C()) - o0Var.F();
            int i10 = v - z10;
            int i11 = this.n;
            int F = i11 == 2 ? o0Var.F() + this.p : i10 > C ? 0 : i11 == 0 ? (C - i10) / 2 : (o0Var.F() + this.p) - g0.L(88.0f);
            int i12 = i10 + F;
            i3 = F - z10;
            if (i3 <= 0) {
                i3 = i12 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i3) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                y0Var.b(0, -i3, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i3 = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i3) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public m(Context context, int i3, float f10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f10;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.n = i3;
    }

    @Override // u4.z0
    public void e() {
    }

    public void i() {
    }
}
