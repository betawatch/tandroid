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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class eo0 extends m81 implements org.telegram.ui.s10, NotificationCenter.NotificationCenterDelegate, pg.a {
    public static final /* synthetic */ int U0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.w0 B0;
    public org.telegram.ui.ActionBar.z C0;
    public en0 D0;
    public final int E0;
    public boolean F0;
    public final org.telegram.ui.py G0;
    public String H0;
    public org.telegram.ui.k10 I0;
    public final org.telegram.ui.t10 J0;
    public int K0;
    public boolean L0;
    public final org.telegram.ui.ux M0;
    public final qv0 N0;
    public final int O0;
    public int P0;
    public final do0 Q;
    public final long Q0;
    public final FrameLayout R;
    public int R0;
    public final mh.d1 S;
    public int S0;
    public final rn0 T;
    public og.a T0;
    public final f2.l U;
    public final xn0 V;
    public final f2.j0 W;
    public final al0 a0;
    public boolean b0;
    public final FrameLayout c0;
    public final rn0 d0;
    public final f2.j0 e0;
    public final tl0 f0;
    public final zn0 g0;
    public final FrameLayout h0;
    public final rn0 i0;
    public final f2.j0 j0;
    public final tl0 k0;
    public final sn0 l0;
    public final gh0 m0;
    public boolean n0;
    public final FrameLayout o0;
    public final rn0 p0;
    public final f2.j0 q0;
    public final tl0 r0;
    public final vn0 s0;
    public ImageView t0;
    public NumberTextView u0;
    public boolean v0;
    public final HashMap w0;
    public final ArrayList x0;
    public org.telegram.ui.ActionBar.w0 y0;
    public org.telegram.ui.ActionBar.w0 z0;

    public eo0(Context context, org.telegram.ui.py pyVar, int i10, int i11, int i12, long j10, org.telegram.ui.ux uxVar) {
        super(context, null);
        this.n0 = false;
        this.w0 = new HashMap();
        this.x0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.E0 = i13;
        this.P0 = 0;
        this.O0 = i12;
        this.Q0 = j10;
        this.G0 = pyVar;
        this.M0 = uxVar;
        f2.l lVar = new f2.l();
        this.U = lVar;
        lVar.c = 150L;
        lVar.e = 350L;
        lVar.f = 0L;
        lVar.g = 0L;
        lVar.d = 0L;
        lVar.i = new OvershootInterpolator(1.1f);
        lVar.o = pr.h;
        org.telegram.ui.yx yxVar = (org.telegram.ui.yx) this;
        this.V = new xn0(yxVar, context, pyVar, i10, i11, lVar, pyVar.C, pyVar, context);
        if (i11 == 15) {
            ArrayList R3 = pyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = android.support.v4.media.a.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.V.n0 = arrayList;
        }
        this.N0 = (qv0) pyVar.getFragmentView();
        mh.d1 d1Var = new mh.d1(yxVar, context, 19);
        this.S = d1Var;
        d1Var.setItemAnimator(this.U);
        d1Var.setPivotY(0.0f);
        d1Var.setClipToPadding(false);
        d1Var.setAdapter(this.V);
        d1Var.setVerticalScrollBarEnabled(true);
        d1Var.setInstantClick(true);
        d1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var = new f2.j0(1, false);
        this.W = j0Var;
        d1Var.setLayoutManager(j0Var);
        d1Var.V1 = true;
        d1Var.W1 = 0;
        d1Var.setOnScrollListener(new tn0(yxVar, pyVar, 2));
        d1Var.C0(new ec0(yxVar, 23));
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(this.G0);
        this.J0 = t10Var;
        mh.d1 d1Var2 = t10Var.b;
        d1Var2.setClipToPadding(false);
        d1Var2.j(new wn0(yxVar, 1));
        d1Var2.C0(new ec0(yxVar, 23));
        t10Var.setUiCallback(this);
        t10Var.setVisibility(8);
        t10Var.setChatPreviewDelegate(uxVar);
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(1);
        rn0 rn0Var = new rn0(yxVar, context, u00Var, 2);
        this.T = rn0Var;
        rn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var.e.setVisibility(8);
        rn0Var.setVisibility(8);
        rn0Var.addView(u00Var, 0);
        rn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.addView(rn0Var);
        frameLayout.addView(d1Var);
        frameLayout.addView(t10Var);
        d1Var.setEmptyView(rn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c0 = frameLayout2;
        yn0 yn0Var = new yn0(yxVar);
        yn0Var.m = false;
        yn0Var.C = false;
        pr prVar = pr.h;
        yn0Var.o(prVar);
        yn0Var.n(350L);
        tl0 tl0Var = new tl0(context, null);
        this.f0 = tl0Var;
        tl0Var.setItemAnimator(yn0Var);
        tl0Var.setPivotY(0.0f);
        tl0Var.setVerticalScrollBarEnabled(true);
        tl0Var.setInstantClick(true);
        tl0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var2 = new f2.j0(1, false);
        this.e0 = j0Var2;
        tl0Var.setLayoutManager(j0Var2);
        tl0Var.V1 = true;
        tl0Var.W1 = 0;
        tl0Var.setClipToPadding(false);
        u00 u00Var2 = new u00(context, null);
        u00Var2.setViewType(1);
        rn0 rn0Var2 = new rn0(yxVar, context, u00Var2, 3);
        this.d0 = rn0Var2;
        rn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var2.e.setVisibility(8);
        rn0Var2.setVisibility(8);
        rn0Var2.addView(u00Var2, 0);
        rn0Var2.e(true, false);
        frameLayout2.addView(rn0Var2);
        frameLayout2.addView(tl0Var);
        tl0Var.setEmptyView(rn0Var2);
        zn0 zn0Var = new zn0(yxVar, tl0Var, context, this.E0, i12, pyVar);
        this.g0 = zn0Var;
        tl0Var.setAdapter(zn0Var);
        tl0Var.setOnScrollListener(new tn0(yxVar, pyVar, 3));
        tl0Var.C0(new ec0(yxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.h0 = frameLayout3;
        qn0 qn0Var = new qn0(yxVar);
        qn0Var.m = false;
        qn0Var.C = false;
        qn0Var.o(prVar);
        qn0Var.n(350L);
        tl0 tl0Var2 = new tl0(context, null);
        this.k0 = tl0Var2;
        tl0Var2.setItemAnimator(qn0Var);
        tl0Var2.setPivotY(0.0f);
        tl0Var2.setClipToPadding(false);
        tl0Var2.setVerticalScrollBarEnabled(true);
        tl0Var2.setInstantClick(true);
        tl0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var3 = new f2.j0(1, false);
        this.j0 = j0Var3;
        tl0Var2.setLayoutManager(j0Var3);
        tl0Var2.V1 = true;
        tl0Var2.W1 = 0;
        u00 u00Var3 = new u00(context, null);
        u00Var3.setViewType(1);
        rn0 rn0Var3 = new rn0(yxVar, context, u00Var3, 0);
        this.i0 = rn0Var3;
        rn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var3.e.setVisibility(8);
        rn0Var3.setVisibility(8);
        rn0Var3.addView(u00Var3, 0);
        rn0Var3.e(true, false);
        frameLayout3.addView(rn0Var3);
        frameLayout3.addView(tl0Var2);
        tl0Var2.setEmptyView(rn0Var3);
        sn0 sn0Var = new sn0(yxVar, tl0Var2, context, this.E0, i12);
        this.l0 = sn0Var;
        tl0Var2.setAdapter(sn0Var);
        tl0Var2.setOnScrollListener(new tn0(yxVar, pyVar, 0));
        tl0Var2.C0(new ec0(yxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.o0 = frameLayout4;
        un0 un0Var = new un0(yxVar);
        un0Var.m = false;
        un0Var.C = false;
        un0Var.o(prVar);
        un0Var.n(350L);
        tl0 tl0Var3 = new tl0(context, null);
        this.r0 = tl0Var3;
        tl0Var3.setItemAnimator(un0Var);
        tl0Var3.setPivotY(0.0f);
        tl0Var3.setVerticalScrollBarEnabled(true);
        tl0Var3.setInstantClick(true);
        tl0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.j0 j0Var4 = new f2.j0(1, false);
        this.q0 = j0Var4;
        tl0Var3.setLayoutManager(j0Var4);
        tl0Var3.V1 = true;
        tl0Var3.W1 = 0;
        tl0Var3.setClipToPadding(false);
        u00 u00Var4 = new u00(context, null);
        u00Var4.setViewType(1);
        rn0 rn0Var4 = new rn0(yxVar, context, u00Var4, 1);
        this.p0 = rn0Var4;
        rn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var4.e.setVisibility(8);
        rn0Var4.setVisibility(8);
        rn0Var4.addView(u00Var4, 0);
        rn0Var4.e(true, false);
        frameLayout4.addView(rn0Var4);
        frameLayout4.addView(tl0Var3);
        tl0Var3.setEmptyView(rn0Var4);
        vn0 vn0Var = new vn0(yxVar, tl0Var3, context, this.E0);
        this.s0 = vn0Var;
        tl0Var3.setAdapter(vn0Var);
        tl0Var3.setOnScrollListener(new tn0(yxVar, pyVar, 1));
        tl0Var3.C0(new ec0(yxVar, 23));
        this.a0 = new al0(d1Var, true);
        gh0 gh0Var = new gh0(context, pyVar);
        this.m0 = gh0Var;
        i61 i61Var = gh0Var.c;
        i61Var.setClipToPadding(false);
        i61Var.j(new wn0(yxVar, 0));
        i61Var.C0(new ec0(yxVar, 23));
        do0 do0Var = new do0(yxVar);
        this.Q = do0Var;
        setAdapter(do0Var);
    }

    public static org.telegram.ui.xn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.xn(bundle);
    }

    public static void P(FrameLayout frameLayout, tl0 tl0Var, int i10, int i11, boolean z4) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z4) {
            tl0Var.o1(0, i10, 0, i11);
        } else {
            tl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.n0) {
            int i10 = 0;
            this.n0 = false;
            R();
            c81 c81Var = this.J;
            if (c81Var != null && c81Var.getCurrentTabId() != 0) {
                this.J.d(0, 0);
            }
            xn0 xn0Var = this.V;
            if (xn0Var != null) {
                String str = this.H0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.x0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((uf.e0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                xn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            do0 do0Var = this.Q;
            ArrayList arrayList = do0Var.a;
            ArrayList arrayList2 = do0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((co0) arrayList2.get(i11)).a == 3 && ((co0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            mh.d1 d1Var = this.S;
            if (i10 >= d1Var.getChildCount()) {
                break;
            }
            View childAt = d1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.m6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                arrayList.addAll(((org.telegram.ui.t10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.t10) {
                arrayList.addAll(((org.telegram.ui.t10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.t10 t10Var = this.J0;
        if (t10Var != null) {
            arrayList.addAll(t10Var.getThemeDescriptions());
        }
        rn0 rn0Var = this.T;
        arrayList.add(new org.telegram.ui.ActionBar.m6(rn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(rn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.y6));
        arrayList.addAll(k7.f6.a(new t6(this, 7), org.telegram.ui.ActionBar.k6.y8));
    }

    public final boolean N() {
        int i10 = this.E0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.w0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z4) {
        org.telegram.ui.t10 t10Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        boolean isEmpty = TextUtils.isEmpty(str);
        rn0 rn0Var = this.T;
        if (isEmpty) {
            rn0Var.e.setVisibility(8);
        } else {
            rn0Var.e.setVisibility(0);
            rn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        xn0 xn0Var = this.V;
        org.telegram.ui.ay ayVar = xn0Var.R;
        long a2 = ayVar != null ? ayVar.a() : 0L;
        long j11 = i10 == 0 ? 0L : a2;
        long j12 = 0;
        long j13 = 0;
        int i11 = 0;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList = this.x0;
            if (i11 >= arrayList.size()) {
                break;
            }
            uf.e0 e0Var = (uf.e0) arrayList.get(i11);
            int i12 = e0Var.d;
            if (i12 == 4) {
                TLObject tLObject = e0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j10 = -((TLRPC.Chat) e0Var.f).id;
                }
                j11 = j10;
            } else if (i12 == 6) {
                uf.c0 c0Var = e0Var.g;
                long j14 = c0Var.b;
                j13 = c0Var.c;
                j12 = j14;
            } else if (i12 == 7) {
                z14 = true;
            }
            i11++;
        }
        vn0 vn0Var = this.s0;
        vn0Var.getClass();
        if (i40.X(str, null) == null) {
            J();
        }
        if (view == this.c0) {
            MessagesController.getInstance(this.E0).getChannelRecommendations(0L);
            zn0 zn0Var = this.g0;
            tl0 tl0Var = zn0Var.d;
            ArrayList arrayList2 = zn0Var.N;
            ArrayList arrayList3 = zn0Var.O;
            ArrayList arrayList4 = zn0Var.P;
            ArrayList arrayList5 = zn0Var.M;
            xp xpVar = zn0Var.Z;
            zn0Var.W();
            if (!TextUtils.equals(str, zn0Var.Y)) {
                zn0Var.Y = str;
                AndroidUtilities.cancelRunOnUIThread(xpVar);
                if (TextUtils.isEmpty(zn0Var.Y)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    zn0Var.N(true);
                    zn0Var.X++;
                    z13 = false;
                    zn0Var.T = false;
                    zn0Var.U = false;
                    zn0Var.V = false;
                    zn0Var.W = 0;
                    if (tl0Var != null) {
                        tl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(xpVar, 1000L);
                    zn0Var.T = true;
                    zn0Var.U = true;
                    zn0Var.N(true);
                    if (tl0Var != null) {
                        z13 = false;
                        tl0Var.u0(0);
                    }
                }
                this.d0.b(this.K0, z13);
                return;
            }
            z13 = false;
            this.d0.b(this.K0, z13);
            return;
        }
        if (view == this.h0) {
            sn0 sn0Var = this.l0;
            tl0 tl0Var2 = sn0Var.d;
            ArrayList arrayList6 = sn0Var.Q;
            ns nsVar = sn0Var.c0;
            if (TextUtils.equals(str, sn0Var.b0)) {
                z12 = false;
            } else {
                sn0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(nsVar);
                if (TextUtils.isEmpty(sn0Var.b0)) {
                    arrayList6.clear();
                    sn0Var.N(true);
                    sn0Var.a0++;
                    z12 = false;
                    sn0Var.W = false;
                    sn0Var.X = false;
                    sn0Var.Y = false;
                    sn0Var.Z = 0;
                    if (tl0Var2 != null) {
                        tl0Var2.u0(0);
                    }
                } else {
                    z12 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(nsVar, 1000L);
                    sn0Var.W = true;
                    sn0Var.X = true;
                    sn0Var.N(true);
                    if (tl0Var2 != null) {
                        tl0Var2.u0(0);
                    }
                }
            }
            this.i0.b(this.K0, z12);
            if (TextUtils.isEmpty(str)) {
                sn0Var.V();
                return;
            }
            return;
        }
        gh0 gh0Var = this.m0;
        if (view == gh0Var) {
            i61 i61Var = gh0Var.c;
            ArrayList arrayList7 = gh0Var.n;
            if (TextUtils.equals(gh0Var.w, str)) {
                return;
            }
            if (gh0Var.H >= 0) {
                ConnectionsManager.getInstance(gh0Var.b).cancelRequest(gh0Var.H, true);
                gh0Var.H = -1;
            }
            gh0Var.v = false;
            gh0Var.E.setLoading(false);
            gh0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                gh0Var.r = 0;
                z11 = true;
                gh0Var.I++;
                gh0Var.s = false;
                arrayList7.clear();
                gh0Var.a(false);
            } else {
                z11 = true;
                gh0Var.b(str);
                gh0Var.r = 0;
                gh0Var.I++;
                gh0Var.s = false;
                arrayList7.clear();
            }
            gh0Var.d();
            i61Var.u0(0);
            i61Var.V2.N(z11);
            return;
        }
        if (view == this.o0) {
            if (i40.X(str, null) == null) {
                return;
            }
            if (z4) {
                this.q0.h1(0, 0);
            }
            vn0Var.Y(str);
            this.p0.b(this.K0, false);
            return;
        }
        if (view != this.R) {
            long j15 = a2;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.t10) {
                org.telegram.ui.t10 t10Var2 = (org.telegram.ui.t10) view;
                t10Var2.setUseFromUserAsAvatar(j15 != 0);
                t10Var2.c.b(this.K0, false);
                t10Var2.h(j11, this.Q0, j16, j17, uf.g0.Z2[((co0) this.Q.a.get(i10)).b], z14, str, z4);
                return;
            }
            if (view instanceof en0) {
                en0 en0Var = (en0) view;
                en0Var.a.b(this.K0, false);
                en0Var.H = str;
                en0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.t10 t10Var3 = this.J0;
        if (!(j11 == 0 && this.Q0 == 0 && j12 == 0 && j13 == 0) && a2 == 0) {
            boolean z15 = true;
            t10Var3.setTag(1);
            t10Var3.i(this.I0, false);
            t10Var3.animate().setListener(null).cancel();
            if (z4) {
                t10Var3.setVisibility(0);
                t10Var3.setAlpha(1.0f);
                z15 = z4;
            } else {
                if (t10Var3.getVisibility() != 0) {
                    t10Var3.setVisibility(0);
                    t10Var3.setAlpha(0.0f);
                } else {
                    z15 = z4;
                }
                t10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            t10Var = t10Var3;
            z10 = false;
            this.J0.h(j11, this.Q0, j12, j13, null, z14, str, z15);
            rn0Var.setVisibility(8);
        } else {
            this.F0 = false;
            xn0Var.U(z14 ? 1 : 0, str);
            xn0Var.x0 = this.I0;
            t10Var3.animate().setListener(null).cancel();
            t10Var3.i(null, false);
            if (z4) {
                rn0Var.e(!(xn0Var.A0 > 0), false);
                rn0Var.e(xn0Var.A0 > 0, false);
            } else if (!xn0Var.N()) {
                rn0Var.e(xn0Var.A0 > 0, true);
            }
            if (z4) {
                t10Var3.setVisibility(8);
            } else if (t10Var3.getVisibility() != 8) {
                t10Var3.animate().alpha(0.0f).setListener(new pd0(this, 9)).setDuration(150L).start();
            }
            t10Var3.setTag(null);
            t10Var = t10Var3;
            z10 = false;
        }
        rn0Var.b(this.K0, z10);
        t10Var.c.b(this.K0, z10);
    }

    public final void Q(boolean z4) {
        sl0 sl0Var;
        sl0 sl0Var2;
        sl0 sl0Var3;
        org.telegram.ui.ay ayVar;
        if (this.v0 == z4) {
            return;
        }
        org.telegram.ui.py pyVar = this.G0;
        if (z4 && pyVar.getActionBar().s()) {
            return;
        }
        if (z4 && !pyVar.getActionBar().a("search_view_pager")) {
            this.C0 = pyVar.getActionBar().j("search_view_pager");
            if (pyVar.T) {
                ImageView imageView = new ImageView(getContext());
                this.t0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.t0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                this.t0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.t0.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z8, false), 1, -1));
                this.t0.setOnClickListener(new b80(this, 14));
                this.C0.addView(this.t0, k7.c6.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.C0.getContext());
            this.u0 = numberTextView;
            numberTextView.setTextSize(18);
            this.u0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.u0;
            int i10 = org.telegram.ui.ActionBar.k6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
            this.C0.addView(this.u0, k7.c6.m(1.0f, 0, -1, pyVar.T ? 18 : 72, 0, 0));
            this.u0.setOnTouchListener(new org.telegram.ui.ActionBar.s2(20));
            org.telegram.ui.ActionBar.w0 h = this.C0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.y0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.z0 = this.C0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.A0 = this.C0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.B0 = this.C0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.u0 != null) {
            xn0 xn0Var = this.V;
            ((ViewGroup.MarginLayoutParams) this.u0.getLayoutParams()).leftMargin = AndroidUtilities.dp((pyVar.T ? 18 : 72) + (xn0Var != null && (ayVar = xn0Var.R) != null && (ayVar.a() > 0L ? 1 : (ayVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.u0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (pyVar.getActionBar().getBackButton() != null && (pyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.g5)) {
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            pyVar.getActionBar().setBackButtonDrawable(i2Var);
            i2Var.setColorFilter(null);
        }
        this.v0 = z4;
        HashMap hashMap = this.w0;
        if (z4) {
            AndroidUtilities.hideKeyboard(pyVar.getParentActivity().getCurrentFocus());
            pyVar.getActionBar().O(null, null);
            this.u0.a(hashMap.size(), false);
            this.y0.setVisibility(N() ? 0 : 8);
            this.z0.setVisibility(0);
            this.A0.setVisibility(0);
            this.B0.setVisibility(0);
            return;
        }
        pyVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.t10) && (sl0Var3 = ((org.telegram.ui.t10) getChildAt(i11)).d) != null) {
                sl0Var3.l();
            }
            if (getChildAt(i11) instanceof en0) {
                ((en0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.t10 t10Var = this.J0;
        if (t10Var != null && (sl0Var2 = t10Var.d) != null) {
            sl0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.t10) && (sl0Var = ((org.telegram.ui.t10) view).d) != null) {
                sl0Var.l();
            }
        }
    }

    public final void R() {
        this.Q.i();
        o(false);
        c81 c81Var = this.J;
        if (c81Var != null) {
            c81Var.x.l();
        }
    }

    @Override // org.telegram.ui.s10
    public final void a() {
        Q(true);
    }

    @Override // org.telegram.ui.s10
    public final boolean b(org.telegram.ui.l10 l10Var) {
        return this.w0.containsKey(l10Var);
    }

    @Override // org.telegram.ui.s10
    public final void c(MessageObject messageObject) {
        this.G0.presentFragment(K(messageObject, this.E0));
        Q(false);
    }

    @Override // org.telegram.ui.s10
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z4;
        org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.w0;
        if (hashMap.containsKey(l10Var)) {
            hashMap.remove(l10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(l10Var, messageObject);
        }
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.u0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.z0;
            if (w0Var != null) {
                w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.y0 != null) {
                boolean N = N();
                int i11 = N ? 0 : 8;
                if (this.y0.getVisibility() != i11) {
                    this.y0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.y0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i12 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.B0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = true;
                        break;
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.l10) it.next())).isDownloadingFile) {
                        z4 = false;
                        break;
                    }
                }
                this.B0.setVisibility(z4 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(l10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).b(i10, hashMap.containsKey(l10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).f(hashMap.containsKey(l10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(l10Var), true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        zn0 zn0Var = this.g0;
        if (i10 == i12) {
            this.d0.e(MessagesController.getInstance(this.E0).getChannelRecommendations(0L) != null, true);
            zn0Var.W();
            zn0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            zn0Var.W();
            zn0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.l0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                vn0 vn0Var = this.s0;
                if (obj == vn0Var.N) {
                    vn0Var.N(true);
                }
            }
        }
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.R;
            tl0 tl0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    tl0Var = this.S;
                } else if (view == this.c0) {
                    tl0Var = this.f0;
                } else if (view == this.h0) {
                    tl0Var = this.k0;
                } else if (view == this.o0) {
                    tl0Var = this.r0;
                } else {
                    en0 en0Var = this.D0;
                    if (view == en0Var) {
                        tl0Var = en0Var.b;
                    } else {
                        gh0 gh0Var = this.m0;
                        if (view == gh0Var) {
                            tl0Var = gh0Var.c;
                        } else if (view instanceof org.telegram.ui.t10) {
                            tl0Var = ((org.telegram.ui.t10) view).b;
                        }
                    }
                }
            }
            if (tl0Var != null) {
                ug.c.b(tl0Var, canvas, rectF, tl0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.t10 t10Var = this.J0;
                if (t10Var.getVisibility() == 0) {
                    mh.d1 d1Var = t10Var.b;
                    ug.c.b(d1Var, canvas, rectF, d1Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.s10
    public final boolean f() {
        return this.v0;
    }

    @Override // pg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.C0;
    }

    public ArrayList<uf.e0> getCurrentSearchFilters() {
        return this.x0;
    }

    public en0 getDownloadsContainer() {
        return this.D0;
    }

    public int getFolderId() {
        return this.O0;
    }

    @Override // org.telegram.ui.Components.m81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.y0;
    }

    public l81 getTabsView() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.E0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        this.b0 = true;
        zn0 zn0Var = this.g0;
        if (zn0Var != null) {
            zn0Var.N(false);
        }
        sn0 sn0Var = this.l0;
        if (sn0Var != null) {
            sn0Var.N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b0 = false;
        int i10 = this.E0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.m81
    public final void s() {
        this.N0.M();
    }

    public void setBlurredBackgroundDrawableFactory(og.a aVar) {
        this.T0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.k10 k10Var) {
        this.I0 = k10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.K0 = i10;
        boolean z4 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                ((org.telegram.ui.t10) getChildAt(i11)).c.b(i10, z4);
            } else if (getChildAt(i11) == this.R) {
                this.T.b(i10, z4);
                this.J0.c.b(i10, z4);
            } else if (getChildAt(i11) instanceof en0) {
                ((en0) getChildAt(i11)).a.b(i10, z4);
            } else if (getChildAt(i11) == this.c0) {
                this.d0.b(i10, z4);
            }
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        c81 c81Var = this.J;
        if (c81Var != null) {
            c81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.m81
    public final void t(View view, View view2, int i10, int i11) {
        xn0 xn0Var = this.V;
        org.telegram.ui.t10 t10Var = this.J0;
        if (i10 == 0) {
            if (t10Var.getVisibility() == 0) {
                t10Var.i(this.I0, false);
                xn0Var.x0 = null;
            } else {
                t10Var.i(null, false);
                org.telegram.ui.k10 k10Var = this.I0;
                xn0Var.x0 = k10Var;
                if (k10Var != null) {
                    ((org.telegram.ui.tv) k10Var).h(false, null, xn0Var.v0, xn0Var.w0);
                }
            }
        } else if (view instanceof org.telegram.ui.t10) {
            ((org.telegram.ui.t10) view).i(this.I0, i11 == 0 && t10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.t10) {
            ((org.telegram.ui.t10) view2).i(null, false);
        } else {
            xn0Var.x0 = null;
            t10Var.i(null, false);
        }
    }
}
