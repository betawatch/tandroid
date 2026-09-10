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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class ho0 extends v81 implements org.telegram.ui.y10, NotificationCenter.NotificationCenterDelegate, ah.a {
    public static final /* synthetic */ int X0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.w0 B0;
    public org.telegram.ui.ActionBar.w0 C0;
    public org.telegram.ui.ActionBar.w0 D0;
    public org.telegram.ui.ActionBar.w0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public fn0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.wy J0;
    public String K0;
    public org.telegram.ui.q10 L0;
    public final org.telegram.ui.z10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.cy P0;
    public final aw0 Q0;
    public final int R0;
    public int S0;
    public final go0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final bi.y1 V;
    public int V0;
    public final tn0 W;
    public zg.a W0;
    public final s4.j a0;
    public final ao0 b0;
    public final s4.c0 c0;
    public final zk0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final tn0 g0;
    public final s4.c0 h0;
    public final vl0 i0;
    public final co0 j0;
    public final FrameLayout k0;
    public final tn0 l0;
    public final s4.c0 m0;
    public final vl0 n0;
    public final un0 o0;
    public final ih0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final tn0 s0;
    public final s4.c0 t0;
    public final vl0 u0;
    public final xn0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public ho0(Context context, org.telegram.ui.wy wyVar, int i10, int i11, int i12, long j3, org.telegram.ui.cy cyVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = wyVar;
        this.P0 = cyVar;
        s4.j jVar = new s4.j();
        this.a0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = wr.h;
        org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this;
        this.b0 = new ao0(gyVar, context, wyVar, i10, i11, jVar, wyVar.F, wyVar, context);
        if (i11 == 15) {
            ArrayList R3 = wyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = com.google.android.gms.internal.vision.e2.f(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (aw0) wyVar.getFragmentView();
        bi.y1 y1Var = new bi.y1(gyVar, context, 20);
        this.V = y1Var;
        y1Var.setItemAnimator(this.a0);
        y1Var.setPivotY(0.0f);
        y1Var.setClipToPadding(false);
        y1Var.setAdapter(this.b0);
        y1Var.setVerticalScrollBarEnabled(true);
        y1Var.setInstantClick(true);
        y1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var = new s4.c0(1, false);
        this.c0 = c0Var;
        y1Var.setLayoutManager(c0Var);
        y1Var.Y1 = true;
        y1Var.Z1 = 0;
        y1Var.setOnScrollListener(new vn0(gyVar, wyVar, 2));
        y1Var.C0(new kc0(gyVar, 23));
        org.telegram.ui.z10 z10Var = new org.telegram.ui.z10(this.J0);
        this.M0 = z10Var;
        bi.y1 y1Var2 = z10Var.b;
        y1Var2.setClipToPadding(false);
        y1Var2.j(new yn0(gyVar, 1));
        y1Var2.C0(new kc0(gyVar, 23));
        z10Var.setUiCallback(this);
        z10Var.setVisibility(8);
        z10Var.setChatPreviewDelegate(cyVar);
        a10 a10Var = new a10(context, null);
        a10Var.setViewType(1);
        tn0 tn0Var = new tn0(gyVar, context, a10Var, 2);
        this.W = tn0Var;
        tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var.e.setVisibility(8);
        tn0Var.setVisibility(8);
        tn0Var.addView(a10Var, 0);
        tn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(tn0Var);
        frameLayout.addView(y1Var);
        frameLayout.addView(z10Var);
        y1Var.setEmptyView(tn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        bo0 bo0Var = new bo0(gyVar);
        bo0Var.m = false;
        bo0Var.C = false;
        wr wrVar = wr.h;
        bo0Var.o(wrVar);
        bo0Var.n(350L);
        vl0 vl0Var = new vl0(context, null);
        this.i0 = vl0Var;
        vl0Var.setItemAnimator(bo0Var);
        vl0Var.setPivotY(0.0f);
        vl0Var.setVerticalScrollBarEnabled(true);
        vl0Var.setInstantClick(true);
        vl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.h0 = c0Var2;
        vl0Var.setLayoutManager(c0Var2);
        vl0Var.Y1 = true;
        vl0Var.Z1 = 0;
        vl0Var.setClipToPadding(false);
        a10 a10Var2 = new a10(context, null);
        a10Var2.setViewType(1);
        tn0 tn0Var2 = new tn0(gyVar, context, a10Var2, 3);
        this.g0 = tn0Var2;
        tn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var2.e.setVisibility(8);
        tn0Var2.setVisibility(8);
        tn0Var2.addView(a10Var2, 0);
        tn0Var2.e(true, false);
        frameLayout2.addView(tn0Var2);
        frameLayout2.addView(vl0Var);
        vl0Var.setEmptyView(tn0Var2);
        co0 co0Var = new co0(gyVar, vl0Var, context, this.H0, i12, wyVar);
        this.j0 = co0Var;
        vl0Var.setAdapter(co0Var);
        vl0Var.setOnScrollListener(new vn0(gyVar, wyVar, 3));
        vl0Var.C0(new kc0(gyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        sn0 sn0Var = new sn0(gyVar);
        sn0Var.m = false;
        sn0Var.C = false;
        sn0Var.o(wrVar);
        sn0Var.n(350L);
        vl0 vl0Var2 = new vl0(context, null);
        this.n0 = vl0Var2;
        vl0Var2.setItemAnimator(sn0Var);
        vl0Var2.setPivotY(0.0f);
        vl0Var2.setClipToPadding(false);
        vl0Var2.setVerticalScrollBarEnabled(true);
        vl0Var2.setInstantClick(true);
        vl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        vl0Var2.setLayoutManager(c0Var3);
        vl0Var2.Y1 = true;
        vl0Var2.Z1 = 0;
        a10 a10Var3 = new a10(context, null);
        a10Var3.setViewType(1);
        tn0 tn0Var3 = new tn0(gyVar, context, a10Var3, 0);
        this.l0 = tn0Var3;
        tn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var3.e.setVisibility(8);
        tn0Var3.setVisibility(8);
        tn0Var3.addView(a10Var3, 0);
        tn0Var3.e(true, false);
        frameLayout3.addView(tn0Var3);
        frameLayout3.addView(vl0Var2);
        vl0Var2.setEmptyView(tn0Var3);
        un0 un0Var = new un0(gyVar, vl0Var2, context, this.H0, i12);
        this.o0 = un0Var;
        vl0Var2.setAdapter(un0Var);
        vl0Var2.setOnScrollListener(new vn0(gyVar, wyVar, 0));
        vl0Var2.C0(new kc0(gyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        wn0 wn0Var = new wn0(gyVar);
        wn0Var.m = false;
        wn0Var.C = false;
        wn0Var.o(wrVar);
        wn0Var.n(350L);
        vl0 vl0Var3 = new vl0(context, null);
        this.u0 = vl0Var3;
        vl0Var3.setItemAnimator(wn0Var);
        vl0Var3.setPivotY(0.0f);
        vl0Var3.setVerticalScrollBarEnabled(true);
        vl0Var3.setInstantClick(true);
        vl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.t0 = c0Var4;
        vl0Var3.setLayoutManager(c0Var4);
        vl0Var3.Y1 = true;
        vl0Var3.Z1 = 0;
        vl0Var3.setClipToPadding(false);
        a10 a10Var4 = new a10(context, null);
        a10Var4.setViewType(1);
        tn0 tn0Var4 = new tn0(gyVar, context, a10Var4, 1);
        this.s0 = tn0Var4;
        tn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var4.e.setVisibility(8);
        tn0Var4.setVisibility(8);
        tn0Var4.addView(a10Var4, 0);
        tn0Var4.e(true, false);
        frameLayout4.addView(tn0Var4);
        frameLayout4.addView(vl0Var3);
        vl0Var3.setEmptyView(tn0Var4);
        xn0 xn0Var = new xn0(gyVar, vl0Var3, context, this.H0);
        this.v0 = xn0Var;
        vl0Var3.setAdapter(xn0Var);
        vl0Var3.setOnScrollListener(new vn0(gyVar, wyVar, 1));
        vl0Var3.C0(new kc0(gyVar, 23));
        this.d0 = new zk0(y1Var, true);
        ih0 ih0Var = new ih0(context, wyVar);
        this.p0 = ih0Var;
        r61 r61Var = ih0Var.c;
        r61Var.setClipToPadding(false);
        r61Var.j(new yn0(gyVar, 0));
        r61Var.C0(new kc0(gyVar, 23));
        go0 go0Var = new go0(gyVar);
        this.T = go0Var;
        setAdapter(go0Var);
    }

    public static org.telegram.ui.eo K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.eo(bundle);
    }

    public static void P(FrameLayout frameLayout, vl0 vl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            vl0Var.n1(0, i10, 0, i11);
        } else {
            vl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vl0Var.getLayoutParams();
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
            ao0 ao0Var = this.b0;
            if (ao0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((fg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                ao0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            go0 go0Var = this.T;
            ArrayList arrayList = go0Var.a;
            ArrayList arrayList2 = go0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((fo0) arrayList2.get(i11)).a == 3 && ((fo0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            bi.y1 y1Var = this.V;
            if (i10 >= y1Var.getChildCount()) {
                break;
            }
            View childAt = y1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.j6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.z10) {
                arrayList.addAll(((org.telegram.ui.z10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.z10) {
                arrayList.addAll(((org.telegram.ui.z10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.z10 z10Var = this.M0;
        if (z10Var != null) {
            arrayList.addAll(z10Var.getThemeDescriptions());
        }
        tn0 tn0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.l6(tn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(tn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.addAll(w7.d6.a(new x6(this, 7), org.telegram.ui.ActionBar.j6.y8));
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
        org.telegram.ui.z10 z10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        tn0 tn0Var = this.W;
        if (isEmpty) {
            tn0Var.e.setVisibility(8);
        } else {
            tn0Var.e.setVisibility(0);
            tn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        ao0 ao0Var = this.b0;
        org.telegram.ui.iy iyVar = ao0Var.U;
        long a2 = iyVar != null ? iyVar.a() : 0L;
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
            fg.q0 q0Var = (fg.q0) arrayList.get(i11);
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
                fg.o0 o0Var = q0Var.g;
                long j13 = o0Var.b;
                j12 = o0Var.c;
                j11 = j13;
            } else if (i12 == 7) {
                z15 = true;
            }
            i11++;
        }
        xn0 xn0Var = this.v0;
        xn0Var.getClass();
        if (o40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            co0 co0Var = this.j0;
            vl0 vl0Var = co0Var.d;
            ArrayList arrayList2 = co0Var.Q;
            ArrayList arrayList3 = co0Var.R;
            ArrayList arrayList4 = co0Var.S;
            ArrayList arrayList5 = co0Var.P;
            dq dqVar = co0Var.c0;
            co0Var.W();
            if (!TextUtils.equals(str, co0Var.b0)) {
                co0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(dqVar);
                if (TextUtils.isEmpty(co0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    co0Var.N(true);
                    co0Var.a0++;
                    z14 = false;
                    co0Var.W = false;
                    co0Var.X = false;
                    co0Var.Y = false;
                    co0Var.Z = 0;
                    if (vl0Var != null) {
                        vl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(dqVar, 1000L);
                    co0Var.W = true;
                    co0Var.X = true;
                    co0Var.N(true);
                    if (vl0Var != null) {
                        z14 = false;
                        vl0Var.u0(0);
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
            un0 un0Var = this.o0;
            vl0 vl0Var2 = un0Var.d;
            ArrayList arrayList6 = un0Var.T;
            ss ssVar = un0Var.f0;
            if (TextUtils.equals(str, un0Var.e0)) {
                z13 = false;
            } else {
                un0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(ssVar);
                if (TextUtils.isEmpty(un0Var.e0)) {
                    arrayList6.clear();
                    un0Var.N(true);
                    un0Var.d0++;
                    z13 = false;
                    un0Var.Z = false;
                    un0Var.a0 = false;
                    un0Var.b0 = false;
                    un0Var.c0 = 0;
                    if (vl0Var2 != null) {
                        vl0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ssVar, 1000L);
                    un0Var.Z = true;
                    un0Var.a0 = true;
                    un0Var.N(true);
                    if (vl0Var2 != null) {
                        vl0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z13);
            if (TextUtils.isEmpty(str)) {
                un0Var.V();
                return;
            }
            return;
        }
        ih0 ih0Var = this.p0;
        if (view == ih0Var) {
            r61 r61Var = ih0Var.c;
            ArrayList arrayList7 = ih0Var.n;
            if (TextUtils.equals(ih0Var.w, str)) {
                return;
            }
            if (ih0Var.K >= 0) {
                ConnectionsManager.getInstance(ih0Var.b).cancelRequest(ih0Var.K, true);
                ih0Var.K = -1;
            }
            ih0Var.v = false;
            ih0Var.H.setLoading(false);
            ih0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                ih0Var.r = 0;
                z12 = true;
                ih0Var.L++;
                ih0Var.s = false;
                arrayList7.clear();
                ih0Var.a(false);
            } else {
                z12 = true;
                ih0Var.b(str);
                ih0Var.r = 0;
                ih0Var.L++;
                ih0Var.s = false;
                arrayList7.clear();
            }
            ih0Var.d();
            r61Var.u0(0);
            r61Var.Y2.N(z12);
            return;
        }
        if (view == this.r0) {
            if (o40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            xn0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j14 = a2;
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.z10) {
                org.telegram.ui.z10 z10Var2 = (org.telegram.ui.z10) view;
                z10Var2.setUseFromUserAsAvatar(j14 != 0);
                z10Var2.c.b(this.N0, false);
                z10Var2.h(j10, this.T0, j15, j16, fg.s0.c3[((fo0) this.T.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof fn0) {
                fn0 fn0Var = (fn0) view;
                fn0Var.a.b(this.N0, false);
                fn0Var.K = str;
                fn0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.z10 z10Var3 = this.M0;
        if (!(j10 == 0 && this.T0 == 0 && j11 == 0 && j12 == 0) && a2 == 0) {
            boolean z16 = true;
            z10Var3.setTag(1);
            z10Var3.i(this.L0, false);
            z10Var3.animate().setListener(null).cancel();
            if (z10) {
                z10Var3.setVisibility(0);
                z10Var3.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (z10Var3.getVisibility() != 0) {
                    z10Var3.setVisibility(0);
                    z10Var3.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                z10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            z10Var = z10Var3;
            z11 = false;
            this.M0.h(j10, this.T0, j11, j12, null, z15, str, z16);
            tn0Var.setVisibility(8);
        } else {
            this.I0 = false;
            ao0Var.U(z15 ? 1 : 0, str);
            ao0Var.A0 = this.L0;
            z10Var3.animate().setListener(null).cancel();
            z10Var3.i(null, false);
            if (z10) {
                tn0Var.e(!(ao0Var.D0 > 0), false);
                tn0Var.e(ao0Var.D0 > 0, false);
            } else if (!ao0Var.N()) {
                tn0Var.e(ao0Var.D0 > 0, true);
            }
            if (z10) {
                z10Var3.setVisibility(8);
            } else if (z10Var3.getVisibility() != 8) {
                z10Var3.animate().alpha(0.0f).setListener(new zn0(this, 0)).setDuration(150L).start();
                z10Var3.setTag(null);
                z10Var = z10Var3;
                z11 = false;
            }
            z10Var3.setTag(null);
            z10Var = z10Var3;
            z11 = false;
        }
        tn0Var.b(this.N0, z11);
        z10Var.c.b(this.N0, z11);
    }

    public final void Q(boolean z10) {
        ul0 ul0Var;
        ul0 ul0Var2;
        ul0 ul0Var3;
        org.telegram.ui.iy iyVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.wy wyVar = this.J0;
        if (z10 && wyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !wyVar.getActionBar().a("search_view_pager")) {
            this.F0 = wyVar.getActionBar().j("search_view_pager");
            if (wyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
                this.w0.setOnClickListener(new g80(this, 14));
                this.F0.addView(this.w0, w7.a6.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.j6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.F0.addView(this.x0, w7.a6.m(1.0f, 0, -1, wyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new ai.h(21));
            org.telegram.ui.ActionBar.w0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            ao0 ao0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((wyVar.W ? 18 : 72) + (ao0Var != null && (iyVar = ao0Var.U) != null && (iyVar.a() > 0L ? 1 : (iyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (wyVar.getActionBar().getBackButton() != null && (wyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.g5)) {
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            wyVar.getActionBar().setBackButtonDrawable(i2Var);
            i2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
            wyVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        wyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.z10) && (ul0Var3 = ((org.telegram.ui.z10) getChildAt(i11)).d) != null) {
                ul0Var3.l();
            }
            if (getChildAt(i11) instanceof fn0) {
                ((fn0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.z10 z10Var = this.M0;
        if (z10Var != null && (ul0Var2 = z10Var.d) != null) {
            ul0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.z10) && (ul0Var = ((org.telegram.ui.z10) view).d) != null) {
                ul0Var.l();
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

    @Override // org.telegram.ui.y10
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.y10
    public final boolean b(org.telegram.ui.r10 r10Var) {
        return this.z0.containsKey(r10Var);
    }

    @Override // org.telegram.ui.y10
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.ui.y10
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.r10 r10Var = new org.telegram.ui.r10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(r10Var)) {
            hashMap.remove(r10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(r10Var, messageObject);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.x0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.C0;
            if (w0Var != null) {
                w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
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
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.r10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).b(hashMap.containsKey(r10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.v7) {
            ((org.telegram.ui.Cells.v7) view).b(i10, hashMap.containsKey(r10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f(hashMap.containsKey(r10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).e(hashMap.containsKey(r10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(r10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(r10Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        co0 co0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            co0Var.W();
            co0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            co0Var.W();
            co0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                xn0 xn0Var = this.v0;
                if (obj == xn0Var.Q) {
                    xn0Var.N(true);
                }
            }
        }
    }

    @Override // ah.a
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.U;
            vl0 vl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    vl0Var = this.V;
                } else if (view == this.f0) {
                    vl0Var = this.i0;
                } else if (view == this.k0) {
                    vl0Var = this.n0;
                } else if (view == this.r0) {
                    vl0Var = this.u0;
                } else {
                    fn0 fn0Var = this.G0;
                    if (view == fn0Var) {
                        vl0Var = fn0Var.b;
                    } else {
                        ih0 ih0Var = this.p0;
                        if (view == ih0Var) {
                            vl0Var = ih0Var.c;
                        } else if (view instanceof org.telegram.ui.z10) {
                            vl0Var = ((org.telegram.ui.z10) view).b;
                        }
                    }
                }
            }
            if (vl0Var != null) {
                fh.d.b(vl0Var, canvas, rectF, vl0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.z10 z10Var = this.M0;
                if (z10Var.getVisibility() == 0) {
                    bi.y1 y1Var = z10Var.b;
                    fh.d.b(y1Var, canvas, rectF, y1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.y10
    public final boolean f() {
        return this.y0;
    }

    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        zVar.b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<fg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public fn0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.v81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.B0;
    }

    public u81 getTabsView() {
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
        co0 co0Var = this.j0;
        if (co0Var != null) {
            co0Var.N(false);
        }
        un0 un0Var = this.o0;
        if (un0Var != null) {
            un0Var.N(false);
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

    @Override // org.telegram.ui.Components.v81
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(zg.a aVar) {
        this.W0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.q10 q10Var) {
        this.L0 = q10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.z10) {
                ((org.telegram.ui.z10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof fn0) {
                ((fn0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.v81
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

    @Override // org.telegram.ui.Components.v81
    public final void t(View view, View view2, int i10, int i11) {
        ao0 ao0Var = this.b0;
        org.telegram.ui.z10 z10Var = this.M0;
        if (i10 == 0) {
            if (z10Var.getVisibility() == 0) {
                z10Var.i(this.L0, false);
                ao0Var.A0 = null;
            } else {
                z10Var.i(null, false);
                org.telegram.ui.q10 q10Var = this.L0;
                ao0Var.A0 = q10Var;
                if (q10Var != null) {
                    ((org.telegram.ui.yv) q10Var).i(false, null, ao0Var.y0, ao0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.z10) {
            ((org.telegram.ui.z10) view).i(this.L0, i11 == 0 && z10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.z10) {
            ((org.telegram.ui.z10) view2).i(null, false);
        } else {
            ao0Var.A0 = null;
            z10Var.i(null, false);
        }
    }
}
