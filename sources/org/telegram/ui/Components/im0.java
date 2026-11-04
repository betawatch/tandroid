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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class im0 extends n61 implements org.telegram.ui.vz, org.telegram.messenger.cs, fh.a {
    public static final /* synthetic */ int b1 = 0;
    public fm0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.q0 E0;
    public org.telegram.ui.ActionBar.q0 F0;
    public org.telegram.ui.ActionBar.q0 G0;
    public org.telegram.ui.ActionBar.q0 H0;
    public org.telegram.ui.ActionBar.x I0;
    public hl0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.uw M0;
    public String N0;
    public org.telegram.ui.nz O0;
    public final org.telegram.ui.wz P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.av S0;
    public final qt0 T0;
    public final int U0;
    public int V0;
    public final ci.o4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public za.p Z0;
    public final FrameLayout a0;
    public eh.c a1;
    public final ci.j1 b0;
    public final vl0 c0;
    public final u4.k d0;
    public final bm0 e0;
    public final u4.b0 f0;
    public final wi0 g0;
    public boolean h0;
    public final FrameLayout i0;
    public final vl0 j0;
    public final u4.b0 k0;
    public final tj0 l0;
    public final dm0 m0;
    public final FrameLayout n0;
    public final vl0 o0;
    public final u4.b0 p0;
    public final tj0 q0;
    public final wl0 r0;
    public final bf0 s0;
    public boolean t0;
    public final FrameLayout u0;
    public final vl0 v0;
    public final u4.b0 w0;
    public final tj0 x0;
    public final zl0 y0;
    public ImageView z0;

    public im0(Context context, org.telegram.ui.uw uwVar, int i3, int i10, int i11, long j10, org.telegram.ui.av avVar) {
        super(context, null);
        int i12 = 0;
        this.t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i13 = org.telegram.messenger.h10.t0;
        this.K0 = i13;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j10;
        this.M0 = uwVar;
        this.S0 = avVar;
        u4.k kVar = new u4.k();
        this.d0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = xq.h;
        org.telegram.ui.cw cwVar = (org.telegram.ui.cw) this;
        this.e0 = new bm0(cwVar, context, uwVar, i3, i10, kVar, uwVar.G, uwVar, context);
        int i14 = 1;
        if (i10 == 15) {
            ArrayList d42 = uwVar.d4(i13, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < d42.size(); i15 = a1.g.h(i15, 1, ((TLRPC.Dialog) d42.get(i15)).id, arrayList)) {
            }
            this.e0.r0 = arrayList;
        }
        this.T0 = (qt0) uwVar.getFragmentView();
        ci.j1 j1Var = new ci.j1(25, context, cwVar);
        this.b0 = j1Var;
        j1Var.setItemAnimator(this.d0);
        j1Var.setPivotY(0.0f);
        j1Var.setClipToPadding(false);
        j1Var.setAdapter(this.e0);
        j1Var.setVerticalScrollBarEnabled(true);
        j1Var.setInstantClick(true);
        int i16 = 2;
        j1Var.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        u4.b0 b0Var = new u4.b0(1, false);
        this.f0 = b0Var;
        j1Var.setLayoutManager(b0Var);
        j1Var.X1 = true;
        j1Var.Y1 = 0;
        j1Var.setOnScrollListener(new xl0(cwVar, uwVar, i16));
        int i17 = 21;
        j1Var.D0(new jb0(cwVar, i17));
        org.telegram.ui.wz wzVar = new org.telegram.ui.wz(this.M0);
        this.P0 = wzVar;
        org.telegram.ui.xs xsVar = wzVar.b;
        xsVar.setClipToPadding(false);
        xsVar.j(new am0(cwVar, i14));
        xsVar.D0(new jb0(cwVar, i17));
        wzVar.setUiCallback(this);
        wzVar.setVisibility(8);
        wzVar.setChatPreviewDelegate(avVar);
        iz izVar = new iz(context, null);
        izVar.setViewType(1);
        vl0 vl0Var = new vl0(cwVar, context, izVar, i16);
        this.c0 = vl0Var;
        vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var.e.setVisibility(8);
        vl0Var.setVisibility(8);
        vl0Var.addView(izVar, 0);
        vl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(vl0Var);
        frameLayout.addView(j1Var);
        frameLayout.addView(wzVar);
        j1Var.setEmptyView(vl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i0 = frameLayout2;
        cm0 cm0Var = new cm0(cwVar);
        cm0Var.m = false;
        cm0Var.C = false;
        xq xqVar = xq.h;
        cm0Var.o(xqVar);
        cm0Var.n(350L);
        tj0 tj0Var = new tj0(context, null);
        this.l0 = tj0Var;
        tj0Var.setItemAnimator(cm0Var);
        tj0Var.setPivotY(0.0f);
        tj0Var.setVerticalScrollBarEnabled(true);
        tj0Var.setInstantClick(true);
        tj0Var.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        u4.b0 b0Var2 = new u4.b0(1, false);
        this.k0 = b0Var2;
        tj0Var.setLayoutManager(b0Var2);
        tj0Var.X1 = true;
        tj0Var.Y1 = 0;
        tj0Var.setClipToPadding(false);
        iz izVar2 = new iz(context, null);
        izVar2.setViewType(1);
        vl0 vl0Var2 = new vl0(cwVar, context, izVar2, 3);
        this.j0 = vl0Var2;
        vl0Var2.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var2.e.setVisibility(8);
        vl0Var2.setVisibility(8);
        vl0Var2.addView(izVar2, 0);
        vl0Var2.e(true, false);
        frameLayout2.addView(vl0Var2);
        frameLayout2.addView(tj0Var);
        tj0Var.setEmptyView(vl0Var2);
        dm0 dm0Var = new dm0(cwVar, tj0Var, context, this.K0, i11, uwVar);
        this.m0 = dm0Var;
        tj0Var.setAdapter(dm0Var);
        tj0Var.setOnScrollListener(new xl0(cwVar, uwVar, 3));
        tj0Var.D0(new jb0(cwVar, 21));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n0 = frameLayout3;
        ul0 ul0Var = new ul0(cwVar);
        ul0Var.m = false;
        ul0Var.C = false;
        ul0Var.o(xqVar);
        ul0Var.n(350L);
        tj0 tj0Var2 = new tj0(context, null);
        this.q0 = tj0Var2;
        tj0Var2.setItemAnimator(ul0Var);
        tj0Var2.setPivotY(0.0f);
        tj0Var2.setClipToPadding(false);
        tj0Var2.setVerticalScrollBarEnabled(true);
        tj0Var2.setInstantClick(true);
        tj0Var2.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        u4.b0 b0Var3 = new u4.b0(1, false);
        this.p0 = b0Var3;
        tj0Var2.setLayoutManager(b0Var3);
        tj0Var2.X1 = true;
        tj0Var2.Y1 = 0;
        iz izVar3 = new iz(context, null);
        izVar3.setViewType(1);
        vl0 vl0Var3 = new vl0(cwVar, context, izVar3, i12);
        this.o0 = vl0Var3;
        vl0Var3.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var3.e.setVisibility(8);
        vl0Var3.setVisibility(8);
        vl0Var3.addView(izVar3, 0);
        vl0Var3.e(true, false);
        frameLayout3.addView(vl0Var3);
        frameLayout3.addView(tj0Var2);
        tj0Var2.setEmptyView(vl0Var3);
        wl0 wl0Var = new wl0(cwVar, tj0Var2, context, this.K0, i11);
        this.r0 = wl0Var;
        tj0Var2.setAdapter(wl0Var);
        tj0Var2.setOnScrollListener(new xl0(cwVar, uwVar, i12));
        tj0Var2.D0(new jb0(cwVar, 21));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.u0 = frameLayout4;
        yl0 yl0Var = new yl0(cwVar);
        yl0Var.m = false;
        yl0Var.C = false;
        yl0Var.o(xqVar);
        yl0Var.n(350L);
        tj0 tj0Var3 = new tj0(context, null);
        this.x0 = tj0Var3;
        tj0Var3.setItemAnimator(yl0Var);
        tj0Var3.setPivotY(0.0f);
        int i18 = 1;
        tj0Var3.setVerticalScrollBarEnabled(true);
        tj0Var3.setInstantClick(true);
        tj0Var3.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        u4.b0 b0Var4 = new u4.b0(1, false);
        this.w0 = b0Var4;
        tj0Var3.setLayoutManager(b0Var4);
        tj0Var3.X1 = true;
        tj0Var3.Y1 = 0;
        tj0Var3.setClipToPadding(false);
        iz izVar4 = new iz(context, null);
        izVar4.setViewType(1);
        vl0 vl0Var4 = new vl0(cwVar, context, izVar4, i18);
        this.v0 = vl0Var4;
        vl0Var4.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var4.e.setVisibility(8);
        vl0Var4.setVisibility(8);
        vl0Var4.addView(izVar4, 0);
        vl0Var4.e(true, false);
        frameLayout4.addView(vl0Var4);
        frameLayout4.addView(tj0Var3);
        tj0Var3.setEmptyView(vl0Var4);
        zl0 zl0Var = new zl0(cwVar, tj0Var3, context, this.K0);
        this.y0 = zl0Var;
        tj0Var3.setAdapter(zl0Var);
        tj0Var3.setOnScrollListener(new xl0(cwVar, uwVar, i18));
        tj0Var3.D0(new jb0(cwVar, 21));
        this.g0 = new wi0(j1Var, true);
        bf0 bf0Var = new bf0(context, uwVar);
        this.s0 = bf0Var;
        l41 l41Var = bf0Var.c;
        l41Var.setClipToPadding(false);
        l41Var.j(new am0(cwVar, i12));
        l41Var.D0(new jb0(cwVar, 21));
        ci.o4 o4Var = new ci.o4(cwVar);
        this.W = o4Var;
        setAdapter(o4Var);
    }

    public static org.telegram.ui.wm M(int i3, org.telegram.messenger.zi ziVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ziVar.f1());
        return new org.telegram.ui.wm(bundle);
    }

    public static void Q(FrameLayout frameLayout, tj0 tj0Var, int i3, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i3, 0, i10);
        if (z10) {
            tj0Var.q1(0, i3, 0, i10);
        } else {
            tj0Var.setPadding(0, i3, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i3;
        marginLayoutParams.bottomMargin = -i10;
    }

    @Override // org.telegram.ui.vz
    public final boolean I() {
        return this.B0;
    }

    public final void L() {
        if (this.t0) {
            int i3 = 0;
            this.t0 = false;
            S();
            d61 d61Var = this.N;
            if (d61Var != null && d61Var.getCurrentTabId() != 0) {
                this.N.d(0, 0);
            }
            bm0 bm0Var = this.e0;
            if (bm0Var != null) {
                String str = this.N0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((kg.l0) arrayList.get(i10)).d == 7) {
                        i3 = 1;
                        break;
                    }
                    i10++;
                }
                bm0Var.T(i3, str);
            }
        }
    }

    public final int N(int i3) {
        int i10 = 0;
        while (true) {
            ci.o4 o4Var = this.W;
            ArrayList arrayList = (ArrayList) o4Var.b;
            ArrayList arrayList2 = (ArrayList) o4Var.b;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((hm0) arrayList2.get(i10)).a == 3 && ((hm0) arrayList2.get(i10)).b == i3) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean O() {
        int i3 = this.K0;
        if (!org.telegram.messenger.h10.i(i3).q() && !org.telegram.messenger.hp.s1(i3).D3()) {
            for (org.telegram.messenger.zi ziVar : this.C0.values()) {
                if (ziVar.F0() != null && ziVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i3, String str, boolean z10) {
        boolean z11;
        org.telegram.ui.wz wzVar;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        vl0 vl0Var = this.c0;
        if (isEmpty) {
            vl0Var.e.setVisibility(8);
        } else {
            vl0Var.e.setVisibility(0);
            vl0Var.e.setText(org.telegram.messenger.bd.a0(null, null, 2131748173, str));
        }
        bm0 bm0Var = this.e0;
        org.telegram.ui.ew ewVar = bm0Var.V;
        long a10 = ewVar != null ? ewVar.a() : 0L;
        long j11 = i3 == 0 ? 0L : a10;
        int i11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = a10;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i11 >= arrayList.size()) {
                break;
            }
            kg.l0 l0Var = (kg.l0) arrayList.get(i11);
            int i12 = l0Var.d;
            if (i12 == 4) {
                TLObject tLObject = l0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j10 = -((TLRPC.Chat) l0Var.f).id;
                }
                i10 = i11;
                j11 = j10;
            } else if (i12 == 6) {
                kg.j0 j0Var = l0Var.g;
                long j15 = j0Var.b;
                i10 = i11;
                j13 = j0Var.c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z15 = true;
                }
            }
            i11 = i10 + 1;
        }
        zl0 zl0Var = this.y0;
        zl0Var.getClass();
        if (q20.Y(str, null) == null) {
            L();
        }
        if (view == this.i0) {
            org.telegram.messenger.hp.s1(this.K0).L0(0L);
            dm0 dm0Var = this.m0;
            tj0 tj0Var = dm0Var.d;
            ArrayList arrayList2 = dm0Var.T;
            ArrayList arrayList3 = dm0Var.U;
            ArrayList arrayList4 = dm0Var.V;
            ArrayList arrayList5 = dm0Var.S;
            gp gpVar = dm0Var.f0;
            dm0Var.X();
            if (!TextUtils.equals(str, dm0Var.e0)) {
                dm0Var.e0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(dm0Var.e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    dm0Var.O(true);
                    dm0Var.d0++;
                    z14 = false;
                    dm0Var.Z = false;
                    dm0Var.a0 = false;
                    dm0Var.b0 = false;
                    dm0Var.c0 = 0;
                    if (tj0Var != null) {
                        tj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(gpVar, 1000L);
                    dm0Var.Z = true;
                    dm0Var.a0 = true;
                    dm0Var.O(true);
                    if (tj0Var != null) {
                        z14 = false;
                        tj0Var.v0(0);
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
            wl0 wl0Var = this.r0;
            tj0 tj0Var2 = wl0Var.d;
            ArrayList arrayList6 = wl0Var.W;
            rr rrVar = wl0Var.i0;
            if (TextUtils.equals(str, wl0Var.h0)) {
                z13 = false;
            } else {
                wl0Var.h0 = str;
                org.telegram.messenger.g0.r(rrVar);
                if (TextUtils.isEmpty(wl0Var.h0)) {
                    arrayList6.clear();
                    wl0Var.O(true);
                    wl0Var.g0++;
                    z13 = false;
                    wl0Var.c0 = false;
                    wl0Var.d0 = false;
                    wl0Var.e0 = false;
                    wl0Var.f0 = 0;
                    if (tj0Var2 != null) {
                        tj0Var2.v0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(rrVar, 1000L);
                    wl0Var.c0 = true;
                    wl0Var.d0 = true;
                    wl0Var.O(true);
                    if (tj0Var2 != null) {
                        tj0Var2.v0(0);
                    }
                }
            }
            this.o0.b(this.Q0, z13);
            if (TextUtils.isEmpty(str)) {
                wl0Var.W();
                return;
            }
            return;
        }
        bf0 bf0Var = this.s0;
        if (view == bf0Var) {
            l41 l41Var = bf0Var.c;
            ArrayList arrayList7 = bf0Var.n;
            if (TextUtils.equals(bf0Var.x, str)) {
                return;
            }
            if (bf0Var.L >= 0) {
                ConnectionsManager.getInstance(bf0Var.b).cancelRequest(bf0Var.L, true);
                bf0Var.L = -1;
            }
            bf0Var.w = false;
            bf0Var.I.setLoading(false);
            bf0Var.x = str;
            if (TextUtils.isEmpty(str)) {
                bf0Var.r = 0;
                bf0Var.M++;
                bf0Var.s = false;
                arrayList7.clear();
                bf0Var.a(false);
            } else {
                bf0Var.b(str);
                bf0Var.r = 0;
                bf0Var.M++;
                bf0Var.s = false;
                arrayList7.clear();
            }
            bf0Var.d();
            l41Var.v0(0);
            l41Var.g3.O(true);
            return;
        }
        if (view == this.u0) {
            if (q20.Y(str, null) == null) {
                return;
            }
            if (z10) {
                this.w0.h1(0, 0);
            }
            zl0Var.Z(str);
            this.v0.b(this.Q0, false);
            return;
        }
        if (view != this.a0) {
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.wz) {
                org.telegram.ui.wz wzVar2 = (org.telegram.ui.wz) view;
                wzVar2.setUseFromUserAsAvatar(j14 != 0);
                wzVar2.c.b(this.Q0, false);
                wzVar2.h(j11, this.W0, j16, j17, kg.n0.k3[((hm0) ((ArrayList) this.W.b).get(i3)).b], z15, str, z10);
                return;
            }
            if (view instanceof hl0) {
                hl0 hl0Var = (hl0) view;
                hl0Var.a.b(this.Q0, false);
                hl0Var.L = str;
                hl0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.wz wzVar3 = this.P0;
        if (!(j11 == 0 && this.W0 == 0 && j12 == 0 && j13 == 0) && j14 == 0) {
            wzVar3.setTag(1);
            wzVar3.i(this.O0, false);
            wzVar3.animate().setListener(null).cancel();
            if (z10) {
                wzVar3.setVisibility(0);
                wzVar3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (wzVar3.getVisibility() != 0) {
                    wzVar3.setVisibility(0);
                    wzVar3.setAlpha(0.0f);
                } else {
                    r5 = z10;
                }
                wzVar3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = r5;
            }
            wzVar = wzVar3;
            z12 = false;
            this.P0.h(j11, this.W0, j12, j13, null, z15, str, z11);
            vl0Var.setVisibility(8);
        } else {
            this.L0 = false;
            bm0Var.T(z15 ? 1 : 0, str);
            bm0Var.B0 = this.O0;
            wzVar3.animate().setListener(null).cancel();
            wzVar3.i(null, false);
            if (z10) {
                vl0Var.e(!(bm0Var.E0 > 0), false);
                vl0Var.e(bm0Var.E0 > 0, false);
            } else if (!bm0Var.M()) {
                vl0Var.e(bm0Var.E0 > 0, true);
            }
            if (z10) {
                wzVar3.setVisibility(8);
            } else if (wzVar3.getVisibility() != 8) {
                wzVar3.animate().alpha(0.0f).setListener(new a60(this, 17)).setDuration(150L).start();
            }
            wzVar3.setTag(null);
            wzVar = wzVar3;
            z12 = false;
        }
        vl0Var.b(this.Q0, z12);
        wzVar.c.b(this.Q0, z12);
    }

    public final void R(boolean z10) {
        sj0 sj0Var;
        sj0 sj0Var2;
        sj0 sj0Var3;
        org.telegram.ui.ew ewVar;
        if (this.B0 == z10) {
            return;
        }
        org.telegram.ui.uw uwVar = this.M0;
        if (z10 && uwVar.getActionBar().v()) {
            return;
        }
        if (z10 && !uwVar.getActionBar().e("search_view_pager")) {
            this.I0 = uwVar.getActionBar().n("search_view_pager");
            if (uwVar.X) {
                ImageView imageView = new ImageView(getContext());
                this.z0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.z0.setImageDrawable(new org.telegram.ui.ActionBar.w1(true));
                org.telegram.ui.ActionBar.r6.t(this.z0, org.telegram.ui.ActionBar.k6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.z0;
                int i3 = org.telegram.ui.ActionBar.k6.z8;
                org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i3), null);
                this.z0.setOnClickListener(new ga0(this, 11));
                this.I0.addView(this.z0, b8.mf.p(54, 54, 0.0f, 16));
            }
            fm0 fm0Var = new fm0(this.I0.getContext());
            this.A0 = fm0Var;
            fm0Var.setTextSize(18);
            this.A0.setTypeface(org.telegram.messenger.g0.o());
            fm0 fm0Var2 = this.A0;
            int i10 = org.telegram.ui.ActionBar.k6.y8;
            lf0 lf0Var = new lf0(3);
            lf0 lf0Var2 = new lf0(4);
            int Q = org.telegram.ui.ActionBar.r6.Q(i10, -1, 0, 0.0f, null);
            lf0Var2.f(Q, fm0Var2);
            org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, fm0Var2);
            x10.c(i10, -1, 0, 0.0f, null);
            x10.n = lf0Var;
            x10.o = lf0Var2;
            x10.m = false;
            x10.g = Q;
            this.I0.addView(this.A0, b8.mf.m(1.0f, 0, -1, uwVar.X ? 18 : 72, 0, 0));
            this.A0.setOnTouchListener(new fi.a(21));
            org.telegram.ui.ActionBar.q0 h = this.I0.h(203, R.drawable.avd_speed, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131754801, null));
            this.E0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.r6.t(this.E0.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
            }
            this.F0 = this.I0.h(org.telegram.messenger.hs.e3, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131754877, null));
            this.G0 = this.I0.h(org.telegram.messenger.hs.f3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131750588, null));
            this.H0 = this.I0.h(org.telegram.messenger.hs.g3, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
        }
        if (this.A0 != null) {
            bm0 bm0Var = this.e0;
            ((ViewGroup.MarginLayoutParams) this.A0.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L((uwVar.X ? 18 : 72) + (bm0Var != null && (ewVar = bm0Var.V) != null && (ewVar.a() > 0L ? 1 : (ewVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            fm0 fm0Var3 = this.A0;
            fm0Var3.setLayoutParams(fm0Var3.getLayoutParams());
        }
        if (uwVar.getActionBar().getBackButton() != null && (uwVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
            org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
            uwVar.getActionBar().setBackButtonDrawable(w1Var);
            w1Var.setColorFilter(null);
        }
        this.B0 = z10;
        HashMap hashMap = this.C0;
        if (z10) {
            org.telegram.messenger.g0.v1(uwVar.getParentActivity().getCurrentFocus());
            uwVar.getActionBar().O(null, null);
            this.A0.a(hashMap.size(), false);
            this.E0.setVisibility(O() ? 0 : 8);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            this.H0.setVisibility(0);
            return;
        }
        uwVar.getActionBar().u();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.wz) && (sj0Var3 = ((org.telegram.ui.wz) getChildAt(i11)).d) != null) {
                sj0Var3.f();
            }
            if (getChildAt(i11) instanceof hl0) {
                ((hl0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.wz wzVar = this.P0;
        if (wzVar != null && (sj0Var2 = wzVar.d) != null) {
            sj0Var2.f();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.wz) && (sj0Var = ((org.telegram.ui.wz) view).d) != null) {
                sj0Var.f();
            }
        }
    }

    public final void S() {
        this.W.l();
        k(false);
        d61 d61Var = this.N;
        if (d61Var != null) {
            d61Var.y.f();
        }
    }

    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.a0;
            tj0 tj0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    tj0Var = this.b0;
                } else if (view == this.i0) {
                    tj0Var = this.l0;
                } else if (view == this.n0) {
                    tj0Var = this.q0;
                } else if (view == this.u0) {
                    tj0Var = this.x0;
                } else {
                    hl0 hl0Var = this.J0;
                    if (view == hl0Var) {
                        tj0Var = hl0Var.b;
                    } else {
                        bf0 bf0Var = this.s0;
                        if (view == bf0Var) {
                            tj0Var = bf0Var.c;
                        } else if (view instanceof org.telegram.ui.wz) {
                            tj0Var = ((org.telegram.ui.wz) view).b;
                        }
                    }
                }
            }
            if (tj0Var != null) {
                jh.d.a(tj0Var, canvas, rectF, tj0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.wz wzVar = this.P0;
                if (wzVar.getVisibility() == 0) {
                    org.telegram.ui.xs xsVar = wzVar.b;
                    jh.d.a(xsVar, canvas, rectF, xsVar, this);
                }
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f3;
        dm0 dm0Var = this.m0;
        if (i3 == i11) {
            this.j0.e(org.telegram.messenger.hp.s1(this.K0).L0(0L) != null, true);
            dm0Var.X();
            dm0Var.O(true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.y1 || i3 == org.telegram.messenger.hs.s) {
            dm0Var.X();
            dm0Var.O(true);
        } else {
            if (i3 == org.telegram.messenger.hs.V0) {
                this.r0.O(true);
                return;
            }
            if (i3 == org.telegram.messenger.hs.x5) {
                Object obj = objArr[0];
                zl0 zl0Var = this.y0;
                if (obj == zl0Var.T) {
                    zl0Var.O(true);
                }
            }
        }
    }

    public org.telegram.ui.ActionBar.x getActionMode() {
        return this.I0;
    }

    public ArrayList<kg.l0> getCurrentSearchFilters() {
        return this.D0;
    }

    public hl0 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override // org.telegram.ui.Components.n61
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.q0 getSpeedItem() {
        return this.E0;
    }

    public m61 getTabsView() {
        return this.N;
    }

    @Override // org.telegram.ui.vz
    public final void h() {
        R(true);
    }

    @Override // org.telegram.ui.vz
    public final boolean n(org.telegram.ui.pz pzVar) {
        return this.C0.containsKey(pzVar);
    }

    @Override // org.telegram.ui.vz
    public final void o(org.telegram.messenger.zi ziVar) {
        this.M0.presentFragment(M(this.K0, ziVar));
        R(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        za.p pVar = this.Z0;
        if (pVar != null) {
            pVar.a();
            this.Z0 = null;
        }
        za.p pVar2 = new za.p(org.telegram.messenger.hs.f(this.K0), this);
        pVar2.b(org.telegram.messenger.hs.f3);
        pVar2.b(org.telegram.messenger.hs.y1);
        pVar2.b(org.telegram.messenger.hs.s);
        pVar2.b(org.telegram.messenger.hs.V0);
        pVar2.b(org.telegram.messenger.hs.x5);
        this.Z0 = pVar2;
        this.h0 = true;
        dm0 dm0Var = this.m0;
        if (dm0Var != null) {
            dm0Var.O(false);
        }
        wl0 wl0Var = this.r0;
        if (wl0Var != null) {
            wl0Var.O(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = false;
        za.p pVar = this.Z0;
        if (pVar != null) {
            pVar.a();
            this.Z0 = null;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void q() {
        this.T0.L();
    }

    @Override // org.telegram.ui.Components.n61
    public final void r(View view, View view2, int i3, int i10) {
        bm0 bm0Var = this.e0;
        org.telegram.ui.wz wzVar = this.P0;
        if (i3 == 0) {
            if (wzVar.getVisibility() == 0) {
                wzVar.i(this.O0, false);
                bm0Var.B0 = null;
            } else {
                wzVar.i(null, false);
                org.telegram.ui.nz nzVar = this.O0;
                bm0Var.B0 = nzVar;
                if (nzVar != null) {
                    ((org.telegram.ui.du) nzVar).j(false, null, bm0Var.z0, bm0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.wz) {
            ((org.telegram.ui.wz) view).i(this.O0, i10 == 0 && wzVar.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.wz) {
            ((org.telegram.ui.wz) view2).i(null, false);
        } else {
            bm0Var.B0 = null;
            wzVar.i(null, false);
        }
    }

    public void setBlurredBackgroundDrawableFactory(eh.c cVar) {
        this.a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.nz nzVar) {
        this.O0 = nzVar;
    }

    public void setKeyboardHeight(int i3) {
        this.Q0 = i3;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.wz) {
                ((org.telegram.ui.wz) getChildAt(i10)).c.b(i3, z10);
            } else if (getChildAt(i10) == this.a0) {
                this.c0.b(i3, z10);
                this.P0.c.b(i3, z10);
            } else if (getChildAt(i10) instanceof hl0) {
                ((hl0) getChildAt(i10)).a.b(i3, z10);
            } else if (getChildAt(i10) == this.i0) {
                this.j0.b(i3, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void setPosition(int i3) {
        if (i3 < 0) {
            return;
        }
        super.setPosition(i3);
        this.h.clear();
        d61 d61Var = this.N;
        if (d61Var != null) {
            d61Var.f(1.0f, i3);
        }
        invalidate();
    }

    @Override // org.telegram.ui.vz
    public final void w(org.telegram.messenger.zi ziVar, View view, int i3) {
        boolean z10;
        org.telegram.ui.pz pzVar = new org.telegram.ui.pz(ziVar.f1(), org.telegram.messenger.zi.B0(ziVar.k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(pzVar)) {
            hashMap.remove(pzVar);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(pzVar, ziVar);
        }
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.A0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.q0 q0Var = this.F0;
            if (q0Var != null) {
                q0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.E0 != null) {
                boolean O = O();
                int i10 = O ? 0 : 8;
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.r6.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.k6.y8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
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
                    } else if (!((org.telegram.messenger.zi) hashMap.get((org.telegram.ui.pz) it.next())).Q) {
                        z10 = false;
                        break;
                    }
                }
                this.H0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(hashMap.containsKey(pzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(i3, hashMap.containsKey(pzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).f(hashMap.containsKey(pzVar), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).e(hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(pzVar), true);
        }
    }
}
