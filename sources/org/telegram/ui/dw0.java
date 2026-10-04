package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dw0 implements r0.n, org.telegram.ui.Components.e81, org.telegram.ui.Components.oq0, org.telegram.ui.Components.xo0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.mo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.xo0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint H(String str) {
        return ((nd1) this.b).f.a.H(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int H0(int i10) {
        return ((nd1) this.b).f.a.H0(i10);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                gw0 gw0Var = (gw0) this.b;
                i0.b g10 = l1Var.a.g(519);
                gw0Var.r = g10;
                gw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                gw0Var.c.requestLayout();
                break;
            default:
                ge1 ge1Var = (ge1) this.b;
                i0.b g11 = l1Var.a.g(519);
                ge1Var.n = g11;
                ge1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                ge1Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.oq0
    public void V() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.xo0
    public void Y(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.X(((rb1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                cc1 cc1Var = (cc1) this.b;
                ThemeActivity.k0(cc1Var.h, Math.round(((cc1Var.d - r1) * f7) + cc1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return ((nd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.e81
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        w41 w41Var = secretMediaViewer.y;
        if (w41Var != null) {
            long p5 = w41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.e81
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        w41 w41Var = secretMediaViewer.y;
        if (w41Var != null) {
            w41Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uf1) this.b).u0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        yf1 yf1Var = ((uf1) this.b).u0;
        HashSet hashSet = yf1.n1;
        yf1Var.M0(s2Var);
    }

    @Override // org.telegram.ui.Components.mo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uf1) this.b).u0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.xo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((rb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                cc1 cc1Var = (cc1) this.b;
                return String.valueOf(Math.round((cc1Var.b.getProgress() * (cc1Var.d - r1)) + cc1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        rd1 rd1Var = ((nd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return rd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return rd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return rd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return rd1Var.U;
        }
        rc1 rc1Var = rd1Var.a;
        return rc1Var != null ? rc1Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j0(int i10) {
        return ((nd1) this.b).f.a.H0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j1(int i10) {
        return ((nd1) this.b).f.a.j1(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        rc1 rc1Var = ((nd1) this.b).f.a;
        if (rc1Var != null) {
            rc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.xo0
    public int p0() {
        switch (this.a) {
            case 3:
                return ((rb1) this.b).b;
            default:
                cc1 cc1Var = (cc1) this.b;
                return cc1Var.d - cc1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean r0() {
        return ((nd1) this.b).f.a.r0();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.Components.oq0
    public void x0() {
        ((StickersActivity) this.b).j0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
