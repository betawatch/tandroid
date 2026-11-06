package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class bp0 extends v4.z0 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public bp0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // v4.z0
    public final PointF a(int i7) {
        v4.n0 n0Var = this.c;
        if (n0Var instanceof v4.b0) {
            return ((v4.b0) n0Var).E0(i7);
        }
        return null;
    }

    @Override // v4.z0
    public final void d(int i7, int i10, v4.y0 y0Var) {
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
                v4.z0.b(a10);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // v4.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, v4.y0 y0Var) {
        int i7;
        int max;
        v4.n0 n0Var = this.c;
        if (n0Var != null && n0Var.d()) {
            v4.o0 o0Var = (v4.o0) view.getLayoutParams();
            int x10 = v4.n0.x(view) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
            int y10 = v4.n0.y(view) + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
            int D = n0Var.D();
            int E = n0Var.m - n0Var.E();
            if (x10 <= D || y10 >= E) {
                int i10 = y10 - x10;
                int i11 = (E - D) - i10;
                int i12 = i10 + i11;
                i7 = i11 - x10;
                if (i7 <= 0) {
                    i7 = i12 - y10;
                }
                max = Math.max(org.telegram.messenger.qs.K2, (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d));
                if (max <= 0) {
                    y0Var.b(-i7, 0, Math.max(400, max), this.j);
                    return;
                }
                return;
            }
        }
        i7 = 0;
        max = Math.max(org.telegram.messenger.qs.K2, (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d));
        if (max <= 0) {
        }
    }

    @Override // v4.z0
    public final void e() {
    }
}
