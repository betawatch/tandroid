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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, xd.b {
    public static c60 A3;
    public static boolean B3;
    public static boolean C3;
    public static boolean D3;
    public static volatile DispatchQueue E3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean F3;
    public final ArrayList A0;
    public p20 A1;
    public final w30 A2;
    public final Paint B;
    public final ArrayList B0;
    public org.telegram.ui.Components.t30 B1;
    public LinearLayout B2;
    public final g40 C;
    public final ArrayList C0;
    public int C1;
    public boolean C2;
    public final f40 D;
    public final ArrayList D0;
    public boolean D1;
    public final org.telegram.ui.Components.gj0 D2;
    public final d40 E;
    public final ArrayList E0;
    public boolean E1;
    public int E2;
    public final ImageView F;
    public int F0;
    public final Paint F1;
    public boolean F2;
    public final ImageView G;
    public final org.telegram.ui.Components.gj0 G0;
    public final Paint G1;
    public final View G2;
    public org.telegram.ui.Components.pk0 H;
    public final org.telegram.ui.Components.gj0 H0;
    public final b60[] H1;
    public final View H2;
    public final h50 I;
    public boolean I0;
    public float I1;
    public GradientDrawable I2;
    public final org.telegram.ui.Components.k6 J;
    public final org.telegram.ui.Components.u9 J0;
    public b60 J1;
    public final int[] J2;
    public final o30 K;
    public final org.telegram.ui.Components.u9 K0;
    public b60 K1;
    public final s30 K2;
    public final z40 L;
    public float L0;
    public long L1;
    public boolean L2;
    public final w50 M;
    public float M0;
    public float M1;
    public boolean M2;
    public final j50 N;
    public float N0;
    public float N1;
    public RenderNode N2;
    public final m40 O;
    public RadialGradient O0;
    public boolean O1;
    public float O2;
    public final TextView P;
    public final Matrix P0;
    public boolean P1;
    public boolean P2;
    public final k40 Q;
    public final Paint Q0;
    public int Q1;
    public final String[] Q2;
    public final org.telegram.ui.ActionBar.k5 R;
    public final r50 R0;
    public float R1;
    public ObjectAnimator R2;
    public final i50 S;
    public float S0;
    public int S1;
    public ObjectAnimator S2;
    public final org.telegram.ui.ActionBar.k5 T;
    public float T0;
    public boolean T1;
    public final s40 T2;
    public final q50 U;
    public ValueAnimator U0;
    public final int[] U1;
    public org.telegram.ui.Cells.e4 U2;
    public final org.telegram.ui.Components.oz V;
    public TLRPC.InputPeer V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.l V2;
    public final ImageReceiver W;
    public TLRPC.Chat W0;
    public final ArrayList W1;
    public org.telegram.ui.Components.voip.t W2;
    public int X;
    public ChatObject.Call X0;
    public final v30 X1;
    public org.telegram.ui.Components.s20 X2;
    public final ImageView Y;
    public final boolean Y0;
    public final a40 Y1;
    public boolean Y2;
    public final yg.h Z;
    public final String Z0;
    public final n40 Z1;
    public boolean Z2;
    public final int a0;
    public final x50 a1;
    public float a2;
    public int a3;
    public final x30 b;
    public final RadialProgressView b0;
    public final n30 b1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b2;
    public AnimatorSet b3;
    public final c30 c;
    public final Drawable c0;
    public final p30 c1;
    public boolean c2;
    public d50 c3;
    public final AccountInstance d;
    public final View d0;
    public final Paint d1;
    public boolean d2;
    public int d3;
    public final i30 e;
    public AnimatorSet e0;
    public ValueAnimator e1;
    public org.telegram.ui.Components.w40 e2;
    public int e3;
    public final org.telegram.ui.Components.voip.v2 f;
    public LaunchActivity f0;
    public float f1;
    public k50 f2;
    public int f3;
    public final UndoView[] g0;
    public final LinearLayout g1;
    public Boolean g2;
    public int g3;
    public final org.telegram.ui.Components.voip.v2 h;
    public final org.telegram.ui.Cells.k h0;
    public final org.telegram.ui.ActionBar.w0 h1;
    public int h2;
    public int h3;
    public boolean i0;
    public final org.telegram.ui.ActionBar.w0 i1;
    public boolean i2;
    public int i3;
    public org.telegram.ui.Components.k40 j0;
    public final org.telegram.ui.ActionBar.w0 j1;
    public final r30 j2;
    public int j3;
    public org.telegram.ui.Components.k40 k0;
    public final org.telegram.ui.ActionBar.g1 k1;
    public final org.telegram.ui.Components.sl0 k2;
    public int k3;
    public int l0;
    public final org.telegram.ui.ActionBar.g1 l1;
    public final i60 l2;
    public int l3;
    public n50 m0;
    public final org.telegram.ui.ActionBar.g1 m1;
    public final org.telegram.ui.Components.t20 m2;
    public int m3;
    public final org.telegram.ui.Components.voip.v2 n;
    public final ArrayList n0;
    public final org.telegram.ui.ActionBar.g1 n1;
    public ViewTreeObserver.OnPreDrawListener n2;
    public int n3;
    public y40 o0;
    public final org.telegram.ui.ActionBar.g1 o1;
    public final org.telegram.ui.Components.voip.h o2;
    public int o3;
    public boolean p0;
    public final org.telegram.ui.ActionBar.g1 p1;
    public boolean p2;
    public int p3;
    public long q0;
    public final org.telegram.ui.ActionBar.g1 q1;
    public final ArrayList q2;
    public int q3;
    public final org.telegram.ui.Components.voip.v2 r;
    public boolean r0;
    public final org.telegram.ui.ActionBar.g1 r1;
    public boolean r2;
    public int r3;
    public final org.telegram.ui.Components.voip.v2 s;
    public final RectF s0;
    public final org.telegram.ui.ActionBar.g1 s1;
    public final p20 s2;
    public int s3;
    public boolean t0;
    public final org.telegram.ui.ActionBar.g1 t1;
    public final m30 t2;
    public final e50 t3;
    public boolean u0;
    public final org.telegram.ui.ActionBar.g1 u1;
    public final org.telegram.ui.Components.mc u2;
    public Boolean u3;
    public final org.telegram.ui.Components.voip.v2 v;
    public float v0;
    public final org.telegram.ui.ActionBar.g1 v1;
    public final p20 v2;
    public Integer v3;
    public final org.telegram.ui.Components.voip.v2 w;
    public p40 w0;
    public final LinearLayout w1;
    public boolean w2;
    public final xd.a w3;
    public final j30 x;
    public TLRPC.Peer x0;
    public final TextView x1;
    public final z5 x2;
    public final xd.a x3;
    public final ImageView y;
    public TLObject y0;
    public final a60 y1;
    public final LongSparseIntArray y2;
    public final xd.c y3;
    public final Paint z0;
    public final ch.i z1;
    public final y30 z2;
    public final xd.a z3;

    public c60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z4, String str) {
        super(launchActivity, null, true, true);
        String string;
        int i10;
        final c60 c60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.B = new Paint(1);
        this.g0 = new UndoView[2];
        this.n0 = new ArrayList();
        this.s0 = new RectF();
        this.z0 = new Paint(1);
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.z1 = new ch.i(new p20(this, 8));
        int i11 = 0;
        this.C1 = 0;
        this.D1 = false;
        this.F1 = new Paint(7);
        this.G1 = new Paint(7);
        this.H1 = new b60[8];
        this.I1 = 1.0f;
        this.T1 = true;
        this.U1 = new int[4];
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.o2 = new org.telegram.ui.Components.voip.h();
        this.q2 = new ArrayList();
        this.s2 = new p20(this, i11);
        this.t2 = new m30(this);
        this.u2 = new org.telegram.ui.Components.mc(20);
        this.v2 = new p20(this, 1);
        this.w2 = false;
        this.x2 = new z5(this, 6);
        this.y2 = new LongSparseIntArray();
        this.J2 = new int[2];
        this.M2 = true;
        this.Q2 = new String[2];
        this.a3 = -1;
        this.t3 = new e50(this);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
        this.w3 = new xd.a(2, this, nrVar, 350L);
        this.x3 = new xd.a(3, this, nrVar, 220L, true);
        this.y3 = new xd.c(4, this, nrVar, 350L);
        this.z3 = new xd.a(5, this, nrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.X0 = call;
        this.V0 = inputPeer;
        this.W0 = chat;
        this.Z0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.Y0 = z4;
        this.resourcesProvider = new nh.i0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.a0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        D3 = false;
        C3 = false;
        F3 = false;
        setDelegate(new h40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.T2 = new s40(this);
        setOnDismissListener(new s20(this, i11));
        setDimBehindAlpha(75);
        w50 w50Var = new w50(this, launchActivity);
        this.M = w50Var;
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(true);
        int i12 = org.telegram.ui.ActionBar.j6.qg;
        ppVar.b(org.telegram.ui.ActionBar.j6.u0(i12));
        ppVar.d();
        z40 z40Var = new z40(this, launchActivity, ppVar);
        this.L = z40Var;
        z40Var.setSubtitle("");
        z40Var.getSubtitleTextView().setVisibility(0);
        z40Var.l();
        z40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(z40Var.getAdditionalSubtitleTextView(), this.r2, 1.0f, false);
        z40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.u0(i12));
        int i13 = org.telegram.ui.ActionBar.j6.lg;
        z40Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        z40Var.setBackButtonImage(R.drawable.ic_ab_back);
        z40Var.setOccupyStatusBar(false);
        z40Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.j6.hg;
        z40Var.C(org.telegram.ui.ActionBar.j6.u0(i14), false);
        z40Var.B(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.z8), false);
        z40Var.setTitleColor(org.telegram.ui.ActionBar.j6.u0(i14));
        z40Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        z40Var.setActionBarMenuOnItemClick(new g50(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.x0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.x0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.x0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.x0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new m20(this, 3);
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
        this.c0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.voip_filled, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.G0 = gj0Var;
        this.H0 = new org.telegram.ui.Components.gj0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        h50 h50Var = new h50(this, launchActivity);
        this.I = h50Var;
        this.containerView = h50Var;
        h50Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.W = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.R = k5Var;
            k5Var.setGravity(17);
            k5Var.setTextColor(-1);
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.setTextSize(18);
            k5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(k5Var, k7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            i50 i50Var = new i50(this, launchActivity);
            this.S = i50Var;
            i50Var.setGravity(17);
            i50Var.setTextColor(-1);
            i50Var.setTypeface(AndroidUtilities.bold());
            i50Var.setTextSize(60);
            this.containerView.addView(i50Var, k7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.T = k5Var2;
            k5Var2.setGravity(17);
            k5Var2.setTextColor(-1);
            k5Var2.setTypeface(AndroidUtilities.bold());
            k5Var2.setTextSize(18);
            this.containerView.addView(k5Var2, k7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            r50 r50Var = new r50(this, launchActivity);
            this.R0 = r50Var;
            this.containerView.addView(r50Var, k7.b6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        j50 j50Var = new j50(this, launchActivity);
        this.N = j50Var;
        j50Var.setClipToPadding(false);
        j50Var.setClipChildren(false);
        q50 q50Var = new q50(this);
        this.U = q50Var;
        q50Var.o = nrVar;
        q50Var.d = 350L;
        q50Var.c = 350L;
        q50Var.e = 350L;
        q50Var.S();
        j50Var.setItemAnimator(q50Var);
        j50Var.setOnScrollListener(new b30(this));
        j50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(C3 ? 6 : 2, j50Var);
        this.V = ozVar;
        j50Var.setLayoutManager(ozVar);
        c30 c30Var = new c30(this);
        this.c = c30Var;
        ozVar.z1(c30Var);
        j50Var.i(new d30(this));
        ozVar.C1();
        this.containerView.addView(j50Var, k7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        j50Var.setAdapter(w50Var);
        j50Var.setTopBottomSelectorRadius(13);
        j50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.eg));
        j50Var.setOnItemClickListener(new d7(this, launchActivity, call, 14));
        j50Var.setOnItemLongClickListener(new m20(this, 4));
        if (r1()) {
            a60 a60Var = new a60(this, getContext());
            this.y1 = a60Var;
            this.containerView.addView(a60Var, k7.b6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(launchActivity);
        this.k2 = sl0Var;
        this.containerView.addView(sl0Var, k7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        i60 i60Var = new i60(call, this.currentAccount, this);
        this.l2 = i60Var;
        sl0Var.setAdapter(i60Var);
        f2.w wVar = new f2.w(6, false);
        sl0Var.setLayoutManager(wVar);
        wVar.z1(new f30(this));
        final int i16 = 1;
        sl0Var.setOnItemClickListener(new org.telegram.ui.Components.il0(this) { // from class: org.telegram.ui.o20
            public final /* synthetic */ c60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i17, View view) {
                switch (i16) {
                    case 0:
                        c60 c60Var2 = this.b;
                        c60Var2.getClass();
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
                        if (s20Var.getVideoParticipant() != null) {
                            c60Var2.e1(s20Var.getVideoParticipant());
                            break;
                        } else {
                            c60Var2.e1(new ChatObject.VideoParticipant(s20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        c60 c60Var3 = this.b;
                        c60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            c60Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        f2.l lVar = new f2.l();
        lVar.S();
        lVar.o = nrVar;
        lVar.d = 350L;
        lVar.c = 350L;
        lVar.e = 350L;
        sl0Var.setItemAnimator(new g30(this));
        sl0Var.setOnScrollListener(new h30(this));
        i60Var.H(sl0Var, false, false);
        sl0Var.setVisibility(8);
        i30 i30Var = new i30(this, launchActivity);
        this.e = i30Var;
        int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.P0 = new Matrix();
        this.O0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.Q0 = paint;
        paint.setShader(this.O0);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(9);
        this.J0 = u9Var;
        org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(12);
        this.K0 = u9Var2;
        u9Var.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        u9Var.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        u9Var.b();
        u9Var2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        u9Var2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        u9Var2.b();
        int i17 = org.telegram.ui.ActionBar.j6.Ig;
        u9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i17), 38));
        u9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i17), 76));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.r = v2Var;
        v2Var.setCheckable(true);
        v2Var.setTextSize(12);
        i30Var.a(v2Var);
        v2Var.setOnClickListener(new n20(this, 7));
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
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(launchActivity);
        v2Var3.addView(jj0Var, k7.b6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.gj0 gj0Var2 = new org.telegram.ui.Components.gj0(R.raw.camera_flip, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.D2 = gj0Var2;
        jj0Var.setAnimation(gj0Var2);
        v2Var3.setOnClickListener(new n20(this, 10));
        i30Var.a(v2Var3);
        org.telegram.ui.Components.voip.v2 v2Var4 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.h = v2Var4;
        v2Var4.setCheckable(true);
        v2Var4.setTextSize(12);
        v2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.Y = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i18 = R.drawable.filled_sound_on;
        this.X = i18;
        imageView.setImageResource(i18);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        v2Var4.addView(imageView, k7.b6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        v2Var4.setOnClickListener(new n20(this, 11));
        i30Var.a(v2Var4);
        i30Var.a(v2Var2);
        org.telegram.ui.Components.voip.v2 v2Var5 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.s = v2Var5;
        v2Var5.setTextSize(12);
        v2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i19 = 1;
        v2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r20
            public final /* synthetic */ c60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        c60.o(this.b, launchActivity);
                        break;
                    default:
                        c60 c60Var2 = this.b;
                        c60Var2.X1.e();
                        ChatObject.Call call2 = c60Var2.X0;
                        if (call2 != null && !call2.isScheduled()) {
                            c60Var2.I1();
                            c60.t1(launchActivity, new p20(c60Var2, 5), false, false);
                            break;
                        } else {
                            c60Var2.dismiss();
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
        j30 j30Var = new j30(this, launchActivity);
        this.x = j30Var;
        j30Var.setAnimation(gj0Var);
        j30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.v2 v2Var7 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.w = v2Var7;
        v2Var7.setDrawBackground(false);
        v2Var7.setTextSize(12);
        v2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        v2Var7.addView(j30Var, k7.b6.e(50, 50, 49));
        i30Var.a(v2Var7);
        v2Var7.setOnClickListener(new l30(this));
        i30Var.a(v2Var6);
        i30Var.a(v2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        v2Var7.addView(imageView2, k7.b6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.X0 != null && r1() && !this.X0.isScheduled()) {
            imageView2.setVisibility(0);
            j30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.b0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Og));
        z40Var.setAlpha(0.0f);
        z40Var.getBackButton().setScaleX(0.9f);
        z40Var.getBackButton().setScaleY(0.9f);
        z40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        z40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        z40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        z40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int u03 = org.telegram.ui.ActionBar.j6.u0(i14);
        int i20 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, u03);
        this.h1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new m20(this, i20));
        int i21 = org.telegram.ui.ActionBar.j6.ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i21), 6));
        w0Var.setOnClickListener(new n20(this, i20));
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i14), false);
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i14), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i14));
        this.i1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i21), 6));
        w0Var2.setOnClickListener(new n20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i14));
        this.j1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i21), 6));
        w0Var3.setOnClickListener(new n20(this, 2));
        n30 n30Var = new n30(this, launchActivity, launchActivity);
        this.b1 = n30Var;
        o30 o30Var = new o30(launchActivity);
        this.K = o30Var;
        o30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.d1 = paint2;
        paint2.setColor(-12761513);
        p30 p30Var = new p30(this, getContext());
        this.c1 = p30Var;
        p30Var.setTextColor(getThemedColor(i14));
        p30Var.setTextSize(1, 11.0f);
        p30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        p30Var.setMaxLines(1);
        p30Var.setGravity(17);
        p30Var.setTypeface(AndroidUtilities.bold());
        p30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        p30Var.setTag(-1);
        if (!r1()) {
            p30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.g1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(n30Var, k7.b6.l(1.0f, 0, -2));
        linearLayout.addView(p30Var, k7.b6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(o30Var, k7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, k7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(z40Var, k7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.w1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, k7.b6.n(48, 48));
        linearLayout2.addView(w0Var2, k7.b6.n(48, 48));
        linearLayout2.addView(w0Var, k7.b6.n(48, 48));
        this.containerView.addView(linearLayout2, k7.b6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.d0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.V5));
        this.containerView.addView(view, k7.b6.c(1.0f, -1));
        for (int i22 = 0; i22 < 2; i22++) {
            this.g0[i22] = new q30(this, launchActivity);
            this.g0[i22].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.g0[i22].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.g0[i22], k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.h0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.h1.h(kVar, AndroidUtilities.dp(48.0f));
        this.h1.setShowSubmenuByMove(false);
        int i23 = org.telegram.ui.ActionBar.j6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.u0(i23), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.h1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.j0);
        this.r1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.h1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.j0);
        this.s1 = d10;
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
        org.telegram.ui.ActionBar.w0 w0Var6 = this.h1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.j0);
        this.m1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.h1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.j0);
        this.n1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.h1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.gg), -16777216));
        this.x1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.h1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.a1, LocaleController.getString(ChatObject.isChannelOrGiga(this.W0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.j0);
        this.l1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.h1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.a1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.j0);
        this.o1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.h1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.k1 = e;
        x50 x50Var = new x50();
        this.a1 = x50Var;
        org.telegram.ui.ActionBar.g1 e6 = this.h1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.q1 = e6;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.h1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, x50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.j0);
        this.p1 = d15;
        x50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e10 = this.h1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.u1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e11 = this.h1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.v1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.h1;
        int i26 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i25;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.W0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i25;
        }
        org.telegram.ui.ActionBar.g1 e12 = w0Var11.e(4, i26, string);
        this.t1 = e12;
        this.h1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.u0(i23));
        this.h1.getPopupLayout().setFitItems(true);
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
        e6.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        if (this.X0 != null) {
            l1();
        }
        if (o1()) {
            this.m0 = new n50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.m0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.L.getTitleTextView().setOnClickListener(new n20(this, 3));
        r30 r30Var = new r30(this, launchActivity);
        this.j2 = r30Var;
        s30 s30Var = new s30(this);
        this.K2 = s30Var;
        final int i28 = 0;
        r30Var.setClipToPadding(false);
        s30Var.S();
        s30Var.o = org.telegram.ui.Components.nr.f;
        s30Var.d = 350L;
        s30Var.c = 350L;
        s30Var.e = 350L;
        r30Var.setItemAnimator(s30Var);
        r30Var.setOnScrollListener(new t30(this));
        r30Var.setClipChildren(false);
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        r30Var.setLayoutManager(i0Var);
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(call, this.currentAccount, this);
        this.m2 = t20Var;
        r30Var.setAdapter(t20Var);
        t20Var.F(r30Var, false);
        r30Var.setOnItemClickListener(new org.telegram.ui.Components.il0(this) { // from class: org.telegram.ui.o20
            public final /* synthetic */ c60 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i172, View view2) {
                switch (i28) {
                    case 0:
                        c60 c60Var2 = this.b;
                        c60Var2.getClass();
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view2;
                        if (s20Var.getVideoParticipant() != null) {
                            c60Var2.e1(s20Var.getVideoParticipant());
                            break;
                        } else {
                            c60Var2.e1(new ChatObject.VideoParticipant(s20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        c60 c60Var3 = this.b;
                        c60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            c60Var3.e1(lVar2.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        r30Var.setOnItemLongClickListener(new m20(this, 1));
        r30Var.setVisibility(8);
        r30Var.i(new u30());
        int i29 = 4;
        v30 v30Var = new v30(this, launchActivity, this.N, r30Var, this.V1, this.X0, this);
        this.X1 = v30Var;
        v30Var.setClipChildren(false);
        t20Var.E(this.V1, v30Var);
        if (this.k2 != null) {
            this.l2.G(this.V1, v30Var);
        }
        w30 w30Var = new w30(this, launchActivity);
        this.A2 = w30Var;
        x30 x30Var = new x30(this, launchActivity, this.L, this.N, w30Var);
        this.b = x30Var;
        x30Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        x30Var.setInvalidateWithParent(true);
        w30Var.setProfileGalleryView(x30Var);
        y30 y30Var = new y30(this, launchActivity);
        this.z2 = y30Var;
        y30Var.setVisibility(8);
        x30Var.setVisibility(0);
        x30Var.b(new z30(this));
        a40 a40Var = new a40(this, launchActivity);
        this.Y1 = a40Var;
        this.containerView.addView(v30Var);
        v30Var.addView(r30Var, k7.b6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.G2 = view2;
        int[] iArr = this.J2;
        iArr[0] = this.S1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.J2);
        this.I2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, k7.b6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.H2 = view3;
        view3.setBackgroundColor(this.J2[0]);
        this.containerView.addView(view3, k7.b6.e(-1, 0, 83));
        yg.h hVar = new yg.h(launchActivity);
        this.Z = hVar;
        hVar.setDelegate(new b40(this));
        hVar.setClickCellDelegate(new c40(this));
        if (this.X0 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.X0.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(launchActivity, false, true, true);
        this.J = k6Var;
        k6Var.setGravity(17);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(-1);
        k6Var.b(0.4f, 320L, org.telegram.ui.Components.nr.h);
        k6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        d40 d40Var = new d40(this, launchActivity, this.I, LaunchActivity.R(), this.resourcesProvider);
        this.E = d40Var;
        d40Var.G = true;
        d40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.a0)});
        d40Var.getEditText().setLinkTextColor(-11683585);
        d40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        d40Var.getEditText().addTextChangedListener(new e40(this));
        d40Var.s();
        f40 f40Var = new f40(this, launchActivity);
        this.D = f40Var;
        this.containerView.addView(f40Var, k7.b6.c(-1.0f, -1));
        g40 g40Var = new g40(launchActivity);
        this.C = g40Var;
        g40Var.addView(d40Var, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        g40Var.addView(k6Var, k7.b6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        k6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(g40Var, k7.b6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.G = imageView3;
        int i30 = org.telegram.ui.ActionBar.j6.i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i30), 1, -1));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new n20(this, i29));
        ImageView imageView4 = new ImageView(launchActivity);
        this.F = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i30), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new n20(this, 5));
        g40Var.addView(imageView3, k7.b6.e(48, 48, 85));
        g40Var.addView(imageView4, k7.b6.e(48, 48, 85));
        this.containerView.addView(a40Var);
        y30Var.addView(x30Var, k7.b6.c(-1.0f, -1));
        y30Var.addView(w30Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(y30Var, k7.b6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.M.l();
        if (D3) {
            this.l2.I(this.k2, false);
        }
        this.F0 = this.M.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.P = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.W0) && (chat2 = this.W0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, k7.b6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0(launchActivity);
            wc0Var.setTextColor(-1);
            wc0Var.setSelectorColor(-9598483);
            wc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            wc0Var.setItemCount(5);
            i40 i40Var = new i40(launchActivity);
            i40Var.setItemCount(5);
            i40Var.setTextColor(-1);
            i40Var.setSelectorColor(-9598483);
            i40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            j40 j40Var = new j40(launchActivity);
            j40Var.setItemCount(5);
            j40Var.setTextColor(-1);
            j40Var.setSelectorColor(-9598483);
            j40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            k40 k40Var = new k40(launchActivity);
            this.Q = k40Var;
            k40Var.setLines(1);
            k40Var.setSingleLine(true);
            k40Var.setEllipsize(TextUtils.TruncateAt.END);
            k40Var.setGravity(17);
            k40Var.setTextColor(-1);
            k40Var.setTypeface(AndroidUtilities.bold());
            k40Var.setTextSize(1, 14.0f);
            this.containerView.addView(k40Var, k7.b6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            k40Var.setOnClickListener(new org.telegram.messenger.video.f(this, wc0Var, i40Var, j40Var, chat, accountInstance, inputPeer2, 1));
            m40 m40Var = new m40(launchActivity, wc0Var, i40Var, j40Var);
            this.O = m40Var;
            m40Var.setWeightSum(1.0f);
            m40Var.setOrientation(0);
            this.containerView.addView(m40Var, k7.b6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i31 = calendar.get(1);
            int i32 = calendar.get(6);
            m40Var.addView(wc0Var, k7.b6.l(0.5f, 0, 270));
            wc0Var.setMinValue(0);
            wc0Var.setMaxValue(365);
            wc0Var.setWrapSelectorWheel(false);
            wc0Var.setFormatter(new gg.c(currentTimeMillis, calendar, i31, 1));
            a1.d dVar = new a1.d(this, wc0Var, i40Var, j40Var, 12);
            c60Var = this;
            wc0Var.setOnValueChangedListener(dVar);
            i40Var.setMinValue(0);
            i40Var.setMaxValue(23);
            m40Var.addView(i40Var, k7.b6.l(0.2f, 0, 270));
            i40Var.setFormatter(new org.telegram.ui.Components.kh0(22));
            i40Var.setOnValueChangedListener(dVar);
            j40Var.setMinValue(0);
            j40Var.setMaxValue(59);
            j40Var.setValue(0);
            j40Var.setFormatter(new org.telegram.ui.Components.kh0(23));
            m40Var.addView(j40Var, k7.b6.l(0.3f, 0, 270));
            j40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i33 = calendar.get(6);
            int i34 = calendar.get(12);
            int i35 = calendar.get(11);
            wc0Var.setValue(i32 != i33 ? 1 : 0);
            j40Var.setValue(i34);
            i40Var.setValue(i35);
            org.telegram.ui.Components.z4.g(k40Var, textView, 0L, 604800L, 2, wc0Var, i40Var, j40Var);
        } else {
            c60Var = this;
        }
        n40 n40Var = new n40(c60Var, (ViewGroup) c60Var.getWindow().getDecorView(), c60Var.containerView);
        c60Var.Z1 = n40Var;
        n40Var.E = new o40(c60Var);
        x30Var.setPinchToZoomHelper(n40Var);
        final int i36 = 0;
        c60Var.n.setOnClickListener(new View.OnClickListener(c60Var) { // from class: org.telegram.ui.r20
            public final /* synthetic */ c60 b;

            {
                this.b = c60Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i36) {
                    case 0:
                        c60.o(this.b, launchActivity);
                        break;
                    default:
                        c60 c60Var2 = this.b;
                        c60Var2.X1.e();
                        ChatObject.Call call2 = c60Var2.X0;
                        if (call2 != null && !call2.isScheduled()) {
                            c60Var2.I1();
                            c60.t1(launchActivity, new p20(c60Var2, 5), false, false);
                            break;
                        } else {
                            c60Var2.dismiss();
                            break;
                        }
                }
            }
        });
        c60Var.L1(false);
        c60Var.I1();
        c60Var.M1(false);
        c60Var.N1(false, false);
        c60Var.B1(0.0f);
        c60Var.O1();
        c60Var.containerView.addView(new FrameLayout(launchActivity), k7.b6.e(-1, 200, 87));
        c60Var.v.setOnClickListener(new n20(c60Var, 6));
        c60Var.T0();
        k7.d6.a(c60Var.n);
        k7.d6.a(c60Var.r);
        k7.d6.a(c60Var.f);
        k7.d6.a(c60Var.h);
        k7.d6.a(c60Var.w);
        k7.d6.a(c60Var.s);
        k7.d6.a(c60Var.v);
        r0.j0.m(c60Var.containerView, new m20(c60Var, 2));
    }

    public static r0.m1 A(c60 c60Var, r0.m1 m1Var) {
        r0.j1 j1Var = m1Var.a;
        i0.b f10 = j1Var.f(647);
        i0.b f11 = j1Var.f(8);
        d40 d40Var = c60Var.E;
        int max = Math.max(f11.d, (d40Var.K || d40Var.e) ? d40Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = c60Var.Y1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (d40Var.getEmojiView() != null) {
            d40Var.getEmojiView().setBottomInset(f10.d);
        }
        if (c60Var.P2) {
            ViewGroup viewGroup = c60Var.containerView;
            int i10 = c60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = c60Var.containerView;
            int i11 = c60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f10.a + i11, f10.b, i11 + f10.c, f10.d);
        }
        c60Var.containerView.requestLayout();
        if (max == 0 && !d40Var.K && !d40Var.e && !d40Var.L) {
            d40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.pk0 pk0Var = c60Var.H;
            if (pk0Var == null) {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                pk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.pk0 pk0Var2 = new org.telegram.ui.Components.pk0(1, c60Var.currentAccount, c60Var.getContext(), R, c60Var.resourcesProvider);
                    c60Var.H = pk0Var2;
                    pk0Var2.setDelegate(new f50(c60Var));
                    c60Var.containerView.addView(c60Var.H, k7.b6.e(-2, 52, 81));
                    c60Var.H.p(null, null, false);
                    c60Var.D.bringToFront();
                    c60Var.C.bringToFront();
                    pk0Var = c60Var.H;
                }
            }
            c60Var.H = pk0Var;
        }
        d40Var.G(f11.d, false);
        c60Var.z1.i(m1Var);
        return r0.m1.b;
    }

    public static String A0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void B(c60 c60Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        d2Var.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.qc(c60Var.topBulletinContainer, new nh.i0()).d0(tL_error, false);
                return;
            }
            return;
        }
        Context context = c60Var.getContext();
        int i10 = c60Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.f6 f6Var = c60Var.resourcesProvider;
        ChatObject.Call call = c60Var.X0;
        l9.o0(context, i10, inputGroupCall, str, f6Var, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public static void B0(c60 c60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (c60Var.k0 == null) {
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(c60Var.getContext(), 8);
            c60Var.k0 = k40Var;
            k40Var.setAlpha(0.0f);
            c60Var.k0.setVisibility(4);
            c60Var.k0.setShowingDuration(4000L);
            c60Var.containerView.addView(c60Var.k0, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            c60Var.k0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            c60Var.k0.d();
        }
        c60Var.k0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        c60Var.k0.f(c60Var.w, true);
    }

    public static /* synthetic */ void C(c60 c60Var, int[] iArr, float[] fArr) {
        f2.l1 K;
        r30 r30Var = c60Var.j2;
        v30 v30Var = c60Var.X1;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = c60Var.X0.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (v30Var.b) {
                    for (int i11 = 0; i11 < r30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(s20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            s20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (c60Var.p0 ? c60Var.A0 : c60Var.X0.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = c60Var.N.K(indexOf + c60Var.M.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == c60Var.U2 && !c60Var.i2) {
                                c60Var.containerView.invalidate();
                            }
                        }
                    }
                }
                v30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void D(c60 c60Var) {
        Editable text = c60Var.E.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(c60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        c60Var.A1(tL_textWithEntities);
    }

    public static void F0(c60 c60Var) {
        ChatObject.Call call = c60Var.X0;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = c60Var.X0.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(c60Var.X0.call.join_muted);
        ConnectionsManager connectionsManager = c60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new y20(c60Var, 1));
    }

    public static void G0(c60 c60Var, boolean z4) {
        if (c60Var.X0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = c60Var.X0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z4);
        c60Var.u3 = Boolean.valueOf(z4);
        c60Var.H1(true);
        ConnectionsManager connectionsManager = c60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new y20(c60Var, 0));
    }

    public static void H0(c60 c60Var) {
        int i10;
        if (!c60Var.r1()) {
            c60Var.isFullscreen = false;
            return;
        }
        v30 v30Var = c60Var.X1;
        boolean z4 = (!v30Var.S && v30Var.b && (C3 == c60Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = c60Var.g2;
        if (bool == null || z4 != bool.booleanValue()) {
            int systemUiVisibility = c60Var.containerView.getSystemUiVisibility();
            if (z4) {
                i10 = systemUiVisibility & (-7);
                c60Var.getWindow().clearFlags(1024);
                c60Var.setHideSystemVerticalInsets(false);
            } else {
                c60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                c60Var.getWindow().addFlags(1024);
            }
            c60Var.containerView.setSystemUiVisibility(i10);
            c60Var.g2 = Boolean.valueOf(z4);
            c60Var.P2 = !z4;
            c60Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l I0(c60 c60Var) {
        j50 j50Var = c60Var.N;
        for (int i10 = 0; i10 < j50Var.getChildCount(); i10++) {
            View childAt = j50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(c60 c60Var) {
        z40 z40Var = c60Var.L;
        j50 j50Var = c60Var.N;
        int childCount = j50Var.getChildCount();
        float f10 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(j50Var.getChildAt(i10)) >= 0) {
                f10 = Math.min(f10, r8.getTop());
            }
        }
        if (f10 < 0.0f || f10 == 2.14748365E9f) {
            f10 = childCount != 0 ? 0.0f : j50Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z4 = f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f10 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z4 && z40Var.getTag() == null) || (!z4 && z40Var.getTag() != null)) {
            z40Var.setTag(z4 ? 1 : null);
            AnimatorSet animatorSet = c60Var.e0;
            if (animatorSet != null) {
                animatorSet.cancel();
                c60Var.e0 = null;
            }
            c60Var.setUseLightStatusBar(z40Var.getTag() == null);
            ViewPropertyAnimator duration = z40Var.getBackButton().animate().scaleX(z4 ? 1.0f : 0.9f).scaleY(z4 ? 1.0f : 0.9f).translationX(z4 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
            duration.setInterpolator(nrVar).start();
            z40Var.getTitleTextView().animate().translationY(z4 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(nrVar).start();
            ObjectAnimator objectAnimator = c60Var.R2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                c60Var.R2.cancel();
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = z40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.k5, Float>) property, z40Var.getSubtitleTextView().getTranslationY(), z4 ? 0.0f : AndroidUtilities.dp(20.0f));
            c60Var.R2 = ofFloat;
            ofFloat.setDuration(300L);
            c60Var.R2.setInterpolator(nrVar);
            c60Var.R2.addListener(new org.telegram.ui.Components.l00(21, c60Var, z4));
            c60Var.R2.start();
            ObjectAnimator objectAnimator2 = c60Var.S2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z40Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.k5, Float>) property, z4 ? 0.0f : AndroidUtilities.dp(20.0f));
            c60Var.S2 = ofFloat2;
            ofFloat2.setDuration(300L);
            c60Var.S2.setInterpolator(nrVar);
            c60Var.S2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            c60Var.e0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = c60Var.e0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) property2, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(c60Var.K, (Property<o30, Float>) property2, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(c60Var.d0, (Property<View, Float>) property2, z4 ? 1.0f : 0.0f));
            c60Var.e0.addListener(new x40(c60Var, i11));
            c60Var.e0.start();
            c60Var.X1.v.setClickable(!z4 || C3);
        }
        if (c60Var.v0 != dp) {
            c60Var.E1(dp);
        }
    }

    public static void N(c60 c60Var, org.telegram.ui.Components.voip.l lVar, boolean z4) {
        if (c60Var.isDismissed()) {
            return;
        }
        if (z4 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(c60Var.V1, c60Var.X1, lVar, null, null, lVar.getParticipant(), c60Var.X0, c60Var));
        } else {
            if (z4 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void S(c60 c60Var, int i10, int[] iArr) {
        if (c60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.zg, false), c60Var.R1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), c60Var.R1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.yg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.zg, false), c60Var.R1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Cg, false), c60Var.R1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ng, false), c60Var.R1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false), c60Var.R1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z4, String str) {
        if (A3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                A3 = new c60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z4, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                A3 = new c60(launchActivity, accountInstance, call, chat2, null, z4, str);
            }
            A3.f0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(19));
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

    public static /* synthetic */ void m(c60 c60Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(declineconferencecallinvite, new w20(c60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(c60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = c60Var.X0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            c60Var.X0.invitedUsersMap.remove(l10);
            c60Var.X0.invitedUsersMessageIds.remove(l10);
            c60Var.O0(true);
        }
    }

    public static void n(final c60 c60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = c60Var.d;
        ArrayList arrayList = c60Var.C0;
        w50 w50Var = c60Var.M;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            c60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.e4) {
            c60Var.F1((org.telegram.ui.Cells.e4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l10 = null;
        boolean z4 = true;
        if (!(view instanceof org.telegram.ui.Cells.v3)) {
            if (i10 != w50Var.w) {
                if (i10 != w50Var.x) {
                    if (i10 == w50Var.y) {
                        c60Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = c60Var.X0;
                if (call2 == null || call2.call == null) {
                    return;
                }
                gg.v2 v2Var = new gg.v2(activity, c60Var.currentAccount, null, 4, new nh.i0());
                ChatObject.Call call3 = c60Var.X0;
                v2Var.z0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new n8(4)).collect(Collectors.toSet()) : null);
                v2Var.h0(false, true);
                v2Var.x0 = new p20(c60Var, 3);
                v2Var.h0(false, true);
                v2Var.A0 = new dh.v(19, c60Var, call);
                v2Var.show();
                return;
            }
            if (ChatObject.isChannel(c60Var.W0) && (chat = c60Var.W0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                c60Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(c60Var.i1());
            if (chatFull == null) {
                return;
            }
            c60Var.t0 = false;
            Context context = c60Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = c60Var.W0;
            ChatObject.Call call4 = c60Var.X0;
            org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            c60Var.B1 = t30Var;
            t30Var.setOnDismissListener(new s20(c60Var, 2));
            org.telegram.ui.Components.t30 t30Var2 = c60Var.B1;
            t30Var2.d0 = new e30(c60Var);
            t30Var2.show();
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var.getUser() == null) {
            return;
        }
        if (!c60Var.o1()) {
            c60Var.f0.K0(c60Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v3Var.getUser().id);
            if (v3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            c60Var.f0.p0(new ProfileActivity(bundle, null));
            c60Var.dismiss();
            return;
        }
        int i11 = i10 - w50Var.n;
        if (i11 < 0 || i11 >= c60Var.X0.shadyJoinParticipants.size()) {
            int i12 = i10 - w50Var.s;
            if (i12 < 0 || i12 >= c60Var.X0.shadyLeftParticipants.size()) {
                int i13 = i10 - w50Var.f;
                if (c60Var.p0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < c60Var.X0.invitedUsers.size()) {
                    l10 = c60Var.X0.invitedUsers.get(i13);
                }
                z4 = false;
            } else {
                l10 = c60Var.X0.shadyLeftParticipants.get(i10 - w50Var.s);
            }
        } else {
            l10 = c60Var.X0.shadyJoinParticipants.get(i10 - w50Var.n);
        }
        if (z4 || (invitedUser = c60Var.X0.invitedUsersMessageIds.get(l10)) == null) {
            return;
        }
        org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(c60Var.container, c60Var.resourcesProvider, v3Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(c60Var) { // from class: org.telegram.ui.u20
            public final /* synthetic */ c60 b;

            {
                this.b = c60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        c60.r(this.b, invitedUser, l10);
                        break;
                    default:
                        c60.m(this.b, invitedUser, l10);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(c60Var) { // from class: org.telegram.ui.u20
            public final /* synthetic */ c60 b;

            {
                this.b = c60Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        c60.r(this.b, invitedUser, l10);
                        break;
                    default:
                        c60.m(this.b, invitedUser, l10);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), c60Var.z0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void o(c60 c60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = c60Var.f0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            c60Var.f0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            c60Var.N1(true, false);
            c60Var.M1(false);
            c60Var.X0.sortParticipants();
            c60Var.O0(true);
            c60Var.e.requestLayout();
            return;
        }
        c60Var.g0[0].e(1, false);
        if (c60Var.w0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            p40 p40Var = new p40(c60Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            c60Var.w0 = p40Var;
            p40Var.setBottomPadding(c60Var.containerView.getPaddingBottom());
            c60Var.container.addView(c60Var.w0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static /* synthetic */ void p(c60 c60Var, float f10, float f11, float f12, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c60Var.a2 = floatValue;
        c60Var.X1.n = floatValue;
        float f13 = (floatValue * 1.0f) + ((1.0f - floatValue) * f10);
        y30 y30Var = c60Var.z2;
        y30Var.setScaleX(f13);
        y30Var.setScaleY(f13);
        y30Var.setTranslationX((1.0f - c60Var.a2) * f11);
        y30Var.setTranslationY((1.0f - c60Var.a2) * f12);
        if (!c60Var.d2) {
            c60Var.T2.setAlpha((int) (c60Var.a2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = c60Var.W2;
        if (tVar != null) {
            tVar.a.setRoundCorners((1.0f - c60Var.a2) * AndroidUtilities.dp(8.0f));
        }
        y30Var.invalidate();
        c60Var.containerView.invalidate();
        x30 x30Var = c60Var.b;
        int i11 = (int) ((1.0f - c60Var.a2) * i10);
        x30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void q(c60 c60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = c60Var.X0;
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
            c60Var.X0.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = c60Var.X0.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(c60Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new x20(c60Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        c60Var.O0(true);
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
        c60Var.N1(true, true);
    }

    public static /* synthetic */ void r(c60 c60Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(declineconferencecallinvite, new w20(c60Var, 1));
        ChatObject.Call call = c60Var.X0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            c60Var.O0(true);
        }
    }

    public static /* synthetic */ void s(c60 c60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(c60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(c60 c60Var) {
        c60Var.Y0();
        c60Var.V0();
        c60Var.U0();
        c60Var.C.setTranslationY((-c60Var.z1.c()) + c60Var.containerView.getPaddingBottom());
        c60Var.D.invalidate();
        c60Var.Z0();
        c60Var.containerView.invalidate();
    }

    public static void t1(Context context, Runnable runnable, boolean z4, boolean z10) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        ChatObject.Call call = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        if (z10 || !ChatObject.canManageCalls(chat)) {
            w1(call, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        if (sharedInstance.isConference()) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            if (z4) {
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
            f10.addView(z1VarArr[0], k7.b6.n(-1, -2));
            z1VarArr[0].setOnClickListener(new q20(z1VarArr, 0));
        }
        alertDialog$Builder.n(f10);
        alertDialog$Builder.a.F = org.telegram.ui.ActionBar.j6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new d9.c(call, z1VarArr, selfId, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z4) {
            alertDialog$Builder.a.M0 = false;
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 26) {
                d2Var.getWindow().setType(2038);
            } else {
                d2Var.getWindow().setType(2003);
            }
            d2Var.getWindow().clearFlags(2);
        }
        if (!z4) {
            d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
        }
        d2Var.show();
        if (z4) {
            return;
        }
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vg, false));
        }
        d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false));
    }

    public static /* synthetic */ void u(c60 c60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(c60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void v(c60 c60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(c60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new i5.v(c60Var, updates, j10, 26));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ih(c60Var, hashSet, call, str, 29));
    }

    public static /* synthetic */ void w(c60 c60Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(c60Var.currentAccount).getUser(l10));
            getrequirementstocontact.id.add(MessagesController.getInstance(c60Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.jy0 jy0Var = new org.telegram.ui.Components.jy0(c60Var, arrayList, arrayList2, arrayList3, str, 5);
        if (UserConfig.getInstance(c60Var.currentAccount).isPremium()) {
            jy0Var.run();
        } else {
            ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(getrequirementstocontact, new ba(arrayList, arrayList2, jy0Var, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z4, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z4 ? 1 : 0);
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

    public static /* synthetic */ void x(c60 c60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(34, c60Var.currentAccount, U.getContext(), U, new nh.i0());
        v0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        v0Var.show();
    }

    public static /* synthetic */ void y(c60 c60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            d2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        d2VarArr[0] = null;
        if (z4 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            c60Var.x1(null, j10, 3);
        } else {
            org.telegram.ui.Components.z4.f0(c60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.p2) c60Var.f0.O().getFragmentStack().get(c60Var.f0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.E.setText("");
        ChatObject.Call call = this.X0;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.X0;
        long j10 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j10, inputGroupCall);
    }

    public final void B1(float f10) {
        this.R1 = f10;
        v30 v30Var = this.X1;
        float max = Math.max(f10, v30Var == null ? 0.0f : v30Var.c);
        int i10 = org.telegram.ui.ActionBar.j6.jg;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false), f10, 1.0f);
        this.S1 = offsetColor;
        this.K.setBackgroundColor(offsetColor);
        this.h1.B(-14472653);
        this.c0.setColorFilter(new PorterDuffColorFilter(this.S1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false), f10, 1.0f);
        n50 n50Var = this.m0;
        if (n50Var != null) {
            n50Var.j = offsetColor2;
            eg.h0 h0Var = n50Var.g;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
        this.z0.setColor(offsetColor2);
        this.B.setColor(offsetColor2);
        this.C.invalidate();
        j50 j50Var = this.N;
        j50Var.setGlowColor(offsetColor2);
        int i12 = this.C1;
        if (i12 == 3 || p1(i12)) {
            this.w.invalidate();
        }
        View view = this.G2;
        if (view != null) {
            int i13 = this.S1;
            int[] iArr = this.J2;
            iArr[0] = i13;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.I2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.I2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.H2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Eg, false), f10, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false), f10, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false), f10, 1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int childCount = j50Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = j50Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(v02, v02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z4 = childAt instanceof org.telegram.ui.Cells.e4;
                z40 z40Var = this.L;
                if (z4) {
                    ((org.telegram.ui.Cells.e4) childAt).f(z40Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    ((org.telegram.ui.Cells.v3) childAt).a(z40Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        j50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f10) {
        j50 j50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f2.l1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f10 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.M0 = min;
        this.N0 = (min - this.L0) / 265.0f;
        ChatObject.Call call = this.X0;
        if (call == null || (j50Var = this.N) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.x0))) == null) {
            return;
        }
        v30 v30Var = this.X1;
        if (v30Var.b) {
            int i10 = 0;
            while (true) {
                r30 r30Var = this.j2;
                if (i10 >= r30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i10);
                if (MessageObject.getPeerId(s20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    s20Var.setAmplitude(f10 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.p0 ? this.A0 : this.X0.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = j50Var.K(indexOf + this.M.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) view).setAmplitude(f10 * 15.0f);
                    if (view == this.U2 && !this.i2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        v30Var.k(groupCallParticipant, f10 * 15.0f);
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.d3 = i10;
        this.e3 = i11;
        this.f3 = i12;
        this.g3 = i13;
        this.h3 = i14;
        this.i3 = i15;
        this.j3 = i16;
        this.k3 = i17;
        this.l3 = i18;
        this.m3 = i19;
        this.n3 = i20;
        this.o3 = i21;
        this.p3 = i22;
        this.q3 = i23;
        this.r3 = i24;
        this.s3 = i25;
    }

    public final void E1(float f10) {
        int i10;
        this.v0 = f10;
        this.N.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f10 - AndroidUtilities.dp(74.0f);
        float f11 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        r50 r50Var = this.R0;
        v30 v30Var = this.X1;
        p30 p30Var = this.c1;
        n30 n30Var = this.b1;
        if (f11 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (r50Var != null) {
                r50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.R1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f12 = 1.0f - ((0.1f * min) * 1.2f);
            n30Var.setScaleX(Math.max(0.9f, f12));
            n30Var.setScaleY(Math.max(0.9f, f12));
            float f13 = 1.0f - (min * 1.2f);
            n30Var.setAlpha((1.0f - v30Var.c) * Math.max(0.0f, f13));
            p30Var.setScaleX(Math.max(0.9f, f12));
            p30Var.setScaleY(Math.max(0.9f, f12));
            p30Var.setAlpha((1.0f - v30Var.c) * Math.max(0.0f, f13));
        } else {
            n30Var.setScaleX(1.0f);
            n30Var.setScaleY(1.0f);
            n30Var.setAlpha(1.0f - v30Var.c);
            p30Var.setScaleX(1.0f);
            p30Var.setScaleY(1.0f);
            p30Var.setAlpha(1.0f - v30Var.c);
            if (this.R1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f14 = i10;
        this.w1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(53.0f)) - f14));
        this.g1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
        if (r50Var != null) {
            r50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(37.0f)));
        }
        m40 m40Var = this.O;
        if (m40Var != null) {
            m40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
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
        org.telegram.ui.Cells.e4 e4Var;
        z50 z50Var;
        long j10;
        dg.k0 k0Var;
        org.telegram.ui.ActionBar.x1 x1Var;
        AccountInstance accountInstance;
        boolean z4;
        long j11;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j12;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z10;
        k50 k50Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        float y10;
        float y11;
        int measuredHeight;
        int i10;
        int i11;
        ?? r42;
        boolean z11;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.U.k() && getContext() != null) {
            if (this.Z2 || this.c2) {
                d1(true);
                return false;
            }
            d50 d50Var = this.c3;
            if (d50Var != null) {
                d50Var.dismiss();
                this.c3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.X0.videoNotAvailableParticipant) {
                    e4Var = new org.telegram.ui.Cells.e4(lVar.getContext());
                    e4Var.e(this.d, lVar.getParticipant().participant, this.X0, MessageObject.getPeerId(this.x0), null, false);
                    org.telegram.ui.Components.j5 j5Var = e4Var.s;
                    if (j5Var != null) {
                        j5Var.f();
                    }
                    this.Y2 = false;
                    this.V2 = lVar;
                    this.W2 = lVar.getRenderer();
                    if (!D3 && !C3) {
                        this.containerView.addView(e4Var, k7.b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (e4Var != null) {
                        boolean z12 = (C3 || D3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = e4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ji(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new m20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.B2 = linearLayout;
                            dg.k0 k0Var2 = new dg.k0(getContext(), linearLayout, linearLayout2, 7);
                            k0Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            k0Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false), this.R1, 1.0f);
                            if (linearLayout2 == null || e4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                z50Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                k0Var2.addView(linearLayout2, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                z50Var = new z50(this, getContext(), participant);
                                linearLayout2.addView(z50Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            k0Var2.addView(linearLayout, k7.b6.k(0.0f, z50Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(getContext(), R.style.scrollbarShapeStyle, k0Var2);
                            x1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(x1Var2, k7.b6.c(-2.0f, -2));
                            z50 z50Var2 = z50Var;
                            long peerId = MessageObject.getPeerId(participant.peer);
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            boolean z13 = z12;
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z14 = participant.peer instanceof TLRPC.TL_peerUser;
                            AccountInstance accountInstance2 = this.d;
                            if (z14) {
                                accountInstance = accountInstance2;
                                if (ChatObject.isChannel(this.W0)) {
                                    j10 = peerId;
                                    k0Var = k0Var2;
                                    x1Var = x1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z4 = true;
                                    }
                                    z4 = false;
                                } else {
                                    j10 = peerId;
                                    k0Var = k0Var2;
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
                                    z4 = false;
                                }
                            } else {
                                j10 = peerId;
                                k0Var = k0Var2;
                                x1Var = x1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (e4Var.c()) {
                                if (o1() && e4Var.H) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    b.h(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(e4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                b.h(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                b.h(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                b.h(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (Q0()) {
                                if (!o1() && z4 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        b.j(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    b.h(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
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
                                        b.j(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (o1() ? !(z4 || !ChatObject.canBlockUsers(this.W0)) : !((call = this.X0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            b.h(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                b.j(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (o1()) {
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    b.j(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    b.h(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j14 = peer2.channel_id;
                                    if (j14 != 0 && !ChatObject.isMegagroup(this.currentAccount, j14)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        b.j(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                b.j(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.j6.hg;
                                    r42 = 0;
                                    z11 = false;
                                    g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z11 = false;
                                    int i16 = org.telegram.ui.ActionBar.j6.vg;
                                    g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                                }
                                g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.w0(r42, org.telegram.ui.ActionBar.j6.eg, z11));
                                g1Var.g((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(g1Var);
                                g1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                g1Var.setOnClickListener(new nh.o5(this, i14, arrayList4, groupCallParticipant, 3));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            x1Var.addView(k0Var, k7.b6.x(-2, -2, 51));
                            j50 j50Var = this.N;
                            j50Var.B0();
                            this.V.X = false;
                            this.U2 = e4Var;
                            e4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            j50Var.invalidate();
                            AnimatorSet animatorSet = this.b3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.b2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
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
                            org.telegram.ui.Components.voip.t tVar = this.W2;
                            boolean z15 = tVar != null && tVar.v;
                            if (forUserOrChat != null || z15) {
                                if (z13) {
                                    org.telegram.ui.Components.p9 avatarImageView = this.U2.getAvatarImageView();
                                    x30 x30Var = this.b;
                                    x30Var.setParentAvatarImage(avatarImageView);
                                    x30Var.setHasActiveVideo(z15);
                                    x30Var.M(j12, true);
                                    x30Var.setCreateThumbFromParent(true);
                                    x30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.t tVar2 = this.W2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.x0) == j12 && this.e2 != null && (k50Var = this.f2) != null && (fileLocation = k50Var.c) != null) {
                                        x30Var.A(k50Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z10 = z13;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                this.c2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.b2, k7.b6.c(-2.0f, -2));
                                this.d2 = true;
                                a40 a40Var = this.Y1;
                                if (a40Var == null) {
                                    i11 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    this.f0.O().getView().draw(canvas);
                                    canvas.drawColor(i0.a.k(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    this.C2 = true;
                                    this.containerView.draw(canvas);
                                    i11 = 0;
                                    this.C2 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    a40Var.setBackground(new BitmapDrawable(createBitmap));
                                    a40Var.setAlpha(0.0f);
                                    a40Var.setVisibility(0);
                                    a40Var.bringToFront();
                                }
                                this.Z2 = true;
                                this.z2.setVisibility(i11);
                                if (z50Var2 != null) {
                                    z50Var2.invalidate();
                                }
                                y1(true, e4Var);
                                org.telegram.ui.Components.s20 s20Var = this.X2;
                                if (s20Var != null) {
                                    s20Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.c2 = false;
                            d50 d50Var2 = new d50(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.c3 = d50Var2;
                            d50Var2.e = true;
                            d50Var2.c = 220;
                            d50Var2.setOutsideTouchable(true);
                            this.c3.setClippingEnabled(true);
                            this.c3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.c3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.c3.setInputMethodMode(2);
                            this.c3.setSoftInputMode(0);
                            this.c3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.s20 s20Var2 = this.X2;
                            if (s20Var2 != null) {
                                boolean z16 = C3;
                                v30 v30Var = this.X1;
                                r30 r30Var = this.j2;
                                if (z16) {
                                    x10 = AndroidUtilities.dp(32.0f) + (((int) (v30Var.getX() + (r30Var.getX() + s20Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (v30Var.getY() + (r30Var.getY() + this.X2.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x10 = ((int) (v30Var.getX() + (r30Var.getX() + s20Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y10 = (v30Var.getY() + (r30Var.getY() + this.X2.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y10;
                                }
                            } else {
                                x10 = (int) (((j50Var.getX() + j50Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.Y2) {
                                    y11 = e4Var.getY() + j50Var.getY();
                                    measuredHeight = e4Var.getClipHeight();
                                } else if (this.V2 != null) {
                                    y11 = this.V2.getY() + j50Var.getY();
                                    measuredHeight = this.V2.getMeasuredHeight();
                                } else {
                                    y10 = j50Var.getY();
                                    i10 = (int) y10;
                                }
                                i10 = (int) (y11 + measuredHeight);
                            }
                            this.c3.showAtLocation(j50Var, 51, x10, i10);
                            this.b3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.T2, org.telegram.ui.Components.n6.b, 0, 100));
                            this.b3.playTogether(arrayList5);
                            this.b3.setDuration(150L);
                            this.b3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.s20) {
                    org.telegram.ui.Components.s20 s20Var3 = (org.telegram.ui.Components.s20) view;
                    if (s20Var3.getParticipant() != this.X0.videoNotAvailableParticipant.participant) {
                        e4Var = new org.telegram.ui.Cells.e4(s20Var3.getContext());
                        e4Var.e(this.d, s20Var3.getParticipant(), this.X0, MessageObject.getPeerId(this.x0), null, false);
                        org.telegram.ui.Components.j5 j5Var2 = e4Var.s;
                        if (j5Var2 != null) {
                            j5Var2.f();
                        }
                        this.Y2 = false;
                        this.X2 = s20Var3;
                        org.telegram.ui.Components.voip.t renderer = s20Var3.getRenderer();
                        this.W2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.W2 = null;
                        }
                        this.containerView.addView(e4Var, k7.b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    e4Var = (org.telegram.ui.Cells.e4) view;
                    this.Y2 = true;
                }
                if (e4Var != null) {
                }
            }
        }
        return false;
    }

    public final void G1(View view) {
        if (this.j0 == null) {
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(8, getContext(), null, true);
            this.j0 = k40Var;
            k40Var.setAlpha(0.0f);
            this.j0.setVisibility(4);
            this.j0.setShowingDuration(3000L);
            this.containerView.addView(this.j0, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.W0)) {
                this.j0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.j0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.j0.d();
        }
        this.j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.j0.f(view, true);
    }

    public final void H1(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ChatObject.Call call = this.X0;
        org.telegram.ui.Components.voip.v2 v2Var = this.v;
        org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
        org.telegram.ui.Components.voip.v2 v2Var3 = this.r;
        org.telegram.ui.Components.voip.v2 v2Var4 = this.f;
        org.telegram.ui.Components.voip.v2 v2Var5 = this.n;
        org.telegram.ui.Components.voip.v2 v2Var6 = this.s;
        org.telegram.ui.Components.voip.v2 v2Var7 = this.w;
        i30 i30Var = this.e;
        boolean z14 = false;
        if (call == null || call.isScheduled()) {
            i30Var.c(v2Var7, this.S0 > 0.1f, z4);
            i30Var.c(v2Var6, this.S0 > 0.1f, z4);
            i30Var.c(v2Var3, this.S0 > 0.1f, z4);
            i30Var.c(v2Var5, false, z4);
            i30Var.c(v2Var4, false, z4);
            i30Var.c(v2Var2, false, z4);
            i30Var.c(v2Var, false, z4);
            return;
        }
        boolean z15 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.x0));
        boolean z16 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
        Boolean bool = this.u3;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.X0.call;
            z10 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z16 || !this.X0.canRecordVideo()) && !z15) || r1()) {
            z14 = true;
            z11 = false;
        } else {
            z11 = true;
        }
        if (z15) {
            z12 = false;
            z13 = true;
        } else {
            z12 = !z16;
            z13 = false;
        }
        if (C3) {
            z12 = false;
            z13 = false;
        }
        i30Var.c(v2Var7, true, z4);
        i30Var.c(v2Var6, true, z4);
        i30Var.c(v2Var5, z11, z4);
        i30Var.c(v2Var4, z13, z4);
        i30Var.c(v2Var3, z14, z4);
        i30Var.c(v2Var2, z12, z4);
        i30Var.c(v2Var, z10, z4);
    }

    public final void I1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.X0;
        org.telegram.ui.ActionBar.w0 w0Var = this.h1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.j1;
        if (call2 == null || call2.isScheduled()) {
            this.i1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.X0 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.i0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat3 != null) {
            this.W0 = chat3;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.W0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.k1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.W0) || ((chat2 = this.W0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.W0) || ChatObject.canUserDoAdminAction(this.W0, 3))) || (ChatObject.isChannel(this.W0) && (chat = this.W0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            g1Var.setVisibility(0);
        } else {
            g1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.X0;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.v1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.u1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        } else {
            g1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            g1Var2.setVisibility(this.X0.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.x0));
        ChatObject.Call call4 = this.X0;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.n1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(8);
        } else {
            g1Var4.setVisibility(0);
        }
        g1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        g1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.t1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.l1;
        boolean z4 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.p1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.q1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.X0.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (!this.X0.canRecordVideo() || this.X0.isScheduled() || r1()) {
                g1Var8.setVisibility(8);
            } else {
                g1Var8.setVisibility(0);
            }
            w0Var2.setVisibility(8);
            boolean z10 = this.X0.recording;
            x50 x50Var = this.a1;
            x50Var.f = z10;
            x50Var.d = 1.0f;
            x50Var.invalidateSelf();
            if (this.X0.recording) {
                if (this.A1 == null) {
                    p20 p20Var = new p20(this, 6);
                    this.A1 = p20Var;
                    AndroidUtilities.runOnUIThread(p20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                p20 p20Var2 = this.A1;
                if (p20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(p20Var2);
                    this.A1 = null;
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
            boolean z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
            boolean z12 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z11 || (!(this.X0.canRecordVideo() || z12) || this.X0.isScheduled() || r1())) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            } else if (z12) {
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
        org.telegram.ui.ActionBar.g1 g1Var9 = this.o1;
        if (Q02 && this.X0.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.X0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z4 = false;
        }
        w0Var.I(4, z4);
        this.m1.setVisibility((!r1() || this.X0.isScheduled()) ? 0 : 8);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.x1;
        if (visibility == 0 || g1Var9.getVisibility() == 0 || g1Var.getVisibility() == 0 || g1Var8.getVisibility() == 0 || g1Var7.getVisibility() == 0 || g1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.h0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.Y0) || r1() || this.x0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.x0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.W0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || g1Var.getVisibility() != 8) {
            w0Var.setVisibility(0);
        } else {
            w0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.g1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f10)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.w1.getLayoutParams()).rightMargin = 0;
        this.L.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
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
    public final void J1(int i10, boolean z4) {
        boolean z10;
        boolean N;
        boolean N2;
        String string;
        String string2;
        boolean z11;
        String str;
        String string3;
        String string4;
        boolean N3;
        String string5;
        boolean N4;
        String string6;
        boolean N5;
        String str2;
        int i11;
        b60[] b60VarArr;
        b60 b60Var;
        b60 b60Var2;
        boolean z12;
        boolean z13;
        v30 v30Var = this.X1;
        boolean z14 = v30Var != null && v30Var.b && (AndroidUtilities.isTablet() || C3 == q1());
        if (!r1() && this.C1 == i10 && z4) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.gj0 gj0Var = this.G0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            N5 = gj0Var.N(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.C1;
                        if (i13 == 3) {
                            int i14 = gj0Var.f;
                            N3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? gj0Var.N(99) : false;
                        } else if (i13 == 5) {
                            N3 = gj0Var.N(404);
                        } else if (i13 == 7) {
                            N3 = gj0Var.N(376);
                        } else if (i13 == 6) {
                            N3 = gj0Var.N(237);
                        } else {
                            if (i13 == 2) {
                                z11 = gj0Var.N(36);
                                str = string3;
                                string2 = string4;
                                z10 = false;
                                if (r1() || i10 == i12 || this.X0.isScheduled()) {
                                    str2 = string2;
                                } else {
                                    str = LocaleController.getString(z14 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                    boolean z15 = this.D1 != z14;
                                    this.D1 = z14;
                                    z11 = z15;
                                    str2 = "";
                                }
                                String z16 = !TextUtils.isEmpty(str2) ? android.support.v4.media.a.z(str, " ", str2) : str;
                                org.telegram.ui.Components.voip.v2 v2Var = this.w;
                                v2Var.setContentDescription(z16);
                                v2Var.c(0, 0, 0, 1.0f, true, str, false, z4);
                                j30 j30Var = this.x;
                                ImageView imageView = this.y;
                                if (z4) {
                                    if (z11) {
                                        if (i10 == 5) {
                                            gj0Var.K(376);
                                        } else if (i10 == 7) {
                                            gj0Var.K(173);
                                        } else if (i10 == 6) {
                                            gj0Var.K(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.C1;
                                            if (i15 == 5) {
                                                gj0Var.K(376);
                                            } else if (i15 == 7) {
                                                gj0Var.K(344);
                                            } else if (i15 == 6) {
                                                gj0Var.K(202);
                                            } else if (i15 == 2) {
                                                gj0Var.K(0);
                                            } else {
                                                gj0Var.K(69);
                                            }
                                        } else if (i10 == 1 || (this.C1 == 2 && o1())) {
                                            gj0Var.K(this.C1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            gj0Var.K(99);
                                        } else if (z10) {
                                            int i16 = this.C1;
                                            if (i16 == 7) {
                                                gj0Var.K(274);
                                            } else if (i16 == 6) {
                                                gj0Var.K(237);
                                            } else if (i16 == 1) {
                                                gj0Var.K(136);
                                            } else {
                                                gj0Var.K(99);
                                            }
                                        } else {
                                            int i17 = this.C1;
                                            if (i17 == 5) {
                                                gj0Var.K(376);
                                            } else if (i17 == 7) {
                                                gj0Var.K(344);
                                            } else if (i17 == 6) {
                                                gj0Var.K(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                gj0Var.K(0);
                                            } else {
                                                gj0Var.K(69);
                                            }
                                        }
                                    }
                                    j30Var.d();
                                    if (!r1() || this.X0.isScheduled()) {
                                        imageView.setVisibility(8);
                                        j30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((v30Var != null && v30Var.b && (AndroidUtilities.isTablet() || C3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        j30Var.setVisibility(8);
                                    }
                                    this.C1 = i10;
                                } else {
                                    this.C1 = i10;
                                    gj0Var.L(gj0Var.f - 1, false, true);
                                    if (!r1() || this.X0.isScheduled()) {
                                        imageView.setVisibility(8);
                                        j30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((v30Var != null && v30Var.b && (AndroidUtilities.isTablet() || C3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        j30Var.setVisibility(8);
                                    }
                                }
                                v2Var.invalidate();
                                i11 = this.C1;
                                b60VarArr = this.H1;
                                if (b60VarArr[i11] == null) {
                                    b60VarArr[i11] = new b60(i11);
                                    int i18 = this.C1;
                                    if (i18 == 3) {
                                        b60VarArr[i18].g = null;
                                    } else if (p1(i18)) {
                                        b60VarArr[this.C1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.C1;
                                        if (i19 != 1) {
                                            b60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            b60Var = b60VarArr[this.C1];
                                            b60Var2 = this.K1;
                                            if (b60Var != b60Var2) {
                                                this.J1 = b60Var2;
                                                this.K1 = b60Var;
                                                if (b60Var2 == null || !z4) {
                                                    this.I1 = 1.0f;
                                                    this.J1 = null;
                                                } else {
                                                    this.I1 = 0.0f;
                                                }
                                            }
                                            if (!z4) {
                                                b60 b60Var3 = this.K1;
                                                if (b60Var3 != null) {
                                                    int i20 = b60Var3.i;
                                                    z13 = i20 == 1 || i20 == 0;
                                                    z12 = i20 != 3;
                                                } else {
                                                    z12 = false;
                                                    z13 = false;
                                                }
                                                this.M1 = z13 ? 1.0f : 0.0f;
                                                this.N1 = z12 ? 1.0f : 0.0f;
                                            }
                                            this.e.invalidate();
                                        }
                                        b60VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                b60Var = b60VarArr[this.C1];
                                b60Var2 = this.K1;
                                if (b60Var != b60Var2) {
                                }
                                if (!z4) {
                                }
                                this.e.invalidate();
                            }
                            N3 = gj0Var.N(99);
                        }
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            N4 = gj0Var.N(this.C1 == 4 ? 99 : 69);
                        } else if (o1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            N4 = gj0Var.N(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.x0));
                                z10 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                                if (z10) {
                                    int i21 = this.C1;
                                    if (i21 == 7) {
                                        N2 = gj0Var.N(311);
                                    } else if (i21 == 6) {
                                        N2 = gj0Var.N(274);
                                    } else if (i21 == 1) {
                                        N2 = gj0Var.N(173);
                                    } else {
                                        N = gj0Var.N(136);
                                    }
                                    N = N2;
                                } else {
                                    int i22 = this.C1;
                                    if (i22 == 5) {
                                        N2 = gj0Var.N(404);
                                    } else if (i22 == 7) {
                                        N = gj0Var.N(376);
                                    } else if (i22 == 6) {
                                        N = gj0Var.N(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        N = gj0Var.N(36);
                                    } else {
                                        N2 = gj0Var.N(99);
                                    }
                                    N = N2;
                                }
                                i12 = 3;
                                if (i10 == 3) {
                                    string = LocaleController.getString(R.string.Connecting);
                                    z11 = N;
                                    string2 = "";
                                } else {
                                    string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                    string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    z11 = N;
                                }
                                str = string;
                                if (r1()) {
                                }
                                str2 = string2;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                org.telegram.ui.Components.voip.v2 v2Var2 = this.w;
                                v2Var2.setContentDescription(z16);
                                v2Var2.c(0, 0, 0, 1.0f, true, str, false, z4);
                                j30 j30Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z4) {
                                }
                                v2Var2.invalidate();
                                i11 = this.C1;
                                b60VarArr = this.H1;
                                if (b60VarArr[i11] == null) {
                                }
                                b60Var = b60VarArr[this.C1];
                                b60Var2 = this.K1;
                                if (b60Var != b60Var2) {
                                }
                                if (!z4) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            N3 = gj0Var.N(136);
                        }
                        z11 = N4;
                    }
                    z11 = N3;
                    str = string3;
                    string2 = string4;
                    z10 = false;
                    if (r1()) {
                    }
                    str2 = string2;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    org.telegram.ui.Components.voip.v2 v2Var22 = this.w;
                    v2Var22.setContentDescription(z16);
                    v2Var22.c(0, 0, 0, 1.0f, true, str, false, z4);
                    j30 j30Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z4) {
                    }
                    v2Var22.invalidate();
                    i11 = this.C1;
                    b60VarArr = this.H1;
                    if (b60VarArr[i11] == null) {
                    }
                    b60Var = b60VarArr[this.C1];
                    b60Var2 = this.K1;
                    if (b60Var != b60Var2) {
                    }
                    if (!z4) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z11 = gj0Var.N(377);
                string2 = "";
                str = string5;
                z10 = false;
                if (r1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.v2 v2Var222 = this.w;
                v2Var222.setContentDescription(z16);
                v2Var222.c(0, 0, 0, 1.0f, true, str, false, z4);
                j30 j30Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z4) {
                }
                v2Var222.invalidate();
                i11 = this.C1;
                b60VarArr = this.H1;
                if (b60VarArr[i11] == null) {
                }
                b60Var = b60VarArr[this.C1];
                b60Var2 = this.K1;
                if (b60Var != b60Var2) {
                }
                if (!z4) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            N5 = gj0Var.N(344);
        }
        string2 = "";
        str = string6;
        z11 = N5;
        z10 = false;
        if (r1()) {
        }
        str2 = string2;
        if (!TextUtils.isEmpty(str2)) {
        }
        org.telegram.ui.Components.voip.v2 v2Var2222 = this.w;
        v2Var2222.setContentDescription(z16);
        v2Var2222.c(0, 0, 0, 1.0f, true, str, false, z4);
        j30 j30Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z4) {
        }
        v2Var2222.invalidate();
        i11 = this.C1;
        b60VarArr = this.H1;
        if (b60VarArr[i11] == null) {
        }
        b60Var = b60VarArr[this.C1];
        b60Var2 = this.K1;
        if (b60Var != b60Var2) {
        }
        if (!z4) {
        }
        this.e.invalidate();
    }

    public final void K1() {
        if (this.X0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.X0;
        int i10 = currentTime - call.call.record_start_date;
        boolean z4 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.p1;
        if (z4) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f12 = 1.0f - this.w3.e;
            i30 i30Var = this.e;
            i30Var.setAlpha(f12);
            this.X1.setProgressToHideUi(f10);
            this.j2.invalidate();
            this.containerView.invalidate();
            i30Var.invalidate();
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
            this.D.invalidate();
            this.E.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final void L1(boolean z4) {
        float interpolation;
        float f10;
        m40 m40Var = this.O;
        if ((m40Var == null || this.X0 != null) && this.U0 == null) {
            this.T0 = 1.0f;
            this.S0 = 1.0f;
            if (m40Var == null) {
                return;
            }
        }
        if (!z4) {
            m30 m30Var = this.t2;
            AndroidUtilities.cancelRunOnUIThread(m30Var);
            m30Var.run();
            ChatObject.Call call = this.X0;
            j50 j50Var = this.N;
            if (call == null || call.isScheduled()) {
                j50Var.setVisibility(4);
            } else {
                j50Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.W0);
            org.telegram.ui.ActionBar.g1 g1Var = this.t1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f11 = this.S0;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.nr.f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.T0 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
            this.T0 = nrVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * nrVar.getInterpolation(this.S0 / 0.6f);
            f10 = this.S0 / 0.6f;
        }
        H1(true);
        float f12 = 1.0f - f10;
        m40Var.setAlpha(f12);
        this.R.setAlpha(f10);
        this.T.setAlpha(f10);
        i50 i50Var = this.S;
        i50Var.setAlpha(f10);
        i50Var.setScaleX(interpolation);
        i50Var.setScaleY(interpolation);
        k40 k40Var = this.Q;
        k40Var.setScaleX(f12);
        k40Var.setScaleY(f12);
        k40Var.setAlpha(f12);
        this.P.setAlpha(f12);
        this.h1.setAlpha(f10);
        int i10 = f12 != 0.0f ? 0 : 4;
        if (i10 != m40Var.getVisibility()) {
            m40Var.setVisibility(i10);
            k40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z4) {
        org.telegram.ui.Components.voip.v2 v2Var = this.r;
        if (v2Var == null || v2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        i30 i30Var = this.e;
        if (sharedInstance == null || r1()) {
            v2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z4);
            boolean z10 = ChatObject.isPublic(this.W0) || (ChatObject.hasAdminRights(this.W0) && ChatObject.canAddUsers(this.W0));
            xg.b bVar = (xg.b) i30Var.c.get(v2Var);
            if (bVar != null) {
                bVar.d.a(z10, z4);
                v2Var.setEnabled(z10);
            }
            v2Var.b(true, false);
            return;
        }
        xg.b bVar2 = (xg.b) i30Var.c.get(v2Var);
        if (bVar2 != null) {
            bVar2.d.a(true, z4);
            v2Var.setEnabled(true);
        }
        boolean z11 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z12 = !z11 && sharedInstance.isSpeakerphoneOn();
        if (z11) {
            v2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z4);
        } else if (z12) {
            v2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z4);
        } else if (sharedInstance.isHeadsetPlugged()) {
            v2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z4);
        } else {
            v2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z4);
        }
        v2Var.b(z12, z4);
        h1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.X != i10) {
            this.X = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.Y, i10);
        }
        org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
        if (v2Var2.getVisibility() == 0) {
            v2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z4);
            v2Var2.b(h1() != 1, z4);
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
    public final void N1(boolean z4, boolean z10) {
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        int i11;
        boolean z17;
        org.telegram.ui.Components.voip.v2 v2Var;
        org.telegram.ui.Components.voip.v2 v2Var2;
        org.telegram.ui.Components.voip.v2 v2Var3;
        boolean z18;
        boolean r12;
        int i12;
        ChatObject.Call call = this.X0;
        org.telegram.ui.Components.voip.v2 v2Var4 = this.s;
        int i13 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i13 = 5;
            } else if (this.X0.call.schedule_start_subscribed) {
                i13 = 7;
            }
            J1(i13, z4);
            v2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            L1(false);
            return;
        }
        H1(z4);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
            if ((this.q0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.q0) > 3000) && ((i12 = this.Q1) == 1 || i12 == 2 || i12 == 6 || i12 == 5)) {
                R0();
                J1(3, z4);
                z11 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.x0));
                z12 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0();
                if (!((z12 && this.X0.canRecordVideo()) || z11) || r1()) {
                    z13 = false;
                    z14 = true;
                } else {
                    z13 = true;
                    z14 = false;
                }
                if (z11) {
                    z15 = !z12;
                    i10 = 0;
                } else {
                    z15 = false;
                    i10 = 1;
                }
                if (C3) {
                    z16 = z15;
                    i11 = i10;
                } else {
                    z16 = false;
                    i11 = 0;
                }
                int i14 = i11 + (!z14 ? 2 : 0) + (!z13 ? 4 : 0);
                v30 v30Var = this.X1;
                int i15 = i14 + ((v30Var == null && v30Var.b) ? 8 : 0) + (!z16 ? 16 : 0);
                z17 = (this.l0 | 2) == (i15 | 2);
                this.l0 = i15;
                boolean z19 = z11;
                org.telegram.ui.Components.voip.v2 v2Var5 = this.n;
                if (z13) {
                    v2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z19, z4);
                    v2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.v2 v2Var6 = this.f;
                if (i11 != 0) {
                    v2Var6.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    v2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.v2 v2Var7 = this.h;
                if (z16) {
                    v2Var = v2Var6;
                    v2Var2 = v2Var5;
                    v2Var3 = v2Var7;
                    z18 = z4;
                } else {
                    h1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i16 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.X != i16) {
                        this.X = i16;
                        AndroidUtilities.updateImageViewImageAnimated(this.Y, i16);
                    }
                    v2Var2 = v2Var5;
                    v2Var = v2Var6;
                    v2Var7.c(0, -1, 0, 1.0f, true, f1(h1()), false, z4);
                    v2Var3 = v2Var7;
                    z18 = z4;
                    v2Var3.b(h1() != 1, z18);
                }
                org.telegram.ui.Components.voip.v2 v2Var8 = v2Var3;
                v2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z17 && z14) {
                    M1(false);
                }
                v2Var2.d(true, z18);
                v2Var.d(true, z18);
                v2Var8.d(true, z18);
                r12 = r1();
                p30 p30Var = this.c1;
                if (r12) {
                    p30Var.setVisibility(8);
                } else {
                    p30Var.setVisibility(0);
                    boolean z20 = ((Integer) p30Var.getTag()).intValue() == 3;
                    int i17 = this.Q1;
                    final boolean z21 = i17 == 3;
                    p30Var.setTag(Integer.valueOf(i17));
                    if (z20 != z21) {
                        ValueAnimator valueAnimator = this.e1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.d1;
                        if (z18) {
                            final int color = paint.getColor();
                            final int i18 = z21 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.e1 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.t20
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i18, floatValue, 1.0f);
                                    c60 c60Var = c60.this;
                                    c60Var.d1.setColor(offsetColor);
                                    c60Var.c1.invalidate();
                                    if (!z21) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    c60Var.f1 = floatValue;
                                    r50 r50Var = c60Var.R0;
                                    if (r50Var == null || !c60Var.w2) {
                                        return;
                                    }
                                    r50Var.invalidate();
                                }
                            });
                            this.e1.setDuration(300L);
                            this.e1.setInterpolator(org.telegram.ui.Components.nr.f);
                            this.e1.addListener(new x40(this, 2));
                            this.e1.start();
                        } else {
                            paint.setColor(this.Q1 == 3 ? -1163700 : -12761513);
                            p30Var.invalidate();
                        }
                    }
                }
                if (r1() || !LiteMode.isEnabled(512)) {
                }
                if (this.Q1 == 3) {
                    this.w2 = true;
                    z1();
                    return;
                } else {
                    this.w2 = false;
                    AndroidUtilities.cancelRunOnUIThread(this.x2);
                    return;
                }
            }
        }
        if (this.y0 != null) {
            k1().k(0L, 37, this.y0, this.W0, null, null);
            this.y0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.x0));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || Q0()) {
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z10 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                R0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                J1(0, z4);
            } else {
                J1(1, z4);
            }
        } else {
            R0();
            if (groupCallParticipant2.raise_hand_rating != j10) {
                J1(4, z4);
            } else {
                J1(2, z4);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.x0));
        if (groupCallParticipant3 == null) {
        }
        if (z12) {
        }
        z13 = false;
        z14 = true;
        if (z11) {
        }
        if (C3) {
        }
        int i142 = i11 + (!z14 ? 2 : 0) + (!z13 ? 4 : 0);
        v30 v30Var2 = this.X1;
        int i152 = i142 + ((v30Var2 == null && v30Var2.b) ? 8 : 0) + (!z16 ? 16 : 0);
        if ((this.l0 | 2) == (i152 | 2)) {
        }
        this.l0 = i152;
        boolean z192 = z11;
        org.telegram.ui.Components.voip.v2 v2Var52 = this.n;
        if (z13) {
        }
        org.telegram.ui.Components.voip.v2 v2Var62 = this.f;
        if (i11 != 0) {
        }
        org.telegram.ui.Components.voip.v2 v2Var72 = this.h;
        if (z16) {
        }
        org.telegram.ui.Components.voip.v2 v2Var82 = v2Var3;
        v2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z17) {
            M1(false);
        }
        v2Var2.d(true, z18);
        v2Var.d(true, z18);
        v2Var82.d(true, z18);
        r12 = r1();
        p30 p30Var2 = this.c1;
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
    public final void O0(boolean z4) {
        j50 j50Var;
        w50 w50Var;
        v30 v30Var;
        j50 j50Var2;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z10;
        ArrayList arrayList2;
        int i12;
        int i13;
        j50 j50Var3;
        v30 v30Var2;
        r30 r30Var;
        ArrayList arrayList3;
        int i14;
        ChatObject.Call call;
        boolean z11;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        f2.l1 G;
        int i15;
        c60 c60Var = this;
        w50 w50Var2 = c60Var.M;
        v30 v30Var3 = c60Var.X1;
        if (v30Var3 == null || (j50Var = c60Var.N) == null || c60Var.X0 == null || c60Var.p0) {
            return;
        }
        if (v30Var3.b) {
            v30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(c60Var.X0.selfPeer);
        if (peerId != MessageObject.getPeerId(c60Var.x0) && c60Var.X0.participants.f(peerId) != null) {
            c60Var.x0 = c60Var.X0.selfPeer;
        }
        int childCount = j50Var.getChildCount();
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = j50Var.getChildAt(i18);
            f2.l1 G2 = j50Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i16)) {
                i17 = G2.c();
                i16 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList4 = c60Var.n0;
        arrayList4.clear();
        if (!D3) {
            arrayList4.addAll(c60Var.X0.visibleVideoParticipants);
        } else if (v30Var3.b) {
            arrayList4.addAll(c60Var.X0.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = v30Var3.e;
            if (videoParticipant3 != null) {
                arrayList4.remove(videoParticipant3);
            }
        }
        if (j50Var.getItemAnimator() != null && !z4) {
            j50Var.setItemAnimator(null);
        } else if (j50Var.getItemAnimator() == null && z4) {
            j50Var.setItemAnimator(c60Var.U);
        }
        try {
            h hVar = new h(w50Var2, 21);
            try {
                try {
                    z10 = true;
                    try {
                        try {
                            try {
                                i15 = i17;
                                try {
                                    v30Var = v30Var3;
                                } catch (Exception e) {
                                    e = e;
                                    v30Var = v30Var3;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                i11 = i17;
                                v30Var = v30Var3;
                                j50Var2 = j50Var;
                                i10 = childCount;
                                arrayList = arrayList4;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            w50Var = w50Var2;
                            arrayList = arrayList4;
                            i11 = i17;
                            v30Var = v30Var3;
                            j50Var2 = j50Var;
                            i10 = childCount;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        w50Var = w50Var2;
                        i10 = childCount;
                        arrayList = arrayList4;
                        i11 = i17;
                        v30Var = v30Var3;
                        j50Var2 = j50Var;
                    }
                } catch (Exception e12) {
                    e = e12;
                    w50Var = w50Var2;
                    i10 = childCount;
                    arrayList = arrayList4;
                    i11 = i17;
                    v30Var = v30Var3;
                    j50Var2 = j50Var;
                }
                try {
                    j50Var2 = j50Var;
                    try {
                        try {
                            try {
                            } catch (Exception e13) {
                                e = e13;
                                arrayList = arrayList4;
                                i11 = i15;
                                i10 = childCount;
                                z10 = true;
                                w50Var = w50Var2;
                                FileLog.e(e);
                                w50Var.l();
                                c60Var.X0.saveActiveDates();
                                if (view != null) {
                                }
                                ArrayList arrayList5 = c60Var.A0;
                                arrayList5.clear();
                                arrayList5.addAll(c60Var.X0.visibleParticipants);
                                ArrayList arrayList6 = c60Var.B0;
                                arrayList6.clear();
                                arrayList2 = arrayList;
                                arrayList6.addAll(arrayList2);
                                ArrayList arrayList7 = c60Var.C0;
                                arrayList7.clear();
                                arrayList7.addAll(c60Var.X0.invitedUsers);
                                ArrayList arrayList8 = c60Var.D0;
                                arrayList8.clear();
                                arrayList8.addAll(c60Var.X0.shadyJoinParticipants);
                                ArrayList arrayList9 = c60Var.E0;
                                arrayList9.clear();
                                arrayList9.addAll(c60Var.X0.shadyLeftParticipants);
                                w50 w50Var3 = w50Var;
                                c60Var.F0 = w50Var3.C;
                                i12 = i10;
                                i13 = 0;
                                while (i13 < i12) {
                                }
                                j50Var3 = j50Var2;
                                boolean c3 = v30Var.c();
                                v30Var2 = v30Var;
                                if (v30Var2.b) {
                                    if (!arrayList2.isEmpty()) {
                                    }
                                    org.telegram.ui.Components.t20 t20Var = c60Var.m2;
                                    r30Var = c60Var.j2;
                                    t20Var.G(r30Var, z10);
                                    if (r30Var.getVisibility() == 0) {
                                    }
                                    if (D3) {
                                    }
                                    if (j50Var3.getVisibility() == 0) {
                                    }
                                    arrayList3 = c60Var.W1;
                                    arrayList3.clear();
                                    arrayList3.addAll(c60Var.V1);
                                    while (i14 < arrayList3.size()) {
                                    }
                                    call = c60Var.X0;
                                    if (call != null) {
                                    }
                                    ChatObject.Call call2 = c60Var.X0;
                                    if (call2 == null) {
                                    }
                                    c60Var.z3.a(z11, z4);
                                    if (z11 != c60Var.F2) {
                                    }
                                }
                                org.telegram.ui.Components.t20 t20Var2 = c60Var.m2;
                                r30Var = c60Var.j2;
                                t20Var2.G(r30Var, z10);
                                if (r30Var.getVisibility() == 0) {
                                }
                                if (D3) {
                                }
                                if (j50Var3.getVisibility() == 0) {
                                }
                                arrayList3 = c60Var.W1;
                                arrayList3.clear();
                                arrayList3.addAll(c60Var.V1);
                                while (i14 < arrayList3.size()) {
                                }
                                call = c60Var.X0;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = c60Var.X0;
                                if (call22 == null) {
                                }
                                c60Var.z3.a(z11, z4);
                                if (z11 != c60Var.F2) {
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
                            c60Var = this;
                            w50Var = w50Var2;
                        } catch (Exception e15) {
                            e = e15;
                            z10 = true;
                            c60Var = this;
                            arrayList = arrayList4;
                            i11 = i15;
                            i10 = childCount;
                            w50Var = w50Var2;
                            FileLog.e(e);
                            w50Var.l();
                            c60Var.X0.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList52 = c60Var.A0;
                            arrayList52.clear();
                            arrayList52.addAll(c60Var.X0.visibleParticipants);
                            ArrayList arrayList62 = c60Var.B0;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = c60Var.C0;
                            arrayList72.clear();
                            arrayList72.addAll(c60Var.X0.invitedUsers);
                            ArrayList arrayList82 = c60Var.D0;
                            arrayList82.clear();
                            arrayList82.addAll(c60Var.X0.shadyJoinParticipants);
                            ArrayList arrayList92 = c60Var.E0;
                            arrayList92.clear();
                            arrayList92.addAll(c60Var.X0.shadyLeftParticipants);
                            w50 w50Var32 = w50Var;
                            c60Var.F0 = w50Var32.C;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            j50Var3 = j50Var2;
                            boolean c32 = v30Var.c();
                            v30Var2 = v30Var;
                            if (v30Var2.b) {
                            }
                            org.telegram.ui.Components.t20 t20Var22 = c60Var.m2;
                            r30Var = c60Var.j2;
                            t20Var22.G(r30Var, z10);
                            if (r30Var.getVisibility() == 0) {
                            }
                            if (D3) {
                            }
                            if (j50Var3.getVisibility() == 0) {
                            }
                            arrayList3 = c60Var.W1;
                            arrayList3.clear();
                            arrayList3.addAll(c60Var.V1);
                            while (i14 < arrayList3.size()) {
                            }
                            call = c60Var.X0;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = c60Var.X0;
                            if (call222 == null) {
                            }
                            c60Var.z3.a(z11, z4);
                            if (z11 != c60Var.F2) {
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        i10 = childCount;
                        arrayList = arrayList4;
                        i11 = i15;
                        w50Var = w50Var2;
                        FileLog.e(e);
                        w50Var.l();
                        c60Var.X0.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList522 = c60Var.A0;
                        arrayList522.clear();
                        arrayList522.addAll(c60Var.X0.visibleParticipants);
                        ArrayList arrayList622 = c60Var.B0;
                        arrayList622.clear();
                        arrayList2 = arrayList;
                        arrayList622.addAll(arrayList2);
                        ArrayList arrayList722 = c60Var.C0;
                        arrayList722.clear();
                        arrayList722.addAll(c60Var.X0.invitedUsers);
                        ArrayList arrayList822 = c60Var.D0;
                        arrayList822.clear();
                        arrayList822.addAll(c60Var.X0.shadyJoinParticipants);
                        ArrayList arrayList922 = c60Var.E0;
                        arrayList922.clear();
                        arrayList922.addAll(c60Var.X0.shadyLeftParticipants);
                        w50 w50Var322 = w50Var;
                        c60Var.F0 = w50Var322.C;
                        i12 = i10;
                        i13 = 0;
                        while (i13 < i12) {
                        }
                        j50Var3 = j50Var2;
                        boolean c322 = v30Var.c();
                        v30Var2 = v30Var;
                        if (v30Var2.b) {
                        }
                        org.telegram.ui.Components.t20 t20Var222 = c60Var.m2;
                        r30Var = c60Var.j2;
                        t20Var222.G(r30Var, z10);
                        if (r30Var.getVisibility() == 0) {
                        }
                        if (D3) {
                        }
                        if (j50Var3.getVisibility() == 0) {
                        }
                        arrayList3 = c60Var.W1;
                        arrayList3.clear();
                        arrayList3.addAll(c60Var.V1);
                        while (i14 < arrayList3.size()) {
                        }
                        call = c60Var.X0;
                        if (call != null) {
                        }
                        ChatObject.Call call2222 = c60Var.X0;
                        if (call2222 == null) {
                        }
                        c60Var.z3.a(z11, z4);
                        if (z11 != c60Var.F2) {
                        }
                    }
                    try {
                        c60Var.D1(w50Var2.H, w50Var2.w, w50Var2.d, w50Var2.e, w50Var2.f, w50Var2.h, w50Var2.n, w50Var2.r, w50Var2.s, w50Var2.v, w50Var2.D, w50Var2.E, w50Var2.F, w50Var2.G, w50Var2.x, w50Var2.y);
                        w50Var.E();
                        z10 = true;
                        try {
                            f2.q.c(c60Var.t3, true).a(hVar);
                        } catch (Exception e17) {
                            e = e17;
                            FileLog.e(e);
                            w50Var.l();
                            c60Var.X0.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList5222 = c60Var.A0;
                            arrayList5222.clear();
                            arrayList5222.addAll(c60Var.X0.visibleParticipants);
                            ArrayList arrayList6222 = c60Var.B0;
                            arrayList6222.clear();
                            arrayList2 = arrayList;
                            arrayList6222.addAll(arrayList2);
                            ArrayList arrayList7222 = c60Var.C0;
                            arrayList7222.clear();
                            arrayList7222.addAll(c60Var.X0.invitedUsers);
                            ArrayList arrayList8222 = c60Var.D0;
                            arrayList8222.clear();
                            arrayList8222.addAll(c60Var.X0.shadyJoinParticipants);
                            ArrayList arrayList9222 = c60Var.E0;
                            arrayList9222.clear();
                            arrayList9222.addAll(c60Var.X0.shadyLeftParticipants);
                            w50 w50Var3222 = w50Var;
                            c60Var.F0 = w50Var3222.C;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            j50Var3 = j50Var2;
                            boolean c3222 = v30Var.c();
                            v30Var2 = v30Var;
                            if (v30Var2.b) {
                            }
                            org.telegram.ui.Components.t20 t20Var2222 = c60Var.m2;
                            r30Var = c60Var.j2;
                            t20Var2222.G(r30Var, z10);
                            if (r30Var.getVisibility() == 0) {
                            }
                            if (D3) {
                            }
                            if (j50Var3.getVisibility() == 0) {
                            }
                            arrayList3 = c60Var.W1;
                            arrayList3.clear();
                            arrayList3.addAll(c60Var.V1);
                            while (i14 < arrayList3.size()) {
                            }
                            call = c60Var.X0;
                            if (call != null) {
                            }
                            ChatObject.Call call22222 = c60Var.X0;
                            if (call22222 == null) {
                            }
                            c60Var.z3.a(z11, z4);
                            if (z11 != c60Var.F2) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        z10 = true;
                        FileLog.e(e);
                        w50Var.l();
                        c60Var.X0.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList52222 = c60Var.A0;
                        arrayList52222.clear();
                        arrayList52222.addAll(c60Var.X0.visibleParticipants);
                        ArrayList arrayList62222 = c60Var.B0;
                        arrayList62222.clear();
                        arrayList2 = arrayList;
                        arrayList62222.addAll(arrayList2);
                        ArrayList arrayList72222 = c60Var.C0;
                        arrayList72222.clear();
                        arrayList72222.addAll(c60Var.X0.invitedUsers);
                        ArrayList arrayList82222 = c60Var.D0;
                        arrayList82222.clear();
                        arrayList82222.addAll(c60Var.X0.shadyJoinParticipants);
                        ArrayList arrayList92222 = c60Var.E0;
                        arrayList92222.clear();
                        arrayList92222.addAll(c60Var.X0.shadyLeftParticipants);
                        w50 w50Var32222 = w50Var;
                        c60Var.F0 = w50Var32222.C;
                        i12 = i10;
                        i13 = 0;
                        while (i13 < i12) {
                        }
                        j50Var3 = j50Var2;
                        boolean c32222 = v30Var.c();
                        v30Var2 = v30Var;
                        if (v30Var2.b) {
                        }
                        org.telegram.ui.Components.t20 t20Var22222 = c60Var.m2;
                        r30Var = c60Var.j2;
                        t20Var22222.G(r30Var, z10);
                        if (r30Var.getVisibility() == 0) {
                        }
                        if (D3) {
                        }
                        if (j50Var3.getVisibility() == 0) {
                        }
                        arrayList3 = c60Var.W1;
                        arrayList3.clear();
                        arrayList3.addAll(c60Var.V1);
                        while (i14 < arrayList3.size()) {
                        }
                        call = c60Var.X0;
                        if (call != null) {
                        }
                        ChatObject.Call call222222 = c60Var.X0;
                        if (call222222 == null) {
                        }
                        c60Var.z3.a(z11, z4);
                        if (z11 != c60Var.F2) {
                        }
                    }
                } catch (Exception e19) {
                    e = e19;
                    j50Var2 = j50Var;
                    i10 = childCount;
                    arrayList = arrayList4;
                    i11 = i15;
                    w50Var = w50Var2;
                    FileLog.e(e);
                    w50Var.l();
                    c60Var.X0.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList522222 = c60Var.A0;
                    arrayList522222.clear();
                    arrayList522222.addAll(c60Var.X0.visibleParticipants);
                    ArrayList arrayList622222 = c60Var.B0;
                    arrayList622222.clear();
                    arrayList2 = arrayList;
                    arrayList622222.addAll(arrayList2);
                    ArrayList arrayList722222 = c60Var.C0;
                    arrayList722222.clear();
                    arrayList722222.addAll(c60Var.X0.invitedUsers);
                    ArrayList arrayList822222 = c60Var.D0;
                    arrayList822222.clear();
                    arrayList822222.addAll(c60Var.X0.shadyJoinParticipants);
                    ArrayList arrayList922222 = c60Var.E0;
                    arrayList922222.clear();
                    arrayList922222.addAll(c60Var.X0.shadyLeftParticipants);
                    w50 w50Var322222 = w50Var;
                    c60Var.F0 = w50Var322222.C;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    j50Var3 = j50Var2;
                    boolean c322222 = v30Var.c();
                    v30Var2 = v30Var;
                    if (v30Var2.b) {
                    }
                    org.telegram.ui.Components.t20 t20Var222222 = c60Var.m2;
                    r30Var = c60Var.j2;
                    t20Var222222.G(r30Var, z10);
                    if (r30Var.getVisibility() == 0) {
                    }
                    if (D3) {
                    }
                    if (j50Var3.getVisibility() == 0) {
                    }
                    arrayList3 = c60Var.W1;
                    arrayList3.clear();
                    arrayList3.addAll(c60Var.V1);
                    while (i14 < arrayList3.size()) {
                    }
                    call = c60Var.X0;
                    if (call != null) {
                    }
                    ChatObject.Call call2222222 = c60Var.X0;
                    if (call2222222 == null) {
                    }
                    c60Var.z3.a(z11, z4);
                    if (z11 != c60Var.F2) {
                    }
                }
            } catch (Exception e20) {
                e = e20;
                w50Var = w50Var2;
                j50Var2 = j50Var;
                i10 = childCount;
                arrayList = arrayList4;
                i11 = i17;
                v30Var = v30Var3;
            }
        } catch (Exception e21) {
            e = e21;
            w50Var = w50Var2;
            v30Var = v30Var3;
            j50Var2 = j50Var;
            i10 = childCount;
            arrayList = arrayList4;
            i11 = i17;
        }
        c60Var.X0.saveActiveDates();
        if (view != null) {
            c60Var.V.h1(i11, view.getTop() - j50Var2.getPaddingTop());
        }
        ArrayList arrayList5222222 = c60Var.A0;
        arrayList5222222.clear();
        arrayList5222222.addAll(c60Var.X0.visibleParticipants);
        ArrayList arrayList6222222 = c60Var.B0;
        arrayList6222222.clear();
        arrayList2 = arrayList;
        arrayList6222222.addAll(arrayList2);
        ArrayList arrayList7222222 = c60Var.C0;
        arrayList7222222.clear();
        arrayList7222222.addAll(c60Var.X0.invitedUsers);
        ArrayList arrayList8222222 = c60Var.D0;
        arrayList8222222.clear();
        arrayList8222222.addAll(c60Var.X0.shadyJoinParticipants);
        ArrayList arrayList9222222 = c60Var.E0;
        arrayList9222222.clear();
        arrayList9222222.addAll(c60Var.X0.shadyLeftParticipants);
        w50 w50Var3222222 = w50Var;
        c60Var.F0 = w50Var3222222.C;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            j50 j50Var4 = j50Var2;
            View childAt2 = j50Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.e4) || (childAt2 instanceof org.telegram.ui.Cells.v3)) && (G = j50Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt2).setDrawDivider(G.b() != w50Var3222222.C + (-2));
                } else {
                    ((org.telegram.ui.Cells.v3) childAt2).setDrawDivider(G.b() != w50Var3222222.C + (-2));
                }
            }
            i13++;
            j50Var2 = j50Var4;
        }
        j50Var3 = j50Var2;
        boolean c3222222 = v30Var.c();
        v30Var2 = v30Var;
        if (v30Var2.b && (videoParticipant2 = v30Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, c60Var.X0)) {
            if (!arrayList2.isEmpty()) {
                c60Var.e1(null);
            } else if (c3222222) {
                c60Var.e1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.t20 t20Var2222222 = c60Var.m2;
            r30Var = c60Var.j2;
            t20Var2222222.G(r30Var, z10);
            if (r30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(r30Var);
            }
            if (D3) {
                c60Var.l2.I(c60Var.k2, z10);
            }
            if (j50Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(j50Var3);
            }
            arrayList3 = c60Var.W1;
            arrayList3.clear();
            arrayList3.addAll(c60Var.V1);
            for (i14 = 0; i14 < arrayList3.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList3.get(i14)).j(z10);
            }
            call = c60Var.X0;
            if (call != null && v30Var2.b && (videoParticipant = v30Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call22222222 = c60Var.X0;
            z11 = call22222222 == null && !call22222222.visibleVideoParticipants.isEmpty();
            c60Var.z3.a(z11, z4);
            if (z11 != c60Var.F2) {
                c60Var.F2 = z11;
                if (D3) {
                    c60Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.t20 t20Var22222222 = c60Var.m2;
        r30Var = c60Var.j2;
        t20Var22222222.G(r30Var, z10);
        if (r30Var.getVisibility() == 0) {
        }
        if (D3) {
        }
        if (j50Var3.getVisibility() == 0) {
        }
        arrayList3 = c60Var.W1;
        arrayList3.clear();
        arrayList3.addAll(c60Var.V1);
        while (i14 < arrayList3.size()) {
        }
        call = c60Var.X0;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call222222222 = c60Var.X0;
        if (call222222222 == null) {
        }
        c60Var.z3.a(z11, z4);
        if (z11 != c60Var.F2) {
        }
    }

    public final void O1() {
        boolean z4;
        a60 a60Var;
        z40 z40Var = this.L;
        if (z40Var == null || this.X0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.X0.currentSpeakingPeers.m(); i11++) {
            long j10 = this.X0.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                v30 v30Var = this.X1;
                v30Var.getClass();
                if (v30Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.y2.get(j10, 0) != 1) {
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
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0);
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
            z40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.ActionBar.k5 subtitleTextView = z40Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i12 = this.X0.call.participants_count;
        w50 w50Var = this.M;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((w50Var.J.r1() || w50Var.I || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (a60Var = this.y1) != null) {
            a60Var.setWatchersCount(this.X0.call.participants_count);
        }
        if (z4 != this.r2) {
            this.r2 = z4;
            z40Var.invalidate();
            z40Var.getSubtitleTextView().setPivotX(0.0f);
            z40Var.getSubtitleTextView().setPivotY(z40Var.getMeasuredHeight() >> 1);
            z40Var.getSubtitleTextView().animate().scaleX(this.r2 ? 0.98f : 1.0f).scaleY(this.r2 ? 0.9f : 1.0f).alpha(this.r2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(z40Var.getAdditionalSubtitleTextView(), this.r2);
        }
    }

    public final int P0() {
        j50 j50Var = this.N;
        int childCount = j50Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z4) {
        ChatObject.Call call = this.X0;
        n30 n30Var = this.b1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.W0)) {
                n30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z4);
                return;
            } else {
                n30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z4);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        z40 z40Var = this.L;
        if (isEmpty) {
            TLRPC.Chat chat = this.W0;
            if (chat != null && !chat.title.equals(z40Var.getTitle())) {
                if (z4) {
                    this.L.I(this.W0.title, true, 180L, null);
                    z40Var.getTitleTextView().setOnClickListener(new n20(this, 9));
                } else {
                    z40Var.setTitle(this.W0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.W0)) {
                    n30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z4);
                } else if (r1()) {
                    n30Var.b(this.W0.title, z4);
                } else {
                    n30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z4);
                }
            } else if (this.W0 == null) {
                z40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                n30Var.b(LocaleController.getString(R.string.ConferenceChat), z4);
            }
        } else if (!this.X0.call.title.equals(z40Var.getTitle())) {
            if (z4) {
                this.L.I(this.X0.call.title, true, 180L, null);
                z40Var.getTitleTextView().setOnClickListener(new n20(this, 8));
            } else {
                z40Var.setTitle(this.X0.call.title);
            }
            n30Var.b(this.X0.call.title, z4);
        }
        org.telegram.ui.ActionBar.k5 titleTextView = z40Var.getTitleTextView();
        if (!this.X0.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                n30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                n30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new y50(titleTextView));
            TextView textView = n30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y50(textView), (Drawable) null);
            TextView nextTextView = n30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y50(nextTextView), (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.W0);
        }
        ChatObject.Call call = this.X0;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void Q1() {
        float f10;
        org.telegram.ui.Components.nb nbVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f11 = this.v0 - dp;
        if (this.backgroundPaddingTop + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r0) * f10);
        } else {
            f10 = 0.0f;
        }
        this.topBulletinContainer.setTranslationY(AndroidUtilities.lerp(((-r0.getTop()) - this.topBulletinContainer.getHeight()) + f11 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), this.L.getY() + (-this.topBulletinContainer.getTop()) + r4.getHeight(), f10));
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        if (icVar == null || (nbVar = icVar.e) == null || nbVar.getParent() == null || nbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        nbVar.setTop(f10 > 0.5f);
    }

    public final void R0() {
        if (this.O1) {
            this.O1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.v2);
        }
        if (this.P1) {
            this.P1 = false;
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
        boolean z4;
        if (!this.Z2) {
            a40 a40Var = this.Y1;
            if (a40Var.getVisibility() == 0 && a40Var.getAlpha() == 1.0f) {
                z4 = true;
                if (this.i2 == z4) {
                    this.i2 = z4;
                    this.e.invalidate();
                    this.containerView.invalidate();
                    this.N.invalidate();
                    return;
                }
                return;
            }
        }
        z4 = false;
        if (this.i2 == z4) {
        }
    }

    public final void T0() {
        this.C.setTranslationY((-this.z1.c()) + this.containerView.getPaddingBottom());
        this.D.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.w3.e);
        U0();
        V0();
    }

    public final void U0() {
        float f10 = this.z1.b.a;
        int i10 = f10 > 0.0f ? 0 : 8;
        g40 g40Var = this.C;
        g40Var.setAlpha(f10);
        f40 f40Var = this.D;
        f40Var.setAlpha(f10);
        if (g40Var.getVisibility() != i10) {
            g40Var.setVisibility(i10);
            f40Var.setVisibility(i10);
            if (i10 == 8) {
                d40 d40Var = this.E;
                if (d40Var.isFocused()) {
                    d40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.pk0 pk0Var = this.H;
        if (pk0Var != null) {
            float f10 = this.z1.b.a * this.x3.e;
            pk0Var.setAlpha(f10);
            int i10 = f10 > 0.0f ? 0 : 8;
            if (this.H.getVisibility() != i10) {
                this.H.setVisibility(i10);
                if (i10 == 8) {
                    this.H.n();
                }
            }
            org.telegram.ui.Components.pk0 pk0Var2 = this.H;
            if (pk0Var2.K0 || f10 != 1.0f) {
                return;
            }
            pk0Var2.K0 = true;
        }
    }

    public final void W0() {
        boolean z4 = D3;
        i30 i30Var = this.e;
        if (z4) {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = C3;
        xd.a aVar = this.w3;
        if (z10) {
            i30Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            i30Var.setTranslationY(0.0f);
        } else {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z4 = D3;
        r30 r30Var = this.j2;
        if (z4) {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = C3;
        xd.a aVar = this.w3;
        if (z10) {
            r30Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            r30Var.setTranslationY(0.0f);
        } else {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float f10 = this.y3.e;
        ch.i iVar = this.z1;
        float lerp = AndroidUtilities.lerp(D3 ? (1.0f - this.z3.e) * AndroidUtilities.dp(-91.0f) : C3 ? 0.0f : ((this.w3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.X1.c)) - AndroidUtilities.dp(91.0f), -((iVar.c() - this.containerView.getPaddingBottom()) + f10 + (AndroidUtilities.dp(68.0f) * this.x3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.v0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        yg.h hVar = this.Z;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.H != null) {
            this.H.setTranslationY((-this.z1.c()) + this.containerView.getPaddingBottom() + ((-this.x3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        float f10 = this.x3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView = this.G;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        imageView.setClickable(f10 > 0.9f);
        float f11 = 1.0f - f10;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f11);
        ImageView imageView2 = this.F;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        imageView2.setClickable(f11 > 0.9f);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.W2;
        if (tVar != null) {
            tVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.W2;
            tVar2.h = false;
            tVar2.j(false);
            this.W2.invalidate();
            this.X1.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.U2;
        if (e4Var != null && !this.Y2 && e4Var.getParent() != null) {
            this.containerView.removeView(this.U2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.U2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.U2.setAboutVisible(false);
            this.U2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.s20 s20Var = this.X2;
        if (s20Var != null) {
            s20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.U2 = null;
        this.V2 = null;
        this.X2 = null;
        this.W2 = null;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithTouchOutside() {
        return !this.X1.b;
    }

    public final void d1(boolean z4) {
        if (this.Z2 || !this.c2) {
            return;
        }
        if (z4) {
            this.Z2 = true;
            y1(false, this.U2);
            return;
        }
        b1();
        this.containerView.removeView(this.b2);
        this.b2 = null;
        this.z2.setVisibility(8);
        this.containerView.invalidate();
        this.c2 = false;
        this.V.X = true;
        this.N.invalidate();
        this.Y1.setVisibility(8);
        if (this.p0) {
            this.p0 = false;
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
        j50 j50Var = this.N;
        int i15 = 0;
        if (i10 == i14) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.X0;
            if (call == null || call.call.id != l10.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.X0;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.q0;
            AccountInstance accountInstance = this.d;
            if (j10 == 0 && (((i13 = this.C1) == 7 || i13 == 5 || i13 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.f0, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", i1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.Y0);
                    intent.putExtra("peerChannelId", this.V0.channel_id);
                    intent.putExtra("peerChatId", this.V0.chat_id);
                    intent.putExtra("peerUserId", this.V0.user_id);
                    intent.putExtra("hash", this.Z0);
                    intent.putExtra("peerAccessHash", this.V0.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.h2);
                    this.f0.startService(intent);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                this.q0 = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new p20(this, 2), 3000L);
            }
            if (!this.r0 && VoIPService.getSharedInstance() != null) {
                this.X0.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            I1();
            int childCount = j50Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = j50Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                }
            }
            if (this.U2 != null) {
                this.p0 = true;
            } else {
                O0(true);
            }
            O1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z4 = this.C1 == 4;
            N1(true, booleanValue);
            P1(true);
            if (z4 && ((i12 = this.C1) == 1 || i12 == 0)) {
                k1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l11 = (Long) objArr[3];
                long longValue = l11.longValue();
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
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                    if (user != null) {
                        if (this.X0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i15 != 0) {
                            k1().k(0L, 44, user, this.W0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.X0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i15 != 0) {
                        k1().k(0L, 44, chat, this.W0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            v30 v30Var = this.X1;
            if (v30Var.b && this.X0 != null) {
                boolean c3 = v30Var.c();
                ChatObject.Call call3 = this.X0;
                if (call3 != null && v30Var.b && (videoParticipant = v30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c3 = true;
                }
                if (c3) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i18 = 0;
                    while (true) {
                        ArrayList arrayList = this.n0;
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i18);
                        if (this.X0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && v30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            v30Var.setVisibleParticipant(true);
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
                    string = ChatObject.isChannelOrGiga(this.W0) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.W0) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog$Builder N = org.telegram.ui.Components.z4.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new s20(this, 1));
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
            long peerId = MessageObject.getPeerId(this.x0);
            ChatObject.Call call4 = this.X0;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            O0(true);
            AndroidUtilities.updateVisibleRows(j50Var);
            if (this.B2 != null) {
                while (i15 < this.B2.getChildCount()) {
                    View childAt2 = this.B2.getChildAt(i15);
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
            int childCount2 = j50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                f2.l1 G = j50Var.G(j50Var.getChildAt(i15));
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
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.x0);
            if (this.X0 == null || peerId2 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            O0(true);
            AndroidUtilities.updateVisibleRows(j50Var);
            if (this.B2 != null) {
                while (i15 < this.B2.getChildCount()) {
                    View childAt3 = this.B2.getChildAt(i15);
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
            AndroidUtilities.updateVisibleRows(j50Var);
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
            AndroidUtilities.updateVisibleRows(j50Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            p40 p40Var = this.w0;
            if (p40Var != null) {
                p40Var.b(true, true);
            }
            I1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            n50 n50Var = this.m0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            n50Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        LaunchActivity launchActivity = this.f0;
        launchActivity.X0.remove(this.s2);
        this.f0.setRequestedOrientation(-1);
        B3 = false;
        org.telegram.ui.Components.t30 t30Var = this.B1;
        if (t30Var != null) {
            t30Var.dismiss();
        }
        this.p0 = true;
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

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        v30 v30Var = this.X1;
        if (v30Var != null) {
            if (this.n2 != null) {
                this.N.getViewTreeObserver().removeOnPreDrawListener(this.n2);
                this.n2 = null;
            }
            ArrayList arrayList = this.W1;
            arrayList.clear();
            ArrayList arrayList2 = this.V1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                v30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (v30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(v30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (A3 == this) {
            A3 = null;
        }
        B3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.a30.j(getContext());
        ChatObject.Call call = this.X0;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z4 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z4 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z4);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                k1().j(z4 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            v30 v30Var = this.X1;
            if (v30Var.r != null) {
                return;
            }
            boolean z4 = D3;
            j50 j50Var = this.N;
            int i10 = 0;
            if (!z4) {
                if (this.n2 != null) {
                    j50Var.getViewTreeObserver().removeOnPreDrawListener(this.n2);
                    this.n2 = null;
                }
                if (videoParticipant == null) {
                    if (j50Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = j50Var.getViewTreeObserver();
                        w40 w40Var = new w40(this);
                        this.n2 = w40Var;
                        viewTreeObserver.addOnPreDrawListener(w40Var);
                        return;
                    }
                    j50Var.setVisibility(0);
                    O0(false);
                    this.p0 = true;
                    ViewTreeObserver viewTreeObserver2 = j50Var.getViewTreeObserver();
                    v40 v40Var = new v40(this);
                    this.n2 = v40Var;
                    viewTreeObserver2.addOnPreDrawListener(v40Var);
                    return;
                }
                r30 r30Var = this.j2;
                if (r30Var.getVisibility() == 0) {
                    v30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(r30Var);
                    return;
                }
                r30Var.setVisibility(0);
                org.telegram.ui.Components.t20 t20Var = this.m2;
                t20Var.G(r30Var, false);
                this.p0 = true;
                if (!v30Var.b) {
                    ArrayList arrayList = t20Var.e;
                    f2.i0 i0Var = (f2.i0) r30Var.getLayoutManager();
                    if (i0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                i0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = j50Var.getViewTreeObserver();
                u40 u40Var = new u40(this, videoParticipant);
                this.n2 = u40Var;
                viewTreeObserver3.addOnPreDrawListener(u40Var);
                return;
            }
            if (this.n2 != null) {
                j50Var.getViewTreeObserver().removeOnPreDrawListener(this.n2);
                this.n2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            i60 i60Var = this.l2;
            ArrayList arrayList3 = this.V1;
            ArrayList arrayList4 = this.W1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.l lVar = tVar.c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.s20 s20Var = tVar.d;
                        if (s20Var != null) {
                            s20Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new q40(this, tVar));
                    }
                }
                this.M2 = false;
                i60Var.H(this.k2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i12);
                    if (tVar2.e != null && ((videoParticipant2 = tVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.w);
                        tVar2.b(false);
                        org.telegram.ui.Components.s20 s20Var2 = tVar2.d;
                        if (s20Var2 != null) {
                            s20Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new r40(this, tVar2));
                    }
                }
                this.M2 = true;
                i60Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new g00(3, this, arrayList2));
                }
            }
            boolean z10 = !v30Var.b;
            ViewTreeObserver viewTreeObserver4 = j50Var.getViewTreeObserver();
            t40 t40Var = new t40(this, videoParticipant, z10);
            this.n2 = t40Var;
            viewTreeObserver4.addOnPreDrawListener(t40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.v3;
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
        TLRPC.Chat chat = this.W0;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void j1(boolean z4) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.X0 == null) {
                return;
            }
            int i10 = 0;
            while (i10 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.X0.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i10 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.m0(this, i10, z4, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.W0);
        String p10 = !TextUtils.isEmpty(publicUsername) ? android.support.v4.media.a.p(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(p10)) {
            u1(null, p10, true, z4);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.W0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new lh.k7(this, chatFull, z4, 4));
    }

    public final UndoView k1() {
        if (!D3) {
            v30 v30Var = this.X1;
            if (v30Var.b) {
                return v30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.g0;
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
        if (this.r0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.r0 = true;
        this.A0.addAll(this.X0.visibleParticipants);
        this.B0.addAll(this.n0);
        this.C0.addAll(this.X0.invitedUsers);
        this.D0.addAll(this.X0.shadyJoinParticipants);
        this.E0.addAll(this.X0.shadyLeftParticipants);
        this.Q1 = sharedInstance.getCallState();
        if (this.X0 == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.X0 = call;
            this.m2.c = call;
            this.X1.setGroupCall(call);
            this.l2.c = this.X0;
        }
        yg.h hVar = this.Z;
        if (hVar != null) {
            hVar.C0(this.d.getCurrentAccount(), this.X0.getInputGroupCall(false));
        }
        this.L.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.X0.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        i50 i50Var = this.S;
        if (i50Var == null || i50Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        M1(true);
        this.t1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.W0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        j50 j50Var = this.N;
        j50Var.setVisibility(0);
        org.telegram.ui.ActionBar.w0 w0Var = this.i1;
        w0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i50Var, (Property<i50, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i50Var, (Property<i50, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i50Var, (Property<i50, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.k5 k5Var = this.R;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.T;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(k5Var2, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(k5Var2, (Property<org.telegram.ui.ActionBar.k5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(k5Var2, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.nr.g);
        animatorSet.addListener(new x40(this, 0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j10, final boolean z4) {
        if (this.X0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.X0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.z20
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        c60 c60Var = c60.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new lh.j(c60Var, d2VarArr2, z4, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        c60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ci(c60Var, j11, d2VarArr2, user, 7));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey(this, d2VarArr, sendRequest, 25), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.v0 - dp;
        return (((((float) this.backgroundPaddingTop) + f10) > ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f10) == ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - f10) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
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
        j50 j50Var = this.N;
        if (j50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(j50Var);
        }
        r30 r30Var = this.j2;
        if (r30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(r30Var);
        }
        ArrayList arrayList = this.W1;
        arrayList.clear();
        arrayList.addAll(this.V1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        p40 p40Var = this.w0;
        if (p40Var != null) {
            p40Var.b(false, false);
            return;
        }
        if (this.c2) {
            d1(true);
        } else if (this.X1.b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z4) {
        ArrayList arrayList = this.W1;
        arrayList.clear();
        arrayList.addAll(this.V1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        p40 p40Var = this.w0;
        if (p40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        p40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f0;
        launchActivity.X0.add(this.s2);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomOpenAnimation() {
        B3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.a30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        this.Q1 = i10;
        N1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public final boolean q1() {
        return r1() && !this.X0.visibleVideoParticipants.isEmpty() && (this.X0.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.X0.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean r1() {
        ChatObject.Call call = this.X0;
        return call != null && call.call.rtmp_stream;
    }

    public final void s1(org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, boolean z4) {
        if (this.t0) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f0.O().getFragmentStack().get(this.f0.O().getFragmentStack().size() - 1);
        if (p2Var instanceof xn) {
            boolean P9 = ((xn) p2Var).P9();
            this.t0 = true;
            this.u0 = true;
            AndroidUtilities.runOnUIThread(new cg.u0(g3Var, editTextBoldCursor, z4, d2Var, 16), P9 ? 200L : 0L);
            return;
        }
        this.t0 = true;
        this.u0 = true;
        if (g3Var != null) {
            g3Var.setFocusable(true);
        } else if (d2Var != null) {
            d2Var.k(true);
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new ch(2, editTextBoldCursor), 100L);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.g1.a0.S) {
            org.telegram.ui.Components.voip.g1.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u1(String str, String str2, boolean z4, boolean z10) {
        boolean z11;
        String str3;
        String str4;
        String str5;
        if (r1() && str != null) {
            str2 = null;
        }
        if (z10) {
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
        LaunchActivity launchActivity = this.f0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(this.f0.O().getFragmentStack().size() - 1);
            if (p2Var instanceof xn) {
                z11 = ((xn) p2Var).P9();
                this.u0 = true;
                this.t0 = true;
                if (str == null && str2 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                if (str3 == null || !z4) {
                    str5 = str4;
                } else {
                    str5 = ChatObject.isChannelOrGiga(this.W0) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                }
                y40 y40Var = new y40(this, getContext(), str5, str3, str4, str3);
                this.o0 = y40Var;
                y40Var.p0 = new h(this, 20);
                y40Var.setOnDismissListener(new s20(this, 3));
                AndroidUtilities.runOnUIThread(new p20(this, 7), !z11 ? 200L : 0L);
            }
        }
        z11 = false;
        if (str == null) {
        }
        str3 = str;
        str4 = str2;
        if (str3 == null) {
        }
        str5 = str4;
        y40 y40Var2 = new y40(this, getContext(), str5, str3, str4, str3);
        this.o0 = y40Var2;
        y40Var2.p0 = new h(this, 20);
        y40Var2.setOnDismissListener(new s20(this, 3));
        AndroidUtilities.runOnUIThread(new p20(this, 7), !z11 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.X0;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
        d2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.X0.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ba(this, d2Var, exportgroupcallinvite, 12));
    }

    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        String str;
        TextView textView;
        VoIPService voIPService;
        int i11;
        String str2;
        String str3;
        EditText editText;
        int i12;
        float f10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
        int i13 = 5;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            if (i10 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().k(0L, 30, user, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i14 = org.telegram.ui.ActionBar.j6.pg;
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.F = i14;
            TextView textView2 = new TextView(getContext());
            int i15 = org.telegram.ui.ActionBar.j6.hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
            p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(p9Var, k7.b6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            z8Var.j(this.currentAccount, user);
            boolean z4 = user instanceof TLRPC.User;
            if (z4) {
                TLRPC.User user2 = (TLRPC.User) user;
                p9Var.e(user2, z8Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                p9Var.e(chat, z8Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.W0;
            String str4 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                b.o(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                b.o(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.W0)) {
                    b.o(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    b.o(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView3, k7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupUserRemove), new qs(10, this, user));
            } else if (z4) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupAdd), new e3.f(this, (TLRPC.User) user, j10, 7));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
            d2Var.show();
            if (i10 != 2 || (textView = (TextView) d2Var.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vg, false));
            return;
        }
        if (i10 == 6) {
            this.f0.K0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.f0.p0(new xn(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.f0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f0.O().getFragmentStack().get(this.f0.O().getFragmentStack().size() - 1);
            if ((p2Var instanceof xn) && ((xn) p2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.f0.p0(new xn(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            J1(2, true);
            return;
        }
        int i16 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.w40 w40Var = this.e2;
            if (w40Var == null || !w40Var.h()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.w40 w40Var2 = new org.telegram.ui.Components.w40(0, true, true);
                this.e2 = w40Var2;
                w40Var2.E = true;
                w40Var2.O = true;
                w40Var2.D = true;
                w40Var2.G = true;
                w40Var2.P = true;
                w40Var2.a = this.f0.O().getLastFragment();
                org.telegram.ui.Components.w40 w40Var3 = this.e2;
                k50 k50Var = new k50(this, j10);
                this.f2 = k50Var;
                w40Var3.b = k50Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                w40Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new p20(this, i16), new dg.e0(i13), 0);
                return;
            }
            return;
        }
        if (i10 == 10) {
            String str5 = groupCallParticipant.about;
            Context context = getContext();
            int i17 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.z4.a;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
            final org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string;
            d2Var2.Q = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            if (j10 < 0) {
                i12 = i17;
                f10 = 8.0f;
                long j11 = -j10;
                if (MessagesController.getInstance(i17).getChatFull(j11) == null) {
                    MessagesController.getInstance(i12).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                }
            } else {
                i12 = i17;
                f10 = 8.0f;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i18 = org.telegram.ui.ActionBar.j6.hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.j6.S(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i19 = j10 > 0 ? 70 : 255;
            editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.k3(i19, context, numberTextView)});
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            numberTextView.setImportantForAccessibility(2);
            frameLayout2.addView(numberTextView, k7.b6.d(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f10), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f10));
            editText2.addTextChangedListener(new org.telegram.ui.Components.hq(i19, numberTextView));
            AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
            editText2.setText(str5);
            editText2.setSelection(editText2.getText().toString().length());
            alertDialog$Builder2.n(frameLayout2);
            final k3.d dVar = new k3.d(editText2, i12, j10, 2);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Save), dVar);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            d2Var2.K = new org.telegram.ui.Components.p1(editText2, 1 == true ? 1 : 0);
            frameLayout2.addView(editText2, k7.b6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            AndroidUtilities.showKeyboard(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.t1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                    if (i20 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                        if (d2Var3.isShowing()) {
                            dVar.i(d2Var3, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            d2Var2.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
            d2Var2.show();
            d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            return;
        }
        if (i10 != 11) {
            if (i10 == 5) {
                sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().m(0L, user, 35);
                sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                return;
            }
            if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                voIPService = sharedInstance;
                i11 = 1;
                voIPService.editCallMember(user, Boolean.FALSE, null, null, null, null);
            } else {
                groupCallParticipant.volume = 10000;
                groupCallParticipant.volume_by_admin = false;
                voIPService = sharedInstance;
                i11 = 1;
                voIPService.editCallMember(user, Boolean.FALSE, null, 10000, null, null);
            }
            voIPService.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
            k1().k(0L, i10 == i11 ? 31 : 36, user, null, null, null);
            return;
        }
        Context context2 = getContext();
        int i20 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.z4.a;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user3 = MessagesController.getInstance(i20).getUser(Long.valueOf(j10));
            str2 = user3.first_name;
            str3 = user3.last_name;
        } else {
            str2 = MessagesController.getInstance(i20).getChat(Long.valueOf(-j10)).title;
            str3 = null;
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
        d2Var3.O = string2;
        LinearLayout f11 = org.telegram.messenger.y3.f(context2, 1);
        EditText editText3 = new EditText(context2);
        int i21 = org.telegram.ui.ActionBar.j6.hg;
        editText3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(LocaleController.isRTL ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(j10 > 0 ? 5 : 6);
        editText3.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
        editText3.setBackground(org.telegram.ui.ActionBar.j6.S(context2));
        editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        editText3.requestFocus();
        if (j10 > 0) {
            editText = new EditText(context2);
            editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString(R.string.LastName));
            editText.setBackground(org.telegram.ui.ActionBar.j6.S(context2));
            editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        } else {
            editText = null;
        }
        AndroidUtilities.showKeyboard(editText3);
        f11.addView(editText3, k7.b6.t(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            f11.addView(editText, k7.b6.t(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder3.n(f11);
        org.telegram.ui.ActionBar.c2 s1Var = new org.telegram.ui.Components.s1(editText3, j10, i20, editText);
        alertDialog$Builder3.k(LocaleController.getString(R.string.Save), s1Var);
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        d2Var3.K = new gg.g(5, editText3, editText);
        d2Var3.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false));
        d2Var3.show();
        d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
        yd ydVar = new yd(1 == true ? 1 : 0, d2Var3, s1Var);
        if (editText != null) {
            editText.setOnEditorActionListener(ydVar);
        } else {
            editText3.setOnEditorActionListener(ydVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(boolean z4, org.telegram.ui.Cells.e4 e4Var) {
        float f10;
        float f11;
        final float f12;
        int measuredHeight;
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z10 = this.Y2;
        x30 x30Var = this.b;
        j50 j50Var = this.N;
        if (z10) {
            f12 = (j50Var.getX() + (e4Var.getX() + e4Var.getAvatarImageView().getX())) - paddingLeft;
            f11 = (j50Var.getY() + (e4Var.getY() + e4Var.getAvatarImageView().getY())) - paddingTop;
            f10 = e4Var.getAvatarImageView().getMeasuredHeight() / j50Var.getMeasuredWidth();
            measuredHeight = (int) ((e4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f10);
        } else {
            if (this.W2 == null) {
                this.L2 = true;
            } else {
                this.L2 = z4 || x30Var.A0.k(x30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.V2;
            v30 v30Var = this.X1;
            if (lVar == null || !this.L2) {
                org.telegram.ui.Components.s20 s20Var = this.X2;
                if (s20Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.W2;
                    r30 r30Var = this.j2;
                    if (tVar3 == null) {
                        float x10 = (v30Var.getX() + (r30Var.getX() + (this.X2.getX() + s20Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y10 = (v30Var.getY() + (r30Var.getY() + (this.X2.getY() + this.X2.getAvatarImageView().getY()))) - paddingTop;
                        f10 = this.X2.getAvatarImageView().getMeasuredHeight() / j50Var.getMeasuredWidth();
                        measuredHeight = (int) ((this.X2.getAvatarImageView().getMeasuredHeight() >> 1) / f10);
                        f11 = y10;
                        f12 = x10;
                        if (!this.L2 && (tVar = this.W2) != null) {
                            tVar.invalidate();
                            v30Var.invalidate();
                            org.telegram.ui.Components.voip.t tVar4 = this.W2;
                            tVar4.h = false;
                            tVar4.j(false);
                            this.W2 = null;
                        }
                    } else if (this.L2) {
                        f12 = (v30Var.getX() + (r30Var.getX() + s20Var.getX())) - paddingLeft;
                        f11 = (v30Var.getY() + (r30Var.getY() + this.X2.getY())) - paddingTop;
                    }
                }
                f10 = 0.96f;
                f11 = 0.0f;
                f12 = 0.0f;
                measuredHeight = 0;
                if (!this.L2) {
                    tVar.invalidate();
                    v30Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar42 = this.W2;
                    tVar42.h = false;
                    tVar42.j(false);
                    this.W2 = null;
                }
            } else {
                float x11 = (j50Var.getX() + lVar.getX()) - paddingLeft;
                f11 = ((j50Var.getY() + this.V2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                f12 = x11;
            }
            f10 = 1.0f;
            measuredHeight = 0;
            if (!this.L2) {
            }
        }
        final float f13 = f11;
        final float f14 = f10;
        w30 w30Var = this.A2;
        if (z4) {
            y30 y30Var = this.z2;
            y30Var.setScaleX(f14);
            y30Var.setScaleY(f14);
            y30Var.setTranslationX(f12);
            y30Var.setTranslationY(f13);
            w30Var.setAlpha(0.0f);
        }
        x30Var.N(measuredHeight, measuredHeight);
        if (this.d2) {
            a40 a40Var = this.Y1;
            if (z4) {
                a40Var.setAlpha(0.0f);
            }
            a40Var.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(220L).start();
        }
        w30Var.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(220L).start();
        if (!z4 && (tVar2 = this.W2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (x30Var.A0.k(x30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.W2.a;
                oVar.B = false;
                oVar.C = 0L;
                this.V2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
        final int i10 = measuredHeight;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.v20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c60.p(c60.this, f14, f12, f13, i10, valueAnimator);
            }
        });
        this.a3 = this.d.getNotificationCenter().setAnimationInProgress(this.a3, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar5 = this.V2 != null ? this.W2 : null;
        if (tVar5 != null) {
            tVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, tVar5, z4, 8));
        if (this.Y2 || this.W2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.setDuration(220L);
            this.W2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.o oVar2 = this.W2.a;
            if (oVar2.B) {
                oVar2.D.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        S0();
    }

    public final void z1() {
        z5 z5Var = this.x2;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (!this.w2 || this.R0 == null || VoIPService.getSharedInstance() == null || !r1() || this.N == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(z5Var, 30L);
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
