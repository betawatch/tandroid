// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ca8 extends q69 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public ca8(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // q69
    public final PointF a(int i) {
        f69 f69Var = this.c;
        if (f69Var instanceof u46) {
            return ((u46) f69Var).D0(i);
        }
        return null;
    }

    @Override // q69
    public final void d(int i, int i2, p69 p69Var) {
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        int i3 = this.l;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.l = i4;
        int i5 = this.m;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.m = i7;
        if (i4 == 0 && i7 == 0) {
            PointF a = a(this.a);
            if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
                p69Var.d = this.a;
                h();
            } else {
                q69.b(a);
                this.l = (int) (a.x * 10000.0f);
                this.m = (int) (a.y * 10000.0f);
                p69Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(10000.0f * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // q69
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 >= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // q69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, p69 p69Var) {
        int i;
        int ceil;
        f69 f69Var = this.c;
        if (f69Var != null && f69Var.d()) {
            g69 g69Var = (g69) view.getLayoutParams();
            int w = f69.w(view) - ((ViewGroup.MarginLayoutParams) g69Var).leftMargin;
            int x = f69.x(view) + ((ViewGroup.MarginLayoutParams) g69Var).rightMargin;
            int C = f69Var.C();
            int D = f69Var.m - f69Var.D();
            if (w <= C || x >= D) {
                int i2 = x - w;
                int i3 = (D - C) - i2;
                int i4 = i2 + i3;
                i = i3 - w;
                if (i <= 0) {
                    i = i4 - x;
                }
                ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
                if (Math.max(nm7.J2, ceil) <= 0) {
                    p69Var.b(-i, 0, Math.max(400, ceil), this.j);
                    return;
                }
                return;
            }
        }
        i = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
        if (Math.max(nm7.J2, ceil) <= 0) {
        }
    }

    @Override // q69
    public final void e() {
    }
}
