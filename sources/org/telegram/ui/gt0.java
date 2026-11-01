package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gt0 implements r0.m, org.telegram.ui.Components.w61, org.telegram.ui.Components.fp0, org.telegram.ui.Components.nn0, org.telegram.ui.Components.dn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gt0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fp0
    public void B0() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.nn0
    public void C() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.dn0
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        nb1 nb1Var = ((jb1) this.b).v0;
        HashSet hashSet = nb1.q1;
        nb1Var.Q0(v2Var);
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        switch (this.a) {
            case 0:
                jt0 jt0Var = (jt0) this.b;
                i0.c g10 = j1Var.a.g(519);
                jt0Var.r = g10;
                jt0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                jt0Var.c.requestLayout();
                break;
            default:
                v91 v91Var = (v91) this.b;
                i0.c g11 = j1Var.a.g(519);
                v91Var.n = g11;
                v91Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                v91Var.b.requestLayout();
                break;
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Components.fp0
    public void V() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.dn0
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            ((jb1) this.b).v0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        sq0 sq0Var = secretMediaViewer.D;
        if (sq0Var != null) {
            long U = sq0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f7 * U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        sq0 sq0Var = secretMediaViewer.D;
        if (sq0Var != null) {
            sq0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f7 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public void finish() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            ((jb1) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((m71) this.b).a.getProgress() * r0.b) + 0));
            default:
                w71 w71Var = (w71) this.b;
                return String.valueOf(Math.round((w71Var.b.getProgress() * (w71Var.e - r1)) + w71Var.d));
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public void k(boolean z10, float f7) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((m71) this.b).e, Math.round((r4.b * f7) + 0), false);
                break;
            default:
                w71 w71Var = (w71) this.b;
                ThemeActivity.p0(w71Var.r, Math.round(((w71Var.e - r1) * f7) + w71Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public int p0() {
        switch (this.a) {
            case 3:
                return ((m71) this.b).b;
            default:
                w71 w71Var = (w71) this.b;
                return w71Var.e - w71Var.d;
        }
    }

    private final void b() {
    }

    private final void e() {
    }
}
