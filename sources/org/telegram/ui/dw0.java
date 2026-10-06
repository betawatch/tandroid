package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class dw0 implements r0.n, org.telegram.ui.Components.f81, org.telegram.ui.Components.qq0, org.telegram.ui.Components.yo0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.mo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.yo0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint H(String str) {
        return ((ld1) this.b).f.a.H(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int H0(int i10) {
        return ((ld1) this.b).f.a.H0(i10);
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
                ee1 ee1Var = (ee1) this.b;
                i0.b g11 = l1Var.a.g(519);
                ee1Var.n = g11;
                ee1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                ee1Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.qq0
    public void V() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.yo0
    public void Y(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.X(((pb1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                ac1 ac1Var = (ac1) this.b;
                ThemeActivity.k0(ac1Var.h, Math.round(((ac1Var.d - r1) * f7) + ac1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return ((ld1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.f81
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        u41 u41Var = secretMediaViewer.y;
        if (u41Var != null) {
            long p5 = u41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.f81
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        u41 u41Var = secretMediaViewer.y;
        if (u41Var != null) {
            u41Var.B();
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
            ((sf1) this.b).v0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        wf1 wf1Var = ((sf1) this.b).v0;
        HashSet hashSet = wf1.n1;
        wf1Var.M0(s2Var);
    }

    @Override // org.telegram.ui.Components.mo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.yo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((pb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                ac1 ac1Var = (ac1) this.b;
                return String.valueOf(Math.round((ac1Var.b.getProgress() * (ac1Var.d - r1)) + ac1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        pd1 pd1Var = ((ld1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return pd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return pd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return pd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return pd1Var.U;
        }
        pc1 pc1Var = pd1Var.a;
        return pc1Var != null ? pc1Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j0(int i10) {
        return ((ld1) this.b).f.a.H0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j1(int i10) {
        return ((ld1) this.b).f.a.j1(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        pc1 pc1Var = ((ld1) this.b).f.a;
        if (pc1Var != null) {
            pc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.yo0
    public int p0() {
        switch (this.a) {
            case 3:
                return ((pb1) this.b).b;
            default:
                ac1 ac1Var = (ac1) this.b;
                return ac1Var.d - ac1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean r0() {
        return ((ld1) this.b).f.a.r0();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.Components.qq0
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
