package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fv0 implements r0.o, org.telegram.ui.Components.y61, org.telegram.ui.Components.rp0, org.telegram.ui.Components.zn0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.pn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int C0(int i10) {
        return ((mc1) this.b).f.a.C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        return ((mc1) this.b).f.a.G(str);
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                iv0 iv0Var = (iv0) this.b;
                i0.b g10 = m1Var.a.g(519);
                iv0Var.r = g10;
                iv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                iv0Var.c.requestLayout();
                break;
            default:
                fd1 fd1Var = (fd1) this.b;
                i0.b g11 = m1Var.a.g(519);
                fd1Var.n = g11;
                fd1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                fd1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.rp0
    public void M() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.zn0
    public void W(float f9, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((oa1) this.b).d, Math.round((r5.b * f9) + 0), false);
                break;
            default:
                za1 za1Var = (za1) this.b;
                ThemeActivity.k0(za1Var.h, Math.round(((za1Var.d - r1) * f9) + za1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return ((mc1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.y61
    public void c(float f9) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        x31 x31Var = secretMediaViewer.y;
        if (x31Var != null) {
            long q6 = x31Var.q();
            if (q6 != -9223372036854775807L) {
                secretMediaViewer.y.M((long) (f9 * q6), false);
            }
            secretMediaViewer.y.D();
        }
    }

    @Override // org.telegram.ui.Components.y61
    public void d(float f9) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        x31 x31Var = secretMediaViewer.y;
        if (x31Var != null) {
            x31Var.C();
            long q6 = secretMediaViewer.y.q();
            if (q6 != -9223372036854775807L) {
                secretMediaViewer.y.M((long) (f9 * q6), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public void e(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ve1) this.b).p0.movePreviewFragment(f9);
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        ze1 ze1Var = ((ve1) this.b).p0;
        HashSet hashSet = ze1.j1;
        ze1Var.M0(p2Var);
    }

    @Override // org.telegram.ui.Components.pn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ve1) this.b).p0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        return ((mc1) this.b).f.a.g1(i10);
    }

    @Override // org.telegram.ui.Components.zn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((oa1) this.b).a.getProgress() * r0.b) + 0));
            default:
                za1 za1Var = (za1) this.b;
                return String.valueOf(Math.round((za1Var.b.getProgress() * (za1Var.d - r1)) + za1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        qc1 qc1Var = ((mc1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return qc1Var.N;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qc1Var.O;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return qc1Var.P;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return qc1Var.Q;
        }
        pb1 pb1Var = qc1Var.a;
        return pb1Var != null ? pb1Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int h0(int i10) {
        return ((mc1) this.b).f.a.C0(i10);
    }

    @Override // org.telegram.ui.Components.zn0
    public int k0() {
        switch (this.a) {
            case 3:
                return ((oa1) this.b).b;
            default:
                za1 za1Var = (za1) this.b;
                return za1Var.d - za1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f9, float f10, int i10, int i11) {
        pb1 pb1Var = ((mc1) this.b).f.a;
        if (pb1Var != null) {
            pb1Var.l(f9, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean l0() {
        return ((mc1) this.b).f.a.l0();
    }

    @Override // org.telegram.ui.Components.rp0
    public void r0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.zn0
    public void v() {
        int i10 = this.a;
    }

    private final void b() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
