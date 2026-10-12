package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class zo0 extends k91 implements org.telegram.ui.b20, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final /* synthetic */ int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public yn0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.yy J0;
    public String K0;
    public org.telegram.ui.t10 L0;
    public final org.telegram.ui.c20 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.ey P0;
    public final ow0 Q0;
    public final int R0;
    public int S0;
    public final yo0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final bi.o0 V;
    public int V0;
    public final mo0 W;
    public NotificationCenter.ObserversGroup W0;
    public bh.b X0;
    public final s4.k a0;
    public final so0 b0;
    public final s4.b0 c0;
    public final rl0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final mo0 g0;
    public final s4.b0 h0;
    public final mm0 i0;
    public final uo0 j0;
    public final FrameLayout k0;
    public final mo0 l0;
    public final s4.b0 m0;
    public final mm0 n0;
    public final no0 o0;
    public final zh0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final mo0 s0;
    public final s4.b0 t0;
    public final mm0 u0;
    public final qo0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public zo0(Context context, org.telegram.ui.yy yyVar, int i10, int i11, int i12, long j10, org.telegram.ui.ey eyVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j10;
        this.J0 = yyVar;
        this.P0 = eyVar;
        s4.k kVar = new s4.k();
        this.a0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = es.h;
        org.telegram.ui.iy iyVar = (org.telegram.ui.iy) this;
        this.b0 = new so0(iyVar, context, yyVar, i10, i11, kVar, yyVar.F, yyVar, context);
        if (i11 == 15) {
            ArrayList O3 = yyVar.O3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < O3.size(); i14 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.Dialog) O3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (ow0) yyVar.getFragmentView();
        bi.o0 o0Var = new bi.o0(iyVar, context, 21);
        this.V = o0Var;
        o0Var.setItemAnimator(this.a0);
        o0Var.setPivotY(0.0f);
        o0Var.setClipToPadding(false);
        o0Var.setAdapter(this.b0);
        o0Var.setVerticalScrollBarEnabled(true);
        o0Var.setInstantClick(true);
        o0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var = new s4.b0(1, false);
        this.c0 = b0Var;
        o0Var.setLayoutManager(b0Var);
        o0Var.W1 = true;
        o0Var.X1 = 0;
        o0Var.setOnScrollListener(new oo0(iyVar, yyVar, 2));
        o0Var.C0(new yc0(iyVar, 24));
        org.telegram.ui.c20 c20Var = new org.telegram.ui.c20(this.J0);
        this.M0 = c20Var;
        bi.o0 o0Var2 = c20Var.b;
        o0Var2.setClipToPadding(false);
        o0Var2.j(new ro0(iyVar, 1));
        o0Var2.C0(new yc0(iyVar, 24));
        c20Var.setUiCallback(this);
        c20Var.setVisibility(8);
        c20Var.setChatPreviewDelegate(eyVar);
        f10 f10Var = new f10(context, null);
        f10Var.setViewType(1);
        mo0 mo0Var = new mo0(iyVar, context, f10Var, 2);
        this.W = mo0Var;
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
        mo0Var.setVisibility(8);
        mo0Var.addView(f10Var, 0);
        mo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(mo0Var);
        frameLayout.addView(o0Var);
        frameLayout.addView(c20Var);
        o0Var.setEmptyView(mo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        to0 to0Var = new to0(iyVar);
        to0Var.m = false;
        to0Var.C = false;
        es esVar = es.h;
        to0Var.o(esVar);
        to0Var.n(350L);
        mm0 mm0Var = new mm0(context, null);
        this.i0 = mm0Var;
        mm0Var.setItemAnimator(to0Var);
        mm0Var.setPivotY(0.0f);
        mm0Var.setVerticalScrollBarEnabled(true);
        mm0Var.setInstantClick(true);
        mm0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var2 = new s4.b0(1, false);
        this.h0 = b0Var2;
        mm0Var.setLayoutManager(b0Var2);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        mm0Var.setClipToPadding(false);
        f10 f10Var2 = new f10(context, null);
        f10Var2.setViewType(1);
        mo0 mo0Var2 = new mo0(iyVar, context, f10Var2, 3);
        this.g0 = mo0Var2;
        mo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var2.e.setVisibility(8);
        mo0Var2.setVisibility(8);
        mo0Var2.addView(f10Var2, 0);
        mo0Var2.e(true, false);
        frameLayout2.addView(mo0Var2);
        frameLayout2.addView(mm0Var);
        mm0Var.setEmptyView(mo0Var2);
        uo0 uo0Var = new uo0(iyVar, mm0Var, context, this.H0, i12, yyVar);
        this.j0 = uo0Var;
        mm0Var.setAdapter(uo0Var);
        mm0Var.setOnScrollListener(new oo0(iyVar, yyVar, 3));
        mm0Var.C0(new yc0(iyVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        lo0 lo0Var = new lo0(iyVar);
        lo0Var.m = false;
        lo0Var.C = false;
        lo0Var.o(esVar);
        lo0Var.n(350L);
        mm0 mm0Var2 = new mm0(context, null);
        this.n0 = mm0Var2;
        mm0Var2.setItemAnimator(lo0Var);
        mm0Var2.setPivotY(0.0f);
        mm0Var2.setClipToPadding(false);
        mm0Var2.setVerticalScrollBarEnabled(true);
        mm0Var2.setInstantClick(true);
        mm0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var3 = new s4.b0(1, false);
        this.m0 = b0Var3;
        mm0Var2.setLayoutManager(b0Var3);
        mm0Var2.W1 = true;
        mm0Var2.X1 = 0;
        f10 f10Var3 = new f10(context, null);
        f10Var3.setViewType(1);
        mo0 mo0Var3 = new mo0(iyVar, context, f10Var3, 0);
        this.l0 = mo0Var3;
        mo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var3.e.setVisibility(8);
        mo0Var3.setVisibility(8);
        mo0Var3.addView(f10Var3, 0);
        mo0Var3.e(true, false);
        frameLayout3.addView(mo0Var3);
        frameLayout3.addView(mm0Var2);
        mm0Var2.setEmptyView(mo0Var3);
        no0 no0Var = new no0(iyVar, mm0Var2, context, this.H0, i12);
        this.o0 = no0Var;
        mm0Var2.setAdapter(no0Var);
        mm0Var2.setOnScrollListener(new oo0(iyVar, yyVar, 0));
        mm0Var2.C0(new yc0(iyVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        po0 po0Var = new po0(iyVar);
        po0Var.m = false;
        po0Var.C = false;
        po0Var.o(esVar);
        po0Var.n(350L);
        mm0 mm0Var3 = new mm0(context, null);
        this.u0 = mm0Var3;
        mm0Var3.setItemAnimator(po0Var);
        mm0Var3.setPivotY(0.0f);
        mm0Var3.setVerticalScrollBarEnabled(true);
        mm0Var3.setInstantClick(true);
        mm0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var4 = new s4.b0(1, false);
        this.t0 = b0Var4;
        mm0Var3.setLayoutManager(b0Var4);
        mm0Var3.W1 = true;
        mm0Var3.X1 = 0;
        mm0Var3.setClipToPadding(false);
        f10 f10Var4 = new f10(context, null);
        f10Var4.setViewType(1);
        mo0 mo0Var4 = new mo0(iyVar, context, f10Var4, 1);
        this.s0 = mo0Var4;
        mo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var4.e.setVisibility(8);
        mo0Var4.setVisibility(8);
        mo0Var4.addView(f10Var4, 0);
        mo0Var4.e(true, false);
        frameLayout4.addView(mo0Var4);
        frameLayout4.addView(mm0Var3);
        mm0Var3.setEmptyView(mo0Var4);
        qo0 qo0Var = new qo0(iyVar, mm0Var3, context, this.H0);
        this.v0 = qo0Var;
        mm0Var3.setAdapter(qo0Var);
        mm0Var3.setOnScrollListener(new oo0(iyVar, yyVar, 1));
        mm0Var3.C0(new yc0(iyVar, 24));
        this.d0 = new rl0(o0Var, true);
        zh0 zh0Var = new zh0(context, yyVar);
        this.p0 = zh0Var;
        h71 h71Var = zh0Var.c;
        h71Var.setClipToPadding(false);
        h71Var.j(new ro0(iyVar, 0));
        h71Var.C0(new yc0(iyVar, 24));
        yo0 yo0Var = new yo0(iyVar);
        this.T = yo0Var;
        setAdapter(yo0Var);
    }

    public static org.telegram.ui.fo K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.fo(bundle);
    }

    public static void P(FrameLayout frameLayout, mm0 mm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            mm0Var.o1(0, i10, 0, i11);
        } else {
            mm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.q0) {
            int i10 = 0;
            this.q0 = false;
            R();
            a91 a91Var = this.M;
            if (a91Var != null && a91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            so0 so0Var = this.b0;
            if (so0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((hg.p0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                so0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            yo0 yo0Var = this.T;
            ArrayList arrayList = yo0Var.a;
            ArrayList arrayList2 = yo0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((xo0) arrayList2.get(i11)).a == 3 && ((xo0) arrayList2.get(i11)).b == i10) {
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
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.c20) {
                arrayList.addAll(((org.telegram.ui.c20) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.c20) {
                arrayList.addAll(((org.telegram.ui.c20) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.c20 c20Var = this.M0;
        if (c20Var != null) {
            arrayList.addAll(c20Var.getThemeDescriptions());
        }
        mo0 mo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.i6(mo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(mo0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.y6));
        arrayList.addAll(w7.d6.a(new b7(this, 7), org.telegram.ui.ActionBar.g6.y8));
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
        boolean z11;
        boolean z12;
        org.telegram.ui.c20 c20Var;
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        mo0 mo0Var = this.W;
        if (isEmpty) {
            mo0Var.e.setVisibility(8);
        } else {
            mo0Var.e.setVisibility(0);
            mo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        so0 so0Var = this.b0;
        org.telegram.ui.ky kyVar = so0Var.U;
        long a2 = kyVar != null ? kyVar.a() : 0L;
        long j11 = i10 == 0 ? 0L : a2;
        int i11 = 0;
        boolean z16 = false;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            hg.p0 p0Var = (hg.p0) arrayList.get(i11);
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j10 = -((TLRPC.Chat) p0Var.f).id;
                }
                j11 = j10;
            } else if (i12 == 6) {
                hg.n0 n0Var = p0Var.g;
                long j14 = n0Var.b;
                j13 = n0Var.c;
                j12 = j14;
            } else if (i12 == 7) {
                z16 = true;
            }
            i11++;
        }
        qo0 qo0Var = this.v0;
        qo0Var.getClass();
        if (r40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            uo0 uo0Var = this.j0;
            mm0 mm0Var = uo0Var.d;
            ArrayList arrayList2 = uo0Var.Q;
            ArrayList arrayList3 = uo0Var.R;
            ArrayList arrayList4 = uo0Var.S;
            ArrayList arrayList5 = uo0Var.P;
            kq kqVar = uo0Var.c0;
            uo0Var.W();
            if (!TextUtils.equals(str, uo0Var.b0)) {
                uo0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(kqVar);
                if (TextUtils.isEmpty(uo0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    uo0Var.N(true);
                    uo0Var.a0++;
                    z15 = false;
                    uo0Var.W = false;
                    uo0Var.X = false;
                    uo0Var.Y = false;
                    uo0Var.Z = 0;
                    if (mm0Var != null) {
                        mm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(kqVar, 1000L);
                    uo0Var.W = true;
                    uo0Var.X = true;
                    uo0Var.N(true);
                    if (mm0Var != null) {
                        z15 = false;
                        mm0Var.u0(0);
                    }
                }
                this.g0.b(this.N0, z15);
                return;
            }
            z15 = false;
            this.g0.b(this.N0, z15);
            return;
        }
        if (view == this.k0) {
            no0 no0Var = this.o0;
            mm0 mm0Var2 = no0Var.d;
            ArrayList arrayList6 = no0Var.T;
            zs zsVar = no0Var.f0;
            if (TextUtils.equals(str, no0Var.e0)) {
                z14 = false;
            } else {
                no0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(zsVar);
                if (TextUtils.isEmpty(no0Var.e0)) {
                    arrayList6.clear();
                    no0Var.N(true);
                    no0Var.d0++;
                    z14 = false;
                    no0Var.Z = false;
                    no0Var.a0 = false;
                    no0Var.b0 = false;
                    no0Var.c0 = 0;
                    if (mm0Var2 != null) {
                        mm0Var2.u0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(zsVar, 1000L);
                    no0Var.Z = true;
                    no0Var.a0 = true;
                    no0Var.N(true);
                    if (mm0Var2 != null) {
                        mm0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z14);
            if (TextUtils.isEmpty(str)) {
                no0Var.V();
                return;
            }
            return;
        }
        zh0 zh0Var = this.p0;
        if (view == zh0Var) {
            h71 h71Var = zh0Var.c;
            ArrayList arrayList7 = zh0Var.n;
            if (TextUtils.equals(zh0Var.w, str)) {
                return;
            }
            if (zh0Var.K >= 0) {
                ConnectionsManager.getInstance(zh0Var.b).cancelRequest(zh0Var.K, true);
                zh0Var.K = -1;
            }
            zh0Var.v = false;
            zh0Var.H.setLoading(false);
            zh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                zh0Var.r = 0;
                z13 = true;
                zh0Var.L++;
                zh0Var.s = false;
                arrayList7.clear();
                zh0Var.a(false);
            } else {
                z13 = true;
                zh0Var.b(str);
                zh0Var.r = 0;
                zh0Var.L++;
                zh0Var.s = false;
                arrayList7.clear();
            }
            zh0Var.d();
            h71Var.u0(0);
            h71Var.W2.N(z13);
            return;
        }
        if (view == this.r0) {
            if (r40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            qo0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j15 = a2;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.c20) {
                org.telegram.ui.c20 c20Var2 = (org.telegram.ui.c20) view;
                c20Var2.setUseFromUserAsAvatar(j15 != 0);
                c20Var2.c.b(this.N0, false);
                c20Var2.h(j11, this.T0, j16, j17, hg.r0.a3[((xo0) this.T.a.get(i10)).b], z16, str, z10);
                return;
            }
            if (view instanceof yn0) {
                yn0 yn0Var = (yn0) view;
                yn0Var.a.b(this.N0, false);
                yn0Var.K = str;
                yn0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.c20 c20Var3 = this.M0;
        if (!(j11 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z17 = true;
            c20Var3.setTag(1);
            c20Var3.i(this.L0, false);
            c20Var3.animate().setListener(null).cancel();
            if (z10) {
                c20Var3.setVisibility(0);
                c20Var3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (c20Var3.getVisibility() != 0) {
                    c20Var3.setVisibility(0);
                    c20Var3.setAlpha(0.0f);
                } else {
                    z17 = z10;
                }
                c20Var3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = z17;
            }
            z12 = false;
            long j18 = j11;
            c20Var = c20Var3;
            this.M0.h(j18, this.T0, j12, j13, null, z16, str, z11);
            mo0Var.setVisibility(8);
        } else {
            this.I0 = false;
            so0Var.U(z16 ? 1 : 0, str);
            so0Var.A0 = this.L0;
            c20Var3.animate().setListener(null).cancel();
            c20Var3.i(null, false);
            if (z10) {
                mo0Var.e(!(so0Var.D0 > 0), false);
                mo0Var.e(so0Var.D0 > 0, false);
            } else if (!so0Var.N()) {
                mo0Var.e(so0Var.D0 > 0, true);
            }
            if (z10) {
                c20Var3.setVisibility(8);
            } else if (c20Var3.getVisibility() != 8) {
                c20Var3.animate().alpha(0.0f).setListener(new k90(this, 14)).setDuration(150L).start();
            }
            c20Var3.setTag(null);
            c20Var = c20Var3;
            z12 = false;
        }
        mo0Var.b(this.N0, z12);
        c20Var.c.b(this.N0, z12);
    }

    public final void Q(boolean z10) {
        lm0 lm0Var;
        lm0 lm0Var2;
        lm0 lm0Var3;
        org.telegram.ui.ky kyVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.yy yyVar = this.J0;
        if (z10 && yyVar.getActionBar().t()) {
            return;
        }
        if (z10 && !yyVar.getActionBar().a("search_view_pager")) {
            this.F0 = yyVar.getActionBar().j("search_view_pager");
            if (yyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.z8, false), 1, -1));
                this.w0.setOnClickListener(new z80(this, 13));
                this.F0.addView(this.w0, w7.a6.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.g6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
            this.F0.addView(this.x0, w7.a6.m(1.0f, 0, -1, yyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new ci.d(21));
            org.telegram.ui.ActionBar.u0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            so0 so0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((yyVar.W ? 18 : 72) + (so0Var != null && (kyVar = so0Var.U) != null && (kyVar.a() > 0L ? 1 : (kyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (yyVar.getActionBar().getBackButton() != null && (yyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            yyVar.getActionBar().setBackButtonDrawable(f2Var);
            f2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(yyVar.getParentActivity().getCurrentFocus());
            yyVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        yyVar.getActionBar().s();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.c20) && (lm0Var3 = ((org.telegram.ui.c20) getChildAt(i11)).d) != null) {
                lm0Var3.l();
            }
            if (getChildAt(i11) instanceof yn0) {
                ((yn0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.c20 c20Var = this.M0;
        if (c20Var != null && (lm0Var2 = c20Var.d) != null) {
            lm0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.c20) && (lm0Var = ((org.telegram.ui.c20) view).d) != null) {
                lm0Var.l();
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        a91 a91Var = this.M;
        if (a91Var != null) {
            a91Var.x.l();
        }
    }

    @Override // org.telegram.ui.b20
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.b20
    public final boolean b(org.telegram.ui.u10 u10Var) {
        return this.z0.containsKey(u10Var);
    }

    @Override // org.telegram.ui.b20
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.ui.b20
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(u10Var)) {
            hashMap.remove(u10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(u10Var, messageObject);
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
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.E0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.u10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(u10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(u10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(u10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(u10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(u10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(u10Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        uo0 uo0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            uo0Var.W();
            uo0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            uo0Var.W();
            uo0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                qo0 qo0Var = this.v0;
                if (obj == qo0Var.Q) {
                    qo0Var.N(true);
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
            mm0 mm0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    mm0Var = this.V;
                } else if (view == this.f0) {
                    mm0Var = this.i0;
                } else if (view == this.k0) {
                    mm0Var = this.n0;
                } else if (view == this.r0) {
                    mm0Var = this.u0;
                } else {
                    yn0 yn0Var = this.G0;
                    if (view == yn0Var) {
                        mm0Var = yn0Var.b;
                    } else {
                        zh0 zh0Var = this.p0;
                        if (view == zh0Var) {
                            mm0Var = zh0Var.c;
                        } else if (view instanceof org.telegram.ui.c20) {
                            mm0Var = ((org.telegram.ui.c20) view).b;
                        }
                    }
                }
            }
            if (mm0Var != null) {
                hh.d.a(mm0Var, canvas, rectF, mm0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.c20 c20Var = this.M0;
                if (c20Var.getVisibility() == 0) {
                    bi.o0 o0Var = c20Var.b;
                    hh.d.a(o0Var, canvas, rectF, o0Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.b20
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public yn0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.k91
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.u0 getSpeedItem() {
        return this.B0;
    }

    public j91 getTabsView() {
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
        uo0 uo0Var = this.j0;
        if (uo0Var != null) {
            uo0Var.N(false);
        }
        no0 no0Var = this.o0;
        if (no0Var != null) {
            no0Var.N(false);
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

    @Override // org.telegram.ui.Components.k91
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.X0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.t10 t10Var) {
        this.L0 = t10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.c20) {
                ((org.telegram.ui.c20) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof yn0) {
                ((yn0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        a91 a91Var = this.M;
        if (a91Var != null) {
            a91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.k91
    public final void t(View view, View view2, int i10, int i11) {
        so0 so0Var = this.b0;
        org.telegram.ui.c20 c20Var = this.M0;
        if (i10 == 0) {
            if (c20Var.getVisibility() == 0) {
                c20Var.i(this.L0, false);
                so0Var.A0 = null;
            } else {
                c20Var.i(null, false);
                org.telegram.ui.t10 t10Var = this.L0;
                so0Var.A0 = t10Var;
                if (t10Var != null) {
                    ((org.telegram.ui.aw) t10Var).i(false, null, so0Var.y0, so0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.c20) {
            ((org.telegram.ui.c20) view).i(this.L0, i11 == 0 && c20Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.c20) {
            ((org.telegram.ui.c20) view2).i(null, false);
        } else {
            so0Var.A0 = null;
            c20Var.i(null, false);
        }
    }
}
