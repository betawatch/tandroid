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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class wo0 extends e91 implements org.telegram.ui.d10, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final /* synthetic */ int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public un0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.cy J0;
    public String K0;
    public org.telegram.ui.v00 L0;
    public final org.telegram.ui.e10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.hx P0;
    public final lw0 Q0;
    public final int R0;
    public int S0;
    public final vo0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.u1 V;
    public int V0;
    public final jo0 W;
    public NotificationCenter.ObserversGroup W0;
    public bh.b X0;
    public final s4.k a0;
    public final po0 b0;
    public final s4.b0 c0;
    public final ol0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final jo0 g0;
    public final s4.b0 h0;
    public final jm0 i0;
    public final ro0 j0;
    public final FrameLayout k0;
    public final jo0 l0;
    public final s4.b0 m0;
    public final jm0 n0;
    public final ko0 o0;
    public final uh0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final jo0 s0;
    public final s4.b0 t0;
    public final jm0 u0;
    public final no0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public wo0(Context context, org.telegram.ui.cy cyVar, int i10, int i11, int i12, long j10, org.telegram.ui.hx hxVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j10;
        this.J0 = cyVar;
        this.P0 = hxVar;
        s4.k kVar = new s4.k();
        this.a0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = bs.h;
        org.telegram.ui.lx lxVar = (org.telegram.ui.lx) this;
        this.b0 = new po0(lxVar, context, cyVar, i10, i11, kVar, cyVar.F, cyVar, context);
        if (i11 == 15) {
            ArrayList P3 = cyVar.P3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < P3.size(); i14 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.Dialog) P3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (lw0) cyVar.getFragmentView();
        ai.u1 u1Var = new ai.u1(lxVar, context, 22);
        this.V = u1Var;
        u1Var.setItemAnimator(this.a0);
        u1Var.setPivotY(0.0f);
        u1Var.setClipToPadding(false);
        u1Var.setAdapter(this.b0);
        u1Var.setVerticalScrollBarEnabled(true);
        u1Var.setInstantClick(true);
        u1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var = new s4.b0(1, false);
        this.c0 = b0Var;
        u1Var.setLayoutManager(b0Var);
        u1Var.W1 = true;
        u1Var.X1 = 0;
        u1Var.setOnScrollListener(new lo0(lxVar, cyVar, 2));
        u1Var.C0(new rc0(lxVar, 23));
        org.telegram.ui.e10 e10Var = new org.telegram.ui.e10(this.J0);
        this.M0 = e10Var;
        ai.u1 u1Var2 = e10Var.b;
        u1Var2.setClipToPadding(false);
        u1Var2.j(new oo0(lxVar, 1));
        u1Var2.C0(new rc0(lxVar, 23));
        e10Var.setUiCallback(this);
        e10Var.setVisibility(8);
        e10Var.setChatPreviewDelegate(hxVar);
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(1);
        jo0 jo0Var = new jo0(lxVar, context, b10Var, 2);
        this.W = jo0Var;
        jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var.e.setVisibility(8);
        jo0Var.setVisibility(8);
        jo0Var.addView(b10Var, 0);
        jo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(jo0Var);
        frameLayout.addView(u1Var);
        frameLayout.addView(e10Var);
        u1Var.setEmptyView(jo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        qo0 qo0Var = new qo0(lxVar);
        qo0Var.m = false;
        qo0Var.C = false;
        bs bsVar = bs.h;
        qo0Var.o(bsVar);
        qo0Var.n(350L);
        jm0 jm0Var = new jm0(context, null);
        this.i0 = jm0Var;
        jm0Var.setItemAnimator(qo0Var);
        jm0Var.setPivotY(0.0f);
        jm0Var.setVerticalScrollBarEnabled(true);
        jm0Var.setInstantClick(true);
        jm0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var2 = new s4.b0(1, false);
        this.h0 = b0Var2;
        jm0Var.setLayoutManager(b0Var2);
        jm0Var.W1 = true;
        jm0Var.X1 = 0;
        jm0Var.setClipToPadding(false);
        b10 b10Var2 = new b10(context, null);
        b10Var2.setViewType(1);
        jo0 jo0Var2 = new jo0(lxVar, context, b10Var2, 3);
        this.g0 = jo0Var2;
        jo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var2.e.setVisibility(8);
        jo0Var2.setVisibility(8);
        jo0Var2.addView(b10Var2, 0);
        jo0Var2.e(true, false);
        frameLayout2.addView(jo0Var2);
        frameLayout2.addView(jm0Var);
        jm0Var.setEmptyView(jo0Var2);
        ro0 ro0Var = new ro0(lxVar, jm0Var, context, this.H0, i12, cyVar);
        this.j0 = ro0Var;
        jm0Var.setAdapter(ro0Var);
        jm0Var.setOnScrollListener(new lo0(lxVar, cyVar, 3));
        jm0Var.C0(new rc0(lxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        io0 io0Var = new io0(lxVar);
        io0Var.m = false;
        io0Var.C = false;
        io0Var.o(bsVar);
        io0Var.n(350L);
        jm0 jm0Var2 = new jm0(context, null);
        this.n0 = jm0Var2;
        jm0Var2.setItemAnimator(io0Var);
        jm0Var2.setPivotY(0.0f);
        jm0Var2.setClipToPadding(false);
        jm0Var2.setVerticalScrollBarEnabled(true);
        jm0Var2.setInstantClick(true);
        jm0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var3 = new s4.b0(1, false);
        this.m0 = b0Var3;
        jm0Var2.setLayoutManager(b0Var3);
        jm0Var2.W1 = true;
        jm0Var2.X1 = 0;
        b10 b10Var3 = new b10(context, null);
        b10Var3.setViewType(1);
        jo0 jo0Var3 = new jo0(lxVar, context, b10Var3, 0);
        this.l0 = jo0Var3;
        jo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var3.e.setVisibility(8);
        jo0Var3.setVisibility(8);
        jo0Var3.addView(b10Var3, 0);
        jo0Var3.e(true, false);
        frameLayout3.addView(jo0Var3);
        frameLayout3.addView(jm0Var2);
        jm0Var2.setEmptyView(jo0Var3);
        ko0 ko0Var = new ko0(lxVar, jm0Var2, context, this.H0, i12);
        this.o0 = ko0Var;
        jm0Var2.setAdapter(ko0Var);
        jm0Var2.setOnScrollListener(new lo0(lxVar, cyVar, 0));
        jm0Var2.C0(new rc0(lxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        mo0 mo0Var = new mo0(lxVar);
        mo0Var.m = false;
        mo0Var.C = false;
        mo0Var.o(bsVar);
        mo0Var.n(350L);
        jm0 jm0Var3 = new jm0(context, null);
        this.u0 = jm0Var3;
        jm0Var3.setItemAnimator(mo0Var);
        jm0Var3.setPivotY(0.0f);
        jm0Var3.setVerticalScrollBarEnabled(true);
        jm0Var3.setInstantClick(true);
        jm0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.b0 b0Var4 = new s4.b0(1, false);
        this.t0 = b0Var4;
        jm0Var3.setLayoutManager(b0Var4);
        jm0Var3.W1 = true;
        jm0Var3.X1 = 0;
        jm0Var3.setClipToPadding(false);
        b10 b10Var4 = new b10(context, null);
        b10Var4.setViewType(1);
        jo0 jo0Var4 = new jo0(lxVar, context, b10Var4, 1);
        this.s0 = jo0Var4;
        jo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var4.e.setVisibility(8);
        jo0Var4.setVisibility(8);
        jo0Var4.addView(b10Var4, 0);
        jo0Var4.e(true, false);
        frameLayout4.addView(jo0Var4);
        frameLayout4.addView(jm0Var3);
        jm0Var3.setEmptyView(jo0Var4);
        no0 no0Var = new no0(lxVar, jm0Var3, context, this.H0);
        this.v0 = no0Var;
        jm0Var3.setAdapter(no0Var);
        jm0Var3.setOnScrollListener(new lo0(lxVar, cyVar, 1));
        jm0Var3.C0(new rc0(lxVar, 23));
        this.d0 = new ol0(u1Var, true);
        uh0 uh0Var = new uh0(context, cyVar);
        this.p0 = uh0Var;
        c71 c71Var = uh0Var.c;
        c71Var.setClipToPadding(false);
        c71Var.j(new oo0(lxVar, 0));
        c71Var.C0(new rc0(lxVar, 23));
        vo0 vo0Var = new vo0(lxVar);
        this.T = vo0Var;
        setAdapter(vo0Var);
    }

    public static org.telegram.ui.qn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.qn(bundle);
    }

    public static void P(FrameLayout frameLayout, jm0 jm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            jm0Var.o1(0, i10, 0, i11);
        } else {
            jm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.q0) {
            int i10 = 0;
            this.q0 = false;
            R();
            u81 u81Var = this.M;
            if (u81Var != null && u81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            po0 po0Var = this.b0;
            if (po0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((hg.o0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                po0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            vo0 vo0Var = this.T;
            ArrayList arrayList = vo0Var.a;
            ArrayList arrayList2 = vo0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((uo0) arrayList2.get(i11)).a == 3 && ((uo0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.u1 u1Var = this.V;
            if (i10 >= u1Var.getChildCount()) {
                break;
            }
            View childAt = u1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.e10) {
                arrayList.addAll(((org.telegram.ui.e10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.e10) {
                arrayList.addAll(((org.telegram.ui.e10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.e10 e10Var = this.M0;
        if (e10Var != null) {
            arrayList.addAll(e10Var.getThemeDescriptions());
        }
        jo0 jo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jo0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.y6));
        arrayList.addAll(w7.c6.a(new z6(this, 7), org.telegram.ui.ActionBar.h6.y8));
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
        org.telegram.ui.e10 e10Var;
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        jo0 jo0Var = this.W;
        if (isEmpty) {
            jo0Var.e.setVisibility(8);
        } else {
            jo0Var.e.setVisibility(0);
            jo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        po0 po0Var = this.b0;
        org.telegram.ui.nx nxVar = po0Var.U;
        long a2 = nxVar != null ? nxVar.a() : 0L;
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
            hg.o0 o0Var = (hg.o0) arrayList.get(i11);
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j10 = -((TLRPC.Chat) o0Var.f).id;
                }
                j11 = j10;
            } else if (i12 == 6) {
                hg.m0 m0Var = o0Var.g;
                long j14 = m0Var.b;
                j13 = m0Var.c;
                j12 = j14;
            } else if (i12 == 7) {
                z16 = true;
            }
            i11++;
        }
        no0 no0Var = this.v0;
        no0Var.getClass();
        if (n40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            ro0 ro0Var = this.j0;
            jm0 jm0Var = ro0Var.d;
            ArrayList arrayList2 = ro0Var.Q;
            ArrayList arrayList3 = ro0Var.R;
            ArrayList arrayList4 = ro0Var.S;
            ArrayList arrayList5 = ro0Var.P;
            hq hqVar = ro0Var.c0;
            ro0Var.W();
            if (!TextUtils.equals(str, ro0Var.b0)) {
                ro0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(hqVar);
                if (TextUtils.isEmpty(ro0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    ro0Var.N(true);
                    ro0Var.a0++;
                    z15 = false;
                    ro0Var.W = false;
                    ro0Var.X = false;
                    ro0Var.Y = false;
                    ro0Var.Z = 0;
                    if (jm0Var != null) {
                        jm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(hqVar, 1000L);
                    ro0Var.W = true;
                    ro0Var.X = true;
                    ro0Var.N(true);
                    if (jm0Var != null) {
                        z15 = false;
                        jm0Var.u0(0);
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
            ko0 ko0Var = this.o0;
            jm0 jm0Var2 = ko0Var.d;
            ArrayList arrayList6 = ko0Var.T;
            ws wsVar = ko0Var.f0;
            if (TextUtils.equals(str, ko0Var.e0)) {
                z14 = false;
            } else {
                ko0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(wsVar);
                if (TextUtils.isEmpty(ko0Var.e0)) {
                    arrayList6.clear();
                    ko0Var.N(true);
                    ko0Var.d0++;
                    z14 = false;
                    ko0Var.Z = false;
                    ko0Var.a0 = false;
                    ko0Var.b0 = false;
                    ko0Var.c0 = 0;
                    if (jm0Var2 != null) {
                        jm0Var2.u0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(wsVar, 1000L);
                    ko0Var.Z = true;
                    ko0Var.a0 = true;
                    ko0Var.N(true);
                    if (jm0Var2 != null) {
                        jm0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z14);
            if (TextUtils.isEmpty(str)) {
                ko0Var.V();
                return;
            }
            return;
        }
        uh0 uh0Var = this.p0;
        if (view == uh0Var) {
            c71 c71Var = uh0Var.c;
            ArrayList arrayList7 = uh0Var.n;
            if (TextUtils.equals(uh0Var.w, str)) {
                return;
            }
            if (uh0Var.K >= 0) {
                ConnectionsManager.getInstance(uh0Var.b).cancelRequest(uh0Var.K, true);
                uh0Var.K = -1;
            }
            uh0Var.v = false;
            uh0Var.H.setLoading(false);
            uh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                uh0Var.r = 0;
                z13 = true;
                uh0Var.L++;
                uh0Var.s = false;
                arrayList7.clear();
                uh0Var.a(false);
            } else {
                z13 = true;
                uh0Var.b(str);
                uh0Var.r = 0;
                uh0Var.L++;
                uh0Var.s = false;
                arrayList7.clear();
            }
            uh0Var.d();
            c71Var.u0(0);
            c71Var.W2.N(z13);
            return;
        }
        if (view == this.r0) {
            if (n40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            no0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j15 = a2;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.e10) {
                org.telegram.ui.e10 e10Var2 = (org.telegram.ui.e10) view;
                e10Var2.setUseFromUserAsAvatar(j15 != 0);
                e10Var2.c.b(this.N0, false);
                e10Var2.h(j11, this.T0, j16, j17, hg.q0.a3[((uo0) this.T.a.get(i10)).b], z16, str, z10);
                return;
            }
            if (view instanceof un0) {
                un0 un0Var = (un0) view;
                un0Var.a.b(this.N0, false);
                un0Var.K = str;
                un0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.e10 e10Var3 = this.M0;
        if (!(j11 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z17 = true;
            e10Var3.setTag(1);
            e10Var3.i(this.L0, false);
            e10Var3.animate().setListener(null).cancel();
            if (z10) {
                e10Var3.setVisibility(0);
                e10Var3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (e10Var3.getVisibility() != 0) {
                    e10Var3.setVisibility(0);
                    e10Var3.setAlpha(0.0f);
                } else {
                    z17 = z10;
                }
                e10Var3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = z17;
            }
            z12 = false;
            long j18 = j11;
            e10Var = e10Var3;
            this.M0.h(j18, this.T0, j12, j13, null, z16, str, z11);
            jo0Var.setVisibility(8);
        } else {
            this.I0 = false;
            po0Var.U(z16 ? 1 : 0, str);
            po0Var.A0 = this.L0;
            e10Var3.animate().setListener(null).cancel();
            e10Var3.i(null, false);
            if (z10) {
                jo0Var.e(!(po0Var.D0 > 0), false);
                jo0Var.e(po0Var.D0 > 0, false);
            } else if (!po0Var.N()) {
                jo0Var.e(po0Var.D0 > 0, true);
            }
            if (z10) {
                e10Var3.setVisibility(8);
            } else if (e10Var3.getVisibility() != 8) {
                e10Var3.animate().alpha(0.0f).setListener(new c80(this, 16)).setDuration(150L).start();
            }
            e10Var3.setTag(null);
            e10Var = e10Var3;
            z12 = false;
        }
        jo0Var.b(this.N0, z12);
        e10Var.c.b(this.N0, z12);
    }

    public final void Q(boolean z10) {
        im0 im0Var;
        im0 im0Var2;
        im0 im0Var3;
        org.telegram.ui.nx nxVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.cy cyVar = this.J0;
        if (z10 && cyVar.getActionBar().t()) {
            return;
        }
        if (z10 && !cyVar.getActionBar().a("search_view_pager")) {
            this.F0 = cyVar.getActionBar().j("search_view_pager");
            if (cyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z8, false), 1, -1));
                this.w0.setOnClickListener(new u80(this, 13));
                this.F0.addView(this.w0, w7.z5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.h6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            this.F0.addView(this.x0, w7.z5.m(1.0f, 0, -1, cyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new di.d(21));
            org.telegram.ui.ActionBar.u0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            po0 po0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((cyVar.W ? 18 : 72) + (po0Var != null && (nxVar = po0Var.U) != null && (nxVar.a() > 0L ? 1 : (nxVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (cyVar.getActionBar().getBackButton() != null && (cyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            cyVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
            cyVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        cyVar.getActionBar().s();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.e10) && (im0Var3 = ((org.telegram.ui.e10) getChildAt(i11)).d) != null) {
                im0Var3.l();
            }
            if (getChildAt(i11) instanceof un0) {
                ((un0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.e10 e10Var = this.M0;
        if (e10Var != null && (im0Var2 = e10Var.d) != null) {
            im0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.e10) && (im0Var = ((org.telegram.ui.e10) view).d) != null) {
                im0Var.l();
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        u81 u81Var = this.M;
        if (u81Var != null) {
            u81Var.x.l();
        }
    }

    @Override // org.telegram.ui.d10
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.d10
    public final boolean b(org.telegram.ui.w00 w00Var) {
        return this.z0.containsKey(w00Var);
    }

    @Override // org.telegram.ui.d10
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.ui.d10
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.w00 w00Var = new org.telegram.ui.w00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(w00Var)) {
            hashMap.remove(w00Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(w00Var, messageObject);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y8, false), PorterDuff.Mode.SRC_IN));
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
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.w00) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(w00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).b(i10, hashMap.containsKey(w00Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.m7) {
            ((org.telegram.ui.Cells.m7) view).f(hashMap.containsKey(w00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(w00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(w00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(w00Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        ro0 ro0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            ro0Var.W();
            ro0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            ro0Var.W();
            ro0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                no0 no0Var = this.v0;
                if (obj == no0Var.Q) {
                    no0Var.N(true);
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
            jm0 jm0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    jm0Var = this.V;
                } else if (view == this.f0) {
                    jm0Var = this.i0;
                } else if (view == this.k0) {
                    jm0Var = this.n0;
                } else if (view == this.r0) {
                    jm0Var = this.u0;
                } else {
                    un0 un0Var = this.G0;
                    if (view == un0Var) {
                        jm0Var = un0Var.b;
                    } else {
                        uh0 uh0Var = this.p0;
                        if (view == uh0Var) {
                            jm0Var = uh0Var.c;
                        } else if (view instanceof org.telegram.ui.e10) {
                            jm0Var = ((org.telegram.ui.e10) view).b;
                        }
                    }
                }
            }
            if (jm0Var != null) {
                hh.d.a(jm0Var, canvas, rectF, jm0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.e10 e10Var = this.M0;
                if (e10Var.getVisibility() == 0) {
                    ai.u1 u1Var = e10Var.b;
                    hh.d.a(u1Var, canvas, rectF, u1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.d10
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.o0> getCurrentSearchFilters() {
        return this.A0;
    }

    public un0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.e91
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.u0 getSpeedItem() {
        return this.B0;
    }

    public d91 getTabsView() {
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
        ro0 ro0Var = this.j0;
        if (ro0Var != null) {
            ro0Var.N(false);
        }
        ko0 ko0Var = this.o0;
        if (ko0Var != null) {
            ko0Var.N(false);
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

    @Override // org.telegram.ui.Components.e91
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.X0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.v00 v00Var) {
        this.L0 = v00Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.e10) {
                ((org.telegram.ui.e10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof un0) {
                ((un0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.e91
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        u81 u81Var = this.M;
        if (u81Var != null) {
            u81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.e91
    public final void t(View view, View view2, int i10, int i11) {
        po0 po0Var = this.b0;
        org.telegram.ui.e10 e10Var = this.M0;
        if (i10 == 0) {
            if (e10Var.getVisibility() == 0) {
                e10Var.i(this.L0, false);
                po0Var.A0 = null;
            } else {
                e10Var.i(null, false);
                org.telegram.ui.v00 v00Var = this.L0;
                po0Var.A0 = v00Var;
                if (v00Var != null) {
                    ((org.telegram.ui.hv) v00Var).i(false, null, po0Var.y0, po0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.e10) {
            ((org.telegram.ui.e10) view).i(this.L0, i11 == 0 && e10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.e10) {
            ((org.telegram.ui.e10) view2).i(null, false);
        } else {
            po0Var.A0 = null;
            e10Var.i(null, false);
        }
    }
}
