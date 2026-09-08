package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class iw0 implements r0.n, org.telegram.ui.Components.h71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.un0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return ((sd1) this.b).f.a.G(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        return ((sd1) this.b).f.a.G0(i10);
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                lw0 lw0Var = (lw0) this.b;
                i0.c g10 = l1Var.a.g(519);
                lw0Var.r = g10;
                lw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                lw0Var.c.requestLayout();
                break;
            default:
                le1 le1Var = (le1) this.b;
                i0.c g11 = l1Var.a.g(519);
                le1Var.n = g11;
                le1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                le1Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.wp0
    public void U() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((wb1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                hc1 hc1Var = (hc1) this.b;
                ThemeActivity.k0(hc1Var.h, Math.round(((hc1Var.d - r1) * f7) + hc1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return ((sd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.h71
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        c51 c51Var = secretMediaViewer.y;
        if (c51Var != null) {
            long p5 = c51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.h71
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        c51 c51Var = secretMediaViewer.y;
        if (c51Var != null) {
            c51Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.un0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.un0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        eg1 eg1Var = ((ag1) this.b).t0;
        HashSet hashSet = eg1.n1;
        eg1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.un0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((wb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                hc1 hc1Var = (hc1) this.b;
                return String.valueOf(Math.round((hc1Var.b.getProgress() * (hc1Var.d - r1)) + hc1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        wd1 wd1Var = ((sd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return wd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return wd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return wd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return wd1Var.U;
        }
        wc1 wc1Var = wd1Var.a;
        return wc1Var != null ? wc1Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h0(int i10) {
        return ((sd1) this.b).f.a.G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h1(int i10) {
        return ((sd1) this.b).f.a.h1(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        wc1 wc1Var = ((sd1) this.b).f.a;
        if (wc1Var != null) {
            wc1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public int l0() {
        switch (this.a) {
            case 3:
                return ((wb1) this.b).b;
            default:
                hc1 hc1Var = (hc1) this.b;
                return hc1Var.d - hc1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean o0() {
        return ((sd1) this.b).f.a.o0();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.Components.wp0
    public void z0() {
        ((StickersActivity) this.b).j0();
    }

    private final void d() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void O0(int i10, int i11) {
    }
}
