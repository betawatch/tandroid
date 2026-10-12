package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pw0 implements r0.o, org.telegram.ui.Components.i81, org.telegram.ui.Components.yq0, org.telegram.ui.Components.fp0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.vo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int F0(int i10) {
        return ((yd1) this.b).f.a.F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        return ((yd1) this.b).f.a.G(str);
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                sw0 sw0Var = (sw0) this.b;
                i0.b g10 = l1Var.a.g(519);
                sw0Var.r = g10;
                sw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                sw0Var.c.requestLayout();
                break;
            default:
                se1 se1Var = (se1) this.b;
                i0.b g11 = l1Var.a.g(519);
                se1Var.n = g11;
                se1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                se1Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.yq0
    public void U() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((cc1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                nc1 nc1Var = (nc1) this.b;
                ThemeActivity.k0(nc1Var.h, Math.round(((nc1Var.d - r1) * f7) + nc1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return ((yd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.i81
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        j51 j51Var = secretMediaViewer.y;
        if (j51Var != null) {
            long p5 = j51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int b0(int i10) {
        return ((yd1) this.b).f.a.F0(i10);
    }

    @Override // org.telegram.ui.Components.i81
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        j51 j51Var = secretMediaViewer.y;
        if (j51Var != null) {
            j51Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.vo0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((hg1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.vo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        lg1 lg1Var = ((hg1) this.b).t0;
        HashSet hashSet = lg1.n1;
        lg1Var.M0(s2Var);
    }

    @Override // org.telegram.ui.Components.vo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((hg1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        return ((yd1) this.b).f.a.g1(i10);
    }

    @Override // org.telegram.ui.Components.fp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((cc1) this.b).a.getProgress() * r0.b) + 0));
            default:
                nc1 nc1Var = (nc1) this.b;
                return String.valueOf(Math.round((nc1Var.b.getProgress() * (nc1Var.d - r1)) + nc1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        ce1 ce1Var = ((yd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return ce1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ce1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return ce1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return ce1Var.U;
        }
        cd1 cd1Var = ce1Var.a;
        return cd1Var != null ? cd1Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.P0(str);
    }

    @Override // org.telegram.ui.Components.fp0
    public int k0() {
        switch (this.a) {
            case 3:
                return ((cc1) this.b).b;
            default:
                nc1 nc1Var = (nc1) this.b;
                return nc1Var.d - nc1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f7, float f10, int i10, int i11) {
        cd1 cd1Var = ((yd1) this.b).f.a;
        if (cd1Var != null) {
            cd1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean m0() {
        return ((yd1) this.b).f.a.m0();
    }

    @Override // org.telegram.ui.Components.yq0
    public void s0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
        int i10 = this.a;
    }

    private final void d() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void N0(int i10, int i11) {
    }
}
