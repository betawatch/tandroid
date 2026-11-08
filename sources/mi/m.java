package mi;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.g0;
import v4.b0;
import v4.n0;
import v4.o0;
import v4.y0;
import v4.z0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

    public m(Context context, int i7) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i7;
    }

    @Override // v4.z0
    public final PointF a(int i7) {
        n0 n0Var = this.c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        return null;
    }

    @Override // v4.z0
    public final void d(int i7, int i10, y0 y0Var) {
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        int i11 = this.l;
        int i12 = i11 - i7;
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

    @Override // v4.z0
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // v4.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, y0 y0Var) {
        int i7;
        int ceil;
        n0 n0Var = this.c;
        if (n0Var != null && n0Var.e()) {
            o0 o0Var = (o0) view.getLayoutParams();
            int z9 = n0.z(view) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
            int v = n0.v(view) + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
            int C = (n0Var.n - n0Var.C()) - n0Var.F();
            int i10 = v - z9;
            int i11 = this.n;
            int F = i11 == 2 ? n0Var.F() + this.p : i10 > C ? 0 : i11 == 0 ? (C - i10) / 2 : (n0Var.F() + this.p) - g0.L(88.0f);
            int i12 = i10 + F;
            i7 = F - z9;
            if (i7 <= 0) {
                i7 = i12 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                y0Var.b(0, -i7, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i7 = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public m(Context context, int i7, float f10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f10;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.n = i7;
    }

    @Override // v4.z0
    public void e() {
    }

    public void i() {
    }
}
