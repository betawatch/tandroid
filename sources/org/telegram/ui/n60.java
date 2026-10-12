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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n60 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ne.d {
    public static n60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final a6 A2;
    public final ne.b A3;
    public TLObject B0;
    public final l60 B1;
    public final LongSparseIntArray B2;
    public final ne.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final h40 C2;
    public final ne.b C3;
    public final ArrayList D0;
    public z20 D1;
    public final f40 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.e40 E1;
    public LinearLayout E2;
    public final p40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final o40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.yj0 G2;
    public final m40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.yj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.gl0 K;
    public final org.telegram.ui.Components.yj0 K0;
    public final m60[] K1;
    public final View K2;
    public final r50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.s6 M;
    public final org.telegram.ui.Components.ea M0;
    public m60 M1;
    public final int[] M2;
    public final x30 N;
    public final org.telegram.ui.Components.ea N0;
    public m60 N1;
    public final b40 N2;
    public final j50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final h60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final t50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final v40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final t40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.h5 U;
    public final c60 U0;
    public float U1;
    public ObjectAnimator U2;
    public final s50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.h5 W;
    public float W0;
    public boolean W1;
    public final b50 W2;
    public final b60 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.e4 X2;
    public final org.telegram.ui.Components.a00 Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int a0;
    public ChatObject.Call a1;
    public final e40 a2;
    public org.telegram.ui.Components.e30 a3;
    public final g40 b;
    public final ImageView b0;
    public final boolean b1;
    public final j40 b2;
    public boolean b3;
    public final l30 c;
    public final mh.h c0;
    public final String c1;
    public final w40 c2;
    public boolean c3;
    public final AccountInstance d;
    public final int d0;
    public final i60 d1;
    public float d2;
    public int d3;
    public final r30 e;
    public final RadialProgressView e0;
    public final w30 e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout e2;
    public AnimatorSet e3;
    public final org.telegram.ui.Components.voip.u2 f;
    public final Drawable f0;
    public final y30 f1;
    public boolean f2;
    public n50 f3;
    public final View g0;
    public final Paint g1;
    public boolean g2;
    public int g3;
    public final org.telegram.ui.Components.voip.u2 h;
    public AnimatorSet h0;
    public ValueAnimator h1;
    public org.telegram.ui.Components.i50 h2;
    public int h3;
    public LaunchActivity i0;
    public float i1;
    public u50 i2;
    public int i3;
    public final UndoView[] j0;
    public final LinearLayout j1;
    public Boolean j2;
    public int j3;
    public final org.telegram.ui.Cells.k k0;
    public final org.telegram.ui.ActionBar.u0 k1;
    public int k2;
    public int k3;
    public boolean l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean l2;
    public int l3;
    public org.telegram.ui.Components.v40 m0;
    public final org.telegram.ui.ActionBar.u0 m1;
    public final a40 m2;
    public int m3;
    public final org.telegram.ui.Components.voip.u2 n;
    public org.telegram.ui.Components.v40 n0;
    public final org.telegram.ui.ActionBar.e1 n1;
    public final org.telegram.ui.Components.mm0 n2;
    public int n3;
    public int o0;
    public final org.telegram.ui.ActionBar.e1 o1;
    public final s60 o2;
    public int o3;
    public y50 p0;
    public final org.telegram.ui.ActionBar.e1 p1;
    public final org.telegram.ui.Components.f30 p2;
    public int p3;
    public final ArrayList q0;
    public final org.telegram.ui.ActionBar.e1 q1;
    public ViewTreeObserver.OnPreDrawListener q2;
    public int q3;
    public final org.telegram.ui.Components.voip.u2 r;
    public h50 r0;
    public final org.telegram.ui.ActionBar.e1 r1;
    public final org.telegram.ui.Components.voip.h r2;
    public int r3;
    public final org.telegram.ui.Components.voip.u2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.e1 s1;
    public boolean s2;
    public int s3;
    public long t0;
    public final org.telegram.ui.ActionBar.e1 t1;
    public final ArrayList t2;
    public int t3;
    public boolean u0;
    public final org.telegram.ui.ActionBar.e1 u1;
    public boolean u2;
    public int u3;
    public final org.telegram.ui.Components.voip.u2 v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.e1 v1;
    public final z20 v2;
    public int v3;
    public final org.telegram.ui.Components.voip.u2 w;
    public boolean w0;
    public final org.telegram.ui.ActionBar.e1 w1;
    public final v30 w2;
    public final o50 w3;
    public final s30 x;
    public boolean x0;
    public final org.telegram.ui.ActionBar.e1 x1;
    public final org.telegram.ui.Components.ve x2;
    public Boolean x3;
    public final ImageView y;
    public float y0;
    public final org.telegram.ui.ActionBar.e1 y1;
    public final z20 y2;
    public Integer y3;
    public y40 z0;
    public final LinearLayout z1;
    public boolean z2;
    public final ne.b z3;

    public n60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.c6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        final n60 n60Var;
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
        this.C1 = new qh.i(new z20(this, 8));
        int i11 = 0;
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new m60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.r2 = new org.telegram.ui.Components.voip.h();
        this.t2 = new ArrayList();
        this.v2 = new z20(this, i11);
        this.w2 = new v30(this);
        this.x2 = new org.telegram.ui.Components.ve(20);
        this.y2 = new z20(this, 1);
        this.z2 = false;
        this.A2 = new a6(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.d3 = -1;
        this.w3 = new o50(this);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
        this.z3 = new ne.b(2, this, esVar, 350L);
        this.A3 = new ne.b(3, this, esVar, 220L, true);
        this.B3 = new ne.e(4, this, esVar, 350L);
        this.C3 = new ne.b(5, this, esVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.b1 = z10;
        this.resourcesProvider = new bi.s0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new q40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new b50(this);
        setOnDismissListener(new d30(this, i11));
        setDimBehindAlpha(75);
        h60 h60Var = new h60(this, launchActivity);
        this.P = h60Var;
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(true);
        int i12 = org.telegram.ui.ActionBar.g6.qg;
        eqVar.b(org.telegram.ui.ActionBar.g6.v0(i12));
        eqVar.d();
        j50 j50Var = new j50(this, launchActivity, eqVar);
        this.O = j50Var;
        j50Var.setSubtitle("");
        j50Var.getSubtitleTextView().setVisibility(0);
        j50Var.l();
        j50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(j50Var.getAdditionalSubtitleTextView(), this.u2, 1.0f, false);
        j50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.g6.v0(i12));
        int i13 = org.telegram.ui.ActionBar.g6.lg;
        j50Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.v0(i13));
        j50Var.setBackButtonImage(R.drawable.ic_ab_back);
        j50Var.setOccupyStatusBar(false);
        j50Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.g6.hg;
        j50Var.D(org.telegram.ui.ActionBar.g6.v0(i14), false);
        j50Var.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z8), false);
        j50Var.setTitleColor(org.telegram.ui.ActionBar.g6.v0(i14));
        j50Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.v0(i13));
        j50Var.setActionBarMenuOnItemClick(new q50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new w20(this, 3);
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
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = yj0Var;
        this.K0 = new org.telegram.ui.Components.yj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        r50 r50Var = new r50(this, launchActivity);
        this.L = r50Var;
        this.containerView = r50Var;
        r50Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.U = h5Var;
            h5Var.setGravity(17);
            h5Var.setTextColor(-1);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(18);
            h5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(h5Var, w7.a6.a(-2.0f, 21.0f, 0.0f, 21.0f, 311.0f, -2, 49));
            s50 s50Var = new s50(this, launchActivity);
            this.V = s50Var;
            s50Var.setGravity(17);
            s50Var.setTextColor(-1);
            s50Var.setTypeface(AndroidUtilities.bold());
            s50Var.setTextSize(60);
            this.containerView.addView(s50Var, w7.a6.a(-2.0f, 21.0f, 0.0f, 21.0f, 231.0f, -2, 49));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.W = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, w7.a6.a(-2.0f, 21.0f, 0.0f, 21.0f, 201.0f, -2, 49));
        }
        if (s1()) {
            c60 c60Var = new c60(this, launchActivity);
            this.U0 = c60Var;
            this.containerView.addView(c60Var, w7.a6.a(80.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 51));
        }
        t50 t50Var = new t50(this, launchActivity);
        this.Q = t50Var;
        t50Var.setClipToPadding(false);
        t50Var.setClipChildren(false);
        b60 b60Var = new b60(this);
        this.X = b60Var;
        b60Var.o = esVar;
        b60Var.d = 350L;
        b60Var.c = 350L;
        b60Var.e = 350L;
        b60Var.S();
        t50Var.setItemAnimator(b60Var);
        t50Var.setOnScrollListener(new k30(this));
        t50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.a00 a00Var = new org.telegram.ui.Components.a00(F3 ? 6 : 2, t50Var);
        this.Y = a00Var;
        t50Var.setLayoutManager(a00Var);
        l30 l30Var = new l30(this);
        this.c = l30Var;
        a00Var.z1(l30Var);
        t50Var.i(new m30(this));
        a00Var.C1();
        this.containerView.addView(t50Var, w7.a6.a(-1.0f, 14.0f, 14.0f, 14.0f, 231.0f, -1, 51));
        t50Var.setAdapter(h60Var);
        t50Var.setTopBottomSelectorRadius(13);
        t50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.eg));
        t50Var.setOnItemClickListener(new f7(this, launchActivity, call, 14));
        t50Var.setOnItemLongClickListener(new w20(this, 4));
        if (s1()) {
            l60 l60Var = new l60(this, getContext());
            this.B1 = l60Var;
            this.containerView.addView(l60Var, w7.a6.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 49));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(launchActivity);
        this.n2 = mm0Var;
        this.containerView.addView(mm0Var, w7.a6.a(-1.0f, 14.0f, 14.0f, 324.0f, 14.0f, -1, 51));
        s60 s60Var = new s60(call, this.currentAccount, this);
        this.o2 = s60Var;
        mm0Var.setAdapter(s60Var);
        s4.s sVar = new s4.s(6, false);
        mm0Var.setLayoutManager(sVar);
        sVar.z1(new o30(this));
        final int i16 = 1;
        mm0Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this) { // from class: org.telegram.ui.y20
            public final /* synthetic */ n60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void a(int i17, View view) {
                switch (i16) {
                    case 0:
                        n60 n60Var2 = this.b;
                        n60Var2.getClass();
                        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) view;
                        if (e30Var.getVideoParticipant() != null) {
                            n60Var2.f1(e30Var.getVideoParticipant());
                            break;
                        } else {
                            n60Var2.f1(new ChatObject.VideoParticipant(e30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        n60 n60Var3 = this.b;
                        n60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            n60Var3.f1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        s4.k kVar = new s4.k();
        kVar.S();
        kVar.o = esVar;
        kVar.d = 350L;
        kVar.c = 350L;
        kVar.e = 350L;
        mm0Var.setItemAnimator(new p30(this));
        mm0Var.setOnScrollListener(new q30(this));
        s60Var.H(mm0Var, false, false);
        mm0Var.setVisibility(8);
        r30 r30Var = new r30(this, launchActivity);
        this.e = r30Var;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(9);
        this.M0 = eaVar;
        org.telegram.ui.Components.ea eaVar2 = new org.telegram.ui.Components.ea(12);
        this.N0 = eaVar2;
        eaVar.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        eaVar.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        eaVar.b();
        eaVar2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        eaVar2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        eaVar2.b();
        int i17 = org.telegram.ui.ActionBar.g6.Ig;
        eaVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i17), 38));
        eaVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i17), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        r30Var.a(u2Var);
        u2Var.setOnClickListener(new x20(this, 7));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.n = u2Var2;
        u2Var2.setCheckable(true);
        u2Var2.setTextSize(12);
        u2Var2.d(false, false);
        u2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        u2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f = u2Var3;
        u2Var3.setCheckable(true);
        u2Var3.setTextSize(12);
        u2Var3.d(false, false);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(launchActivity);
        u2Var3.addView(bk0Var, w7.a6.a(32.0f, 0.0f, 10.0f, 0.0f, 0.0f, 32, 1));
        org.telegram.ui.Components.yj0 yj0Var2 = new org.telegram.ui.Components.yj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = yj0Var2;
        bk0Var.setAnimation(yj0Var2);
        u2Var3.setOnClickListener(new x20(this, 10));
        r30Var.a(u2Var3);
        org.telegram.ui.Components.voip.u2 u2Var4 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.h = u2Var4;
        u2Var4.setCheckable(true);
        u2Var4.setTextSize(12);
        u2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i18 = R.drawable.filled_sound_on;
        this.a0 = i18;
        imageView.setImageResource(i18);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        u2Var4.addView(imageView, w7.a6.a(30.0f, 0.0f, 11.0f, 0.0f, 0.0f, 30, 1));
        u2Var4.setOnClickListener(new x20(this, 11));
        r30Var.a(u2Var4);
        r30Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i19 = 1;
        u2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c30
            public final /* synthetic */ n60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        n60.q(this.b, launchActivity);
                        break;
                    default:
                        n60 n60Var2 = this.b;
                        n60Var2.a2.e();
                        ChatObject.Call call2 = n60Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            n60Var2.J1();
                            n60.u1(launchActivity, new z20(n60Var2, 5), false, false);
                            break;
                        } else {
                            n60Var2.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var6 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.v = u2Var6;
        u2Var6.setCheckable(true);
        u2Var6.b(true, false);
        u2Var6.setTextSize(12);
        u2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        s30 s30Var = new s30(this, launchActivity);
        this.x = s30Var;
        s30Var.setAnimation(yj0Var);
        s30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(s30Var, w7.a6.e(50, 50, 49));
        r30Var.a(u2Var7);
        u2Var7.setOnClickListener(new u30(this));
        r30Var.a(u2Var6);
        r30Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, w7.a6.a(24.0f, 0.0f, 13.0f, 0.0f, 0.0f, 24, 49));
        if (this.a1 != null && s1() && !this.a1.isScheduled()) {
            imageView2.setVisibility(0);
            s30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Og));
        j50Var.setAlpha(0.0f);
        j50Var.getBackButton().setScaleX(0.9f);
        j50Var.getBackButton().setScaleY(0.9f);
        j50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        j50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        j50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        j50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int i20 = 0;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.g6.v0(i14));
        this.k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new w20(this, i20));
        int i21 = org.telegram.ui.ActionBar.g6.ig;
        u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i21), 6));
        u0Var.setOnClickListener(new x20(this, i20));
        u0Var.G(org.telegram.ui.ActionBar.g6.v0(i14), false);
        u0Var.G(org.telegram.ui.ActionBar.g6.v0(i14), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.g6.v0(i14));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i21), 6));
        u0Var2.setOnClickListener(new x20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.g6.v0(i14));
        this.m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i21), 6));
        u0Var3.setOnClickListener(new x20(this, 2));
        w30 w30Var = new w30(this, launchActivity, launchActivity);
        this.e1 = w30Var;
        x30 x30Var = new x30(launchActivity);
        this.N = x30Var;
        x30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        paint2.setColor(-12761513);
        y30 y30Var = new y30(this, getContext());
        this.f1 = y30Var;
        y30Var.setTextColor(getThemedColor(i14));
        y30Var.setTextSize(1, 11.0f);
        y30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        y30Var.setMaxLines(1);
        y30Var.setGravity(17);
        y30Var.setTypeface(AndroidUtilities.bold());
        y30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        y30Var.setTag(-1);
        if (!s1()) {
            y30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(w30Var, w7.a6.l(1.0f, 0, -2));
        linearLayout.addView(y30Var, w7.a6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(x30Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(linearLayout, w7.a6.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -2, 51));
        this.containerView.addView(j50Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.a6.n(48, 48));
        linearLayout2.addView(u0Var2, w7.a6.n(48, 48));
        linearLayout2.addView(u0Var, w7.a6.n(48, 48));
        this.containerView.addView(linearLayout2, w7.a6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V5));
        this.containerView.addView(view, w7.a6.d(1.0f, -1));
        for (int i22 = 0; i22 < 2; i22++) {
            this.j0[i22] = new z30(this, launchActivity);
            this.j0[i22].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.j0[i22].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.j0[i22], w7.a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.k0 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, 240);
        this.k1.h(kVar2, AndroidUtilities.dp(48.0f));
        this.k1.setShowSubmenuByMove(false);
        int i23 = org.telegram.ui.ActionBar.g6.eg;
        kVar2.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.v0(i23), 6, 6));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.v1 = d10;
        d10.j(false, true);
        int i24 = org.telegram.ui.ActionBar.g6.wg;
        d.setCheckColor(i24);
        d.c(org.telegram.ui.ActionBar.g6.v0(i24), org.telegram.ui.ActionBar.g6.v0(i24));
        d10.setCheckColor(i24);
        d10.c(org.telegram.ui.ActionBar.g6.v0(i24), org.telegram.ui.ActionBar.g6.v0(i24));
        Paint paint3 = new Paint(1);
        int i25 = org.telegram.ui.ActionBar.g6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(i25));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.n1 = e;
        i60 i60Var = new i60();
        this.d1 = i60Var;
        org.telegram.ui.ActionBar.e1 e7 = this.k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, i60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.s1 = d15;
        i60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.e1 e11 = this.k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.k1;
        int i26 = R.drawable.msg_cancel;
        if (p1()) {
            i10 = i25;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i25;
        }
        int i27 = 4;
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i26, string);
        this.w1 = e12;
        this.k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.g6.v0(i23));
        this.k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        e11.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d11.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d12.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        int i28 = org.telegram.ui.ActionBar.g6.vg;
        e12.c(org.telegram.ui.ActionBar.g6.v0(i28), org.telegram.ui.ActionBar.g6.v0(i28));
        e.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d13.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d14.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d15.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        e7.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        if (this.a1 != null) {
            m1();
        }
        if (p1()) {
            this.p0 = new y50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new x20(this, 3));
        a40 a40Var = new a40(this, launchActivity);
        this.m2 = a40Var;
        b40 b40Var = new b40(this);
        this.N2 = b40Var;
        final int i29 = 0;
        a40Var.setClipToPadding(false);
        b40Var.S();
        b40Var.o = org.telegram.ui.Components.es.f;
        b40Var.d = 350L;
        b40Var.c = 350L;
        b40Var.e = 350L;
        a40Var.setItemAnimator(b40Var);
        a40Var.setOnScrollListener(new c40(this));
        a40Var.setClipChildren(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        a40Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(call, this.currentAccount, this);
        this.p2 = f30Var;
        a40Var.setAdapter(f30Var);
        f30Var.F(a40Var, false);
        a40Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this) { // from class: org.telegram.ui.y20
            public final /* synthetic */ n60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void a(int i172, View view2) {
                switch (i29) {
                    case 0:
                        n60 n60Var2 = this.b;
                        n60Var2.getClass();
                        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) view2;
                        if (e30Var.getVideoParticipant() != null) {
                            n60Var2.f1(e30Var.getVideoParticipant());
                            break;
                        } else {
                            n60Var2.f1(new ChatObject.VideoParticipant(e30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        n60 n60Var3 = this.b;
                        n60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            n60Var3.f1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        a40Var.setOnItemLongClickListener(new w20(this, 1));
        a40Var.setVisibility(8);
        a40Var.i(new d40());
        e40 e40Var = new e40(this, launchActivity, this.Q, a40Var, this.Y1, this.a1, this);
        this.a2 = e40Var;
        e40Var.setClipChildren(false);
        f30Var.E(this.Y1, e40Var);
        if (this.n2 != null) {
            this.o2.G(this.Y1, e40Var);
        }
        f40 f40Var = new f40(this, launchActivity);
        this.D2 = f40Var;
        g40 g40Var = new g40(this, launchActivity, this.O, this.Q, f40Var);
        this.b = g40Var;
        g40Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        g40Var.setInvalidateWithParent(true);
        f40Var.setProfileGalleryView(g40Var);
        h40 h40Var = new h40(this, launchActivity);
        this.C2 = h40Var;
        h40Var.setVisibility(8);
        g40Var.setVisibility(0);
        g40Var.b(new i40(this));
        j40 j40Var = new j40(this, launchActivity);
        this.b2 = j40Var;
        this.containerView.addView(e40Var);
        e40Var.addView(a40Var, w7.a6.a(80.0f, 0.0f, 0.0f, 0.0f, 100.0f, -1, 80));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.a6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.a6.e(-1, 0, 83));
        mh.h hVar = new mh.h(launchActivity);
        this.c0 = hVar;
        hVar.setDelegate(new k40(this));
        hVar.setClickCellDelegate(new l40(this));
        if (this.a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(launchActivity, false, true, true);
        this.M = s6Var;
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(-1);
        s6Var.b(0.4f, 320L, org.telegram.ui.Components.es.h);
        s6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        m40 m40Var = new m40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = m40Var;
        m40Var.J = true;
        m40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.d0)});
        m40Var.getEditText().setLinkTextColor(-11683585);
        m40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        m40Var.getEditText().addTextChangedListener(new n40(this));
        m40Var.s();
        o40 o40Var = new o40(this, launchActivity);
        this.G = o40Var;
        this.containerView.addView(o40Var, w7.a6.d(-1.0f, -1));
        p40 p40Var = new p40(launchActivity);
        this.F = p40Var;
        p40Var.addView(m40Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 80));
        p40Var.addView(s6Var, w7.a6.a(16.0f, 0.0f, 0.0f, 0.0f, 32.0f, 52, 85));
        s6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(p40Var, w7.a6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i30 = org.telegram.ui.ActionBar.g6.i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i30), 1, -1));
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new x20(this, i27));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i30), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new x20(this, 5));
        p40Var.addView(imageView3, w7.a6.e(48, 48, 85));
        p40Var.addView(imageView4, w7.a6.e(48, 48, 85));
        this.containerView.addView(j40Var);
        h40Var.addView(g40Var, w7.a6.d(-1.0f, -1));
        h40Var.addView(f40Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.containerView.addView(h40Var, w7.a6.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 0));
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
            this.containerView.addView(textView, w7.a6.a(-2.0f, 21.0f, 0.0f, 21.0f, 100.0f, -2, 81));
            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(launchActivity);
            ud0Var.setTextColor(-1);
            ud0Var.setSelectorColor(-9598483);
            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ud0Var.setItemCount(5);
            r40 r40Var = new r40(launchActivity);
            r40Var.setItemCount(5);
            r40Var.setTextColor(-1);
            r40Var.setSelectorColor(-9598483);
            r40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            s40 s40Var = new s40(launchActivity);
            s40Var.setItemCount(5);
            s40Var.setTextColor(-1);
            s40Var.setSelectorColor(-9598483);
            s40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            t40 t40Var = new t40(launchActivity);
            this.T = t40Var;
            t40Var.setLines(1);
            t40Var.setSingleLine(true);
            t40Var.setEllipsize(TextUtils.TruncateAt.END);
            t40Var.setGravity(17);
            t40Var.setTextColor(-1);
            t40Var.setTypeface(AndroidUtilities.bold());
            t40Var.setTextSize(1, 14.0f);
            this.containerView.addView(t40Var, w7.a6.a(48.0f, 21.0f, 0.0f, 21.0f, 20.5f, -1, 81));
            launchActivity2 = launchActivity;
            t40Var.setOnClickListener(new org.telegram.messenger.video.f(this, ud0Var, r40Var, s40Var, chat, accountInstance, inputPeer2, 1));
            v40 v40Var = new v40(launchActivity2, ud0Var, r40Var, s40Var);
            this.R = v40Var;
            v40Var.setWeightSum(1.0f);
            v40Var.setOrientation(0);
            this.containerView.addView(v40Var, w7.a6.a(270.0f, 0.0f, 50.0f, 0.0f, 0.0f, -1, 51));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i31 = calendar.get(1);
            int i32 = calendar.get(6);
            v40Var.addView(ud0Var, w7.a6.l(0.5f, 0, 270));
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(365);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setFormatter(new b30(currentTimeMillis, calendar, i31, 0));
            a1.d dVar = new a1.d(this, ud0Var, r40Var, s40Var, 11);
            n60Var = this;
            ud0Var.setOnValueChangedListener(dVar);
            r40Var.setMinValue(0);
            r40Var.setMaxValue(23);
            v40Var.addView(r40Var, w7.a6.l(0.2f, 0, 270));
            r40Var.setFormatter(new org.telegram.ui.Components.zg0(23));
            r40Var.setOnValueChangedListener(dVar);
            s40Var.setMinValue(0);
            s40Var.setMaxValue(59);
            s40Var.setValue(0);
            s40Var.setFormatter(new org.telegram.ui.Components.zg0(24));
            v40Var.addView(s40Var, w7.a6.l(0.3f, 0, 270));
            s40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i33 = calendar.get(6);
            int i34 = calendar.get(12);
            int i35 = calendar.get(11);
            ud0Var.setValue(i32 != i33 ? 1 : 0);
            s40Var.setValue(i34);
            r40Var.setValue(i35);
            org.telegram.ui.Components.g5.f(t40Var, textView, 0L, 604800L, 2, ud0Var, r40Var, s40Var);
        } else {
            launchActivity2 = launchActivity;
            n60Var = this;
        }
        w40 w40Var = new w40(n60Var, (ViewGroup) n60Var.getWindow().getDecorView(), n60Var.containerView);
        n60Var.c2 = w40Var;
        w40Var.E = new x40(n60Var);
        g40Var.setPinchToZoomHelper(w40Var);
        final int i36 = 0;
        n60Var.n.setOnClickListener(new View.OnClickListener(n60Var) { // from class: org.telegram.ui.c30
            public final /* synthetic */ n60 b;

            {
                this.b = n60Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i36) {
                    case 0:
                        n60.q(this.b, launchActivity2);
                        break;
                    default:
                        n60 n60Var2 = this.b;
                        n60Var2.a2.e();
                        ChatObject.Call call2 = n60Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            n60Var2.J1();
                            n60.u1(launchActivity2, new z20(n60Var2, 5), false, false);
                            break;
                        } else {
                            n60Var2.dismiss();
                            break;
                        }
                }
            }
        });
        n60Var.M1(false);
        n60Var.J1();
        n60Var.N1(false);
        n60Var.O1(false, false);
        n60Var.C1(0.0f);
        n60Var.P1();
        n60Var.containerView.addView(new FrameLayout(launchActivity2), w7.a6.e(-1, 200, 87));
        n60Var.v.setOnClickListener(new x20(n60Var, 6));
        n60Var.U0();
        w7.c6.a(n60Var.n);
        w7.c6.a(n60Var.r);
        w7.c6.a(n60Var.f);
        w7.c6.a(n60Var.h);
        w7.c6.a(n60Var.w);
        w7.c6.a(n60Var.s);
        w7.c6.a(n60Var.v);
        r0.j0.l(n60Var.containerView, new w20(n60Var, 2));
    }

    public static /* synthetic */ void A(n60 n60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            a2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        a2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            n60Var.y1(null, j10, 3);
        } else {
            org.telegram.ui.Components.g5.e0(n60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.m2) n60Var.i0.O().getFragmentStack().get(n60Var.i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public static r0.l1 B(n60 n60Var, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.a;
        i0.b f7 = i1Var.f(647);
        i0.b f10 = i1Var.f(8);
        m40 m40Var = n60Var.H;
        int max = Math.max(f10.d, (m40Var.N || m40Var.e) ? m40Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = n60Var.b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (m40Var.getEmojiView() != null) {
            m40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (n60Var.S2) {
            ViewGroup viewGroup = n60Var.containerView;
            int i10 = n60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = n60Var.containerView;
            int i11 = n60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.a + i11, f7.b, i11 + f7.c, f7.d);
        }
        n60Var.containerView.requestLayout();
        if (max == 0 && !m40Var.N && !m40Var.e && !m40Var.O) {
            m40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.gl0 gl0Var = n60Var.K;
            if (gl0Var == null) {
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                gl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.gl0 gl0Var2 = new org.telegram.ui.Components.gl0(1, n60Var.currentAccount, n60Var.getContext(), R, n60Var.resourcesProvider);
                    n60Var.K = gl0Var2;
                    gl0Var2.setDelegate(new p50(n60Var));
                    n60Var.containerView.addView(n60Var.K, w7.a6.e(-2, 52, 81));
                    n60Var.K.p(null, null, false);
                    n60Var.G.bringToFront();
                    n60Var.F.bringToFront();
                    gl0Var = n60Var.K;
                }
            }
            n60Var.K = gl0Var;
        }
        m40Var.H(f10.d, false);
        n60Var.C1.j(l1Var);
        return r0.l1.b;
    }

    public static String B0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void C0(n60 n60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (n60Var.n0 == null) {
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(n60Var.getContext(), 8);
            n60Var.n0 = v40Var;
            v40Var.setAlpha(0.0f);
            n60Var.n0.setVisibility(4);
            n60Var.n0.setShowingDuration(4000L);
            n60Var.containerView.addView(n60Var.n0, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            n60Var.n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            n60Var.n0.d();
        }
        n60Var.n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        n60Var.n0.f(n60Var.w, true);
    }

    public static void D(n60 n60Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        a2Var.dismiss();
        boolean z10 = false;
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.zc(n60Var.topBulletinContainer, new bi.s0()).f0(tL_error, false);
                return;
            }
            return;
        }
        Context context = n60Var.getContext();
        int i10 = n60Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.c6 c6Var = n60Var.resourcesProvider;
        ChatObject.Call call = n60Var.a1;
        if (call != null && (groupCall = call.call) != null && groupCall.creator) {
            z10 = true;
        }
        n9.o0(context, i10, inputGroupCall, str, c6Var, false, z10);
    }

    public static /* synthetic */ void E(n60 n60Var, int[] iArr, float[] fArr) {
        s4.b1 K;
        a40 a40Var = n60Var.m2;
        e40 e40Var = n60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = n60Var.a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (e40Var.b) {
                    for (int i11 = 0; i11 < a40Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) a40Var.getChildAt(i11);
                        if (MessageObject.getPeerId(e30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            e30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (n60Var.s0 ? n60Var.D0 : n60Var.a1.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = n60Var.Q.K(indexOf + n60Var.P.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == n60Var.X2 && !n60Var.l2) {
                                n60Var.containerView.invalidate();
                            }
                        }
                    }
                }
                e40Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void F(n60 n60Var) {
        Editable text = n60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(n60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        n60Var.B1(tL_textWithEntities);
    }

    public static void G0(n60 n60Var) {
        ChatObject.Call call = n60Var.a1;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = n60Var.a1.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(n60Var.a1.call.join_muted);
        ConnectionsManager connectionsManager = n60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.f1(dispatchQueue), new i30(n60Var, 1));
    }

    public static void H0(n60 n60Var, boolean z10) {
        if (n60Var.a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = n60Var.a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        n60Var.x3 = Boolean.valueOf(z10);
        n60Var.I1(true);
        ConnectionsManager connectionsManager = n60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.f1(dispatchQueue), new i30(n60Var, 0));
    }

    public static void I0(n60 n60Var) {
        int i10;
        if (!n60Var.s1()) {
            n60Var.isFullscreen = false;
            return;
        }
        e40 e40Var = n60Var.a2;
        boolean z10 = (!e40Var.V && e40Var.b && (F3 == n60Var.r1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = n60Var.j2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = n60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                n60Var.getWindow().clearFlags(1024);
                n60Var.setHideSystemVerticalInsets(false);
            } else {
                n60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                n60Var.getWindow().addFlags(1024);
            }
            n60Var.containerView.setSystemUiVisibility(i10);
            n60Var.j2 = Boolean.valueOf(z10);
            n60Var.S2 = !z10;
            n60Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l J0(n60 n60Var) {
        t50 t50Var = n60Var.Q;
        for (int i10 = 0; i10 < t50Var.getChildCount(); i10++) {
            View childAt = t50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K0(n60 n60Var) {
        j50 j50Var = n60Var.O;
        t50 t50Var = n60Var.Q;
        int childCount = t50Var.getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(t50Var.getChildAt(i10)) >= 0) {
                f7 = Math.min(f7, r8.getTop());
            }
        }
        if (f7 < 0.0f || f7 == 2.14748365E9f) {
            f7 = childCount != 0 ? 0.0f : t50Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f7 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f7 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && j50Var.getTag() == null) || (!z10 && j50Var.getTag() != null)) {
            j50Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = n60Var.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                n60Var.h0 = null;
            }
            n60Var.setUseLightStatusBar(j50Var.getTag() == null);
            ViewPropertyAnimator duration = j50Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
            duration.setInterpolator(esVar).start();
            j50Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(esVar).start();
            ObjectAnimator objectAnimator = n60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                n60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = j50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.h5, Float>) property, j50Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            n60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            n60Var.U2.setInterpolator(esVar);
            n60Var.U2.addListener(new i50(null == true ? 1 : 0, n60Var, z10));
            n60Var.U2.start();
            ObjectAnimator objectAnimator2 = n60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j50Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            n60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            n60Var.V2.setInterpolator(esVar);
            n60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            n60Var.h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = n60Var.h0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(n60Var.N, (Property<x30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(n60Var.g0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            n60Var.h0.addListener(new g50(n60Var, i11));
            n60Var.h0.start();
            n60Var.a2.v.setClickable(!z10 || F3);
        }
        if (n60Var.y0 != dp) {
            n60Var.F1(dp);
        }
    }

    public static void O(n60 n60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (n60Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(n60Var.Y1, n60Var.a2, lVar, null, null, lVar.getParticipant(), n60Var.a1, n60Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void T(n60 n60Var, int i10, int[] iArr) {
        if (n60Var.s1()) {
            int i11 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.zg, false), n60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false), n60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.yg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.zg, false), n60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Bg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Cg, false), n60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ag, false);
        } else if (q1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Mg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ng, false), n60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.x0(null, i12, false), n60Var.U1, 1.0f);
        }
        if (q1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ih, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ig, false));
        }
    }

    public static void d1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                D3 = new n60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                D3 = new n60(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            D3.i0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(19));
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

    public static /* synthetic */ void n(n60 n60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(declineconferencecallinvite, new h30(n60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(n60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = n60Var.a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            n60Var.a1.invitedUsersMap.remove(l4);
            n60Var.a1.invitedUsersMessageIds.remove(l4);
            n60Var.P0(true);
        }
    }

    public static void o(final n60 n60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = n60Var.d;
        ArrayList arrayList = n60Var.F0;
        h60 h60Var = n60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            n60Var.f1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.e4) {
            n60Var.G1((org.telegram.ui.Cells.e4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l4 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.w3)) {
            if (i10 != h60Var.w) {
                if (i10 != h60Var.x) {
                    if (i10 == h60Var.y) {
                        n60Var.w1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = n60Var.a1;
                if (call2 == null || call2.call == null) {
                    return;
                }
                ug.m1 m1Var = new ug.m1(activity, n60Var.currentAccount, null, 4, new bi.s0());
                ChatObject.Call call3 = n60Var.a1;
                m1Var.C0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new k2.f(5)).collect(Collectors.toSet()) : null);
                m1Var.i0(false, true);
                m1Var.A0 = new z20(n60Var, 3);
                m1Var.i0(false, true);
                m1Var.D0 = new bi.f0(14, n60Var, call);
                m1Var.show();
                return;
            }
            if (ChatObject.isChannel(n60Var.Z0) && (chat = n60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                n60Var.k1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(n60Var.j1());
            if (chatFull == null) {
                return;
            }
            n60Var.w0 = false;
            Context context = n60Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = n60Var.Z0;
            ChatObject.Call call4 = n60Var.a1;
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            n60Var.E1 = e40Var;
            e40Var.setOnDismissListener(new d30(n60Var, 2));
            org.telegram.ui.Components.e40 e40Var2 = n60Var.E1;
            e40Var2.g0 = new n30(n60Var);
            e40Var2.show();
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        if (w3Var.getUser() == null) {
            return;
        }
        if (!n60Var.p1()) {
            n60Var.i0.K0(n60Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w3Var.getUser().id);
            if (w3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            n60Var.i0.p0(new ProfileActivity(bundle, null));
            n60Var.dismiss();
            return;
        }
        int i11 = i10 - h60Var.n;
        if (i11 < 0 || i11 >= n60Var.a1.shadyJoinParticipants.size()) {
            int i12 = i10 - h60Var.s;
            if (i12 < 0 || i12 >= n60Var.a1.shadyLeftParticipants.size()) {
                int i13 = i10 - h60Var.f;
                if (n60Var.s0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l4 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < n60Var.a1.invitedUsers.size()) {
                    l4 = n60Var.a1.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l4 = n60Var.a1.shadyLeftParticipants.get(i10 - h60Var.s);
            }
        } else {
            l4 = n60Var.a1.shadyJoinParticipants.get(i10 - h60Var.n);
        }
        if (z10 || (invitedUser = n60Var.a1.invitedUsersMessageIds.get(l4)) == null) {
            return;
        }
        org.telegram.ui.Components.m80 F = org.telegram.ui.Components.m80.F(n60Var.container, n60Var.resourcesProvider, w3Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(n60Var) { // from class: org.telegram.ui.f30
            public final /* synthetic */ n60 b;

            {
                this.b = n60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        n60.t(this.b, invitedUser, l4);
                        break;
                    default:
                        n60.n(this.b, invitedUser, l4);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(n60Var) { // from class: org.telegram.ui.f30
            public final /* synthetic */ n60 b;

            {
                this.b = n60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        n60.t(this.b, invitedUser, l4);
                        break;
                    default:
                        n60.n(this.b, invitedUser, l4);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), n60Var.C0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void q(n60 n60Var, Activity activity) {
        LaunchActivity launchActivity = n60Var.i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            n60Var.i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            n60Var.O1(true, false);
            n60Var.N1(false);
            n60Var.a1.sortParticipants();
            n60Var.P0(true);
            n60Var.e.requestLayout();
            return;
        }
        n60Var.j0[0].e(1, false);
        if (n60Var.z0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            y40 y40Var = new y40(n60Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            n60Var.z0 = y40Var;
            y40Var.setBottomPadding(n60Var.containerView.getPaddingBottom());
            n60Var.container.addView(n60Var.z0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static boolean q1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void r(n60 n60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        n60Var.d2 = floatValue;
        n60Var.a2.n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        h40 h40Var = n60Var.C2;
        h40Var.setScaleX(f12);
        h40Var.setScaleY(f12);
        h40Var.setTranslationX((1.0f - n60Var.d2) * f10);
        h40Var.setTranslationY((1.0f - n60Var.d2) * f11);
        if (!n60Var.g2) {
            n60Var.W2.setAlpha((int) (n60Var.d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = n60Var.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners((1.0f - n60Var.d2) * AndroidUtilities.dp(8.0f));
        }
        h40Var.invalidate();
        n60Var.containerView.invalidate();
        g40 g40Var = n60Var.b;
        int i11 = (int) ((1.0f - n60Var.d2) * i10);
        g40Var.N(i11, i11);
    }

    public static /* synthetic */ void s(n60 n60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = n60Var.a1;
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
            n60Var.a1.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = n60Var.a1.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(n60Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new fi.a1(n60Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        n60Var.P0(true);
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
        n60Var.O1(true, true);
    }

    public static /* synthetic */ void t(n60 n60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(declineconferencecallinvite, new h30(n60Var, 1));
        ChatObject.Call call = n60Var.a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            n60Var.P0(true);
        }
    }

    public static /* synthetic */ void u(n60 n60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(n60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
            a2VarArr[0] = a2Var;
            a2Var.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            if (z10) {
                a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
            } else {
                a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.g6.rg;
                int i11 = org.telegram.ui.ActionBar.g6.pg;
                int i12 = org.telegram.ui.ActionBar.g6.ng;
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
            e.addView(a2VarArr[0], w7.a6.n(-1, -2));
            a2VarArr[0].setOnClickListener(new a30(a2VarArr, 0));
        }
        alertDialog$Builder.n(e);
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.g6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new di.w6(call, a2VarArr, selfId, runnable, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.P0 = false;
        }
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                a2Var2.getWindow().setType(2038);
            } else {
                a2Var2.getWindow().setType(2003);
            }
            a2Var2.getWindow().clearFlags(2);
        }
        if (!z10) {
            a2Var2.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false));
        }
        a2Var2.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) a2Var2.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.vg, false));
        }
        a2Var2.o(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hg, false));
    }

    public static void v(n60 n60Var) {
        n60Var.Z0();
        n60Var.W0();
        n60Var.V0();
        n60Var.F.setTranslationY((-n60Var.C1.d()) + n60Var.containerView.getPaddingBottom());
        n60Var.G.invalidate();
        n60Var.a1();
        n60Var.containerView.invalidate();
    }

    public static /* synthetic */ void w(n60 n60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(n60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void x(n60 n60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(n60Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(n60Var, updates, j10, 24));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(n60Var, hashSet, call, str, 7));
    }

    public static void x1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
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

    public static /* synthetic */ void y(n60 n60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(n60Var.currentAccount).getUser(l4));
            getrequirementstocontact.id.add(MessagesController.getInstance(n60Var.currentAccount).getInputUser(longValue));
        }
        bi.c3 c3Var = new bi.c3(n60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(n60Var.currentAccount).isPremium()) {
            c3Var.run();
        } else {
            ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(getrequirementstocontact, new fa(arrayList, arrayList2, c3Var, 13));
        }
    }

    public static /* synthetic */ void z(n60 n60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(34, n60Var.currentAccount, U.getContext(), U, new bi.s0());
        j0Var.J1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public final void A1() {
        a6 a6Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (!this.z2 || this.U0 == null || VoIPService.getSharedInstance() == null || !s1() || this.Q == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(a6Var, 30L);
    }

    public final void B1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.H.setText("");
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.a1;
        long j10 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j10, inputGroupCall);
    }

    public final void C1(float f7) {
        this.U1 = f7;
        e40 e40Var = this.a2;
        float max = Math.max(f7, e40Var == null ? 0.0f : e40Var.c);
        int i10 = org.telegram.ui.ActionBar.g6.jg;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.g6.x0(null, i11, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.k1.B(-14472653);
        this.f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.tg, false), f7, 1.0f);
        y50 y50Var = this.p0;
        if (y50Var != null) {
            y50Var.j = offsetColor2;
            x50 x50Var = y50Var.g;
            if (x50Var != null) {
                x50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        t50 t50Var = this.Q;
        t50Var.setGlowColor(offsetColor2);
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Eg, false), f7, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.lg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.mg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int childCount = t50Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = t50Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (p1()) {
                    x3Var.a(w02, w02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                j50 j50Var = this.O;
                if (z10) {
                    ((org.telegram.ui.Cells.e4) childAt).f(j50Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    ((org.telegram.ui.Cells.w3) childAt).a(j50Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        t50Var.invalidate();
        this.container.invalidate();
    }

    public final void D1(float f7) {
        t50 t50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s4.b1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f7 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.a1;
        if (call == null || (t50Var = this.Q) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) == null) {
            return;
        }
        e40 e40Var = this.a2;
        if (e40Var.b) {
            int i10 = 0;
            while (true) {
                a40 a40Var = this.m2;
                if (i10 >= a40Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) a40Var.getChildAt(i10);
                if (MessageObject.getPeerId(e30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    e30Var.setAmplitude(f7 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.s0 ? this.D0 : this.a1.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = t50Var.K(indexOf + this.P.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) view).setAmplitude(f7 * 15.0f);
                    if (view == this.X2 && !this.l2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        e40Var.k(groupCallParticipant, f7 * 15.0f);
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
        c60 c60Var = this.U0;
        e40 e40Var = this.a2;
        y30 y30Var = this.f1;
        w30 w30Var = this.e1;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (c60Var != null) {
                c60Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                C1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            w30Var.setScaleX(Math.max(0.9f, f11));
            w30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            w30Var.setAlpha((1.0f - e40Var.c) * Math.max(0.0f, f12));
            y30Var.setScaleX(Math.max(0.9f, f11));
            y30Var.setScaleY(Math.max(0.9f, f11));
            y30Var.setAlpha((1.0f - e40Var.c) * Math.max(0.0f, f12));
        } else {
            w30Var.setScaleX(1.0f);
            w30Var.setScaleY(1.0f);
            w30Var.setAlpha(1.0f - e40Var.c);
            y30Var.setScaleX(1.0f);
            y30Var.setScaleY(1.0f);
            y30Var.setAlpha(1.0f - e40Var.c);
            if (this.U1 > 1.0E-4f) {
                C1(0.0f);
            }
            i10 = 0;
        }
        Z0();
        float f13 = i10;
        this.z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (c60Var != null) {
            c60Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        v40 v40Var = this.R;
        if (v40Var != null) {
            v40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
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
        k60 k60Var;
        long j10;
        di.v5 v5Var;
        org.telegram.ui.ActionBar.u1 u1Var;
        AccountInstance accountInstance;
        boolean z10;
        long j11;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j12;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z11;
        u50 u50Var;
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
            n50 n50Var = this.f3;
            if (n50Var != null) {
                n50Var.dismiss();
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
                        this.containerView.addView(e4Var, w7.a6.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
                    }
                    if (e4Var != null) {
                        boolean z13 = (F3 || G3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = e4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ri(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new w20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.E2 = linearLayout;
                            di.v5 v5Var2 = new di.v5(getContext(), linearLayout, linearLayout2, 7);
                            v5Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            v5Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.tg, false), this.U1, 1.0f);
                            if (linearLayout2 == null || e4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                k60Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                v5Var2.addView(linearLayout2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                k60Var = new k60(this, getContext(), participant);
                                linearLayout2.addView(k60Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            v5Var2.addView(linearLayout, w7.a6.k(0.0f, k60Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(getContext(), R.style.scrollbarShapeStyle, v5Var2);
                            u1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(u1Var2, w7.a6.d(-2.0f, -2));
                            k60 k60Var2 = k60Var;
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
                                    j10 = peerId;
                                    v5Var = v5Var2;
                                    u1Var = u1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, j1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z10 = true;
                                    }
                                    z10 = false;
                                } else {
                                    j10 = peerId;
                                    v5Var = v5Var2;
                                    u1Var = u1Var2;
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
                                j10 = peerId;
                                v5Var = v5Var2;
                                u1Var = u1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (e4Var.c()) {
                                if (p1() && e4Var.K) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    org.telegram.ui.Cells.d0.m(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(e4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                org.telegram.ui.Cells.d0.m(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                org.telegram.ui.Cells.d0.m(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                org.telegram.ui.Cells.d0.m(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (R0()) {
                                if (!p1() && z10 && participant.muted) {
                                    if (p1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        org.telegram.ui.Cells.d0.o(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.d0.m(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                                    j11 = 0;
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j13 = peer.channel_id;
                                    if (j13 != j11 && !ChatObject.isMegagroup(this.currentAccount, j13)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.d0.o(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (p1() ? !(z10 || !ChatObject.canBlockUsers(this.Z0)) : !((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            org.telegram.ui.Cells.d0.m(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (p1()) {
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    org.telegram.ui.Cells.d0.o(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    org.telegram.ui.Cells.d0.m(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j14 = peer2.channel_id;
                                    if (j14 != 0 && !ChatObject.isMegagroup(this.currentAccount, j14)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.d0.o(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.g6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    e1Var.c(org.telegram.ui.ActionBar.g6.x0(null, i15, false), org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i16 = org.telegram.ui.ActionBar.g6.vg;
                                    e1Var.c(org.telegram.ui.ActionBar.g6.x0(null, i16, false), org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                                }
                                e1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.x0(r42, org.telegram.ui.ActionBar.g6.eg, z12));
                                e1Var.g((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(e1Var);
                                e1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                e1Var.setOnClickListener(new bi.f7(this, i14, arrayList4, groupCallParticipant, 3));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            u1Var.addView(v5Var, w7.a6.x(-2, -2, 51));
                            t50 t50Var = this.Q;
                            t50Var.B0();
                            this.Y.X = false;
                            this.X2 = e4Var;
                            e4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            t50Var.invalidate();
                            AnimatorSet animatorSet = this.e3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.e2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (j10 > j11) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1);
                                j12 = j10;
                                if (MessagesController.getInstance(this.currentAccount).getUserFull(j12) == null) {
                                    MessagesController.getInstance(this.currentAccount).loadUserInfo(user, false, 0);
                                }
                            } else {
                                j12 = j10;
                                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j12));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), chat, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), chat, 1);
                            }
                            org.telegram.ui.Components.voip.t tVar = this.Z2;
                            boolean z16 = tVar != null && tVar.v;
                            if (forUserOrChat != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.z9 avatarImageView = this.X2.getAvatarImageView();
                                    g40 g40Var = this.b;
                                    g40Var.setParentAvatarImage(avatarImageView);
                                    g40Var.setHasActiveVideo(z16);
                                    g40Var.M(j12, true);
                                    g40Var.setCreateThumbFromParent(true);
                                    g40Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.t tVar2 = this.Z2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.A0) == j12 && this.h2 != null && (u50Var = this.i2) != null && (fileLocation = u50Var.c) != null) {
                                        g40Var.A(u50Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.e2, w7.a6.d(-2.0f, -2));
                                this.g2 = true;
                                j40 j40Var = this.b2;
                                if (j40Var == null) {
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
                                    j40Var.setBackground(new BitmapDrawable(createBitmap));
                                    j40Var.setAlpha(0.0f);
                                    j40Var.setVisibility(0);
                                    j40Var.bringToFront();
                                }
                                this.c3 = true;
                                this.C2.setVisibility(i11);
                                if (k60Var2 != null) {
                                    k60Var2.invalidate();
                                }
                                z1(true, e4Var);
                                org.telegram.ui.Components.e30 e30Var = this.a3;
                                if (e30Var != null) {
                                    e30Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.f2 = false;
                            n50 n50Var2 = new n50(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.f3 = n50Var2;
                            n50Var2.e = true;
                            n50Var2.c = 220;
                            n50Var2.setOutsideTouchable(true);
                            this.f3.setClippingEnabled(true);
                            this.f3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.f3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.f3.setInputMethodMode(2);
                            this.f3.setSoftInputMode(0);
                            this.f3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.e30 e30Var2 = this.a3;
                            if (e30Var2 != null) {
                                boolean z17 = F3;
                                e40 e40Var = this.a2;
                                a40 a40Var = this.m2;
                                if (z17) {
                                    x10 = AndroidUtilities.dp(32.0f) + (((int) (e40Var.getX() + (a40Var.getX() + e30Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (e40Var.getY() + (a40Var.getY() + this.a3.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x10 = ((int) (e40Var.getX() + (a40Var.getX() + e30Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y3 = (e40Var.getY() + (a40Var.getY() + this.a3.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y3;
                                }
                            } else {
                                x10 = (int) (((t50Var.getX() + t50Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.b3) {
                                    y10 = e4Var.getY() + t50Var.getY();
                                    measuredHeight = e4Var.getClipHeight();
                                } else if (this.Y2 != null) {
                                    y10 = this.Y2.getY() + t50Var.getY();
                                    measuredHeight = this.Y2.getMeasuredHeight();
                                } else {
                                    y3 = t50Var.getY();
                                    i10 = (int) y3;
                                }
                                i10 = (int) (y10 + measuredHeight);
                            }
                            this.f3.showAtLocation(t50Var, 51, x10, i10);
                            this.e3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.W2, org.telegram.ui.Components.v6.b, 0, 100));
                            this.e3.playTogether(arrayList5);
                            this.e3.setDuration(150L);
                            this.e3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.e30) {
                    org.telegram.ui.Components.e30 e30Var3 = (org.telegram.ui.Components.e30) view;
                    if (e30Var3.getParticipant() != this.a1.videoNotAvailableParticipant.participant) {
                        e4Var = new org.telegram.ui.Cells.e4(e30Var3.getContext());
                        e4Var.e(this.d, e30Var3.getParticipant(), this.a1, MessageObject.getPeerId(this.A0), null, false);
                        org.telegram.ui.Components.q5 q5Var2 = e4Var.s;
                        if (q5Var2 != null) {
                            q5Var2.f();
                        }
                        this.b3 = false;
                        this.a3 = e30Var3;
                        org.telegram.ui.Components.voip.t renderer = e30Var3.getRenderer();
                        this.Z2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Z2 = null;
                        }
                        this.containerView.addView(e4Var, w7.a6.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
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
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(8, getContext(), null, true);
            this.m0 = v40Var;
            v40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
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
        org.telegram.ui.Components.voip.u2 u2Var = this.v;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        org.telegram.ui.Components.voip.u2 u2Var3 = this.r;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.f;
        org.telegram.ui.Components.voip.u2 u2Var5 = this.n;
        org.telegram.ui.Components.voip.u2 u2Var6 = this.s;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.w;
        r30 r30Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            r30Var.c(u2Var7, this.V0 > 0.1f, z10);
            r30Var.c(u2Var6, this.V0 > 0.1f, z10);
            r30Var.c(u2Var3, this.V0 > 0.1f, z10);
            r30Var.c(u2Var5, false, z10);
            r30Var.c(u2Var4, false, z10);
            r30Var.c(u2Var2, false, z10);
            r30Var.c(u2Var, false, z10);
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
        r30Var.c(u2Var7, true, z10);
        r30Var.c(u2Var6, true, z10);
        r30Var.c(u2Var5, z12, z10);
        r30Var.c(u2Var4, z14, z10);
        r30Var.c(u2Var3, z15, z10);
        r30Var.c(u2Var2, z13, z10);
        r30Var.c(u2Var, z11, z10);
    }

    public final void J1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.a1 == null) {
                u0Var.setVisibility(8);
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
        org.telegram.ui.ActionBar.e1 e1Var = this.n1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.Z0) || ((chat2 = this.Z0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.Z0) || ChatObject.canUserDoAdminAction(this.Z0, 3))) || (ChatObject.isChannel(this.Z0) && (chat = this.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            e1Var.setVisibility(0);
        } else {
            e1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.x1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        } else {
            e1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            e1Var2.setVisibility(this.a1.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.q1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            e1Var4.setVisibility(8);
        } else {
            e1Var4.setVisibility(0);
        }
        e1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        e1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean R0 = R0();
        org.telegram.ui.ActionBar.e1 e1Var5 = this.w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.o1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.t1;
        if (R0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (s1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (p1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (!this.a1.canRecordVideo() || this.a1.isScheduled() || s1()) {
                e1Var8.setVisibility(8);
            } else {
                e1Var8.setVisibility(0);
            }
            u0Var2.setVisibility(8);
            boolean z11 = this.a1.recording;
            i60 i60Var = this.d1;
            i60Var.f = z11;
            i60Var.d = 1.0f;
            i60Var.invalidateSelf();
            if (this.a1.recording) {
                if (this.D1 == null) {
                    z20 z20Var = new z20(this, 6);
                    this.D1 = z20Var;
                    AndroidUtilities.runOnUIThread(z20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                z20 z20Var2 = this.D1;
                if (z20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(z20Var2);
                    this.D1 = null;
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            L1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || R0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.a1.canRecordVideo() || z13) || this.a1.isScheduled() || s1())) {
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(8);
            } else if (z13) {
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(0);
                e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(0);
            }
            e1Var5.setVisibility(8);
            e1Var6.setVisibility(8);
            e1Var7.setVisibility(8);
        }
        boolean R02 = R0();
        org.telegram.ui.ActionBar.e1 e1Var9 = this.r1;
        if (R02 && this.a1.call.can_change_join_muted && !p1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (p1() && ((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        u0Var.I(4, z10);
        this.p1.setVisibility((!s1() || this.a1.isScheduled()) ? 0 : 8);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility == 0 || e1Var9.getVisibility() == 0 || e1Var.getVisibility() == 0 || e1Var8.getVisibility() == 0 || e1Var7.getVisibility() == 0 || e1Var5.getVisibility() == 0) {
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
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !s1() || e1Var.getVisibility() != 8) {
            u0Var.setVisibility(0);
        } else {
            u0Var.setVisibility(8);
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
        m60[] m60VarArr;
        boolean z13;
        m60 m60Var;
        m60 m60Var2;
        boolean z14;
        boolean z15;
        e40 e40Var = this.a2;
        boolean z16 = e40Var != null && e40Var.b && (AndroidUtilities.isTablet() || F3 == r1());
        if (!s1() && this.F1 == i10 && z10) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.yj0 yj0Var = this.J0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            P5 = yj0Var.P(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.F1;
                        if (i13 == 3) {
                            int i14 = yj0Var.f;
                            P3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? yj0Var.P(99) : false;
                        } else if (i13 == 5) {
                            P3 = yj0Var.P(404);
                        } else if (i13 == 7) {
                            P3 = yj0Var.P(376);
                        } else if (i13 == 6) {
                            P3 = yj0Var.P(237);
                        } else {
                            if (i13 == 2) {
                                z12 = yj0Var.P(36);
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
                                org.telegram.ui.Components.voip.u2 u2Var = this.w;
                                u2Var.setContentDescription(D);
                                u2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                s30 s30Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i10 == 5) {
                                            yj0Var.M(376);
                                        } else if (i10 == 7) {
                                            yj0Var.M(173);
                                        } else if (i10 == 6) {
                                            yj0Var.M(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.F1;
                                            if (i15 == 5) {
                                                yj0Var.M(376);
                                            } else if (i15 == 7) {
                                                yj0Var.M(344);
                                            } else if (i15 == 6) {
                                                yj0Var.M(202);
                                            } else if (i15 == 2) {
                                                yj0Var.M(0);
                                            } else {
                                                yj0Var.M(69);
                                            }
                                        } else if (i10 == 1 || (this.F1 == 2 && p1())) {
                                            yj0Var.M(this.F1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            yj0Var.M(99);
                                        } else if (z11) {
                                            int i16 = this.F1;
                                            if (i16 == 7) {
                                                yj0Var.M(274);
                                            } else if (i16 == 6) {
                                                yj0Var.M(237);
                                            } else if (i16 == 1) {
                                                yj0Var.M(136);
                                            } else {
                                                yj0Var.M(99);
                                            }
                                        } else {
                                            int i17 = this.F1;
                                            if (i17 == 5) {
                                                yj0Var.M(376);
                                            } else if (i17 == 7) {
                                                yj0Var.M(344);
                                            } else if (i17 == 6) {
                                                yj0Var.M(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                yj0Var.M(0);
                                            } else {
                                                yj0Var.M(69);
                                            }
                                        }
                                    }
                                    s30Var.d();
                                    if (!s1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        s30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((e40Var != null && e40Var.b && (AndroidUtilities.isTablet() || F3 == r1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        s30Var.setVisibility(8);
                                    }
                                    this.F1 = i10;
                                } else {
                                    this.F1 = i10;
                                    yj0Var.N(yj0Var.f - 1, false, true);
                                    if (!s1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        s30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((e40Var != null && e40Var.b && (AndroidUtilities.isTablet() || F3 == r1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        s30Var.setVisibility(8);
                                    }
                                }
                                u2Var.invalidate();
                                i11 = this.F1;
                                m60VarArr = this.K1;
                                if (m60VarArr[i11] == null) {
                                    m60VarArr[i11] = new m60(i11);
                                    int i18 = this.F1;
                                    if (i18 == 3) {
                                        m60VarArr[i18].g = null;
                                    } else if (q1(i18)) {
                                        m60VarArr[this.F1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ih, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kh, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.F1;
                                        if (i19 != 1) {
                                            z13 = false;
                                            m60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            m60Var = m60VarArr[this.F1];
                                            m60Var2 = this.N1;
                                            if (m60Var != m60Var2) {
                                                this.M1 = m60Var2;
                                                this.N1 = m60Var;
                                                if (m60Var2 == null || !z10) {
                                                    this.L1 = 1.0f;
                                                    this.M1 = null;
                                                } else {
                                                    this.L1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                m60 m60Var3 = this.N1;
                                                if (m60Var3 != null) {
                                                    int i20 = m60Var3.i;
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
                                        m60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                z13 = false;
                                m60Var = m60VarArr[this.F1];
                                m60Var2 = this.N1;
                                if (m60Var != m60Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            P3 = yj0Var.P(99);
                        }
                        z12 = P3;
                        str = string3;
                        string2 = string4;
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(p1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            P4 = yj0Var.P(this.F1 == 4 ? 99 : 69);
                        } else if (p1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            P4 = yj0Var.P(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || R0()) ? false : true;
                                if (z11) {
                                    int i21 = this.F1;
                                    if (i21 == 7) {
                                        P2 = yj0Var.P(311);
                                    } else if (i21 == 6) {
                                        P2 = yj0Var.P(274);
                                    } else if (i21 == 1) {
                                        P2 = yj0Var.P(173);
                                    } else {
                                        P = yj0Var.P(136);
                                    }
                                    P = P2;
                                } else {
                                    int i22 = this.F1;
                                    if (i22 == 5) {
                                        P2 = yj0Var.P(404);
                                    } else if (i22 == 7) {
                                        P = yj0Var.P(376);
                                    } else if (i22 == 6) {
                                        P = yj0Var.P(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        P = yj0Var.P(36);
                                    } else {
                                        P2 = yj0Var.P(99);
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
                                org.telegram.ui.Components.voip.u2 u2Var2 = this.w;
                                u2Var2.setContentDescription(D);
                                u2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                s30 s30Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                u2Var2.invalidate();
                                i11 = this.F1;
                                m60VarArr = this.K1;
                                if (m60VarArr[i11] == null) {
                                }
                                z13 = false;
                                m60Var = m60VarArr[this.F1];
                                m60Var2 = this.N1;
                                if (m60Var != m60Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            P3 = yj0Var.P(136);
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
                    org.telegram.ui.Components.voip.u2 u2Var22 = this.w;
                    u2Var22.setContentDescription(D);
                    u2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    s30 s30Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    u2Var22.invalidate();
                    i11 = this.F1;
                    m60VarArr = this.K1;
                    if (m60VarArr[i11] == null) {
                    }
                    z13 = false;
                    m60Var = m60VarArr[this.F1];
                    m60Var2 = this.N1;
                    if (m60Var != m60Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = yj0Var.P(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (s1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.u2 u2Var222 = this.w;
                u2Var222.setContentDescription(D);
                u2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                s30 s30Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                u2Var222.invalidate();
                i11 = this.F1;
                m60VarArr = this.K1;
                if (m60VarArr[i11] == null) {
                }
                z13 = false;
                m60Var = m60VarArr[this.F1];
                m60Var2 = this.N1;
                if (m60Var != m60Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            P5 = yj0Var.P(344);
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
        org.telegram.ui.Components.voip.u2 u2Var2222 = this.w;
        u2Var2222.setContentDescription(D);
        u2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        s30 s30Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        u2Var2222.invalidate();
        i11 = this.F1;
        m60VarArr = this.K1;
        if (m60VarArr[i11] == null) {
        }
        z13 = false;
        m60Var = m60VarArr[this.F1];
        m60Var2 = this.N1;
        if (m60Var != m60Var2) {
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
        org.telegram.ui.ActionBar.e1 e1Var = this.s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        v40 v40Var = this.R;
        if ((v40Var == null || this.a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (v40Var == null) {
                return;
            }
        }
        if (!z10) {
            v30 v30Var = this.w2;
            AndroidUtilities.cancelRunOnUIThread(v30Var);
            v30Var.run();
            ChatObject.Call call = this.a1;
            t50 t50Var = this.Q;
            if (call == null || call.isScheduled()) {
                t50Var.setVisibility(4);
            } else {
                t50Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.es.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
            this.W0 = esVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * esVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        v40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        s50 s50Var = this.V;
        s50Var.setAlpha(f7);
        s50Var.setScaleX(interpolation);
        s50Var.setScaleY(interpolation);
        t40 t40Var = this.T;
        t40Var.setScaleX(f11);
        t40Var.setScaleY(f11);
        t40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.k1.setAlpha(f7);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != v40Var.getVisibility()) {
            v40Var.setVisibility(i10);
            t40Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        org.telegram.ui.Components.voip.u2 u2Var = this.r;
        if (u2Var == null || u2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r30 r30Var = this.e;
        if (sharedInstance == null || s1()) {
            u2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.Z0) || (ChatObject.hasAdminRights(this.Z0) && ChatObject.canAddUsers(this.Z0));
            lh.a aVar = (lh.a) r30Var.c.get(u2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
            return;
        }
        lh.a aVar2 = (lh.a) r30Var.c.get(u2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            u2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            u2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
        } else if (z13) {
            u2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            u2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
        } else {
            u2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        }
        u2Var.b(z13, z10);
        i1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.a0 != i10) {
            this.a0 = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.b0, i10);
        }
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        if (u2Var2.getVisibility() == 0) {
            u2Var2.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
            u2Var2.b(i1() != 1, z10);
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
        long j10;
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
        org.telegram.ui.Components.voip.u2 u2Var;
        org.telegram.ui.Components.voip.u2 u2Var2;
        org.telegram.ui.Components.voip.u2 u2Var3;
        boolean z19;
        boolean s12;
        int i13;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.s;
        int i14 = 6;
        if (call == null || call.isScheduled()) {
            if (R0()) {
                i14 = 5;
            } else if (this.a1.call.schedule_start_subscribed) {
                i14 = 7;
            }
            K1(i14, z10);
            u2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            M1(false);
            return;
        }
        I1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
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
                e40 e40Var = this.a2;
                int i16 = i15 + ((e40Var == null && e40Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.o0 | 2) == (i16 | 2);
                this.o0 = i16;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.u2 u2Var5 = this.n;
                if (z14) {
                    u2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    u2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.u2 u2Var6 = this.f;
                if (i12 != 0) {
                    u2Var6.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    u2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.u2 u2Var7 = this.h;
                if (z17) {
                    u2Var = u2Var6;
                    u2Var2 = u2Var5;
                    u2Var3 = u2Var7;
                    z19 = z10;
                } else {
                    i1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i17 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.a0 != i17) {
                        this.a0 = i17;
                        AndroidUtilities.updateImageViewImageAnimated(this.b0, i17);
                    }
                    u2Var2 = u2Var5;
                    u2Var = u2Var6;
                    u2Var7.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
                    u2Var3 = u2Var7;
                    z19 = z10;
                    u2Var3.b(i1() != 1, z19);
                }
                org.telegram.ui.Components.voip.u2 u2Var8 = u2Var3;
                u2Var4.c(!s1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    N1(false);
                }
                u2Var2.d(true, z19);
                u2Var.d(true, z19);
                u2Var8.d(true, z19);
                s12 = s1();
                y30 y30Var = this.f1;
                if (s12) {
                    y30Var.setVisibility(8);
                } else {
                    y30Var.setVisibility(0);
                    boolean z21 = ((Integer) y30Var.getTag()).intValue() == 3;
                    int i18 = this.T1;
                    final boolean z22 = i18 == 3;
                    y30Var.setTag(Integer.valueOf(i18));
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
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.e30
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i19, floatValue, 1.0f);
                                    n60 n60Var = n60.this;
                                    n60Var.g1.setColor(offsetColor);
                                    n60Var.f1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    n60Var.i1 = floatValue;
                                    c60 c60Var = n60Var.U0;
                                    if (c60Var == null || !n60Var.z2) {
                                        return;
                                    }
                                    c60Var.invalidate();
                                }
                            });
                            this.h1.setDuration(300L);
                            this.h1.setInterpolator(org.telegram.ui.Components.es.f);
                            this.h1.addListener(new g50(this, 2));
                            this.h1.start();
                        } else {
                            paint.setColor(this.T1 == 3 ? -1163700 : -12761513);
                            y30Var.invalidate();
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
            if (groupCallParticipant2.raise_hand_rating != j10) {
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
        e40 e40Var2 = this.a2;
        int i162 = i152 + ((e40Var2 == null && e40Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.o0 | 2) == (i162 | 2)) {
        }
        this.o0 = i162;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.u2 u2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.u2 u2Var62 = this.f;
        if (i12 != 0) {
        }
        org.telegram.ui.Components.voip.u2 u2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.u2 u2Var82 = u2Var3;
        u2Var4.c(!s1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            N1(false);
        }
        u2Var2.d(true, z19);
        u2Var.d(true, z19);
        u2Var82.d(true, z19);
        s12 = s1();
        y30 y30Var2 = this.f1;
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
        t50 t50Var;
        h60 h60Var;
        e40 e40Var;
        t50 t50Var2;
        boolean z11;
        int i10;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        t50 t50Var3;
        e40 e40Var2;
        boolean z12;
        a40 a40Var;
        ?? r02;
        ?? r82;
        ChatObject.Call call;
        boolean z13;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        s4.b1 G;
        g gVar;
        int i14;
        n60 n60Var = this;
        h60 h60Var2 = n60Var.P;
        e40 e40Var3 = n60Var.a2;
        if (e40Var3 == null || (t50Var = n60Var.Q) == null || n60Var.a1 == null || n60Var.s0) {
            return;
        }
        if (e40Var3.b) {
            e40Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(n60Var.a1.selfPeer);
        if (peerId != MessageObject.getPeerId(n60Var.A0) && n60Var.a1.participants.f(peerId) != null) {
            n60Var.A0 = n60Var.a1.selfPeer;
        }
        int childCount = t50Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = t50Var.getChildAt(i17);
            s4.b1 G2 = t50Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = n60Var.q0;
        arrayList3.clear();
        if (!G3) {
            arrayList3.addAll(n60Var.a1.visibleVideoParticipants);
        } else if (e40Var3.b) {
            arrayList3.addAll(n60Var.a1.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = e40Var3.e;
            if (videoParticipant3 != null) {
                arrayList3.remove(videoParticipant3);
            }
        }
        if (t50Var.getItemAnimator() != null && !z10) {
            t50Var.setItemAnimator(null);
        } else if (t50Var.getItemAnimator() == null && z10) {
            t50Var.setItemAnimator(n60Var.X);
        }
        try {
            gVar = new g(h60Var2, 21);
            try {
                try {
                    z11 = true;
                } catch (Exception e) {
                    e = e;
                    h60Var = h60Var2;
                    z11 = true;
                }
            } catch (Exception e7) {
                e = e7;
                h60Var = h60Var2;
                t50Var2 = t50Var;
                z11 = true;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i16;
                e40Var = e40Var3;
            }
        } catch (Exception e10) {
            e = e10;
            h60Var = h60Var2;
            e40Var = e40Var3;
            t50Var2 = t50Var;
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
                        e40Var = e40Var3;
                    } catch (Exception e11) {
                        e = e11;
                        e40Var = e40Var3;
                    }
                } catch (Exception e12) {
                    e = e12;
                    i11 = i16;
                    e40Var = e40Var3;
                    t50Var2 = t50Var;
                    i10 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e13) {
                e = e13;
                h60Var = h60Var2;
                arrayList = arrayList3;
                i11 = i16;
                e40Var = e40Var3;
                t50Var2 = t50Var;
                i10 = childCount;
            }
        } catch (Exception e14) {
            e = e14;
            h60Var = h60Var2;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i16;
            e40Var = e40Var3;
            t50Var2 = t50Var;
            FileLog.e(e);
            h60Var.l();
            n60Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList4 = n60Var.D0;
            arrayList4.clear();
            arrayList4.addAll(n60Var.a1.visibleParticipants);
            ArrayList arrayList5 = n60Var.E0;
            arrayList5.clear();
            arrayList2 = arrayList;
            arrayList5.addAll(arrayList2);
            ArrayList arrayList6 = n60Var.F0;
            arrayList6.clear();
            arrayList6.addAll(n60Var.a1.invitedUsers);
            ArrayList arrayList7 = n60Var.G0;
            arrayList7.clear();
            arrayList7.addAll(n60Var.a1.shadyJoinParticipants);
            ArrayList arrayList8 = n60Var.H0;
            arrayList8.clear();
            arrayList8.addAll(n60Var.a1.shadyLeftParticipants);
            h60 h60Var3 = h60Var;
            n60Var.I0 = h60Var3.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            t50Var3 = t50Var2;
            boolean c10 = e40Var.c();
            e40Var2 = e40Var;
            if (e40Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.f30 f30Var = n60Var.p2;
            a40Var = n60Var.m2;
            f30Var.G(a40Var, z11);
            if (a40Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (t50Var3.getVisibility() == 0) {
            }
            r02 = n60Var.Z1;
            r02.clear();
            r02.addAll(n60Var.Y1);
            while (r82 < r02.size()) {
            }
            call = n60Var.a1;
            if (call != null) {
            }
            ChatObject.Call call2 = n60Var.a1;
            if (call2 != null) {
            }
            n60Var.C3.a(z13, z10);
            if (z13 == n60Var.I2) {
            }
        }
        try {
            t50Var2 = t50Var;
            try {
                try {
                    try {
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Exception e16) {
                    e = e16;
                    i10 = childCount;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i11 = i14;
                    i10 = childCount;
                    n60Var = this;
                    h60Var = h60Var2;
                    try {
                        n60Var.E1(h60Var2.K, h60Var2.w, h60Var2.d, h60Var2.e, h60Var2.f, h60Var2.h, h60Var2.n, h60Var2.r, h60Var2.s, h60Var2.v, h60Var2.G, h60Var2.H, h60Var2.I, h60Var2.J, h60Var2.x, h60Var2.y);
                        h60Var.E();
                        z11 = true;
                        try {
                            s4.o.c(n60Var.w3, true).b(gVar);
                        } catch (Exception e17) {
                            e = e17;
                            FileLog.e(e);
                            h60Var.l();
                            n60Var.a1.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList42 = n60Var.D0;
                            arrayList42.clear();
                            arrayList42.addAll(n60Var.a1.visibleParticipants);
                            ArrayList arrayList52 = n60Var.E0;
                            arrayList52.clear();
                            arrayList2 = arrayList;
                            arrayList52.addAll(arrayList2);
                            ArrayList arrayList62 = n60Var.F0;
                            arrayList62.clear();
                            arrayList62.addAll(n60Var.a1.invitedUsers);
                            ArrayList arrayList72 = n60Var.G0;
                            arrayList72.clear();
                            arrayList72.addAll(n60Var.a1.shadyJoinParticipants);
                            ArrayList arrayList82 = n60Var.H0;
                            arrayList82.clear();
                            arrayList82.addAll(n60Var.a1.shadyLeftParticipants);
                            h60 h60Var32 = h60Var;
                            n60Var.I0 = h60Var32.F;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            t50Var3 = t50Var2;
                            boolean c102 = e40Var.c();
                            e40Var2 = e40Var;
                            if (e40Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.f30 f30Var2 = n60Var.p2;
                                a40Var = n60Var.m2;
                                f30Var2.G(a40Var, z11);
                                if (a40Var.getVisibility() == 0) {
                                }
                                if (G3) {
                                }
                                if (t50Var3.getVisibility() == 0) {
                                }
                                r02 = n60Var.Z1;
                                r02.clear();
                                r02.addAll(n60Var.Y1);
                                while (r82 < r02.size()) {
                                }
                                call = n60Var.a1;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = n60Var.a1;
                                if (call22 != null) {
                                }
                                n60Var.C3.a(z13, z10);
                                if (z13 == n60Var.I2) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.f30 f30Var22 = n60Var.p2;
                            a40Var = n60Var.m2;
                            f30Var22.G(a40Var, z11);
                            if (a40Var.getVisibility() == 0) {
                            }
                            if (G3) {
                            }
                            if (t50Var3.getVisibility() == 0) {
                            }
                            r02 = n60Var.Z1;
                            r02.clear();
                            r02.addAll(n60Var.Y1);
                            while (r82 < r02.size()) {
                            }
                            call = n60Var.a1;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = n60Var.a1;
                            if (call222 != null) {
                            }
                            n60Var.C3.a(z13, z10);
                            if (z13 == n60Var.I2) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        z11 = true;
                    }
                } catch (Exception e19) {
                    e = e19;
                    n60Var = this;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                    i10 = childCount;
                    h60Var = h60Var2;
                    FileLog.e(e);
                    h60Var.l();
                    n60Var.a1.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList422 = n60Var.D0;
                    arrayList422.clear();
                    arrayList422.addAll(n60Var.a1.visibleParticipants);
                    ArrayList arrayList522 = n60Var.E0;
                    arrayList522.clear();
                    arrayList2 = arrayList;
                    arrayList522.addAll(arrayList2);
                    ArrayList arrayList622 = n60Var.F0;
                    arrayList622.clear();
                    arrayList622.addAll(n60Var.a1.invitedUsers);
                    ArrayList arrayList722 = n60Var.G0;
                    arrayList722.clear();
                    arrayList722.addAll(n60Var.a1.shadyJoinParticipants);
                    ArrayList arrayList822 = n60Var.H0;
                    arrayList822.clear();
                    arrayList822.addAll(n60Var.a1.shadyLeftParticipants);
                    h60 h60Var322 = h60Var;
                    n60Var.I0 = h60Var322.F;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    t50Var3 = t50Var2;
                    boolean c1022 = e40Var.c();
                    e40Var2 = e40Var;
                    if (e40Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.f30 f30Var222 = n60Var.p2;
                    a40Var = n60Var.m2;
                    f30Var222.G(a40Var, z11);
                    if (a40Var.getVisibility() == 0) {
                    }
                    if (G3) {
                    }
                    if (t50Var3.getVisibility() == 0) {
                    }
                    r02 = n60Var.Z1;
                    r02.clear();
                    r02.addAll(n60Var.Y1);
                    while (r82 < r02.size()) {
                    }
                    call = n60Var.a1;
                    if (call != null) {
                    }
                    ChatObject.Call call2222 = n60Var.a1;
                    if (call2222 != null) {
                    }
                    n60Var.C3.a(z13, z10);
                    if (z13 == n60Var.I2) {
                    }
                }
            } catch (Exception e20) {
                e = e20;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i14;
                h60Var = h60Var2;
                FileLog.e(e);
                h60Var.l();
                n60Var.a1.saveActiveDates();
                if (view != null) {
                }
                ArrayList arrayList4222 = n60Var.D0;
                arrayList4222.clear();
                arrayList4222.addAll(n60Var.a1.visibleParticipants);
                ArrayList arrayList5222 = n60Var.E0;
                arrayList5222.clear();
                arrayList2 = arrayList;
                arrayList5222.addAll(arrayList2);
                ArrayList arrayList6222 = n60Var.F0;
                arrayList6222.clear();
                arrayList6222.addAll(n60Var.a1.invitedUsers);
                ArrayList arrayList7222 = n60Var.G0;
                arrayList7222.clear();
                arrayList7222.addAll(n60Var.a1.shadyJoinParticipants);
                ArrayList arrayList8222 = n60Var.H0;
                arrayList8222.clear();
                arrayList8222.addAll(n60Var.a1.shadyLeftParticipants);
                h60 h60Var3222 = h60Var;
                n60Var.I0 = h60Var3222.F;
                i12 = i10;
                i13 = 0;
                while (i13 < i12) {
                }
                t50Var3 = t50Var2;
                boolean c10222 = e40Var.c();
                e40Var2 = e40Var;
                if (e40Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.f30 f30Var2222 = n60Var.p2;
                a40Var = n60Var.m2;
                f30Var2222.G(a40Var, z11);
                if (a40Var.getVisibility() == 0) {
                }
                if (G3) {
                }
                if (t50Var3.getVisibility() == 0) {
                }
                r02 = n60Var.Z1;
                r02.clear();
                r02.addAll(n60Var.Y1);
                while (r82 < r02.size()) {
                }
                call = n60Var.a1;
                if (call != null) {
                }
                ChatObject.Call call22222 = n60Var.a1;
                if (call22222 != null) {
                }
                n60Var.C3.a(z13, z10);
                if (z13 == n60Var.I2) {
                }
            }
        } catch (Exception e21) {
            e = e21;
            t50Var2 = t50Var;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i14;
            h60Var = h60Var2;
            FileLog.e(e);
            h60Var.l();
            n60Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList42222 = n60Var.D0;
            arrayList42222.clear();
            arrayList42222.addAll(n60Var.a1.visibleParticipants);
            ArrayList arrayList52222 = n60Var.E0;
            arrayList52222.clear();
            arrayList2 = arrayList;
            arrayList52222.addAll(arrayList2);
            ArrayList arrayList62222 = n60Var.F0;
            arrayList62222.clear();
            arrayList62222.addAll(n60Var.a1.invitedUsers);
            ArrayList arrayList72222 = n60Var.G0;
            arrayList72222.clear();
            arrayList72222.addAll(n60Var.a1.shadyJoinParticipants);
            ArrayList arrayList82222 = n60Var.H0;
            arrayList82222.clear();
            arrayList82222.addAll(n60Var.a1.shadyLeftParticipants);
            h60 h60Var32222 = h60Var;
            n60Var.I0 = h60Var32222.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            t50Var3 = t50Var2;
            boolean c102222 = e40Var.c();
            e40Var2 = e40Var;
            if (e40Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.f30 f30Var22222 = n60Var.p2;
            a40Var = n60Var.m2;
            f30Var22222.G(a40Var, z11);
            if (a40Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (t50Var3.getVisibility() == 0) {
            }
            r02 = n60Var.Z1;
            r02.clear();
            r02.addAll(n60Var.Y1);
            while (r82 < r02.size()) {
            }
            call = n60Var.a1;
            if (call != null) {
            }
            ChatObject.Call call222222 = n60Var.a1;
            if (call222222 != null) {
            }
            n60Var.C3.a(z13, z10);
            if (z13 == n60Var.I2) {
            }
        }
        n60Var.a1.saveActiveDates();
        if (view != null) {
            n60Var.Y.h1(i11, view.getTop() - t50Var2.getPaddingTop());
        }
        ArrayList arrayList422222 = n60Var.D0;
        arrayList422222.clear();
        arrayList422222.addAll(n60Var.a1.visibleParticipants);
        ArrayList arrayList522222 = n60Var.E0;
        arrayList522222.clear();
        arrayList2 = arrayList;
        arrayList522222.addAll(arrayList2);
        ArrayList arrayList622222 = n60Var.F0;
        arrayList622222.clear();
        arrayList622222.addAll(n60Var.a1.invitedUsers);
        ArrayList arrayList722222 = n60Var.G0;
        arrayList722222.clear();
        arrayList722222.addAll(n60Var.a1.shadyJoinParticipants);
        ArrayList arrayList822222 = n60Var.H0;
        arrayList822222.clear();
        arrayList822222.addAll(n60Var.a1.shadyLeftParticipants);
        h60 h60Var322222 = h60Var;
        n60Var.I0 = h60Var322222.F;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            t50 t50Var4 = t50Var2;
            View childAt2 = t50Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.e4) || (childAt2 instanceof org.telegram.ui.Cells.w3)) && (G = t50Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt2).setDrawDivider(G.b() != h60Var322222.F + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.w3) childAt2).setDrawDivider(G.b() != h60Var322222.F + (-2) ? z11 : false);
                }
            }
            i13++;
            t50Var2 = t50Var4;
        }
        t50Var3 = t50Var2;
        boolean c1022222 = e40Var.c();
        e40Var2 = e40Var;
        if (e40Var2.b && (videoParticipant2 = e40Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, n60Var.a1)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                n60Var.f1(null);
            } else if (c1022222) {
                z12 = false;
                n60Var.f1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.f30 f30Var222222 = n60Var.p2;
            a40Var = n60Var.m2;
            f30Var222222.G(a40Var, z11);
            if (a40Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(a40Var);
            }
            if (G3) {
                n60Var.o2.I(n60Var.n2, z11);
            }
            if (t50Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(t50Var3);
            }
            r02 = n60Var.Z1;
            r02.clear();
            r02.addAll(n60Var.Y1);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.t) r02.get(r82)).j(z11);
            }
            call = n60Var.a1;
            if (call != null && e40Var2.b && (videoParticipant = e40Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call2222222 = n60Var.a1;
            z13 = (call2222222 != null || call2222222.visibleVideoParticipants.isEmpty()) ? z12 : z11;
            n60Var.C3.a(z13, z10);
            if (z13 == n60Var.I2) {
                n60Var.I2 = z13;
                if (G3) {
                    n60Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.f30 f30Var2222222 = n60Var.p2;
        a40Var = n60Var.m2;
        f30Var2222222.G(a40Var, z11);
        if (a40Var.getVisibility() == 0) {
        }
        if (G3) {
        }
        if (t50Var3.getVisibility() == 0) {
        }
        r02 = n60Var.Z1;
        r02.clear();
        r02.addAll(n60Var.Y1);
        while (r82 < r02.size()) {
        }
        call = n60Var.a1;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call22222222 = n60Var.a1;
        if (call22222222 != null) {
        }
        n60Var.C3.a(z13, z10);
        if (z13 == n60Var.I2) {
        }
    }

    public final void P1() {
        boolean z10;
        l60 l60Var;
        j50 j50Var = this.O;
        if (j50Var == null || this.a1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.a1.currentSpeakingPeers.m(); i11++) {
            long j10 = this.a1.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                e40 e40Var = this.a2;
                e40Var.getClass();
                if (e40Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
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
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0);
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
            j50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 subtitleTextView = j50Var.getSubtitleTextView();
        String str = s1() ? "ViewersWatching" : "Participants";
        int i12 = this.a1.call.participants_count;
        h60 h60Var = this.P;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((h60Var.M.s1() || h60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (s1() && (l60Var = this.B1) != null) {
            l60Var.setWatchersCount(this.a1.call.participants_count);
        }
        if (z10 != this.u2) {
            this.u2 = z10;
            j50Var.invalidate();
            j50Var.getSubtitleTextView().setPivotX(0.0f);
            j50Var.getSubtitleTextView().setPivotY(j50Var.getMeasuredHeight() >> 1);
            j50Var.getSubtitleTextView().animate().scaleX(this.u2 ? 0.98f : 1.0f).scaleY(this.u2 ? 0.9f : 1.0f).alpha(this.u2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(j50Var.getAdditionalSubtitleTextView(), this.u2);
        }
    }

    public final int Q0() {
        t50 t50Var = this.Q;
        int childCount = t50Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = t50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.a1;
        w30 w30Var = this.e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                w30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                w30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        j50 j50Var = this.O;
        if (isEmpty) {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(j50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    j50Var.getTitleTextView().setOnClickListener(new x20(this, 9));
                } else {
                    j50Var.setTitle(this.Z0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.Z0)) {
                    w30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (s1()) {
                    w30Var.b(this.Z0.title, z10);
                } else {
                    w30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                j50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                w30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.a1.call.title.equals(j50Var.getTitle())) {
            if (z10) {
                this.O.J(this.a1.call.title, true, 180L, null);
                j50Var.getTitleTextView().setOnClickListener(new x20(this, 8));
            } else {
                j50Var.setTitle(this.a1.call.title);
            }
            w30Var.b(this.a1.call.title, z10);
        }
        org.telegram.ui.ActionBar.h5 titleTextView = j50Var.getTitleTextView();
        if (!this.a1.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                w30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                w30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new j60(titleTextView));
            TextView textView = w30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new j60(textView), (Drawable) null);
            TextView nextTextView = w30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new j60(nextTextView), (Drawable) null);
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
        org.telegram.ui.Components.wb wbVar;
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
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
        if (scVar == null || (wbVar = scVar.e) == null || wbVar.getParent() == null || wbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        wbVar.setTop(f7 > 0.5f);
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
            j40 j40Var = this.b2;
            if (j40Var.getVisibility() == 0 && j40Var.getAlpha() == 1.0f) {
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
        p40 p40Var = this.F;
        p40Var.setAlpha(f7);
        o40 o40Var = this.G;
        o40Var.setAlpha(f7);
        if (p40Var.getVisibility() != i10) {
            p40Var.setVisibility(i10);
            o40Var.setVisibility(i10);
            if (i10 == 8) {
                m40 m40Var = this.H;
                if (m40Var.isFocused()) {
                    m40Var.clearFocus();
                }
            }
        }
    }

    public final void W0() {
        org.telegram.ui.Components.gl0 gl0Var = this.K;
        if (gl0Var != null) {
            float f7 = this.C1.b.a * this.A3.e;
            gl0Var.setAlpha(f7);
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.gl0 gl0Var2 = this.K;
            if (gl0Var2.N0 || f7 != 1.0f) {
                return;
            }
            gl0Var2.N0 = true;
        }
    }

    public final void X0() {
        boolean z10 = G3;
        r30 r30Var = this.e;
        if (z10) {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.z3;
        if (z11) {
            r30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            r30Var.setTranslationY(0.0f);
        } else {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        boolean z10 = G3;
        a40 a40Var = this.m2;
        if (z10) {
            a40Var.setTranslationX(0.0f);
            a40Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.z3;
        if (z11) {
            a40Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            a40Var.setTranslationY(0.0f);
        } else {
            a40Var.setTranslationX(0.0f);
            a40Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Z0() {
        float f7 = this.B3.e;
        qh.i iVar = this.C1;
        float lerp = AndroidUtilities.lerp(G3 ? (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f) : F3 ? 0.0f : ((this.z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.c)) - AndroidUtilities.dp(91.0f), -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.c0;
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
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
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
        org.telegram.ui.Components.e30 e30Var = this.a3;
        if (e30Var != null) {
            e30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.a3 = null;
        this.Z2 = null;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
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
        t50 t50Var = this.Q;
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
            long j10 = this.t0;
            AccountInstance accountInstance = this.d;
            if (j10 == 0 && (((i13 = this.F1) == 7 || i13 == 5 || i13 == 6) && !call2.isScheduled())) {
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
                AndroidUtilities.runOnUIThread(new z20(this, 2), 3000L);
            }
            if (!this.u0 && VoIPService.getSharedInstance() != null) {
                this.a1.addSelfDummyParticipant(false);
                m1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            J1();
            int childCount = t50Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = t50Var.getChildAt(i16);
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
            e40 e40Var = this.a2;
            if (e40Var.b && this.a1 != null) {
                boolean c10 = e40Var.c();
                ChatObject.Call call3 = this.a1;
                if (call3 != null && e40Var.b && (videoParticipant = e40Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
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
                            if (!groupCallParticipant3.muted_by_you && e40Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            e40Var.setVisibleParticipant(true);
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
                M.j(new d30(this, 1));
                try {
                    M.o();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
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
            AndroidUtilities.updateVisibleRows(t50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt2 = this.E2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.e1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.e1) childAt2).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
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
            int childCount2 = t50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                s4.b1 G = t50Var.G(t50Var.getChildAt(i15));
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
            AndroidUtilities.updateVisibleRows(t50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt3 = this.E2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.e1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.e1) childAt3).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            P0(true);
            AndroidUtilities.updateVisibleRows(t50Var);
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
            AndroidUtilities.updateVisibleRows(t50Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            y40 y40Var = this.z0;
            if (y40Var != null) {
                y40Var.b(true, true);
            }
            J1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            y50 y50Var = this.p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            y50Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        LaunchActivity launchActivity = this.i0;
        launchActivity.a1.remove(this.v2);
        this.i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.e40 e40Var = this.E1;
        if (e40Var != null) {
            e40Var.dismiss();
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

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        e40 e40Var = this.a2;
        if (e40Var != null) {
            if (this.q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                e40Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (e40Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(e40Var);
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
        org.telegram.ui.Components.m30.j(getContext());
        ChatObject.Call call = this.a1;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.view.Window.Callback
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
            e40 e40Var = this.a2;
            if (e40Var.r != null) {
                return;
            }
            boolean z10 = G3;
            t50 t50Var = this.Q;
            int i10 = 0;
            if (!z10) {
                if (this.q2 != null) {
                    t50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                    this.q2 = null;
                }
                if (videoParticipant == null) {
                    if (t50Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = t50Var.getViewTreeObserver();
                        f50 f50Var = new f50(this);
                        this.q2 = f50Var;
                        viewTreeObserver.addOnPreDrawListener(f50Var);
                        return;
                    }
                    t50Var.setVisibility(0);
                    P0(false);
                    this.s0 = true;
                    ViewTreeObserver viewTreeObserver2 = t50Var.getViewTreeObserver();
                    e50 e50Var = new e50(this);
                    this.q2 = e50Var;
                    viewTreeObserver2.addOnPreDrawListener(e50Var);
                    return;
                }
                a40 a40Var = this.m2;
                if (a40Var.getVisibility() == 0) {
                    e40Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(a40Var);
                    return;
                }
                a40Var.setVisibility(0);
                org.telegram.ui.Components.f30 f30Var = this.p2;
                f30Var.G(a40Var, false);
                this.s0 = true;
                if (!e40Var.b) {
                    ArrayList arrayList = f30Var.e;
                    s4.b0 b0Var = (s4.b0) a40Var.getLayoutManager();
                    if (b0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                b0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = t50Var.getViewTreeObserver();
                d50 d50Var = new d50(this, videoParticipant);
                this.q2 = d50Var;
                viewTreeObserver3.addOnPreDrawListener(d50Var);
                return;
            }
            if (this.q2 != null) {
                t50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            s60 s60Var = this.o2;
            ArrayList arrayList3 = this.Y1;
            ArrayList arrayList4 = this.Z1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.l lVar = tVar.c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.e30 e30Var = tVar.d;
                        if (e30Var != null) {
                            e30Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new z40(this, tVar));
                    }
                }
                this.P2 = false;
                s60Var.H(this.n2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i12);
                    if (tVar2.e != null && ((videoParticipant2 = tVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.w);
                        tVar2.b(false);
                        org.telegram.ui.Components.e30 e30Var2 = tVar2.d;
                        if (e30Var2 != null) {
                            e30Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new a50(this, tVar2));
                    }
                }
                this.P2 = true;
                s60Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new o00(7, this, arrayList2));
                }
            }
            boolean z11 = !e40Var.b;
            ViewTreeObserver viewTreeObserver4 = t50Var.getViewTreeObserver();
            c50 c50Var = new c50(this, videoParticipant, z11);
            this.q2 = c50Var;
            viewTreeObserver4.addOnPreDrawListener(c50Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
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
        String q6 = !TextUtils.isEmpty(publicUsername) ? a1.g.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(q6)) {
            v1(null, q6, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new di.u1(this, chatFull, z10, 5));
    }

    public final UndoView l1() {
        if (!G3) {
            e40 e40Var = this.a2;
            if (e40Var.b) {
                return e40Var.getUndoView();
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
        mh.h hVar = this.c0;
        if (hVar != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.a1.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        s50 s50Var = this.V;
        if (s50Var == null || s50Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        N1(true);
        this.w1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        t50 t50Var = this.Q;
        t50Var.setVisibility(0);
        org.telegram.ui.ActionBar.u0 u0Var = this.l1;
        u0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t50Var, (Property<t50, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t50Var, (Property<t50, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var = this.U;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.W;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f), ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.es.g);
        animatorSet.addListener(new g50(this, i10));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void n1(final long j10, final boolean z10) {
        if (this.a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.j30
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        n60 n60Var = n60.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.a2[] a2VarArr2 = a2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new bi.x2(n60Var, a2VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        n60Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new bi.b8(n60Var, j11, a2VarArr2, user, 12));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new gm(this, a2VarArr, sendRequest, 29), 500L);
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
        t50 t50Var = this.Q;
        if (t50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(t50Var);
        }
        a40 a40Var = this.m2;
        if (a40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(a40Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        y40 y40Var = this.z0;
        if (y40Var != null) {
            y40Var.b(false, false);
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
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        y40 y40Var = this.z0;
        if (y40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        y40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.i0;
        launchActivity.a1.add(this.v2);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.m30.j(getContext());
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

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 2) {
            Z0();
            X0();
            Y0();
            float f11 = 1.0f - this.z3.e;
            r30 r30Var = this.e;
            r30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.m2.invalidate();
            this.containerView.invalidate();
            r30Var.invalidate();
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void t1(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.w0) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
        if (m2Var instanceof fo) {
            boolean U9 = ((fo) m2Var).U9();
            this.w0 = true;
            this.x0 = true;
            AndroidUtilities.runOnUIThread(new bi.h4(e3Var, editTextBoldCursor, z10, a2Var, 20), U9 ? 200L : 0L);
            return;
        }
        this.w0 = true;
        this.x0 = true;
        if (e3Var != null) {
            e3Var.setFocusable(true);
        } else if (a2Var != null) {
            a2Var.k(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new oh(2, editTextBoldCursor), 100L);
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
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if (m2Var instanceof fo) {
                z12 = ((fo) m2Var).U9();
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
                h50 h50Var = new h50(this, getContext(), str5, str3, str4, str3);
                this.r0 = h50Var;
                h50Var.s0 = new g(this, 20);
                h50Var.setOnDismissListener(new d30(this, 3));
                AndroidUtilities.runOnUIThread(new z20(this, 7), !z12 ? 200L : 0L);
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
        h50 h50Var2 = new h50(this, getContext(), str5, str3, str4, str3);
        this.r0 = h50Var2;
        h50Var2.s0 = new g(this, 20);
        h50Var2.setOnDismissListener(new d30(this, 3));
        AndroidUtilities.runOnUIThread(new z20(this, 7), !z12 ? 200L : 0L);
    }

    public final void w1() {
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
        a2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.a1.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new fa(this, a2Var, exportgroupcallinvite, 12));
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
    public final void y1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        String str;
        TextView textView;
        String str2;
        String str3;
        EditText editText;
        org.telegram.ui.ActionBar.a2 a2Var;
        float f7;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i12 = org.telegram.ui.ActionBar.g6.pg;
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
            a2Var2.I = i12;
            TextView textView2 = new TextView(getContext());
            int i13 = org.telegram.ui.ActionBar.g6.hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getContext());
            z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(z9Var, w7.a6.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
            k9Var.j(this.currentAccount, user);
            boolean z10 = user instanceof TLRPC.User;
            if (z10) {
                TLRPC.User user2 = (TLRPC.User) user;
                z9Var.e(user2, k9Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                z9Var.e(chat, k9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
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
                org.telegram.messenger.yh.q(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (p1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                org.telegram.messenger.yh.q(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    org.telegram.messenger.yh.q(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    org.telegram.messenger.yh.q(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(textView3, w7.a6.a(-2.0f, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f, -1, (z11 ? 5 : 3) | 48));
            frameLayout.addView(textView2, w7.a6.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
            if (i10 == 2) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupUserRemove), new gw(6, this, user));
            } else if (z10) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupAdd), new di.p9(this, (TLRPC.User) user, j10, 4));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var2.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false));
            a2Var2.show();
            if (i10 != 2 || (textView = (TextView) a2Var2.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.vg, false));
            return;
        }
        if (i10 == 6) {
            this.i0.K0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.i0.p0(new fo(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.i0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if ((m2Var instanceof fo) && ((fo) m2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.i0.p0(new fo(bundle2));
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
            org.telegram.ui.Components.i50 i50Var = this.h2;
            if (i50Var == null || !i50Var.g()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.i50 i50Var2 = new org.telegram.ui.Components.i50(0, true, true);
                this.h2 = i50Var2;
                i50Var2.H = true;
                i50Var2.R = true;
                i50Var2.G = true;
                i50Var2.J = true;
                i50Var2.S = true;
                i50Var2.a = this.i0.O().getLastFragment();
                org.telegram.ui.Components.i50 i50Var3 = this.h2;
                u50 u50Var = new u50(this, j10);
                this.i2 = u50Var;
                i50Var3.b = u50Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                i50Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new z20(this, i14), new di.e1(i11), 0);
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
            if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
                str2 = user3.first_name;
                str3 = user3.last_name;
            } else {
                str2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-j10)).title;
                str3 = null;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.a;
            a2Var3.R = string;
            LinearLayout e = org.telegram.messenger.yh.e(context, 1);
            EditText editText2 = new EditText(context);
            int i16 = org.telegram.ui.ActionBar.g6.hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(LocaleController.isRTL ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j10 > 0 ? 5 : 6);
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
            editText2.setBackground(org.telegram.ui.ActionBar.g6.T(context));
            editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText2.requestFocus();
            if (j10 > 0) {
                editText = new EditText(context);
                editText.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(LocaleController.isRTL ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(LocaleController.getString(R.string.LastName));
                editText.setBackground(org.telegram.ui.ActionBar.g6.T(context));
                editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            } else {
                editText = null;
            }
            AndroidUtilities.showKeyboard(editText2);
            e.addView(editText2, w7.a6.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                e.addView(editText, w7.a6.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str2);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder2.n(e);
            org.telegram.ui.ActionBar.z1 t1Var = new fi.t1(editText2, j10, i15, editText);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Save), t1Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            a2Var3.N = new fi.d0(6, editText2, editText);
            a2Var3.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false));
            a2Var3.show();
            a2Var3.o(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            ce ceVar = new ce(1, a2Var3, t1Var);
            if (editText != null) {
                editText.setOnEditorActionListener(ceVar);
                return;
            } else {
                editText2.setOnEditorActionListener(ceVar);
                return;
            }
        }
        String str5 = groupCallParticipant.about;
        Context context2 = getContext();
        int i17 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.g5.a;
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
        org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder3.a;
        a2Var4.R = string2;
        a2Var4.T = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setClipChildren(false);
        if (j10 < 0) {
            a2Var = a2Var4;
            long j11 = -j10;
            if (MessagesController.getInstance(i17).getChatFull(j11) == null) {
                f7 = 8.0f;
                MessagesController.getInstance(i17).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                NumberTextView numberTextView = new NumberTextView(context2);
                EditText editText3 = new EditText(context2);
                int i18 = org.telegram.ui.ActionBar.g6.hg;
                editText3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
                editText3.setHint(LocaleController.getString(j10 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
                editText3.setTextSize(1, 16.0f);
                editText3.setBackground(org.telegram.ui.ActionBar.g6.T(context2));
                editText3.setMaxLines(4);
                editText3.setRawInputType(147457);
                editText3.setImeOptions(6);
                int i19 = j10 <= 0 ? 70 : 255;
                editText3.setFilters(new InputFilter[]{new org.telegram.ui.Components.q3(i19, context2, numberTextView)});
                numberTextView.setCenterAlign(true);
                numberTextView.setTextSize(15);
                numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
                numberTextView.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView, w7.a6.a(20.0f, 0.0f, 14.0f, 21.0f, 0.0f, 20, !LocaleController.isRTL ? 3 : 5));
                editText3.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
                editText3.addTextChangedListener(new org.telegram.ui.Components.wq(i19, numberTextView));
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                editText3.setText(str5);
                editText3.setSelection(editText3.getText().toString().length());
                alertDialog$Builder3.n(frameLayout2);
                final j2.d dVar = new j2.d(j10, i17, editText3, 4);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Save), dVar);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                final org.telegram.ui.ActionBar.a2 a2Var5 = a2Var;
                a2Var5.N = new org.telegram.ui.Components.q1(editText3, 1);
                frameLayout2.addView(editText3, w7.a6.a(-2.0f, 23.0f, 12.0f, 23.0f, 21.0f, -1, 0));
                editText3.requestFocus();
                AndroidUtilities.showKeyboard(editText3);
                editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.t1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                        if (i20 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                            org.telegram.ui.ActionBar.a2 a2Var6 = a2Var5;
                            if (a2Var6.isShowing()) {
                                dVar.g(a2Var6, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                a2Var5.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false));
                a2Var5.show();
                a2Var5.o(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
            }
        } else {
            a2Var = a2Var4;
        }
        f7 = 8.0f;
        NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText32 = new EditText(context2);
        int i182 = org.telegram.ui.ActionBar.g6.hg;
        editText32.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i182, false));
        editText32.setHint(LocaleController.getString(j10 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        editText32.setTextSize(1, 16.0f);
        editText32.setBackground(org.telegram.ui.ActionBar.g6.T(context2));
        editText32.setMaxLines(4);
        editText32.setRawInputType(147457);
        editText32.setImeOptions(6);
        if (j10 <= 0) {
        }
        editText32.setFilters(new InputFilter[]{new org.telegram.ui.Components.q3(i19, context2, numberTextView2)});
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView2.setImportantForAccessibility(2);
        frameLayout2.addView(numberTextView2, w7.a6.a(20.0f, 0.0f, 14.0f, 21.0f, 0.0f, 20, !LocaleController.isRTL ? 3 : 5));
        editText32.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
        editText32.addTextChangedListener(new org.telegram.ui.Components.wq(i19, numberTextView2));
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView2, false, 0.0f, false);
        editText32.setText(str5);
        editText32.setSelection(editText32.getText().toString().length());
        alertDialog$Builder3.n(frameLayout2);
        final j2.d dVar2 = new j2.d(j10, i17, editText32, 4);
        alertDialog$Builder3.k(LocaleController.getString(R.string.Save), dVar2);
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        final org.telegram.ui.ActionBar.a2 a2Var52 = a2Var;
        a2Var52.N = new org.telegram.ui.Components.q1(editText32, 1);
        frameLayout2.addView(editText32, w7.a6.a(-2.0f, 23.0f, 12.0f, 23.0f, 21.0f, -1, 0));
        editText32.requestFocus();
        AndroidUtilities.showKeyboard(editText32);
        editText32.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.t1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                if (i20 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                    org.telegram.ui.ActionBar.a2 a2Var6 = a2Var52;
                    if (a2Var6.isShowing()) {
                        dVar2.g(a2Var6, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        a2Var52.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false));
        a2Var52.show();
        a2Var52.o(org.telegram.ui.ActionBar.g6.x0(null, i182, false));
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
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.b3;
        g40 g40Var = this.b;
        t50 t50Var = this.Q;
        if (z11) {
            f10 = (t50Var.getX() + (e4Var.getX() + e4Var.getAvatarImageView().getX())) - paddingLeft;
            f7 = (t50Var.getY() + (e4Var.getY() + e4Var.getAvatarImageView().getY())) - paddingTop;
            f11 = e4Var.getAvatarImageView().getMeasuredHeight() / t50Var.getMeasuredWidth();
            i10 = (int) ((e4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
        } else {
            if (this.Z2 == null) {
                this.O2 = true;
            } else {
                this.O2 = z10 || g40Var.D0.k(g40Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.Y2;
            e40 e40Var = this.a2;
            if (lVar == null || !this.O2) {
                org.telegram.ui.Components.e30 e30Var = this.a3;
                if (e30Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.Z2;
                    a40 a40Var = this.m2;
                    if (tVar3 == null) {
                        float x10 = (e40Var.getX() + (a40Var.getX() + (this.a3.getX() + e30Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y3 = (e40Var.getY() + (a40Var.getY() + (this.a3.getY() + this.a3.getAvatarImageView().getY()))) - paddingTop;
                        f11 = this.a3.getAvatarImageView().getMeasuredHeight() / t50Var.getMeasuredWidth();
                        i10 = (int) ((this.a3.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
                        f7 = y3;
                        f10 = x10;
                        if (!this.O2 && (tVar = this.Z2) != null) {
                            tVar.invalidate();
                            e40Var.invalidate();
                            org.telegram.ui.Components.voip.t tVar4 = this.Z2;
                            tVar4.h = false;
                            tVar4.j(false);
                            this.Z2 = null;
                        }
                    } else if (this.O2) {
                        f10 = (e40Var.getX() + (a40Var.getX() + e30Var.getX())) - paddingLeft;
                        f7 = (e40Var.getY() + (a40Var.getY() + this.a3.getY())) - paddingTop;
                        i10 = 0;
                    }
                }
                i10 = 0;
                f7 = 0.0f;
                f10 = 0.0f;
                f11 = 0.96f;
                if (!this.O2) {
                    tVar.invalidate();
                    e40Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar42 = this.Z2;
                    tVar42.h = false;
                    tVar42.j(false);
                    this.Z2 = null;
                }
            } else {
                float x11 = (t50Var.getX() + lVar.getX()) - paddingLeft;
                f7 = ((t50Var.getY() + this.Y2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                i10 = 0;
                f10 = x11;
            }
            f11 = 1.0f;
            if (!this.O2) {
            }
        }
        final float f12 = f7;
        final float f13 = f11;
        f40 f40Var = this.D2;
        if (z10) {
            h40 h40Var = this.C2;
            h40Var.setScaleX(f13);
            h40Var.setScaleY(f13);
            h40Var.setTranslationX(f10);
            h40Var.setTranslationY(f12);
            f40Var.setAlpha(0.0f);
        }
        g40Var.N(i10, i10);
        if (this.g2) {
            j40 j40Var = this.b2;
            if (z10) {
                j40Var.setAlpha(0.0f);
            }
            org.telegram.messenger.yh.r(j40Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.yh.r(f40Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (tVar2 = this.Z2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (g40Var.D0.k(g40Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.Z2.a;
                oVar.E = false;
                oVar.F = 0L;
                this.Y2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i11 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.g30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n60.r(n60.this, f13, f10, f12, i11, valueAnimator);
            }
        });
        this.d3 = this.d.getNotificationCenter().setAnimationInProgress(this.d3, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar5 = this.Y2 != null ? this.Z2 : null;
        if (tVar5 != null) {
            tVar5.f = true;
        }
        ofFloat.addListener(new ah.q0(this, tVar5, z10, 8));
        if (this.b3 || this.Z2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.es.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.es.f);
            ofFloat.setDuration(220L);
            this.Z2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.o oVar2 = this.Z2.a;
            if (oVar2.E) {
                oVar2.G.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        T0();
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
