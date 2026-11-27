// default package

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h2a extends ny0 implements fn7 {
    public final int S1;
    public final axa T1;
    public final HashSet U1;
    public final q74 V1;
    public final FrameLayout W1;
    public final c51 X1;
    public fu5 Y1;
    public final oz4 Z1;
    public final oz4 a2;
    public l9c b2;
    public mq5 c2;
    public boolean d2;
    public int e2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2a(e eVar, long j, int i, i61 i61Var) {
        super(r3, eVar, new my0(r4));
        Activity parentActivity = eVar.getParentActivity();
        my0 my0Var = new my0();
        my0Var.f = 2;
        my0Var.b = 3;
        my0Var.g = eVar.getResourceProvider();
        this.U1 = new HashSet();
        this.c2 = mq5.e;
        Context context = getContext();
        oz4 oz4Var = new oz4();
        this.Z1 = oz4Var;
        oz4Var.a(aob.v0(aob.d6, this.J0));
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        oz4 oz4Var2 = new oz4();
        this.a2 = oz4Var2;
        int i2 = aob.a7;
        oz4Var2.a(aob.v0(i2, this.J0));
        ll0 ll0Var2 = new ll0(oz4Var2, oz4Var2, oz4Var2);
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        s0(aob.v0(i2, this.J0));
        U0();
        this.S1 = i;
        this.T1 = new axa(this.a, j, true);
        this.o1.setActionBarMenuOnItemClick(new g2a(this, this.o1.u().a(1, R.drawable.ic_ab_other), j));
        c51 c51Var = new c51(this.J0, getContext(), true);
        this.X1 = c51Var;
        c51Var.i(ob6.M0(2131750209, null), false, true);
        c51Var.setEnabled(false);
        c51Var.setStateListAnimator(null);
        c51Var.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        int i3 = this.u0;
        frameLayout.setPadding(i3, 0, i3, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout2.addView(c51Var, tre.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new jy8(this, i61Var, (byte) 7));
        jl0 c = ll0Var.c(frameLayout2, null, false);
        c.p(dtd.j(this.J0));
        c.r(hl.L(28.0f));
        c.q(hl.L(5.0f));
        frameLayout2.setBackground(c);
        iye.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, tre.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        rl0 rl0Var = new rl0(ll0Var2.c(frameLayout, null, false));
        rl0Var.b(hl.L(40.0f), true);
        rl0Var.H = jn7.w3;
        frameLayout.setBackground(rl0Var);
        this.b.addView(frameLayout, tre.e(-1, -2, 80));
        getContext();
        q74 q74Var = new q74(3, false);
        this.V1 = q74Var;
        q74Var.O = new ar1(this, (byte) 15);
        this.n1.setPadding(hl.L(9.0f) + this.u0, 0, hl.L(9.0f) + this.u0, 0);
        this.n1.setClipToPadding(false);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(q74Var);
        this.n1.setOnItemClickListener(new t39(this, (byte) 5));
        this.n1.j(new e98(this, (byte) 16));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        this.b2.O(true);
        jn7.f(this.a).b(this, jn7.I3);
        Z0();
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new hj8(this, (byte) 18), this.J0);
        this.b2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return ob6.M0(2131750208, null);
    }

    @Override // nx0
    public final l2d Y(l2d l2dVar) {
        this.c2 = hl.H0(l2dVar, false);
        Z0();
        return l2d.b;
    }

    public final void Z0() {
        this.n1.setPadding(hl.L(9.0f) + this.c2.a + this.u0, 0, hl.L(9.0f) + this.c2.c + this.u0, this.c2.d);
        mq5 mq5Var = this.c2;
        int i = mq5Var.a;
        int i2 = this.u0;
        int i3 = mq5Var.c + i2;
        int i4 = mq5Var.d;
        this.W1.setPadding(i + i2, 0, i3, i4);
    }

    public final boolean a1() {
        d79 d79Var = this.n1;
        if (d79Var != null && d79Var.H) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                if (d79Var.getChildAt(i) instanceof tk4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i != jn7.I3 || (l9cVar = this.b2) == null) {
            return;
        }
        l9cVar.O(true);
        if (a1()) {
            this.T1.a();
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        jn7.f(this.a).n(this, jn7.I3);
        super.dismiss();
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            oz4 oz4Var = this.Z1;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.d6, this.J0));
            }
            oz4 oz4Var2 = this.a2;
            if (oz4Var2 != null) {
                oz4Var2.a(aob.v0(aob.a7, this.J0));
            }
            int v0 = aob.v0(aob.a7, this.J0);
            if (this.d2 && v0 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = v0;
            s0(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
