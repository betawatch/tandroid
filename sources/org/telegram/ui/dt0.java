package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dt0 extends s4.z0 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public dt0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // s4.z0
    public final PointF a(int i10) {
        s4.p0 p0Var = this.c;
        if (p0Var instanceof s4.d0) {
            return ((s4.d0) p0Var).E0(i10);
        }
        return null;
    }

    @Override // s4.z0
    public final void d(int i10, int i11, s4.y0 y0Var) {
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
                y0Var.d = this.a;
                h();
            } else {
                s4.z0.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                y0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // s4.z0
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // s4.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.y0 y0Var) {
        int i10;
        int max;
        s4.p0 p0Var = this.c;
        if (p0Var != null && p0Var.d()) {
            s4.q0 q0Var = (s4.q0) view.getLayoutParams();
            int x10 = s4.p0.x(view) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
            int y3 = s4.p0.y(view) + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
            int D = p0Var.D();
            int E = p0Var.m - p0Var.E();
            if (x10 <= D || y3 >= E) {
                int i11 = y3 - x10;
                int i12 = (E - D) - i11;
                int i13 = i11 + i12;
                i10 = i12 - x10;
                if (i10 <= 0) {
                    i10 = i13 - y3;
                }
                max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d));
                if (max <= 0) {
                    y0Var.b(-i10, 0, Math.max(400, max), this.j);
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

    @Override // s4.z0
    public final void e() {
    }
}
