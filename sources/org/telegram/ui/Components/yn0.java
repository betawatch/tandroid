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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class yn0 extends i81 implements org.telegram.ui.w10, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final /* synthetic */ int X0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public vm0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.uy J0;
    public String K0;
    public org.telegram.ui.o10 L0;
    public final org.telegram.ui.x10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.zx P0;
    public final ov0 Q0;
    public final int R0;
    public int S0;
    public final xn0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final bi.o0 V;
    public int V0;
    public final ln0 W;
    public bh.b W0;
    public final s4.j a0;
    public final rn0 b0;
    public final s4.c0 c0;
    public final qk0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final ln0 g0;
    public final s4.c0 h0;
    public final ll0 i0;
    public final tn0 j0;
    public final FrameLayout k0;
    public final ln0 l0;
    public final s4.c0 m0;
    public final ll0 n0;
    public final mn0 o0;
    public final yg0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final ln0 s0;
    public final s4.c0 t0;
    public final ll0 u0;
    public final pn0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public yn0(Context context, org.telegram.ui.uy uyVar, int i10, int i11, int i12, long j3, org.telegram.ui.zx zxVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = uyVar;
        this.P0 = zxVar;
        s4.j jVar = new s4.j();
        this.a0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = pr.h;
        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this;
        this.b0 = new rn0(eyVar, context, uyVar, i10, i11, jVar, uyVar.F, uyVar, context);
        if (i11 == 15) {
            ArrayList R3 = uyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (ov0) uyVar.getFragmentView();
        bi.o0 o0Var = new bi.o0(eyVar, context, 21);
        this.V = o0Var;
        o0Var.setItemAnimator(this.a0);
        o0Var.setPivotY(0.0f);
        o0Var.setClipToPadding(false);
        o0Var.setAdapter(this.b0);
        o0Var.setVerticalScrollBarEnabled(true);
        o0Var.setInstantClick(true);
        o0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var = new s4.c0(1, false);
        this.c0 = c0Var;
        o0Var.setLayoutManager(c0Var);
        o0Var.Y1 = true;
        o0Var.Z1 = 0;
        o0Var.setOnScrollListener(new nn0(eyVar, uyVar, 2));
        o0Var.C0(new cc0(eyVar, 23));
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(this.J0);
        this.M0 = x10Var;
        bi.o0 o0Var2 = x10Var.b;
        o0Var2.setClipToPadding(false);
        o0Var2.j(new qn0(eyVar, 1));
        o0Var2.C0(new cc0(eyVar, 23));
        x10Var.setUiCallback(this);
        x10Var.setVisibility(8);
        x10Var.setChatPreviewDelegate(zxVar);
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(1);
        ln0 ln0Var = new ln0(eyVar, context, t00Var, 2);
        this.W = ln0Var;
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
        ln0Var.setVisibility(8);
        ln0Var.addView(t00Var, 0);
        ln0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(ln0Var);
        frameLayout.addView(o0Var);
        frameLayout.addView(x10Var);
        o0Var.setEmptyView(ln0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        sn0 sn0Var = new sn0(eyVar);
        sn0Var.m = false;
        sn0Var.C = false;
        pr prVar = pr.h;
        sn0Var.o(prVar);
        sn0Var.n(350L);
        ll0 ll0Var = new ll0(context, null);
        this.i0 = ll0Var;
        ll0Var.setItemAnimator(sn0Var);
        ll0Var.setPivotY(0.0f);
        ll0Var.setVerticalScrollBarEnabled(true);
        ll0Var.setInstantClick(true);
        ll0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.h0 = c0Var2;
        ll0Var.setLayoutManager(c0Var2);
        ll0Var.Y1 = true;
        ll0Var.Z1 = 0;
        ll0Var.setClipToPadding(false);
        t00 t00Var2 = new t00(context, null);
        t00Var2.setViewType(1);
        ln0 ln0Var2 = new ln0(eyVar, context, t00Var2, 3);
        this.g0 = ln0Var2;
        ln0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var2.e.setVisibility(8);
        ln0Var2.setVisibility(8);
        ln0Var2.addView(t00Var2, 0);
        ln0Var2.e(true, false);
        frameLayout2.addView(ln0Var2);
        frameLayout2.addView(ll0Var);
        ll0Var.setEmptyView(ln0Var2);
        tn0 tn0Var = new tn0(eyVar, ll0Var, context, this.H0, i12, uyVar);
        this.j0 = tn0Var;
        ll0Var.setAdapter(tn0Var);
        ll0Var.setOnScrollListener(new nn0(eyVar, uyVar, 3));
        ll0Var.C0(new cc0(eyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        kn0 kn0Var = new kn0(eyVar);
        kn0Var.m = false;
        kn0Var.C = false;
        kn0Var.o(prVar);
        kn0Var.n(350L);
        ll0 ll0Var2 = new ll0(context, null);
        this.n0 = ll0Var2;
        ll0Var2.setItemAnimator(kn0Var);
        ll0Var2.setPivotY(0.0f);
        ll0Var2.setClipToPadding(false);
        ll0Var2.setVerticalScrollBarEnabled(true);
        ll0Var2.setInstantClick(true);
        ll0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        ll0Var2.setLayoutManager(c0Var3);
        ll0Var2.Y1 = true;
        ll0Var2.Z1 = 0;
        t00 t00Var3 = new t00(context, null);
        t00Var3.setViewType(1);
        ln0 ln0Var3 = new ln0(eyVar, context, t00Var3, 0);
        this.l0 = ln0Var3;
        ln0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var3.e.setVisibility(8);
        ln0Var3.setVisibility(8);
        ln0Var3.addView(t00Var3, 0);
        ln0Var3.e(true, false);
        frameLayout3.addView(ln0Var3);
        frameLayout3.addView(ll0Var2);
        ll0Var2.setEmptyView(ln0Var3);
        mn0 mn0Var = new mn0(eyVar, ll0Var2, context, this.H0, i12);
        this.o0 = mn0Var;
        ll0Var2.setAdapter(mn0Var);
        ll0Var2.setOnScrollListener(new nn0(eyVar, uyVar, 0));
        ll0Var2.C0(new cc0(eyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        on0 on0Var = new on0(eyVar);
        on0Var.m = false;
        on0Var.C = false;
        on0Var.o(prVar);
        on0Var.n(350L);
        ll0 ll0Var3 = new ll0(context, null);
        this.u0 = ll0Var3;
        ll0Var3.setItemAnimator(on0Var);
        ll0Var3.setPivotY(0.0f);
        ll0Var3.setVerticalScrollBarEnabled(true);
        ll0Var3.setInstantClick(true);
        ll0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.t0 = c0Var4;
        ll0Var3.setLayoutManager(c0Var4);
        ll0Var3.Y1 = true;
        ll0Var3.Z1 = 0;
        ll0Var3.setClipToPadding(false);
        t00 t00Var4 = new t00(context, null);
        t00Var4.setViewType(1);
        ln0 ln0Var4 = new ln0(eyVar, context, t00Var4, 1);
        this.s0 = ln0Var4;
        ln0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var4.e.setVisibility(8);
        ln0Var4.setVisibility(8);
        ln0Var4.addView(t00Var4, 0);
        ln0Var4.e(true, false);
        frameLayout4.addView(ln0Var4);
        frameLayout4.addView(ll0Var3);
        ll0Var3.setEmptyView(ln0Var4);
        pn0 pn0Var = new pn0(eyVar, ll0Var3, context, this.H0);
        this.v0 = pn0Var;
        ll0Var3.setAdapter(pn0Var);
        ll0Var3.setOnScrollListener(new nn0(eyVar, uyVar, 1));
        ll0Var3.C0(new cc0(eyVar, 23));
        this.d0 = new qk0(o0Var, true);
        yg0 yg0Var = new yg0(context, uyVar);
        this.p0 = yg0Var;
        d61 d61Var = yg0Var.c;
        d61Var.setClipToPadding(false);
        d61Var.j(new qn0(eyVar, 0));
        d61Var.C0(new cc0(eyVar, 23));
        xn0 xn0Var = new xn0(eyVar);
        this.T = xn0Var;
        setAdapter(xn0Var);
    }

    public static org.telegram.ui.co K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.co(bundle);
    }

    public static void P(FrameLayout frameLayout, ll0 ll0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            ll0Var.n1(0, i10, 0, i11);
        } else {
            ll0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ll0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.q0) {
            int i10 = 0;
            this.q0 = false;
            R();
            y71 y71Var = this.M;
            if (y71Var != null && y71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            rn0 rn0Var = this.b0;
            if (rn0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((hg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                rn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            xn0 xn0Var = this.T;
            ArrayList arrayList = xn0Var.a;
            ArrayList arrayList2 = xn0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((wn0) arrayList2.get(i11)).a == 3 && ((wn0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            bi.o0 o0Var = this.V;
            if (i10 >= o0Var.getChildCount()) {
                break;
            }
            View childAt = o0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
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
        org.telegram.ui.x10 x10Var = this.M0;
        if (x10Var != null) {
            arrayList.addAll(x10Var.getThemeDescriptions());
        }
        ln0 ln0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ln0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ln0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.addAll(w7.a6.a(new z6(this, 7), org.telegram.ui.ActionBar.j6.y8));
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
        org.telegram.ui.x10 x10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        ln0 ln0Var = this.W;
        if (isEmpty) {
            ln0Var.e.setVisibility(8);
        } else {
            ln0Var.e.setVisibility(0);
            ln0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        rn0 rn0Var = this.b0;
        org.telegram.ui.gy gyVar = rn0Var.U;
        long a2 = gyVar != null ? gyVar.a() : 0L;
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
            hg.q0 q0Var = (hg.q0) arrayList.get(i11);
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
                hg.o0 o0Var = q0Var.g;
                long j13 = o0Var.b;
                j12 = o0Var.c;
                j11 = j13;
            } else if (i12 == 7) {
                z15 = true;
            }
            i11++;
        }
        pn0 pn0Var = this.v0;
        pn0Var.getClass();
        if (e40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            tn0 tn0Var = this.j0;
            ll0 ll0Var = tn0Var.d;
            ArrayList arrayList2 = tn0Var.Q;
            ArrayList arrayList3 = tn0Var.R;
            ArrayList arrayList4 = tn0Var.S;
            ArrayList arrayList5 = tn0Var.P;
            wp wpVar = tn0Var.c0;
            tn0Var.W();
            if (!TextUtils.equals(str, tn0Var.b0)) {
                tn0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(wpVar);
                if (TextUtils.isEmpty(tn0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    tn0Var.N(true);
                    tn0Var.a0++;
                    z14 = false;
                    tn0Var.W = false;
                    tn0Var.X = false;
                    tn0Var.Y = false;
                    tn0Var.Z = 0;
                    if (ll0Var != null) {
                        ll0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(wpVar, 1000L);
                    tn0Var.W = true;
                    tn0Var.X = true;
                    tn0Var.N(true);
                    if (ll0Var != null) {
                        z14 = false;
                        ll0Var.u0(0);
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
            mn0 mn0Var = this.o0;
            ll0 ll0Var2 = mn0Var.d;
            ArrayList arrayList6 = mn0Var.T;
            ls lsVar = mn0Var.f0;
            if (TextUtils.equals(str, mn0Var.e0)) {
                z13 = false;
            } else {
                mn0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(lsVar);
                if (TextUtils.isEmpty(mn0Var.e0)) {
                    arrayList6.clear();
                    mn0Var.N(true);
                    mn0Var.d0++;
                    z13 = false;
                    mn0Var.Z = false;
                    mn0Var.a0 = false;
                    mn0Var.b0 = false;
                    mn0Var.c0 = 0;
                    if (ll0Var2 != null) {
                        ll0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(lsVar, 1000L);
                    mn0Var.Z = true;
                    mn0Var.a0 = true;
                    mn0Var.N(true);
                    if (ll0Var2 != null) {
                        ll0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z13);
            if (TextUtils.isEmpty(str)) {
                mn0Var.V();
                return;
            }
            return;
        }
        yg0 yg0Var = this.p0;
        if (view == yg0Var) {
            d61 d61Var = yg0Var.c;
            ArrayList arrayList7 = yg0Var.n;
            if (TextUtils.equals(yg0Var.w, str)) {
                return;
            }
            if (yg0Var.K >= 0) {
                ConnectionsManager.getInstance(yg0Var.b).cancelRequest(yg0Var.K, true);
                yg0Var.K = -1;
            }
            yg0Var.v = false;
            yg0Var.H.setLoading(false);
            yg0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                yg0Var.r = 0;
                z12 = true;
                yg0Var.L++;
                yg0Var.s = false;
                arrayList7.clear();
                yg0Var.a(false);
            } else {
                z12 = true;
                yg0Var.b(str);
                yg0Var.r = 0;
                yg0Var.L++;
                yg0Var.s = false;
                arrayList7.clear();
            }
            yg0Var.d();
            d61Var.u0(0);
            d61Var.Y2.N(z12);
            return;
        }
        if (view == this.r0) {
            if (e40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            pn0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j14 = a2;
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.x10) {
                org.telegram.ui.x10 x10Var2 = (org.telegram.ui.x10) view;
                x10Var2.setUseFromUserAsAvatar(j14 != 0);
                x10Var2.c.b(this.N0, false);
                x10Var2.h(j10, this.T0, j15, j16, hg.s0.c3[((wn0) this.T.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof vm0) {
                vm0 vm0Var = (vm0) view;
                vm0Var.a.b(this.N0, false);
                vm0Var.K = str;
                vm0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.x10 x10Var3 = this.M0;
        if (!(j10 == 0 && this.T0 == 0 && j11 == 0 && j12 == 0) && a2 == 0) {
            boolean z16 = true;
            x10Var3.setTag(1);
            x10Var3.i(this.L0, false);
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
            this.M0.h(j10, this.T0, j11, j12, null, z15, str, z16);
            ln0Var.setVisibility(8);
        } else {
            this.I0 = false;
            rn0Var.U(z15 ? 1 : 0, str);
            rn0Var.A0 = this.L0;
            x10Var3.animate().setListener(null).cancel();
            x10Var3.i(null, false);
            if (z10) {
                ln0Var.e(!(rn0Var.D0 > 0), false);
                ln0Var.e(rn0Var.D0 > 0, false);
            } else if (!rn0Var.N()) {
                ln0Var.e(rn0Var.D0 > 0, true);
            }
            if (z10) {
                x10Var3.setVisibility(8);
            } else if (x10Var3.getVisibility() != 8) {
                x10Var3.animate().alpha(0.0f).setListener(new r80(this, 13)).setDuration(150L).start();
            }
            x10Var3.setTag(null);
            x10Var = x10Var3;
            z11 = false;
        }
        ln0Var.b(this.N0, z11);
        x10Var.c.b(this.N0, z11);
    }

    public final void Q(boolean z10) {
        kl0 kl0Var;
        kl0 kl0Var2;
        kl0 kl0Var3;
        org.telegram.ui.gy gyVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.uy uyVar = this.J0;
        if (z10 && uyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !uyVar.getActionBar().a("search_view_pager")) {
            this.F0 = uyVar.getActionBar().j("search_view_pager");
            if (uyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
                this.w0.setOnClickListener(new x70(this, 14));
                this.F0.addView(this.w0, w7.x5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.j6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.F0.addView(this.x0, w7.x5.m(1.0f, 0, -1, uyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new ci.d(21));
            org.telegram.ui.ActionBar.v0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            rn0 rn0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((uyVar.W ? 18 : 72) + (rn0Var != null && (gyVar = rn0Var.U) != null && (gyVar.a() > 0L ? 1 : (gyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (uyVar.getActionBar().getBackButton() != null && (uyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            uyVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
            uyVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        uyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.x10) && (kl0Var3 = ((org.telegram.ui.x10) getChildAt(i11)).d) != null) {
                kl0Var3.l();
            }
            if (getChildAt(i11) instanceof vm0) {
                ((vm0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.x10 x10Var = this.M0;
        if (x10Var != null && (kl0Var2 = x10Var.d) != null) {
            kl0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.x10) && (kl0Var = ((org.telegram.ui.x10) view).d) != null) {
                kl0Var.l();
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        y71 y71Var = this.M;
        if (y71Var != null) {
            y71Var.x.l();
        }
    }

    @Override // org.telegram.ui.w10
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.w10
    public final boolean b(org.telegram.ui.p10 p10Var) {
        return this.z0.containsKey(p10Var);
    }

    @Override // org.telegram.ui.w10
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.ui.w10
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.p10 p10Var = new org.telegram.ui.p10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(p10Var)) {
            hashMap.remove(p10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(p10Var, messageObject);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.x0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.v0 v0Var = this.C0;
            if (v0Var != null) {
                v0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.B0 != null) {
                boolean N = N();
                int i11 = N ? 0 : 8;
                if (this.B0.getVisibility() != i11) {
                    this.B0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false), PorterDuff.Mode.SRC_IN));
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
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.p10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(hashMap.containsKey(p10Var), true);
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
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).e(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(p10Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        tn0 tn0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            tn0Var.W();
            tn0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            tn0Var.W();
            tn0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                pn0 pn0Var = this.v0;
                if (obj == pn0Var.Q) {
                    pn0Var.N(true);
                }
            }
        }
    }

    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.U;
            ll0 ll0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    ll0Var = this.V;
                } else if (view == this.f0) {
                    ll0Var = this.i0;
                } else if (view == this.k0) {
                    ll0Var = this.n0;
                } else if (view == this.r0) {
                    ll0Var = this.u0;
                } else {
                    vm0 vm0Var = this.G0;
                    if (view == vm0Var) {
                        ll0Var = vm0Var.b;
                    } else {
                        yg0 yg0Var = this.p0;
                        if (view == yg0Var) {
                            ll0Var = yg0Var.c;
                        } else if (view instanceof org.telegram.ui.x10) {
                            ll0Var = ((org.telegram.ui.x10) view).b;
                        }
                    }
                }
            }
            if (ll0Var != null) {
                hh.d.b(ll0Var, canvas, rectF, ll0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.x10 x10Var = this.M0;
                if (x10Var.getVisibility() == 0) {
                    bi.o0 o0Var = x10Var.b;
                    hh.d.b(o0Var, canvas, rectF, o0Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.w10
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public vm0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.i81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.B0;
    }

    public h81 getTabsView() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.H0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        this.e0 = true;
        tn0 tn0Var = this.j0;
        if (tn0Var != null) {
            tn0Var.N(false);
        }
        mn0 mn0Var = this.o0;
        if (mn0Var != null) {
            mn0Var.N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e0 = false;
        int i10 = this.H0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.i81
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.W0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.o10 o10Var) {
        this.L0 = o10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.x10) {
                ((org.telegram.ui.x10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof vm0) {
                ((vm0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        y71 y71Var = this.M;
        if (y71Var != null) {
            y71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.i81
    public final void t(View view, View view2, int i10, int i11) {
        rn0 rn0Var = this.b0;
        org.telegram.ui.x10 x10Var = this.M0;
        if (i10 == 0) {
            if (x10Var.getVisibility() == 0) {
                x10Var.i(this.L0, false);
                rn0Var.A0 = null;
            } else {
                x10Var.i(null, false);
                org.telegram.ui.o10 o10Var = this.L0;
                rn0Var.A0 = o10Var;
                if (o10Var != null) {
                    ((org.telegram.ui.xv) o10Var).i(false, null, rn0Var.y0, rn0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view).i(this.L0, i11 == 0 && x10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view2).i(null, false);
        } else {
            rn0Var.A0 = null;
            x10Var.i(null, false);
        }
    }
}
