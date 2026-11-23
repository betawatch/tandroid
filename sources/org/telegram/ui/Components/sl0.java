package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class sl0 extends FrameLayout implements org.telegram.messenger.gs {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.g2 H;
    public boolean I;
    public org.telegram.ui.b00 J;
    public final org.telegram.ui.vz K;
    public String L;
    public String M;
    public ml0 N;
    public final hj0 O;
    public boolean P;
    public boolean Q;
    public final nv0 a;
    public final di.b1 b;
    public final di.l4 c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public sl0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getParentActivity());
        di.l4 l4Var = new di.l4(this, 3);
        this.c = l4Var;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.K = new org.telegram.ui.vz(0, 0L);
        this.H = g2Var;
        this.G = g2Var.getParentActivity();
        this.d = i7;
        di.b1 b1Var = new di.b1(23, getContext(), this);
        this.b = b1Var;
        new v4.z(new gi.c(this, 5)).h(b1Var);
        addView(b1Var);
        g2Var.getParentActivity();
        b1Var.setLayoutManager(new jg.b0(10));
        b1Var.setAdapter(l4Var);
        b1Var.setOnScrollListener(new oa(this, 17));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.m = false;
        b1Var.setItemAnimator(kVar);
        b1Var.setOnItemClickListener(new nl0(this, i7, 0));
        b1Var.setOnItemLongClickListener(new ky(this, 16));
        this.O = new hj0(b1Var, true);
        yz yzVar = new yz(getContext(), null);
        addView(yzVar);
        yzVar.setUseHeaderOffset(true);
        yzVar.setViewType(3);
        yzVar.setVisibility(8);
        nv0 nv0Var = new nv0(getContext(), yzVar, 1, null);
        this.a = nv0Var;
        addView(nv0Var);
        b1Var.setEmptyView(nv0Var);
        org.telegram.messenger.w7.G(i7).y(arrayList);
    }

    public final void a() {
        di.b1 b1Var;
        org.telegram.messenger.gj message;
        int i7 = this.d;
        if (org.telegram.messenger.k10.i(i7).q() || (b1Var = this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
            try {
                View childAt = b1Var.getChildAt(i10);
                if ((childAt instanceof pl0) && (message = ((pl0) childAt).a.getMessage()) != null) {
                    if (org.telegram.messenger.w7.G(i7).k(message.S0())) {
                        c(false);
                    } else if (org.telegram.messenger.w7.G(i7).k(message.S0())) {
                        c(true);
                    } else {
                        continue;
                    }
                    return;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void b(int i7, int i10, boolean z10) {
        setClipToPadding(false);
        this.Q = z10;
        setPadding(0, i7, 0, i10);
        di.b1 b1Var = this.b;
        if (z10) {
            b1Var.q1(0, i7, 0, i10);
        } else {
            b1Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.Q = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.g2 g2Var = this.H;
        if (g2Var == null || !this.b.H) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i7 = this.d;
        if (j3 < org.telegram.messenger.np.u1(i7).H5 * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (org.telegram.messenger.k10.i(i7).q() || org.telegram.messenger.np.u1(i7).K3()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? org.telegram.messenger.np.u1(i7).F5 : org.telegram.messenger.np.u1(i7).G5) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        if (g2Var.hasStoryViewer()) {
            return;
        }
        gc I = lc.b0(g2Var).I(R.raw.speed_limit, org.telegram.messenger.hd.N0(z10 ? 2131743557 : 2131751336, null), org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(z10 ? 2131743556 : 2131751335, null), new ch.k(29, this, z10)), spannableString, "%d"));
        I.j = 8000;
        I.k(false);
    }

    public final void d(boolean z10) {
        di.l4 l4Var = this.c;
        l4Var.k(0, ((sl0) l4Var.d).r);
        if (!TextUtils.isEmpty(this.L)) {
            int i7 = this.d;
            if (!org.telegram.messenger.a6.q(i7).H.isEmpty() || !org.telegram.messenger.a6.q(i7).I.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.g.a(this.N);
                org.telegram.messenger.q5 q5Var = Utilities.g;
                ml0 ml0Var = new ml0(this, arrayList, lowerCase, arrayList2);
                this.N = ml0Var;
                q5Var.d(ml0Var, equals ? 0L : 300L);
                this.n.clear();
                this.h.clear();
                if (equals) {
                    return;
                }
                this.a.e(true, true);
                e(this.h, this.n, z10);
                return;
            }
        }
        if (this.r == 0) {
            this.O.b(0);
        }
        if (this.P) {
            this.h.clear();
            this.n.clear();
        }
        org.telegram.messenger.w7.G(this.d).y(this.h);
        org.telegram.messenger.w7.G(this.d).P(this.n);
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            ((org.telegram.messenger.gj) this.e.get(i10)).K5(null, true);
        }
        for (int i11 = 0; i11 < this.f.size(); i11++) {
            ((org.telegram.messenger.gj) this.f.get(i11)).K5(null, true);
        }
        this.M = null;
        e(this.h, this.n, z10);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(org.telegram.messenger.hd.N0(2131745612, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.e5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.a6.q(this.d).J.clear();
            }
            d(true);
        } else if (i7 == org.telegram.messenger.ls.v3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        v4.f1 T;
        di.l4 l4Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            l4Var.f();
            return;
        }
        int i7 = this.s;
        int i10 = this.w;
        int i11 = this.x;
        int i12 = this.y;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.r;
        ArrayList arrayList3 = new ArrayList(this.e);
        ArrayList arrayList4 = new ArrayList(this.f);
        f(arrayList, arrayList2);
        v4.o.c(new ol0(this, i15, i7, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(l4Var);
        int i16 = 0;
        while (true) {
            di.b1 b1Var = this.b;
            if (i16 >= b1Var.getChildCount()) {
                return;
            }
            View childAt = b1Var.getChildAt(i16);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = b1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.y3) {
                    l4Var.t(T, R);
                } else if (childAt instanceof pl0) {
                    org.telegram.ui.Cells.i7 i7Var = ((pl0) childAt).a;
                    i7Var.f(true);
                    int e12 = i7Var.getMessage().e1();
                    long B0 = org.telegram.messenger.gj.B0(i7Var.getMessage().k);
                    org.telegram.ui.vz vzVar = this.K;
                    vzVar.a = B0;
                    vzVar.b = e12;
                    i7Var.b(this.J.r0(vzVar), true);
                }
            }
            i16++;
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            if (!gjVar.h4() && !org.telegram.messenger.gj.R4(gjVar.k)) {
                arrayList3.add(gjVar);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
            if (!gjVar2.h4() && !org.telegram.messenger.gj.R4(gjVar2.k)) {
                arrayList4.add(gjVar2);
            }
        }
        this.r = 0;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.I = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.r;
            int i13 = i12 + 1;
            this.r = i13;
            this.s = i12;
            this.w = i13;
            int size3 = arrayList3.size() + i13;
            this.r = size3;
            this.x = size3;
            while (true) {
                if (i7 >= arrayList3.size()) {
                    break;
                }
                if (org.telegram.messenger.w7.G(this.d).S(((org.telegram.messenger.gj) arrayList3.get(i7)).S0())) {
                    this.I = true;
                    break;
                }
                i7++;
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        int i14 = this.r;
        int i15 = i14 + 1;
        this.r = i15;
        this.y = i14;
        this.E = i15;
        int size4 = arrayList4.size() + i15;
        this.r = size4;
        this.F = size4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.f(this.d).c(this, org.telegram.messenger.ls.e5);
        org.telegram.messenger.ls.f(this.d).c(this, org.telegram.messenger.ls.v3);
        if (getVisibility() == 0) {
            org.telegram.messenger.a6.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.g.c(new hb0(this, 19));
        }
        d(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.d;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.e5);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.v3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.b00 b00Var) {
        this.J = b00Var;
    }
}
