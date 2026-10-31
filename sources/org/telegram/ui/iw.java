package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iw implements b60, org.telegram.ui.Components.sf, org.telegram.ui.Components.q4, org.telegram.ui.Components.cn0, org.telegram.ui.Components.jk0, vh.f8, org.telegram.ui.Components.g10 {
    public final /* synthetic */ ay a;

    public /* synthetic */ iw(ay ayVar) {
        this.a = ayVar;
    }

    @Override // org.telegram.ui.Components.sf
    public void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ay ayVar = this.a;
        if (ayVar.C2 == null || ayVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < ayVar.I2.size(); i12++) {
            arrayList.add(org.telegram.messenger.gs.a(((Long) ayVar.I2.get(i12)).longValue(), 0L));
        }
        ay ayVar2 = this.a;
        ayVar2.C2.y(ayVar2, arrayList, charSequence, false, z10, i10, i11, null);
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
        ay ayVar = this.a;
        ArrayList arrayList = ayVar.I2;
        ayVar.K2 = i10;
        ayVar.L2 = i11;
        ayVar.M2 = false;
        if (ayVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(org.telegram.messenger.gs.a(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        ayVar.C2.y(ayVar, arrayList2, ayVar.B1.getFieldText(), false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.cn0
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        this.a.S4(v2Var);
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
        ay ayVar = this.a;
        org.telegram.messenger.i0.h3(new ew(ayVar, 12), 100L);
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            if (z10) {
                if (sp0Var.h) {
                    sp0Var.e(charSequence, true);
                }
            } else {
                xs xsVar = ayVar.H2;
                if (xsVar != null) {
                    org.telegram.messenger.i0.r(xsVar);
                }
                xs xsVar2 = new xs(8, this, charSequence);
                ayVar.H2 = xsVar2;
                org.telegram.messenger.i0.h3(xsVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Components.cn0
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.k6;
        ay ayVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            if (k6Var.n0) {
                ayVar.Y4(k6Var.getDialogId(), view);
                return true;
            }
        }
        kx kxVar = ayVar.C0;
        ag.b1 b1Var = kxVar.a0;
        return ayVar.z4(view, i10, f7, kxVar.d0);
    }

    @Override // org.telegram.ui.Components.sf
    public /* synthetic */ kn b0() {
        return null;
    }

    @Override // vh.f8
    public vh.j8 c(long j10) {
        uw uwVar = this.a.E0;
        return vh.j8.c(uwVar != null ? uwVar.e(j10) : null);
    }

    @Override // vh.f8
    public void d(long j10, bi.e eVar) {
        ay ayVar = this.a;
        if (ayVar.E0 == null) {
            eVar.run();
            return;
        }
        ayVar.I4(false, true);
        ayVar.Q = true;
        ayVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == ayVar.getUserConfig().e()) {
            ayVar.E0.S.h1(0, 0);
        } else {
            ayVar.E0.k(j10);
        }
        ayVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new mh.f(1, this, eVar));
    }

    @Override // org.telegram.ui.b60
    public void f(c60 c60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.gs.a(-j10, 0L));
        ay ayVar = this.a;
        ux uxVar = ayVar.C2;
        if (ayVar.B2) {
            ayVar.removeSelfFromStack();
        }
        uxVar.y(ayVar, arrayList, null, true, ayVar.J2, ayVar.K2, ayVar.L2, null);
    }

    @Override // org.telegram.ui.Components.cn0
    public void finish() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public void g() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    public void h(zf.e0 e0Var) {
        ay ayVar = this.a;
        if (ayVar.q3) {
            kx kxVar = ayVar.C0;
            if (kxVar != null) {
                kxVar.C0.remove(e0Var);
                kx kxVar2 = ayVar.C0;
                String obj = ayVar.j0.getSearchField().getText().toString();
                View currentView = kxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(kxVar2.M0) ? true : !kxVar2.g0;
                kxVar2.M0 = obj;
                kxVar2.P(currentView, kxVar2.getCurrentPosition(), obj, z10);
            }
            ayVar.i5(true, null, null, false, true);
            ayVar.Y.a.l(ayVar.X.r);
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

    @Override // org.telegram.ui.Components.jk0
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
