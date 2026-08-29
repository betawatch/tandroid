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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class tn0 extends z71 implements org.telegram.ui.g10, NotificationCenter.NotificationCenterDelegate, mg.a {
    public static final /* synthetic */ int T0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.a0 B0;
    public tm0 C0;
    public final int D0;
    public boolean E0;
    public final org.telegram.ui.fy F0;
    public String G0;
    public org.telegram.ui.y00 H0;
    public final org.telegram.ui.h10 I0;
    public int J0;
    public boolean K0;
    public final org.telegram.ui.kx L0;
    public final hv0 M0;
    public final int N0;
    public int O0;
    public final sn0 P;
    public final long P0;
    public final FrameLayout Q;
    public int Q0;
    public final jh.e1 R;
    public int R0;
    public final gn0 S;
    public lg.a S0;
    public final f2.l T;
    public final mn0 U;
    public final f2.j0 V;
    public final pk0 W;
    public boolean a0;
    public final FrameLayout b0;
    public final gn0 c0;
    public final f2.j0 d0;
    public final jl0 e0;
    public final on0 f0;
    public final FrameLayout g0;
    public final gn0 h0;
    public final f2.j0 i0;
    public final jl0 j0;
    public final hn0 k0;
    public final ug0 l0;
    public boolean m0;
    public final FrameLayout n0;
    public final gn0 o0;
    public final f2.j0 p0;
    public final jl0 q0;
    public final kn0 r0;
    public ImageView s0;
    public NumberTextView t0;
    public boolean u0;
    public final HashMap v0;
    public final ArrayList w0;
    public org.telegram.ui.ActionBar.w0 x0;
    public org.telegram.ui.ActionBar.w0 y0;
    public org.telegram.ui.ActionBar.w0 z0;

    public tn0(Context context, org.telegram.ui.fy fyVar, int i10, int i11, int i12, long j10, org.telegram.ui.kx kxVar) {
        super(context, null);
        this.m0 = false;
        this.v0 = new HashMap();
        this.w0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.D0 = i13;
        this.O0 = 0;
        this.N0 = i12;
        this.P0 = j10;
        this.F0 = fyVar;
        this.L0 = kxVar;
        f2.l lVar = new f2.l();
        this.T = lVar;
        lVar.c = 150L;
        lVar.e = 350L;
        lVar.f = 0L;
        lVar.g = 0L;
        lVar.d = 0L;
        lVar.i = new OvershootInterpolator(1.1f);
        lVar.o = jr.h;
        org.telegram.ui.ox oxVar = (org.telegram.ui.ox) this;
        this.U = new mn0(oxVar, context, fyVar, i10, i11, lVar, fyVar.B, fyVar, context);
        if (i11 == 15) {
            ArrayList R3 = fyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = a4.w.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.U.m0 = arrayList;
        }
        this.M0 = (hv0) fyVar.getFragmentView();
        jh.e1 e1Var = new jh.e1(oxVar, context, 20);
        this.R = e1Var;
        e1Var.setItemAnimator(this.T);
        e1Var.setPivotY(0.0f);
        e1Var.setClipToPadding(false);
        e1Var.setAdapter(this.U);
        e1Var.setVerticalScrollBarEnabled(true);
        e1Var.setInstantClick(true);
        e1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var = new f2.j0(1, false);
        this.V = j0Var;
        e1Var.setLayoutManager(j0Var);
        e1Var.U1 = true;
        e1Var.V1 = 0;
        e1Var.setOnScrollListener(new in0(oxVar, fyVar, 2));
        e1Var.C0(new xb0(oxVar, 23));
        org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(this.F0);
        this.I0 = h10Var;
        jh.e1 e1Var2 = h10Var.b;
        e1Var2.setClipToPadding(false);
        e1Var2.j(new ln0(oxVar, 1));
        e1Var2.C0(new xb0(oxVar, 23));
        h10Var.setUiCallback(this);
        h10Var.setVisibility(8);
        h10Var.setChatPreviewDelegate(kxVar);
        p00 p00Var = new p00(context, null);
        p00Var.setViewType(1);
        gn0 gn0Var = new gn0(oxVar, context, p00Var, 2);
        this.S = gn0Var;
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.e.setVisibility(8);
        gn0Var.setVisibility(8);
        gn0Var.addView(p00Var, 0);
        gn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.addView(gn0Var);
        frameLayout.addView(e1Var);
        frameLayout.addView(h10Var);
        e1Var.setEmptyView(gn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b0 = frameLayout2;
        nn0 nn0Var = new nn0(oxVar);
        nn0Var.m = false;
        nn0Var.C = false;
        jr jrVar = jr.h;
        nn0Var.o(jrVar);
        nn0Var.n(350L);
        jl0 jl0Var = new jl0(context, null);
        this.e0 = jl0Var;
        jl0Var.setItemAnimator(nn0Var);
        jl0Var.setPivotY(0.0f);
        jl0Var.setVerticalScrollBarEnabled(true);
        jl0Var.setInstantClick(true);
        jl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var2 = new f2.j0(1, false);
        this.d0 = j0Var2;
        jl0Var.setLayoutManager(j0Var2);
        jl0Var.U1 = true;
        jl0Var.V1 = 0;
        jl0Var.setClipToPadding(false);
        p00 p00Var2 = new p00(context, null);
        p00Var2.setViewType(1);
        gn0 gn0Var2 = new gn0(oxVar, context, p00Var2, 3);
        this.c0 = gn0Var2;
        gn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var2.e.setVisibility(8);
        gn0Var2.setVisibility(8);
        gn0Var2.addView(p00Var2, 0);
        gn0Var2.e(true, false);
        frameLayout2.addView(gn0Var2);
        frameLayout2.addView(jl0Var);
        jl0Var.setEmptyView(gn0Var2);
        on0 on0Var = new on0(oxVar, jl0Var, context, this.D0, i12, fyVar);
        this.f0 = on0Var;
        jl0Var.setAdapter(on0Var);
        jl0Var.setOnScrollListener(new in0(oxVar, fyVar, 3));
        jl0Var.C0(new xb0(oxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.g0 = frameLayout3;
        fn0 fn0Var = new fn0(oxVar);
        fn0Var.m = false;
        fn0Var.C = false;
        fn0Var.o(jrVar);
        fn0Var.n(350L);
        jl0 jl0Var2 = new jl0(context, null);
        this.j0 = jl0Var2;
        jl0Var2.setItemAnimator(fn0Var);
        jl0Var2.setPivotY(0.0f);
        jl0Var2.setClipToPadding(false);
        jl0Var2.setVerticalScrollBarEnabled(true);
        jl0Var2.setInstantClick(true);
        jl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var3 = new f2.j0(1, false);
        this.i0 = j0Var3;
        jl0Var2.setLayoutManager(j0Var3);
        jl0Var2.U1 = true;
        jl0Var2.V1 = 0;
        p00 p00Var3 = new p00(context, null);
        p00Var3.setViewType(1);
        gn0 gn0Var3 = new gn0(oxVar, context, p00Var3, 0);
        this.h0 = gn0Var3;
        gn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var3.e.setVisibility(8);
        gn0Var3.setVisibility(8);
        gn0Var3.addView(p00Var3, 0);
        gn0Var3.e(true, false);
        frameLayout3.addView(gn0Var3);
        frameLayout3.addView(jl0Var2);
        jl0Var2.setEmptyView(gn0Var3);
        hn0 hn0Var = new hn0(oxVar, jl0Var2, context, this.D0, i12);
        this.k0 = hn0Var;
        jl0Var2.setAdapter(hn0Var);
        jl0Var2.setOnScrollListener(new in0(oxVar, fyVar, 0));
        jl0Var2.C0(new xb0(oxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.n0 = frameLayout4;
        jn0 jn0Var = new jn0(oxVar);
        jn0Var.m = false;
        jn0Var.C = false;
        jn0Var.o(jrVar);
        jn0Var.n(350L);
        jl0 jl0Var3 = new jl0(context, null);
        this.q0 = jl0Var3;
        jl0Var3.setItemAnimator(jn0Var);
        jl0Var3.setPivotY(0.0f);
        jl0Var3.setVerticalScrollBarEnabled(true);
        jl0Var3.setInstantClick(true);
        jl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var4 = new f2.j0(1, false);
        this.p0 = j0Var4;
        jl0Var3.setLayoutManager(j0Var4);
        jl0Var3.U1 = true;
        jl0Var3.V1 = 0;
        jl0Var3.setClipToPadding(false);
        p00 p00Var4 = new p00(context, null);
        p00Var4.setViewType(1);
        gn0 gn0Var4 = new gn0(oxVar, context, p00Var4, 1);
        this.o0 = gn0Var4;
        gn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var4.e.setVisibility(8);
        gn0Var4.setVisibility(8);
        gn0Var4.addView(p00Var4, 0);
        gn0Var4.e(true, false);
        frameLayout4.addView(gn0Var4);
        frameLayout4.addView(jl0Var3);
        jl0Var3.setEmptyView(gn0Var4);
        kn0 kn0Var = new kn0(oxVar, jl0Var3, context, this.D0);
        this.r0 = kn0Var;
        jl0Var3.setAdapter(kn0Var);
        jl0Var3.setOnScrollListener(new in0(oxVar, fyVar, 1));
        jl0Var3.C0(new xb0(oxVar, 23));
        this.W = new pk0(e1Var, true);
        ug0 ug0Var = new ug0(context, fyVar);
        this.l0 = ug0Var;
        u51 u51Var = ug0Var.c;
        u51Var.setClipToPadding(false);
        u51Var.j(new ln0(oxVar, 0));
        u51Var.C0(new xb0(oxVar, 23));
        sn0 sn0Var = new sn0(oxVar);
        this.P = sn0Var;
        setAdapter(sn0Var);
    }

    public static org.telegram.ui.tn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.tn(bundle);
    }

    public static void P(FrameLayout frameLayout, jl0 jl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            jl0Var.o1(0, i10, 0, i11);
        } else {
            jl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.m0) {
            int i10 = 0;
            this.m0 = false;
            R();
            o71 o71Var = this.I;
            if (o71Var != null && o71Var.getCurrentTabId() != 0) {
                this.I.d(0, 0);
            }
            mn0 mn0Var = this.U;
            if (mn0Var != null) {
                String str = this.G0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.w0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((rf.f0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                mn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            sn0 sn0Var = this.P;
            ArrayList arrayList = sn0Var.a;
            ArrayList arrayList2 = sn0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((rn0) arrayList2.get(i11)).a == 3 && ((rn0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            jh.e1 e1Var = this.R;
            if (i10 >= e1Var.getChildCount()) {
                break;
            }
            View childAt = e1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.f6) || (childAt instanceof org.telegram.ui.Cells.p2) || (childAt instanceof org.telegram.ui.Cells.j4)) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.h10) {
                arrayList.addAll(((org.telegram.ui.h10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.h10) {
                arrayList.addAll(((org.telegram.ui.h10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.h10 h10Var = this.I0;
        if (h10Var != null) {
            arrayList.addAll(h10Var.getThemeDescriptions());
        }
        gn0 gn0Var = this.S;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(gn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.y6));
        arrayList.addAll(i7.i6.a(new x6(this, 7), org.telegram.ui.ActionBar.g6.y8));
    }

    public final boolean N() {
        int i10 = this.D0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.v0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z10) {
        org.telegram.ui.h10 h10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        gn0 gn0Var = this.S;
        if (isEmpty) {
            gn0Var.e.setVisibility(8);
        } else {
            gn0Var.e.setVisibility(0);
            gn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        mn0 mn0Var = this.U;
        org.telegram.ui.qx qxVar = mn0Var.Q;
        long a2 = qxVar != null ? qxVar.a() : 0L;
        long j11 = i10 == 0 ? 0L : a2;
        long j12 = 0;
        long j13 = 0;
        int i11 = 0;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.w0;
            if (i11 >= arrayList.size()) {
                break;
            }
            rf.f0 f0Var = (rf.f0) arrayList.get(i11);
            int i12 = f0Var.d;
            if (i12 == 4) {
                TLObject tLObject = f0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j10 = -((TLRPC.Chat) f0Var.f).id;
                }
                j11 = j10;
            } else if (i12 == 6) {
                rf.d0 d0Var = f0Var.g;
                long j14 = d0Var.b;
                j13 = d0Var.c;
                j12 = j14;
            } else if (i12 == 7) {
                z15 = true;
            }
            i11++;
        }
        kn0 kn0Var = this.r0;
        kn0Var.getClass();
        if (c40.X(str, null) == null) {
            J();
        }
        if (view == this.b0) {
            MessagesController.getInstance(this.D0).getChannelRecommendations(0L);
            on0 on0Var = this.f0;
            jl0 jl0Var = on0Var.d;
            ArrayList arrayList2 = on0Var.M;
            ArrayList arrayList3 = on0Var.N;
            ArrayList arrayList4 = on0Var.O;
            ArrayList arrayList5 = on0Var.L;
            rp rpVar = on0Var.Y;
            on0Var.W();
            if (!TextUtils.equals(str, on0Var.X)) {
                on0Var.X = str;
                AndroidUtilities.cancelRunOnUIThread(rpVar);
                if (TextUtils.isEmpty(on0Var.X)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    on0Var.N(true);
                    on0Var.W++;
                    z14 = false;
                    on0Var.S = false;
                    on0Var.T = false;
                    on0Var.U = false;
                    on0Var.V = 0;
                    if (jl0Var != null) {
                        jl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(rpVar, 1000L);
                    on0Var.S = true;
                    on0Var.T = true;
                    on0Var.N(true);
                    if (jl0Var != null) {
                        z14 = false;
                        jl0Var.u0(0);
                    }
                }
                this.c0.b(this.J0, z14);
                return;
            }
            z14 = false;
            this.c0.b(this.J0, z14);
            return;
        }
        if (view == this.g0) {
            hn0 hn0Var = this.k0;
            jl0 jl0Var2 = hn0Var.d;
            ArrayList arrayList6 = hn0Var.P;
            hs hsVar = hn0Var.b0;
            if (TextUtils.equals(str, hn0Var.a0)) {
                z13 = false;
            } else {
                hn0Var.a0 = str;
                AndroidUtilities.cancelRunOnUIThread(hsVar);
                if (TextUtils.isEmpty(hn0Var.a0)) {
                    arrayList6.clear();
                    hn0Var.N(true);
                    hn0Var.Z++;
                    z13 = false;
                    hn0Var.V = false;
                    hn0Var.W = false;
                    hn0Var.X = false;
                    hn0Var.Y = 0;
                    if (jl0Var2 != null) {
                        jl0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(hsVar, 1000L);
                    hn0Var.V = true;
                    hn0Var.W = true;
                    hn0Var.N(true);
                    if (jl0Var2 != null) {
                        jl0Var2.u0(0);
                    }
                }
            }
            this.h0.b(this.J0, z13);
            if (TextUtils.isEmpty(str)) {
                hn0Var.V();
                return;
            }
            return;
        }
        ug0 ug0Var = this.l0;
        if (view == ug0Var) {
            u51 u51Var = ug0Var.c;
            ArrayList arrayList7 = ug0Var.n;
            if (TextUtils.equals(ug0Var.w, str)) {
                return;
            }
            if (ug0Var.G >= 0) {
                ConnectionsManager.getInstance(ug0Var.b).cancelRequest(ug0Var.G, true);
                ug0Var.G = -1;
            }
            ug0Var.v = false;
            ug0Var.D.setLoading(false);
            ug0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                ug0Var.r = 0;
                z12 = true;
                ug0Var.H++;
                ug0Var.s = false;
                arrayList7.clear();
                ug0Var.a(false);
            } else {
                z12 = true;
                ug0Var.b(str);
                ug0Var.r = 0;
                ug0Var.H++;
                ug0Var.s = false;
                arrayList7.clear();
            }
            ug0Var.d();
            u51Var.u0(0);
            u51Var.U2.N(z12);
            return;
        }
        if (view == this.n0) {
            if (c40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.p0.h1(0, 0);
            }
            kn0Var.Y(str);
            this.o0.b(this.J0, false);
            return;
        }
        if (view != this.Q) {
            long j15 = a2;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.h10) {
                org.telegram.ui.h10 h10Var2 = (org.telegram.ui.h10) view;
                h10Var2.setUseFromUserAsAvatar(j15 != 0);
                h10Var2.c.b(this.J0, false);
                h10Var2.h(j11, this.P0, j16, j17, rf.h0.Y2[((rn0) this.P.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof tm0) {
                tm0 tm0Var = (tm0) view;
                tm0Var.a.b(this.J0, false);
                tm0Var.G = str;
                tm0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.h10 h10Var3 = this.I0;
        if (!(j11 == 0 && this.P0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z16 = true;
            h10Var3.setTag(1);
            h10Var3.i(this.H0, false);
            h10Var3.animate().setListener(null).cancel();
            if (z10) {
                h10Var3.setVisibility(0);
                h10Var3.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (h10Var3.getVisibility() != 0) {
                    h10Var3.setVisibility(0);
                    h10Var3.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                h10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            h10Var = h10Var3;
            z11 = false;
            this.I0.h(j11, this.P0, j12, j13, null, z15, str, z16);
            gn0Var.setVisibility(8);
        } else {
            this.E0 = false;
            mn0Var.U(z15 ? 1 : 0, str);
            mn0Var.w0 = this.H0;
            h10Var3.animate().setListener(null).cancel();
            h10Var3.i(null, false);
            if (z10) {
                gn0Var.e(!(mn0Var.z0 > 0), false);
                gn0Var.e(mn0Var.z0 > 0, false);
            } else if (!mn0Var.N()) {
                gn0Var.e(mn0Var.z0 > 0, true);
            }
            if (z10) {
                h10Var3.setVisibility(8);
            } else if (h10Var3.getVisibility() != 8) {
                h10Var3.animate().alpha(0.0f).setListener(new zz(this, 18)).setDuration(150L).start();
            }
            h10Var3.setTag(null);
            h10Var = h10Var3;
            z11 = false;
        }
        gn0Var.b(this.J0, z11);
        h10Var.c.b(this.J0, z11);
    }

    public final void Q(boolean z10) {
        il0 il0Var;
        il0 il0Var2;
        il0 il0Var3;
        org.telegram.ui.qx qxVar;
        if (this.u0 == z10) {
            return;
        }
        org.telegram.ui.fy fyVar = this.F0;
        if (z10 && fyVar.getActionBar().s()) {
            return;
        }
        if (z10 && !fyVar.getActionBar().a("search_view_pager")) {
            this.B0 = fyVar.getActionBar().j("search_view_pager");
            if (fyVar.S) {
                ImageView imageView = new ImageView(getContext());
                this.s0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.s0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                this.s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.s0.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), 1, -1));
                this.s0.setOnClickListener(new u70(this, 14));
                this.B0.addView(this.s0, i7.f6.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.B0.getContext());
            this.t0 = numberTextView;
            numberTextView.setTextSize(18);
            this.t0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.t0;
            int i10 = org.telegram.ui.ActionBar.g6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            this.B0.addView(this.t0, i7.f6.m(1.0f, 0, -1, fyVar.S ? 18 : 72, 0, 0));
            this.t0.setOnTouchListener(new mh.d(21));
            org.telegram.ui.ActionBar.w0 h = this.B0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.x0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.y0 = this.B0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.z0 = this.B0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.A0 = this.B0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.t0 != null) {
            mn0 mn0Var = this.U;
            ((ViewGroup.MarginLayoutParams) this.t0.getLayoutParams()).leftMargin = AndroidUtilities.dp((fyVar.S ? 18 : 72) + (mn0Var != null && (qxVar = mn0Var.Q) != null && (qxVar.a() > 0L ? 1 : (qxVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.t0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (fyVar.getActionBar().getBackButton() != null && (fyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            fyVar.getActionBar().setBackButtonDrawable(h2Var);
            h2Var.setColorFilter(null);
        }
        this.u0 = z10;
        HashMap hashMap = this.v0;
        if (z10) {
            AndroidUtilities.hideKeyboard(fyVar.getParentActivity().getCurrentFocus());
            fyVar.getActionBar().O(null, null);
            this.t0.a(hashMap.size(), false);
            this.x0.setVisibility(N() ? 0 : 8);
            this.y0.setVisibility(0);
            this.z0.setVisibility(0);
            this.A0.setVisibility(0);
            return;
        }
        fyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.h10) && (il0Var3 = ((org.telegram.ui.h10) getChildAt(i11)).d) != null) {
                il0Var3.l();
            }
            if (getChildAt(i11) instanceof tm0) {
                ((tm0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.h10 h10Var = this.I0;
        if (h10Var != null && (il0Var2 = h10Var.d) != null) {
            il0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.h10) && (il0Var = ((org.telegram.ui.h10) view).d) != null) {
                il0Var.l();
            }
        }
    }

    public final void R() {
        this.P.i();
        o(false);
        o71 o71Var = this.I;
        if (o71Var != null) {
            o71Var.x.l();
        }
    }

    @Override // org.telegram.ui.g10
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.g10
    public final boolean b(org.telegram.ui.z00 z00Var) {
        return this.v0.containsKey(z00Var);
    }

    @Override // org.telegram.ui.g10
    public final void c(MessageObject messageObject) {
        this.F0.presentFragment(K(messageObject, this.D0));
        Q(false);
    }

    @Override // org.telegram.ui.g10
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.z00 z00Var = new org.telegram.ui.z00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.v0;
        if (hashMap.containsKey(z00Var)) {
            hashMap.remove(z00Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(z00Var, messageObject);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.t0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.y0;
            if (w0Var != null) {
                w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.x0 != null) {
                boolean N = N();
                int i11 = N ? 0 : 8;
                if (this.x0.getVisibility() != i11) {
                    this.x0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.x0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i12 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.A0 != null) {
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
                this.A0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(hashMap.containsKey(z00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q7) {
            ((org.telegram.ui.Cells.q7) view).b(i10, hashMap.containsKey(z00Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).f(hashMap.containsKey(z00Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).e(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).V(hashMap.containsKey(z00Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        on0 on0Var = this.f0;
        if (i10 == i12) {
            this.c0.e(MessagesController.getInstance(this.D0).getChannelRecommendations(0L) != null, true);
            on0Var.W();
            on0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            on0Var.W();
            on0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.k0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                kn0 kn0Var = this.r0;
                if (obj == kn0Var.M) {
                    kn0Var.N(true);
                }
            }
        }
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.Q;
            jl0 jl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    jl0Var = this.R;
                } else if (view == this.b0) {
                    jl0Var = this.e0;
                } else if (view == this.g0) {
                    jl0Var = this.j0;
                } else if (view == this.n0) {
                    jl0Var = this.q0;
                } else {
                    tm0 tm0Var = this.C0;
                    if (view == tm0Var) {
                        jl0Var = tm0Var.b;
                    } else {
                        ug0 ug0Var = this.l0;
                        if (view == ug0Var) {
                            jl0Var = ug0Var.c;
                        } else if (view instanceof org.telegram.ui.h10) {
                            jl0Var = ((org.telegram.ui.h10) view).b;
                        }
                    }
                }
            }
            if (jl0Var != null) {
                rg.c.b(jl0Var, canvas, rectF, jl0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.h10 h10Var = this.I0;
                if (h10Var.getVisibility() == 0) {
                    jh.e1 e1Var = h10Var.b;
                    rg.c.b(e1Var, canvas, rectF, e1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.g10
    public final boolean f() {
        return this.u0;
    }

    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }

    public org.telegram.ui.ActionBar.a0 getActionMode() {
        return this.B0;
    }

    public ArrayList<rf.f0> getCurrentSearchFilters() {
        return this.w0;
    }

    public tm0 getDownloadsContainer() {
        return this.C0;
    }

    public int getFolderId() {
        return this.N0;
    }

    @Override // org.telegram.ui.Components.z71
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.x0;
    }

    public y71 getTabsView() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.D0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        this.a0 = true;
        on0 on0Var = this.f0;
        if (on0Var != null) {
            on0Var.N(false);
        }
        hn0 hn0Var = this.k0;
        if (hn0Var != null) {
            hn0Var.N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a0 = false;
        int i10 = this.D0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.z71
    public final void s() {
        this.M0.M();
    }

    public void setBlurredBackgroundDrawableFactory(lg.a aVar) {
        this.S0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.y00 y00Var) {
        this.H0 = y00Var;
    }

    public void setKeyboardHeight(int i10) {
        this.J0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.h10) {
                ((org.telegram.ui.h10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.Q) {
                this.S.b(i10, z10);
                this.I0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof tm0) {
                ((tm0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.b0) {
                this.c0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        o71 o71Var = this.I;
        if (o71Var != null) {
            o71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.z71
    public final void t(View view, View view2, int i10, int i11) {
        mn0 mn0Var = this.U;
        org.telegram.ui.h10 h10Var = this.I0;
        if (i10 == 0) {
            if (h10Var.getVisibility() == 0) {
                h10Var.i(this.H0, false);
                mn0Var.w0 = null;
            } else {
                h10Var.i(null, false);
                org.telegram.ui.y00 y00Var = this.H0;
                mn0Var.w0 = y00Var;
                if (y00Var != null) {
                    ((org.telegram.ui.kv) y00Var).i(false, null, mn0Var.u0, mn0Var.v0);
                }
            }
        } else if (view instanceof org.telegram.ui.h10) {
            ((org.telegram.ui.h10) view).i(this.H0, i11 == 0 && h10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.h10) {
            ((org.telegram.ui.h10) view2).i(null, false);
        } else {
            mn0Var.w0 = null;
            h10Var.i(null, false);
        }
    }
}
