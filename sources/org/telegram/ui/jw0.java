package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jw0 implements r0.n, org.telegram.ui.Components.v71, org.telegram.ui.Components.kq0, org.telegram.ui.Components.so0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.ho0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.so0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint G(String str) {
        return ((rd1) this.b).f.a.G(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int G0(int i10) {
        return ((rd1) this.b).f.a.G0(i10);
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                mw0 mw0Var = (mw0) this.b;
                i0.b g10 = m1Var.a.g(519);
                mw0Var.r = g10;
                mw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                mw0Var.c.requestLayout();
                break;
            default:
                ke1 ke1Var = (ke1) this.b;
                i0.b g11 = m1Var.a.g(519);
                ke1Var.n = g11;
                ke1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                ke1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.kq0
    public void U() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.so0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((vb1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                gc1 gc1Var = (gc1) this.b;
                ThemeActivity.k0(gc1Var.h, Math.round(((gc1Var.d - r1) * f7) + gc1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        return ((rd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.v71
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        a51 a51Var = secretMediaViewer.y;
        if (a51Var != null) {
            long p5 = a51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.v71
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        a51 a51Var = secretMediaViewer.y;
        if (a51Var != null) {
            a51Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ho0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((zf1) this.b).u0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.ho0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        dg1 dg1Var = ((zf1) this.b).u0;
        HashSet hashSet = dg1.n1;
        dg1Var.M0(s2Var);
    }

    @Override // org.telegram.ui.Components.ho0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((zf1) this.b).u0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g0(int i10) {
        return ((rd1) this.b).f.a.G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g1(int i10) {
        return ((rd1) this.b).f.a.g1(i10);
    }

    @Override // org.telegram.ui.Components.so0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((vb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                gc1 gc1Var = (gc1) this.b;
                return String.valueOf(Math.round((gc1Var.b.getProgress() * (gc1Var.d - r1)) + gc1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Drawable getDrawable(String str) {
        vd1 vd1Var = ((rd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return vd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return vd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return vd1Var.U;
        }
        vc1 vc1Var = vd1Var.a;
        return vc1Var != null ? vc1Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        vc1 vc1Var = ((rd1) this.b).f.a;
        if (vc1Var != null) {
            vc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.so0
    public int m0() {
        switch (this.a) {
            case 3:
                return ((vb1) this.b).b;
            default:
                gc1 gc1Var = (gc1) this.b;
                return gc1Var.d - gc1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean p0() {
        return ((rd1) this.b).f.a.p0();
    }

    @Override // org.telegram.ui.Components.kq0
    public void u0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
