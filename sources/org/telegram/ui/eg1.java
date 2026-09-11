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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class eg1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ch, dh0 {
    public static final HashSet n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public bi.m6 D0;
    public boolean E;
    public sf1 E0;
    public gf1 F;
    public FrameLayout F0;
    public boolean G;
    public y8 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public rf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.qk0 K0;
    public org.telegram.ui.Components.f61 L;
    public uy L0;
    public int M;
    public uy M0;
    public pf1 N;
    public boolean N0;
    public if1 O;
    public final AnimationNotificationsLocker O0;
    public dg1 P;
    public t50 P0;
    public org.telegram.ui.ActionBar.f1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.f1 R;
    public xh.d R0;
    public org.telegram.ui.ActionBar.f1 S;
    public float S0;
    public org.telegram.ui.ActionBar.f1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.f1 U;
    public org.telegram.ui.Components.js U0;
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
    public org.telegram.ui.Components.h81 a1;
    public final ArrayList b;
    public boolean b0;
    public View b1;
    public int c;
    public NumberTextView c0;
    public int c1;
    public lf1 d;
    public org.telegram.ui.ActionBar.v0 d0;
    public int d1;
    public j0 e;
    public org.telegram.ui.ActionBar.v0 e0;
    public int e1;
    public org.telegram.ui.Components.co f;
    public org.telegram.ui.ActionBar.v0 f0;
    public final bh.f f1;
    public org.telegram.ui.ActionBar.v0 g0;
    public final gh.d g1;
    public org.telegram.ui.Components.y10 h;
    public org.telegram.ui.ActionBar.v0 h0;
    public final gh.d h1;
    public org.telegram.ui.ActionBar.v0 i0;
    public final bh.b i1;
    public org.telegram.ui.ActionBar.f1 j0;
    public bh.l j1;
    public org.telegram.ui.ActionBar.f1 k0;
    public final ArrayList k1;
    public org.telegram.ui.ActionBar.f1 l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.v0 m0;
    public final RectF m1;
    public uf1 n;
    public RadialProgressView n0;
    public v51 o0;
    public org.telegram.ui.ActionBar.v0 p0;
    public org.telegram.ui.ActionBar.v0 q0;
    public final tf1 r;
    public ag1 r0;
    public final TopicsController s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public fg1 v;
    public final boolean v0;
    public ax w;
    public final boolean w0;
    public int x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public eg1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new tf1(this);
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
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.a = j3;
        this.t0 = this.arguments.getBoolean("for_select", false);
        this.u0 = this.arguments.getBoolean("forward_to", false);
        this.x0 = this.arguments.getBoolean("bot_share_to", false);
        this.v0 = this.arguments.getBoolean("quote", false);
        this.w0 = this.arguments.getBoolean("reply_to", false);
        this.y0 = this.arguments.getString("voicechat", null);
        this.z0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.w1.v("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
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
        bVar.f = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.n2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j3);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new co(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j3, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new co(bundle);
            }
        }
        return new eg1(bundle);
    }

    public static org.telegram.ui.ActionBar.n2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.eg1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I0(co coVar) {
        if (coVar.getParentLayout() == null) {
            return;
        }
        if (coVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) coVar.getParentLayout().getFragmentStack().get(coVar.getParentLayout().getFragmentStack().size() - 2);
            if (n2Var instanceof eg1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -coVar.a());
        ((ActionBarLayout) coVar.getParentLayout()).c(coVar.getParentLayout().getFragmentStack().size() - 1, new eg1(bundle));
        coVar.ja = true;
        coVar.finishFragment();
    }

    public static boolean U(eg1 eg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(eg1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-eg1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = eg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(eg1Var.g());
        int i10 = org.telegram.ui.Components.g80.r;
        org.telegram.ui.Components.g80.w(parentActivity, eg1Var, org.telegram.ui.Components.yc.a0(eg1Var), isChannelAndNotMegaGroup);
        eg1Var.O0(true);
        return false;
    }

    public static void V(eg1 eg1Var, View view) {
        long j3 = eg1Var.a;
        if (eg1Var.getParentLayout() == null || ((ActionBarLayout) eg1Var.getParentLayout()).y() || !(view instanceof bg1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((bg1) view).N;
        long j10 = -j3;
        long peerDialogId = tL_forumTopic == null ? 0L : eg1Var.getMessagesController().isMonoForum(j10) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (eg1Var.t0) {
            fg1 fg1Var = eg1Var.v;
            if (fg1Var != null) {
                hg1 hg1Var = fg1Var.a;
                Bundle bundle = new Bundle();
                kg1 kg1Var = hg1Var.a;
                bundle.putLong("dialog_id", kg1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                y11 y11Var = new y11(bundle, null);
                y11Var.r = new qv0(17, hg1Var, tL_forumTopic);
                kg1Var.presentFragment(y11Var);
            }
            uy uyVar = eg1Var.L0;
            if (uyVar != null) {
                uyVar.O3(j10, peerDialogId, true, eg1Var);
                return;
            }
            return;
        }
        if (eg1Var.a0.size() > 0) {
            eg1Var.N0(view);
            return;
        }
        if (eg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.n2 n2Var : eg1Var.getParentLayout().getFragmentStack()) {
                if (n2Var instanceof uy) {
                    uy uyVar2 = (uy) n2Var;
                    if (uyVar2.h4()) {
                        MessagesStorage.TopicKey topicKey = uyVar2.p2;
                        if (topicKey.dialogId == j10 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            eg1Var.Q0 = peerDialogId;
            eg1Var.U0(false, false);
        }
        og.d.m(eg1Var, j3, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean W(eg1 eg1Var, View view, float f7) {
        if (eg1Var.t0 || eg1Var.getParentLayout() == null || ((ActionBarLayout) eg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!eg1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof bg1)) {
            bg1 bg1Var = (bg1) view;
            if (bg1Var.S(f7)) {
                eg1Var.M0(bg1Var);
                eg1Var.N.I0(true);
                eg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        eg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(eg1 eg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = eg1Var.N;
            } else {
                ag1 ag1Var = eg1Var.r0;
                viewGroup = ag1Var != null ? ag1Var.U : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.za) {
                        ((org.telegram.ui.Cells.za) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = eg1Var.actionBar;
        if (kVar != null) {
            kVar.D(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            eg1Var.actionBar.F(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            eg1Var.actionBar.F(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            eg1Var.actionBar.G(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        t50 t50Var = eg1Var.P0;
        if (t50Var != null && Build.VERSION.SDK_INT >= 23) {
            t50Var.setForeground(new ColorDrawable(i0.a.k(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100)));
        }
        eg1Var.P0();
    }

    public static void b0(eg1 eg1Var, boolean z10) {
        ox oxVar;
        eg1Var.s0 = z10;
        ValueAnimator valueAnimator = eg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            eg1Var.Y0.cancel();
        }
        int i10 = 0;
        if (eg1Var.a1 == null) {
            org.telegram.ui.Components.h81 n10 = eg1Var.r0.n(8, false);
            eg1Var.a1 = n10;
            if (eg1Var.M0 != null) {
                n10.setBackgroundColor(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            eg1Var.e.addView(eg1Var.a1, w7.x5.c(44.0f, -1));
        }
        eg1Var.Y0 = ValueAnimator.ofFloat(eg1Var.W, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(eg1Var.r0, false, 1.0f, true);
        uy uyVar = eg1Var.M0;
        if (uyVar != null && (oxVar = uyVar.F3) != null) {
            oxVar.M = !z10;
        }
        eg1Var.Z0 = !z10 && eg1Var.r0.getVisibility() == 0 && eg1Var.r0.getAlpha() == 1.0f;
        eg1Var.Y0.addUpdateListener(new b21(eg1Var, 17));
        eg1Var.r0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(eg1Var.getParentActivity(), eg1Var.classGuid);
            eg1Var.Q0(false);
        } else {
            eg1Var.q0.setVisibility(0);
        }
        eg1Var.Y0.addListener(new nf1(eg1Var, z10, i10));
        eg1Var.Y0.setDuration(200L);
        eg1Var.Y0.setInterpolator(org.telegram.ui.Components.pr.f);
        eg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.s.isLoading(this.a);
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((vf1) arrayList.get(0)).c != null && ((vf1) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        pf1 pf1Var = this.N;
        if (pf1Var != null) {
            pf1Var.J0(pf1Var.t1());
        }
        Q0(true);
    }

    public final void B0() {
        uy uyVar = this.M0;
        if (uyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.js jsVar = uyVar.J1;
            float c10 = (jsVar != null ? jsVar.c(dp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.js jsVar2 = this.U0;
            if (jsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.js jsVar3 = this.M0.J1;
                jsVar2.setTranslationY(c10 - ((jsVar3 != null ? jsVar3.getMetadata().c.a : 0.0f) * dp2));
                org.telegram.ui.Components.js jsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                r2 = jsVar4.c(AndroidUtilities.lerp(dp3, dp4, this.M0.J1 != null ? r5.getMetadata().c.a : 0.0f)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.js jsVar5 = this.U0;
            if (jsVar5 != null) {
                r2 = 0.0f + jsVar5.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.N.setPadding(0, (int) r2, 0, this.e1 + this.c1 + (this.V ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void C0() {
        this.a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sw0(4));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
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
            this.L.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.j6.Ae : org.telegram.ui.ActionBar.j6.q7);
            this.W0.setVisibility(i10 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        lf1 lf1Var = this.d;
        if (lf1Var != null) {
            if (z10) {
                lf1Var.setLayerType(2, null);
                lf1Var.setClipChildren(false);
                lf1Var.setClipToPadding(false);
            } else {
                lf1Var.setLayerType(0, null);
                lf1Var.setClipChildren(true);
                lf1Var.setClipToPadding(true);
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
        pf1 pf1Var = this.N;
        if (pf1Var != null) {
            float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.S0, 0.05f, 1.0f);
            pf1Var.setPivotX(0.0f);
            pf1Var.setPivotY(0.0f);
            pf1Var.setScaleX(b10);
            pf1Var.setScaleY(b10);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(b10);
            this.actionBar.setScaleY(b10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void M0(org.telegram.ui.Cells.r2 r2Var) {
        final int i10 = 0;
        try {
            r2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.N;
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new kf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ooVar.f);
        ooVar.o = 1;
        long j3 = this.a;
        long j10 = -j3;
        ooVar.d(j10, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                f1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef1
                public final /* synthetic */ eg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            eg1 eg1Var = this.b;
                            eg1Var.C0 = true;
                            eg1Var.N0 = true;
                            eg1Var.s.pinTopic(eg1Var.a, tL_forumTopic.id, !r0.pinned, eg1Var);
                            eg1Var.finishPreviewFragment();
                            break;
                        case 1:
                            eg1 eg1Var2 = this.b;
                            eg1Var2.N0 = true;
                            TopicsController topicsController = eg1Var2.s;
                            long j11 = eg1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j11, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            eg1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            eg1 eg1Var3 = this.b;
                            eg1Var3.D0(hashSet, new cf1(eg1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(f1Var);
        }
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j10, tL_forumTopic.id)) {
            f1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            f1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new bi.b7(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(f1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                f1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                f1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            f1Var3.setMinimumWidth(160);
            f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef1
                public final /* synthetic */ eg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            eg1 eg1Var = this.b;
                            eg1Var.C0 = true;
                            eg1Var.N0 = true;
                            eg1Var.s.pinTopic(eg1Var.a, tL_forumTopic.id, !r0.pinned, eg1Var);
                            eg1Var.finishPreviewFragment();
                            break;
                        case 1:
                            eg1 eg1Var2 = this.b;
                            eg1Var2.N0 = true;
                            TopicsController topicsController = eg1Var2.s;
                            long j11 = eg1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j11, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            eg1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            eg1 eg1Var3 = this.b;
                            eg1Var3.D0(hashSet, new cf1(eg1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(f1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, true);
            f1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            f1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            f1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
            f1Var4.setMinimumWidth(160);
            final int i12 = 2;
            f1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef1
                public final /* synthetic */ eg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            eg1 eg1Var = this.b;
                            eg1Var.C0 = true;
                            eg1Var.N0 = true;
                            eg1Var.s.pinTopic(eg1Var.a, tL_forumTopic.id, !r0.pinned, eg1Var);
                            eg1Var.finishPreviewFragment();
                            break;
                        case 1:
                            eg1 eg1Var2 = this.b;
                            eg1Var2.N0 = true;
                            TopicsController topicsController = eg1Var2.s;
                            long j11 = eg1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j11, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            eg1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            eg1 eg1Var3 = this.b;
                            eg1Var3.D0(hashSet, new cf1(eg1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(f1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j10);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.x5.c(-1.0f, -1));
        }
        co coVar = new co(w.f.e(j3, "chat_id"));
        og.d.a(coVar, MessagesStorage.TopicKey.of(j10, isMonoForum ? DialogObject.getPeerDialogId(r2Var.N.from_id) : r2Var.N.id));
        presentFragmentAsPreviewWithMenu(coVar, r32[0]);
    }

    public final void N0(View view) {
        bg1 bg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z10;
        if (!(view instanceof bg1) || (tL_forumTopic = (bg1Var = (bg1) view).N) == null) {
            return;
        }
        int i10 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        bg1Var.V(hashSet.contains(Integer.valueOf(i10)), true);
        MessagesController messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (hashSet.isEmpty()) {
            this.actionBar.r();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
            if (this.inPreviewMode) {
                j10.setBackgroundColor(0);
                j10.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(AndroidUtilities.bold());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
            j10.addView(this.c0, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new ff1(0));
            this.d0 = j10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.e0 = j10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.f0 = j10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.g0 = j10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.v0 h = j10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.v0 h10 = j10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.i0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.v0 h11 = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
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
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            topicsController = this.s;
            if (!hasNext) {
                break;
            }
            HashSet hashSet2 = hashSet;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, intValue);
            if (findTopic != null) {
                if (findTopic.unread_count != 0) {
                    i11++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i14++;
                    } else {
                        i13++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j3, intValue)) {
                i12++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i11 > 0) {
            this.j0.setVisibility(0);
            this.j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
        } else {
            this.j0.setVisibility(8);
        }
        if (i12 != 0) {
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
        this.d0.setVisibility((i13 == z10 && i14 == 0) ? 0 : 8);
        this.e0.setVisibility((i14 == z10 && i13 == 0) ? 0 : 8);
        this.c0.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j3, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i17++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i19++;
                        } else {
                            i18++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i15++;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
        this.k0.setVisibility((i15 != 0 || i16 <= 0) ? 8 : 0);
        this.k0.setText(LocaleController.getString(i16 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.l0.setVisibility((i16 != 0 || i15 <= 0) ? 8 : 0);
        this.l0.setText(LocaleController.getString(i15 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.g0.setVisibility(i17 == hashSet3.size() ? 0 : 8);
        this.h0.setVisibility((i18 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.i0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.m0.l();
        R0();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        long j3;
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
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        long j11 = -j10;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
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
        sb2.append(j11);
        boolean z14 = notificationsSettings.getInt(sb2.toString(), 0) == 2;
        boolean v = org.telegram.messenger.w1.v("dialog_bar_report", j11, notificationsSettings, false);
        boolean v9 = org.telegram.messenger.w1.v("dialog_bar_block", j11, notificationsSettings, false);
        boolean z15 = this.t0;
        if (z15) {
            j3 = 0;
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
            org.telegram.ui.Components.co coVar = this.f;
            if (coVar != null && coVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.p0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.f.setTitle(chat.title);
                this.f.j(null, getMessagesController().isDialogMuted(j11, 0L) ? getThemedDrawable("drawableMuteIcon") : null);
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j10);
            if (chatFull2 != null && (chatFull = this.J) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.J = chatFull2;
            if (chatFull2 != null) {
                int i10 = chatFull2.participants_count;
                if (i10 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j10));
                    string = chat3 == null ? LocaleController.getString(R.string.Loading) : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    j3 = 0;
                } else {
                    j3 = 0;
                    string = LocaleController.formatPluralString("Members", i10, new Object[0]);
                }
            } else {
                j3 = 0;
                string = LocaleController.getString(R.string.Loading);
            }
            this.f.setSubtitle(string);
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j12 = MessagesController.getNotificationsSettings(this.currentAccount).getLong(a4.a.o(j11, "dialog_join_requested_time_"), -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j12 > j3 && System.currentTimeMillis() - j12 < 120000) {
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
            if (!z14 || (!v9 && !v)) {
                z11 = false;
                if (this.V != z11) {
                    this.V = z11;
                    this.o0.animate().setListener(null).cancel();
                    if (z16) {
                        this.o0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new nf1(this, z11, 1));
                    } else {
                        this.o0.setVisibility(z11 ? 0 : 8);
                        this.o0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                B0();
                this.q0.setVisibility(!z15 ? 8 : 0);
                this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : 8);
                this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? 8 : 0);
                this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? 8 : 0);
                this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? 8 : 0);
                Q0(true);
                this.H0 = getMessagesController().getGroupCall(j10, true);
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
        this.q0.setVisibility(!z15 ? 8 : 0);
        this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : 8);
        this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? 8 : 0);
        this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? 8 : 0);
        this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? 8 : 0);
        Q0(true);
        this.H0 = getMessagesController().getGroupCall(j10, true);
        z0(false);
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        v51 v51Var = this.o0;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        v51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        }
        this.r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.a;
        boolean z11 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j3))) || this.s0 || this.t0 || this.J0) ? false : true;
        this.K = z11;
        this.Q.setVisibility(z11 ? 0 : 8);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10 = ChatObject.canManageTopics(g()) && !this.a0.isEmpty();
        if (this.b0 != z10) {
            this.b0 = z10;
            tf1 tf1Var = this.r;
            tf1Var.q(0, tf1Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.dh0
    public final /* synthetic */ boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        kVar.C(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.t8), getThemedColor(org.telegram.ui.ActionBar.j6.z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.s8), getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
        }
        float f10 = 1.0f - f7;
        this.f.getTitleTextView().setAlpha(f10);
        this.f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.h81 h81Var = this.a1;
        if (h81Var != null) {
            h81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
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
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    public final void T0() {
        bi.m6 m6Var = this.D0;
        if (m6Var == null || m6Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.ic_ab_other, 0);
        nqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
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
        gf1 gf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.s;
        long j3 = this.a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.u0) {
                arrayList.add(new vf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList.add(new vf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new vf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                vf1 vf1Var = (vf1) arrayList.get(i11);
                if (vf1Var != null && (tL_forumTopic = vf1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            pf1 pf1Var = this.N;
            if (pf1Var != null) {
                if (pf1Var.getItemAnimator() != (z10 ? this.I0 : null)) {
                    this.N.setItemAnimator(z10 ? this.I0 : null);
                }
            }
            tf1 tf1Var = this.r;
            if (tf1Var != null) {
                tf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (gf1Var = this.F) != null) {
                gf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override // org.telegram.ui.Components.ch, org.telegram.ui.Components.o50
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        uy uyVar = this.M0;
        final int i10 = 0;
        this.c1 = (uyVar == null || !uyVar.W) ? 0 : AndroidUtilities.dp(72.0f);
        uy uyVar2 = this.M0;
        this.d1 = (uyVar2 == null || !uyVar2.W) ? 0 : AndroidUtilities.dp(64.0f);
        lf1 lf1Var = new lf1(this, context);
        this.d = lf1Var;
        this.fragmentView = lf1Var;
        lf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.g.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new of1(this, context));
        final int i12 = 2;
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bf1
            public final /* synthetic */ eg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (i12) {
                    case 0:
                        eg1 eg1Var = this.b;
                        eg1Var.presentFragment(af1.a0(eg1Var.a, 0L));
                        break;
                    case 1:
                        eg1 eg1Var2 = this.b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        break;
                    case 2:
                        eg1 eg1Var3 = this.b;
                        if (!eg1Var3.s0) {
                            eg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        uy uyVar3 = this.b.M0;
                        if (uyVar3 != null && (v0Var = uyVar3.j0) != null) {
                            v0Var.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        final int i13 = 4;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bf1
                public final /* synthetic */ eg1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i13) {
                        case 0:
                            eg1 eg1Var = this.b;
                            eg1Var.presentFragment(af1.a0(eg1Var.a, 0L));
                            break;
                        case 1:
                            eg1 eg1Var2 = this.b;
                            eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.a, null, eg1Var2.g());
                            eg1Var2.O0(false);
                            break;
                        case 2:
                            eg1 eg1Var3 = this.b;
                            if (!eg1Var3.s0) {
                                eg1Var3.H0(false);
                                break;
                            }
                            break;
                        case 3:
                            this.b.finishPreviewFragment();
                            break;
                        default:
                            uy uyVar3 = this.b.M0;
                            if (uyVar3 != null && (v0Var = uyVar3.j0) != null) {
                                v0Var.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.v0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.F();
            a10.H = new ig.d2(this, 18);
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.v0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.v0 v0Var = this.q0;
        this.T = v0Var.d(14, 0, new org.telegram.ui.Components.xi0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, v0Var.m0);
        int i14 = 3;
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, this, false, this.resourceProvider);
        this.f = coVar;
        coVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        org.telegram.ui.Components.co coVar2 = this.f;
        long j3 = -this.a;
        coVar2.b = j3 < 0;
        coVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, w7.x5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new y7(this, i14));
        }
        this.N = new pf1(this, context);
        ih.k kVar = new ih.k(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.i1;
        bVar.d = kVar;
        bVar.e = viewGroup;
        pf1 pf1Var = this.N;
        uy uyVar3 = this.M0;
        if (uyVar3 != null) {
            viewGroup = (ViewGroup) uyVar3.getFragmentView();
        }
        pf1 pf1Var2 = this.N;
        Objects.requireNonNull(pf1Var2);
        this.j1 = new bh.l(pf1Var, viewGroup, new v8(pf1Var2, i12));
        this.N.C0(new cf1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        ax axVar = new ax(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = axVar;
        axVar.b();
        int i15 = this.E ? 2 : 0;
        this.y = i15;
        this.w.X = i15 != 0;
        rf1 rf1Var = new rf1(this);
        this.N.setHideIfEmpty(false);
        rf1Var.m = false;
        rf1Var.C = false;
        pf1 pf1Var3 = this.N;
        this.I0 = rf1Var;
        pf1Var3.setItemAnimator(rf1Var);
        this.N.setOnScrollListener(new hf1(this, i11));
        pf1 pf1Var4 = this.N;
        pf1Var4.Y1 = true;
        pf1Var4.Z1 = 0;
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(pf1Var4, true);
        this.K0 = qk0Var;
        this.N.setItemsEnterAnimator(qk0Var);
        this.N.setOnItemClickListener(new b31(this, 9));
        this.N.setOnItemLongClickListener(new df1(this));
        this.N.setOnScrollListener(new hf1(this, i12));
        pf1 pf1Var5 = this.N;
        gf1 gf1Var = new gf1(this);
        this.F = gf1Var;
        pf1Var5.setLayoutManager(gf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new hf1(this, i10));
        dg1 dg1Var = new dg1(this);
        this.P = dg1Var;
        if1 if1Var = new if1(this, dg1Var);
        this.O = if1Var;
        if1Var.d(this.N);
        this.d.addView(this.N, w7.x5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(getParentActivity(), this.resourceProvider, false);
        this.h = y10Var;
        this.d.addView(y10Var, org.telegram.ui.Components.y10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bf1
            public final /* synthetic */ eg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (i10) {
                    case 0:
                        eg1 eg1Var = this.b;
                        eg1Var.presentFragment(af1.a0(eg1Var.a, 0L));
                        break;
                    case 1:
                        eg1 eg1Var2 = this.b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        break;
                    case 2:
                        eg1 eg1Var3 = this.b;
                        if (!eg1Var3.s0) {
                            eg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        uy uyVar32 = this.b.M0;
                        if (uyVar32 != null && (v0Var2 = uyVar32.j0) != null) {
                            v0Var2.performClick();
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
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(24);
        t00Var.setVisibility(8);
        t00Var.w = true;
        uf1 uf1Var = new uf1(context);
        TextView textView = new TextView(context);
        uf1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        boolean z10 = LocaleController.isRTL;
        uf1Var.addView(textView, w7.x5.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = uf1Var;
        textView.setAlpha(0.0f);
        bi.m6 m6Var = new bi.m6(this, context, t00Var);
        this.D0 = m6Var;
        try {
            m6Var.b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.n.addView(t00Var);
        this.n.addView(this.D0);
        this.d.addView(this.n);
        this.N.setEmptyView(this.n);
        this.o0 = new v51(context, 6);
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context);
        this.L = f61Var;
        this.o0.addView(f61Var);
        this.d.addView(this.o0, w7.x5.e(-1, 51, 80));
        this.L.setOnClickListener(new jf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.n0.setVisibility(4);
        this.o0.addView(this.n0, w7.x5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i16 = org.telegram.ui.ActionBar.j6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i16))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, w7.x5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bf1
            public final /* synthetic */ eg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (i11) {
                    case 0:
                        eg1 eg1Var = this.b;
                        eg1Var.presentFragment(af1.a0(eg1Var.a, 0L));
                        break;
                    case 1:
                        eg1 eg1Var2 = this.b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        break;
                    case 2:
                        eg1 eg1Var3 = this.b;
                        if (!eg1Var3.s0) {
                            eg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        uy uyVar32 = this.b.M0;
                        if (uyVar32 != null && (v0Var2 = uyVar32.j0) != null) {
                            v0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        j0 j0Var = new j0(this, context, 25);
        this.e = j0Var;
        if (this.M0 == null) {
            this.d.addView(j0Var, w7.x5.e(-1, -1, 119));
        }
        ag1 ag1Var = new ag1(this, context);
        this.r0 = ag1Var;
        ag1Var.setVisibility(8);
        this.e.addView(this.r0, w7.x5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        ag1 ag1Var2 = this.r0;
        int i17 = org.telegram.ui.ActionBar.j6.d6;
        ag1Var2.setBackgroundColor(getThemedColor(i17));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.js jsVar = new org.telegram.ui.Components.js(context);
        this.U0 = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.b.n(this.resourceProvider), false);
        c12.p(AndroidUtilities.dp(24.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new cf1(this, i10));
        this.d.addView(this.U0, w7.x5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.x5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            xh.d dVar2 = this.R0;
            dVar2.m = new df1(this);
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
            y8 y8Var = new y8(this, context, this);
            this.G0 = y8Var;
            this.F0.addView(y8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.x5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        y0();
        t50 t50Var = new t50(this, context, 10);
        this.P0 = t50Var;
        if (Build.VERSION.SDK_INT >= 23) {
            t50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i17), 100)));
        }
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        final int i18 = 3;
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bf1
            public final /* synthetic */ eg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (i18) {
                    case 0:
                        eg1 eg1Var = this.b;
                        eg1Var.presentFragment(af1.a0(eg1Var.a, 0L));
                        break;
                    case 1:
                        eg1 eg1Var2 = this.b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        break;
                    case 2:
                        eg1 eg1Var3 = this.b;
                        if (!eg1Var3.s0) {
                            eg1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        uy uyVar32 = this.b.M0;
                        if (uyVar32 != null && (v0Var2 = uyVar32.j0) != null) {
                            v0Var2.performClick();
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
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) it.next();
                if (n2Var instanceof uy) {
                    uy uyVar4 = (uy) n2Var;
                    if (uyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = uyVar4.p2;
                        if (topicKey.dialogId == j3) {
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
            getMessagesController().getBoostsController().getBoostsStats(j3, new xb(this, 5));
        }
        View view = this.fragmentView;
        df1 df1Var = new df1(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view, df1Var);
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
        long j3 = this.a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j3) {
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
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j3 == ((Long) objArr[0]).longValue()) {
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
                getMessagesController().getTopicsController().sortTopics(j3, false);
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
            if (j3 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                y8 y8Var = this.G0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
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
            if (longValue != (-j3) || booleanValue) {
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

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.ll0 ll0Var;
        xy0 xy0Var = new xy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        ag1 ag1Var = this.r0;
        if (ag1Var != null && (ll0Var = ag1Var.U) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, ll0Var);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.j6.d6 : org.telegram.ui.ActionBar.j6.s8);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.w8);
        }
        return i0.a.f(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.ch
    public final org.telegram.ui.Components.co n() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.v(this.p0.L(false));
            }
        } else if (z10) {
            C0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.a;
        messagesController.loadFullChat(j3, 0, true);
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
        j71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        uy uyVar = this.M0;
        if (uyVar == null || uyVar.F3 == null) {
            return;
        }
        uyVar.getActionBar().setSearchAvatarImageView(null);
        this.M0.F3.M = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.a);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.a;
        topicsController.onTopicFragmentResume(j3);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new z8(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j3)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            L0(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ox oxVar;
        t50 t50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (t50Var = this.P0) != null) {
            if (t50Var.getParent() != null) {
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
            uy uyVar = this.L0;
            if (uyVar != null) {
                uyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.I) {
            removeSelfFromStack();
            uy uyVar2 = this.M0;
            if (uyVar2 == null || (oxVar = uyVar2.F3) == null || !oxVar.c()) {
                return;
            }
            this.M0.F3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        t50 t50Var = this.P0;
        if (t50Var == null || t50Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.P0.setAlpha(1.0f - f7);
        } else {
            this.P0.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.dh0
    public final void r() {
        this.N.x0(0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.co coVar = this.f;
        if (coVar != null) {
            coVar.setAlpha(f7);
            this.q0.setAlpha(f7);
            org.telegram.ui.ActionBar.v0 v0Var = this.p0;
            if (v0Var != null) {
                v0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.co coVar = this.f;
        if (coVar != null) {
            coVar.setAlpha(f7);
            this.f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override // org.telegram.ui.dh0
    public final gh.d x() {
        return this.h1;
    }

    public final void x0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.f1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
        uy uyVar = this.M0;
        View view = uyVar != null ? uyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = uyVar != null ? uyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.e1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.l1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.m1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.M0 != null ? 2 : 1, this.k1);
        fVar.e(this.j1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // org.telegram.ui.Components.ch
    public final org.telegram.ui.Components.ov0 y() {
        return this.d;
    }

    public final void y0() {
        gf1 gf1Var;
        TopicsController topicsController = this.s;
        long j3 = this.a;
        if (topicsController.endIsReached(j3) || (gf1Var = this.F) == null) {
            return;
        }
        int N0 = gf1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j3);
        }
        A0();
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        if (this.H0 != null && ((str = this.y0) != null || this.z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y0 = null;
            this.z0 = false;
        } else {
            if (this.y0 == null || !z10 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.yc.a0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ch
    public final /* synthetic */ void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
