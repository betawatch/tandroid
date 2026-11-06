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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class fm0 extends p61 implements org.telegram.ui.xz, org.telegram.messenger.ls, eh.a {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.r0 D0;
    public org.telegram.ui.ActionBar.r0 E0;
    public org.telegram.ui.ActionBar.r0 F0;
    public org.telegram.ui.ActionBar.r0 G0;
    public org.telegram.ui.ActionBar.y H0;
    public dl0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.ww L0;
    public String M0;
    public org.telegram.ui.pz N0;
    public final org.telegram.ui.yz O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.dv R0;
    public final rt0 S0;
    public final int T0;
    public int U0;
    public final bi.g5 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public ab.b0 Y0;
    public dh.c Z0;
    public final bi.q1 a0;
    public final sl0 b0;
    public final v4.k c0;
    public final yl0 d0;
    public final v4.b0 e0;
    public final si0 f0;
    public boolean g0;
    public final FrameLayout h0;
    public final sl0 i0;
    public final v4.b0 j0;
    public final pj0 k0;
    public final am0 l0;
    public final FrameLayout m0;
    public final sl0 n0;
    public final v4.b0 o0;
    public final pj0 p0;
    public final tl0 q0;
    public final ze0 r0;
    public boolean s0;
    public final FrameLayout t0;
    public final sl0 u0;
    public final v4.b0 v0;
    public final pj0 w0;
    public final wl0 x0;
    public ImageView y0;
    public cm0 z0;

    public fm0(Context context, org.telegram.ui.ww wwVar, int i7, int i10, int i11, long j3, org.telegram.ui.dv dvVar) {
        super(context, null);
        int i12 = 0;
        this.s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i13 = org.telegram.messenger.p10.s0;
        this.J0 = i13;
        this.U0 = 0;
        this.T0 = i11;
        this.V0 = j3;
        this.L0 = wwVar;
        this.R0 = dvVar;
        v4.k kVar = new v4.k();
        this.c0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = xq.h;
        org.telegram.ui.fw fwVar = (org.telegram.ui.fw) this;
        this.d0 = new yl0(fwVar, context, wwVar, i7, i10, kVar, wwVar.F, wwVar, context);
        int i14 = 1;
        if (i10 == 15) {
            ArrayList d42 = wwVar.d4(i13, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < d42.size(); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, ((TLRPC.Dialog) d42.get(i15)).id, arrayList)) {
            }
            this.d0.q0 = arrayList;
        }
        this.S0 = (rt0) wwVar.getFragmentView();
        bi.q1 q1Var = new bi.q1(25, context, fwVar);
        this.a0 = q1Var;
        q1Var.setItemAnimator(this.c0);
        q1Var.setPivotY(0.0f);
        q1Var.setClipToPadding(false);
        q1Var.setAdapter(this.d0);
        q1Var.setVerticalScrollBarEnabled(true);
        q1Var.setInstantClick(true);
        int i16 = 2;
        q1Var.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var = new v4.b0(1, false);
        this.e0 = b0Var;
        q1Var.setLayoutManager(b0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
        q1Var.setOnScrollListener(new ul0(fwVar, wwVar, i16));
        int i17 = 19;
        q1Var.D0(new ob0(fwVar, i17));
        org.telegram.ui.yz yzVar = new org.telegram.ui.yz(this.L0);
        this.O0 = yzVar;
        org.telegram.ui.zs zsVar = yzVar.b;
        zsVar.setClipToPadding(false);
        zsVar.j(new xl0(fwVar, i14));
        zsVar.D0(new ob0(fwVar, i17));
        yzVar.setUiCallback(this);
        yzVar.setVisibility(8);
        yzVar.setChatPreviewDelegate(dvVar);
        lz lzVar = new lz(context, null);
        lzVar.setViewType(1);
        sl0 sl0Var = new sl0(fwVar, context, lzVar, i16);
        this.b0 = sl0Var;
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.e.setVisibility(8);
        sl0Var.setVisibility(8);
        sl0Var.addView(lzVar, 0);
        sl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(sl0Var);
        frameLayout.addView(q1Var);
        frameLayout.addView(yzVar);
        q1Var.setEmptyView(sl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h0 = frameLayout2;
        zl0 zl0Var = new zl0(fwVar);
        zl0Var.m = false;
        zl0Var.C = false;
        xq xqVar = xq.h;
        zl0Var.o(xqVar);
        zl0Var.n(350L);
        pj0 pj0Var = new pj0(context, null);
        this.k0 = pj0Var;
        pj0Var.setItemAnimator(zl0Var);
        pj0Var.setPivotY(0.0f);
        pj0Var.setVerticalScrollBarEnabled(true);
        pj0Var.setInstantClick(true);
        pj0Var.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.j0 = b0Var2;
        pj0Var.setLayoutManager(b0Var2);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        pj0Var.setClipToPadding(false);
        lz lzVar2 = new lz(context, null);
        lzVar2.setViewType(1);
        sl0 sl0Var2 = new sl0(fwVar, context, lzVar2, 3);
        this.i0 = sl0Var2;
        sl0Var2.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var2.e.setVisibility(8);
        sl0Var2.setVisibility(8);
        sl0Var2.addView(lzVar2, 0);
        sl0Var2.e(true, false);
        frameLayout2.addView(sl0Var2);
        frameLayout2.addView(pj0Var);
        pj0Var.setEmptyView(sl0Var2);
        am0 am0Var = new am0(fwVar, pj0Var, context, this.J0, i11, wwVar);
        this.l0 = am0Var;
        pj0Var.setAdapter(am0Var);
        pj0Var.setOnScrollListener(new ul0(fwVar, wwVar, 3));
        pj0Var.D0(new ob0(fwVar, 19));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        rl0 rl0Var = new rl0(fwVar);
        rl0Var.m = false;
        rl0Var.C = false;
        rl0Var.o(xqVar);
        rl0Var.n(350L);
        pj0 pj0Var2 = new pj0(context, null);
        this.p0 = pj0Var2;
        pj0Var2.setItemAnimator(rl0Var);
        pj0Var2.setPivotY(0.0f);
        pj0Var2.setClipToPadding(false);
        pj0Var2.setVerticalScrollBarEnabled(true);
        pj0Var2.setInstantClick(true);
        pj0Var2.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.o0 = b0Var3;
        pj0Var2.setLayoutManager(b0Var3);
        pj0Var2.W1 = true;
        pj0Var2.X1 = 0;
        lz lzVar3 = new lz(context, null);
        lzVar3.setViewType(1);
        sl0 sl0Var3 = new sl0(fwVar, context, lzVar3, i12);
        this.n0 = sl0Var3;
        sl0Var3.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var3.e.setVisibility(8);
        sl0Var3.setVisibility(8);
        sl0Var3.addView(lzVar3, 0);
        sl0Var3.e(true, false);
        frameLayout3.addView(sl0Var3);
        frameLayout3.addView(pj0Var2);
        pj0Var2.setEmptyView(sl0Var3);
        tl0 tl0Var = new tl0(fwVar, pj0Var2, context, this.J0, i11);
        this.q0 = tl0Var;
        pj0Var2.setAdapter(tl0Var);
        pj0Var2.setOnScrollListener(new ul0(fwVar, wwVar, i12));
        pj0Var2.D0(new ob0(fwVar, 19));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.t0 = frameLayout4;
        vl0 vl0Var = new vl0(fwVar);
        vl0Var.m = false;
        vl0Var.C = false;
        vl0Var.o(xqVar);
        vl0Var.n(350L);
        pj0 pj0Var3 = new pj0(context, null);
        this.w0 = pj0Var3;
        pj0Var3.setItemAnimator(vl0Var);
        pj0Var3.setPivotY(0.0f);
        int i18 = 1;
        pj0Var3.setVerticalScrollBarEnabled(true);
        pj0Var3.setInstantClick(true);
        pj0Var3.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.v0 = b0Var4;
        pj0Var3.setLayoutManager(b0Var4);
        pj0Var3.W1 = true;
        pj0Var3.X1 = 0;
        pj0Var3.setClipToPadding(false);
        lz lzVar4 = new lz(context, null);
        lzVar4.setViewType(1);
        sl0 sl0Var4 = new sl0(fwVar, context, lzVar4, i18);
        this.u0 = sl0Var4;
        sl0Var4.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var4.e.setVisibility(8);
        sl0Var4.setVisibility(8);
        sl0Var4.addView(lzVar4, 0);
        sl0Var4.e(true, false);
        frameLayout4.addView(sl0Var4);
        frameLayout4.addView(pj0Var3);
        pj0Var3.setEmptyView(sl0Var4);
        wl0 wl0Var = new wl0(fwVar, pj0Var3, context, this.J0);
        this.x0 = wl0Var;
        pj0Var3.setAdapter(wl0Var);
        pj0Var3.setOnScrollListener(new ul0(fwVar, wwVar, i18));
        pj0Var3.D0(new ob0(fwVar, 19));
        this.f0 = new si0(q1Var, true);
        ze0 ze0Var = new ze0(context, wwVar);
        this.r0 = ze0Var;
        k41 k41Var = ze0Var.c;
        k41Var.setClipToPadding(false);
        k41Var.j(new xl0(fwVar, i12));
        k41Var.D0(new ob0(fwVar, 19));
        bi.g5 g5Var = new bi.g5(fwVar);
        this.V = g5Var;
        setAdapter(g5Var);
    }

    public static org.telegram.ui.an M(int i7, org.telegram.messenger.ij ijVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.f1());
        return new org.telegram.ui.an(bundle);
    }

    public static void Q(FrameLayout frameLayout, pj0 pj0Var, int i7, int i10, boolean z9) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z9) {
            pj0Var.q1(0, i7, 0, i10);
        } else {
            pj0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void L() {
        if (this.s0) {
            int i7 = 0;
            this.s0 = false;
            S();
            f61 f61Var = this.M;
            if (f61Var != null && f61Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            yl0 yl0Var = this.d0;
            if (yl0Var != null) {
                String str = this.M0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.C0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((jg.o0) arrayList.get(i10)).d == 7) {
                        i7 = 1;
                        break;
                    }
                    i10++;
                }
                yl0Var.T(i7, str);
            }
        }
    }

    public final int N(int i7) {
        int i10 = 0;
        while (true) {
            bi.g5 g5Var = this.V;
            ArrayList arrayList = (ArrayList) g5Var.b;
            ArrayList arrayList2 = (ArrayList) g5Var.b;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((em0) arrayList2.get(i10)).a == 3 && ((em0) arrayList2.get(i10)).b == i7) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean O() {
        int i7 = this.J0;
        if (!org.telegram.messenger.p10.i(i7).q() && !org.telegram.messenger.qp.s1(i7).D3()) {
            for (org.telegram.messenger.ij ijVar : this.B0.values()) {
                if (ijVar.F0() != null && ijVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i7, String str, boolean z9) {
        boolean z10;
        org.telegram.ui.yz yzVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        sl0 sl0Var = this.b0;
        if (isEmpty) {
            sl0Var.e.setVisibility(8);
        } else {
            sl0Var.e.setVisibility(0);
            sl0Var.e.setText(org.telegram.messenger.hd.a0(null, null, 2131748164, str));
        }
        yl0 yl0Var = this.d0;
        org.telegram.ui.hw hwVar = yl0Var.U;
        long a10 = hwVar != null ? hwVar.a() : 0L;
        long j10 = i7 == 0 ? 0L : a10;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = a10;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList = this.C0;
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
                    z14 = true;
                }
            }
            i11 = i10 + 1;
        }
        wl0 wl0Var = this.x0;
        wl0Var.getClass();
        if (u20.Y(str, null) == null) {
            L();
        }
        if (view == this.h0) {
            org.telegram.messenger.qp.s1(this.J0).L0(0L);
            am0 am0Var = this.l0;
            pj0 pj0Var = am0Var.d;
            ArrayList arrayList2 = am0Var.S;
            ArrayList arrayList3 = am0Var.T;
            ArrayList arrayList4 = am0Var.U;
            ArrayList arrayList5 = am0Var.R;
            gp gpVar = am0Var.e0;
            am0Var.X();
            if (!TextUtils.equals(str, am0Var.d0)) {
                am0Var.d0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(am0Var.d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    am0Var.O(true);
                    am0Var.c0++;
                    z13 = false;
                    am0Var.Y = false;
                    am0Var.Z = false;
                    am0Var.a0 = false;
                    am0Var.b0 = 0;
                    if (pj0Var != null) {
                        pj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(gpVar, 1000L);
                    am0Var.Y = true;
                    am0Var.Z = true;
                    am0Var.O(true);
                    if (pj0Var != null) {
                        z13 = false;
                        pj0Var.v0(0);
                    }
                }
                this.i0.b(this.P0, z13);
                return;
            }
            z13 = false;
            this.i0.b(this.P0, z13);
            return;
        }
        if (view == this.m0) {
            tl0 tl0Var = this.q0;
            pj0 pj0Var2 = tl0Var.d;
            ArrayList arrayList6 = tl0Var.V;
            rr rrVar = tl0Var.h0;
            if (TextUtils.equals(str, tl0Var.g0)) {
                z12 = false;
            } else {
                tl0Var.g0 = str;
                org.telegram.messenger.g0.r(rrVar);
                if (TextUtils.isEmpty(tl0Var.g0)) {
                    arrayList6.clear();
                    tl0Var.O(true);
                    tl0Var.f0++;
                    z12 = false;
                    tl0Var.b0 = false;
                    tl0Var.c0 = false;
                    tl0Var.d0 = false;
                    tl0Var.e0 = 0;
                    if (pj0Var2 != null) {
                        pj0Var2.v0(0);
                    }
                } else {
                    z12 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(rrVar, 1000L);
                    tl0Var.b0 = true;
                    tl0Var.c0 = true;
                    tl0Var.O(true);
                    if (pj0Var2 != null) {
                        pj0Var2.v0(0);
                    }
                }
            }
            this.n0.b(this.P0, z12);
            if (TextUtils.isEmpty(str)) {
                tl0Var.W();
                return;
            }
            return;
        }
        ze0 ze0Var = this.r0;
        if (view == ze0Var) {
            k41 k41Var = ze0Var.c;
            ArrayList arrayList7 = ze0Var.n;
            if (TextUtils.equals(ze0Var.x, str)) {
                return;
            }
            if (ze0Var.K >= 0) {
                ConnectionsManager.getInstance(ze0Var.b).cancelRequest(ze0Var.K, true);
                ze0Var.K = -1;
            }
            ze0Var.w = false;
            ze0Var.H.setLoading(false);
            ze0Var.x = str;
            if (TextUtils.isEmpty(str)) {
                ze0Var.r = 0;
                ze0Var.L++;
                ze0Var.s = false;
                arrayList7.clear();
                ze0Var.a(false);
            } else {
                ze0Var.b(str);
                ze0Var.r = 0;
                ze0Var.L++;
                ze0Var.s = false;
                arrayList7.clear();
            }
            ze0Var.d();
            k41Var.v0(0);
            k41Var.f3.O(true);
            return;
        }
        if (view == this.t0) {
            if (u20.Y(str, null) == null) {
                return;
            }
            if (z9) {
                this.v0.h1(0, 0);
            }
            wl0Var.Z(str);
            this.u0.b(this.P0, false);
            return;
        }
        if (view != this.W) {
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.yz) {
                org.telegram.ui.yz yzVar2 = (org.telegram.ui.yz) view;
                yzVar2.setUseFromUserAsAvatar(j13 != 0);
                yzVar2.c.b(this.P0, false);
                yzVar2.h(j10, this.V0, j15, j16, jg.q0.j3[((em0) ((ArrayList) this.V.b).get(i7)).b], z14, str, z9);
                return;
            }
            if (view instanceof dl0) {
                dl0 dl0Var = (dl0) view;
                dl0Var.a.b(this.P0, false);
                dl0Var.K = str;
                dl0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.yz yzVar3 = this.O0;
        if (!(j10 == 0 && this.V0 == 0 && j11 == 0 && j12 == 0) && j13 == 0) {
            yzVar3.setTag(1);
            yzVar3.i(this.N0, false);
            yzVar3.animate().setListener(null).cancel();
            if (z9) {
                yzVar3.setVisibility(0);
                yzVar3.setAlpha(1.0f);
                z10 = z9;
            } else {
                if (yzVar3.getVisibility() != 0) {
                    yzVar3.setVisibility(0);
                    yzVar3.setAlpha(0.0f);
                } else {
                    r5 = z9;
                }
                yzVar3.animate().alpha(1.0f).setDuration(150L).start();
                z10 = r5;
            }
            yzVar = yzVar3;
            z11 = false;
            this.O0.h(j10, this.V0, j11, j12, null, z14, str, z10);
            sl0Var.setVisibility(8);
        } else {
            this.K0 = false;
            yl0Var.T(z14 ? 1 : 0, str);
            yl0Var.A0 = this.N0;
            yzVar3.animate().setListener(null).cancel();
            yzVar3.i(null, false);
            if (z9) {
                sl0Var.e(!(yl0Var.D0 > 0), false);
                sl0Var.e(yl0Var.D0 > 0, false);
            } else if (!yl0Var.M()) {
                sl0Var.e(yl0Var.D0 > 0, true);
            }
            if (z9) {
                yzVar3.setVisibility(8);
            } else if (yzVar3.getVisibility() != 8) {
                yzVar3.animate().alpha(0.0f).setListener(new e60(this, 17)).setDuration(150L).start();
            }
            yzVar3.setTag(null);
            yzVar = yzVar3;
            z11 = false;
        }
        sl0Var.b(this.P0, z11);
        yzVar.c.b(this.P0, z11);
    }

    public final void R(boolean z9) {
        oj0 oj0Var;
        oj0 oj0Var2;
        oj0 oj0Var3;
        org.telegram.ui.hw hwVar;
        if (this.A0 == z9) {
            return;
        }
        org.telegram.ui.ww wwVar = this.L0;
        if (z9 && wwVar.getActionBar().v()) {
            return;
        }
        if (z9 && !wwVar.getActionBar().e("search_view_pager")) {
            this.H0 = wwVar.getActionBar().n("search_view_pager");
            if (wwVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.y0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.y0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                org.telegram.ui.ActionBar.r6.t(this.y0, org.telegram.ui.ActionBar.k6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.y0;
                int i7 = org.telegram.ui.ActionBar.k6.z8;
                org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i7), null);
                this.y0.setOnClickListener(new la0(this, 10));
                this.H0.addView(this.y0, c8.ha.p(54, 54, 0.0f, 16));
            }
            cm0 cm0Var = new cm0(this.H0.getContext());
            this.z0 = cm0Var;
            cm0Var.setTextSize(18);
            this.z0.setTypeface(org.telegram.messenger.g0.o());
            cm0 cm0Var2 = this.z0;
            int i10 = org.telegram.ui.ActionBar.k6.y8;
            il0 il0Var = new il0(2);
            il0 il0Var2 = new il0(3);
            int Q = org.telegram.ui.ActionBar.r6.Q(i10, -1, 0, 0.0f, null);
            il0Var2.c(Q, cm0Var2);
            org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, cm0Var2);
            x10.c(i10, -1, 0, 0.0f, null);
            x10.n = il0Var;
            x10.o = il0Var2;
            x10.m = false;
            x10.g = Q;
            this.H0.addView(this.z0, c8.ha.m(1.0f, 0, -1, wwVar.W ? 18 : 72, 0, 0));
            this.z0.setOnTouchListener(new ei.b(21));
            org.telegram.ui.ActionBar.r0 h = this.H0.h(203, R.drawable.avd_speed, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754801, null));
            this.D0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.r6.t(this.D0.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
            }
            this.E0 = this.H0.h(org.telegram.messenger.qs.e3, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754877, null));
            this.F0 = this.H0.h(org.telegram.messenger.qs.f3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131750588, null));
            this.G0 = this.H0.h(org.telegram.messenger.qs.g3, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751599, null));
        }
        if (this.z0 != null) {
            yl0 yl0Var = this.d0;
            ((ViewGroup.MarginLayoutParams) this.z0.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L((wwVar.W ? 18 : 72) + (yl0Var != null && (hwVar = yl0Var.U) != null && (hwVar.a() > 0L ? 1 : (hwVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            cm0 cm0Var3 = this.z0;
            cm0Var3.setLayoutParams(cm0Var3.getLayoutParams());
        }
        if (wwVar.getActionBar().getBackButton() != null && (wwVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            wwVar.getActionBar().setBackButtonDrawable(y1Var);
            y1Var.setColorFilter(null);
        }
        this.A0 = z9;
        HashMap hashMap = this.B0;
        if (z9) {
            org.telegram.messenger.g0.v1(wwVar.getParentActivity().getCurrentFocus());
            wwVar.getActionBar().O(null, null);
            this.z0.a(hashMap.size(), false);
            this.D0.setVisibility(O() ? 0 : 8);
            this.E0.setVisibility(0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            return;
        }
        wwVar.getActionBar().u();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.yz) && (oj0Var3 = ((org.telegram.ui.yz) getChildAt(i11)).d) != null) {
                oj0Var3.f();
            }
            if (getChildAt(i11) instanceof dl0) {
                ((dl0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.yz yzVar = this.O0;
        if (yzVar != null && (oj0Var2 = yzVar.d) != null) {
            oj0Var2.f();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.yz) && (oj0Var = ((org.telegram.ui.yz) view).d) != null) {
                oj0Var.f();
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        f61 f61Var = this.M;
        if (f61Var != null) {
            f61Var.y.f();
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
            FrameLayout frameLayout = this.W;
            pj0 pj0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    pj0Var = this.a0;
                } else if (view == this.h0) {
                    pj0Var = this.k0;
                } else if (view == this.m0) {
                    pj0Var = this.p0;
                } else if (view == this.t0) {
                    pj0Var = this.w0;
                } else {
                    dl0 dl0Var = this.I0;
                    if (view == dl0Var) {
                        pj0Var = dl0Var.b;
                    } else {
                        ze0 ze0Var = this.r0;
                        if (view == ze0Var) {
                            pj0Var = ze0Var.c;
                        } else if (view instanceof org.telegram.ui.yz) {
                            pj0Var = ((org.telegram.ui.yz) view).b;
                        }
                    }
                }
            }
            if (pj0Var != null) {
                ih.d.a(pj0Var, canvas, rectF, pj0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.yz yzVar = this.O0;
                if (yzVar.getVisibility() == 0) {
                    org.telegram.ui.zs zsVar = yzVar.b;
                    ih.d.a(zsVar, canvas, rectF, zsVar, this);
                }
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f3;
        am0 am0Var = this.l0;
        if (i7 == i11) {
            this.i0.e(org.telegram.messenger.qp.s1(this.J0).L0(0L) != null, true);
            am0Var.X();
            am0Var.O(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.y1 || i7 == org.telegram.messenger.qs.s) {
            am0Var.X();
            am0Var.O(true);
        } else {
            if (i7 == org.telegram.messenger.qs.V0) {
                this.q0.O(true);
                return;
            }
            if (i7 == org.telegram.messenger.qs.x5) {
                Object obj = objArr[0];
                wl0 wl0Var = this.x0;
                if (obj == wl0Var.S) {
                    wl0Var.O(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.xz
    public final void e() {
        R(true);
    }

    @Override // org.telegram.ui.xz
    public final boolean f(org.telegram.ui.rz rzVar) {
        return this.B0.containsKey(rzVar);
    }

    @Override // org.telegram.ui.xz
    public final void g(org.telegram.messenger.ij ijVar) {
        this.L0.presentFragment(M(this.J0, ijVar));
        R(false);
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.H0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.C0;
    }

    public dl0 getDownloadsContainer() {
        return this.I0;
    }

    public int getFolderId() {
        return this.T0;
    }

    @Override // org.telegram.ui.Components.p61
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.r0 getSpeedItem() {
        return this.D0;
    }

    public o61 getTabsView() {
        return this.M;
    }

    @Override // org.telegram.ui.xz
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        boolean z9;
        org.telegram.ui.rz rzVar = new org.telegram.ui.rz(ijVar.f1(), org.telegram.messenger.ij.B0(ijVar.k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(rzVar)) {
            hashMap.remove(rzVar);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(rzVar, ijVar);
        }
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.z0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.r0 r0Var = this.E0;
            if (r0Var != null) {
                r0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.D0 != null) {
                boolean O = O();
                int i10 = O ? 0 : 8;
                if (this.D0.getVisibility() != i10) {
                    this.D0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.D0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.r6.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.k6.y8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.G0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z9 = true;
                        break;
                    } else if (!((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.rz) it.next())).Q) {
                        z9 = false;
                        break;
                    }
                }
                this.G0.setVisibility(z9 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(rzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i7, hashMap.containsKey(rzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(rzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(rzVar), true);
        }
    }

    @Override // org.telegram.ui.xz
    public final boolean i() {
        return this.A0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.b0 b0Var = this.Y0;
        if (b0Var != null) {
            b0Var.b();
            this.Y0 = null;
        }
        ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.f(this.J0), this);
        b0Var2.c(org.telegram.messenger.qs.f3);
        b0Var2.c(org.telegram.messenger.qs.y1);
        b0Var2.c(org.telegram.messenger.qs.s);
        b0Var2.c(org.telegram.messenger.qs.V0);
        b0Var2.c(org.telegram.messenger.qs.x5);
        this.Y0 = b0Var2;
        this.g0 = true;
        am0 am0Var = this.l0;
        if (am0Var != null) {
            am0Var.O(false);
        }
        tl0 tl0Var = this.q0;
        if (tl0Var != null) {
            tl0Var.O(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g0 = false;
        ab.b0 b0Var = this.Y0;
        if (b0Var != null) {
            b0Var.b();
            this.Y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.p61
    public final void s() {
        this.S0.L();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.Z0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.pz pzVar) {
        this.N0 = pzVar;
    }

    public void setKeyboardHeight(int i7) {
        this.P0 = i7;
        boolean z9 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.yz) {
                ((org.telegram.ui.yz) getChildAt(i10)).c.b(i7, z9);
            } else if (getChildAt(i10) == this.W) {
                this.b0.b(i7, z9);
                this.O0.c.b(i7, z9);
            } else if (getChildAt(i10) instanceof dl0) {
                ((dl0) getChildAt(i10)).a.b(i7, z9);
            } else if (getChildAt(i10) == this.h0) {
                this.i0.b(i7, z9);
            }
        }
    }

    @Override // org.telegram.ui.Components.p61
    public void setPosition(int i7) {
        if (i7 < 0) {
            return;
        }
        super.setPosition(i7);
        this.h.clear();
        f61 f61Var = this.M;
        if (f61Var != null) {
            f61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.p61
    public final void t(View view, View view2, int i7, int i10) {
        yl0 yl0Var = this.d0;
        org.telegram.ui.yz yzVar = this.O0;
        if (i7 == 0) {
            if (yzVar.getVisibility() == 0) {
                yzVar.i(this.N0, false);
                yl0Var.A0 = null;
            } else {
                yzVar.i(null, false);
                org.telegram.ui.pz pzVar = this.N0;
                yl0Var.A0 = pzVar;
                if (pzVar != null) {
                    ((org.telegram.ui.fu) pzVar).j(false, null, yl0Var.y0, yl0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.yz) {
            ((org.telegram.ui.yz) view).i(this.N0, i10 == 0 && yzVar.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.yz) {
            ((org.telegram.ui.yz) view2).i(null, false);
        } else {
            yl0Var.A0 = null;
            yzVar.i(null, false);
        }
    }
}
