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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class lo0 extends x81 implements org.telegram.ui.w10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final /* synthetic */ int Z0 = 0;
    public final HashMap A0;
    public final ArrayList B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.v0 F0;
    public org.telegram.ui.ActionBar.z G0;
    public jn0 H0;
    public final int I0;
    public boolean J0;
    public final org.telegram.ui.uy K0;
    public String L0;
    public org.telegram.ui.o10 M0;
    public final org.telegram.ui.x10 N0;
    public int O0;
    public boolean P0;
    public final org.telegram.ui.zx Q0;
    public final bw0 R0;
    public final int S0;
    public int T0;
    public final ko0 U;
    public final long U0;
    public final FrameLayout V;
    public int V0;
    public final ai.w0 W;
    public int W0;
    public NotificationCenter.ObserversGroup X0;
    public ah.c Y0;
    public final yn0 a0;
    public final s4.j b0;
    public final eo0 c0;
    public final s4.c0 d0;
    public final bl0 e0;
    public boolean f0;
    public final FrameLayout g0;
    public final yn0 h0;
    public final s4.c0 i0;
    public final wl0 j0;
    public final go0 k0;
    public final FrameLayout l0;
    public final yn0 m0;
    public final s4.c0 n0;
    public final wl0 o0;
    public final zn0 p0;
    public final jh0 q0;
    public boolean r0;
    public final FrameLayout s0;
    public final yn0 t0;
    public final s4.c0 u0;
    public final wl0 v0;
    public final co0 w0;
    public ImageView x0;
    public NumberTextView y0;
    public boolean z0;

    public lo0(Context context, org.telegram.ui.uy uyVar, int i10, int i11, int i12, long j3, org.telegram.ui.zx zxVar) {
        super(context, null);
        this.r0 = false;
        this.A0 = new HashMap();
        this.B0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.I0 = i13;
        this.T0 = 0;
        this.S0 = i12;
        this.U0 = j3;
        this.K0 = uyVar;
        this.Q0 = zxVar;
        s4.j jVar = new s4.j();
        this.b0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = qr.h;
        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this;
        this.c0 = new eo0(eyVar, context, uyVar, i10, i11, jVar, uyVar.F, uyVar, context);
        if (i11 == 15) {
            ArrayList R3 = uyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.c0.q0 = arrayList;
        }
        this.R0 = (bw0) uyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(eyVar, context, 21);
        this.W = w0Var;
        w0Var.setItemAnimator(this.b0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.c0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        w0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new ao0(eyVar, uyVar, 2));
        w0Var.D0(new kc0(eyVar, 23));
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(this.K0);
        this.N0 = x10Var;
        ai.w0 w0Var2 = x10Var.b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new do0(eyVar, 1));
        w0Var2.D0(new kc0(eyVar, 23));
        x10Var.setUiCallback(this);
        x10Var.setVisibility(8);
        x10Var.setChatPreviewDelegate(zxVar);
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(1);
        yn0 yn0Var = new yn0(eyVar, context, t00Var, 2);
        this.a0 = yn0Var;
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
        yn0Var.setVisibility(8);
        yn0Var.addView(t00Var, 0);
        yn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.addView(yn0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(x10Var);
        w0Var.setEmptyView(yn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g0 = frameLayout2;
        fo0 fo0Var = new fo0(eyVar);
        fo0Var.m = false;
        fo0Var.C = false;
        qr qrVar = qr.h;
        fo0Var.o(qrVar);
        fo0Var.n(350L);
        wl0 wl0Var = new wl0(context, null);
        this.j0 = wl0Var;
        wl0Var.setItemAnimator(fo0Var);
        wl0Var.setPivotY(0.0f);
        wl0Var.setVerticalScrollBarEnabled(true);
        wl0Var.setInstantClick(true);
        wl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.i0 = c0Var2;
        wl0Var.setLayoutManager(c0Var2);
        wl0Var.Y1 = true;
        wl0Var.Z1 = 0;
        wl0Var.setClipToPadding(false);
        t00 t00Var2 = new t00(context, null);
        t00Var2.setViewType(1);
        yn0 yn0Var2 = new yn0(eyVar, context, t00Var2, 3);
        this.h0 = yn0Var2;
        yn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var2.e.setVisibility(8);
        yn0Var2.setVisibility(8);
        yn0Var2.addView(t00Var2, 0);
        yn0Var2.e(true, false);
        frameLayout2.addView(yn0Var2);
        frameLayout2.addView(wl0Var);
        wl0Var.setEmptyView(yn0Var2);
        go0 go0Var = new go0(eyVar, wl0Var, context, this.I0, i12, uyVar);
        this.k0 = go0Var;
        wl0Var.setAdapter(go0Var);
        wl0Var.setOnScrollListener(new ao0(eyVar, uyVar, 3));
        wl0Var.D0(new kc0(eyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.l0 = frameLayout3;
        xn0 xn0Var = new xn0(eyVar);
        xn0Var.m = false;
        xn0Var.C = false;
        xn0Var.o(qrVar);
        xn0Var.n(350L);
        wl0 wl0Var2 = new wl0(context, null);
        this.o0 = wl0Var2;
        wl0Var2.setItemAnimator(xn0Var);
        wl0Var2.setPivotY(0.0f);
        wl0Var2.setClipToPadding(false);
        wl0Var2.setVerticalScrollBarEnabled(true);
        wl0Var2.setInstantClick(true);
        wl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.n0 = c0Var3;
        wl0Var2.setLayoutManager(c0Var3);
        wl0Var2.Y1 = true;
        wl0Var2.Z1 = 0;
        t00 t00Var3 = new t00(context, null);
        t00Var3.setViewType(1);
        yn0 yn0Var3 = new yn0(eyVar, context, t00Var3, 0);
        this.m0 = yn0Var3;
        yn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var3.e.setVisibility(8);
        yn0Var3.setVisibility(8);
        yn0Var3.addView(t00Var3, 0);
        yn0Var3.e(true, false);
        frameLayout3.addView(yn0Var3);
        frameLayout3.addView(wl0Var2);
        wl0Var2.setEmptyView(yn0Var3);
        zn0 zn0Var = new zn0(eyVar, wl0Var2, context, this.I0, i12);
        this.p0 = zn0Var;
        wl0Var2.setAdapter(zn0Var);
        wl0Var2.setOnScrollListener(new ao0(eyVar, uyVar, 0));
        wl0Var2.D0(new kc0(eyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.s0 = frameLayout4;
        bo0 bo0Var = new bo0(eyVar);
        bo0Var.m = false;
        bo0Var.C = false;
        bo0Var.o(qrVar);
        bo0Var.n(350L);
        wl0 wl0Var3 = new wl0(context, null);
        this.v0 = wl0Var3;
        wl0Var3.setItemAnimator(bo0Var);
        wl0Var3.setPivotY(0.0f);
        wl0Var3.setVerticalScrollBarEnabled(true);
        wl0Var3.setInstantClick(true);
        wl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.u0 = c0Var4;
        wl0Var3.setLayoutManager(c0Var4);
        wl0Var3.Y1 = true;
        wl0Var3.Z1 = 0;
        wl0Var3.setClipToPadding(false);
        t00 t00Var4 = new t00(context, null);
        t00Var4.setViewType(1);
        yn0 yn0Var4 = new yn0(eyVar, context, t00Var4, 1);
        this.t0 = yn0Var4;
        yn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var4.e.setVisibility(8);
        yn0Var4.setVisibility(8);
        yn0Var4.addView(t00Var4, 0);
        yn0Var4.e(true, false);
        frameLayout4.addView(yn0Var4);
        frameLayout4.addView(wl0Var3);
        wl0Var3.setEmptyView(yn0Var4);
        co0 co0Var = new co0(eyVar, wl0Var3, context, this.I0);
        this.w0 = co0Var;
        wl0Var3.setAdapter(co0Var);
        wl0Var3.setOnScrollListener(new ao0(eyVar, uyVar, 1));
        wl0Var3.D0(new kc0(eyVar, 23));
        this.e0 = new bl0(w0Var, true);
        jh0 jh0Var = new jh0(context, uyVar);
        this.q0 = jh0Var;
        t61 t61Var = jh0Var.c;
        t61Var.setClipToPadding(false);
        t61Var.j(new do0(eyVar, 0));
        t61Var.D0(new kc0(eyVar, 23));
        ko0 ko0Var = new ko0(eyVar);
        this.U = ko0Var;
        setAdapter(ko0Var);
    }

    public static org.telegram.ui.zn L(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.zn(bundle);
    }

    public static void Q(FrameLayout frameLayout, wl0 wl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            wl0Var.p1(0, i10, 0, i11);
        } else {
            wl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void K() {
        if (this.r0) {
            int i10 = 0;
            this.r0 = false;
            S();
            m81 m81Var = this.M;
            if (m81Var != null && m81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            eo0 eo0Var = this.c0;
            if (eo0Var != null) {
                String str = this.L0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.B0;
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

    public final int M(int i10) {
        int i11 = 0;
        while (true) {
            ko0 ko0Var = this.U;
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

    public final void N(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.W;
            if (i10 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.x10) {
                arrayList.addAll(((org.telegram.ui.x10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.x10) {
                arrayList.addAll(((org.telegram.ui.x10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.x10 x10Var = this.N0;
        if (x10Var != null) {
            arrayList.addAll(x10Var.getThemeDescriptions());
        }
        yn0 yn0Var = this.a0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(yn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(yn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.addAll(w7.b6.a(new y6(this, 7), org.telegram.ui.ActionBar.j6.y8));
    }

    public final boolean O() {
        int i10 = this.I0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.A0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i10, String str, boolean z10) {
        org.telegram.ui.x10 x10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        yn0 yn0Var = this.a0;
        if (isEmpty) {
            yn0Var.e.setVisibility(8);
        } else {
            yn0Var.e.setVisibility(0);
            yn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        eo0 eo0Var = this.c0;
        org.telegram.ui.gy gyVar = eo0Var.U;
        long a2 = gyVar != null ? gyVar.a() : 0L;
        long j10 = i10 == 0 ? 0L : a2;
        long j11 = 0;
        long j12 = 0;
        int i11 = 0;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.B0;
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
        co0 co0Var = this.w0;
        co0Var.getClass();
        if (e40.X(str, null) == null) {
            K();
        }
        if (view == this.g0) {
            MessagesController.getInstance(this.I0).getChannelRecommendations(0L);
            go0 go0Var = this.k0;
            wl0 wl0Var = go0Var.d;
            ArrayList arrayList2 = go0Var.Q;
            ArrayList arrayList3 = go0Var.R;
            ArrayList arrayList4 = go0Var.S;
            ArrayList arrayList5 = go0Var.P;
            xp xpVar = go0Var.c0;
            go0Var.W();
            if (!TextUtils.equals(str, go0Var.b0)) {
                go0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(xpVar);
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
                        wl0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(xpVar, 1000L);
                    go0Var.W = true;
                    go0Var.X = true;
                    go0Var.N(true);
                    if (wl0Var != null) {
                        z14 = false;
                        wl0Var.v0(0);
                    }
                }
                this.h0.b(this.O0, z14);
                return;
            }
            z14 = false;
            this.h0.b(this.O0, z14);
            return;
        }
        if (view == this.l0) {
            zn0 zn0Var = this.p0;
            wl0 wl0Var2 = zn0Var.d;
            ArrayList arrayList6 = zn0Var.T;
            ms msVar = zn0Var.f0;
            if (TextUtils.equals(str, zn0Var.e0)) {
                z13 = false;
            } else {
                zn0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(msVar);
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
                        wl0Var2.v0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(msVar, 1000L);
                    zn0Var.Z = true;
                    zn0Var.a0 = true;
                    zn0Var.N(true);
                    if (wl0Var2 != null) {
                        wl0Var2.v0(0);
                    }
                }
            }
            this.m0.b(this.O0, z13);
            if (TextUtils.isEmpty(str)) {
                zn0Var.V();
                return;
            }
            return;
        }
        jh0 jh0Var = this.q0;
        if (view == jh0Var) {
            t61 t61Var = jh0Var.c;
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
            t61Var.v0(0);
            t61Var.Y2.N(z12);
            return;
        }
        if (view == this.s0) {
            if (e40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.u0.h1(0, 0);
            }
            co0Var.Y(str);
            this.t0.b(this.O0, false);
            return;
        }
        if (view != this.V) {
            long j14 = a2;
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.x10) {
                org.telegram.ui.x10 x10Var2 = (org.telegram.ui.x10) view;
                x10Var2.setUseFromUserAsAvatar(j14 != 0);
                x10Var2.c.b(this.O0, false);
                x10Var2.h(j10, this.U0, j15, j16, gg.s0.c3[((jo0) this.U.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof jn0) {
                jn0 jn0Var = (jn0) view;
                jn0Var.a.b(this.O0, false);
                jn0Var.K = str;
                jn0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.x10 x10Var3 = this.N0;
        if (!(j10 == 0 && this.U0 == 0 && j11 == 0 && j12 == 0) && a2 == 0) {
            boolean z16 = true;
            x10Var3.setTag(1);
            x10Var3.i(this.M0, false);
            x10Var3.animate().setListener(null).cancel();
            if (z10) {
                x10Var3.setVisibility(0);
                x10Var3.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (x10Var3.getVisibility() != 0) {
                    x10Var3.setVisibility(0);
                    x10Var3.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                x10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            x10Var = x10Var3;
            z11 = false;
            this.N0.h(j10, this.U0, j11, j12, null, z15, str, z16);
            yn0Var.setVisibility(8);
        } else {
            this.J0 = false;
            eo0Var.U(z15 ? 1 : 0, str);
            eo0Var.A0 = this.M0;
            x10Var3.animate().setListener(null).cancel();
            x10Var3.i(null, false);
            if (z10) {
                yn0Var.e(!(eo0Var.D0 > 0), false);
                yn0Var.e(eo0Var.D0 > 0, false);
            } else if (!eo0Var.N()) {
                yn0Var.e(eo0Var.D0 > 0, true);
            }
            if (z10) {
                x10Var3.setVisibility(8);
            } else if (x10Var3.getVisibility() != 8) {
                x10Var3.animate().alpha(0.0f).setListener(new ed0(this, 11)).setDuration(150L).start();
            }
            x10Var3.setTag(null);
            x10Var = x10Var3;
            z11 = false;
        }
        yn0Var.b(this.O0, z11);
        x10Var.c.b(this.O0, z11);
    }

    public final void R(boolean z10) {
        vl0 vl0Var;
        vl0 vl0Var2;
        vl0 vl0Var3;
        org.telegram.ui.gy gyVar;
        if (this.z0 == z10) {
            return;
        }
        org.telegram.ui.uy uyVar = this.K0;
        if (z10 && uyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !uyVar.getActionBar().a("search_view_pager")) {
            this.G0 = uyVar.getActionBar().j("search_view_pager");
            if (uyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.x0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.x0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                this.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.x0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
                this.x0.setOnClickListener(new g80(this, 14));
                this.G0.addView(this.x0, w7.y5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.G0.getContext());
            this.y0 = numberTextView;
            numberTextView.setTextSize(18);
            this.y0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.y0;
            int i10 = org.telegram.ui.ActionBar.j6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.G0.addView(this.y0, w7.y5.m(1.0f, 0, -1, uyVar.W ? 18 : 72, 0, 0));
            this.y0.setOnTouchListener(new bi.d(21));
            org.telegram.ui.ActionBar.v0 h = this.G0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.C0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.D0 = this.G0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.E0 = this.G0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.F0 = this.G0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.y0 != null) {
            eo0 eo0Var = this.c0;
            ((ViewGroup.MarginLayoutParams) this.y0.getLayoutParams()).leftMargin = AndroidUtilities.dp((uyVar.W ? 18 : 72) + (eo0Var != null && (gyVar = eo0Var.U) != null && (gyVar.a() > 0L ? 1 : (gyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.y0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (uyVar.getActionBar().getBackButton() != null && (uyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            uyVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.z0 = z10;
        HashMap hashMap = this.A0;
        if (z10) {
            AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
            uyVar.getActionBar().O(null, null);
            this.y0.a(hashMap.size(), false);
            this.C0.setVisibility(O() ? 0 : 8);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            this.F0.setVisibility(0);
            return;
        }
        uyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.x10) && (vl0Var3 = ((org.telegram.ui.x10) getChildAt(i11)).d) != null) {
                vl0Var3.l();
            }
            if (getChildAt(i11) instanceof jn0) {
                ((jn0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.x10 x10Var = this.N0;
        if (x10Var != null && (vl0Var2 = x10Var.d) != null) {
            vl0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.x10) && (vl0Var = ((org.telegram.ui.x10) view).d) != null) {
                vl0Var.l();
            }
        }
    }

    public final void S() {
        this.U.i();
        o(false);
        m81 m81Var = this.M;
        if (m81Var != null) {
            m81Var.x.l();
        }
    }

    @Override // org.telegram.ui.w10
    public final void a() {
        R(true);
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // org.telegram.ui.w10
    public final boolean c(org.telegram.ui.p10 p10Var) {
        return this.A0.containsKey(p10Var);
    }

    @Override // org.telegram.ui.w10
    public final void d(MessageObject messageObject) {
        this.K0.presentFragment(L(messageObject, this.I0));
        R(false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        go0 go0Var = this.k0;
        if (i10 == i12) {
            this.h0.e(MessagesController.getInstance(this.I0).getChannelRecommendations(0L) != null, true);
            go0Var.W();
            go0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            go0Var.W();
            go0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.p0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                co0 co0Var = this.w0;
                if (obj == co0Var.Q) {
                    co0Var.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.w10
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.p10 p10Var = new org.telegram.ui.p10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.A0;
        if (hashMap.containsKey(p10Var)) {
            hashMap.remove(p10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(p10Var, messageObject);
        }
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.y0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.v0 v0Var = this.D0;
            if (v0Var != null) {
                v0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.C0 != null) {
                boolean O = O();
                int i11 = O ? 0 : 8;
                if (this.C0.getVisibility() != i11) {
                    this.C0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.C0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (O) {
                        animatedVectorDrawable.start();
                    } else if (i12 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.F0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.p10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.F0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(p10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(p10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(p10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(p10Var), true);
        }
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.V;
            wl0 wl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    wl0Var = this.W;
                } else if (view == this.g0) {
                    wl0Var = this.j0;
                } else if (view == this.l0) {
                    wl0Var = this.o0;
                } else if (view == this.s0) {
                    wl0Var = this.v0;
                } else {
                    jn0 jn0Var = this.H0;
                    if (view == jn0Var) {
                        wl0Var = jn0Var.b;
                    } else {
                        jh0 jh0Var = this.q0;
                        if (view == jh0Var) {
                            wl0Var = jh0Var.c;
                        } else if (view instanceof org.telegram.ui.x10) {
                            wl0Var = ((org.telegram.ui.x10) view).b;
                        }
                    }
                }
            }
            if (wl0Var != null) {
                gh.d.a(wl0Var, canvas, rectF, wl0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.x10 x10Var = this.N0;
                if (x10Var.getVisibility() == 0) {
                    ai.w0 w0Var = x10Var.b;
                    gh.d.a(w0Var, canvas, rectF, w0Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.w10
    public final boolean g() {
        return this.z0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.G0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.B0;
    }

    public jn0 getDownloadsContainer() {
        return this.H0;
    }

    public int getFolderId() {
        return this.S0;
    }

    @Override // org.telegram.ui.Components.x81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.C0;
    }

    public w81 getTabsView() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.X0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.X0 = null;
        }
        this.X0 = NotificationCenter.getInstance(this.I0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.f0 = true;
        go0 go0Var = this.k0;
        if (go0Var != null) {
            go0Var.N(false);
        }
        zn0 zn0Var = this.p0;
        if (zn0Var != null) {
            zn0Var.N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.X0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.X0 = null;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final void s() {
        this.R0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.Y0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.o10 o10Var) {
        this.M0 = o10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.O0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.x10) {
                ((org.telegram.ui.x10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.V) {
                this.a0.b(i10, z10);
                this.N0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof jn0) {
                ((jn0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.g0) {
                this.h0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        m81 m81Var = this.M;
        if (m81Var != null) {
            m81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.x81
    public final void t(View view, View view2, int i10, int i11) {
        eo0 eo0Var = this.c0;
        org.telegram.ui.x10 x10Var = this.N0;
        if (i10 == 0) {
            if (x10Var.getVisibility() == 0) {
                x10Var.i(this.M0, false);
                eo0Var.A0 = null;
            } else {
                x10Var.i(null, false);
                org.telegram.ui.o10 o10Var = this.M0;
                eo0Var.A0 = o10Var;
                if (o10Var != null) {
                    ((org.telegram.ui.xv) o10Var).i(false, null, eo0Var.y0, eo0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view).i(this.M0, i11 == 0 && x10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view2).i(null, false);
        } else {
            eo0Var.A0 = null;
            x10Var.i(null, false);
        }
    }
}
