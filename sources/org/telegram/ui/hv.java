package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hv implements e50, org.telegram.ui.Components.ng, org.telegram.ui.Components.a5, org.telegram.ui.Components.qm0, org.telegram.ui.Components.tj0, hi.ja, org.telegram.ui.Components.d10 {
    public final /* synthetic */ cx a;

    public /* synthetic */ hv(cx cxVar) {
        this.a = cxVar;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qm0
    public void F(org.telegram.ui.Cells.u2 u2Var) {
        this.a.b5(u2Var);
    }

    @Override // org.telegram.ui.Components.ng
    public void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        cx cxVar = this.a;
        if (cxVar.E2 == null || cxVar.K2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < cxVar.K2.size(); i11++) {
            arrayList.add(org.telegram.messenger.tr.a(((Long) cxVar.K2.get(i11)).longValue(), 0L));
        }
        cx cxVar2 = this.a;
        cxVar2.E2.y(cxVar2, arrayList, charSequence, false, z10, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        cx cxVar = this.a;
        ArrayList arrayList = cxVar.K2;
        cxVar.M2 = i7;
        cxVar.N2 = i10;
        cxVar.O2 = false;
        if (cxVar.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.tr.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        cxVar.E2.y(cxVar, arrayList2, cxVar.D1.getFieldText(), false, z10, i7, i10, null);
    }

    @Override // hi.ja
    public hi.na a(long j3) {
        tv tvVar = this.a.F0;
        return hi.na.c(tvVar != null ? tvVar.e(j3) : null);
    }

    @Override // hi.ja
    public void b(long j3, bi.c4 c4Var) {
        cx cxVar = this.a;
        if (cxVar.F0 == null) {
            c4Var.run();
            return;
        }
        cxVar.R4(false, true);
        cxVar.R = true;
        cxVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == cxVar.getUserConfig().e()) {
            cxVar.F0.T.h1(0, 0);
        } else {
            cxVar.F0.k(j3);
        }
        cxVar.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new pw(0, this, c4Var));
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.e50
    public void c(f50 f50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.tr.a(-j3, 0L));
        cx cxVar = this.a;
        ww wwVar = cxVar.E2;
        if (cxVar.D2) {
            cxVar.removeSelfFromStack();
        }
        wwVar.y(cxVar, arrayList, null, true, cxVar.L2, cxVar.M2, cxVar.N2, null);
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    public void e(jg.o0 o0Var) {
        cx cxVar = this.a;
        if (cxVar.s3) {
            kw kwVar = cxVar.D0;
            if (kwVar != null) {
                kwVar.D0.remove(o0Var);
                kw kwVar2 = cxVar.D0;
                String obj = cxVar.k0.getSearchField().getText().toString();
                View currentView = kwVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(kwVar2.N0) ? true : !kwVar2.h0;
                kwVar2.N0 = obj;
                kwVar2.L(currentView, kwVar2.getCurrentPosition(), obj, z10);
            }
            cxVar.r5(true, null, null, false, true);
            cxVar.Z.a.l(cxVar.Y.r);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        cx cxVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.o0) {
                cxVar.h5(h6Var.getDialogId(), view);
                return true;
            }
        }
        kw kwVar = cxVar.D0;
        di.b1 b1Var = kwVar.b0;
        return cxVar.F4(view, i7, f10, kwVar.e0);
    }

    @Override // org.telegram.ui.Components.qm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void j() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
        cx cxVar = this.a;
        org.telegram.messenger.g0.h3(new zu(cxVar, 17), 100L);
        org.telegram.ui.Components.ep0 ep0Var = cxVar.I2;
        if (ep0Var != null) {
            if (z10) {
                if (ep0Var.h) {
                    ep0Var.e(charSequence, true);
                }
            } else {
                ss ssVar = cxVar.J2;
                if (ssVar != null) {
                    org.telegram.messenger.g0.r(ssVar);
                }
                ss ssVar2 = new ss(8, this, charSequence);
                cxVar.J2 = ssVar2;
                org.telegram.messenger.g0.h3(ssVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ rm m0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean m1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qm0
    public void o(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public void r(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void a1(int i7) {
    }

    @Override // org.telegram.ui.Components.ng
    public void k2(int i7) {
    }

    @Override // org.telegram.ui.Components.ng
    public void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ng
    public void x(float f10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void B2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public void G() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.ng
    public void G1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Components.ng
    public void d() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void l1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void m2() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void q1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void r2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void s0() {
    }

    @Override // org.telegram.ui.Components.ng
    public void u() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void w2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void Q(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.ng
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
