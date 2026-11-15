package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class jm0 extends w61 implements org.telegram.ui.yz, org.telegram.messenger.is, eh.a {
    public static final /* synthetic */ int b1 = 0;
    public gm0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.q0 E0;
    public org.telegram.ui.ActionBar.q0 F0;
    public org.telegram.ui.ActionBar.q0 G0;
    public org.telegram.ui.ActionBar.q0 H0;
    public org.telegram.ui.ActionBar.y I0;
    public il0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.yw M0;
    public String N0;
    public org.telegram.ui.qz O0;
    public final org.telegram.ui.zz P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.ev S0;
    public final st0 T0;
    public final int U0;
    public int V0;
    public final di.f4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public xi.e Z0;
    public final FrameLayout a0;
    public dh.c a1;
    public final di.c1 b0;
    public final wl0 c0;
    public final v4.k d0;
    public final cm0 e0;
    public final v4.b0 f0;
    public final xi0 g0;
    public boolean h0;
    public final FrameLayout i0;
    public final wl0 j0;
    public final v4.b0 k0;
    public final uj0 l0;
    public final em0 m0;
    public final FrameLayout n0;
    public final wl0 o0;
    public final v4.b0 p0;
    public final uj0 q0;
    public final xl0 r0;
    public final cf0 s0;
    public boolean t0;
    public final FrameLayout u0;
    public final wl0 v0;
    public final v4.b0 w0;
    public final uj0 x0;
    public final am0 y0;
    public ImageView z0;

    public jm0(Context context, org.telegram.ui.yw ywVar, int i7, int i10, int i11, long j3, org.telegram.ui.ev evVar) {
        super(context, null);
        int i12 = 0;
        this.t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i13 = org.telegram.messenger.m10.t0;
        this.K0 = i13;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j3;
        this.M0 = ywVar;
        this.S0 = evVar;
        v4.k kVar = new v4.k();
        this.d0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = er.h;
        org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this;
        this.e0 = new cm0(hwVar, context, ywVar, i7, i10, kVar, ywVar.G, ywVar, context);
        int i14 = 1;
        if (i10 == 15) {
            ArrayList d42 = ywVar.d4(i13, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < d42.size(); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, ((TLRPC.Dialog) d42.get(i15)).id, arrayList)) {
            }
            this.e0.r0 = arrayList;
        }
        this.T0 = (st0) ywVar.getFragmentView();
        di.c1 c1Var = new di.c1(25, context, hwVar);
        this.b0 = c1Var;
        c1Var.setItemAnimator(this.d0);
        c1Var.setPivotY(0.0f);
        c1Var.setClipToPadding(false);
        c1Var.setAdapter(this.e0);
        c1Var.setVerticalScrollBarEnabled(true);
        c1Var.setInstantClick(true);
        int i16 = 2;
        c1Var.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var = new v4.b0(1, false);
        this.f0 = b0Var;
        c1Var.setLayoutManager(b0Var);
        c1Var.X1 = true;
        c1Var.Y1 = 0;
        c1Var.setOnScrollListener(new yl0(hwVar, ywVar, i16));
        int i17 = 22;
        c1Var.D0(new wa0(hwVar, i17));
        org.telegram.ui.zz zzVar = new org.telegram.ui.zz(this.M0);
        this.P0 = zzVar;
        org.telegram.ui.ct ctVar = zzVar.b;
        ctVar.setClipToPadding(false);
        ctVar.j(new bm0(hwVar, i14));
        ctVar.D0(new wa0(hwVar, i17));
        zzVar.setUiCallback(this);
        zzVar.setVisibility(8);
        zzVar.setChatPreviewDelegate(evVar);
        pz pzVar = new pz(context, null);
        pzVar.setViewType(1);
        wl0 wl0Var = new wl0(hwVar, context, pzVar, i16);
        this.c0 = wl0Var;
        wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var.e.setVisibility(8);
        wl0Var.setVisibility(8);
        wl0Var.addView(pzVar, 0);
        wl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(wl0Var);
        frameLayout.addView(c1Var);
        frameLayout.addView(zzVar);
        c1Var.setEmptyView(wl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i0 = frameLayout2;
        dm0 dm0Var = new dm0(hwVar);
        dm0Var.m = false;
        dm0Var.C = false;
        er erVar = er.h;
        dm0Var.o(erVar);
        dm0Var.n(350L);
        uj0 uj0Var = new uj0(context, null);
        this.l0 = uj0Var;
        uj0Var.setItemAnimator(dm0Var);
        uj0Var.setPivotY(0.0f);
        uj0Var.setVerticalScrollBarEnabled(true);
        uj0Var.setInstantClick(true);
        uj0Var.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.k0 = b0Var2;
        uj0Var.setLayoutManager(b0Var2);
        uj0Var.X1 = true;
        uj0Var.Y1 = 0;
        uj0Var.setClipToPadding(false);
        pz pzVar2 = new pz(context, null);
        pzVar2.setViewType(1);
        wl0 wl0Var2 = new wl0(hwVar, context, pzVar2, 3);
        this.j0 = wl0Var2;
        wl0Var2.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var2.e.setVisibility(8);
        wl0Var2.setVisibility(8);
        wl0Var2.addView(pzVar2, 0);
        wl0Var2.e(true, false);
        frameLayout2.addView(wl0Var2);
        frameLayout2.addView(uj0Var);
        uj0Var.setEmptyView(wl0Var2);
        em0 em0Var = new em0(hwVar, uj0Var, context, this.K0, i11, ywVar);
        this.m0 = em0Var;
        uj0Var.setAdapter(em0Var);
        uj0Var.setOnScrollListener(new yl0(hwVar, ywVar, 3));
        uj0Var.D0(new wa0(hwVar, 22));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n0 = frameLayout3;
        vl0 vl0Var = new vl0(hwVar);
        vl0Var.m = false;
        vl0Var.C = false;
        vl0Var.o(erVar);
        vl0Var.n(350L);
        uj0 uj0Var2 = new uj0(context, null);
        this.q0 = uj0Var2;
        uj0Var2.setItemAnimator(vl0Var);
        uj0Var2.setPivotY(0.0f);
        uj0Var2.setClipToPadding(false);
        uj0Var2.setVerticalScrollBarEnabled(true);
        uj0Var2.setInstantClick(true);
        uj0Var2.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.p0 = b0Var3;
        uj0Var2.setLayoutManager(b0Var3);
        uj0Var2.X1 = true;
        uj0Var2.Y1 = 0;
        pz pzVar3 = new pz(context, null);
        pzVar3.setViewType(1);
        wl0 wl0Var3 = new wl0(hwVar, context, pzVar3, i12);
        this.o0 = wl0Var3;
        wl0Var3.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var3.e.setVisibility(8);
        wl0Var3.setVisibility(8);
        wl0Var3.addView(pzVar3, 0);
        wl0Var3.e(true, false);
        frameLayout3.addView(wl0Var3);
        frameLayout3.addView(uj0Var2);
        uj0Var2.setEmptyView(wl0Var3);
        xl0 xl0Var = new xl0(hwVar, uj0Var2, context, this.K0, i11);
        this.r0 = xl0Var;
        uj0Var2.setAdapter(xl0Var);
        uj0Var2.setOnScrollListener(new yl0(hwVar, ywVar, i12));
        uj0Var2.D0(new wa0(hwVar, 22));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.u0 = frameLayout4;
        zl0 zl0Var = new zl0(hwVar);
        zl0Var.m = false;
        zl0Var.C = false;
        zl0Var.o(erVar);
        zl0Var.n(350L);
        uj0 uj0Var3 = new uj0(context, null);
        this.x0 = uj0Var3;
        uj0Var3.setItemAnimator(zl0Var);
        uj0Var3.setPivotY(0.0f);
        int i18 = 1;
        uj0Var3.setVerticalScrollBarEnabled(true);
        uj0Var3.setInstantClick(true);
        uj0Var3.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.w0 = b0Var4;
        uj0Var3.setLayoutManager(b0Var4);
        uj0Var3.X1 = true;
        uj0Var3.Y1 = 0;
        uj0Var3.setClipToPadding(false);
        pz pzVar4 = new pz(context, null);
        pzVar4.setViewType(1);
        wl0 wl0Var4 = new wl0(hwVar, context, pzVar4, i18);
        this.v0 = wl0Var4;
        wl0Var4.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var4.e.setVisibility(8);
        wl0Var4.setVisibility(8);
        wl0Var4.addView(pzVar4, 0);
        wl0Var4.e(true, false);
        frameLayout4.addView(wl0Var4);
        frameLayout4.addView(uj0Var3);
        uj0Var3.setEmptyView(wl0Var4);
        am0 am0Var = new am0(hwVar, uj0Var3, context, this.K0);
        this.y0 = am0Var;
        uj0Var3.setAdapter(am0Var);
        uj0Var3.setOnScrollListener(new yl0(hwVar, ywVar, i18));
        uj0Var3.D0(new wa0(hwVar, 22));
        this.g0 = new xi0(c1Var, true);
        cf0 cf0Var = new cf0(context, ywVar);
        this.s0 = cf0Var;
        u41 u41Var = cf0Var.c;
        u41Var.setClipToPadding(false);
        u41Var.j(new bm0(hwVar, i12));
        u41Var.D0(new wa0(hwVar, 22));
        di.f4 f4Var = new di.f4(hwVar);
        this.W = f4Var;
        setAdapter(f4Var);
    }

    public static org.telegram.ui.an K(int i7, org.telegram.messenger.gj gjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i7).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", gjVar.e1());
        return new org.telegram.ui.an(bundle);
    }

    public static void P(FrameLayout frameLayout, uj0 uj0Var, int i7, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z10) {
            uj0Var.q1(0, i7, 0, i10);
        } else {
            uj0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void J() {
        if (this.t0) {
            int i7 = 0;
            this.t0 = false;
            R();
            l61 l61Var = this.N;
            if (l61Var != null && l61Var.getCurrentTabId() != 0) {
                this.N.d(0, 0);
            }
            cm0 cm0Var = this.e0;
            if (cm0Var != null) {
                String str = this.N0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((jg.o0) arrayList.get(i10)).d == 7) {
                        i7 = 1;
                        break;
                    }
                    i10++;
                }
                cm0Var.T(i7, str);
            }
        }
    }

    public final int L(int i7) {
        int i10 = 0;
        while (true) {
            di.f4 f4Var = this.W;
            ArrayList arrayList = (ArrayList) f4Var.b;
            ArrayList arrayList2 = (ArrayList) f4Var.b;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((im0) arrayList2.get(i10)).a == 3 && ((im0) arrayList2.get(i10)).b == i7) {
                return i10;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.yz
    public final void M(org.telegram.messenger.gj gjVar, View view, int i7) {
        boolean z10;
        org.telegram.ui.sz szVar = new org.telegram.ui.sz(gjVar.e1(), org.telegram.messenger.gj.B0(gjVar.k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(szVar)) {
            hashMap.remove(szVar);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(szVar, gjVar);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.A0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.q0 q0Var = this.F0;
            if (q0Var != null) {
                q0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.E0 != null) {
                boolean N = N();
                int i10 = N ? 0 : 8;
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.q6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.j6.y8, null, PorterDuff.Mode.SRC_IN);
                    if (N) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.H0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.sz) it.next())).Q) {
                        z10 = false;
                        break;
                    }
                }
                this.H0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(hashMap.containsKey(szVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(i7, hashMap.containsKey(szVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).f(hashMap.containsKey(szVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).e(hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).e0(hashMap.containsKey(szVar), true);
        }
    }

    public final boolean N() {
        int i7 = this.K0;
        if (!org.telegram.messenger.m10.i(i7).q() && !org.telegram.messenger.np.s1(i7).D3()) {
            for (org.telegram.messenger.gj gjVar : this.C0.values()) {
                if (gjVar.F0() != null && gjVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i7, String str, boolean z10) {
        boolean z11;
        org.telegram.ui.zz zzVar;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        wl0 wl0Var = this.c0;
        if (isEmpty) {
            wl0Var.e.setVisibility(8);
        } else {
            wl0Var.e.setVisibility(0);
            wl0Var.e.setText(org.telegram.messenger.hd.a0(null, null, 2131748165, str));
        }
        cm0 cm0Var = this.e0;
        org.telegram.ui.jw jwVar = cm0Var.V;
        long a10 = jwVar != null ? jwVar.a() : 0L;
        long j10 = i7 == 0 ? 0L : a10;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = a10;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i11 >= arrayList.size()) {
                break;
            }
            jg.o0 o0Var = (jg.o0) arrayList.get(i11);
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j3 = -((TLRPC.Chat) o0Var.f).id;
                }
                i10 = i11;
                j10 = j3;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.g;
                long j14 = m0Var.b;
                i10 = i11;
                j12 = m0Var.c;
                j11 = j14;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z15 = true;
                }
            }
            i11 = i10 + 1;
        }
        am0 am0Var = this.y0;
        am0Var.getClass();
        if (x20.Y(str, null) == null) {
            J();
        }
        if (view == this.i0) {
            org.telegram.messenger.np.s1(this.K0).L0(0L);
            em0 em0Var = this.m0;
            uj0 uj0Var = em0Var.d;
            ArrayList arrayList2 = em0Var.T;
            ArrayList arrayList3 = em0Var.U;
            ArrayList arrayList4 = em0Var.V;
            ArrayList arrayList5 = em0Var.S;
            fo foVar = em0Var.f0;
            em0Var.X();
            if (!TextUtils.equals(str, em0Var.e0)) {
                em0Var.e0 = str;
                org.telegram.messenger.g0.r(foVar);
                if (TextUtils.isEmpty(em0Var.e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    em0Var.O(true);
                    em0Var.d0++;
                    z14 = false;
                    em0Var.Z = false;
                    em0Var.a0 = false;
                    em0Var.b0 = false;
                    em0Var.c0 = 0;
                    if (uj0Var != null) {
                        uj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(foVar, 1000L);
                    em0Var.Z = true;
                    em0Var.a0 = true;
                    em0Var.O(true);
                    if (uj0Var != null) {
                        z14 = false;
                        uj0Var.v0(0);
                    }
                }
                this.j0.b(this.Q0, z14);
                return;
            }
            z14 = false;
            this.j0.b(this.Q0, z14);
            return;
        }
        if (view == this.n0) {
            xl0 xl0Var = this.r0;
            uj0 uj0Var2 = xl0Var.d;
            ArrayList arrayList6 = xl0Var.W;
            xr xrVar = xl0Var.i0;
            if (TextUtils.equals(str, xl0Var.h0)) {
                z13 = false;
            } else {
                xl0Var.h0 = str;
                org.telegram.messenger.g0.r(xrVar);
                if (TextUtils.isEmpty(xl0Var.h0)) {
                    arrayList6.clear();
                    xl0Var.O(true);
                    xl0Var.g0++;
                    z13 = false;
                    xl0Var.c0 = false;
                    xl0Var.d0 = false;
                    xl0Var.e0 = false;
                    xl0Var.f0 = 0;
                    if (uj0Var2 != null) {
                        uj0Var2.v0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(xrVar, 1000L);
                    xl0Var.c0 = true;
                    xl0Var.d0 = true;
                    xl0Var.O(true);
                    if (uj0Var2 != null) {
                        uj0Var2.v0(0);
                    }
                }
            }
            this.o0.b(this.Q0, z13);
            if (TextUtils.isEmpty(str)) {
                xl0Var.W();
                return;
            }
            return;
        }
        cf0 cf0Var = this.s0;
        if (view == cf0Var) {
            u41 u41Var = cf0Var.c;
            ArrayList arrayList7 = cf0Var.n;
            if (TextUtils.equals(cf0Var.x, str)) {
                return;
            }
            if (cf0Var.L >= 0) {
                ConnectionsManager.getInstance(cf0Var.b).cancelRequest(cf0Var.L, true);
                cf0Var.L = -1;
            }
            cf0Var.w = false;
            cf0Var.I.setLoading(false);
            cf0Var.x = str;
            if (TextUtils.isEmpty(str)) {
                cf0Var.r = 0;
                cf0Var.M++;
                cf0Var.s = false;
                arrayList7.clear();
                cf0Var.a(false);
            } else {
                cf0Var.b(str);
                cf0Var.r = 0;
                cf0Var.M++;
                cf0Var.s = false;
                arrayList7.clear();
            }
            cf0Var.d();
            u41Var.v0(0);
            u41Var.g3.O(true);
            return;
        }
        if (view == this.u0) {
            if (x20.Y(str, null) == null) {
                return;
            }
            if (z10) {
                this.w0.h1(0, 0);
            }
            am0Var.Z(str);
            this.v0.b(this.Q0, false);
            return;
        }
        if (view != this.a0) {
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.zz) {
                org.telegram.ui.zz zzVar2 = (org.telegram.ui.zz) view;
                zzVar2.setUseFromUserAsAvatar(j13 != 0);
                zzVar2.c.b(this.Q0, false);
                zzVar2.h(j10, this.W0, j15, j16, jg.q0.k3[((im0) ((ArrayList) this.W.b).get(i7)).b], z15, str, z10);
                return;
            }
            if (view instanceof il0) {
                il0 il0Var = (il0) view;
                il0Var.a.b(this.Q0, false);
                il0Var.L = str;
                il0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.zz zzVar3 = this.P0;
        if (!(j10 == 0 && this.W0 == 0 && j11 == 0 && j12 == 0) && j13 == 0) {
            zzVar3.setTag(1);
            zzVar3.i(this.O0, false);
            zzVar3.animate().setListener(null).cancel();
            if (z10) {
                zzVar3.setVisibility(0);
                zzVar3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (zzVar3.getVisibility() != 0) {
                    zzVar3.setVisibility(0);
                    zzVar3.setAlpha(0.0f);
                } else {
                    r5 = z10;
                }
                zzVar3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = r5;
            }
            zzVar = zzVar3;
            z12 = false;
            this.P0.h(j10, this.W0, j11, j12, null, z15, str, z11);
            wl0Var.setVisibility(8);
        } else {
            this.L0 = false;
            cm0Var.T(z15 ? 1 : 0, str);
            cm0Var.B0 = this.O0;
            zzVar3.animate().setListener(null).cancel();
            zzVar3.i(null, false);
            if (z10) {
                wl0Var.e(!(cm0Var.E0 > 0), false);
                wl0Var.e(cm0Var.E0 > 0, false);
            } else if (!cm0Var.M()) {
                wl0Var.e(cm0Var.E0 > 0, true);
            }
            if (z10) {
                zzVar3.setVisibility(8);
            } else if (zzVar3.getVisibility() != 8) {
                zzVar3.animate().alpha(0.0f).setListener(new h60(this, 17)).setDuration(150L).start();
            }
            zzVar3.setTag(null);
            zzVar = zzVar3;
            z12 = false;
        }
        wl0Var.b(this.Q0, z12);
        zzVar.c.b(this.Q0, z12);
    }

    public final void Q(boolean z10) {
        tj0 tj0Var;
        tj0 tj0Var2;
        tj0 tj0Var3;
        org.telegram.ui.jw jwVar;
        if (this.B0 == z10) {
            return;
        }
        org.telegram.ui.yw ywVar = this.M0;
        if (z10 && ywVar.getActionBar().x()) {
            return;
        }
        if (z10 && !ywVar.getActionBar().c("search_view_pager")) {
            this.I0 = ywVar.getActionBar().p("search_view_pager");
            if (ywVar.X) {
                ImageView imageView = new ImageView(getContext());
                this.z0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.z0.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
                org.telegram.ui.ActionBar.q6.s(this.z0, org.telegram.ui.ActionBar.j6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.z0;
                int i7 = org.telegram.ui.ActionBar.j6.z8;
                org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i7), null);
                this.z0.setOnClickListener(new y60(this, 11));
                this.I0.addView(this.z0, c8.ja.p(54, 54, 0.0f, 16));
            }
            gm0 gm0Var = new gm0(this.I0.getContext());
            this.A0 = gm0Var;
            gm0Var.setTextSize(18);
            this.A0.setTypeface(org.telegram.messenger.g0.o());
            gm0 gm0Var2 = this.A0;
            int i10 = org.telegram.ui.ActionBar.j6.y8;
            rb0 rb0Var = new rb0(6);
            rb0 rb0Var2 = new rb0(7);
            int P = org.telegram.ui.ActionBar.q6.P(i10, -1, 0, 0.0f, null);
            rb0Var2.f(P, gm0Var2);
            org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, gm0Var2);
            w10.c(i10, -1, 0, 0.0f, null);
            w10.n = rb0Var;
            w10.o = rb0Var2;
            w10.m = false;
            w10.g = P;
            this.I0.addView(this.A0, c8.ja.m(1.0f, 0, -1, ywVar.X ? 18 : 72, 0, 0));
            this.A0.setOnTouchListener(new gi.a(22));
            org.telegram.ui.ActionBar.q0 h = this.I0.h(203, R.drawable.avd_speed, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754801, null));
            this.E0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.q6.s(this.E0.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
            }
            this.F0 = this.I0.h(org.telegram.messenger.ns.e3, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754877, null));
            this.G0 = this.I0.h(org.telegram.messenger.ns.f3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131750587, null));
            this.H0 = this.I0.h(org.telegram.messenger.ns.g3, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
        }
        if (this.A0 != null) {
            cm0 cm0Var = this.e0;
            ((ViewGroup.MarginLayoutParams) this.A0.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L((ywVar.X ? 18 : 72) + (cm0Var != null && (jwVar = cm0Var.V) != null && (jwVar.a() > 0L ? 1 : (jwVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            gm0 gm0Var3 = this.A0;
            gm0Var3.setLayoutParams(gm0Var3.getLayoutParams());
        }
        if (ywVar.getActionBar().getBackButton() != null && (ywVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.p4)) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            ywVar.getActionBar().setBackButtonDrawable(x1Var);
            x1Var.setColorFilter(null);
        }
        this.B0 = z10;
        HashMap hashMap = this.C0;
        if (z10) {
            org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
            ywVar.getActionBar().R(null, null);
            this.A0.a(hashMap.size(), false);
            this.E0.setVisibility(N() ? 0 : 8);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            this.H0.setVisibility(0);
            return;
        }
        ywVar.getActionBar().w();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.zz) && (tj0Var3 = ((org.telegram.ui.zz) getChildAt(i11)).d) != null) {
                tj0Var3.f();
            }
            if (getChildAt(i11) instanceof il0) {
                ((il0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.zz zzVar = this.P0;
        if (zzVar != null && (tj0Var2 = zzVar.d) != null) {
            tj0Var2.f();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.zz) && (tj0Var = ((org.telegram.ui.zz) view).d) != null) {
                tj0Var.f();
            }
        }
    }

    public final void R() {
        this.W.l();
        k(false);
        l61 l61Var = this.N;
        if (l61Var != null) {
            l61Var.y.f();
        }
    }

    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.a0;
            uj0 uj0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    uj0Var = this.b0;
                } else if (view == this.i0) {
                    uj0Var = this.l0;
                } else if (view == this.n0) {
                    uj0Var = this.q0;
                } else if (view == this.u0) {
                    uj0Var = this.x0;
                } else {
                    il0 il0Var = this.J0;
                    if (view == il0Var) {
                        uj0Var = il0Var.b;
                    } else {
                        cf0 cf0Var = this.s0;
                        if (view == cf0Var) {
                            uj0Var = cf0Var.c;
                        } else if (view instanceof org.telegram.ui.zz) {
                            uj0Var = ((org.telegram.ui.zz) view).b;
                        }
                    }
                }
            }
            if (uj0Var != null) {
                ih.d.a(uj0Var, canvas, rectF, uj0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.zz zzVar = this.P0;
                if (zzVar.getVisibility() == 0) {
                    org.telegram.ui.ct ctVar = zzVar.b;
                    ih.d.a(ctVar, canvas, rectF, ctVar, this);
                }
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f3;
        em0 em0Var = this.m0;
        if (i7 == i11) {
            this.j0.e(org.telegram.messenger.np.s1(this.K0).L0(0L) != null, true);
            em0Var.X();
            em0Var.O(true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.y1 || i7 == org.telegram.messenger.ns.s) {
            em0Var.X();
            em0Var.O(true);
        } else {
            if (i7 == org.telegram.messenger.ns.V0) {
                this.r0.O(true);
                return;
            }
            if (i7 == org.telegram.messenger.ns.x5) {
                Object obj = objArr[0];
                am0 am0Var = this.y0;
                if (obj == am0Var.T) {
                    am0Var.O(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.yz
    public final boolean g0() {
        return this.B0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.I0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.D0;
    }

    public il0 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override // org.telegram.ui.Components.w61
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.q0 getSpeedItem() {
        return this.E0;
    }

    public v61 getTabsView() {
        return this.N;
    }

    @Override // org.telegram.ui.yz
    public final void j() {
        Q(true);
    }

    @Override // org.telegram.ui.yz
    public final boolean l(org.telegram.ui.sz szVar) {
        return this.C0.containsKey(szVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ns.f(this.K0), this);
        eVar2.c(org.telegram.messenger.ns.f3);
        eVar2.c(org.telegram.messenger.ns.y1);
        eVar2.c(org.telegram.messenger.ns.s);
        eVar2.c(org.telegram.messenger.ns.V0);
        eVar2.c(org.telegram.messenger.ns.x5);
        this.Z0 = eVar2;
        this.h0 = true;
        em0 em0Var = this.m0;
        if (em0Var != null) {
            em0Var.O(false);
        }
        xl0 xl0Var = this.r0;
        if (xl0Var != null) {
            xl0Var.O(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = false;
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void p() {
        this.T0.K();
    }

    @Override // org.telegram.ui.Components.w61
    public final void q(View view, View view2, int i7, int i10) {
        cm0 cm0Var = this.e0;
        org.telegram.ui.zz zzVar = this.P0;
        if (i7 == 0) {
            if (zzVar.getVisibility() == 0) {
                zzVar.i(this.O0, false);
                cm0Var.B0 = null;
            } else {
                zzVar.i(null, false);
                org.telegram.ui.qz qzVar = this.O0;
                cm0Var.B0 = qzVar;
                if (qzVar != null) {
                    ((org.telegram.ui.hu) qzVar).j(false, null, cm0Var.z0, cm0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.zz) {
            ((org.telegram.ui.zz) view).i(this.O0, i10 == 0 && zzVar.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.zz) {
            ((org.telegram.ui.zz) view2).i(null, false);
        } else {
            cm0Var.B0 = null;
            zzVar.i(null, false);
        }
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.qz qzVar) {
        this.O0 = qzVar;
    }

    public void setKeyboardHeight(int i7) {
        this.Q0 = i7;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.zz) {
                ((org.telegram.ui.zz) getChildAt(i10)).c.b(i7, z10);
            } else if (getChildAt(i10) == this.a0) {
                this.c0.b(i7, z10);
                this.P0.c.b(i7, z10);
            } else if (getChildAt(i10) instanceof il0) {
                ((il0) getChildAt(i10)).a.b(i7, z10);
            } else if (getChildAt(i10) == this.i0) {
                this.j0.b(i7, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void setPosition(int i7) {
        if (i7 < 0) {
            return;
        }
        super.setPosition(i7);
        this.h.clear();
        l61 l61Var = this.N;
        if (l61Var != null) {
            l61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override // org.telegram.ui.yz
    public final void y(org.telegram.messenger.gj gjVar) {
        this.M0.presentFragment(K(this.K0, gjVar));
        Q(false);
    }
}
