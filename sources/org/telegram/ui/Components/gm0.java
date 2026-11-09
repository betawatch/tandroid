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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class gm0 extends w61 implements org.telegram.ui.zz, org.telegram.messenger.ls, eh.a {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.r0 D0;
    public org.telegram.ui.ActionBar.r0 E0;
    public org.telegram.ui.ActionBar.r0 F0;
    public org.telegram.ui.ActionBar.r0 G0;
    public org.telegram.ui.ActionBar.y H0;
    public el0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.yw L0;
    public String M0;
    public org.telegram.ui.rz N0;
    public final org.telegram.ui.a00 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.fv R0;
    public final tt0 S0;
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
    public final tl0 b0;
    public final v4.k c0;
    public final zl0 d0;
    public final v4.b0 e0;
    public final ti0 f0;
    public boolean g0;
    public final FrameLayout h0;
    public final tl0 i0;
    public final v4.b0 j0;
    public final qj0 k0;
    public final bm0 l0;
    public final FrameLayout m0;
    public final tl0 n0;
    public final v4.b0 o0;
    public final qj0 p0;
    public final ul0 q0;
    public final af0 r0;
    public boolean s0;
    public final FrameLayout t0;
    public final tl0 u0;
    public final v4.b0 v0;
    public final qj0 w0;
    public final xl0 x0;
    public ImageView y0;
    public dm0 z0;

    public gm0(Context context, org.telegram.ui.yw ywVar, int i7, int i10, int i11, long j3, org.telegram.ui.fv fvVar) {
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
        this.L0 = ywVar;
        this.R0 = fvVar;
        v4.k kVar = new v4.k();
        this.c0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = xq.h;
        org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this;
        this.d0 = new zl0(hwVar, context, ywVar, i7, i10, kVar, ywVar.F, ywVar, context);
        int i14 = 1;
        if (i10 == 15) {
            ArrayList d42 = ywVar.d4(i13, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < d42.size(); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, ((TLRPC.Dialog) d42.get(i15)).id, arrayList)) {
            }
            this.d0.q0 = arrayList;
        }
        this.S0 = (tt0) ywVar.getFragmentView();
        bi.q1 q1Var = new bi.q1(25, context, hwVar);
        this.a0 = q1Var;
        q1Var.setItemAnimator(this.c0);
        q1Var.setPivotY(0.0f);
        q1Var.setClipToPadding(false);
        q1Var.setAdapter(this.d0);
        q1Var.setVerticalScrollBarEnabled(true);
        q1Var.setInstantClick(true);
        int i16 = 2;
        q1Var.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        v4.b0 b0Var = new v4.b0(1, false);
        this.e0 = b0Var;
        q1Var.setLayoutManager(b0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
        q1Var.setOnScrollListener(new vl0(hwVar, ywVar, i16));
        int i17 = 19;
        q1Var.D0(new pb0(hwVar, i17));
        org.telegram.ui.a00 a00Var = new org.telegram.ui.a00(this.L0);
        this.O0 = a00Var;
        org.telegram.ui.bt btVar = a00Var.b;
        btVar.setClipToPadding(false);
        btVar.j(new yl0(hwVar, i14));
        btVar.D0(new pb0(hwVar, i17));
        a00Var.setUiCallback(this);
        a00Var.setVisibility(8);
        a00Var.setChatPreviewDelegate(fvVar);
        mz mzVar = new mz(context, null);
        mzVar.setViewType(1);
        tl0 tl0Var = new tl0(hwVar, context, mzVar, i16);
        this.b0 = tl0Var;
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.e.setVisibility(8);
        tl0Var.setVisibility(8);
        tl0Var.addView(mzVar, 0);
        tl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(tl0Var);
        frameLayout.addView(q1Var);
        frameLayout.addView(a00Var);
        q1Var.setEmptyView(tl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h0 = frameLayout2;
        am0 am0Var = new am0(hwVar);
        am0Var.m = false;
        am0Var.C = false;
        xq xqVar = xq.h;
        am0Var.o(xqVar);
        am0Var.n(350L);
        qj0 qj0Var = new qj0(context, null);
        this.k0 = qj0Var;
        qj0Var.setItemAnimator(am0Var);
        qj0Var.setPivotY(0.0f);
        qj0Var.setVerticalScrollBarEnabled(true);
        qj0Var.setInstantClick(true);
        qj0Var.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.j0 = b0Var2;
        qj0Var.setLayoutManager(b0Var2);
        qj0Var.W1 = true;
        qj0Var.X1 = 0;
        qj0Var.setClipToPadding(false);
        mz mzVar2 = new mz(context, null);
        mzVar2.setViewType(1);
        tl0 tl0Var2 = new tl0(hwVar, context, mzVar2, 3);
        this.i0 = tl0Var2;
        tl0Var2.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var2.e.setVisibility(8);
        tl0Var2.setVisibility(8);
        tl0Var2.addView(mzVar2, 0);
        tl0Var2.e(true, false);
        frameLayout2.addView(tl0Var2);
        frameLayout2.addView(qj0Var);
        qj0Var.setEmptyView(tl0Var2);
        bm0 bm0Var = new bm0(hwVar, qj0Var, context, this.J0, i11, ywVar);
        this.l0 = bm0Var;
        qj0Var.setAdapter(bm0Var);
        qj0Var.setOnScrollListener(new vl0(hwVar, ywVar, 3));
        qj0Var.D0(new pb0(hwVar, 19));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        sl0 sl0Var = new sl0(hwVar);
        sl0Var.m = false;
        sl0Var.C = false;
        sl0Var.o(xqVar);
        sl0Var.n(350L);
        qj0 qj0Var2 = new qj0(context, null);
        this.p0 = qj0Var2;
        qj0Var2.setItemAnimator(sl0Var);
        qj0Var2.setPivotY(0.0f);
        qj0Var2.setClipToPadding(false);
        qj0Var2.setVerticalScrollBarEnabled(true);
        qj0Var2.setInstantClick(true);
        qj0Var2.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.o0 = b0Var3;
        qj0Var2.setLayoutManager(b0Var3);
        qj0Var2.W1 = true;
        qj0Var2.X1 = 0;
        mz mzVar3 = new mz(context, null);
        mzVar3.setViewType(1);
        tl0 tl0Var3 = new tl0(hwVar, context, mzVar3, i12);
        this.n0 = tl0Var3;
        tl0Var3.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var3.e.setVisibility(8);
        tl0Var3.setVisibility(8);
        tl0Var3.addView(mzVar3, 0);
        tl0Var3.e(true, false);
        frameLayout3.addView(tl0Var3);
        frameLayout3.addView(qj0Var2);
        qj0Var2.setEmptyView(tl0Var3);
        ul0 ul0Var = new ul0(hwVar, qj0Var2, context, this.J0, i11);
        this.q0 = ul0Var;
        qj0Var2.setAdapter(ul0Var);
        qj0Var2.setOnScrollListener(new vl0(hwVar, ywVar, i12));
        qj0Var2.D0(new pb0(hwVar, 19));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.t0 = frameLayout4;
        wl0 wl0Var = new wl0(hwVar);
        wl0Var.m = false;
        wl0Var.C = false;
        wl0Var.o(xqVar);
        wl0Var.n(350L);
        qj0 qj0Var3 = new qj0(context, null);
        this.w0 = qj0Var3;
        qj0Var3.setItemAnimator(wl0Var);
        qj0Var3.setPivotY(0.0f);
        int i18 = 1;
        qj0Var3.setVerticalScrollBarEnabled(true);
        qj0Var3.setInstantClick(true);
        qj0Var3.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.v0 = b0Var4;
        qj0Var3.setLayoutManager(b0Var4);
        qj0Var3.W1 = true;
        qj0Var3.X1 = 0;
        qj0Var3.setClipToPadding(false);
        mz mzVar4 = new mz(context, null);
        mzVar4.setViewType(1);
        tl0 tl0Var4 = new tl0(hwVar, context, mzVar4, i18);
        this.u0 = tl0Var4;
        tl0Var4.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var4.e.setVisibility(8);
        tl0Var4.setVisibility(8);
        tl0Var4.addView(mzVar4, 0);
        tl0Var4.e(true, false);
        frameLayout4.addView(tl0Var4);
        frameLayout4.addView(qj0Var3);
        qj0Var3.setEmptyView(tl0Var4);
        xl0 xl0Var = new xl0(hwVar, qj0Var3, context, this.J0);
        this.x0 = xl0Var;
        qj0Var3.setAdapter(xl0Var);
        qj0Var3.setOnScrollListener(new vl0(hwVar, ywVar, i18));
        qj0Var3.D0(new pb0(hwVar, 19));
        this.f0 = new ti0(q1Var, true);
        af0 af0Var = new af0(context, ywVar);
        this.r0 = af0Var;
        r41 r41Var = af0Var.c;
        r41Var.setClipToPadding(false);
        r41Var.j(new yl0(hwVar, i12));
        r41Var.D0(new pb0(hwVar, 19));
        bi.g5 g5Var = new bi.g5(hwVar);
        this.V = g5Var;
        setAdapter(g5Var);
    }

    public static org.telegram.ui.cn M(int i7, org.telegram.messenger.ij ijVar) {
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
        bundle.putInt("message_id", ijVar.e1());
        return new org.telegram.ui.cn(bundle);
    }

    public static void Q(FrameLayout frameLayout, qj0 qj0Var, int i7, int i10, boolean z9) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z9) {
            qj0Var.q1(0, i7, 0, i10);
        } else {
            qj0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void L() {
        if (this.s0) {
            int i7 = 0;
            this.s0 = false;
            S();
            l61 l61Var = this.M;
            if (l61Var != null && l61Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            zl0 zl0Var = this.d0;
            if (zl0Var != null) {
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
                zl0Var.T(i7, str);
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
            if (((fm0) arrayList2.get(i10)).a == 3 && ((fm0) arrayList2.get(i10)).b == i7) {
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
        org.telegram.ui.a00 a00Var;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        tl0 tl0Var = this.b0;
        if (isEmpty) {
            tl0Var.e.setVisibility(8);
        } else {
            tl0Var.e.setVisibility(0);
            tl0Var.e.setText(org.telegram.messenger.id.a0(null, null, 2131748165, str));
        }
        zl0 zl0Var = this.d0;
        org.telegram.ui.jw jwVar = zl0Var.U;
        long a10 = jwVar != null ? jwVar.a() : 0L;
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
        xl0 xl0Var = this.x0;
        xl0Var.getClass();
        if (v20.Y(str, null) == null) {
            L();
        }
        if (view == this.h0) {
            org.telegram.messenger.qp.s1(this.J0).L0(0L);
            bm0 bm0Var = this.l0;
            qj0 qj0Var = bm0Var.d;
            ArrayList arrayList2 = bm0Var.S;
            ArrayList arrayList3 = bm0Var.T;
            ArrayList arrayList4 = bm0Var.U;
            ArrayList arrayList5 = bm0Var.R;
            gp gpVar = bm0Var.e0;
            bm0Var.X();
            if (!TextUtils.equals(str, bm0Var.d0)) {
                bm0Var.d0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(bm0Var.d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    bm0Var.O(true);
                    bm0Var.c0++;
                    z13 = false;
                    bm0Var.Y = false;
                    bm0Var.Z = false;
                    bm0Var.a0 = false;
                    bm0Var.b0 = 0;
                    if (qj0Var != null) {
                        qj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(gpVar, 1000L);
                    bm0Var.Y = true;
                    bm0Var.Z = true;
                    bm0Var.O(true);
                    if (qj0Var != null) {
                        z13 = false;
                        qj0Var.v0(0);
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
            ul0 ul0Var = this.q0;
            qj0 qj0Var2 = ul0Var.d;
            ArrayList arrayList6 = ul0Var.V;
            rr rrVar = ul0Var.h0;
            if (TextUtils.equals(str, ul0Var.g0)) {
                z12 = false;
            } else {
                ul0Var.g0 = str;
                org.telegram.messenger.g0.r(rrVar);
                if (TextUtils.isEmpty(ul0Var.g0)) {
                    arrayList6.clear();
                    ul0Var.O(true);
                    ul0Var.f0++;
                    z12 = false;
                    ul0Var.b0 = false;
                    ul0Var.c0 = false;
                    ul0Var.d0 = false;
                    ul0Var.e0 = 0;
                    if (qj0Var2 != null) {
                        qj0Var2.v0(0);
                    }
                } else {
                    z12 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(rrVar, 1000L);
                    ul0Var.b0 = true;
                    ul0Var.c0 = true;
                    ul0Var.O(true);
                    if (qj0Var2 != null) {
                        qj0Var2.v0(0);
                    }
                }
            }
            this.n0.b(this.P0, z12);
            if (TextUtils.isEmpty(str)) {
                ul0Var.W();
                return;
            }
            return;
        }
        af0 af0Var = this.r0;
        if (view == af0Var) {
            r41 r41Var = af0Var.c;
            ArrayList arrayList7 = af0Var.n;
            if (TextUtils.equals(af0Var.x, str)) {
                return;
            }
            if (af0Var.K >= 0) {
                ConnectionsManager.getInstance(af0Var.b).cancelRequest(af0Var.K, true);
                af0Var.K = -1;
            }
            af0Var.w = false;
            af0Var.H.setLoading(false);
            af0Var.x = str;
            if (TextUtils.isEmpty(str)) {
                af0Var.r = 0;
                af0Var.L++;
                af0Var.s = false;
                arrayList7.clear();
                af0Var.a(false);
            } else {
                af0Var.b(str);
                af0Var.r = 0;
                af0Var.L++;
                af0Var.s = false;
                arrayList7.clear();
            }
            af0Var.d();
            r41Var.v0(0);
            r41Var.f3.O(true);
            return;
        }
        if (view == this.t0) {
            if (v20.Y(str, null) == null) {
                return;
            }
            if (z9) {
                this.v0.h1(0, 0);
            }
            xl0Var.Z(str);
            this.u0.b(this.P0, false);
            return;
        }
        if (view != this.W) {
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.a00) {
                org.telegram.ui.a00 a00Var2 = (org.telegram.ui.a00) view;
                a00Var2.setUseFromUserAsAvatar(j13 != 0);
                a00Var2.c.b(this.P0, false);
                a00Var2.h(j10, this.V0, j15, j16, jg.q0.j3[((fm0) ((ArrayList) this.V.b).get(i7)).b], z14, str, z9);
                return;
            }
            if (view instanceof el0) {
                el0 el0Var = (el0) view;
                el0Var.a.b(this.P0, false);
                el0Var.K = str;
                el0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.a00 a00Var3 = this.O0;
        if (!(j10 == 0 && this.V0 == 0 && j11 == 0 && j12 == 0) && j13 == 0) {
            a00Var3.setTag(1);
            a00Var3.i(this.N0, false);
            a00Var3.animate().setListener(null).cancel();
            if (z9) {
                a00Var3.setVisibility(0);
                a00Var3.setAlpha(1.0f);
                z10 = z9;
            } else {
                if (a00Var3.getVisibility() != 0) {
                    a00Var3.setVisibility(0);
                    a00Var3.setAlpha(0.0f);
                } else {
                    r5 = z9;
                }
                a00Var3.animate().alpha(1.0f).setDuration(150L).start();
                z10 = r5;
            }
            a00Var = a00Var3;
            z11 = false;
            this.O0.h(j10, this.V0, j11, j12, null, z14, str, z10);
            tl0Var.setVisibility(8);
        } else {
            this.K0 = false;
            zl0Var.T(z14 ? 1 : 0, str);
            zl0Var.A0 = this.N0;
            a00Var3.animate().setListener(null).cancel();
            a00Var3.i(null, false);
            if (z9) {
                tl0Var.e(!(zl0Var.D0 > 0), false);
                tl0Var.e(zl0Var.D0 > 0, false);
            } else if (!zl0Var.M()) {
                tl0Var.e(zl0Var.D0 > 0, true);
            }
            if (z9) {
                a00Var3.setVisibility(8);
            } else if (a00Var3.getVisibility() != 8) {
                a00Var3.animate().alpha(0.0f).setListener(new f60(this, 17)).setDuration(150L).start();
            }
            a00Var3.setTag(null);
            a00Var = a00Var3;
            z11 = false;
        }
        tl0Var.b(this.P0, z11);
        a00Var.c.b(this.P0, z11);
    }

    public final void R(boolean z9) {
        pj0 pj0Var;
        pj0 pj0Var2;
        pj0 pj0Var3;
        org.telegram.ui.jw jwVar;
        if (this.A0 == z9) {
            return;
        }
        org.telegram.ui.yw ywVar = this.L0;
        if (z9 && ywVar.getActionBar().w()) {
            return;
        }
        if (z9 && !ywVar.getActionBar().c("search_view_pager")) {
            this.H0 = ywVar.getActionBar().o("search_view_pager");
            if (ywVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.y0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.y0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                org.telegram.ui.ActionBar.s6.s(this.y0, org.telegram.ui.ActionBar.l6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.y0;
                int i7 = org.telegram.ui.ActionBar.l6.z8;
                org.telegram.ui.ActionBar.s6.Q(imageView2, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i7, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i7), null);
                this.y0.setOnClickListener(new ma0(this, 10));
                this.H0.addView(this.y0, c8.ha.p(54, 54, 0.0f, 16));
            }
            dm0 dm0Var = new dm0(this.H0.getContext());
            this.z0 = dm0Var;
            dm0Var.setTextSize(18);
            this.z0.setTypeface(org.telegram.messenger.g0.o());
            dm0 dm0Var2 = this.z0;
            int i10 = org.telegram.ui.ActionBar.l6.y8;
            jl0 jl0Var = new jl0(2);
            jl0 jl0Var2 = new jl0(3);
            int P = org.telegram.ui.ActionBar.s6.P(i10, -1, 0, 0.0f, null);
            jl0Var2.c(P, dm0Var2);
            org.telegram.ui.ActionBar.m6 w10 = org.telegram.ui.ActionBar.s6.w(101, dm0Var2);
            w10.c(i10, -1, 0, 0.0f, null);
            w10.n = jl0Var;
            w10.o = jl0Var2;
            w10.m = false;
            w10.g = P;
            this.H0.addView(this.z0, c8.ha.m(1.0f, 0, -1, ywVar.W ? 18 : 72, 0, 0));
            this.z0.setOnTouchListener(new ei.b(21));
            org.telegram.ui.ActionBar.r0 h = this.H0.h(203, R.drawable.avd_speed, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754801, null));
            this.D0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.s6.s(this.D0.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
            }
            this.E0 = this.H0.h(org.telegram.messenger.qs.e3, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754877, null));
            this.F0 = this.H0.h(org.telegram.messenger.qs.f3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131750587, null));
            this.G0 = this.H0.h(org.telegram.messenger.qs.g3, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751598, null));
        }
        if (this.z0 != null) {
            zl0 zl0Var = this.d0;
            ((ViewGroup.MarginLayoutParams) this.z0.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L((ywVar.W ? 18 : 72) + (zl0Var != null && (jwVar = zl0Var.U) != null && (jwVar.a() > 0L ? 1 : (jwVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            dm0 dm0Var3 = this.z0;
            dm0Var3.setLayoutParams(dm0Var3.getLayoutParams());
        }
        if (ywVar.getActionBar().getBackButton() != null && (ywVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            ywVar.getActionBar().setBackButtonDrawable(y1Var);
            y1Var.setColorFilter(null);
        }
        this.A0 = z9;
        HashMap hashMap = this.B0;
        if (z9) {
            org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
            ywVar.getActionBar().P(null, null);
            this.z0.a(hashMap.size(), false);
            this.D0.setVisibility(O() ? 0 : 8);
            this.E0.setVisibility(0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            return;
        }
        ywVar.getActionBar().v();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.a00) && (pj0Var3 = ((org.telegram.ui.a00) getChildAt(i11)).d) != null) {
                pj0Var3.f();
            }
            if (getChildAt(i11) instanceof el0) {
                ((el0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.a00 a00Var = this.O0;
        if (a00Var != null && (pj0Var2 = a00Var.d) != null) {
            pj0Var2.f();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.a00) && (pj0Var = ((org.telegram.ui.a00) view).d) != null) {
                pj0Var.f();
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        l61 l61Var = this.M;
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
            FrameLayout frameLayout = this.W;
            qj0 qj0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    qj0Var = this.a0;
                } else if (view == this.h0) {
                    qj0Var = this.k0;
                } else if (view == this.m0) {
                    qj0Var = this.p0;
                } else if (view == this.t0) {
                    qj0Var = this.w0;
                } else {
                    el0 el0Var = this.I0;
                    if (view == el0Var) {
                        qj0Var = el0Var.b;
                    } else {
                        af0 af0Var = this.r0;
                        if (view == af0Var) {
                            qj0Var = af0Var.c;
                        } else if (view instanceof org.telegram.ui.a00) {
                            qj0Var = ((org.telegram.ui.a00) view).b;
                        }
                    }
                }
            }
            if (qj0Var != null) {
                ih.d.a(qj0Var, canvas, rectF, qj0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.a00 a00Var = this.O0;
                if (a00Var.getVisibility() == 0) {
                    org.telegram.ui.bt btVar = a00Var.b;
                    ih.d.a(btVar, canvas, rectF, btVar, this);
                }
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f3;
        bm0 bm0Var = this.l0;
        if (i7 == i11) {
            this.i0.e(org.telegram.messenger.qp.s1(this.J0).L0(0L) != null, true);
            bm0Var.X();
            bm0Var.O(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.y1 || i7 == org.telegram.messenger.qs.s) {
            bm0Var.X();
            bm0Var.O(true);
        } else {
            if (i7 == org.telegram.messenger.qs.V0) {
                this.q0.O(true);
                return;
            }
            if (i7 == org.telegram.messenger.qs.x5) {
                Object obj = objArr[0];
                xl0 xl0Var = this.x0;
                if (obj == xl0Var.S) {
                    xl0Var.O(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.zz
    public final void e() {
        R(true);
    }

    @Override // org.telegram.ui.zz
    public final boolean f(org.telegram.ui.tz tzVar) {
        return this.B0.containsKey(tzVar);
    }

    @Override // org.telegram.ui.zz
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

    public el0 getDownloadsContainer() {
        return this.I0;
    }

    public int getFolderId() {
        return this.T0;
    }

    @Override // org.telegram.ui.Components.w61
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.r0 getSpeedItem() {
        return this.D0;
    }

    public v61 getTabsView() {
        return this.M;
    }

    @Override // org.telegram.ui.zz
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        boolean z9;
        org.telegram.ui.tz tzVar = new org.telegram.ui.tz(ijVar.e1(), org.telegram.messenger.ij.B0(ijVar.k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(tzVar)) {
            hashMap.remove(tzVar);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(tzVar, ijVar);
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
                    org.telegram.ui.ActionBar.s6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.l6.y8, null, PorterDuff.Mode.SRC_IN);
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
                    } else if (!((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.tz) it.next())).Q) {
                        z9 = false;
                        break;
                    }
                }
                this.G0.setVisibility(z9 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(tzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i7, hashMap.containsKey(tzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(tzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(tzVar), true);
        }
    }

    @Override // org.telegram.ui.zz
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
        bm0 bm0Var = this.l0;
        if (bm0Var != null) {
            bm0Var.O(false);
        }
        ul0 ul0Var = this.q0;
        if (ul0Var != null) {
            ul0Var.O(false);
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

    @Override // org.telegram.ui.Components.w61
    public final void s() {
        this.S0.L();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.Z0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.rz rzVar) {
        this.N0 = rzVar;
    }

    public void setKeyboardHeight(int i7) {
        this.P0 = i7;
        boolean z9 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.a00) {
                ((org.telegram.ui.a00) getChildAt(i10)).c.b(i7, z9);
            } else if (getChildAt(i10) == this.W) {
                this.b0.b(i7, z9);
                this.O0.c.b(i7, z9);
            } else if (getChildAt(i10) instanceof el0) {
                ((el0) getChildAt(i10)).a.b(i7, z9);
            } else if (getChildAt(i10) == this.h0) {
                this.i0.b(i7, z9);
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
        l61 l61Var = this.M;
        if (l61Var != null) {
            l61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(View view, View view2, int i7, int i10) {
        zl0 zl0Var = this.d0;
        org.telegram.ui.a00 a00Var = this.O0;
        if (i7 == 0) {
            if (a00Var.getVisibility() == 0) {
                a00Var.i(this.N0, false);
                zl0Var.A0 = null;
            } else {
                a00Var.i(null, false);
                org.telegram.ui.rz rzVar = this.N0;
                zl0Var.A0 = rzVar;
                if (rzVar != null) {
                    ((org.telegram.ui.hu) rzVar).j(false, null, zl0Var.y0, zl0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.a00) {
            ((org.telegram.ui.a00) view).i(this.N0, i10 == 0 && a00Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.a00) {
            ((org.telegram.ui.a00) view2).i(null, false);
        } else {
            zl0Var.A0 = null;
            a00Var.i(null, false);
        }
    }
}
