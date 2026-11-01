package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hw implements a60, org.telegram.ui.Components.sf, org.telegram.ui.Components.q4, org.telegram.ui.Components.dn0, org.telegram.ui.Components.kk0, vh.f8, org.telegram.ui.Components.g10 {
    public final /* synthetic */ zx a;

    public /* synthetic */ hw(zx zxVar) {
        this.a = zxVar;
    }

    @Override // org.telegram.ui.Components.sf
    public void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        zx zxVar = this.a;
        if (zxVar.C2 == null || zxVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < zxVar.I2.size(); i12++) {
            arrayList.add(org.telegram.messenger.hs.a(((Long) zxVar.I2.get(i12)).longValue(), 0L));
        }
        zx zxVar2 = this.a;
        zxVar2.C2.z(zxVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ int H0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        zx zxVar = this.a;
        ArrayList arrayList = zxVar.I2;
        zxVar.K2 = i10;
        zxVar.L2 = i11;
        zxVar.M2 = false;
        if (zxVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(org.telegram.messenger.hs.a(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        zxVar.C2.z(zxVar, arrayList2, zxVar.B1.getFieldText(), false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.dn0
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        this.a.T4(v2Var);
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public void V0(CharSequence charSequence, boolean z10, boolean z11) {
        zx zxVar = this.a;
        org.telegram.messenger.i0.h3(new dw(zxVar, 12), 100L);
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            if (z10) {
                if (tp0Var.h) {
                    tp0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.voip.u uVar = zxVar.H2;
                if (uVar != null) {
                    org.telegram.messenger.i0.r(uVar);
                }
                org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(9, this, charSequence);
                zxVar.H2 = uVar2;
                org.telegram.messenger.i0.h3(uVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Components.dn0
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.kk0
    public boolean b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.k6;
        zx zxVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            if (k6Var.n0) {
                zxVar.Z4(k6Var.getDialogId(), view);
                return true;
            }
        }
        jx jxVar = zxVar.C0;
        ag.b1 b1Var = jxVar.a0;
        return zxVar.A4(view, i10, f7, jxVar.d0);
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ kn b0() {
        return null;
    }

    @Override // vh.f8
    public vh.j8 c(long j10) {
        tw twVar = this.a.E0;
        return vh.j8.c(twVar != null ? twVar.e(j10) : null);
    }

    @Override // vh.f8
    public void d(long j10, bi.e eVar) {
        zx zxVar = this.a;
        if (zxVar.E0 == null) {
            eVar.run();
            return;
        }
        zxVar.J4(false, true);
        zxVar.Q = true;
        zxVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == zxVar.getUserConfig().e()) {
            zxVar.E0.S.h1(0, 0);
        } else {
            zxVar.E0.k(j10);
        }
        zxVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new mh.f(1, this, eVar));
    }

    @Override // org.telegram.ui.a60
    public void f(b60 b60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.hs.a(-j10, 0L));
        zx zxVar = this.a;
        tx txVar = zxVar.C2;
        if (zxVar.B2) {
            zxVar.removeSelfFromStack();
        }
        txVar.z(zxVar, arrayList, null, true, zxVar.J2, zxVar.K2, zxVar.L2, null);
    }

    @Override // org.telegram.ui.Components.dn0
    public void finish() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.kk0
    public void g() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    public void h(zf.e0 e0Var) {
        zx zxVar = this.a;
        if (zxVar.q3) {
            jx jxVar = zxVar.C0;
            if (jxVar != null) {
                jxVar.C0.remove(e0Var);
                jx jxVar2 = zxVar.C0;
                String obj = zxVar.j0.getSearchField().getText().toString();
                View currentView = jxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(jxVar2.M0) ? true : !jxVar2.g0;
                jxVar2.M0 = obj;
                jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj, z10);
            }
            zxVar.j5(true, null, null, false, true);
            zxVar.Y.a.l(zxVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.kk0
    public void p(float f7) {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ int r() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ TLRPC.Peer u() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void G0(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void Q1(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void U1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void V(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.sf
    public void y(float f7) {
    }

    @Override // org.telegram.ui.Components.sf
    public void C() {
    }

    @Override // org.telegram.ui.Components.sf
    public void D() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void T1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.sf
    public void X0() {
    }

    @Override // org.telegram.ui.Components.sf
    public void Y1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void d1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void d2() {
    }

    @Override // org.telegram.ui.Components.sf
    public void e() {
    }

    @Override // org.telegram.ui.Components.sf
    public void h2() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.sf
    public void j0() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.sf
    public void o1() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.sf
    public void w() {
    }

    @Override // org.telegram.ui.Components.sf
    public void I(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
