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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class lo0 extends w81 implements org.telegram.ui.s10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final /* synthetic */ int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public in0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.qy J0;
    public String K0;
    public org.telegram.ui.k10 L0;
    public final org.telegram.ui.t10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.vx P0;
    public final aw0 Q0;
    public final int R0;
    public int S0;
    public final ko0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final yn0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j a0;
    public final eo0 b0;
    public final s4.c0 c0;
    public final bl0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final yn0 g0;
    public final s4.c0 h0;
    public final wl0 i0;
    public final go0 j0;
    public final FrameLayout k0;
    public final yn0 l0;
    public final s4.c0 m0;
    public final wl0 n0;
    public final zn0 o0;
    public final jh0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final yn0 s0;
    public final s4.c0 t0;
    public final wl0 u0;
    public final co0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public lo0(Context context, org.telegram.ui.qy qyVar, int i10, int i11, int i12, long j3, org.telegram.ui.vx vxVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = qyVar;
        this.P0 = vxVar;
        s4.j jVar = new s4.j();
        this.a0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = rr.h;
        org.telegram.ui.zx zxVar = (org.telegram.ui.zx) this;
        this.b0 = new eo0(zxVar, context, qyVar, i10, i11, jVar, qyVar.F, qyVar, context);
        if (i11 == 15) {
            ArrayList R3 = qyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (aw0) qyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(zxVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        w0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var = new s4.c0(1, false);
        this.c0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new ao0(zxVar, qyVar, 2));
        w0Var.C0(new ic0(zxVar, 24));
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(this.J0);
        this.M0 = t10Var;
        ai.w0 w0Var2 = t10Var.b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new do0(zxVar, 1));
        w0Var2.C0(new ic0(zxVar, 24));
        t10Var.setUiCallback(this);
        t10Var.setVisibility(8);
        t10Var.setChatPreviewDelegate(vxVar);
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(1);
        yn0 yn0Var = new yn0(zxVar, context, u00Var, 2);
        this.W = yn0Var;
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
        yn0Var.setVisibility(8);
        yn0Var.addView(u00Var, 0);
        yn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(yn0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(t10Var);
        w0Var.setEmptyView(yn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        fo0 fo0Var = new fo0(zxVar);
        fo0Var.m = false;
        fo0Var.C = false;
        rr rrVar = rr.h;
        fo0Var.o(rrVar);
        fo0Var.n(350L);
        wl0 wl0Var = new wl0(context, null);
        this.i0 = wl0Var;
        wl0Var.setItemAnimator(fo0Var);
        wl0Var.setPivotY(0.0f);
        wl0Var.setVerticalScrollBarEnabled(true);
        wl0Var.setInstantClick(true);
        wl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.h0 = c0Var2;
        wl0Var.setLayoutManager(c0Var2);
        wl0Var.Y1 = true;
        wl0Var.Z1 = 0;
        wl0Var.setClipToPadding(false);
        u00 u00Var2 = new u00(context, null);
        u00Var2.setViewType(1);
        yn0 yn0Var2 = new yn0(zxVar, context, u00Var2, 3);
        this.g0 = yn0Var2;
        yn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var2.e.setVisibility(8);
        yn0Var2.setVisibility(8);
        yn0Var2.addView(u00Var2, 0);
        yn0Var2.e(true, false);
        frameLayout2.addView(yn0Var2);
        frameLayout2.addView(wl0Var);
        wl0Var.setEmptyView(yn0Var2);
        go0 go0Var = new go0(zxVar, wl0Var, context, this.H0, i12, qyVar);
        this.j0 = go0Var;
        wl0Var.setAdapter(go0Var);
        wl0Var.setOnScrollListener(new ao0(zxVar, qyVar, 3));
        wl0Var.C0(new ic0(zxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        xn0 xn0Var = new xn0(zxVar);
        xn0Var.m = false;
        xn0Var.C = false;
        xn0Var.o(rrVar);
        xn0Var.n(350L);
        wl0 wl0Var2 = new wl0(context, null);
        this.n0 = wl0Var2;
        wl0Var2.setItemAnimator(xn0Var);
        wl0Var2.setPivotY(0.0f);
        wl0Var2.setClipToPadding(false);
        wl0Var2.setVerticalScrollBarEnabled(true);
        wl0Var2.setInstantClick(true);
        wl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        wl0Var2.setLayoutManager(c0Var3);
        wl0Var2.Y1 = true;
        wl0Var2.Z1 = 0;
        u00 u00Var3 = new u00(context, null);
        u00Var3.setViewType(1);
        yn0 yn0Var3 = new yn0(zxVar, context, u00Var3, 0);
        this.l0 = yn0Var3;
        yn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var3.e.setVisibility(8);
        yn0Var3.setVisibility(8);
        yn0Var3.addView(u00Var3, 0);
        yn0Var3.e(true, false);
        frameLayout3.addView(yn0Var3);
        frameLayout3.addView(wl0Var2);
        wl0Var2.setEmptyView(yn0Var3);
        zn0 zn0Var = new zn0(zxVar, wl0Var2, context, this.H0, i12);
        this.o0 = zn0Var;
        wl0Var2.setAdapter(zn0Var);
        wl0Var2.setOnScrollListener(new ao0(zxVar, qyVar, 0));
        wl0Var2.C0(new ic0(zxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        bo0 bo0Var = new bo0(zxVar);
        bo0Var.m = false;
        bo0Var.C = false;
        bo0Var.o(rrVar);
        bo0Var.n(350L);
        wl0 wl0Var3 = new wl0(context, null);
        this.u0 = wl0Var3;
        wl0Var3.setItemAnimator(bo0Var);
        wl0Var3.setPivotY(0.0f);
        wl0Var3.setVerticalScrollBarEnabled(true);
        wl0Var3.setInstantClick(true);
        wl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.t0 = c0Var4;
        wl0Var3.setLayoutManager(c0Var4);
        wl0Var3.Y1 = true;
        wl0Var3.Z1 = 0;
        wl0Var3.setClipToPadding(false);
        u00 u00Var4 = new u00(context, null);
        u00Var4.setViewType(1);
        yn0 yn0Var4 = new yn0(zxVar, context, u00Var4, 1);
        this.s0 = yn0Var4;
        yn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var4.e.setVisibility(8);
        yn0Var4.setVisibility(8);
        yn0Var4.addView(u00Var4, 0);
        yn0Var4.e(true, false);
        frameLayout4.addView(yn0Var4);
        frameLayout4.addView(wl0Var3);
        wl0Var3.setEmptyView(yn0Var4);
        co0 co0Var = new co0(zxVar, wl0Var3, context, this.H0);
        this.v0 = co0Var;
        wl0Var3.setAdapter(co0Var);
        wl0Var3.setOnScrollListener(new ao0(zxVar, qyVar, 1));
        wl0Var3.C0(new ic0(zxVar, 24));
        this.d0 = new bl0(w0Var, true);
        jh0 jh0Var = new jh0(context, qyVar);
        this.p0 = jh0Var;
        r61 r61Var = jh0Var.c;
        r61Var.setClipToPadding(false);
        r61Var.j(new do0(zxVar, 0));
        r61Var.C0(new ic0(zxVar, 24));
        ko0 ko0Var = new ko0(zxVar);
        this.T = ko0Var;
        setAdapter(ko0Var);
    }

    public static org.telegram.ui.wn K(MessageObject messageObject, int i10) {
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        return new org.telegram.ui.wn(bundle);
    }

    public static void P(FrameLayout frameLayout, wl0 wl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            wl0Var.o1(0, i10, 0, i11);
        } else {
            wl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.q0) {
            int i10 = 0;
            this.q0 = false;
            R();
            l81 l81Var = this.M;
            if (l81Var != null && l81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            eo0 eo0Var = this.b0;
            if (eo0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((gg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                eo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            ko0 ko0Var = this.T;
            ArrayList arrayList = ko0Var.a;
            ArrayList arrayList2 = ko0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((jo0) arrayList2.get(i11)).a == 3 && ((jo0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.V;
            if (i10 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                arrayList.addAll(((org.telegram.ui.t10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.t10) {
                arrayList.addAll(((org.telegram.ui.t10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.t10 t10Var = this.M0;
        if (t10Var != null) {
            arrayList.addAll(t10Var.getThemeDescriptions());
        }
        yn0 yn0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(yn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(yn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.y6));
        arrayList.addAll(w7.b6.a(new y6(this, 7), org.telegram.ui.ActionBar.h6.y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.z0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z10) {
        org.telegram.ui.t10 t10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        yn0 yn0Var = this.W;
        if (isEmpty) {
            yn0Var.e.setVisibility(8);
        } else {
            yn0Var.e.setVisibility(0);
            yn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        eo0 eo0Var = this.b0;
        org.telegram.ui.cy cyVar = eo0Var.U;
        long a2 = cyVar != null ? cyVar.a() : 0L;
        long j10 = i10 == 0 ? 0L : a2;
        long j11 = 0;
        long j12 = 0;
        int i11 = 0;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.q0 q0Var = (gg.q0) arrayList.get(i11);
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j3 = -((TLRPC.Chat) q0Var.f).id;
                }
                j10 = j3;
            } else if (i12 == 6) {
                gg.o0 o0Var = q0Var.g;
                long j13 = o0Var.b;
                j12 = o0Var.c;
                j11 = j13;
            } else if (i12 == 7) {
                z15 = true;
            }
            i11++;
        }
        co0 co0Var = this.v0;
        co0Var.getClass();
        if (f40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            go0 go0Var = this.j0;
            wl0 wl0Var = go0Var.d;
            ArrayList arrayList2 = go0Var.Q;
            ArrayList arrayList3 = go0Var.R;
            ArrayList arrayList4 = go0Var.S;
            ArrayList arrayList5 = go0Var.P;
            yp ypVar = go0Var.c0;
            go0Var.W();
            if (!TextUtils.equals(str, go0Var.b0)) {
                go0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(ypVar);
                if (TextUtils.isEmpty(go0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    go0Var.N(true);
                    go0Var.a0++;
                    z14 = false;
                    go0Var.W = false;
                    go0Var.X = false;
                    go0Var.Y = false;
                    go0Var.Z = 0;
                    if (wl0Var != null) {
                        wl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(ypVar, 1000L);
                    go0Var.W = true;
                    go0Var.X = true;
                    go0Var.N(true);
                    if (wl0Var != null) {
                        z14 = false;
                        wl0Var.u0(0);
                    }
                }
                this.g0.b(this.N0, z14);
                return;
            }
            z14 = false;
            this.g0.b(this.N0, z14);
            return;
        }
        if (view == this.k0) {
            zn0 zn0Var = this.o0;
            wl0 wl0Var2 = zn0Var.d;
            ArrayList arrayList6 = zn0Var.T;
            ns nsVar = zn0Var.f0;
            if (TextUtils.equals(str, zn0Var.e0)) {
                z13 = false;
            } else {
                zn0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(nsVar);
                if (TextUtils.isEmpty(zn0Var.e0)) {
                    arrayList6.clear();
                    zn0Var.N(true);
                    zn0Var.d0++;
                    z13 = false;
                    zn0Var.Z = false;
                    zn0Var.a0 = false;
                    zn0Var.b0 = false;
                    zn0Var.c0 = 0;
                    if (wl0Var2 != null) {
                        wl0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(nsVar, 1000L);
                    zn0Var.Z = true;
                    zn0Var.a0 = true;
                    zn0Var.N(true);
                    if (wl0Var2 != null) {
                        wl0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z13);
            if (TextUtils.isEmpty(str)) {
                zn0Var.V();
                return;
            }
            return;
        }
        jh0 jh0Var = this.p0;
        if (view == jh0Var) {
            r61 r61Var = jh0Var.c;
            ArrayList arrayList7 = jh0Var.n;
            if (TextUtils.equals(jh0Var.w, str)) {
                return;
            }
            if (jh0Var.K >= 0) {
                ConnectionsManager.getInstance(jh0Var.b).cancelRequest(jh0Var.K, true);
                jh0Var.K = -1;
            }
            jh0Var.v = false;
            jh0Var.H.setLoading(false);
            jh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                jh0Var.r = 0;
                z12 = true;
                jh0Var.L++;
                jh0Var.s = false;
                arrayList7.clear();
                jh0Var.a(false);
            } else {
                z12 = true;
                jh0Var.b(str);
                jh0Var.r = 0;
                jh0Var.L++;
                jh0Var.s = false;
                arrayList7.clear();
            }
            jh0Var.d();
            r61Var.u0(0);
            r61Var.Y2.N(z12);
            return;
        }
        if (view == this.r0) {
            if (f40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            co0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j14 = a2;
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.t10) {
                org.telegram.ui.t10 t10Var2 = (org.telegram.ui.t10) view;
                t10Var2.setUseFromUserAsAvatar(j14 != 0);
                t10Var2.c.b(this.N0, false);
                t10Var2.h(j10, this.T0, j15, j16, gg.s0.c3[((jo0) this.T.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof in0) {
                in0 in0Var = (in0) view;
                in0Var.a.b(this.N0, false);
                in0Var.K = str;
                in0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.t10 t10Var3 = this.M0;
        if (!(j10 == 0 && this.T0 == 0 && j11 == 0 && j12 == 0) && a2 == 0) {
            boolean z16 = true;
            t10Var3.setTag(1);
            t10Var3.i(this.L0, false);
            t10Var3.animate().setListener(null).cancel();
            if (z10) {
                t10Var3.setVisibility(0);
                t10Var3.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (t10Var3.getVisibility() != 0) {
                    t10Var3.setVisibility(0);
                    t10Var3.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                t10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            t10Var = t10Var3;
            z11 = false;
            this.M0.h(j10, this.T0, j11, j12, null, z15, str, z16);
            yn0Var.setVisibility(8);
        } else {
            this.I0 = false;
            eo0Var.U(z15 ? 1 : 0, str);
            eo0Var.A0 = this.L0;
            t10Var3.animate().setListener(null).cancel();
            t10Var3.i(null, false);
            if (z10) {
                yn0Var.e(!(eo0Var.D0 > 0), false);
                yn0Var.e(eo0Var.D0 > 0, false);
            } else if (!eo0Var.N()) {
                yn0Var.e(eo0Var.D0 > 0, true);
            }
            if (z10) {
                t10Var3.setVisibility(8);
            } else if (t10Var3.getVisibility() != 8) {
                t10Var3.animate().alpha(0.0f).setListener(new fd0(this, 11)).setDuration(150L).start();
            }
            t10Var3.setTag(null);
            t10Var = t10Var3;
            z11 = false;
        }
        yn0Var.b(this.N0, z11);
        t10Var.c.b(this.N0, z11);
    }

    public final void Q(boolean z10) {
        vl0 vl0Var;
        vl0 vl0Var2;
        vl0 vl0Var3;
        org.telegram.ui.cy cyVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.qy qyVar = this.J0;
        if (z10 && qyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !qyVar.getActionBar().a("search_view_pager")) {
            this.F0 = qyVar.getActionBar().j("search_view_pager");
            if (qyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.z8, false), 1, -1));
                this.w0.setOnClickListener(new i80(this, 14));
                this.F0.addView(this.w0, w7.y5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.h6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            this.F0.addView(this.x0, w7.y5.m(1.0f, 0, -1, qyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new bi.d(21));
            org.telegram.ui.ActionBar.u0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            eo0 eo0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((qyVar.W ? 18 : 72) + (eo0Var != null && (cyVar = eo0Var.U) != null && (cyVar.a() > 0L ? 1 : (cyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (qyVar.getActionBar().getBackButton() != null && (qyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            qyVar.getActionBar().setBackButtonDrawable(f2Var);
            f2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
            qyVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        qyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.t10) && (vl0Var3 = ((org.telegram.ui.t10) getChildAt(i11)).d) != null) {
                vl0Var3.l();
            }
            if (getChildAt(i11) instanceof in0) {
                ((in0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.t10 t10Var = this.M0;
        if (t10Var != null && (vl0Var2 = t10Var.d) != null) {
            vl0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.t10) && (vl0Var = ((org.telegram.ui.t10) view).d) != null) {
                vl0Var.l();
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        l81 l81Var = this.M;
        if (l81Var != null) {
            l81Var.x.l();
        }
    }

    @Override // org.telegram.ui.s10
    public final void a() {
        Q(true);
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // org.telegram.ui.s10
    public final boolean c(org.telegram.ui.l10 l10Var) {
        return this.z0.containsKey(l10Var);
    }

    @Override // org.telegram.ui.s10
    public final void d(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        go0 go0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            go0Var.W();
            go0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            go0Var.W();
            go0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                co0 co0Var = this.v0;
                if (obj == co0Var.Q) {
                    co0Var.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.s10
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(l10Var)) {
            hashMap.remove(l10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(l10Var, messageObject);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.x0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.u0 u0Var = this.C0;
            if (u0Var != null) {
                u0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.B0 != null) {
                boolean N = N();
                int i11 = N ? 0 : 8;
                if (this.B0.getVisibility() != i11) {
                    this.B0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i12 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.E0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.l10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(l10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(l10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(l10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(l10Var), true);
        }
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.U;
            wl0 wl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    wl0Var = this.V;
                } else if (view == this.f0) {
                    wl0Var = this.i0;
                } else if (view == this.k0) {
                    wl0Var = this.n0;
                } else if (view == this.r0) {
                    wl0Var = this.u0;
                } else {
                    in0 in0Var = this.G0;
                    if (view == in0Var) {
                        wl0Var = in0Var.b;
                    } else {
                        jh0 jh0Var = this.p0;
                        if (view == jh0Var) {
                            wl0Var = jh0Var.c;
                        } else if (view instanceof org.telegram.ui.t10) {
                            wl0Var = ((org.telegram.ui.t10) view).b;
                        }
                    }
                }
            }
            if (wl0Var != null) {
                gh.d.a(wl0Var, canvas, rectF, wl0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.t10 t10Var = this.M0;
                if (t10Var.getVisibility() == 0) {
                    ai.w0 w0Var = t10Var.b;
                    gh.d.a(w0Var, canvas, rectF, w0Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.s10
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public in0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.w81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.u0 getSpeedItem() {
        return this.B0;
    }

    public v81 getTabsView() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.W0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.W0 = null;
        }
        this.W0 = NotificationCenter.getInstance(this.H0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.e0 = true;
        go0 go0Var = this.j0;
        if (go0Var != null) {
            go0Var.N(false);
        }
        zn0 zn0Var = this.o0;
        if (zn0Var != null) {
            zn0Var.N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.W0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.W0 = null;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.X0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.k10 k10Var) {
        this.L0 = k10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                ((org.telegram.ui.t10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof in0) {
                ((in0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        l81 l81Var = this.M;
        if (l81Var != null) {
            l81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.w81
    public final void t(View view, View view2, int i10, int i11) {
        eo0 eo0Var = this.b0;
        org.telegram.ui.t10 t10Var = this.M0;
        if (i10 == 0) {
            if (t10Var.getVisibility() == 0) {
                t10Var.i(this.L0, false);
                eo0Var.A0 = null;
            } else {
                t10Var.i(null, false);
                org.telegram.ui.k10 k10Var = this.L0;
                eo0Var.A0 = k10Var;
                if (k10Var != null) {
                    ((org.telegram.ui.sv) k10Var).i(false, null, eo0Var.y0, eo0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.t10) {
            ((org.telegram.ui.t10) view).i(this.L0, i11 == 0 && t10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.t10) {
            ((org.telegram.ui.t10) view2).i(null, false);
        } else {
            eo0Var.A0 = null;
            t10Var.i(null, false);
        }
    }
}
