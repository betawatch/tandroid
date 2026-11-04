package ai;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import b8.cd;
import b8.mf;
import b8.pf;
import ci.v8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m6 extends ma implements cs {
    public final int Q1;
    public final v8 R1;
    public final HashSet S1;
    public final hy T1;
    public final FrameLayout U1;
    public final gi.d V1;
    public f60 W1;
    public final si.c X1;
    public final si.c Y1;
    public f41 Z1;
    public i0.b a2;
    public boolean b2;
    public int c2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m6(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3, g3 g3Var) {
        super(r3, d2Var, new la(r4));
        Activity parentActivity = d2Var.getParentActivity();
        la laVar = new la();
        int i10 = 2;
        laVar.f = 2;
        laVar.b = 3;
        laVar.g = d2Var.getResourceProvider();
        this.S1 = new HashSet();
        this.a2 = i0.b.e;
        Context context = getContext();
        si.c cVar = new si.c();
        this.X1 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
        eh.c cVar2 = new eh.c(cVar, cVar, cVar);
        si.c cVar3 = new si.c();
        this.Y1 = cVar3;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        cVar3.a(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        eh.c cVar4 = new eh.c(cVar3, cVar3, cVar3);
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        v0(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        Y0();
        this.Q1 = i3;
        this.R1 = new v8(this.a, j10, true);
        this.m1.setActionBarMenuOnItemClick(new l6(this, this.m1.q().a(1, R.drawable.ic_ab_other), j10));
        gi.d dVar = new gi.d(getContext(), this.J0, true);
        this.V1 = dVar;
        dVar.i(bd.M0(2131750258, null), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        int i12 = this.u0;
        frameLayout.setPadding(i12, 0, i12, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(dVar, mf.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new d(3, this, g3Var));
        gh.g c2 = cVar2.c(frameLayout2, null, false);
        c2.p(cd.j(this.J0));
        c2.r(org.telegram.messenger.g0.L(28.0f));
        c2.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c2);
        pf.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, mf.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        eh.d dVar2 = new eh.d(cVar4.c(frameLayout, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = hs.x3;
        frameLayout.setBackground(dVar2);
        this.b.addView(frameLayout, mf.e(-1, -2, 80));
        getContext();
        hy hyVar = new hy(3, false);
        this.T1 = hyVar;
        hyVar.O = new g2(this, i10);
        this.l1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.u0, 0);
        this.l1.setClipToPadding(false);
        this.l1.setSelectorType(9);
        this.l1.setSelectorDrawableColor(0);
        this.l1.setLayoutManager(hyVar);
        this.l1.setOnItemClickListener(new j6(this, 0));
        this.l1.j(new j5(this, i10));
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        this.Z1.O(true);
        hs.f(this.a).c(this, hs.G3);
        d1();
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, false, new c(this, 9), this.J0);
        this.Z1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131750257, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final r0.k1 b0(r0.k1 k1Var) {
        this.a2 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.b;
    }

    public final void d1() {
        this.l1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.a2.a + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.a2.c + this.u0, this.a2.d);
        i0.b bVar = this.a2;
        int i3 = bVar.a;
        int i10 = this.u0;
        this.U1.setPadding(i3 + i10, 0, bVar.c + i10, bVar.d);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 != hs.G3 || (f41Var = this.Z1) == null) {
            return;
        }
        f41Var.O(true);
        if (e1()) {
            this.R1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        hs.f(this.a).n(this, hs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        tj0 tj0Var = this.l1;
        if (tj0Var != null && tj0Var.H) {
            for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                if (tj0Var.getChildAt(i3) instanceof iz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            si.c cVar = this.X1;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
            }
            si.c cVar2 = this.Y1;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
            if (this.b2 && w02 == this.c2) {
                return;
            }
            this.b2 = true;
            this.c2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
