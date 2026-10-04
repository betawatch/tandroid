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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public abstract class qo0 extends g91 implements org.telegram.ui.w10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final /* synthetic */ int Z0 = 0;
    public final HashMap A0;
    public final ArrayList B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.v0 F0;
    public org.telegram.ui.ActionBar.z G0;
    public on0 H0;
    public final int I0;
    public boolean J0;
    public final org.telegram.ui.uy K0;
    public String L0;
    public org.telegram.ui.o10 M0;
    public final org.telegram.ui.x10 N0;
    public int O0;
    public boolean P0;
    public final org.telegram.ui.cy Q0;
    public final lw0 R0;
    public final int S0;
    public int T0;
    public final po0 U;
    public final long U0;
    public final FrameLayout V;
    public int V0;
    public final ai.w0 W;
    public int W0;
    public NotificationCenter.ObserversGroup X0;
    public ah.c Y0;
    public final do0 a0;
    public final s4.j b0;
    public final jo0 c0;
    public final s4.c0 d0;
    public final dl0 e0;
    public boolean f0;
    public final FrameLayout g0;
    public final do0 h0;
    public final s4.c0 i0;
    public final zl0 j0;
    public final lo0 k0;
    public final FrameLayout l0;
    public final do0 m0;
    public final s4.c0 n0;
    public final zl0 o0;
    public final eo0 p0;
    public final lh0 q0;
    public boolean r0;
    public final FrameLayout s0;
    public final do0 t0;
    public final s4.c0 u0;
    public final zl0 v0;
    public final ho0 w0;
    public ImageView x0;
    public NumberTextView y0;
    public boolean z0;

    public qo0(Context context, org.telegram.ui.uy uyVar, int i10, int i11, int i12, long j3, org.telegram.ui.cy cyVar) {
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
        this.Q0 = cyVar;
        s4.j jVar = new s4.j();
        this.b0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = tr.h;
        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this;
        this.c0 = new jo0(dyVar, context, uyVar, i10, i11, jVar, uyVar.F, uyVar, context);
        if (i11 == 15) {
            ArrayList a42 = uyVar.a4(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < a42.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) a42.get(i14)).id, arrayList, i14, 1)) {
            }
            this.c0.q0 = arrayList;
        }
        this.R0 = (lw0) uyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(dyVar, context, 21);
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
        w0Var.setOnScrollListener(new fo0(dyVar, uyVar, 2));
        w0Var.D0(new lc0(dyVar, 24));
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(this.K0);
        this.N0 = x10Var;
        ai.w0 w0Var2 = x10Var.b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new io0(dyVar, 1));
        w0Var2.D0(new lc0(dyVar, 24));
        x10Var.setUiCallback(this);
        x10Var.setVisibility(8);
        x10Var.setChatPreviewDelegate(cyVar);
        w00 w00Var = new w00(context, null);
        w00Var.setViewType(1);
        do0 do0Var = new do0(dyVar, context, w00Var, 2);
        this.a0 = do0Var;
        do0Var.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var.e.setVisibility(8);
        do0Var.setVisibility(8);
        do0Var.addView(w00Var, 0);
        do0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.addView(do0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(x10Var);
        w0Var.setEmptyView(do0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g0 = frameLayout2;
        ko0 ko0Var = new ko0(dyVar);
        ko0Var.m = false;
        ko0Var.C = false;
        tr trVar = tr.h;
        ko0Var.o(trVar);
        ko0Var.n(350L);
        zl0 zl0Var = new zl0(context, null);
        this.j0 = zl0Var;
        zl0Var.setItemAnimator(ko0Var);
        zl0Var.setPivotY(0.0f);
        zl0Var.setVerticalScrollBarEnabled(true);
        zl0Var.setInstantClick(true);
        zl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.i0 = c0Var2;
        zl0Var.setLayoutManager(c0Var2);
        zl0Var.Y1 = true;
        zl0Var.Z1 = 0;
        zl0Var.setClipToPadding(false);
        w00 w00Var2 = new w00(context, null);
        w00Var2.setViewType(1);
        do0 do0Var2 = new do0(dyVar, context, w00Var2, 3);
        this.h0 = do0Var2;
        do0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var2.e.setVisibility(8);
        do0Var2.setVisibility(8);
        do0Var2.addView(w00Var2, 0);
        do0Var2.e(true, false);
        frameLayout2.addView(do0Var2);
        frameLayout2.addView(zl0Var);
        zl0Var.setEmptyView(do0Var2);
        lo0 lo0Var = new lo0(dyVar, zl0Var, context, this.I0, i12, uyVar);
        this.k0 = lo0Var;
        zl0Var.setAdapter(lo0Var);
        zl0Var.setOnScrollListener(new fo0(dyVar, uyVar, 3));
        zl0Var.D0(new lc0(dyVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.l0 = frameLayout3;
        co0 co0Var = new co0(dyVar);
        co0Var.m = false;
        co0Var.C = false;
        co0Var.o(trVar);
        co0Var.n(350L);
        zl0 zl0Var2 = new zl0(context, null);
        this.o0 = zl0Var2;
        zl0Var2.setItemAnimator(co0Var);
        zl0Var2.setPivotY(0.0f);
        zl0Var2.setClipToPadding(false);
        zl0Var2.setVerticalScrollBarEnabled(true);
        zl0Var2.setInstantClick(true);
        zl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.n0 = c0Var3;
        zl0Var2.setLayoutManager(c0Var3);
        zl0Var2.Y1 = true;
        zl0Var2.Z1 = 0;
        w00 w00Var3 = new w00(context, null);
        w00Var3.setViewType(1);
        do0 do0Var3 = new do0(dyVar, context, w00Var3, 0);
        this.m0 = do0Var3;
        do0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var3.e.setVisibility(8);
        do0Var3.setVisibility(8);
        do0Var3.addView(w00Var3, 0);
        do0Var3.e(true, false);
        frameLayout3.addView(do0Var3);
        frameLayout3.addView(zl0Var2);
        zl0Var2.setEmptyView(do0Var3);
        eo0 eo0Var = new eo0(dyVar, zl0Var2, context, this.I0, i12);
        this.p0 = eo0Var;
        zl0Var2.setAdapter(eo0Var);
        zl0Var2.setOnScrollListener(new fo0(dyVar, uyVar, 0));
        zl0Var2.D0(new lc0(dyVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.s0 = frameLayout4;
        go0 go0Var = new go0(dyVar);
        go0Var.m = false;
        go0Var.C = false;
        go0Var.o(trVar);
        go0Var.n(350L);
        zl0 zl0Var3 = new zl0(context, null);
        this.v0 = zl0Var3;
        zl0Var3.setItemAnimator(go0Var);
        zl0Var3.setPivotY(0.0f);
        zl0Var3.setVerticalScrollBarEnabled(true);
        zl0Var3.setInstantClick(true);
        zl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.u0 = c0Var4;
        zl0Var3.setLayoutManager(c0Var4);
        zl0Var3.Y1 = true;
        zl0Var3.Z1 = 0;
        zl0Var3.setClipToPadding(false);
        w00 w00Var4 = new w00(context, null);
        w00Var4.setViewType(1);
        do0 do0Var4 = new do0(dyVar, context, w00Var4, 1);
        this.t0 = do0Var4;
        do0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var4.e.setVisibility(8);
        do0Var4.setVisibility(8);
        do0Var4.addView(w00Var4, 0);
        do0Var4.e(true, false);
        frameLayout4.addView(do0Var4);
        frameLayout4.addView(zl0Var3);
        zl0Var3.setEmptyView(do0Var4);
        ho0 ho0Var = new ho0(dyVar, zl0Var3, context, this.I0);
        this.w0 = ho0Var;
        zl0Var3.setAdapter(ho0Var);
        zl0Var3.setOnScrollListener(new fo0(dyVar, uyVar, 1));
        zl0Var3.D0(new lc0(dyVar, 24));
        this.e0 = new dl0(w0Var, true);
        lh0 lh0Var = new lh0(context, uyVar);
        this.q0 = lh0Var;
        c71 c71Var = lh0Var.c;
        c71Var.setClipToPadding(false);
        c71Var.j(new io0(dyVar, 0));
        c71Var.D0(new lc0(dyVar, 24));
        po0 po0Var = new po0(dyVar);
        this.U = po0Var;
        setAdapter(po0Var);
    }

    public static org.telegram.ui.yn M(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.yn(bundle);
    }

    public static void R(FrameLayout frameLayout, zl0 zl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            zl0Var.r1(0, i10, 0, i11);
        } else {
            zl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void L() {
        if (this.r0) {
            int i10 = 0;
            this.r0 = false;
            T();
            v81 v81Var = this.M;
            if (v81Var != null && v81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            jo0 jo0Var = this.c0;
            if (jo0Var != null) {
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
                jo0Var.U(i10, str);
            }
        }
    }

    public final int N(int i10) {
        int i11 = 0;
        while (true) {
            po0 po0Var = this.U;
            ArrayList arrayList = po0Var.a;
            ArrayList arrayList2 = po0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((oo0) arrayList2.get(i11)).a == 3 && ((oo0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void O(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.W;
            if (i10 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
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
        do0 do0Var = this.a0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(do0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(do0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.y6));
        arrayList.addAll(w7.c6.a(new y6(this, 7), org.telegram.ui.ActionBar.i6.y8));
    }

    public final boolean P() {
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

    public final void Q(View view, int i10, String str, boolean z10) {
        org.telegram.ui.x10 x10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        do0 do0Var = this.a0;
        if (isEmpty) {
            do0Var.e.setVisibility(8);
        } else {
            do0Var.e.setVisibility(0);
            do0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        jo0 jo0Var = this.c0;
        org.telegram.ui.fy fyVar = jo0Var.U;
        long a2 = fyVar != null ? fyVar.a() : 0L;
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
        ho0 ho0Var = this.w0;
        ho0Var.getClass();
        if (i40.X(str, null) == null) {
            L();
        }
        if (view == this.g0) {
            MessagesController.getInstance(this.I0).getChannelRecommendations(0L);
            lo0 lo0Var = this.k0;
            zl0 zl0Var = lo0Var.d;
            ArrayList arrayList2 = lo0Var.Q;
            ArrayList arrayList3 = lo0Var.R;
            ArrayList arrayList4 = lo0Var.S;
            ArrayList arrayList5 = lo0Var.P;
            aq aqVar = lo0Var.c0;
            lo0Var.W();
            if (!TextUtils.equals(str, lo0Var.b0)) {
                lo0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(aqVar);
                if (TextUtils.isEmpty(lo0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    lo0Var.N(true);
                    lo0Var.a0++;
                    z14 = false;
                    lo0Var.W = false;
                    lo0Var.X = false;
                    lo0Var.Y = false;
                    lo0Var.Z = 0;
                    if (zl0Var != null) {
                        zl0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(aqVar, 1000L);
                    lo0Var.W = true;
                    lo0Var.X = true;
                    lo0Var.N(true);
                    if (zl0Var != null) {
                        z14 = false;
                        zl0Var.v0(0);
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
            eo0 eo0Var = this.p0;
            zl0 zl0Var2 = eo0Var.d;
            ArrayList arrayList6 = eo0Var.T;
            ps psVar = eo0Var.f0;
            if (TextUtils.equals(str, eo0Var.e0)) {
                z13 = false;
            } else {
                eo0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(psVar);
                if (TextUtils.isEmpty(eo0Var.e0)) {
                    arrayList6.clear();
                    eo0Var.N(true);
                    eo0Var.d0++;
                    z13 = false;
                    eo0Var.Z = false;
                    eo0Var.a0 = false;
                    eo0Var.b0 = false;
                    eo0Var.c0 = 0;
                    if (zl0Var2 != null) {
                        zl0Var2.v0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(psVar, 1000L);
                    eo0Var.Z = true;
                    eo0Var.a0 = true;
                    eo0Var.N(true);
                    if (zl0Var2 != null) {
                        zl0Var2.v0(0);
                    }
                }
            }
            this.m0.b(this.O0, z13);
            if (TextUtils.isEmpty(str)) {
                eo0Var.V();
                return;
            }
            return;
        }
        lh0 lh0Var = this.q0;
        if (view == lh0Var) {
            c71 c71Var = lh0Var.c;
            ArrayList arrayList7 = lh0Var.n;
            if (TextUtils.equals(lh0Var.w, str)) {
                return;
            }
            if (lh0Var.K >= 0) {
                ConnectionsManager.getInstance(lh0Var.b).cancelRequest(lh0Var.K, true);
                lh0Var.K = -1;
            }
            lh0Var.v = false;
            lh0Var.H.setLoading(false);
            lh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                lh0Var.r = 0;
                z12 = true;
                lh0Var.L++;
                lh0Var.s = false;
                arrayList7.clear();
                lh0Var.a(false);
            } else {
                z12 = true;
                lh0Var.b(str);
                lh0Var.r = 0;
                lh0Var.L++;
                lh0Var.s = false;
                arrayList7.clear();
            }
            lh0Var.d();
            c71Var.v0(0);
            c71Var.f3.N(z12);
            return;
        }
        if (view == this.s0) {
            if (i40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.u0.h1(0, 0);
            }
            ho0Var.Y(str);
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
                x10Var2.h(j10, this.U0, j15, j16, gg.s0.j3[((oo0) this.U.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof on0) {
                on0 on0Var = (on0) view;
                on0Var.a.b(this.O0, false);
                on0Var.K = str;
                on0Var.d(false);
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
            do0Var.setVisibility(8);
        } else {
            this.J0 = false;
            jo0Var.U(z15 ? 1 : 0, str);
            jo0Var.A0 = this.M0;
            x10Var3.animate().setListener(null).cancel();
            x10Var3.i(null, false);
            if (z10) {
                do0Var.e(!(jo0Var.D0 > 0), false);
                do0Var.e(jo0Var.D0 > 0, false);
            } else if (!jo0Var.N()) {
                do0Var.e(jo0Var.D0 > 0, true);
            }
            if (z10) {
                x10Var3.setVisibility(8);
            } else if (x10Var3.getVisibility() != 8) {
                x10Var3.animate().alpha(0.0f).setListener(new hd0(this, 11)).setDuration(150L).start();
            }
            x10Var3.setTag(null);
            x10Var = x10Var3;
            z11 = false;
        }
        do0Var.b(this.O0, z11);
        x10Var.c.b(this.O0, z11);
    }

    public final void S(boolean z10) {
        yl0 yl0Var;
        yl0 yl0Var2;
        yl0 yl0Var3;
        org.telegram.ui.fy fyVar;
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
                this.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.x0.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z8, false), 1, -1));
                this.x0.setOnClickListener(new l80(this, 14));
                this.G0.addView(this.x0, w7.z5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.G0.getContext());
            this.y0 = numberTextView;
            numberTextView.setTextSize(18);
            this.y0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.y0;
            int i10 = org.telegram.ui.ActionBar.i6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            this.G0.addView(this.y0, w7.z5.m(1.0f, 0, -1, uyVar.W ? 18 : 72, 0, 0));
            this.y0.setOnTouchListener(new bi.d(21));
            org.telegram.ui.ActionBar.v0 h = this.G0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.C0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.D0 = this.G0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.E0 = this.G0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.F0 = this.G0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.y0 != null) {
            jo0 jo0Var = this.c0;
            ((ViewGroup.MarginLayoutParams) this.y0.getLayoutParams()).leftMargin = AndroidUtilities.dp((uyVar.W ? 18 : 72) + (jo0Var != null && (fyVar = jo0Var.U) != null && (fyVar.a() > 0L ? 1 : (fyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.y0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (uyVar.getActionBar().getBackButton() != null && (uyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.d5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            uyVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.z0 = z10;
        HashMap hashMap = this.A0;
        if (z10) {
            AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
            uyVar.getActionBar().M(null, null);
            this.y0.a(hashMap.size(), false);
            this.C0.setVisibility(P() ? 0 : 8);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            this.F0.setVisibility(0);
            return;
        }
        uyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.x10) && (yl0Var3 = ((org.telegram.ui.x10) getChildAt(i11)).d) != null) {
                yl0Var3.l();
            }
            if (getChildAt(i11) instanceof on0) {
                ((on0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.x10 x10Var = this.N0;
        if (x10Var != null && (yl0Var2 = x10Var.d) != null) {
            yl0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.x10) && (yl0Var = ((org.telegram.ui.x10) view).d) != null) {
                yl0Var.l();
            }
        }
    }

    public final void T() {
        this.U.i();
        o(false);
        v81 v81Var = this.M;
        if (v81Var != null) {
            v81Var.x.l();
        }
    }

    @Override // org.telegram.ui.w10
    public final void a() {
        S(true);
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
        this.K0.presentFragment(M(messageObject, this.I0));
        S(false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        lo0 lo0Var = this.k0;
        if (i10 == i12) {
            this.h0.e(MessagesController.getInstance(this.I0).getChannelRecommendations(0L) != null, true);
            lo0Var.W();
            lo0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            lo0Var.W();
            lo0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.p0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                ho0 ho0Var = this.w0;
                if (obj == ho0Var.Q) {
                    ho0Var.N(true);
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
            S(false);
        } else {
            this.y0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.v0 v0Var = this.D0;
            if (v0Var != null) {
                v0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.C0 != null) {
                boolean P = P();
                int i11 = P ? 0 : 8;
                if (this.C0.getVisibility() != i11) {
                    this.C0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.C0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (P) {
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
            ((org.telegram.ui.Cells.s2) view).T(hashMap.containsKey(p10Var), true);
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
            zl0 zl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    zl0Var = this.W;
                } else if (view == this.g0) {
                    zl0Var = this.j0;
                } else if (view == this.l0) {
                    zl0Var = this.o0;
                } else if (view == this.s0) {
                    zl0Var = this.v0;
                } else {
                    on0 on0Var = this.H0;
                    if (view == on0Var) {
                        zl0Var = on0Var.b;
                    } else {
                        lh0 lh0Var = this.q0;
                        if (view == lh0Var) {
                            zl0Var = lh0Var.c;
                        } else if (view instanceof org.telegram.ui.x10) {
                            zl0Var = ((org.telegram.ui.x10) view).b;
                        }
                    }
                }
            }
            if (zl0Var != null) {
                gh.d.a(zl0Var, canvas, rectF, zl0Var, this);
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

    public on0 getDownloadsContainer() {
        return this.H0;
    }

    public int getFolderId() {
        return this.S0;
    }

    @Override // org.telegram.ui.Components.g91
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.C0;
    }

    public f91 getTabsView() {
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
        lo0 lo0Var = this.k0;
        if (lo0Var != null) {
            lo0Var.N(false);
        }
        eo0 eo0Var = this.p0;
        if (eo0Var != null) {
            eo0Var.N(false);
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

    @Override // org.telegram.ui.Components.g91
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
            } else if (getChildAt(i11) instanceof on0) {
                ((on0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.g0) {
                this.h0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.g91
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        v81 v81Var = this.M;
        if (v81Var != null) {
            v81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.g91
    public final void t(View view, View view2, int i10, int i11) {
        jo0 jo0Var = this.c0;
        org.telegram.ui.x10 x10Var = this.N0;
        if (i10 == 0) {
            if (x10Var.getVisibility() == 0) {
                x10Var.i(this.M0, false);
                jo0Var.A0 = null;
            } else {
                x10Var.i(null, false);
                org.telegram.ui.o10 o10Var = this.M0;
                jo0Var.A0 = o10Var;
                if (o10Var != null) {
                    ((org.telegram.ui.xv) o10Var).j(false, null, jo0Var.y0, jo0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view).i(this.M0, i11 == 0 && x10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view2).i(null, false);
        } else {
            jo0Var.A0 = null;
            x10Var.i(null, false);
        }
    }
}
