package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class js0 extends s4.x0 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public js0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // s4.x0
    public final PointF a(int i10) {
        s4.n0 n0Var = this.c;
        if (n0Var instanceof s4.b0) {
            return ((s4.b0) n0Var).E0(i10);
        }
        return null;
    }

    @Override // s4.x0
    public final void d(int i10, int i11, s4.w0 w0Var) {
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
                w0Var.d = this.a;
                h();
            } else {
                s4.x0.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                w0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // s4.x0
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // s4.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.w0 w0Var) {
        int i10;
        int max;
        s4.n0 n0Var = this.c;
        if (n0Var != null && n0Var.d()) {
            s4.o0 o0Var = (s4.o0) view.getLayoutParams();
            int x10 = s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
            int y3 = s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
            int D = n0Var.D();
            int E = n0Var.m - n0Var.E();
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
                    w0Var.b(-i10, 0, Math.max(400, max), this.j);
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

    @Override // s4.x0
    public final void e() {
    }
}
