package gi;

import android.content.Context;
import android.view.View;
import b8.mf;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class i2 extends org.telegram.ui.ActionBar.t2 implements cs {
    public static int z1 = 1;
    public String j1;
    public int k1;
    public final e1 l1;
    public final f1 m1;
    public final g1 n1;
    public final h2 o1;
    public float p1;
    public final boolean q1;
    public final boolean r1;
    public boolean s1;
    public int t1;
    public q4 u1;
    public float v1;
    public q10 w1;
    public lg.g x1;
    public v10 y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(1, context, e6Var, true);
        int i3 = 1;
        this.j1 = null;
        this.k1 = -1;
        this.l1 = new e1();
        this.m1 = new f1();
        this.p1 = -1.0f;
        this.q1 = z10;
        this.r1 = z11;
        this.G = true;
        O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var));
        this.t1 = this.H0;
        this.x = true;
        int i10 = 0;
        G0(false);
        this.b = new i1(this, context);
        g1 g1Var = new g1(i10, context, this);
        this.n1 = g1Var;
        g1Var.b = z10 ? 0 : z1;
        g1Var.setAdapter(new h1(this, z10, context));
        this.b.addView(g1Var, mf.e(-1, -1, 87));
        new p3(this.b, false, new c1(this, i10));
        if (!z10) {
            h2 h2Var = new h2(context);
            this.o1 = h2Var;
            h2Var.H = new c1(this, i3);
            h2Var.G = g1Var.b;
            h2Var.invalidate();
            this.b.addView(h2Var, mf.e(-1, -2, 87));
        }
        hs.f(this.a).c(this, hs.x0);
        hs.f(this.a).c(this, hs.B0);
        boolean z12 = org.telegram.messenger.a8.j;
        if (!z10) {
            li.b0(this.a).B(5);
            li.b0(this.a).w();
            li.b0(this.a).V0(0, true, true, false);
        }
        li.b0(this.a).B(0);
        li.b0(this.a).V0(0, false, true, false);
        li.b0(this.a).V0(2, false, true, false);
        li.b0(this.a).V0(7, false, true, false);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return this.n1.getTranslationY() >= ((float) ((int) this.p1));
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
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
        for (View view : this.n1.getViewPages()) {
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

    public final void M0(int i3) {
        if (I0(Integer.valueOf(i3))) {
            if ((i3 != 1 || K0(new cg.l0(this, i3, 7))) && ((Boolean) this.y1.a(Integer.valueOf(i3))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(v10 v10Var) {
        this.y1 = v10Var;
        for (View view : this.n1.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).c;
                if (x1Var.I == null) {
                    x1Var.D(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final int R() {
        return this.b.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.q.y : (int) (this.b.getMeasuredHeight() - this.n1.getY());
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.x0;
        int i12 = hs.B0;
        if (i3 == i11 || i3 == i12) {
            for (View view : this.n1.getViewPages()) {
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i3 == i12 || ((y1Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.c;
                        if (x1Var.I == null) {
                            x1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        hs.f(this.a).n(this, hs.x0);
        hs.f(this.a).n(this, hs.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.j;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.t1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = w02;
            this.t1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
