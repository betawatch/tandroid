package bi;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import c8.na;
import c8.sa;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q8 extends ra implements fs {
    public final int T1;
    public final di.p8 U1;
    public final HashSet V1;
    public final ty W1;
    public final FrameLayout X1;
    public final hi.e Y1;
    public x60 Z1;
    public final ui.c a2;
    public final ui.c b2;
    public b51 c2;
    public i0.b d2;
    public boolean e2;
    public int f2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q8(org.telegram.ui.ActionBar.g2 g2Var, long j3, int i7, j5 j5Var) {
        super(r3, g2Var, new qa(r4));
        Activity parentActivity = g2Var.getParentActivity();
        qa qaVar = new qa();
        qaVar.f = 2;
        qaVar.b = 3;
        qaVar.g = g2Var.getResourceProvider();
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
        this.U1 = new di.p8(this.a, j3, true);
        this.p1.setActionBarMenuOnItemClick(new p8(this, this.p1.s().a(1, R.drawable.ic_ab_other), j3));
        hi.e eVar = new hi.e(getContext(), this.J0, true);
        this.Y1 = eVar;
        eVar.i(gd.N0(2131750233, null), false, true);
        eVar.setEnabled(false);
        eVar.setStateListAnimator(null);
        eVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        int i11 = this.u0;
        frameLayout.setPadding(i11, 0, i11, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(eVar, na.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new ai.p2(7, this, j5Var));
        fh.g c10 = cVar2.c(frameLayout2, null, false);
        c10.p(c8.j0.k(this.J0));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        sa.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, na.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar4.c(frameLayout, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar.H = ks.x3;
        frameLayout.setBackground(dVar);
        this.b.addView(frameLayout, na.e(-1, -2, 80));
        getContext();
        ty tyVar = new ty(3, false);
        this.W1 = tyVar;
        tyVar.O = new y2(this, 2);
        this.o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.u0, 0, org.telegram.messenger.g0.L(9.0f) + this.u0, 0);
        this.o1.setClipToPadding(false);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.setLayoutManager(tyVar);
        this.o1.setOnItemClickListener(new n8(this, 0));
        this.o1.j(new v1(this, 3));
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.o1.setItemAnimator(lVar);
        this.c2.O(true);
        ks.f(this.a).c(this, ks.I3);
        e1();
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.a, 0, false, new b(this, 11), this.J0);
        this.c2 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return gd.N0(2131750232, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final r0.l1 b0(r0.l1 l1Var) {
        this.d2 = org.telegram.messenger.g0.I0(l1Var, false);
        e1();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if (i7 != ks.I3 || (b51Var = this.c2) == null) {
            return;
        }
        b51Var.O(true);
        if (f1()) {
            this.U1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
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
        ek0 ek0Var = this.o1;
        if (ek0Var != null && ek0Var.H) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                if (ek0Var.getChildAt(i7) instanceof vz) {
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
