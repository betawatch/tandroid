package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lw0 implements r0.n, org.telegram.ui.Components.u71, org.telegram.ui.Components.hq0, org.telegram.ui.Components.no0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.do0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint F(String str) {
        return ((wd1) this.b).f.a.F(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        return ((wd1) this.b).f.a.F0(i10);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                ow0 ow0Var = (ow0) this.b;
                i0.c g10 = l1Var.a.g(519);
                ow0Var.r = g10;
                ow0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                ow0Var.c.requestLayout();
                break;
            default:
                pe1 pe1Var = (pe1) this.b;
                i0.c g11 = l1Var.a.g(519);
                pe1Var.n = g11;
                pe1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                pe1Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.hq0
    public void T() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.no0
    public void W(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((ac1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                lc1 lc1Var = (lc1) this.b;
                ThemeActivity.k0(lc1Var.h, Math.round(((lc1Var.d - r1) * f7) + lc1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return ((wd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.u71
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        f51 f51Var = secretMediaViewer.y;
        if (f51Var != null) {
            long p5 = f51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.u71
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        f51 f51Var = secretMediaViewer.y;
        if (f51Var != null) {
            f51Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.do0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((eg1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int e0(int i10) {
        return ((wd1) this.b).f.a.F0(i10);
    }

    @Override // org.telegram.ui.Components.do0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        ig1 ig1Var = ((eg1) this.b).t0;
        HashSet hashSet = ig1.n1;
        ig1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        return ((wd1) this.b).f.a.f1(i10);
    }

    @Override // org.telegram.ui.Components.do0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((eg1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.no0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((ac1) this.b).a.getProgress() * r0.b) + 0));
            default:
                lc1 lc1Var = (lc1) this.b;
                return String.valueOf(Math.round((lc1Var.b.getProgress() * (lc1Var.d - r1)) + lc1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        ae1 ae1Var = ((wd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return ae1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ae1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return ae1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return ae1Var.U;
        }
        ad1 ad1Var = ae1Var.a;
        return ad1Var != null ? ad1Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.Components.no0
    public int k0() {
        switch (this.a) {
            case 3:
                return ((ac1) this.b).b;
            default:
                lc1 lc1Var = (lc1) this.b;
                return lc1Var.d - lc1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        ad1 ad1Var = ((wd1) this.b).f.a;
        if (ad1Var != null) {
            ad1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean m0() {
        return ((wd1) this.b).f.a.m0();
    }

    @Override // org.telegram.ui.Components.hq0
    public void s0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.Components.no0
    public void y() {
        int i10 = this.a;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
