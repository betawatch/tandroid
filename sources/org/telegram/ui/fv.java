package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fv implements e50, org.telegram.ui.Components.wf, org.telegram.ui.Components.t4, org.telegram.ui.Components.cm0, org.telegram.ui.Components.fj0, fi.ma, org.telegram.ui.Components.r00 {
    public final /* synthetic */ yw a;

    public /* synthetic */ fv(yw ywVar) {
        this.a = ywVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        yw ywVar = this.a;
        if (ywVar.D2 == null || ywVar.J2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < ywVar.J2.size(); i11++) {
            arrayList.add(org.telegram.messenger.xr.a(((Long) ywVar.J2.get(i11)).longValue(), 0L));
        }
        yw ywVar2 = this.a;
        ywVar2.D2.y(ywVar2, arrayList, charSequence, false, z9, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        yw ywVar = this.a;
        ArrayList arrayList = ywVar.J2;
        ywVar.L2 = i7;
        ywVar.M2 = i10;
        ywVar.N2 = false;
        if (ywVar.D2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        ywVar.D2.y(ywVar, arrayList2, ywVar.C1.getFieldText(), false, z9, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.cm0
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        this.a.T4(t2Var);
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ int S0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public void a1(CharSequence charSequence, boolean z9, boolean z10) {
        yw ywVar = this.a;
        org.telegram.messenger.g0.i3(new bv(ywVar, 12), 100L);
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            if (z9) {
                if (qo0Var.h) {
                    qo0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.m51 m51Var = ywVar.I2;
                if (m51Var != null) {
                    org.telegram.messenger.g0.r(m51Var);
                }
                org.telegram.ui.Components.m51 m51Var2 = new org.telegram.ui.Components.m51(15, this, charSequence);
                ywVar.I2 = m51Var2;
                org.telegram.messenger.g0.i3(m51Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // fi.ma
    public fi.qa d(long j3) {
        rv rvVar = this.a.E0;
        return fi.qa.c(rvVar != null ? rvVar.e(j3) : null);
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.e50
    public void e(f50 f50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.xr.a(-j3, 0L));
        yw ywVar = this.a;
        sw swVar = ywVar.D2;
        if (ywVar.C2) {
            ywVar.removeSelfFromStack();
        }
        swVar.y(ywVar, arrayList, null, true, ywVar.K2, ywVar.L2, ywVar.M2, null);
    }

    @Override // org.telegram.ui.Components.fj0
    public boolean f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.g6;
        yw ywVar = this.a;
        if (z9) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.n0) {
                ywVar.Z4(g6Var.getDialogId(), view);
                return true;
            }
        }
        hw hwVar = ywVar.C0;
        bi.q1 q1Var = hwVar.a0;
        return ywVar.A4(view, i7, f10, hwVar.d0);
    }

    @Override // org.telegram.ui.Components.cm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // fi.ma
    public void g(long j3, bi.r3 r3Var) {
        yw ywVar = this.a;
        if (ywVar.E0 == null) {
            r3Var.run();
            return;
        }
        ywVar.J4(false, true);
        ywVar.Q = true;
        ywVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == ywVar.getUserConfig().e()) {
            ywVar.E0.S.h1(0, 0);
        } else {
            ywVar.E0.k(j3);
        }
        ywVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new mw(0, this, r3Var));
    }

    public void h(jg.o0 o0Var) {
        yw ywVar = this.a;
        if (ywVar.r3) {
            hw hwVar = ywVar.C0;
            if (hwVar != null) {
                hwVar.C0.remove(o0Var);
                hw hwVar2 = ywVar.C0;
                String obj = ywVar.j0.getSearchField().getText().toString();
                View currentView = hwVar2.getCurrentView();
                boolean z9 = TextUtils.isEmpty(hwVar2.M0) ? true : !hwVar2.g0;
                hwVar2.M0 = obj;
                hwVar2.P(currentView, hwVar2.getCurrentPosition(), obj, z9);
            }
            ywVar.j5(true, null, null, false, true);
            ywVar.Y.a.l(ywVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.fj0
    public void i() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ sm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.fj0
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public void Y1(boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public void k1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.wf
    public void w(float f10) {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void D() {
    }

    @Override // org.telegram.ui.Components.wf
    public void E() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.wf
    public void X1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void a() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.wf
    public void c1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void d2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void h1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void h2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void l2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void r0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void t() {
    }

    @Override // org.telegram.ui.Components.wf
    public void t1() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void M(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
