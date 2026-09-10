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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j60 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, le.d {
    public static j60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final x5 A2;
    public final le.b A3;
    public TLObject B0;
    public final h60 B1;
    public final LongSparseIntArray B2;
    public final le.e B3;
    public final Paint C0;
    public final oh.i C1;
    public final e40 C2;
    public final le.b C3;
    public final ArrayList D0;
    public w20 D1;
    public final c40 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.b40 E1;
    public LinearLayout E2;
    public final m40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final l40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.hj0 G2;
    public final j40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.hj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.pk0 K;
    public final org.telegram.ui.Components.hj0 K0;
    public final i60[] K1;
    public final View K2;
    public final n50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.o6 M;
    public final org.telegram.ui.Components.ba M0;
    public i60 M1;
    public final int[] M2;
    public final u30 N;
    public final org.telegram.ui.Components.ba N0;
    public i60 N1;
    public final y30 N2;
    public final f50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final d60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final p50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final s40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final q40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.l5 U;
    public final y50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final o50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.l5 W;
    public float W0;
    public boolean W1;
    public final y40 W2;
    public final x50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.vz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int a0;
    public ChatObject.Call a1;
    public final b40 a2;
    public org.telegram.ui.Components.a30 a3;
    public final d40 b;
    public final ImageView b0;
    public final boolean b1;
    public final g40 b2;
    public boolean b3;
    public final i30 c;
    public final kh.h c0;
    public final String c1;
    public final t40 c2;
    public boolean c3;
    public final AccountInstance d;
    public final int d0;
    public final e60 d1;
    public float d2;
    public int d3;
    public final o30 e;
    public final RadialProgressView e0;
    public final t30 e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout e2;
    public AnimatorSet e3;
    public final org.telegram.ui.Components.voip.u2 f;
    public final Drawable f0;
    public final v30 f1;
    public boolean f2;
    public j50 f3;
    public final View g0;
    public final Paint g1;
    public boolean g2;
    public int g3;
    public final org.telegram.ui.Components.voip.u2 h;
    public AnimatorSet h0;
    public ValueAnimator h1;
    public org.telegram.ui.Components.e50 h2;
    public int h3;
    public LaunchActivity i0;
    public float i1;
    public q50 i2;
    public int i3;
    public final UndoView[] j0;
    public final LinearLayout j1;
    public Boolean j2;
    public int j3;
    public final org.telegram.ui.Cells.k k0;
    public final org.telegram.ui.ActionBar.w0 k1;
    public int k2;
    public int k3;
    public boolean l0;
    public final org.telegram.ui.ActionBar.w0 l1;
    public boolean l2;
    public int l3;
    public org.telegram.ui.Components.s40 m0;
    public final org.telegram.ui.ActionBar.w0 m1;
    public final x30 m2;
    public int m3;
    public final org.telegram.ui.Components.voip.u2 n;
    public org.telegram.ui.Components.s40 n0;
    public final org.telegram.ui.ActionBar.g1 n1;
    public final org.telegram.ui.Components.vl0 n2;
    public int n3;
    public int o0;
    public final org.telegram.ui.ActionBar.g1 o1;
    public final p60 o2;
    public int o3;
    public u50 p0;
    public final org.telegram.ui.ActionBar.g1 p1;
    public final org.telegram.ui.Components.b30 p2;
    public int p3;
    public final ArrayList q0;
    public final org.telegram.ui.ActionBar.g1 q1;
    public ViewTreeObserver.OnPreDrawListener q2;
    public int q3;
    public final org.telegram.ui.Components.voip.u2 r;
    public e50 r0;
    public final org.telegram.ui.ActionBar.g1 r1;
    public final org.telegram.ui.Components.voip.h r2;
    public int r3;
    public final org.telegram.ui.Components.voip.u2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.g1 s1;
    public boolean s2;
    public int s3;
    public long t0;
    public final org.telegram.ui.ActionBar.g1 t1;
    public final ArrayList t2;
    public int t3;
    public boolean u0;
    public final org.telegram.ui.ActionBar.g1 u1;
    public boolean u2;
    public int u3;
    public final org.telegram.ui.Components.voip.u2 v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.g1 v1;
    public final w20 v2;
    public int v3;
    public final org.telegram.ui.Components.voip.u2 w;
    public boolean w0;
    public final org.telegram.ui.ActionBar.g1 w1;
    public final s30 w2;
    public final k50 w3;
    public final p30 x;
    public boolean x0;
    public final org.telegram.ui.ActionBar.g1 x1;
    public final org.telegram.ui.Components.c30 x2;
    public Boolean x3;
    public final ImageView y;
    public float y0;
    public final org.telegram.ui.ActionBar.g1 y1;
    public final w20 y2;
    public Integer y3;
    public v40 z0;
    public final LinearLayout z1;
    public boolean z2;
    public final le.b z3;

    public j60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, true, true);
        String string;
        int i10;
        final j60 j60Var;
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
        this.C1 = new oh.i(new w20(this, 8));
        int i11 = 0;
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new i60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.r2 = new org.telegram.ui.Components.voip.h();
        this.t2 = new ArrayList();
        this.v2 = new w20(this, i11);
        this.w2 = new s30(this);
        this.x2 = new org.telegram.ui.Components.c30(12);
        this.y2 = new w20(this, 1);
        this.z2 = false;
        this.A2 = new x5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.d3 = -1;
        this.w3 = new k50(this);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
        this.z3 = new le.b(2, this, wrVar, 350L);
        this.A3 = new le.b(3, this, wrVar, 220L, true);
        this.B3 = new le.e(4, this, wrVar, 350L);
        this.C3 = new le.b(5, this, wrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.b1 = z10;
        this.resourcesProvider = new org.telegram.ui.Components.bq0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new n40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new y40(this);
        setOnDismissListener(new a30(this, i11));
        setDimBehindAlpha(75);
        d60 d60Var = new d60(this, launchActivity);
        this.P = d60Var;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(true);
        int i12 = org.telegram.ui.ActionBar.j6.qg;
        xpVar.b(org.telegram.ui.ActionBar.j6.u0(i12));
        xpVar.d();
        f50 f50Var = new f50(this, launchActivity, xpVar);
        this.O = f50Var;
        f50Var.setSubtitle("");
        f50Var.getSubtitleTextView().setVisibility(0);
        f50Var.l();
        f50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(f50Var.getAdditionalSubtitleTextView(), this.u2, 1.0f, false);
        f50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.u0(i12));
        int i13 = org.telegram.ui.ActionBar.j6.lg;
        f50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        f50Var.setBackButtonImage(R.drawable.ic_ab_back);
        f50Var.setOccupyStatusBar(false);
        f50Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.j6.hg;
        f50Var.C(org.telegram.ui.ActionBar.j6.u0(i14), false);
        f50Var.A(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.z8), false);
        f50Var.setTitleColor(org.telegram.ui.ActionBar.j6.u0(i14));
        f50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        f50Var.setActionBarMenuOnItemClick(new m50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new t20(this, 3);
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
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = hj0Var;
        this.K0 = new org.telegram.ui.Components.hj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        n50 n50Var = new n50(this, launchActivity);
        this.L = n50Var;
        this.containerView = n50Var;
        n50Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(launchActivity);
            this.U = l5Var;
            l5Var.setGravity(17);
            l5Var.setTextColor(-1);
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setTextSize(18);
            l5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(l5Var, w7.a6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            o50 o50Var = new o50(this, launchActivity);
            this.V = o50Var;
            o50Var.setGravity(17);
            o50Var.setTextColor(-1);
            o50Var.setTypeface(AndroidUtilities.bold());
            o50Var.setTextSize(60);
            this.containerView.addView(o50Var, w7.a6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(launchActivity);
            this.W = l5Var2;
            l5Var2.setGravity(17);
            l5Var2.setTextColor(-1);
            l5Var2.setTypeface(AndroidUtilities.bold());
            l5Var2.setTextSize(18);
            this.containerView.addView(l5Var2, w7.a6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            y50 y50Var = new y50(this, launchActivity);
            this.U0 = y50Var;
            this.containerView.addView(y50Var, w7.a6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        p50 p50Var = new p50(this, launchActivity);
        this.Q = p50Var;
        p50Var.setClipToPadding(false);
        p50Var.setClipChildren(false);
        x50 x50Var = new x50(this);
        this.X = x50Var;
        x50Var.o = wrVar;
        x50Var.d = 350L;
        x50Var.c = 350L;
        x50Var.e = 350L;
        x50Var.S();
        p50Var.setItemAnimator(x50Var);
        p50Var.setOnScrollListener(new h30(this));
        p50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(F3 ? 6 : 2, p50Var);
        this.Y = vzVar;
        p50Var.setLayoutManager(vzVar);
        i30 i30Var = new i30(this);
        this.c = i30Var;
        vzVar.z1(i30Var);
        p50Var.i(new j30(this));
        vzVar.C1();
        this.containerView.addView(p50Var, w7.a6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        p50Var.setAdapter(d60Var);
        p50Var.setTopBottomSelectorRadius(13);
        p50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.eg));
        p50Var.setOnItemClickListener(new a7(this, launchActivity, call, 14));
        p50Var.setOnItemLongClickListener(new t20(this, 4));
        if (r1()) {
            h60 h60Var = new h60(this, getContext());
            this.B1 = h60Var;
            this.containerView.addView(h60Var, w7.a6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(launchActivity);
        this.n2 = vl0Var;
        this.containerView.addView(vl0Var, w7.a6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        p60 p60Var = new p60(call, this.currentAccount, this);
        this.o2 = p60Var;
        vl0Var.setAdapter(p60Var);
        s4.s sVar = new s4.s(6, false);
        vl0Var.setLayoutManager(sVar);
        sVar.z1(new l30(this));
        final int i16 = 1;
        vl0Var.setOnItemClickListener(new org.telegram.ui.Components.jl0(this) { // from class: org.telegram.ui.v20
            public final /* synthetic */ j60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.jl0
            public final void d(int i17, View view) {
                switch (i16) {
                    case 0:
                        j60 j60Var2 = this.b;
                        j60Var2.getClass();
                        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view;
                        if (a30Var.getVideoParticipant() != null) {
                            j60Var2.e1(a30Var.getVideoParticipant());
                            break;
                        } else {
                            j60Var2.e1(new ChatObject.VideoParticipant(a30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        j60 j60Var3 = this.b;
                        j60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            j60Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.o = wrVar;
        jVar.d = 350L;
        jVar.c = 350L;
        jVar.e = 350L;
        vl0Var.setItemAnimator(new m30(this));
        vl0Var.setOnScrollListener(new n30(this));
        p60Var.H(vl0Var, false, false);
        vl0Var.setVisibility(8);
        o30 o30Var = new o30(this, launchActivity);
        this.e = o30Var;
        int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(9);
        this.M0 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12);
        this.N0 = baVar2;
        baVar.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i17 = org.telegram.ui.ActionBar.j6.Ig;
        baVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i17), 38));
        baVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i17), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        o30Var.a(u2Var);
        u2Var.setOnClickListener(new u20(this, 7));
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
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(launchActivity);
        u2Var3.addView(kj0Var, w7.a6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.hj0 hj0Var2 = new org.telegram.ui.Components.hj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = hj0Var2;
        kj0Var.setAnimation(hj0Var2);
        u2Var3.setOnClickListener(new u20(this, 10));
        o30Var.a(u2Var3);
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
        u2Var4.addView(imageView, w7.a6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        u2Var4.setOnClickListener(new u20(this, 11));
        o30Var.a(u2Var4);
        o30Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i19 = 1;
        u2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z20
            public final /* synthetic */ j60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        j60.o(this.b, launchActivity);
                        break;
                    default:
                        j60 j60Var2 = this.b;
                        j60Var2.a2.e();
                        ChatObject.Call call2 = j60Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            j60Var2.I1();
                            j60.t1(launchActivity, new w20(j60Var2, 5), false, false);
                            break;
                        } else {
                            j60Var2.dismiss();
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
        p30 p30Var = new p30(this, launchActivity);
        this.x = p30Var;
        p30Var.setAnimation(hj0Var);
        p30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(p30Var, w7.a6.e(50, 50, 49));
        o30Var.a(u2Var7);
        u2Var7.setOnClickListener(new r30(this));
        o30Var.a(u2Var6);
        o30Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, w7.a6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.a1 != null && r1() && !this.a1.isScheduled()) {
            imageView2.setVisibility(0);
            p30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Og));
        f50Var.setAlpha(0.0f);
        f50Var.getBackButton().setScaleX(0.9f);
        f50Var.getBackButton().setScaleY(0.9f);
        f50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        f50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        f50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        f50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int i20 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i14));
        this.k1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new t20(this, i20));
        int i21 = org.telegram.ui.ActionBar.j6.ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i21), 6));
        w0Var.setOnClickListener(new u20(this, i20));
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i14), false);
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i14), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i14));
        this.l1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i21), 6));
        w0Var2.setOnClickListener(new u20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i14));
        this.m1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i21), 6));
        w0Var3.setOnClickListener(new u20(this, 2));
        t30 t30Var = new t30(this, launchActivity, launchActivity);
        this.e1 = t30Var;
        u30 u30Var = new u30(launchActivity);
        this.N = u30Var;
        u30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        paint2.setColor(-12761513);
        v30 v30Var = new v30(this, getContext());
        this.f1 = v30Var;
        v30Var.setTextColor(getThemedColor(i14));
        v30Var.setTextSize(1, 11.0f);
        v30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        v30Var.setMaxLines(1);
        v30Var.setGravity(17);
        v30Var.setTypeface(AndroidUtilities.bold());
        v30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        v30Var.setTag(-1);
        if (!r1()) {
            v30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(t30Var, w7.a6.l(1.0f, 0, -2));
        linearLayout.addView(v30Var, w7.a6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(u30Var, w7.a6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.a6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(f50Var, w7.a6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, w7.a6.n(48, 48));
        linearLayout2.addView(w0Var2, w7.a6.n(48, 48));
        linearLayout2.addView(w0Var, w7.a6.n(48, 48));
        this.containerView.addView(linearLayout2, w7.a6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.V5));
        this.containerView.addView(view, w7.a6.c(1.0f, -1));
        for (int i22 = 0; i22 < 2; i22++) {
            this.j0[i22] = new w30(this, launchActivity);
            this.j0[i22].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.j0[i22].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.j0[i22], w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.k1.setShowSubmenuByMove(false);
        int i23 = org.telegram.ui.ActionBar.j6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.u0(i23), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.k1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.m0);
        this.u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.k1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.m0);
        this.v1 = d10;
        d10.j(false, true);
        int i24 = org.telegram.ui.ActionBar.j6.wg;
        d.setCheckColor(i24);
        d.c(org.telegram.ui.ActionBar.j6.u0(i24), org.telegram.ui.ActionBar.j6.u0(i24));
        d10.setCheckColor(i24);
        d10.c(org.telegram.ui.ActionBar.j6.u0(i24), org.telegram.ui.ActionBar.j6.u0(i24));
        Paint paint3 = new Paint(1);
        int i25 = org.telegram.ui.ActionBar.j6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.j6.u0(i25));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.k1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.m0);
        this.p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.k1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.m0);
        this.q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.k1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.m0);
        this.o1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.k1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.m0);
        this.r1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.n1 = e;
        e60 e60Var = new e60();
        this.d1 = e60Var;
        org.telegram.ui.ActionBar.g1 e7 = this.k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.t1 = e7;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.k1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, e60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.m0);
        this.s1 = d15;
        e60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e10 = this.k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e11 = this.k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.y1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.k1;
        int i26 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i25;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i25;
        }
        org.telegram.ui.ActionBar.g1 e12 = w0Var11.e(4, i26, string);
        this.w1 = e12;
        this.k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.u0(i23));
        this.k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        int i27 = org.telegram.ui.ActionBar.j6.vg;
        e12.c(org.telegram.ui.ActionBar.j6.u0(i27), org.telegram.ui.ActionBar.j6.u0(i27));
        e.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        e7.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        if (this.a1 != null) {
            l1();
        }
        if (o1()) {
            this.p0 = new u50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.O.getTitleTextView().setOnClickListener(new u20(this, 3));
        x30 x30Var = new x30(this, launchActivity);
        this.m2 = x30Var;
        y30 y30Var = new y30(this);
        this.N2 = y30Var;
        final int i28 = 0;
        x30Var.setClipToPadding(false);
        y30Var.S();
        y30Var.o = org.telegram.ui.Components.wr.f;
        y30Var.d = 350L;
        y30Var.c = 350L;
        y30Var.e = 350L;
        x30Var.setItemAnimator(y30Var);
        x30Var.setOnScrollListener(new z30(this));
        x30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        x30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(call, this.currentAccount, this);
        this.p2 = b30Var;
        x30Var.setAdapter(b30Var);
        b30Var.F(x30Var, false);
        x30Var.setOnItemClickListener(new org.telegram.ui.Components.jl0(this) { // from class: org.telegram.ui.v20
            public final /* synthetic */ j60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.jl0
            public final void d(int i172, View view2) {
                switch (i28) {
                    case 0:
                        j60 j60Var2 = this.b;
                        j60Var2.getClass();
                        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view2;
                        if (a30Var.getVideoParticipant() != null) {
                            j60Var2.e1(a30Var.getVideoParticipant());
                            break;
                        } else {
                            j60Var2.e1(new ChatObject.VideoParticipant(a30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        j60 j60Var3 = this.b;
                        j60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            j60Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        x30Var.setOnItemLongClickListener(new t20(this, 1));
        x30Var.setVisibility(8);
        x30Var.i(new a40());
        int i29 = 4;
        b40 b40Var = new b40(this, launchActivity, this.Q, x30Var, this.Y1, this.a1, this);
        this.a2 = b40Var;
        b40Var.setClipChildren(false);
        b30Var.E(this.Y1, b40Var);
        if (this.n2 != null) {
            this.o2.G(this.Y1, b40Var);
        }
        c40 c40Var = new c40(this, launchActivity);
        this.D2 = c40Var;
        d40 d40Var = new d40(this, launchActivity, this.O, this.Q, c40Var);
        this.b = d40Var;
        d40Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        d40Var.setInvalidateWithParent(true);
        c40Var.setProfileGalleryView(d40Var);
        e40 e40Var = new e40(this, launchActivity);
        this.C2 = e40Var;
        e40Var.setVisibility(8);
        d40Var.setVisibility(0);
        d40Var.b(new f40(this));
        g40 g40Var = new g40(this, launchActivity);
        this.b2 = g40Var;
        this.containerView.addView(b40Var);
        b40Var.addView(x30Var, w7.a6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
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
        kh.h hVar = new kh.h(launchActivity);
        this.c0 = hVar;
        hVar.setDelegate(new h40(this));
        hVar.setClickCellDelegate(new i40(this));
        if (this.a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.M = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.wr.h);
        o6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        j40 j40Var = new j40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = j40Var;
        j40Var.J = true;
        j40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.d0)});
        j40Var.getEditText().setLinkTextColor(-11683585);
        j40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        j40Var.getEditText().addTextChangedListener(new k40(this));
        j40Var.s();
        l40 l40Var = new l40(this, launchActivity);
        this.G = l40Var;
        this.containerView.addView(l40Var, w7.a6.c(-1.0f, -1));
        m40 m40Var = new m40(launchActivity);
        this.F = m40Var;
        m40Var.addView(j40Var, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        m40Var.addView(o6Var, w7.a6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(m40Var, w7.a6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i30 = org.telegram.ui.ActionBar.j6.i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i30), 1, -1));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new u20(this, i29));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i30), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new u20(this, 5));
        m40Var.addView(imageView3, w7.a6.e(48, 48, 85));
        m40Var.addView(imageView4, w7.a6.e(48, 48, 85));
        this.containerView.addView(g40Var);
        e40Var.addView(d40Var, w7.a6.c(-1.0f, -1));
        e40Var.addView(c40Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(e40Var, w7.a6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
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
            this.containerView.addView(textView, w7.a6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(launchActivity);
            dd0Var.setTextColor(-1);
            dd0Var.setSelectorColor(-9598483);
            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            dd0Var.setItemCount(5);
            o40 o40Var = new o40(launchActivity);
            o40Var.setItemCount(5);
            o40Var.setTextColor(-1);
            o40Var.setSelectorColor(-9598483);
            o40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            p40 p40Var = new p40(launchActivity);
            p40Var.setItemCount(5);
            p40Var.setTextColor(-1);
            p40Var.setSelectorColor(-9598483);
            p40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            q40 q40Var = new q40(launchActivity);
            this.T = q40Var;
            q40Var.setLines(1);
            q40Var.setSingleLine(true);
            q40Var.setEllipsize(TextUtils.TruncateAt.END);
            q40Var.setGravity(17);
            q40Var.setTextColor(-1);
            q40Var.setTypeface(AndroidUtilities.bold());
            q40Var.setTextSize(1, 14.0f);
            this.containerView.addView(q40Var, w7.a6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            q40Var.setOnClickListener(new org.telegram.messenger.video.f(this, dd0Var, o40Var, p40Var, chat, accountInstance, inputPeer2, 1));
            s40 s40Var = new s40(launchActivity, dd0Var, o40Var, p40Var);
            this.R = s40Var;
            s40Var.setWeightSum(1.0f);
            s40Var.setOrientation(0);
            this.containerView.addView(s40Var, w7.a6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i31 = calendar.get(1);
            int i32 = calendar.get(6);
            s40Var.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
            dd0Var.setMinValue(0);
            dd0Var.setMaxValue(365);
            dd0Var.setWrapSelectorWheel(false);
            dd0Var.setFormatter(new y20(currentTimeMillis, calendar, i31, 0));
            a1.d dVar = new a1.d(this, dd0Var, o40Var, p40Var, 11);
            j60Var = this;
            dd0Var.setOnValueChangedListener(dVar);
            o40Var.setMinValue(0);
            o40Var.setMaxValue(23);
            s40Var.addView(o40Var, w7.a6.l(0.2f, 0, 270));
            o40Var.setFormatter(new org.telegram.ui.Components.gp0(19));
            o40Var.setOnValueChangedListener(dVar);
            p40Var.setMinValue(0);
            p40Var.setMaxValue(59);
            p40Var.setValue(0);
            p40Var.setFormatter(new org.telegram.ui.Components.gp0(20));
            s40Var.addView(p40Var, w7.a6.l(0.3f, 0, 270));
            p40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i33 = calendar.get(6);
            int i34 = calendar.get(12);
            int i35 = calendar.get(11);
            dd0Var.setValue(i32 != i33 ? 1 : 0);
            p40Var.setValue(i34);
            o40Var.setValue(i35);
            org.telegram.ui.Components.d5.g(q40Var, textView, 0L, 604800L, 2, dd0Var, o40Var, p40Var);
        } else {
            j60Var = this;
        }
        t40 t40Var = new t40(j60Var, (ViewGroup) j60Var.getWindow().getDecorView(), j60Var.containerView);
        j60Var.c2 = t40Var;
        t40Var.E = new u40(j60Var);
        d40Var.setPinchToZoomHelper(t40Var);
        final int i36 = 0;
        j60Var.n.setOnClickListener(new View.OnClickListener(j60Var) { // from class: org.telegram.ui.z20
            public final /* synthetic */ j60 b;

            {
                this.b = j60Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i36) {
                    case 0:
                        j60.o(this.b, launchActivity);
                        break;
                    default:
                        j60 j60Var2 = this.b;
                        j60Var2.a2.e();
                        ChatObject.Call call2 = j60Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            j60Var2.I1();
                            j60.t1(launchActivity, new w20(j60Var2, 5), false, false);
                            break;
                        } else {
                            j60Var2.dismiss();
                            break;
                        }
                }
            }
        });
        j60Var.L1(false);
        j60Var.I1();
        j60Var.M1(false);
        j60Var.N1(false, false);
        j60Var.B1(0.0f);
        j60Var.O1();
        j60Var.containerView.addView(new FrameLayout(launchActivity), w7.a6.e(-1, 200, 87));
        j60Var.v.setOnClickListener(new u20(j60Var, 6));
        j60Var.T0();
        w7.c6.a(j60Var.n);
        w7.c6.a(j60Var.r);
        w7.c6.a(j60Var.f);
        w7.c6.a(j60Var.h);
        w7.c6.a(j60Var.w);
        w7.c6.a(j60Var.s);
        w7.c6.a(j60Var.v);
        r0.i0.m(j60Var.containerView, new t20(j60Var, 2));
    }

    public static void A(j60 j60Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        d2Var.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.wc(j60Var.topBulletinContainer, new org.telegram.ui.Components.bq0()).d0(tL_error, false);
                return;
            }
            return;
        }
        Context context = j60Var.getContext();
        int i10 = j60Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.f6 f6Var = j60Var.resourcesProvider;
        ChatObject.Call call = j60Var.a1;
        k9.o0(context, i10, inputGroupCall, str, f6Var, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public static String A0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void B0(j60 j60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (j60Var.n0 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(j60Var.getContext(), 8);
            j60Var.n0 = s40Var;
            s40Var.setAlpha(0.0f);
            j60Var.n0.setVisibility(4);
            j60Var.n0.setShowingDuration(4000L);
            j60Var.containerView.addView(j60Var.n0, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            j60Var.n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            j60Var.n0.d();
        }
        j60Var.n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        j60Var.n0.f(j60Var.w, true);
    }

    public static /* synthetic */ void C(j60 j60Var, int[] iArr, float[] fArr) {
        s4.c1 K;
        x30 x30Var = j60Var.m2;
        b40 b40Var = j60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = j60Var.a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (b40Var.b) {
                    for (int i11 = 0; i11 < x30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) x30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(a30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            a30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (j60Var.s0 ? j60Var.D0 : j60Var.a1.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = j60Var.Q.K(indexOf + j60Var.P.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == j60Var.X2 && !j60Var.l2) {
                                j60Var.containerView.invalidate();
                            }
                        }
                    }
                }
                b40Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void D(j60 j60Var) {
        Editable text = j60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(j60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        j60Var.A1(tL_textWithEntities);
    }

    public static void F0(j60 j60Var) {
        ChatObject.Call call = j60Var.a1;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = j60Var.a1.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(j60Var.a1.call.join_muted);
        ConnectionsManager connectionsManager = j60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.e1(dispatchQueue), new f30(j60Var, 1));
    }

    public static void G0(j60 j60Var, boolean z10) {
        if (j60Var.a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = j60Var.a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        j60Var.x3 = Boolean.valueOf(z10);
        j60Var.H1(true);
        ConnectionsManager connectionsManager = j60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.e1(dispatchQueue), new f30(j60Var, 0));
    }

    public static void H0(j60 j60Var) {
        int i10;
        if (!j60Var.r1()) {
            j60Var.isFullscreen = false;
            return;
        }
        b40 b40Var = j60Var.a2;
        boolean z10 = (!b40Var.V && b40Var.b && (F3 == j60Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = j60Var.j2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = j60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                j60Var.getWindow().clearFlags(1024);
                j60Var.setHideSystemVerticalInsets(false);
            } else {
                j60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                j60Var.getWindow().addFlags(1024);
            }
            j60Var.containerView.setSystemUiVisibility(i10);
            j60Var.j2 = Boolean.valueOf(z10);
            j60Var.S2 = !z10;
            j60Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l I0(j60 j60Var) {
        p50 p50Var = j60Var.Q;
        for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
            View childAt = p50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(j60 j60Var) {
        f50 f50Var = j60Var.O;
        p50 p50Var = j60Var.Q;
        int childCount = p50Var.getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(p50Var.getChildAt(i10)) >= 0) {
                f7 = Math.min(f7, r8.getTop());
            }
        }
        if (f7 < 0.0f || f7 == 2.14748365E9f) {
            f7 = childCount != 0 ? 0.0f : p50Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f7 <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f7 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && f50Var.getTag() == null) || (!z10 && f50Var.getTag() != null)) {
            f50Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = j60Var.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                j60Var.h0 = null;
            }
            j60Var.setUseLightStatusBar(f50Var.getTag() == null);
            ViewPropertyAnimator duration = f50Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
            duration.setInterpolator(wrVar).start();
            f50Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(wrVar).start();
            ObjectAnimator objectAnimator = j60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                j60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.l5 subtitleTextView = f50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.l5, Float>) property, f50Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            j60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            j60Var.U2.setInterpolator(wrVar);
            j60Var.U2.addListener(new org.telegram.ui.Components.yo(25, j60Var, z10));
            j60Var.U2.start();
            ObjectAnimator objectAnimator2 = j60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f50Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.l5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            j60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            j60Var.V2.setInterpolator(wrVar);
            j60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            j60Var.h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = j60Var.h0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(f50Var, (Property<f50, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(j60Var.N, (Property<u30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(j60Var.g0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            j60Var.h0.addListener(new d50(j60Var, i11));
            j60Var.h0.start();
            j60Var.a2.v.setClickable(!z10 || F3);
        }
        if (j60Var.y0 != dp) {
            j60Var.E1(dp);
        }
    }

    public static void N(j60 j60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (j60Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(j60Var.Y1, j60Var.a2, lVar, null, null, lVar.getParticipant(), j60Var.a1, j60Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void S(j60 j60Var, int i10, int[] iArr) {
        if (j60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.zg, false), j60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), j60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.yg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.zg, false), j60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Cg, false), j60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ng, false), j60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false), j60Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                D3 = new j60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                D3 = new j60(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            D3.i0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(11));
        }
    }

    public static String f1(int i10) {
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

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i10 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str) : i10 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioSwitchedToPhone) : LocaleController.getString(R.string.VoipAudioSwitchedToHeadset) : LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public static /* synthetic */ void m(j60 j60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(declineconferencecallinvite, new e30(j60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(j60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = j60Var.a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            j60Var.a1.invitedUsersMap.remove(l4);
            j60Var.a1.invitedUsersMessageIds.remove(l4);
            j60Var.O0(true);
        }
    }

    public static void n(final j60 j60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = j60Var.d;
        ArrayList arrayList = j60Var.F0;
        d60 d60Var = j60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            j60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.d4) {
            j60Var.F1((org.telegram.ui.Cells.d4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l4 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.v3)) {
            if (i10 != d60Var.w) {
                if (i10 != d60Var.x) {
                    if (i10 == d60Var.y) {
                        j60Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = j60Var.a1;
                if (call2 == null || call2.call == null) {
                    return;
                }
                sg.p1 p1Var = new sg.p1(activity, j60Var.currentAccount, null, 4, new org.telegram.ui.Components.bq0());
                ChatObject.Call call3 = j60Var.a1;
                p1Var.C0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new l8(4)).collect(Collectors.toSet()) : null);
                p1Var.h0(false, true);
                p1Var.A0 = new w20(j60Var, 3);
                p1Var.h0(false, true);
                p1Var.D0 = new bi.k6(12, j60Var, call);
                p1Var.show();
                return;
            }
            if (ChatObject.isChannel(j60Var.Z0) && (chat = j60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                j60Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j60Var.i1());
            if (chatFull == null) {
                return;
            }
            j60Var.w0 = false;
            Context context = j60Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = j60Var.Z0;
            ChatObject.Call call4 = j60Var.a1;
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            j60Var.E1 = b40Var;
            b40Var.setOnDismissListener(new a30(j60Var, 2));
            org.telegram.ui.Components.b40 b40Var2 = j60Var.E1;
            b40Var2.g0 = new k30(j60Var);
            b40Var2.show();
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var.getUser() == null) {
            return;
        }
        if (!j60Var.o1()) {
            j60Var.i0.K0(j60Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v3Var.getUser().id);
            if (v3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            j60Var.i0.p0(new ProfileActivity(bundle, null));
            j60Var.dismiss();
            return;
        }
        int i11 = i10 - d60Var.n;
        if (i11 < 0 || i11 >= j60Var.a1.shadyJoinParticipants.size()) {
            int i12 = i10 - d60Var.s;
            if (i12 < 0 || i12 >= j60Var.a1.shadyLeftParticipants.size()) {
                int i13 = i10 - d60Var.f;
                if (j60Var.s0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l4 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < j60Var.a1.invitedUsers.size()) {
                    l4 = j60Var.a1.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l4 = j60Var.a1.shadyLeftParticipants.get(i10 - d60Var.s);
            }
        } else {
            l4 = j60Var.a1.shadyJoinParticipants.get(i10 - d60Var.n);
        }
        if (z10 || (invitedUser = j60Var.a1.invitedUsersMessageIds.get(l4)) == null) {
            return;
        }
        org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(j60Var.container, j60Var.resourcesProvider, v3Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(j60Var) { // from class: org.telegram.ui.c30
            public final /* synthetic */ j60 b;

            {
                this.b = j60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        j60.r(this.b, invitedUser, l4);
                        break;
                    default:
                        j60.m(this.b, invitedUser, l4);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(j60Var) { // from class: org.telegram.ui.c30
            public final /* synthetic */ j60 b;

            {
                this.b = j60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        j60.r(this.b, invitedUser, l4);
                        break;
                    default:
                        j60.m(this.b, invitedUser, l4);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j60Var.C0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void o(j60 j60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = j60Var.i0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            j60Var.i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            j60Var.N1(true, false);
            j60Var.M1(false);
            j60Var.a1.sortParticipants();
            j60Var.O0(true);
            j60Var.e.requestLayout();
            return;
        }
        j60Var.j0[0].e(1, false);
        if (j60Var.z0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            v40 v40Var = new v40(j60Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            j60Var.z0 = v40Var;
            v40Var.setBottomPadding(j60Var.containerView.getPaddingBottom());
            j60Var.container.addView(j60Var.z0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static /* synthetic */ void p(j60 j60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j60Var.d2 = floatValue;
        j60Var.a2.n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        e40 e40Var = j60Var.C2;
        e40Var.setScaleX(f12);
        e40Var.setScaleY(f12);
        e40Var.setTranslationX((1.0f - j60Var.d2) * f10);
        e40Var.setTranslationY((1.0f - j60Var.d2) * f11);
        if (!j60Var.g2) {
            j60Var.W2.setAlpha((int) (j60Var.d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = j60Var.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners((1.0f - j60Var.d2) * AndroidUtilities.dp(8.0f));
        }
        e40Var.invalidate();
        j60Var.containerView.invalidate();
        d40 d40Var = j60Var.b;
        int i11 = (int) ((1.0f - j60Var.d2) * i10);
        d40Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void q(j60 j60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = j60Var.a1;
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
            j60Var.a1.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = j60Var.a1.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(j60Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new di.e1(j60Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        j60Var.O0(true);
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
        j60Var.N1(true, true);
    }

    public static /* synthetic */ void r(j60 j60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(declineconferencecallinvite, new e30(j60Var, 1));
        ChatObject.Call call = j60Var.a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            j60Var.O0(true);
        }
    }

    public static /* synthetic */ void s(j60 j60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(j60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(j60 j60Var) {
        j60Var.Y0();
        j60Var.V0();
        j60Var.U0();
        j60Var.F.setTranslationY((-j60Var.C1.c()) + j60Var.containerView.getPaddingBottom());
        j60Var.G.invalidate();
        j60Var.Z0();
        j60Var.containerView.invalidate();
    }

    public static void t1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        ChatObject.Call call = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        if (z11 || !ChatObject.canManageCalls(chat)) {
            w1(call, false, selfId, runnable);
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
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            if (z10) {
                z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            } else {
                z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.j6.rg;
                int i11 = org.telegram.ui.ActionBar.j6.pg;
                int i12 = org.telegram.ui.ActionBar.j6.ng;
                checkBoxSquare.s = i10;
                checkBoxSquare.v = i11;
                checkBoxSquare.w = i12;
                checkBoxSquare.invalidate();
            }
            z1VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
            } else {
                z1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
            }
            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            f7.addView(z1VarArr[0], w7.a6.n(-1, -2));
            z1VarArr[0].setOnClickListener(new x20(z1VarArr, 0));
        }
        alertDialog$Builder.n(f7);
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.j6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new bi.a8(call, z1VarArr, selfId, runnable, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.P0 = false;
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                d2Var.getWindow().setType(2038);
            } else {
                d2Var.getWindow().setType(2003);
            }
            d2Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
        }
        d2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vg, false));
        }
        d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false));
    }

    public static /* synthetic */ void u(j60 j60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(j60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void v(j60 j60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(j60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(j60Var, updates, j3, 19));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(j60Var, hashSet, call, str, 4));
    }

    public static /* synthetic */ void w(j60 j60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(j60Var.currentAccount).getUser(l4));
            getrequirementstocontact.id.add(MessagesController.getInstance(j60Var.currentAccount).getInputUser(longValue));
        }
        bi.ya yaVar = new bi.ya(j60Var, arrayList, arrayList2, arrayList3, str, 25);
        if (UserConfig.getInstance(j60Var.currentAccount).isPremium()) {
            yaVar.run();
        } else {
            ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(getrequirementstocontact, new aa(arrayList, arrayList2, yaVar, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z10, long j3, Runnable runnable) {
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

    public static /* synthetic */ void x(j60 j60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        qg.k0 k0Var = new qg.k0(34, j60Var.currentAccount, U.getContext(), U, new org.telegram.ui.Components.bq0());
        k0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        k0Var.show();
    }

    public static /* synthetic */ void y(j60 j60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            d2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        d2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            j60Var.x1(null, j3, 3);
        } else {
            org.telegram.ui.Components.d5.f0(j60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.p2) j60Var.i0.O().getFragmentStack().get(j60Var.i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public static r0.l1 z(j60 j60Var, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.a;
        i0.c f7 = i1Var.f(647);
        i0.c f10 = i1Var.f(8);
        j40 j40Var = j60Var.H;
        int max = Math.max(f10.d, (j40Var.N || j40Var.e) ? j40Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = j60Var.b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (j40Var.getEmojiView() != null) {
            j40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (j60Var.S2) {
            ViewGroup viewGroup = j60Var.containerView;
            int i10 = j60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = j60Var.containerView;
            int i11 = j60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.a + i11, f7.b, i11 + f7.c, f7.d);
        }
        j60Var.containerView.requestLayout();
        if (max == 0 && !j40Var.N && !j40Var.e && !j40Var.O) {
            j40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.pk0 pk0Var = j60Var.K;
            if (pk0Var == null) {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                pk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.pk0 pk0Var2 = new org.telegram.ui.Components.pk0(1, j60Var.currentAccount, j60Var.getContext(), R, j60Var.resourcesProvider);
                    j60Var.K = pk0Var2;
                    pk0Var2.setDelegate(new l50(j60Var));
                    j60Var.containerView.addView(j60Var.K, w7.a6.e(-2, 52, 81));
                    j60Var.K.p(null, null, false);
                    j60Var.G.bringToFront();
                    j60Var.F.bringToFront();
                    pk0Var = j60Var.K;
                }
            }
            j60Var.K = pk0Var;
        }
        j40Var.H(f10.d, false);
        j60Var.C1.i(l1Var);
        return r0.l1.b;
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
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

    public final void B1(float f7) {
        this.U1 = f7;
        b40 b40Var = this.a2;
        float max = Math.max(f7, b40Var == null ? 0.0f : b40Var.c);
        int i10 = org.telegram.ui.ActionBar.j6.jg;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.k1.B(-14472653);
        this.f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false), f7, 1.0f);
        u50 u50Var = this.p0;
        if (u50Var != null) {
            u50Var.j = offsetColor2;
            t50 t50Var = u50Var.g;
            if (t50Var != null) {
                t50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        p50 p50Var = this.Q;
        p50Var.setGlowColor(offsetColor2);
        int i12 = this.F1;
        if (i12 == 3 || p1(i12)) {
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Eg, false), f7, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false), f7, 1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int childCount = p50Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = p50Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(v02, v02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                f50 f50Var = this.O;
                if (z10) {
                    ((org.telegram.ui.Cells.d4) childAt).f(f50Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    ((org.telegram.ui.Cells.v3) childAt).a(f50Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        p50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        p50 p50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s4.c1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f7 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.a1;
        if (call == null || (p50Var = this.Q) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) == null) {
            return;
        }
        b40 b40Var = this.a2;
        if (b40Var.b) {
            int i10 = 0;
            while (true) {
                x30 x30Var = this.m2;
                if (i10 >= x30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) x30Var.getChildAt(i10);
                if (MessageObject.getPeerId(a30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    a30Var.setAmplitude(f7 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.s0 ? this.D0 : this.a1.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = p50Var.K(indexOf + this.P.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                    if (view == this.X2 && !this.l2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        b40Var.k(groupCallParticipant, f7 * 15.0f);
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
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

    public final void E1(float f7) {
        int i10;
        this.y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f7 - AndroidUtilities.dp(74.0f);
        float f10 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2;
        y50 y50Var = this.U0;
        b40 b40Var = this.a2;
        v30 v30Var = this.f1;
        t30 t30Var = this.e1;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (y50Var != null) {
                y50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            t30Var.setScaleX(Math.max(0.9f, f11));
            t30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            t30Var.setAlpha((1.0f - b40Var.c) * Math.max(0.0f, f12));
            v30Var.setScaleX(Math.max(0.9f, f11));
            v30Var.setScaleY(Math.max(0.9f, f11));
            v30Var.setAlpha((1.0f - b40Var.c) * Math.max(0.0f, f12));
        } else {
            t30Var.setScaleX(1.0f);
            t30Var.setScaleY(1.0f);
            t30Var.setAlpha(1.0f - b40Var.c);
            v30Var.setScaleX(1.0f);
            v30Var.setScaleY(1.0f);
            v30Var.setAlpha(1.0f - b40Var.c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (y50Var != null) {
            y50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        s40 s40Var = this.R;
        if (s40Var != null) {
            s40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x02d0, code lost:
    
        if ((r14 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02ea, code lost:
    
        if (r25 == (-i1())) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028d, code lost:
    
        if (r7.admin_rights.manage_call != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r4v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F1(View view) {
        org.telegram.ui.Cells.d4 d4Var;
        g60 g60Var;
        long j3;
        bi.w6 w6Var;
        org.telegram.ui.ActionBar.x1 x1Var;
        AccountInstance accountInstance;
        boolean z10;
        long j10;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j11;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z11;
        q50 q50Var;
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
                d1(true);
                return false;
            }
            j50 j50Var = this.f3;
            if (j50Var != null) {
                j50Var.dismiss();
                this.f3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.a1.videoNotAvailableParticipant) {
                    d4Var = new org.telegram.ui.Cells.d4(lVar.getContext());
                    d4Var.e(this.d, lVar.getParticipant().participant, this.a1, MessageObject.getPeerId(this.A0), null, false);
                    org.telegram.ui.Components.n5 n5Var = d4Var.s;
                    if (n5Var != null) {
                        n5Var.f();
                    }
                    this.b3 = false;
                    this.Y2 = lVar;
                    this.Z2 = lVar.getRenderer();
                    if (!G3 && !F3) {
                        this.containerView.addView(d4Var, w7.a6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (d4Var != null) {
                        boolean z13 = (F3 || G3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = d4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new pi(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.E2 = linearLayout;
                            bi.w6 w6Var2 = new bi.w6(getContext(), linearLayout, linearLayout2, 7);
                            w6Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            w6Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false), this.U1, 1.0f);
                            if (linearLayout2 == null || d4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                g60Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                w6Var2.addView(linearLayout2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                g60Var = new g60(this, getContext(), participant);
                                linearLayout2.addView(g60Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            w6Var2.addView(linearLayout, w7.a6.k(0.0f, g60Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(getContext(), R.style.scrollbarShapeStyle, w6Var2);
                            x1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(x1Var2, w7.a6.c(-2.0f, -2));
                            g60 g60Var2 = g60Var;
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
                                    w6Var = w6Var2;
                                    x1Var = x1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z10 = true;
                                    }
                                    z10 = false;
                                } else {
                                    j3 = peerId;
                                    w6Var = w6Var2;
                                    x1Var = x1Var2;
                                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
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
                                w6Var = w6Var2;
                                x1Var = x1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (d4Var.c()) {
                                if (o1() && d4Var.K) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    org.telegram.ui.Cells.r6.n(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(d4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                org.telegram.ui.Cells.r6.n(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j3 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                org.telegram.ui.Cells.r6.n(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j3 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                org.telegram.ui.Cells.r6.n(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j10 = 0;
                            } else if (Q0()) {
                                if (!o1() && z10 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        org.telegram.ui.Cells.r6.o(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j10 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j10 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.r6.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
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
                                        org.telegram.ui.Cells.r6.o(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (o1() ? !(z10 || !ChatObject.canBlockUsers(this.Z0)) : !((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            org.telegram.ui.Cells.r6.n(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (o1()) {
                                }
                            } else {
                                j10 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    org.telegram.ui.Cells.r6.o(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    org.telegram.ui.Cells.r6.n(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j13 = peer2.channel_id;
                                    if (j13 != 0 && !ChatObject.isMegagroup(this.currentAccount, j13)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.r6.o(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.j6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i16 = org.telegram.ui.ActionBar.j6.vg;
                                    g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                                }
                                g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.w0(r42, org.telegram.ui.ActionBar.j6.eg, z12));
                                g1Var.g((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(g1Var);
                                g1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                g1Var.setOnClickListener(new cb(this, i14, arrayList4, groupCallParticipant, 2));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            x1Var.addView(w6Var, w7.a6.x(-2, -2, 51));
                            p50 p50Var = this.Q;
                            p50Var.B0();
                            this.Y.X = false;
                            this.X2 = d4Var;
                            d4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            p50Var.invalidate();
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
                            org.telegram.ui.Components.voip.t tVar = this.Z2;
                            boolean z16 = tVar != null && tVar.v;
                            if (forUserOrChat != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.w9 avatarImageView = this.X2.getAvatarImageView();
                                    d40 d40Var = this.b;
                                    d40Var.setParentAvatarImage(avatarImageView);
                                    d40Var.setHasActiveVideo(z16);
                                    d40Var.M(j11, true);
                                    d40Var.setCreateThumbFromParent(true);
                                    d40Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.t tVar2 = this.Z2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.A0) == j11 && this.h2 != null && (q50Var = this.i2) != null && (fileLocation = q50Var.c) != null) {
                                        d40Var.A(q50Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.e2, w7.a6.c(-2.0f, -2));
                                this.g2 = true;
                                g40 g40Var = this.b2;
                                if (g40Var == null) {
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
                                    g40Var.setBackground(new BitmapDrawable(createBitmap));
                                    g40Var.setAlpha(0.0f);
                                    g40Var.setVisibility(0);
                                    g40Var.bringToFront();
                                }
                                this.c3 = true;
                                this.C2.setVisibility(i11);
                                if (g60Var2 != null) {
                                    g60Var2.invalidate();
                                }
                                y1(true, d4Var);
                                org.telegram.ui.Components.a30 a30Var = this.a3;
                                if (a30Var != null) {
                                    a30Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.f2 = false;
                            j50 j50Var2 = new j50(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.f3 = j50Var2;
                            j50Var2.e = true;
                            j50Var2.c = 220;
                            j50Var2.setOutsideTouchable(true);
                            this.f3.setClippingEnabled(true);
                            this.f3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.f3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.f3.setInputMethodMode(2);
                            this.f3.setSoftInputMode(0);
                            this.f3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.a30 a30Var2 = this.a3;
                            if (a30Var2 != null) {
                                boolean z17 = F3;
                                b40 b40Var = this.a2;
                                x30 x30Var = this.m2;
                                if (z17) {
                                    x10 = AndroidUtilities.dp(32.0f) + (((int) (b40Var.getX() + (x30Var.getX() + a30Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (b40Var.getY() + (x30Var.getY() + this.a3.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x10 = ((int) (b40Var.getX() + (x30Var.getX() + a30Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y3 = (b40Var.getY() + (x30Var.getY() + this.a3.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y3;
                                }
                            } else {
                                x10 = (int) (((p50Var.getX() + p50Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.b3) {
                                    y10 = d4Var.getY() + p50Var.getY();
                                    measuredHeight = d4Var.getClipHeight();
                                } else if (this.Y2 != null) {
                                    y10 = this.Y2.getY() + p50Var.getY();
                                    measuredHeight = this.Y2.getMeasuredHeight();
                                } else {
                                    y3 = p50Var.getY();
                                    i10 = (int) y3;
                                }
                                i10 = (int) (y10 + measuredHeight);
                            }
                            this.f3.showAtLocation(p50Var, 51, x10, i10);
                            this.e3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.W2, org.telegram.ui.Components.r6.b, 0, 100));
                            this.e3.playTogether(arrayList5);
                            this.e3.setDuration(150L);
                            this.e3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.a30) {
                    org.telegram.ui.Components.a30 a30Var3 = (org.telegram.ui.Components.a30) view;
                    if (a30Var3.getParticipant() != this.a1.videoNotAvailableParticipant.participant) {
                        d4Var = new org.telegram.ui.Cells.d4(a30Var3.getContext());
                        d4Var.e(this.d, a30Var3.getParticipant(), this.a1, MessageObject.getPeerId(this.A0), null, false);
                        org.telegram.ui.Components.n5 n5Var2 = d4Var.s;
                        if (n5Var2 != null) {
                            n5Var2.f();
                        }
                        this.b3 = false;
                        this.a3 = a30Var3;
                        org.telegram.ui.Components.voip.t renderer = a30Var3.getRenderer();
                        this.Z2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Z2 = null;
                        }
                        this.containerView.addView(d4Var, w7.a6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    d4Var = (org.telegram.ui.Cells.d4) view;
                    this.b3 = true;
                }
                if (d4Var != null) {
                }
            }
        }
        return false;
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.z3.e;
            o30 o30Var = this.e;
            o30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.m2.invalidate();
            this.containerView.invalidate();
            o30Var.invalidate();
        }
        if (i10 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Y0();
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final void G1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(8, getContext(), null, true);
            this.m0 = s40Var;
            s40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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

    public final void H1(boolean z10) {
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
        o30 o30Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            o30Var.c(u2Var7, this.V0 > 0.1f, z10);
            o30Var.c(u2Var6, this.V0 > 0.1f, z10);
            o30Var.c(u2Var3, this.V0 > 0.1f, z10);
            o30Var.c(u2Var5, false, z10);
            o30Var.c(u2Var4, false, z10);
            o30Var.c(u2Var2, false, z10);
            o30Var.c(u2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
        Boolean bool = this.x3;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.a1.call;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.a1.canRecordVideo()) && !z16) || r1()) {
            z15 = true;
            z12 = false;
        } else {
            z12 = true;
        }
        if (z16) {
            z13 = false;
            z14 = true;
        } else {
            z13 = !z17;
            z14 = false;
        }
        if (F3) {
            z13 = false;
            z14 = false;
        }
        o30Var.c(u2Var7, true, z10);
        o30Var.c(u2Var6, true, z10);
        o30Var.c(u2Var5, z12, z10);
        o30Var.c(u2Var4, z14, z10);
        o30Var.c(u2Var3, z15, z10);
        o30Var.c(u2Var2, z13, z10);
        o30Var.c(u2Var, z11, z10);
    }

    public final void I1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.a1;
        org.telegram.ui.ActionBar.w0 w0Var = this.k1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.a1 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat3 != null) {
            this.Z0 = chat3;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.n1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.Z0) || ((chat2 = this.Z0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.Z0) || ChatObject.canUserDoAdminAction(this.Z0, 3))) || (ChatObject.isChannel(this.Z0) && (chat = this.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            g1Var.setVisibility(0);
        } else {
            g1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.a1;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.y1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.x1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        } else {
            g1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            g1Var2.setVisibility(this.a1.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.a1;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.q1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(8);
        } else {
            g1Var4.setVisibility(0);
        }
        g1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        g1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.w1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.o1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.s1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.t1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.a1.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (!this.a1.canRecordVideo() || this.a1.isScheduled() || r1()) {
                g1Var8.setVisibility(8);
            } else {
                g1Var8.setVisibility(0);
            }
            w0Var2.setVisibility(8);
            boolean z11 = this.a1.recording;
            e60 e60Var = this.d1;
            e60Var.f = z11;
            e60Var.d = 1.0f;
            e60Var.invalidateSelf();
            if (this.a1.recording) {
                if (this.D1 == null) {
                    w20 w20Var = new w20(this, 6);
                    this.D1 = w20Var;
                    AndroidUtilities.runOnUIThread(w20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                w20 w20Var2 = this.D1;
                if (w20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(w20Var2);
                    this.D1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            K1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.a1.canRecordVideo() || z13) || this.a1.isScheduled() || r1())) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            } else if (z13) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(0);
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(0);
            }
            g1Var5.setVisibility(8);
            g1Var6.setVisibility(8);
            g1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var9 = this.r1;
        if (Q02 && this.a1.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        w0Var.I(4, z10);
        this.p1.setVisibility((!r1() || this.a1.isScheduled()) ? 0 : 8);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility == 0 || g1Var9.getVisibility() == 0 || g1Var.getVisibility() == 0 || g1Var8.getVisibility() == 0 || g1Var7.getVisibility() == 0 || g1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.k0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.b1) || r1() || this.A0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.A0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.Z0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || g1Var.getVisibility() != 8) {
            w0Var.setVisibility(0);
        } else {
            w0Var.setVisibility(8);
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

    /* JADX WARN: Removed duplicated region for block: B:113:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J1(int i10, boolean z10) {
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
        i60[] i60VarArr;
        i60 i60Var;
        i60 i60Var2;
        boolean z13;
        boolean z14;
        b40 b40Var = this.a2;
        boolean z15 = b40Var != null && b40Var.b && (AndroidUtilities.isTablet() || F3 == q1());
        if (!r1() && this.F1 == i10 && z10) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.hj0 hj0Var = this.J0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            P5 = hj0Var.P(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.F1;
                        if (i13 == 3) {
                            int i14 = hj0Var.f;
                            P3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? hj0Var.P(99) : false;
                        } else if (i13 == 5) {
                            P3 = hj0Var.P(404);
                        } else if (i13 == 7) {
                            P3 = hj0Var.P(376);
                        } else if (i13 == 6) {
                            P3 = hj0Var.P(237);
                        } else {
                            if (i13 == 2) {
                                z12 = hj0Var.P(36);
                                str = string3;
                                string2 = string4;
                                z11 = false;
                                if (r1() || i10 == i12 || this.a1.isScheduled()) {
                                    str2 = string2;
                                } else {
                                    str = LocaleController.getString(z15 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                    boolean z16 = this.G1 != z15;
                                    this.G1 = z15;
                                    z12 = z16;
                                    str2 = "";
                                }
                                String C = !TextUtils.isEmpty(str2) ? a4.a.C(str, " ", str2) : str;
                                org.telegram.ui.Components.voip.u2 u2Var = this.w;
                                u2Var.setContentDescription(C);
                                u2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                p30 p30Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i10 == 5) {
                                            hj0Var.M(376);
                                        } else if (i10 == 7) {
                                            hj0Var.M(173);
                                        } else if (i10 == 6) {
                                            hj0Var.M(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.F1;
                                            if (i15 == 5) {
                                                hj0Var.M(376);
                                            } else if (i15 == 7) {
                                                hj0Var.M(344);
                                            } else if (i15 == 6) {
                                                hj0Var.M(202);
                                            } else if (i15 == 2) {
                                                hj0Var.M(0);
                                            } else {
                                                hj0Var.M(69);
                                            }
                                        } else if (i10 == 1 || (this.F1 == 2 && o1())) {
                                            hj0Var.M(this.F1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            hj0Var.M(99);
                                        } else if (z11) {
                                            int i16 = this.F1;
                                            if (i16 == 7) {
                                                hj0Var.M(274);
                                            } else if (i16 == 6) {
                                                hj0Var.M(237);
                                            } else if (i16 == 1) {
                                                hj0Var.M(136);
                                            } else {
                                                hj0Var.M(99);
                                            }
                                        } else {
                                            int i17 = this.F1;
                                            if (i17 == 5) {
                                                hj0Var.M(376);
                                            } else if (i17 == 7) {
                                                hj0Var.M(344);
                                            } else if (i17 == 6) {
                                                hj0Var.M(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                hj0Var.M(0);
                                            } else {
                                                hj0Var.M(69);
                                            }
                                        }
                                    }
                                    p30Var.d();
                                    if (!r1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        p30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((b40Var != null && b40Var.b && (AndroidUtilities.isTablet() || F3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        p30Var.setVisibility(8);
                                    }
                                    this.F1 = i10;
                                } else {
                                    this.F1 = i10;
                                    hj0Var.N(hj0Var.f - 1, false, true);
                                    if (!r1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        p30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((b40Var != null && b40Var.b && (AndroidUtilities.isTablet() || F3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        p30Var.setVisibility(8);
                                    }
                                }
                                u2Var.invalidate();
                                i11 = this.F1;
                                i60VarArr = this.K1;
                                if (i60VarArr[i11] == null) {
                                    i60VarArr[i11] = new i60(i11);
                                    int i18 = this.F1;
                                    if (i18 == 3) {
                                        i60VarArr[i18].g = null;
                                    } else if (p1(i18)) {
                                        i60VarArr[this.F1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.F1;
                                        if (i19 != 1) {
                                            i60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            i60Var = i60VarArr[this.F1];
                                            i60Var2 = this.N1;
                                            if (i60Var != i60Var2) {
                                                this.M1 = i60Var2;
                                                this.N1 = i60Var;
                                                if (i60Var2 == null || !z10) {
                                                    this.L1 = 1.0f;
                                                    this.M1 = null;
                                                } else {
                                                    this.L1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                i60 i60Var3 = this.N1;
                                                if (i60Var3 != null) {
                                                    int i20 = i60Var3.i;
                                                    z14 = i20 == 1 || i20 == 0;
                                                    z13 = i20 != 3;
                                                } else {
                                                    z13 = false;
                                                    z14 = false;
                                                }
                                                this.P1 = z14 ? 1.0f : 0.0f;
                                                this.Q1 = z13 ? 1.0f : 0.0f;
                                            }
                                            this.e.invalidate();
                                        }
                                        i60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                i60Var = i60VarArr[this.F1];
                                i60Var2 = this.N1;
                                if (i60Var != i60Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            P3 = hj0Var.P(99);
                        }
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            P4 = hj0Var.P(this.F1 == 4 ? 99 : 69);
                        } else if (o1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            P4 = hj0Var.P(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                                if (z11) {
                                    int i21 = this.F1;
                                    if (i21 == 7) {
                                        P2 = hj0Var.P(311);
                                    } else if (i21 == 6) {
                                        P2 = hj0Var.P(274);
                                    } else if (i21 == 1) {
                                        P2 = hj0Var.P(173);
                                    } else {
                                        P = hj0Var.P(136);
                                    }
                                    P = P2;
                                } else {
                                    int i22 = this.F1;
                                    if (i22 == 5) {
                                        P2 = hj0Var.P(404);
                                    } else if (i22 == 7) {
                                        P = hj0Var.P(376);
                                    } else if (i22 == 6) {
                                        P = hj0Var.P(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        P = hj0Var.P(36);
                                    } else {
                                        P2 = hj0Var.P(99);
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
                                if (r1()) {
                                }
                                str2 = string2;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                org.telegram.ui.Components.voip.u2 u2Var2 = this.w;
                                u2Var2.setContentDescription(C);
                                u2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                p30 p30Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                u2Var2.invalidate();
                                i11 = this.F1;
                                i60VarArr = this.K1;
                                if (i60VarArr[i11] == null) {
                                }
                                i60Var = i60VarArr[this.F1];
                                i60Var2 = this.N1;
                                if (i60Var != i60Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            P3 = hj0Var.P(136);
                        }
                        z12 = P4;
                    }
                    z12 = P3;
                    str = string3;
                    string2 = string4;
                    z11 = false;
                    if (r1()) {
                    }
                    str2 = string2;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    org.telegram.ui.Components.voip.u2 u2Var22 = this.w;
                    u2Var22.setContentDescription(C);
                    u2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    p30 p30Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    u2Var22.invalidate();
                    i11 = this.F1;
                    i60VarArr = this.K1;
                    if (i60VarArr[i11] == null) {
                    }
                    i60Var = i60VarArr[this.F1];
                    i60Var2 = this.N1;
                    if (i60Var != i60Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = hj0Var.P(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (r1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.u2 u2Var222 = this.w;
                u2Var222.setContentDescription(C);
                u2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                p30 p30Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                u2Var222.invalidate();
                i11 = this.F1;
                i60VarArr = this.K1;
                if (i60VarArr[i11] == null) {
                }
                i60Var = i60VarArr[this.F1];
                i60Var2 = this.N1;
                if (i60Var != i60Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            P5 = hj0Var.P(344);
        }
        string2 = "";
        str = string6;
        z12 = P5;
        z11 = false;
        if (r1()) {
        }
        str2 = string2;
        if (!TextUtils.isEmpty(str2)) {
        }
        org.telegram.ui.Components.voip.u2 u2Var2222 = this.w;
        u2Var2222.setContentDescription(C);
        u2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        p30 p30Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        u2Var2222.invalidate();
        i11 = this.F1;
        i60VarArr = this.K1;
        if (i60VarArr[i11] == null) {
        }
        i60Var = i60VarArr[this.F1];
        i60Var2 = this.N1;
        if (i60Var != i60Var2) {
        }
        if (!z10) {
        }
        this.e.invalidate();
    }

    public final void K1() {
        if (this.a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.s1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f7;
        s40 s40Var = this.R;
        if ((s40Var == null || this.a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (s40Var == null) {
                return;
            }
        }
        if (!z10) {
            s30 s30Var = this.w2;
            AndroidUtilities.cancelRunOnUIThread(s30Var);
            s30Var.run();
            ChatObject.Call call = this.a1;
            p50 p50Var = this.Q;
            if (call == null || call.isScheduled()) {
                p50Var.setVisibility(4);
            } else {
                p50Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.g1 g1Var = this.w1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.wr.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
            this.W0 = wrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * wrVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f7;
        s40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        o50 o50Var = this.V;
        o50Var.setAlpha(f7);
        o50Var.setScaleX(interpolation);
        o50Var.setScaleY(interpolation);
        q40 q40Var = this.T;
        q40Var.setScaleX(f11);
        q40Var.setScaleY(f11);
        q40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.k1.setAlpha(f7);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != s40Var.getVisibility()) {
            s40Var.setVisibility(i10);
            q40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        org.telegram.ui.Components.voip.u2 u2Var = this.r;
        if (u2Var == null || u2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        o30 o30Var = this.e;
        if (sharedInstance == null || r1()) {
            u2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.Z0) || (ChatObject.hasAdminRights(this.Z0) && ChatObject.canAddUsers(this.Z0));
            jh.a aVar = (jh.a) o30Var.c.get(u2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
            return;
        }
        jh.a aVar2 = (jh.a) o30Var.c.get(u2Var);
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
        h1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.a0 != i10) {
            this.a0 = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.b0, i10);
        }
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        if (u2Var2.getVisibility() == 0) {
            u2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
            u2Var2.b(h1() != 1, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(boolean z10, boolean z11) {
        long j3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        int i11;
        boolean z18;
        org.telegram.ui.Components.voip.u2 u2Var;
        org.telegram.ui.Components.voip.u2 u2Var2;
        org.telegram.ui.Components.voip.u2 u2Var3;
        boolean z19;
        boolean r12;
        int i12;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.s;
        int i13 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i13 = 5;
            } else if (this.a1.call.schedule_start_subscribed) {
                i13 = 7;
            }
            J1(i13, z10);
            u2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            L1(false);
            return;
        }
        H1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j3 = 0;
        } else {
            j3 = 0;
            if ((this.t0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.t0) > 3000) && ((i12 = this.T1) == 1 || i12 == 2 || i12 == 6 || i12 == 5)) {
                R0();
                J1(3, z10);
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0();
                if (!((z13 && this.a1.canRecordVideo()) || z12) || r1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = false;
                }
                if (z12) {
                    z16 = !z13;
                    i10 = 0;
                } else {
                    z16 = false;
                    i10 = 1;
                }
                if (F3) {
                    z17 = z16;
                    i11 = i10;
                } else {
                    z17 = false;
                    i11 = 0;
                }
                int i14 = i11 + (!z15 ? 2 : 0) + (!z14 ? 4 : 0);
                b40 b40Var = this.a2;
                int i15 = i14 + ((b40Var == null && b40Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.o0 | 2) == (i15 | 2);
                this.o0 = i15;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.u2 u2Var5 = this.n;
                if (z14) {
                    u2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    u2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.u2 u2Var6 = this.f;
                if (i11 != 0) {
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
                    h1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i16 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.a0 != i16) {
                        this.a0 = i16;
                        AndroidUtilities.updateImageViewImageAnimated(this.b0, i16);
                    }
                    u2Var2 = u2Var5;
                    u2Var = u2Var6;
                    u2Var7.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    u2Var3 = u2Var7;
                    z19 = z10;
                    u2Var3.b(h1() != 1, z19);
                }
                org.telegram.ui.Components.voip.u2 u2Var8 = u2Var3;
                u2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    M1(false);
                }
                u2Var2.d(true, z19);
                u2Var.d(true, z19);
                u2Var8.d(true, z19);
                r12 = r1();
                v30 v30Var = this.f1;
                if (r12) {
                    v30Var.setVisibility(8);
                } else {
                    v30Var.setVisibility(0);
                    boolean z21 = ((Integer) v30Var.getTag()).intValue() == 3;
                    int i17 = this.T1;
                    final boolean z22 = i17 == 3;
                    v30Var.setTag(Integer.valueOf(i17));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.h1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.g1;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i18 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.h1 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.b30
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i18, floatValue, 1.0f);
                                    j60 j60Var = j60.this;
                                    j60Var.g1.setColor(offsetColor);
                                    j60Var.f1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    j60Var.i1 = floatValue;
                                    y50 y50Var = j60Var.U0;
                                    if (y50Var == null || !j60Var.z2) {
                                        return;
                                    }
                                    y50Var.invalidate();
                                }
                            });
                            this.h1.setDuration(300L);
                            this.h1.setInterpolator(org.telegram.ui.Components.wr.f);
                            this.h1.addListener(new d50(this, 2));
                            this.h1.start();
                        } else {
                            paint.setColor(this.T1 == 3 ? -1163700 : -12761513);
                            v30Var.invalidate();
                        }
                    }
                }
                if (r1() || !LiteMode.isEnabled(512)) {
                }
                if (this.T1 == 3) {
                    this.z2 = true;
                    z1();
                    return;
                } else {
                    this.z2 = false;
                    AndroidUtilities.cancelRunOnUIThread(this.A2);
                    return;
                }
            }
        }
        if (this.B0 != null) {
            k1().k(0L, 37, this.B0, this.Z0, null, null);
            this.B0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || Q0()) {
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                R0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                J1(0, z10);
            } else {
                J1(1, z10);
            }
        } else {
            R0();
            if (groupCallParticipant2.raise_hand_rating != j3) {
                J1(4, z10);
            } else {
                J1(2, z10);
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
        int i142 = i11 + (!z15 ? 2 : 0) + (!z14 ? 4 : 0);
        b40 b40Var2 = this.a2;
        int i152 = i142 + ((b40Var2 == null && b40Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.o0 | 2) == (i152 | 2)) {
        }
        this.o0 = i152;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.u2 u2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.u2 u2Var62 = this.f;
        if (i11 != 0) {
        }
        org.telegram.ui.Components.voip.u2 u2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.u2 u2Var82 = u2Var3;
        u2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            M1(false);
        }
        u2Var2.d(true, z19);
        u2Var.d(true, z19);
        u2Var82.d(true, z19);
        r12 = r1();
        v30 v30Var2 = this.f1;
        if (r12) {
        }
        if (r1()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b0 A[LOOP:2: B:137:0x02aa->B:139:0x02b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        p50 p50Var;
        d60 d60Var;
        b40 b40Var;
        p50 p50Var2;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z11;
        ArrayList arrayList2;
        int i12;
        int i13;
        p50 p50Var3;
        b40 b40Var2;
        x30 x30Var;
        ArrayList arrayList3;
        int i14;
        ChatObject.Call call;
        boolean z12;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        s4.c1 G;
        int i15;
        j60 j60Var = this;
        d60 d60Var2 = j60Var.P;
        b40 b40Var3 = j60Var.a2;
        if (b40Var3 == null || (p50Var = j60Var.Q) == null || j60Var.a1 == null || j60Var.s0) {
            return;
        }
        if (b40Var3.b) {
            b40Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(j60Var.a1.selfPeer);
        if (peerId != MessageObject.getPeerId(j60Var.A0) && j60Var.a1.participants.f(peerId) != null) {
            j60Var.A0 = j60Var.a1.selfPeer;
        }
        int childCount = p50Var.getChildCount();
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = p50Var.getChildAt(i18);
            s4.c1 G2 = p50Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i16)) {
                i17 = G2.c();
                i16 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList4 = j60Var.q0;
        arrayList4.clear();
        if (!G3) {
            arrayList4.addAll(j60Var.a1.visibleVideoParticipants);
        } else if (b40Var3.b) {
            arrayList4.addAll(j60Var.a1.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = b40Var3.e;
            if (videoParticipant3 != null) {
                arrayList4.remove(videoParticipant3);
            }
        }
        if (p50Var.getItemAnimator() != null && !z10) {
            p50Var.setItemAnimator(null);
        } else if (p50Var.getItemAnimator() == null && z10) {
            p50Var.setItemAnimator(j60Var.X);
        }
        try {
            g gVar = new g(d60Var2, 21);
            try {
                try {
                    z11 = true;
                    try {
                        try {
                            try {
                                i15 = i17;
                                try {
                                    b40Var = b40Var3;
                                } catch (Exception e) {
                                    e = e;
                                    b40Var = b40Var3;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                i11 = i17;
                                b40Var = b40Var3;
                                p50Var2 = p50Var;
                                i10 = childCount;
                                arrayList = arrayList4;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            d60Var = d60Var2;
                            arrayList = arrayList4;
                            i11 = i17;
                            b40Var = b40Var3;
                            p50Var2 = p50Var;
                            i10 = childCount;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        d60Var = d60Var2;
                        i10 = childCount;
                        arrayList = arrayList4;
                        i11 = i17;
                        b40Var = b40Var3;
                        p50Var2 = p50Var;
                    }
                } catch (Exception e12) {
                    e = e12;
                    d60Var = d60Var2;
                    i10 = childCount;
                    arrayList = arrayList4;
                    i11 = i17;
                    b40Var = b40Var3;
                    p50Var2 = p50Var;
                }
                try {
                    p50Var2 = p50Var;
                    try {
                        try {
                            try {
                            } catch (Exception e13) {
                                e = e13;
                                arrayList = arrayList4;
                                i11 = i15;
                                i10 = childCount;
                                z11 = true;
                                d60Var = d60Var2;
                                FileLog.e(e);
                                d60Var.l();
                                j60Var.a1.saveActiveDates();
                                if (view != null) {
                                }
                                ArrayList arrayList5 = j60Var.D0;
                                arrayList5.clear();
                                arrayList5.addAll(j60Var.a1.visibleParticipants);
                                ArrayList arrayList6 = j60Var.E0;
                                arrayList6.clear();
                                arrayList2 = arrayList;
                                arrayList6.addAll(arrayList2);
                                ArrayList arrayList7 = j60Var.F0;
                                arrayList7.clear();
                                arrayList7.addAll(j60Var.a1.invitedUsers);
                                ArrayList arrayList8 = j60Var.G0;
                                arrayList8.clear();
                                arrayList8.addAll(j60Var.a1.shadyJoinParticipants);
                                ArrayList arrayList9 = j60Var.H0;
                                arrayList9.clear();
                                arrayList9.addAll(j60Var.a1.shadyLeftParticipants);
                                d60 d60Var3 = d60Var;
                                j60Var.I0 = d60Var3.F;
                                i12 = i10;
                                i13 = 0;
                                while (i13 < i12) {
                                }
                                p50Var3 = p50Var2;
                                boolean c10 = b40Var.c();
                                b40Var2 = b40Var;
                                if (b40Var2.b) {
                                    if (!arrayList2.isEmpty()) {
                                    }
                                    org.telegram.ui.Components.b30 b30Var = j60Var.p2;
                                    x30Var = j60Var.m2;
                                    b30Var.G(x30Var, z11);
                                    if (x30Var.getVisibility() == 0) {
                                    }
                                    if (G3) {
                                    }
                                    if (p50Var3.getVisibility() == 0) {
                                    }
                                    arrayList3 = j60Var.Z1;
                                    arrayList3.clear();
                                    arrayList3.addAll(j60Var.Y1);
                                    while (i14 < arrayList3.size()) {
                                    }
                                    call = j60Var.a1;
                                    if (call != null) {
                                    }
                                    ChatObject.Call call2 = j60Var.a1;
                                    if (call2 == null) {
                                    }
                                    j60Var.C3.a(z12, z10);
                                    if (z12 != j60Var.I2) {
                                    }
                                }
                                org.telegram.ui.Components.b30 b30Var2 = j60Var.p2;
                                x30Var = j60Var.m2;
                                b30Var2.G(x30Var, z11);
                                if (x30Var.getVisibility() == 0) {
                                }
                                if (G3) {
                                }
                                if (p50Var3.getVisibility() == 0) {
                                }
                                arrayList3 = j60Var.Z1;
                                arrayList3.clear();
                                arrayList3.addAll(j60Var.Y1);
                                while (i14 < arrayList3.size()) {
                                }
                                call = j60Var.a1;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = j60Var.a1;
                                if (call22 == null) {
                                }
                                j60Var.C3.a(z12, z10);
                                if (z12 != j60Var.I2) {
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            i10 = childCount;
                            arrayList = arrayList4;
                            i11 = i15;
                        }
                        try {
                            arrayList = arrayList4;
                            i11 = i15;
                            i10 = childCount;
                            j60Var = this;
                            d60Var = d60Var2;
                        } catch (Exception e15) {
                            e = e15;
                            z11 = true;
                            j60Var = this;
                            arrayList = arrayList4;
                            i11 = i15;
                            i10 = childCount;
                            d60Var = d60Var2;
                            FileLog.e(e);
                            d60Var.l();
                            j60Var.a1.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList52 = j60Var.D0;
                            arrayList52.clear();
                            arrayList52.addAll(j60Var.a1.visibleParticipants);
                            ArrayList arrayList62 = j60Var.E0;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = j60Var.F0;
                            arrayList72.clear();
                            arrayList72.addAll(j60Var.a1.invitedUsers);
                            ArrayList arrayList82 = j60Var.G0;
                            arrayList82.clear();
                            arrayList82.addAll(j60Var.a1.shadyJoinParticipants);
                            ArrayList arrayList92 = j60Var.H0;
                            arrayList92.clear();
                            arrayList92.addAll(j60Var.a1.shadyLeftParticipants);
                            d60 d60Var32 = d60Var;
                            j60Var.I0 = d60Var32.F;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            p50Var3 = p50Var2;
                            boolean c102 = b40Var.c();
                            b40Var2 = b40Var;
                            if (b40Var2.b) {
                            }
                            org.telegram.ui.Components.b30 b30Var22 = j60Var.p2;
                            x30Var = j60Var.m2;
                            b30Var22.G(x30Var, z11);
                            if (x30Var.getVisibility() == 0) {
                            }
                            if (G3) {
                            }
                            if (p50Var3.getVisibility() == 0) {
                            }
                            arrayList3 = j60Var.Z1;
                            arrayList3.clear();
                            arrayList3.addAll(j60Var.Y1);
                            while (i14 < arrayList3.size()) {
                            }
                            call = j60Var.a1;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = j60Var.a1;
                            if (call222 == null) {
                            }
                            j60Var.C3.a(z12, z10);
                            if (z12 != j60Var.I2) {
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        i10 = childCount;
                        arrayList = arrayList4;
                        i11 = i15;
                        d60Var = d60Var2;
                        FileLog.e(e);
                        d60Var.l();
                        j60Var.a1.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList522 = j60Var.D0;
                        arrayList522.clear();
                        arrayList522.addAll(j60Var.a1.visibleParticipants);
                        ArrayList arrayList622 = j60Var.E0;
                        arrayList622.clear();
                        arrayList2 = arrayList;
                        arrayList622.addAll(arrayList2);
                        ArrayList arrayList722 = j60Var.F0;
                        arrayList722.clear();
                        arrayList722.addAll(j60Var.a1.invitedUsers);
                        ArrayList arrayList822 = j60Var.G0;
                        arrayList822.clear();
                        arrayList822.addAll(j60Var.a1.shadyJoinParticipants);
                        ArrayList arrayList922 = j60Var.H0;
                        arrayList922.clear();
                        arrayList922.addAll(j60Var.a1.shadyLeftParticipants);
                        d60 d60Var322 = d60Var;
                        j60Var.I0 = d60Var322.F;
                        i12 = i10;
                        i13 = 0;
                        while (i13 < i12) {
                        }
                        p50Var3 = p50Var2;
                        boolean c1022 = b40Var.c();
                        b40Var2 = b40Var;
                        if (b40Var2.b) {
                        }
                        org.telegram.ui.Components.b30 b30Var222 = j60Var.p2;
                        x30Var = j60Var.m2;
                        b30Var222.G(x30Var, z11);
                        if (x30Var.getVisibility() == 0) {
                        }
                        if (G3) {
                        }
                        if (p50Var3.getVisibility() == 0) {
                        }
                        arrayList3 = j60Var.Z1;
                        arrayList3.clear();
                        arrayList3.addAll(j60Var.Y1);
                        while (i14 < arrayList3.size()) {
                        }
                        call = j60Var.a1;
                        if (call != null) {
                        }
                        ChatObject.Call call2222 = j60Var.a1;
                        if (call2222 == null) {
                        }
                        j60Var.C3.a(z12, z10);
                        if (z12 != j60Var.I2) {
                        }
                    }
                    try {
                        j60Var.D1(d60Var2.K, d60Var2.w, d60Var2.d, d60Var2.e, d60Var2.f, d60Var2.h, d60Var2.n, d60Var2.r, d60Var2.s, d60Var2.v, d60Var2.G, d60Var2.H, d60Var2.I, d60Var2.J, d60Var2.x, d60Var2.y);
                        d60Var.E();
                        z11 = true;
                        try {
                            s4.o.c(j60Var.w3, true).a(gVar);
                        } catch (Exception e17) {
                            e = e17;
                            FileLog.e(e);
                            d60Var.l();
                            j60Var.a1.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList5222 = j60Var.D0;
                            arrayList5222.clear();
                            arrayList5222.addAll(j60Var.a1.visibleParticipants);
                            ArrayList arrayList6222 = j60Var.E0;
                            arrayList6222.clear();
                            arrayList2 = arrayList;
                            arrayList6222.addAll(arrayList2);
                            ArrayList arrayList7222 = j60Var.F0;
                            arrayList7222.clear();
                            arrayList7222.addAll(j60Var.a1.invitedUsers);
                            ArrayList arrayList8222 = j60Var.G0;
                            arrayList8222.clear();
                            arrayList8222.addAll(j60Var.a1.shadyJoinParticipants);
                            ArrayList arrayList9222 = j60Var.H0;
                            arrayList9222.clear();
                            arrayList9222.addAll(j60Var.a1.shadyLeftParticipants);
                            d60 d60Var3222 = d60Var;
                            j60Var.I0 = d60Var3222.F;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            p50Var3 = p50Var2;
                            boolean c10222 = b40Var.c();
                            b40Var2 = b40Var;
                            if (b40Var2.b) {
                            }
                            org.telegram.ui.Components.b30 b30Var2222 = j60Var.p2;
                            x30Var = j60Var.m2;
                            b30Var2222.G(x30Var, z11);
                            if (x30Var.getVisibility() == 0) {
                            }
                            if (G3) {
                            }
                            if (p50Var3.getVisibility() == 0) {
                            }
                            arrayList3 = j60Var.Z1;
                            arrayList3.clear();
                            arrayList3.addAll(j60Var.Y1);
                            while (i14 < arrayList3.size()) {
                            }
                            call = j60Var.a1;
                            if (call != null) {
                            }
                            ChatObject.Call call22222 = j60Var.a1;
                            if (call22222 == null) {
                            }
                            j60Var.C3.a(z12, z10);
                            if (z12 != j60Var.I2) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        z11 = true;
                        FileLog.e(e);
                        d60Var.l();
                        j60Var.a1.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList52222 = j60Var.D0;
                        arrayList52222.clear();
                        arrayList52222.addAll(j60Var.a1.visibleParticipants);
                        ArrayList arrayList62222 = j60Var.E0;
                        arrayList62222.clear();
                        arrayList2 = arrayList;
                        arrayList62222.addAll(arrayList2);
                        ArrayList arrayList72222 = j60Var.F0;
                        arrayList72222.clear();
                        arrayList72222.addAll(j60Var.a1.invitedUsers);
                        ArrayList arrayList82222 = j60Var.G0;
                        arrayList82222.clear();
                        arrayList82222.addAll(j60Var.a1.shadyJoinParticipants);
                        ArrayList arrayList92222 = j60Var.H0;
                        arrayList92222.clear();
                        arrayList92222.addAll(j60Var.a1.shadyLeftParticipants);
                        d60 d60Var32222 = d60Var;
                        j60Var.I0 = d60Var32222.F;
                        i12 = i10;
                        i13 = 0;
                        while (i13 < i12) {
                        }
                        p50Var3 = p50Var2;
                        boolean c102222 = b40Var.c();
                        b40Var2 = b40Var;
                        if (b40Var2.b) {
                        }
                        org.telegram.ui.Components.b30 b30Var22222 = j60Var.p2;
                        x30Var = j60Var.m2;
                        b30Var22222.G(x30Var, z11);
                        if (x30Var.getVisibility() == 0) {
                        }
                        if (G3) {
                        }
                        if (p50Var3.getVisibility() == 0) {
                        }
                        arrayList3 = j60Var.Z1;
                        arrayList3.clear();
                        arrayList3.addAll(j60Var.Y1);
                        while (i14 < arrayList3.size()) {
                        }
                        call = j60Var.a1;
                        if (call != null) {
                        }
                        ChatObject.Call call222222 = j60Var.a1;
                        if (call222222 == null) {
                        }
                        j60Var.C3.a(z12, z10);
                        if (z12 != j60Var.I2) {
                        }
                    }
                } catch (Exception e19) {
                    e = e19;
                    p50Var2 = p50Var;
                    i10 = childCount;
                    arrayList = arrayList4;
                    i11 = i15;
                    d60Var = d60Var2;
                    FileLog.e(e);
                    d60Var.l();
                    j60Var.a1.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList522222 = j60Var.D0;
                    arrayList522222.clear();
                    arrayList522222.addAll(j60Var.a1.visibleParticipants);
                    ArrayList arrayList622222 = j60Var.E0;
                    arrayList622222.clear();
                    arrayList2 = arrayList;
                    arrayList622222.addAll(arrayList2);
                    ArrayList arrayList722222 = j60Var.F0;
                    arrayList722222.clear();
                    arrayList722222.addAll(j60Var.a1.invitedUsers);
                    ArrayList arrayList822222 = j60Var.G0;
                    arrayList822222.clear();
                    arrayList822222.addAll(j60Var.a1.shadyJoinParticipants);
                    ArrayList arrayList922222 = j60Var.H0;
                    arrayList922222.clear();
                    arrayList922222.addAll(j60Var.a1.shadyLeftParticipants);
                    d60 d60Var322222 = d60Var;
                    j60Var.I0 = d60Var322222.F;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    p50Var3 = p50Var2;
                    boolean c1022222 = b40Var.c();
                    b40Var2 = b40Var;
                    if (b40Var2.b) {
                    }
                    org.telegram.ui.Components.b30 b30Var222222 = j60Var.p2;
                    x30Var = j60Var.m2;
                    b30Var222222.G(x30Var, z11);
                    if (x30Var.getVisibility() == 0) {
                    }
                    if (G3) {
                    }
                    if (p50Var3.getVisibility() == 0) {
                    }
                    arrayList3 = j60Var.Z1;
                    arrayList3.clear();
                    arrayList3.addAll(j60Var.Y1);
                    while (i14 < arrayList3.size()) {
                    }
                    call = j60Var.a1;
                    if (call != null) {
                    }
                    ChatObject.Call call2222222 = j60Var.a1;
                    if (call2222222 == null) {
                    }
                    j60Var.C3.a(z12, z10);
                    if (z12 != j60Var.I2) {
                    }
                }
            } catch (Exception e20) {
                e = e20;
                d60Var = d60Var2;
                p50Var2 = p50Var;
                i10 = childCount;
                arrayList = arrayList4;
                i11 = i17;
                b40Var = b40Var3;
            }
        } catch (Exception e21) {
            e = e21;
            d60Var = d60Var2;
            b40Var = b40Var3;
            p50Var2 = p50Var;
            i10 = childCount;
            arrayList = arrayList4;
            i11 = i17;
        }
        j60Var.a1.saveActiveDates();
        if (view != null) {
            j60Var.Y.h1(i11, view.getTop() - p50Var2.getPaddingTop());
        }
        ArrayList arrayList5222222 = j60Var.D0;
        arrayList5222222.clear();
        arrayList5222222.addAll(j60Var.a1.visibleParticipants);
        ArrayList arrayList6222222 = j60Var.E0;
        arrayList6222222.clear();
        arrayList2 = arrayList;
        arrayList6222222.addAll(arrayList2);
        ArrayList arrayList7222222 = j60Var.F0;
        arrayList7222222.clear();
        arrayList7222222.addAll(j60Var.a1.invitedUsers);
        ArrayList arrayList8222222 = j60Var.G0;
        arrayList8222222.clear();
        arrayList8222222.addAll(j60Var.a1.shadyJoinParticipants);
        ArrayList arrayList9222222 = j60Var.H0;
        arrayList9222222.clear();
        arrayList9222222.addAll(j60Var.a1.shadyLeftParticipants);
        d60 d60Var3222222 = d60Var;
        j60Var.I0 = d60Var3222222.F;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            p50 p50Var4 = p50Var2;
            View childAt2 = p50Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.d4) || (childAt2 instanceof org.telegram.ui.Cells.v3)) && (G = p50Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt2).setDrawDivider(G.b() != d60Var3222222.F + (-2));
                } else {
                    ((org.telegram.ui.Cells.v3) childAt2).setDrawDivider(G.b() != d60Var3222222.F + (-2));
                }
            }
            i13++;
            p50Var2 = p50Var4;
        }
        p50Var3 = p50Var2;
        boolean c10222222 = b40Var.c();
        b40Var2 = b40Var;
        if (b40Var2.b && (videoParticipant2 = b40Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, j60Var.a1)) {
            if (!arrayList2.isEmpty()) {
                j60Var.e1(null);
            } else if (c10222222) {
                j60Var.e1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.b30 b30Var2222222 = j60Var.p2;
            x30Var = j60Var.m2;
            b30Var2222222.G(x30Var, z11);
            if (x30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(x30Var);
            }
            if (G3) {
                j60Var.o2.I(j60Var.n2, z11);
            }
            if (p50Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(p50Var3);
            }
            arrayList3 = j60Var.Z1;
            arrayList3.clear();
            arrayList3.addAll(j60Var.Y1);
            for (i14 = 0; i14 < arrayList3.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList3.get(i14)).j(z11);
            }
            call = j60Var.a1;
            if (call != null && b40Var2.b && (videoParticipant = b40Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call22222222 = j60Var.a1;
            z12 = call22222222 == null && !call22222222.visibleVideoParticipants.isEmpty();
            j60Var.C3.a(z12, z10);
            if (z12 != j60Var.I2) {
                j60Var.I2 = z12;
                if (G3) {
                    j60Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.b30 b30Var22222222 = j60Var.p2;
        x30Var = j60Var.m2;
        b30Var22222222.G(x30Var, z11);
        if (x30Var.getVisibility() == 0) {
        }
        if (G3) {
        }
        if (p50Var3.getVisibility() == 0) {
        }
        arrayList3 = j60Var.Z1;
        arrayList3.clear();
        arrayList3.addAll(j60Var.Y1);
        while (i14 < arrayList3.size()) {
        }
        call = j60Var.a1;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call222222222 = j60Var.a1;
        if (call222222222 == null) {
        }
        j60Var.C3.a(z12, z10);
        if (z12 != j60Var.I2) {
        }
    }

    public final void O1() {
        boolean z10;
        h60 h60Var;
        f50 f50Var = this.O;
        if (f50Var == null || this.a1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.a1.currentSpeakingPeers.m(); i11++) {
            long j3 = this.a1.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.currentSpeakingPeers.f(j3);
            if (!groupCallParticipant.self) {
                b40 b40Var = this.a2;
                b40Var.getClass();
                if (b40Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.s51(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.s51(AndroidUtilities.bold()), 0);
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
            f50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.l5 subtitleTextView = f50Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i12 = this.a1.call.participants_count;
        d60 d60Var = this.P;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((d60Var.M.r1() || d60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (h60Var = this.B1) != null) {
            h60Var.setWatchersCount(this.a1.call.participants_count);
        }
        if (z10 != this.u2) {
            this.u2 = z10;
            f50Var.invalidate();
            f50Var.getSubtitleTextView().setPivotX(0.0f);
            f50Var.getSubtitleTextView().setPivotY(f50Var.getMeasuredHeight() >> 1);
            f50Var.getSubtitleTextView().animate().scaleX(this.u2 ? 0.98f : 1.0f).scaleY(this.u2 ? 0.9f : 1.0f).alpha(this.u2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(f50Var.getAdditionalSubtitleTextView(), this.u2);
        }
    }

    public final int P0() {
        p50 p50Var = this.Q;
        int childCount = p50Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = p50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.a1;
        t30 t30Var = this.e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                t30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                t30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        f50 f50Var = this.O;
        if (isEmpty) {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(f50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    f50Var.getTitleTextView().setOnClickListener(new u20(this, 9));
                } else {
                    f50Var.setTitle(this.Z0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.Z0)) {
                    t30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (r1()) {
                    t30Var.b(this.Z0.title, z10);
                } else {
                    t30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                f50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                t30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.a1.call.title.equals(f50Var.getTitle())) {
            if (z10) {
                this.O.J(this.a1.call.title, true, 180L, null);
                f50Var.getTitleTextView().setOnClickListener(new u20(this, 8));
            } else {
                f50Var.setTitle(this.a1.call.title);
            }
            t30Var.b(this.a1.call.title, z10);
        }
        org.telegram.ui.ActionBar.l5 titleTextView = f50Var.getTitleTextView();
        if (!this.a1.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                t30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                t30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new f60(titleTextView));
            TextView textView = t30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new f60(textView), (Drawable) null);
            TextView nextTextView = t30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new f60(nextTextView), (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.Z0);
        }
        ChatObject.Call call = this.a1;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void Q1() {
        float f7;
        org.telegram.ui.Components.tb tbVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r0) * f7);
        } else {
            f7 = 0.0f;
        }
        this.topBulletinContainer.setTranslationY(AndroidUtilities.lerp(((-r0.getTop()) - this.topBulletinContainer.getHeight()) + f10 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), this.O.getY() + (-this.topBulletinContainer.getTop()) + r4.getHeight(), f7));
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar == null || (tbVar = pcVar.e) == null || tbVar.getParent() == null || tbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        tbVar.setTop(f7 > 0.5f);
    }

    public final void R0() {
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
    public final void S0() {
        boolean z10;
        if (!this.c3) {
            g40 g40Var = this.b2;
            if (g40Var.getVisibility() == 0 && g40Var.getAlpha() == 1.0f) {
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

    public final void T0() {
        this.F.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.z3.e);
        U0();
        V0();
    }

    public final void U0() {
        float f7 = this.C1.b.a;
        int i10 = f7 > 0.0f ? 0 : 8;
        m40 m40Var = this.F;
        m40Var.setAlpha(f7);
        l40 l40Var = this.G;
        l40Var.setAlpha(f7);
        if (m40Var.getVisibility() != i10) {
            m40Var.setVisibility(i10);
            l40Var.setVisibility(i10);
            if (i10 == 8) {
                j40 j40Var = this.H;
                if (j40Var.isFocused()) {
                    j40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.pk0 pk0Var = this.K;
        if (pk0Var != null) {
            float f7 = this.C1.b.a * this.A3.e;
            pk0Var.setAlpha(f7);
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.pk0 pk0Var2 = this.K;
            if (pk0Var2.N0 || f7 != 1.0f) {
                return;
            }
            pk0Var2.N0 = true;
        }
    }

    public final void W0() {
        boolean z10 = G3;
        o30 o30Var = this.e;
        if (z10) {
            o30Var.setTranslationX(0.0f);
            o30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.z3;
        if (z11) {
            o30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            o30Var.setTranslationY(0.0f);
        } else {
            o30Var.setTranslationX(0.0f);
            o30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z10 = G3;
        x30 x30Var = this.m2;
        if (z10) {
            x30Var.setTranslationX(0.0f);
            x30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.z3;
        if (z11) {
            x30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            x30Var.setTranslationY(0.0f);
        } else {
            x30Var.setTranslationX(0.0f);
            x30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float f7 = this.B3.e;
        oh.i iVar = this.C1;
        float lerp = AndroidUtilities.lerp(G3 ? (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f) : F3 ? 0.0f : ((this.z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.c)) - AndroidUtilities.dp(91.0f), -((iVar.c() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        kh.h hVar = this.c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
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

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.a30 a30Var = this.a3;
        if (a30Var != null) {
            a30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.a3 = null;
        this.Z2 = null;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.b;
    }

    public final void d1(boolean z10) {
        if (this.c3 || !this.f2) {
            return;
        }
        if (z10) {
            this.c3 = true;
            y1(false, this.X2);
            return;
        }
        b1();
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
            O0(true);
        }
        S0();
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
        p50 p50Var = this.Q;
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
                    intent.putExtra("chat_id", i1());
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
                AndroidUtilities.runOnUIThread(new w20(this, 2), 3000L);
            }
            if (!this.u0 && VoIPService.getSharedInstance() != null) {
                this.a1.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            I1();
            int childCount = p50Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = p50Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                }
            }
            if (this.X2 != null) {
                this.s0 = true;
            } else {
                O0(true);
            }
            O1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.F1 == 4;
            N1(true, booleanValue);
            P1(true);
            if (z10 && ((i12 = this.F1) == 1 || i12 == 0)) {
                k1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l10 = (Long) objArr[3];
                long longValue = l10.longValue();
                if (longValue == 0 || r1()) {
                    return;
                }
                if (o1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
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
                            k1().k(0L, 44, user, this.Z0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i15 != 0) {
                        k1().k(0L, 44, chat, this.Z0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            b40 b40Var = this.a2;
            if (b40Var.b && this.a1 != null) {
                boolean c10 = b40Var.c();
                ChatObject.Call call3 = this.a1;
                if (call3 != null && b40Var.b && (videoParticipant = b40Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
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
                            if (!groupCallParticipant3.muted_by_you && b40Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i18++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            b40Var.setVisibleParticipant(true);
            O1();
            return;
        }
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
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
                AlertDialog$Builder N = org.telegram.ui.Components.d5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new a30(this, 1));
                try {
                    N.o();
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
            if (chatFull.id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.a1;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            O0(true);
            AndroidUtilities.updateVisibleRows(p50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt2 = this.E2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = p50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                s4.c1 G = p50Var.G(p50Var.getChildAt(i15));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                        if (d4Var.getParticipant() != null) {
                            d4Var.getParticipant().lastVisibleDate = longValue2;
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
            O0(true);
            AndroidUtilities.updateVisibleRows(p50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt3 = this.E2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt3).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(p50Var);
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(p50Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            v40 v40Var = this.z0;
            if (v40Var != null) {
                v40Var.b(true, true);
            }
            I1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            u50 u50Var = this.p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            u50Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        LaunchActivity launchActivity = this.i0;
        launchActivity.a1.remove(this.v2);
        this.i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.b40 b40Var = this.E1;
        if (b40Var != null) {
            b40Var.dismiss();
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

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        b40 b40Var = this.a2;
        if (b40Var != null) {
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
                b40Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (b40Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(b40Var);
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
        org.telegram.ui.Components.j30.j(getContext());
        ChatObject.Call call = this.a1;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.view.Window.Callback
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
                k1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            b40 b40Var = this.a2;
            if (b40Var.r != null) {
                return;
            }
            boolean z10 = G3;
            p50 p50Var = this.Q;
            int i10 = 0;
            if (!z10) {
                if (this.q2 != null) {
                    p50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                    this.q2 = null;
                }
                if (videoParticipant == null) {
                    if (p50Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = p50Var.getViewTreeObserver();
                        c50 c50Var = new c50(this);
                        this.q2 = c50Var;
                        viewTreeObserver.addOnPreDrawListener(c50Var);
                        return;
                    }
                    p50Var.setVisibility(0);
                    O0(false);
                    this.s0 = true;
                    ViewTreeObserver viewTreeObserver2 = p50Var.getViewTreeObserver();
                    b50 b50Var = new b50(this);
                    this.q2 = b50Var;
                    viewTreeObserver2.addOnPreDrawListener(b50Var);
                    return;
                }
                x30 x30Var = this.m2;
                if (x30Var.getVisibility() == 0) {
                    b40Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(x30Var);
                    return;
                }
                x30Var.setVisibility(0);
                org.telegram.ui.Components.b30 b30Var = this.p2;
                b30Var.G(x30Var, false);
                this.s0 = true;
                if (!b40Var.b) {
                    ArrayList arrayList = b30Var.e;
                    s4.c0 c0Var = (s4.c0) x30Var.getLayoutManager();
                    if (c0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                c0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = p50Var.getViewTreeObserver();
                a50 a50Var = new a50(this, videoParticipant);
                this.q2 = a50Var;
                viewTreeObserver3.addOnPreDrawListener(a50Var);
                return;
            }
            if (this.q2 != null) {
                p50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            p60 p60Var = this.o2;
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
                        org.telegram.ui.Components.a30 a30Var = tVar.d;
                        if (a30Var != null) {
                            a30Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new w40(this, tVar));
                    }
                }
                this.P2 = false;
                p60Var.H(this.n2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i12);
                    if (tVar2.e != null && ((videoParticipant2 = tVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.w);
                        tVar2.b(false);
                        org.telegram.ui.Components.a30 a30Var2 = tVar2.d;
                        if (a30Var2 != null) {
                            a30Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new x40(this, tVar2));
                    }
                }
                this.P2 = true;
                p60Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new uv(18, this, arrayList2));
                }
            }
            boolean z11 = !b40Var.b;
            ViewTreeObserver viewTreeObserver4 = p50Var.getViewTreeObserver();
            z40 z40Var = new z40(this, videoParticipant, z11);
            this.q2 = z40Var;
            viewTreeObserver4.addOnPreDrawListener(z40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
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

    public final long i1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void j1(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.a1 == null) {
                return;
            }
            int i10 = 0;
            while (i10 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.a1.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i10 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.p0(this, i10, z10, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.Z0);
        String q6 = !TextUtils.isEmpty(publicUsername) ? a4.a.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(q6)) {
            u1(null, q6, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new bi.f2(this, chatFull, z10, 5));
    }

    public final UndoView k1() {
        if (!G3) {
            b40 b40Var = this.a2;
            if (b40Var.b) {
                return b40Var.getUndoView();
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

    public final void l1() {
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
        kh.h hVar = this.c0;
        if (hVar != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.a1.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        o50 o50Var = this.V;
        if (o50Var == null || o50Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        M1(true);
        this.w1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        p50 p50Var = this.Q;
        p50Var.setVisibility(0);
        org.telegram.ui.ActionBar.w0 w0Var = this.l1;
        w0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p50Var, (Property<p50, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(p50Var, (Property<p50, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o50Var, (Property<o50, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o50Var, (Property<o50, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o50Var, (Property<o50, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.l5 l5Var = this.U;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.l5 l5Var2 = this.W;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(l5Var2, (Property<org.telegram.ui.ActionBar.l5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(l5Var2, (Property<org.telegram.ui.ActionBar.l5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(l5Var2, (Property<org.telegram.ui.ActionBar.l5, Float>) property, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.wr.g);
        animatorSet.addListener(new d50(this, 0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j3, final boolean z10) {
        if (this.a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.g30
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        j60 j60Var = j60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gg(j60Var, d2VarArr2, z10, tL_error, j10, invitetogroupcall));
                            return;
                        }
                        j60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new bi.ua(j60Var, j10, d2VarArr2, user, 28));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.my(this, d2VarArr, sendRequest, 25), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f7 = this.y0 - dp;
        return (((((float) this.backgroundPaddingTop) + f7) > ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f7) == ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - f7) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        M1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        p50 p50Var = this.Q;
        if (p50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(p50Var);
        }
        x30 x30Var = this.m2;
        if (x30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(x30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        v40 v40Var = this.z0;
        if (v40Var != null) {
            v40Var.b(false, false);
            return;
        }
        if (this.f2) {
            d1(true);
        } else if (this.a2.b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        v40 v40Var = this.z0;
        if (v40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        v40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.i0;
        launchActivity.a1.add(this.v2);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.j30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        N1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
    }

    public final boolean q1() {
        return r1() && !this.a1.visibleVideoParticipants.isEmpty() && (this.a1.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.a1.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean r1() {
        ChatObject.Call call = this.a1;
        return call != null && call.call.rtmp_stream;
    }

    public final void s1(org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.w0) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
        if (p2Var instanceof eo) {
            boolean P9 = ((eo) p2Var).P9();
            this.w0 = true;
            this.x0 = true;
            AndroidUtilities.runOnUIThread(new bi.g2(h3Var, editTextBoldCursor, z10, d2Var, 20), P9 ? 200L : 0L);
            return;
        }
        this.w0 = true;
        this.x0 = true;
        if (h3Var != null) {
            h3Var.setFocusable(true);
        } else if (d2Var != null) {
            d2Var.k(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new kh(2, editTextBoldCursor), 100L);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.i1.d0.V) {
            org.telegram.ui.Components.voip.i1.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u1(String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        String str3;
        String str4;
        String str5;
        if (r1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                k1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.i0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if (p2Var instanceof eo) {
                z12 = ((eo) p2Var).P9();
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
                e50 e50Var = new e50(this, getContext(), str5, str3, str4, str3);
                this.r0 = e50Var;
                e50Var.s0 = new g(this, 20);
                e50Var.setOnDismissListener(new a30(this, 3));
                AndroidUtilities.runOnUIThread(new w20(this, 7), !z12 ? 200L : 0L);
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
        e50 e50Var2 = new e50(this, getContext(), str5, str3, str4, str3);
        this.r0 = e50Var2;
        e50Var2.s0 = new g(this, 20);
        e50Var2.setOnDismissListener(new a30(this, 3));
        AndroidUtilities.runOnUIThread(new w20(this, 7), !z12 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
        d2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.a1.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new aa(this, d2Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j3, int i10) {
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
                k1().k(0L, 30, user, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext());
            int i12 = org.telegram.ui.ActionBar.j6.pg;
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.a;
            d2Var.I = i12;
            TextView textView2 = new TextView(getContext());
            int i13 = org.telegram.ui.ActionBar.j6.hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder2.n(frameLayout);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            g9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            g9Var.j(this.currentAccount, user);
            boolean z10 = user instanceof TLRPC.User;
            if (z10) {
                TLRPC.User user2 = (TLRPC.User) user;
                w9Var.e(user2, g9Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                w9Var.e(chat, g9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
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
                org.telegram.messenger.em.p(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                org.telegram.messenger.em.p(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    org.telegram.messenger.em.p(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    org.telegram.messenger.em.p(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(textView3, w7.a6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupUserRemove), new org.telegram.ui.Components.km(27, this, user));
            } else if (z10) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupAdd), new bi.bb(this, (TLRPC.User) user, j3, 4));
            }
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
            d2Var.show();
            if (i10 != 2 || (textView = (TextView) d2Var.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vg, false));
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
            this.i0.p0(new eo(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.i0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if ((p2Var instanceof eo) && ((eo) p2Var).a() == j3) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j3 > 0) {
                bundle2.putLong("user_id", j3);
            } else {
                bundle2.putLong("chat_id", -j3);
            }
            this.i0.p0(new eo(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            J1(2, true);
            return;
        }
        int i14 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.e50 e50Var = this.h2;
            if (e50Var == null || !e50Var.h()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.e50 e50Var2 = new org.telegram.ui.Components.e50(0, true, true);
                this.h2 = e50Var2;
                e50Var2.H = true;
                e50Var2.R = true;
                e50Var2.G = true;
                e50Var2.J = true;
                e50Var2.S = true;
                e50Var2.a = this.i0.O().getLastFragment();
                org.telegram.ui.Components.e50 e50Var3 = this.h2;
                q50 q50Var = new q50(this, j3);
                this.i2 = q50Var;
                e50Var3.b = q50Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                e50Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new w20(this, i14), new bi.k1(i11), 0);
                return;
            }
            return;
        }
        if (i10 != 10) {
            if (i10 != 11) {
                if (i10 == 5) {
                    sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                    k1().m(0L, user, 35);
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
                k1().k(0L, i10 == 1 ? 31 : 36, user, null, null, null);
                return;
            }
            Context context = getContext();
            int i15 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.d5.a;
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
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder3.a;
            d2Var2.R = string;
            LinearLayout f10 = org.telegram.messenger.em.f(context, 1);
            EditText editText2 = new EditText(context);
            int i16 = org.telegram.ui.ActionBar.j6.hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(LocaleController.isRTL ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j3 > 0 ? 5 : 6);
            editText2.setHint(LocaleController.getString(j3 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
            editText2.setBackground(org.telegram.ui.ActionBar.j6.S(context));
            editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText2.requestFocus();
            if (j3 > 0) {
                editText = new EditText(context);
                editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(LocaleController.isRTL ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(LocaleController.getString(R.string.LastName));
                editText.setBackground(org.telegram.ui.ActionBar.j6.S(context));
                editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            } else {
                editText = null;
            }
            AndroidUtilities.showKeyboard(editText2);
            f10.addView(editText2, w7.a6.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                f10.addView(editText, w7.a6.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str2);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder3.n(f10);
            org.telegram.ui.ActionBar.c2 x1Var = new di.x1(editText2, j3, i15, editText);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), x1Var);
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            d2Var2.N = new di.h0(6, editText2, editText);
            d2Var2.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
            d2Var2.show();
            d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            xd xdVar = new xd(1, d2Var2, x1Var);
            if (editText != null) {
                editText.setOnEditorActionListener(xdVar);
                return;
            } else {
                editText2.setOnEditorActionListener(xdVar);
                return;
            }
        }
        String str5 = groupCallParticipant.about;
        Context context2 = getContext();
        int i17 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.d5.a;
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j3 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
        final org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.a;
        d2Var3.R = string2;
        d2Var3.T = LocaleController.getString(j3 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
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
                int i18 = org.telegram.ui.ActionBar.j6.hg;
                editText3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                editText3.setHint(LocaleController.getString(j3 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
                editText3.setTextSize(1, 16.0f);
                editText3.setBackground(org.telegram.ui.ActionBar.j6.S(context2));
                editText3.setMaxLines(4);
                editText3.setRawInputType(147457);
                editText3.setImeOptions(6);
                int i19 = j3 <= 0 ? 70 : 255;
                editText3.setFilters(new InputFilter[]{new org.telegram.ui.Components.n3(i19, context2, numberTextView)});
                numberTextView.setCenterAlign(true);
                numberTextView.setTextSize(15);
                numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
                numberTextView.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView, w7.a6.d(20, 20.0f, !LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                editText3.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
                editText3.addTextChangedListener(new org.telegram.ui.Components.pq(i19, numberTextView));
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                editText3.setText(str5);
                editText3.setSelection(editText3.getText().toString().length());
                AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder;
                alertDialog$Builder5.n(frameLayout2);
                final j2.c cVar = new j2.c(j3, i17, editText3, 4);
                alertDialog$Builder5.k(LocaleController.getString(R.string.Save), cVar);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                d2Var3.N = new org.telegram.ui.Components.r1(editText3, 1);
                frameLayout2.addView(editText3, w7.a6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                editText3.requestFocus();
                AndroidUtilities.showKeyboard(editText3);
                editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.u1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                        if (i20 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var3;
                            if (d2Var4.isShowing()) {
                                cVar.f(d2Var4, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                d2Var3.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
                d2Var3.show();
                d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            }
        } else {
            alertDialog$Builder = alertDialog$Builder4;
        }
        f7 = 8.0f;
        NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText32 = new EditText(context2);
        int i182 = org.telegram.ui.ActionBar.j6.hg;
        editText32.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i182, false));
        editText32.setHint(LocaleController.getString(j3 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        editText32.setTextSize(1, 16.0f);
        editText32.setBackground(org.telegram.ui.ActionBar.j6.S(context2));
        editText32.setMaxLines(4);
        editText32.setRawInputType(147457);
        editText32.setImeOptions(6);
        if (j3 <= 0) {
        }
        editText32.setFilters(new InputFilter[]{new org.telegram.ui.Components.n3(i19, context2, numberTextView2)});
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        numberTextView2.setImportantForAccessibility(2);
        frameLayout2.addView(numberTextView2, w7.a6.d(20, 20.0f, !LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
        editText32.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
        editText32.addTextChangedListener(new org.telegram.ui.Components.pq(i19, numberTextView2));
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView2, false, 0.0f, false);
        editText32.setText(str5);
        editText32.setSelection(editText32.getText().toString().length());
        AlertDialog$Builder alertDialog$Builder52 = alertDialog$Builder;
        alertDialog$Builder52.n(frameLayout2);
        final j2.c cVar2 = new j2.c(j3, i17, editText32, 4);
        alertDialog$Builder52.k(LocaleController.getString(R.string.Save), cVar2);
        alertDialog$Builder52.h(LocaleController.getString(R.string.Cancel), null);
        d2Var3.N = new org.telegram.ui.Components.r1(editText32, 1);
        frameLayout2.addView(editText32, w7.a6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText32.requestFocus();
        AndroidUtilities.showKeyboard(editText32);
        editText32.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.u1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                if (i20 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                    org.telegram.ui.ActionBar.d2 d2Var4 = d2Var3;
                    if (d2Var4.isShowing()) {
                        cVar2.f(d2Var4, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        d2Var3.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
        d2Var3.show();
        d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i182, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(boolean z10, org.telegram.ui.Cells.d4 d4Var) {
        float f7;
        float f10;
        final float f11;
        int measuredHeight;
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.b3;
        d40 d40Var = this.b;
        p50 p50Var = this.Q;
        if (z11) {
            f11 = (p50Var.getX() + (d4Var.getX() + d4Var.getAvatarImageView().getX())) - paddingLeft;
            f10 = (p50Var.getY() + (d4Var.getY() + d4Var.getAvatarImageView().getY())) - paddingTop;
            f7 = d4Var.getAvatarImageView().getMeasuredHeight() / p50Var.getMeasuredWidth();
            measuredHeight = (int) ((d4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f7);
        } else {
            if (this.Z2 == null) {
                this.O2 = true;
            } else {
                this.O2 = z10 || d40Var.D0.k(d40Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.Y2;
            b40 b40Var = this.a2;
            if (lVar == null || !this.O2) {
                org.telegram.ui.Components.a30 a30Var = this.a3;
                if (a30Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.Z2;
                    x30 x30Var = this.m2;
                    if (tVar3 == null) {
                        float x10 = (b40Var.getX() + (x30Var.getX() + (this.a3.getX() + a30Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y3 = (b40Var.getY() + (x30Var.getY() + (this.a3.getY() + this.a3.getAvatarImageView().getY()))) - paddingTop;
                        f7 = this.a3.getAvatarImageView().getMeasuredHeight() / p50Var.getMeasuredWidth();
                        measuredHeight = (int) ((this.a3.getAvatarImageView().getMeasuredHeight() >> 1) / f7);
                        f10 = y3;
                        f11 = x10;
                        if (!this.O2 && (tVar = this.Z2) != null) {
                            tVar.invalidate();
                            b40Var.invalidate();
                            org.telegram.ui.Components.voip.t tVar4 = this.Z2;
                            tVar4.h = false;
                            tVar4.j(false);
                            this.Z2 = null;
                        }
                    } else if (this.O2) {
                        f11 = (b40Var.getX() + (x30Var.getX() + a30Var.getX())) - paddingLeft;
                        f10 = (b40Var.getY() + (x30Var.getY() + this.a3.getY())) - paddingTop;
                    }
                }
                f7 = 0.96f;
                f10 = 0.0f;
                f11 = 0.0f;
                measuredHeight = 0;
                if (!this.O2) {
                    tVar.invalidate();
                    b40Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar42 = this.Z2;
                    tVar42.h = false;
                    tVar42.j(false);
                    this.Z2 = null;
                }
            } else {
                float x11 = (p50Var.getX() + lVar.getX()) - paddingLeft;
                f10 = ((p50Var.getY() + this.Y2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                f11 = x11;
            }
            f7 = 1.0f;
            measuredHeight = 0;
            if (!this.O2) {
            }
        }
        final float f12 = f10;
        final float f13 = f7;
        c40 c40Var = this.D2;
        if (z10) {
            e40 e40Var = this.C2;
            e40Var.setScaleX(f13);
            e40Var.setScaleY(f13);
            e40Var.setTranslationX(f11);
            e40Var.setTranslationY(f12);
            c40Var.setAlpha(0.0f);
        }
        d40Var.N(measuredHeight, measuredHeight);
        if (this.g2) {
            g40 g40Var = this.b2;
            if (z10) {
                g40Var.setAlpha(0.0f);
            }
            g40Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        }
        c40Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        if (!z10 && (tVar2 = this.Z2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (d40Var.D0.k(d40Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.Z2.a;
                oVar.E = false;
                oVar.F = 0L;
                this.Y2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i10 = measuredHeight;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.d30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j60.p(j60.this, f13, f11, f12, i10, valueAnimator);
            }
        });
        this.d3 = this.d.getNotificationCenter().setAnimationInProgress(this.d3, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar5 = this.Y2 != null ? this.Z2 : null;
        if (tVar5 != null) {
            tVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, tVar5, z10, 7));
        if (this.b3 || this.Z2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.wr.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.wr.f);
            ofFloat.setDuration(220L);
            this.Z2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.o oVar2 = this.Z2.a;
            if (oVar2.E) {
                oVar2.G.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        S0();
    }

    public final void z1() {
        x5 x5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(x5Var);
        if (!this.z2 || this.U0 == null || VoIPService.getSharedInstance() == null || !r1() || this.Q == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(x5Var, 30L);
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
