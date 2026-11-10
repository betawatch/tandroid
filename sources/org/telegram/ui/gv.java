package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gv implements f50, org.telegram.ui.Components.vf, org.telegram.ui.Components.s4, org.telegram.ui.Components.bm0, org.telegram.ui.Components.ej0, fi.ma, org.telegram.ui.Components.q00 {
    public final /* synthetic */ zw a;

    public /* synthetic */ gv(zw zwVar) {
        this.a = zwVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.vf
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        zw zwVar = this.a;
        if (zwVar.D2 == null || zwVar.J2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < zwVar.J2.size(); i11++) {
            arrayList.add(org.telegram.messenger.xr.a(((Long) zwVar.J2.get(i11)).longValue(), 0L));
        }
        zw zwVar2 = this.a;
        zwVar2.D2.y(zwVar2, arrayList, charSequence, false, z9, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        zw zwVar = this.a;
        ArrayList arrayList = zwVar.J2;
        zwVar.L2 = i7;
        zwVar.M2 = i10;
        zwVar.N2 = false;
        if (zwVar.D2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        zwVar.D2.y(zwVar, arrayList2, zwVar.C1.getFieldText(), false, z9, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.bm0
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        this.a.T4(t2Var);
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ int S0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public void a1(CharSequence charSequence, boolean z9, boolean z10) {
        zw zwVar = this.a;
        org.telegram.messenger.g0.i3(new cv(zwVar, 12), 100L);
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            if (z9) {
                if (po0Var.h) {
                    po0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.h41 h41Var = zwVar.I2;
                if (h41Var != null) {
                    org.telegram.messenger.g0.r(h41Var);
                }
                org.telegram.ui.Components.h41 h41Var2 = new org.telegram.ui.Components.h41(16, this, charSequence);
                zwVar.I2 = h41Var2;
                org.telegram.messenger.g0.i3(h41Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // fi.ma
    public fi.qa d(long j3) {
        sv svVar = this.a.E0;
        return fi.qa.c(svVar != null ? svVar.e(j3) : null);
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.f50
    public void e(g50 g50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.xr.a(-j3, 0L));
        zw zwVar = this.a;
        tw twVar = zwVar.D2;
        if (zwVar.C2) {
            zwVar.removeSelfFromStack();
        }
        twVar.y(zwVar, arrayList, null, true, zwVar.K2, zwVar.L2, zwVar.M2, null);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.g6;
        zw zwVar = this.a;
        if (z9) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.n0) {
                zwVar.Z4(g6Var.getDialogId(), view);
                return true;
            }
        }
        iw iwVar = zwVar.C0;
        bi.q1 q1Var = iwVar.a0;
        return zwVar.A4(view, i7, f10, iwVar.d0);
    }

    @Override // org.telegram.ui.Components.bm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // fi.ma
    public void g(long j3, bi.r3 r3Var) {
        zw zwVar = this.a;
        if (zwVar.E0 == null) {
            r3Var.run();
            return;
        }
        zwVar.J4(false, true);
        zwVar.Q = true;
        zwVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == zwVar.getUserConfig().e()) {
            zwVar.E0.S.h1(0, 0);
        } else {
            zwVar.E0.k(j3);
        }
        zwVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new nw(0, this, r3Var));
    }

    public void h(jg.o0 o0Var) {
        zw zwVar = this.a;
        if (zwVar.r3) {
            iw iwVar = zwVar.C0;
            if (iwVar != null) {
                iwVar.C0.remove(o0Var);
                iw iwVar2 = zwVar.C0;
                String obj = zwVar.j0.getSearchField().getText().toString();
                View currentView = iwVar2.getCurrentView();
                boolean z9 = TextUtils.isEmpty(iwVar2.M0) ? true : !iwVar2.g0;
                iwVar2.M0 = obj;
                iwVar2.P(currentView, iwVar2.getCurrentPosition(), obj, z9);
            }
            zwVar.j5(true, null, null, false, true);
            zwVar.Y.a.l(zwVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public void i() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ sm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ej0
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public void Y1(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public void k1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.vf
    public void w(float f10) {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.vf
    public void D() {
    }

    @Override // org.telegram.ui.Components.vf
    public void E() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.vf
    public void X1() {
    }

    @Override // org.telegram.ui.Components.vf
    public void a() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.vf
    public void c1() {
    }

    @Override // org.telegram.ui.Components.vf
    public void d2() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.vf
    public void h1() {
    }

    @Override // org.telegram.ui.Components.vf
    public void h2() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.vf
    public void l2() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.vf
    public void r0() {
    }

    @Override // org.telegram.ui.Components.vf
    public void t() {
    }

    @Override // org.telegram.ui.Components.vf
    public void t1() {
    }

    @Override // org.telegram.ui.Components.vf
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.vf
    public void M(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
