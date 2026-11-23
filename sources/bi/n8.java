package bi;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n8 extends sa implements gs {
    public final int T1;
    public final di.p8 U1;
    public final HashSet V1;
    public final wy W1;
    public final FrameLayout X1;
    public final hi.e Y1;
    public a70 Z1;
    public final ui.c a2;
    public final ui.c b2;
    public c51 c2;
    public i0.b d2;
    public boolean e2;
    public int f2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n8(org.telegram.ui.ActionBar.g2 g2Var, long j3, int i7, g5 g5Var) {
        super(r3, g2Var, new ra(r4));
        Activity parentActivity = g2Var.getParentActivity();
        ra raVar = new ra();
        raVar.f = 2;
        raVar.b = 3;
        raVar.g = g2Var.getResourceProvider();
        this.V1 = new HashSet();
        this.d2 = i0.b.e;
        Context context = getContext();
        ui.c cVar = new ui.c();
        this.a2 = cVar;
        cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        ui.c cVar3 = new ui.c();
        this.b2 = cVar3;
        int i10 = org.telegram.ui.ActionBar.m6.a7;
        cVar3.a(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        v0(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        Z0();
        this.T1 = i7;
        this.U1 = new di.p8(this.a, j3, true);
        this.p1.setActionBarMenuOnItemClick(new m8(this, this.p1.s().a(1, R.drawable.ic_ab_other), j3));
        hi.e eVar = new hi.e(getContext(), this.J0, true);
        this.Y1 = eVar;
        eVar.i(hd.N0(2131750233, null), false, true);
        eVar.setEnabled(false);
        eVar.setStateListAnimator(null);
        eVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        int i11 = this.u0;
        frameLayout.setPadding(i11, 0, i11, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(eVar, ma.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new ai.y2(7, this, g5Var));
        fh.g c10 = cVar2.c(frameLayout2, null, false);
        c10.p(c8.i0.k(this.J0));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        c8.ra.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, ma.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar4.c(frameLayout, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar.H = ls.x3;
        frameLayout.setBackground(dVar);
        this.b.addView(frameLayout, ma.e(-1, -2, 80));
        getContext();
        wy wyVar = new wy(3, false);
        this.W1 = wyVar;
        wyVar.O = new w2(this, 2);
        this.o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.u0, 0);
        this.o1.setClipToPadding(false);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.setLayoutManager(wyVar);
        this.o1.setOnItemClickListener(new k8(this, 0));
        this.o1.j(new u1(this, 3));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        this.c2.O(true);
        ls.f(this.a).c(this, ls.I3);
        e1();
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.a, 0, false, new b(this, 11), this.J0);
        this.c2 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return hd.N0(2131750232, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final r0.l1 b0(r0.l1 l1Var) {
        this.d2 = org.telegram.messenger.g0.I0(l1Var, false);
        e1();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 != ls.I3 || (c51Var = this.c2) == null) {
            return;
        }
        c51Var.O(true);
        if (f1()) {
            this.U1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        ls.f(this.a).n(this, ls.I3);
        super.dismiss();
    }

    public final void e1() {
        this.o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.d2.a + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.d2.c + this.u0, this.d2.d);
        i0.b bVar = this.d2;
        int i7 = bVar.a;
        int i10 = this.u0;
        this.X1.setPadding(i7 + i10, 0, bVar.c + i10, bVar.d);
    }

    public final boolean f1() {
        ek0 ek0Var = this.o1;
        if (ek0Var != null && ek0Var.H) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                if (ek0Var.getChildAt(i7) instanceof yz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            ui.c cVar = this.a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
            }
            ui.c cVar2 = this.b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0);
            if (this.e2 && w02 == this.f2) {
                return;
            }
            this.e2 = true;
            this.f2 = w02;
            v0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
