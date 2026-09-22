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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class no0 extends z81 implements org.telegram.ui.w10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final /* synthetic */ int Z0 = 0;
    public final HashMap A0;
    public final ArrayList B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.v0 F0;
    public org.telegram.ui.ActionBar.z G0;
    public kn0 H0;
    public final int I0;
    public boolean J0;
    public final org.telegram.ui.uy K0;
    public String L0;
    public org.telegram.ui.o10 M0;
    public final org.telegram.ui.x10 N0;
    public int O0;
    public boolean P0;
    public final org.telegram.ui.zx Q0;
    public final cw0 R0;
    public final int S0;
    public int T0;
    public final mo0 U;
    public final long U0;
    public final FrameLayout V;
    public int V0;
    public final ai.w0 W;
    public int W0;
    public NotificationCenter.ObserversGroup X0;
    public ah.c Y0;
    public final ao0 a0;
    public final s4.j b0;
    public final go0 c0;
    public final s4.c0 d0;
    public final dl0 e0;
    public boolean f0;
    public final FrameLayout g0;
    public final ao0 h0;
    public final s4.c0 i0;
    public final yl0 j0;
    public final io0 k0;
    public final FrameLayout l0;
    public final ao0 m0;
    public final s4.c0 n0;
    public final yl0 o0;
    public final bo0 p0;
    public final lh0 q0;
    public boolean r0;
    public final FrameLayout s0;
    public final ao0 t0;
    public final s4.c0 u0;
    public final yl0 v0;
    public final eo0 w0;
    public ImageView x0;
    public NumberTextView y0;
    public boolean z0;

    public no0(Context context, org.telegram.ui.uy uyVar, int i10, int i11, int i12, long j3, org.telegram.ui.zx zxVar) {
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
        this.c0 = new go0(eyVar, context, uyVar, i10, i11, jVar, uyVar.F, uyVar, context);
        if (i11 == 15) {
            ArrayList R3 = uyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.c0.q0 = arrayList;
        }
        this.R0 = (cw0) uyVar.getFragmentView();
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
        w0Var.setOnScrollListener(new co0(eyVar, uyVar, 2));
        w0Var.D0(new jc0(eyVar, 24));
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(this.K0);
        this.N0 = x10Var;
        ai.w0 w0Var2 = x10Var.b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new fo0(eyVar, 1));
        w0Var2.D0(new jc0(eyVar, 24));
        x10Var.setUiCallback(this);
        x10Var.setVisibility(8);
        x10Var.setChatPreviewDelegate(zxVar);
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(1);
        ao0 ao0Var = new ao0(eyVar, context, t00Var, 2);
        this.a0 = ao0Var;
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
        ao0Var.setVisibility(8);
        ao0Var.addView(t00Var, 0);
        ao0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.addView(ao0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(x10Var);
        w0Var.setEmptyView(ao0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g0 = frameLayout2;
        ho0 ho0Var = new ho0(eyVar);
        ho0Var.m = false;
        ho0Var.C = false;
        qr qrVar = qr.h;
        ho0Var.o(qrVar);
        ho0Var.n(350L);
        yl0 yl0Var = new yl0(context, null);
        this.j0 = yl0Var;
        yl0Var.setItemAnimator(ho0Var);
        yl0Var.setPivotY(0.0f);
        yl0Var.setVerticalScrollBarEnabled(true);
        yl0Var.setInstantClick(true);
        yl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.i0 = c0Var2;
        yl0Var.setLayoutManager(c0Var2);
        yl0Var.Y1 = true;
        yl0Var.Z1 = 0;
        yl0Var.setClipToPadding(false);
        t00 t00Var2 = new t00(context, null);
        t00Var2.setViewType(1);
        ao0 ao0Var2 = new ao0(eyVar, context, t00Var2, 3);
        this.h0 = ao0Var2;
        ao0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var2.e.setVisibility(8);
        ao0Var2.setVisibility(8);
        ao0Var2.addView(t00Var2, 0);
        ao0Var2.e(true, false);
        frameLayout2.addView(ao0Var2);
        frameLayout2.addView(yl0Var);
        yl0Var.setEmptyView(ao0Var2);
        io0 io0Var = new io0(eyVar, yl0Var, context, this.I0, i12, uyVar);
        this.k0 = io0Var;
        yl0Var.setAdapter(io0Var);
        yl0Var.setOnScrollListener(new co0(eyVar, uyVar, 3));
        yl0Var.D0(new jc0(eyVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.l0 = frameLayout3;
        zn0 zn0Var = new zn0(eyVar);
        zn0Var.m = false;
        zn0Var.C = false;
        zn0Var.o(qrVar);
        zn0Var.n(350L);
        yl0 yl0Var2 = new yl0(context, null);
        this.o0 = yl0Var2;
        yl0Var2.setItemAnimator(zn0Var);
        yl0Var2.setPivotY(0.0f);
        yl0Var2.setClipToPadding(false);
        yl0Var2.setVerticalScrollBarEnabled(true);
        yl0Var2.setInstantClick(true);
        yl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.n0 = c0Var3;
        yl0Var2.setLayoutManager(c0Var3);
        yl0Var2.Y1 = true;
        yl0Var2.Z1 = 0;
        t00 t00Var3 = new t00(context, null);
        t00Var3.setViewType(1);
        ao0 ao0Var3 = new ao0(eyVar, context, t00Var3, 0);
        this.m0 = ao0Var3;
        ao0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var3.e.setVisibility(8);
        ao0Var3.setVisibility(8);
        ao0Var3.addView(t00Var3, 0);
        ao0Var3.e(true, false);
        frameLayout3.addView(ao0Var3);
        frameLayout3.addView(yl0Var2);
        yl0Var2.setEmptyView(ao0Var3);
        bo0 bo0Var = new bo0(eyVar, yl0Var2, context, this.I0, i12);
        this.p0 = bo0Var;
        yl0Var2.setAdapter(bo0Var);
        yl0Var2.setOnScrollListener(new co0(eyVar, uyVar, 0));
        yl0Var2.D0(new jc0(eyVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.s0 = frameLayout4;
        do0 do0Var = new do0(eyVar);
        do0Var.m = false;
        do0Var.C = false;
        do0Var.o(qrVar);
        do0Var.n(350L);
        yl0 yl0Var3 = new yl0(context, null);
        this.v0 = yl0Var3;
        yl0Var3.setItemAnimator(do0Var);
        yl0Var3.setPivotY(0.0f);
        yl0Var3.setVerticalScrollBarEnabled(true);
        yl0Var3.setInstantClick(true);
        yl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.u0 = c0Var4;
        yl0Var3.setLayoutManager(c0Var4);
        yl0Var3.Y1 = true;
        yl0Var3.Z1 = 0;
        yl0Var3.setClipToPadding(false);
        t00 t00Var4 = new t00(context, null);
        t00Var4.setViewType(1);
        ao0 ao0Var4 = new ao0(eyVar, context, t00Var4, 1);
        this.t0 = ao0Var4;
        ao0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var4.e.setVisibility(8);
        ao0Var4.setVisibility(8);
        ao0Var4.addView(t00Var4, 0);
        ao0Var4.e(true, false);
        frameLayout4.addView(ao0Var4);
        frameLayout4.addView(yl0Var3);
        yl0Var3.setEmptyView(ao0Var4);
        eo0 eo0Var = new eo0(eyVar, yl0Var3, context, this.I0);
        this.w0 = eo0Var;
        yl0Var3.setAdapter(eo0Var);
        yl0Var3.setOnScrollListener(new co0(eyVar, uyVar, 1));
        yl0Var3.D0(new jc0(eyVar, 24));
        this.e0 = new dl0(w0Var, true);
        lh0 lh0Var = new lh0(context, uyVar);
        this.q0 = lh0Var;
        u61 u61Var = lh0Var.c;
        u61Var.setClipToPadding(false);
        u61Var.j(new fo0(eyVar, 0));
        u61Var.D0(new jc0(eyVar, 24));
        mo0 mo0Var = new mo0(eyVar);
        this.U = mo0Var;
        setAdapter(mo0Var);
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

    public static void Q(FrameLayout frameLayout, yl0 yl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            yl0Var.p1(0, i10, 0, i11);
        } else {
            yl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void K() {
        if (this.r0) {
            int i10 = 0;
            this.r0 = false;
            S();
            o81 o81Var = this.M;
            if (o81Var != null && o81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            go0 go0Var = this.c0;
            if (go0Var != null) {
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
                go0Var.U(i10, str);
            }
        }
    }

    public final int M(int i10) {
        int i11 = 0;
        while (true) {
            mo0 mo0Var = this.U;
            ArrayList arrayList = mo0Var.a;
            ArrayList arrayList2 = mo0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((lo0) arrayList2.get(i11)).a == 3 && ((lo0) arrayList2.get(i11)).b == i10) {
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
            if ((childAt instanceof org.telegram.ui.Cells.j6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.m4)) {
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
        ao0 ao0Var = this.a0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.addAll(w7.b6.a(new x6(this, 7), org.telegram.ui.ActionBar.j6.y8));
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
        ao0 ao0Var = this.a0;
        if (isEmpty) {
            ao0Var.e.setVisibility(8);
        } else {
            ao0Var.e.setVisibility(0);
            ao0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        go0 go0Var = this.c0;
        org.telegram.ui.gy gyVar = go0Var.U;
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
        eo0 eo0Var = this.w0;
        eo0Var.getClass();
        if (e40.X(str, null) == null) {
            K();
        }
        if (view == this.g0) {
            MessagesController.getInstance(this.I0).getChannelRecommendations(0L);
            io0 io0Var = this.k0;
            yl0 yl0Var = io0Var.d;
            ArrayList arrayList2 = io0Var.Q;
            ArrayList arrayList3 = io0Var.R;
            ArrayList arrayList4 = io0Var.S;
            ArrayList arrayList5 = io0Var.P;
            xp xpVar = io0Var.c0;
            io0Var.W();
            if (!TextUtils.equals(str, io0Var.b0)) {
                io0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(xpVar);
                if (TextUtils.isEmpty(io0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    io0Var.N(true);
                    io0Var.a0++;
                    z14 = false;
                    io0Var.W = false;
                    io0Var.X = false;
                    io0Var.Y = false;
                    io0Var.Z = 0;
                    if (yl0Var != null) {
                        yl0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(xpVar, 1000L);
                    io0Var.W = true;
                    io0Var.X = true;
                    io0Var.N(true);
                    if (yl0Var != null) {
                        z14 = false;
                        yl0Var.v0(0);
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
            bo0 bo0Var = this.p0;
            yl0 yl0Var2 = bo0Var.d;
            ArrayList arrayList6 = bo0Var.T;
            ms msVar = bo0Var.f0;
            if (TextUtils.equals(str, bo0Var.e0)) {
                z13 = false;
            } else {
                bo0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(msVar);
                if (TextUtils.isEmpty(bo0Var.e0)) {
                    arrayList6.clear();
                    bo0Var.N(true);
                    bo0Var.d0++;
                    z13 = false;
                    bo0Var.Z = false;
                    bo0Var.a0 = false;
                    bo0Var.b0 = false;
                    bo0Var.c0 = 0;
                    if (yl0Var2 != null) {
                        yl0Var2.v0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(msVar, 1000L);
                    bo0Var.Z = true;
                    bo0Var.a0 = true;
                    bo0Var.N(true);
                    if (yl0Var2 != null) {
                        yl0Var2.v0(0);
                    }
                }
            }
            this.m0.b(this.O0, z13);
            if (TextUtils.isEmpty(str)) {
                bo0Var.V();
                return;
            }
            return;
        }
        lh0 lh0Var = this.q0;
        if (view == lh0Var) {
            u61 u61Var = lh0Var.c;
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
            u61Var.v0(0);
            u61Var.Y2.N(z12);
            return;
        }
        if (view == this.s0) {
            if (e40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.u0.h1(0, 0);
            }
            eo0Var.Y(str);
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
                x10Var2.h(j10, this.U0, j15, j16, gg.s0.c3[((lo0) this.U.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof kn0) {
                kn0 kn0Var = (kn0) view;
                kn0Var.a.b(this.O0, false);
                kn0Var.K = str;
                kn0Var.d(false);
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
            ao0Var.setVisibility(8);
        } else {
            this.J0 = false;
            go0Var.U(z15 ? 1 : 0, str);
            go0Var.A0 = this.M0;
            x10Var3.animate().setListener(null).cancel();
            x10Var3.i(null, false);
            if (z10) {
                ao0Var.e(!(go0Var.D0 > 0), false);
                ao0Var.e(go0Var.D0 > 0, false);
            } else if (!go0Var.N()) {
                ao0Var.e(go0Var.D0 > 0, true);
            }
            if (z10) {
                x10Var3.setVisibility(8);
            } else if (x10Var3.getVisibility() != 8) {
                x10Var3.animate().alpha(0.0f).setListener(new gd0(this, 11)).setDuration(150L).start();
            }
            x10Var3.setTag(null);
            x10Var = x10Var3;
            z11 = false;
        }
        ao0Var.b(this.O0, z11);
        x10Var.c.b(this.O0, z11);
    }

    public final void R(boolean z10) {
        xl0 xl0Var;
        xl0 xl0Var2;
        xl0 xl0Var3;
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
                this.x0.setOnClickListener(new i80(this, 14));
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
            go0 go0Var = this.c0;
            ((ViewGroup.MarginLayoutParams) this.y0.getLayoutParams()).leftMargin = AndroidUtilities.dp((uyVar.W ? 18 : 72) + (go0Var != null && (gyVar = go0Var.U) != null && (gyVar.a() > 0L ? 1 : (gyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
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
            if ((getChildAt(i11) instanceof org.telegram.ui.x10) && (xl0Var3 = ((org.telegram.ui.x10) getChildAt(i11)).d) != null) {
                xl0Var3.l();
            }
            if (getChildAt(i11) instanceof kn0) {
                ((kn0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.x10 x10Var = this.N0;
        if (x10Var != null && (xl0Var2 = x10Var.d) != null) {
            xl0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.x10) && (xl0Var = ((org.telegram.ui.x10) view).d) != null) {
                xl0Var.l();
            }
        }
    }

    public final void S() {
        this.U.i();
        o(false);
        o81 o81Var = this.M;
        if (o81Var != null) {
            o81Var.x.l();
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
        io0 io0Var = this.k0;
        if (i10 == i12) {
            this.h0.e(MessagesController.getInstance(this.I0).getChannelRecommendations(0L) != null, true);
            io0Var.W();
            io0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            io0Var.W();
            io0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.p0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                eo0 eo0Var = this.w0;
                if (obj == eo0Var.Q) {
                    eo0Var.N(true);
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
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).b(hashMap.containsKey(p10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.v7) {
            ((org.telegram.ui.Cells.v7) view).b(i10, hashMap.containsKey(p10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f(hashMap.containsKey(p10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).e(hashMap.containsKey(p10Var), true);
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
            yl0 yl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    yl0Var = this.W;
                } else if (view == this.g0) {
                    yl0Var = this.j0;
                } else if (view == this.l0) {
                    yl0Var = this.o0;
                } else if (view == this.s0) {
                    yl0Var = this.v0;
                } else {
                    kn0 kn0Var = this.H0;
                    if (view == kn0Var) {
                        yl0Var = kn0Var.b;
                    } else {
                        lh0 lh0Var = this.q0;
                        if (view == lh0Var) {
                            yl0Var = lh0Var.c;
                        } else if (view instanceof org.telegram.ui.x10) {
                            yl0Var = ((org.telegram.ui.x10) view).b;
                        }
                    }
                }
            }
            if (yl0Var != null) {
                gh.d.a(yl0Var, canvas, rectF, yl0Var, this);
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

    public kn0 getDownloadsContainer() {
        return this.H0;
    }

    public int getFolderId() {
        return this.S0;
    }

    @Override // org.telegram.ui.Components.z81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.C0;
    }

    public y81 getTabsView() {
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
        io0 io0Var = this.k0;
        if (io0Var != null) {
            io0Var.N(false);
        }
        bo0 bo0Var = this.p0;
        if (bo0Var != null) {
            bo0Var.N(false);
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

    @Override // org.telegram.ui.Components.z81
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
            } else if (getChildAt(i11) instanceof kn0) {
                ((kn0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.g0) {
                this.h0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.z81
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        o81 o81Var = this.M;
        if (o81Var != null) {
            o81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.z81
    public final void t(View view, View view2, int i10, int i11) {
        go0 go0Var = this.c0;
        org.telegram.ui.x10 x10Var = this.N0;
        if (i10 == 0) {
            if (x10Var.getVisibility() == 0) {
                x10Var.i(this.M0, false);
                go0Var.A0 = null;
            } else {
                x10Var.i(null, false);
                org.telegram.ui.o10 o10Var = this.M0;
                go0Var.A0 = o10Var;
                if (o10Var != null) {
                    ((org.telegram.ui.xv) o10Var).h(false, null, go0Var.y0, go0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view).i(this.M0, i11 == 0 && x10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view2).i(null, false);
        } else {
            go0Var.A0 = null;
            x10Var.i(null, false);
        }
    }
}
