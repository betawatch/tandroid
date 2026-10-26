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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class ep0 extends u91 implements org.telegram.ui.g10, NotificationCenter.NotificationCenterDelegate, dh.a {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.w0 D0;
    public org.telegram.ui.ActionBar.w0 E0;
    public org.telegram.ui.ActionBar.w0 F0;
    public org.telegram.ui.ActionBar.w0 G0;
    public org.telegram.ui.ActionBar.z H0;
    public co0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.cy L0;
    public String M0;
    public org.telegram.ui.x00 N0;
    public final org.telegram.ui.h10 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.ix R0;
    public final vw0 S0;
    public final int T0;
    public int U0;
    public final dp0 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public NotificationCenter.ObserversGroup Y0;
    public ch.b Z0;
    public final bi.r1 a0;
    public final qo0 b0;
    public final s4.l c0;
    public final wo0 d0;
    public final s4.c0 e0;
    public final ql0 f0;
    public boolean g0;
    public final FrameLayout h0;
    public final qo0 i0;
    public final s4.c0 j0;
    public final mm0 k0;
    public final yo0 l0;
    public final FrameLayout m0;
    public final qo0 n0;
    public final s4.c0 o0;
    public final mm0 p0;
    public final ro0 q0;
    public final wh0 r0;
    public boolean s0;
    public final FrameLayout t0;
    public final qo0 u0;
    public final s4.c0 v0;
    public final mm0 w0;
    public final uo0 x0;
    public ImageView y0;
    public ap0 z0;

    public ep0(Context context, org.telegram.ui.cy cyVar, int i10, int i11, int i12, long j10, org.telegram.ui.ix ixVar) {
        super(context, null);
        this.s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.J0 = i13;
        this.U0 = 0;
        this.T0 = i12;
        this.V0 = j10;
        this.L0 = cyVar;
        this.R0 = ixVar;
        s4.l lVar = new s4.l();
        this.c0 = lVar;
        lVar.c = 150L;
        lVar.e = 350L;
        lVar.f = 0L;
        lVar.g = 0L;
        lVar.d = 0L;
        lVar.i = new OvershootInterpolator(1.1f);
        lVar.o = ds.h;
        org.telegram.ui.jx jxVar = (org.telegram.ui.jx) this;
        this.d0 = new wo0(jxVar, context, cyVar, i10, i11, lVar, cyVar.F, cyVar, context);
        if (i11 == 15) {
            ArrayList Z3 = cyVar.Z3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < Z3.size(); i14 = c3.h0.j(((TLRPC.Dialog) Z3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.d0.q0 = arrayList;
        }
        this.S0 = (vw0) cyVar.getFragmentView();
        bi.r1 r1Var = new bi.r1(jxVar, context, 22);
        this.a0 = r1Var;
        r1Var.setItemAnimator(this.c0);
        r1Var.setPivotY(0.0f);
        r1Var.setClipToPadding(false);
        r1Var.setAdapter(this.d0);
        r1Var.setVerticalScrollBarEnabled(true);
        r1Var.setInstantClick(true);
        r1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var = new s4.c0(1, false);
        this.e0 = c0Var;
        r1Var.setLayoutManager(c0Var);
        r1Var.W1 = true;
        r1Var.X1 = 0;
        r1Var.setOnScrollListener(new so0(jxVar, cyVar, 2));
        r1Var.D0(new wa0(jxVar, 26));
        org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(this.L0);
        this.O0 = h10Var;
        bi.r1 r1Var2 = h10Var.b;
        r1Var2.setClipToPadding(false);
        r1Var2.j(new vo0(jxVar, 1));
        r1Var2.D0(new wa0(jxVar, 26));
        h10Var.setUiCallback(this);
        h10Var.setVisibility(8);
        h10Var.setChatPreviewDelegate(ixVar);
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(1);
        qo0 qo0Var = new qo0(jxVar, context, c10Var, 2);
        this.b0 = qo0Var;
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
        qo0Var.setVisibility(8);
        qo0Var.addView(c10Var, 0);
        qo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(qo0Var);
        frameLayout.addView(r1Var);
        frameLayout.addView(h10Var);
        r1Var.setEmptyView(qo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h0 = frameLayout2;
        xo0 xo0Var = new xo0(jxVar);
        xo0Var.m = false;
        xo0Var.C = false;
        ds dsVar = ds.h;
        xo0Var.o(dsVar);
        xo0Var.n(350L);
        mm0 mm0Var = new mm0(context, null);
        this.k0 = mm0Var;
        mm0Var.setItemAnimator(xo0Var);
        mm0Var.setPivotY(0.0f);
        mm0Var.setVerticalScrollBarEnabled(true);
        mm0Var.setInstantClick(true);
        mm0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.j0 = c0Var2;
        mm0Var.setLayoutManager(c0Var2);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        mm0Var.setClipToPadding(false);
        c10 c10Var2 = new c10(context, null);
        c10Var2.setViewType(1);
        qo0 qo0Var2 = new qo0(jxVar, context, c10Var2, 3);
        this.i0 = qo0Var2;
        qo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var2.e.setVisibility(8);
        qo0Var2.setVisibility(8);
        qo0Var2.addView(c10Var2, 0);
        qo0Var2.e(true, false);
        frameLayout2.addView(qo0Var2);
        frameLayout2.addView(mm0Var);
        mm0Var.setEmptyView(qo0Var2);
        yo0 yo0Var = new yo0(jxVar, mm0Var, context, this.J0, i12, cyVar);
        this.l0 = yo0Var;
        mm0Var.setAdapter(yo0Var);
        mm0Var.setOnScrollListener(new so0(jxVar, cyVar, 3));
        mm0Var.D0(new wa0(jxVar, 26));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        po0 po0Var = new po0(jxVar);
        po0Var.m = false;
        po0Var.C = false;
        po0Var.o(dsVar);
        po0Var.n(350L);
        mm0 mm0Var2 = new mm0(context, null);
        this.p0 = mm0Var2;
        mm0Var2.setItemAnimator(po0Var);
        mm0Var2.setPivotY(0.0f);
        mm0Var2.setClipToPadding(false);
        mm0Var2.setVerticalScrollBarEnabled(true);
        mm0Var2.setInstantClick(true);
        mm0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.o0 = c0Var3;
        mm0Var2.setLayoutManager(c0Var3);
        mm0Var2.W1 = true;
        mm0Var2.X1 = 0;
        c10 c10Var3 = new c10(context, null);
        c10Var3.setViewType(1);
        qo0 qo0Var3 = new qo0(jxVar, context, c10Var3, 0);
        this.n0 = qo0Var3;
        qo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var3.e.setVisibility(8);
        qo0Var3.setVisibility(8);
        qo0Var3.addView(c10Var3, 0);
        qo0Var3.e(true, false);
        frameLayout3.addView(qo0Var3);
        frameLayout3.addView(mm0Var2);
        mm0Var2.setEmptyView(qo0Var3);
        ro0 ro0Var = new ro0(jxVar, mm0Var2, context, this.J0, i12);
        this.q0 = ro0Var;
        mm0Var2.setAdapter(ro0Var);
        mm0Var2.setOnScrollListener(new so0(jxVar, cyVar, 0));
        mm0Var2.D0(new wa0(jxVar, 26));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.t0 = frameLayout4;
        to0 to0Var = new to0(jxVar);
        to0Var.m = false;
        to0Var.C = false;
        to0Var.o(dsVar);
        to0Var.n(350L);
        mm0 mm0Var3 = new mm0(context, null);
        this.w0 = mm0Var3;
        mm0Var3.setItemAnimator(to0Var);
        mm0Var3.setPivotY(0.0f);
        mm0Var3.setVerticalScrollBarEnabled(true);
        mm0Var3.setInstantClick(true);
        mm0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.v0 = c0Var4;
        mm0Var3.setLayoutManager(c0Var4);
        mm0Var3.W1 = true;
        mm0Var3.X1 = 0;
        mm0Var3.setClipToPadding(false);
        c10 c10Var4 = new c10(context, null);
        c10Var4.setViewType(1);
        qo0 qo0Var4 = new qo0(jxVar, context, c10Var4, 1);
        this.u0 = qo0Var4;
        qo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var4.e.setVisibility(8);
        qo0Var4.setVisibility(8);
        qo0Var4.addView(c10Var4, 0);
        qo0Var4.e(true, false);
        frameLayout4.addView(qo0Var4);
        frameLayout4.addView(mm0Var3);
        mm0Var3.setEmptyView(qo0Var4);
        uo0 uo0Var = new uo0(jxVar, mm0Var3, context, this.J0);
        this.x0 = uo0Var;
        mm0Var3.setAdapter(uo0Var);
        mm0Var3.setOnScrollListener(new so0(jxVar, cyVar, 1));
        mm0Var3.D0(new wa0(jxVar, 26));
        this.f0 = new ql0(r1Var, true);
        wh0 wh0Var = new wh0(context, cyVar);
        this.r0 = wh0Var;
        r71 r71Var = wh0Var.c;
        r71Var.setClipToPadding(false);
        r71Var.j(new vo0(jxVar, 0));
        r71Var.D0(new wa0(jxVar, 26));
        dp0 dp0Var = new dp0(jxVar);
        this.V = dp0Var;
        setAdapter(dp0Var);
    }

    public static org.telegram.ui.un M(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.un(bundle);
    }

    public static void Q(FrameLayout frameLayout, mm0 mm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            mm0Var.t1(0, i10, 0, i11);
        } else {
            mm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void L() {
        if (this.s0) {
            int i10 = 0;
            this.s0 = false;
            S();
            k91 k91Var = this.M;
            if (k91Var != null && k91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            wo0 wo0Var = this.d0;
            if (wo0Var != null) {
                String str = this.M0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.C0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((ig.p0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                wo0Var.T(i10, str);
            }
        }
    }

    public final int N(int i10) {
        int i11 = 0;
        while (true) {
            dp0 dp0Var = this.V;
            ArrayList arrayList = dp0Var.a;
            ArrayList arrayList2 = dp0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((cp0) arrayList2.get(i11)).a == 3 && ((cp0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final boolean O() {
        int i10 = this.J0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.B0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i10, String str, boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.ui.h10 h10Var;
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        qo0 qo0Var = this.b0;
        if (isEmpty) {
            qo0Var.e.setVisibility(8);
        } else {
            qo0Var.e.setVisibility(0);
            qo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        wo0 wo0Var = this.d0;
        org.telegram.ui.lx lxVar = wo0Var.U;
        long a2 = lxVar != null ? lxVar.a() : 0L;
        long j11 = i10 == 0 ? 0L : a2;
        int i11 = 0;
        boolean z16 = false;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.C0;
            if (i11 >= arrayList.size()) {
                break;
            }
            ig.p0 p0Var = (ig.p0) arrayList.get(i11);
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
                ig.n0 n0Var = p0Var.g;
                long j14 = n0Var.b;
                j13 = n0Var.c;
                j12 = j14;
            } else if (i12 == 7) {
                z16 = true;
            }
            i11++;
        }
        uo0 uo0Var = this.x0;
        uo0Var.getClass();
        if (p40.Y(str, null) == null) {
            L();
        }
        if (view == this.h0) {
            MessagesController.getInstance(this.J0).getChannelRecommendations(0L);
            yo0 yo0Var = this.l0;
            mm0 mm0Var = yo0Var.d;
            ArrayList arrayList2 = yo0Var.S;
            ArrayList arrayList3 = yo0Var.T;
            ArrayList arrayList4 = yo0Var.U;
            ArrayList arrayList5 = yo0Var.R;
            bq bqVar = yo0Var.e0;
            yo0Var.X();
            if (!TextUtils.equals(str, yo0Var.d0)) {
                yo0Var.d0 = str;
                AndroidUtilities.cancelRunOnUIThread(bqVar);
                if (TextUtils.isEmpty(yo0Var.d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    yo0Var.O(true);
                    yo0Var.c0++;
                    z15 = false;
                    yo0Var.Y = false;
                    yo0Var.Z = false;
                    yo0Var.a0 = false;
                    yo0Var.b0 = 0;
                    if (mm0Var != null) {
                        mm0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(bqVar, 1000L);
                    yo0Var.Y = true;
                    yo0Var.Z = true;
                    yo0Var.O(true);
                    if (mm0Var != null) {
                        z15 = false;
                        mm0Var.v0(0);
                    }
                }
                this.i0.b(this.P0, z15);
                return;
            }
            z15 = false;
            this.i0.b(this.P0, z15);
            return;
        }
        if (view == this.m0) {
            ro0 ro0Var = this.q0;
            mm0 mm0Var2 = ro0Var.d;
            ArrayList arrayList6 = ro0Var.V;
            ys ysVar = ro0Var.h0;
            if (TextUtils.equals(str, ro0Var.g0)) {
                z14 = false;
            } else {
                ro0Var.g0 = str;
                AndroidUtilities.cancelRunOnUIThread(ysVar);
                if (TextUtils.isEmpty(ro0Var.g0)) {
                    arrayList6.clear();
                    ro0Var.O(true);
                    ro0Var.f0++;
                    z14 = false;
                    ro0Var.b0 = false;
                    ro0Var.c0 = false;
                    ro0Var.d0 = false;
                    ro0Var.e0 = 0;
                    if (mm0Var2 != null) {
                        mm0Var2.v0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ysVar, 1000L);
                    ro0Var.b0 = true;
                    ro0Var.c0 = true;
                    ro0Var.O(true);
                    if (mm0Var2 != null) {
                        mm0Var2.v0(0);
                    }
                }
            }
            this.n0.b(this.P0, z14);
            if (TextUtils.isEmpty(str)) {
                ro0Var.W();
                return;
            }
            return;
        }
        wh0 wh0Var = this.r0;
        if (view == wh0Var) {
            r71 r71Var = wh0Var.c;
            ArrayList arrayList7 = wh0Var.n;
            if (TextUtils.equals(wh0Var.w, str)) {
                return;
            }
            if (wh0Var.K >= 0) {
                ConnectionsManager.getInstance(wh0Var.b).cancelRequest(wh0Var.K, true);
                wh0Var.K = -1;
            }
            wh0Var.v = false;
            wh0Var.H.setLoading(false);
            wh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                wh0Var.r = 0;
                z13 = true;
                wh0Var.L++;
                wh0Var.s = false;
                arrayList7.clear();
                wh0Var.a(false);
            } else {
                z13 = true;
                wh0Var.b(str);
                wh0Var.r = 0;
                wh0Var.L++;
                wh0Var.s = false;
                arrayList7.clear();
            }
            wh0Var.d();
            r71Var.v0(0);
            r71Var.g3.O(z13);
            return;
        }
        if (view == this.t0) {
            if (p40.Y(str, null) == null) {
                return;
            }
            if (z10) {
                this.v0.h1(0, 0);
            }
            uo0Var.Z(str);
            this.u0.b(this.P0, false);
            return;
        }
        if (view != this.W) {
            long j15 = a2;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.h10) {
                org.telegram.ui.h10 h10Var2 = (org.telegram.ui.h10) view;
                h10Var2.setUseFromUserAsAvatar(j15 != 0);
                h10Var2.c.b(this.P0, false);
                h10Var2.h(j11, this.V0, j16, j17, ig.r0.k3[((cp0) this.V.a.get(i10)).b], z16, str, z10);
                return;
            }
            if (view instanceof co0) {
                co0 co0Var = (co0) view;
                co0Var.a.b(this.P0, false);
                co0Var.K = str;
                co0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.h10 h10Var3 = this.O0;
        if (!(j11 == 0 && this.V0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z17 = true;
            h10Var3.setTag(1);
            h10Var3.i(this.N0, false);
            h10Var3.animate().setListener(null).cancel();
            if (z10) {
                h10Var3.setVisibility(0);
                h10Var3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (h10Var3.getVisibility() != 0) {
                    h10Var3.setVisibility(0);
                    h10Var3.setAlpha(0.0f);
                } else {
                    z17 = z10;
                }
                h10Var3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = z17;
            }
            z12 = false;
            long j18 = j11;
            h10Var = h10Var3;
            this.O0.h(j18, this.V0, j12, j13, null, z16, str, z11);
            qo0Var.setVisibility(8);
        } else {
            this.K0 = false;
            wo0Var.T(z16 ? 1 : 0, str);
            wo0Var.A0 = this.N0;
            h10Var3.animate().setListener(null).cancel();
            h10Var3.i(null, false);
            if (z10) {
                qo0Var.e(!(wo0Var.D0 > 0), false);
                qo0Var.e(wo0Var.D0 > 0, false);
            } else if (!wo0Var.M()) {
                qo0Var.e(wo0Var.D0 > 0, true);
            }
            if (z10) {
                h10Var3.setVisibility(8);
            } else if (h10Var3.getVisibility() != 8) {
                h10Var3.animate().alpha(0.0f).setListener(new i10(this, 18)).setDuration(150L).start();
            }
            h10Var3.setTag(null);
            h10Var = h10Var3;
            z12 = false;
        }
        qo0Var.b(this.P0, z12);
        h10Var.c.b(this.P0, z12);
    }

    public final void R(boolean z10) {
        lm0 lm0Var;
        lm0 lm0Var2;
        lm0 lm0Var3;
        org.telegram.ui.lx lxVar;
        if (this.A0 == z10) {
            return;
        }
        org.telegram.ui.cy cyVar = this.L0;
        if (z10 && cyVar.getActionBar().q()) {
            return;
        }
        if (z10 && !cyVar.getActionBar().a("search_view_pager")) {
            this.H0 = cyVar.getActionBar().i("search_view_pager");
            if (cyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.y0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.y0.setImageDrawable(new org.telegram.ui.ActionBar.j2(true));
                org.telegram.ui.ActionBar.f7.t(this.y0, org.telegram.ui.ActionBar.y6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.y0;
                int i10 = org.telegram.ui.ActionBar.y6.z8;
                org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i10), null);
                this.y0.setOnClickListener(new w80(this, 12));
                this.H0.addView(this.y0, gb1.s(54, 54, 0.0f, 16));
            }
            ap0 ap0Var = new ap0(this.H0.getContext());
            this.z0 = ap0Var;
            ap0Var.setTextSize(18);
            this.z0.setTypeface(AndroidUtilities.bold());
            ap0 ap0Var2 = this.z0;
            int i11 = org.telegram.ui.ActionBar.y6.y8;
            qd0 qd0Var = new qd0(14);
            qd0 qd0Var2 = new qd0(15);
            int Q = org.telegram.ui.ActionBar.f7.Q(i11, -1, 0, 0.0f, null);
            qd0Var2.d(Q, ap0Var2);
            org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, ap0Var2);
            x9.c(i11, -1, 0, 0.0f, null);
            x9.n = qd0Var;
            x9.o = qd0Var2;
            x9.m = false;
            x9.g = Q;
            this.H0.addView(this.z0, gb1.q(1.0f, 0, -1, cyVar.W ? 18 : 72, 0, 0));
            this.z0.setOnTouchListener(new ei.d(21));
            org.telegram.ui.ActionBar.w0 h = this.H0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.D0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.f7.t(this.D0.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
            }
            this.E0 = this.H0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.F0 = this.H0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.G0 = this.H0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.z0 != null) {
            wo0 wo0Var = this.d0;
            ((ViewGroup.MarginLayoutParams) this.z0.getLayoutParams()).leftMargin = AndroidUtilities.dp((cyVar.W ? 18 : 72) + (wo0Var != null && (lxVar = wo0Var.U) != null && (lxVar.a() > 0L ? 1 : (lxVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            ap0 ap0Var3 = this.z0;
            ap0Var3.setLayoutParams(ap0Var3.getLayoutParams());
        }
        if (cyVar.getActionBar().getBackButton() != null && (cyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.k5)) {
            org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
            cyVar.getActionBar().setBackButtonDrawable(j2Var);
            j2Var.setColorFilter(null);
        }
        this.A0 = z10;
        HashMap hashMap = this.B0;
        if (z10) {
            AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
            cyVar.getActionBar().K(null, null);
            this.z0.a(hashMap.size(), false);
            this.D0.setVisibility(O() ? 0 : 8);
            this.E0.setVisibility(0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            return;
        }
        cyVar.getActionBar().p();
        hashMap.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof org.telegram.ui.h10) && (lm0Var3 = ((org.telegram.ui.h10) getChildAt(i12)).d) != null) {
                lm0Var3.l();
            }
            if (getChildAt(i12) instanceof co0) {
                ((co0) getChildAt(i12)).d(true);
            }
        }
        org.telegram.ui.h10 h10Var = this.O0;
        if (h10Var != null && (lm0Var2 = h10Var.d) != null) {
            lm0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) sparseArray.valueAt(i13);
            if ((view instanceof org.telegram.ui.h10) && (lm0Var = ((org.telegram.ui.h10) view).d) != null) {
                lm0Var.l();
            }
        }
    }

    public final void S() {
        this.V.i();
        o(false);
        k91 k91Var = this.M;
        if (k91Var != null) {
            k91Var.x.l();
        }
    }

    @Override // org.telegram.ui.g10
    public final void a() {
        R(true);
    }

    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // org.telegram.ui.g10
    public final boolean c(org.telegram.ui.z00 z00Var) {
        return this.B0.containsKey(z00Var);
    }

    @Override // org.telegram.ui.g10
    public final void d(MessageObject messageObject) {
        this.L0.presentFragment(M(messageObject, this.J0));
        R(false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        yo0 yo0Var = this.l0;
        if (i10 == i12) {
            this.i0.e(MessagesController.getInstance(this.J0).getChannelRecommendations(0L) != null, true);
            yo0Var.X();
            yo0Var.O(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            yo0Var.X();
            yo0Var.O(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.q0.O(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                uo0 uo0Var = this.x0;
                if (obj == uo0Var.S) {
                    uo0Var.O(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.g10
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.z00 z00Var = new org.telegram.ui.z00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(z00Var)) {
            hashMap.remove(z00Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(z00Var, messageObject);
        }
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.z0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.E0;
            if (w0Var != null) {
                w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.D0 != null) {
                boolean O = O();
                int i11 = O ? 0 : 8;
                if (this.D0.getVisibility() != i11) {
                    this.D0.setVisibility(i11);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.D0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.f7.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.y6.y8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.G0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.z00) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.G0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(hashMap.containsKey(z00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.x7) {
            ((org.telegram.ui.Cells.x7) view).b(i10, hashMap.containsKey(z00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).f(hashMap.containsKey(z00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).e(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).U(hashMap.containsKey(z00Var), true);
        }
    }

    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.W;
            mm0 mm0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    mm0Var = this.a0;
                } else if (view == this.h0) {
                    mm0Var = this.k0;
                } else if (view == this.m0) {
                    mm0Var = this.p0;
                } else if (view == this.t0) {
                    mm0Var = this.w0;
                } else {
                    co0 co0Var = this.I0;
                    if (view == co0Var) {
                        mm0Var = co0Var.b;
                    } else {
                        wh0 wh0Var = this.r0;
                        if (view == wh0Var) {
                            mm0Var = wh0Var.c;
                        } else if (view instanceof org.telegram.ui.h10) {
                            mm0Var = ((org.telegram.ui.h10) view).b;
                        }
                    }
                }
            }
            if (mm0Var != null) {
                ih.d.a(mm0Var, canvas, rectF, mm0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.h10 h10Var = this.O0;
                if (h10Var.getVisibility() == 0) {
                    bi.r1 r1Var = h10Var.b;
                    ih.d.a(r1Var, canvas, rectF, r1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.g10
    public final boolean g() {
        return this.A0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.H0;
    }

    public ArrayList<ig.p0> getCurrentSearchFilters() {
        return this.C0;
    }

    public co0 getDownloadsContainer() {
        return this.I0;
    }

    public int getFolderId() {
        return this.T0;
    }

    @Override // org.telegram.ui.Components.u91
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.D0;
    }

    public t91 getTabsView() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.Y0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Y0 = null;
        }
        this.Y0 = NotificationCenter.getInstance(this.J0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.g0 = true;
        yo0 yo0Var = this.l0;
        if (yo0Var != null) {
            yo0Var.O(false);
        }
        ro0 ro0Var = this.q0;
        if (ro0Var != null) {
            ro0Var.O(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.Y0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void s() {
        this.S0.L();
    }

    public void setBlurredBackgroundDrawableFactory(ch.b bVar) {
        this.Z0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.x00 x00Var) {
        this.N0 = x00Var;
    }

    public void setKeyboardHeight(int i10) {
        this.P0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.h10) {
                ((org.telegram.ui.h10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.W) {
                this.b0.b(i10, z10);
                this.O0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof co0) {
                ((co0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.h0) {
                this.i0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.u91
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        k91 k91Var = this.M;
        if (k91Var != null) {
            k91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.u91
    public final void t(View view, View view2, int i10, int i11) {
        wo0 wo0Var = this.d0;
        org.telegram.ui.h10 h10Var = this.O0;
        if (i10 == 0) {
            if (h10Var.getVisibility() == 0) {
                h10Var.i(this.N0, false);
                wo0Var.A0 = null;
            } else {
                h10Var.i(null, false);
                org.telegram.ui.x00 x00Var = this.N0;
                wo0Var.A0 = x00Var;
                if (x00Var != null) {
                    ((org.telegram.ui.iv) x00Var).j(false, null, wo0Var.y0, wo0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.h10) {
            ((org.telegram.ui.h10) view).i(this.N0, i11 == 0 && h10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.h10) {
            ((org.telegram.ui.h10) view2).i(null, false);
        } else {
            wo0Var.A0 = null;
            h10Var.i(null, false);
        }
    }
}
