// default package

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ny9 extends fy0 implements gk7 {
    public final int S1;
    public final xsa T1;
    public final HashSet U1;
    public final w64 V1;
    public final FrameLayout W1;
    public final u41 X1;
    public cs5 Y1;
    public final ix4 Z1;
    public final ix4 a2;
    public l5c b2;
    public io5 c2;
    public boolean d2;
    public int e2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ny9(d dVar, long j, int i, a61 a61Var) {
        super(r3, dVar, new ey0(r4));
        Activity parentActivity = dVar.getParentActivity();
        ey0 ey0Var = new ey0();
        ey0Var.f = 2;
        ey0Var.b = 3;
        ey0Var.g = dVar.getResourceProvider();
        this.U1 = new HashSet();
        this.c2 = io5.e;
        Context context = getContext();
        ix4 ix4Var = new ix4();
        this.Z1 = ix4Var;
        ix4Var.a(bkb.v0(bkb.c6, this.J0));
        kl0 kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        ix4 ix4Var2 = new ix4();
        this.a2 = ix4Var2;
        int i2 = bkb.Z6;
        ix4Var2.a(bkb.v0(i2, this.J0));
        kl0 kl0Var2 = new kl0(ix4Var2, ix4Var2, ix4Var2);
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        s0(bkb.v0(i2, this.J0));
        T0();
        this.S1 = i;
        this.T1 = new xsa(this.a, j, true);
        this.o1.setActionBarMenuOnItemClick(new my9(this, this.o1.t().a(1, R.drawable.ic_ab_other), j));
        u41 u41Var = new u41(this.J0, getContext(), true);
        this.X1 = u41Var;
        u41Var.i(k96.M0(2131750234, null), false, true);
        u41Var.setEnabled(false);
        u41Var.setStateListAnimator(null);
        u41Var.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        int i3 = this.u0;
        frameLayout.setPadding(i3, 0, i3, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        frameLayout2.addView(u41Var, nme.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new b99(this, a61Var, (byte) 4));
        il0 c = kl0Var.c(frameLayout2, null, false);
        c.p(nod.j(this.J0));
        c.r(gl.L(28.0f));
        c.q(gl.L(5.0f));
        frameLayout2.setBackground(c);
        ote.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, nme.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ql0 ql0Var = new ql0(kl0Var2.c(frameLayout, null, false));
        ql0Var.b(gl.L(40.0f), true);
        ql0Var.H = kk7.w3;
        frameLayout.setBackground(ql0Var);
        this.b.addView(frameLayout, nme.e(-1, -2, 80));
        getContext();
        w64 w64Var = new w64(3, false);
        this.V1 = w64Var;
        w64Var.O = new nq1(this, (byte) 15);
        this.n1.setPadding(gl.L(9.0f) + this.u0, 0, gl.L(9.0f) + this.u0, 0);
        this.n1.setClipToPadding(false);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(w64Var);
        this.n1.setOnItemClickListener(new f09(this, (byte) 5));
        this.n1.j(new n58(this, (byte) 16));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        this.b2.O(true);
        kk7.f(this.a).b(this, kk7.H3);
        Y0();
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 18), this.J0);
        this.b2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(2131750233, null);
    }

    @Override // fx0
    public final vxc Y(vxc vxcVar) {
        this.c2 = gl.H0(vxcVar, false);
        Y0();
        return vxc.b;
    }

    public final void Y0() {
        this.n1.setPadding(gl.L(9.0f) + this.c2.a + this.u0, 0, gl.L(9.0f) + this.c2.c + this.u0, this.c2.d);
        io5 io5Var = this.c2;
        int i = io5Var.a;
        int i2 = this.u0;
        int i3 = io5Var.c + i2;
        int i4 = io5Var.d;
        this.W1.setPadding(i + i2, 0, i3, i4);
    }

    public final boolean Z0() {
        o39 o39Var = this.n1;
        if (o39Var != null && o39Var.H) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                if (o39Var.getChildAt(i) instanceof pi4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i != kk7.H3 || (l5cVar = this.b2) == null) {
            return;
        }
        l5cVar.O(true);
        if (Z0()) {
            this.T1.a();
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        kk7.f(this.a).n(this, kk7.H3);
        super.dismiss();
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            ix4 ix4Var = this.Z1;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.c6, this.J0));
            }
            ix4 ix4Var2 = this.a2;
            if (ix4Var2 != null) {
                ix4Var2.a(bkb.v0(bkb.Z6, this.J0));
            }
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (this.d2 && v0 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = v0;
            s0(v0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
