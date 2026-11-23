package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gv implements d50, org.telegram.ui.Components.mg, org.telegram.ui.Components.z4, org.telegram.ui.Components.pm0, org.telegram.ui.Components.tj0, hi.eb, org.telegram.ui.Components.b10 {
    public final /* synthetic */ bx a;

    public /* synthetic */ gv(bx bxVar) {
        this.a = bxVar;
    }

    @Override // org.telegram.ui.Components.mg
    public void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        bx bxVar = this.a;
        if (bxVar.E2 == null || bxVar.K2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < bxVar.K2.size(); i11++) {
            arrayList.add(org.telegram.messenger.sr.a(((Long) bxVar.K2.get(i11)).longValue(), 0L));
        }
        bx bxVar2 = this.a;
        bxVar2.E2.z(bxVar2, arrayList, charSequence, false, z10, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        bx bxVar = this.a;
        ArrayList arrayList = bxVar.K2;
        bxVar.M2 = i7;
        bxVar.N2 = i10;
        bxVar.O2 = false;
        if (bxVar.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.sr.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        bxVar.E2.z(bxVar, arrayList2, bxVar.D1.getFieldText(), false, z10, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ int X0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // hi.eb
    public hi.ib a(long j3) {
        sv svVar = this.a.F0;
        return hi.ib.c(svVar != null ? svVar.e(j3) : null);
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ rm a0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean b1(long j3) {
        return false;
    }

    @Override // hi.eb
    public void c(long j3, bi.e4 e4Var) {
        bx bxVar = this.a;
        if (bxVar.F0 == null) {
            e4Var.run();
            return;
        }
        bxVar.R4(false, true);
        bxVar.R = true;
        bxVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == bxVar.getUserConfig().e()) {
            bxVar.F0.T.h1(0, 0);
        } else {
            bxVar.F0.k(j3);
        }
        bxVar.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new ow(0, this, e4Var));
    }

    @Override // org.telegram.ui.d50
    public void d(e50 e50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.sr.a(-j3, 0L));
        bx bxVar = this.a;
        vw vwVar = bxVar.E2;
        if (bxVar.D2) {
            bxVar.removeSelfFromStack();
        }
        vwVar.z(bxVar, arrayList, null, true, bxVar.L2, bxVar.M2, bxVar.N2, null);
    }

    @Override // org.telegram.ui.Components.mg
    public boolean d1() {
        return false;
    }

    public void e(jg.o0 o0Var) {
        bx bxVar = this.a;
        if (bxVar.s3) {
            jw jwVar = bxVar.D0;
            if (jwVar != null) {
                jwVar.D0.remove(o0Var);
                jw jwVar2 = bxVar.D0;
                String obj = bxVar.k0.getSearchField().getText().toString();
                View currentView = jwVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(jwVar2.N0) ? true : !jwVar2.h0;
                jwVar2.N0 = obj;
                jwVar2.N(currentView, jwVar2.getCurrentPosition(), obj, z10);
            }
            bxVar.r5(true, null, null, false, true);
            bxVar.Z.a.l(bxVar.Y.r);
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean g(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.g6;
        bx bxVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.o0) {
                bxVar.h5(g6Var.getDialogId(), view);
                return true;
            }
        }
        jw jwVar = bxVar.D0;
        di.b1 b1Var = jwVar.b0;
        return bxVar.F4(view, i7, f10, jwVar.e0);
    }

    @Override // org.telegram.ui.Components.tj0
    public void h() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public void i1(CharSequence charSequence, boolean z10, boolean z11) {
        bx bxVar = this.a;
        org.telegram.messenger.g0.h3(new yu(bxVar, 17), 100L);
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            if (z10) {
                if (dp0Var.h) {
                    dp0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.voip.o oVar = bxVar.J2;
                if (oVar != null) {
                    org.telegram.messenger.g0.r(oVar);
                }
                org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(12, this, charSequence);
                bxVar.J2 = oVar2;
                org.telegram.messenger.g0.h3(oVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void l(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TLRPC.Peer o() {
        return null;
    }

    @Override // org.telegram.ui.Components.pm0
    public void v(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean w0() {
        return true;
    }

    @Override // org.telegram.ui.Components.pm0
    public void y(org.telegram.ui.Cells.u2 u2Var) {
        this.a.b5(u2Var);
    }

    @Override // org.telegram.ui.Components.mg
    public void Q(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void U0(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public void i2(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void u(float f10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void E() {
    }

    @Override // org.telegram.ui.Components.mg
    public void G1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.mg
    public void b() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.mg
    public void g0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void j1() {
    }

    @Override // org.telegram.ui.Components.mg
    public void m2() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.mg
    public void q1() {
    }

    @Override // org.telegram.ui.Components.mg
    public void r() {
    }

    @Override // org.telegram.ui.Components.mg
    public void r2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void t2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void v2() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void z() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void K(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
