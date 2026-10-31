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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class pb1 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.gg, of0 {
    public static final HashSet q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public int D;
    public org.telegram.ui.Components.kj D0;
    public boolean E;
    public fb1 E0;
    public sa1 F;
    public FrameLayout F0;
    public boolean G;
    public y8 G0;
    public boolean H;
    public org.telegram.messenger.u3 H0;
    public boolean I;
    public eb1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.wj0 K0;
    public org.telegram.ui.Components.w51 L;
    public ay L0;
    public int M;
    public ay M0;
    public cb1 N;
    public boolean N0;
    public ua1 O;
    public final e2.f O0;
    public ob1 P;
    public do0 P0;
    public org.telegram.ui.ActionBar.b1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.b1 R;
    public oh.e R0;
    public org.telegram.ui.ActionBar.b1 S;
    public float S0;
    public org.telegram.ui.ActionBar.b1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.b1 U;
    public org.telegram.ui.Components.zr U0;
    public boolean V;
    public final boolean V0;
    public float W;
    public ImageView W0;
    public TL_stories.TL_premium_boostsStatus X;
    public float X0;
    public long Y;
    public ValueAnimator Y0;
    public boolean Z;
    public boolean Z0;
    public final long a;
    public final HashSet a0;
    public org.telegram.ui.Components.v71 a1;
    public final ArrayList b;
    public boolean b0;
    public boolean b1;
    public int c;
    public NumberTextView c0;
    public View c1;
    public xa1 d;
    public org.telegram.ui.ActionBar.t0 d0;
    public int d1;
    public l0 e;
    public org.telegram.ui.ActionBar.t0 e0;
    public int e1;
    public org.telegram.ui.Components.sn f;
    public org.telegram.ui.ActionBar.t0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.t0 g0;
    public final tg.f g1;
    public org.telegram.ui.Components.f10 h;
    public org.telegram.ui.ActionBar.t0 h0;
    public final hi.f h1;
    public org.telegram.ui.ActionBar.t0 i0;
    public final hi.f i1;
    public org.telegram.ui.ActionBar.b1 j0;
    public final hi.c j1;
    public org.telegram.ui.ActionBar.b1 k0;
    public final tg.b k1;
    public org.telegram.ui.ActionBar.b1 l0;
    public tg.j l1;
    public org.telegram.ui.ActionBar.t0 m0;
    public final ArrayList m1;
    public ja1 n;
    public RadialProgressView n0;
    public final RectF n1;
    public dg0 o0;
    public final RectF o1;
    public org.telegram.ui.ActionBar.t0 p0;
    public int p1;
    public org.telegram.ui.ActionBar.t0 q0;
    public final gb1 r;
    public lb1 r0;
    public final org.telegram.messenger.x00 s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public qb1 w;
    public final boolean w0;
    public kw x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public pb1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new gb1(this);
        this.y = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.a0 = new HashSet();
        this.B0 = false;
        this.O0 = new e2.f(new int[]{org.telegram.messenger.zs.q5});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        RectF rectF = new RectF();
        this.n1 = rectF;
        RectF rectF2 = new RectF();
        this.o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.a = this.arguments.getLong("chat_id", 0L);
        this.t0 = this.arguments.getBoolean("for_select", false);
        this.u0 = this.arguments.getBoolean("forward_to", false);
        this.x0 = this.arguments.getBoolean("bot_share_to", false);
        this.v0 = this.arguments.getBoolean("quote", false);
        this.w0 = this.arguments.getBoolean("reply_to", false);
        this.y0 = this.arguments.getString("voicechat", null);
        this.z0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().r7;
        this.V0 = !org.telegram.messenger.m5.w("topics_end_reached_", r1, getUserConfig().k(), false);
        hi.c cVar = new hi.c();
        this.j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.g1 = null;
            this.h1 = null;
            this.i1 = null;
            this.k1 = new tg.b(cVar);
            return;
        }
        this.g1 = new tg.f(false);
        this.h1 = new hi.f(null);
        hi.f fVar = new hi.f(null);
        this.i1 = fVar;
        tg.b bVar = new tg.b(fVar);
        this.k1 = bVar;
        bVar.i = true;
    }

    public static org.telegram.ui.ActionBar.k2 H0(org.telegram.messenger.vp vpVar, org.telegram.messenger.hs hsVar, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog R0 = vpVar.R0(-j10);
            if (R0 != null && R0.view_forum_as_messages) {
                return new un(bundle);
            }
            TLRPC.ChatFull M0 = vpVar.M0(j10);
            if (M0 == null) {
                M0 = hsVar.F0(j10, true, new CountDownLatch(1), false, false, 0);
            }
            if (M0 != null && M0.view_forum_as_messages) {
                return new un(bundle);
            }
        }
        return new pb1(bundle);
    }

    public static org.telegram.ui.ActionBar.k2 I0(LaunchActivity launchActivity, Bundle bundle) {
        return H0(org.telegram.messenger.vp.r1(launchActivity.O), org.telegram.messenger.hs.a0(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.pb1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L0(un unVar) {
        if (unVar.getParentLayout() == null) {
            return;
        }
        if (unVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) unVar.getParentLayout().getFragmentStack().get(unVar.getParentLayout().getFragmentStack().size() - 2);
            if (k2Var instanceof pb1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -unVar.a());
        ((ActionBarLayout) unVar.getParentLayout()).c(unVar.getParentLayout().getFragmentStack().size() - 1, new pb1(bundle));
        unVar.Ca = true;
        unVar.finishFragment();
    }

    public static boolean Y(pb1 pb1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.vp.r1(pb1Var.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + (-pb1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = pb1Var.getParentActivity();
        boolean V = org.telegram.messenger.w3.V(pb1Var.g());
        int i10 = org.telegram.ui.Components.u70.q1;
        org.telegram.ui.Components.u70.J0(parentActivity, pb1Var, org.telegram.ui.Components.cc.a0(pb1Var), V);
        pb1Var.R0(true);
        return false;
    }

    public static void Z(pb1 pb1Var, View view) {
        long j10 = pb1Var.a;
        if (pb1Var.getParentLayout() == null || ((ActionBarLayout) pb1Var.getParentLayout()).x() || !(view instanceof mb1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((mb1) view).N;
        long j11 = -j10;
        long o10 = tL_forumTopic == null ? 0L : pb1Var.getMessagesController().x2(j11) ? org.telegram.messenger.o5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (pb1Var.t0) {
            qb1 qb1Var = pb1Var.w;
            if (qb1Var != null) {
                sb1 sb1Var = qb1Var.a;
                Bundle bundle = new Bundle();
                vb1 vb1Var = sb1Var.a;
                bundle.putLong("dialog_id", vb1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                uy0 uy0Var = new uy0(bundle, null);
                uy0Var.s = new ep0(20, sb1Var, tL_forumTopic);
                vb1Var.presentFragment(uy0Var);
            }
            ay ayVar = pb1Var.L0;
            if (ayVar != null) {
                ayVar.Z3(j11, o10, true, pb1Var);
                return;
            }
            return;
        }
        if (pb1Var.a0.size() > 0) {
            pb1Var.Q0(view);
            return;
        }
        if (pb1Var.inPreviewMode && org.telegram.messenger.i0.Q1()) {
            for (org.telegram.ui.ActionBar.k2 k2Var : pb1Var.getParentLayout().getFragmentStack()) {
                if (k2Var instanceof ay) {
                    ay ayVar2 = (ay) k2Var;
                    if (ayVar2.s4()) {
                        org.telegram.messenger.gs gsVar = ayVar2.p2;
                        if (gsVar.a == j11 && gsVar.b == o10) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            pb1Var.Q0 = o10;
            pb1Var.Y0(false, false);
        }
        gg.e.m(pb1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean a0(pb1 pb1Var, View view, float f7) {
        if (pb1Var.t0 || pb1Var.getParentLayout() == null || ((ActionBarLayout) pb1Var.getParentLayout()).x()) {
            return false;
        }
        if (!pb1Var.actionBar.u() && !org.telegram.messenger.i0.Q1() && (view instanceof mb1)) {
            mb1 mb1Var = (mb1) view;
            if (mb1Var.Z(f7)) {
                pb1Var.P0(mb1Var);
                pb1Var.N.I0(true);
                pb1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        pb1Var.Q0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void e0(pb1 pb1Var, boolean z10) {
        xw xwVar;
        pb1Var.s0 = z10;
        ValueAnimator valueAnimator = pb1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            pb1Var.Y0.cancel();
        }
        int i10 = 0;
        if (pb1Var.a1 == null) {
            org.telegram.ui.Components.v71 n10 = pb1Var.r0.n(8, false);
            pb1Var.a1 = n10;
            if (pb1Var.M0 != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, n10, pb1Var.getResourceProvider());
            }
            pb1Var.e.addView(pb1Var.a1, w7.b6.c(44.0f, -1));
        }
        pb1Var.Y0 = ValueAnimator.ofFloat(pb1Var.W, z10 ? 1.0f : 0.0f);
        org.telegram.messenger.i0.Y3(pb1Var.r0, false, 1.0f, true, true);
        ay ayVar = pb1Var.M0;
        if (ayVar != null && (xwVar = ayVar.F3) != null) {
            xwVar.M = !z10;
        }
        pb1Var.Z0 = !z10 && pb1Var.r0.getVisibility() == 0 && pb1Var.r0.getAlpha() == 1.0f;
        pb1Var.Y0.addUpdateListener(new u01(pb1Var, 13));
        pb1Var.r0.setVisibility(0);
        if (z10) {
            org.telegram.messenger.i0.Z2(pb1Var.getParentActivity(), pb1Var.classGuid);
            pb1Var.T0(false);
        } else {
            pb1Var.q0.setVisibility(0);
        }
        pb1Var.Y0.addListener(new ab1(pb1Var, z10, i10));
        pb1Var.Y0.setDuration(200L);
        pb1Var.Y0.setInterpolator(org.telegram.ui.Components.gr.f);
        pb1Var.Y0.start();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, Boolean.TRUE);
    }

    public final void A0() {
        tg.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.g1) == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(48.0f);
        int L2 = org.telegram.messenger.i0.L(48.0f) + ((int) this.U0.c(org.telegram.messenger.i0.L(14.0f)));
        ay ayVar = this.M0;
        View view = ayVar != null ? ayVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.l actionBar = ayVar != null ? ayVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.f1) - org.telegram.messenger.i0.L(8.0f);
        int L3 = measuredHeight - org.telegram.messenger.i0.L(56.0f);
        this.n1.set(0.0f, -L, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + L + L2);
        RectF rectF = this.o1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
        fVar.g(this.M0 != null ? 2 : 1, this.m1);
        fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // org.telegram.ui.of0
    public final hi.f B() {
        return this.i1;
    }

    public final void B0() {
        sa1 sa1Var;
        org.telegram.messenger.x00 x00Var = this.s;
        long j10 = this.a;
        if (x00Var.e(j10) || (sa1Var = this.F) == null) {
            return;
        }
        int N0 = sa1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.b() - 5) {
            x00Var.o(j10);
        }
        D0();
    }

    public final void C0(boolean z10) {
        String str;
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = getMessagesController().M0(j10);
        if (this.H0 != null && ((str = this.y0) != null || this.z0)) {
            org.telegram.ui.Components.voip.m1.l(L0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y0 = null;
            this.z0 = false;
        } else {
            if (this.y0 == null || !z10 || M0 == null || M0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.m5.n(null, 2131748923, org.telegram.ui.Components.cc.a0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.gg
    public final org.telegram.ui.Components.uu0 D() {
        return this.d;
    }

    public final void D0() {
        org.telegram.messenger.x00 x00Var = this.s;
        a0.h hVar = x00Var.a;
        LongSparseIntArray longSparseIntArray = x00Var.c;
        long j10 = this.a;
        this.J0 = longSparseIntArray.get(j10, 0) == 1 && (hVar.f(j10) == null || ((ArrayList) hVar.f(j10)).isEmpty());
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((hb1) arrayList.get(0)).c != null && ((hb1) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        cb1 cb1Var = this.N;
        if (cb1Var != null) {
            cb1Var.K0(cb1Var.w1());
        }
        T0(true);
    }

    public final void E0() {
        ay ayVar = this.M0;
        if (ayVar != null) {
            int L = org.telegram.messenger.i0.L(14.0f);
            org.telegram.ui.Components.zr zrVar = ayVar.J1;
            float c10 = (zrVar != null ? zrVar.c(L) : 0.0f) + 0.0f;
            org.telegram.ui.Components.zr zrVar2 = this.U0;
            if (zrVar2 != null) {
                float L2 = org.telegram.messenger.i0.L(7.0f);
                org.telegram.ui.Components.zr zrVar3 = this.M0.J1;
                zrVar2.setTranslationY(c10 - ((zrVar3 != null ? zrVar3.getMetadata().c.a : 0.0f) * L2));
                org.telegram.ui.Components.zr zrVar4 = this.U0;
                int L3 = org.telegram.messenger.i0.L(14.0f);
                int L4 = org.telegram.messenger.i0.L(7.0f);
                r2 = zrVar4.c(org.telegram.messenger.i0.W1(this.M0.J1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.zr zrVar5 = this.U0;
            if (zrVar5 != null) {
                r2 = 0.0f + zrVar5.c(org.telegram.messenger.i0.L(14.0f));
            }
        }
        this.N.setPadding(0, (int) r2, 0, this.f1 + this.d1 + (this.V ? org.telegram.messenger.i0.L(51.0f) : 0));
    }

    public final void F0() {
        this.a0.clear();
        this.actionBar.t();
        org.telegram.messenger.i0.a4(this.N);
        U0();
    }

    public final void G0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        int i10 = 0;
        if (hashSet.size() == 1) {
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new a1.d(this, hashSet, arrayList, runnable, 18));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new ra1(i10));
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ boolean J() {
        return false;
    }

    public final void J0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    public final void K0(boolean z10) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.Z4(this.J);
        profileActivity.f5((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().J() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ long L() {
        return 0L;
    }

    public final void M0(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.L.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.t6.pf : org.telegram.ui.ActionBar.t6.q7);
            this.W0.setVisibility(i10 == 1 ? 0 : 8);
            R0(false);
        }
    }

    public final void N0(boolean z10) {
        if (org.telegram.messenger.tz.o() == 0) {
            return;
        }
        xa1 xa1Var = this.d;
        if (xa1Var != null) {
            if (z10) {
                xa1Var.setLayerType(2, null);
                xa1Var.setClipChildren(false);
                xa1Var.setClipToPadding(false);
            } else {
                xa1Var.setLayerType(0, null);
                xa1Var.setClipChildren(true);
                xa1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void O0(float f7) {
        if (org.telegram.messenger.tz.o() == 0) {
            return;
        }
        this.S0 = f7;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        cb1 cb1Var = this.N;
        if (cb1Var != null) {
            float z10 = sc.e.z(1.0f, this.S0, 0.05f, 1.0f);
            cb1Var.setPivotX(0.0f);
            cb1Var.setPivotY(0.0f);
            cb1Var.setScaleX(z10);
            cb1Var.setScaleY(z10);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(z10);
            this.actionBar.setScaleY(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void P0(org.telegram.ui.Cells.v2 v2Var) {
        boolean z10;
        try {
            v2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = v2Var.N;
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new wa1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(goVar.f);
        goVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        goVar.e(j11, tL_forumTopic.id, null);
        if (org.telegram.messenger.w3.y(15, g())) {
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                b1Var.j(org.telegram.messenger.cd.L0(2131751453, null), R.drawable.msg_unpin, null);
            } else {
                b1Var.j(org.telegram.messenger.cd.L0(2131751454, null), R.drawable.msg_pin, null);
            }
            b1Var.setMinimumWidth(org.telegram.messenger.zs.q2);
            z10 = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            b1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pa1
                public final /* synthetic */ pb1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr) {
                        case 0:
                            pb1 pb1Var = this.b;
                            pb1Var.C0 = true;
                            pb1Var.N0 = true;
                            pb1Var.s.t(pb1Var.a, tL_forumTopic.id, !r0.pinned, pb1Var);
                            pb1Var.finishPreviewFragment();
                            break;
                        case 1:
                            pb1 pb1Var2 = this.b;
                            pb1Var2.N0 = true;
                            org.telegram.messenger.x00 x00Var = pb1Var2.s;
                            long j12 = pb1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            x00Var.z(tL_forumTopic2.id, j12, true ^ tL_forumTopic2.closed);
                            pb1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            pb1 pb1Var3 = this.b;
                            pb1Var3.G0(hashSet, new na1(pb1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(b1Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(getParentActivity(), z10, z10);
        if (getMessagesController().q2(j11, tL_forumTopic.id, null)) {
            b1Var2.j(org.telegram.messenger.cd.L0(2131743874, null), R.drawable.msg_mute, null);
        } else {
            b1Var2.j(org.telegram.messenger.cd.L0(2131748329, null), R.drawable.msg_unmute, null);
        }
        b1Var2.setMinimumWidth(org.telegram.messenger.zs.q2);
        b1Var2.setOnClickListener(new ya(this, tL_forumTopic, (Serializable) r32, b10, 5));
        boolean z11 = false;
        r32[0].addView(b1Var2);
        if (org.telegram.messenger.w3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                b1Var3.j(org.telegram.messenger.cd.L0(2131746101, null), R.drawable.msg_topic_restart, null);
            } else {
                b1Var3.j(org.telegram.messenger.cd.L0(2131752039, null), R.drawable.msg_topic_close, null);
            }
            b1Var3.setMinimumWidth(org.telegram.messenger.zs.q2);
            final int i10 = 1;
            b1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pa1
                public final /* synthetic */ pb1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            pb1 pb1Var = this.b;
                            pb1Var.C0 = true;
                            pb1Var.N0 = true;
                            pb1Var.s.t(pb1Var.a, tL_forumTopic.id, !r0.pinned, pb1Var);
                            pb1Var.finishPreviewFragment();
                            break;
                        case 1:
                            pb1 pb1Var2 = this.b;
                            pb1Var2.N0 = true;
                            org.telegram.messenger.x00 x00Var = pb1Var2.s;
                            long j12 = pb1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            x00Var.z(tL_forumTopic2.id, j12, true ^ tL_forumTopic2.closed);
                            pb1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            pb1 pb1Var3 = this.b;
                            pb1Var3.G0(hashSet, new na1(pb1Var3, 3));
                            break;
                    }
                }
            });
            z11 = false;
            r32[0].addView(b1Var3);
        }
        if (org.telegram.messenger.w3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.b1 b1Var4 = new org.telegram.ui.ActionBar.b1(getParentActivity(), z11, true);
            b1Var4.j(org.telegram.messenger.cd.J0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            b1Var4.c(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
            b1Var4.setMinimumWidth(org.telegram.messenger.zs.q2);
            final int i11 = 2;
            b1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pa1
                public final /* synthetic */ pb1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            pb1 pb1Var = this.b;
                            pb1Var.C0 = true;
                            pb1Var.N0 = true;
                            pb1Var.s.t(pb1Var.a, tL_forumTopic.id, !r0.pinned, pb1Var);
                            pb1Var.finishPreviewFragment();
                            break;
                        case 1:
                            pb1 pb1Var2 = this.b;
                            pb1Var2.N0 = true;
                            org.telegram.messenger.x00 x00Var = pb1Var2.s;
                            long j12 = pb1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            x00Var.z(tL_forumTopic2.id, j12, true ^ tL_forumTopic2.closed);
                            pb1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            pb1 pb1Var3 = this.b;
                            pb1Var3.G0(hashSet, new na1(pb1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(b1Var4);
        }
        boolean x22 = getMessagesController().x2(j11);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.zs.K2));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.b6.c(-1.0f, -1));
        }
        un unVar = new un(org.telegram.ui.Cells.f1.k(j10, "chat_id"));
        gg.e.a(unVar, org.telegram.messenger.gs.a(j11, x22 ? org.telegram.messenger.o5.o(v2Var.N.from_id) : v2Var.N.id));
        presentFragmentAsPreviewWithMenu(unVar, r32[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(View view) {
        mb1 mb1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.messenger.x00 x00Var;
        int i10;
        boolean z10;
        boolean z11;
        if (!(view instanceof mb1) || (tL_forumTopic = (mb1Var = (mb1) view).N) == null) {
            return;
        }
        int i11 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i11);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i11));
        }
        mb1Var.c0(hashSet.contains(Integer.valueOf(i11)), true);
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.t();
            return;
        }
        if (!this.actionBar.e(null)) {
            org.telegram.ui.ActionBar.y m10 = this.actionBar.m(null);
            if (this.inPreviewMode) {
                m10.setBackgroundColor(0);
                m10.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(m10.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(org.telegram.messenger.i0.o());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y8));
            m10.addView(this.c0, w7.b6.m(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new qa1(0));
            this.d0 = m10.g(4, R.drawable.msg_pin, org.telegram.messenger.i0.L(54.0f));
            this.e0 = m10.g(5, R.drawable.msg_unpin, org.telegram.messenger.i0.L(54.0f));
            this.f0 = m10.g(6, R.drawable.msg_mute, org.telegram.messenger.i0.L(54.0f));
            this.g0 = m10.h(7, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
            org.telegram.ui.ActionBar.t0 h = m10.h(12, R.drawable.msg_archive_hide, org.telegram.messenger.cd.L0(2131749334, null), org.telegram.messenger.i0.L(54.0f));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.t0 h10 = m10.h(13, R.drawable.msg_archive_show, org.telegram.messenger.cd.L0(2131745371, null), org.telegram.messenger.i0.L(54.0f));
            this.i0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.t0 h11 = m10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.cd.L0(2131754839, null), org.telegram.messenger.i0.L(54.0f));
            this.m0 = h11;
            this.j0 = h11.e(8, R.drawable.msg_markread, org.telegram.messenger.cd.L0(2131748696, null));
            this.k0 = this.m0.e(9, R.drawable.msg_topic_close, org.telegram.messenger.cd.L0(2131752039, null));
            this.l0 = this.m0.e(10, R.drawable.msg_topic_restart, org.telegram.messenger.cd.L0(2131746101, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i12 = 0;
        int i13 = 0;
        boolean z12 = false;
        int i14 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            x00Var = this.s;
            if (!hasNext) {
                break;
            }
            boolean z13 = z12;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f7 = x00Var.f(j10, intValue);
            if (f7 != null) {
                if (f7.unread_count != 0) {
                    i12++;
                }
                if (org.telegram.messenger.w3.y(15, L0) && !f7.hidden) {
                    if (f7.pinned) {
                        i14++;
                    } else {
                        z11 = (z13 ? 1 : 0) + 1;
                        int i15 = i13;
                        i13 = !getMessagesController().q2(-j10, intValue, null) ? i15 + 1 : i15;
                        z12 = z11;
                    }
                }
            }
            z11 = z13 ? 1 : 0;
            int i152 = i13;
            if (!getMessagesController().q2(-j10, intValue, null)) {
            }
            z12 = z11;
        }
        int i16 = i13;
        boolean z14 = z12;
        if (i12 > 0) {
            this.j0.setVisibility(0);
            this.j0.j(org.telegram.messenger.cd.L0(2131748696, null), R.drawable.msg_markread, null);
            i10 = 8;
        } else {
            i10 = 8;
            this.j0.setVisibility(8);
        }
        if (i16 != 0) {
            this.B0 = false;
            this.f0.setIcon(R.drawable.msg_unmute);
            this.f0.setContentDescription(org.telegram.messenger.cd.L0(2131752165, null));
            z10 = true;
        } else {
            z10 = true;
            this.B0 = true;
            this.f0.setIcon(R.drawable.msg_mute);
            this.f0.setContentDescription(org.telegram.messenger.cd.L0(2131752175, null));
        }
        this.d0.setVisibility((z14 == z10 && i14 == 0) ? 0 : i10);
        this.e0.setVisibility((i14 != z10 || z14) ? i10 : 0);
        this.c0.a(hashSet.size(), z10);
        Iterator it2 = hashSet.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (it2.hasNext()) {
            HashSet hashSet2 = hashSet;
            TLRPC.TL_forumTopic f10 = x00Var.f(j10, ((Integer) it2.next()).intValue());
            if (f10 != null) {
                if (org.telegram.messenger.w3.e(this.currentAccount, L0, f10)) {
                    i19++;
                }
                if (org.telegram.messenger.w3.i(this.currentAccount, L0, f10)) {
                    if (f10.id == 1) {
                        if (f10.hidden) {
                            i21++;
                        } else {
                            i20++;
                        }
                    }
                    if (!f10.hidden) {
                        if (f10.closed) {
                            i17++;
                        } else {
                            i18++;
                        }
                    }
                }
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        this.k0.setVisibility((i17 != 0 || i18 <= 0) ? 8 : 0);
        this.k0.setText(org.telegram.messenger.cd.L0(i18 > 1 ? 2131752038 : 2131752039, null));
        this.l0.setVisibility((i18 != 0 || i17 <= 0) ? 8 : 0);
        this.l0.setText(i17 > 1 ? org.telegram.messenger.cd.L0(2131746100, null) : org.telegram.messenger.cd.L0(2131746101, null));
        this.g0.setVisibility(i19 == hashSet3.size() ? 0 : 8);
        this.h0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.i0.setVisibility((i21 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.m0.l();
        U0();
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
    /* JADX WARN: Type inference failed for: r12v1, types: [android.animation.Animator$AnimatorListener, java.lang.String, org.telegram.ui.q90] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z10) {
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.ChatFull chatFull;
        String str;
        String L0;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat L02 = messagesController.L0(Long.valueOf(j10));
        long j11 = -j10;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
        if (org.telegram.messenger.h20.u(Z1)) {
            this.f.setUserAvatar(Z1);
        } else if (org.telegram.messenger.w3.p0(L02)) {
            TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(L02.linked_monoforum_id));
            if (L03 != null) {
                this.f.setChatAvatar(L03);
            }
        } else {
            this.f.setChatAvatar(L02);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(this.currentAccount).e7;
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j11);
        boolean z14 = sharedPreferences.getInt(sb2.toString(), 0) == 2;
        boolean w9 = org.telegram.messenger.m5.w("dialog_bar_report", j11, sharedPreferences, false);
        boolean w10 = org.telegram.messenger.m5.w("dialog_bar_block", j11, sharedPreferences, false);
        boolean z15 = this.t0;
        if (z15) {
            r12 = 0;
            if (this.w0) {
                this.f.setTitle(org.telegram.messenger.cd.L0(2131746269, null));
            } else if (this.v0) {
                this.f.setTitle(org.telegram.messenger.cd.L0(2131746444, null));
            } else if (this.x0) {
                this.f.setTitle(org.telegram.messenger.cd.L0(2131752977, null));
            } else if (this.u0) {
                this.f.setTitle(org.telegram.messenger.cd.L0(2131750577, null));
            } else {
                this.f.setTitle(org.telegram.messenger.cd.L0(2131745666, null));
            }
            this.p0.setVisibility(8);
            org.telegram.ui.Components.sn snVar = this.f;
            if (snVar != null && snVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(this.p0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (L02 != null) {
                this.f.setTitle(L02.title);
                str = null;
                this.f.j(null, getMessagesController().q2(j11, 0L, null) ? getThemedDrawable("drawableMuteIcon") : null);
            } else {
                str = null;
            }
            TLRPC.ChatFull M0 = getMessagesController().M0(j10);
            if (M0 != null && (chatFull2 = this.J) != null && (chatParticipants = chatFull2.participants) != null) {
                M0.participants = chatParticipants;
            }
            this.J = M0;
            if (M0 != null) {
                int i10 = M0.participants_count;
                if (i10 <= 0) {
                    TLRPC.Chat L04 = getMessagesController().L0(Long.valueOf(j10));
                    L0 = L04 == null ? org.telegram.messenger.cd.L0(2131748789, str) : org.telegram.messenger.w3.t0(L04) ? org.telegram.messenger.cd.L0(2131748653, str).toLowerCase() : org.telegram.messenger.cd.L0(2131748656, str).toLowerCase();
                } else {
                    L0 = org.telegram.messenger.cd.G(i10, "Members", new Object[0]);
                }
            } else {
                L0 = org.telegram.messenger.cd.L0(2131748789, str);
            }
            this.f.setSubtitle(L0);
            r12 = str;
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j12 = org.telegram.messenger.vp.r1(this.currentAccount).e7.getLong(a1.g.l(j11, "dialog_join_requested_time_"), -1L);
        if (L02 == null || !org.telegram.messenger.w3.r0(L02) || j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
            if (L02 != null && !z15) {
                if (!org.telegram.messenger.w3.r0(L02)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(L02.id))) {
                    z13 = true;
                    z12 = true;
                } else {
                    if (L02.join_request) {
                        this.L.setText(org.telegram.messenger.cd.L0(2131752395, r12));
                    } else {
                        this.L.setText(org.telegram.messenger.cd.L0(2131752397, r12));
                    }
                    z12 = true;
                    this.L.setClickable(true);
                    this.L.setEnabled(true);
                    z13 = false;
                }
                org.telegram.messenger.i0.Y3(this.n0, z13, 0.5f, z12, z16);
                org.telegram.messenger.i0.Y3(this.L, z13 ^ z12, 0.5f, z12, z16);
                M0(0);
            }
            if (!z14 || (!w10 && !w9)) {
                z11 = false;
                if (this.V != z11) {
                    this.V = z11;
                    this.o0.animate().setListener(r12).cancel();
                    if (z16) {
                        this.o0.animate().translationY(z11 ? 0.0f : org.telegram.messenger.i0.L(53.0f)).setListener(new ab1(this, z11, 1));
                    } else {
                        this.o0.setVisibility(z11 ? 0 : 8);
                        this.o0.setTranslationY(z11 ? 0.0f : org.telegram.messenger.i0.L(53.0f));
                    }
                }
                E0();
                this.q0.setVisibility(!z15 ? 8 : 0);
                this.R.setVisibility(!org.telegram.messenger.w3.w(3, L02) ? 0 : 8);
                this.T.setVisibility((org.telegram.messenger.w3.R(L02) || (!getUserConfig().q() && (((chatFull = this.J) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.w3.N(L02)))) ? 8 : 0);
                this.S.setVisibility((L02 != null || L02.creator || org.telegram.messenger.w3.r0(L02)) ? 8 : 0);
                this.U.setVisibility((L02 != null || L02.creator || org.telegram.messenger.w3.N(L02)) ? 8 : 0);
                T0(true);
                this.H0 = getMessagesController().f1(j10, true, r12);
                C0(false);
            }
            this.L.setText(org.telegram.messenger.cd.L0(2131746220, r12));
            this.L.setClickable(true);
            this.L.setEnabled(true);
            org.telegram.messenger.i0.Y3(this.n0, false, 0.5f, true, false);
            org.telegram.messenger.i0.Y3(this.L, true, 0.5f, true, false);
            M0(1);
        } else {
            this.L.a(org.telegram.messenger.cd.L0(2131752393, r12), z16);
            this.L.setEnabled(false);
            org.telegram.messenger.i0.Y3(this.n0, false, 0.5f, true, z16);
            org.telegram.messenger.i0.Y3(this.L, true, 0.5f, true, z16);
            M0(0);
        }
        z11 = true;
        if (this.V != z11) {
        }
        E0();
        this.q0.setVisibility(!z15 ? 8 : 0);
        this.R.setVisibility(!org.telegram.messenger.w3.w(3, L02) ? 0 : 8);
        this.T.setVisibility((org.telegram.messenger.w3.R(L02) || (!getUserConfig().q() && (((chatFull = this.J) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.w3.N(L02)))) ? 8 : 0);
        this.S.setVisibility((L02 != null || L02.creator || org.telegram.messenger.w3.r0(L02)) ? 8 : 0);
        this.U.setVisibility((L02 != null || L02.creator || org.telegram.messenger.w3.N(L02)) ? 8 : 0);
        T0(true);
        this.H0 = getMessagesController().f1(j10, true, r12);
        C0(false);
    }

    public final void S0() {
        RadialProgressView radialProgressView = this.n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.t6.pf));
        this.h.updateColors();
        dg0 dg0Var = this.o0;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        dg0Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.s8));
        }
        this.r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void T0(boolean z10) {
        if (this.Q == null) {
            return;
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.a;
        boolean z11 = (org.telegram.messenger.w3.r0(getMessagesController().L0(Long.valueOf(j10))) || !org.telegram.messenger.w3.w(15, messagesController.L0(Long.valueOf(j10))) || this.s0 || this.t0 || this.J0) ? false : true;
        this.K = z11;
        this.Q.setVisibility(z11 ? 0 : 8);
        J0(!this.K, z10);
    }

    public final void U0() {
        boolean z10 = org.telegram.messenger.w3.y(15, g()) && !this.a0.isEmpty();
        if (this.b0 != z10) {
            this.b0 = z10;
            gb1 gb1Var = this.r;
            gb1Var.k(0, gb1Var.b());
        }
    }

    public final void V0(float f7) {
        this.W = f7;
        W0();
        this.b1 = true;
        float f10 = 1.0f - f7;
        this.f.getTitleTextView().setAlpha(f10);
        this.f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.v71 v71Var = this.a1;
        if (v71Var != null) {
            v71Var.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
            this.a1.setAlpha(f7);
        }
        this.r0.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
        this.r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float z10 = c3.i0.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.of0
    public final /* synthetic */ boolean W(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void W0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.y8;
        lVar.D(i0.b.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.b.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.b.f(this.W, getThemedColor(org.telegram.ui.ActionBar.t6.t8), getThemedColor(org.telegram.ui.ActionBar.t6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.b.f(this.W, getThemedColor(org.telegram.ui.ActionBar.t6.s8), getThemedColor(org.telegram.ui.ActionBar.t6.d6)));
    }

    public final void X0() {
        org.telegram.ui.Components.kj kjVar = this.D0;
        if (kjVar == null || kjVar.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.ic_ab_other, 0);
        dqVar.c(org.telegram.messenger.i0.L(16.0f));
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        if (org.telegram.messenger.w3.y(15, g())) {
            this.D0.e.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748152, null)), spannableStringBuilder, "%s"));
            return;
        }
        String L0 = org.telegram.messenger.cd.L0(2131750483, null);
        TLRPC.TL_forumTopic f7 = getMessagesController().r7.f(this.a, 1L);
        if (f7 != null) {
            L0 = f7.title;
        }
        this.D0.e.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NoTopicsDescriptionUser", null, 2131748151, L0)));
    }

    public final void Y0(boolean z10, boolean z11) {
        sa1 sa1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        org.telegram.messenger.x00 x00Var = this.s;
        long j10 = this.a;
        ArrayList l4 = x00Var.l(j10);
        if (l4 != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(-j10))) && this.u0) {
                arrayList.add(new hb1(3, null));
            }
            for (int i10 = 0; i10 < l4.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).id))) {
                    arrayList.add(new hb1(0, (TLRPC.TL_forumTopic) l4.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !x00Var.e(j10) && this.V0) {
                arrayList.add(new hb1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.y = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                hb1 hb1Var = (hb1) arrayList.get(i11);
                if (hb1Var != null && (tL_forumTopic = hb1Var.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            cb1 cb1Var = this.N;
            if (cb1Var != null) {
                if (cb1Var.getItemAnimator() != (z10 ? this.I0 : null)) {
                    this.N.setItemAnimator(z10 ? this.I0 : null);
                }
            }
            gb1 gb1Var = this.r;
            if (gb1Var != null) {
                gb1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (sa1Var = this.F) != null) {
                sa1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        D0();
        X0();
    }

    @Override // org.telegram.ui.Components.gg, org.telegram.ui.Components.s40
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        ay ayVar = this.M0;
        final int i10 = 0;
        this.d1 = (ayVar == null || !ayVar.W) ? 0 : org.telegram.messenger.i0.L(72.0f);
        ay ayVar2 = this.M0;
        this.e1 = (ayVar2 == null || !ayVar2.W) ? 0 : org.telegram.messenger.i0.L(64.0f);
        xa1 xa1Var = new xa1(this, context);
        this.d = xa1Var;
        this.fragmentView = xa1Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, xa1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!org.telegram.messenger.i0.Q1() || ((z4Var2 = this.parentLayout) != null && ((ActionBarLayout) z4Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setActionBarMenuOnItemClick(new bb1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ma1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (i10) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (!pb1Var.s0) {
                            pb1Var.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        pb1 pb1Var2 = this.b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ay ayVar3 = this.b.M0;
                        if (ayVar3 != null && (t0Var = ayVar3.j0) != null) {
                            t0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        pb1 pb1Var3 = this.b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        final int i12 = 3;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.outline_header_search);
            this.p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ma1
                public final /* synthetic */ pb1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (i12) {
                        case 0:
                            pb1 pb1Var = this.b;
                            if (!pb1Var.s0) {
                                pb1Var.K0(false);
                                break;
                            }
                            break;
                        case 1:
                            pb1 pb1Var2 = this.b;
                            pb1Var2.getMessagesController().h2(-pb1Var2.a, null, pb1Var2.g());
                            pb1Var2.R0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            ay ayVar3 = this.b.M0;
                            if (ayVar3 != null && (t0Var = ayVar3.j0) != null) {
                                t0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            pb1 pb1Var3 = this.b;
                            pb1Var3.presentFragment(la1.e0(pb1Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.t0 a10 = p5.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.N();
            a10.J(new ag.l3(this, 22));
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            org.telegram.ui.ActionBar.a7.V(searchField, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.a7.w(searchField, org.telegram.ui.ActionBar.t6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.t0 c10 = p5.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        this.q0.e(1, R.drawable.msg_discussion, org.telegram.messenger.cd.L0(2131744027, null));
        final int i13 = 2;
        this.R = this.q0.e(2, R.drawable.msg_addcontact, org.telegram.messenger.cd.L0(2131754401, null));
        org.telegram.ui.ActionBar.t0 t0Var = this.q0;
        this.T = t0Var.d(14, 0, new org.telegram.ui.Components.bi0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)), org.telegram.messenger.cd.L0(2131753585, null), true, false, t0Var.m0);
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, org.telegram.messenger.cd.L0(2131751703, null));
        this.U = this.q0.e(15, R.drawable.msg_report, org.telegram.messenger.cd.L0(2131746247, null));
        this.S = this.q0.d(11, R.drawable.msg_leave, null, org.telegram.messenger.cd.L0(2131749000, null), true, false, null);
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, this, false, this.resourceProvider);
        this.f = snVar;
        snVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        this.f.setOccupyStatusBar((!org.telegram.messenger.i0.Q1() || ((z4Var = this.parentLayout) != null && ((ActionBarLayout) z4Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.sn snVar2 = this.f;
        long j10 = -this.a;
        snVar2.b = j10 < 0;
        snVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, w7.b6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        int i14 = 4;
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new z7(this, i14));
        }
        this.N = new cb1(this, context);
        zg.h hVar = new zg.h(this.d);
        ViewGroup viewGroup = this.d;
        tg.b bVar = this.k1;
        bVar.f = hVar;
        bVar.g = viewGroup;
        cb1 cb1Var = this.N;
        ay ayVar3 = this.M0;
        if (ayVar3 != null) {
            viewGroup = (ViewGroup) ayVar3.getFragmentView();
        }
        cb1 cb1Var2 = this.N;
        Objects.requireNonNull(cb1Var2);
        this.l1 = new tg.j(cb1Var, viewGroup, new m50(cb1Var2, 2));
        this.N.D0(new na1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        gg.d c11 = gg.e.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131754719, null), spannableString, "#"), org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131754721, null), spannableString, "#"));
        this.x = kwVar;
        kwVar.b();
        int i15 = this.E ? 2 : 0;
        this.D = i15;
        this.x.X = i15 != 0;
        eb1 eb1Var = new eb1(this);
        this.N.setHideIfEmpty(false);
        eb1Var.m = false;
        eb1Var.C = false;
        cb1 cb1Var3 = this.N;
        this.I0 = eb1Var;
        cb1Var3.setItemAnimator(eb1Var);
        this.N.setOnScrollListener(new ta1(this, i11));
        cb1 cb1Var4 = this.N;
        cb1Var4.W1 = true;
        cb1Var4.X1 = 0;
        org.telegram.ui.Components.wj0 wj0Var = new org.telegram.ui.Components.wj0(cb1Var4, true);
        this.K0 = wj0Var;
        this.N.setItemsEnterAnimator(wj0Var);
        this.N.setOnItemClickListener(new kz0(this, 9));
        this.N.setOnItemLongClickListener(new oa1(this));
        this.N.setOnScrollListener(new ta1(this, i13));
        cb1 cb1Var5 = this.N;
        sa1 sa1Var = new sa1(this);
        this.F = sa1Var;
        cb1Var5.setLayoutManager(sa1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new ta1(this, i10));
        ob1 ob1Var = new ob1(this);
        this.P = ob1Var;
        ua1 ua1Var = new ua1(this, ob1Var);
        this.O = ua1Var;
        ua1Var.h(this.N);
        this.d.addView(this.N, w7.b6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -org.telegram.messenger.i0.L(100.0f);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(getParentActivity(), this.resourceProvider, false);
        this.h = f10Var;
        this.d.addView(f10Var, org.telegram.ui.Components.f10.b());
        final int i16 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ma1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (i16) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (!pb1Var.s0) {
                            pb1Var.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        pb1 pb1Var2 = this.b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ay ayVar32 = this.b.M0;
                        if (ayVar32 != null && (t0Var2 = ayVar32.j0) != null) {
                            t0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        pb1 pb1Var3 = this.b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.cd.L0(2131751703, null));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(24);
        zzVar.setVisibility(8);
        zzVar.x = true;
        ja1 ja1Var = new ja1(context, i11);
        TextView textView = new TextView(context);
        ja1Var.d = textView;
        if (org.telegram.messenger.cd.X) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131744285, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131744285, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, getResourceProvider());
        boolean z10 = org.telegram.messenger.cd.X;
        ja1Var.addView(textView, w7.b6.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = ja1Var;
        textView.setAlpha(0.0f);
        org.telegram.ui.Components.kj kjVar = new org.telegram.ui.Components.kj(this, context, zzVar);
        this.D0 = kjVar;
        try {
            kjVar.b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(org.telegram.messenger.cd.L0(2131748154, null));
        X0();
        this.n.addView(zzVar);
        this.n.addView(this.D0);
        this.d.addView(this.n);
        this.N.setEmptyView(this.n);
        this.o0 = new dg0(context, 15);
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(context);
        this.L = w51Var;
        this.o0.addView(w51Var);
        this.d.addView(this.o0, w7.b6.e(-1, 51, 80));
        this.L.setOnClickListener(new va1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(22.0f));
        this.n0.setVisibility(4);
        this.o0.addView(this.n0, w7.b6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
        ImageView imageView2 = this.W0;
        int i17 = org.telegram.ui.ActionBar.t6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.c(null, org.telegram.ui.ActionBar.j6.b(getThemedColor(i17))));
        org.telegram.ui.ActionBar.a7.t(this.W0, i17, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, w7.b6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ma1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (i11) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (!pb1Var.s0) {
                            pb1Var.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        pb1 pb1Var2 = this.b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ay ayVar32 = this.b.M0;
                        if (ayVar32 != null && (t0Var2 = ayVar32.j0) != null) {
                            t0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        pb1 pb1Var3 = this.b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.a, 0L));
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        R0(false);
        l0 l0Var = new l0(this, context, 28);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        }
        lb1 lb1Var = new lb1(this, context);
        this.r0 = lb1Var;
        lb1Var.setVisibility(8);
        this.e.addView(this.r0, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 44.0f, 0.0f, 0.0f));
        lb1 lb1Var2 = this.r0;
        int i18 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i18, lb1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.U0 = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
        vg.f c12 = bVar.c(this.U0, w7.b9.o(this.resourceProvider), false);
        org.telegram.messenger.z20.u(c12, org.telegram.messenger.i0.L(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new na1(this, i10));
        this.d.addView(this.U0, w7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            oh.e eVar = new oh.e(g10, this);
            this.R0 = eVar;
            this.U0.addView(eVar.b(), w7.b6.o(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            oh.e eVar2 = this.R0;
            eVar2.m = new oa1(this);
            TLRPC.ChatFull chatFull = this.J;
            eVar2.j = chatFull;
            if (chatFull != null) {
                eVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            y8 y8Var = new y8(this, context, this);
            this.G0 = y8Var;
            this.F0.addView(y8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.b6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = org.telegram.messenger.i0.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        B0();
        do0 do0Var = new do0(this, context, 6);
        this.P0 = do0Var;
        do0Var.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i18), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ma1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (i13) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (!pb1Var.s0) {
                            pb1Var.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        pb1 pb1Var2 = this.b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ay ayVar32 = this.b.M0;
                        if (ayVar32 != null && (t0Var2 = ayVar32.j0) != null) {
                            t0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        pb1 pb1Var3 = this.b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.a, 0L));
                        break;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && org.telegram.messenger.i0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) it.next();
                if (k2Var instanceof ay) {
                    ay ayVar4 = (ay) k2Var;
                    if (ayVar4.s4()) {
                        org.telegram.messenger.gs gsVar = ayVar4.p2;
                        if (gsVar.a == j10) {
                            this.Q0 = gsVar.b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Y0(false, false);
        }
        R0(false);
        S0();
        if (org.telegram.messenger.w3.R(g())) {
            getMessagesController().G0().a(j10, new s3(this, 25));
        }
        View view = this.fragmentView;
        oa1 oa1Var = new oa1(this);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(view, oa1Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = org.telegram.messenger.zs.T;
        long j10 = this.a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j10) {
                R0(false);
                oh.e eVar = this.R0;
                if (eVar != null) {
                    eVar.j = chatFull2;
                    eVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                C0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == org.telegram.messenger.zs.v5) {
            R0(false);
        } else if (i10 == org.telegram.messenger.zs.p3) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == org.telegram.messenger.zs.q5) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                Y0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    B0();
                }
                D0();
            }
        } else if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.vp.D8;
            if (intValue == 8192) {
                R0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().r7.y(j10, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                Y0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.s) {
            Y0(false, false);
        } else if (i10 == org.telegram.messenger.zs.w2) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().f1(l4.longValue(), false, null);
                y8 y8Var = this.G0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
                }
                C0(false);
            }
        } else if (i10 == org.telegram.messenger.zs.f0) {
            Y0(false, false);
            R0(true);
        } else if (i10 != org.telegram.messenger.zs.r5 && i10 == org.telegram.messenger.zs.t) {
            removeSelfFromStack(true);
        }
        if (i10 == org.telegram.messenger.zs.h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.i0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j10) || booleanValue) {
                if (this.Q0 != 0) {
                    this.Q0 = 0L;
                    Y0(false, false);
                    return;
                }
                return;
            }
            if (this.Q0 != longValue2) {
                this.Q0 = longValue2;
                Y0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.gg
    public final TLRPC.Chat g() {
        return getMessagesController().L0(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.gg
    public final org.telegram.messenger.u3 getGroupCall() {
        org.telegram.messenger.u3 u3Var = this.H0;
        if (u3Var == null || !(u3Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return u3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        lb1 lb1Var = this.r0;
        if (lb1Var != null && lb1Var.W != null) {
            int i10 = org.telegram.ui.Cells.z3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.t6.d6 : org.telegram.ui.ActionBar.t6.s8);
        if (this.actionBar.u()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.w8);
        }
        return i0.b.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ TLRPC.User j() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.y(this.p0.T(false));
            }
        } else if (z10) {
            F0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.a;
        messagesController.T2(0, j10, true);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.v5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.p3);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.q5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.s);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.w2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.t);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.h0);
        Y0(false, false);
        i31.t(this.currentAccount);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (org.telegram.messenger.w3.T(L0)) {
            getMessagesController().S4(L0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = q1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().i1(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        this.O0.e();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.v5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.p3);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.q5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.s);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.w2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.t);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.h0);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.a));
        if (org.telegram.messenger.w3.T(L0)) {
            getMessagesController().S4(L0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        ay ayVar = this.M0;
        if (ayVar == null || ayVar.F3 == null) {
            return;
        }
        ayVar.getActionBar().setSearchAvatarImageView(null);
        this.M0.F3.M = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().r7.f;
        long j10 = this.a;
        int i10 = longSparseIntArray.get(j10, 0) - 1;
        longSparseIntArray.put(j10, i10 >= 0 ? i10 : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.x00 x00Var = getMessagesController().r7;
        LongSparseIntArray longSparseIntArray = x00Var.f;
        long j10 = this.a;
        longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
        x00Var.y(j10, true);
        this.G = false;
        org.telegram.messenger.i0.a4(this.N);
        this.G = true;
        setBulletinDelegate(new z8(this, 9));
        if (!this.inPreviewMode || getMessagesController().s2(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onSlideProgress(boolean z10, float f7) {
        if (org.telegram.messenger.tz.o() != 0 && this.T0) {
            O0(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        hi.c cVar = this.j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.j6.b(getThemedColor(org.telegram.ui.ActionBar.t6.Re))) != this.p1) {
            this.p1 = b10;
            org.telegram.ui.ActionBar.t6.H1(this.W0.getBackground(), b10, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.F(getThemedColor(org.telegram.ui.ActionBar.t6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.t6.I5), true);
        }
        do0 do0Var = this.P0;
        if (do0Var != null && (do0Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.d6), 100));
        }
        S0();
        try {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            }
            kw kwVar = this.x;
            if (kwVar != null) {
                kwVar.i();
            }
            if (this.actionBar != null && this.b1) {
                W0();
            }
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.p0;
            if (t0Var == null || t0Var.getSearchField() == null) {
                return;
            }
            this.p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        xw xwVar;
        do0 do0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (do0Var = this.P0) != null) {
            if (do0Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            C0(false);
        }
        this.O0.e();
        if (z10) {
            return;
        }
        if (this.t0 && this.H) {
            removeSelfFromStack();
            ay ayVar = this.L0;
            if (ayVar != null) {
                ayVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.I) {
            removeSelfFromStack();
            ay ayVar2 = this.M0;
            if (ayVar2 == null || (xwVar = ayVar2.F3) == null || !xwVar.c()) {
                return;
            }
            this.M0.F3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        do0 do0Var = this.P0;
        if (do0Var == null || do0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.P0.setAlpha(1.0f - f7);
        } else {
            this.P0.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.d();
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            N0(true);
        } else {
            this.T0 = false;
            N0(false);
            O0(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.gg
    public final org.telegram.ui.Components.sn q() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.sn snVar = this.f;
        if (snVar != null) {
            snVar.setAlpha(f7);
            this.q0.setAlpha(f7);
            org.telegram.ui.ActionBar.t0 t0Var = this.p0;
            if (t0Var != null) {
                t0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.sn snVar = this.f;
        if (snVar != null) {
            snVar.setAlpha(f7);
            this.f.setTranslationX((1.0f - f7) * org.telegram.messenger.i0.L(40.0f));
        }
    }

    @Override // org.telegram.ui.of0
    public final void u() {
        this.N.y0(0);
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.gg
    public final /* synthetic */ void k(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
