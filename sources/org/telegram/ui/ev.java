package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ev implements b50, org.telegram.ui.Components.cg, org.telegram.ui.Components.r4, org.telegram.ui.Components.fm0, org.telegram.ui.Components.jj0, hi.ja, org.telegram.ui.Components.u00 {
    public final /* synthetic */ yw a;

    public /* synthetic */ ev(yw ywVar) {
        this.a = ywVar;
    }

    @Override // org.telegram.ui.Components.fm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public void D(org.telegram.ui.Cells.t2 t2Var) {
        this.a.T4(t2Var);
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        yw ywVar = this.a;
        ArrayList arrayList = ywVar.K2;
        ywVar.M2 = i7;
        ywVar.N2 = i10;
        ywVar.O2 = false;
        if (ywVar.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.ur.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        ywVar.E2.y(ywVar, arrayList2, ywVar.D1.getFieldText(), false, z10, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.cg
    public void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        yw ywVar = this.a;
        if (ywVar.E2 == null || ywVar.K2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < ywVar.K2.size(); i11++) {
            arrayList.add(org.telegram.messenger.ur.a(((Long) ywVar.K2.get(i11)).longValue(), 0L));
        }
        yw ywVar2 = this.a;
        ywVar2.E2.y(ywVar2, arrayList, charSequence, false, z10, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override // hi.ja
    public hi.na a(long j3) {
        qv qvVar = this.a.F0;
        return hi.na.c(qvVar != null ? qvVar.e(j3) : null);
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.b50
    public void c(c50 c50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.ur.a(-j3, 0L));
        yw ywVar = this.a;
        sw swVar = ywVar.E2;
        if (ywVar.D2) {
            ywVar.removeSelfFromStack();
        }
        swVar.y(ywVar, arrayList, null, true, ywVar.L2, ywVar.M2, ywVar.N2, null);
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // hi.ja
    public void e(long j3, di.x2 x2Var) {
        yw ywVar = this.a;
        if (ywVar.F0 == null) {
            x2Var.run();
            return;
        }
        ywVar.J4(false, true);
        ywVar.R = true;
        ywVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == ywVar.getUserConfig().e()) {
            ywVar.F0.T.h1(0, 0);
        } else {
            ywVar.F0.k(j3);
        }
        ywVar.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new mw(0, this, x2Var));
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public boolean f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.f6;
        yw ywVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.o0) {
                ywVar.Z4(f6Var.getDialogId(), view);
                return true;
            }
        }
        hw hwVar = ywVar.D0;
        di.c1 c1Var = hwVar.b0;
        return ywVar.A4(view, i7, f10, hwVar.e0);
    }

    @Override // org.telegram.ui.Components.fm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    public void g(jg.o0 o0Var) {
        yw ywVar = this.a;
        if (ywVar.s3) {
            hw hwVar = ywVar.D0;
            if (hwVar != null) {
                hwVar.D0.remove(o0Var);
                hw hwVar2 = ywVar.D0;
                String obj = ywVar.k0.getSearchField().getText().toString();
                View currentView = hwVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(hwVar2.N0) ? true : !hwVar2.h0;
                hwVar2.N0 = obj;
                hwVar2.O(currentView, hwVar2.getCurrentPosition(), obj, z10);
            }
            ywVar.j5(true, null, null, false, true);
            ywVar.Z.a.l(ywVar.Y.r);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public void i() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
        yw ywVar = this.a;
        org.telegram.messenger.g0.i3(new av(ywVar, 12), 100L);
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            if (z10) {
                if (to0Var.h) {
                    to0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.voip.u uVar = ywVar.J2;
                if (uVar != null) {
                    org.telegram.messenger.g0.r(uVar);
                }
                org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(11, this, charSequence);
                ywVar.J2 = uVar2;
                org.telegram.messenger.g0.i3(uVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ boolean m1() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ qm p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.jj0
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public void a1(int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public void b0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public void k2(int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.cg
    public void y(float f10) {
    }

    @Override // org.telegram.ui.Components.cg
    public void B2() {
    }

    @Override // org.telegram.ui.Components.cg
    public void E() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.cg
    public void G1() {
    }

    @Override // org.telegram.ui.Components.cg
    public void I() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.cg
    public void b() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.cg
    public void l1() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.cg
    public void m2() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.cg
    public void q1() {
    }

    @Override // org.telegram.ui.Components.cg
    public void r2() {
    }

    @Override // org.telegram.ui.Components.cg
    public void s0() {
    }

    @Override // org.telegram.ui.Components.cg
    public void v() {
    }

    @Override // org.telegram.ui.Components.cg
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.cg
    public void w2() {
    }

    @Override // org.telegram.ui.Components.cg
    public void W(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
