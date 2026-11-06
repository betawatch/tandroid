package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.Components.na implements org.telegram.messenger.ls {
    public final org.telegram.ui.Components.jy P1;
    public final fi.d Q1;
    public final di.q6 R1;
    public final HashMap S1;
    public final int T1;
    public int U1;
    public org.telegram.ui.Components.l41 V1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c21(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7, bi.f4 f4Var) {
        super(r2, f2Var, new org.telegram.ui.Components.ma(r3));
        Activity parentActivity = f2Var.getParentActivity();
        org.telegram.ui.Components.ma maVar = new org.telegram.ui.Components.ma();
        maVar.a = false;
        maVar.c = false;
        maVar.f = 2;
        maVar.g = f2Var.getResourceProvider();
        this.S1 = new HashMap();
        this.T1 = i7;
        di.q6 A = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).P1().A(1, -1, j3, true);
        this.R1 = A;
        A.p(30, false);
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        N();
        Y0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, this.I0);
        int i10 = this.t0;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.b.addView(frameLayout, c8.ha.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.I0);
        frameLayout.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        this.Q1 = dVar;
        dVar.i(org.telegram.messenger.hd.M0(2131744799, null), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new fk0(9, this, f4Var));
        frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(i7, false);
        this.P1 = jyVar;
        jyVar.O = new ai.l(this, 14);
        org.telegram.ui.Components.pj0 pj0Var = this.k1;
        int i11 = this.t0;
        pj0Var.setPadding(i11, 0, i11, 0);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        this.k1.setLayoutManager(jyVar);
        this.k1.setOnItemClickListener(new vx0(this, 4));
        this.k1.setOnItemLongClickListener(new li0(this, 16));
        this.k1.setOnScrollListener(new b21(this, 0));
        this.V1.O(true);
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(pj0Var, getContext(), this.a, 0, false, new a5(this, 26), this.I0);
        this.V1 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131744799, null);
    }

    public final void d1() {
        org.telegram.ui.Components.jy jyVar = this.P1;
        int L0 = jyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(jyVar.N0() - L0) + 1;
        di.q6 q6Var = this.R1;
        if (q6Var != null) {
            int i7 = L0 + abs;
            int i10 = q6Var.i();
            int i11 = this.T1;
            if (i7 > i10 - i11) {
                q6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.x5 && ((di.q6) objArr[0]) == this.R1) {
            this.V1.O(false);
            d1();
        }
    }

    public final boolean e1(int i7, View view) {
        org.telegram.ui.Components.x31 G;
        org.telegram.ui.Components.l41 l41Var = this.V1;
        if (l41Var == null || i7 == 0 || (G = l41Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.ij) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
            int f12 = ijVar.f1();
            Integer valueOf = Integer.valueOf(f12);
            HashMap hashMap = this.S1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(f12));
                G.e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(f12), ijVar.l);
                G.e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            boolean z9 = !hashMap.isEmpty();
            fi.d dVar = this.Q1;
            dVar.setEnabled(z9);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1 = this.R1.o();
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.x5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1.z(this.U1);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.x5);
    }
}
