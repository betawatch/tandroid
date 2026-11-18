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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class rm0 extends g71 implements org.telegram.ui.b00, org.telegram.messenger.fs, eh.a {
    public static final /* synthetic */ int b1 = 0;
    public om0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.r0 E0;
    public org.telegram.ui.ActionBar.r0 F0;
    public org.telegram.ui.ActionBar.r0 G0;
    public org.telegram.ui.ActionBar.r0 H0;
    public org.telegram.ui.ActionBar.z I0;
    public ql0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.cx M0;
    public String N0;
    public org.telegram.ui.tz O0;
    public final org.telegram.ui.c00 P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.hv S0;
    public final au0 T0;
    public final int U0;
    public int V0;
    public final di.i4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public xi.e Z0;
    public final FrameLayout a0;
    public dh.c a1;
    public final di.b1 b0;
    public final em0 c0;
    public final v4.k d0;
    public final km0 e0;
    public final v4.c0 f0;
    public final fj0 g0;
    public boolean h0;
    public final FrameLayout i0;
    public final em0 j0;
    public final v4.c0 k0;
    public final ck0 l0;
    public final mm0 m0;
    public final FrameLayout n0;
    public final em0 o0;
    public final v4.c0 p0;
    public final ck0 q0;
    public final fm0 r0;
    public final mf0 s0;
    public boolean t0;
    public final FrameLayout u0;
    public final em0 v0;
    public final v4.c0 w0;
    public final ck0 x0;
    public final im0 y0;
    public ImageView z0;

    public rm0(Context context, org.telegram.ui.cx cxVar, int i7, int i10, int i11, long j3, org.telegram.ui.hv hvVar) {
        super(context, null);
        int i12 = 0;
        this.t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i13 = org.telegram.messenger.j10.t0;
        this.K0 = i13;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j3;
        this.M0 = cxVar;
        this.S0 = hvVar;
        v4.k kVar = new v4.k();
        this.d0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = lr.h;
        org.telegram.ui.kw kwVar = (org.telegram.ui.kw) this;
        this.e0 = new km0(kwVar, context, cxVar, i7, i10, kVar, cxVar.G, cxVar, context);
        int i14 = 1;
        if (i10 == 15) {
            ArrayList d42 = cxVar.d4(i13, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < d42.size(); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, ((TLRPC.Dialog) d42.get(i15)).id, arrayList)) {
            }
            this.e0.r0 = arrayList;
        }
        this.T0 = (au0) cxVar.getFragmentView();
        di.b1 b1Var = new di.b1(25, context, kwVar);
        this.b0 = b1Var;
        b1Var.setItemAnimator(this.d0);
        b1Var.setPivotY(0.0f);
        b1Var.setClipToPadding(false);
        b1Var.setAdapter(this.e0);
        b1Var.setVerticalScrollBarEnabled(true);
        b1Var.setInstantClick(true);
        int i16 = 2;
        b1Var.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        v4.c0 c0Var = new v4.c0(1, false);
        this.f0 = c0Var;
        b1Var.setLayoutManager(c0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
        b1Var.setOnScrollListener(new gm0(kwVar, cxVar, i16));
        int i17 = 22;
        b1Var.D0(new gb0(kwVar, i17));
        org.telegram.ui.c00 c00Var = new org.telegram.ui.c00(this.M0);
        this.P0 = c00Var;
        org.telegram.ui.et etVar = c00Var.b;
        etVar.setClipToPadding(false);
        etVar.j(new jm0(kwVar, i14));
        etVar.D0(new gb0(kwVar, i17));
        c00Var.setUiCallback(this);
        c00Var.setVisibility(8);
        c00Var.setChatPreviewDelegate(hvVar);
        wz wzVar = new wz(context, null);
        wzVar.setViewType(1);
        em0 em0Var = new em0(kwVar, context, wzVar, i16);
        this.c0 = em0Var;
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.e.setVisibility(8);
        em0Var.setVisibility(8);
        em0Var.addView(wzVar, 0);
        em0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(em0Var);
        frameLayout.addView(b1Var);
        frameLayout.addView(c00Var);
        b1Var.setEmptyView(em0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i0 = frameLayout2;
        lm0 lm0Var = new lm0(kwVar);
        lm0Var.m = false;
        lm0Var.C = false;
        lr lrVar = lr.h;
        lm0Var.o(lrVar);
        lm0Var.n(350L);
        ck0 ck0Var = new ck0(context, null);
        this.l0 = ck0Var;
        ck0Var.setItemAnimator(lm0Var);
        ck0Var.setPivotY(0.0f);
        ck0Var.setVerticalScrollBarEnabled(true);
        ck0Var.setInstantClick(true);
        ck0Var.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        v4.c0 c0Var2 = new v4.c0(1, false);
        this.k0 = c0Var2;
        ck0Var.setLayoutManager(c0Var2);
        ck0Var.X1 = true;
        ck0Var.Y1 = 0;
        ck0Var.setClipToPadding(false);
        wz wzVar2 = new wz(context, null);
        wzVar2.setViewType(1);
        em0 em0Var2 = new em0(kwVar, context, wzVar2, 3);
        this.j0 = em0Var2;
        em0Var2.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var2.e.setVisibility(8);
        em0Var2.setVisibility(8);
        em0Var2.addView(wzVar2, 0);
        em0Var2.e(true, false);
        frameLayout2.addView(em0Var2);
        frameLayout2.addView(ck0Var);
        ck0Var.setEmptyView(em0Var2);
        mm0 mm0Var = new mm0(kwVar, ck0Var, context, this.K0, i11, cxVar);
        this.m0 = mm0Var;
        ck0Var.setAdapter(mm0Var);
        ck0Var.setOnScrollListener(new gm0(kwVar, cxVar, 3));
        ck0Var.D0(new gb0(kwVar, 22));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n0 = frameLayout3;
        dm0 dm0Var = new dm0(kwVar);
        dm0Var.m = false;
        dm0Var.C = false;
        dm0Var.o(lrVar);
        dm0Var.n(350L);
        ck0 ck0Var2 = new ck0(context, null);
        this.q0 = ck0Var2;
        ck0Var2.setItemAnimator(dm0Var);
        ck0Var2.setPivotY(0.0f);
        ck0Var2.setClipToPadding(false);
        ck0Var2.setVerticalScrollBarEnabled(true);
        ck0Var2.setInstantClick(true);
        ck0Var2.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        v4.c0 c0Var3 = new v4.c0(1, false);
        this.p0 = c0Var3;
        ck0Var2.setLayoutManager(c0Var3);
        ck0Var2.X1 = true;
        ck0Var2.Y1 = 0;
        wz wzVar3 = new wz(context, null);
        wzVar3.setViewType(1);
        em0 em0Var3 = new em0(kwVar, context, wzVar3, i12);
        this.o0 = em0Var3;
        em0Var3.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var3.e.setVisibility(8);
        em0Var3.setVisibility(8);
        em0Var3.addView(wzVar3, 0);
        em0Var3.e(true, false);
        frameLayout3.addView(em0Var3);
        frameLayout3.addView(ck0Var2);
        ck0Var2.setEmptyView(em0Var3);
        fm0 fm0Var = new fm0(kwVar, ck0Var2, context, this.K0, i11);
        this.r0 = fm0Var;
        ck0Var2.setAdapter(fm0Var);
        ck0Var2.setOnScrollListener(new gm0(kwVar, cxVar, i12));
        ck0Var2.D0(new gb0(kwVar, 22));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.u0 = frameLayout4;
        hm0 hm0Var = new hm0(kwVar);
        hm0Var.m = false;
        hm0Var.C = false;
        hm0Var.o(lrVar);
        hm0Var.n(350L);
        ck0 ck0Var3 = new ck0(context, null);
        this.x0 = ck0Var3;
        ck0Var3.setItemAnimator(hm0Var);
        ck0Var3.setPivotY(0.0f);
        int i18 = 1;
        ck0Var3.setVerticalScrollBarEnabled(true);
        ck0Var3.setInstantClick(true);
        ck0Var3.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        v4.c0 c0Var4 = new v4.c0(1, false);
        this.w0 = c0Var4;
        ck0Var3.setLayoutManager(c0Var4);
        ck0Var3.X1 = true;
        ck0Var3.Y1 = 0;
        ck0Var3.setClipToPadding(false);
        wz wzVar4 = new wz(context, null);
        wzVar4.setViewType(1);
        em0 em0Var4 = new em0(kwVar, context, wzVar4, i18);
        this.v0 = em0Var4;
        em0Var4.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var4.e.setVisibility(8);
        em0Var4.setVisibility(8);
        em0Var4.addView(wzVar4, 0);
        em0Var4.e(true, false);
        frameLayout4.addView(em0Var4);
        frameLayout4.addView(ck0Var3);
        ck0Var3.setEmptyView(em0Var4);
        im0 im0Var = new im0(kwVar, ck0Var3, context, this.K0);
        this.y0 = im0Var;
        ck0Var3.setAdapter(im0Var);
        ck0Var3.setOnScrollListener(new gm0(kwVar, cxVar, i18));
        ck0Var3.D0(new gb0(kwVar, 22));
        this.g0 = new fj0(b1Var, true);
        mf0 mf0Var = new mf0(context, cxVar);
        this.s0 = mf0Var;
        e51 e51Var = mf0Var.c;
        e51Var.setClipToPadding(false);
        e51Var.j(new jm0(kwVar, i12));
        e51Var.D0(new gb0(kwVar, 22));
        di.i4 i4Var = new di.i4(kwVar);
        this.W = i4Var;
        setAdapter(i4Var);
    }

    public static org.telegram.ui.bn I(int i7, org.telegram.messenger.fj fjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        if (org.telegram.messenger.n5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        return new org.telegram.ui.bn(bundle);
    }

    public static void M(FrameLayout frameLayout, ck0 ck0Var, int i7, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z10) {
            ck0Var.q1(0, i7, 0, i10);
        } else {
            ck0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ck0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void H() {
        if (this.t0) {
            int i7 = 0;
            this.t0 = false;
            O();
            w61 w61Var = this.N;
            if (w61Var != null && w61Var.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            km0 km0Var = this.e0;
            if (km0Var != null) {
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
                km0Var.T(i7, str);
            }
        }
    }

    public final int J(int i7) {
        int i10 = 0;
        while (true) {
            di.i4 i4Var = this.W;
            ArrayList arrayList = (ArrayList) i4Var.b;
            ArrayList arrayList2 = (ArrayList) i4Var.b;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((qm0) arrayList2.get(i10)).a == 3 && ((qm0) arrayList2.get(i10)).b == i7) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean K() {
        int i7 = this.K0;
        if (!org.telegram.messenger.j10.i(i7).q() && !org.telegram.messenger.mp.u1(i7).K3()) {
            for (org.telegram.messenger.fj fjVar : this.C0.values()) {
                if (fjVar.F0() != null && fjVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L(View view, int i7, String str, boolean z10) {
        boolean z11;
        org.telegram.ui.c00 c00Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        em0 em0Var = this.c0;
        if (isEmpty) {
            em0Var.e.setVisibility(8);
        } else {
            em0Var.e.setVisibility(0);
            em0Var.e.setText(org.telegram.messenger.gd.a0(null, null, 2131747973, str));
        }
        km0 km0Var = this.e0;
        org.telegram.ui.mw mwVar = km0Var.V;
        long a10 = mwVar != null ? mwVar.a() : 0L;
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
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.v3.Y((TLRPC.Chat) tLObject)) {
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
        im0 im0Var = this.y0;
        im0Var.getClass();
        if (f30.Y(str, null) == null) {
            H();
        }
        if (view == this.i0) {
            org.telegram.messenger.mp.u1(this.K0).N0(0L);
            mm0 mm0Var = this.m0;
            ck0 ck0Var = mm0Var.d;
            ArrayList arrayList2 = mm0Var.T;
            ArrayList arrayList3 = mm0Var.U;
            ArrayList arrayList4 = mm0Var.V;
            ArrayList arrayList5 = mm0Var.S;
            mo moVar = mm0Var.f0;
            mm0Var.X();
            if (!TextUtils.equals(str, mm0Var.e0)) {
                mm0Var.e0 = str;
                org.telegram.messenger.g0.r(moVar);
                if (TextUtils.isEmpty(mm0Var.e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    mm0Var.O(true);
                    mm0Var.d0++;
                    z14 = false;
                    mm0Var.Z = false;
                    mm0Var.a0 = false;
                    mm0Var.b0 = false;
                    mm0Var.c0 = 0;
                    if (ck0Var != null) {
                        ck0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.h3(moVar, 1000L);
                    mm0Var.Z = true;
                    mm0Var.a0 = true;
                    mm0Var.O(true);
                    if (ck0Var != null) {
                        z14 = false;
                        ck0Var.v0(0);
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
            fm0 fm0Var = this.r0;
            ck0 ck0Var2 = fm0Var.d;
            ArrayList arrayList6 = fm0Var.W;
            es esVar = fm0Var.i0;
            if (TextUtils.equals(str, fm0Var.h0)) {
                z13 = false;
            } else {
                fm0Var.h0 = str;
                org.telegram.messenger.g0.r(esVar);
                if (TextUtils.isEmpty(fm0Var.h0)) {
                    arrayList6.clear();
                    fm0Var.O(true);
                    fm0Var.g0++;
                    z13 = false;
                    fm0Var.c0 = false;
                    fm0Var.d0 = false;
                    fm0Var.e0 = false;
                    fm0Var.f0 = 0;
                    if (ck0Var2 != null) {
                        ck0Var2.v0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.h3(esVar, 1000L);
                    fm0Var.c0 = true;
                    fm0Var.d0 = true;
                    fm0Var.O(true);
                    if (ck0Var2 != null) {
                        ck0Var2.v0(0);
                    }
                }
            }
            this.o0.b(this.Q0, z13);
            if (TextUtils.isEmpty(str)) {
                fm0Var.W();
                return;
            }
            return;
        }
        mf0 mf0Var = this.s0;
        if (view == mf0Var) {
            e51 e51Var = mf0Var.c;
            ArrayList arrayList7 = mf0Var.n;
            if (TextUtils.equals(mf0Var.x, str)) {
                return;
            }
            if (mf0Var.L >= 0) {
                ConnectionsManager.getInstance(mf0Var.b).cancelRequest(mf0Var.L, true);
                mf0Var.L = -1;
            }
            mf0Var.w = false;
            mf0Var.I.setLoading(false);
            mf0Var.x = str;
            if (TextUtils.isEmpty(str)) {
                mf0Var.r = 0;
                mf0Var.M++;
                mf0Var.s = false;
                arrayList7.clear();
                mf0Var.a(false);
            } else {
                mf0Var.b(str);
                mf0Var.r = 0;
                mf0Var.M++;
                mf0Var.s = false;
                arrayList7.clear();
            }
            mf0Var.d();
            e51Var.v0(0);
            e51Var.g3.O(true);
            return;
        }
        if (view == this.u0) {
            if (f30.Y(str, null) == null) {
                return;
            }
            if (z10) {
                this.w0.h1(0, 0);
            }
            im0Var.Z(str);
            this.v0.b(this.Q0, false);
            return;
        }
        if (view != this.a0) {
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.c00) {
                org.telegram.ui.c00 c00Var2 = (org.telegram.ui.c00) view;
                c00Var2.setUseFromUserAsAvatar(j13 != 0);
                c00Var2.c.b(this.Q0, false);
                c00Var2.h(j10, this.W0, j15, j16, jg.q0.k3[((qm0) ((ArrayList) this.W.b).get(i7)).b], z15, str, z10);
                return;
            }
            if (view instanceof ql0) {
                ql0 ql0Var = (ql0) view;
                ql0Var.a.b(this.Q0, false);
                ql0Var.L = str;
                ql0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.c00 c00Var3 = this.P0;
        if (!(j10 == 0 && this.W0 == 0 && j11 == 0 && j12 == 0) && j13 == 0) {
            c00Var3.setTag(1);
            c00Var3.i(this.O0, false);
            c00Var3.animate().setListener(null).cancel();
            if (z10) {
                c00Var3.setVisibility(0);
                c00Var3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (c00Var3.getVisibility() != 0) {
                    c00Var3.setVisibility(0);
                    c00Var3.setAlpha(0.0f);
                } else {
                    r5 = z10;
                }
                c00Var3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = r5;
            }
            c00Var = c00Var3;
            z12 = false;
            this.P0.h(j10, this.W0, j11, j12, null, z15, str, z11);
            em0Var.setVisibility(8);
        } else {
            this.L0 = false;
            km0Var.T(z15 ? 1 : 0, str);
            km0Var.B0 = this.O0;
            c00Var3.animate().setListener(null).cancel();
            c00Var3.i(null, false);
            if (z10) {
                em0Var.e(!(km0Var.E0 > 0), false);
                em0Var.e(km0Var.E0 > 0, false);
            } else if (!km0Var.M()) {
                em0Var.e(km0Var.E0 > 0, true);
            }
            if (z10) {
                c00Var3.setVisibility(8);
            } else if (c00Var3.getVisibility() != 8) {
                c00Var3.animate().alpha(0.0f).setListener(new q60(this, 17)).setDuration(150L).start();
            }
            c00Var3.setTag(null);
            c00Var = c00Var3;
            z12 = false;
        }
        em0Var.b(this.Q0, z12);
        c00Var.c.b(this.Q0, z12);
    }

    public final void N(boolean z10) {
        bk0 bk0Var;
        bk0 bk0Var2;
        bk0 bk0Var3;
        org.telegram.ui.mw mwVar;
        if (this.B0 == z10) {
            return;
        }
        org.telegram.ui.cx cxVar = this.M0;
        if (z10 && cxVar.getActionBar().y()) {
            return;
        }
        int i7 = 8;
        if (z10 && !cxVar.getActionBar().c("search_view_pager")) {
            this.I0 = cxVar.getActionBar().q("search_view_pager");
            if (cxVar.X) {
                ImageView imageView = new ImageView(getContext());
                this.z0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.z0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                org.telegram.ui.ActionBar.u6.s(this.z0, org.telegram.ui.ActionBar.n6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.z0;
                int i10 = org.telegram.ui.ActionBar.n6.z8;
                org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), null);
                this.z0.setOnClickListener(new h70(this, 12));
                this.I0.addView(this.z0, c8.ma.p(54, 54, 0.0f, 16));
            }
            om0 om0Var = new om0(this.I0.getContext());
            this.A0 = om0Var;
            om0Var.setTextSize(18);
            this.A0.setTypeface(org.telegram.messenger.g0.o());
            om0 om0Var2 = this.A0;
            int i11 = org.telegram.ui.ActionBar.n6.y8;
            wb0 wb0Var = new wb0(7);
            wb0 wb0Var2 = new wb0(i7);
            int P = org.telegram.ui.ActionBar.u6.P(i11, -1, 0, 0.0f, null);
            wb0Var2.d(P, om0Var2);
            org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, om0Var2);
            w10.c(i11, -1, 0, 0.0f, null);
            w10.n = wb0Var;
            w10.o = wb0Var2;
            w10.m = false;
            w10.g = P;
            this.I0.addView(this.A0, c8.ma.m(1.0f, 0, -1, cxVar.X ? 18 : 72, 0, 0));
            this.A0.setOnTouchListener(new gi.a(22));
            org.telegram.ui.ActionBar.r0 h = this.I0.h(203, R.drawable.avd_speed, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131754801, null));
            this.E0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.u6.s(this.E0.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
            }
            this.F0 = this.I0.h(org.telegram.messenger.ks.e3, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131754877, null));
            this.G0 = this.I0.h(org.telegram.messenger.ks.f3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131750571, null));
            this.H0 = this.I0.h(org.telegram.messenger.ks.g3, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
        }
        if (this.A0 != null) {
            km0 km0Var = this.e0;
            ((ViewGroup.MarginLayoutParams) this.A0.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L((cxVar.X ? 18 : 72) + (km0Var != null && (mwVar = km0Var.V) != null && (mwVar.a() > 0L ? 1 : (mwVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            om0 om0Var3 = this.A0;
            om0Var3.setLayoutParams(om0Var3.getLayoutParams());
        }
        if (cxVar.getActionBar().getBackButton() != null && (cxVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.t4)) {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            cxVar.getActionBar().setBackButtonDrawable(y1Var);
            y1Var.setColorFilter(null);
        }
        this.B0 = z10;
        HashMap hashMap = this.C0;
        if (z10) {
            org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
            cxVar.getActionBar().S(null, null);
            this.A0.a(hashMap.size(), false);
            this.E0.setVisibility(K() ? 0 : 8);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            this.H0.setVisibility(0);
            return;
        }
        cxVar.getActionBar().x();
        hashMap.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof org.telegram.ui.c00) && (bk0Var3 = ((org.telegram.ui.c00) getChildAt(i12)).d) != null) {
                bk0Var3.f();
            }
            if (getChildAt(i12) instanceof ql0) {
                ((ql0) getChildAt(i12)).d(true);
            }
        }
        org.telegram.ui.c00 c00Var = this.P0;
        if (c00Var != null && (bk0Var2 = c00Var.d) != null) {
            bk0Var2.f();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) sparseArray.valueAt(i13);
            if ((view instanceof org.telegram.ui.c00) && (bk0Var = ((org.telegram.ui.c00) view).d) != null) {
                bk0Var.f();
            }
        }
    }

    public final void O() {
        this.W.l();
        j(false);
        w61 w61Var = this.N;
        if (w61Var != null) {
            w61Var.y.f();
        }
    }

    @Override // org.telegram.ui.b00
    public final boolean V1() {
        return this.B0;
    }

    @Override // org.telegram.ui.b00
    public final void Z0(org.telegram.messenger.fj fjVar, View view, int i7) {
        boolean z10;
        org.telegram.ui.vz vzVar = new org.telegram.ui.vz(fjVar.e1(), org.telegram.messenger.fj.B0(fjVar.k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(vzVar)) {
            hashMap.remove(vzVar);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(vzVar, fjVar);
        }
        if (hashMap.size() == 0) {
            N(false);
        } else {
            this.A0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.r0 r0Var = this.F0;
            if (r0Var != null) {
                r0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.E0 != null) {
                boolean K = K();
                int i10 = K ? 0 : 8;
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.u6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.n6.y8, null, PorterDuff.Mode.SRC_IN);
                    if (K) {
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
                    } else if (!((org.telegram.messenger.fj) hashMap.get((org.telegram.ui.vz) it.next())).Q) {
                        z10 = false;
                        break;
                    }
                }
                this.H0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(vzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q7) {
            ((org.telegram.ui.Cells.q7) view).b(i7, hashMap.containsKey(vzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).f(hashMap.containsKey(vzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.i2) {
            ((org.telegram.ui.Cells.i2) view).c(hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view).c0(hashMap.containsKey(vzVar), true);
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
            ck0 ck0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    ck0Var = this.b0;
                } else if (view == this.i0) {
                    ck0Var = this.l0;
                } else if (view == this.n0) {
                    ck0Var = this.q0;
                } else if (view == this.u0) {
                    ck0Var = this.x0;
                } else {
                    ql0 ql0Var = this.J0;
                    if (view == ql0Var) {
                        ck0Var = ql0Var.b;
                    } else {
                        mf0 mf0Var = this.s0;
                        if (view == mf0Var) {
                            ck0Var = mf0Var.c;
                        } else if (view instanceof org.telegram.ui.c00) {
                            ck0Var = ((org.telegram.ui.c00) view).b;
                        }
                    }
                }
            }
            if (ck0Var != null) {
                ih.d.a(ck0Var, canvas, rectF, ck0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.c00 c00Var = this.P0;
                if (c00Var.getVisibility() == 0) {
                    org.telegram.ui.et etVar = c00Var.b;
                    ih.d.a(etVar, canvas, rectF, etVar, this);
                }
            }
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.h3;
        mm0 mm0Var = this.m0;
        if (i7 == i11) {
            this.j0.e(org.telegram.messenger.mp.u1(this.K0).N0(0L) != null, true);
            mm0Var.X();
            mm0Var.O(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.y1 || i7 == org.telegram.messenger.ks.s) {
            mm0Var.X();
            mm0Var.O(true);
        } else {
            if (i7 == org.telegram.messenger.ks.V0) {
                this.r0.O(true);
                return;
            }
            if (i7 == org.telegram.messenger.ks.A5) {
                Object obj = objArr[0];
                im0 im0Var = this.y0;
                if (obj == im0Var.T) {
                    im0Var.O(true);
                }
            }
        }
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.I0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.D0;
    }

    public ql0 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override // org.telegram.ui.Components.g71
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.r0 getSpeedItem() {
        return this.E0;
    }

    public f71 getTabsView() {
        return this.N;
    }

    @Override // org.telegram.ui.b00
    public final void n() {
        N(true);
    }

    @Override // org.telegram.ui.Components.g71
    public final void o() {
        this.T0.K();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ks.f(this.K0), this);
        eVar2.c(org.telegram.messenger.ks.h3);
        eVar2.c(org.telegram.messenger.ks.y1);
        eVar2.c(org.telegram.messenger.ks.s);
        eVar2.c(org.telegram.messenger.ks.V0);
        eVar2.c(org.telegram.messenger.ks.A5);
        this.Z0 = eVar2;
        this.h0 = true;
        mm0 mm0Var = this.m0;
        if (mm0Var != null) {
            mm0Var.O(false);
        }
        fm0 fm0Var = this.r0;
        if (fm0Var != null) {
            fm0Var.O(false);
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

    @Override // org.telegram.ui.Components.g71
    public final void p(View view, View view2, int i7, int i10) {
        km0 km0Var = this.e0;
        org.telegram.ui.c00 c00Var = this.P0;
        if (i7 == 0) {
            if (c00Var.getVisibility() == 0) {
                c00Var.i(this.O0, false);
                km0Var.B0 = null;
            } else {
                c00Var.i(null, false);
                org.telegram.ui.tz tzVar = this.O0;
                km0Var.B0 = tzVar;
                if (tzVar != null) {
                    ((org.telegram.ui.ju) tzVar).j(false, null, km0Var.z0, km0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.c00) {
            ((org.telegram.ui.c00) view).i(this.O0, i10 == 0 && c00Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.c00) {
            ((org.telegram.ui.c00) view2).i(null, false);
        } else {
            km0Var.B0 = null;
            c00Var.i(null, false);
        }
    }

    @Override // org.telegram.ui.b00
    public final boolean r0(org.telegram.ui.vz vzVar) {
        return this.C0.containsKey(vzVar);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.tz tzVar) {
        this.O0 = tzVar;
    }

    public void setKeyboardHeight(int i7) {
        this.Q0 = i7;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.c00) {
                ((org.telegram.ui.c00) getChildAt(i10)).c.b(i7, z10);
            } else if (getChildAt(i10) == this.a0) {
                this.c0.b(i7, z10);
                this.P0.c.b(i7, z10);
            } else if (getChildAt(i10) instanceof ql0) {
                ((ql0) getChildAt(i10)).a.b(i7, z10);
            } else if (getChildAt(i10) == this.i0) {
                this.j0.b(i7, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void setPosition(int i7) {
        if (i7 < 0) {
            return;
        }
        super.setPosition(i7);
        this.h.clear();
        w61 w61Var = this.N;
        if (w61Var != null) {
            w61Var.g(1.0f, i7);
        }
        invalidate();
    }

    @Override // org.telegram.ui.b00
    public final void t0(org.telegram.messenger.fj fjVar) {
        this.M0.presentFragment(I(this.K0, fjVar));
        N(false);
    }
}
