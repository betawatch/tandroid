package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.Components.ra implements org.telegram.messenger.fs {
    public final org.telegram.ui.Components.ty T1;
    public final hi.e U1;
    public final fi.h6 V1;
    public final HashMap W1;
    public final int X1;
    public int Y1;
    public org.telegram.ui.Components.b51 Z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c21(org.telegram.ui.ActionBar.g2 g2Var, long j3, int i7, bi.d5 d5Var) {
        super(r2, g2Var, new org.telegram.ui.Components.qa(r3));
        Activity parentActivity = g2Var.getParentActivity();
        org.telegram.ui.Components.qa qaVar = new org.telegram.ui.Components.qa();
        qaVar.a = false;
        qaVar.c = false;
        qaVar.f = 2;
        qaVar.g = g2Var.getResourceProvider();
        this.W1 = new HashMap();
        this.X1 = i7;
        fi.h6 A = org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).R1().A(1, -1, j3, true);
        this.V1 = A;
        A.p(30, false);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        Z0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, this.J0);
        int i10 = this.u0;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.b.addView(frameLayout, c8.na.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, this.J0);
        frameLayout.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        hi.e eVar = new hi.e(getContext(), this.J0, true);
        this.U1 = eVar;
        eVar.i(org.telegram.messenger.gd.N0(2131744557, null), false, true);
        eVar.setEnabled(false);
        eVar.setOnClickListener(new ig0(11, this, d5Var));
        frameLayout.addView(eVar, c8.na.d(-1, 48.0f, org.telegram.messenger.ks.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(i7, false);
        this.T1 = tyVar;
        tyVar.O = new bi.y2(this, 17);
        org.telegram.ui.Components.ek0 ek0Var = this.o1;
        int i11 = this.u0;
        ek0Var.setPadding(i11, 0, i11, 0);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.setLayoutManager(tyVar);
        this.o1.setOnItemClickListener(new xx0(this, 4));
        this.o1.setOnItemLongClickListener(new oi0(this, 16));
        this.o1.setOnScrollListener(new b21(this, 0));
        this.Z1.O(true);
    }

    @Override // org.telegram.ui.Components.ra
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.a, 0, false, new a5(this, 26), this.J0);
        this.Z1 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131744557, null);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.A5 && ((fi.h6) objArr[0]) == this.V1) {
            this.Z1.O(false);
            e1();
        }
    }

    public final void e1() {
        org.telegram.ui.Components.ty tyVar = this.T1;
        int L0 = tyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(tyVar.N0() - L0) + 1;
        fi.h6 h6Var = this.V1;
        if (h6Var != null) {
            int i7 = L0 + abs;
            int i10 = h6Var.i();
            int i11 = this.X1;
            if (i7 > i10 - i11) {
                h6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    public final boolean f1(int i7, View view) {
        org.telegram.ui.Components.n41 G;
        org.telegram.ui.Components.b51 b51Var = this.Z1;
        if (b51Var == null || i7 == 0 || (G = b51Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof org.telegram.messenger.fj) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
            int e12 = fjVar.e1();
            Integer valueOf = Integer.valueOf(e12);
            HashMap hashMap = this.W1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e12));
                G.e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), fjVar.l);
                G.e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            hi.e eVar = this.U1;
            eVar.setEnabled(z10);
            eVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = this.V1.o();
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.A5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V1.z(this.Y1);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.A5);
    }
}
