package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class jw0 implements r0.n, org.telegram.ui.Components.u71, org.telegram.ui.Components.jq0, org.telegram.ui.Components.ro0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.ho0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ro0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        return ((td1) this.b).f.a.F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return ((td1) this.b).f.a.G(str);
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                mw0 mw0Var = (mw0) this.b;
                i0.b g10 = l1Var.a.g(519);
                mw0Var.r = g10;
                mw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                mw0Var.c.requestLayout();
                break;
            default:
                me1 me1Var = (me1) this.b;
                i0.b g11 = l1Var.a.g(519);
                me1Var.n = g11;
                me1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                me1Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.jq0
    public void U() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.ro0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((xb1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                ic1 ic1Var = (ic1) this.b;
                ThemeActivity.k0(ic1Var.h, Math.round(((ic1Var.d - r1) * f7) + ic1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return ((td1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.u71
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        d51 d51Var = secretMediaViewer.y;
        if (d51Var != null) {
            long p5 = d51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.u71
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        d51 d51Var = secretMediaViewer.y;
        if (d51Var != null) {
            d51Var.B();
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
            ((bg1) this.b).u0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.ho0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = ((bg1) this.b).u0;
        HashSet hashSet = fg1.n1;
        fg1Var.M0(s2Var);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f0(int i10) {
        return ((td1) this.b).f.a.F0(i10);
    }

    @Override // org.telegram.ui.Components.ho0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.b).u0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g1(int i10) {
        return ((td1) this.b).f.a.g1(i10);
    }

    @Override // org.telegram.ui.Components.ro0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((xb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                ic1 ic1Var = (ic1) this.b;
                return String.valueOf(Math.round((ic1Var.b.getProgress() * (ic1Var.d - r1)) + ic1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        xd1 xd1Var = ((td1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return xd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return xd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return xd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return xd1Var.U;
        }
        xc1 xc1Var = xd1Var.a;
        return xc1Var != null ? xc1Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.Components.ro0
    public int l0() {
        switch (this.a) {
            case 3:
                return ((xb1) this.b).b;
            default:
                ic1 ic1Var = (ic1) this.b;
                return ic1Var.d - ic1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.b).f.a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean n0() {
        return ((td1) this.b).f.a.n0();
    }

    @Override // org.telegram.ui.Components.jq0
    public void t0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
