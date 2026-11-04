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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hl0 extends FrameLayout implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.d2 H;
    public boolean I;
    public org.telegram.ui.vz J;
    public final org.telegram.ui.pz K;
    public String L;
    public String M;
    public bl0 N;
    public final wi0 O;
    public boolean P;
    public boolean Q;
    public final zu0 a;
    public final ci.j1 b;
    public final ci.r4 c;
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

    public hl0(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getParentActivity());
        ci.r4 r4Var = new ci.r4(this, 3);
        this.c = r4Var;
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
        this.K = new org.telegram.ui.pz(0, 0L);
        this.H = d2Var;
        this.G = d2Var.getParentActivity();
        this.d = i3;
        ci.j1 j1Var = new ci.j1(23, getContext(), this);
        this.b = j1Var;
        new u4.y(new fi.c(this, 5)).h(j1Var);
        addView(j1Var);
        d2Var.getParentActivity();
        j1Var.setLayoutManager(new kg.y(10));
        j1Var.setAdapter(r4Var);
        j1Var.setOnScrollListener(new ji(this, 16));
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.m = false;
        j1Var.setItemAnimator(kVar);
        j1Var.setOnItemClickListener(new cl0(this, i3, 0));
        j1Var.setOnItemLongClickListener(new zw(this, 17));
        this.O = new wi0(j1Var, true);
        iz izVar = new iz(getContext(), null);
        addView(izVar);
        izVar.setUseHeaderOffset(true);
        izVar.setViewType(3);
        izVar.setVisibility(8);
        zu0 zu0Var = new zu0(getContext(), izVar, 1, null);
        this.a = zu0Var;
        addView(zu0Var);
        j1Var.setEmptyView(zu0Var);
        org.telegram.messenger.w7.G(i3).y(arrayList);
    }

    public final void a() {
        ci.j1 j1Var;
        org.telegram.messenger.zi message;
        int i3 = this.d;
        if (org.telegram.messenger.h10.i(i3).q() || (j1Var = this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < j1Var.getChildCount(); i10++) {
            try {
                View childAt = j1Var.getChildAt(i10);
                if ((childAt instanceof el0) && (message = ((el0) childAt).a.getMessage()) != null) {
                    if (org.telegram.messenger.w7.G(i3).k(message.S0())) {
                        c(false);
                    } else if (org.telegram.messenger.w7.G(i3).k(message.S0())) {
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

    public final void b(int i3, int i10, boolean z10) {
        setClipToPadding(false);
        this.Q = z10;
        setPadding(0, i3, 0, i10);
        ci.j1 j1Var = this.b;
        if (z10) {
            j1Var.q1(0, i3, 0, i10);
        } else {
            j1Var.setPadding(0, i3, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) j1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i3;
        marginLayoutParams.bottomMargin = -i10;
        this.Q = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var = this.H;
        if (d2Var == null || !this.b.H) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i3 = this.d;
        if (j10 < org.telegram.messenger.hp.s1(i3).E5 * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (org.telegram.messenger.h10.i(i3).q() || org.telegram.messenger.hp.s1(i3).D3()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? org.telegram.messenger.hp.s1(i3).C5 : org.telegram.messenger.hp.s1(i3).D5) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        if (d2Var.hasStoryViewer()) {
            return;
        }
        ac I = fc.a0(d2Var).I(R.raw.speed_limit, org.telegram.messenger.bd.M0(z10 ? 2131743812 : 2131751349, null), org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(z10 ? 2131743811 : 2131751348, null), new ci.e1(28, this, z10)), spannableString, "%d"));
        I.j = 8000;
        I.k(false);
    }

    public final void d(boolean z10) {
        ci.r4 r4Var = this.c;
        r4Var.k(0, ((hl0) r4Var.d).r);
        if (!TextUtils.isEmpty(this.L)) {
            int i3 = this.d;
            if (!org.telegram.messenger.z5.q(i3).H.isEmpty() || !org.telegram.messenger.z5.q(i3).I.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).Q(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.g.a(this.N);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                bl0 bl0Var = new bl0(this, arrayList, lowerCase, arrayList2);
                this.N = bl0Var;
                p5Var.e(bl0Var, equals ? 0L : 300L);
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
        org.telegram.messenger.w7.G(this.d).Q(this.n);
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            ((org.telegram.messenger.zi) this.e.get(i10)).L5(null, true);
        }
        for (int i11 = 0; i11 < this.f.size(); i11++) {
            ((org.telegram.messenger.zi) this.f.get(i11)).L5(null, true);
        }
        this.M = null;
        e(this.h, this.n, z10);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(org.telegram.messenger.bd.M0(2131745818, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.z5.q(this.d).J.clear();
            }
            d(true);
        } else if (i3 == org.telegram.messenger.hs.t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        u4.d1 T;
        ci.r4 r4Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            r4Var.f();
            return;
        }
        int i3 = this.s;
        int i10 = this.w;
        int i11 = this.x;
        int i12 = this.y;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.r;
        ArrayList arrayList3 = new ArrayList(this.e);
        ArrayList arrayList4 = new ArrayList(this.f);
        f(arrayList, arrayList2);
        u4.o.c(new dl0(this, i15, i3, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(r4Var);
        int i16 = 0;
        while (true) {
            ci.j1 j1Var = this.b;
            if (i16 >= j1Var.getChildCount()) {
                return;
            }
            View childAt = j1Var.getChildAt(i16);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = j1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.x3) {
                    r4Var.t(T, R);
                } else if (childAt instanceof el0) {
                    org.telegram.ui.Cells.g7 g7Var = ((el0) childAt).a;
                    g7Var.f(true);
                    int f12 = g7Var.getMessage().f1();
                    long B0 = org.telegram.messenger.zi.B0(g7Var.getMessage().k);
                    org.telegram.ui.pz pzVar = this.K;
                    pzVar.a = B0;
                    pzVar.b = f12;
                    g7Var.b(this.J.n(pzVar), true);
                }
            }
            i16++;
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
            if (!ziVar.i4() && !org.telegram.messenger.zi.S4(ziVar.k)) {
                arrayList3.add(ziVar);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj2;
            if (!ziVar2.i4() && !org.telegram.messenger.zi.S4(ziVar2.k)) {
                arrayList4.add(ziVar2);
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
                if (i3 >= arrayList3.size()) {
                    break;
                }
                if (org.telegram.messenger.w7.G(this.d).T(((org.telegram.messenger.zi) arrayList3.get(i3)).S0())) {
                    this.I = true;
                    break;
                }
                i3++;
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
        org.telegram.messenger.hs.f(this.d).c(this, org.telegram.messenger.hs.b5);
        org.telegram.messenger.hs.f(this.d).c(this, org.telegram.messenger.hs.t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.z5.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.g.c(new jb0(this, 18));
        }
        d(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.d;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.b5);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.t3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.vz vzVar) {
        this.J = vzVar;
    }
}
