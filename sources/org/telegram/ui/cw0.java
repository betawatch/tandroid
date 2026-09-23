package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cw0 implements r0.n, org.telegram.ui.Components.g71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.un0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cw0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint G(String str) {
        return ((kd1) this.b).f.a.G(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G0(int i10) {
        return ((kd1) this.b).f.a.G0(i10);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                fw0 fw0Var = (fw0) this.b;
                i0.b g10 = l1Var.a.g(519);
                fw0Var.r = g10;
                fw0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                fw0Var.c.requestLayout();
                break;
            default:
                de1 de1Var = (de1) this.b;
                i0.b g11 = l1Var.a.g(519);
                de1Var.n = g11;
                de1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                de1Var.b.requestLayout();
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
                ThemeActivity.Y(((ob1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                zb1 zb1Var = (zb1) this.b;
                ThemeActivity.k0(zb1Var.h, Math.round(((zb1Var.d - r1) * f7) + zb1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return ((kd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.g71
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        s41 s41Var = secretMediaViewer.y;
        if (s41Var != null) {
            long p5 = s41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        s41 s41Var = secretMediaViewer.y;
        if (s41Var != null) {
            s41Var.B();
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
            ((sf1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.un0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        wf1 wf1Var = ((sf1) this.b).t0;
        HashSet hashSet = wf1.n1;
        wf1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.un0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g0(int i10) {
        return ((kd1) this.b).f.a.G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g1(int i10) {
        return ((kd1) this.b).f.a.g1(i10);
    }

    @Override // org.telegram.ui.Components.eo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((ob1) this.b).a.getProgress() * r0.b) + 0));
            default:
                zb1 zb1Var = (zb1) this.b;
                return String.valueOf(Math.round((zb1Var.b.getProgress() * (zb1Var.d - r1)) + zb1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        od1 od1Var = ((kd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return od1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return od1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return od1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return od1Var.U;
        }
        oc1 oc1Var = od1Var.a;
        return oc1Var != null ? oc1Var.getDrawable(str) : org.telegram.ui.ActionBar.h6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        oc1 oc1Var = ((kd1) this.b).f.a;
        if (oc1Var != null) {
            oc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public int m0() {
        switch (this.a) {
            case 3:
                return ((ob1) this.b).b;
            default:
                zb1 zb1Var = (zb1) this.b;
                return zb1Var.d - zb1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean p0() {
        return ((kd1) this.b).f.a.p0();
    }

    @Override // org.telegram.ui.Components.wp0
    public void u0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
