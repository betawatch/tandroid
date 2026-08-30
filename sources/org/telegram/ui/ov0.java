package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ov0 implements r0.o, org.telegram.ui.Components.j71, org.telegram.ui.Components.aq0, org.telegram.ui.Components.jo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.zn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jo0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return ((yc1) this.b).f.a.G(str);
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                rv0 rv0Var = (rv0) this.b;
                i0.b g10 = m1Var.a.g(519);
                rv0Var.r = g10;
                rv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                rv0Var.c.requestLayout();
                break;
            default:
                rd1 rd1Var = (rd1) this.b;
                i0.b g11 = m1Var.a.g(519);
                rd1Var.n = g11;
                rd1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                rd1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.aq0
    public void V() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.jo0
    public void Y(float f10, boolean z4) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((bb1) this.b).d, Math.round((r5.b * f10) + 0), false);
                break;
            default:
                mb1 mb1Var = (mb1) this.b;
                ThemeActivity.k0(mb1Var.h, Math.round(((mb1Var.d - r1) * f10) + mb1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return ((yc1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.j71
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        h41 h41Var = secretMediaViewer.y;
        if (h41Var != null) {
            long p10 = h41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f10 * p10), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int c0(int i10) {
        return ((yc1) this.b).f.a.x0(i10);
    }

    @Override // org.telegram.ui.Components.j71
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        h41 h41Var = secretMediaViewer.y;
        if (h41Var != null) {
            h41Var.B();
            long p10 = secretMediaViewer.y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f10 * p10), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gf1) this.b).q0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        kf1 kf1Var = ((gf1) this.b).q0;
        HashSet hashSet = kf1.k1;
        kf1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.zn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gf1) this.b).q0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g1(int i10) {
        return ((yc1) this.b).f.a.g1(i10);
    }

    @Override // org.telegram.ui.Components.jo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((bb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                mb1 mb1Var = (mb1) this.b;
                return String.valueOf(Math.round((mb1Var.b.getProgress() * (mb1Var.d - r1)) + mb1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        cd1 cd1Var = ((yc1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return cd1Var.O;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return cd1Var.P;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return cd1Var.Q;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return cd1Var.R;
        }
        cc1 cc1Var = cd1Var.a;
        return cc1Var != null ? cc1Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.Components.jo0
    public int j0() {
        switch (this.a) {
            case 3:
                return ((bb1) this.b).b;
            default:
                mb1 mb1Var = (mb1) this.b;
                return mb1Var.d - mb1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f10, float f11, int i10, int i11) {
        cc1 cc1Var = ((yc1) this.b).f.a;
        if (cc1Var != null) {
            cc1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean m0() {
        return ((yc1) this.b).f.a.m0();
    }

    @Override // org.telegram.ui.Components.aq0
    public void t0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int x0(int i10) {
        return ((yc1) this.b).f.a.x0(i10);
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void K0(int i10, int i11) {
    }
}
