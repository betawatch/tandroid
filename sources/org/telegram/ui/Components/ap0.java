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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class ap0 extends l91 implements org.telegram.ui.h10, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final /* synthetic */ int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public xn0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ey J0;
    public String K0;
    public org.telegram.ui.y00 L0;
    public final org.telegram.ui.i10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.jx P0;
    public final ow0 Q0;
    public final int R0;
    public int S0;
    public final zo0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.u1 V;
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
    public final xh0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final mo0 s0;
    public final s4.b0 t0;
    public final mm0 u0;
    public final qo0 v0;
    public ImageView w0;
    public wo0 x0;
    public boolean y0;
    public final HashMap z0;

    public ap0(Context context, org.telegram.ui.ey eyVar, int i10, int i11, int i12, long j10, org.telegram.ui.jx jxVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j10;
        this.J0 = eyVar;
        this.P0 = jxVar;
        s4.k kVar = new s4.k();
        this.a0 = kVar;
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = bs.h;
        org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this;
        this.b0 = new so0(nxVar, context, eyVar, i10, i11, kVar, eyVar.F, eyVar, context);
        if (i11 == 15) {
            ArrayList P3 = eyVar.P3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < P3.size(); i14 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.Dialog) P3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (ow0) eyVar.getFragmentView();
        ai.u1 u1Var = new ai.u1(nxVar, context, 22);
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
        u1Var.setOnScrollListener(new oo0(nxVar, eyVar, 2));
        u1Var.C0(new yb0(nxVar, 24));
        org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(this.J0);
        this.M0 = i10Var;
        ai.u1 u1Var2 = i10Var.b;
        u1Var2.setClipToPadding(false);
        u1Var2.j(new ro0(nxVar, 1));
        u1Var2.C0(new yb0(nxVar, 24));
        i10Var.setUiCallback(this);
        i10Var.setVisibility(8);
        i10Var.setChatPreviewDelegate(jxVar);
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(1);
        mo0 mo0Var = new mo0(nxVar, context, b10Var, 2);
        this.W = mo0Var;
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
        mo0Var.setVisibility(8);
        mo0Var.addView(b10Var, 0);
        mo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(mo0Var);
        frameLayout.addView(u1Var);
        frameLayout.addView(i10Var);
        u1Var.setEmptyView(mo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        to0 to0Var = new to0(nxVar);
        to0Var.m = false;
        to0Var.C = false;
        bs bsVar = bs.h;
        to0Var.o(bsVar);
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
        b10 b10Var2 = new b10(context, null);
        b10Var2.setViewType(1);
        mo0 mo0Var2 = new mo0(nxVar, context, b10Var2, 3);
        this.g0 = mo0Var2;
        mo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var2.e.setVisibility(8);
        mo0Var2.setVisibility(8);
        mo0Var2.addView(b10Var2, 0);
        mo0Var2.e(true, false);
        frameLayout2.addView(mo0Var2);
        frameLayout2.addView(mm0Var);
        mm0Var.setEmptyView(mo0Var2);
        uo0 uo0Var = new uo0(nxVar, mm0Var, context, this.H0, i12, eyVar);
        this.j0 = uo0Var;
        mm0Var.setAdapter(uo0Var);
        mm0Var.setOnScrollListener(new oo0(nxVar, eyVar, 3));
        mm0Var.C0(new yb0(nxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        lo0 lo0Var = new lo0(nxVar);
        lo0Var.m = false;
        lo0Var.C = false;
        lo0Var.o(bsVar);
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
        b10 b10Var3 = new b10(context, null);
        b10Var3.setViewType(1);
        mo0 mo0Var3 = new mo0(nxVar, context, b10Var3, 0);
        this.l0 = mo0Var3;
        mo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var3.e.setVisibility(8);
        mo0Var3.setVisibility(8);
        mo0Var3.addView(b10Var3, 0);
        mo0Var3.e(true, false);
        frameLayout3.addView(mo0Var3);
        frameLayout3.addView(mm0Var2);
        mm0Var2.setEmptyView(mo0Var3);
        no0 no0Var = new no0(nxVar, mm0Var2, context, this.H0, i12);
        this.o0 = no0Var;
        mm0Var2.setAdapter(no0Var);
        mm0Var2.setOnScrollListener(new oo0(nxVar, eyVar, 0));
        mm0Var2.C0(new yb0(nxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        po0 po0Var = new po0(nxVar);
        po0Var.m = false;
        po0Var.C = false;
        po0Var.o(bsVar);
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
        b10 b10Var4 = new b10(context, null);
        b10Var4.setViewType(1);
        mo0 mo0Var4 = new mo0(nxVar, context, b10Var4, 1);
        this.s0 = mo0Var4;
        mo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var4.e.setVisibility(8);
        mo0Var4.setVisibility(8);
        mo0Var4.addView(b10Var4, 0);
        mo0Var4.e(true, false);
        frameLayout4.addView(mo0Var4);
        frameLayout4.addView(mm0Var3);
        mm0Var3.setEmptyView(mo0Var4);
        qo0 qo0Var = new qo0(nxVar, mm0Var3, context, this.H0);
        this.v0 = qo0Var;
        mm0Var3.setAdapter(qo0Var);
        mm0Var3.setOnScrollListener(new oo0(nxVar, eyVar, 1));
        mm0Var3.C0(new yb0(nxVar, 24));
        this.d0 = new rl0(u1Var, true);
        xh0 xh0Var = new xh0(context, eyVar);
        this.p0 = xh0Var;
        j71 j71Var = xh0Var.c;
        j71Var.setClipToPadding(false);
        j71Var.j(new ro0(nxVar, 0));
        j71Var.C0(new yb0(nxVar, 24));
        zo0 zo0Var = new zo0(nxVar);
        this.T = zo0Var;
        setAdapter(zo0Var);
    }

    public static org.telegram.ui.sn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.sn(bundle);
    }

    public static void O(FrameLayout frameLayout, mm0 mm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            mm0Var.s1(0, i10, 0, i11);
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
            Q();
            b91 b91Var = this.M;
            if (b91Var != null && b91Var.getCurrentTabId() != 0) {
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
                    if (((hg.o0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                so0Var.T(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            zo0 zo0Var = this.T;
            ArrayList arrayList = zo0Var.a;
            ArrayList arrayList2 = zo0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((yo0) arrayList2.get(i11)).a == 3 && ((yo0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final boolean M() {
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

    public final void N(View view, int i10, String str, boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.ui.i10 i10Var;
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
        org.telegram.ui.px pxVar = so0Var.U;
        long a2 = pxVar != null ? pxVar.a() : 0L;
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
        qo0 qo0Var = this.v0;
        qo0Var.getClass();
        if (n40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            uo0 uo0Var = this.j0;
            mm0 mm0Var = uo0Var.d;
            ArrayList arrayList2 = uo0Var.S;
            ArrayList arrayList3 = uo0Var.T;
            ArrayList arrayList4 = uo0Var.U;
            ArrayList arrayList5 = uo0Var.R;
            zp zpVar = uo0Var.e0;
            uo0Var.W();
            if (!TextUtils.equals(str, uo0Var.d0)) {
                uo0Var.d0 = str;
                AndroidUtilities.cancelRunOnUIThread(zpVar);
                if (TextUtils.isEmpty(uo0Var.d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    uo0Var.N(true);
                    uo0Var.c0++;
                    z15 = false;
                    uo0Var.Y = false;
                    uo0Var.Z = false;
                    uo0Var.a0 = false;
                    uo0Var.b0 = 0;
                    if (mm0Var != null) {
                        mm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(zpVar, 1000L);
                    uo0Var.Y = true;
                    uo0Var.Z = true;
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
            ArrayList arrayList6 = no0Var.V;
            ws wsVar = no0Var.h0;
            if (TextUtils.equals(str, no0Var.g0)) {
                z14 = false;
            } else {
                no0Var.g0 = str;
                AndroidUtilities.cancelRunOnUIThread(wsVar);
                if (TextUtils.isEmpty(no0Var.g0)) {
                    arrayList6.clear();
                    no0Var.N(true);
                    no0Var.f0++;
                    z14 = false;
                    no0Var.b0 = false;
                    no0Var.c0 = false;
                    no0Var.d0 = false;
                    no0Var.e0 = 0;
                    if (mm0Var2 != null) {
                        mm0Var2.u0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(wsVar, 1000L);
                    no0Var.b0 = true;
                    no0Var.c0 = true;
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
        xh0 xh0Var = this.p0;
        if (view == xh0Var) {
            j71 j71Var = xh0Var.c;
            ArrayList arrayList7 = xh0Var.n;
            if (TextUtils.equals(xh0Var.w, str)) {
                return;
            }
            if (xh0Var.K >= 0) {
                ConnectionsManager.getInstance(xh0Var.b).cancelRequest(xh0Var.K, true);
                xh0Var.K = -1;
            }
            xh0Var.v = false;
            xh0Var.H.setLoading(false);
            xh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                xh0Var.r = 0;
                z13 = true;
                xh0Var.L++;
                xh0Var.s = false;
                arrayList7.clear();
                xh0Var.a(false);
            } else {
                z13 = true;
                xh0Var.b(str);
                xh0Var.r = 0;
                xh0Var.L++;
                xh0Var.s = false;
                arrayList7.clear();
            }
            xh0Var.d();
            j71Var.u0(0);
            j71Var.Z2.N(z13);
            return;
        }
        if (view == this.r0) {
            if (n40.X(str, null) == null) {
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
            if (view instanceof org.telegram.ui.i10) {
                org.telegram.ui.i10 i10Var2 = (org.telegram.ui.i10) view;
                i10Var2.setUseFromUserAsAvatar(j15 != 0);
                i10Var2.c.b(this.N0, false);
                i10Var2.h(j11, this.T0, j16, j17, hg.q0.d3[((yo0) this.T.a.get(i10)).b], z16, str, z10);
                return;
            }
            if (view instanceof xn0) {
                xn0 xn0Var = (xn0) view;
                xn0Var.a.b(this.N0, false);
                xn0Var.K = str;
                xn0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.i10 i10Var3 = this.M0;
        if (!(j11 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z17 = true;
            i10Var3.setTag(1);
            i10Var3.i(this.L0, false);
            i10Var3.animate().setListener(null).cancel();
            if (z10) {
                i10Var3.setVisibility(0);
                i10Var3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (i10Var3.getVisibility() != 0) {
                    i10Var3.setVisibility(0);
                    i10Var3.setAlpha(0.0f);
                } else {
                    z17 = z10;
                }
                i10Var3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = z17;
            }
            z12 = false;
            long j18 = j11;
            i10Var = i10Var3;
            this.M0.h(j18, this.T0, j12, j13, null, z16, str, z11);
            mo0Var.setVisibility(8);
        } else {
            this.I0 = false;
            so0Var.T(z16 ? 1 : 0, str);
            so0Var.A0 = this.L0;
            i10Var3.animate().setListener(null).cancel();
            i10Var3.i(null, false);
            if (z10) {
                mo0Var.e(!(so0Var.D0 > 0), false);
                mo0Var.e(so0Var.D0 > 0, false);
            } else if (!so0Var.M()) {
                mo0Var.e(so0Var.D0 > 0, true);
            }
            if (z10) {
                i10Var3.setVisibility(8);
            } else if (i10Var3.getVisibility() != 8) {
                i10Var3.animate().alpha(0.0f).setListener(new i60(this, 17)).setDuration(150L).start();
            }
            i10Var3.setTag(null);
            i10Var = i10Var3;
            z12 = false;
        }
        mo0Var.b(this.N0, z12);
        i10Var.c.b(this.N0, z12);
    }

    public final void P(boolean z10) {
        lm0 lm0Var;
        lm0 lm0Var2;
        lm0 lm0Var3;
        org.telegram.ui.px pxVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.ey eyVar = this.J0;
        if (z10 && eyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !eyVar.getActionBar().a("search_view_pager")) {
            this.F0 = eyVar.getActionBar().i("search_view_pager");
            if (eyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                org.telegram.ui.ActionBar.r6.t(this.w0, org.telegram.ui.ActionBar.k6.y8, null, PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.w0;
                int i10 = org.telegram.ui.ActionBar.k6.z8;
                org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i10), null);
                this.w0.setOnClickListener(new v80(this, 13));
                this.F0.addView(this.w0, w7.z5.o(54, 54, 0.0f, 16));
            }
            wo0 wo0Var = new wo0(this.F0.getContext());
            this.x0 = wo0Var;
            wo0Var.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            wo0 wo0Var2 = this.x0;
            int i11 = org.telegram.ui.ActionBar.k6.y8;
            ud0 ud0Var = new ud0(11);
            ud0 ud0Var2 = new ud0(12);
            int R = org.telegram.ui.ActionBar.r6.R(i11, -1, 0, 0.0f, null);
            ud0Var2.d(R, wo0Var2);
            org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(101, wo0Var2);
            y3.c(i11, -1, 0, 0.0f, null);
            y3.n = ud0Var;
            y3.o = ud0Var2;
            y3.m = false;
            y3.g = R;
            this.F0.addView(this.x0, w7.z5.m(1.0f, 0, -1, eyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new di.d(21));
            org.telegram.ui.ActionBar.u0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            if (h.getIconView() != null) {
                org.telegram.ui.ActionBar.r6.t(this.B0.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
            }
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            so0 so0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((eyVar.W ? 18 : 72) + (so0Var != null && (pxVar = so0Var.U) != null && (pxVar.a() > 0L ? 1 : (pxVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            wo0 wo0Var3 = this.x0;
            wo0Var3.setLayoutParams(wo0Var3.getLayoutParams());
        }
        if (eyVar.getActionBar().getBackButton() != null && (eyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.i5)) {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            eyVar.getActionBar().setBackButtonDrawable(h2Var);
            h2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
            eyVar.getActionBar().N(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(M() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        eyVar.getActionBar().r();
        hashMap.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof org.telegram.ui.i10) && (lm0Var3 = ((org.telegram.ui.i10) getChildAt(i12)).d) != null) {
                lm0Var3.l();
            }
            if (getChildAt(i12) instanceof xn0) {
                ((xn0) getChildAt(i12)).d(true);
            }
        }
        org.telegram.ui.i10 i10Var = this.M0;
        if (i10Var != null && (lm0Var2 = i10Var.d) != null) {
            lm0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) sparseArray.valueAt(i13);
            if ((view instanceof org.telegram.ui.i10) && (lm0Var = ((org.telegram.ui.i10) view).d) != null) {
                lm0Var.l();
            }
        }
    }

    public final void Q() {
        this.T.i();
        o(false);
        b91 b91Var = this.M;
        if (b91Var != null) {
            b91Var.x.l();
        }
    }

    @Override // org.telegram.ui.h10
    public final void a() {
        P(true);
    }

    @Override // org.telegram.ui.h10
    public final boolean b(org.telegram.ui.a10 a10Var) {
        return this.z0.containsKey(a10Var);
    }

    @Override // org.telegram.ui.h10
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        P(false);
    }

    @Override // org.telegram.ui.h10
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.a10 a10Var = new org.telegram.ui.a10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(a10Var)) {
            hashMap.remove(a10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(a10Var, messageObject);
        }
        if (hashMap.size() == 0) {
            P(false);
        } else {
            this.x0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.u0 u0Var = this.C0;
            if (u0Var != null) {
                u0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.B0 != null) {
                boolean M = M();
                int i11 = M ? 0 : 8;
                if (this.B0.getVisibility() != i11) {
                    this.B0.setVisibility(i11);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.r6.z(this, animatedVectorDrawable, org.telegram.ui.ActionBar.k6.y8, null, PorterDuff.Mode.SRC_IN);
                    if (M) {
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
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.a10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(a10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).b(i10, hashMap.containsKey(a10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(a10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.q2) {
            ((org.telegram.ui.Cells.q2) view).U(hashMap.containsKey(a10Var), true);
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
                if (obj == qo0Var.S) {
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
                    xn0 xn0Var = this.G0;
                    if (view == xn0Var) {
                        mm0Var = xn0Var.b;
                    } else {
                        xh0 xh0Var = this.p0;
                        if (view == xh0Var) {
                            mm0Var = xh0Var.c;
                        } else if (view instanceof org.telegram.ui.i10) {
                            mm0Var = ((org.telegram.ui.i10) view).b;
                        }
                    }
                }
            }
            if (mm0Var != null) {
                hh.d.a(mm0Var, canvas, rectF, mm0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.i10 i10Var = this.M0;
                if (i10Var.getVisibility() == 0) {
                    ai.u1 u1Var = i10Var.b;
                    hh.d.a(u1Var, canvas, rectF, u1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.h10
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.o0> getCurrentSearchFilters() {
        return this.A0;
    }

    public xn0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.l91
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.u0 getSpeedItem() {
        return this.B0;
    }

    public k91 getTabsView() {
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

    @Override // org.telegram.ui.Components.l91
    public final void s() {
        this.Q0.L();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.X0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.y00 y00Var) {
        this.L0 = y00Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.i10) {
                ((org.telegram.ui.i10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof xn0) {
                ((xn0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.l91
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        b91 b91Var = this.M;
        if (b91Var != null) {
            b91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.l91
    public final void t(View view, View view2, int i10, int i11) {
        so0 so0Var = this.b0;
        org.telegram.ui.i10 i10Var = this.M0;
        if (i10 == 0) {
            if (i10Var.getVisibility() == 0) {
                i10Var.i(this.L0, false);
                so0Var.A0 = null;
            } else {
                i10Var.i(null, false);
                org.telegram.ui.y00 y00Var = this.L0;
                so0Var.A0 = y00Var;
                if (y00Var != null) {
                    ((org.telegram.ui.jv) y00Var).i(false, null, so0Var.y0, so0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.i10) {
            ((org.telegram.ui.i10) view).i(this.L0, i11 == 0 && i10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.i10) {
            ((org.telegram.ui.i10) view2).i(null, false);
        } else {
            so0Var.A0 = null;
            i10Var.i(null, false);
        }
    }
}
