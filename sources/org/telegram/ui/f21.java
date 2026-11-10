package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f21 extends org.telegram.ui.Components.ma implements org.telegram.messenger.ls {
    public final org.telegram.ui.Components.jy S1;
    public final fi.d T1;
    public final di.r6 U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public org.telegram.ui.Components.m41 Y1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f21(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7, bi.f4 f4Var) {
        super(r2, f2Var, new org.telegram.ui.Components.la(r3));
        Activity parentActivity = f2Var.getParentActivity();
        org.telegram.ui.Components.la laVar = new org.telegram.ui.Components.la();
        laVar.a = false;
        laVar.c = false;
        laVar.f = 2;
        laVar.g = f2Var.getResourceProvider();
        this.V1 = new HashMap();
        this.W1 = i7;
        di.r6 A = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).P1().A(1, -1, j3, true);
        this.U1 = A;
        A.p(30, false);
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        N();
        Y0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, this.I0);
        int i10 = this.t0;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.b.addView(frameLayout, c8.ha.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, this.I0);
        frameLayout.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        this.T1 = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131744798, null), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ik0(9, this, f4Var));
        frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(i7, false);
        this.S1 = jyVar;
        jyVar.O = new ai.l(this, 14);
        org.telegram.ui.Components.pj0 pj0Var = this.n1;
        int i11 = this.t0;
        pj0Var.setPadding(i11, 0, i11, 0);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(jyVar);
        this.n1.setOnItemClickListener(new ay0(this, 4));
        this.n1.setOnItemLongClickListener(new oi0(this, 16));
        this.n1.setOnScrollListener(new e21(this, 0));
        this.Y1.O(true);
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(pj0Var, getContext(), this.a, 0, false, new a5(this, 26), this.I0);
        this.Y1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131744798, null);
    }

    public final void d1() {
        org.telegram.ui.Components.jy jyVar = this.S1;
        int L0 = jyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(jyVar.N0() - L0) + 1;
        di.r6 r6Var = this.U1;
        if (r6Var != null) {
            int i7 = L0 + abs;
            int i10 = r6Var.i();
            int i11 = this.W1;
            if (i7 > i10 - i11) {
                r6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.x5 && ((di.r6) objArr[0]) == this.U1) {
            this.Y1.O(false);
            d1();
        }
    }

    public final boolean e1(int i7, View view) {
        org.telegram.ui.Components.x31 G;
        org.telegram.ui.Components.m41 m41Var = this.Y1;
        if (m41Var == null || i7 == 0 || (G = m41Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.ij) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
            int e12 = ijVar.e1();
            Integer valueOf = Integer.valueOf(e12);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e12));
                G.e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), ijVar.l);
                G.e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            boolean z9 = !hashMap.isEmpty();
            fi.d dVar = this.T1;
            dVar.setEnabled(z9);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.x5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.x5);
    }
}
