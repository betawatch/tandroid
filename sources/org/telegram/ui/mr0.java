package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mr0 implements r0.m, org.telegram.ui.Components.n51, org.telegram.ui.Components.eo0, org.telegram.ui.Components.om0, org.telegram.ui.Components.em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mr0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.eo0
    public void C0() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
        int i3 = this.a;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                pr0 pr0Var = (pr0) this.b;
                i0.b g7 = k1Var.a.g(519);
                pr0Var.r = g7;
                pr0Var.d.setPadding(g7.a, g7.b, g7.c, g7.d);
                pr0Var.c.requestLayout();
                break;
            default:
                w71 w71Var = (w71) this.b;
                i0.b g10 = k1Var.a.g(519);
                w71Var.n = g10;
                w71Var.c.setPadding(g10.a, g10.b, g10.c, g10.d);
                w71Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.eo0
    public void W() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.em0
    public void Y(org.telegram.ui.Cells.t2 t2Var) {
        m91 m91Var = ((i91) this.b).w0;
        HashSet hashSet = m91.r1;
        m91Var.Q0(t2Var);
    }

    @Override // org.telegram.ui.Components.n51
    public void c(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        bp0 bp0Var = secretMediaViewer.E;
        if (bp0Var != null) {
            long U = bp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override // org.telegram.ui.Components.n51
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        bp0 bp0Var = secretMediaViewer.E;
        if (bp0Var != null) {
            bp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.em0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((i91) this.b).w0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.om0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((m51) this.b).a.getProgress() * r0.b) + 0));
            default:
                w51 w51Var = (w51) this.b;
                return String.valueOf(Math.round((w51Var.b.getProgress() * (w51Var.e - r1)) + w51Var.d));
        }
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((m51) this.b).e, Math.round((r4.b * f10) + 0), false);
                break;
            default:
                w51 w51Var = (w51) this.b;
                ThemeActivity.p0(w51Var.r, Math.round(((w51Var.e - r1) * f10) + w51Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.em0
    public void m(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((i91) this.b).w0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.om0
    public int q0() {
        switch (this.a) {
            case 3:
                return ((m51) this.b).b;
            default:
                w51 w51Var = (w51) this.b;
                return w51Var.e - w51Var.d;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
