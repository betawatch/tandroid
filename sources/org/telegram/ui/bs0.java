package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bs0 extends f2.k1 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public bs0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // f2.k1
    public final PointF a(int i10) {
        f2.x0 x0Var = this.c;
        if (x0Var instanceof f2.k0) {
            return ((f2.k0) x0Var).E0(i10);
        }
        return null;
    }

    @Override // f2.k1
    public final void d(int i10, int i11, f2.j1 j1Var) {
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
                j1Var.d = this.a;
                h();
            } else {
                f2.k1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                j1Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // f2.k1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // f2.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.j1 j1Var) {
        int i10;
        int max;
        f2.x0 x0Var = this.c;
        if (x0Var != null && x0Var.d()) {
            f2.y0 y0Var = (f2.y0) view.getLayoutParams();
            int x8 = f2.x0.x(view) - ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
            int y10 = f2.x0.y(view) + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
            int D = x0Var.D();
            int E = x0Var.m - x0Var.E();
            if (x8 <= D || y10 >= E) {
                int i11 = y10 - x8;
                int i12 = (E - D) - i11;
                int i13 = i11 + i12;
                i10 = i12 - x8;
                if (i10 <= 0) {
                    i10 = i13 - y10;
                }
                max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d));
                if (max <= 0) {
                    j1Var.b(-i10, 0, Math.max(400, max), this.j);
                    return;
                }
                return;
            }
        }
        i10 = 0;
        max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d));
        if (max <= 0) {
        }
    }

    @Override // f2.k1
    public final void e() {
    }
}
