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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gm0 extends FrameLayout implements org.telegram.messenger.us {
    public int D;
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.k2 G;
    public boolean H;
    public org.telegram.ui.y00 I;
    public final org.telegram.ui.s00 J;
    public String K;
    public String L;
    public am0 M;
    public final wj0 N;
    public boolean O;
    public boolean P;
    public final dw0 a;
    public final ag.b1 b;
    public final kg.f c;
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

    public gm0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getParentActivity());
        kg.f fVar = new kg.f(this, 3);
        this.c = fVar;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.D = -1;
        this.E = -1;
        this.J = new org.telegram.ui.s00(0, 0L);
        this.G = k2Var;
        this.F = k2Var.getParentActivity();
        this.d = i10;
        ag.b1 b1Var = new ag.b1(this, getContext(), 18);
        this.b = b1Var;
        new s4.x(new org.telegram.ui.ja(this, 4)).h(b1Var);
        addView(b1Var);
        k2Var.getParentActivity();
        b1Var.setLayoutManager(new dh.f(9));
        b1Var.setAdapter(fVar);
        b1Var.setOnScrollListener(new ag.u(this, 29));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.m = false;
        b1Var.setItemAnimator(jVar);
        b1Var.setOnItemClickListener(new bm0(this, i10, 0));
        b1Var.setOnItemLongClickListener(new px(this, 17));
        this.N = new wj0(b1Var, true);
        zz zzVar = new zz(getContext(), null);
        addView(zzVar);
        zzVar.setUseHeaderOffset(true);
        zzVar.setViewType(3);
        zzVar.setVisibility(8);
        dw0 dw0Var = new dw0(getContext(), zzVar, 1, null);
        this.a = dw0Var;
        addView(dw0Var);
        b1Var.setEmptyView(dw0Var);
        org.telegram.messenger.b8.G(i10).y(arrayList);
    }

    public final void a() {
        ag.b1 b1Var;
        org.telegram.messenger.jj message;
        int i10 = this.d;
        if (org.telegram.messenger.d20.i(i10).q() || (b1Var = this.b) == null) {
            return;
        }
        for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
            try {
                View childAt = b1Var.getChildAt(i11);
                if ((childAt instanceof dm0) && (message = ((dm0) childAt).a.getMessage()) != null) {
                    if (org.telegram.messenger.b8.G(i10).k(message.S0())) {
                        c(false);
                    } else if (org.telegram.messenger.b8.G(i10).k(message.S0())) {
                        c(true);
                    } else {
                        continue;
                    }
                    return;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        ag.b1 b1Var = this.b;
        if (z10) {
            b1Var.q1(0, i10, 0, i11);
        } else {
            b1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.k2 k2Var = this.G;
        if (k2Var == null || !this.b.G) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i10 = this.d;
        if (j10 < org.telegram.messenger.vp.r1(i10).F5 * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (org.telegram.messenger.d20.i(i10).q() || org.telegram.messenger.vp.r1(i10).A3()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? org.telegram.messenger.vp.r1(i10).D5 : org.telegram.messenger.vp.r1(i10).E5) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
        if (k2Var.hasStoryViewer()) {
            return;
        }
        wb I = cc.a0(k2Var).I(R.raw.speed_limit, org.telegram.messenger.cd.L0(z10 ? 2131743828 : 2131751349, null), org.telegram.messenger.i0.J2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(z10 ? 2131743827 : 2131751348, null), new k2.v(18, this, z10)), spannableString, "%d"));
        I.j = 8000;
        I.k(false);
    }

    public final void d(boolean z10) {
        kg.f fVar = this.c;
        fVar.k(0, ((gm0) fVar.d).r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!org.telegram.messenger.b6.q(i10).G.isEmpty() || !org.telegram.messenger.b6.q(i10).H.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.b8.G(this.d).y(arrayList);
                org.telegram.messenger.b8.G(this.d).Q(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.g.a(this.M);
                org.telegram.messenger.r5 r5Var = Utilities.g;
                am0 am0Var = new am0(this, arrayList, lowerCase, arrayList2);
                this.M = am0Var;
                r5Var.d(am0Var, equals ? 0L : 300L);
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
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.n.clear();
        }
        org.telegram.messenger.b8.G(this.d).y(this.h);
        org.telegram.messenger.b8.G(this.d).Q(this.n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((org.telegram.messenger.jj) this.e.get(i11)).J5(null, true);
        }
        for (int i12 = 0; i12 < this.f.size(); i12++) {
            ((org.telegram.messenger.jj) this.f.get(i12)).J5(null, true);
        }
        this.L = null;
        e(this.h, this.n, z10);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(org.telegram.messenger.cd.L0(2131745825, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.b6.q(this.d).I.clear();
            }
            d(true);
        } else if (i10 == org.telegram.messenger.zs.t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.c1 T;
        kg.f fVar = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            fVar.f();
            return;
        }
        int i10 = this.s;
        int i11 = this.w;
        int i12 = this.x;
        int i13 = this.y;
        int i14 = this.D;
        int i15 = this.E;
        int i16 = this.r;
        ArrayList arrayList3 = new ArrayList(this.e);
        ArrayList arrayList4 = new ArrayList(this.f);
        f(arrayList, arrayList2);
        s4.n.c(new cm0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(fVar);
        int i17 = 0;
        while (true) {
            ag.b1 b1Var = this.b;
            if (i17 >= b1Var.getChildCount()) {
                return;
            }
            View childAt = b1Var.getChildAt(i17);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = b1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.z3) {
                    fVar.t(T, R);
                } else if (childAt instanceof dm0) {
                    org.telegram.ui.Cells.l7 l7Var = ((dm0) childAt).a;
                    l7Var.f(true);
                    int f12 = l7Var.getMessage().f1();
                    long B0 = org.telegram.messenger.jj.B0(l7Var.getMessage().k);
                    org.telegram.ui.s00 s00Var = this.J;
                    s00Var.a = B0;
                    s00Var.b = f12;
                    l7Var.b(this.I.b(s00Var), true);
                }
            }
            i17++;
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
            if (!jjVar.h4() && !org.telegram.messenger.jj.R4(jjVar.k)) {
                arrayList3.add(jjVar);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj2;
            if (!jjVar2.h4() && !org.telegram.messenger.jj.R4(jjVar2.k)) {
                arrayList4.add(jjVar2);
            }
        }
        this.r = 0;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.D = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.r;
            int i14 = i13 + 1;
            this.r = i14;
            this.s = i13;
            this.w = i14;
            int size3 = arrayList3.size() + i14;
            this.r = size3;
            this.x = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                }
                if (org.telegram.messenger.b8.G(this.d).T(((org.telegram.messenger.jj) arrayList3.get(i10)).S0())) {
                    this.H = true;
                    break;
                }
                i10++;
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        int i15 = this.r;
        int i16 = i15 + 1;
        this.r = i16;
        this.y = i15;
        this.D = i16;
        int size4 = arrayList4.size() + i16;
        this.r = size4;
        this.E = size4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.d).c(this, org.telegram.messenger.zs.b5);
        org.telegram.messenger.zs.f(this.d).c(this, org.telegram.messenger.zs.t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.b6.q(this.d).I.clear();
        }
        if (!this.O) {
            this.O = true;
            Utilities.g.c(new eb0(this, 21));
        }
        d(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.b5);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.t3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.y00 y00Var) {
        this.I = y00Var;
    }
}
