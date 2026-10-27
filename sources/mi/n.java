package mi;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import s4.a1;
import s4.c0;
import s4.p0;
import s4.q0;
import s4.z0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class n extends a1 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final int n;
    public final float o;
    public int p;

    public n(Context context, int i10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i10;
    }

    @Override // s4.a1
    public final PointF a(int i10) {
        p0 p0Var = this.c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override // s4.a1
    public final void d(int i10, int i11, z0 z0Var) {
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
                z0Var.d = this.a;
                h();
            } else {
                a1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // s4.a1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // s4.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, z0 z0Var) {
        int i10;
        int ceil;
        p0 p0Var = this.c;
        if (p0Var != null && p0Var.e()) {
            q0 q0Var = (q0) view.getLayoutParams();
            int z10 = p0.z(view) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
            int v = p0.v(view) + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
            int C = (p0Var.n - p0Var.C()) - p0Var.F();
            int i11 = v - z10;
            int i12 = this.n;
            int F = i12 == 2 ? p0Var.F() + this.p : i11 > C ? 0 : i12 == 0 ? (C - i11) / 2 : (p0Var.F() + this.p) - AndroidUtilities.dp(88.0f);
            int i13 = i11 + F;
            i10 = F - z10;
            if (i10 <= 0) {
                i10 = i13 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                z0Var.b(0, -i10, Math.max((int) (this.o * 400.0f), ceil), this.j);
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

    public n(Context context, int i10, float f7) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f7;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.n = i10;
    }

    @Override // s4.a1
    public void e() {
    }

    public void i() {
    }
}
