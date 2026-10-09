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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class dp0 extends o91 implements org.telegram.ui.v10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final /* synthetic */ int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public bo0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ty J0;
    public String K0;
    public org.telegram.ui.n10 L0;
    public final org.telegram.ui.w10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.yx P0;
    public final sw0 Q0;
    public final int R0;
    public int S0;
    public final cp0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final qo0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j a0;
    public final wo0 b0;
    public final s4.d0 c0;
    public final vl0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final qo0 g0;
    public final s4.d0 h0;
    public final qm0 i0;
    public final yo0 j0;
    public final FrameLayout k0;
    public final qo0 l0;
    public final s4.d0 m0;
    public final qm0 n0;
    public final ro0 o0;
    public final di0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final qo0 s0;
    public final s4.d0 t0;
    public final qm0 u0;
    public final uo0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public dp0(Context context, org.telegram.ui.ty tyVar, int i10, int i11, int i12, long j3, org.telegram.ui.yx yxVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = tyVar;
        this.P0 = yxVar;
        s4.j jVar = new s4.j();
        this.a0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = hs.h;
        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this;
        this.b0 = new wo0(dyVar, context, tyVar, i10, i11, jVar, tyVar.F, tyVar, context);
        if (i11 == 15) {
            ArrayList O3 = tyVar.O3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < O3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) O3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (sw0) tyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(dyVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        w0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.d0 d0Var = new s4.d0(1, false);
        this.c0 = d0Var;
        w0Var.setLayoutManager(d0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
        w0Var.setOnScrollListener(new so0(dyVar, tyVar, 2));
        w0Var.C0(new bd0(dyVar, 23));
        org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(this.J0);
        this.M0 = w10Var;
        ai.w0 w0Var2 = w10Var.b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new vo0(dyVar, 1));
        w0Var2.C0(new bd0(dyVar, 23));
        w10Var.setUiCallback(this);
        w10Var.setVisibility(8);
        w10Var.setChatPreviewDelegate(yxVar);
        j10 j10Var = new j10(context, null);
        j10Var.setViewType(1);
        qo0 qo0Var = new qo0(dyVar, context, j10Var, 2);
        this.W = qo0Var;
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
        qo0Var.setVisibility(8);
        qo0Var.addView(j10Var, 0);
        qo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(qo0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(w10Var);
        w0Var.setEmptyView(qo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        xo0 xo0Var = new xo0(dyVar);
        xo0Var.m = false;
        xo0Var.C = false;
        hs hsVar = hs.h;
        xo0Var.o(hsVar);
        xo0Var.n(350L);
        qm0 qm0Var = new qm0(context, null);
        this.i0 = qm0Var;
        qm0Var.setItemAnimator(xo0Var);
        qm0Var.setPivotY(0.0f);
        qm0Var.setVerticalScrollBarEnabled(true);
        qm0Var.setInstantClick(true);
        qm0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.d0 d0Var2 = new s4.d0(1, false);
        this.h0 = d0Var2;
        qm0Var.setLayoutManager(d0Var2);
        qm0Var.W1 = true;
        qm0Var.X1 = 0;
        qm0Var.setClipToPadding(false);
        j10 j10Var2 = new j10(context, null);
        j10Var2.setViewType(1);
        qo0 qo0Var2 = new qo0(dyVar, context, j10Var2, 3);
        this.g0 = qo0Var2;
        qo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var2.e.setVisibility(8);
        qo0Var2.setVisibility(8);
        qo0Var2.addView(j10Var2, 0);
        qo0Var2.e(true, false);
        frameLayout2.addView(qo0Var2);
        frameLayout2.addView(qm0Var);
        qm0Var.setEmptyView(qo0Var2);
        yo0 yo0Var = new yo0(dyVar, qm0Var, context, this.H0, i12, tyVar);
        this.j0 = yo0Var;
        qm0Var.setAdapter(yo0Var);
        qm0Var.setOnScrollListener(new so0(dyVar, tyVar, 3));
        qm0Var.C0(new bd0(dyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        po0 po0Var = new po0(dyVar);
        po0Var.m = false;
        po0Var.C = false;
        po0Var.o(hsVar);
        po0Var.n(350L);
        qm0 qm0Var2 = new qm0(context, null);
        this.n0 = qm0Var2;
        qm0Var2.setItemAnimator(po0Var);
        qm0Var2.setPivotY(0.0f);
        qm0Var2.setClipToPadding(false);
        qm0Var2.setVerticalScrollBarEnabled(true);
        qm0Var2.setInstantClick(true);
        qm0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.d0 d0Var3 = new s4.d0(1, false);
        this.m0 = d0Var3;
        qm0Var2.setLayoutManager(d0Var3);
        qm0Var2.W1 = true;
        qm0Var2.X1 = 0;
        j10 j10Var3 = new j10(context, null);
        j10Var3.setViewType(1);
        qo0 qo0Var3 = new qo0(dyVar, context, j10Var3, 0);
        this.l0 = qo0Var3;
        qo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var3.e.setVisibility(8);
        qo0Var3.setVisibility(8);
        qo0Var3.addView(j10Var3, 0);
        qo0Var3.e(true, false);
        frameLayout3.addView(qo0Var3);
        frameLayout3.addView(qm0Var2);
        qm0Var2.setEmptyView(qo0Var3);
        ro0 ro0Var = new ro0(dyVar, qm0Var2, context, this.H0, i12);
        this.o0 = ro0Var;
        qm0Var2.setAdapter(ro0Var);
        qm0Var2.setOnScrollListener(new so0(dyVar, tyVar, 0));
        qm0Var2.C0(new bd0(dyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        to0 to0Var = new to0(dyVar);
        to0Var.m = false;
        to0Var.C = false;
        to0Var.o(hsVar);
        to0Var.n(350L);
        qm0 qm0Var3 = new qm0(context, null);
        this.u0 = qm0Var3;
        qm0Var3.setItemAnimator(to0Var);
        qm0Var3.setPivotY(0.0f);
        qm0Var3.setVerticalScrollBarEnabled(true);
        qm0Var3.setInstantClick(true);
        qm0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.d0 d0Var4 = new s4.d0(1, false);
        this.t0 = d0Var4;
        qm0Var3.setLayoutManager(d0Var4);
        qm0Var3.W1 = true;
        qm0Var3.X1 = 0;
        qm0Var3.setClipToPadding(false);
        j10 j10Var4 = new j10(context, null);
        j10Var4.setViewType(1);
        qo0 qo0Var4 = new qo0(dyVar, context, j10Var4, 1);
        this.s0 = qo0Var4;
        qo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var4.e.setVisibility(8);
        qo0Var4.setVisibility(8);
        qo0Var4.addView(j10Var4, 0);
        qo0Var4.e(true, false);
        frameLayout4.addView(qo0Var4);
        frameLayout4.addView(qm0Var3);
        qm0Var3.setEmptyView(qo0Var4);
        uo0 uo0Var = new uo0(dyVar, qm0Var3, context, this.H0);
        this.v0 = uo0Var;
        qm0Var3.setAdapter(uo0Var);
        qm0Var3.setOnScrollListener(new so0(dyVar, tyVar, 1));
        qm0Var3.C0(new bd0(dyVar, 23));
        this.d0 = new vl0(w0Var, true);
        di0 di0Var = new di0(context, tyVar);
        this.p0 = di0Var;
        k71 k71Var = di0Var.c;
        k71Var.setClipToPadding(false);
        k71Var.j(new vo0(dyVar, 0));
        k71Var.C0(new bd0(dyVar, 23));
        cp0 cp0Var = new cp0(dyVar);
        this.T = cp0Var;
        setAdapter(cp0Var);
    }

    public static org.telegram.ui.zn K(MessageObject messageObject, int i10) {
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

    public static void P(FrameLayout frameLayout, qm0 qm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            qm0Var.o1(0, i10, 0, i11);
        } else {
            qm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.q0) {
            int i10 = 0;
            this.q0 = false;
            R();
            d91 d91Var = this.M;
            if (d91Var != null && d91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            wo0 wo0Var = this.b0;
            if (wo0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((gg.p0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                wo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            cp0 cp0Var = this.T;
            ArrayList arrayList = cp0Var.a;
            ArrayList arrayList2 = cp0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((bp0) arrayList2.get(i11)).a == 3 && ((bp0) arrayList2.get(i11)).b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.V;
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
            if (getChildAt(i11) instanceof org.telegram.ui.w10) {
                arrayList.addAll(((org.telegram.ui.w10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.w10) {
                arrayList.addAll(((org.telegram.ui.w10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.w10 w10Var = this.M0;
        if (w10Var != null) {
            arrayList.addAll(w10Var.getThemeDescriptions());
        }
        qo0 qo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(qo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(qo0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.y6));
        arrayList.addAll(w7.a6.a(new a7(this, 7), org.telegram.ui.ActionBar.i6.y8));
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
        org.telegram.ui.w10 w10Var;
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        qo0 qo0Var = this.W;
        if (isEmpty) {
            qo0Var.e.setVisibility(8);
        } else {
            qo0Var.e.setVisibility(0);
            qo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        wo0 wo0Var = this.b0;
        org.telegram.ui.fy fyVar = wo0Var.U;
        long a2 = fyVar != null ? fyVar.a() : 0L;
        long j10 = i10 == 0 ? 0L : a2;
        int i11 = 0;
        boolean z16 = false;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.p0 p0Var = (gg.p0) arrayList.get(i11);
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j3 = -((TLRPC.Chat) p0Var.f).id;
                }
                j10 = j3;
            } else if (i12 == 6) {
                gg.n0 n0Var = p0Var.g;
                long j13 = n0Var.b;
                j12 = n0Var.c;
                j11 = j13;
            } else if (i12 == 7) {
                z16 = true;
            }
            i11++;
        }
        uo0 uo0Var = this.v0;
        uo0Var.getClass();
        if (v40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            yo0 yo0Var = this.j0;
            qm0 qm0Var = yo0Var.d;
            ArrayList arrayList2 = yo0Var.Q;
            ArrayList arrayList3 = yo0Var.R;
            ArrayList arrayList4 = yo0Var.S;
            ArrayList arrayList5 = yo0Var.P;
            nq nqVar = yo0Var.c0;
            yo0Var.W();
            if (!TextUtils.equals(str, yo0Var.b0)) {
                yo0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(nqVar);
                if (TextUtils.isEmpty(yo0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    yo0Var.N(true);
                    yo0Var.a0++;
                    z15 = false;
                    yo0Var.W = false;
                    yo0Var.X = false;
                    yo0Var.Y = false;
                    yo0Var.Z = 0;
                    if (qm0Var != null) {
                        qm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(nqVar, 1000L);
                    yo0Var.W = true;
                    yo0Var.X = true;
                    yo0Var.N(true);
                    if (qm0Var != null) {
                        z15 = false;
                        qm0Var.u0(0);
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
            ro0 ro0Var = this.o0;
            qm0 qm0Var2 = ro0Var.d;
            ArrayList arrayList6 = ro0Var.T;
            ct ctVar = ro0Var.f0;
            if (TextUtils.equals(str, ro0Var.e0)) {
                z14 = false;
            } else {
                ro0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(ctVar);
                if (TextUtils.isEmpty(ro0Var.e0)) {
                    arrayList6.clear();
                    ro0Var.N(true);
                    ro0Var.d0++;
                    z14 = false;
                    ro0Var.Z = false;
                    ro0Var.a0 = false;
                    ro0Var.b0 = false;
                    ro0Var.c0 = 0;
                    if (qm0Var2 != null) {
                        qm0Var2.u0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ctVar, 1000L);
                    ro0Var.Z = true;
                    ro0Var.a0 = true;
                    ro0Var.N(true);
                    if (qm0Var2 != null) {
                        qm0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z14);
            if (TextUtils.isEmpty(str)) {
                ro0Var.V();
                return;
            }
            return;
        }
        di0 di0Var = this.p0;
        if (view == di0Var) {
            k71 k71Var = di0Var.c;
            ArrayList arrayList7 = di0Var.n;
            if (TextUtils.equals(di0Var.w, str)) {
                return;
            }
            if (di0Var.K >= 0) {
                ConnectionsManager.getInstance(di0Var.b).cancelRequest(di0Var.K, true);
                di0Var.K = -1;
            }
            di0Var.v = false;
            di0Var.H.setLoading(false);
            di0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                di0Var.r = 0;
                z13 = true;
                di0Var.L++;
                di0Var.s = false;
                arrayList7.clear();
                di0Var.a(false);
            } else {
                z13 = true;
                di0Var.b(str);
                di0Var.r = 0;
                di0Var.L++;
                di0Var.s = false;
                arrayList7.clear();
            }
            di0Var.d();
            k71Var.u0(0);
            k71Var.W2.N(z13);
            return;
        }
        if (view == this.r0) {
            if (v40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            uo0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j14 = a2;
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.w10) {
                org.telegram.ui.w10 w10Var2 = (org.telegram.ui.w10) view;
                w10Var2.setUseFromUserAsAvatar(j14 != 0);
                w10Var2.c.b(this.N0, false);
                w10Var2.h(j10, this.T0, j15, j16, gg.r0.a3[((bp0) this.T.a.get(i10)).b], z16, str, z10);
                return;
            }
            if (view instanceof bo0) {
                bo0 bo0Var = (bo0) view;
                bo0Var.a.b(this.N0, false);
                bo0Var.K = str;
                bo0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.w10 w10Var3 = this.M0;
        if (!(j10 == 0 && this.T0 == 0 && j11 == 0 && j12 == 0) && a2 == 0) {
            boolean z17 = true;
            w10Var3.setTag(1);
            w10Var3.i(this.L0, false);
            w10Var3.animate().setListener(null).cancel();
            if (z10) {
                w10Var3.setVisibility(0);
                w10Var3.setAlpha(1.0f);
                z11 = z10;
            } else {
                if (w10Var3.getVisibility() != 0) {
                    w10Var3.setVisibility(0);
                    w10Var3.setAlpha(0.0f);
                } else {
                    z17 = z10;
                }
                w10Var3.animate().alpha(1.0f).setDuration(150L).start();
                z11 = z17;
            }
            z12 = false;
            long j17 = j10;
            w10Var = w10Var3;
            this.M0.h(j17, this.T0, j11, j12, null, z16, str, z11);
            qo0Var.setVisibility(8);
        } else {
            this.I0 = false;
            wo0Var.U(z16 ? 1 : 0, str);
            wo0Var.A0 = this.L0;
            w10Var3.animate().setListener(null).cancel();
            w10Var3.i(null, false);
            if (z10) {
                qo0Var.e(!(wo0Var.D0 > 0), false);
                qo0Var.e(wo0Var.D0 > 0, false);
            } else if (!wo0Var.N()) {
                qo0Var.e(wo0Var.D0 > 0, true);
            }
            if (z10) {
                w10Var3.setVisibility(8);
            } else if (w10Var3.getVisibility() != 8) {
                w10Var3.animate().alpha(0.0f).setListener(new vd0(this, 11)).setDuration(150L).start();
            }
            w10Var3.setTag(null);
            w10Var = w10Var3;
            z12 = false;
        }
        qo0Var.b(this.N0, z12);
        w10Var.c.b(this.N0, z12);
    }

    public final void Q(boolean z10) {
        pm0 pm0Var;
        pm0 pm0Var2;
        pm0 pm0Var3;
        org.telegram.ui.fy fyVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.ty tyVar = this.J0;
        if (z10 && tyVar.getActionBar().t()) {
            return;
        }
        if (z10 && !tyVar.getActionBar().a("search_view_pager")) {
            this.F0 = tyVar.getActionBar().j("search_view_pager");
            if (tyVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z8, false), 1, -1));
                this.w0.setOnClickListener(new b90(this, 13));
                this.F0.addView(this.w0, w7.x5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.i6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            this.F0.addView(this.x0, w7.x5.m(1.0f, 0, -1, tyVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new bi.d(21));
            org.telegram.ui.ActionBar.v0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            wo0 wo0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((tyVar.W ? 18 : 72) + (wo0Var != null && (fyVar = wo0Var.U) != null && (fyVar.a() > 0L ? 1 : (fyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (tyVar.getActionBar().getBackButton() != null && (tyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            tyVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
            tyVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        tyVar.getActionBar().s();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.w10) && (pm0Var3 = ((org.telegram.ui.w10) getChildAt(i11)).d) != null) {
                pm0Var3.l();
            }
            if (getChildAt(i11) instanceof bo0) {
                ((bo0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.w10 w10Var = this.M0;
        if (w10Var != null && (pm0Var2 = w10Var.d) != null) {
            pm0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.w10) && (pm0Var = ((org.telegram.ui.w10) view).d) != null) {
                pm0Var.l();
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        d91 d91Var = this.M;
        if (d91Var != null) {
            d91Var.x.l();
        }
    }

    @Override // org.telegram.ui.v10
    public final void a() {
        Q(true);
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // org.telegram.ui.v10
    public final boolean c(org.telegram.ui.o10 o10Var) {
        return this.z0.containsKey(o10Var);
    }

    @Override // org.telegram.ui.v10
    public final void d(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        yo0 yo0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            yo0Var.W();
            yo0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            yo0Var.W();
            yo0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                uo0 uo0Var = this.v0;
                if (obj == uo0Var.Q) {
                    uo0Var.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.v10
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.o10 o10Var = new org.telegram.ui.o10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(o10Var)) {
            hashMap.remove(o10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(o10Var, messageObject);
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
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.y8, false), PorterDuff.Mode.SRC_IN));
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
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.o10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(o10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(o10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(o10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(o10Var), true);
        }
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.U;
            qm0 qm0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    qm0Var = this.V;
                } else if (view == this.f0) {
                    qm0Var = this.i0;
                } else if (view == this.k0) {
                    qm0Var = this.n0;
                } else if (view == this.r0) {
                    qm0Var = this.u0;
                } else {
                    bo0 bo0Var = this.G0;
                    if (view == bo0Var) {
                        qm0Var = bo0Var.b;
                    } else {
                        di0 di0Var = this.p0;
                        if (view == di0Var) {
                            qm0Var = di0Var.c;
                        } else if (view instanceof org.telegram.ui.w10) {
                            qm0Var = ((org.telegram.ui.w10) view).b;
                        }
                    }
                }
            }
            if (qm0Var != null) {
                gh.d.a(qm0Var, canvas, rectF, qm0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.w10 w10Var = this.M0;
                if (w10Var.getVisibility() == 0) {
                    ai.w0 w0Var = w10Var.b;
                    gh.d.a(w0Var, canvas, rectF, w0Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.v10
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public bo0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.o91
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.B0;
    }

    public n91 getTabsView() {
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
        yo0 yo0Var = this.j0;
        if (yo0Var != null) {
            yo0Var.N(false);
        }
        ro0 ro0Var = this.o0;
        if (ro0Var != null) {
            ro0Var.N(false);
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

    @Override // org.telegram.ui.Components.o91
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.X0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.n10 n10Var) {
        this.L0 = n10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.w10) {
                ((org.telegram.ui.w10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof bo0) {
                ((bo0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        d91 d91Var = this.M;
        if (d91Var != null) {
            d91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.o91
    public final void t(View view, View view2, int i10, int i11) {
        wo0 wo0Var = this.b0;
        org.telegram.ui.w10 w10Var = this.M0;
        if (i10 == 0) {
            if (w10Var.getVisibility() == 0) {
                w10Var.i(this.L0, false);
                wo0Var.A0 = null;
            } else {
                w10Var.i(null, false);
                org.telegram.ui.n10 n10Var = this.L0;
                wo0Var.A0 = n10Var;
                if (n10Var != null) {
                    ((org.telegram.ui.vv) n10Var).i(false, null, wo0Var.y0, wo0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.w10) {
            ((org.telegram.ui.w10) view).i(this.L0, i11 == 0 && w10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.w10) {
            ((org.telegram.ui.w10) view2).i(null, false);
        } else {
            wo0Var.A0 = null;
            w10Var.i(null, false);
        }
    }
}
