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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class cf1 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.bh, qg0 {
    public static final HashSet q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public di.n5 D0;
    public boolean E;
    public qe1 E0;
    public ee1 F;
    public FrameLayout F0;
    public boolean G;
    public c9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public pe1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.rl0 K0;
    public org.telegram.ui.Components.u71 L;
    public ey L0;
    public int M;
    public ey M0;
    public ne1 N;
    public boolean N0;
    public ge1 O;
    public final AnimationNotificationsLocker O0;
    public bf1 P;
    public b20 P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public yh.d R0;
    public org.telegram.ui.ActionBar.g1 S;
    public float S0;
    public org.telegram.ui.ActionBar.g1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.g1 U;
    public org.telegram.ui.Components.ws U0;
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
    public org.telegram.ui.Components.u91 a1;
    public final ArrayList b;
    public boolean b0;
    public boolean b1;
    public int c;
    public NumberTextView c0;
    public View c1;
    public je1 d;
    public org.telegram.ui.ActionBar.w0 d0;
    public int d1;
    public k0 e;
    public org.telegram.ui.ActionBar.w0 e0;
    public int e1;
    public org.telegram.ui.Components.po f;
    public org.telegram.ui.ActionBar.w0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.w0 g0;
    public final ch.f g1;
    public org.telegram.ui.Components.j20 h;
    public org.telegram.ui.ActionBar.w0 h0;
    public final hh.d h1;
    public org.telegram.ui.ActionBar.w0 i0;
    public final hh.d i1;
    public org.telegram.ui.ActionBar.g1 j0;
    public final hh.c j1;
    public org.telegram.ui.ActionBar.g1 k0;
    public final ch.b k1;
    public org.telegram.ui.ActionBar.g1 l0;
    public ch.j l1;
    public org.telegram.ui.ActionBar.w0 m0;
    public final ArrayList m1;
    public se1 n;
    public RadialProgressView n0;
    public final RectF n1;
    public r41 o0;
    public final RectF o1;
    public org.telegram.ui.ActionBar.w0 p0;
    public int p1;
    public org.telegram.ui.ActionBar.w0 q0;
    public final re1 r;
    public ye1 r0;
    public final TopicsController s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public df1 v;
    public final boolean v0;
    public hw w;
    public final boolean w0;
    public int x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public cf1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new re1(this);
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
        this.s = getMessagesController().getTopicsController();
        this.V0 = !org.telegram.messenger.t.x("topics_end_reached_", r1, getUserConfig().getPreferences(), false);
        hh.c cVar = new hh.c();
        this.j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.g1 = null;
            this.h1 = null;
            this.i1 = null;
            this.k1 = new ch.b(cVar);
            return;
        }
        this.g1 = new ch.f();
        this.h1 = new hh.d(null);
        hh.d dVar = new hh.d(null);
        this.i1 = dVar;
        ch.b bVar = new ch.b(dVar);
        this.k1 = bVar;
        bVar.i = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.r2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new wn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new wn(bundle);
            }
        }
        return new cf1(bundle);
    }

    public static org.telegram.ui.ActionBar.r2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.cf1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I0(wn wnVar) {
        if (wnVar.getParentLayout() == null) {
            return;
        }
        if (wnVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) wnVar.getParentLayout().getFragmentStack().get(wnVar.getParentLayout().getFragmentStack().size() - 2);
            if (r2Var instanceof cf1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -wnVar.a());
        ((ActionBarLayout) wnVar.getParentLayout()).c(wnVar.getParentLayout().getFragmentStack().size() - 1, new cf1(bundle));
        wnVar.za = true;
        wnVar.finishFragment();
    }

    public static boolean V(cf1 cf1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(cf1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-cf1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = cf1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(cf1Var.g());
        int i10 = org.telegram.ui.Components.d90.s;
        org.telegram.ui.Components.d90.w(parentActivity, cf1Var, org.telegram.ui.Components.wc.b0(cf1Var), isChannelAndNotMegaGroup);
        cf1Var.O0(true);
        return false;
    }

    public static void W(cf1 cf1Var, View view) {
        long j10 = cf1Var.a;
        if (cf1Var.getParentLayout() == null || ((ActionBarLayout) cf1Var.getParentLayout()).x() || !(view instanceof ze1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ze1) view).N;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : cf1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (cf1Var.t0) {
            df1 df1Var = cf1Var.v;
            if (df1Var != null) {
                ff1 ff1Var = df1Var.a;
                Bundle bundle = new Bundle();
                if1 if1Var = ff1Var.a;
                bundle.putLong("dialog_id", if1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                j11 j11Var = new j11(bundle, null);
                j11Var.s = new cf0(28, ff1Var, tL_forumTopic);
                if1Var.presentFragment(j11Var);
            }
            ey eyVar = cf1Var.L0;
            if (eyVar != null) {
                eyVar.W3(j11, peerDialogId, true, cf1Var);
                return;
            }
            return;
        }
        if (cf1Var.a0.size() > 0) {
            cf1Var.N0(view);
            return;
        }
        if (cf1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.r2 r2Var : cf1Var.getParentLayout().getFragmentStack()) {
                if (r2Var instanceof ey) {
                    ey eyVar2 = (ey) r2Var;
                    if (eyVar2.p4()) {
                        MessagesStorage.TopicKey topicKey = eyVar2.p2;
                        if (topicKey.dialogId == j11 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            cf1Var.Q0 = peerDialogId;
            cf1Var.V0(false, false);
        }
        pg.d.m(cf1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean X(cf1 cf1Var, View view, float f7) {
        if (cf1Var.t0 || cf1Var.getParentLayout() == null || ((ActionBarLayout) cf1Var.getParentLayout()).x()) {
            return false;
        }
        if (!cf1Var.actionBar.q() && !AndroidUtilities.isTablet() && (view instanceof ze1)) {
            ze1 ze1Var = (ze1) view;
            if (ze1Var.R(f7)) {
                cf1Var.M0(ze1Var);
                cf1Var.N.I0(true);
                cf1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        cf1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void b0(cf1 cf1Var, boolean z10) {
        vw vwVar;
        cf1Var.s0 = z10;
        ValueAnimator valueAnimator = cf1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            cf1Var.Y0.cancel();
        }
        int i10 = 0;
        if (cf1Var.a1 == null) {
            org.telegram.ui.Components.u91 n10 = cf1Var.r0.n(8, false);
            cf1Var.a1 = n10;
            if (cf1Var.M0 != null) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, n10, cf1Var.getResourceProvider());
            }
            cf1Var.e.addView(cf1Var.a1, org.telegram.ui.Components.kb1.g(44.0f, -1));
        }
        cf1Var.Y0 = ValueAnimator.ofFloat(cf1Var.W, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(cf1Var.r0, false, 1.0f, true);
        ey eyVar = cf1Var.M0;
        if (eyVar != null && (vwVar = eyVar.G3) != null) {
            vwVar.M = !z10;
        }
        cf1Var.Z0 = !z10 && cf1Var.r0.getVisibility() == 0 && cf1Var.r0.getAlpha() == 1.0f;
        cf1Var.Y0.addUpdateListener(new x11(cf1Var, 14));
        cf1Var.r0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(cf1Var.getParentActivity(), cf1Var.classGuid);
            cf1Var.Q0(false);
        } else {
            cf1Var.q0.setVisibility(0);
        }
        cf1Var.Y0.addListener(new le1(cf1Var, z10, i10));
        cf1Var.Y0.setDuration(200L);
        cf1Var.Y0.setInterpolator(org.telegram.ui.Components.ds.f);
        cf1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.bh
    public final org.telegram.ui.Components.ww0 A() {
        return this.d;
    }

    public final void A0() {
        this.J0 = this.s.isLoading(this.a);
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((te1) arrayList.get(0)).c != null && ((te1) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        ne1 ne1Var = this.N;
        if (ne1Var != null) {
            ne1Var.K0(ne1Var.z1());
        }
        Q0(true);
    }

    public final void B0() {
        ey eyVar = this.M0;
        if (eyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.ws wsVar = eyVar.J1;
            float c10 = (wsVar != null ? wsVar.c(dp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.ws wsVar2 = this.U0;
            if (wsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ws wsVar3 = this.M0.J1;
                wsVar2.setTranslationY(c10 - ((wsVar3 != null ? wsVar3.getMetadata().c.a : 0.0f) * dp2));
                org.telegram.ui.Components.ws wsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                r2 = wsVar4.c(AndroidUtilities.lerp(dp3, dp4, this.M0.J1 != null ? r5.getMetadata().c.a : 0.0f)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.ws wsVar5 = this.U0;
            if (wsVar5 != null) {
                r2 = 0.0f + wsVar5.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.N.setPadding(0, (int) r2, 0, this.f1 + this.d1 + (this.V ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void C0() {
        this.a0.clear();
        this.actionBar.p();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(26));
        e2Var.show();
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, getResourceProvider());
        }
    }

    public final void G0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ boolean H() {
        return false;
    }

    public final void H0(boolean z10) {
        TLRPC.Chat g7;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g7 = g()) != null && ((chatPhoto = g7.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.T4(this.J);
        profileActivity.X4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ long J() {
        return 0L;
    }

    public final void J0(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.L.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.y6.Ae : org.telegram.ui.ActionBar.y6.q7);
            this.W0.setVisibility(i10 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        je1 je1Var = this.d;
        if (je1Var != null) {
            if (z10) {
                je1Var.setLayerType(2, null);
                je1Var.setClipChildren(false);
                je1Var.setClipToPadding(false);
            } else {
                je1Var.setLayerType(0, null);
                je1Var.setClipChildren(true);
                je1Var.setClipToPadding(true);
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
        ne1 ne1Var = this.N;
        if (ne1Var != null) {
            float d = ic.a.d(1.0f, this.S0, 0.05f, 1.0f);
            ne1Var.setPivotX(0.0f);
            ne1Var.setPivotY(0.0f);
            ne1Var.setScaleX(d);
            ne1Var.setScaleY(d);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(d);
            this.actionBar.setScaleY(d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void M0(org.telegram.ui.Cells.p2 p2Var) {
        final int i10 = 0;
        try {
            p2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = p2Var.N;
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new ie1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(bpVar.f);
        bpVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        bpVar.e(j11, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.j(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.j(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce1
                public final /* synthetic */ cf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            cf1 cf1Var = this.b;
                            cf1Var.C0 = true;
                            cf1Var.N0 = true;
                            cf1Var.s.pinTopic(cf1Var.a, tL_forumTopic.id, !r0.pinned, cf1Var);
                            cf1Var.finishPreviewFragment();
                            break;
                        case 1:
                            cf1 cf1Var2 = this.b;
                            cf1Var2.N0 = true;
                            TopicsController topicsController = cf1Var2.s;
                            long j12 = cf1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            cf1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            cf1 cf1Var3 = this.b;
                            cf1Var3.D0(hashSet, new ae1(cf1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.id)) {
            g1Var2.j(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.j(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new di.c6(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.j(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.j(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce1
                public final /* synthetic */ cf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            cf1 cf1Var = this.b;
                            cf1Var.C0 = true;
                            cf1Var.N0 = true;
                            cf1Var.s.pinTopic(cf1Var.a, tL_forumTopic.id, !r0.pinned, cf1Var);
                            cf1Var.finishPreviewFragment();
                            break;
                        case 1:
                            cf1 cf1Var2 = this.b;
                            cf1Var2.N0 = true;
                            TopicsController topicsController = cf1Var2.s;
                            long j12 = cf1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            cf1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            cf1 cf1Var3 = this.b;
                            cf1Var3.D0(hashSet, new ae1(cf1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.j(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
            g1Var4.setMinimumWidth(160);
            final int i12 = 2;
            g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce1
                public final /* synthetic */ cf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            cf1 cf1Var = this.b;
                            cf1Var.C0 = true;
                            cf1Var.N0 = true;
                            cf1Var.s.pinTopic(cf1Var.a, tL_forumTopic.id, !r0.pinned, cf1Var);
                            cf1Var.finishPreviewFragment();
                            break;
                        case 1:
                            cf1 cf1Var2 = this.b;
                            cf1Var2.N0 = true;
                            TopicsController topicsController = cf1Var2.s;
                            long j12 = cf1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            cf1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            cf1 cf1Var3 = this.b;
                            cf1Var3.D0(hashSet, new ae1(cf1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var4);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        }
        wn wnVar = new wn(a1.g.h(j10, "chat_id"));
        pg.d.a(wnVar, MessagesStorage.TopicKey.of(j11, isMonoForum ? DialogObject.getPeerDialogId(p2Var.N.from_id) : p2Var.N.id));
        presentFragmentAsPreviewWithMenu(wnVar, r32[0]);
    }

    public final void N0(View view) {
        ze1 ze1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        if (!(view instanceof ze1) || (tL_forumTopic = (ze1Var = (ze1) view).N) == null) {
            return;
        }
        int i11 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i11);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i11));
        }
        ze1Var.U(hashSet.contains(Integer.valueOf(i11)), true);
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.p();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.z i12 = this.actionBar.i(null);
            if (this.inPreviewMode) {
                i12.setBackgroundColor(0);
                i12.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(i12.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(AndroidUtilities.bold());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.y8));
            i12.addView(this.c0, org.telegram.ui.Components.kb1.q(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new de1(0));
            this.d0 = i12.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.e0 = i12.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.f0 = i12.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.g0 = i12.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.w0 h = i12.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.w0 h10 = i12.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.i0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.w0 h11 = i12.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.m0 = h11;
            this.j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.K(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
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
                    i13++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i16++;
                    } else {
                        i15++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, intValue)) {
                i14++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i13 > 0) {
            this.j0.setVisibility(0);
            this.j0.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            i10 = 8;
        } else {
            i10 = 8;
            this.j0.setVisibility(8);
        }
        if (i14 != 0) {
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
        this.d0.setVisibility((i15 == z10 && i16 == 0) ? 0 : i10);
        this.e0.setVisibility((i16 == z10 && i15 == 0) ? 0 : i10);
        this.c0.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i19++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i21++;
                        } else {
                            i20++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i17++;
                        } else {
                            i18++;
                        }
                    }
                }
            }
        }
        this.k0.setVisibility((i17 != 0 || i18 <= 0) ? i10 : 0);
        this.k0.setText(LocaleController.getString(i18 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.l0.setVisibility((i18 != 0 || i17 <= 0) ? i10 : 0);
        this.l0.setText(LocaleController.getString(i17 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.g0.setVisibility(i19 == hashSet3.size() ? 0 : i10);
        this.h0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.i0.setVisibility((i21 == 1 && hashSet3.size() == 1) ? 0 : i10);
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
        boolean x9 = org.telegram.messenger.t.x("dialog_bar_report", j12, notificationsSettings, false);
        boolean x10 = org.telegram.messenger.t.x("dialog_bar_block", j12, notificationsSettings, false);
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
            org.telegram.ui.Components.po poVar = this.f;
            if (poVar != null && poVar.getLayoutParams() != null) {
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
            if (!z14 || (!x10 && !x9)) {
                z11 = false;
                if (this.V != z11) {
                    this.V = z11;
                    this.o0.animate().setListener(null).cancel();
                    if (z16) {
                        this.o0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new le1(this, z11, 1));
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
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Ae));
        this.h.updateColors();
        r41 r41Var = this.o0;
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        r41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.s8));
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
            re1 re1Var = this.r;
            re1Var.q(0, re1Var.h());
        }
    }

    public final void S0(float f7) {
        this.W = f7;
        T0();
        this.b1 = true;
        float f10 = 1.0f - f7;
        this.f.getTitleTextView().setAlpha(f10);
        this.f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.u91 u91Var = this.a1;
        if (u91Var != null) {
            u91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
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
            float z10 = c3.h0.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2, org.telegram.ui.qg0
    public final /* synthetic */ boolean T(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void T0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.y8;
        kVar.y(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.y(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.x(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.y6.t8), getThemedColor(org.telegram.ui.ActionBar.y6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.y6.s8), getThemedColor(org.telegram.ui.ActionBar.y6.d6)));
    }

    public final void U0() {
        di.n5 n5Var = this.D0;
        if (n5Var == null || n5Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.ic_ab_other, 0);
        zqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
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

    public final void V0(boolean z10, boolean z11) {
        ee1 ee1Var;
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
                arrayList.add(new te1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList.add(new te1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new te1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                te1 te1Var = (te1) arrayList.get(i11);
                if (te1Var != null && (tL_forumTopic = te1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            ne1 ne1Var = this.N;
            if (ne1Var != null) {
                if (ne1Var.getItemAnimator() != (z10 ? this.I0 : null)) {
                    this.N.setItemAnimator(z10 ? this.I0 : null);
                }
            }
            re1 re1Var = this.r;
            if (re1Var != null) {
                re1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (ee1Var = this.F) != null) {
                ee1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        U0();
    }

    @Override // org.telegram.ui.Components.bh, org.telegram.ui.Components.a60
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        ey eyVar = this.M0;
        final int i10 = 0;
        this.d1 = (eyVar == null || !eyVar.W) ? 0 : AndroidUtilities.dp(72.0f);
        ey eyVar2 = this.M0;
        this.e1 = (eyVar2 == null || !eyVar2.W) ? 0 : AndroidUtilities.dp(64.0f);
        je1 je1Var = new je1(this, context);
        this.d = je1Var;
        this.fragmentView = je1Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, je1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!AndroidUtilities.isTablet() || ((j5Var2 = this.parentLayout) != null && ((ActionBarLayout) j5Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setActionBarMenuOnItemClick(new me1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zd1
            public final /* synthetic */ cf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i10) {
                    case 0:
                        cf1 cf1Var = this.b;
                        if (!cf1Var.s0) {
                            cf1Var.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        cf1 cf1Var2 = this.b;
                        cf1Var2.getMessagesController().hidePeerSettingsBar(-cf1Var2.a, null, cf1Var2.g());
                        cf1Var2.O0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar3 = this.b.M0;
                        if (eyVar3 != null && (w0Var = eyVar3.j0) != null) {
                            w0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        cf1 cf1Var3 = this.b;
                        cf1Var3.presentFragment(yd1.b0(cf1Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        final int i12 = 3;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
            this.p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zd1
                public final /* synthetic */ cf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i12) {
                        case 0:
                            cf1 cf1Var = this.b;
                            if (!cf1Var.s0) {
                                cf1Var.H0(false);
                                break;
                            }
                            break;
                        case 1:
                            cf1 cf1Var2 = this.b;
                            cf1Var2.getMessagesController().hidePeerSettingsBar(-cf1Var2.a, null, cf1Var2.g());
                            cf1Var2.O0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            ey eyVar3 = this.b.M0;
                            if (eyVar3 != null && (w0Var = eyVar3.j0) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            cf1 cf1Var3 = this.b;
                            cf1Var3.presentFragment(yd1.b0(cf1Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = l4.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.N();
            a10.J(new jg.e2(this, 20));
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            org.telegram.ui.ActionBar.f7.V(searchField, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Si, getResourceProvider());
            org.telegram.ui.ActionBar.f7.w(searchField, org.telegram.ui.ActionBar.y6.Wd, getResourceProvider());
        }
        org.telegram.ui.ActionBar.w0 c10 = l4.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        final int i13 = 2;
        this.R = this.q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.q0;
        this.T = w0Var.d(14, 0, new org.telegram.ui.Components.yj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.m0);
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, this, false, this.resourceProvider);
        this.f = poVar;
        poVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((!AndroidUtilities.isTablet() || ((j5Var = this.parentLayout) != null && ((ActionBarLayout) j5Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.po poVar2 = this.f;
        long j10 = -this.a;
        poVar2.b = j10 < 0;
        poVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, org.telegram.ui.Components.kb1.h(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new e8(this, i12));
        }
        this.N = new ne1(this, context);
        jh.k kVar = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        ch.b bVar = this.k1;
        bVar.f = kVar;
        bVar.g = viewGroup;
        ne1 ne1Var = this.N;
        ey eyVar3 = this.M0;
        if (eyVar3 != null) {
            viewGroup = (ViewGroup) eyVar3.getFragmentView();
        }
        ne1 ne1Var2 = this.N;
        Objects.requireNonNull(ne1Var2);
        this.l1 = new ch.j(ne1Var, viewGroup, new k60(ne1Var2, 2));
        this.N.D0(new ae1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        pg.c c11 = pg.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        hw hwVar = new hw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = hwVar;
        hwVar.b();
        int i14 = this.E ? 2 : 0;
        this.y = i14;
        this.w.X = i14 != 0;
        pe1 pe1Var = new pe1(this);
        this.N.setHideIfEmpty(false);
        pe1Var.m = false;
        pe1Var.C = false;
        ne1 ne1Var3 = this.N;
        this.I0 = pe1Var;
        ne1Var3.setItemAnimator(pe1Var);
        this.N.setOnScrollListener(new fe1(this, i11));
        ne1 ne1Var4 = this.N;
        ne1Var4.W1 = true;
        ne1Var4.X1 = 0;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(ne1Var4, true);
        this.K0 = rl0Var;
        this.N.setItemsEnterAnimator(rl0Var);
        this.N.setOnItemClickListener(new o11(this, 10));
        this.N.setOnItemLongClickListener(new be1(this));
        this.N.setOnScrollListener(new fe1(this, i13));
        ne1 ne1Var5 = this.N;
        ee1 ee1Var = new ee1(this);
        this.F = ee1Var;
        ne1Var5.setLayoutManager(ee1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new fe1(this, i10));
        bf1 bf1Var = new bf1(this);
        this.P = bf1Var;
        ge1 ge1Var = new ge1(this, bf1Var);
        this.O = ge1Var;
        ge1Var.h(this.N);
        this.d.addView(this.N, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(getParentActivity(), this.resourceProvider, false);
        this.h = j20Var;
        this.d.addView(j20Var, org.telegram.ui.Components.j20.b());
        final int i15 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zd1
            public final /* synthetic */ cf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i15) {
                    case 0:
                        cf1 cf1Var = this.b;
                        if (!cf1Var.s0) {
                            cf1Var.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        cf1 cf1Var2 = this.b;
                        cf1Var2.getMessagesController().hidePeerSettingsBar(-cf1Var2.a, null, cf1Var2.g());
                        cf1Var2.O0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (w0Var2 = eyVar32.j0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        cf1 cf1Var3 = this.b;
                        cf1Var3.presentFragment(yd1.b0(cf1Var3.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(24);
        c10Var.setVisibility(8);
        c10Var.w = true;
        se1 se1Var = new se1(context);
        TextView textView = new TextView(context);
        se1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, getResourceProvider());
        boolean z10 = LocaleController.isRTL;
        se1Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = se1Var;
        textView.setAlpha(0.0f);
        di.n5 n5Var = new di.n5(this, context, c10Var);
        this.D0 = n5Var;
        try {
            n5Var.b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        U0();
        this.n.addView(c10Var);
        this.n.addView(this.D0);
        this.d.addView(this.n);
        this.N.setEmptyView(this.n);
        this.o0 = new r41(context, 6);
        org.telegram.ui.Components.u71 u71Var = new org.telegram.ui.Components.u71(context);
        this.L = u71Var;
        this.o0.addView(u71Var);
        this.d.addView(this.o0, org.telegram.ui.Components.kb1.i(-1, 51, 80));
        this.L.setOnClickListener(new he1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.n0.setVisibility(4);
        this.o0.addView(this.n0, org.telegram.ui.Components.kb1.i(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i16 = org.telegram.ui.ActionBar.y6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.o6.c(null, org.telegram.ui.ActionBar.o6.b(getThemedColor(i16))));
        org.telegram.ui.ActionBar.f7.t(this.W0, i16, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, org.telegram.ui.Components.kb1.h(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zd1
            public final /* synthetic */ cf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i11) {
                    case 0:
                        cf1 cf1Var = this.b;
                        if (!cf1Var.s0) {
                            cf1Var.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        cf1 cf1Var2 = this.b;
                        cf1Var2.getMessagesController().hidePeerSettingsBar(-cf1Var2.a, null, cf1Var2.g());
                        cf1Var2.O0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (w0Var2 = eyVar32.j0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        cf1 cf1Var3 = this.b;
                        cf1Var3.presentFragment(yd1.b0(cf1Var3.a, 0L));
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        k0 k0Var = new k0(this, context, 27);
        this.e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        }
        ye1 ye1Var = new ye1(this, context);
        this.r0 = ye1Var;
        ye1Var.setVisibility(8);
        this.e.addView(this.r0, org.telegram.ui.Components.kb1.h(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        ye1 ye1Var2 = this.r0;
        int i17 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i17, ye1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.ws wsVar = new org.telegram.ui.Components.ws(context);
        this.U0 = wsVar;
        wsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        eh.d c12 = bVar.c(this.U0, gh.c.o(this.resourceProvider), false);
        org.telegram.messenger.wh.s(c12, AndroidUtilities.dp(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new ae1(this, i10));
        this.d.addView(this.U0, org.telegram.ui.Components.kb1.h(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g7 = g();
        if (g7 != null) {
            yh.d dVar = new yh.d(g7, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), org.telegram.ui.Components.kb1.r(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            yh.d dVar2 = this.R0;
            dVar2.m = new be1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            c9 c9Var = new c9(this, context, this);
            this.G0 = c9Var;
            this.F0.addView(c9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams g10 = org.telegram.ui.Components.kb1.g(-2.0f, -1);
        if (this.inPreviewMode) {
            g10.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, g10);
        }
        y0();
        b20 b20Var = new b20(this, context, 10);
        this.P0 = b20Var;
        b20Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i17), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zd1
            public final /* synthetic */ cf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i13) {
                    case 0:
                        cf1 cf1Var = this.b;
                        if (!cf1Var.s0) {
                            cf1Var.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        cf1 cf1Var2 = this.b;
                        cf1Var2.getMessagesController().hidePeerSettingsBar(-cf1Var2.a, null, cf1Var2.g());
                        cf1Var2.O0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (w0Var2 = eyVar32.j0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        cf1 cf1Var3 = this.b;
                        cf1Var3.presentFragment(yd1.b0(cf1Var3.a, 0L));
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
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) it.next();
                if (r2Var instanceof ey) {
                    ey eyVar4 = (ey) r2Var;
                    if (eyVar4.p4()) {
                        MessagesStorage.TopicKey topicKey = eyVar4.p2;
                        if (topicKey.dialogId == j10) {
                            this.Q0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            V0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new t3(this, 25));
        }
        View view = this.fragmentView;
        be1 be1Var = new be1(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, be1Var);
        return this.fragmentView;
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
                yh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
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
                V0(false, true);
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
                V0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            V0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                c9 c9Var = this.G0;
                if (c9Var != null) {
                    c9Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            V0(false, false);
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
                    V0(false, false);
                    return;
                }
                return;
            }
            if (this.Q0 != longValue2) {
                this.Q0 = longValue2;
                V0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.bh
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.bh
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.H0;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ye1 ye1Var = this.r0;
        if (ye1Var != null && ye1Var.W != null) {
            int i10 = org.telegram.ui.Cells.z3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.y6.d6 : org.telegram.ui.ActionBar.y6.s8);
        if (this.actionBar.q()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.bh
    public final org.telegram.ui.Components.po o() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.t(this.p0.T(false));
            }
        } else if (z10) {
            C0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.g(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        messagesController.loadFullChat(j10, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.openedChatChanged);
        V0(false, false);
        f61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = q1;
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

    @Override // org.telegram.ui.ActionBar.r2
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
        ey eyVar = this.M0;
        if (eyVar == null || eyVar.G3 == null) {
            return;
        }
        eyVar.getActionBar().setSearchAvatarImageView(null);
        this.M0.G3.M = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.a);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.a;
        topicsController.onTopicFragmentResume(j10);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new d9(this, 10));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            L0(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        hh.c cVar = this.j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.o6.b(getThemedColor(org.telegram.ui.ActionBar.y6.de))) != this.p1) {
            this.p1 = b10;
            org.telegram.ui.ActionBar.y6.E1(this.W0.getBackground(), b10, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.A(getThemedColor(org.telegram.ui.ActionBar.y6.G8), true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false, true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.F8), true, true);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.y6.I5), true);
        }
        b20 b20Var = this.P0;
        if (b20Var != null && (b20Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.d6), 100));
        }
        P0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            }
            hw hwVar = this.w;
            if (hwVar != null) {
                hwVar.i();
            }
            if (this.actionBar != null && this.b1) {
                T0();
            }
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.y8));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.p0;
            if (w0Var == null || w0Var.getSearchField() == null) {
                return;
            }
            this.p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.Wd));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        vw vwVar;
        b20 b20Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (b20Var = this.P0) != null) {
            if (b20Var.getParent() != null) {
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
            ey eyVar = this.L0;
            if (eyVar != null) {
                eyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.I) {
            removeSelfFromStack();
            ey eyVar2 = this.M0;
            if (eyVar2 == null || (vwVar = eyVar2.G3) == null || !vwVar.c()) {
                return;
            }
            this.M0.G3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        b20 b20Var = this.P0;
        if (b20Var == null || b20Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.P0.setAlpha(1.0f - f7);
        } else {
            this.P0.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override // org.telegram.ui.ActionBar.r2
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

    @Override // org.telegram.ui.qg0
    public final void s() {
        this.N.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.po poVar = this.f;
        if (poVar != null) {
            poVar.setAlpha(f7);
            this.q0.setAlpha(f7);
            org.telegram.ui.ActionBar.w0 w0Var = this.p0;
            if (w0Var != null) {
                w0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.po poVar = this.f;
        if (poVar != null) {
            poVar.setAlpha(f7);
            this.f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ch.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.g1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
        ey eyVar = this.M0;
        View view = eyVar != null ? eyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = eyVar != null ? eyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.f1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.n1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.o1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.M0 != null ? 2 : 1, this.m1);
        fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // org.telegram.ui.qg0
    public final hh.d y() {
        return this.i1;
    }

    public final void y0() {
        ee1 ee1Var;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        if (topicsController.endIsReached(j10) || (ee1Var = this.F) == null) {
            return;
        }
        int N0 = ee1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        A0();
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (this.H0 != null && ((str = this.y0) != null || this.z0)) {
            org.telegram.ui.Components.voip.g2.l(chat, str, false, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y0 = null;
            this.z0 = false;
        } else {
            if (this.y0 == null || !z10 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.qg0
    public final /* synthetic */ void D() {
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
