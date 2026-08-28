package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class hn0 extends n71 implements org.telegram.ui.e10, NotificationCenter.NotificationCenterDelegate, jg.a {
    public static final /* synthetic */ int T0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.z B0;
    public gm0 C0;
    public final int D0;
    public boolean E0;
    public final org.telegram.ui.dy F0;
    public String G0;
    public org.telegram.ui.w00 H0;
    public final org.telegram.ui.f10 I0;
    public int J0;
    public boolean K0;
    public final org.telegram.ui.ix L0;
    public final xu0 M0;
    public final int N0;
    public int O0;
    public final gn0 P;
    public final long P0;
    public final FrameLayout Q;
    public int Q0;
    public final gh.f1 R;
    public int R0;
    public final um0 S;
    public ig.a S0;
    public final f2.n T;
    public final an0 U;
    public final f2.m0 V;
    public final dk0 W;
    public boolean a0;
    public final FrameLayout b0;
    public final um0 c0;
    public final f2.m0 d0;
    public final wk0 e0;
    public final cn0 f0;
    public final FrameLayout g0;
    public final um0 h0;
    public final f2.m0 i0;
    public final wk0 j0;
    public final vm0 k0;
    public final kg0 l0;
    public boolean m0;
    public final FrameLayout n0;
    public final um0 o0;
    public final f2.m0 p0;
    public final wk0 q0;
    public final ym0 r0;
    public ImageView s0;
    public NumberTextView t0;
    public boolean u0;
    public final HashMap v0;
    public final ArrayList w0;
    public org.telegram.ui.ActionBar.w0 x0;
    public org.telegram.ui.ActionBar.w0 y0;
    public org.telegram.ui.ActionBar.w0 z0;

    public hn0(Context context, org.telegram.ui.dy dyVar, int i9, int i10, int i11, long j10, org.telegram.ui.ix ixVar) {
        super(context, null);
        this.m0 = false;
        this.v0 = new HashMap();
        this.w0 = new ArrayList();
        int i12 = UserConfig.selectedAccount;
        this.D0 = i12;
        this.O0 = 0;
        this.N0 = i11;
        this.P0 = j10;
        this.F0 = dyVar;
        this.L0 = ixVar;
        f2.n nVar = new f2.n();
        this.T = nVar;
        nVar.c = 150L;
        nVar.e = 350L;
        nVar.f = 0L;
        nVar.g = 0L;
        nVar.d = 0L;
        nVar.i = new OvershootInterpolator(1.1f);
        nVar.o = gr.h;
        org.telegram.ui.mx mxVar = (org.telegram.ui.mx) this;
        this.U = new an0(mxVar, context, dyVar, i9, i10, nVar, dyVar.B, dyVar, context);
        if (i10 == 15) {
            ArrayList R3 = dyVar.R3(i12, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < R3.size(); i13 = aa.d.g(((TLRPC.Dialog) R3.get(i13)).id, arrayList, i13, 1)) {
            }
            this.U.m0 = arrayList;
        }
        this.M0 = (xu0) dyVar.getFragmentView();
        gh.f1 f1Var = new gh.f1(mxVar, context, 21);
        this.R = f1Var;
        f1Var.setItemAnimator(this.T);
        f1Var.setPivotY(0.0f);
        f1Var.setClipToPadding(false);
        f1Var.setAdapter(this.U);
        f1Var.setVerticalScrollBarEnabled(true);
        f1Var.setInstantClick(true);
        f1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.m0 m0Var = new f2.m0(1, false);
        this.V = m0Var;
        f1Var.setLayoutManager(m0Var);
        f1Var.U1 = true;
        f1Var.V1 = 0;
        f1Var.setOnScrollListener(new wm0(mxVar, dyVar, 2));
        f1Var.C0(new ib0(mxVar, 23));
        org.telegram.ui.f10 f10Var = new org.telegram.ui.f10(this.F0);
        this.I0 = f10Var;
        gh.f1 f1Var2 = f10Var.b;
        f1Var2.setClipToPadding(false);
        f1Var2.j(new zm0(mxVar, 1));
        f1Var2.C0(new ib0(mxVar, 23));
        f10Var.setUiCallback(this);
        f10Var.setVisibility(8);
        f10Var.setChatPreviewDelegate(ixVar);
        e00 e00Var = new e00(context, null);
        e00Var.setViewType(1);
        um0 um0Var = new um0(mxVar, context, e00Var, 2);
        this.S = um0Var;
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.e.setVisibility(8);
        um0Var.setVisibility(8);
        um0Var.addView(e00Var, 0);
        um0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.addView(um0Var);
        frameLayout.addView(f1Var);
        frameLayout.addView(f10Var);
        f1Var.setEmptyView(um0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b0 = frameLayout2;
        bn0 bn0Var = new bn0(mxVar);
        bn0Var.m = false;
        bn0Var.C = false;
        gr grVar = gr.h;
        bn0Var.o(grVar);
        bn0Var.n(350L);
        wk0 wk0Var = new wk0(context, null);
        this.e0 = wk0Var;
        wk0Var.setItemAnimator(bn0Var);
        wk0Var.setPivotY(0.0f);
        wk0Var.setVerticalScrollBarEnabled(true);
        wk0Var.setInstantClick(true);
        wk0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.m0 m0Var2 = new f2.m0(1, false);
        this.d0 = m0Var2;
        wk0Var.setLayoutManager(m0Var2);
        wk0Var.U1 = true;
        wk0Var.V1 = 0;
        wk0Var.setClipToPadding(false);
        e00 e00Var2 = new e00(context, null);
        e00Var2.setViewType(1);
        um0 um0Var2 = new um0(mxVar, context, e00Var2, 3);
        this.c0 = um0Var2;
        um0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var2.e.setVisibility(8);
        um0Var2.setVisibility(8);
        um0Var2.addView(e00Var2, 0);
        um0Var2.e(true, false);
        frameLayout2.addView(um0Var2);
        frameLayout2.addView(wk0Var);
        wk0Var.setEmptyView(um0Var2);
        cn0 cn0Var = new cn0(mxVar, wk0Var, context, this.D0, i11, dyVar);
        this.f0 = cn0Var;
        wk0Var.setAdapter(cn0Var);
        wk0Var.setOnScrollListener(new wm0(mxVar, dyVar, 3));
        wk0Var.C0(new ib0(mxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.g0 = frameLayout3;
        tm0 tm0Var = new tm0(mxVar);
        tm0Var.m = false;
        tm0Var.C = false;
        tm0Var.o(grVar);
        tm0Var.n(350L);
        wk0 wk0Var2 = new wk0(context, null);
        this.j0 = wk0Var2;
        wk0Var2.setItemAnimator(tm0Var);
        wk0Var2.setPivotY(0.0f);
        wk0Var2.setClipToPadding(false);
        wk0Var2.setVerticalScrollBarEnabled(true);
        wk0Var2.setInstantClick(true);
        wk0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.m0 m0Var3 = new f2.m0(1, false);
        this.i0 = m0Var3;
        wk0Var2.setLayoutManager(m0Var3);
        wk0Var2.U1 = true;
        wk0Var2.V1 = 0;
        e00 e00Var3 = new e00(context, null);
        e00Var3.setViewType(1);
        um0 um0Var3 = new um0(mxVar, context, e00Var3, 0);
        this.h0 = um0Var3;
        um0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var3.e.setVisibility(8);
        um0Var3.setVisibility(8);
        um0Var3.addView(e00Var3, 0);
        um0Var3.e(true, false);
        frameLayout3.addView(um0Var3);
        frameLayout3.addView(wk0Var2);
        wk0Var2.setEmptyView(um0Var3);
        vm0 vm0Var = new vm0(mxVar, wk0Var2, context, this.D0, i11);
        this.k0 = vm0Var;
        wk0Var2.setAdapter(vm0Var);
        wk0Var2.setOnScrollListener(new wm0(mxVar, dyVar, 0));
        wk0Var2.C0(new ib0(mxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.n0 = frameLayout4;
        xm0 xm0Var = new xm0(mxVar);
        xm0Var.m = false;
        xm0Var.C = false;
        xm0Var.o(grVar);
        xm0Var.n(350L);
        wk0 wk0Var3 = new wk0(context, null);
        this.q0 = wk0Var3;
        wk0Var3.setItemAnimator(xm0Var);
        wk0Var3.setPivotY(0.0f);
        wk0Var3.setVerticalScrollBarEnabled(true);
        wk0Var3.setInstantClick(true);
        wk0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.m0 m0Var4 = new f2.m0(1, false);
        this.p0 = m0Var4;
        wk0Var3.setLayoutManager(m0Var4);
        wk0Var3.U1 = true;
        wk0Var3.V1 = 0;
        wk0Var3.setClipToPadding(false);
        e00 e00Var4 = new e00(context, null);
        e00Var4.setViewType(1);
        um0 um0Var4 = new um0(mxVar, context, e00Var4, 1);
        this.o0 = um0Var4;
        um0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var4.e.setVisibility(8);
        um0Var4.setVisibility(8);
        um0Var4.addView(e00Var4, 0);
        um0Var4.e(true, false);
        frameLayout4.addView(um0Var4);
        frameLayout4.addView(wk0Var3);
        wk0Var3.setEmptyView(um0Var4);
        ym0 ym0Var = new ym0(mxVar, wk0Var3, context, this.D0);
        this.r0 = ym0Var;
        wk0Var3.setAdapter(ym0Var);
        wk0Var3.setOnScrollListener(new wm0(mxVar, dyVar, 1));
        wk0Var3.C0(new ib0(mxVar, 23));
        this.W = new dk0(f1Var, true);
        kg0 kg0Var = new kg0(context, dyVar);
        this.l0 = kg0Var;
        i51 i51Var = kg0Var.c;
        i51Var.setClipToPadding(false);
        i51Var.j(new zm0(mxVar, 0));
        i51Var.C0(new ib0(mxVar, 23));
        gn0 gn0Var = new gn0(mxVar);
        this.P = gn0Var;
        setAdapter(gn0Var);
    }

    public static org.telegram.ui.qn K(MessageObject messageObject, int i9) {
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i9).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        return new org.telegram.ui.qn(bundle);
    }

    public static void P(FrameLayout frameLayout, wk0 wk0Var, int i9, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i9, 0, i10);
        if (z10) {
            wk0Var.o1(0, i9, 0, i10);
        } else {
            wk0Var.setPadding(0, i9, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wk0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i9;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void J() {
        if (this.m0) {
            int i9 = 0;
            this.m0 = false;
            R();
            c71 c71Var = this.I;
            if (c71Var != null && c71Var.getCurrentTabId() != 0) {
                this.I.d(0, 0);
            }
            an0 an0Var = this.U;
            if (an0Var != null) {
                String str = this.G0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.w0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((of.m0) arrayList.get(i10)).d == 7) {
                        i9 = 1;
                        break;
                    }
                    i10++;
                }
                an0Var.U(i9, str);
            }
        }
    }

    public final int L(int i9) {
        int i10 = 0;
        while (true) {
            gn0 gn0Var = this.P;
            ArrayList arrayList = gn0Var.a;
            ArrayList arrayList2 = gn0Var.a;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((fn0) arrayList2.get(i10)).a == 3 && ((fn0) arrayList2.get(i10)).b == i9) {
                return i10;
            }
            i10++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            gh.f1 f1Var = this.R;
            if (i9 >= f1Var.getChildCount()) {
                break;
            }
            View childAt = f1Var.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
            }
            i9++;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.f10) {
                arrayList.addAll(((org.telegram.ui.f10) getChildAt(i10)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) sparseArray.valueAt(i11);
            if (view instanceof org.telegram.ui.f10) {
                arrayList.addAll(((org.telegram.ui.f10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.f10 f10Var = this.I0;
        if (f10Var != null) {
            arrayList.addAll(f10Var.getThemeDescriptions());
        }
        um0 um0Var = this.S;
        arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.y6));
        arrayList.addAll(g7.h6.a(new s6(this, 7), org.telegram.ui.ActionBar.f6.y8));
    }

    public final boolean N() {
        int i9 = this.D0;
        if (!UserConfig.getInstance(i9).isPremium() && !MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.v0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i9, String str, boolean z10) {
        org.telegram.ui.f10 f10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        um0 um0Var = this.S;
        if (isEmpty) {
            um0Var.e.setVisibility(8);
        } else {
            um0Var.e.setVisibility(0);
            um0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        an0 an0Var = this.U;
        org.telegram.ui.ox oxVar = an0Var.Q;
        long a2 = oxVar != null ? oxVar.a() : 0L;
        long j11 = i9 == 0 ? 0L : a2;
        long j12 = 0;
        long j13 = 0;
        int i10 = 0;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.w0;
            if (i10 >= arrayList.size()) {
                break;
            }
            of.m0 m0Var = (of.m0) arrayList.get(i10);
            int i11 = m0Var.d;
            if (i11 == 4) {
                TLObject tLObject = m0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j10 = -((TLRPC.Chat) m0Var.f).id;
                }
                j11 = j10;
            } else if (i11 == 6) {
                of.k0 k0Var = m0Var.g;
                long j14 = k0Var.b;
                j13 = k0Var.c;
                j12 = j14;
            } else if (i11 == 7) {
                z15 = true;
            }
            i10++;
        }
        ym0 ym0Var = this.r0;
        ym0Var.getClass();
        if (o30.X(str, null) == null) {
            J();
        }
        if (view == this.b0) {
            MessagesController.getInstance(this.D0).getChannelRecommendations(0L);
            cn0 cn0Var = this.f0;
            wk0 wk0Var = cn0Var.d;
            ArrayList arrayList2 = cn0Var.M;
            ArrayList arrayList3 = cn0Var.N;
            ArrayList arrayList4 = cn0Var.O;
            ArrayList arrayList5 = cn0Var.L;
            np npVar = cn0Var.Y;
            cn0Var.W();
            if (!TextUtils.equals(str, cn0Var.X)) {
                cn0Var.X = str;
                AndroidUtilities.cancelRunOnUIThread(npVar);
                if (TextUtils.isEmpty(cn0Var.X)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    cn0Var.N(true);
                    cn0Var.W++;
                    z14 = false;
                    cn0Var.S = false;
                    cn0Var.T = false;
                    cn0Var.U = false;
                    cn0Var.V = 0;
                    if (wk0Var != null) {
                        wk0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(npVar, 1000L);
                    cn0Var.S = true;
                    cn0Var.T = true;
                    cn0Var.N(true);
                    if (wk0Var != null) {
                        z14 = false;
                        wk0Var.u0(0);
                    }
                }
                this.c0.b(this.J0, z14);
                return;
            }
            z14 = false;
            this.c0.b(this.J0, z14);
            return;
        }
        if (view == this.g0) {
            vm0 vm0Var = this.k0;
            wk0 wk0Var2 = vm0Var.d;
            ArrayList arrayList6 = vm0Var.P;
            ds dsVar = vm0Var.b0;
            if (TextUtils.equals(str, vm0Var.a0)) {
                z13 = false;
            } else {
                vm0Var.a0 = str;
                AndroidUtilities.cancelRunOnUIThread(dsVar);
                if (TextUtils.isEmpty(vm0Var.a0)) {
                    arrayList6.clear();
                    vm0Var.N(true);
                    vm0Var.Z++;
                    z13 = false;
                    vm0Var.V = false;
                    vm0Var.W = false;
                    vm0Var.X = false;
                    vm0Var.Y = 0;
                    if (wk0Var2 != null) {
                        wk0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(dsVar, 1000L);
                    vm0Var.V = true;
                    vm0Var.W = true;
                    vm0Var.N(true);
                    if (wk0Var2 != null) {
                        wk0Var2.u0(0);
                    }
                }
            }
            this.h0.b(this.J0, z13);
            if (TextUtils.isEmpty(str)) {
                vm0Var.V();
                return;
            }
            return;
        }
        kg0 kg0Var = this.l0;
        if (view == kg0Var) {
            i51 i51Var = kg0Var.c;
            ArrayList arrayList7 = kg0Var.n;
            if (TextUtils.equals(kg0Var.w, str)) {
                return;
            }
            if (kg0Var.G >= 0) {
                ConnectionsManager.getInstance(kg0Var.b).cancelRequest(kg0Var.G, true);
                kg0Var.G = -1;
            }
            kg0Var.v = false;
            kg0Var.D.setLoading(false);
            kg0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                kg0Var.r = 0;
                z12 = true;
                kg0Var.H++;
                kg0Var.s = false;
                arrayList7.clear();
                kg0Var.a(false);
            } else {
                z12 = true;
                kg0Var.b(str);
                kg0Var.r = 0;
                kg0Var.H++;
                kg0Var.s = false;
                arrayList7.clear();
            }
            kg0Var.d();
            i51Var.u0(0);
            i51Var.U2.N(z12);
            return;
        }
        if (view == this.n0) {
            if (o30.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.p0.h1(0, 0);
            }
            ym0Var.Y(str);
            this.o0.b(this.J0, false);
            return;
        }
        if (view != this.Q) {
            long j15 = a2;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.f10) {
                org.telegram.ui.f10 f10Var2 = (org.telegram.ui.f10) view;
                f10Var2.setUseFromUserAsAvatar(j15 != 0);
                f10Var2.c.b(this.J0, false);
                f10Var2.h(j11, this.P0, j16, j17, of.o0.Y2[((fn0) this.P.a.get(i9)).b], z15, str, z10);
                return;
            }
            if (view instanceof gm0) {
                gm0 gm0Var = (gm0) view;
                gm0Var.a.b(this.J0, false);
                gm0Var.G = str;
                gm0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.f10 f10Var3 = this.I0;
        if (!(j11 == 0 && this.P0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z16 = true;
            f10Var3.setTag(1);
            f10Var3.i(this.H0, false);
            f10Var3.animate().setListener(null).cancel();
            if (z10) {
                f10Var3.setVisibility(0);
                f10Var3.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (f10Var3.getVisibility() != 0) {
                    f10Var3.setVisibility(0);
                    f10Var3.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                f10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            f10Var = f10Var3;
            z11 = false;
            this.I0.h(j11, this.P0, j12, j13, null, z15, str, z16);
            um0Var.setVisibility(8);
        } else {
            this.E0 = false;
            an0Var.U(z15 ? 1 : 0, str);
            an0Var.w0 = this.H0;
            f10Var3.animate().setListener(null).cancel();
            f10Var3.i(null, false);
            if (z10) {
                um0Var.e(!(an0Var.z0 > 0), false);
                um0Var.e(an0Var.z0 > 0, false);
            } else if (!an0Var.N()) {
                um0Var.e(an0Var.z0 > 0, true);
            }
            if (z10) {
                f10Var3.setVisibility(8);
            } else if (f10Var3.getVisibility() != 8) {
                f10Var3.animate().alpha(0.0f).setListener(new r60(this, 16)).setDuration(150L).start();
            }
            f10Var3.setTag(null);
            f10Var = f10Var3;
            z11 = false;
        }
        um0Var.b(this.J0, z11);
        f10Var.c.b(this.J0, z11);
    }

    public final void Q(boolean z10) {
        vk0 vk0Var;
        vk0 vk0Var2;
        vk0 vk0Var3;
        org.telegram.ui.ox oxVar;
        if (this.u0 == z10) {
            return;
        }
        org.telegram.ui.dy dyVar = this.F0;
        if (z10 && dyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !dyVar.getActionBar().a("search_view_pager")) {
            this.B0 = dyVar.getActionBar().j("search_view_pager");
            if (dyVar.S) {
                ImageView imageView = new ImageView(getContext());
                this.s0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.s0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                this.s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.s0.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z8, false), 1, -1));
                this.s0.setOnClickListener(new h70(this, 14));
                this.B0.addView(this.s0, g7.e6.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.B0.getContext());
            this.t0 = numberTextView;
            numberTextView.setTextSize(18);
            this.t0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.t0;
            int i9 = org.telegram.ui.ActionBar.f6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            this.B0.addView(this.t0, g7.e6.m(1.0f, 0, -1, dyVar.S ? 18 : 72, 0, 0));
            this.t0.setOnTouchListener(new jh.d(21));
            org.telegram.ui.ActionBar.w0 h = this.B0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.x0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.SRC_IN));
            this.y0 = this.B0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.z0 = this.B0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.A0 = this.B0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.t0 != null) {
            an0 an0Var = this.U;
            ((ViewGroup.MarginLayoutParams) this.t0.getLayoutParams()).leftMargin = AndroidUtilities.dp((dyVar.S ? 18 : 72) + (an0Var != null && (oxVar = an0Var.Q) != null && (oxVar.a() > 0L ? 1 : (oxVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.t0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (dyVar.getActionBar().getBackButton() != null && (dyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            dyVar.getActionBar().setBackButtonDrawable(h2Var);
            h2Var.setColorFilter(null);
        }
        this.u0 = z10;
        HashMap hashMap = this.v0;
        if (z10) {
            AndroidUtilities.hideKeyboard(dyVar.getParentActivity().getCurrentFocus());
            dyVar.getActionBar().N(null, null);
            this.t0.a(hashMap.size(), false);
            this.x0.setVisibility(N() ? 0 : 8);
            this.y0.setVisibility(0);
            this.z0.setVisibility(0);
            this.A0.setVisibility(0);
            return;
        }
        dyVar.getActionBar().r();
        hashMap.clear();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof org.telegram.ui.f10) && (vk0Var3 = ((org.telegram.ui.f10) getChildAt(i10)).d) != null) {
                vk0Var3.l();
            }
            if (getChildAt(i10) instanceof gm0) {
                ((gm0) getChildAt(i10)).d(true);
            }
        }
        org.telegram.ui.f10 f10Var = this.I0;
        if (f10Var != null && (vk0Var2 = f10Var.d) != null) {
            vk0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) sparseArray.valueAt(i11);
            if ((view instanceof org.telegram.ui.f10) && (vk0Var = ((org.telegram.ui.f10) view).d) != null) {
                vk0Var.l();
            }
        }
    }

    public final void R() {
        this.P.i();
        o(false);
        c71 c71Var = this.I;
        if (c71Var != null) {
            c71Var.x.l();
        }
    }

    @Override // org.telegram.ui.e10
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.e10
    public final boolean b(org.telegram.ui.x00 x00Var) {
        return this.v0.containsKey(x00Var);
    }

    @Override // org.telegram.ui.e10
    public final void c(MessageObject messageObject) {
        this.F0.presentFragment(K(messageObject, this.D0));
        Q(false);
    }

    @Override // org.telegram.ui.e10
    public final void d(MessageObject messageObject, View view, int i9) {
        boolean z10;
        org.telegram.ui.x00 x00Var = new org.telegram.ui.x00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.v0;
        if (hashMap.containsKey(x00Var)) {
            hashMap.remove(x00Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(x00Var, messageObject);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.t0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.y0;
            if (w0Var != null) {
                w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.x0 != null) {
                boolean N = N();
                int i10 = N ? 0 : 8;
                if (this.x0.getVisibility() != i10) {
                    this.x0.setVisibility(i10);
                    int i11 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.x0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i11 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.A0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.x00) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.A0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(x00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).b(i9, hashMap.containsKey(x00Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).f(hashMap.containsKey(x00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(x00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(x00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).U(hashMap.containsKey(x00Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.channelRecommendationsLoaded;
        cn0 cn0Var = this.f0;
        if (i9 == i11) {
            this.c0.e(MessagesController.getInstance(this.D0).getChannelRecommendations(0L) != null, true);
            cn0Var.W();
            cn0Var.N(true);
            return;
        }
        if (i9 == NotificationCenter.dialogDeleted || i9 == NotificationCenter.dialogsNeedReload) {
            cn0Var.W();
            cn0Var.N(true);
        } else {
            if (i9 == NotificationCenter.reloadWebappsHints) {
                this.k0.N(true);
                return;
            }
            if (i9 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                ym0 ym0Var = this.r0;
                if (obj == ym0Var.M) {
                    ym0Var.N(true);
                }
            }
        }
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.Q;
            wk0 wk0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    wk0Var = this.R;
                } else if (view == this.b0) {
                    wk0Var = this.e0;
                } else if (view == this.g0) {
                    wk0Var = this.j0;
                } else if (view == this.n0) {
                    wk0Var = this.q0;
                } else {
                    gm0 gm0Var = this.C0;
                    if (view == gm0Var) {
                        wk0Var = gm0Var.b;
                    } else {
                        kg0 kg0Var = this.l0;
                        if (view == kg0Var) {
                            wk0Var = kg0Var.c;
                        } else if (view instanceof org.telegram.ui.f10) {
                            wk0Var = ((org.telegram.ui.f10) view).b;
                        }
                    }
                }
            }
            if (wk0Var != null) {
                og.d.b(wk0Var, canvas, rectF, wk0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.f10 f10Var = this.I0;
                if (f10Var.getVisibility() == 0) {
                    gh.f1 f1Var = f10Var.b;
                    og.d.b(f1Var, canvas, rectF, f1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.e10
    public final boolean f() {
        return this.u0;
    }

    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.B0;
    }

    public ArrayList<of.m0> getCurrentSearchFilters() {
        return this.w0;
    }

    public gm0 getDownloadsContainer() {
        return this.C0;
    }

    public int getFolderId() {
        return this.N0;
    }

    @Override // org.telegram.ui.Components.n71
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.x0;
    }

    public m71 getTabsView() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.D0;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesListUpdated);
        this.a0 = true;
        cn0 cn0Var = this.f0;
        if (cn0Var != null) {
            cn0Var.N(false);
        }
        vm0 vm0Var = this.k0;
        if (vm0Var != null) {
            vm0Var.N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a0 = false;
        int i9 = this.D0;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.n71
    public final void s() {
        this.M0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ig.a aVar) {
        this.S0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.w00 w00Var) {
        this.H0 = w00Var;
    }

    public void setKeyboardHeight(int i9) {
        this.J0 = i9;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.f10) {
                ((org.telegram.ui.f10) getChildAt(i10)).c.b(i9, z10);
            } else if (getChildAt(i10) == this.Q) {
                this.S.b(i9, z10);
                this.I0.c.b(i9, z10);
            } else if (getChildAt(i10) instanceof gm0) {
                ((gm0) getChildAt(i10)).a.b(i9, z10);
            } else if (getChildAt(i10) == this.b0) {
                this.c0.b(i9, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void setPosition(int i9) {
        if (i9 < 0) {
            return;
        }
        super.setPosition(i9);
        this.h.clear();
        c71 c71Var = this.I;
        if (c71Var != null) {
            c71Var.f(1.0f, i9);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.n71
    public final void t(View view, View view2, int i9, int i10) {
        an0 an0Var = this.U;
        org.telegram.ui.f10 f10Var = this.I0;
        if (i9 == 0) {
            if (f10Var.getVisibility() == 0) {
                f10Var.i(this.H0, false);
                an0Var.w0 = null;
            } else {
                f10Var.i(null, false);
                org.telegram.ui.w00 w00Var = this.H0;
                an0Var.w0 = w00Var;
                if (w00Var != null) {
                    ((org.telegram.ui.jv) w00Var).i(false, null, an0Var.u0, an0Var.v0);
                }
            }
        } else if (view instanceof org.telegram.ui.f10) {
            ((org.telegram.ui.f10) view).i(this.H0, i10 == 0 && f10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.f10) {
            ((org.telegram.ui.f10) view2).i(null, false);
        } else {
            an0Var.w0 = null;
            f10Var.i(null, false);
        }
    }
}
