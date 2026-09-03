package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class os0 extends f2.h1 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public os0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // f2.h1
    public final PointF a(int i10) {
        f2.v0 v0Var = this.c;
        if (v0Var instanceof f2.i0) {
            return ((f2.i0) v0Var).E0(i10);
        }
        return null;
    }

    @Override // f2.h1
    public final void d(int i10, int i11, f2.g1 g1Var) {
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
                g1Var.d = this.a;
                h();
            } else {
                f2.h1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                g1Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // f2.h1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // f2.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.g1 g1Var) {
        int i10;
        int max;
        f2.v0 v0Var = this.c;
        if (v0Var != null && v0Var.d()) {
            f2.w0 w0Var = (f2.w0) view.getLayoutParams();
            int x10 = f2.v0.x(view) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
            int y10 = f2.v0.y(view) + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
            int D = v0Var.D();
            int E = v0Var.m - v0Var.E();
            if (x10 <= D || y10 >= E) {
                int i11 = y10 - x10;
                int i12 = (E - D) - i11;
                int i13 = i11 + i12;
                i10 = i12 - x10;
                if (i10 <= 0) {
                    i10 = i13 - y10;
                }
                max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d));
                if (max <= 0) {
                    g1Var.b(-i10, 0, Math.max(400, max), this.j);
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

    @Override // f2.h1
    public final void e() {
    }
}
