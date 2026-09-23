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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class yn0 extends h81 implements org.telegram.ui.t10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final /* synthetic */ int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public wm0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ry J0;
    public String K0;
    public org.telegram.ui.l10 L0;
    public final org.telegram.ui.u10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.wx P0;
    public final pv0 Q0;
    public final int R0;
    public int S0;
    public final xn0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final ln0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j a0;
    public final rn0 b0;
    public final s4.c0 c0;
    public final rk0 d0;
    public boolean e0;
    public final FrameLayout f0;
    public final ln0 g0;
    public final s4.c0 h0;
    public final ml0 i0;
    public final tn0 j0;
    public final FrameLayout k0;
    public final ln0 l0;
    public final s4.c0 m0;
    public final ml0 n0;
    public final mn0 o0;
    public final zg0 p0;
    public boolean q0;
    public final FrameLayout r0;
    public final ln0 s0;
    public final s4.c0 t0;
    public final ml0 u0;
    public final pn0 v0;
    public ImageView w0;
    public NumberTextView x0;
    public boolean y0;
    public final HashMap z0;

    public yn0(Context context, org.telegram.ui.ry ryVar, int i10, int i11, int i12, long j3, org.telegram.ui.wx wxVar) {
        super(context, null);
        this.q0 = false;
        this.z0 = new HashMap();
        this.A0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.H0 = i13;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = ryVar;
        this.P0 = wxVar;
        s4.j jVar = new s4.j();
        this.a0 = jVar;
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = rr.h;
        org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this;
        this.b0 = new rn0(ayVar, context, ryVar, i10, i11, jVar, ryVar.F, ryVar, context);
        if (i11 == 15) {
            ArrayList R3 = ryVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < R3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i14)).id, arrayList, i14, 1)) {
            }
            this.b0.q0 = arrayList;
        }
        this.Q0 = (pv0) ryVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(ayVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        w0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var = new s4.c0(1, false);
        this.c0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new nn0(ayVar, ryVar, 2));
        w0Var.C0(new ac0(ayVar, 23));
        org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(this.J0);
        this.M0 = u10Var;
        ai.w0 w0Var2 = u10Var.b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new qn0(ayVar, 1));
        w0Var2.C0(new ac0(ayVar, 23));
        u10Var.setUiCallback(this);
        u10Var.setVisibility(8);
        u10Var.setChatPreviewDelegate(wxVar);
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(1);
        ln0 ln0Var = new ln0(ayVar, context, u00Var, 2);
        this.W = ln0Var;
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
        ln0Var.setVisibility(8);
        ln0Var.addView(u00Var, 0);
        ln0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(ln0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(u10Var);
        w0Var.setEmptyView(ln0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        sn0 sn0Var = new sn0(ayVar);
        sn0Var.m = false;
        sn0Var.C = false;
        rr rrVar = rr.h;
        sn0Var.o(rrVar);
        sn0Var.n(350L);
        ml0 ml0Var = new ml0(context, null);
        this.i0 = ml0Var;
        ml0Var.setItemAnimator(sn0Var);
        ml0Var.setPivotY(0.0f);
        ml0Var.setVerticalScrollBarEnabled(true);
        ml0Var.setInstantClick(true);
        ml0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.h0 = c0Var2;
        ml0Var.setLayoutManager(c0Var2);
        ml0Var.Y1 = true;
        ml0Var.Z1 = 0;
        ml0Var.setClipToPadding(false);
        u00 u00Var2 = new u00(context, null);
        u00Var2.setViewType(1);
        ln0 ln0Var2 = new ln0(ayVar, context, u00Var2, 3);
        this.g0 = ln0Var2;
        ln0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var2.e.setVisibility(8);
        ln0Var2.setVisibility(8);
        ln0Var2.addView(u00Var2, 0);
        ln0Var2.e(true, false);
        frameLayout2.addView(ln0Var2);
        frameLayout2.addView(ml0Var);
        ml0Var.setEmptyView(ln0Var2);
        tn0 tn0Var = new tn0(ayVar, ml0Var, context, this.H0, i12, ryVar);
        this.j0 = tn0Var;
        ml0Var.setAdapter(tn0Var);
        ml0Var.setOnScrollListener(new nn0(ayVar, ryVar, 3));
        ml0Var.C0(new ac0(ayVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        kn0 kn0Var = new kn0(ayVar);
        kn0Var.m = false;
        kn0Var.C = false;
        kn0Var.o(rrVar);
        kn0Var.n(350L);
        ml0 ml0Var2 = new ml0(context, null);
        this.n0 = ml0Var2;
        ml0Var2.setItemAnimator(kn0Var);
        ml0Var2.setPivotY(0.0f);
        ml0Var2.setClipToPadding(false);
        ml0Var2.setVerticalScrollBarEnabled(true);
        ml0Var2.setInstantClick(true);
        ml0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        ml0Var2.setLayoutManager(c0Var3);
        ml0Var2.Y1 = true;
        ml0Var2.Z1 = 0;
        u00 u00Var3 = new u00(context, null);
        u00Var3.setViewType(1);
        ln0 ln0Var3 = new ln0(ayVar, context, u00Var3, 0);
        this.l0 = ln0Var3;
        ln0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var3.e.setVisibility(8);
        ln0Var3.setVisibility(8);
        ln0Var3.addView(u00Var3, 0);
        ln0Var3.e(true, false);
        frameLayout3.addView(ln0Var3);
        frameLayout3.addView(ml0Var2);
        ml0Var2.setEmptyView(ln0Var3);
        mn0 mn0Var = new mn0(ayVar, ml0Var2, context, this.H0, i12);
        this.o0 = mn0Var;
        ml0Var2.setAdapter(mn0Var);
        ml0Var2.setOnScrollListener(new nn0(ayVar, ryVar, 0));
        ml0Var2.C0(new ac0(ayVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.r0 = frameLayout4;
        on0 on0Var = new on0(ayVar);
        on0Var.m = false;
        on0Var.C = false;
        on0Var.o(rrVar);
        on0Var.n(350L);
        ml0 ml0Var3 = new ml0(context, null);
        this.u0 = ml0Var3;
        ml0Var3.setItemAnimator(on0Var);
        ml0Var3.setPivotY(0.0f);
        ml0Var3.setVerticalScrollBarEnabled(true);
        ml0Var3.setInstantClick(true);
        ml0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.t0 = c0Var4;
        ml0Var3.setLayoutManager(c0Var4);
        ml0Var3.Y1 = true;
        ml0Var3.Z1 = 0;
        ml0Var3.setClipToPadding(false);
        u00 u00Var4 = new u00(context, null);
        u00Var4.setViewType(1);
        ln0 ln0Var4 = new ln0(ayVar, context, u00Var4, 1);
        this.s0 = ln0Var4;
        ln0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var4.e.setVisibility(8);
        ln0Var4.setVisibility(8);
        ln0Var4.addView(u00Var4, 0);
        ln0Var4.e(true, false);
        frameLayout4.addView(ln0Var4);
        frameLayout4.addView(ml0Var3);
        ml0Var3.setEmptyView(ln0Var4);
        pn0 pn0Var = new pn0(ayVar, ml0Var3, context, this.H0);
        this.v0 = pn0Var;
        ml0Var3.setAdapter(pn0Var);
        ml0Var3.setOnScrollListener(new nn0(ayVar, ryVar, 1));
        ml0Var3.C0(new ac0(ayVar, 23));
        this.d0 = new rk0(w0Var, true);
        zg0 zg0Var = new zg0(context, ryVar);
        this.p0 = zg0Var;
        d61 d61Var = zg0Var.c;
        d61Var.setClipToPadding(false);
        d61Var.j(new qn0(ayVar, 0));
        d61Var.C0(new ac0(ayVar, 23));
        xn0 xn0Var = new xn0(ayVar);
        this.T = xn0Var;
        setAdapter(xn0Var);
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

    public static void P(FrameLayout frameLayout, ml0 ml0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            ml0Var.o1(0, i10, 0, i11);
        } else {
            ml0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ml0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.q0) {
            int i10 = 0;
            this.q0 = false;
            R();
            x71 x71Var = this.M;
            if (x71Var != null && x71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            rn0 rn0Var = this.b0;
            if (rn0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((gg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                rn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            xn0 xn0Var = this.T;
            ArrayList arrayList = xn0Var.a;
            ArrayList arrayList2 = xn0Var.a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((wn0) arrayList2.get(i11)).a == 3 && ((wn0) arrayList2.get(i11)).b == i10) {
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
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.u10) {
                arrayList.addAll(((org.telegram.ui.u10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.u10) {
                arrayList.addAll(((org.telegram.ui.u10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.u10 u10Var = this.M0;
        if (u10Var != null) {
            arrayList.addAll(u10Var.getThemeDescriptions());
        }
        ln0 ln0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ln0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ln0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.y6));
        arrayList.addAll(w7.a6.a(new y6(this, 7), org.telegram.ui.ActionBar.h6.y8));
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
        org.telegram.ui.u10 u10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        ln0 ln0Var = this.W;
        if (isEmpty) {
            ln0Var.e.setVisibility(8);
        } else {
            ln0Var.e.setVisibility(0);
            ln0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        rn0 rn0Var = this.b0;
        org.telegram.ui.dy dyVar = rn0Var.U;
        long a2 = dyVar != null ? dyVar.a() : 0L;
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
        pn0 pn0Var = this.v0;
        pn0Var.getClass();
        if (f40.X(str, null) == null) {
            J();
        }
        if (view == this.f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            tn0 tn0Var = this.j0;
            ml0 ml0Var = tn0Var.d;
            ArrayList arrayList2 = tn0Var.Q;
            ArrayList arrayList3 = tn0Var.R;
            ArrayList arrayList4 = tn0Var.S;
            ArrayList arrayList5 = tn0Var.P;
            yp ypVar = tn0Var.c0;
            tn0Var.W();
            if (!TextUtils.equals(str, tn0Var.b0)) {
                tn0Var.b0 = str;
                AndroidUtilities.cancelRunOnUIThread(ypVar);
                if (TextUtils.isEmpty(tn0Var.b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    tn0Var.N(true);
                    tn0Var.a0++;
                    z14 = false;
                    tn0Var.W = false;
                    tn0Var.X = false;
                    tn0Var.Y = false;
                    tn0Var.Z = 0;
                    if (ml0Var != null) {
                        ml0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(ypVar, 1000L);
                    tn0Var.W = true;
                    tn0Var.X = true;
                    tn0Var.N(true);
                    if (ml0Var != null) {
                        z14 = false;
                        ml0Var.u0(0);
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
            mn0 mn0Var = this.o0;
            ml0 ml0Var2 = mn0Var.d;
            ArrayList arrayList6 = mn0Var.T;
            ns nsVar = mn0Var.f0;
            if (TextUtils.equals(str, mn0Var.e0)) {
                z13 = false;
            } else {
                mn0Var.e0 = str;
                AndroidUtilities.cancelRunOnUIThread(nsVar);
                if (TextUtils.isEmpty(mn0Var.e0)) {
                    arrayList6.clear();
                    mn0Var.N(true);
                    mn0Var.d0++;
                    z13 = false;
                    mn0Var.Z = false;
                    mn0Var.a0 = false;
                    mn0Var.b0 = false;
                    mn0Var.c0 = 0;
                    if (ml0Var2 != null) {
                        ml0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(nsVar, 1000L);
                    mn0Var.Z = true;
                    mn0Var.a0 = true;
                    mn0Var.N(true);
                    if (ml0Var2 != null) {
                        ml0Var2.u0(0);
                    }
                }
            }
            this.l0.b(this.N0, z13);
            if (TextUtils.isEmpty(str)) {
                mn0Var.V();
                return;
            }
            return;
        }
        zg0 zg0Var = this.p0;
        if (view == zg0Var) {
            d61 d61Var = zg0Var.c;
            ArrayList arrayList7 = zg0Var.n;
            if (TextUtils.equals(zg0Var.w, str)) {
                return;
            }
            if (zg0Var.K >= 0) {
                ConnectionsManager.getInstance(zg0Var.b).cancelRequest(zg0Var.K, true);
                zg0Var.K = -1;
            }
            zg0Var.v = false;
            zg0Var.H.setLoading(false);
            zg0Var.w = str;
            if (TextUtils.isEmpty(str)) {
                zg0Var.r = 0;
                z12 = true;
                zg0Var.L++;
                zg0Var.s = false;
                arrayList7.clear();
                zg0Var.a(false);
            } else {
                z12 = true;
                zg0Var.b(str);
                zg0Var.r = 0;
                zg0Var.L++;
                zg0Var.s = false;
                arrayList7.clear();
            }
            zg0Var.d();
            d61Var.u0(0);
            d61Var.Y2.N(z12);
            return;
        }
        if (view == this.r0) {
            if (f40.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.t0.h1(0, 0);
            }
            pn0Var.Y(str);
            this.s0.b(this.N0, false);
            return;
        }
        if (view != this.U) {
            long j14 = a2;
            long j15 = j11;
            long j16 = j12;
            if (view instanceof org.telegram.ui.u10) {
                org.telegram.ui.u10 u10Var2 = (org.telegram.ui.u10) view;
                u10Var2.setUseFromUserAsAvatar(j14 != 0);
                u10Var2.c.b(this.N0, false);
                u10Var2.h(j10, this.T0, j15, j16, gg.s0.c3[((wn0) this.T.a.get(i10)).b], z15, str, z10);
                return;
            }
            if (view instanceof wm0) {
                wm0 wm0Var = (wm0) view;
                wm0Var.a.b(this.N0, false);
                wm0Var.K = str;
                wm0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.u10 u10Var3 = this.M0;
        if (!(j10 == 0 && this.T0 == 0 && j11 == 0 && j12 == 0) && a2 == 0) {
            boolean z16 = true;
            u10Var3.setTag(1);
            u10Var3.i(this.L0, false);
            u10Var3.animate().setListener(null).cancel();
            if (z10) {
                u10Var3.setVisibility(0);
                u10Var3.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (u10Var3.getVisibility() != 0) {
                    u10Var3.setVisibility(0);
                    u10Var3.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                u10Var3.animate().alpha(1.0f).setDuration(150L).start();
            }
            u10Var = u10Var3;
            z11 = false;
            this.M0.h(j10, this.T0, j11, j12, null, z15, str, z16);
            ln0Var.setVisibility(8);
        } else {
            this.I0 = false;
            rn0Var.U(z15 ? 1 : 0, str);
            rn0Var.A0 = this.L0;
            u10Var3.animate().setListener(null).cancel();
            u10Var3.i(null, false);
            if (z10) {
                ln0Var.e(!(rn0Var.D0 > 0), false);
                ln0Var.e(rn0Var.D0 > 0, false);
            } else if (!rn0Var.N()) {
                ln0Var.e(rn0Var.D0 > 0, true);
            }
            if (z10) {
                u10Var3.setVisibility(8);
            } else if (u10Var3.getVisibility() != 8) {
                u10Var3.animate().alpha(0.0f).setListener(new jd0(this, 10)).setDuration(150L).start();
            }
            u10Var3.setTag(null);
            u10Var = u10Var3;
            z11 = false;
        }
        ln0Var.b(this.N0, z11);
        u10Var.c.b(this.N0, z11);
    }

    public final void Q(boolean z10) {
        ll0 ll0Var;
        ll0 ll0Var2;
        ll0 ll0Var3;
        org.telegram.ui.dy dyVar;
        if (this.y0 == z10) {
            return;
        }
        org.telegram.ui.ry ryVar = this.J0;
        if (z10 && ryVar.getActionBar().s()) {
            return;
        }
        if (z10 && !ryVar.getActionBar().a("search_view_pager")) {
            this.F0 = ryVar.getActionBar().j("search_view_pager");
            if (ryVar.W) {
                ImageView imageView = new ImageView(getContext());
                this.w0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                this.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y8, false), PorterDuff.Mode.MULTIPLY));
                this.w0.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.z8, false), 1, -1));
                this.w0.setOnClickListener(new y70(this, 14));
                this.F0.addView(this.w0, w7.x5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
            this.x0 = numberTextView;
            numberTextView.setTextSize(18);
            this.x0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.x0;
            int i10 = org.telegram.ui.ActionBar.h6.y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            this.F0.addView(this.x0, w7.x5.m(1.0f, 0, -1, ryVar.W ? 18 : 72, 0, 0));
            this.x0.setOnTouchListener(new bi.d(21));
            org.telegram.ui.ActionBar.v0 h = this.F0.h(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.B0 = h;
            h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.x0 != null) {
            rn0 rn0Var = this.b0;
            ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).leftMargin = AndroidUtilities.dp((ryVar.W ? 18 : 72) + (rn0Var != null && (dyVar = rn0Var.U) != null && (dyVar.a() > 0L ? 1 : (dyVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.x0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (ryVar.getActionBar().getBackButton() != null && (ryVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.d5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            ryVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.y0 = z10;
        HashMap hashMap = this.z0;
        if (z10) {
            AndroidUtilities.hideKeyboard(ryVar.getParentActivity().getCurrentFocus());
            ryVar.getActionBar().O(null, null);
            this.x0.a(hashMap.size(), false);
            this.B0.setVisibility(N() ? 0 : 8);
            this.C0.setVisibility(0);
            this.D0.setVisibility(0);
            this.E0.setVisibility(0);
            return;
        }
        ryVar.getActionBar().r();
        hashMap.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.u10) && (ll0Var3 = ((org.telegram.ui.u10) getChildAt(i11)).d) != null) {
                ll0Var3.l();
            }
            if (getChildAt(i11) instanceof wm0) {
                ((wm0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.u10 u10Var = this.M0;
        if (u10Var != null && (ll0Var2 = u10Var.d) != null) {
            ll0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.u10) && (ll0Var = ((org.telegram.ui.u10) view).d) != null) {
                ll0Var.l();
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        x71 x71Var = this.M;
        if (x71Var != null) {
            x71Var.x.l();
        }
    }

    @Override // org.telegram.ui.t10
    public final void a() {
        Q(true);
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // org.telegram.ui.t10
    public final boolean c(org.telegram.ui.m10 m10Var) {
        return this.z0.containsKey(m10Var);
    }

    @Override // org.telegram.ui.t10
    public final void d(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        tn0 tn0Var = this.j0;
        if (i10 == i12) {
            this.g0.e(MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null, true);
            tn0Var.W();
            tn0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            tn0Var.W();
            tn0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.o0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                pn0 pn0Var = this.v0;
                if (obj == pn0Var.Q) {
                    pn0Var.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.t10
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.m10 m10Var = new org.telegram.ui.m10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.z0;
        if (hashMap.containsKey(m10Var)) {
            hashMap.remove(m10Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(m10Var, messageObject);
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
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y8, false), PorterDuff.Mode.SRC_IN));
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
                    } else if (!((MessageObject) hashMap.get((org.telegram.ui.m10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.E0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(hashMap.containsKey(m10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(m10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(m10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).e(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(m10Var), true);
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
            ml0 ml0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    ml0Var = this.V;
                } else if (view == this.f0) {
                    ml0Var = this.i0;
                } else if (view == this.k0) {
                    ml0Var = this.n0;
                } else if (view == this.r0) {
                    ml0Var = this.u0;
                } else {
                    wm0 wm0Var = this.G0;
                    if (view == wm0Var) {
                        ml0Var = wm0Var.b;
                    } else {
                        zg0 zg0Var = this.p0;
                        if (view == zg0Var) {
                            ml0Var = zg0Var.c;
                        } else if (view instanceof org.telegram.ui.u10) {
                            ml0Var = ((org.telegram.ui.u10) view).b;
                        }
                    }
                }
            }
            if (ml0Var != null) {
                gh.d.a(ml0Var, canvas, rectF, ml0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.u10 u10Var = this.M0;
                if (u10Var.getVisibility() == 0) {
                    ai.w0 w0Var = u10Var.b;
                    gh.d.a(w0Var, canvas, rectF, w0Var, this);
                }
            }
        }
    }

    @Override // org.telegram.ui.t10
    public final boolean g() {
        return this.y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public wm0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.h81
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.B0;
    }

    public g81 getTabsView() {
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
        tn0 tn0Var = this.j0;
        if (tn0Var != null) {
            tn0Var.N(false);
        }
        mn0 mn0Var = this.o0;
        if (mn0Var != null) {
            mn0Var.N(false);
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

    @Override // org.telegram.ui.Components.h81
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.X0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.l10 l10Var) {
        this.L0 = l10Var;
    }

    public void setKeyboardHeight(int i10) {
        this.N0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.u10) {
                ((org.telegram.ui.u10) getChildAt(i11)).c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.c.b(i10, z10);
            } else if (getChildAt(i11) instanceof wm0) {
                ((wm0) getChildAt(i11)).a.b(i10, z10);
            } else if (getChildAt(i11) == this.f0) {
                this.g0.b(i10, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        x71 x71Var = this.M;
        if (x71Var != null) {
            x71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.h81
    public final void t(View view, View view2, int i10, int i11) {
        rn0 rn0Var = this.b0;
        org.telegram.ui.u10 u10Var = this.M0;
        if (i10 == 0) {
            if (u10Var.getVisibility() == 0) {
                u10Var.i(this.L0, false);
                rn0Var.A0 = null;
            } else {
                u10Var.i(null, false);
                org.telegram.ui.l10 l10Var = this.L0;
                rn0Var.A0 = l10Var;
                if (l10Var != null) {
                    ((org.telegram.ui.tv) l10Var).i(false, null, rn0Var.y0, rn0Var.z0);
                }
            }
        } else if (view instanceof org.telegram.ui.u10) {
            ((org.telegram.ui.u10) view).i(this.L0, i11 == 0 && u10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.u10) {
            ((org.telegram.ui.u10) view2).i(null, false);
        } else {
            rn0Var.A0 = null;
            u10Var.i(null, false);
        }
    }
}
