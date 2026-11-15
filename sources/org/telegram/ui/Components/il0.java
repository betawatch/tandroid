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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class il0 extends FrameLayout implements org.telegram.messenger.is {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.e2 H;
    public boolean I;
    public org.telegram.ui.yz J;
    public final org.telegram.ui.sz K;
    public String L;
    public String M;
    public cl0 N;
    public final xi0 O;
    public boolean P;
    public boolean Q;
    public final cv0 a;
    public final di.c1 b;
    public final di.i4 c;
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

    public il0(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        super(e2Var.getParentActivity());
        di.i4 i4Var = new di.i4(this, 3);
        this.c = i4Var;
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
        this.K = new org.telegram.ui.sz(0, 0L);
        this.H = e2Var;
        this.G = e2Var.getParentActivity();
        this.d = i7;
        di.c1 c1Var = new di.c1(23, getContext(), this);
        this.b = c1Var;
        new v4.y(new gi.c(this, 5)).h(c1Var);
        addView(c1Var);
        e2Var.getParentActivity();
        c1Var.setLayoutManager(new jg.b0(10));
        c1Var.setAdapter(i4Var);
        c1Var.setOnScrollListener(new ri(this, 16));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.m = false;
        c1Var.setItemAnimator(kVar);
        c1Var.setOnItemClickListener(new dl0(this, i7, 0));
        c1Var.setOnItemLongClickListener(new gx(this, 17));
        this.O = new xi0(c1Var, true);
        pz pzVar = new pz(getContext(), null);
        addView(pzVar);
        pzVar.setUseHeaderOffset(true);
        pzVar.setViewType(3);
        pzVar.setVisibility(8);
        cv0 cv0Var = new cv0(getContext(), pzVar, 1, null);
        this.a = cv0Var;
        addView(cv0Var);
        c1Var.setEmptyView(cv0Var);
        org.telegram.messenger.w7.G(i7).y(arrayList);
    }

    public final void a() {
        di.c1 c1Var;
        org.telegram.messenger.gj message;
        int i7 = this.d;
        if (org.telegram.messenger.m10.i(i7).q() || (c1Var = this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
            try {
                View childAt = c1Var.getChildAt(i10);
                if ((childAt instanceof fl0) && (message = ((fl0) childAt).a.getMessage()) != null) {
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
        di.c1 c1Var = this.b;
        if (z10) {
            c1Var.q1(0, i7, 0, i10);
        } else {
            c1Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.Q = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var = this.H;
        if (e2Var == null || !this.b.H) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i7 = this.d;
        if (j3 < org.telegram.messenger.np.s1(i7).F5 * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (org.telegram.messenger.m10.i(i7).q() || org.telegram.messenger.np.s1(i7).D3()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? org.telegram.messenger.np.s1(i7).D5 : org.telegram.messenger.np.s1(i7).E5) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        if (e2Var.hasStoryViewer()) {
            return;
        }
        xb I = cc.a0(e2Var).I(R.raw.speed_limit, org.telegram.messenger.hd.M0(z10 ? 2131743802 : 2131751348, null), org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(z10 ? 2131743801 : 2131751347, null), new ai.q(29, this, z10)), spannableString, "%d"));
        I.j = 8000;
        I.k(false);
    }

    public final void d(boolean z10) {
        di.i4 i4Var = this.c;
        i4Var.k(0, ((il0) i4Var.d).r);
        if (!TextUtils.isEmpty(this.L)) {
            int i7 = this.d;
            if (!org.telegram.messenger.z5.q(i7).H.isEmpty() || !org.telegram.messenger.z5.q(i7).I.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.g.a(this.N);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                cl0 cl0Var = new cl0(this, arrayList, lowerCase, arrayList2);
                this.N = cl0Var;
                p5Var.d(cl0Var, equals ? 0L : 300L);
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
            this.a.d.setText(org.telegram.messenger.hd.M0(2131745808, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.z5.q(this.d).J.clear();
            }
            d(true);
        } else if (i7 == org.telegram.messenger.ns.t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        v4.e1 T;
        di.i4 i4Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            i4Var.f();
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
        v4.o.c(new el0(this, i15, i7, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(i4Var);
        int i16 = 0;
        while (true) {
            di.c1 c1Var = this.b;
            if (i16 >= c1Var.getChildCount()) {
                return;
            }
            View childAt = c1Var.getChildAt(i16);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = c1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.x3) {
                    i4Var.t(T, R);
                } else if (childAt instanceof fl0) {
                    org.telegram.ui.Cells.g7 g7Var = ((fl0) childAt).a;
                    g7Var.f(true);
                    int e12 = g7Var.getMessage().e1();
                    long B0 = org.telegram.messenger.gj.B0(g7Var.getMessage().k);
                    org.telegram.ui.sz szVar = this.K;
                    szVar.a = B0;
                    szVar.b = e12;
                    g7Var.b(this.J.l(szVar), true);
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
        org.telegram.messenger.ns.f(this.d).c(this, org.telegram.messenger.ns.b5);
        org.telegram.messenger.ns.f(this.d).c(this, org.telegram.messenger.ns.t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.z5.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.g.c(new wa0(this, 19));
        }
        d(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.d;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.b5);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.t3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.yz yzVar) {
        this.J = yzVar;
    }
}
