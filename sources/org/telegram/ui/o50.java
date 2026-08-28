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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, td.b {
    public static boolean A3;
    public static boolean B3;
    public static boolean C3;
    public static volatile DispatchQueue D3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean E3;
    public static o50 z3;
    public final Paint A;
    public final ArrayList A0;
    public org.telegram.ui.Components.b30 A1;
    public LinearLayout A2;
    public final r30 B;
    public final ArrayList B0;
    public int B1;
    public boolean B2;
    public final q30 C;
    public final ArrayList C0;
    public boolean C1;
    public final org.telegram.ui.Components.mi0 C2;
    public final o30 D;
    public final ArrayList D0;
    public boolean D1;
    public int D2;
    public final ImageView E;
    public int E0;
    public final Paint E1;
    public boolean E2;
    public final ImageView F;
    public final org.telegram.ui.Components.mi0 F0;
    public final Paint F1;
    public final View F2;
    public org.telegram.ui.Components.uj0 G;
    public final org.telegram.ui.Components.mi0 G0;
    public final n50[] G1;
    public final View G2;
    public final s40 H;
    public boolean H0;
    public float H1;
    public GradientDrawable H2;
    public final org.telegram.ui.Components.j6 I;
    public final org.telegram.ui.Components.t9 I0;
    public n50 I1;
    public final int[] I2;
    public final z20 J;
    public final org.telegram.ui.Components.t9 J0;
    public n50 J1;
    public final d30 J2;
    public final k40 K;
    public float K0;
    public long K1;
    public boolean K2;
    public final i50 L;
    public float L0;
    public float L1;
    public boolean L2;
    public final u40 M;
    public float M0;
    public float M1;
    public RenderNode M2;
    public final x30 N;
    public RadialGradient N0;
    public boolean N1;
    public float N2;
    public final TextView O;
    public final Matrix O0;
    public boolean O1;
    public boolean O2;
    public final v30 P;
    public final Paint P0;
    public int P1;
    public final String[] P2;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final d50 Q0;
    public float Q1;
    public ObjectAnimator Q2;
    public final t40 R;
    public float R0;
    public int R1;
    public ObjectAnimator R2;
    public final org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public boolean S1;
    public final d40 S2;
    public final c50 T;
    public ValueAnimator T0;
    public final int[] T1;
    public org.telegram.ui.Cells.e4 T2;
    public final org.telegram.ui.Components.az U;
    public TLRPC.InputPeer U0;
    public final ArrayList U1;
    public org.telegram.ui.Components.voip.l U2;
    public final ImageReceiver V;
    public TLRPC.Chat V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.t V2;
    public int W;
    public ChatObject.Call W0;
    public final g30 W1;
    public org.telegram.ui.Components.b20 W2;
    public final ImageView X;
    public final boolean X0;
    public final l30 X1;
    public boolean X2;
    public final tg.i Y;
    public final String Y0;
    public final y30 Y1;
    public boolean Y2;
    public final int Z;
    public final j50 Z0;
    public float Z1;
    public int Z2;
    public final RadialProgressView a0;
    public final y20 a1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a2;
    public AnimatorSet a3;
    public final i30 b;
    public final Drawable b0;
    public final a30 b1;
    public boolean b2;
    public o40 b3;
    public final m20 c;
    public final View c0;
    public final Paint c1;
    public boolean c2;
    public int c3;
    public final AccountInstance d;
    public AnimatorSet d0;
    public ValueAnimator d1;
    public org.telegram.ui.Components.e40 d2;
    public int d3;
    public final s20 e;
    public LaunchActivity e0;
    public float e1;
    public w40 e2;
    public int e3;
    public final org.telegram.ui.Components.voip.u2 f;
    public final UndoView[] f0;
    public final LinearLayout f1;
    public Boolean f2;
    public int f3;
    public final org.telegram.ui.Cells.k g0;
    public final org.telegram.ui.ActionBar.w0 g1;
    public int g2;
    public int g3;
    public final org.telegram.ui.Components.voip.u2 h;
    public boolean h0;
    public final org.telegram.ui.ActionBar.w0 h1;
    public boolean h2;
    public int h3;
    public org.telegram.ui.Components.s30 i0;
    public final org.telegram.ui.ActionBar.w0 i1;
    public final c30 i2;
    public int i3;
    public org.telegram.ui.Components.s30 j0;
    public final org.telegram.ui.ActionBar.g1 j1;
    public final org.telegram.ui.Components.wk0 j2;
    public int j3;
    public int k0;
    public final org.telegram.ui.ActionBar.g1 k1;
    public final u50 k2;
    public int k3;
    public z40 l0;
    public final org.telegram.ui.ActionBar.g1 l1;
    public final org.telegram.ui.Components.c20 l2;
    public int l3;
    public final ArrayList m0;
    public final org.telegram.ui.ActionBar.g1 m1;
    public ViewTreeObserver.OnPreDrawListener m2;
    public int m3;
    public final org.telegram.ui.Components.voip.u2 n;
    public j40 n0;
    public final org.telegram.ui.ActionBar.g1 n1;
    public final org.telegram.ui.Components.voip.h n2;
    public int n3;
    public boolean o0;
    public final org.telegram.ui.ActionBar.g1 o1;
    public boolean o2;
    public int o3;
    public long p0;
    public final org.telegram.ui.ActionBar.g1 p1;
    public final ArrayList p2;
    public int p3;
    public boolean q0;
    public final org.telegram.ui.ActionBar.g1 q1;
    public boolean q2;
    public int q3;
    public final org.telegram.ui.Components.voip.u2 r;
    public final RectF r0;
    public final org.telegram.ui.ActionBar.g1 r1;
    public final b20 r2;
    public int r3;
    public final org.telegram.ui.Components.voip.u2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.g1 s1;
    public final w20 s2;
    public final p40 s3;
    public boolean t0;
    public final org.telegram.ui.ActionBar.g1 t1;
    public final org.telegram.ui.Components.hc t2;
    public Boolean t3;
    public float u0;
    public final org.telegram.ui.ActionBar.g1 u1;
    public final b20 u2;
    public Integer u3;
    public final org.telegram.ui.Components.voip.u2 v;
    public a40 v0;
    public final LinearLayout v1;
    public boolean v2;
    public final td.a v3;
    public final org.telegram.ui.Components.voip.u2 w;
    public TLRPC.Peer w0;
    public final TextView w1;
    public final v5 w2;
    public final td.a w3;
    public final t20 x;
    public TLObject x0;
    public final m50 x1;
    public final LongSparseIntArray x2;
    public final td.c x3;
    public final ImageView y;
    public final Paint y0;
    public final xg.i y1;
    public final j30 y2;
    public final td.a y3;
    public final ArrayList z0;
    public b20 z1;
    public final h30 z2;

    public o50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super(launchActivity, null, true, true);
        String string;
        int i9;
        final o50 o50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.A = new Paint(1);
        this.f0 = new UndoView[2];
        this.m0 = new ArrayList();
        this.r0 = new RectF();
        this.y0 = new Paint(1);
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.y1 = new xg.i(new b20(this, 8));
        int i10 = 0;
        this.B1 = 0;
        this.C1 = false;
        this.E1 = new Paint(7);
        this.F1 = new Paint(7);
        this.G1 = new n50[8];
        this.H1 = 1.0f;
        this.S1 = true;
        this.T1 = new int[4];
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.n2 = new org.telegram.ui.Components.voip.h();
        this.p2 = new ArrayList();
        this.r2 = new b20(this, i10);
        this.s2 = new w20(this);
        this.t2 = new org.telegram.ui.Components.hc(22);
        this.u2 = new b20(this, 1);
        this.v2 = false;
        this.w2 = new v5(this, 6);
        this.x2 = new LongSparseIntArray();
        this.I2 = new int[2];
        this.L2 = true;
        this.P2 = new String[2];
        this.Z2 = -1;
        this.s3 = new p40(this);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        this.v3 = new td.a(2, this, grVar, 350L);
        this.w3 = new td.a(3, this, grVar, 220L, true);
        this.x3 = new td.c(4, this, grVar, 350L);
        this.y3 = new td.a(5, this, grVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.W0 = call;
        this.U0 = inputPeer;
        this.V0 = chat;
        this.Y0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.X0 = z10;
        this.resourcesProvider = new ih.j0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.Z = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        C3 = false;
        B3 = false;
        E3 = false;
        setDelegate(new s30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.S2 = new d40(this);
        setOnDismissListener(new e20(this, i10));
        setDimBehindAlpha(75);
        i50 i50Var = new i50(this, launchActivity);
        this.L = i50Var;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(true);
        int i11 = org.telegram.ui.ActionBar.f6.qg;
        hpVar.b(org.telegram.ui.ActionBar.f6.u0(i11));
        hpVar.d();
        k40 k40Var = new k40(this, launchActivity, hpVar);
        this.K = k40Var;
        k40Var.setSubtitle("");
        k40Var.getSubtitleTextView().setVisibility(0);
        k40Var.l();
        k40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(k40Var.getAdditionalSubtitleTextView(), this.q2, 1.0f, false);
        k40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.f6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.f6.lg;
        k40Var.setSubtitleColor(org.telegram.ui.ActionBar.f6.u0(i12));
        k40Var.setBackButtonImage(R.drawable.ic_ab_back);
        k40Var.setOccupyStatusBar(false);
        k40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.f6.hg;
        k40Var.C(org.telegram.ui.ActionBar.f6.u0(i13), false);
        k40Var.A(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.z8), false);
        k40Var.setTitleColor(org.telegram.ui.ActionBar.f6.u0(i13));
        k40Var.setSubtitleColor(org.telegram.ui.ActionBar.f6.u0(i12));
        k40Var.setActionBarMenuOnItemClick(new r40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.w0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.w0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.w0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.w0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new y10(this, 3);
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
        this.b0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.voip_filled, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.F0 = mi0Var;
        this.G0 = new org.telegram.ui.Components.mi0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        s40 s40Var = new s40(this, launchActivity);
        this.H = s40Var;
        this.containerView = s40Var;
        s40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.V = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.Q = h5Var;
            h5Var.setGravity(17);
            h5Var.setTextColor(-1);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(18);
            h5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(h5Var, g7.e6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            t40 t40Var = new t40(this, launchActivity);
            this.R = t40Var;
            t40Var.setGravity(17);
            t40Var.setTextColor(-1);
            t40Var.setTypeface(AndroidUtilities.bold());
            t40Var.setTextSize(60);
            this.containerView.addView(t40Var, g7.e6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.S = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, g7.e6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            d50 d50Var = new d50(this, launchActivity);
            this.Q0 = d50Var;
            this.containerView.addView(d50Var, g7.e6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        u40 u40Var = new u40(this, launchActivity);
        this.M = u40Var;
        u40Var.setClipToPadding(false);
        u40Var.setClipChildren(false);
        c50 c50Var = new c50(this);
        this.T = c50Var;
        c50Var.o = grVar;
        c50Var.d = 350L;
        c50Var.c = 350L;
        c50Var.e = 350L;
        c50Var.S();
        u40Var.setItemAnimator(c50Var);
        u40Var.setOnScrollListener(new l20(this));
        u40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(B3 ? 6 : 2, u40Var);
        this.U = azVar;
        u40Var.setLayoutManager(azVar);
        m20 m20Var = new m20(this);
        this.c = m20Var;
        azVar.z1(m20Var);
        u40Var.i(new n20(this));
        azVar.C1();
        this.containerView.addView(u40Var, g7.e6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        u40Var.setAdapter(i50Var);
        u40Var.setTopBottomSelectorRadius(13);
        u40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.eg));
        u40Var.setOnItemClickListener(new a7(this, launchActivity, call, 14));
        u40Var.setOnItemLongClickListener(new y10(this, 4));
        if (r1()) {
            m50 m50Var = new m50(this, getContext());
            this.x1 = m50Var;
            this.containerView.addView(m50Var, g7.e6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(launchActivity);
        this.j2 = wk0Var;
        this.containerView.addView(wk0Var, g7.e6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        u50 u50Var = new u50(call, this.currentAccount, this);
        this.k2 = u50Var;
        wk0Var.setAdapter(u50Var);
        f2.y yVar = new f2.y(6, false);
        wk0Var.setLayoutManager(yVar);
        yVar.z1(new p20(this));
        final int i15 = 1;
        wk0Var.setOnItemClickListener(new org.telegram.ui.Components.mk0(this) { // from class: org.telegram.ui.a20
            public final /* synthetic */ o50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.mk0
            public final void a(int i16, View view) {
                switch (i15) {
                    case 0:
                        o50 o50Var2 = this.b;
                        o50Var2.getClass();
                        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) view;
                        if (b20Var.getVideoParticipant() != null) {
                            o50Var2.e1(b20Var.getVideoParticipant());
                            break;
                        } else {
                            o50Var2.e1(new ChatObject.VideoParticipant(b20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        o50 o50Var3 = this.b;
                        o50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            o50Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        f2.n nVar = new f2.n();
        nVar.S();
        nVar.o = grVar;
        nVar.d = 350L;
        nVar.c = 350L;
        nVar.e = 350L;
        wk0Var.setItemAnimator(new q20(this));
        wk0Var.setOnScrollListener(new r20(this));
        u50Var.H(wk0Var, false, false);
        wk0Var.setVisibility(8);
        s20 s20Var = new s20(this, launchActivity);
        this.e = s20Var;
        int u02 = org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.O0 = new Matrix();
        this.N0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.P0 = paint;
        paint.setShader(this.N0);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(9);
        this.I0 = t9Var;
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(12);
        this.J0 = t9Var2;
        t9Var.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        t9Var.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        t9Var.b();
        t9Var2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        t9Var2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        t9Var2.b();
        int i16 = org.telegram.ui.ActionBar.f6.Ig;
        t9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.u0(i16), 38));
        t9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.u0(i16), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        s20Var.a(u2Var);
        u2Var.setOnClickListener(new z10(this, 7));
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
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(launchActivity);
        u2Var3.addView(pi0Var, g7.e6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.mi0 mi0Var2 = new org.telegram.ui.Components.mi0(R.raw.camera_flip, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.C2 = mi0Var2;
        pi0Var.setAnimation(mi0Var2);
        u2Var3.setOnClickListener(new z10(this, 10));
        s20Var.a(u2Var3);
        org.telegram.ui.Components.voip.u2 u2Var4 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.h = u2Var4;
        u2Var4.setCheckable(true);
        u2Var4.setTextSize(12);
        u2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i17 = R.drawable.filled_sound_on;
        this.W = i17;
        imageView.setImageResource(i17);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        u2Var4.addView(imageView, g7.e6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        u2Var4.setOnClickListener(new z10(this, 11));
        s20Var.a(u2Var4);
        s20Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i18 = 1;
        u2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d20
            public final /* synthetic */ o50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        o50.o(this.b, launchActivity);
                        break;
                    default:
                        o50 o50Var2 = this.b;
                        o50Var2.W1.e();
                        ChatObject.Call call2 = o50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            o50Var2.I1();
                            o50.t1(launchActivity, new b20(o50Var2, 5), false, false);
                            break;
                        } else {
                            o50Var2.dismiss();
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
        t20 t20Var = new t20(this, launchActivity);
        this.x = t20Var;
        t20Var.setAnimation(mi0Var);
        t20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(t20Var, g7.e6.e(50, 50, 49));
        s20Var.a(u2Var7);
        u2Var7.setOnClickListener(new v20(this));
        s20Var.a(u2Var6);
        s20Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, g7.e6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.W0 != null && r1() && !this.W0.isScheduled()) {
            imageView2.setVisibility(0);
            t20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.a0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.Og));
        k40Var.setAlpha(0.0f);
        k40Var.getBackButton().setScaleX(0.9f);
        k40Var.getBackButton().setScaleY(0.9f);
        k40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        k40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        k40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        k40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int u03 = org.telegram.ui.ActionBar.f6.u0(i13);
        int i19 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, u03);
        this.g1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new y10(this, i19));
        int i20 = org.telegram.ui.ActionBar.f6.ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.u0(i20), 6));
        w0Var.setOnClickListener(new z10(this, i19));
        w0Var.G(org.telegram.ui.ActionBar.f6.u0(i13), false);
        w0Var.G(org.telegram.ui.ActionBar.f6.u0(i13), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.u0(i13));
        this.h1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.u0(i20), 6));
        w0Var2.setOnClickListener(new z10(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.u0(i13));
        this.i1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.u0(i20), 6));
        w0Var3.setOnClickListener(new z10(this, 2));
        y20 y20Var = new y20(this, launchActivity, launchActivity);
        this.a1 = y20Var;
        z20 z20Var = new z20(launchActivity);
        this.J = z20Var;
        z20Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        paint2.setColor(-12761513);
        a30 a30Var = new a30(this, getContext());
        this.b1 = a30Var;
        a30Var.setTextColor(getThemedColor(i13));
        a30Var.setTextSize(1, 11.0f);
        a30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        a30Var.setMaxLines(1);
        a30Var.setGravity(17);
        a30Var.setTypeface(AndroidUtilities.bold());
        a30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        a30Var.setTag(-1);
        if (!r1()) {
            a30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(y20Var, g7.e6.l(1.0f, 0, -2));
        linearLayout.addView(a30Var, g7.e6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(z20Var, g7.e6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, g7.e6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(k40Var, g7.e6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.v1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, g7.e6.n(48, 48));
        linearLayout2.addView(w0Var2, g7.e6.n(48, 48));
        linearLayout2.addView(w0Var, g7.e6.n(48, 48));
        this.containerView.addView(linearLayout2, g7.e6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.c0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.V5));
        this.containerView.addView(view, g7.e6.c(1.0f, -1));
        for (int i21 = 0; i21 < 2; i21++) {
            this.f0[i21] = new b30(this, launchActivity);
            this.f0[i21].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f0[i21].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f0[i21], g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.g0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.g1.h(kVar, AndroidUtilities.dp(48.0f));
        this.g1.setShowSubmenuByMove(false);
        int i22 = org.telegram.ui.ActionBar.f6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.u0(i22), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.g1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.i0);
        this.q1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.g1;
        org.telegram.ui.ActionBar.g1 d9 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.i0);
        this.r1 = d9;
        d9.j(false, true);
        int i23 = org.telegram.ui.ActionBar.f6.wg;
        d.setCheckColor(i23);
        d.c(org.telegram.ui.ActionBar.f6.u0(i23), org.telegram.ui.ActionBar.f6.u0(i23));
        d9.setCheckColor(i23);
        d9.c(org.telegram.ui.ActionBar.f6.u0(i23), org.telegram.ui.ActionBar.f6.u0(i23));
        Paint paint3 = new Paint(1);
        int i24 = org.telegram.ui.ActionBar.f6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.f6.u0(i24));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.g1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.i0);
        this.l1 = d10;
        d10.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.g1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.i0);
        this.m1 = d11;
        d11.setItemHeight(56);
        TextView b10 = this.g1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.gg), -16777216));
        this.w1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.g1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var8.d(6, R.drawable.msg_edit, this.Z0, LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.i0);
        this.k1 = d12;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.g1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var9.d(7, R.drawable.msg_permissions, this.Z0, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.i0);
        this.n1 = d13;
        org.telegram.ui.ActionBar.g1 e10 = this.g1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.j1 = e10;
        j50 j50Var = new j50();
        this.Z0 = j50Var;
        org.telegram.ui.ActionBar.g1 e11 = this.g1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.p1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.g1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var10.d(5, 0, j50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.i0);
        this.o1 = d14;
        j50Var.a(d14.getImageView());
        org.telegram.ui.ActionBar.g1 e12 = this.g1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.t1 = e12;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e13 = this.g1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.u1 = e13;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.g1;
        int i25 = R.drawable.msg_cancel;
        if (o1()) {
            i9 = i24;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i9 = i24;
        }
        org.telegram.ui.ActionBar.g1 e14 = w0Var11.e(4, i25, string);
        this.s1 = e14;
        this.g1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.f6.u0(i22));
        this.g1.getPopupLayout().setFitItems(true);
        e12.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        e13.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d10.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d11.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        int i26 = org.telegram.ui.ActionBar.f6.vg;
        e14.c(org.telegram.ui.ActionBar.f6.u0(i26), org.telegram.ui.ActionBar.f6.u0(i26));
        e10.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d12.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d13.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d14.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        e11.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        if (this.W0 != null) {
            l1();
        }
        if (o1()) {
            this.l0 = new z40();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.l0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.K.getTitleTextView().setOnClickListener(new z10(this, 3));
        c30 c30Var = new c30(this, launchActivity);
        this.i2 = c30Var;
        d30 d30Var = new d30(this);
        this.J2 = d30Var;
        final int i27 = 0;
        c30Var.setClipToPadding(false);
        d30Var.S();
        d30Var.o = org.telegram.ui.Components.gr.f;
        d30Var.d = 350L;
        d30Var.c = 350L;
        d30Var.e = 350L;
        c30Var.setItemAnimator(d30Var);
        c30Var.setOnScrollListener(new e30(this));
        c30Var.setClipChildren(false);
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        c30Var.setLayoutManager(m0Var);
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(call, this.currentAccount, this);
        this.l2 = c20Var;
        c30Var.setAdapter(c20Var);
        c20Var.F(c30Var, false);
        c30Var.setOnItemClickListener(new org.telegram.ui.Components.mk0(this) { // from class: org.telegram.ui.a20
            public final /* synthetic */ o50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.mk0
            public final void a(int i162, View view2) {
                switch (i27) {
                    case 0:
                        o50 o50Var2 = this.b;
                        o50Var2.getClass();
                        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) view2;
                        if (b20Var.getVideoParticipant() != null) {
                            o50Var2.e1(b20Var.getVideoParticipant());
                            break;
                        } else {
                            o50Var2.e1(new ChatObject.VideoParticipant(b20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        o50 o50Var3 = this.b;
                        o50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            o50Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        c30Var.setOnItemLongClickListener(new y10(this, 1));
        c30Var.setVisibility(8);
        c30Var.i(new f30());
        int i28 = 4;
        g30 g30Var = new g30(this, launchActivity, this.M, c30Var, this.U1, this.W0, this);
        this.W1 = g30Var;
        g30Var.setClipChildren(false);
        c20Var.E(this.U1, g30Var);
        if (this.j2 != null) {
            this.k2.G(this.U1, g30Var);
        }
        h30 h30Var = new h30(this, launchActivity);
        this.z2 = h30Var;
        i30 i30Var = new i30(this, launchActivity, this.K, this.M, h30Var);
        this.b = i30Var;
        i30Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        i30Var.setInvalidateWithParent(true);
        h30Var.setProfileGalleryView(i30Var);
        j30 j30Var = new j30(this, launchActivity);
        this.y2 = j30Var;
        j30Var.setVisibility(8);
        i30Var.setVisibility(0);
        i30Var.b(new k30(this));
        l30 l30Var = new l30(this, launchActivity);
        this.X1 = l30Var;
        this.containerView.addView(g30Var);
        g30Var.addView(c30Var, g7.e6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.F2 = view2;
        int[] iArr = this.I2;
        iArr[0] = this.R1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.I2);
        this.H2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, g7.e6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.G2 = view3;
        view3.setBackgroundColor(this.I2[0]);
        this.containerView.addView(view3, g7.e6.e(-1, 0, 83));
        tg.i iVar = new tg.i(launchActivity);
        this.Y = iVar;
        iVar.setDelegate(new m30(this));
        iVar.setClickCellDelegate(new n30(this));
        if (this.W0 != null) {
            iVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.containerView.addView(iVar, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(launchActivity, false, true, true);
        this.I = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        j6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        o30 o30Var = new o30(this, launchActivity, this.H, LaunchActivity.R(), this.resourcesProvider);
        this.D = o30Var;
        o30Var.F = true;
        o30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Z)});
        o30Var.getEditText().setLinkTextColor(-11683585);
        o30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        o30Var.getEditText().addTextChangedListener(new p30(this));
        o30Var.s();
        q30 q30Var = new q30(this, launchActivity);
        this.C = q30Var;
        this.containerView.addView(q30Var, g7.e6.c(-1.0f, -1));
        r30 r30Var = new r30(launchActivity);
        this.B = r30Var;
        r30Var.addView(o30Var, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        r30Var.addView(j6Var, g7.e6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        j6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(r30Var, g7.e6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.F = imageView3;
        int i29 = org.telegram.ui.ActionBar.f6.i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i29), 1, -1));
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new z10(this, i28));
        ImageView imageView4 = new ImageView(launchActivity);
        this.E = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i29), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new z10(this, 5));
        r30Var.addView(imageView3, g7.e6.e(48, 48, 85));
        r30Var.addView(imageView4, g7.e6.e(48, 48, 85));
        this.containerView.addView(l30Var);
        j30Var.addView(i30Var, g7.e6.c(-1.0f, -1));
        j30Var.addView(h30Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(j30Var, g7.e6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.L.l();
        if (C3) {
            this.k2.I(this.j2, false);
        }
        this.E0 = this.L.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.O = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.V0) && (chat2 = this.V0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, g7.e6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(launchActivity);
            bc0Var.setTextColor(-1);
            bc0Var.setSelectorColor(-9598483);
            bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            bc0Var.setItemCount(5);
            t30 t30Var = new t30(launchActivity);
            t30Var.setItemCount(5);
            t30Var.setTextColor(-1);
            t30Var.setSelectorColor(-9598483);
            t30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            u30 u30Var = new u30(launchActivity);
            u30Var.setItemCount(5);
            u30Var.setTextColor(-1);
            u30Var.setSelectorColor(-9598483);
            u30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            v30 v30Var = new v30(launchActivity);
            this.P = v30Var;
            v30Var.setLines(1);
            v30Var.setSingleLine(true);
            v30Var.setEllipsize(TextUtils.TruncateAt.END);
            v30Var.setGravity(17);
            v30Var.setTextColor(-1);
            v30Var.setTypeface(AndroidUtilities.bold());
            v30Var.setTextSize(1, 14.0f);
            this.containerView.addView(v30Var, g7.e6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            v30Var.setOnClickListener(new org.telegram.messenger.video.g(this, bc0Var, t30Var, u30Var, chat, accountInstance, inputPeer2, 1));
            x30 x30Var = new x30(launchActivity, bc0Var, t30Var, u30Var);
            this.N = x30Var;
            x30Var.setWeightSum(1.0f);
            x30Var.setOrientation(0);
            this.containerView.addView(x30Var, g7.e6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i30 = calendar.get(1);
            int i31 = calendar.get(6);
            x30Var.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
            bc0Var.setMinValue(0);
            bc0Var.setMaxValue(365);
            bc0Var.setWrapSelectorWheel(false);
            bc0Var.setFormatter(new bg.f(currentTimeMillis, calendar, i30, 1));
            a1.d dVar = new a1.d(this, bc0Var, t30Var, u30Var, 13);
            o50Var = this;
            bc0Var.setOnValueChangedListener(dVar);
            t30Var.setMinValue(0);
            t30Var.setMaxValue(23);
            x30Var.addView(t30Var, g7.e6.l(0.2f, 0, 270));
            t30Var.setFormatter(new org.telegram.ui.Components.if0(23));
            t30Var.setOnValueChangedListener(dVar);
            u30Var.setMinValue(0);
            u30Var.setMaxValue(59);
            u30Var.setValue(0);
            u30Var.setFormatter(new org.telegram.ui.Components.if0(24));
            x30Var.addView(u30Var, g7.e6.l(0.3f, 0, 270));
            u30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i32 = calendar.get(6);
            int i33 = calendar.get(12);
            int i34 = calendar.get(11);
            bc0Var.setValue(i31 != i32 ? 1 : 0);
            u30Var.setValue(i33);
            t30Var.setValue(i34);
            org.telegram.ui.Components.y4.g(v30Var, textView, 0L, 604800L, 2, bc0Var, t30Var, u30Var);
        } else {
            o50Var = this;
        }
        y30 y30Var = new y30(o50Var, (ViewGroup) o50Var.getWindow().getDecorView(), o50Var.containerView);
        o50Var.Y1 = y30Var;
        y30Var.E = new z30(o50Var);
        i30Var.setPinchToZoomHelper(y30Var);
        final int i35 = 0;
        o50Var.n.setOnClickListener(new View.OnClickListener(o50Var) { // from class: org.telegram.ui.d20
            public final /* synthetic */ o50 b;

            {
                this.b = o50Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i35) {
                    case 0:
                        o50.o(this.b, launchActivity);
                        break;
                    default:
                        o50 o50Var2 = this.b;
                        o50Var2.W1.e();
                        ChatObject.Call call2 = o50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            o50Var2.I1();
                            o50.t1(launchActivity, new b20(o50Var2, 5), false, false);
                            break;
                        } else {
                            o50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        o50Var.L1(false);
        o50Var.I1();
        o50Var.M1(false);
        o50Var.N1(false, false);
        o50Var.B1(0.0f);
        o50Var.O1();
        o50Var.containerView.addView(new FrameLayout(launchActivity), g7.e6.e(-1, 200, 87));
        o50Var.v.setOnClickListener(new z10(o50Var, 6));
        o50Var.T0();
        g7.g6.a(o50Var.n);
        g7.g6.a(o50Var.r);
        g7.g6.a(o50Var.f);
        g7.g6.a(o50Var.h);
        g7.g6.a(o50Var.w);
        g7.g6.a(o50Var.s);
        g7.g6.a(o50Var.v);
        r0.j0.m(o50Var.containerView, new y10(o50Var, 2));
    }

    public static void A(o50 o50Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.oc(o50Var.topBulletinContainer, new ih.j0()).d0(tL_error, false);
                return;
            }
            return;
        }
        Context context = o50Var.getContext();
        int i9 = o50Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.b6 b6Var = o50Var.resourcesProvider;
        ChatObject.Call call = o50Var.W0;
        i9.n0(context, i9, inputGroupCall, str, b6Var, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public static void A0(o50 o50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (o50Var.j0 == null) {
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(o50Var.getContext(), 8);
            o50Var.j0 = s30Var;
            s30Var.setAlpha(0.0f);
            o50Var.j0.setVisibility(4);
            o50Var.j0.setShowingDuration(4000L);
            o50Var.containerView.addView(o50Var.j0, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            o50Var.j0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            o50Var.j0.d();
        }
        o50Var.j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        o50Var.j0.f(o50Var.w, true);
    }

    public static /* synthetic */ void C(o50 o50Var, int[] iArr, float[] fArr) {
        f2.q1 K;
        c30 c30Var = o50Var.i2;
        g30 g30Var = o50Var.W1;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            TLRPC.GroupCallParticipant groupCallParticipant = o50Var.W0.participantsBySources.get(iArr[i9]);
            if (groupCallParticipant != null) {
                if (g30Var.b) {
                    for (int i10 = 0; i10 < c30Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) c30Var.getChildAt(i10);
                        if (MessageObject.getPeerId(b20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            b20Var.setAmplitude(fArr[i9] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (o50Var.o0 ? o50Var.z0 : o50Var.W0.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = o50Var.M.K(indexOf + o50Var.L.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i9] * 15.0f);
                            if (view == o50Var.T2 && !o50Var.h2) {
                                o50Var.containerView.invalidate();
                            }
                        }
                    }
                }
                g30Var.k(groupCallParticipant, fArr[i9] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void D(o50 o50Var) {
        Editable text = o50Var.D.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(o50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        o50Var.A1(tL_textWithEntities);
    }

    public static void E0(o50 o50Var) {
        ChatObject.Call call = o50Var.W0;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = o50Var.W0.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(o50Var.W0.call.join_muted);
        ConnectionsManager connectionsManager = o50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new j20(o50Var, 1));
    }

    public static void F0(o50 o50Var, boolean z10) {
        if (o50Var.W0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = o50Var.W0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        o50Var.t3 = Boolean.valueOf(z10);
        o50Var.H1(true);
        ConnectionsManager connectionsManager = o50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new j20(o50Var, 0));
    }

    public static void G0(o50 o50Var) {
        int i9;
        if (!o50Var.r1()) {
            o50Var.isFullscreen = false;
            return;
        }
        g30 g30Var = o50Var.W1;
        boolean z10 = (!g30Var.R && g30Var.b && (B3 == o50Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = o50Var.f2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = o50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i9 = systemUiVisibility & (-7);
                o50Var.getWindow().clearFlags(1024);
                o50Var.setHideSystemVerticalInsets(false);
            } else {
                o50Var.setHideSystemVerticalInsets(true);
                i9 = systemUiVisibility | 6;
                o50Var.getWindow().addFlags(1024);
            }
            o50Var.containerView.setSystemUiVisibility(i9);
            o50Var.f2 = Boolean.valueOf(z10);
            o50Var.O2 = !z10;
            o50Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l H0(o50 o50Var) {
        u40 u40Var = o50Var.M;
        for (int i9 = 0; i9 < u40Var.getChildCount(); i9++) {
            View childAt = u40Var.getChildAt(i9);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void I0(o50 o50Var) {
        k40 k40Var = o50Var.K;
        u40 u40Var = o50Var.M;
        int childCount = u40Var.getChildCount();
        float f10 = 2.14748365E9f;
        for (int i9 = 0; i9 < childCount; i9++) {
            if (RecyclerView.R(u40Var.getChildAt(i9)) >= 0) {
                f10 = Math.min(f10, r8.getTop());
            }
        }
        if (f10 < 0.0f || f10 == 2.14748365E9f) {
            f10 = childCount != 0 ? 0.0f : u40Var.getPaddingTop();
        }
        int i10 = 1;
        boolean z10 = f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f10 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && k40Var.getTag() == null) || (!z10 && k40Var.getTag() != null)) {
            k40Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = o50Var.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
                o50Var.d0 = null;
            }
            o50Var.setUseLightStatusBar(k40Var.getTag() == null);
            ViewPropertyAnimator duration = k40Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            duration.setInterpolator(grVar).start();
            k40Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(grVar).start();
            ObjectAnimator objectAnimator = o50Var.Q2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                o50Var.Q2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = k40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.h5, Float>) property, k40Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            o50Var.Q2 = ofFloat;
            ofFloat.setDuration(300L);
            o50Var.Q2.setInterpolator(grVar);
            o50Var.Q2.addListener(new org.telegram.ui.Components.u9(29, o50Var, z10));
            o50Var.Q2.start();
            ObjectAnimator objectAnimator2 = o50Var.R2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k40Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            o50Var.R2 = ofFloat2;
            ofFloat2.setDuration(300L);
            o50Var.R2.setInterpolator(grVar);
            o50Var.R2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            o50Var.d0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = o50Var.d0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(k40Var, (Property<k40, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(o50Var.J, (Property<z20, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(o50Var.c0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            o50Var.d0.addListener(new i40(o50Var, i10));
            o50Var.d0.start();
            o50Var.W1.v.setClickable(!z10 || B3);
        }
        if (o50Var.u0 != dp) {
            o50Var.E1(dp);
        }
    }

    public static void M(o50 o50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (o50Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(o50Var.U1, o50Var.W1, lVar, null, null, lVar.getParticipant(), o50Var.W0, o50Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void R(o50 o50Var, int i9, int[] iArr) {
        if (o50Var.r1()) {
            int i10 = org.telegram.ui.ActionBar.f6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.zg, false), o50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kg, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false), o50Var.Q1, 1.0f);
        } else if (i9 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.yg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.zg, false), o50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.xg, false);
        } else if (i9 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Bg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Cg, false), o50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ag, false);
        } else if (p1(i9)) {
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.mh, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.f6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Mg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ng, false), o50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kg, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false), o50Var.Q1, 1.0f);
        }
        if (p1(i9)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ih, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kh, false));
        } else if (i9 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Fg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Jg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (z3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                z3 = new o50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                z3 = new o50(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            z3.e0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(21));
        }
    }

    public static String f1(int i9) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i9 == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i9 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioRoutingPhone) : LocaleController.getString(R.string.VoipAudioRoutingHeadset);
        }
        if (i9 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public static String g1(int i9) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i9 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str) : i9 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioSwitchedToPhone) : LocaleController.getString(R.string.VoipAudioSwitchedToHeadset) : LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public static /* synthetic */ void m(o50 o50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(declineconferencecallinvite, new i20(o50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(o50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = o50Var.W0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            o50Var.W0.invitedUsersMap.remove(l10);
            o50Var.W0.invitedUsersMessageIds.remove(l10);
            o50Var.O0(true);
        }
    }

    public static void n(final o50 o50Var, Activity activity, ChatObject.Call call, View view, int i9) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = o50Var.d;
        ArrayList arrayList = o50Var.B0;
        i50 i50Var = o50Var.L;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            o50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.e4) {
            o50Var.F1((org.telegram.ui.Cells.e4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l10 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.w3)) {
            if (i9 != i50Var.w) {
                if (i9 != i50Var.x) {
                    if (i9 == i50Var.y) {
                        o50Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = o50Var.W0;
                if (call2 == null || call2.call == null) {
                    return;
                }
                bg.g3 g3Var = new bg.g3(activity, o50Var.currentAccount, null, 4, new ih.j0());
                ChatObject.Call call3 = o50Var.W0;
                g3Var.y0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new k8(4)).collect(Collectors.toSet()) : null);
                g3Var.g0(false, true);
                g3Var.w0 = new b20(o50Var, 3);
                g3Var.g0(false, true);
                g3Var.z0 = new bg.y0(20, o50Var, call);
                g3Var.show();
                return;
            }
            if (ChatObject.isChannel(o50Var.V0) && (chat = o50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                o50Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(o50Var.i1());
            if (chatFull == null) {
                return;
            }
            o50Var.s0 = false;
            Context context = o50Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = o50Var.V0;
            ChatObject.Call call4 = o50Var.W0;
            org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            o50Var.A1 = b30Var;
            b30Var.setOnDismissListener(new e20(o50Var, 2));
            org.telegram.ui.Components.b30 b30Var2 = o50Var.A1;
            b30Var2.c0 = new o20(o50Var);
            b30Var2.show();
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        if (w3Var.getUser() == null) {
            return;
        }
        if (!o50Var.o1()) {
            o50Var.e0.K0(o50Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w3Var.getUser().id);
            if (w3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            o50Var.e0.p0(new ProfileActivity(bundle, null));
            o50Var.dismiss();
            return;
        }
        int i10 = i9 - i50Var.n;
        if (i10 < 0 || i10 >= o50Var.W0.shadyJoinParticipants.size()) {
            int i11 = i9 - i50Var.s;
            if (i11 < 0 || i11 >= o50Var.W0.shadyLeftParticipants.size()) {
                int i12 = i9 - i50Var.f;
                if (o50Var.o0) {
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i12);
                    }
                } else if (i12 >= 0 && i12 < o50Var.W0.invitedUsers.size()) {
                    l10 = o50Var.W0.invitedUsers.get(i12);
                }
                z10 = false;
            } else {
                l10 = o50Var.W0.shadyLeftParticipants.get(i9 - i50Var.s);
            }
        } else {
            l10 = o50Var.W0.shadyJoinParticipants.get(i9 - i50Var.n);
        }
        if (z10 || (invitedUser = o50Var.W0.invitedUsersMessageIds.get(l10)) == null) {
            return;
        }
        org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F(o50Var.container, o50Var.resourcesProvider, w3Var);
        final int i13 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(o50Var) { // from class: org.telegram.ui.g20
            public final /* synthetic */ o50 b;

            {
                this.b = o50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        o50.r(this.b, invitedUser, l10);
                        break;
                    default:
                        o50.m(this.b, invitedUser, l10);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i14 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(o50Var) { // from class: org.telegram.ui.g20
            public final /* synthetic */ o50 b;

            {
                this.b = o50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        o50.r(this.b, invitedUser, l10);
                        break;
                    default:
                        o50.m(this.b, invitedUser, l10);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), o50Var.y0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void o(o50 o50Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = o50Var.e0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            o50Var.e0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            o50Var.N1(true, false);
            o50Var.M1(false);
            o50Var.W0.sortParticipants();
            o50Var.O0(true);
            o50Var.e.requestLayout();
            return;
        }
        o50Var.f0[0].e(1, false);
        if (o50Var.v0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            a40 a40Var = new a40(o50Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            o50Var.v0 = a40Var;
            a40Var.setBottomPadding(o50Var.containerView.getPaddingBottom());
            o50Var.container.addView(o50Var.v0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static /* synthetic */ void p(o50 o50Var, float f10, float f11, float f12, int i9, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o50Var.Z1 = floatValue;
        o50Var.W1.n = floatValue;
        float f13 = (floatValue * 1.0f) + ((1.0f - floatValue) * f10);
        j30 j30Var = o50Var.y2;
        j30Var.setScaleX(f13);
        j30Var.setScaleY(f13);
        j30Var.setTranslationX((1.0f - o50Var.Z1) * f11);
        j30Var.setTranslationY((1.0f - o50Var.Z1) * f12);
        if (!o50Var.c2) {
            o50Var.S2.setAlpha((int) (o50Var.Z1 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = o50Var.V2;
        if (tVar != null) {
            tVar.a.setRoundCorners((1.0f - o50Var.Z1) * AndroidUtilities.dp(8.0f));
        }
        j30Var.invalidate();
        o50Var.containerView.invalidate();
        i30 i30Var = o50Var.b;
        int i10 = (int) ((1.0f - o50Var.Z1) * i9);
        i30Var.N(i10, i10);
    }

    public static boolean p1(int i9) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i9 == 2 || i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7;
    }

    public static /* synthetic */ void q(o50 o50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = o50Var.W0;
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
            o50Var.W0.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = o50Var.W0.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(o50Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new mh.z0(o50Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        o50Var.O0(true);
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
        o50Var.N1(true, true);
    }

    public static /* synthetic */ void r(o50 o50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(declineconferencecallinvite, new i20(o50Var, 1));
        ChatObject.Call call = o50Var.W0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            o50Var.O0(true);
        }
    }

    public static /* synthetic */ void s(o50 o50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(o50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(o50 o50Var) {
        o50Var.Y0();
        o50Var.V0();
        o50Var.U0();
        o50Var.B.setTranslationY((-o50Var.y1.c()) + o50Var.containerView.getPaddingBottom());
        o50Var.C.invalidate();
        o50Var.Z0();
        o50Var.containerView.invalidate();
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
            alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            if (z10) {
                z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            } else {
                z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                int i9 = org.telegram.ui.ActionBar.f6.rg;
                int i10 = org.telegram.ui.ActionBar.f6.pg;
                int i11 = org.telegram.ui.ActionBar.f6.ng;
                checkBoxSquare.s = i9;
                checkBoxSquare.v = i10;
                checkBoxSquare.w = i11;
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
            f10.addView(z1VarArr[0], g7.e6.n(-1, -2));
            z1VarArr[0].setOnClickListener(new c20(z1VarArr, 0));
        }
        alertDialog$Builder.n(f10);
        alertDialog$Builder.a.E = org.telegram.ui.ActionBar.f6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new c3.g(call, z1VarArr, selfId, runnable, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.L0 = false;
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                c2Var.getWindow().setType(2038);
            } else {
                c2Var.getWindow().setType(2003);
            }
            c2Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            c2Var.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false));
        }
        c2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.vg, false));
        }
        c2Var.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hg, false));
    }

    public static /* synthetic */ void u(o50 o50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(o50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void v(o50 o50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i9, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(o50Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new e5.w(o50Var, updates, j10, 28));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i9 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(o50Var, hashSet, call, str, 7));
    }

    public static /* synthetic */ void w(o50 o50Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(o50Var.currentAccount).getUser(l10));
            getrequirementstocontact.id.add(MessagesController.getInstance(o50Var.currentAccount).getInputUser(longValue));
        }
        hr hrVar = new hr(o50Var, arrayList, arrayList2, arrayList3, str, 8);
        if (UserConfig.getInstance(o50Var.currentAccount).isPremium()) {
            hrVar.run();
        } else {
            ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(getrequirementstocontact, new y9(arrayList, arrayList2, hrVar, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i9 = 0;
                while (i9 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i9).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i9);
                        i9--;
                    }
                    i9++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < call.sortedParticipants.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static /* synthetic */ void x(o50 o50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(34, o50Var.currentAccount, U.getContext(), U, new ih.j0());
        j0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static /* synthetic */ void y(o50 o50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            o50Var.x1(null, j10, 3);
        } else {
            org.telegram.ui.Components.y4.f0(o50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) o50Var.e0.O().getFragmentStack().get(o50Var.e0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public static r0.m1 z(o50 o50Var, r0.m1 m1Var) {
        r0.j1 j1Var = m1Var.a;
        i0.b f10 = j1Var.f(647);
        i0.b f11 = j1Var.f(8);
        o30 o30Var = o50Var.D;
        int max = Math.max(f11.d, (o30Var.J || o30Var.e) ? o30Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = o50Var.X1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (o30Var.getEmojiView() != null) {
            o30Var.getEmojiView().setBottomInset(f10.d);
        }
        if (o50Var.O2) {
            ViewGroup viewGroup = o50Var.containerView;
            int i9 = o50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i9, 0, i9, 0);
        } else {
            ViewGroup viewGroup2 = o50Var.containerView;
            int i10 = o50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        o50Var.containerView.requestLayout();
        if (max == 0 && !o30Var.J && !o30Var.e && !o30Var.K) {
            o30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.uj0 uj0Var = o50Var.G;
            if (uj0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                uj0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.uj0 uj0Var2 = new org.telegram.ui.Components.uj0(1, o50Var.currentAccount, o50Var.getContext(), R, o50Var.resourcesProvider);
                    o50Var.G = uj0Var2;
                    uj0Var2.setDelegate(new q40(o50Var));
                    o50Var.containerView.addView(o50Var.G, g7.e6.e(-2, 52, 81));
                    o50Var.G.p(null, null, false);
                    o50Var.C.bringToFront();
                    o50Var.B.bringToFront();
                    uj0Var = o50Var.G;
                }
            }
            o50Var.G = uj0Var;
        }
        o30Var.G(f11.d, false);
        o50Var.y1.i(m1Var);
        return r0.m1.b;
    }

    public static String z0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.D.setText("");
        ChatObject.Call call = this.W0;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.W0;
        long j10 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j10, inputGroupCall);
    }

    public final void B1(float f10) {
        this.Q1 = f10;
        g30 g30Var = this.W1;
        float max = Math.max(f10, g30Var == null ? 0.0f : g30Var.c);
        int i9 = org.telegram.ui.ActionBar.f6.jg;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int i10 = org.telegram.ui.ActionBar.f6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.f6.w0(null, i10, false), f10, 1.0f);
        this.R1 = offsetColor;
        this.J.setBackgroundColor(offsetColor);
        this.g1.B(-14472653);
        this.b0.setColorFilter(new PorterDuffColorFilter(this.R1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.tg, false), f10, 1.0f);
        z40 z40Var = this.l0;
        if (z40Var != null) {
            z40Var.j = offsetColor2;
            fh.l2 l2Var = z40Var.g;
            if (l2Var != null) {
                l2Var.invalidate();
            }
        }
        this.y0.setColor(offsetColor2);
        this.A.setColor(offsetColor2);
        this.B.invalidate();
        u40 u40Var = this.M;
        u40Var.setGlowColor(offsetColor2);
        int i11 = this.B1;
        if (i11 == 3 || p1(i11)) {
            this.w.invalidate();
        }
        View view = this.F2;
        if (view != null) {
            int i12 = this.R1;
            int[] iArr = this.I2;
            iArr[0] = i12;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.H2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.H2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.G2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Eg, false), f10, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.og, false), f10, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.mg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.rg, false), f10, 1.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider);
        int childCount = u40Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = u40Var.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (o1()) {
                    x3Var.a(v02, v02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                k40 k40Var = this.K;
                if (z10) {
                    ((org.telegram.ui.Cells.e4) childAt).f(k40Var.getTag() != null ? org.telegram.ui.ActionBar.f6.rg : org.telegram.ui.ActionBar.f6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    ((org.telegram.ui.Cells.w3) childAt).a(k40Var.getTag() != null ? org.telegram.ui.ActionBar.f6.rg : org.telegram.ui.ActionBar.f6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        u40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f10) {
        u40 u40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f2.q1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f10 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.L0 = min;
        this.M0 = (min - this.K0) / 265.0f;
        ChatObject.Call call = this.W0;
        if (call == null || (u40Var = this.M) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.w0))) == null) {
            return;
        }
        g30 g30Var = this.W1;
        if (g30Var.b) {
            int i9 = 0;
            while (true) {
                c30 c30Var = this.i2;
                if (i9 >= c30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) c30Var.getChildAt(i9);
                if (MessageObject.getPeerId(b20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    b20Var.setAmplitude(f10 * 15.0f);
                }
                i9++;
            }
        } else {
            int indexOf = (this.o0 ? this.z0 : this.W0.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = u40Var.K(indexOf + this.L.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) view).setAmplitude(f10 * 15.0f);
                    if (view == this.T2 && !this.h2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        g30Var.k(groupCallParticipant, f10 * 15.0f);
    }

    public final void D1(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.c3 = i9;
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
    }

    public final void E1(float f10) {
        int i9;
        this.u0 = f10;
        this.M.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f10 - AndroidUtilities.dp(74.0f);
        float f11 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        d50 d50Var = this.Q0;
        g30 g30Var = this.W1;
        a30 a30Var = this.b1;
        y20 y20Var = this.a1;
        if (f11 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i9 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (d50Var != null) {
                d50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.Q1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f12 = 1.0f - ((0.1f * min) * 1.2f);
            y20Var.setScaleX(Math.max(0.9f, f12));
            y20Var.setScaleY(Math.max(0.9f, f12));
            float f13 = 1.0f - (min * 1.2f);
            y20Var.setAlpha((1.0f - g30Var.c) * Math.max(0.0f, f13));
            a30Var.setScaleX(Math.max(0.9f, f12));
            a30Var.setScaleY(Math.max(0.9f, f12));
            a30Var.setAlpha((1.0f - g30Var.c) * Math.max(0.0f, f13));
        } else {
            y20Var.setScaleX(1.0f);
            y20Var.setScaleY(1.0f);
            y20Var.setAlpha(1.0f - g30Var.c);
            a30Var.setScaleX(1.0f);
            a30Var.setScaleY(1.0f);
            a30Var.setAlpha(1.0f - g30Var.c);
            if (this.Q1 > 1.0E-4f) {
                B1(0.0f);
            }
            i9 = 0;
        }
        Y0();
        float f14 = i9;
        this.v1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(53.0f)) - f14));
        this.f1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
        if (d50Var != null) {
            d50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(37.0f)));
        }
        x30 x30Var = this.N;
        if (x30Var != null) {
            x30Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
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
        l50 l50Var;
        long j10;
        kh.n5 n5Var;
        org.telegram.ui.ActionBar.w1 w1Var;
        AccountInstance accountInstance;
        boolean z10;
        long j11;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j12;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z11;
        w40 w40Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        float y10;
        float y11;
        int measuredHeight;
        int i9;
        int i10;
        ?? r42;
        boolean z12;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.T.k() && getContext() != null) {
            if (this.Y2 || this.b2) {
                d1(true);
                return false;
            }
            o40 o40Var = this.b3;
            if (o40Var != null) {
                o40Var.dismiss();
                this.b3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.W0.videoNotAvailableParticipant) {
                    e4Var = new org.telegram.ui.Cells.e4(lVar.getContext());
                    e4Var.e(this.d, lVar.getParticipant().participant, this.W0, MessageObject.getPeerId(this.w0), null, false);
                    org.telegram.ui.Components.i5 i5Var = e4Var.s;
                    if (i5Var != null) {
                        i5Var.f();
                    }
                    this.X2 = false;
                    this.U2 = lVar;
                    this.V2 = lVar.getRenderer();
                    if (!C3 && !B3) {
                        this.containerView.addView(e4Var, g7.e6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (e4Var != null) {
                        boolean z13 = (B3 || C3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = e4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new bi(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new y10(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.A2 = linearLayout;
                            kh.n5 n5Var2 = new kh.n5(getContext(), linearLayout, linearLayout2, 7);
                            n5Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            n5Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.tg, false), this.Q1, 1.0f);
                            if (linearLayout2 == null || e4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                l50Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                n5Var2.addView(linearLayout2, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                l50Var = new l50(this, getContext(), participant);
                                linearLayout2.addView(l50Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            n5Var2.addView(linearLayout, g7.e6.k(0.0f, l50Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.w1 w1Var2 = new org.telegram.ui.ActionBar.w1(getContext(), R.style.scrollbarShapeStyle, n5Var2);
                            w1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(w1Var2, g7.e6.c(-2.0f, -2));
                            l50 l50Var2 = l50Var;
                            long peerId = MessageObject.getPeerId(participant.peer);
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            boolean z14 = z13;
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            AccountInstance accountInstance2 = this.d;
                            if (z15) {
                                accountInstance = accountInstance2;
                                if (ChatObject.isChannel(this.V0)) {
                                    j10 = peerId;
                                    n5Var = n5Var2;
                                    w1Var = w1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z10 = true;
                                    }
                                    z10 = false;
                                } else {
                                    j10 = peerId;
                                    n5Var = n5Var2;
                                    w1Var = w1Var2;
                                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
                                    if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                        int size = chatParticipants.participants.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= size) {
                                                break;
                                            }
                                            TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                                            TLRPC.ChatFull chatFull2 = chatFull;
                                            int i12 = size;
                                            if (chatParticipant.user_id != participant.peer.user_id) {
                                                i11++;
                                                chatFull = chatFull2;
                                                size = i12;
                                            } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                }
                            } else {
                                j10 = peerId;
                                n5Var = n5Var2;
                                w1Var = w1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (e4Var.c()) {
                                if (o1() && e4Var.G) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(e4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                org.telegram.ui.Cells.j2.j(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                org.telegram.ui.Cells.j2.j(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                org.telegram.ui.Cells.j2.j(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (Q0()) {
                                if (!o1() && z10 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        org.telegram.ui.Cells.j2.m(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
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
                                        org.telegram.ui.Cells.j2.m(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (o1() ? !(z10 || !ChatObject.canBlockUsers(this.V0)) : !((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            org.telegram.ui.Cells.j2.j(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (o1()) {
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    org.telegram.ui.Cells.j2.m(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j14 = peer2.channel_id;
                                    if (j14 != 0 && !ChatObject.isMegagroup(this.currentAccount, j14)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.j2.m(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getContext(), i13 == 0, i13 == size2 + (-1));
                                if (((Integer) arrayList3.get(i13)).intValue() != 2) {
                                    int i14 = org.telegram.ui.ActionBar.f6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    g1Var.c(org.telegram.ui.ActionBar.f6.w0(null, i14, false), org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i15 = org.telegram.ui.ActionBar.f6.vg;
                                    g1Var.c(org.telegram.ui.ActionBar.f6.w0(null, i15, false), org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                                }
                                g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.w0(r42, org.telegram.ui.ActionBar.f6.eg, z12));
                                g1Var.g((CharSequence) arrayList.get(i13), ((Integer) arrayList2.get(i13)).intValue(), r42);
                                linearLayout.addView(g1Var);
                                g1Var.setTag(arrayList3.get(i13));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                g1Var.setOnClickListener(new ih.p5(this, i13, arrayList4, groupCallParticipant, 3));
                                i13++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            w1Var.addView(n5Var, g7.e6.x(-2, -2, 51));
                            u40 u40Var = this.M;
                            u40Var.B0();
                            this.U.X = false;
                            this.T2 = e4Var;
                            e4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            u40Var.invalidate();
                            AnimatorSet animatorSet = this.a3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.a2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
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
                            org.telegram.ui.Components.voip.t tVar = this.V2;
                            boolean z16 = tVar != null && tVar.v;
                            if (forUserOrChat != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.o9 avatarImageView = this.T2.getAvatarImageView();
                                    i30 i30Var = this.b;
                                    i30Var.setParentAvatarImage(avatarImageView);
                                    i30Var.setHasActiveVideo(z16);
                                    i30Var.M(j12, true);
                                    i30Var.setCreateThumbFromParent(true);
                                    i30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.t tVar2 = this.V2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.w0) == j12 && this.d2 != null && (w40Var = this.e2) != null && (fileLocation = w40Var.c) != null) {
                                        i30Var.A(w40Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.b2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.a2, g7.e6.c(-2.0f, -2));
                                this.c2 = true;
                                l30 l30Var = this.X1;
                                if (l30Var == null) {
                                    i10 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    this.e0.O().getView().draw(canvas);
                                    canvas.drawColor(i0.a.k(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    this.B2 = true;
                                    this.containerView.draw(canvas);
                                    i10 = 0;
                                    this.B2 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    l30Var.setBackground(new BitmapDrawable(createBitmap));
                                    l30Var.setAlpha(0.0f);
                                    l30Var.setVisibility(0);
                                    l30Var.bringToFront();
                                }
                                this.Y2 = true;
                                this.y2.setVisibility(i10);
                                if (l50Var2 != null) {
                                    l50Var2.invalidate();
                                }
                                y1(true, e4Var);
                                org.telegram.ui.Components.b20 b20Var = this.W2;
                                if (b20Var != null) {
                                    b20Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.b2 = false;
                            o40 o40Var2 = new o40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.b3 = o40Var2;
                            o40Var2.e = true;
                            o40Var2.c = 220;
                            o40Var2.setOutsideTouchable(true);
                            this.b3.setClippingEnabled(true);
                            this.b3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.b3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.b3.setInputMethodMode(2);
                            this.b3.setSoftInputMode(0);
                            this.b3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.b20 b20Var2 = this.W2;
                            if (b20Var2 != null) {
                                boolean z17 = B3;
                                g30 g30Var = this.W1;
                                c30 c30Var = this.i2;
                                if (z17) {
                                    x10 = AndroidUtilities.dp(32.0f) + (((int) (g30Var.getX() + (c30Var.getX() + b20Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i9 = ((int) (g30Var.getY() + (c30Var.getY() + this.W2.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x10 = ((int) (g30Var.getX() + (c30Var.getX() + b20Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y10 = (g30Var.getY() + (c30Var.getY() + this.W2.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i9 = (int) y10;
                                }
                            } else {
                                x10 = (int) (((u40Var.getX() + u40Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.X2) {
                                    y11 = e4Var.getY() + u40Var.getY();
                                    measuredHeight = e4Var.getClipHeight();
                                } else if (this.U2 != null) {
                                    y11 = this.U2.getY() + u40Var.getY();
                                    measuredHeight = this.U2.getMeasuredHeight();
                                } else {
                                    y10 = u40Var.getY();
                                    i9 = (int) y10;
                                }
                                i9 = (int) (y11 + measuredHeight);
                            }
                            this.b3.showAtLocation(u40Var, 51, x10, i9);
                            this.a3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.S2, org.telegram.ui.Components.m6.b, 0, 100));
                            this.a3.playTogether(arrayList5);
                            this.a3.setDuration(150L);
                            this.a3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.b20) {
                    org.telegram.ui.Components.b20 b20Var3 = (org.telegram.ui.Components.b20) view;
                    if (b20Var3.getParticipant() != this.W0.videoNotAvailableParticipant.participant) {
                        e4Var = new org.telegram.ui.Cells.e4(b20Var3.getContext());
                        e4Var.e(this.d, b20Var3.getParticipant(), this.W0, MessageObject.getPeerId(this.w0), null, false);
                        org.telegram.ui.Components.i5 i5Var2 = e4Var.s;
                        if (i5Var2 != null) {
                            i5Var2.f();
                        }
                        this.X2 = false;
                        this.W2 = b20Var3;
                        org.telegram.ui.Components.voip.t renderer = b20Var3.getRenderer();
                        this.V2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.V2 = null;
                        }
                        this.containerView.addView(e4Var, g7.e6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    e4Var = (org.telegram.ui.Cells.e4) view;
                    this.X2 = true;
                }
                if (e4Var != null) {
                }
            }
        }
        return false;
    }

    public final void G1(View view) {
        if (this.i0 == null) {
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(8, getContext(), null, true);
            this.i0 = s30Var;
            s30Var.setAlpha(0.0f);
            this.i0.setVisibility(4);
            this.i0.setShowingDuration(3000L);
            this.containerView.addView(this.i0, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.V0)) {
                this.i0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.i0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.i0.d();
        }
        this.i0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.i0.f(view, true);
    }

    public final void H1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.u2 u2Var = this.v;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        org.telegram.ui.Components.voip.u2 u2Var3 = this.r;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.f;
        org.telegram.ui.Components.voip.u2 u2Var5 = this.n;
        org.telegram.ui.Components.voip.u2 u2Var6 = this.s;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.w;
        s20 s20Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            s20Var.c(u2Var7, this.R0 > 0.1f, z10);
            s20Var.c(u2Var6, this.R0 > 0.1f, z10);
            s20Var.c(u2Var3, this.R0 > 0.1f, z10);
            s20Var.c(u2Var5, false, z10);
            s20Var.c(u2Var4, false, z10);
            s20Var.c(u2Var2, false, z10);
            s20Var.c(u2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
        Boolean bool = this.t3;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.W0.call;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.W0.canRecordVideo()) && !z16) || r1()) {
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
        if (B3) {
            z13 = false;
            z14 = false;
        }
        s20Var.c(u2Var7, true, z10);
        s20Var.c(u2Var6, true, z10);
        s20Var.c(u2Var5, z12, z10);
        s20Var.c(u2Var4, z14, z10);
        s20Var.c(u2Var3, z15, z10);
        s20Var.c(u2Var2, z13, z10);
        s20Var.c(u2Var, z11, z10);
    }

    public final void I1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.W0;
        org.telegram.ui.ActionBar.w0 w0Var = this.g1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.i1;
        if (call2 == null || call2.isScheduled()) {
            this.h1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.W0 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.h0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat3 != null) {
            this.V0 = chat3;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.V0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.j1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.V0) || ((chat2 = this.V0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.V0) || ChatObject.canUserDoAdminAction(this.V0, 3))) || (ChatObject.isChannel(this.V0) && (chat = this.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            g1Var.setVisibility(0);
        } else {
            g1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.u1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.t1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        } else {
            g1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            g1Var2.setVisibility(this.W0.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        ChatObject.Call call4 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.m1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(8);
        } else {
            g1Var4.setVisibility(0);
        }
        g1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        g1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.s1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.k1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.o1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.p1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.W0.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (!this.W0.canRecordVideo() || this.W0.isScheduled() || r1()) {
                g1Var8.setVisibility(8);
            } else {
                g1Var8.setVisibility(0);
            }
            w0Var2.setVisibility(8);
            boolean z11 = this.W0.recording;
            j50 j50Var = this.Z0;
            j50Var.f = z11;
            j50Var.d = 1.0f;
            j50Var.invalidateSelf();
            if (this.W0.recording) {
                if (this.z1 == null) {
                    b20 b20Var = new b20(this, 6);
                    this.z1 = b20Var;
                    AndroidUtilities.runOnUIThread(b20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                b20 b20Var2 = this.z1;
                if (b20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(b20Var2);
                    this.z1 = null;
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
            if (z12 || (!(this.W0.canRecordVideo() || z13) || this.W0.isScheduled() || r1())) {
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
        org.telegram.ui.ActionBar.g1 g1Var9 = this.n1;
        if (Q02 && this.W0.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        w0Var.I(4, z10);
        this.l1.setVisibility((!r1() || this.W0.isScheduled()) ? 0 : 8);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.w1;
        if (visibility == 0 || g1Var9.getVisibility() == 0 || g1Var.getVisibility() == 0 || g1Var8.getVisibility() == 0 || g1Var7.getVisibility() == 0 || g1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.g0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.X0) || r1() || this.w0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.w0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.V0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || g1Var.getVisibility() != 8) {
            w0Var.setVisibility(0);
        } else {
            w0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f10)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).rightMargin = 0;
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 2) {
            Y0();
            W0();
            X0();
            float f12 = 1.0f - this.v3.e;
            s20 s20Var = this.e;
            s20Var.setAlpha(f12);
            this.W1.setProgressToHideUi(f10);
            this.i2.invalidate();
            this.containerView.invalidate();
            s20Var.invalidate();
        }
        if (i9 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i9 == 4) {
            Y0();
            this.C.invalidate();
            this.D.invalidate();
        }
        if (i9 == 5) {
            Y0();
            this.containerView.invalidate();
        }
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
    public final void J1(int i9, boolean z10) {
        boolean z11;
        boolean N;
        boolean N2;
        String string;
        String string2;
        boolean z12;
        String str;
        String string3;
        String string4;
        boolean N3;
        String string5;
        boolean N4;
        String string6;
        boolean N5;
        String str2;
        int i10;
        n50[] n50VarArr;
        n50 n50Var;
        n50 n50Var2;
        boolean z13;
        boolean z14;
        g30 g30Var = this.W1;
        boolean z15 = g30Var != null && g30Var.b && (AndroidUtilities.isTablet() || B3 == q1());
        if (!r1() && this.B1 == i9 && z10) {
            return;
        }
        int i11 = 3;
        org.telegram.ui.Components.mi0 mi0Var = this.F0;
        if (i9 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            N5 = mi0Var.N(202);
        } else {
            if (i9 != 6) {
                if (i9 != 5) {
                    if (i9 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i12 = this.B1;
                        if (i12 == 3) {
                            int i13 = mi0Var.f;
                            N3 = (i13 == 136 || i13 == 173 || i13 == 274 || i13 == 311) ? mi0Var.N(99) : false;
                        } else if (i12 == 5) {
                            N3 = mi0Var.N(404);
                        } else if (i12 == 7) {
                            N3 = mi0Var.N(376);
                        } else if (i12 == 6) {
                            N3 = mi0Var.N(237);
                        } else {
                            if (i12 == 2) {
                                z12 = mi0Var.N(36);
                                str = string3;
                                string2 = string4;
                                z11 = false;
                                if (r1() || i9 == i11 || this.W0.isScheduled()) {
                                    str2 = string2;
                                } else {
                                    str = LocaleController.getString(z15 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                    boolean z16 = this.C1 != z15;
                                    this.C1 = z15;
                                    z12 = z16;
                                    str2 = "";
                                }
                                String z17 = !TextUtils.isEmpty(str2) ? aa.d.z(str, " ", str2) : str;
                                org.telegram.ui.Components.voip.u2 u2Var = this.w;
                                u2Var.setContentDescription(z17);
                                u2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                t20 t20Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i9 == 5) {
                                            mi0Var.K(376);
                                        } else if (i9 == 7) {
                                            mi0Var.K(173);
                                        } else if (i9 == 6) {
                                            mi0Var.K(311);
                                        } else if (i9 == 0) {
                                            int i14 = this.B1;
                                            if (i14 == 5) {
                                                mi0Var.K(376);
                                            } else if (i14 == 7) {
                                                mi0Var.K(344);
                                            } else if (i14 == 6) {
                                                mi0Var.K(202);
                                            } else if (i14 == 2) {
                                                mi0Var.K(0);
                                            } else {
                                                mi0Var.K(69);
                                            }
                                        } else if (i9 == 1 || (this.B1 == 2 && o1())) {
                                            mi0Var.K(this.B1 == 4 ? 69 : 36);
                                        } else if (i9 == 4) {
                                            mi0Var.K(99);
                                        } else if (z11) {
                                            int i15 = this.B1;
                                            if (i15 == 7) {
                                                mi0Var.K(274);
                                            } else if (i15 == 6) {
                                                mi0Var.K(237);
                                            } else if (i15 == 1) {
                                                mi0Var.K(136);
                                            } else {
                                                mi0Var.K(99);
                                            }
                                        } else {
                                            int i16 = this.B1;
                                            if (i16 == 5) {
                                                mi0Var.K(376);
                                            } else if (i16 == 7) {
                                                mi0Var.K(344);
                                            } else if (i16 == 6) {
                                                mi0Var.K(202);
                                            } else if (i16 == 2 || i16 == 4) {
                                                mi0Var.K(0);
                                            } else {
                                                mi0Var.K(69);
                                            }
                                        }
                                    }
                                    t20Var.d();
                                    if (!r1() || this.W0.isScheduled()) {
                                        imageView.setVisibility(8);
                                        t20Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((g30Var != null && g30Var.b && (AndroidUtilities.isTablet() || B3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        t20Var.setVisibility(8);
                                    }
                                    this.B1 = i9;
                                } else {
                                    this.B1 = i9;
                                    mi0Var.L(mi0Var.f - 1, false, true);
                                    if (!r1() || this.W0.isScheduled()) {
                                        imageView.setVisibility(8);
                                        t20Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((g30Var != null && g30Var.b && (AndroidUtilities.isTablet() || B3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        t20Var.setVisibility(8);
                                    }
                                }
                                u2Var.invalidate();
                                i10 = this.B1;
                                n50VarArr = this.G1;
                                if (n50VarArr[i10] == null) {
                                    n50VarArr[i10] = new n50(i10);
                                    int i17 = this.B1;
                                    if (i17 == 3) {
                                        n50VarArr[i17].g = null;
                                    } else if (p1(i17)) {
                                        n50VarArr[this.B1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ih, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kh, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i18 = this.B1;
                                        if (i18 != 1) {
                                            n50VarArr[i18].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Jg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            n50Var = n50VarArr[this.B1];
                                            n50Var2 = this.J1;
                                            if (n50Var != n50Var2) {
                                                this.I1 = n50Var2;
                                                this.J1 = n50Var;
                                                if (n50Var2 == null || !z10) {
                                                    this.H1 = 1.0f;
                                                    this.I1 = null;
                                                } else {
                                                    this.H1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                n50 n50Var3 = this.J1;
                                                if (n50Var3 != null) {
                                                    int i19 = n50Var3.i;
                                                    z14 = i19 == 1 || i19 == 0;
                                                    z13 = i19 != 3;
                                                } else {
                                                    z13 = false;
                                                    z14 = false;
                                                }
                                                this.L1 = z14 ? 1.0f : 0.0f;
                                                this.M1 = z13 ? 1.0f : 0.0f;
                                            }
                                            this.e.invalidate();
                                        }
                                        n50VarArr[i18].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Fg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                n50Var = n50VarArr[this.B1];
                                n50Var2 = this.J1;
                                if (n50Var != n50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            N3 = mi0Var.N(99);
                        }
                    } else {
                        if (i9 == 1) {
                            string5 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            N4 = mi0Var.N(this.B1 == 4 ? 99 : 69);
                        } else if (o1() && i9 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            N4 = mi0Var.N(99);
                        } else {
                            if (i9 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                                if (z11) {
                                    int i20 = this.B1;
                                    if (i20 == 7) {
                                        N2 = mi0Var.N(311);
                                    } else if (i20 == 6) {
                                        N2 = mi0Var.N(274);
                                    } else if (i20 == 1) {
                                        N2 = mi0Var.N(173);
                                    } else {
                                        N = mi0Var.N(136);
                                    }
                                    N = N2;
                                } else {
                                    int i21 = this.B1;
                                    if (i21 == 5) {
                                        N2 = mi0Var.N(404);
                                    } else if (i21 == 7) {
                                        N = mi0Var.N(376);
                                    } else if (i21 == 6) {
                                        N = mi0Var.N(237);
                                    } else if (i21 == 2 || i21 == 4) {
                                        N = mi0Var.N(36);
                                    } else {
                                        N2 = mi0Var.N(99);
                                    }
                                    N = N2;
                                }
                                i11 = 3;
                                if (i9 == 3) {
                                    string = LocaleController.getString(R.string.Connecting);
                                    z12 = N;
                                    string2 = "";
                                } else {
                                    string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                    string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    z12 = N;
                                }
                                str = string;
                                if (r1()) {
                                }
                                str2 = string2;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                org.telegram.ui.Components.voip.u2 u2Var2 = this.w;
                                u2Var2.setContentDescription(z17);
                                u2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                t20 t20Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                u2Var2.invalidate();
                                i10 = this.B1;
                                n50VarArr = this.G1;
                                if (n50VarArr[i10] == null) {
                                }
                                n50Var = n50VarArr[this.B1];
                                n50Var2 = this.J1;
                                if (n50Var != n50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            N3 = mi0Var.N(136);
                        }
                        z12 = N4;
                    }
                    z12 = N3;
                    str = string3;
                    string2 = string4;
                    z11 = false;
                    if (r1()) {
                    }
                    str2 = string2;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    org.telegram.ui.Components.voip.u2 u2Var22 = this.w;
                    u2Var22.setContentDescription(z17);
                    u2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    t20 t20Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    u2Var22.invalidate();
                    i10 = this.B1;
                    n50VarArr = this.G1;
                    if (n50VarArr[i10] == null) {
                    }
                    n50Var = n50VarArr[this.B1];
                    n50Var2 = this.J1;
                    if (n50Var != n50Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = mi0Var.N(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (r1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.u2 u2Var222 = this.w;
                u2Var222.setContentDescription(z17);
                u2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                t20 t20Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                u2Var222.invalidate();
                i10 = this.B1;
                n50VarArr = this.G1;
                if (n50VarArr[i10] == null) {
                }
                n50Var = n50VarArr[this.B1];
                n50Var2 = this.J1;
                if (n50Var != n50Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            N5 = mi0Var.N(344);
        }
        string2 = "";
        str = string6;
        z12 = N5;
        z11 = false;
        if (r1()) {
        }
        str2 = string2;
        if (!TextUtils.isEmpty(str2)) {
        }
        org.telegram.ui.Components.voip.u2 u2Var2222 = this.w;
        u2Var2222.setContentDescription(z17);
        u2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        t20 t20Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        u2Var2222.invalidate();
        i10 = this.B1;
        n50VarArr = this.G1;
        if (n50VarArr[i10] == null) {
        }
        n50Var = n50VarArr[this.B1];
        n50Var2 = this.J1;
        if (n50Var != n50Var2) {
        }
        if (!z10) {
        }
        this.e.invalidate();
    }

    public final void K1() {
        if (this.W0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.W0;
        int i9 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.o1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i9, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f10;
        x30 x30Var = this.N;
        if ((x30Var == null || this.W0 != null) && this.T0 == null) {
            this.S0 = 1.0f;
            this.R0 = 1.0f;
            if (x30Var == null) {
                return;
            }
        }
        if (!z10) {
            w20 w20Var = this.s2;
            AndroidUtilities.cancelRunOnUIThread(w20Var);
            w20Var.run();
            ChatObject.Call call = this.W0;
            u40 u40Var = this.M;
            if (call == null || call.isScheduled()) {
                u40Var.setVisibility(4);
            } else {
                u40Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.V0);
            org.telegram.ui.ActionBar.g1 g1Var = this.s1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f11 = this.R0;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.gr.f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.S0 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            this.S0 = grVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * grVar.getInterpolation(this.R0 / 0.6f);
            f10 = this.R0 / 0.6f;
        }
        H1(true);
        float f12 = 1.0f - f10;
        x30Var.setAlpha(f12);
        this.Q.setAlpha(f10);
        this.S.setAlpha(f10);
        t40 t40Var = this.R;
        t40Var.setAlpha(f10);
        t40Var.setScaleX(interpolation);
        t40Var.setScaleY(interpolation);
        v30 v30Var = this.P;
        v30Var.setScaleX(f12);
        v30Var.setScaleY(f12);
        v30Var.setAlpha(f12);
        this.O.setAlpha(f12);
        this.g1.setAlpha(f10);
        int i9 = f12 != 0.0f ? 0 : 4;
        if (i9 != x30Var.getVisibility()) {
            x30Var.setVisibility(i9);
            v30Var.setVisibility(i9);
        }
    }

    public final void M1(boolean z10) {
        org.telegram.ui.Components.voip.u2 u2Var = this.r;
        if (u2Var == null || u2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s20 s20Var = this.e;
        if (sharedInstance == null || r1()) {
            u2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.V0) || (ChatObject.hasAdminRights(this.V0) && ChatObject.canAddUsers(this.V0));
            sg.a aVar = (sg.a) s20Var.c.get(u2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
            return;
        }
        sg.a aVar2 = (sg.a) s20Var.c.get(u2Var);
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
        int i9 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.W != i9) {
            this.W = i9;
            AndroidUtilities.updateImageViewImageAnimated(this.X, i9);
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
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i9;
        boolean z17;
        int i10;
        boolean z18;
        org.telegram.ui.Components.voip.u2 u2Var;
        org.telegram.ui.Components.voip.u2 u2Var2;
        org.telegram.ui.Components.voip.u2 u2Var3;
        boolean z19;
        boolean r12;
        int i11;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.s;
        int i12 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i12 = 5;
            } else if (this.W0.call.schedule_start_subscribed) {
                i12 = 7;
            }
            J1(i12, z10);
            u2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            L1(false);
            return;
        }
        H1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
            if ((this.p0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.p0) > 3000) && ((i11 = this.P1) == 1 || i11 == 2 || i11 == 6 || i11 == 5)) {
                R0();
                J1(3, z10);
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0();
                if (!((z13 && this.W0.canRecordVideo()) || z12) || r1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = false;
                }
                if (z12) {
                    z16 = !z13;
                    i9 = 0;
                } else {
                    z16 = false;
                    i9 = 1;
                }
                if (B3) {
                    z17 = z16;
                    i10 = i9;
                } else {
                    z17 = false;
                    i10 = 0;
                }
                int i13 = i10 + (!z15 ? 2 : 0) + (!z14 ? 4 : 0);
                g30 g30Var = this.W1;
                int i14 = i13 + ((g30Var == null && g30Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.k0 | 2) == (i14 | 2);
                this.k0 = i14;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.u2 u2Var5 = this.n;
                if (z14) {
                    u2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    u2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.u2 u2Var6 = this.f;
                if (i10 != 0) {
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
                    int i15 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.W != i15) {
                        this.W = i15;
                        AndroidUtilities.updateImageViewImageAnimated(this.X, i15);
                    }
                    u2Var2 = u2Var5;
                    u2Var = u2Var6;
                    u2Var7.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    u2Var3 = u2Var7;
                    z19 = z10;
                    u2Var3.b(h1() != 1, z19);
                }
                org.telegram.ui.Components.voip.u2 u2Var8 = u2Var3;
                u2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    M1(false);
                }
                u2Var2.d(true, z19);
                u2Var.d(true, z19);
                u2Var8.d(true, z19);
                r12 = r1();
                a30 a30Var = this.b1;
                if (r12) {
                    a30Var.setVisibility(8);
                } else {
                    a30Var.setVisibility(0);
                    boolean z21 = ((Integer) a30Var.getTag()).intValue() == 3;
                    int i16 = this.P1;
                    final boolean z22 = i16 == 3;
                    a30Var.setTag(Integer.valueOf(i16));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.d1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.c1;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i17 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.d1 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.f20
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i17, floatValue, 1.0f);
                                    o50 o50Var = o50.this;
                                    o50Var.c1.setColor(offsetColor);
                                    o50Var.b1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    o50Var.e1 = floatValue;
                                    d50 d50Var = o50Var.Q0;
                                    if (d50Var == null || !o50Var.v2) {
                                        return;
                                    }
                                    d50Var.invalidate();
                                }
                            });
                            this.d1.setDuration(300L);
                            this.d1.setInterpolator(org.telegram.ui.Components.gr.f);
                            this.d1.addListener(new i40(this, 2));
                            this.d1.start();
                        } else {
                            paint.setColor(this.P1 == 3 ? -1163700 : -12761513);
                            a30Var.invalidate();
                        }
                    }
                }
                if (r1() || !LiteMode.isEnabled(512)) {
                }
                if (this.P1 == 3) {
                    this.v2 = true;
                    z1();
                    return;
                } else {
                    this.v2 = false;
                    AndroidUtilities.cancelRunOnUIThread(this.w2);
                    return;
                }
            }
        }
        if (this.x0 != null) {
            k1().k(0L, 37, this.x0, this.V0, null, null);
            this.x0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
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
            if (groupCallParticipant2.raise_hand_rating != j10) {
                J1(4, z10);
            } else {
                J1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (B3) {
        }
        int i132 = i10 + (!z15 ? 2 : 0) + (!z14 ? 4 : 0);
        g30 g30Var2 = this.W1;
        int i142 = i132 + ((g30Var2 == null && g30Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.k0 | 2) == (i142 | 2)) {
        }
        this.k0 = i142;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.u2 u2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.u2 u2Var62 = this.f;
        if (i10 != 0) {
        }
        org.telegram.ui.Components.voip.u2 u2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.u2 u2Var82 = u2Var3;
        u2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            M1(false);
        }
        u2Var2.d(true, z19);
        u2Var.d(true, z19);
        u2Var82.d(true, z19);
        r12 = r1();
        a30 a30Var2 = this.b1;
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
        u40 u40Var;
        i50 i50Var;
        g30 g30Var;
        u40 u40Var2;
        int i9;
        ArrayList arrayList;
        int i10;
        boolean z11;
        ArrayList arrayList2;
        int i11;
        int i12;
        u40 u40Var3;
        g30 g30Var2;
        c30 c30Var;
        ArrayList arrayList3;
        int i13;
        ChatObject.Call call;
        boolean z12;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        f2.q1 G;
        int i14;
        o50 o50Var = this;
        i50 i50Var2 = o50Var.L;
        g30 g30Var3 = o50Var.W1;
        if (g30Var3 == null || (u40Var = o50Var.M) == null || o50Var.W0 == null || o50Var.o0) {
            return;
        }
        if (g30Var3.b) {
            g30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(o50Var.W0.selfPeer);
        if (peerId != MessageObject.getPeerId(o50Var.w0) && o50Var.W0.participants.f(peerId) != null) {
            o50Var.w0 = o50Var.W0.selfPeer;
        }
        int childCount = u40Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = u40Var.getChildAt(i17);
            f2.q1 G2 = u40Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList4 = o50Var.m0;
        arrayList4.clear();
        if (!C3) {
            arrayList4.addAll(o50Var.W0.visibleVideoParticipants);
        } else if (g30Var3.b) {
            arrayList4.addAll(o50Var.W0.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = g30Var3.e;
            if (videoParticipant3 != null) {
                arrayList4.remove(videoParticipant3);
            }
        }
        if (u40Var.getItemAnimator() != null && !z10) {
            u40Var.setItemAnimator(null);
        } else if (u40Var.getItemAnimator() == null && z10) {
            u40Var.setItemAnimator(o50Var.T);
        }
        try {
            g gVar = new g(i50Var2, 21);
            try {
                try {
                    z11 = true;
                    try {
                        try {
                            try {
                                i14 = i16;
                                try {
                                    g30Var = g30Var3;
                                } catch (Exception e10) {
                                    e = e10;
                                    g30Var = g30Var3;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                i10 = i16;
                                g30Var = g30Var3;
                                u40Var2 = u40Var;
                                i9 = childCount;
                                arrayList = arrayList4;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i50Var = i50Var2;
                            arrayList = arrayList4;
                            i10 = i16;
                            g30Var = g30Var3;
                            u40Var2 = u40Var;
                            i9 = childCount;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        i50Var = i50Var2;
                        i9 = childCount;
                        arrayList = arrayList4;
                        i10 = i16;
                        g30Var = g30Var3;
                        u40Var2 = u40Var;
                    }
                } catch (Exception e14) {
                    e = e14;
                    i50Var = i50Var2;
                    i9 = childCount;
                    arrayList = arrayList4;
                    i10 = i16;
                    g30Var = g30Var3;
                    u40Var2 = u40Var;
                }
                try {
                    u40Var2 = u40Var;
                    try {
                        try {
                            try {
                            } catch (Exception e15) {
                                e = e15;
                                arrayList = arrayList4;
                                i10 = i14;
                                i9 = childCount;
                                z11 = true;
                                i50Var = i50Var2;
                                FileLog.e(e);
                                i50Var.l();
                                o50Var.W0.saveActiveDates();
                                if (view != null) {
                                }
                                ArrayList arrayList5 = o50Var.z0;
                                arrayList5.clear();
                                arrayList5.addAll(o50Var.W0.visibleParticipants);
                                ArrayList arrayList6 = o50Var.A0;
                                arrayList6.clear();
                                arrayList2 = arrayList;
                                arrayList6.addAll(arrayList2);
                                ArrayList arrayList7 = o50Var.B0;
                                arrayList7.clear();
                                arrayList7.addAll(o50Var.W0.invitedUsers);
                                ArrayList arrayList8 = o50Var.C0;
                                arrayList8.clear();
                                arrayList8.addAll(o50Var.W0.shadyJoinParticipants);
                                ArrayList arrayList9 = o50Var.D0;
                                arrayList9.clear();
                                arrayList9.addAll(o50Var.W0.shadyLeftParticipants);
                                i50 i50Var3 = i50Var;
                                o50Var.E0 = i50Var3.B;
                                i11 = i9;
                                i12 = 0;
                                while (i12 < i11) {
                                }
                                u40Var3 = u40Var2;
                                boolean c10 = g30Var.c();
                                g30Var2 = g30Var;
                                if (g30Var2.b) {
                                    if (!arrayList2.isEmpty()) {
                                    }
                                    org.telegram.ui.Components.c20 c20Var = o50Var.l2;
                                    c30Var = o50Var.i2;
                                    c20Var.G(c30Var, z11);
                                    if (c30Var.getVisibility() == 0) {
                                    }
                                    if (C3) {
                                    }
                                    if (u40Var3.getVisibility() == 0) {
                                    }
                                    arrayList3 = o50Var.V1;
                                    arrayList3.clear();
                                    arrayList3.addAll(o50Var.U1);
                                    while (i13 < arrayList3.size()) {
                                    }
                                    call = o50Var.W0;
                                    if (call != null) {
                                    }
                                    ChatObject.Call call2 = o50Var.W0;
                                    if (call2 == null) {
                                    }
                                    o50Var.y3.a(z12, z10);
                                    if (z12 != o50Var.E2) {
                                    }
                                }
                                org.telegram.ui.Components.c20 c20Var2 = o50Var.l2;
                                c30Var = o50Var.i2;
                                c20Var2.G(c30Var, z11);
                                if (c30Var.getVisibility() == 0) {
                                }
                                if (C3) {
                                }
                                if (u40Var3.getVisibility() == 0) {
                                }
                                arrayList3 = o50Var.V1;
                                arrayList3.clear();
                                arrayList3.addAll(o50Var.U1);
                                while (i13 < arrayList3.size()) {
                                }
                                call = o50Var.W0;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = o50Var.W0;
                                if (call22 == null) {
                                }
                                o50Var.y3.a(z12, z10);
                                if (z12 != o50Var.E2) {
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            i9 = childCount;
                            arrayList = arrayList4;
                            i10 = i14;
                        }
                        try {
                            arrayList = arrayList4;
                            i10 = i14;
                            i9 = childCount;
                            o50Var = this;
                            i50Var = i50Var2;
                        } catch (Exception e17) {
                            e = e17;
                            z11 = true;
                            o50Var = this;
                            arrayList = arrayList4;
                            i10 = i14;
                            i9 = childCount;
                            i50Var = i50Var2;
                            FileLog.e(e);
                            i50Var.l();
                            o50Var.W0.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList52 = o50Var.z0;
                            arrayList52.clear();
                            arrayList52.addAll(o50Var.W0.visibleParticipants);
                            ArrayList arrayList62 = o50Var.A0;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = o50Var.B0;
                            arrayList72.clear();
                            arrayList72.addAll(o50Var.W0.invitedUsers);
                            ArrayList arrayList82 = o50Var.C0;
                            arrayList82.clear();
                            arrayList82.addAll(o50Var.W0.shadyJoinParticipants);
                            ArrayList arrayList92 = o50Var.D0;
                            arrayList92.clear();
                            arrayList92.addAll(o50Var.W0.shadyLeftParticipants);
                            i50 i50Var32 = i50Var;
                            o50Var.E0 = i50Var32.B;
                            i11 = i9;
                            i12 = 0;
                            while (i12 < i11) {
                            }
                            u40Var3 = u40Var2;
                            boolean c102 = g30Var.c();
                            g30Var2 = g30Var;
                            if (g30Var2.b) {
                            }
                            org.telegram.ui.Components.c20 c20Var22 = o50Var.l2;
                            c30Var = o50Var.i2;
                            c20Var22.G(c30Var, z11);
                            if (c30Var.getVisibility() == 0) {
                            }
                            if (C3) {
                            }
                            if (u40Var3.getVisibility() == 0) {
                            }
                            arrayList3 = o50Var.V1;
                            arrayList3.clear();
                            arrayList3.addAll(o50Var.U1);
                            while (i13 < arrayList3.size()) {
                            }
                            call = o50Var.W0;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = o50Var.W0;
                            if (call222 == null) {
                            }
                            o50Var.y3.a(z12, z10);
                            if (z12 != o50Var.E2) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        i9 = childCount;
                        arrayList = arrayList4;
                        i10 = i14;
                        i50Var = i50Var2;
                        FileLog.e(e);
                        i50Var.l();
                        o50Var.W0.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList522 = o50Var.z0;
                        arrayList522.clear();
                        arrayList522.addAll(o50Var.W0.visibleParticipants);
                        ArrayList arrayList622 = o50Var.A0;
                        arrayList622.clear();
                        arrayList2 = arrayList;
                        arrayList622.addAll(arrayList2);
                        ArrayList arrayList722 = o50Var.B0;
                        arrayList722.clear();
                        arrayList722.addAll(o50Var.W0.invitedUsers);
                        ArrayList arrayList822 = o50Var.C0;
                        arrayList822.clear();
                        arrayList822.addAll(o50Var.W0.shadyJoinParticipants);
                        ArrayList arrayList922 = o50Var.D0;
                        arrayList922.clear();
                        arrayList922.addAll(o50Var.W0.shadyLeftParticipants);
                        i50 i50Var322 = i50Var;
                        o50Var.E0 = i50Var322.B;
                        i11 = i9;
                        i12 = 0;
                        while (i12 < i11) {
                        }
                        u40Var3 = u40Var2;
                        boolean c1022 = g30Var.c();
                        g30Var2 = g30Var;
                        if (g30Var2.b) {
                        }
                        org.telegram.ui.Components.c20 c20Var222 = o50Var.l2;
                        c30Var = o50Var.i2;
                        c20Var222.G(c30Var, z11);
                        if (c30Var.getVisibility() == 0) {
                        }
                        if (C3) {
                        }
                        if (u40Var3.getVisibility() == 0) {
                        }
                        arrayList3 = o50Var.V1;
                        arrayList3.clear();
                        arrayList3.addAll(o50Var.U1);
                        while (i13 < arrayList3.size()) {
                        }
                        call = o50Var.W0;
                        if (call != null) {
                        }
                        ChatObject.Call call2222 = o50Var.W0;
                        if (call2222 == null) {
                        }
                        o50Var.y3.a(z12, z10);
                        if (z12 != o50Var.E2) {
                        }
                    }
                    try {
                        o50Var.D1(i50Var2.G, i50Var2.w, i50Var2.d, i50Var2.e, i50Var2.f, i50Var2.h, i50Var2.n, i50Var2.r, i50Var2.s, i50Var2.v, i50Var2.C, i50Var2.D, i50Var2.E, i50Var2.F, i50Var2.x, i50Var2.y);
                        i50Var.E();
                        z11 = true;
                        try {
                            f2.s.c(o50Var.s3, true).a(gVar);
                        } catch (Exception e19) {
                            e = e19;
                            FileLog.e(e);
                            i50Var.l();
                            o50Var.W0.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList5222 = o50Var.z0;
                            arrayList5222.clear();
                            arrayList5222.addAll(o50Var.W0.visibleParticipants);
                            ArrayList arrayList6222 = o50Var.A0;
                            arrayList6222.clear();
                            arrayList2 = arrayList;
                            arrayList6222.addAll(arrayList2);
                            ArrayList arrayList7222 = o50Var.B0;
                            arrayList7222.clear();
                            arrayList7222.addAll(o50Var.W0.invitedUsers);
                            ArrayList arrayList8222 = o50Var.C0;
                            arrayList8222.clear();
                            arrayList8222.addAll(o50Var.W0.shadyJoinParticipants);
                            ArrayList arrayList9222 = o50Var.D0;
                            arrayList9222.clear();
                            arrayList9222.addAll(o50Var.W0.shadyLeftParticipants);
                            i50 i50Var3222 = i50Var;
                            o50Var.E0 = i50Var3222.B;
                            i11 = i9;
                            i12 = 0;
                            while (i12 < i11) {
                            }
                            u40Var3 = u40Var2;
                            boolean c10222 = g30Var.c();
                            g30Var2 = g30Var;
                            if (g30Var2.b) {
                            }
                            org.telegram.ui.Components.c20 c20Var2222 = o50Var.l2;
                            c30Var = o50Var.i2;
                            c20Var2222.G(c30Var, z11);
                            if (c30Var.getVisibility() == 0) {
                            }
                            if (C3) {
                            }
                            if (u40Var3.getVisibility() == 0) {
                            }
                            arrayList3 = o50Var.V1;
                            arrayList3.clear();
                            arrayList3.addAll(o50Var.U1);
                            while (i13 < arrayList3.size()) {
                            }
                            call = o50Var.W0;
                            if (call != null) {
                            }
                            ChatObject.Call call22222 = o50Var.W0;
                            if (call22222 == null) {
                            }
                            o50Var.y3.a(z12, z10);
                            if (z12 != o50Var.E2) {
                            }
                        }
                    } catch (Exception e20) {
                        e = e20;
                        z11 = true;
                        FileLog.e(e);
                        i50Var.l();
                        o50Var.W0.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList52222 = o50Var.z0;
                        arrayList52222.clear();
                        arrayList52222.addAll(o50Var.W0.visibleParticipants);
                        ArrayList arrayList62222 = o50Var.A0;
                        arrayList62222.clear();
                        arrayList2 = arrayList;
                        arrayList62222.addAll(arrayList2);
                        ArrayList arrayList72222 = o50Var.B0;
                        arrayList72222.clear();
                        arrayList72222.addAll(o50Var.W0.invitedUsers);
                        ArrayList arrayList82222 = o50Var.C0;
                        arrayList82222.clear();
                        arrayList82222.addAll(o50Var.W0.shadyJoinParticipants);
                        ArrayList arrayList92222 = o50Var.D0;
                        arrayList92222.clear();
                        arrayList92222.addAll(o50Var.W0.shadyLeftParticipants);
                        i50 i50Var32222 = i50Var;
                        o50Var.E0 = i50Var32222.B;
                        i11 = i9;
                        i12 = 0;
                        while (i12 < i11) {
                        }
                        u40Var3 = u40Var2;
                        boolean c102222 = g30Var.c();
                        g30Var2 = g30Var;
                        if (g30Var2.b) {
                        }
                        org.telegram.ui.Components.c20 c20Var22222 = o50Var.l2;
                        c30Var = o50Var.i2;
                        c20Var22222.G(c30Var, z11);
                        if (c30Var.getVisibility() == 0) {
                        }
                        if (C3) {
                        }
                        if (u40Var3.getVisibility() == 0) {
                        }
                        arrayList3 = o50Var.V1;
                        arrayList3.clear();
                        arrayList3.addAll(o50Var.U1);
                        while (i13 < arrayList3.size()) {
                        }
                        call = o50Var.W0;
                        if (call != null) {
                        }
                        ChatObject.Call call222222 = o50Var.W0;
                        if (call222222 == null) {
                        }
                        o50Var.y3.a(z12, z10);
                        if (z12 != o50Var.E2) {
                        }
                    }
                } catch (Exception e21) {
                    e = e21;
                    u40Var2 = u40Var;
                    i9 = childCount;
                    arrayList = arrayList4;
                    i10 = i14;
                    i50Var = i50Var2;
                    FileLog.e(e);
                    i50Var.l();
                    o50Var.W0.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList522222 = o50Var.z0;
                    arrayList522222.clear();
                    arrayList522222.addAll(o50Var.W0.visibleParticipants);
                    ArrayList arrayList622222 = o50Var.A0;
                    arrayList622222.clear();
                    arrayList2 = arrayList;
                    arrayList622222.addAll(arrayList2);
                    ArrayList arrayList722222 = o50Var.B0;
                    arrayList722222.clear();
                    arrayList722222.addAll(o50Var.W0.invitedUsers);
                    ArrayList arrayList822222 = o50Var.C0;
                    arrayList822222.clear();
                    arrayList822222.addAll(o50Var.W0.shadyJoinParticipants);
                    ArrayList arrayList922222 = o50Var.D0;
                    arrayList922222.clear();
                    arrayList922222.addAll(o50Var.W0.shadyLeftParticipants);
                    i50 i50Var322222 = i50Var;
                    o50Var.E0 = i50Var322222.B;
                    i11 = i9;
                    i12 = 0;
                    while (i12 < i11) {
                    }
                    u40Var3 = u40Var2;
                    boolean c1022222 = g30Var.c();
                    g30Var2 = g30Var;
                    if (g30Var2.b) {
                    }
                    org.telegram.ui.Components.c20 c20Var222222 = o50Var.l2;
                    c30Var = o50Var.i2;
                    c20Var222222.G(c30Var, z11);
                    if (c30Var.getVisibility() == 0) {
                    }
                    if (C3) {
                    }
                    if (u40Var3.getVisibility() == 0) {
                    }
                    arrayList3 = o50Var.V1;
                    arrayList3.clear();
                    arrayList3.addAll(o50Var.U1);
                    while (i13 < arrayList3.size()) {
                    }
                    call = o50Var.W0;
                    if (call != null) {
                    }
                    ChatObject.Call call2222222 = o50Var.W0;
                    if (call2222222 == null) {
                    }
                    o50Var.y3.a(z12, z10);
                    if (z12 != o50Var.E2) {
                    }
                }
            } catch (Exception e22) {
                e = e22;
                i50Var = i50Var2;
                u40Var2 = u40Var;
                i9 = childCount;
                arrayList = arrayList4;
                i10 = i16;
                g30Var = g30Var3;
            }
        } catch (Exception e23) {
            e = e23;
            i50Var = i50Var2;
            g30Var = g30Var3;
            u40Var2 = u40Var;
            i9 = childCount;
            arrayList = arrayList4;
            i10 = i16;
        }
        o50Var.W0.saveActiveDates();
        if (view != null) {
            o50Var.U.h1(i10, view.getTop() - u40Var2.getPaddingTop());
        }
        ArrayList arrayList5222222 = o50Var.z0;
        arrayList5222222.clear();
        arrayList5222222.addAll(o50Var.W0.visibleParticipants);
        ArrayList arrayList6222222 = o50Var.A0;
        arrayList6222222.clear();
        arrayList2 = arrayList;
        arrayList6222222.addAll(arrayList2);
        ArrayList arrayList7222222 = o50Var.B0;
        arrayList7222222.clear();
        arrayList7222222.addAll(o50Var.W0.invitedUsers);
        ArrayList arrayList8222222 = o50Var.C0;
        arrayList8222222.clear();
        arrayList8222222.addAll(o50Var.W0.shadyJoinParticipants);
        ArrayList arrayList9222222 = o50Var.D0;
        arrayList9222222.clear();
        arrayList9222222.addAll(o50Var.W0.shadyLeftParticipants);
        i50 i50Var3222222 = i50Var;
        o50Var.E0 = i50Var3222222.B;
        i11 = i9;
        i12 = 0;
        while (i12 < i11) {
            u40 u40Var4 = u40Var2;
            View childAt2 = u40Var4.getChildAt(i12);
            if (((childAt2 instanceof org.telegram.ui.Cells.e4) || (childAt2 instanceof org.telegram.ui.Cells.w3)) && (G = u40Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt2).setDrawDivider(G.b() != i50Var3222222.B + (-2));
                } else {
                    ((org.telegram.ui.Cells.w3) childAt2).setDrawDivider(G.b() != i50Var3222222.B + (-2));
                }
            }
            i12++;
            u40Var2 = u40Var4;
        }
        u40Var3 = u40Var2;
        boolean c10222222 = g30Var.c();
        g30Var2 = g30Var;
        if (g30Var2.b && (videoParticipant2 = g30Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, o50Var.W0)) {
            if (!arrayList2.isEmpty()) {
                o50Var.e1(null);
            } else if (c10222222) {
                o50Var.e1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.c20 c20Var2222222 = o50Var.l2;
            c30Var = o50Var.i2;
            c20Var2222222.G(c30Var, z11);
            if (c30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(c30Var);
            }
            if (C3) {
                o50Var.k2.I(o50Var.j2, z11);
            }
            if (u40Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(u40Var3);
            }
            arrayList3 = o50Var.V1;
            arrayList3.clear();
            arrayList3.addAll(o50Var.U1);
            for (i13 = 0; i13 < arrayList3.size(); i13++) {
                ((org.telegram.ui.Components.voip.t) arrayList3.get(i13)).j(z11);
            }
            call = o50Var.W0;
            if (call != null && g30Var2.b && (videoParticipant = g30Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call22222222 = o50Var.W0;
            z12 = call22222222 == null && !call22222222.visibleVideoParticipants.isEmpty();
            o50Var.y3.a(z12, z10);
            if (z12 != o50Var.E2) {
                o50Var.E2 = z12;
                if (C3) {
                    o50Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.c20 c20Var22222222 = o50Var.l2;
        c30Var = o50Var.i2;
        c20Var22222222.G(c30Var, z11);
        if (c30Var.getVisibility() == 0) {
        }
        if (C3) {
        }
        if (u40Var3.getVisibility() == 0) {
        }
        arrayList3 = o50Var.V1;
        arrayList3.clear();
        arrayList3.addAll(o50Var.U1);
        while (i13 < arrayList3.size()) {
        }
        call = o50Var.W0;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call222222222 = o50Var.W0;
        if (call222222222 == null) {
        }
        o50Var.y3.a(z12, z10);
        if (z12 != o50Var.E2) {
        }
    }

    public final void O1() {
        boolean z10;
        m50 m50Var;
        k40 k40Var = this.K;
        if (k40Var == null || this.W0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i9 = 0;
        for (int i10 = 0; i10 < this.W0.currentSpeakingPeers.m(); i10++) {
            long j10 = this.W0.currentSpeakingPeers.j(i10);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                g30 g30Var = this.W1;
                g30Var.getClass();
                if (g30Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.x2.get(j10, 0) != 1) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i9 < 2) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            if (i9 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0);
                            }
                        }
                    }
                    i9++;
                    if (i9 == 2) {
                        break;
                    }
                }
            }
        }
        if (i9 > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i9);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            k40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 subtitleTextView = k40Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i11 = this.W0.call.participants_count;
        i50 i50Var = this.L;
        subtitleTextView.k(LocaleController.formatPluralString(str, i11 + ((i50Var.I.r1() || i50Var.H || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (m50Var = this.x1) != null) {
            m50Var.setWatchersCount(this.W0.call.participants_count);
        }
        if (z10 != this.q2) {
            this.q2 = z10;
            k40Var.invalidate();
            k40Var.getSubtitleTextView().setPivotX(0.0f);
            k40Var.getSubtitleTextView().setPivotY(k40Var.getMeasuredHeight() >> 1);
            k40Var.getSubtitleTextView().animate().scaleX(this.q2 ? 0.98f : 1.0f).scaleY(this.q2 ? 0.9f : 1.0f).alpha(this.q2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(k40Var.getAdditionalSubtitleTextView(), this.q2);
        }
    }

    public final int P0() {
        u40 u40Var = this.M;
        int childCount = u40Var.getChildCount();
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u40Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i9 = Math.min(i9, childAt.getTop());
            }
        }
        return i9;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.W0;
        y20 y20Var = this.a1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.V0)) {
                y20Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                y20Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        k40 k40Var = this.K;
        if (isEmpty) {
            TLRPC.Chat chat = this.V0;
            if (chat != null && !chat.title.equals(k40Var.getTitle())) {
                if (z10) {
                    this.K.I(this.V0.title, true, 180L, null);
                    k40Var.getTitleTextView().setOnClickListener(new z10(this, 9));
                } else {
                    k40Var.setTitle(this.V0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.V0)) {
                    y20Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (r1()) {
                    y20Var.b(this.V0.title, z10);
                } else {
                    y20Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.V0 == null) {
                k40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                y20Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.W0.call.title.equals(k40Var.getTitle())) {
            if (z10) {
                this.K.I(this.W0.call.title, true, 180L, null);
                k40Var.getTitleTextView().setOnClickListener(new z10(this, 8));
            } else {
                k40Var.setTitle(this.W0.call.title);
            }
            y20Var.b(this.W0.call.title, z10);
        }
        org.telegram.ui.ActionBar.h5 titleTextView = k40Var.getTitleTextView();
        if (!this.W0.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                y20Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                y20Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new k50(titleTextView));
            TextView textView = y20Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new k50(textView), (Drawable) null);
            TextView nextTextView = y20Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new k50(nextTextView), (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.V0);
        }
        ChatObject.Call call = this.W0;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void Q1() {
        float f10;
        org.telegram.ui.Components.lb lbVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f11 = this.u0 - dp;
        if (this.backgroundPaddingTop + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r0) * f10);
        } else {
            f10 = 0.0f;
        }
        this.topBulletinContainer.setTranslationY(AndroidUtilities.lerp(((-r0.getTop()) - this.topBulletinContainer.getHeight()) + f11 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), this.K.getY() + (-this.topBulletinContainer.getTop()) + r4.getHeight(), f10));
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar == null || (lbVar = gcVar.e) == null || lbVar.getParent() == null || lbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        lbVar.setTop(f10 > 0.5f);
    }

    public final void R0() {
        if (this.N1) {
            this.N1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.u2);
        }
        if (this.O1) {
            this.O1 = false;
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
        if (!this.Y2) {
            l30 l30Var = this.X1;
            if (l30Var.getVisibility() == 0 && l30Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.h2 == z10) {
                    this.h2 = z10;
                    this.e.invalidate();
                    this.containerView.invalidate();
                    this.M.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.h2 == z10) {
        }
    }

    public final void T0() {
        this.B.setTranslationY((-this.y1.c()) + this.containerView.getPaddingBottom());
        this.C.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.v3.e);
        U0();
        V0();
    }

    public final void U0() {
        float f10 = this.y1.b.a;
        int i9 = f10 > 0.0f ? 0 : 8;
        r30 r30Var = this.B;
        r30Var.setAlpha(f10);
        q30 q30Var = this.C;
        q30Var.setAlpha(f10);
        if (r30Var.getVisibility() != i9) {
            r30Var.setVisibility(i9);
            q30Var.setVisibility(i9);
            if (i9 == 8) {
                o30 o30Var = this.D;
                if (o30Var.isFocused()) {
                    o30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.uj0 uj0Var = this.G;
        if (uj0Var != null) {
            float f10 = this.y1.b.a * this.w3.e;
            uj0Var.setAlpha(f10);
            int i9 = f10 > 0.0f ? 0 : 8;
            if (this.G.getVisibility() != i9) {
                this.G.setVisibility(i9);
                if (i9 == 8) {
                    this.G.n();
                }
            }
            org.telegram.ui.Components.uj0 uj0Var2 = this.G;
            if (uj0Var2.J0 || f10 != 1.0f) {
                return;
            }
            uj0Var2.J0 = true;
        }
    }

    public final void W0() {
        boolean z10 = C3;
        s20 s20Var = this.e;
        if (z10) {
            s20Var.setTranslationX(0.0f);
            s20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        td.a aVar = this.v3;
        if (z11) {
            s20Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            s20Var.setTranslationY(0.0f);
        } else {
            s20Var.setTranslationX(0.0f);
            s20Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z10 = C3;
        c30 c30Var = this.i2;
        if (z10) {
            c30Var.setTranslationX(0.0f);
            c30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        td.a aVar = this.v3;
        if (z11) {
            c30Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            c30Var.setTranslationY(0.0f);
        } else {
            c30Var.setTranslationX(0.0f);
            c30Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float f10 = this.x3.e;
        xg.i iVar = this.y1;
        float lerp = AndroidUtilities.lerp(C3 ? (1.0f - this.y3.e) * AndroidUtilities.dp(-91.0f) : B3 ? 0.0f : ((this.v3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.W1.c)) - AndroidUtilities.dp(91.0f), -((iVar.c() - this.containerView.getPaddingBottom()) + f10 + (AndroidUtilities.dp(68.0f) * this.w3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.u0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        tg.i iVar2 = this.Y;
        iVar2.setTranslationY(lerp);
        iVar2.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.G != null) {
            this.G.setTranslationY((-this.y1.c()) + this.containerView.getPaddingBottom() + ((-this.w3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        float f10 = this.w3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView = this.F;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        imageView.setClickable(f10 > 0.9f);
        float f11 = 1.0f - f10;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f11);
        ImageView imageView2 = this.E;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        imageView2.setClickable(f11 > 0.9f);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.V2;
        if (tVar != null) {
            tVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.V2;
            tVar2.h = false;
            tVar2.j(false);
            this.V2.invalidate();
            this.W1.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.T2;
        if (e4Var != null && !this.X2 && e4Var.getParent() != null) {
            this.containerView.removeView(this.T2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.T2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.T2.setAboutVisible(false);
            this.T2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.b20 b20Var = this.W2;
        if (b20Var != null) {
            b20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.T2 = null;
        this.U2 = null;
        this.W2 = null;
        this.V2 = null;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return !this.W1.b;
    }

    public final void d1(boolean z10) {
        if (this.Y2 || !this.b2) {
            return;
        }
        if (z10) {
            this.Y2 = true;
            y1(false, this.T2);
            return;
        }
        b1();
        this.containerView.removeView(this.a2);
        this.a2 = null;
        this.y2.setVisibility(8);
        this.containerView.invalidate();
        this.b2 = false;
        this.U.X = true;
        this.M.invalidate();
        this.X1.setVisibility(8);
        if (this.o0) {
            this.o0 = false;
            O0(true);
        }
        S0();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i11;
        int i12;
        int i13 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        u40 u40Var = this.M;
        int i14 = 0;
        if (i9 == i13) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.W0;
            if (call == null || call.call.id != l10.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.W0;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.p0;
            AccountInstance accountInstance = this.d;
            if (j10 == 0 && (((i12 = this.B1) == 7 || i12 == 5 || i12 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.e0, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", i1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.X0);
                    intent.putExtra("peerChannelId", this.U0.channel_id);
                    intent.putExtra("peerChatId", this.U0.chat_id);
                    intent.putExtra("peerUserId", this.U0.user_id);
                    intent.putExtra("hash", this.Y0);
                    intent.putExtra("peerAccessHash", this.U0.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.g2);
                    this.e0.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                this.p0 = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new b20(this, 2), 3000L);
            }
            if (!this.q0 && VoIPService.getSharedInstance() != null) {
                this.W0.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            I1();
            int childCount = u40Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = u40Var.getChildAt(i15);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                }
            }
            if (this.T2 != null) {
                this.o0 = true;
            } else {
                O0(true);
            }
            O1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.B1 == 4;
            N1(true, booleanValue);
            P1(true);
            if (z10 && ((i11 = this.B1) == 1 || i11 == 0)) {
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
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                break;
                            }
                            TLRPC.Dialog dialog = allDialogs.get(i16);
                            i16++;
                            if (dialog.id == longValue) {
                                i14 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                    if (user != null) {
                        if (this.W0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i14 != 0) {
                            k1().k(0L, 44, user, this.V0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.W0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i14 != 0) {
                        k1().k(0L, 44, chat, this.V0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            g30 g30Var = this.W1;
            if (g30Var.b && this.W0 != null) {
                boolean c10 = g30Var.c();
                ChatObject.Call call3 = this.W0;
                if (call3 != null && g30Var.b && (videoParticipant = g30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i17 = 0;
                    while (true) {
                        ArrayList arrayList = this.m0;
                        if (i17 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i17);
                        if (this.W0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && g30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i17++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            g30Var.setVisibleParticipant(true);
            O1();
            return;
        }
        if (i9 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i9 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog$Builder N = org.telegram.ui.Components.y4.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new e20(this, 1));
                try {
                    N.o();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        if (i9 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.w0);
            ChatObject.Call call4 = this.W0;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            O0(true);
            AndroidUtilities.updateVisibleRows(u40Var);
            if (this.A2 != null) {
                while (i14 < this.A2.getChildCount()) {
                    View childAt2 = this.A2.getChildAt(i14);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = u40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i14 < childCount2) {
                f2.q1 G = u40Var.G(u40Var.getChildAt(i14));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                        if (e4Var.getParticipant() != null) {
                            e4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i14++;
            }
            return;
        }
        if (i9 == NotificationCenter.userInfoDidLoad) {
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.w0);
            if (this.W0 == null || peerId2 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            O0(true);
            AndroidUtilities.updateVisibleRows(u40Var);
            if (this.A2 != null) {
                while (i14 < this.A2.getChildCount()) {
                    View childAt3 = this.A2.getChildAt(i14);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt3).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(u40Var);
            return;
        }
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(u40Var);
            return;
        }
        if (i9 == NotificationCenter.groupCallScreencastStateChanged) {
            a40 a40Var = this.v0;
            if (a40Var != null) {
                a40Var.b(true, true);
            }
            I1();
            return;
        }
        if (i9 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            z40 z40Var = this.l0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            z40Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        LaunchActivity launchActivity = this.e0;
        launchActivity.W0.remove(this.r2);
        this.e0.setRequestedOrientation(-1);
        A3 = false;
        org.telegram.ui.Components.b30 b30Var = this.A1;
        if (b30Var != null) {
            b30Var.dismiss();
        }
        this.o0 = true;
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
        g30 g30Var = this.W1;
        if (g30Var != null) {
            if (this.m2 != null) {
                this.M.getViewTreeObserver().removeOnPreDrawListener(this.m2);
                this.m2 = null;
            }
            ArrayList arrayList = this.V1;
            arrayList.clear();
            ArrayList arrayList2 = this.U1;
            arrayList.addAll(arrayList2);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).f();
                g30Var.removeView((View) arrayList.get(i9));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).b(true);
            }
            arrayList2.clear();
            if (g30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(g30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (z3 == this) {
            z3 = null;
        }
        A3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.j20.j(getContext());
        ChatObject.Call call = this.W0;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.e0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.e0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
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
            this.e0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            g30 g30Var = this.W1;
            if (g30Var.r != null) {
                return;
            }
            boolean z10 = C3;
            u40 u40Var = this.M;
            int i9 = 0;
            if (!z10) {
                if (this.m2 != null) {
                    u40Var.getViewTreeObserver().removeOnPreDrawListener(this.m2);
                    this.m2 = null;
                }
                if (videoParticipant == null) {
                    if (u40Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = u40Var.getViewTreeObserver();
                        h40 h40Var = new h40(this);
                        this.m2 = h40Var;
                        viewTreeObserver.addOnPreDrawListener(h40Var);
                        return;
                    }
                    u40Var.setVisibility(0);
                    O0(false);
                    this.o0 = true;
                    ViewTreeObserver viewTreeObserver2 = u40Var.getViewTreeObserver();
                    g40 g40Var = new g40(this);
                    this.m2 = g40Var;
                    viewTreeObserver2.addOnPreDrawListener(g40Var);
                    return;
                }
                c30 c30Var = this.i2;
                if (c30Var.getVisibility() == 0) {
                    g30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(c30Var);
                    return;
                }
                c30Var.setVisibility(0);
                org.telegram.ui.Components.c20 c20Var = this.l2;
                c20Var.G(c30Var, false);
                this.o0 = true;
                if (!g30Var.b) {
                    ArrayList arrayList = c20Var.e;
                    f2.m0 m0Var = (f2.m0) c30Var.getLayoutManager();
                    if (m0Var != null) {
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i9)).equals(videoParticipant)) {
                                m0Var.h1(i9, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i9++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = u40Var.getViewTreeObserver();
                f40 f40Var = new f40(this, videoParticipant);
                this.m2 = f40Var;
                viewTreeObserver3.addOnPreDrawListener(f40Var);
                return;
            }
            if (this.m2 != null) {
                u40Var.getViewTreeObserver().removeOnPreDrawListener(this.m2);
                this.m2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            u50 u50Var = this.k2;
            ArrayList arrayList3 = this.U1;
            ArrayList arrayList4 = this.V1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList4.get(i10);
                    org.telegram.ui.Components.voip.l lVar = tVar.c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.b20 b20Var = tVar.d;
                        if (b20Var != null) {
                            b20Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new b40(this, tVar));
                    }
                }
                this.L2 = false;
                u50Var.H(this.j2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i11);
                    if (tVar2.e != null && ((videoParticipant2 = tVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.w);
                        tVar2.b(false);
                        org.telegram.ui.Components.b20 b20Var2 = tVar2.d;
                        if (b20Var2 != null) {
                            b20Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new c40(this, tVar2));
                    }
                }
                this.L2 = true;
                u50Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(27, this, arrayList2));
                }
            }
            boolean z11 = !g30Var.b;
            ViewTreeObserver viewTreeObserver4 = u40Var.getViewTreeObserver();
            e40 e40Var = new e40(this, videoParticipant, z11);
            this.m2 = e40Var;
            viewTreeObserver4.addOnPreDrawListener(e40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.u3;
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
        TLRPC.Chat chat = this.V0;
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
            if (this.W0 == null) {
                return;
            }
            int i9 = 0;
            while (i9 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.W0.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i9 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.k0(this, i9, z10, 1));
                i9++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.V0);
        String p6 = !TextUtils.isEmpty(publicUsername) ? aa.d.p(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(p6)) {
            u1(null, p6, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.V0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new gh.m7(this, chatFull, z10, 6));
    }

    public final UndoView k1() {
        if (!C3) {
            g30 g30Var = this.W1;
            if (g30Var.b) {
                return g30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f0;
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
        if (this.q0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.q0 = true;
        this.z0.addAll(this.W0.visibleParticipants);
        this.A0.addAll(this.m0);
        this.B0.addAll(this.W0.invitedUsers);
        this.C0.addAll(this.W0.shadyJoinParticipants);
        this.D0.addAll(this.W0.shadyLeftParticipants);
        this.P1 = sharedInstance.getCallState();
        if (this.W0 == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.W0 = call;
            this.l2.c = call;
            this.W1.setGroupCall(call);
            this.k2.c = this.W0;
        }
        tg.i iVar = this.Y;
        if (iVar != null) {
            iVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.W0.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        t40 t40Var = this.R;
        if (t40Var == null || t40Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        M1(true);
        this.s1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        u40 u40Var = this.M;
        u40Var.setVisibility(0);
        org.telegram.ui.ActionBar.w0 w0Var = this.h1;
        w0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u40Var, (Property<u40, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u40Var, (Property<u40, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(t40Var, (Property<t40, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t40Var, (Property<t40, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(t40Var, (Property<t40, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var = this.Q;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.S;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.gr.g);
        animatorSet.addListener(new i40(this, 0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.W0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.W0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.k20
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        o50 o50Var = o50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new gh.i(o50Var, c2VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        o50Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.lg(o50Var, j11, c2VarArr2, user, 8));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new rl(this, c2VarArr, sendRequest, 28), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.u0 - dp;
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
        u40 u40Var = this.M;
        if (u40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(u40Var);
        }
        c30 c30Var = this.i2;
        if (c30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(c30Var);
        }
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        a40 a40Var = this.v0;
        if (a40Var != null) {
            a40Var.b(false, false);
            return;
        }
        if (this.b2) {
            d1(true);
        } else if (this.W1.b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
        }
        a40 a40Var = this.v0;
        if (a40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        a40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.e0;
        launchActivity.W0.add(this.r2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        A3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.j20.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i9) {
        this.P1 = i9;
        N1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean q1() {
        return r1() && !this.W0.visibleVideoParticipants.isEmpty() && (this.W0.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.W0.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean r1() {
        ChatObject.Call call = this.W0;
        return call != null && call.call.rtmp_stream;
    }

    public final void s1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.s0) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.e0.O().getFragmentStack().get(this.e0.O().getFragmentStack().size() - 1);
        if (o2Var instanceof qn) {
            boolean P9 = ((qn) o2Var).P9();
            this.s0 = true;
            this.t0 = true;
            AndroidUtilities.runOnUIThread(new bg.d(f3Var, editTextBoldCursor, z10, c2Var, 18), P9 ? 200L : 0L);
            return;
        }
        this.s0 = true;
        this.t0 = true;
        if (f3Var != null) {
            f3Var.setFocusable(true);
        } else if (c2Var != null) {
            c2Var.k(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new yg(2, editTextBoldCursor), 100L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.g1.Z.R) {
            org.telegram.ui.Components.voip.g1.j();
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
        LaunchActivity launchActivity = this.e0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(this.e0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof qn) {
                z12 = ((qn) o2Var).P9();
                this.t0 = true;
                this.s0 = true;
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
                    str5 = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                }
                j40 j40Var = new j40(this, getContext(), str5, str3, str4, str3);
                this.n0 = j40Var;
                j40Var.o0 = new g(this, 20);
                j40Var.setOnDismissListener(new e20(this, 3));
                AndroidUtilities.runOnUIThread(new b20(this, 7), !z12 ? 200L : 0L);
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
        j40 j40Var2 = new j40(this, getContext(), str5, str3, str4, str3);
        this.n0 = j40Var2;
        j40Var2.o0 = new g(this, 20);
        j40Var2.setOnDismissListener(new e20(this, 3));
        AndroidUtilities.runOnUIThread(new b20(this, 7), !z12 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.W0;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
        c2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.W0.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new y9(this, c2Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i9) {
        String str;
        TextView textView;
        VoIPService voIPService;
        int i10;
        String str2;
        String str3;
        EditText editText;
        org.telegram.ui.ActionBar.c2 c2Var;
        float f10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
        int i11 = 5;
        if (i9 == 0 || i9 == 2 || i9 == 3) {
            if (i9 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().k(0L, 30, user, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i12 = org.telegram.ui.ActionBar.f6.pg;
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
            c2Var2.E = i12;
            TextView textView2 = new TextView(getContext());
            int i13 = org.telegram.ui.ActionBar.f6.hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
            o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(o9Var, g7.e6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            z8Var.j(this.currentAccount, user);
            boolean z10 = user instanceof TLRPC.User;
            if (z10) {
                TLRPC.User user2 = (TLRPC.User) user;
                o9Var.e(user2, z8Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                o9Var.e(chat, z8Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.V0;
            String str4 = chat2 != null ? chat2.title : "";
            if (i9 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                org.telegram.messenger.ll.q(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                org.telegram.messenger.ll.q(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    org.telegram.messenger.ll.q(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    org.telegram.messenger.ll.q(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(textView3, g7.e6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i9 == 2) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupUserRemove), new yr(11, this, user));
            } else if (z10) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupAdd), new b9.a(this, (TLRPC.User) user, j10, 8));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var2.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false));
            c2Var2.show();
            if (i9 != 2 || (textView = (TextView) c2Var2.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.vg, false));
            return;
        }
        if (i9 == 6) {
            this.e0.K0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.e0.p0(new qn(bundle));
            dismiss();
            return;
        }
        if (i9 == 8) {
            this.e0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.e0.O().getFragmentStack().get(this.e0.O().getFragmentStack().size() - 1);
            if ((o2Var instanceof qn) && ((qn) o2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.e0.p0(new qn(bundle2));
            dismiss();
            return;
        }
        if (i9 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            J1(2, true);
            return;
        }
        int i14 = 9;
        if (i9 == 9) {
            org.telegram.ui.Components.e40 e40Var = this.d2;
            if (e40Var == null || !e40Var.h()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.e40 e40Var2 = new org.telegram.ui.Components.e40(0, true, true);
                this.d2 = e40Var2;
                e40Var2.D = true;
                e40Var2.N = true;
                e40Var2.C = true;
                e40Var2.F = true;
                e40Var2.O = true;
                e40Var2.a = this.e0.O().getLastFragment();
                org.telegram.ui.Components.e40 e40Var3 = this.d2;
                w40 w40Var = new w40(this, j10);
                this.e2 = w40Var;
                e40Var3.b = w40Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                e40Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new b20(this, i14), new kh.g1(i11), 0);
                return;
            }
            return;
        }
        if (i9 != 10) {
            if (i9 != 11) {
                if (i9 == 5) {
                    sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                    k1().m(0L, user, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    voIPService = sharedInstance;
                    i10 = 1;
                    voIPService.editCallMember(user, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    voIPService = sharedInstance;
                    i10 = 1;
                    voIPService.editCallMember(user, Boolean.FALSE, null, 10000, null, null);
                }
                voIPService.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                k1().k(0L, i9 == i10 ? 31 : 36, user, null, null, null);
                return;
            }
            Context context = getContext();
            int i15 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.y4.a;
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
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
            c2Var3.N = string;
            LinearLayout f11 = org.telegram.messenger.ll.f(context, 1);
            EditText editText2 = new EditText(context);
            int i16 = org.telegram.ui.ActionBar.f6.hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(LocaleController.isRTL ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j10 > 0 ? 5 : 6);
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
            editText2.setBackground(org.telegram.ui.ActionBar.f6.S(context));
            editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText2.requestFocus();
            if (j10 > 0) {
                editText = new EditText(context);
                editText.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(LocaleController.isRTL ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(LocaleController.getString(R.string.LastName));
                editText.setBackground(org.telegram.ui.ActionBar.f6.S(context));
                editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            } else {
                editText = null;
            }
            AndroidUtilities.showKeyboard(editText2);
            f11.addView(editText2, g7.e6.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                f11.addView(editText, g7.e6.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str2);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder2.n(f11);
            org.telegram.ui.ActionBar.b2 q1Var = new mh.q1(editText2, j10, i15, editText);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Save), q1Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            c2Var3.J = new bg.j(8, editText2, editText);
            c2Var3.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false));
            c2Var3.show();
            c2Var3.o(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
            td tdVar = new td(1 == true ? 1 : 0, c2Var3, q1Var);
            if (editText != null) {
                editText.setOnEditorActionListener(tdVar);
                return;
            } else {
                editText2.setOnEditorActionListener(tdVar);
                return;
            }
        }
        String str5 = groupCallParticipant.about;
        Context context2 = getContext();
        int i17 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.y4.a;
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
        org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder3.a;
        c2Var4.N = string2;
        c2Var4.P = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setClipChildren(false);
        if (j10 < 0) {
            c2Var = c2Var4;
            long j11 = -j10;
            if (MessagesController.getInstance(i17).getChatFull(j11) == null) {
                f10 = 8.0f;
                MessagesController.getInstance(i17).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                NumberTextView numberTextView = new NumberTextView(context2);
                EditText editText3 = new EditText(context2);
                int i18 = org.telegram.ui.ActionBar.f6.hg;
                editText3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                editText3.setHint(LocaleController.getString(j10 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
                editText3.setTextSize(1, 16.0f);
                editText3.setBackground(org.telegram.ui.ActionBar.f6.S(context2));
                editText3.setMaxLines(4);
                editText3.setRawInputType(147457);
                editText3.setImeOptions(6);
                int i19 = j10 <= 0 ? 70 : 255;
                editText3.setFilters(new InputFilter[]{new org.telegram.ui.Components.j3(i19, context2, numberTextView)});
                numberTextView.setCenterAlign(true);
                numberTextView.setTextSize(15);
                numberTextView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
                numberTextView.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView, g7.e6.d(20, 20.0f, !LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                editText3.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f10), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f10));
                editText3.addTextChangedListener(new org.telegram.ui.Components.zp(i19, numberTextView));
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                editText3.setText(str5);
                editText3.setSelection(editText3.getText().toString().length());
                alertDialog$Builder3.n(frameLayout2);
                final i3.e eVar = new i3.e(editText3, i17, j10, 2);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Save), eVar);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                final org.telegram.ui.ActionBar.c2 c2Var5 = c2Var;
                c2Var5.J = new org.telegram.ui.Components.o1(editText3, 1 == true ? 1 : 0);
                frameLayout2.addView(editText3, g7.e6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                editText3.requestFocus();
                AndroidUtilities.showKeyboard(editText3);
                editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.r1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                        if (i20 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                            org.telegram.ui.ActionBar.c2 c2Var6 = c2Var5;
                            if (c2Var6.isShowing()) {
                                eVar.f(c2Var6, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                c2Var5.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false));
                c2Var5.show();
                c2Var5.o(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
            }
        } else {
            c2Var = c2Var4;
        }
        f10 = 8.0f;
        NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText32 = new EditText(context2);
        int i182 = org.telegram.ui.ActionBar.f6.hg;
        editText32.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i182, false));
        editText32.setHint(LocaleController.getString(j10 <= 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        editText32.setTextSize(1, 16.0f);
        editText32.setBackground(org.telegram.ui.ActionBar.f6.S(context2));
        editText32.setMaxLines(4);
        editText32.setRawInputType(147457);
        editText32.setImeOptions(6);
        if (j10 <= 0) {
        }
        editText32.setFilters(new InputFilter[]{new org.telegram.ui.Components.j3(i19, context2, numberTextView2)});
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        numberTextView2.setImportantForAccessibility(2);
        frameLayout2.addView(numberTextView2, g7.e6.d(20, 20.0f, !LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
        editText32.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f10), !LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f10));
        editText32.addTextChangedListener(new org.telegram.ui.Components.zp(i19, numberTextView2));
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView2, false, 0.0f, false);
        editText32.setText(str5);
        editText32.setSelection(editText32.getText().toString().length());
        alertDialog$Builder3.n(frameLayout2);
        final i3.e eVar2 = new i3.e(editText32, i17, j10, 2);
        alertDialog$Builder3.k(LocaleController.getString(R.string.Save), eVar2);
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        final org.telegram.ui.ActionBar.c2 c2Var52 = c2Var;
        c2Var52.J = new org.telegram.ui.Components.o1(editText32, 1 == true ? 1 : 0);
        frameLayout2.addView(editText32, g7.e6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText32.requestFocus();
        AndroidUtilities.showKeyboard(editText32);
        editText32.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.r1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                if (i20 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                    org.telegram.ui.ActionBar.c2 c2Var6 = c2Var52;
                    if (c2Var6.isShowing()) {
                        eVar2.f(c2Var6, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        c2Var52.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false));
        c2Var52.show();
        c2Var52.o(org.telegram.ui.ActionBar.f6.w0(null, i182, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(boolean z10, org.telegram.ui.Cells.e4 e4Var) {
        float f10;
        float f11;
        final float f12;
        int measuredHeight;
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.X2;
        i30 i30Var = this.b;
        u40 u40Var = this.M;
        if (z11) {
            f12 = (u40Var.getX() + (e4Var.getX() + e4Var.getAvatarImageView().getX())) - paddingLeft;
            f11 = (u40Var.getY() + (e4Var.getY() + e4Var.getAvatarImageView().getY())) - paddingTop;
            f10 = e4Var.getAvatarImageView().getMeasuredHeight() / u40Var.getMeasuredWidth();
            measuredHeight = (int) ((e4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f10);
        } else {
            if (this.V2 == null) {
                this.K2 = true;
            } else {
                this.K2 = z10 || i30Var.z0.k(i30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.U2;
            g30 g30Var = this.W1;
            if (lVar == null || !this.K2) {
                org.telegram.ui.Components.b20 b20Var = this.W2;
                if (b20Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.V2;
                    c30 c30Var = this.i2;
                    if (tVar3 == null) {
                        float x10 = (g30Var.getX() + (c30Var.getX() + (this.W2.getX() + b20Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y10 = (g30Var.getY() + (c30Var.getY() + (this.W2.getY() + this.W2.getAvatarImageView().getY()))) - paddingTop;
                        f10 = this.W2.getAvatarImageView().getMeasuredHeight() / u40Var.getMeasuredWidth();
                        measuredHeight = (int) ((this.W2.getAvatarImageView().getMeasuredHeight() >> 1) / f10);
                        f11 = y10;
                        f12 = x10;
                        if (!this.K2 && (tVar = this.V2) != null) {
                            tVar.invalidate();
                            g30Var.invalidate();
                            org.telegram.ui.Components.voip.t tVar4 = this.V2;
                            tVar4.h = false;
                            tVar4.j(false);
                            this.V2 = null;
                        }
                    } else if (this.K2) {
                        f12 = (g30Var.getX() + (c30Var.getX() + b20Var.getX())) - paddingLeft;
                        f11 = (g30Var.getY() + (c30Var.getY() + this.W2.getY())) - paddingTop;
                    }
                }
                f10 = 0.96f;
                f11 = 0.0f;
                f12 = 0.0f;
                measuredHeight = 0;
                if (!this.K2) {
                    tVar.invalidate();
                    g30Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar42 = this.V2;
                    tVar42.h = false;
                    tVar42.j(false);
                    this.V2 = null;
                }
            } else {
                float x11 = (u40Var.getX() + lVar.getX()) - paddingLeft;
                f11 = ((u40Var.getY() + this.U2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                f12 = x11;
            }
            f10 = 1.0f;
            measuredHeight = 0;
            if (!this.K2) {
            }
        }
        final float f13 = f11;
        final float f14 = f10;
        h30 h30Var = this.z2;
        if (z10) {
            j30 j30Var = this.y2;
            j30Var.setScaleX(f14);
            j30Var.setScaleY(f14);
            j30Var.setTranslationX(f12);
            j30Var.setTranslationY(f13);
            h30Var.setAlpha(0.0f);
        }
        i30Var.N(measuredHeight, measuredHeight);
        if (this.c2) {
            l30 l30Var = this.X1;
            if (z10) {
                l30Var.setAlpha(0.0f);
            }
            l30Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        }
        h30Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        if (!z10 && (tVar2 = this.V2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (i30Var.z0.k(i30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.V2.a;
                oVar.A = false;
                oVar.B = 0L;
                this.U2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i9 = measuredHeight;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.h20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o50.p(o50.this, f14, f12, f13, i9, valueAnimator);
            }
        });
        this.Z2 = this.d.getNotificationCenter().setAnimationInProgress(this.Z2, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar5 = this.U2 != null ? this.V2 : null;
        if (tVar5 != null) {
            tVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, tVar5, z10, 8));
        if (this.X2 || this.V2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.setDuration(220L);
            this.V2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.o oVar2 = this.V2.a;
            if (oVar2.A) {
                oVar2.C.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        S0();
    }

    public final void z1() {
        v5 v5Var = this.w2;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        if (!this.v2 || this.Q0 == null || VoIPService.getSharedInstance() == null || !r1() || this.M == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(v5Var, 30L);
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
