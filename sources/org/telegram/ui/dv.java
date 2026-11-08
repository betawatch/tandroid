package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class dv implements c50, org.telegram.ui.Components.wf, org.telegram.ui.Components.t4, org.telegram.ui.Components.bm0, org.telegram.ui.Components.ej0, fi.ma, org.telegram.ui.Components.r00 {
    public final /* synthetic */ ww a;

    public /* synthetic */ dv(ww wwVar) {
        this.a = wwVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        ww wwVar = this.a;
        if (wwVar.C2 == null || wwVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < wwVar.I2.size(); i11++) {
            arrayList.add(org.telegram.messenger.xr.a(((Long) wwVar.I2.get(i11)).longValue(), 0L));
        }
        ww wwVar2 = this.a;
        wwVar2.C2.y(wwVar2, arrayList, charSequence, false, z9, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        ww wwVar = this.a;
        ArrayList arrayList = wwVar.I2;
        wwVar.K2 = i7;
        wwVar.L2 = i10;
        wwVar.M2 = false;
        if (wwVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        wwVar.C2.y(wwVar, arrayList2, wwVar.B1.getFieldText(), false, z9, i7, i10, null);
    }

    @Override // org.telegram.ui.Components.bm0
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
        ww wwVar = this.a;
        org.telegram.messenger.g0.i3(new zu(wwVar, 12), 100L);
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            if (z9) {
                if (po0Var.h) {
                    po0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.l51 l51Var = wwVar.H2;
                if (l51Var != null) {
                    org.telegram.messenger.g0.r(l51Var);
                }
                org.telegram.ui.Components.l51 l51Var2 = new org.telegram.ui.Components.l51(15, this, charSequence);
                wwVar.H2 = l51Var2;
                org.telegram.messenger.g0.i3(l51Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // fi.ma
    public fi.qa d(long j3) {
        pv pvVar = this.a.E0;
        return fi.qa.c(pvVar != null ? pvVar.e(j3) : null);
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.c50
    public void e(d50 d50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.xr.a(-j3, 0L));
        ww wwVar = this.a;
        qw qwVar = wwVar.C2;
        if (wwVar.B2) {
            wwVar.removeSelfFromStack();
        }
        qwVar.y(wwVar, arrayList, null, true, wwVar.J2, wwVar.K2, wwVar.L2, null);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.g6;
        ww wwVar = this.a;
        if (z9) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.n0) {
                wwVar.Z4(g6Var.getDialogId(), view);
                return true;
            }
        }
        fw fwVar = wwVar.C0;
        bi.q1 q1Var = fwVar.a0;
        return wwVar.A4(view, i7, f10, fwVar.d0);
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
        ww wwVar = this.a;
        if (wwVar.E0 == null) {
            r3Var.run();
            return;
        }
        wwVar.J4(false, true);
        wwVar.Q = true;
        wwVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == wwVar.getUserConfig().e()) {
            wwVar.E0.S.h1(0, 0);
        } else {
            wwVar.E0.k(j3);
        }
        wwVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new kw(0, this, r3Var));
    }

    public void h(jg.o0 o0Var) {
        ww wwVar = this.a;
        if (wwVar.q3) {
            fw fwVar = wwVar.C0;
            if (fwVar != null) {
                fwVar.C0.remove(o0Var);
                fw fwVar2 = wwVar.C0;
                String obj = wwVar.j0.getSearchField().getText().toString();
                View currentView = fwVar2.getCurrentView();
                boolean z9 = TextUtils.isEmpty(fwVar2.M0) ? true : !fwVar2.g0;
                fwVar2.M0 = obj;
                fwVar2.P(currentView, fwVar2.getCurrentPosition(), obj, z9);
            }
            wwVar.j5(true, null, null, false, true);
            wwVar.Y.a.l(wwVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.ej0
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
    public /* synthetic */ qm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ej0
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
