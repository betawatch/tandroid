package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fv0 implements r0.o, org.telegram.ui.Components.l61, org.telegram.ui.Components.gp0, org.telegram.ui.Components.on0, org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.dn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.gp0
    public void A() {
        ((StickersActivity) this.b).i0();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.v3;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                iv0 iv0Var = (iv0) this.b;
                i0.b g10 = m1Var.a.g(519);
                iv0Var.r = g10;
                iv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                iv0Var.c.requestLayout();
                break;
            default:
                dd1 dd1Var = (dd1) this.b;
                i0.b g11 = m1Var.a.g(519);
                dd1Var.n = g11;
                dd1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                dd1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        return ((kc1) this.b).f.a.N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
        return ((kc1) this.b).f.a.O(str);
    }

    @Override // org.telegram.ui.Components.on0
    public void Q(float f10, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.X(((na1) this.b).d, Math.round((r5.b * f10) + 0), false);
                break;
            default:
                ya1 ya1Var = (ya1) this.b;
                ThemeActivity.j0(ya1Var.h, Math.round(((ya1Var.d - r1) * f10) + ya1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean a() {
        return ((kc1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.l61
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        v31 v31Var = secretMediaViewer.y;
        if (v31Var != null) {
            long q10 = v31Var.q();
            if (q10 != -9223372036854775807L) {
                secretMediaViewer.y.M((long) (f10 * q10), false);
            }
            secretMediaViewer.y.D();
        }
    }

    @Override // org.telegram.ui.Components.on0
    public int c0() {
        switch (this.a) {
            case 3:
                return ((na1) this.b).b;
            default:
                ya1 ya1Var = (ya1) this.b;
                return ya1Var.d - ya1Var.c;
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((re1) this.b).p0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.l61
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        v31 v31Var = secretMediaViewer.y;
        if (v31Var != null) {
            v31Var.C();
            long q10 = secretMediaViewer.y.q();
            if (q10 != -9223372036854775807L) {
                secretMediaViewer.y.M((long) (f10 * q10), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        we1 we1Var = ((re1) this.b).p0;
        HashSet hashSet = we1.j1;
        we1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.dn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((re1) this.b).p0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.on0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((na1) this.b).a.getProgress() * r0.b) + 0));
            default:
                ya1 ya1Var = (ya1) this.b;
                return String.valueOf(Math.round((ya1Var.b.getProgress() * (ya1Var.d - r1)) + ya1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Drawable getDrawable(String str) {
        oc1 oc1Var = ((kc1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return oc1Var.N;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return oc1Var.O;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return oc1Var.P;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return oc1Var.Q;
        }
        ob1 ob1Var = oc1Var.a;
        return ob1Var != null ? ob1Var.getDrawable(str) : org.telegram.ui.ActionBar.f6.O0(str);
    }

    @Override // org.telegram.ui.Components.gp0
    public void h0() {
        ((StickersActivity) this.b).i0();
    }

    @Override // org.telegram.ui.Components.on0
    public void n() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        ob1 ob1Var = ((kc1) this.b).f.a;
        if (ob1Var != null) {
            ob1Var.o(f10, f11, i9, i10);
        } else {
            org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        return ((kc1) this.b).f.a.N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        return ((kc1) this.b).f.a.q1(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean t0() {
        return ((kc1) this.b).f.a.t0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ void c1(int i9, int i10) {
    }
}
