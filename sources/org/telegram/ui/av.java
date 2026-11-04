package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class av implements x40, org.telegram.ui.Components.uf, org.telegram.ui.Components.r4, org.telegram.ui.Components.em0, org.telegram.ui.Components.ij0, gi.ma, org.telegram.ui.Components.m00 {
    public final /* synthetic */ uw a;

    public /* synthetic */ av(uw uwVar) {
        this.a = uwVar;
    }

    @Override // org.telegram.ui.Components.uf
    public void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        uw uwVar = this.a;
        if (uwVar.D2 == null || uwVar.J2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < uwVar.J2.size(); i11++) {
            arrayList.add(org.telegram.messenger.pr.a(((Long) uwVar.J2.get(i11)).longValue(), 0L));
        }
        uw uwVar2 = this.a;
        uwVar2.D2.y(uwVar2, arrayList, charSequence, false, z10, i3, i10, null);
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        uw uwVar = this.a;
        ArrayList arrayList = uwVar.J2;
        uwVar.L2 = i3;
        uwVar.M2 = i10;
        uwVar.N2 = false;
        if (uwVar.D2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(org.telegram.messenger.pr.a(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        uwVar.D2.y(uwVar, arrayList2, uwVar.C1.getFieldText(), false, z10, i3, i10, null);
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ int O0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ TL_stories.StoryItem R0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public boolean V0() {
        return false;
    }

    @Override // org.telegram.ui.Components.em0
    public void Y(org.telegram.ui.Cells.t2 t2Var) {
        this.a.T4(t2Var);
    }

    @Override // org.telegram.ui.Components.uf
    public void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        uw uwVar = this.a;
        org.telegram.messenger.g0.i3(new wu(uwVar, 12), 100L);
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            if (z10) {
                if (ro0Var.h) {
                    ro0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.p11 p11Var = uwVar.I2;
                if (p11Var != null) {
                    org.telegram.messenger.g0.r(p11Var);
                }
                org.telegram.ui.Components.p11 p11Var2 = new org.telegram.ui.Components.p11(20, this, charSequence);
                uwVar.I2 = p11Var2;
                org.telegram.messenger.g0.i3(p11Var2, 1000L);
            }
        }
    }

    @Override // gi.ma
    public void a(long j10, ci.e3 e3Var) {
        uw uwVar = this.a;
        if (uwVar.F0 == null) {
            e3Var.run();
            return;
        }
        uwVar.J4(false, true);
        uwVar.R = true;
        uwVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == uwVar.getUserConfig().e()) {
            uwVar.F0.T.h1(0, 0);
        } else {
            uwVar.F0.k(j10);
        }
        uwVar.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new hw(0, this, e3Var));
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.f6;
        uw uwVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.o0) {
                uwVar.Z4(f6Var.getDialogId(), view);
                return true;
            }
        }
        cw cwVar = uwVar.D0;
        ci.j1 j1Var = cwVar.b0;
        return uwVar.A4(view, i3, f10, cwVar.e0);
    }

    @Override // gi.ma
    public gi.qa c(long j10) {
        mv mvVar = this.a.F0;
        return gi.qa.c(mvVar != null ? mvVar.e(j10) : null);
    }

    @Override // org.telegram.ui.x40
    public void d(y40 y40Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.pr.a(-j10, 0L));
        uw uwVar = this.a;
        nw nwVar = uwVar.D2;
        if (uwVar.C2) {
            uwVar.removeSelfFromStack();
        }
        nwVar.y(uwVar, arrayList, null, true, uwVar.K2, uwVar.L2, uwVar.M2, null);
    }

    @Override // org.telegram.ui.Components.em0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    public void g(kg.l0 l0Var) {
        uw uwVar = this.a;
        if (uwVar.r3) {
            cw cwVar = uwVar.D0;
            if (cwVar != null) {
                cwVar.D0.remove(l0Var);
                cw cwVar2 = uwVar.D0;
                String obj = uwVar.k0.getSearchField().getText().toString();
                View currentView = cwVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(cwVar2.N0) ? true : !cwVar2.h0;
                cwVar2.N0 = obj;
                cwVar2.P(currentView, cwVar2.getCurrentPosition(), obj, z10);
            }
            uwVar.j5(true, null, null, false, true);
            uwVar.Z.a.l(uwVar.Y.r);
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public void h() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ mm i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.em0
    public void m(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ int o() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ij0
    public void r(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean u0() {
        return true;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void M0(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public void T1(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void j1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.uf
    public void x(float f10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void E() {
    }

    @Override // org.telegram.ui.Components.uf
    public void F() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void Z0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void b2() {
    }

    @Override // org.telegram.ui.Components.uf
    public void e() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Components.uf
    public void g1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void g2() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void n2() {
    }

    @Override // org.telegram.ui.Components.uf
    public void q0() {
    }

    @Override // org.telegram.ui.Components.uf
    public void r2() {
    }

    @Override // org.telegram.ui.Components.uf
    public void s1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void u() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.uf
    public void O(float f10, int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public void h1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
