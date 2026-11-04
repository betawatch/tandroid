package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class m91 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.ig, de0 {
    public static final HashSet r1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public ei.f5 E0;
    public boolean F;
    public c91 F0;
    public q81 G;
    public FrameLayout G0;
    public boolean H;
    public w8 H0;
    public boolean I;
    public org.telegram.messenger.r3 I0;
    public boolean J;
    public b91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.wi0 L0;
    public org.telegram.ui.Components.n41 M;
    public uw M0;
    public int N;
    public uw N0;
    public z81 O;
    public boolean O0;
    public s81 P;
    public final g2.g P0;
    public l91 Q;
    public org.telegram.ui.Components.voip.r0 Q0;
    public org.telegram.ui.ActionBar.y0 R;
    public long R0;
    public org.telegram.ui.ActionBar.y0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.y0 T;
    public float T0;
    public org.telegram.ui.ActionBar.y0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.y0 V;
    public org.telegram.ui.Components.pr V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long a;
    public boolean a0;
    public boolean a1;
    public final ArrayList b;
    public final HashSet b0;
    public org.telegram.ui.Components.m61 b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public v81 d;
    public NumberTextView d0;
    public View d1;
    public l0 e;
    public org.telegram.ui.ActionBar.q0 e0;
    public int e1;
    public org.telegram.ui.Components.jn f;
    public org.telegram.ui.ActionBar.q0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.q0 g0;
    public int g1;
    public org.telegram.ui.Components.l00 h;
    public org.telegram.ui.ActionBar.q0 h0;
    public final eh.g h1;
    public org.telegram.ui.ActionBar.q0 i0;
    public final si.f i1;
    public org.telegram.ui.ActionBar.q0 j0;
    public final si.f j1;
    public org.telegram.ui.ActionBar.y0 k0;
    public final si.c k1;
    public org.telegram.ui.ActionBar.y0 l0;
    public final eh.c l1;
    public org.telegram.ui.ActionBar.y0 m0;
    public eh.k m1;
    public j81 n;
    public org.telegram.ui.ActionBar.q0 n0;
    public final ArrayList n1;
    public RadialProgressView o0;
    public final RectF o1;
    public yg0 p0;
    public final RectF p1;
    public org.telegram.ui.ActionBar.q0 q0;
    public int q1;
    public final d91 r;
    public org.telegram.ui.ActionBar.q0 r0;
    public final org.telegram.messenger.c00 s;
    public i91 s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public n91 w;
    public final boolean w0;
    public cv x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public m91(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new d91(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new g2.g(new int[]{org.telegram.messenger.hs.q5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        RectF rectF = new RectF();
        this.o1 = rectF;
        RectF rectF2 = new RectF();
        this.p1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.a = this.arguments.getLong("chat_id", 0L);
        this.u0 = this.arguments.getBoolean("for_select", false);
        this.v0 = this.arguments.getBoolean("forward_to", false);
        this.y0 = this.arguments.getBoolean("bot_share_to", false);
        this.w0 = this.arguments.getBoolean("quote", false);
        this.x0 = this.arguments.getBoolean("reply_to", false);
        this.z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().q7;
        this.W0 = !org.telegram.messenger.k5.w("topics_end_reached_", r1, getUserConfig().k(), false);
        si.c cVar = new si.c();
        this.k1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.h1 = null;
            this.i1 = null;
            this.j1 = null;
            this.l1 = new eh.c(cVar, cVar, cVar);
            return;
        }
        this.h1 = new eh.g(false);
        this.i1 = new si.f(null);
        si.f fVar = new si.f(null);
        this.j1 = fVar;
        eh.c cVar2 = new eh.c(fVar, fVar, fVar);
        this.l1 = cVar2;
        cVar2.k = true;
    }

    public static org.telegram.ui.ActionBar.d2 I0(org.telegram.messenger.hp hpVar, org.telegram.messenger.qr qrVar, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog S0 = hpVar.S0(-j10);
            if (S0 != null && S0.view_forum_as_messages) {
                return new wm(bundle);
            }
            TLRPC.ChatFull N0 = hpVar.N0(j10);
            if (N0 == null) {
                N0 = qrVar.F0(j10, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new wm(bundle);
            }
        }
        return new m91(bundle);
    }

    public static org.telegram.ui.ActionBar.d2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.hp.s1(launchActivity.P), org.telegram.messenger.qr.a0(launchActivity.P), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.m91) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M0(wm wmVar) {
        if (wmVar.getParentLayout() == null) {
            return;
        }
        if (wmVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) wmVar.getParentLayout().getFragmentStack().get(wmVar.getParentLayout().getFragmentStack().size() - 2);
            if (d2Var instanceof m91) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -wmVar.a());
        ((ActionBarLayout) wmVar.getParentLayout()).c(wmVar.getParentLayout().getFragmentStack().size() - 1, new m91(bundle));
        wmVar.Da = true;
        wmVar.finishFragment();
    }

    public static boolean Z(m91 m91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.hp.s1(m91Var.currentAccount).d7.edit().putLong("dialog_join_requested_time_" + (-m91Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = m91Var.getParentActivity();
        boolean V = org.telegram.messenger.t3.V(m91Var.g());
        int i3 = org.telegram.ui.Components.x60.r1;
        org.telegram.ui.Components.x60.J0(parentActivity, m91Var, org.telegram.ui.Components.fc.a0(m91Var), V);
        m91Var.S0(true);
        return false;
    }

    public static void a0(m91 m91Var, View view) {
        long j10 = m91Var.a;
        if (m91Var.getParentLayout() == null || ((ActionBarLayout) m91Var.getParentLayout()).y() || !(view instanceof j91)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((j91) view).O;
        long j11 = -j10;
        long o10 = tL_forumTopic == null ? 0L : m91Var.getMessagesController().y2(j11) ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (m91Var.u0) {
            n91 n91Var = m91Var.w;
            if (n91Var != null) {
                p91 p91Var = n91Var.a;
                Bundle bundle = new Bundle();
                s91 s91Var = p91Var.a;
                bundle.putLong("dialog_id", s91Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                yw0 yw0Var = new yw0(bundle, null);
                yw0Var.s = new rb0(29, p91Var, tL_forumTopic);
                s91Var.presentFragment(yw0Var);
            }
            uw uwVar = m91Var.M0;
            if (uwVar != null) {
                uwVar.a4(j11, o10, true, m91Var);
                return;
            }
            return;
        }
        if (m91Var.b0.size() > 0) {
            m91Var.R0(view);
            return;
        }
        if (m91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            for (org.telegram.ui.ActionBar.d2 d2Var : m91Var.getParentLayout().getFragmentStack()) {
                if (d2Var instanceof uw) {
                    uw uwVar2 = (uw) d2Var;
                    if (uwVar2.t4()) {
                        org.telegram.messenger.pr prVar = uwVar2.q2;
                        if (prVar.a == j11 && prVar.b == o10) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            m91Var.R0 = o10;
            m91Var.Z0(false, false);
        }
        rg.c.m(m91Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean b0(m91 m91Var, View view, float f10) {
        if (m91Var.u0 || m91Var.getParentLayout() == null || ((ActionBarLayout) m91Var.getParentLayout()).y()) {
            return false;
        }
        if (!m91Var.actionBar.v() && !org.telegram.messenger.g0.Q1() && (view instanceof j91)) {
            j91 j91Var = (j91) view;
            if (j91Var.Z(f10)) {
                m91Var.Q0(j91Var);
                m91Var.O.I0(true);
                m91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        m91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(m91 m91Var, boolean z10) {
        pv pvVar;
        m91Var.t0 = z10;
        ValueAnimator valueAnimator = m91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            m91Var.Z0.cancel();
        }
        int i3 = 0;
        if (m91Var.b1 == null) {
            org.telegram.ui.Components.m61 j10 = m91Var.s0.j(8, false);
            m91Var.b1 = j10;
            if (m91Var.N0 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, j10, m91Var.getResourceProvider());
            }
            m91Var.e.addView(m91Var.b1, b8.mf.c(44.0f, -1));
        }
        m91Var.Z0 = ValueAnimator.ofFloat(m91Var.X, z10 ? 1.0f : 0.0f);
        org.telegram.messenger.g0.Z3(m91Var.s0, false, 1.0f, true, true);
        uw uwVar = m91Var.N0;
        if (uwVar != null && (pvVar = uwVar.G3) != null) {
            pvVar.N = !z10;
        }
        m91Var.a1 = !z10 && m91Var.s0.getVisibility() == 0 && m91Var.s0.getAlpha() == 1.0f;
        m91Var.Z0.addUpdateListener(new xy0(m91Var, 13));
        m91Var.s0.setVisibility(0);
        if (z10) {
            org.telegram.messenger.g0.a3(m91Var.getParentActivity(), m91Var.classGuid);
            m91Var.U0(false);
        } else {
            m91Var.r0.setVisibility(0);
        }
        m91Var.Z0.addListener(new x81(m91Var, z10, i3));
        m91Var.Z0.setDuration(200L);
        m91Var.Z0.setInterpolator(org.telegram.ui.Components.xq.f);
        m91Var.Z0.start();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, Boolean.TRUE);
    }

    @Override // org.telegram.ui.de0
    public final si.f B() {
        return this.j1;
    }

    public final void B0() {
        eh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.h1) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.c(org.telegram.messenger.g0.L(14.0f)));
        uw uwVar = this.N0;
        View view = uwVar != null ? uwVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = uwVar != null ? uwVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.g1) - org.telegram.messenger.g0.L(8.0f);
        int L3 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
        this.o1.set(0.0f, -L, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + L + L2);
        RectF rectF = this.p1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, org.telegram.messenger.lc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
        gVar.g(this.N0 != null ? 2 : 1, this.n1);
        gVar.e(this.m1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void C0() {
        q81 q81Var;
        org.telegram.messenger.c00 c00Var = this.s;
        long j10 = this.a;
        if (c00Var.e(j10) || (q81Var = this.G) == null) {
            return;
        }
        int N0 = q81Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.b() - 5) {
            c00Var.o(j10);
        }
        E0();
    }

    @Override // org.telegram.ui.Components.ig
    public final org.telegram.ui.Components.qt0 D() {
        return this.d;
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        TLRPC.ChatFull N0 = getMessagesController().N0(j10);
        if (this.I0 != null && ((str = this.z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.n1.l(M0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else {
            if (this.z0 == null || !z10 || N0 == null || N0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.k5.o(null, 2131748921, org.telegram.ui.Components.fc.a0(this), R.raw.linkbroken, 36);
            this.z0 = null;
        }
    }

    public final void E0() {
        org.telegram.messenger.c00 c00Var = this.s;
        a0.h hVar = c00Var.a;
        LongSparseIntArray longSparseIntArray = c00Var.c;
        long j10 = this.a;
        this.K0 = longSparseIntArray.get(j10, 0) == 1 && (hVar.f(j10) == null || ((ArrayList) hVar.f(j10)).isEmpty());
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((e91) arrayList.get(0)).c != null && ((e91) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        z81 z81Var = this.O;
        if (z81Var != null) {
            z81Var.K0(z81Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        uw uwVar = this.N0;
        if (uwVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.pr prVar = uwVar.K1;
            float c2 = (prVar != null ? prVar.c(L) : 0.0f) + 0.0f;
            org.telegram.ui.Components.pr prVar2 = this.V0;
            if (prVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.pr prVar3 = this.N0.K1;
                prVar2.setTranslationY(c2 - ((prVar3 != null ? prVar3.getMetadata().c.a : 0.0f) * L2));
                org.telegram.ui.Components.pr prVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                r2 = prVar4.c(org.telegram.messenger.g0.W1(this.N0.K1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + c2;
            } else {
                r2 = c2;
            }
        } else {
            org.telegram.ui.Components.pr prVar5 = this.V0;
            if (prVar5 != null) {
                r2 = 0.0f + prVar5.c(org.telegram.messenger.g0.L(14.0f));
            }
        }
        this.O.setPadding(0, (int) r2, 0, this.g1 + this.e1 + (this.W ? org.telegram.messenger.g0.L(51.0f) : 0));
    }

    public final void G0() {
        this.b0.clear();
        this.actionBar.u();
        org.telegram.messenger.g0.b4(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(15));
        s1Var.show();
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ boolean J() {
        return false;
    }

    public final void K0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ long L() {
        return 0L;
    }

    public final void L0(boolean z10) {
        TLRPC.Chat g7;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g7 = g()) != null && ((chatPhoto = g7.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.a5(this.K);
        profileActivity.g5((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().J() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    public final void N0(int i3) {
        if (this.N != i3) {
            this.N = i3;
            this.M.setTextColorKey(i3 == 0 ? org.telegram.ui.ActionBar.k6.pf : org.telegram.ui.ActionBar.k6.q7);
            this.X0.setVisibility(i3 == 1 ? 0 : 8);
            S0(false);
        }
    }

    public final void O0(boolean z10) {
        if (org.telegram.messenger.az.o() == 0) {
            return;
        }
        v81 v81Var = this.d;
        if (v81Var != null) {
            if (z10) {
                v81Var.setLayerType(2, null);
                v81Var.setClipChildren(false);
                v81Var.setClipToPadding(false);
            } else {
                v81Var.setLayerType(0, null);
                v81Var.setClipChildren(true);
                v81Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.az.o() == 0) {
            return;
        }
        this.T0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        z81 z81Var = this.O;
        if (z81Var != null) {
            float D = a1.g.D(1.0f, this.T0, 0.05f, 1.0f);
            z81Var.setPivotX(0.0f);
            z81Var.setPivotY(0.0f);
            z81Var.setScaleX(D);
            z81Var.setScaleY(D);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(D);
            this.actionBar.setScaleY(D);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void Q0(org.telegram.ui.Cells.t2 t2Var) {
        boolean z10;
        try {
            t2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.O;
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new u81(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(xnVar.f);
        xnVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        xnVar.e(j11, tL_forumTopic.id, null);
        if (org.telegram.messenger.t3.y(15, g())) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                y0Var.j(org.telegram.messenger.bd.M0(2131751453, null), R.drawable.msg_unpin, null);
            } else {
                y0Var.j(org.telegram.messenger.bd.M0(2131751454, null), R.drawable.msg_pin, null);
            }
            y0Var.setMinimumWidth(org.telegram.messenger.hs.q2);
            z10 = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p81
                public final /* synthetic */ m91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr) {
                        case 0:
                            m91 m91Var = this.b;
                            m91Var.D0 = true;
                            m91Var.O0 = true;
                            m91Var.s.t(m91Var.a, tL_forumTopic.id, !r0.pinned, m91Var);
                            m91Var.finishPreviewFragment();
                            break;
                        case 1:
                            m91 m91Var2 = this.b;
                            m91Var2.O0 = true;
                            org.telegram.messenger.c00 c00Var = m91Var2.s;
                            long j12 = m91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            c00Var.z(tL_forumTopic2.id, j12, true ^ tL_forumTopic2.closed);
                            m91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            m91 m91Var3 = this.b;
                            m91Var3.H0(hashSet, new n81(m91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(y0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z10, z10);
        if (getMessagesController().r2(j11, tL_forumTopic.id, null)) {
            y0Var2.j(org.telegram.messenger.bd.M0(2131743859, null), R.drawable.msg_mute, null);
        } else {
            y0Var2.j(org.telegram.messenger.bd.M0(2131748322, null), R.drawable.msg_unmute, null);
        }
        y0Var2.setMinimumWidth(org.telegram.messenger.hs.q2);
        y0Var2.setOnClickListener(new ei.t5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z11 = false;
        r32[0].addView(y0Var2);
        if (org.telegram.messenger.t3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                y0Var3.j(org.telegram.messenger.bd.M0(2131746094, null), R.drawable.msg_topic_restart, null);
            } else {
                y0Var3.j(org.telegram.messenger.bd.M0(2131752039, null), R.drawable.msg_topic_close, null);
            }
            y0Var3.setMinimumWidth(org.telegram.messenger.hs.q2);
            final int i3 = 1;
            y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p81
                public final /* synthetic */ m91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            m91 m91Var = this.b;
                            m91Var.D0 = true;
                            m91Var.O0 = true;
                            m91Var.s.t(m91Var.a, tL_forumTopic.id, !r0.pinned, m91Var);
                            m91Var.finishPreviewFragment();
                            break;
                        case 1:
                            m91 m91Var2 = this.b;
                            m91Var2.O0 = true;
                            org.telegram.messenger.c00 c00Var = m91Var2.s;
                            long j12 = m91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            c00Var.z(tL_forumTopic2.id, j12, true ^ tL_forumTopic2.closed);
                            m91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            m91 m91Var3 = this.b;
                            m91Var3.H0(hashSet, new n81(m91Var3, 3));
                            break;
                    }
                }
            });
            z11 = false;
            r32[0].addView(y0Var3);
        }
        if (org.telegram.messenger.t3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z11, true);
            y0Var4.j(org.telegram.messenger.bd.K0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            y0Var4.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
            y0Var4.setMinimumWidth(org.telegram.messenger.hs.q2);
            final int i10 = 2;
            y0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p81
                public final /* synthetic */ m91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            m91 m91Var = this.b;
                            m91Var.D0 = true;
                            m91Var.O0 = true;
                            m91Var.s.t(m91Var.a, tL_forumTopic.id, !r0.pinned, m91Var);
                            m91Var.finishPreviewFragment();
                            break;
                        case 1:
                            m91 m91Var2 = this.b;
                            m91Var2.O0 = true;
                            org.telegram.messenger.c00 c00Var = m91Var2.s;
                            long j12 = m91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            c00Var.z(tL_forumTopic2.id, j12, true ^ tL_forumTopic2.closed);
                            m91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            m91 m91Var3 = this.b;
                            m91Var3.H0(hashSet, new n81(m91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(y0Var4);
        }
        boolean y22 = getMessagesController().y2(j11);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.hs.K2));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, b8.mf.c(-1.0f, -1));
        }
        wm wmVar = new wm(a1.g.j(j10, "chat_id"));
        rg.c.a(wmVar, org.telegram.messenger.pr.a(j11, y22 ? org.telegram.messenger.m5.o(t2Var.O.from_id) : t2Var.O.id));
        presentFragmentAsPreviewWithMenu(wmVar, r32[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(View view) {
        j91 j91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.messenger.c00 c00Var;
        int i3;
        boolean z10;
        boolean z11;
        if (!(view instanceof j91) || (tL_forumTopic = (j91Var = (j91) view).O) == null) {
            return;
        }
        int i10 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.b0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        j91Var.c0(hashSet.contains(Integer.valueOf(i10)), true);
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.u();
            return;
        }
        if (!this.actionBar.e(null)) {
            org.telegram.ui.ActionBar.x n4 = this.actionBar.n(null);
            if (this.inPreviewMode) {
                n4.setBackgroundColor(0);
                n4.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(n4.getContext());
            this.d0 = numberTextView;
            numberTextView.setTextSize(18);
            this.d0.setTypeface(org.telegram.messenger.g0.o());
            this.d0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            n4.addView(this.d0, b8.mf.m(1.0f, 0, -1, 72, 0, 0));
            this.d0.setOnTouchListener(new rr0(1));
            this.e0 = n4.g(4, R.drawable.msg_pin, org.telegram.messenger.g0.L(54.0f));
            this.f0 = n4.g(5, R.drawable.msg_unpin, org.telegram.messenger.g0.L(54.0f));
            this.g0 = n4.g(6, R.drawable.msg_mute, org.telegram.messenger.g0.L(54.0f));
            this.h0 = n4.h(7, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
            org.telegram.ui.ActionBar.q0 h = n4.h(12, R.drawable.msg_archive_hide, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131749333, null));
            this.i0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.q0 h7 = n4.h(13, R.drawable.msg_archive_show, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131745363, null));
            this.j0 = h7;
            h7.setVisibility(8);
            org.telegram.ui.ActionBar.q0 h10 = n4.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131754839, null));
            this.n0 = h10;
            this.k0 = h10.e(8, R.drawable.msg_markread, org.telegram.messenger.bd.M0(2131748689, null));
            this.l0 = this.n0.e(9, R.drawable.msg_topic_close, org.telegram.messenger.bd.M0(2131752039, null));
            this.m0 = this.n0.e(10, R.drawable.msg_topic_restart, org.telegram.messenger.bd.M0(2131746094, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            c00Var = this.s;
            if (!hasNext) {
                break;
            }
            boolean z13 = z12;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f10 = c00Var.f(j10, intValue);
            if (f10 != null) {
                if (f10.unread_count != 0) {
                    i11++;
                }
                if (org.telegram.messenger.t3.y(15, M0) && !f10.hidden) {
                    if (f10.pinned) {
                        i13++;
                    } else {
                        z11 = (z13 ? 1 : 0) + 1;
                        int i14 = i12;
                        i12 = !getMessagesController().r2(-j10, intValue, null) ? i14 + 1 : i14;
                        z12 = z11;
                    }
                }
            }
            z11 = z13 ? 1 : 0;
            int i142 = i12;
            if (!getMessagesController().r2(-j10, intValue, null)) {
            }
            z12 = z11;
        }
        int i15 = i12;
        boolean z14 = z12;
        if (i11 > 0) {
            this.k0.setVisibility(0);
            this.k0.j(org.telegram.messenger.bd.M0(2131748689, null), R.drawable.msg_markread, null);
            i3 = 8;
        } else {
            i3 = 8;
            this.k0.setVisibility(8);
        }
        if (i15 != 0) {
            this.C0 = false;
            this.g0.setIcon(R.drawable.msg_unmute);
            this.g0.setContentDescription(org.telegram.messenger.bd.M0(2131752165, null));
            z10 = true;
        } else {
            z10 = true;
            this.C0 = true;
            this.g0.setIcon(R.drawable.msg_mute);
            this.g0.setContentDescription(org.telegram.messenger.bd.M0(2131752175, null));
        }
        this.e0.setVisibility((z14 == z10 && i13 == 0) ? 0 : i3);
        this.f0.setVisibility((i13 != z10 || z14) ? i3 : 0);
        this.d0.a(hashSet.size(), z10);
        Iterator it2 = hashSet.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (it2.hasNext()) {
            HashSet hashSet2 = hashSet;
            TLRPC.TL_forumTopic f11 = c00Var.f(j10, ((Integer) it2.next()).intValue());
            if (f11 != null) {
                if (org.telegram.messenger.t3.e(this.currentAccount, M0, f11)) {
                    i18++;
                }
                if (org.telegram.messenger.t3.i(this.currentAccount, M0, f11)) {
                    if (f11.id == 1) {
                        if (f11.hidden) {
                            i20++;
                        } else {
                            i19++;
                        }
                    }
                    if (!f11.hidden) {
                        if (f11.closed) {
                            i16++;
                        } else {
                            i17++;
                        }
                    }
                }
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        this.l0.setVisibility((i16 != 0 || i17 <= 0) ? 8 : 0);
        this.l0.setText(org.telegram.messenger.bd.M0(i17 > 1 ? 2131752038 : 2131752039, null));
        this.m0.setVisibility((i17 != 0 || i16 <= 0) ? 8 : 0);
        this.m0.setText(i16 > 1 ? org.telegram.messenger.bd.M0(2131746093, null) : org.telegram.messenger.bd.M0(2131746094, null));
        this.h0.setVisibility(i18 == hashSet3.size() ? 0 : 8);
        this.i0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.j0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.n0.l();
        V0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        if (getMessagesController().n.contains(java.lang.Long.valueOf(r1.id)) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fd  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.animation.Animator$AnimatorListener, java.lang.String, org.telegram.ui.j80] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(boolean z10) {
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.ChatFull chatFull;
        String str;
        String M0;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j10));
        long j11 = -j10;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j11));
        if (org.telegram.messenger.l10.u(a22)) {
            this.f.setUserAvatar(a22);
        } else if (org.telegram.messenger.t3.p0(M02)) {
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(M02.linked_monoforum_id));
            if (M03 != null) {
                this.f.setChatAvatar(M03);
            }
        } else {
            this.f.setChatAvatar(M02);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.currentAccount).d7;
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j11);
        boolean z14 = sharedPreferences.getInt(sb2.toString(), 0) == 2;
        boolean w10 = org.telegram.messenger.k5.w("dialog_bar_report", j11, sharedPreferences, false);
        boolean w11 = org.telegram.messenger.k5.w("dialog_bar_block", j11, sharedPreferences, false);
        boolean z15 = this.u0;
        if (z15) {
            r12 = 0;
            if (this.x0) {
                this.f.setTitle(org.telegram.messenger.bd.M0(2131746262, null));
            } else if (this.w0) {
                this.f.setTitle(org.telegram.messenger.bd.M0(2131746437, null));
            } else if (this.y0) {
                this.f.setTitle(org.telegram.messenger.bd.M0(2131752977, null));
            } else if (this.v0) {
                this.f.setTitle(org.telegram.messenger.bd.M0(2131750576, null));
            } else {
                this.f.setTitle(org.telegram.messenger.bd.M0(2131745659, null));
            }
            this.q0.setVisibility(8);
            org.telegram.ui.Components.jn jnVar = this.f;
            if (jnVar != null && jnVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(this.q0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (M02 != null) {
                this.f.setTitle(M02.title);
                str = null;
                this.f.j(null, getMessagesController().r2(j11, 0L, null) ? getThemedDrawable("drawableMuteIcon") : null);
            } else {
                str = null;
            }
            TLRPC.ChatFull N0 = getMessagesController().N0(j10);
            if (N0 != null && (chatFull2 = this.K) != null && (chatParticipants = chatFull2.participants) != null) {
                N0.participants = chatParticipants;
            }
            this.K = N0;
            if (N0 != null) {
                int i3 = N0.participants_count;
                if (i3 <= 0) {
                    TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(j10));
                    M0 = M04 == null ? org.telegram.messenger.bd.M0(2131748787, str) : org.telegram.messenger.t3.t0(M04) ? org.telegram.messenger.bd.M0(2131748646, str).toLowerCase() : org.telegram.messenger.bd.M0(2131748649, str).toLowerCase();
                } else {
                    M0 = org.telegram.messenger.bd.G(i3, "Members", new Object[0]);
                }
            } else {
                M0 = org.telegram.messenger.bd.M0(2131748787, str);
            }
            this.f.setSubtitle(M0);
            r12 = str;
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j12 = org.telegram.messenger.hp.s1(this.currentAccount).d7.getLong(a1.g.p(j11, "dialog_join_requested_time_"), -1L);
        if (M02 == null || !org.telegram.messenger.t3.r0(M02) || j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
            if (M02 != null && !z15) {
                if (!org.telegram.messenger.t3.r0(M02)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(M02.id))) {
                    z13 = true;
                    z12 = true;
                } else {
                    if (M02.join_request) {
                        this.M.setText(org.telegram.messenger.bd.M0(2131752395, r12));
                    } else {
                        this.M.setText(org.telegram.messenger.bd.M0(2131752397, r12));
                    }
                    z12 = true;
                    this.M.setClickable(true);
                    this.M.setEnabled(true);
                    z13 = false;
                }
                org.telegram.messenger.g0.Z3(this.o0, z13, 0.5f, z12, z16);
                org.telegram.messenger.g0.Z3(this.M, z13 ^ z12, 0.5f, z12, z16);
                N0(0);
            }
            if (!z14 || (!w11 && !w10)) {
                z11 = false;
                if (this.W != z11) {
                    this.W = z11;
                    this.p0.animate().setListener(r12).cancel();
                    if (z16) {
                        this.p0.animate().translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(53.0f)).setListener(new x81(this, z11, 1));
                    } else {
                        this.p0.setVisibility(z11 ? 0 : 8);
                        this.p0.setTranslationY(z11 ? 0.0f : org.telegram.messenger.g0.L(53.0f));
                    }
                }
                F0();
                this.r0.setVisibility(!z15 ? 8 : 0);
                this.S.setVisibility(!org.telegram.messenger.t3.w(3, M02) ? 0 : 8);
                this.U.setVisibility((org.telegram.messenger.t3.R(M02) || (!getUserConfig().q() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.t3.N(M02)))) ? 8 : 0);
                this.T.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.r0(M02)) ? 8 : 0);
                this.V.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.N(M02)) ? 8 : 0);
                U0(true);
                this.I0 = getMessagesController().g1(j10, true, r12);
                D0(false);
            }
            this.M.setText(org.telegram.messenger.bd.M0(2131746213, r12));
            this.M.setClickable(true);
            this.M.setEnabled(true);
            org.telegram.messenger.g0.Z3(this.o0, false, 0.5f, true, false);
            org.telegram.messenger.g0.Z3(this.M, true, 0.5f, true, false);
            N0(1);
        } else {
            this.M.a(org.telegram.messenger.bd.M0(2131752393, r12), z16);
            this.M.setEnabled(false);
            org.telegram.messenger.g0.Z3(this.o0, false, 0.5f, true, z16);
            org.telegram.messenger.g0.Z3(this.M, true, 0.5f, true, z16);
            N0(0);
        }
        z11 = true;
        if (this.W != z11) {
        }
        F0();
        this.r0.setVisibility(!z15 ? 8 : 0);
        this.S.setVisibility(!org.telegram.messenger.t3.w(3, M02) ? 0 : 8);
        this.U.setVisibility((org.telegram.messenger.t3.R(M02) || (!getUserConfig().q() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.t3.N(M02)))) ? 8 : 0);
        this.T.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.r0(M02)) ? 8 : 0);
        this.V.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.N(M02)) ? 8 : 0);
        U0(true);
        this.I0 = getMessagesController().g1(j10, true, r12);
        D0(false);
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.pf));
        this.h.updateColors();
        yg0 yg0Var = this.p0;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        yg0Var.setBackgroundColor(getThemedColor(i3));
        this.actionBar.setActionModeColor(getThemedColor(i3));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        }
        this.s0.setBackgroundColor(getThemedColor(i3));
    }

    public final void U0(boolean z10) {
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.a;
        boolean z11 = (org.telegram.messenger.t3.r0(getMessagesController().M0(Long.valueOf(j10))) || !org.telegram.messenger.t3.w(15, messagesController.M0(Long.valueOf(j10))) || this.t0 || this.u0 || this.K0) ? false : true;
        this.L = z11;
        this.R.setVisibility(z11 ? 0 : 8);
        K0(!this.L, z10);
    }

    public final void V0() {
        boolean z10 = org.telegram.messenger.t3.y(15, g()) && !this.b0.isEmpty();
        if (this.c0 != z10) {
            this.c0 = z10;
            d91 d91Var = this.r;
            d91Var.k(0, d91Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.d2, org.telegram.ui.de0
    public final /* synthetic */ boolean W(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.c1 = true;
        float f11 = 1.0f - f10;
        this.f.getTitleTextView().setAlpha(f11);
        this.f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.m61 m61Var = this.b1;
        if (m61Var != null) {
            m61Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.b1.setAlpha(f10);
        }
        this.s0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.s0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f11);
        if (this.a1) {
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(y9);
            this.O.setScaleY(y9);
        }
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.y8;
        kVar.D(i0.a.f(this.X, themedColor, getThemedColor(i3)), false);
        this.actionBar.D(i0.a.f(this.X, getThemedColor(i3), getThemedColor(i3)), true);
        this.actionBar.C(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.k6.t8), getThemedColor(org.telegram.ui.ActionBar.k6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.k6.s8), getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
    }

    public final void Y0() {
        ei.f5 f5Var = this.E0;
        if (f5Var == null || f5Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.ic_ab_other, 0);
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        if (org.telegram.messenger.t3.y(15, g())) {
            this.E0.e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748144, null)), spannableStringBuilder, "%s"));
            return;
        }
        String M0 = org.telegram.messenger.bd.M0(2131750482, null);
        TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(this.a, 1L);
        if (f10 != null) {
            M0 = f10.title;
        }
        this.E0.e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NoTopicsDescriptionUser", null, 2131748143, M0)));
    }

    public final void Z0(boolean z10, boolean z11) {
        q81 q81Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.c00 c00Var = this.s;
        long j10 = this.a;
        ArrayList l10 = c00Var.l(j10);
        if (l10 != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(-j10))) && this.v0) {
                arrayList.add(new e91(3, null));
            }
            for (int i3 = 0; i3 < l10.size(); i3++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i3)).id))) {
                    arrayList.add(new e91(0, (TLRPC.TL_forumTopic) l10.get(i3)));
                }
            }
            if (!arrayList.isEmpty() && !c00Var.e(j10) && this.W0) {
                arrayList.add(new e91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e91 e91Var = (e91) arrayList.get(i10);
                if (e91Var != null && (tL_forumTopic = e91Var.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            z81 z81Var = this.O;
            if (z81Var != null) {
                if (z81Var.getItemAnimator() != (z10 ? this.J0 : null)) {
                    this.O.setItemAnimator(z10 ? this.J0 : null);
                }
            }
            d91 d91Var = this.r;
            if (d91Var != null) {
                d91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (q81Var = this.G) != null) {
                q81Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override // org.telegram.ui.Components.ig, org.telegram.ui.Components.x30
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        uw uwVar = this.N0;
        final int i3 = 0;
        this.e1 = (uwVar == null || !uwVar.X) ? 0 : org.telegram.messenger.g0.L(72.0f);
        uw uwVar2 = this.N0;
        this.f1 = (uwVar2 == null || !uwVar2.X) ? 0 : org.telegram.messenger.g0.L(64.0f);
        v81 v81Var = new v81(this, context);
        this.d = v81Var;
        this.fragmentView = v81Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, v81Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i10 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((q4Var2 = this.parentLayout) != null && ((ActionBarLayout) q4Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setActionBarMenuOnItemClick(new y81(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m81
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i3) {
                    case 0:
                        m91 m91Var = this.b;
                        if (!m91Var.t0) {
                            m91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        m91 m91Var2 = this.b;
                        m91Var2.getMessagesController().i2(-m91Var2.a, null, m91Var2.g());
                        m91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        uw uwVar3 = this.b.N0;
                        if (uwVar3 != null && (q0Var = uwVar3.k0) != null) {
                            q0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        m91 m91Var3 = this.b;
                        m91Var3.presentFragment(l81.f0(m91Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        final int i11 = 3;
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.q0 a10 = q10.a(0, R.drawable.outline_header_search);
            this.q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m81
                public final /* synthetic */ m91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (i11) {
                        case 0:
                            m91 m91Var = this.b;
                            if (!m91Var.t0) {
                                m91Var.L0(false);
                                break;
                            }
                            break;
                        case 1:
                            m91 m91Var2 = this.b;
                            m91Var2.getMessagesController().i2(-m91Var2.a, null, m91Var2.g());
                            m91Var2.S0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            uw uwVar3 = this.b.N0;
                            if (uwVar3 != null && (q0Var = uwVar3.k0) != null) {
                                q0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            m91 m91Var3 = this.b;
                            m91Var3.presentFragment(l81.f0(m91Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.q0 a11 = q10.a(0, R.drawable.outline_header_search);
            this.q0 = a11;
            a11.N();
            a11.J(new lg.w1(this, 22));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            org.telegram.ui.ActionBar.r6.V(searchField, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.r6.w(searchField, org.telegram.ui.ActionBar.k6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.q0 c2 = q10.c(0, R.drawable.ic_ab_other, null);
        this.r0 = c2;
        c2.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        this.r0.e(1, R.drawable.msg_discussion, org.telegram.messenger.bd.M0(2131744012, null));
        final int i12 = 2;
        this.S = this.r0.e(2, R.drawable.msg_addcontact, org.telegram.messenger.bd.M0(2131754401, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.r0;
        this.U = q0Var.d(14, 0, new org.telegram.ui.Components.ch0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.bd.M0(2131753585, null), true, false, q0Var.n0);
        this.R = this.r0.e(3, R.drawable.msg_topic_create, org.telegram.messenger.bd.M0(2131751703, null));
        this.V = this.r0.e(15, R.drawable.msg_report, org.telegram.messenger.bd.M0(2131746240, null));
        this.T = this.r0.d(11, R.drawable.msg_leave, null, org.telegram.messenger.bd.M0(2131748998, null), true, false, null);
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, this, false, this.resourceProvider);
        this.f = jnVar;
        jnVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((q4Var = this.parentLayout) != null && ((ActionBarLayout) q4Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.jn jnVar2 = this.f;
        long j10 = -this.a;
        jnVar2.b = j10 < 0;
        jnVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, b8.mf.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        int i13 = 4;
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new a8(this, i13));
        }
        this.O = new z81(this, context);
        kh.k kVar = new kh.k(this.d);
        ViewGroup viewGroup = this.d;
        eh.c cVar = this.l1;
        cVar.h = kVar;
        cVar.i = viewGroup;
        z81 z81Var = this.O;
        uw uwVar3 = this.N0;
        if (uwVar3 != null) {
            viewGroup = (ViewGroup) uwVar3.getFragmentView();
        }
        z81 z81Var2 = this.O;
        Objects.requireNonNull(z81Var2);
        this.m1 = new eh.k(z81Var, viewGroup, new i40(z81Var2, 2));
        this.O.D0(new n81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        rg.b c10 = rg.c.c(getParentActivity(), 0.85f, -1, false);
        c10.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
        cv cvVar = new cv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131754721, null), spannableString, "#"));
        this.x = cvVar;
        cvVar.b();
        int i14 = this.F ? 2 : 0;
        this.E = i14;
        this.x.X = i14 != 0;
        b91 b91Var = new b91(this);
        this.O.setHideIfEmpty(false);
        b91Var.m = false;
        b91Var.C = false;
        z81 z81Var3 = this.O;
        this.J0 = b91Var;
        z81Var3.setItemAnimator(b91Var);
        this.O.setOnScrollListener(new r81(this, i10));
        z81 z81Var4 = this.O;
        z81Var4.X1 = true;
        z81Var4.Y1 = 0;
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(z81Var4, true);
        this.L0 = wi0Var;
        this.O.setItemsEnterAnimator(wi0Var);
        this.O.setOnItemClickListener(new nx0(this, 9));
        this.O.setOnItemLongClickListener(new o81(this));
        this.O.setOnScrollListener(new r81(this, i12));
        z81 z81Var5 = this.O;
        q81 q81Var = new q81(this);
        this.G = q81Var;
        z81Var5.setLayoutManager(q81Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new r81(this, i3));
        l91 l91Var = new l91(this);
        this.Q = l91Var;
        s81 s81Var = new s81(this, l91Var);
        this.P = s81Var;
        s81Var.h(this.O);
        this.d.addView(this.O, b8.mf.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(getParentActivity(), this.resourceProvider, false);
        this.h = l00Var;
        this.d.addView(l00Var, org.telegram.ui.Components.l00.b());
        final int i15 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m81
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i15) {
                    case 0:
                        m91 m91Var = this.b;
                        if (!m91Var.t0) {
                            m91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        m91 m91Var2 = this.b;
                        m91Var2.getMessagesController().i2(-m91Var2.a, null, m91Var2.g());
                        m91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        uw uwVar32 = this.b.N0;
                        if (uwVar32 != null && (q0Var2 = uwVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        m91 m91Var3 = this.b;
                        m91Var3.presentFragment(l81.f0(m91Var3.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.bd.M0(2131751703, null));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(24);
        izVar.setVisibility(8);
        izVar.x = true;
        j81 j81Var = new j81(context, i10);
        TextView textView = new TextView(context);
        j81Var.d = textView;
        if (org.telegram.messenger.bd.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131744269, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131744269, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
        boolean z10 = org.telegram.messenger.bd.a0;
        j81Var.addView(textView, b8.mf.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = j81Var;
        textView.setAlpha(0.0f);
        ei.f5 f5Var = new ei.f5(this, context, izVar);
        this.E0 = f5Var;
        try {
            f5Var.b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.bd.M0(2131748146, null));
        Y0();
        this.n.addView(izVar);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new yg0(context, 14);
        org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(context);
        this.M = n41Var;
        this.p0.addView(n41Var);
        this.d.addView(this.p0, b8.mf.e(-1, 51, 80));
        this.M.setOnClickListener(new t81(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, b8.mf.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.X0.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
        ImageView imageView2 = this.X0;
        int i16 = org.telegram.ui.ActionBar.k6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i16))));
        org.telegram.ui.ActionBar.r6.t(this.X0, i16, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, b8.mf.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m81
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i10) {
                    case 0:
                        m91 m91Var = this.b;
                        if (!m91Var.t0) {
                            m91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        m91 m91Var2 = this.b;
                        m91Var2.getMessagesController().i2(-m91Var2.a, null, m91Var2.g());
                        m91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        uw uwVar32 = this.b.N0;
                        if (uwVar32 != null && (q0Var2 = uwVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        m91 m91Var3 = this.b;
                        m91Var3.presentFragment(l81.f0(m91Var3.a, 0L));
                        break;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        l0 l0Var = new l0(27, context, this);
        this.e = l0Var;
        if (this.N0 == null) {
            this.d.addView(l0Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        }
        i91 i91Var = new i91(this, context);
        this.s0 = i91Var;
        i91Var.setVisibility(8);
        this.e.addView(this.s0, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 44.0f, 0.0f, 0.0f));
        i91 i91Var2 = this.s0;
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i17, i91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.V0 = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        gh.g c11 = cVar.c(this.V0, b8.cd.o(this.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c11);
        this.V0.setOnAnimatedHeightChangedListener(new n81(this, i3));
        this.d.addView(this.V0, b8.mf.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g7 = g();
        if (g7 != null) {
            zh.d dVar = new zh.d(g7, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), b8.mf.o(-1, 40));
            this.V0.h(3, this.S0.b());
            this.V0.g(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.m = new o81(this);
            TLRPC.ChatFull chatFull = this.K;
            dVar2.j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.h(4, this.G0);
            this.V0.g(this.G0);
            this.V0.i(this.G0, true, false);
            w8 w8Var = new w8(this, context, this);
            this.H0 = w8Var;
            this.G0.addView(w8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c12 = b8.mf.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = org.telegram.messenger.g0.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        C0();
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(12, context, this);
        this.Q0 = r0Var;
        r0Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i17), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m81
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i12) {
                    case 0:
                        m91 m91Var = this.b;
                        if (!m91Var.t0) {
                            m91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        m91 m91Var2 = this.b;
                        m91Var2.getMessagesController().i2(-m91Var2.a, null, m91Var2.g());
                        m91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        uw uwVar32 = this.b.N0;
                        if (uwVar32 != null && (q0Var2 = uwVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        m91 m91Var3 = this.b;
                        m91Var3.presentFragment(l81.f0(m91Var3.a, 0L));
                        break;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) it.next();
                if (d2Var instanceof uw) {
                    uw uwVar4 = (uw) d2Var;
                    if (uwVar4.t4()) {
                        org.telegram.messenger.pr prVar2 = uwVar4.q2;
                        if (prVar2.a == j10) {
                            this.R0 = prVar2.b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Z0(false, false);
        }
        S0(false);
        T0();
        if (org.telegram.messenger.t3.R(g())) {
            getMessagesController().G0().a(j10, new s3(this, 25));
        }
        View view = this.fragmentView;
        o81 o81Var = new o81(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, o81Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.hs.T;
        long j10 = this.a;
        if (i3 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j10) {
                S0(false);
                zh.d dVar = this.S0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i3 == org.telegram.messenger.hs.v5) {
            S0(false);
        } else if (i3 == org.telegram.messenger.hs.p3) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i3 == org.telegram.messenger.hs.q5) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i3 == org.telegram.messenger.hs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.hp.C8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().q7.y(j10, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.s) {
            Z0(false, false);
        } else if (i3 == org.telegram.messenger.hs.w2) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.I0 = getMessagesController().g1(l10.longValue(), false, null);
                w8 w8Var = this.H0;
                if (w8Var != null) {
                    w8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i3 == org.telegram.messenger.hs.f0) {
            Z0(false, false);
            S0(true);
        } else if (i3 != org.telegram.messenger.hs.r5 && i3 == org.telegram.messenger.hs.t) {
            removeSelfFromStack(true);
        }
        if (i3 == org.telegram.messenger.hs.h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j10) || booleanValue) {
                if (this.R0 != 0) {
                    this.R0 = 0L;
                    Z0(false, false);
                    return;
                }
                return;
            }
            if (this.R0 != longValue2) {
                this.R0 = longValue2;
                Z0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.ig
    public final TLRPC.Chat g() {
        return getMessagesController().M0(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.ig
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var = this.I0;
        if (r3Var == null || !(r3Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return r3Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i91 i91Var = this.s0;
        if (i91Var != null && i91Var.a0 != null) {
            int i3 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.t0 ? org.telegram.ui.ActionBar.k6.d6 : org.telegram.ui.ActionBar.k6.s8);
        if (this.actionBar.v()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ TLRPC.User j() {
        return null;
    }

    @Override // org.telegram.ui.de0
    public final si.f k() {
        return this.i1;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (this.b0.isEmpty()) {
            if (!this.t0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.y(this.q0.T(false));
            }
        } else if (z10) {
            G0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.a;
        messagesController.V2(0, j10, true);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.v5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.p3);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.q5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.s);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.w2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.t);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.h0);
        Z0(false, false);
        g11.t(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = r1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().j1(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        this.P0.e();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.v5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.p3);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.q5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.s);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.w2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.t);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.h0);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.a));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        uw uwVar = this.N0;
        if (uwVar == null || uwVar.G3 == null) {
            return;
        }
        uwVar.getActionBar().setSearchAvatarImageView(null);
        this.N0.G3.N = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().q7.f;
        long j10 = this.a;
        int i3 = longSparseIntArray.get(j10, 0) - 1;
        longSparseIntArray.put(j10, i3 >= 0 ? i3 : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.c00 c00Var = getMessagesController().q7;
        LongSparseIntArray longSparseIntArray = c00Var.f;
        long j10 = this.a;
        longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
        c00Var.y(j10, true);
        this.H = false;
        org.telegram.messenger.g0.b4(this.O);
        this.H = true;
        setBulletinDelegate(new x8(this, 9));
        if (!this.inPreviewMode || getMessagesController().t2(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.az.o() != 0 && this.U0) {
            P0(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        si.c cVar = this.k1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.y5.b(getThemedColor(org.telegram.ui.ActionBar.k6.Re))) != this.q1) {
            this.q1 = b10;
            org.telegram.ui.ActionBar.k6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i3 = 0; i3 < 2; i3++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
        }
        org.telegram.ui.Components.voip.r0 r0Var = this.Q0;
        if (r0Var != null && (r0Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            cv cvVar = this.x;
            if (cvVar != null) {
                cvVar.i();
            }
            if (this.actionBar != null && this.c1) {
                X0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ke));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        pv pvVar;
        org.telegram.ui.Components.voip.r0 r0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (r0Var = this.Q0) != null) {
            if (r0Var.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.P0.e();
        if (z10) {
            return;
        }
        if (this.u0 && this.I) {
            removeSelfFromStack();
            uw uwVar = this.M0;
            if (uwVar != null) {
                uwVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.J) {
            removeSelfFromStack();
            uw uwVar2 = this.N0;
            if (uwVar2 == null || (pvVar = uwVar2.G3) == null || !pvVar.c()) {
                return;
            }
            this.N0.G3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        org.telegram.ui.Components.voip.r0 r0Var = this.Q0;
        if (r0Var == null || r0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.Q0.setAlpha(1.0f - f10);
        } else {
            this.Q0.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.P0.d();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.U0 = true;
            O0(true);
        } else {
            this.U0 = false;
            O0(false);
            P0(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ig
    public final org.telegram.ui.Components.jn r() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.jn jnVar = this.f;
        if (jnVar != null) {
            jnVar.setAlpha(f10);
            this.r0.setAlpha(f10);
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var != null) {
                q0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.jn jnVar = this.f;
        if (jnVar != null) {
            jnVar.setAlpha(f10);
            this.f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override // org.telegram.ui.de0
    public final void v() {
        this.O.y0(0);
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ig
    public final /* synthetic */ void l(int i3, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
