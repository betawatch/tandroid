package bi;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k8 extends sa implements fs {
    public final int T1;
    public final di.o8 U1;
    public final HashSet V1;
    public final uy W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public y60 Z1;
    public final ui.c a2;
    public final ui.c b2;
    public z41 c2;
    public i0.b d2;
    public boolean e2;
    public int f2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k8(org.telegram.ui.ActionBar.h2 h2Var, long j3, int i7, d5 d5Var) {
        super(r3, h2Var, new ra(r4));
        Activity parentActivity = h2Var.getParentActivity();
        ra raVar = new ra();
        raVar.f = 2;
        raVar.b = 3;
        raVar.g = h2Var.getResourceProvider();
        this.V1 = new HashSet();
        this.d2 = i0.b.e;
        Context context = getContext();
        ui.c cVar = new ui.c();
        this.a2 = cVar;
        cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        ui.c cVar3 = new ui.c();
        this.b2 = cVar3;
        int i10 = org.telegram.ui.ActionBar.n6.a7;
        cVar3.a(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        v0(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
        Z0();
        this.T1 = i7;
        this.U1 = new di.o8(this.a, j3, true);
        this.p1.setActionBarMenuOnItemClick(new j8(this, this.p1.t().a(1, R.drawable.ic_ab_other), j3));
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.Y1 = dVar;
        dVar.i(gd.M0(2131750234, null), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        int i11 = this.u0;
        frameLayout.setPadding(i11, 0, i11, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(dVar, ma.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new ai.v2(8, this, d5Var));
        fh.g c10 = cVar2.c(frameLayout2, null, false);
        c10.p(c8.i0.k(this.J0));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        c8.ra.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, ma.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(cVar4.c(frameLayout, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = ks.x3;
        frameLayout.setBackground(dVar2);
        this.b.addView(frameLayout, ma.e(-1, -2, 80));
        getContext();
        uy uyVar = new uy(3, false);
        this.W1 = uyVar;
        uyVar.O = new s2(this, 2);
        this.o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.u0, 0);
        this.o1.setClipToPadding(false);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.setLayoutManager(uyVar);
        this.o1.setOnItemClickListener(new h8(this, 0));
        this.o1.j(new q1(this, 3));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        this.c2.O(true);
        ks.f(this.a).c(this, ks.I3);
        e1();
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.a, 0, false, new b(this, 11), this.J0);
        this.c2 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return gd.M0(2131750233, null);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final r0.l1 b0(r0.l1 l1Var) {
        this.d2 = org.telegram.messenger.g0.I0(l1Var, false);
        e1();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 != ks.I3 || (z41Var = this.c2) == null) {
            return;
        }
        z41Var.O(true);
        if (f1()) {
            this.U1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        ks.f(this.a).n(this, ks.I3);
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
        ck0 ck0Var = this.o1;
        if (ck0Var != null && ck0Var.H) {
            for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
                if (ck0Var.getChildAt(i7) instanceof wz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        super.s0();
        try {
            ui.c cVar = this.a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
            }
            ui.c cVar2 = this.b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0);
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
