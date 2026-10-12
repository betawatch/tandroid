package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class lg1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ch, jh0 {
    public static final HashSet n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public bi.p6 D0;
    public boolean E;
    public zf1 E0;
    public nf1 F;
    public FrameLayout F0;
    public boolean G;
    public b9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public yf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.rl0 K0;
    public org.telegram.ui.Components.i71 L;
    public yy L0;
    public int M;
    public yy M0;
    public wf1 N;
    public boolean N0;
    public pf1 O;
    public final AnimationNotificationsLocker O0;
    public kg1 P;
    public x50 P0;
    public org.telegram.ui.ActionBar.e1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.e1 R;
    public xh.d R0;
    public org.telegram.ui.ActionBar.e1 S;
    public float S0;
    public org.telegram.ui.ActionBar.e1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.e1 U;
    public org.telegram.ui.Components.xs U0;
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
    public org.telegram.ui.Components.j91 a1;
    public final ArrayList b;
    public boolean b0;
    public View b1;
    public int c;
    public NumberTextView c0;
    public int c1;
    public sf1 d;
    public org.telegram.ui.ActionBar.u0 d0;
    public int d1;
    public l0 e;
    public org.telegram.ui.ActionBar.u0 e0;
    public int e1;
    public org.telegram.ui.Components.ro f;
    public org.telegram.ui.ActionBar.u0 f0;
    public final bh.f f1;
    public org.telegram.ui.ActionBar.u0 g0;
    public final gh.d g1;
    public org.telegram.ui.Components.l20 h;
    public org.telegram.ui.ActionBar.u0 h0;
    public final gh.d h1;
    public org.telegram.ui.ActionBar.u0 i0;
    public final bh.b i1;
    public org.telegram.ui.ActionBar.e1 j0;
    public bh.l j1;
    public org.telegram.ui.ActionBar.e1 k0;
    public final ArrayList k1;
    public org.telegram.ui.ActionBar.e1 l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final RectF m1;
    public bg1 n;
    public RadialProgressView n0;
    public d61 o0;
    public org.telegram.ui.ActionBar.u0 p0;
    public org.telegram.ui.ActionBar.u0 q0;
    public final ag1 r;
    public hg1 r0;
    public final TopicsController s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public mg1 v;
    public final boolean v0;
    public ex w;
    public final boolean w0;
    public int x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public lg1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new ag1(this);
        this.x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.a = j10;
        this.t0 = this.arguments.getBoolean("for_select", false);
        this.u0 = this.arguments.getBoolean("forward_to", false);
        this.x0 = this.arguments.getBoolean("bot_share_to", false);
        this.v0 = this.arguments.getBoolean("quote", false);
        this.w0 = this.arguments.getBoolean("reply_to", false);
        this.y0 = this.arguments.getString("voicechat", null);
        this.z0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.q.x("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.f1 = null;
            this.g1 = null;
            this.h1 = null;
            this.i1 = new bh.b(cVar);
            return;
        }
        this.f1 = new bh.f(false);
        this.g1 = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.h1 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.i1 = bVar;
        bVar.i = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.m2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new fo(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new fo(bundle);
            }
        }
        return new lg1(bundle);
    }

    public static org.telegram.ui.ActionBar.m2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.lg1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I0(fo foVar) {
        if (foVar.getParentLayout() == null) {
            return;
        }
        if (foVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) foVar.getParentLayout().getFragmentStack().get(foVar.getParentLayout().getFragmentStack().size() - 2);
            if (m2Var instanceof lg1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -foVar.a());
        ((ActionBarLayout) foVar.getParentLayout()).c(foVar.getParentLayout().getFragmentStack().size() - 1, new lg1(bundle));
        foVar.ja = true;
        foVar.finishFragment();
    }

    public static boolean U(lg1 lg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(lg1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-lg1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = lg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(lg1Var.g());
        int i10 = org.telegram.ui.Components.g90.r;
        org.telegram.ui.Components.g90.y(parentActivity, lg1Var, org.telegram.ui.Components.zc.a0(lg1Var), isChannelAndNotMegaGroup);
        lg1Var.O0(true);
        return false;
    }

    public static void V(lg1 lg1Var, View view) {
        long j10 = lg1Var.a;
        if (lg1Var.getParentLayout() == null || ((ActionBarLayout) lg1Var.getParentLayout()).y() || !(view instanceof ig1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ig1) view).N;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : lg1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (lg1Var.t0) {
            mg1 mg1Var = lg1Var.v;
            if (mg1Var != null) {
                og1 og1Var = mg1Var.a;
                Bundle bundle = new Bundle();
                rg1 rg1Var = og1Var.a;
                bundle.putLong("dialog_id", rg1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                c21 c21Var = new c21(bundle, null);
                c21Var.r = new cs0(21, og1Var, tL_forumTopic);
                rg1Var.presentFragment(c21Var);
            }
            yy yyVar = lg1Var.L0;
            if (yyVar != null) {
                yyVar.L3(j11, peerDialogId, true, lg1Var);
                return;
            }
            return;
        }
        if (lg1Var.a0.size() > 0) {
            lg1Var.N0(view);
            return;
        }
        if (lg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.m2 m2Var : lg1Var.getParentLayout().getFragmentStack()) {
                if (m2Var instanceof yy) {
                    yy yyVar2 = (yy) m2Var;
                    if (yyVar2.e4()) {
                        MessagesStorage.TopicKey topicKey = yyVar2.p2;
                        if (topicKey.dialogId == j11 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            lg1Var.Q0 = peerDialogId;
            lg1Var.U0(false, false);
        }
        og.d.m(lg1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean W(lg1 lg1Var, View view, float f7) {
        if (lg1Var.t0 || lg1Var.getParentLayout() == null || ((ActionBarLayout) lg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!lg1Var.actionBar.t() && !AndroidUtilities.isTablet() && (view instanceof ig1)) {
            ig1 ig1Var = (ig1) view;
            if (ig1Var.S(f7)) {
                lg1Var.M0(ig1Var);
                lg1Var.N.I0(true);
                lg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        lg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(lg1 lg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = lg1Var.N;
            } else {
                hg1 hg1Var = lg1Var.r0;
                viewGroup = hg1Var != null ? hg1Var.U : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) childAt).v(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                        ((org.telegram.ui.Cells.xa) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = lg1Var.actionBar;
        if (kVar != null) {
            kVar.E(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            lg1Var.actionBar.F(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            lg1Var.actionBar.F(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            lg1Var.actionBar.G(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
        }
        x50 x50Var = lg1Var.P0;
        if (x50Var != null) {
            x50Var.setForeground(new ColorDrawable(i0.a.k(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6), 100)));
        }
        lg1Var.P0();
    }

    public static void b0(lg1 lg1Var, boolean z10) {
        sx sxVar;
        lg1Var.s0 = z10;
        ValueAnimator valueAnimator = lg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            lg1Var.Y0.cancel();
        }
        int i10 = 0;
        if (lg1Var.a1 == null) {
            org.telegram.ui.Components.j91 n10 = lg1Var.r0.n(8, false);
            lg1Var.a1 = n10;
            if (lg1Var.M0 != null) {
                n10.setBackgroundColor(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            }
            lg1Var.e.addView(lg1Var.a1, w7.a6.d(44.0f, -1));
        }
        lg1Var.Y0 = ValueAnimator.ofFloat(lg1Var.W, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(lg1Var.r0, false, 1.0f, true);
        yy yyVar = lg1Var.M0;
        if (yyVar != null && (sxVar = yyVar.F3) != null) {
            sxVar.M = !z10;
        }
        lg1Var.Z0 = !z10 && lg1Var.r0.getVisibility() == 0 && lg1Var.r0.getAlpha() == 1.0f;
        lg1Var.Y0.addUpdateListener(new f21(lg1Var, 17));
        lg1Var.r0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(lg1Var.getParentActivity(), lg1Var.classGuid);
            lg1Var.Q0(false);
        } else {
            lg1Var.q0.setVisibility(0);
        }
        lg1Var.Y0.addListener(new uf1(lg1Var, z10, i10));
        lg1Var.Y0.setDuration(200L);
        lg1Var.Y0.setInterpolator(org.telegram.ui.Components.es.f);
        lg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.ch
    public final org.telegram.ui.Components.ow0 A() {
        return this.d;
    }

    public final void A0() {
        this.J0 = this.s.isLoading(this.a);
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((cg1) arrayList.get(0)).c != null && ((cg1) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        wf1 wf1Var = this.N;
        if (wf1Var != null) {
            wf1Var.K0(wf1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        yy yyVar = this.M0;
        if (yyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.xs xsVar = yyVar.J1;
            float c10 = (xsVar != null ? xsVar.c(dp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.xs xsVar2 = this.U0;
            if (xsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.xs xsVar3 = this.M0.J1;
                xsVar2.setTranslationY(c10 - ((xsVar3 != null ? xsVar3.getMetadata().c.a : 0.0f) * dp2));
                org.telegram.ui.Components.xs xsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                r2 = xsVar4.c(AndroidUtilities.lerp(dp3, dp4, this.M0.J1 != null ? r5.getMetadata().c.a : 0.0f)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.xs xsVar5 = this.U0;
            if (xsVar5 != null) {
                r2 = 0.0f + xsVar5.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.N.setPadding(0, (int) r2, 0, this.e1 + this.c1 + (this.V ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void C0() {
        this.a0.clear();
        this.actionBar.s();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ul0(12));
        a2Var.show();
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ boolean G() {
        return false;
    }

    public final void G0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    public final void H0(boolean z10) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        profileActivity.N4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ long I() {
        return 0L;
    }

    public final void J0(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.L.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.g6.Ae : org.telegram.ui.ActionBar.g6.q7);
            this.W0.setVisibility(i10 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        sf1 sf1Var = this.d;
        if (sf1Var != null) {
            if (z10) {
                sf1Var.setLayerType(2, null);
                sf1Var.setClipChildren(false);
                sf1Var.setClipToPadding(false);
            } else {
                sf1Var.setLayerType(0, null);
                sf1Var.setClipChildren(true);
                sf1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.S0 = f7;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        wf1 wf1Var = this.N;
        if (wf1Var != null) {
            float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
            wf1Var.setPivotX(0.0f);
            wf1Var.setPivotY(0.0f);
            wf1Var.setScaleX(D);
            wf1Var.setScaleY(D);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(D);
            this.actionBar.setScaleY(D);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void M0(org.telegram.ui.Cells.s2 s2Var) {
        final int i10 = 0;
        try {
            s2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = s2Var.N;
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new rf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(cpVar.f);
        cpVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        cpVar.d(j11, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lf1
                public final /* synthetic */ lg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            lg1 lg1Var = this.b;
                            lg1Var.C0 = true;
                            lg1Var.N0 = true;
                            lg1Var.s.pinTopic(lg1Var.a, tL_forumTopic.id, !r0.pinned, lg1Var);
                            lg1Var.finishPreviewFragment();
                            break;
                        case 1:
                            lg1 lg1Var2 = this.b;
                            lg1Var2.N0 = true;
                            TopicsController topicsController = lg1Var2.s;
                            long j12 = lg1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            lg1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            lg1 lg1Var3 = this.b;
                            lg1Var3.D0(hashSet, new jf1(lg1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.id)) {
            e1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new bi.f7(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(e1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                e1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                e1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            e1Var3.setMinimumWidth(160);
            e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lf1
                public final /* synthetic */ lg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            lg1 lg1Var = this.b;
                            lg1Var.C0 = true;
                            lg1Var.N0 = true;
                            lg1Var.s.pinTopic(lg1Var.a, tL_forumTopic.id, !r0.pinned, lg1Var);
                            lg1Var.finishPreviewFragment();
                            break;
                        case 1:
                            lg1 lg1Var2 = this.b;
                            lg1Var2.N0 = true;
                            TopicsController topicsController = lg1Var2.s;
                            long j12 = lg1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            lg1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            lg1 lg1Var3 = this.b;
                            lg1Var3.D0(hashSet, new jf1(lg1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.p7));
            e1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
            e1Var4.setMinimumWidth(160);
            final int i12 = 2;
            e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lf1
                public final /* synthetic */ lg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            lg1 lg1Var = this.b;
                            lg1Var.C0 = true;
                            lg1Var.N0 = true;
                            lg1Var.s.pinTopic(lg1Var.a, tL_forumTopic.id, !r0.pinned, lg1Var);
                            lg1Var.finishPreviewFragment();
                            break;
                        case 1:
                            lg1 lg1Var2 = this.b;
                            lg1Var2.N0 = true;
                            TopicsController topicsController = lg1Var2.s;
                            long j12 = lg1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            lg1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            lg1 lg1Var3 = this.b;
                            lg1Var3.D0(hashSet, new jf1(lg1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.a6.d(-1.0f, -1));
        }
        fo foVar = new fo(t8.b.e(j10, "chat_id"));
        og.d.a(foVar, MessagesStorage.TopicKey.of(j11, isMonoForum ? DialogObject.getPeerDialogId(s2Var.N.from_id) : s2Var.N.id));
        presentFragmentAsPreviewWithMenu(foVar, r32[0]);
    }

    public final void N0(View view) {
        ig1 ig1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        if (!(view instanceof ig1) || (tL_forumTopic = (ig1Var = (ig1) view).N) == null) {
            return;
        }
        int i11 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i11);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i11));
        }
        ig1Var.V(hashSet.contains(Integer.valueOf(i11)), true);
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.s();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.y j11 = this.actionBar.j(null);
            if (this.inPreviewMode) {
                j11.setBackgroundColor(0);
                j11.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(j11.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(AndroidUtilities.bold());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
            j11.addView(this.c0, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new mf1(0));
            this.d0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.e0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.f0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.g0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.u0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.u0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.i0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.u0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.m0 = h11;
            this.j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            topicsController = this.s;
            if (!hasNext) {
                break;
            }
            HashSet hashSet2 = hashSet;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
            if (findTopic != null) {
                if (findTopic.unread_count != 0) {
                    i12++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i15++;
                    } else {
                        i14++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, intValue)) {
                i13++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i12 > 0) {
            this.j0.setVisibility(0);
            this.j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            i10 = 8;
        } else {
            i10 = 8;
            this.j0.setVisibility(8);
        }
        if (i13 != 0) {
            this.B0 = false;
            this.f0.setIcon(R.drawable.msg_unmute);
            this.f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            z10 = true;
        } else {
            z10 = true;
            this.B0 = true;
            this.f0.setIcon(R.drawable.msg_mute);
            this.f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
        }
        this.d0.setVisibility((i14 == z10 && i15 == 0) ? 0 : i10);
        this.e0.setVisibility((i15 == z10 && i14 == 0) ? 0 : i10);
        this.c0.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i18++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i20++;
                        } else {
                            i19++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i16++;
                        } else {
                            i17++;
                        }
                    }
                }
            }
        }
        this.k0.setVisibility((i16 != 0 || i17 <= 0) ? i10 : 0);
        this.k0.setText(LocaleController.getString(i17 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.l0.setVisibility((i17 != 0 || i16 <= 0) ? i10 : 0);
        this.l0.setText(LocaleController.getString(i16 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.g0.setVisibility(i18 == hashSet3.size() ? 0 : i10);
        this.h0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.i0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.m0.l();
        R0();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        long j10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        String string;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j11 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j11));
        long j12 = -j11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j12));
        if (UserObject.isBotForum(user)) {
            this.f.setUserAvatar(user);
        } else if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                this.f.setChatAvatar(chat2);
            }
        } else {
            this.f.setChatAvatar(chat);
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j12);
        boolean z14 = notificationsSettings.getInt(sb2.toString(), 0) == 2;
        boolean x10 = org.telegram.messenger.q.x("dialog_bar_report", j12, notificationsSettings, false);
        boolean x11 = org.telegram.messenger.q.x("dialog_bar_block", j12, notificationsSettings, false);
        boolean z15 = this.t0;
        if (z15) {
            j10 = 0;
            if (this.w0) {
                this.f.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.v0) {
                this.f.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (this.x0) {
                this.f.setTitle(LocaleController.getString(R.string.BotShareToTopic));
            } else if (this.u0) {
                this.f.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else {
                this.f.setTitle(LocaleController.getString(R.string.SelectTopic));
            }
            this.p0.setVisibility(8);
            org.telegram.ui.Components.ro roVar = this.f;
            if (roVar != null && roVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.p0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            i10 = 8;
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.f.setTitle(chat.title);
                this.f.j(null, getMessagesController().isDialogMuted(j12, 0L) ? getThemedDrawable("drawableMuteIcon") : null);
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
            if (chatFull2 != null && (chatFull = this.J) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.J = chatFull2;
            if (chatFull2 != null) {
                int i11 = chatFull2.participants_count;
                if (i11 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    string = chat3 == null ? LocaleController.getString(R.string.Loading) : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    j10 = 0;
                } else {
                    j10 = 0;
                    string = LocaleController.formatPluralString("Members", i11, new Object[0]);
                }
            } else {
                j10 = 0;
                string = LocaleController.getString(R.string.Loading);
            }
            this.f.setSubtitle(string);
            i10 = 8;
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j13 = MessagesController.getNotificationsSettings(this.currentAccount).getLong(a1.g.o(j12, "dialog_join_requested_time_"), -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j13 > j10 && System.currentTimeMillis() - j13 < 120000) {
            this.L.a(LocaleController.getString(R.string.ChannelJoinRequestSent), z16);
            this.L.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, false, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, true, 0.5f, z16);
            J0(0);
        } else if (chat != null && !z15 && (ChatObject.isNotInChat(chat) || getMessagesController().isJoiningChannel(chat.id))) {
            if (getMessagesController().isJoiningChannel(chat.id)) {
                z13 = true;
                z12 = true;
            } else {
                if (chat.join_request) {
                    this.L.setText(LocaleController.getString(R.string.ChannelJoinRequest));
                } else {
                    this.L.setText(LocaleController.getString(R.string.ChannelJoin));
                }
                z12 = true;
                this.L.setClickable(true);
                this.L.setEnabled(true);
                z13 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, z13, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, z13 ^ z12, 0.5f, z16);
            J0(0);
        } else {
            if (!z14 || (!x11 && !x10)) {
                z11 = false;
                if (this.V != z11) {
                    this.V = z11;
                    this.o0.animate().setListener(null).cancel();
                    if (z16) {
                        this.o0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new uf1(this, z11, 1));
                    } else {
                        this.o0.setVisibility(z11 ? 0 : i10);
                        this.o0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                B0();
                this.q0.setVisibility(!z15 ? i10 : 0);
                this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : i10);
                this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? i10 : 0);
                this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? i10 : 0);
                this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? i10 : 0);
                Q0(true);
                this.H0 = getMessagesController().getGroupCall(j11, true);
                z0(false);
            }
            this.L.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
            this.L.setClickable(true);
            this.L.setEnabled(true);
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, false, 0.5f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, true, 0.5f, false);
            J0(1);
        }
        z11 = true;
        if (this.V != z11) {
        }
        B0();
        this.q0.setVisibility(!z15 ? i10 : 0);
        this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : i10);
        this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? i10 : 0);
        this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? i10 : 0);
        this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? i10 : 0);
        Q0(true);
        this.H0 = getMessagesController().getGroupCall(j11, true);
        z0(false);
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ae));
        this.h.g();
        d61 d61Var = this.o0;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        d61Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.s8));
        }
        this.r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        boolean z11 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j10))) || this.s0 || this.t0 || this.J0) ? false : true;
        this.K = z11;
        this.Q.setVisibility(z11 ? 0 : 8);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10 = ChatObject.canManageTopics(g()) && !this.a0.isEmpty();
        if (this.b0 != z10) {
            this.b0 = z10;
            ag1 ag1Var = this.r;
            ag1Var.q(0, ag1Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.m2, org.telegram.ui.jh0
    public final /* synthetic */ boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.y8;
        kVar.D(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.g6.t8), getThemedColor(org.telegram.ui.ActionBar.g6.z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.g6.s8), getThemedColor(org.telegram.ui.ActionBar.g6.d6)));
        }
        float f10 = 1.0f - f7;
        this.f.getTitleTextView().setAlpha(f10);
        this.f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.j91 j91Var = this.a1;
        if (j91Var != null) {
            j91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.a1.setAlpha(f7);
        }
        this.r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(y3);
            this.N.setScaleY(y3);
        }
    }

    public final void T0() {
        bi.p6 p6Var = this.D0;
        if (p6Var == null || p6Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.ic_ab_other, 0);
        brVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 0);
        if (ChatObject.canUserDoAdminAction(g(), 15)) {
            this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.a, 1L);
        if (findTopic != null) {
            string = findTopic.title;
        }
        this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    public final void U0(boolean z10, boolean z11) {
        nf1 nf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.u0) {
                arrayList.add(new cg1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList.add(new cg1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new cg1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                cg1 cg1Var = (cg1) arrayList.get(i11);
                if (cg1Var != null && (tL_forumTopic = cg1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            wf1 wf1Var = this.N;
            if (wf1Var != null) {
                if (wf1Var.getItemAnimator() != (z10 ? this.I0 : null)) {
                    this.N.setItemAnimator(z10 ? this.I0 : null);
                }
            }
            ag1 ag1Var = this.r;
            if (ag1Var != null) {
                ag1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (nf1Var = this.F) != null) {
                nf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override // org.telegram.ui.Components.ch, org.telegram.ui.Components.b60
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        yy yyVar = this.M0;
        final int i10 = 0;
        this.c1 = (yyVar == null || !yyVar.W) ? 0 : AndroidUtilities.dp(72.0f);
        yy yyVar2 = this.M0;
        this.d1 = (yyVar2 == null || !yyVar2.W) ? 0 : AndroidUtilities.dp(64.0f);
        sf1 sf1Var = new sf1(this, context);
        this.d = sf1Var;
        this.fragmentView = sf1Var;
        sf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.d.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new vf1(this, context));
        final int i12 = 2;
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ lg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (i12) {
                    case 0:
                        lg1 lg1Var = this.b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.a, 0L));
                        break;
                    case 1:
                        lg1 lg1Var2 = this.b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        break;
                    case 2:
                        lg1 lg1Var3 = this.b;
                        if (!lg1Var3.s0) {
                            lg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        yy yyVar3 = this.b.M0;
                        if (yyVar3 != null && (u0Var = yyVar3.j0) != null) {
                            u0Var.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        final int i13 = 4;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
                public final /* synthetic */ lg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i13) {
                        case 0:
                            lg1 lg1Var = this.b;
                            lg1Var.presentFragment(hf1.a0(lg1Var.a, 0L));
                            break;
                        case 1:
                            lg1 lg1Var2 = this.b;
                            lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.a, null, lg1Var2.g());
                            lg1Var2.O0(false);
                            break;
                        case 2:
                            lg1 lg1Var3 = this.b;
                            if (!lg1Var3.s0) {
                                lg1Var3.H0(false);
                                break;
                            }
                            break;
                        case 3:
                            this.b.finishPreviewFragment();
                            break;
                        default:
                            yy yyVar3 = this.b.M0;
                            if (yyVar3 != null && (u0Var = yyVar3.j0) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.F();
            a10.H = new ig.d2(this, 18);
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.g6.Wd));
        }
        org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.yj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        int i14 = 3;
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        int i15 = 11;
        this.S = this.q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(context, this, false, this.resourceProvider);
        this.f = roVar;
        roVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        org.telegram.ui.Components.ro roVar2 = this.f;
        long j10 = -this.a;
        roVar2.b = j10 < 0;
        roVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, w7.a6.a(-1.0f, 56.0f, 0.0f, 86.0f, 0.0f, -2, 51));
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new c8(this, i14));
        }
        this.N = new wf1(this, context);
        ih.j jVar = new ih.j(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.i1;
        bVar.f = jVar;
        bVar.g = viewGroup;
        wf1 wf1Var = this.N;
        yy yyVar3 = this.M0;
        if (yyVar3 != null) {
            viewGroup = (ViewGroup) yyVar3.getFragmentView();
        }
        wf1 wf1Var2 = this.N;
        Objects.requireNonNull(wf1Var2);
        this.j1 = new bh.l(wf1Var, viewGroup, new y8(wf1Var2, i12));
        this.N.C0(new jf1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        ex exVar = new ex(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = exVar;
        exVar.b();
        int i16 = this.E ? 2 : 0;
        this.y = i16;
        this.w.X = i16 != 0;
        yf1 yf1Var = new yf1(this);
        this.N.setHideIfEmpty(false);
        yf1Var.m = false;
        yf1Var.C = false;
        wf1 wf1Var3 = this.N;
        this.I0 = yf1Var;
        wf1Var3.setItemAnimator(yf1Var);
        this.N.setOnScrollListener(new of1(this, i11));
        wf1 wf1Var4 = this.N;
        wf1Var4.W1 = true;
        wf1Var4.X1 = 0;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(wf1Var4, true);
        this.K0 = rl0Var;
        this.N.setItemsEnterAnimator(rl0Var);
        this.N.setOnItemClickListener(new i21(this, i15));
        this.N.setOnItemLongClickListener(new kf1(this));
        this.N.setOnScrollListener(new of1(this, i12));
        wf1 wf1Var5 = this.N;
        nf1 nf1Var = new nf1(this);
        this.F = nf1Var;
        wf1Var5.setLayoutManager(nf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new of1(this, i10));
        kg1 kg1Var = new kg1(this);
        this.P = kg1Var;
        pf1 pf1Var = new pf1(this, kg1Var);
        this.O = pf1Var;
        pf1Var.d(this.N);
        this.d.addView(this.N, w7.a6.d(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(getParentActivity(), this.resourceProvider, false);
        this.h = l20Var;
        this.d.addView(l20Var, org.telegram.ui.Components.l20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ lg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i10) {
                    case 0:
                        lg1 lg1Var = this.b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.a, 0L));
                        break;
                    case 1:
                        lg1 lg1Var2 = this.b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        break;
                    case 2:
                        lg1 lg1Var3 = this.b;
                        if (!lg1Var3.s0) {
                            lg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        yy yyVar32 = this.b.M0;
                        if (yyVar32 != null && (u0Var2 = yyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(24);
        f10Var.setVisibility(8);
        f10Var.w = true;
        bg1 bg1Var = new bg1(context);
        TextView textView = new TextView(context);
        bg1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y6));
        boolean z10 = LocaleController.isRTL;
        bg1Var.addView(textView, w7.a6.a(-2.0f, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f, -2, 81));
        this.n = bg1Var;
        textView.setAlpha(0.0f);
        bi.p6 p6Var = new bi.p6(this, context, f10Var);
        this.D0 = p6Var;
        try {
            p6Var.b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.n.addView(f10Var);
        this.n.addView(this.D0);
        this.d.addView(this.n);
        this.N.setEmptyView(this.n);
        this.o0 = new d61(context, 6);
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context);
        this.L = i71Var;
        this.o0.addView(i71Var);
        this.d.addView(this.o0, w7.a6.e(-1, 51, 80));
        this.L.setOnClickListener(new qf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.n0.setVisibility(4);
        this.o0.addView(this.n0, w7.a6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i17 = org.telegram.ui.ActionBar.g6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(getThemedColor(i17))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, w7.a6.a(36.0f, 0.0f, 6.0f, 2.0f, 0.0f, 36, 53));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ lg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i11) {
                    case 0:
                        lg1 lg1Var = this.b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.a, 0L));
                        break;
                    case 1:
                        lg1 lg1Var2 = this.b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        break;
                    case 2:
                        lg1 lg1Var3 = this.b;
                        if (!lg1Var3.s0) {
                            lg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        yy yyVar32 = this.b.M0;
                        if (yyVar32 != null && (u0Var2 = yyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        l0 l0Var = new l0(this, context, 25);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.a6.e(-1, -1, 119));
        }
        hg1 hg1Var = new hg1(this, context);
        this.r0 = hg1Var;
        hg1Var.setVisibility(8);
        this.e.addView(this.r0, w7.a6.a(-1.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 119));
        hg1 hg1Var2 = this.r0;
        int i18 = org.telegram.ui.ActionBar.g6.d6;
        hg1Var2.setBackgroundColor(getThemedColor(i18));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.xs xsVar = new org.telegram.ui.Components.xs(context);
        this.U0 = xsVar;
        xsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.b.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new jf1(this, i10));
        this.d.addView(this.U0, w7.a6.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.a6.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            xh.d dVar2 = this.R0;
            dVar2.m = new kf1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.j = chatFull;
            if (chatFull != null) {
                dVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            b9 b9Var = new b9(this, context, this);
            this.G0 = b9Var;
            this.F0.addView(b9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams d = w7.a6.d(-2.0f, -1);
        if (this.inPreviewMode) {
            d.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, d);
        }
        y0();
        x50 x50Var = new x50(this, context, 10);
        this.P0 = x50Var;
        x50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i18), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        final int i19 = 3;
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ lg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i19) {
                    case 0:
                        lg1 lg1Var = this.b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.a, 0L));
                        break;
                    case 1:
                        lg1 lg1Var2 = this.b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        break;
                    case 2:
                        lg1 lg1Var3 = this.b;
                        if (!lg1Var3.s0) {
                            lg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        yy yyVar32 = this.b.M0;
                        if (yyVar32 != null && (u0Var2 = yyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) it.next();
                if (m2Var instanceof yy) {
                    yy yyVar4 = (yy) m2Var;
                    if (yyVar4.e4()) {
                        MessagesStorage.TopicKey topicKey = yyVar4.p2;
                        if (topicKey.dialogId == j10) {
                            this.Q0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            U0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new v3(this, 26));
        }
        View view = this.fragmentView;
        kf1 kf1Var = new kf1(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.i(view, kf1Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j10) {
                O0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                b9 b9Var = this.G0;
                if (b9Var != null) {
                    b9Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j10) || booleanValue) {
                if (this.Q0 != 0) {
                    this.Q0 = 0L;
                    U0(false, false);
                    return;
                }
                return;
            }
            if (this.Q0 != longValue2) {
                this.Q0 = longValue2;
                U0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.ch
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.ch
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.H0;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.mm0 mm0Var;
        cz0 cz0Var = new cz0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        hg1 hg1Var = this.r0;
        if (hg1Var != null && (mm0Var = hg1Var.U) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, mm0Var);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.g6.d6 : org.telegram.ui.ActionBar.g6.s8);
        if (this.actionBar.t()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.w8);
        }
        return i0.a.f(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.ch
    public final org.telegram.ui.Components.ro o() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.w(this.p0.L(false));
            }
        } else if (z10) {
            C0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        messagesController.loadFullChat(j10, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        U0(false, false);
        r71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        this.O0.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        yy yyVar = this.M0;
        if (yyVar == null || yyVar.F3 == null) {
            return;
        }
        yyVar.getActionBar().setSearchAvatarImageView(null);
        this.M0.F3.M = true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.a);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.a;
        topicsController.onTopicFragmentResume(j10);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new c9(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            L0(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        sx sxVar;
        x50 x50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (x50Var = this.P0) != null) {
            if (x50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (z10) {
            return;
        }
        if (this.t0 && this.H) {
            removeSelfFromStack();
            yy yyVar = this.L0;
            if (yyVar != null) {
                yyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.I) {
            removeSelfFromStack();
            yy yyVar2 = this.M0;
            if (yyVar2 == null || (sxVar = yyVar2.F3) == null || !sxVar.c()) {
                return;
            }
            this.M0.F3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        x50 x50Var = this.P0;
        if (x50Var == null || x50Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.P0.setAlpha(1.0f - f7);
        } else {
            this.P0.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            K0(true);
        } else {
            this.T0 = false;
            K0(false);
            L0(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.ro roVar = this.f;
        if (roVar != null) {
            roVar.setAlpha(f7);
            this.q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.ro roVar = this.f;
        if (roVar != null) {
            roVar.setAlpha(f7);
            this.f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override // org.telegram.ui.jh0
    public final void t() {
        this.N.x0(0);
    }

    public final void x0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.f1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
        yy yyVar = this.M0;
        View view = yyVar != null ? yyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = yyVar != null ? yyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.e1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.l1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.m1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.M0 != null ? 2 : 1, this.k1);
        fVar.e(this.j1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void y0() {
        nf1 nf1Var;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        if (topicsController.endIsReached(j10) || (nf1Var = this.F) == null) {
            return;
        }
        int N0 = nf1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        A0();
    }

    @Override // org.telegram.ui.jh0
    public final gh.d z() {
        return this.h1;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (this.H0 != null && ((str = this.y0) != null || this.z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y0 = null;
            this.z0 = false;
        } else {
            if (this.y0 == null || !z10 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.q.r(R.string.LinkHashExpired, org.telegram.ui.Components.zc.a0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
