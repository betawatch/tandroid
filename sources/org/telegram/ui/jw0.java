package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jw0 implements r0.n, org.telegram.ui.Components.l81, org.telegram.ui.Components.br0, org.telegram.ui.Components.jp0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.zo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint F(String str) {
        return ((td1) this.b).f.a.F(str);
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                mw0 mw0Var = (mw0) this.b;
                i0.b g10 = k1Var.a.g(519);
                mw0Var.r = g10;
                mw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                mw0Var.c.requestLayout();
                break;
            default:
                me1 me1Var = (me1) this.b;
                i0.b g11 = k1Var.a.g(519);
                me1Var.n = g11;
                me1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                me1Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.br0
    public void P() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.jp0
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

    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        return ((td1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int a1(int i10) {
        return ((td1) this.b).f.a.a1(i10);
    }

    @Override // org.telegram.ui.Components.l81
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

    @Override // org.telegram.ui.ActionBar.e6
    public int c0(int i10) {
        return ((td1) this.b).f.a.x0(i10);
    }

    @Override // org.telegram.ui.Components.l81
    public void d(float f7) {
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

    @Override // org.telegram.ui.Components.zo0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = ((bg1) this.b).t0;
        HashSet hashSet = fg1.n1;
        fg1Var.M0(s2Var);
    }

    @Override // org.telegram.ui.Components.zo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.jp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((xb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                ic1 ic1Var = (ic1) this.b;
                return String.valueOf(Math.round((ic1Var.b.getProgress() * (ic1Var.d - r1)) + ic1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
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
        return xc1Var != null ? xc1Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.P0(str);
    }

    @Override // org.telegram.ui.Components.jp0
    public int i0() {
        switch (this.a) {
            case 3:
                return ((xb1) this.b).b;
            default:
                ic1 ic1Var = (ic1) this.b;
                return ic1Var.d - ic1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean k0() {
        return ((td1) this.b).f.a.k0();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.b).f.a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.br0
    public void q0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int x0(int i10) {
        return ((td1) this.b).f.a.x0(i10);
    }

    @Override // org.telegram.ui.Components.jp0
    public void z() {
        int i10 = this.a;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void I0(int i10, int i11) {
    }
}
