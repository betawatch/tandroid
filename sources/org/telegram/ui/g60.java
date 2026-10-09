package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g60 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, me.d {
    public static g60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final w5 A2;
    public final me.b A3;
    public TLObject B0;
    public final e60 B1;
    public final LongSparseIntArray B2;
    public final me.e B3;
    public final Paint C0;
    public final ph.i C1;
    public final b40 C2;
    public final me.b C3;
    public final ArrayList D0;
    public t20 D1;
    public final z30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.i40 E1;
    public LinearLayout E2;
    public final j40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final i40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.ck0 G2;
    public final g40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.ck0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.kl0 K;
    public final org.telegram.ui.Components.ck0 K0;
    public final f60[] K1;
    public final View K2;
    public final k50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.r6 M;
    public final org.telegram.ui.Components.da M0;
    public f60 M1;
    public final int[] M2;
    public final r30 N;
    public final org.telegram.ui.Components.da N0;
    public f60 N1;
    public final v30 N2;
    public final c50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final a60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final m50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final p40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final n40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.j5 U;
    public final v50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final l50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.j5 W;
    public float W0;
    public boolean W1;
    public final v40 W2;
    public final u50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.e4 X2;
    public final org.telegram.ui.Components.e00 Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.u Z2;
    public int a0;
    public ChatObject.Call a1;
    public final y30 a2;
    public org.telegram.ui.Components.i30 a3;
    public final a40 b;
    public final ImageView b0;
    public final boolean b1;
    public final d40 b2;
    public boolean b3;
    public final f30 c;
    public final lh.h c0;
    public final String c1;
    public final q40 c2;
    public boolean c3;
    public final AccountInstance d;
    public final int d0;
    public final b60 d1;
    public float d2;
    public int d3;
    public final l30 e;
    public final RadialProgressView e0;
    public final q30 e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout e2;
    public AnimatorSet e3;
    public final org.telegram.ui.Components.voip.v2 f;
    public final Drawable f0;
    public final s30 f1;
    public boolean f2;
    public g50 f3;
    public final View g0;
    public final Paint g1;
    public boolean g2;
    public int g3;
    public final org.telegram.ui.Components.voip.v2 h;
    public AnimatorSet h0;
    public ValueAnimator h1;
    public org.telegram.ui.Components.m50 h2;
    public int h3;
    public LaunchActivity i0;
    public float i1;
    public n50 i2;
    public int i3;
    public final UndoView[] j0;
    public final LinearLayout j1;
    public Boolean j2;
    public int j3;
    public final org.telegram.ui.Cells.k k0;
    public final org.telegram.ui.ActionBar.v0 k1;
    public int k2;
    public int k3;
    public boolean l0;
    public final org.telegram.ui.ActionBar.v0 l1;
    public boolean l2;
    public int l3;
    public org.telegram.ui.Components.z40 m0;
    public final org.telegram.ui.ActionBar.v0 m1;
    public final u30 m2;
    public int m3;
    public final org.telegram.ui.Components.voip.v2 n;
    public org.telegram.ui.Components.z40 n0;
    public final org.telegram.ui.ActionBar.f1 n1;
    public final org.telegram.ui.Components.qm0 n2;
    public int n3;
    public int o0;
    public final org.telegram.ui.ActionBar.f1 o1;
    public final l60 o2;
    public int o3;
    public r50 p0;
    public final org.telegram.ui.ActionBar.f1 p1;
    public final org.telegram.ui.Components.j30 p2;
    public int p3;
    public final ArrayList q0;
    public final org.telegram.ui.ActionBar.f1 q1;
    public ViewTreeObserver.OnPreDrawListener q2;
    public int q3;
    public final org.telegram.ui.Components.voip.v2 r;
    public b50 r0;
    public final org.telegram.ui.ActionBar.f1 r1;
    public final org.telegram.ui.Components.voip.h r2;
    public int r3;
    public final org.telegram.ui.Components.voip.v2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.f1 s1;
    public boolean s2;
    public int s3;
    public long t0;
    public final org.telegram.ui.ActionBar.f1 t1;
    public final ArrayList t2;
    public int t3;
    public boolean u0;
    public final org.telegram.ui.ActionBar.f1 u1;
    public boolean u2;
    public int u3;
    public final org.telegram.ui.Components.voip.v2 v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.f1 v1;
    public final t20 v2;
    public int v3;
    public final org.telegram.ui.Components.voip.v2 w;
    public boolean w0;
    public final org.telegram.ui.ActionBar.f1 w1;
    public final p30 w2;
    public final h50 w3;
    public final m30 x;
    public boolean x0;
    public final org.telegram.ui.ActionBar.f1 x1;
    public final org.telegram.ui.Components.vh x2;
    public Boolean x3;
    public final ImageView y;
    public float y0;
    public final org.telegram.ui.ActionBar.f1 y1;
    public final t20 y2;
    public Integer y3;
    public s40 z0;
    public final LinearLayout z1;
    public boolean z2;
    public final me.b z3;

    public g60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.e6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        final g60 g60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.j0 = new UndoView[2];
        this.q0 = new ArrayList();
        this.v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new ph.i(new t20(this, 8));
        int i11 = 0;
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new f60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.r2 = new org.telegram.ui.Components.voip.h();
        this.t2 = new ArrayList();
        this.v2 = new t20(this, i11);
        this.w2 = new p30(this);
        this.x2 = new org.telegram.ui.Components.vh(19);
        this.y2 = new t20(this, 1);
        this.z2 = false;
        this.A2 = new w5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.d3 = -1;
        this.w3 = new h50(this);
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f;
        this.z3 = new me.b(2, this, hsVar, 350L);
        this.A3 = new me.b(3, this, hsVar, 220L, true);
        this.B3 = new me.e(4, this, hsVar, 350L);
        this.C3 = new me.b(5, this, hsVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.b1 = z10;
        this.resourcesProvider = new ai.a1();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new k40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new v40(this);
        setOnDismissListener(new x20(this, i11));
        setDimBehindAlpha(75);
        a60 a60Var = new a60(this, launchActivity);
        this.P = a60Var;
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(true);
        int i12 = org.telegram.ui.ActionBar.i6.qg;
        hqVar.b(org.telegram.ui.ActionBar.i6.v0(i12));
        hqVar.d();
        c50 c50Var = new c50(this, launchActivity, hqVar);
        this.O = c50Var;
        c50Var.setSubtitle("");
        c50Var.getSubtitleTextView().setVisibility(0);
        c50Var.l();
        c50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(c50Var.getAdditionalSubtitleTextView(), this.u2, 1.0f, false);
        c50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.i6.v0(i12));
        int i13 = org.telegram.ui.ActionBar.i6.lg;
        c50Var.setSubtitleColor(org.telegram.ui.ActionBar.i6.v0(i13));
        c50Var.setBackButtonImage(R.drawable.ic_ab_back);
        c50Var.setOccupyStatusBar(false);
        c50Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.i6.hg;
        c50Var.D(org.telegram.ui.ActionBar.i6.v0(i14), false);
        c50Var.C(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.z8), false);
        c50Var.setTitleColor(org.telegram.ui.ActionBar.i6.v0(i14));
        c50Var.setSubtitleColor(org.telegram.ui.ActionBar.i6.v0(i13));
        c50Var.setActionBarMenuOnItemClick(new j50(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.A0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new q20(this, 3);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = ck0Var;
        this.K0 = new org.telegram.ui.Components.ck0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        k50 k50Var = new k50(this, launchActivity);
        this.L = k50Var;
        this.containerView = k50Var;
        k50Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.Z = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.U = j5Var;
            j5Var.setGravity(17);
            j5Var.setTextColor(-1);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setTextSize(18);
            j5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(j5Var, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 311.0f, -2, 49));
            l50 l50Var = new l50(this, launchActivity);
            this.V = l50Var;
            l50Var.setGravity(17);
            l50Var.setTextColor(-1);
            l50Var.setTypeface(AndroidUtilities.bold());
            l50Var.setTextSize(60);
            this.containerView.addView(l50Var, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 231.0f, -2, 49));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.W = j5Var2;
            j5Var2.setGravity(17);
            j5Var2.setTextColor(-1);
            j5Var2.setTypeface(AndroidUtilities.bold());
            j5Var2.setTextSize(18);
            this.containerView.addView(j5Var2, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 201.0f, -2, 49));
        }
        if (s1()) {
            v50 v50Var = new v50(this, launchActivity);
            this.U0 = v50Var;
            this.containerView.addView(v50Var, w7.x5.a(80.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 51));
        }
        m50 m50Var = new m50(this, launchActivity);
        this.Q = m50Var;
        m50Var.setClipToPadding(false);
        m50Var.setClipChildren(false);
        u50 u50Var = new u50(this);
        this.X = u50Var;
        u50Var.o = hsVar;
        u50Var.d = 350L;
        u50Var.c = 350L;
        u50Var.e = 350L;
        u50Var.S();
        m50Var.setItemAnimator(u50Var);
        m50Var.setOnScrollListener(new e30(this));
        m50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(F3 ? 6 : 2, m50Var);
        this.Y = e00Var;
        m50Var.setLayoutManager(e00Var);
        f30 f30Var = new f30(this);
        this.c = f30Var;
        e00Var.z1(f30Var);
        m50Var.i(new g30(this));
        e00Var.C1();
        this.containerView.addView(m50Var, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 231.0f, -1, 51));
        m50Var.setAdapter(a60Var);
        m50Var.setTopBottomSelectorRadius(13);
        m50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.eg));
        m50Var.setOnItemClickListener(new a7(this, launchActivity, call, 14));
        m50Var.setOnItemLongClickListener(new q20(this, 4));
        if (s1()) {
            e60 e60Var = new e60(this, getContext());
            this.B1 = e60Var;
            this.containerView.addView(e60Var, w7.x5.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 49));
        }
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(launchActivity);
        this.n2 = qm0Var;
        this.containerView.addView(qm0Var, w7.x5.a(-1.0f, 14.0f, 14.0f, 324.0f, 14.0f, -1, 51));
        l60 l60Var = new l60(call, this.currentAccount, this);
        this.o2 = l60Var;
        qm0Var.setAdapter(l60Var);
        s4.s sVar = new s4.s(6, false);
        qm0Var.setLayoutManager(sVar);
        sVar.z1(new i30(this));
        final int i16 = 1;
        qm0Var.setOnItemClickListener(new org.telegram.ui.Components.em0(this) { // from class: org.telegram.ui.s20
            public final /* synthetic */ g60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.em0
            public final void d(int i17, View view) {
                switch (i16) {
                    case 0:
                        g60 g60Var2 = this.b;
                        g60Var2.getClass();
                        org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) view;
                        if (i30Var.getVideoParticipant() != null) {
                            g60Var2.f1(i30Var.getVideoParticipant());
                            break;
                        } else {
                            g60Var2.f1(new ChatObject.VideoParticipant(i30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        g60 g60Var3 = this.b;
                        g60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            g60Var3.f1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.o = hsVar;
        jVar.d = 350L;
        jVar.c = 350L;
        jVar.e = 350L;
        qm0Var.setItemAnimator(new j30(this));
        qm0Var.setOnScrollListener(new k30(this));
        l60Var.H(qm0Var, false, false);
        qm0Var.setVisibility(8);
        l30 l30Var = new l30(this, launchActivity);
        this.e = l30Var;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(9);
        this.M0 = daVar;
        org.telegram.ui.Components.da daVar2 = new org.telegram.ui.Components.da(12);
        this.N0 = daVar2;
        daVar.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        daVar.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        daVar.b();
        daVar2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        daVar2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        daVar2.b();
        int i17 = org.telegram.ui.ActionBar.i6.Ig;
        daVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i17), 38));
        daVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i17), 76));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.r = v2Var;
        v2Var.setCheckable(true);
        v2Var.setTextSize(12);
        l30Var.a(v2Var);
        v2Var.setOnClickListener(new r20(this, 7));
        org.telegram.ui.Components.voip.v2 v2Var2 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.n = v2Var2;
        v2Var2.setCheckable(true);
        v2Var2.setTextSize(12);
        v2Var2.d(false, false);
        v2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        v2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.v2 v2Var3 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f = v2Var3;
        v2Var3.setCheckable(true);
        v2Var3.setTextSize(12);
        v2Var3.d(false, false);
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(launchActivity);
        v2Var3.addView(fk0Var, w7.x5.a(32.0f, 0.0f, 10.0f, 0.0f, 0.0f, 32, 1));
        org.telegram.ui.Components.ck0 ck0Var2 = new org.telegram.ui.Components.ck0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = ck0Var2;
        fk0Var.setAnimation(ck0Var2);
        v2Var3.setOnClickListener(new r20(this, 10));
        l30Var.a(v2Var3);
        org.telegram.ui.Components.voip.v2 v2Var4 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.h = v2Var4;
        v2Var4.setCheckable(true);
        v2Var4.setTextSize(12);
        v2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i18 = R.drawable.filled_sound_on;
        this.a0 = i18;
        imageView.setImageResource(i18);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        v2Var4.addView(imageView, w7.x5.a(30.0f, 0.0f, 11.0f, 0.0f, 0.0f, 30, 1));
        v2Var4.setOnClickListener(new r20(this, 11));
        l30Var.a(v2Var4);
        l30Var.a(v2Var2);
        org.telegram.ui.Components.voip.v2 v2Var5 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.s = v2Var5;
        v2Var5.setTextSize(12);
        v2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i19 = 1;
        v2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w20
            public final /* synthetic */ g60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        g60.q(this.b, launchActivity);
                        break;
                    default:
                        g60 g60Var2 = this.b;
                        g60Var2.a2.e();
                        ChatObject.Call call2 = g60Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            g60Var2.J1();
                            g60.u1(launchActivity, new t20(g60Var2, 5), false, false);
                            break;
                        } else {
                            g60Var2.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.v2 v2Var6 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.v = v2Var6;
        v2Var6.setCheckable(true);
        v2Var6.b(true, false);
        v2Var6.setTextSize(12);
        v2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        m30 m30Var = new m30(this, launchActivity);
        this.x = m30Var;
        m30Var.setAnimation(ck0Var);
        m30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.v2 v2Var7 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.w = v2Var7;
        v2Var7.setDrawBackground(false);
        v2Var7.setTextSize(12);
        v2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        v2Var7.addView(m30Var, w7.x5.e(50, 50, 49));
        l30Var.a(v2Var7);
        v2Var7.setOnClickListener(new o30(this));
        l30Var.a(v2Var6);
        l30Var.a(v2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        v2Var7.addView(imageView2, w7.x5.a(24.0f, 0.0f, 13.0f, 0.0f, 0.0f, 24, 49));
        if (this.a1 != null && s1() && !this.a1.isScheduled()) {
            imageView2.setVisibility(0);
            m30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Og));
        c50Var.setAlpha(0.0f);
        c50Var.getBackButton().setScaleX(0.9f);
        c50Var.getBackButton().setScaleY(0.9f);
        c50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        c50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        c50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        c50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int i20 = 0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.i6.v0(i14));
        this.k1 = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setIcon(R.drawable.ic_ab_other);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var.setSubMenuOpenSide(2);
        v0Var.setDelegate(new q20(this, i20));
        int i21 = org.telegram.ui.ActionBar.i6.ig;
        v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i21), 6));
        v0Var.setOnClickListener(new r20(this, i20));
        v0Var.G(org.telegram.ui.ActionBar.i6.v0(i14), false);
        v0Var.G(org.telegram.ui.ActionBar.i6.v0(i14), true);
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.i6.v0(i14));
        this.l1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.msg_voice_pip);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        v0Var2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i21), 6));
        v0Var2.setOnClickListener(new r20(this, 1));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.i6.v0(i14));
        this.m1 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        v0Var3.setIcon(R.drawable.msg_screencast);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i21), 6));
        v0Var3.setOnClickListener(new r20(this, 2));
        q30 q30Var = new q30(this, launchActivity, launchActivity);
        this.e1 = q30Var;
        r30 r30Var = new r30(launchActivity);
        this.N = r30Var;
        r30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        paint2.setColor(-12761513);
        s30 s30Var = new s30(this, getContext());
        this.f1 = s30Var;
        s30Var.setTextColor(getThemedColor(i14));
        s30Var.setTextSize(1, 11.0f);
        s30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        s30Var.setMaxLines(1);
        s30Var.setGravity(17);
        s30Var.setTypeface(AndroidUtilities.bold());
        s30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        s30Var.setTag(-1);
        if (!s1()) {
            s30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(q30Var, w7.x5.l(1.0f, 0, -2));
        linearLayout.addView(s30Var, w7.x5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(r30Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(linearLayout, w7.x5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -2, 51));
        this.containerView.addView(c50Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(v0Var3, w7.x5.n(48, 48));
        linearLayout2.addView(v0Var2, w7.x5.n(48, 48));
        linearLayout2.addView(v0Var, w7.x5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.x5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.V5));
        this.containerView.addView(view, w7.x5.d(1.0f, -1));
        for (int i22 = 0; i22 < 2; i22++) {
            this.j0[i22] = new t30(this, launchActivity);
            this.j0[i22].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.j0[i22].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.j0[i22], w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.k1.setShowSubmenuByMove(false);
        int i23 = org.telegram.ui.ActionBar.i6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(i23), 6, 6));
        org.telegram.ui.ActionBar.v0 v0Var4 = this.k1;
        org.telegram.ui.ActionBar.f1 d = v0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, v0Var4.m0);
        this.u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.v0 v0Var5 = this.k1;
        org.telegram.ui.ActionBar.f1 d10 = v0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, v0Var5.m0);
        this.v1 = d10;
        d10.j(false, true);
        int i24 = org.telegram.ui.ActionBar.i6.wg;
        d.setCheckColor(i24);
        d.c(org.telegram.ui.ActionBar.i6.v0(i24), org.telegram.ui.ActionBar.i6.v0(i24));
        d10.setCheckColor(i24);
        d10.c(org.telegram.ui.ActionBar.i6.v0(i24), org.telegram.ui.ActionBar.i6.v0(i24));
        Paint paint3 = new Paint(1);
        int i25 = org.telegram.ui.ActionBar.i6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.i6.v0(i25));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.v0 v0Var6 = this.k1;
        org.telegram.ui.ActionBar.f1 d11 = v0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, v0Var6.m0);
        this.p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.v0 v0Var7 = this.k1;
        org.telegram.ui.ActionBar.f1 d12 = v0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, v0Var7.m0);
        this.q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.v0 v0Var8 = this.k1;
        org.telegram.ui.ActionBar.f1 d13 = v0Var8.d(6, R.drawable.msg_edit, this.d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, v0Var8.m0);
        this.o1 = d13;
        org.telegram.ui.ActionBar.v0 v0Var9 = this.k1;
        org.telegram.ui.ActionBar.f1 d14 = v0Var9.d(7, R.drawable.msg_permissions, this.d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, v0Var9.m0);
        this.r1 = d14;
        org.telegram.ui.ActionBar.f1 e7 = this.k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.n1 = e7;
        b60 b60Var = new b60();
        this.d1 = b60Var;
        org.telegram.ui.ActionBar.f1 e10 = this.k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.t1 = e10;
        org.telegram.ui.ActionBar.v0 v0Var10 = this.k1;
        org.telegram.ui.ActionBar.f1 d15 = v0Var10.d(5, 0, b60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, v0Var10.m0);
        this.s1 = d15;
        b60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.f1 e11 = this.k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.x1 = e11;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.f1 e12 = this.k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.y1 = e12;
        org.telegram.ui.ActionBar.v0 v0Var11 = this.k1;
        int i26 = R.drawable.msg_cancel;
        if (p1()) {
            i10 = i25;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i25;
        }
        int i27 = 4;
        org.telegram.ui.ActionBar.f1 e13 = v0Var11.e(4, i26, string);
        this.w1 = e13;
        this.k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.i6.v0(i23));
        this.k1.getPopupLayout().setFitItems(true);
        e11.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        e12.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        d11.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        d12.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        int i28 = org.telegram.ui.ActionBar.i6.vg;
        e13.c(org.telegram.ui.ActionBar.i6.v0(i28), org.telegram.ui.ActionBar.i6.v0(i28));
        e7.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        d13.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        d14.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        d15.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        e10.c(org.telegram.ui.ActionBar.i6.v0(i10), org.telegram.ui.ActionBar.i6.v0(i10));
        if (this.a1 != null) {
            m1();
        }
        if (p1()) {
            this.p0 = new r50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new r20(this, 3));
        u30 u30Var = new u30(this, launchActivity);
        this.m2 = u30Var;
        v30 v30Var = new v30(this);
        this.N2 = v30Var;
        final int i29 = 0;
        u30Var.setClipToPadding(false);
        v30Var.S();
        v30Var.o = org.telegram.ui.Components.hs.f;
        v30Var.d = 350L;
        v30Var.c = 350L;
        v30Var.e = 350L;
        u30Var.setItemAnimator(v30Var);
        u30Var.setOnScrollListener(new w30(this));
        u30Var.setClipChildren(false);
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        u30Var.setLayoutManager(d0Var);
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(call, this.currentAccount, this);
        this.p2 = j30Var;
        u30Var.setAdapter(j30Var);
        j30Var.F(u30Var, false);
        u30Var.setOnItemClickListener(new org.telegram.ui.Components.em0(this) { // from class: org.telegram.ui.s20
            public final /* synthetic */ g60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.em0
            public final void d(int i172, View view2) {
                switch (i29) {
                    case 0:
                        g60 g60Var2 = this.b;
                        g60Var2.getClass();
                        org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) view2;
                        if (i30Var.getVideoParticipant() != null) {
                            g60Var2.f1(i30Var.getVideoParticipant());
                            break;
                        } else {
                            g60Var2.f1(new ChatObject.VideoParticipant(i30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        g60 g60Var3 = this.b;
                        g60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            g60Var3.f1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        u30Var.setOnItemLongClickListener(new q20(this, 1));
        u30Var.setVisibility(8);
        u30Var.i(new x30());
        y30 y30Var = new y30(this, launchActivity, this.Q, u30Var, this.Y1, this.a1, this);
        this.a2 = y30Var;
        y30Var.setClipChildren(false);
        j30Var.E(this.Y1, y30Var);
        if (this.n2 != null) {
            this.o2.G(this.Y1, y30Var);
        }
        z30 z30Var = new z30(this, launchActivity);
        this.D2 = z30Var;
        a40 a40Var = new a40(this, launchActivity, this.O, this.Q, z30Var);
        this.b = a40Var;
        a40Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        a40Var.setInvalidateWithParent(true);
        z30Var.setProfileGalleryView(a40Var);
        b40 b40Var = new b40(this, launchActivity);
        this.C2 = b40Var;
        b40Var.setVisibility(8);
        a40Var.setVisibility(0);
        a40Var.b(new c40(this));
        d40 d40Var = new d40(this, launchActivity);
        this.b2 = d40Var;
        this.containerView.addView(y30Var);
        y30Var.addView(u30Var, w7.x5.a(80.0f, 0.0f, 0.0f, 0.0f, 100.0f, -1, 80));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.x5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.x5.e(-1, 0, 83));
        lh.h hVar = new lh.h(launchActivity);
        this.c0 = hVar;
        hVar.setDelegate(new e40(this));
        hVar.setClickCellDelegate(new f40(this));
        if (this.a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(launchActivity, false, true, true);
        this.M = r6Var;
        r6Var.setGravity(17);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTextColor(-1);
        r6Var.b(0.4f, 320L, org.telegram.ui.Components.hs.h);
        r6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        g40 g40Var = new g40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = g40Var;
        g40Var.J = true;
        g40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.d0)});
        g40Var.getEditText().setLinkTextColor(-11683585);
        g40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        g40Var.getEditText().addTextChangedListener(new h40(this));
        g40Var.s();
        i40 i40Var = new i40(this, launchActivity);
        this.G = i40Var;
        this.containerView.addView(i40Var, w7.x5.d(-1.0f, -1));
        j40 j40Var = new j40(launchActivity);
        this.F = j40Var;
        j40Var.addView(g40Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 80));
        j40Var.addView(r6Var, w7.x5.a(16.0f, 0.0f, 0.0f, 0.0f, 32.0f, 52, 85));
        r6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(j40Var, w7.x5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i30 = org.telegram.ui.ActionBar.i6.i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i30), 1, -1));
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new r20(this, i27));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i30), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new r20(this, 5));
        j40Var.addView(imageView3, w7.x5.e(48, 48, 85));
        j40Var.addView(imageView4, w7.x5.e(48, 48, 85));
        this.containerView.addView(d40Var);
        b40Var.addView(a40Var, w7.x5.d(-1.0f, -1));
        b40Var.addView(z30Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.containerView.addView(b40Var, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 0));
        P0(false);
        this.P.l();
        if (G3) {
            this.o2.I(this.n2, false);
        }
        this.I0 = this.P.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.S = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.Z0) && (chat2 = this.Z0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 100.0f, -2, 81));
            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(launchActivity);
            ud0Var.setTextColor(-1);
            ud0Var.setSelectorColor(-9598483);
            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ud0Var.setItemCount(5);
            l40 l40Var = new l40(launchActivity);
            l40Var.setItemCount(5);
            l40Var.setTextColor(-1);
            l40Var.setSelectorColor(-9598483);
            l40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            m40 m40Var = new m40(launchActivity);
            m40Var.setItemCount(5);
            m40Var.setTextColor(-1);
            m40Var.setSelectorColor(-9598483);
            m40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            n40 n40Var = new n40(launchActivity);
            this.T = n40Var;
            n40Var.setLines(1);
            n40Var.setSingleLine(true);
            n40Var.setEllipsize(TextUtils.TruncateAt.END);
            n40Var.setGravity(17);
            n40Var.setTextColor(-1);
            n40Var.setTypeface(AndroidUtilities.bold());
            n40Var.setTextSize(1, 14.0f);
            this.containerView.addView(n40Var, w7.x5.a(48.0f, 21.0f, 0.0f, 21.0f, 20.5f, -1, 81));
            launchActivity2 = launchActivity;
            n40Var.setOnClickListener(new org.telegram.messenger.video.g(this, ud0Var, l40Var, m40Var, chat, accountInstance, inputPeer2, 1));
            p40 p40Var = new p40(launchActivity2, ud0Var, l40Var, m40Var);
            this.R = p40Var;
            p40Var.setWeightSum(1.0f);
            p40Var.setOrientation(0);
            this.containerView.addView(p40Var, w7.x5.a(270.0f, 0.0f, 50.0f, 0.0f, 0.0f, -1, 51));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i31 = calendar.get(1);
            int i32 = calendar.get(6);
            p40Var.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(365);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setFormatter(new v20(currentTimeMillis, calendar, i31, 0));
            a1.d dVar = new a1.d(this, ud0Var, l40Var, m40Var, 11);
            g60Var = this;
            ud0Var.setOnValueChangedListener(dVar);
            l40Var.setMinValue(0);
            l40Var.setMaxValue(23);
            p40Var.addView(l40Var, w7.x5.l(0.2f, 0, 270));
            l40Var.setFormatter(new org.telegram.ui.Components.fe0(28));
            l40Var.setOnValueChangedListener(dVar);
            m40Var.setMinValue(0);
            m40Var.setMaxValue(59);
            m40Var.setValue(0);
            m40Var.setFormatter(new org.telegram.ui.Components.fe0(29));
            p40Var.addView(m40Var, w7.x5.l(0.3f, 0, 270));
            m40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i33 = calendar.get(6);
            int i34 = calendar.get(12);
            int i35 = calendar.get(11);
            ud0Var.setValue(i32 != i33 ? 1 : 0);
            m40Var.setValue(i34);
            l40Var.setValue(i35);
            org.telegram.ui.Components.g5.f(n40Var, textView, 0L, 604800L, 2, ud0Var, l40Var, m40Var);
        } else {
            launchActivity2 = launchActivity;
            g60Var = this;
        }
        q40 q40Var = new q40(g60Var, (ViewGroup) g60Var.getWindow().getDecorView(), g60Var.containerView);
        g60Var.c2 = q40Var;
        q40Var.E = new r40(g60Var);
        a40Var.setPinchToZoomHelper(q40Var);
        final int i36 = 0;
        g60Var.n.setOnClickListener(new View.OnClickListener(g60Var) { // from class: org.telegram.ui.w20
            public final /* synthetic */ g60 b;

            {
                this.b = g60Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i36) {
                    case 0:
                        g60.q(this.b, launchActivity2);
                        break;
                    default:
                        g60 g60Var2 = this.b;
                        g60Var2.a2.e();
                        ChatObject.Call call2 = g60Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            g60Var2.J1();
                            g60.u1(launchActivity2, new t20(g60Var2, 5), false, false);
                            break;
                        } else {
                            g60Var2.dismiss();
                            break;
                        }
                }
            }
        });
        g60Var.M1(false);
        g60Var.J1();
        g60Var.N1(false);
        g60Var.O1(false, false);
        g60Var.C1(0.0f);
        g60Var.P1();
        g60Var.containerView.addView(new FrameLayout(launchActivity2), w7.x5.e(-1, 200, 87));
        g60Var.v.setOnClickListener(new r20(g60Var, 6));
        g60Var.U0();
        w7.z5.a(g60Var.n);
        w7.z5.a(g60Var.r);
        w7.z5.a(g60Var.f);
        w7.z5.a(g60Var.h);
        w7.z5.a(g60Var.w);
        w7.z5.a(g60Var.s);
        w7.z5.a(g60Var.v);
        r0.i0.l(g60Var.containerView, new q20(g60Var, 2));
    }

    public static /* synthetic */ void B(g60 g60Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            g60Var.y1(null, j3, 3);
        } else {
            org.telegram.ui.Components.g5.e0(g60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.n2) g60Var.i0.O().getFragmentStack().get(g60Var.i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public static String B0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static r0.k1 C(g60 g60Var, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        g40 g40Var = g60Var.H;
        int max = Math.max(f10.d, (g40Var.N || g40Var.e) ? g40Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = g60Var.b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (g40Var.getEmojiView() != null) {
            g40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (g60Var.S2) {
            ViewGroup viewGroup = g60Var.containerView;
            int i10 = g60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = g60Var.containerView;
            int i11 = g60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.a + i11, f7.b, i11 + f7.c, f7.d);
        }
        g60Var.containerView.requestLayout();
        if (max == 0 && !g40Var.N && !g40Var.e && !g40Var.O) {
            g40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.kl0 kl0Var = g60Var.K;
            if (kl0Var == null) {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                kl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.kl0 kl0Var2 = new org.telegram.ui.Components.kl0(1, g60Var.currentAccount, g60Var.getContext(), R, g60Var.resourcesProvider);
                    g60Var.K = kl0Var2;
                    kl0Var2.setDelegate(new i50(g60Var));
                    g60Var.containerView.addView(g60Var.K, w7.x5.e(-2, 52, 81));
                    g60Var.K.p(null, null, false);
                    g60Var.G.bringToFront();
                    g60Var.F.bringToFront();
                    kl0Var = g60Var.K;
                }
            }
            g60Var.K = kl0Var;
        }
        g40Var.H(f10.d, false);
        g60Var.C1.k(k1Var);
        return r0.k1.b;
    }

    public static void C0(g60 g60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (g60Var.n0 == null) {
            org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(g60Var.getContext(), 8);
            g60Var.n0 = z40Var;
            z40Var.setAlpha(0.0f);
            g60Var.n0.setVisibility(4);
            g60Var.n0.setShowingDuration(4000L);
            g60Var.containerView.addView(g60Var.n0, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            g60Var.n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            g60Var.n0.d();
        }
        g60Var.n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        g60Var.n0.f(g60Var.w, true);
    }

    public static void D(g60 g60Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        b2Var.dismiss();
        boolean z10 = false;
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.ad(g60Var.topBulletinContainer, new ai.a1()).f0(tL_error, false);
                return;
            }
            return;
        }
        Context context = g60Var.getContext();
        int i10 = g60Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.e6 e6Var = g60Var.resourcesProvider;
        ChatObject.Call call = g60Var.a1;
        if (call != null && (groupCall = call.call) != null && groupCall.creator) {
            z10 = true;
        }
        j9.o0(context, i10, inputGroupCall, str, e6Var, false, z10);
    }

    public static /* synthetic */ void E(g60 g60Var, int[] iArr, float[] fArr) {
        s4.d1 K;
        u30 u30Var = g60Var.m2;
        y30 y30Var = g60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = g60Var.a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (y30Var.b) {
                    for (int i11 = 0; i11 < u30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) u30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(i30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            i30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (g60Var.s0 ? g60Var.D0 : g60Var.a1.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = g60Var.Q.K(indexOf + g60Var.P.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == g60Var.X2 && !g60Var.l2) {
                                g60Var.containerView.invalidate();
                            }
                        }
                    }
                }
                y30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void F(g60 g60Var) {
        Editable text = g60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(g60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        g60Var.B1(tL_textWithEntities);
    }

    public static void G0(g60 g60Var) {
        ChatObject.Call call = g60Var.a1;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = g60Var.a1.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(g60Var.a1.call.join_muted);
        ConnectionsManager connectionsManager = g60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new c30(g60Var, 1));
    }

    public static void H0(g60 g60Var, boolean z10) {
        if (g60Var.a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = g60Var.a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        g60Var.x3 = Boolean.valueOf(z10);
        g60Var.I1(true);
        ConnectionsManager connectionsManager = g60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new c30(g60Var, 0));
    }

    public static void I0(g60 g60Var) {
        int i10;
        if (!g60Var.s1()) {
            g60Var.isFullscreen = false;
            return;
        }
        y30 y30Var = g60Var.a2;
        boolean z10 = (!y30Var.V && y30Var.b && (F3 == g60Var.r1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = g60Var.j2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = g60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                g60Var.getWindow().clearFlags(1024);
                g60Var.setHideSystemVerticalInsets(false);
            } else {
                g60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                g60Var.getWindow().addFlags(1024);
            }
            g60Var.containerView.setSystemUiVisibility(i10);
            g60Var.j2 = Boolean.valueOf(z10);
            g60Var.S2 = !z10;
            g60Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l J0(g60 g60Var) {
        m50 m50Var = g60Var.Q;
        for (int i10 = 0; i10 < m50Var.getChildCount(); i10++) {
            View childAt = m50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void K0(g60 g60Var) {
        c50 c50Var = g60Var.O;
        m50 m50Var = g60Var.Q;
        int childCount = m50Var.getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(m50Var.getChildAt(i10)) >= 0) {
                f7 = Math.min(f7, r8.getTop());
            }
        }
        if (f7 < 0.0f || f7 == 2.14748365E9f) {
            f7 = childCount != 0 ? 0.0f : m50Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f7 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f7 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && c50Var.getTag() == null) || (!z10 && c50Var.getTag() != null)) {
            c50Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = g60Var.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                g60Var.h0 = null;
            }
            g60Var.setUseLightStatusBar(c50Var.getTag() == null);
            ViewPropertyAnimator duration = c50Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f;
            duration.setInterpolator(hsVar).start();
            c50Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(hsVar).start();
            ObjectAnimator objectAnimator = g60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                g60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = c50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.j5, Float>) property, c50Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            g60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            g60Var.U2.setInterpolator(hsVar);
            g60Var.U2.addListener(new org.telegram.ui.Components.fa(29, g60Var, z10));
            g60Var.U2.start();
            ObjectAnimator objectAnimator2 = g60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c50Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.j5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            g60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            g60Var.V2.setInterpolator(hsVar);
            g60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            g60Var.h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = g60Var.h0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(c50Var, (Property<c50, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(g60Var.N, (Property<r30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(g60Var.g0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            g60Var.h0.addListener(new a50(g60Var, i11));
            g60Var.h0.start();
            g60Var.a2.v.setClickable(!z10 || F3);
        }
        if (g60Var.y0 != dp) {
            g60Var.F1(dp);
        }
    }

    public static void O(g60 g60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (g60Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(g60Var.Y1, g60Var.a2, lVar, null, null, lVar.getParticipant(), g60Var.a1, g60Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void T(g60 g60Var, int i10, int[] iArr) {
        if (g60Var.s1()) {
            int i11 = org.telegram.ui.ActionBar.i6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Lg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.zg, false), g60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kg, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false), g60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.yg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.zg, false), g60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Bg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Cg, false), g60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ag, false);
        } else if (q1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.i6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Mg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ng, false), g60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kg, false), org.telegram.ui.ActionBar.i6.x0(null, i12, false), g60Var.U1, 1.0f);
        }
        if (q1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ih, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Fg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Jg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ig, false));
        }
    }

    public static void d1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                D3 = new g60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                D3 = new g60(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            D3.i0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(18));
        }
    }

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i10 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioRoutingPhone) : LocaleController.getString(R.string.VoipAudioRoutingHeadset);
        }
        if (i10 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public static String h1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i10 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str) : i10 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioSwitchedToPhone) : LocaleController.getString(R.string.VoipAudioSwitchedToHeadset) : LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public static /* synthetic */ void o(g60 g60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(declineconferencecallinvite, new b30(g60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(g60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = g60Var.a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            g60Var.a1.invitedUsersMap.remove(l4);
            g60Var.a1.invitedUsersMessageIds.remove(l4);
            g60Var.P0(true);
        }
    }

    public static void p(final g60 g60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = g60Var.d;
        ArrayList arrayList = g60Var.F0;
        a60 a60Var = g60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            g60Var.f1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.e4) {
            g60Var.G1((org.telegram.ui.Cells.e4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l4 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.w3)) {
            if (i10 != a60Var.w) {
                if (i10 != a60Var.x) {
                    if (i10 == a60Var.y) {
                        g60Var.w1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = g60Var.a1;
                if (call2 == null || call2.call == null) {
                    return;
                }
                tg.m1 m1Var = new tg.m1(activity, g60Var.currentAccount, null, 4, new ai.a1());
                ChatObject.Call call3 = g60Var.a1;
                m1Var.C0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new k8(4)).collect(Collectors.toSet()) : null);
                m1Var.i0(false, true);
                m1Var.A0 = new t20(g60Var, 3);
                m1Var.i0(false, true);
                m1Var.D0 = new ai.m0(14, g60Var, call);
                m1Var.show();
                return;
            }
            if (ChatObject.isChannel(g60Var.Z0) && (chat = g60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                g60Var.k1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(g60Var.j1());
            if (chatFull == null) {
                return;
            }
            g60Var.w0 = false;
            Context context = g60Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = g60Var.Z0;
            ChatObject.Call call4 = g60Var.a1;
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            g60Var.E1 = i40Var;
            i40Var.setOnDismissListener(new x20(g60Var, 2));
            org.telegram.ui.Components.i40 i40Var2 = g60Var.E1;
            i40Var2.g0 = new h30(g60Var);
            i40Var2.show();
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        if (w3Var.getUser() == null) {
            return;
        }
        if (!g60Var.p1()) {
            g60Var.i0.K0(g60Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w3Var.getUser().id);
            if (w3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            g60Var.i0.p0(new ProfileActivity(bundle, null));
            g60Var.dismiss();
            return;
        }
        int i11 = i10 - a60Var.n;
        if (i11 < 0 || i11 >= g60Var.a1.shadyJoinParticipants.size()) {
            int i12 = i10 - a60Var.s;
            if (i12 < 0 || i12 >= g60Var.a1.shadyLeftParticipants.size()) {
                int i13 = i10 - a60Var.f;
                if (g60Var.s0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l4 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < g60Var.a1.invitedUsers.size()) {
                    l4 = g60Var.a1.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l4 = g60Var.a1.shadyLeftParticipants.get(i10 - a60Var.s);
            }
        } else {
            l4 = g60Var.a1.shadyJoinParticipants.get(i10 - a60Var.n);
        }
        if (z10 || (invitedUser = g60Var.a1.invitedUsersMessageIds.get(l4)) == null) {
            return;
        }
        org.telegram.ui.Components.p80 F = org.telegram.ui.Components.p80.F(g60Var.container, g60Var.resourcesProvider, w3Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(g60Var) { // from class: org.telegram.ui.z20
            public final /* synthetic */ g60 b;

            {
                this.b = g60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        g60.t(this.b, invitedUser, l4);
                        break;
                    default:
                        g60.o(this.b, invitedUser, l4);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(g60Var) { // from class: org.telegram.ui.z20
            public final /* synthetic */ g60 b;

            {
                this.b = g60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        g60.t(this.b, invitedUser, l4);
                        break;
                    default:
                        g60.o(this.b, invitedUser, l4);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), g60Var.C0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void q(g60 g60Var, Activity activity) {
        LaunchActivity launchActivity = g60Var.i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            g60Var.i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            g60Var.O1(true, false);
            g60Var.N1(false);
            g60Var.a1.sortParticipants();
            g60Var.P0(true);
            g60Var.e.requestLayout();
            return;
        }
        g60Var.j0[0].e(1, false);
        if (g60Var.z0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            s40 s40Var = new s40(g60Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            g60Var.z0 = s40Var;
            s40Var.setBottomPadding(g60Var.containerView.getPaddingBottom());
            g60Var.container.addView(g60Var.z0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static boolean q1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void r(g60 g60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g60Var.d2 = floatValue;
        g60Var.a2.n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        b40 b40Var = g60Var.C2;
        b40Var.setScaleX(f12);
        b40Var.setScaleY(f12);
        b40Var.setTranslationX((1.0f - g60Var.d2) * f10);
        b40Var.setTranslationY((1.0f - g60Var.d2) * f11);
        if (!g60Var.g2) {
            g60Var.W2.setAlpha((int) (g60Var.d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.u uVar = g60Var.Z2;
        if (uVar != null) {
            uVar.a.setRoundCorners((1.0f - g60Var.d2) * AndroidUtilities.dp(8.0f));
        }
        b40Var.invalidate();
        g60Var.containerView.invalidate();
        a40 a40Var = g60Var.b;
        int i11 = (int) ((1.0f - g60Var.d2) * i10);
        a40Var.N(i11, i11);
    }

    public static /* synthetic */ void s(g60 g60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = g60Var.a1;
        if (call2 == null || (groupCall = call2.call) == null) {
            return;
        }
        String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            g60Var.a1.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = g60Var.a1.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(g60Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new ei.b1(g60Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        g60Var.P0(true);
        if (!bool.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
            return;
        }
        sharedInstance.createCaptureDevice(false);
        if (!sharedInstance.isFrontFaceCamera()) {
            sharedInstance.switchCamera();
        }
        sharedInstance.requestVideoCall(false);
        sharedInstance.setVideoState(false, 2);
        sharedInstance.setMicMute(false, false, true);
        sharedInstance.switchToSpeaker();
        g60Var.O1(true, true);
    }

    public static /* synthetic */ void t(g60 g60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(declineconferencecallinvite, new b30(g60Var, 1));
        ChatObject.Call call = g60Var.a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            g60Var.P0(true);
        }
    }

    public static /* synthetic */ void u(g60 g60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void u1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        ChatObject.Call call = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        if (z11 || !ChatObject.canManageCalls(chat)) {
            x1(call, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        if (sharedInstance.isConference()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
            a2VarArr[0] = a2Var;
            a2Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
            if (z10) {
                a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
            } else {
                a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.i6.rg;
                int i11 = org.telegram.ui.ActionBar.i6.pg;
                int i12 = org.telegram.ui.ActionBar.i6.ng;
                checkBoxSquare.s = i10;
                checkBoxSquare.v = i11;
                checkBoxSquare.w = i12;
                checkBoxSquare.invalidate();
            }
            a2VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
            } else {
                a2VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
            }
            a2VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            e7.addView(a2VarArr[0], w7.x5.n(-1, -2));
            a2VarArr[0].setOnClickListener(new u20(a2VarArr, 0));
        }
        alertDialog$Builder.n(e7);
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.i6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ci.y6(call, a2VarArr, selfId, runnable, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.P0 = false;
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                b2Var.getWindow().setType(2038);
            } else {
                b2Var.getWindow().setType(2003);
            }
            b2Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            b2Var.i(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false));
        }
        b2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.vg, false));
        }
        b2Var.o(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hg, false));
    }

    public static void v(g60 g60Var) {
        g60Var.Z0();
        g60Var.W0();
        g60Var.V0();
        g60Var.F.setTranslationY((-g60Var.C1.d()) + g60Var.containerView.getPaddingBottom());
        g60Var.G.invalidate();
        g60Var.a1();
        g60Var.containerView.invalidate();
    }

    public static /* synthetic */ void w(g60 g60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void x(g60 g60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(g60Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(g60Var, updates, j3, 25));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0(g60Var, hashSet, call, str, 9));
    }

    public static void x1(ChatObject.Call call, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j3);
            if (groupCallParticipant != null) {
                call.participants.e(j3);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i10).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i11 = 0; i11 < call.sortedParticipants.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static /* synthetic */ void y(g60 g60Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(g60Var.currentAccount).getUser(l4));
            getrequirementstocontact.id.add(MessagesController.getInstance(g60Var.currentAccount).getInputUser(longValue));
        }
        ai.n3 n3Var = new ai.n3(g60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(g60Var.currentAccount).isPremium()) {
            n3Var.run();
        } else {
            ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(getrequirementstocontact, new ba(arrayList, arrayList2, n3Var, 13));
        }
    }

    public static /* synthetic */ void z(g60 g60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(34, g60Var.currentAccount, U.getContext(), U, new ai.a1());
        j0Var.J1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public final void A1() {
        w5 w5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (!this.z2 || this.U0 == null || VoIPService.getSharedInstance() == null || !s1() || this.Q == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(w5Var, 30L);
    }

    public final void B1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.H.setText("");
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.a1;
        long j3 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j3, inputGroupCall);
    }

    public final void C1(float f7) {
        this.U1 = f7;
        y30 y30Var = this.a2;
        float max = Math.max(f7, y30Var == null ? 0.0f : y30Var.c);
        int i10 = org.telegram.ui.ActionBar.i6.jg;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.i6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.i6.x0(null, i11, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.k1.B(-14472653);
        this.f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.tg, false), f7, 1.0f);
        r50 r50Var = this.p0;
        if (r50Var != null) {
            r50Var.j = offsetColor2;
            q50 q50Var = r50Var.g;
            if (q50Var != null) {
                q50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        m50 m50Var = this.Q;
        m50Var.setGlowColor(offsetColor2);
        int i12 = this.F1;
        if (i12 == 3 || q1(i12)) {
            this.w.invalidate();
        }
        View view = this.J2;
        if (view != null) {
            int i13 = this.V1;
            int[] iArr = this.M2;
            iArr[0] = i13;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.L2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.L2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.K2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Dg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Eg, false), f7, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.lg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.mg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.resourcesProvider);
        int childCount = m50Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = m50Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (p1()) {
                    x3Var.a(w02, w02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                c50 c50Var = this.O;
                if (z10) {
                    ((org.telegram.ui.Cells.e4) childAt).f(c50Var.getTag() != null ? org.telegram.ui.ActionBar.i6.rg : org.telegram.ui.ActionBar.i6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    ((org.telegram.ui.Cells.w3) childAt).a(c50Var.getTag() != null ? org.telegram.ui.ActionBar.i6.rg : org.telegram.ui.ActionBar.i6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        m50Var.invalidate();
        this.container.invalidate();
    }

    public final void D1(float f7) {
        m50 m50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s4.d1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f7 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.a1;
        if (call == null || (m50Var = this.Q) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) == null) {
            return;
        }
        y30 y30Var = this.a2;
        if (y30Var.b) {
            int i10 = 0;
            while (true) {
                u30 u30Var = this.m2;
                if (i10 >= u30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) u30Var.getChildAt(i10);
                if (MessageObject.getPeerId(i30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    i30Var.setAmplitude(f7 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.s0 ? this.D0 : this.a1.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = m50Var.K(indexOf + this.P.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) view).setAmplitude(f7 * 15.0f);
                    if (view == this.X2 && !this.l2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        y30Var.k(groupCallParticipant, f7 * 15.0f);
    }

    public final void E1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.g3 = i10;
        this.h3 = i11;
        this.i3 = i12;
        this.j3 = i13;
        this.k3 = i14;
        this.l3 = i15;
        this.m3 = i16;
        this.n3 = i17;
        this.o3 = i18;
        this.p3 = i19;
        this.q3 = i20;
        this.r3 = i21;
        this.s3 = i22;
        this.t3 = i23;
        this.u3 = i24;
        this.v3 = i25;
    }

    public final void F1(float f7) {
        int i10;
        this.y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f7 - AndroidUtilities.dp(74.0f);
        float f10 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        v50 v50Var = this.U0;
        y30 y30Var = this.a2;
        s30 s30Var = this.f1;
        q30 q30Var = this.e1;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (v50Var != null) {
                v50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                C1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            q30Var.setScaleX(Math.max(0.9f, f11));
            q30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            q30Var.setAlpha((1.0f - y30Var.c) * Math.max(0.0f, f12));
            s30Var.setScaleX(Math.max(0.9f, f11));
            s30Var.setScaleY(Math.max(0.9f, f11));
            s30Var.setAlpha((1.0f - y30Var.c) * Math.max(0.0f, f12));
        } else {
            q30Var.setScaleX(1.0f);
            q30Var.setScaleY(1.0f);
            q30Var.setAlpha(1.0f - y30Var.c);
            s30Var.setScaleX(1.0f);
            s30Var.setScaleY(1.0f);
            s30Var.setAlpha(1.0f - y30Var.c);
            if (this.U1 > 1.0E-4f) {
                C1(0.0f);
            }
            i10 = 0;
        }
        Z0();
        float f13 = i10;
        this.z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (v50Var != null) {
            v50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        p40 p40Var = this.R;
        if (p40Var != null) {
            p40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        R1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x02d2, code lost:
    
        if ((r14 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02ec, code lost:
    
        if (r25 == (-j1())) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028f, code lost:
    
        if (r7.admin_rights.manage_call != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r4v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G1(View view) {
        org.telegram.ui.Cells.e4 e4Var;
        d60 d60Var;
        long j3;
        ci.w5 w5Var;
        org.telegram.ui.ActionBar.v1 v1Var;
        AccountInstance accountInstance;
        boolean z10;
        long j10;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j11;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z11;
        n50 n50Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        float y3;
        float y10;
        int measuredHeight;
        int i10;
        int i11;
        ?? r42;
        boolean z12;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.X.k() && getContext() != null) {
            if (this.c3 || this.f2) {
                e1(true);
                return false;
            }
            g50 g50Var = this.f3;
            if (g50Var != null) {
                g50Var.dismiss();
                this.f3 = null;
                return false;
            }
            c1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.a1.videoNotAvailableParticipant) {
                    e4Var = new org.telegram.ui.Cells.e4(lVar.getContext());
                    e4Var.e(this.d, lVar.getParticipant().participant, this.a1, MessageObject.getPeerId(this.A0), null, false);
                    org.telegram.ui.Components.q5 q5Var = e4Var.s;
                    if (q5Var != null) {
                        q5Var.f();
                    }
                    this.b3 = false;
                    this.Y2 = lVar;
                    this.Z2 = lVar.getRenderer();
                    if (!G3 && !F3) {
                        this.containerView.addView(e4Var, w7.x5.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
                    }
                    if (e4Var != null) {
                        boolean z13 = (F3 || G3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = e4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ni(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new q20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.E2 = linearLayout;
                            ci.w5 w5Var2 = new ci.w5(getContext(), linearLayout, linearLayout2, 7);
                            w5Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            w5Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.tg, false), this.U1, 1.0f);
                            if (linearLayout2 == null || e4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                d60Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                w5Var2.addView(linearLayout2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                d60Var = new d60(this, getContext(), participant);
                                linearLayout2.addView(d60Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            w5Var2.addView(linearLayout, w7.x5.k(0.0f, d60Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.v1 v1Var2 = new org.telegram.ui.ActionBar.v1(getContext(), R.style.scrollbarShapeStyle, w5Var2);
                            v1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(v1Var2, w7.x5.d(-2.0f, -2));
                            d60 d60Var2 = d60Var;
                            long peerId = MessageObject.getPeerId(participant.peer);
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            boolean z14 = z13;
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            AccountInstance accountInstance2 = this.d;
                            if (z15) {
                                accountInstance = accountInstance2;
                                if (ChatObject.isChannel(this.Z0)) {
                                    j3 = peerId;
                                    w5Var = w5Var2;
                                    v1Var = v1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, j1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z10 = true;
                                    }
                                    z10 = false;
                                } else {
                                    j3 = peerId;
                                    w5Var = w5Var2;
                                    v1Var = v1Var2;
                                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j1());
                                    if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                        int size = chatParticipants.participants.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= size) {
                                                break;
                                            }
                                            TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                                            TLRPC.ChatFull chatFull2 = chatFull;
                                            int i13 = size;
                                            if (chatParticipant.user_id != participant.peer.user_id) {
                                                i12++;
                                                chatFull = chatFull2;
                                                size = i13;
                                            } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                }
                            } else {
                                j3 = peerId;
                                w5Var = w5Var2;
                                v1Var = v1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (e4Var.c()) {
                                if (p1() && e4Var.K) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    org.telegram.ui.Cells.c1.k(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(e4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                org.telegram.ui.Cells.c1.k(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j3 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                org.telegram.ui.Cells.c1.k(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j3 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                org.telegram.ui.Cells.c1.k(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j10 = 0;
                            } else if (R0()) {
                                if (!p1() && z10 && participant.muted) {
                                    if (p1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j10 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j10 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.c1.k(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                                    j10 = 0;
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j12 = peer.channel_id;
                                    if (j12 != j10 && !ChatObject.isMegagroup(this.currentAccount, j12)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (p1() ? !(z10 || !ChatObject.canBlockUsers(this.Z0)) : !((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            org.telegram.ui.Cells.c1.k(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (p1()) {
                                }
                            } else {
                                j10 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    org.telegram.ui.Cells.c1.m(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    org.telegram.ui.Cells.c1.k(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j13 = peer2.channel_id;
                                    if (j13 != 0 && !ChatObject.isMegagroup(this.currentAccount, j13)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.i6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    f1Var.c(org.telegram.ui.ActionBar.i6.x0(null, i15, false), org.telegram.ui.ActionBar.i6.x0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i16 = org.telegram.ui.ActionBar.i6.vg;
                                    f1Var.c(org.telegram.ui.ActionBar.i6.x0(null, i16, false), org.telegram.ui.ActionBar.i6.x0(null, i16, false));
                                }
                                f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.x0(r42, org.telegram.ui.ActionBar.i6.eg, z12));
                                f1Var.g((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(f1Var);
                                f1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                f1Var.setOnClickListener(new ai.u7(this, i14, arrayList4, groupCallParticipant, 3));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            v1Var.addView(w5Var, w7.x5.x(-2, -2, 51));
                            m50 m50Var = this.Q;
                            m50Var.B0();
                            this.Y.X = false;
                            this.X2 = e4Var;
                            e4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            m50Var.invalidate();
                            AnimatorSet animatorSet = this.e3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.e2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (j3 > j10) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1);
                                j11 = j3;
                                if (MessagesController.getInstance(this.currentAccount).getUserFull(j11) == null) {
                                    MessagesController.getInstance(this.currentAccount).loadUserInfo(user, false, 0);
                                }
                            } else {
                                j11 = j3;
                                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j11));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), chat, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), chat, 1);
                            }
                            org.telegram.ui.Components.voip.u uVar = this.Z2;
                            boolean z16 = uVar != null && uVar.v;
                            if (forUserOrChat != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.y9 avatarImageView = this.X2.getAvatarImageView();
                                    a40 a40Var = this.b;
                                    a40Var.setParentAvatarImage(avatarImageView);
                                    a40Var.setHasActiveVideo(z16);
                                    a40Var.M(j11, true);
                                    a40Var.setCreateThumbFromParent(true);
                                    a40Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.u uVar2 = this.Z2;
                                    if (uVar2 != null) {
                                        uVar2.h = true;
                                        uVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.A0) == j11 && this.h2 != null && (n50Var = this.i2) != null && (fileLocation = n50Var.c) != null) {
                                        a40Var.A(n50Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.e2, w7.x5.d(-2.0f, -2));
                                this.g2 = true;
                                d40 d40Var = this.b2;
                                if (d40Var == null) {
                                    i11 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    this.i0.O().getView().draw(canvas);
                                    canvas.drawColor(i0.a.k(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    this.F2 = true;
                                    this.containerView.draw(canvas);
                                    i11 = 0;
                                    this.F2 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    d40Var.setBackground(new BitmapDrawable(createBitmap));
                                    d40Var.setAlpha(0.0f);
                                    d40Var.setVisibility(0);
                                    d40Var.bringToFront();
                                }
                                this.c3 = true;
                                this.C2.setVisibility(i11);
                                if (d60Var2 != null) {
                                    d60Var2.invalidate();
                                }
                                z1(true, e4Var);
                                org.telegram.ui.Components.i30 i30Var = this.a3;
                                if (i30Var != null) {
                                    i30Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.f2 = false;
                            g50 g50Var2 = new g50(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.f3 = g50Var2;
                            g50Var2.e = true;
                            g50Var2.c = 220;
                            g50Var2.setOutsideTouchable(true);
                            this.f3.setClippingEnabled(true);
                            this.f3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.f3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.f3.setInputMethodMode(2);
                            this.f3.setSoftInputMode(0);
                            this.f3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.i30 i30Var2 = this.a3;
                            if (i30Var2 != null) {
                                boolean z17 = F3;
                                y30 y30Var = this.a2;
                                u30 u30Var = this.m2;
                                if (z17) {
                                    x10 = AndroidUtilities.dp(32.0f) + (((int) (y30Var.getX() + (u30Var.getX() + i30Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (y30Var.getY() + (u30Var.getY() + this.a3.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x10 = ((int) (y30Var.getX() + (u30Var.getX() + i30Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y3 = (y30Var.getY() + (u30Var.getY() + this.a3.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y3;
                                }
                            } else {
                                x10 = (int) (((m50Var.getX() + m50Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.b3) {
                                    y10 = e4Var.getY() + m50Var.getY();
                                    measuredHeight = e4Var.getClipHeight();
                                } else if (this.Y2 != null) {
                                    y10 = this.Y2.getY() + m50Var.getY();
                                    measuredHeight = this.Y2.getMeasuredHeight();
                                } else {
                                    y3 = m50Var.getY();
                                    i10 = (int) y3;
                                }
                                i10 = (int) (y10 + measuredHeight);
                            }
                            this.f3.showAtLocation(m50Var, 51, x10, i10);
                            this.e3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.W2, org.telegram.ui.Components.u6.b, 0, 100));
                            this.e3.playTogether(arrayList5);
                            this.e3.setDuration(150L);
                            this.e3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.i30) {
                    org.telegram.ui.Components.i30 i30Var3 = (org.telegram.ui.Components.i30) view;
                    if (i30Var3.getParticipant() != this.a1.videoNotAvailableParticipant.participant) {
                        e4Var = new org.telegram.ui.Cells.e4(i30Var3.getContext());
                        e4Var.e(this.d, i30Var3.getParticipant(), this.a1, MessageObject.getPeerId(this.A0), null, false);
                        org.telegram.ui.Components.q5 q5Var2 = e4Var.s;
                        if (q5Var2 != null) {
                            q5Var2.f();
                        }
                        this.b3 = false;
                        this.a3 = i30Var3;
                        org.telegram.ui.Components.voip.u renderer = i30Var3.getRenderer();
                        this.Z2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Z2 = null;
                        }
                        this.containerView.addView(e4Var, w7.x5.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
                    }
                } else {
                    e4Var = (org.telegram.ui.Cells.e4) view;
                    this.b3 = true;
                }
                if (e4Var != null) {
                }
            }
        }
        return false;
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(8, getContext(), null, true);
            this.m0 = z40Var;
            z40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                this.m0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.m0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.m0.d();
        }
        this.m0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.m0.f(view, true);
    }

    public final void I1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.v2 v2Var = this.v;
        org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
        org.telegram.ui.Components.voip.v2 v2Var3 = this.r;
        org.telegram.ui.Components.voip.v2 v2Var4 = this.f;
        org.telegram.ui.Components.voip.v2 v2Var5 = this.n;
        org.telegram.ui.Components.voip.v2 v2Var6 = this.s;
        org.telegram.ui.Components.voip.v2 v2Var7 = this.w;
        l30 l30Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            l30Var.c(v2Var7, this.V0 > 0.1f, z10);
            l30Var.c(v2Var6, this.V0 > 0.1f, z10);
            l30Var.c(v2Var3, this.V0 > 0.1f, z10);
            l30Var.c(v2Var5, false, z10);
            l30Var.c(v2Var4, false, z10);
            l30Var.c(v2Var2, false, z10);
            l30Var.c(v2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || R0()) ? false : true;
        Boolean bool = this.x3;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.a1.call;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.a1.canRecordVideo()) && !z16) || s1()) {
            z12 = false;
            z15 = true;
        } else {
            z12 = true;
        }
        if (z16) {
            z14 = true;
            z13 = false;
        } else {
            z13 = !z17;
            z14 = false;
        }
        if (F3) {
            z13 = false;
            z14 = false;
        }
        l30Var.c(v2Var7, true, z10);
        l30Var.c(v2Var6, true, z10);
        l30Var.c(v2Var5, z12, z10);
        l30Var.c(v2Var4, z14, z10);
        l30Var.c(v2Var3, z15, z10);
        l30Var.c(v2Var2, z13, z10);
        l30Var.c(v2Var, z11, z10);
    }

    public final void J1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.a1;
        org.telegram.ui.ActionBar.v0 v0Var = this.k1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            v0Var2.setVisibility(8);
            if (this.a1 == null) {
                v0Var.setVisibility(8);
                return;
            }
        }
        if (this.l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat3 != null) {
            this.Z0 = chat3;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.f1 f1Var = this.n1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.Z0) || ((chat2 = this.Z0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.Z0) || ChatObject.canUserDoAdminAction(this.Z0, 3))) || (ChatObject.isChannel(this.Z0) && (chat = this.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            f1Var.setVisibility(0);
        } else {
            f1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.a1;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.y1;
        org.telegram.ui.ActionBar.f1 f1Var3 = this.x1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            f1Var3.setVisibility(8);
            f1Var2.setVisibility(8);
        } else {
            f1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            f1Var2.setVisibility(this.a1.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.a1;
        org.telegram.ui.ActionBar.f1 f1Var4 = this.q1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            f1Var4.setVisibility(8);
        } else {
            f1Var4.setVisibility(0);
        }
        f1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        f1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean R0 = R0();
        org.telegram.ui.ActionBar.f1 f1Var5 = this.w1;
        org.telegram.ui.ActionBar.f1 f1Var6 = this.o1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.f1 f1Var7 = this.s1;
        org.telegram.ui.ActionBar.f1 f1Var8 = this.t1;
        if (R0) {
            f1Var5.setVisibility(0);
            f1Var6.setVisibility(0);
            if (s1()) {
                f1Var7.setVisibility(0);
                f1Var8.setVisibility(8);
            } else if (this.a1.isScheduled()) {
                f1Var7.setVisibility(8);
                f1Var8.setVisibility(8);
            } else {
                f1Var7.setVisibility(0);
            }
            if (p1()) {
                f1Var7.setVisibility(8);
                f1Var6.setVisibility(8);
            }
            if (!this.a1.canRecordVideo() || this.a1.isScheduled() || s1()) {
                f1Var8.setVisibility(8);
            } else {
                f1Var8.setVisibility(0);
            }
            v0Var2.setVisibility(8);
            boolean z11 = this.a1.recording;
            b60 b60Var = this.d1;
            b60Var.f = z11;
            b60Var.d = 1.0f;
            b60Var.invalidateSelf();
            if (this.a1.recording) {
                if (this.D1 == null) {
                    t20 t20Var = new t20(this, 6);
                    this.D1 = t20Var;
                    AndroidUtilities.runOnUIThread(t20Var, 1000L);
                }
                f1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                t20 t20Var2 = this.D1;
                if (t20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t20Var2);
                    this.D1 = null;
                }
                f1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            L1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || R0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.a1.canRecordVideo() || z13) || this.a1.isScheduled() || s1())) {
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(8);
            } else if (z13) {
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(0);
                f1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                f1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                f1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(0);
            }
            f1Var5.setVisibility(8);
            f1Var6.setVisibility(8);
            f1Var7.setVisibility(8);
        }
        boolean R02 = R0();
        org.telegram.ui.ActionBar.f1 f1Var9 = this.r1;
        if (R02 && this.a1.call.can_change_join_muted && !p1()) {
            f1Var9.setVisibility(0);
        } else {
            f1Var9.setVisibility(8);
        }
        if (p1() && ((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        v0Var.I(4, z10);
        this.p1.setVisibility((!s1() || this.a1.isScheduled()) ? 0 : 8);
        int visibility = f1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility == 0 || f1Var9.getVisibility() == 0 || f1Var.getVisibility() == 0 || f1Var8.getVisibility() == 0 || f1Var7.getVisibility() == 0 || f1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.k0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.b1) || s1() || this.A0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.A0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.Z0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !s1() || f1Var.getVisibility() != 8) {
            v0Var.setVisibility(0);
        } else {
            v0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i10, boolean z10) {
        boolean z11;
        boolean P;
        boolean P2;
        String string;
        String string2;
        boolean z12;
        String str;
        String string3;
        String string4;
        boolean P3;
        String string5;
        boolean P4;
        String string6;
        boolean P5;
        String str2;
        int i11;
        f60[] f60VarArr;
        boolean z13;
        f60 f60Var;
        f60 f60Var2;
        boolean z14;
        boolean z15;
        y30 y30Var = this.a2;
        boolean z16 = y30Var != null && y30Var.b && (AndroidUtilities.isTablet() || F3 == r1());
        if (!s1() && this.F1 == i10 && z10) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.ck0 ck0Var = this.J0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            P5 = ck0Var.P(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.F1;
                        if (i13 == 3) {
                            int i14 = ck0Var.f;
                            P3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? ck0Var.P(99) : false;
                        } else if (i13 == 5) {
                            P3 = ck0Var.P(404);
                        } else if (i13 == 7) {
                            P3 = ck0Var.P(376);
                        } else if (i13 == 6) {
                            P3 = ck0Var.P(237);
                        } else {
                            if (i13 == 2) {
                                z12 = ck0Var.P(36);
                                str = string3;
                                string2 = string4;
                                z11 = false;
                                if (s1() || i10 == i12 || this.a1.isScheduled()) {
                                    str2 = string2;
                                } else {
                                    str = LocaleController.getString(z16 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                    boolean z17 = this.G1 != z16;
                                    this.G1 = z16;
                                    z12 = z17;
                                    str2 = "";
                                }
                                String D = !TextUtils.isEmpty(str2) ? a1.g.D(str, " ", str2) : str;
                                org.telegram.ui.Components.voip.v2 v2Var = this.w;
                                v2Var.setContentDescription(D);
                                v2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                m30 m30Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i10 == 5) {
                                            ck0Var.M(376);
                                        } else if (i10 == 7) {
                                            ck0Var.M(173);
                                        } else if (i10 == 6) {
                                            ck0Var.M(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.F1;
                                            if (i15 == 5) {
                                                ck0Var.M(376);
                                            } else if (i15 == 7) {
                                                ck0Var.M(344);
                                            } else if (i15 == 6) {
                                                ck0Var.M(202);
                                            } else if (i15 == 2) {
                                                ck0Var.M(0);
                                            } else {
                                                ck0Var.M(69);
                                            }
                                        } else if (i10 == 1 || (this.F1 == 2 && p1())) {
                                            ck0Var.M(this.F1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            ck0Var.M(99);
                                        } else if (z11) {
                                            int i16 = this.F1;
                                            if (i16 == 7) {
                                                ck0Var.M(274);
                                            } else if (i16 == 6) {
                                                ck0Var.M(237);
                                            } else if (i16 == 1) {
                                                ck0Var.M(136);
                                            } else {
                                                ck0Var.M(99);
                                            }
                                        } else {
                                            int i17 = this.F1;
                                            if (i17 == 5) {
                                                ck0Var.M(376);
                                            } else if (i17 == 7) {
                                                ck0Var.M(344);
                                            } else if (i17 == 6) {
                                                ck0Var.M(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                ck0Var.M(0);
                                            } else {
                                                ck0Var.M(69);
                                            }
                                        }
                                    }
                                    m30Var.d();
                                    if (!s1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        m30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((y30Var != null && y30Var.b && (AndroidUtilities.isTablet() || F3 == r1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        m30Var.setVisibility(8);
                                    }
                                    this.F1 = i10;
                                } else {
                                    this.F1 = i10;
                                    ck0Var.N(ck0Var.f - 1, false, true);
                                    if (!s1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        m30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((y30Var != null && y30Var.b && (AndroidUtilities.isTablet() || F3 == r1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        m30Var.setVisibility(8);
                                    }
                                }
                                v2Var.invalidate();
                                i11 = this.F1;
                                f60VarArr = this.K1;
                                if (f60VarArr[i11] == null) {
                                    f60VarArr[i11] = new f60(i11);
                                    int i18 = this.F1;
                                    if (i18 == 3) {
                                        f60VarArr[i18].g = null;
                                    } else if (q1(i18)) {
                                        f60VarArr[this.F1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ih, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kh, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.F1;
                                        if (i19 != 1) {
                                            z13 = false;
                                            f60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Jg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            f60Var = f60VarArr[this.F1];
                                            f60Var2 = this.N1;
                                            if (f60Var != f60Var2) {
                                                this.M1 = f60Var2;
                                                this.N1 = f60Var;
                                                if (f60Var2 == null || !z10) {
                                                    this.L1 = 1.0f;
                                                    this.M1 = null;
                                                } else {
                                                    this.L1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                f60 f60Var3 = this.N1;
                                                if (f60Var3 != null) {
                                                    int i20 = f60Var3.i;
                                                    z15 = (i20 == 1 || i20 == 0) ? true : z13;
                                                    z14 = i20 != 3 ? true : z13;
                                                } else {
                                                    z14 = z13;
                                                    z15 = z14;
                                                }
                                                this.P1 = z15 ? 1.0f : 0.0f;
                                                this.Q1 = z14 ? 1.0f : 0.0f;
                                            }
                                            this.e.invalidate();
                                        }
                                        f60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Fg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                z13 = false;
                                f60Var = f60VarArr[this.F1];
                                f60Var2 = this.N1;
                                if (f60Var != f60Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            P3 = ck0Var.P(99);
                        }
                        z12 = P3;
                        str = string3;
                        string2 = string4;
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(p1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            P4 = ck0Var.P(this.F1 == 4 ? 99 : 69);
                        } else if (p1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            P4 = ck0Var.P(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || R0()) ? false : true;
                                if (z11) {
                                    int i21 = this.F1;
                                    if (i21 == 7) {
                                        P2 = ck0Var.P(311);
                                    } else if (i21 == 6) {
                                        P2 = ck0Var.P(274);
                                    } else if (i21 == 1) {
                                        P2 = ck0Var.P(173);
                                    } else {
                                        P = ck0Var.P(136);
                                    }
                                    P = P2;
                                } else {
                                    int i22 = this.F1;
                                    if (i22 == 5) {
                                        P2 = ck0Var.P(404);
                                    } else if (i22 == 7) {
                                        P = ck0Var.P(376);
                                    } else if (i22 == 6) {
                                        P = ck0Var.P(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        P = ck0Var.P(36);
                                    } else {
                                        P2 = ck0Var.P(99);
                                    }
                                    P = P2;
                                }
                                i12 = 3;
                                if (i10 == 3) {
                                    string = LocaleController.getString(R.string.Connecting);
                                    z12 = P;
                                    string2 = "";
                                } else {
                                    string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                    string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    z12 = P;
                                }
                                str = string;
                                if (s1()) {
                                }
                                str2 = string2;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                org.telegram.ui.Components.voip.v2 v2Var2 = this.w;
                                v2Var2.setContentDescription(D);
                                v2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                m30 m30Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                v2Var2.invalidate();
                                i11 = this.F1;
                                f60VarArr = this.K1;
                                if (f60VarArr[i11] == null) {
                                }
                                z13 = false;
                                f60Var = f60VarArr[this.F1];
                                f60Var2 = this.N1;
                                if (f60Var != f60Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            P3 = ck0Var.P(136);
                            z12 = P3;
                            str = string3;
                            string2 = string4;
                        }
                        z12 = P4;
                    }
                    z11 = false;
                    if (s1()) {
                    }
                    str2 = string2;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    org.telegram.ui.Components.voip.v2 v2Var22 = this.w;
                    v2Var22.setContentDescription(D);
                    v2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    m30 m30Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    v2Var22.invalidate();
                    i11 = this.F1;
                    f60VarArr = this.K1;
                    if (f60VarArr[i11] == null) {
                    }
                    z13 = false;
                    f60Var = f60VarArr[this.F1];
                    f60Var2 = this.N1;
                    if (f60Var != f60Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = ck0Var.P(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (s1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.v2 v2Var222 = this.w;
                v2Var222.setContentDescription(D);
                v2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                m30 m30Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                v2Var222.invalidate();
                i11 = this.F1;
                f60VarArr = this.K1;
                if (f60VarArr[i11] == null) {
                }
                z13 = false;
                f60Var = f60VarArr[this.F1];
                f60Var2 = this.N1;
                if (f60Var != f60Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            P5 = ck0Var.P(344);
        }
        string2 = "";
        str = string6;
        z12 = P5;
        z11 = false;
        if (s1()) {
        }
        str2 = string2;
        if (!TextUtils.isEmpty(str2)) {
        }
        org.telegram.ui.Components.voip.v2 v2Var2222 = this.w;
        v2Var2222.setContentDescription(D);
        v2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        m30 m30Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        v2Var2222.invalidate();
        i11 = this.F1;
        f60VarArr = this.K1;
        if (f60VarArr[i11] == null) {
        }
        z13 = false;
        f60Var = f60VarArr[this.F1];
        f60Var2 = this.N1;
        if (f60Var != f60Var2) {
        }
        if (!z10) {
        }
        this.e.invalidate();
    }

    public final void L1() {
        if (this.a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.f1 f1Var = this.s1;
        if (z10) {
            f1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            f1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        p40 p40Var = this.R;
        if ((p40Var == null || this.a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (p40Var == null) {
                return;
            }
        }
        if (!z10) {
            p30 p30Var = this.w2;
            AndroidUtilities.cancelRunOnUIThread(p30Var);
            p30Var.run();
            ChatObject.Call call = this.a1;
            m50 m50Var = this.Q;
            if (call == null || call.isScheduled()) {
                m50Var.setVisibility(4);
            } else {
                m50Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.f1 f1Var = this.w1;
            if (isChannelOrGiga) {
                f1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                f1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.hs.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f;
            this.W0 = hsVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * hsVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        p40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        l50 l50Var = this.V;
        l50Var.setAlpha(f7);
        l50Var.setScaleX(interpolation);
        l50Var.setScaleY(interpolation);
        n40 n40Var = this.T;
        n40Var.setScaleX(f11);
        n40Var.setScaleY(f11);
        n40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.k1.setAlpha(f7);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != p40Var.getVisibility()) {
            p40Var.setVisibility(i10);
            n40Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        org.telegram.ui.Components.voip.v2 v2Var = this.r;
        if (v2Var == null || v2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        l30 l30Var = this.e;
        if (sharedInstance == null || s1()) {
            v2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.Z0) || (ChatObject.hasAdminRights(this.Z0) && ChatObject.canAddUsers(this.Z0));
            kh.a aVar = (kh.a) l30Var.c.get(v2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                v2Var.setEnabled(z11);
            }
            v2Var.b(true, false);
            return;
        }
        kh.a aVar2 = (kh.a) l30Var.c.get(v2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            v2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            v2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
        } else if (z13) {
            v2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            v2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
        } else {
            v2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        }
        v2Var.b(z13, z10);
        i1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.a0 != i10) {
            this.a0 = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.b0, i10);
        }
        org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
        if (v2Var2.getVisibility() == 0) {
            v2Var2.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
            v2Var2.b(i1() != 1, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(boolean z10, boolean z11) {
        long j3;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        int i12;
        boolean z18;
        org.telegram.ui.Components.voip.v2 v2Var;
        org.telegram.ui.Components.voip.v2 v2Var2;
        org.telegram.ui.Components.voip.v2 v2Var3;
        boolean z19;
        boolean s12;
        int i13;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.v2 v2Var4 = this.s;
        int i14 = 6;
        if (call == null || call.isScheduled()) {
            if (R0()) {
                i14 = 5;
            } else if (this.a1.call.schedule_start_subscribed) {
                i14 = 7;
            }
            K1(i14, z10);
            v2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            M1(false);
            return;
        }
        I1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j3 = 0;
        } else {
            j3 = 0;
            if ((this.t0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.t0) > 3000) && ((i13 = this.T1) == 1 || i13 == 2 || i13 == 6 || i13 == 5)) {
                S0();
                K1(3, z10);
                i10 = 4;
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0();
                if (!((z13 && this.a1.canRecordVideo()) || z12) || s1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z15 = false;
                    z14 = true;
                }
                if (z12) {
                    z16 = !z13;
                    i11 = 0;
                } else {
                    z16 = false;
                    i11 = 1;
                }
                if (F3) {
                    z17 = z16;
                    i12 = i11;
                } else {
                    z17 = false;
                    i12 = 0;
                }
                int i15 = i12 + (!z15 ? 2 : 0) + (!z14 ? i10 : 0);
                y30 y30Var = this.a2;
                int i16 = i15 + ((y30Var == null && y30Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.o0 | 2) == (i16 | 2);
                this.o0 = i16;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.v2 v2Var5 = this.n;
                if (z14) {
                    v2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    v2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.v2 v2Var6 = this.f;
                if (i12 != 0) {
                    v2Var6.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    v2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.v2 v2Var7 = this.h;
                if (z17) {
                    v2Var = v2Var6;
                    v2Var2 = v2Var5;
                    v2Var3 = v2Var7;
                    z19 = z10;
                } else {
                    i1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i17 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.a0 != i17) {
                        this.a0 = i17;
                        AndroidUtilities.updateImageViewImageAnimated(this.b0, i17);
                    }
                    v2Var2 = v2Var5;
                    v2Var = v2Var6;
                    v2Var7.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
                    v2Var3 = v2Var7;
                    z19 = z10;
                    v2Var3.b(i1() != 1, z19);
                }
                org.telegram.ui.Components.voip.v2 v2Var8 = v2Var3;
                v2Var4.c(!s1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    N1(false);
                }
                v2Var2.d(true, z19);
                v2Var.d(true, z19);
                v2Var8.d(true, z19);
                s12 = s1();
                s30 s30Var = this.f1;
                if (s12) {
                    s30Var.setVisibility(8);
                } else {
                    s30Var.setVisibility(0);
                    boolean z21 = ((Integer) s30Var.getTag()).intValue() == 3;
                    int i18 = this.T1;
                    final boolean z22 = i18 == 3;
                    s30Var.setTag(Integer.valueOf(i18));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.h1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.g1;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i19 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.h1 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.y20
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i19, floatValue, 1.0f);
                                    g60 g60Var = g60.this;
                                    g60Var.g1.setColor(offsetColor);
                                    g60Var.f1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    g60Var.i1 = floatValue;
                                    v50 v50Var = g60Var.U0;
                                    if (v50Var == null || !g60Var.z2) {
                                        return;
                                    }
                                    v50Var.invalidate();
                                }
                            });
                            this.h1.setDuration(300L);
                            this.h1.setInterpolator(org.telegram.ui.Components.hs.f);
                            this.h1.addListener(new a50(this, 2));
                            this.h1.start();
                        } else {
                            paint.setColor(this.T1 == 3 ? -1163700 : -12761513);
                            s30Var.invalidate();
                        }
                    }
                }
                if (s1() || !LiteMode.isEnabled(512)) {
                }
                if (this.T1 == 3) {
                    this.z2 = true;
                    A1();
                    return;
                } else {
                    this.z2 = false;
                    AndroidUtilities.cancelRunOnUIThread(this.A2);
                    return;
                }
            }
        }
        if (this.B0 != null) {
            l1().k(0L, 37, this.B0, this.Z0, null, null);
            this.B0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || R0()) {
            i10 = 4;
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                S0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                K1(0, z10);
            } else {
                K1(1, z10);
            }
        } else {
            S0();
            if (groupCallParticipant2.raise_hand_rating != j3) {
                i10 = 4;
                K1(4, z10);
            } else {
                i10 = 4;
                K1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (F3) {
        }
        int i152 = i12 + (!z15 ? 2 : 0) + (!z14 ? i10 : 0);
        y30 y30Var2 = this.a2;
        int i162 = i152 + ((y30Var2 == null && y30Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.o0 | 2) == (i162 | 2)) {
        }
        this.o0 = i162;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.v2 v2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.v2 v2Var62 = this.f;
        if (i12 != 0) {
        }
        org.telegram.ui.Components.voip.v2 v2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.v2 v2Var82 = v2Var3;
        v2Var4.c(!s1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            N1(false);
        }
        v2Var2.d(true, z19);
        v2Var.d(true, z19);
        v2Var82.d(true, z19);
        s12 = s1();
        s30 s30Var2 = this.f1;
        if (s12) {
        }
        if (s1()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3 A[LOOP:2: B:137:0x029d->B:139:0x02a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(boolean z10) {
        m50 m50Var;
        a60 a60Var;
        y30 y30Var;
        m50 m50Var2;
        boolean z11;
        int i10;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        m50 m50Var3;
        y30 y30Var2;
        boolean z12;
        u30 u30Var;
        ?? r02;
        ?? r82;
        ChatObject.Call call;
        boolean z13;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        s4.d1 G;
        g gVar;
        int i14;
        g60 g60Var = this;
        a60 a60Var2 = g60Var.P;
        y30 y30Var3 = g60Var.a2;
        if (y30Var3 == null || (m50Var = g60Var.Q) == null || g60Var.a1 == null || g60Var.s0) {
            return;
        }
        if (y30Var3.b) {
            y30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(g60Var.a1.selfPeer);
        if (peerId != MessageObject.getPeerId(g60Var.A0) && g60Var.a1.participants.f(peerId) != null) {
            g60Var.A0 = g60Var.a1.selfPeer;
        }
        int childCount = m50Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = m50Var.getChildAt(i17);
            s4.d1 G2 = m50Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = g60Var.q0;
        arrayList3.clear();
        if (!G3) {
            arrayList3.addAll(g60Var.a1.visibleVideoParticipants);
        } else if (y30Var3.b) {
            arrayList3.addAll(g60Var.a1.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = y30Var3.e;
            if (videoParticipant3 != null) {
                arrayList3.remove(videoParticipant3);
            }
        }
        if (m50Var.getItemAnimator() != null && !z10) {
            m50Var.setItemAnimator(null);
        } else if (m50Var.getItemAnimator() == null && z10) {
            m50Var.setItemAnimator(g60Var.X);
        }
        try {
            gVar = new g(a60Var2, 21);
            try {
                try {
                    z11 = true;
                } catch (Exception e7) {
                    e = e7;
                    a60Var = a60Var2;
                    z11 = true;
                }
            } catch (Exception e10) {
                e = e10;
                a60Var = a60Var2;
                m50Var2 = m50Var;
                z11 = true;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i16;
                y30Var = y30Var3;
            }
        } catch (Exception e11) {
            e = e11;
            a60Var = a60Var2;
            y30Var = y30Var3;
            m50Var2 = m50Var;
            z11 = true;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i16;
        }
        try {
            try {
                try {
                    i14 = i16;
                    try {
                        y30Var = y30Var3;
                    } catch (Exception e12) {
                        e = e12;
                        y30Var = y30Var3;
                    }
                } catch (Exception e13) {
                    e = e13;
                    i11 = i16;
                    y30Var = y30Var3;
                    m50Var2 = m50Var;
                    i10 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e14) {
                e = e14;
                a60Var = a60Var2;
                arrayList = arrayList3;
                i11 = i16;
                y30Var = y30Var3;
                m50Var2 = m50Var;
                i10 = childCount;
            }
        } catch (Exception e15) {
            e = e15;
            a60Var = a60Var2;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i16;
            y30Var = y30Var3;
            m50Var2 = m50Var;
            FileLog.e(e);
            a60Var.l();
            g60Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList4 = g60Var.D0;
            arrayList4.clear();
            arrayList4.addAll(g60Var.a1.visibleParticipants);
            ArrayList arrayList5 = g60Var.E0;
            arrayList5.clear();
            arrayList2 = arrayList;
            arrayList5.addAll(arrayList2);
            ArrayList arrayList6 = g60Var.F0;
            arrayList6.clear();
            arrayList6.addAll(g60Var.a1.invitedUsers);
            ArrayList arrayList7 = g60Var.G0;
            arrayList7.clear();
            arrayList7.addAll(g60Var.a1.shadyJoinParticipants);
            ArrayList arrayList8 = g60Var.H0;
            arrayList8.clear();
            arrayList8.addAll(g60Var.a1.shadyLeftParticipants);
            a60 a60Var3 = a60Var;
            g60Var.I0 = a60Var3.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            m50Var3 = m50Var2;
            boolean c10 = y30Var.c();
            y30Var2 = y30Var;
            if (y30Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.j30 j30Var = g60Var.p2;
            u30Var = g60Var.m2;
            j30Var.G(u30Var, z11);
            if (u30Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (m50Var3.getVisibility() == 0) {
            }
            r02 = g60Var.Z1;
            r02.clear();
            r02.addAll(g60Var.Y1);
            while (r82 < r02.size()) {
            }
            call = g60Var.a1;
            if (call != null) {
            }
            ChatObject.Call call2 = g60Var.a1;
            if (call2 != null) {
            }
            g60Var.C3.a(z13, z10);
            if (z13 == g60Var.I2) {
            }
        }
        try {
            m50Var2 = m50Var;
            try {
                try {
                    try {
                    } catch (Exception e16) {
                        e = e16;
                    }
                } catch (Exception e17) {
                    e = e17;
                    i10 = childCount;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i11 = i14;
                    i10 = childCount;
                    g60Var = this;
                    a60Var = a60Var2;
                    try {
                        g60Var.E1(a60Var2.K, a60Var2.w, a60Var2.d, a60Var2.e, a60Var2.f, a60Var2.h, a60Var2.n, a60Var2.r, a60Var2.s, a60Var2.v, a60Var2.G, a60Var2.H, a60Var2.I, a60Var2.J, a60Var2.x, a60Var2.y);
                        a60Var.E();
                        z11 = true;
                        try {
                            s4.o.c(g60Var.w3, true).a(gVar);
                        } catch (Exception e18) {
                            e = e18;
                            FileLog.e(e);
                            a60Var.l();
                            g60Var.a1.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList42 = g60Var.D0;
                            arrayList42.clear();
                            arrayList42.addAll(g60Var.a1.visibleParticipants);
                            ArrayList arrayList52 = g60Var.E0;
                            arrayList52.clear();
                            arrayList2 = arrayList;
                            arrayList52.addAll(arrayList2);
                            ArrayList arrayList62 = g60Var.F0;
                            arrayList62.clear();
                            arrayList62.addAll(g60Var.a1.invitedUsers);
                            ArrayList arrayList72 = g60Var.G0;
                            arrayList72.clear();
                            arrayList72.addAll(g60Var.a1.shadyJoinParticipants);
                            ArrayList arrayList82 = g60Var.H0;
                            arrayList82.clear();
                            arrayList82.addAll(g60Var.a1.shadyLeftParticipants);
                            a60 a60Var32 = a60Var;
                            g60Var.I0 = a60Var32.F;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            m50Var3 = m50Var2;
                            boolean c102 = y30Var.c();
                            y30Var2 = y30Var;
                            if (y30Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.j30 j30Var2 = g60Var.p2;
                                u30Var = g60Var.m2;
                                j30Var2.G(u30Var, z11);
                                if (u30Var.getVisibility() == 0) {
                                }
                                if (G3) {
                                }
                                if (m50Var3.getVisibility() == 0) {
                                }
                                r02 = g60Var.Z1;
                                r02.clear();
                                r02.addAll(g60Var.Y1);
                                while (r82 < r02.size()) {
                                }
                                call = g60Var.a1;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = g60Var.a1;
                                if (call22 != null) {
                                }
                                g60Var.C3.a(z13, z10);
                                if (z13 == g60Var.I2) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.j30 j30Var22 = g60Var.p2;
                            u30Var = g60Var.m2;
                            j30Var22.G(u30Var, z11);
                            if (u30Var.getVisibility() == 0) {
                            }
                            if (G3) {
                            }
                            if (m50Var3.getVisibility() == 0) {
                            }
                            r02 = g60Var.Z1;
                            r02.clear();
                            r02.addAll(g60Var.Y1);
                            while (r82 < r02.size()) {
                            }
                            call = g60Var.a1;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = g60Var.a1;
                            if (call222 != null) {
                            }
                            g60Var.C3.a(z13, z10);
                            if (z13 == g60Var.I2) {
                            }
                        }
                    } catch (Exception e19) {
                        e = e19;
                        z11 = true;
                    }
                } catch (Exception e20) {
                    e = e20;
                    g60Var = this;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                    i10 = childCount;
                    a60Var = a60Var2;
                    FileLog.e(e);
                    a60Var.l();
                    g60Var.a1.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList422 = g60Var.D0;
                    arrayList422.clear();
                    arrayList422.addAll(g60Var.a1.visibleParticipants);
                    ArrayList arrayList522 = g60Var.E0;
                    arrayList522.clear();
                    arrayList2 = arrayList;
                    arrayList522.addAll(arrayList2);
                    ArrayList arrayList622 = g60Var.F0;
                    arrayList622.clear();
                    arrayList622.addAll(g60Var.a1.invitedUsers);
                    ArrayList arrayList722 = g60Var.G0;
                    arrayList722.clear();
                    arrayList722.addAll(g60Var.a1.shadyJoinParticipants);
                    ArrayList arrayList822 = g60Var.H0;
                    arrayList822.clear();
                    arrayList822.addAll(g60Var.a1.shadyLeftParticipants);
                    a60 a60Var322 = a60Var;
                    g60Var.I0 = a60Var322.F;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    m50Var3 = m50Var2;
                    boolean c1022 = y30Var.c();
                    y30Var2 = y30Var;
                    if (y30Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.j30 j30Var222 = g60Var.p2;
                    u30Var = g60Var.m2;
                    j30Var222.G(u30Var, z11);
                    if (u30Var.getVisibility() == 0) {
                    }
                    if (G3) {
                    }
                    if (m50Var3.getVisibility() == 0) {
                    }
                    r02 = g60Var.Z1;
                    r02.clear();
                    r02.addAll(g60Var.Y1);
                    while (r82 < r02.size()) {
                    }
                    call = g60Var.a1;
                    if (call != null) {
                    }
                    ChatObject.Call call2222 = g60Var.a1;
                    if (call2222 != null) {
                    }
                    g60Var.C3.a(z13, z10);
                    if (z13 == g60Var.I2) {
                    }
                }
            } catch (Exception e21) {
                e = e21;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i14;
                a60Var = a60Var2;
                FileLog.e(e);
                a60Var.l();
                g60Var.a1.saveActiveDates();
                if (view != null) {
                }
                ArrayList arrayList4222 = g60Var.D0;
                arrayList4222.clear();
                arrayList4222.addAll(g60Var.a1.visibleParticipants);
                ArrayList arrayList5222 = g60Var.E0;
                arrayList5222.clear();
                arrayList2 = arrayList;
                arrayList5222.addAll(arrayList2);
                ArrayList arrayList6222 = g60Var.F0;
                arrayList6222.clear();
                arrayList6222.addAll(g60Var.a1.invitedUsers);
                ArrayList arrayList7222 = g60Var.G0;
                arrayList7222.clear();
                arrayList7222.addAll(g60Var.a1.shadyJoinParticipants);
                ArrayList arrayList8222 = g60Var.H0;
                arrayList8222.clear();
                arrayList8222.addAll(g60Var.a1.shadyLeftParticipants);
                a60 a60Var3222 = a60Var;
                g60Var.I0 = a60Var3222.F;
                i12 = i10;
                i13 = 0;
                while (i13 < i12) {
                }
                m50Var3 = m50Var2;
                boolean c10222 = y30Var.c();
                y30Var2 = y30Var;
                if (y30Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.j30 j30Var2222 = g60Var.p2;
                u30Var = g60Var.m2;
                j30Var2222.G(u30Var, z11);
                if (u30Var.getVisibility() == 0) {
                }
                if (G3) {
                }
                if (m50Var3.getVisibility() == 0) {
                }
                r02 = g60Var.Z1;
                r02.clear();
                r02.addAll(g60Var.Y1);
                while (r82 < r02.size()) {
                }
                call = g60Var.a1;
                if (call != null) {
                }
                ChatObject.Call call22222 = g60Var.a1;
                if (call22222 != null) {
                }
                g60Var.C3.a(z13, z10);
                if (z13 == g60Var.I2) {
                }
            }
        } catch (Exception e22) {
            e = e22;
            m50Var2 = m50Var;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i14;
            a60Var = a60Var2;
            FileLog.e(e);
            a60Var.l();
            g60Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList42222 = g60Var.D0;
            arrayList42222.clear();
            arrayList42222.addAll(g60Var.a1.visibleParticipants);
            ArrayList arrayList52222 = g60Var.E0;
            arrayList52222.clear();
            arrayList2 = arrayList;
            arrayList52222.addAll(arrayList2);
            ArrayList arrayList62222 = g60Var.F0;
            arrayList62222.clear();
            arrayList62222.addAll(g60Var.a1.invitedUsers);
            ArrayList arrayList72222 = g60Var.G0;
            arrayList72222.clear();
            arrayList72222.addAll(g60Var.a1.shadyJoinParticipants);
            ArrayList arrayList82222 = g60Var.H0;
            arrayList82222.clear();
            arrayList82222.addAll(g60Var.a1.shadyLeftParticipants);
            a60 a60Var32222 = a60Var;
            g60Var.I0 = a60Var32222.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            m50Var3 = m50Var2;
            boolean c102222 = y30Var.c();
            y30Var2 = y30Var;
            if (y30Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.j30 j30Var22222 = g60Var.p2;
            u30Var = g60Var.m2;
            j30Var22222.G(u30Var, z11);
            if (u30Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (m50Var3.getVisibility() == 0) {
            }
            r02 = g60Var.Z1;
            r02.clear();
            r02.addAll(g60Var.Y1);
            while (r82 < r02.size()) {
            }
            call = g60Var.a1;
            if (call != null) {
            }
            ChatObject.Call call222222 = g60Var.a1;
            if (call222222 != null) {
            }
            g60Var.C3.a(z13, z10);
            if (z13 == g60Var.I2) {
            }
        }
        g60Var.a1.saveActiveDates();
        if (view != null) {
            g60Var.Y.h1(i11, view.getTop() - m50Var2.getPaddingTop());
        }
        ArrayList arrayList422222 = g60Var.D0;
        arrayList422222.clear();
        arrayList422222.addAll(g60Var.a1.visibleParticipants);
        ArrayList arrayList522222 = g60Var.E0;
        arrayList522222.clear();
        arrayList2 = arrayList;
        arrayList522222.addAll(arrayList2);
        ArrayList arrayList622222 = g60Var.F0;
        arrayList622222.clear();
        arrayList622222.addAll(g60Var.a1.invitedUsers);
        ArrayList arrayList722222 = g60Var.G0;
        arrayList722222.clear();
        arrayList722222.addAll(g60Var.a1.shadyJoinParticipants);
        ArrayList arrayList822222 = g60Var.H0;
        arrayList822222.clear();
        arrayList822222.addAll(g60Var.a1.shadyLeftParticipants);
        a60 a60Var322222 = a60Var;
        g60Var.I0 = a60Var322222.F;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            m50 m50Var4 = m50Var2;
            View childAt2 = m50Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.e4) || (childAt2 instanceof org.telegram.ui.Cells.w3)) && (G = m50Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt2).setDrawDivider(G.b() != a60Var322222.F + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.w3) childAt2).setDrawDivider(G.b() != a60Var322222.F + (-2) ? z11 : false);
                }
            }
            i13++;
            m50Var2 = m50Var4;
        }
        m50Var3 = m50Var2;
        boolean c1022222 = y30Var.c();
        y30Var2 = y30Var;
        if (y30Var2.b && (videoParticipant2 = y30Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, g60Var.a1)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                g60Var.f1(null);
            } else if (c1022222) {
                z12 = false;
                g60Var.f1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.j30 j30Var222222 = g60Var.p2;
            u30Var = g60Var.m2;
            j30Var222222.G(u30Var, z11);
            if (u30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(u30Var);
            }
            if (G3) {
                g60Var.o2.I(g60Var.n2, z11);
            }
            if (m50Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(m50Var3);
            }
            r02 = g60Var.Z1;
            r02.clear();
            r02.addAll(g60Var.Y1);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.u) r02.get(r82)).j(z11);
            }
            call = g60Var.a1;
            if (call != null && y30Var2.b && (videoParticipant = y30Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call2222222 = g60Var.a1;
            z13 = (call2222222 != null || call2222222.visibleVideoParticipants.isEmpty()) ? z12 : z11;
            g60Var.C3.a(z13, z10);
            if (z13 == g60Var.I2) {
                g60Var.I2 = z13;
                if (G3) {
                    g60Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.j30 j30Var2222222 = g60Var.p2;
        u30Var = g60Var.m2;
        j30Var2222222.G(u30Var, z11);
        if (u30Var.getVisibility() == 0) {
        }
        if (G3) {
        }
        if (m50Var3.getVisibility() == 0) {
        }
        r02 = g60Var.Z1;
        r02.clear();
        r02.addAll(g60Var.Y1);
        while (r82 < r02.size()) {
        }
        call = g60Var.a1;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call22222222 = g60Var.a1;
        if (call22222222 != null) {
        }
        g60Var.C3.a(z13, z10);
        if (z13 == g60Var.I2) {
        }
    }

    public final void P1() {
        boolean z10;
        e60 e60Var;
        c50 c50Var = this.O;
        if (c50Var == null || this.a1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.a1.currentSpeakingPeers.m(); i11++) {
            long j3 = this.a1.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.currentSpeakingPeers.f(j3);
            if (!groupCallParticipant.self) {
                y30 y30Var = this.a2;
                y30Var.getClass();
                if (y30Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i10 < 2) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            if (i10 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.m61(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.m61(AndroidUtilities.bold()), 0);
                            }
                        }
                    }
                    i10++;
                    if (i10 == 2) {
                        break;
                    }
                }
            }
        }
        if (i10 > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            c50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.j5 subtitleTextView = c50Var.getSubtitleTextView();
        String str = s1() ? "ViewersWatching" : "Participants";
        int i12 = this.a1.call.participants_count;
        a60 a60Var = this.P;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((a60Var.M.s1() || a60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (s1() && (e60Var = this.B1) != null) {
            e60Var.setWatchersCount(this.a1.call.participants_count);
        }
        if (z10 != this.u2) {
            this.u2 = z10;
            c50Var.invalidate();
            c50Var.getSubtitleTextView().setPivotX(0.0f);
            c50Var.getSubtitleTextView().setPivotY(c50Var.getMeasuredHeight() >> 1);
            c50Var.getSubtitleTextView().animate().scaleX(this.u2 ? 0.98f : 1.0f).scaleY(this.u2 ? 0.9f : 1.0f).alpha(this.u2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(c50Var.getAdditionalSubtitleTextView(), this.u2);
        }
    }

    public final int Q0() {
        m50 m50Var = this.Q;
        int childCount = m50Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = m50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.a1;
        q30 q30Var = this.e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                q30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                q30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        c50 c50Var = this.O;
        if (isEmpty) {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(c50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    c50Var.getTitleTextView().setOnClickListener(new r20(this, 9));
                } else {
                    c50Var.setTitle(this.Z0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.Z0)) {
                    q30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (s1()) {
                    q30Var.b(this.Z0.title, z10);
                } else {
                    q30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                c50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                q30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.a1.call.title.equals(c50Var.getTitle())) {
            if (z10) {
                this.O.J(this.a1.call.title, true, 180L, null);
                c50Var.getTitleTextView().setOnClickListener(new r20(this, 8));
            } else {
                c50Var.setTitle(this.a1.call.title);
            }
            q30Var.b(this.a1.call.title, z10);
        }
        org.telegram.ui.ActionBar.j5 titleTextView = c50Var.getTitleTextView();
        if (!this.a1.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                q30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                q30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new c60(titleTextView));
            TextView textView = q30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new c60(textView), (Drawable) null);
            TextView nextTextView = q30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new c60(nextTextView), (Drawable) null);
        }
    }

    public final boolean R0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.Z0);
        }
        ChatObject.Call call = this.a1;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.xb xbVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r0) * f7);
        } else {
            f7 = 0.0f;
        }
        this.topBulletinContainer.setTranslationY(AndroidUtilities.lerp(((-r0.getTop()) - this.topBulletinContainer.getHeight()) + f10 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), this.O.getY() + (-this.topBulletinContainer.getTop()) + r4.getHeight(), f7));
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar == null || (xbVar = tcVar.e) == null || xbVar.getParent() == null || xbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        xbVar.setTop(f7 > 0.5f);
    }

    public final void S0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0() {
        boolean z10;
        if (!this.c3) {
            d40 d40Var = this.b2;
            if (d40Var.getVisibility() == 0 && d40Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.l2 == z10) {
                    this.l2 = z10;
                    this.e.invalidate();
                    this.containerView.invalidate();
                    this.Q.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.l2 == z10) {
        }
    }

    public final void U0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        a1();
        Z0();
        X0();
        Y0();
        b1();
        this.e.setAlpha(1.0f - this.z3.e);
        V0();
        W0();
    }

    public final void V0() {
        float f7 = this.C1.b.a;
        int i10 = f7 > 0.0f ? 0 : 8;
        j40 j40Var = this.F;
        j40Var.setAlpha(f7);
        i40 i40Var = this.G;
        i40Var.setAlpha(f7);
        if (j40Var.getVisibility() != i10) {
            j40Var.setVisibility(i10);
            i40Var.setVisibility(i10);
            if (i10 == 8) {
                g40 g40Var = this.H;
                if (g40Var.isFocused()) {
                    g40Var.clearFocus();
                }
            }
        }
    }

    public final void W0() {
        org.telegram.ui.Components.kl0 kl0Var = this.K;
        if (kl0Var != null) {
            float f7 = this.C1.b.a * this.A3.e;
            kl0Var.setAlpha(f7);
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.kl0 kl0Var2 = this.K;
            if (kl0Var2.N0 || f7 != 1.0f) {
                return;
            }
            kl0Var2.N0 = true;
        }
    }

    public final void X0() {
        boolean z10 = G3;
        l30 l30Var = this.e;
        if (z10) {
            l30Var.setTranslationX(0.0f);
            l30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        me.b bVar = this.z3;
        if (z11) {
            l30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            l30Var.setTranslationY(0.0f);
        } else {
            l30Var.setTranslationX(0.0f);
            l30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        boolean z10 = G3;
        u30 u30Var = this.m2;
        if (z10) {
            u30Var.setTranslationX(0.0f);
            u30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        me.b bVar = this.z3;
        if (z11) {
            u30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            u30Var.setTranslationY(0.0f);
        } else {
            u30Var.setTranslationX(0.0f);
            u30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Z0() {
        float f7 = this.B3.e;
        ph.i iVar = this.C1;
        float lerp = AndroidUtilities.lerp(G3 ? (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f) : F3 ? 0.0f : ((this.z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.c)) - AndroidUtilities.dp(91.0f), -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        lh.h hVar = this.c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void a1() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void b1() {
        float f7 = this.A3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f7);
        ImageView imageView = this.J;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        imageView.setClickable(f7 > 0.9f);
        float f10 = 1.0f - f7;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.I;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        imageView2.setClickable(f10 > 0.9f);
    }

    public final void c1() {
        org.telegram.ui.Components.voip.u uVar = this.Z2;
        if (uVar != null) {
            uVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.u uVar2 = this.Z2;
            uVar2.h = false;
            uVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.X2;
        if (e4Var != null && !this.b3 && e4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.X2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.i30 i30Var = this.a3;
        if (i30Var != null) {
            i30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.a3 = null;
        this.Z2 = null;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.b;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i12;
        int i13;
        int i14 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        m50 m50Var = this.Q;
        int i15 = 0;
        if (i10 == i14) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.a1;
            if (call == null || call.call.id != l4.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.a1;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j3 = this.t0;
            AccountInstance accountInstance = this.d;
            if (j3 == 0 && (((i13 = this.F1) == 7 || i13 == 5 || i13 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.i0, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", j1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.b1);
                    intent.putExtra("peerChannelId", this.Y0.channel_id);
                    intent.putExtra("peerChatId", this.Y0.chat_id);
                    intent.putExtra("peerUserId", this.Y0.user_id);
                    intent.putExtra("hash", this.c1);
                    intent.putExtra("peerAccessHash", this.Y0.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.k2);
                    this.i0.startService(intent);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                this.t0 = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new t20(this, 2), 3000L);
            }
            if (!this.u0 && VoIPService.getSharedInstance() != null) {
                this.a1.addSelfDummyParticipant(false);
                m1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            J1();
            int childCount = m50Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = m50Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                }
            }
            if (this.X2 != null) {
                this.s0 = true;
            } else {
                P0(true);
            }
            P1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.F1 == 4;
            O1(true, booleanValue);
            Q1(true);
            if (z10 && ((i12 = this.F1) == 1 || i12 == 0)) {
                l1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l10 = (Long) objArr[3];
                long longValue = l10.longValue();
                if (longValue == 0 || s1()) {
                    return;
                }
                if (p1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        int size = allDialogs.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size) {
                                break;
                            }
                            TLRPC.Dialog dialog = allDialogs.get(i17);
                            i17++;
                            if (dialog.id == longValue) {
                                i15 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l10);
                    if (user != null) {
                        if (this.a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i15 != 0) {
                            l1().k(0L, 44, user, this.Z0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i15 != 0) {
                        l1().k(0L, 44, chat, this.Z0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            y30 y30Var = this.a2;
            if (y30Var.b && this.a1 != null) {
                boolean c10 = y30Var.c();
                ChatObject.Call call3 = this.a1;
                if (call3 != null && y30Var.b && (videoParticipant = y30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i18 = 0;
                    while (true) {
                        ArrayList arrayList = this.q0;
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i18);
                        if (this.a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && y30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i18++;
                    }
                    if (videoParticipant2 != null) {
                        f1(videoParticipant2);
                    }
                }
            }
            y30Var.setVisibleParticipant(true);
            P1();
            return;
        }
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            D1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.Z0) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.Z0) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog$Builder M = org.telegram.ui.Components.g5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new x20(this, 1));
                try {
                    M.o();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == j1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.a1;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            P0(true);
            AndroidUtilities.updateVisibleRows(m50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt2 = this.E2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.f1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == j1()) {
                J1();
                O1(isShowing(), false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = m50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                s4.d1 G = m50Var.G(m50Var.getChildAt(i15));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                        if (e4Var.getParticipant() != null) {
                            e4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i15++;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.a1 == null || peerId2 != l11.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            P0(true);
            AndroidUtilities.updateVisibleRows(m50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt3 = this.E2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.f1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.f1) childAt3).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            P0(true);
            AndroidUtilities.updateVisibleRows(m50Var);
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                P0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(m50Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            s40 s40Var = this.z0;
            if (s40Var != null) {
                s40Var.b(true, true);
            }
            J1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            r50 r50Var = this.p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            r50Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        LaunchActivity launchActivity = this.i0;
        launchActivity.a1.remove(this.v2);
        this.i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.i40 i40Var = this.E1;
        if (i40Var != null) {
            i40Var.dismiss();
        }
        this.s0 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        AccountInstance accountInstance = this.d;
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        y30 y30Var = this.a2;
        if (y30Var != null) {
            if (this.q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).f();
                y30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (y30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(y30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (D3 == this) {
            D3 = null;
        }
        E3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.q30.j(getContext());
        ChatObject.Call call = this.a1;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.i0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                l1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(boolean z10) {
        if (this.c3 || !this.f2) {
            return;
        }
        if (z10) {
            this.c3 = true;
            z1(false, this.X2);
            return;
        }
        c1();
        this.containerView.removeView(this.e2);
        this.e2 = null;
        this.C2.setVisibility(8);
        this.containerView.invalidate();
        this.f2 = false;
        this.Y.X = true;
        this.Q.invalidate();
        this.b2.setVisibility(8);
        if (this.s0) {
            this.s0 = false;
            P0(true);
        }
        T0();
    }

    public final void f1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            y30 y30Var = this.a2;
            if (y30Var.r != null) {
                return;
            }
            boolean z10 = G3;
            m50 m50Var = this.Q;
            int i10 = 0;
            if (!z10) {
                if (this.q2 != null) {
                    m50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                    this.q2 = null;
                }
                if (videoParticipant == null) {
                    if (m50Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = m50Var.getViewTreeObserver();
                        z40 z40Var = new z40(this);
                        this.q2 = z40Var;
                        viewTreeObserver.addOnPreDrawListener(z40Var);
                        return;
                    }
                    m50Var.setVisibility(0);
                    P0(false);
                    this.s0 = true;
                    ViewTreeObserver viewTreeObserver2 = m50Var.getViewTreeObserver();
                    y40 y40Var = new y40(this);
                    this.q2 = y40Var;
                    viewTreeObserver2.addOnPreDrawListener(y40Var);
                    return;
                }
                u30 u30Var = this.m2;
                if (u30Var.getVisibility() == 0) {
                    y30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(u30Var);
                    return;
                }
                u30Var.setVisibility(0);
                org.telegram.ui.Components.j30 j30Var = this.p2;
                j30Var.G(u30Var, false);
                this.s0 = true;
                if (!y30Var.b) {
                    ArrayList arrayList = j30Var.e;
                    s4.d0 d0Var = (s4.d0) u30Var.getLayoutManager();
                    if (d0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                d0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = m50Var.getViewTreeObserver();
                x40 x40Var = new x40(this, videoParticipant);
                this.q2 = x40Var;
                viewTreeObserver3.addOnPreDrawListener(x40Var);
                return;
            }
            if (this.q2 != null) {
                m50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            l60 l60Var = this.o2;
            ArrayList arrayList3 = this.Y1;
            ArrayList arrayList4 = this.Z1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.l lVar = uVar.c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.i30 i30Var = uVar.d;
                        if (i30Var != null) {
                            i30Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = uVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(uVar.w);
                        uVar.b(false);
                        uVar.animate().alpha(0.0f).setListener(new t40(this, uVar));
                    }
                }
                this.P2 = false;
                l60Var.H(this.n2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) arrayList4.get(i12);
                    if (uVar2.e != null && ((videoParticipant2 = uVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(uVar2.w);
                        uVar2.b(false);
                        org.telegram.ui.Components.i30 i30Var2 = uVar2.d;
                        if (i30Var2 != null) {
                            i30Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = uVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        uVar2.animate().alpha(0.0f).setListener(new u40(this, uVar2));
                    }
                }
                this.P2 = true;
                l60Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea1(26, this, arrayList2));
                }
            }
            boolean z11 = !y30Var.b;
            ViewTreeObserver viewTreeObserver4 = m50Var.getViewTreeObserver();
            w40 w40Var = new w40(this, videoParticipant, z11);
            this.q2 = w40Var;
            viewTreeObserver4.addOnPreDrawListener(w40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int i1() {
        Integer num = this.y3;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute != 0) {
            return currentAudioRoute != 1 ? 2 : 0;
        }
        return 1;
    }

    public final long j1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void k1(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.a1 == null) {
                return;
            }
            int i10 = 0;
            while (i10 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.a1.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i10 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.o0(this, i10, z10, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j1());
        String publicUsername = ChatObject.getPublicUsername(this.Z0);
        String r10 = !TextUtils.isEmpty(publicUsername) ? a1.g.r(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(r10)) {
            v1(null, r10, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.u1(this, chatFull, z10, 5));
    }

    public final UndoView l1() {
        if (!G3) {
            y30 y30Var = this.a2;
            if (y30Var.b) {
                return y30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.j0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void m1() {
        VoIPService sharedInstance;
        if (this.u0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.u0 = true;
        this.D0.addAll(this.a1.visibleParticipants);
        this.E0.addAll(this.q0);
        this.F0.addAll(this.a1.invitedUsers);
        this.G0.addAll(this.a1.shadyJoinParticipants);
        this.H0.addAll(this.a1.shadyLeftParticipants);
        this.T1 = sharedInstance.getCallState();
        if (this.a1 == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.a1 = call;
            this.p2.c = call;
            this.a2.setGroupCall(call);
            this.o2.c = this.a1;
        }
        int i10 = 0;
        lh.h hVar = this.c0;
        if (hVar != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.a1.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        l50 l50Var = this.V;
        if (l50Var == null || l50Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        N1(true);
        this.w1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        m50 m50Var = this.Q;
        m50Var.setVisibility(0);
        org.telegram.ui.ActionBar.v0 v0Var = this.l1;
        v0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m50Var, (Property<m50, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m50Var, (Property<m50, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l50Var, (Property<l50, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l50Var, (Property<l50, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l50Var, (Property<l50, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.j5 j5Var = this.U;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.W;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(j5Var2, (Property<org.telegram.ui.ActionBar.j5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(j5Var2, (Property<org.telegram.ui.ActionBar.j5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(j5Var2, (Property<org.telegram.ui.ActionBar.j5, Float>) property, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.hs.g);
        animatorSet.addListener(new a50(this, i10));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 2) {
            Z0();
            X0();
            Y0();
            float f11 = 1.0f - this.z3.e;
            l30 l30Var = this.e;
            l30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.m2.invalidate();
            this.containerView.invalidate();
            l30Var.invalidate();
        }
        if (i10 == 3) {
            a1();
            Z0();
            b1();
            W0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Z0();
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Z0();
            this.containerView.invalidate();
        }
    }

    public final void n1(final long j3, final boolean z10) {
        if (this.a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.d30
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        g60 g60Var = g60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new ai.i3(g60Var, b2VarArr2, z10, tL_error, j10, invitetogroupcall));
                            return;
                        }
                        g60Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o31(g60Var, j10, b2VarArr2, user, 2));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zk(this, b2VarArr, sendRequest, 28), 500L);
                }
            }
        }
    }

    public final boolean o1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f7 = this.y0 - dp;
        return (((((float) this.backgroundPaddingTop) + f7) > ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f7) == ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - f7) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        N1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            D1(0.0f);
        }
        m50 m50Var = this.Q;
        if (m50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(m50Var);
        }
        u30 u30Var = this.m2;
        if (u30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(u30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        s40 s40Var = this.z0;
        if (s40Var != null) {
            s40Var.b(false, false);
            return;
        }
        if (this.f2) {
            e1(true);
        } else if (this.a2.b) {
            f1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
        s40 s40Var = this.z0;
        if (s40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        s40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.i0;
        launchActivity.a1.add(this.v2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.q30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.w0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.w0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.w0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.w0.h(this, z10);
    }

    public final boolean p1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public final boolean r1() {
        return s1() && !this.a1.visibleVideoParticipants.isEmpty() && (this.a1.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.a1.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean s1() {
        ChatObject.Call call = this.a1;
        return call != null && call.call.rtmp_stream;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.j1.d0.V) {
            org.telegram.ui.Components.voip.j1.j();
        }
    }

    public final void t1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.w0) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
        if (n2Var instanceof zn) {
            boolean U9 = ((zn) n2Var).U9();
            this.w0 = true;
            this.x0 = true;
            AndroidUtilities.runOnUIThread(new ai.t4(f3Var, editTextBoldCursor, z10, b2Var, 21), U9 ? 200L : 0L);
            return;
        }
        this.w0 = true;
        this.x0 = true;
        if (f3Var != null) {
            f3Var.setFocusable(true);
        } else if (b2Var != null) {
            b2Var.k(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new kh(2, editTextBoldCursor), 100L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1(String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        String str3;
        String str4;
        String str5;
        if (s1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                l1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.i0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if (n2Var instanceof zn) {
                z12 = ((zn) n2Var).U9();
                this.x0 = true;
                this.w0 = true;
                if (str == null && str2 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                if (str3 == null || !z10) {
                    str5 = str4;
                } else {
                    str5 = ChatObject.isChannelOrGiga(this.Z0) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                }
                b50 b50Var = new b50(this, getContext(), str5, str3, str4, str3);
                this.r0 = b50Var;
                b50Var.s0 = new g(this, 20);
                b50Var.setOnDismissListener(new x20(this, 3));
                AndroidUtilities.runOnUIThread(new t20(this, 7), !z12 ? 200L : 0L);
            }
        }
        z12 = false;
        if (str == null) {
        }
        str3 = str;
        str4 = str2;
        if (str3 == null) {
        }
        str5 = str4;
        b50 b50Var2 = new b50(this, getContext(), str5, str3, str4, str3);
        this.r0 = b50Var2;
        b50Var2.s0 = new g(this, 20);
        b50Var2.setOnDismissListener(new x20(this, 3));
        AndroidUtilities.runOnUIThread(new t20(this, 7), !z12 ? 200L : 0L);
    }

    public final void w1() {
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
        b2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.a1.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ba(this, b2Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(TLRPC.GroupCallParticipant groupCallParticipant, final long j3, int i10) {
        String str;
        TextView textView;
        String str2;
        String str3;
        EditText editText;
        AlertDialog$Builder alertDialog$Builder;
        float f7;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j3 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j3)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j3));
        int i11 = 5;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            if (i10 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                l1().k(0L, 30, user, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext());
            int i12 = org.telegram.ui.ActionBar.i6.pg;
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.a;
            b2Var.I = i12;
            TextView textView2 = new TextView(getContext());
            int i13 = org.telegram.ui.ActionBar.i6.hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder2.n(frameLayout);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
            j9Var.j(this.currentAccount, user);
            boolean z10 = user instanceof TLRPC.User;
            if (z10) {
                TLRPC.User user2 = (TLRPC.User) user;
                y9Var.e(user2, j9Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                y9Var.e(chat, j9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.Z0;
            String str4 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                org.telegram.messenger.bi.r(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (p1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                org.telegram.messenger.bi.r(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    org.telegram.messenger.bi.r(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    org.telegram.messenger.bi.r(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(textView3, w7.x5.a(-2.0f, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f, -1, (z11 ? 5 : 3) | 48));
            frameLayout.addView(textView2, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
            if (i10 == 2) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupUserRemove), new rw(3, this, user));
            } else if (z10) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupAdd), new ci.q9(this, (TLRPC.User) user, j3, 4));
            }
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.i(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false));
            b2Var.show();
            if (i10 != 2 || (textView = (TextView) b2Var.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.vg, false));
            return;
        }
        if (i10 == 6) {
            this.i0.K0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            this.i0.p0(new zn(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.i0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if ((n2Var instanceof zn) && ((zn) n2Var).a() == j3) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j3 > 0) {
                bundle2.putLong("user_id", j3);
            } else {
                bundle2.putLong("chat_id", -j3);
            }
            this.i0.p0(new zn(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            K1(2, true);
            return;
        }
        int i14 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.m50 m50Var = this.h2;
            if (m50Var == null || !m50Var.g()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.m50 m50Var2 = new org.telegram.ui.Components.m50(0, true, true);
                this.h2 = m50Var2;
                m50Var2.H = true;
                m50Var2.R = true;
                m50Var2.G = true;
                m50Var2.J = true;
                m50Var2.S = true;
                m50Var2.a = this.i0.O().getLastFragment();
                org.telegram.ui.Components.m50 m50Var3 = this.h2;
                n50 n50Var = new n50(this, j3);
                this.i2 = n50Var;
                m50Var3.b = n50Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                m50Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new t20(this, i14), new ci.e1(i11), 0);
                return;
            }
            return;
        }
        if (i10 != 10) {
            if (i10 != 11) {
                if (i10 == 5) {
                    sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                    l1().m(0L, user, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    sharedInstance.editCallMember(user, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    sharedInstance.editCallMember(user, Boolean.FALSE, null, 10000, null, null);
                }
                sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                l1().k(0L, i10 == 1 ? 31 : 36, user, null, null, null);
                return;
            }
            Context context = getContext();
            int i15 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.g5.a;
            if (DialogObject.isUserDialog(j3)) {
                TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(j3));
                str2 = user3.first_name;
                str3 = user3.last_name;
            } else {
                str2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-j3)).title;
                str3 = null;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j3 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.a;
            b2Var2.R = string;
            LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
            EditText editText2 = new EditText(context);
            int i16 = org.telegram.ui.ActionBar.i6.hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i16, false));
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(LocaleController.isRTL ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j3 > 0 ? 5 : 6);
            editText2.setHint(LocaleController.getString(j3 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
            editText2.setBackground(org.telegram.ui.ActionBar.i6.T(context));
            editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText2.requestFocus();
            if (j3 > 0) {
                editText = new EditText(context);
                editText.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i16, false));
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(LocaleController.isRTL ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(LocaleController.getString(R.string.LastName));
                editText.setBackground(org.telegram.ui.ActionBar.i6.T(context));
                editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            } else {
                editText = null;
            }
            AndroidUtilities.showKeyboard(editText2);
            e7.addView(editText2, w7.x5.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                e7.addView(editText, w7.x5.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str2);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder3.n(e7);
            org.telegram.ui.ActionBar.a2 u1Var = new ei.u1(editText2, j3, i15, editText);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), u1Var);
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            b2Var2.N = new ei.e0(6, editText2, editText);
            b2Var2.i(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false));
            b2Var2.show();
            b2Var2.o(org.telegram.ui.ActionBar.i6.x0(null, i16, false));
            wd wdVar = new wd(1, b2Var2, u1Var);
            if (editText != null) {
                editText.setOnEditorActionListener(wdVar);
                return;
            } else {
                editText2.setOnEditorActionListener(wdVar);
                return;
            }
        }
        String str5 = groupCallParticipant.about;
        Context context2 = getContext();
        int i17 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.g5.a;
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j3 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
        final org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.a;
        b2Var3.R = string2;
        b2Var3.T = LocaleController.getString(j3 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setClipChildren(false);
        if (j3 < 0) {
            alertDialog$Builder = alertDialog$Builder4;
            long j10 = -j3;
            if (MessagesController.getInstance(i17).getChatFull(j10) == null) {
                f7 = 8.0f;
                MessagesController.getInstance(i17).loadFullChat(j10, ConnectionsManager.generateClassGuid(), true);
                NumberTextView numberTextView = new NumberTextView(context2);
                EditText editText3 = new EditText(context2);
                int i18 = org.telegram.ui.ActionBar.i6.hg;
                editText3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
                editText3.setHint(LocaleController.getString(j3 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
                editText3.setTextSize(1, 16.0f);
                editText3.setBackground(org.telegram.ui.ActionBar.i6.T(context2));
                editText3.setMaxLines(4);
                editText3.setRawInputType(147457);
                editText3.setImeOptions(6);
                int i19 = j3 <= 0 ? 70 : 255;
                editText3.setFilters(new InputFilter[]{new org.telegram.ui.Components.q3(i19, context2, numberTextView)});
                numberTextView.setCenterAlign(true);
                numberTextView.setTextSize(15);
                numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B6, false));
                numberTextView.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView, w7.x5.a(20.0f, 0.0f, 14.0f, 21.0f, 0.0f, 20, !LocaleController.isRTL ? 3 : 5));
                editText3.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
                editText3.addTextChangedListener(new org.telegram.ui.Components.zq(i19, numberTextView));
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                editText3.setText(str5);
                editText3.setSelection(editText3.getText().toString().length());
                AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder;
                alertDialog$Builder5.n(frameLayout2);
                final j2.d dVar = new j2.d(j3, i17, editText3, 4);
                alertDialog$Builder5.k(LocaleController.getString(R.string.Save), dVar);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                b2Var3.N = new org.telegram.ui.Components.q1(editText3, 1);
                frameLayout2.addView(editText3, w7.x5.a(-2.0f, 23.0f, 12.0f, 23.0f, 21.0f, -1, 0));
                editText3.requestFocus();
                AndroidUtilities.showKeyboard(editText3);
                editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.t1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                        if (i20 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                            org.telegram.ui.ActionBar.b2 b2Var4 = b2Var3;
                            if (b2Var4.isShowing()) {
                                dVar.f(b2Var4, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                b2Var3.i(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false));
                b2Var3.show();
                b2Var3.o(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
            }
        } else {
            alertDialog$Builder = alertDialog$Builder4;
        }
        f7 = 8.0f;
        NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText32 = new EditText(context2);
        int i182 = org.telegram.ui.ActionBar.i6.hg;
        editText32.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i182, false));
        editText32.setHint(LocaleController.getString(j3 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        editText32.setTextSize(1, 16.0f);
        editText32.setBackground(org.telegram.ui.ActionBar.i6.T(context2));
        editText32.setMaxLines(4);
        editText32.setRawInputType(147457);
        editText32.setImeOptions(6);
        if (j3 <= 0) {
        }
        editText32.setFilters(new InputFilter[]{new org.telegram.ui.Components.q3(i19, context2, numberTextView2)});
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B6, false));
        numberTextView2.setImportantForAccessibility(2);
        frameLayout2.addView(numberTextView2, w7.x5.a(20.0f, 0.0f, 14.0f, 21.0f, 0.0f, 20, !LocaleController.isRTL ? 3 : 5));
        editText32.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
        editText32.addTextChangedListener(new org.telegram.ui.Components.zq(i19, numberTextView2));
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView2, false, 0.0f, false);
        editText32.setText(str5);
        editText32.setSelection(editText32.getText().toString().length());
        AlertDialog$Builder alertDialog$Builder52 = alertDialog$Builder;
        alertDialog$Builder52.n(frameLayout2);
        final j2.d dVar2 = new j2.d(j3, i17, editText32, 4);
        alertDialog$Builder52.k(LocaleController.getString(R.string.Save), dVar2);
        alertDialog$Builder52.h(LocaleController.getString(R.string.Cancel), null);
        b2Var3.N = new org.telegram.ui.Components.q1(editText32, 1);
        frameLayout2.addView(editText32, w7.x5.a(-2.0f, 23.0f, 12.0f, 23.0f, 21.0f, -1, 0));
        editText32.requestFocus();
        AndroidUtilities.showKeyboard(editText32);
        editText32.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.t1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                if (i20 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                    org.telegram.ui.ActionBar.b2 b2Var4 = b2Var3;
                    if (b2Var4.isShowing()) {
                        dVar2.f(b2Var4, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        b2Var3.i(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false));
        b2Var3.show();
        b2Var3.o(org.telegram.ui.ActionBar.i6.x0(null, i182, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(boolean z10, org.telegram.ui.Cells.e4 e4Var) {
        int i10;
        float f7;
        final float f10;
        float f11;
        org.telegram.ui.Components.voip.u uVar;
        org.telegram.ui.Components.voip.u uVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.b3;
        a40 a40Var = this.b;
        m50 m50Var = this.Q;
        if (z11) {
            f10 = (m50Var.getX() + (e4Var.getX() + e4Var.getAvatarImageView().getX())) - paddingLeft;
            f7 = (m50Var.getY() + (e4Var.getY() + e4Var.getAvatarImageView().getY())) - paddingTop;
            f11 = e4Var.getAvatarImageView().getMeasuredHeight() / m50Var.getMeasuredWidth();
            i10 = (int) ((e4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
        } else {
            if (this.Z2 == null) {
                this.O2 = true;
            } else {
                this.O2 = z10 || a40Var.D0.k(a40Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.Y2;
            y30 y30Var = this.a2;
            if (lVar == null || !this.O2) {
                org.telegram.ui.Components.i30 i30Var = this.a3;
                if (i30Var != null) {
                    org.telegram.ui.Components.voip.u uVar3 = this.Z2;
                    u30 u30Var = this.m2;
                    if (uVar3 == null) {
                        float x10 = (y30Var.getX() + (u30Var.getX() + (this.a3.getX() + i30Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y3 = (y30Var.getY() + (u30Var.getY() + (this.a3.getY() + this.a3.getAvatarImageView().getY()))) - paddingTop;
                        f11 = this.a3.getAvatarImageView().getMeasuredHeight() / m50Var.getMeasuredWidth();
                        i10 = (int) ((this.a3.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
                        f7 = y3;
                        f10 = x10;
                        if (!this.O2 && (uVar = this.Z2) != null) {
                            uVar.invalidate();
                            y30Var.invalidate();
                            org.telegram.ui.Components.voip.u uVar4 = this.Z2;
                            uVar4.h = false;
                            uVar4.j(false);
                            this.Z2 = null;
                        }
                    } else if (this.O2) {
                        f10 = (y30Var.getX() + (u30Var.getX() + i30Var.getX())) - paddingLeft;
                        f7 = (y30Var.getY() + (u30Var.getY() + this.a3.getY())) - paddingTop;
                        i10 = 0;
                    }
                }
                i10 = 0;
                f7 = 0.0f;
                f10 = 0.0f;
                f11 = 0.96f;
                if (!this.O2) {
                    uVar.invalidate();
                    y30Var.invalidate();
                    org.telegram.ui.Components.voip.u uVar42 = this.Z2;
                    uVar42.h = false;
                    uVar42.j(false);
                    this.Z2 = null;
                }
            } else {
                float x11 = (m50Var.getX() + lVar.getX()) - paddingLeft;
                f7 = ((m50Var.getY() + this.Y2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                i10 = 0;
                f10 = x11;
            }
            f11 = 1.0f;
            if (!this.O2) {
            }
        }
        final float f12 = f7;
        final float f13 = f11;
        z30 z30Var = this.D2;
        if (z10) {
            b40 b40Var = this.C2;
            b40Var.setScaleX(f13);
            b40Var.setScaleY(f13);
            b40Var.setTranslationX(f10);
            b40Var.setTranslationY(f12);
            z30Var.setAlpha(0.0f);
        }
        a40Var.N(i10, i10);
        if (this.g2) {
            d40 d40Var = this.b2;
            if (z10) {
                d40Var.setAlpha(0.0f);
            }
            org.telegram.messenger.bi.s(d40Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.bi.s(z30Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (uVar2 = this.Z2) != null) {
            uVar2.h = false;
            uVar2.j(true);
            if (a40Var.D0.k(a40Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.p pVar = this.Z2.a;
                pVar.E = false;
                pVar.F = 0L;
                this.Y2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i11 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.a30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g60.r(g60.this, f13, f10, f12, i11, valueAnimator);
            }
        });
        this.d3 = this.d.getNotificationCenter().setAnimationInProgress(this.d3, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.u uVar5 = this.Y2 != null ? this.Z2 : null;
        if (uVar5 != null) {
            uVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, uVar5, z10, 7));
        if (this.b3 || this.Z2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.hs.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.hs.f);
            ofFloat.setDuration(220L);
            this.Z2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.p pVar2 = this.Z2.a;
            if (pVar2.E) {
                pVar2.G.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        T0();
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
