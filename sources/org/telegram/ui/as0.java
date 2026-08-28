package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class as0 extends f2.m1 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public as0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // f2.m1
    public final PointF a(int i9) {
        f2.z0 z0Var = this.c;
        if (z0Var instanceof f2.m0) {
            return ((f2.m0) z0Var).E0(i9);
        }
        return null;
    }

    @Override // f2.m1
    public final void d(int i9, int i10, f2.l1 l1Var) {
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        int i11 = this.l;
        int i12 = i11 - i9;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.l = i12;
        int i13 = this.m;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.m = i15;
        if (i12 == 0 && i15 == 0) {
            PointF a2 = a(this.a);
            if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                l1Var.d = this.a;
                h();
            } else {
                f2.m1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                l1Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // f2.m1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // f2.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.l1 l1Var) {
        int i9;
        int max;
        f2.z0 z0Var = this.c;
        if (z0Var != null && z0Var.d()) {
            f2.a1 a1Var = (f2.a1) view.getLayoutParams();
            int x10 = f2.z0.x(view) - ((ViewGroup.MarginLayoutParams) a1Var).leftMargin;
            int y10 = f2.z0.y(view) + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin;
            int D = z0Var.D();
            int E = z0Var.m - z0Var.E();
            if (x10 <= D || y10 >= E) {
                int i10 = y10 - x10;
                int i11 = (E - D) - i10;
                int i12 = i10 + i11;
                i9 = i11 - x10;
                if (i9 <= 0) {
                    i9 = i12 - y10;
                }
                max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i9) * this.k)) / 0.3356d));
                if (max <= 0) {
                    l1Var.b(-i9, 0, Math.max(400, max), this.j);
                    return;
                }
                return;
            }
        }
        i9 = 0;
        max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i9) * this.k)) / 0.3356d));
        if (max <= 0) {
        }
    }

    @Override // f2.m1
    public final void e() {
    }
}
