package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class i2 extends org.telegram.ui.ActionBar.u2 implements is {
    public static int C1 = 1;
    public kg.g A1;
    public a20 B1;
    public String m1;
    public int n1;
    public final g1 o1;
    public final h1 p1;
    public final i1 q1;
    public final h2 r1;
    public float s1;
    public final boolean t1;
    public final boolean u1;
    public boolean v1;
    public int w1;
    public q4 x1;
    public float y1;
    public v10 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(1, context, e6Var, true);
        int i7 = 1;
        this.m1 = null;
        this.n1 = -1;
        this.o1 = new g1();
        this.p1 = new h1();
        this.s1 = -1.0f;
        this.t1 = z10;
        this.u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var));
        this.w1 = this.H0;
        this.x = true;
        int i10 = 0;
        G0(false);
        this.b = new k1(this, context);
        i1 i1Var = new i1(i10, context, this);
        this.q1 = i1Var;
        i1Var.b = z10 ? 0 : C1;
        i1Var.setAdapter(new j1(this, z10, context));
        this.b.addView(i1Var, c8.ja.e(-1, -1, 87));
        new p3(this.b, false, new d1(this, i10));
        if (!z10) {
            h2 h2Var = new h2(context);
            this.r1 = h2Var;
            h2Var.H = new d1(this, i7);
            h2Var.G = i1Var.b;
            h2Var.invalidate();
            this.b.addView(h2Var, c8.ja.e(-1, -2, 87));
        }
        ns.f(this.a).c(this, ns.x0);
        ns.f(this.a).c(this, ns.B0);
        boolean z12 = org.telegram.messenger.a8.j;
        if (!z10) {
            si.b0(this.a).B(5);
            si.b0(this.a).w();
            si.b0(this.a).V0(0, true, true, false);
        }
        si.b0(this.a).B(0);
        si.b0(this.a).V0(0, false, true, false);
        si.b0(this.a).V0(2, false, true, false);
        si.b0(this.a).V0(7, false, true, false);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return this.q1.getTranslationY() >= ((float) ((int) this.s1));
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
        d2 d2Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
        for (View view : this.q1.getViewPages()) {
            if (view instanceof y1) {
                d2 d2Var2 = ((y1) view).f;
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.v1(d2Var2.e);
                }
            } else if ((view instanceof t1) && (d2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(d2Var.e);
            }
        }
    }

    public final void M0(int i7) {
        if (I0(Integer.valueOf(i7))) {
            if ((i7 != 1 || K0(new ai.v0(this, i7, 7))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(a20 a20Var) {
        this.B1 = a20Var;
        for (View view : this.q1.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).c;
                if (x1Var.I == null) {
                    x1Var.D(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final int S() {
        return this.b.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.q.y : (int) (this.b.getMeasuredHeight() - this.q1.getY());
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.x0;
        int i12 = ns.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.q1.getViewPages()) {
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i7 == i12 || ((y1Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.c;
                        if (x1Var.I == null) {
                            x1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        ns.f(this.a).n(this, ns.x0);
        ns.f(this.a).n(this, ns.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.j;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.w1 || (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = w02;
            this.w1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
