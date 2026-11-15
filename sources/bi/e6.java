package bi;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import c8.na;
import di.l8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e6 extends ja implements is {
    public final int T1;
    public final l8 U1;
    public final HashSet V1;
    public final oy W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public m60 Z1;
    public final ui.c a2;
    public final ui.c b2;
    public p41 c2;
    public i0.c d2;
    public boolean e2;
    public int f2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e6(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7, w2 w2Var) {
        super(r3, e2Var, new ia(r4));
        Activity parentActivity = e2Var.getParentActivity();
        ia iaVar = new ia();
        int i10 = 2;
        iaVar.f = 2;
        iaVar.b = 3;
        iaVar.g = e2Var.getResourceProvider();
        this.V1 = new HashSet();
        this.d2 = i0.c.e;
        Context context = getContext();
        ui.c cVar = new ui.c();
        this.a2 = cVar;
        cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        ui.c cVar3 = new ui.c();
        this.b2 = cVar3;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        cVar3.a(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        v0(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
        Y0();
        this.T1 = i7;
        this.U1 = new l8(this.a, j3, true);
        this.p1.setActionBarMenuOnItemClick(new d6(this, this.p1.s().a(1, R.drawable.ic_ab_other), j3));
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.Y1 = dVar;
        dVar.i(hd.M0(2131750250, null), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        int i12 = this.u0;
        frameLayout.setPadding(i12, 0, i12, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(dVar, c8.ja.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new ai.v2(5, this, w2Var));
        fh.g c10 = cVar2.c(frameLayout2, null, false);
        c10.p(c8.g0.j(this.J0));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        na.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(cVar4.c(frameLayout, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = ns.x3;
        frameLayout.setBackground(dVar2);
        this.b.addView(frameLayout, c8.ja.e(-1, -2, 80));
        getContext();
        oy oyVar = new oy(3, false);
        this.W1 = oyVar;
        oyVar.O = new y1(this, i10);
        this.o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.u0, 0);
        this.o1.setClipToPadding(false);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.setLayoutManager(oyVar);
        this.o1.setOnItemClickListener(new b6(this, 0));
        this.o1.j(new z4(this, i10));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        this.c2.O(true);
        ns.f(this.a).c(this, ns.G3);
        d1();
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, false, new b(this, 9), this.J0);
        this.c2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131750249, null);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final r0.k1 b0(r0.k1 k1Var) {
        this.d2 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.b;
    }

    public final void d1() {
        this.o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.d2.a + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.d2.c + this.u0, this.d2.d);
        i0.c cVar = this.d2;
        int i7 = cVar.a;
        int i10 = this.u0;
        this.X1.setPadding(i7 + i10, 0, cVar.c + i10, cVar.d);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 != ns.G3 || (p41Var = this.c2) == null) {
            return;
        }
        p41Var.O(true);
        if (e1()) {
            this.U1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        ns.f(this.a).n(this, ns.G3);
        super.dismiss();
    }

    public final boolean e1() {
        uj0 uj0Var = this.o1;
        if (uj0Var != null && uj0Var.H) {
            for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
                if (uj0Var.getChildAt(i7) instanceof pz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            ui.c cVar = this.a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
            }
            ui.c cVar2 = this.b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0);
            if (this.e2 && w02 == this.f2) {
                return;
            }
            this.e2 = true;
            this.f2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
