package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gv0 implements r0.o, org.telegram.ui.Components.n61, org.telegram.ui.Components.gp0, org.telegram.ui.Components.pn0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.fn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.gp0
    public void B() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                jv0 jv0Var = (jv0) this.b;
                i0.c g10 = m1Var.a.g(519);
                jv0Var.r = g10;
                jv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                jv0Var.c.requestLayout();
                break;
            default:
                dd1 dd1Var = (dd1) this.b;
                i0.c g11 = m1Var.a.g(519);
                dd1Var.n = g11;
                dd1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                dd1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint N(String str) {
        return ((jc1) this.b).f.a.N(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int N0(int i10) {
        return ((jc1) this.b).f.a.N0(i10);
    }

    @Override // org.telegram.ui.Components.pn0
    public void P(float f10, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((la1) this.b).d, Math.round((r5.b * f10) + 0), false);
                break;
            default:
                wa1 wa1Var = (wa1) this.b;
                ThemeActivity.k0(wa1Var.h, Math.round(((wa1Var.d - r1) * f10) + wa1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return ((jc1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.pn0
    public int a0() {
        switch (this.a) {
            case 3:
                return ((la1) this.b).b;
            default:
                wa1 wa1Var = (wa1) this.b;
                return wa1Var.d - wa1Var.c;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        u31 u31Var = secretMediaViewer.y;
        if (u31Var != null) {
            long q6 = u31Var.q();
            if (q6 != -9223372036854775807L) {
                secretMediaViewer.y.M((long) (f10 * q6), false);
            }
            secretMediaViewer.y.D();
        }
    }

    @Override // org.telegram.ui.Components.fn0
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((se1) this.b).p0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        u31 u31Var = secretMediaViewer.y;
        if (u31Var != null) {
            u31Var.C();
            long q6 = secretMediaViewer.y.q();
            if (q6 != -9223372036854775807L) {
                secretMediaViewer.y.M((long) (f10 * q6), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.fn0
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        we1 we1Var = ((se1) this.b).p0;
        HashSet hashSet = we1.j1;
        we1Var.M0(p2Var);
    }

    @Override // org.telegram.ui.Components.fn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((se1) this.b).p0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((la1) this.b).a.getProgress() * r0.b) + 0));
            default:
                wa1 wa1Var = (wa1) this.b;
                return String.valueOf(Math.round((wa1Var.b.getProgress() * (wa1Var.d - r1)) + wa1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        nc1 nc1Var = ((jc1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return nc1Var.N;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return nc1Var.O;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return nc1Var.P;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return nc1Var.Q;
        }
        mb1 mb1Var = nc1Var.a;
        return mb1Var != null ? mb1Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // org.telegram.ui.Components.gp0
    public void h0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void m(float f10, float f11, int i10, int i11) {
        mb1 mb1Var = ((jc1) this.b).f.a;
        if (mb1Var != null) {
            mb1Var.m(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int o1(int i10) {
        return ((jc1) this.b).f.a.o1(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int q0(int i10) {
        return ((jc1) this.b).f.a.N0(i10);
    }

    @Override // org.telegram.ui.Components.pn0
    public void r() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean u0() {
        return ((jc1) this.b).f.a.u0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void c1(int i10, int i11) {
    }
}
