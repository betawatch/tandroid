package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class k2 extends org.telegram.ui.ActionBar.w2 implements ls {
    public static int B1 = 1;
    public d20 A1;
    public String l1;
    public int m1;
    public final e1 n1;
    public final f1 o1;
    public final g1 p1;
    public final j2 q1;
    public float r1;
    public final boolean s1;
    public final boolean t1;
    public boolean u1;
    public int v1;
    public ai.e w1;
    public float x1;
    public y10 y1;
    public kg.g z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(1, context, h6Var, true);
        int i7 = 1;
        this.l1 = null;
        this.m1 = -1;
        this.n1 = new e1();
        this.o1 = new f1();
        this.r1 = -1.0f;
        this.s1 = z9;
        this.t1 = z10;
        this.F = true;
        O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
        this.v1 = this.G0;
        this.x = true;
        int i10 = 0;
        G0(false);
        this.b = new i1(this, context);
        g1 g1Var = new g1(i10, context, this);
        this.p1 = g1Var;
        g1Var.b = z9 ? 0 : B1;
        g1Var.setAdapter(new h1(this, z9, context));
        this.b.addView(g1Var, c8.ha.e(-1, -1, 87));
        new q3(this.b, false, new c1(this, i10));
        if (!z9) {
            j2 j2Var = new j2(context);
            this.q1 = j2Var;
            j2Var.G = new c1(this, i7);
            j2Var.F = g1Var.b;
            j2Var.invalidate();
            this.b.addView(j2Var, c8.ha.e(-1, -2, 87));
        }
        qs.f(this.a).c(this, qs.x0);
        qs.f(this.a).c(this, qs.B0);
        boolean z11 = org.telegram.messenger.a8.j;
        if (!z9) {
            ui.b0(this.a).B(5);
            ui.b0(this.a).w();
            ui.b0(this.a).V0(0, true, true, false);
        }
        ui.b0(this.a).B(0);
        ui.b0(this.a).V0(0, false, true, false);
        ui.b0(this.a).V0(2, false, true, false);
        ui.b0(this.a).V0(7, false, true, false);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return this.p1.getTranslationY() >= ((float) ((int) this.r1));
    }

    public boolean I0(Integer num) {
        return true;
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Runnable runnable) {
        return true;
    }

    public final void L0() {
        e2 e2Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
        for (View view : this.p1.getViewPages()) {
            if (view instanceof z1) {
                e2 e2Var2 = ((z1) view).f;
                if (e2Var2 != null) {
                    org.telegram.messenger.g0.v1(e2Var2.e);
                }
            } else if ((view instanceof t1) && (e2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(e2Var.e);
            }
        }
    }

    public final void M0(int i7) {
        if (I0(Integer.valueOf(i7))) {
            if ((i7 != 1 || K0(new bg.m0(this, i7, 7))) && ((Boolean) this.A1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(d20 d20Var) {
        this.A1 = d20Var;
        for (View view : this.p1.getViewPages()) {
            if (view instanceof z1) {
                y1 y1Var = ((z1) view).c;
                if (y1Var.H == null) {
                    y1Var.D(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int R() {
        return this.b.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.q.y : (int) (this.b.getMeasuredHeight() - this.p1.getY());
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.x0;
        int i12 = qs.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.p1.getViewPages()) {
                if (view instanceof z1) {
                    z1 z1Var = (z1) view;
                    if (i7 == i12 || ((z1Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (z1Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        y1 y1Var = z1Var.c;
                        if (y1Var.H == null) {
                            y1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        qs.f(this.a).n(this, qs.x0);
        qs.f(this.a).n(this, qs.B0);
        L0();
        super.dismiss();
        boolean z9 = org.telegram.messenger.a8.j;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 >= 0 || this.G0 != this.v1 || (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0)) == this.G0) {
                return;
            }
            this.G0 = w02;
            this.v1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
