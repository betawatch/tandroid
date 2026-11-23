package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs, VoIPService.StateListener, te.b {
    public static f40 C5;
    public static boolean D5;
    public static boolean E5;
    public static boolean F5;
    public static volatile org.telegram.messenger.r5 G5 = new org.telegram.messenger.r5("updateTextureLightningQueue", true);
    public static boolean H5;
    public final o20 A1;
    public final ArrayList A2;
    public final d40 A3;
    public final LongSparseIntArray A4;
    public final te.c A5;
    public final m20 B1;
    public final ArrayList B2;
    public final rh.h B3;
    public final e20 B4;
    public final te.a B5;
    public final k20 C1;
    public final ArrayList C2;
    public v00 C3;
    public final c20 C4;
    public final ImageView D1;
    public int D2;
    public org.telegram.ui.Components.v20 D3;
    public LinearLayout D4;
    public final ImageView E1;
    public final org.telegram.ui.Components.oh0 E2;
    public int E3;
    public boolean E4;
    public org.telegram.ui.Components.xi0 F1;
    public final org.telegram.ui.Components.oh0 F2;
    public boolean F3;
    public final org.telegram.ui.Components.oh0 F4;
    public final l30 G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public final org.telegram.ui.Components.o6 H1;
    public final org.telegram.ui.Components.w9 H2;
    public final Paint H3;
    public boolean H4;
    public final u10 I1;
    public final org.telegram.ui.Components.w9 I2;
    public final Paint I3;
    public final View I4;
    public final d30 J1;
    public float J2;
    public final e40[] J3;
    public final View J4;
    public final z30 K1;
    public float K2;
    public float K3;
    public GradientDrawable K4;
    public final n30 L1;
    public float L2;
    public e40 L3;
    public final int[] L4;
    public final t20 M1;
    public RadialGradient M2;
    public e40 M3;
    public final y10 M4;
    public final TextView N1;
    public final Matrix N2;
    public long N3;
    public boolean N4;
    public final r20 O1;
    public final Paint O2;
    public float O3;
    public boolean O4;
    public final org.telegram.ui.ActionBar.m5 P1;
    public final u30 P2;
    public float P3;
    public RenderNode P4;
    public final m30 Q1;
    public float Q2;
    public boolean Q3;
    public float Q4;
    public final org.telegram.ui.ActionBar.m5 R1;
    public float R2;
    public boolean R3;
    public boolean R4;
    public final t30 S1;
    public ValueAnimator S2;
    public int S3;
    public final String[] S4;
    public final org.telegram.ui.Components.xy T1;
    public TLRPC.InputPeer T2;
    public float T3;
    public ObjectAnimator T4;
    public final ImageReceiver U1;
    public TLRPC.Chat U2;
    public int U3;
    public ObjectAnimator U4;
    public int V1;
    public org.telegram.messenger.t3 V2;
    public boolean V3;
    public final y20 V4;
    public final ImageView W1;
    public final boolean W2;
    public final int[] W3;
    public org.telegram.ui.Cells.g4 W4;
    public final nh.h X1;
    public final String X2;
    public final ArrayList X3;
    public org.telegram.ui.Components.voip.r X4;
    public final int Y1;
    public final a40 Y2;
    public final ArrayList Y3;
    public org.telegram.ui.Components.voip.y Y4;
    public final RadialProgressView Z1;
    public final t10 Z2;
    public final b20 Z3;
    public org.telegram.ui.Components.u10 Z4;
    public final Drawable a2;
    public final v10 a3;
    public final g20 a4;
    public boolean a5;
    public final View b2;
    public final Paint b3;
    public final u20 b4;
    public boolean b5;
    public AnimatorSet c2;
    public ValueAnimator c3;
    public float c4;
    public int c5;
    public LaunchActivity d2;
    public float d3;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout d4;
    public AnimatorSet d5;
    public final UndoView[] e2;
    public final LinearLayout e3;
    public boolean e4;
    public h30 e5;
    public final org.telegram.ui.Cells.k f2;
    public final org.telegram.ui.ActionBar.q0 f3;
    public boolean f4;
    public int f5;
    public boolean g2;
    public final org.telegram.ui.ActionBar.q0 g3;
    public org.telegram.ui.Components.x30 g4;
    public int g5;
    public org.telegram.ui.Components.m30 h2;
    public final org.telegram.ui.ActionBar.q0 h3;
    public o30 h4;
    public int h5;
    public org.telegram.ui.Components.m30 i2;
    public final org.telegram.ui.ActionBar.y0 i3;
    public Boolean i4;
    public int i5;
    public int j2;
    public final org.telegram.ui.ActionBar.y0 j3;
    public int j4;
    public int j5;
    public g.b k2;
    public final org.telegram.ui.ActionBar.y0 k3;
    public boolean k4;
    public int k5;
    public final ArrayList l2;
    public final org.telegram.ui.ActionBar.y0 l3;
    public final x10 l4;
    public int l5;
    public final d20 m1;
    public b30 m2;
    public final org.telegram.ui.ActionBar.y0 m3;
    public final org.telegram.ui.Components.ek0 m4;
    public int m5;
    public final i10 n1;
    public boolean n2;
    public final org.telegram.ui.Components.voip.q0 n3;
    public final i40 n4;
    public int n5;
    public final org.telegram.messenger.c o1;
    public long o2;
    public final org.telegram.ui.Components.voip.s0 o3;
    public final org.telegram.ui.Components.v10 o4;
    public int o5;
    public final o10 p1;
    public boolean p2;
    public final ai.s2 p3;
    public ViewTreeObserver.OnPreDrawListener p4;
    public int p5;
    public final org.telegram.ui.Components.voip.q2 q1;
    public final RectF q2;
    public final org.telegram.ui.ActionBar.y0 q3;
    public final org.telegram.ui.Components.voip.n q4;
    public int q5;
    public final org.telegram.ui.Components.voip.q2 r1;
    public boolean r2;
    public final org.telegram.ui.ActionBar.y0 r3;
    public boolean r4;
    public int r5;
    public final org.telegram.ui.Components.voip.q2 s1;
    public boolean s2;
    public final org.telegram.ui.ActionBar.y0 s3;
    public final ArrayList s4;
    public int s5;
    public final org.telegram.ui.Components.voip.q2 t1;
    public float t2;
    public final org.telegram.ui.ActionBar.y0 t3;
    public boolean t4;
    public int t5;
    public final org.telegram.ui.Components.voip.q2 u1;
    public w20 u2;
    public final org.telegram.ui.ActionBar.y0 u3;
    public final v00 u4;
    public int u5;
    public final org.telegram.ui.Components.voip.q2 v1;
    public TLRPC.Peer v2;
    public final org.telegram.ui.ActionBar.y0 v3;
    public final s10 v4;
    public final i30 v5;
    public final org.telegram.ui.Components.voip.q2 w1;
    public TLObject w2;
    public final org.telegram.ui.ActionBar.y0 w3;
    public final org.telegram.ui.Components.me w4;
    public Boolean w5;
    public final p10 x1;
    public final Paint x2;
    public final org.telegram.ui.ActionBar.y0 x3;
    public final v00 x4;
    public Integer x5;
    public final ImageView y1;
    public final ArrayList y2;
    public final LinearLayout y3;
    public boolean y4;
    public final te.a y5;
    public final Paint z1;
    public final ArrayList z2;
    public final TextView z3;
    public final m4 z4;
    public final te.a z5;

    public f40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.t3 t3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.h6) null, true, true);
        final f40 f40Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.z1 = new Paint(1);
        this.e2 = new UndoView[2];
        this.l2 = new ArrayList();
        this.q2 = new RectF();
        this.x2 = new Paint(1);
        this.y2 = new ArrayList();
        this.z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.C2 = new ArrayList();
        this.B3 = new rh.h(new v00(this, 4));
        int i7 = 0;
        this.E3 = 0;
        this.F3 = false;
        this.H3 = new Paint(7);
        this.I3 = new Paint(7);
        this.J3 = new e40[8];
        this.K3 = 1.0f;
        this.V3 = true;
        this.W3 = new int[4];
        this.X3 = new ArrayList();
        this.Y3 = new ArrayList();
        this.q4 = new org.telegram.ui.Components.voip.n();
        this.s4 = new ArrayList();
        this.u4 = new v00(this, i7);
        this.v4 = new s10(this);
        this.w4 = new org.telegram.ui.Components.me(24);
        this.x4 = new v00(this, 2);
        this.y4 = false;
        this.z4 = new m4(this, 7);
        this.A4 = new LongSparseIntArray();
        this.L4 = new int[2];
        this.O4 = true;
        this.S4 = new String[2];
        this.c5 = -1;
        this.v5 = new i30(this);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
        this.y5 = new te.a(2, this, nrVar, 350L);
        this.z5 = new te.a(3, this, nrVar, 220L, true);
        this.A5 = new te.c(4, this, nrVar, 350L);
        this.B5 = new te.a(5, this, nrVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.o1 = cVar;
        this.V2 = t3Var;
        this.T2 = inputPeer;
        this.U2 = chat;
        this.X2 = str;
        this.a = cVar.a;
        this.W2 = z10;
        this.J0 = new fi.h0();
        this.Q0 = true;
        this.R0 = true;
        this.Y1 = org.telegram.messenger.np.u1(this.a).A7.C.m();
        this.V = true;
        F5 = false;
        E5 = false;
        H5 = false;
        this.z0 = new n20(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.G0 = -1;
        this.V4 = new y20(this);
        setOnDismissListener(new b10(this, i7));
        z0();
        z30 z30Var = new z30(this, launchActivity);
        this.K1 = z30Var;
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(true);
        int i10 = org.telegram.ui.ActionBar.m6.hh;
        spVar.b(org.telegram.ui.ActionBar.m6.v0(i10));
        spVar.d();
        d30 d30Var = new d30(this, launchActivity, spVar);
        this.J1 = d30Var;
        d30Var.setSubtitle("");
        d30Var.getSubtitleTextView().setVisibility(0);
        d30Var.q();
        d30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.U3(1.0f, d30Var.getAdditionalSubtitleTextView(), this.t4, false);
        d30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.m6.v0(i10));
        int i11 = org.telegram.ui.ActionBar.m6.ch;
        org.telegram.ui.ActionBar.t6.l(d30Var, 6, i11, null);
        d30Var.setBackButtonImage(R.drawable.ic_ab_back);
        d30Var.setOccupyStatusBar(false);
        d30Var.setAllowOverlayTitle(false);
        int i12 = org.telegram.ui.ActionBar.m6.Yg;
        org.telegram.ui.ActionBar.t6.l(d30Var, 1, i12, null);
        org.telegram.ui.ActionBar.t6.l(d30Var, 3, org.telegram.ui.ActionBar.m6.z8, null);
        org.telegram.ui.ActionBar.t6.d(d30Var, i12);
        org.telegram.ui.ActionBar.t6.l(d30Var, 6, i11, null);
        d30Var.setActionBarMenuOnItemClick(new k30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.v2 = tL_peerUser;
            tL_peerUser.user_id = cVar.e().e();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.v2 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.v2 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.v2 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new w00(this, 2);
        cVar.c().c(this, org.telegram.messenger.ls.w2);
        cVar.c().c(this, org.telegram.messenger.ls.M0);
        cVar.c().c(this, org.telegram.messenger.ls.T);
        cVar.c().c(this, org.telegram.messenger.ls.u1);
        cVar.c().c(this, org.telegram.messenger.ls.B2);
        cVar.c().c(this, org.telegram.messenger.ls.E0);
        cVar.c().c(this, org.telegram.messenger.ls.j0);
        cVar.c().c(this, org.telegram.messenger.ls.r);
        cVar.c().c(this, org.telegram.messenger.ls.z2);
        cVar.c().c(this, org.telegram.messenger.ls.y2);
        cVar.c().c(this, org.telegram.messenger.ls.U3);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.Q4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.D2);
        this.a2 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(R.raw.voip_filled, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.E2 = oh0Var;
        this.F2 = new org.telegram.ui.Components.oh0(R.raw.hand_2, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        l30 l30Var = new l30(this, launchActivity);
        this.G1 = l30Var;
        this.b = l30Var;
        this.b.setClipToPadding(false);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i13 = this.u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        this.b.setKeepScreenOn(true);
        this.b.setClipChildren(false);
        this.U1 = new ImageReceiver(this.b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.P1 = m5Var;
            m5Var.setGravity(17);
            m5Var.setTextColor(-1);
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setTextSize(18);
            m5Var.k(org.telegram.messenger.hd.M0(2131743190));
            this.b.addView(m5Var, c8.ma.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            m30 m30Var = new m30(this, launchActivity);
            this.Q1 = m30Var;
            m30Var.setGravity(17);
            m30Var.setTextColor(-1);
            m30Var.setTypeface(org.telegram.messenger.g0.o());
            m30Var.setTextSize(60);
            this.b.addView(m30Var, c8.ma.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.R1 = m5Var2;
            m5Var2.setGravity(17);
            m5Var2.setTextColor(-1);
            m5Var2.setTypeface(org.telegram.messenger.g0.o());
            m5Var2.setTextSize(18);
            this.b.addView(m5Var2, c8.ma.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (v1()) {
            u30 u30Var = new u30(this, launchActivity);
            this.P2 = u30Var;
            this.b.addView(u30Var, c8.ma.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        n30 n30Var = new n30(this, launchActivity);
        this.L1 = n30Var;
        n30Var.setClipToPadding(false);
        n30Var.setClipChildren(false);
        t30 t30Var = new t30(this);
        this.S1 = t30Var;
        t30Var.o = nrVar;
        t30Var.d = 350L;
        t30Var.c = 350L;
        t30Var.e = 350L;
        t30Var.S();
        n30Var.setItemAnimator(t30Var);
        n30Var.setOnScrollListener(new h10(this));
        n30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(E5 ? 6 : 2, n30Var);
        this.T1 = xyVar;
        n30Var.setLayoutManager(xyVar);
        i10 i10Var = new i10(this);
        this.n1 = i10Var;
        xyVar.z1(i10Var);
        n30Var.i(new j10(this));
        xyVar.C1();
        this.b.addView(n30Var, c8.ma.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        n30Var.setAdapter(z30Var);
        n30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.t6.I(org.telegram.ui.ActionBar.m6.Vg, n30Var);
        n30Var.setOnItemClickListener(new z6(this, launchActivity, t3Var, 14));
        n30Var.setOnItemLongClickListener(new w00(this, 3));
        if (v1()) {
            d40 d40Var = new d40(this, getContext());
            this.A3 = d40Var;
            this.b.addView(d40Var, c8.ma.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(launchActivity);
        this.m4 = ek0Var;
        this.b.addView(ek0Var, c8.ma.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        i40 i40Var = new i40(t3Var, this.a, this);
        this.n4 = i40Var;
        ek0Var.setAdapter(i40Var);
        v4.t tVar = new v4.t(6, false);
        ek0Var.setLayoutManager(tVar);
        tVar.z1(new l10(this));
        final int i14 = 1;
        ek0Var.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) { // from class: org.telegram.ui.u00
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i15, View view) {
                switch (i14) {
                    case 0:
                        org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) view;
                        org.telegram.messenger.u3 videoParticipant = u10Var.getVideoParticipant();
                        f40 f40Var2 = this.b;
                        if (videoParticipant != null) {
                            f40Var2.i1(u10Var.getVideoParticipant());
                            break;
                        } else {
                            f40Var2.i1(new org.telegram.messenger.u3(u10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        f40 f40Var3 = this.b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                        if (rVar.getParticipant() != null) {
                            f40Var3.i1(rVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        v4.k kVar = new v4.k();
        kVar.S();
        kVar.o = nrVar;
        kVar.d = 350L;
        kVar.c = 350L;
        kVar.e = 350L;
        ek0Var.setItemAnimator(new m10(this));
        ek0Var.setOnScrollListener(new n10(this));
        i40Var.H(ek0Var, false, false);
        ek0Var.setVisibility(8);
        o10 o10Var = new o10(this, launchActivity);
        this.p1 = o10Var;
        int v02 = org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Ah);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.N2 = new Matrix();
        this.M2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.O2 = paint;
        paint.setShader(this.M2);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(9);
        this.H2 = w9Var;
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(12);
        this.I2 = w9Var2;
        w9Var.a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        w9Var.b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        w9Var.b();
        w9Var2.a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        w9Var2.b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        w9Var2.b();
        int i15 = org.telegram.ui.ActionBar.m6.zh;
        w9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i15), 38));
        w9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i15), 76));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.t1 = q2Var;
        q2Var.setCheckable(true);
        q2Var.setTextSize(12);
        o10Var.a(q2Var);
        q2Var.setOnClickListener(new t00(this, 7));
        org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.s1 = q2Var2;
        q2Var2.setCheckable(true);
        q2Var2.setTextSize(12);
        q2Var2.d(false, false);
        q2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        q2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.hd.M0(2131743244), false, false);
        org.telegram.ui.Components.voip.q2 q2Var3 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.q1 = q2Var3;
        q2Var3.setCheckable(true);
        q2Var3.setTextSize(12);
        q2Var3.d(false, false);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(launchActivity);
        q2Var3.addView(rh0Var, c8.ma.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.oh0 oh0Var2 = new org.telegram.ui.Components.oh0(R.raw.camera_flip, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.F4 = oh0Var2;
        rh0Var.setAnimation(oh0Var2);
        q2Var3.setOnClickListener(new t00(this, 10));
        o10Var.a(q2Var3);
        org.telegram.ui.Components.voip.q2 q2Var4 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.r1 = q2Var4;
        q2Var4.setCheckable(true);
        q2Var4.setTextSize(12);
        q2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.W1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.V1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        q2Var4.addView(imageView, c8.ma.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        q2Var4.setOnClickListener(new t00(this, 11));
        o10Var.a(q2Var4);
        o10Var.a(q2Var2);
        org.telegram.ui.Components.voip.q2 q2Var5 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.u1 = q2Var5;
        q2Var5.setTextSize(12);
        q2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.uh), 0.3f, false, org.telegram.messenger.hd.M0(2131743119), false, false);
        final int i16 = 1;
        q2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z00
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        f40 f40Var2 = this.b;
                        LaunchActivity launchActivity2 = f40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.ls.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                f40Var2.W1(true, false);
                                f40Var2.V1(false);
                                f40Var2.V2.z();
                                f40Var2.R0(true);
                                f40Var2.p1.requestLayout();
                                break;
                            } else {
                                f40Var2.e2[0].d(1, false);
                                if (f40Var2.u2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    f40Var2.u2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.b.getPaddingBottom());
                                    f40Var2.c.addView(f40Var2.u2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        f40 f40Var3 = this.b;
                        f40Var3.Z3.e();
                        org.telegram.messenger.t3 t3Var2 = f40Var3.V2;
                        if (t3Var2 != null && !t3Var2.j()) {
                            f40Var3.P1();
                            f40.x1(launchActivity, new v00(f40Var3, 6), false, false);
                            break;
                        } else {
                            f40Var3.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.q2 q2Var6 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.v1 = q2Var6;
        q2Var6.setCheckable(true);
        q2Var6.b(true, false);
        q2Var6.setTextSize(12);
        q2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, org.telegram.messenger.hd.M0(2131743049), false, false);
        p10 p10Var = new p10(this, launchActivity);
        this.x1 = p10Var;
        p10Var.setAnimation(oh0Var);
        p10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.q2 q2Var7 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.w1 = q2Var7;
        q2Var7.setDrawBackground(false);
        q2Var7.setTextSize(12);
        q2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        q2Var7.addView(p10Var, c8.ma.e(50, 50, 49));
        o10Var.a(q2Var7);
        q2Var7.setOnClickListener(new r10(this));
        o10Var.a(q2Var6);
        o10Var.a(q2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        q2Var7.addView(imageView2, c8.ma.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.V2 != null && v1() && !this.V2.j()) {
            imageView2.setVisibility(0);
            p10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.Z1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Fh));
        d30Var.setAlpha(0.0f);
        d30Var.getBackButton().setScaleX(0.9f);
        d30Var.getBackButton().setScaleY(0.9f);
        d30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        d30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        d30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        d30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i12));
        this.f3 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setIcon(R.drawable.ic_ab_other);
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754838));
        q0Var.setSubMenuOpenSide(2);
        q0Var.setDelegate(new w00(this, 5));
        int i17 = org.telegram.ui.ActionBar.m6.Zg;
        org.telegram.ui.ActionBar.t6.R(q0Var, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i17), 6), null, org.telegram.ui.ActionBar.t6.M(i17));
        q0Var.setOnClickListener(new t00(this, 12));
        q0Var.P(org.telegram.ui.ActionBar.m6.v0(i12), false);
        q0Var.P(org.telegram.ui.ActionBar.m6.v0(i12), true);
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i12));
        this.g3 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(R.drawable.msg_voice_pip);
        q0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754807));
        org.telegram.ui.ActionBar.t6.R(q0Var2, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i17), 6), null, org.telegram.ui.ActionBar.t6.M(i17));
        q0Var2.setOnClickListener(new t00(this, 0));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i12));
        this.h3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        q0Var3.setIcon(R.drawable.msg_screencast);
        q0Var3.setContentDescription(org.telegram.messenger.hd.M0(2131754807));
        org.telegram.ui.ActionBar.t6.R(q0Var3, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i17), 6), null, org.telegram.ui.ActionBar.t6.M(i17));
        q0Var3.setOnClickListener(new t00(this, 1));
        t10 t10Var = new t10(this, launchActivity, launchActivity);
        this.Z2 = t10Var;
        u10 u10Var = new u10(launchActivity);
        this.I1 = u10Var;
        u10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.b3 = paint2;
        paint2.setColor(-12761513);
        v10 v10Var = new v10(this, getContext());
        this.a3 = v10Var;
        org.telegram.ui.ActionBar.t6.U(v10Var, i12, this.J0);
        v10Var.setTextSize(1, 11.0f);
        v10Var.setText(org.telegram.messenger.hd.M0(2131743229));
        v10Var.setMaxLines(1);
        v10Var.setGravity(17);
        v10Var.setTypeface(org.telegram.messenger.g0.o());
        v10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        v10Var.setTag(-1);
        if (!v1()) {
            v10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.e3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(t10Var, c8.ma.l(1.0f, 0, -2));
        linearLayout.addView(v10Var, c8.ma.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView(u10Var, c8.ma.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, c8.ma.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(this.J1, c8.ma.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.y3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(q0Var3, c8.ma.o(48, 48));
        linearLayout2.addView(q0Var2, c8.ma.o(48, 48));
        linearLayout2.addView(q0Var, c8.ma.o(48, 48));
        this.b.addView(linearLayout2, c8.ma.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.b2 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.b.addView(view, c8.ma.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.e2[i18] = new w10(this, launchActivity);
            this.e2[i18].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.e2[i18].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.b.addView(this.e2[i18], c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f2 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, Integer.valueOf(org.telegram.messenger.ls.P3));
        this.f3.h(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f3.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.m6.Vg;
        org.telegram.ui.ActionBar.t6.R(kVar2, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.v0(i19), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i19));
        org.telegram.ui.ActionBar.q0 q0Var4 = this.f3;
        int i20 = 2;
        org.telegram.ui.ActionBar.y0 d = q0Var4.d(1, 0, null, org.telegram.messenger.hd.M0(2131743156), true, true, q0Var4.n0);
        this.t3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.q0 q0Var5 = this.f3;
        org.telegram.ui.ActionBar.y0 d2 = q0Var5.d(2, 0, null, org.telegram.messenger.hd.M0(2131743109), true, true, q0Var5.n0);
        this.u3 = d2;
        d2.m(false, true);
        int i21 = org.telegram.ui.ActionBar.m6.nh;
        d.setCheckColor(i21);
        d.d(org.telegram.ui.ActionBar.m6.v0(i21), org.telegram.ui.ActionBar.m6.v0(i21));
        d2.setCheckColor(i21);
        d2.d(org.telegram.ui.ActionBar.m6.v0(i21), org.telegram.ui.ActionBar.m6.v0(i21));
        Paint paint3 = new Paint(1);
        paint3.setColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Yg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.y0 f10 = this.f3.f(null, org.telegram.messenger.hd.M0(2131743154), 10, true, R.drawable.msg_voice_speaker);
        this.k3 = f10;
        f10.setItemHeight(56);
        org.telegram.ui.ActionBar.y0 f11 = this.f3.f(null, org.telegram.messenger.hd.M0(2131743037), 11, true, R.drawable.msg_noise_on);
        this.l3 = f11;
        f11.setItemHeight(56);
        org.telegram.ui.Components.voip.q0 q0Var6 = new org.telegram.ui.Components.voip.q0(ai.s2.a());
        this.n3 = q0Var6;
        org.telegram.ui.ActionBar.y0 f12 = this.f3.f(q0Var6, org.telegram.messenger.hd.M0(2131745053), 14, false, 0);
        this.m3 = f12;
        f12.setItemHeight(56);
        f12.setRightIcon(R.drawable.msg_settings);
        f12.setSubtext(org.telegram.messenger.hd.M0(ai.s2.a() ? 2131745051 : 2131745052));
        f12.getRightIcon().setBackground(org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i19), 1));
        int i22 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f12.getRightIcon();
        boolean z11 = org.telegram.messenger.hd.a0;
        rightIcon.setLayoutParams(c8.ma.d(40, 40.0f, i22, z11 ? 4.0f : 0.0f, 0.0f, z11 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(i0.a.f(0.3f, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Xg), -16777216));
        boolean z12 = org.telegram.messenger.hd.a0;
        FrameLayout.LayoutParams d10 = c8.ma.d(-1, 28.0f, i22, z12 ? 52.0f : 0.0f, 0.0f, z12 ? 0.0f : 52.0f, 0.0f);
        d10.width = 1;
        view2.setLayoutParams(d10);
        f12.addView(view2);
        View[] viewArr = {f12.getTextView(), f12.getSubtextView()};
        for (int i23 = 0; i23 < 2; i23++) {
            View view3 = viewArr[i23];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(60.0f) : 0;
                layoutParams.rightMargin = org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        this.m3.getRightIcon().setContentDescription(org.telegram.messenger.hd.M0(2131745035));
        this.m3.getRightIcon().setOnClickListener(new t00(this, i20));
        TextView b10 = this.f3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Xg), -16777216));
        this.z3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.y0 f13 = this.f3.f(this.Y2, org.telegram.messenger.hd.M0(org.telegram.messenger.v3.W(this.U2) ? 2131743240 : 2131743139), 6, true, R.drawable.msg_edit);
        this.j3 = f13;
        org.telegram.ui.ActionBar.y0 f14 = this.f3.f(this.Y2, org.telegram.messenger.hd.M0(2131743140), 7, false, R.drawable.msg_permissions);
        this.q3 = f14;
        org.telegram.ui.ActionBar.y0 e10 = this.f3.e(3, R.drawable.msg_link, org.telegram.messenger.hd.M0(2131743092));
        this.i3 = e10;
        a40 a40Var = new a40();
        this.Y2 = a40Var;
        org.telegram.ui.ActionBar.y0 e11 = this.f3.e(9, R.drawable.msg_screencast, org.telegram.messenger.hd.M0(2131743191));
        this.s3 = e11;
        org.telegram.ui.ActionBar.y0 f15 = this.f3.f(a40Var, org.telegram.messenger.hd.M0(2131743103), 5, true, 0);
        this.r3 = f15;
        a40Var.a(f15.getImageView());
        org.telegram.ui.ActionBar.y0 e12 = this.f3.e(12, R.drawable.menu_stream_comments_24, org.telegram.messenger.hd.M0(2131743239));
        this.w3 = e12;
        org.telegram.ui.ActionBar.y0 e13 = this.f3.e(13, R.drawable._menu_stream_comments_off_24, org.telegram.messenger.hd.M0(2131743241));
        this.x3 = e13;
        org.telegram.ui.ActionBar.y0 e14 = this.f3.e(4, R.drawable.msg_cancel, org.telegram.messenger.hd.M0(s1() ? 2131743134 : org.telegram.messenger.v3.W(this.U2) ? 2131743236 : 2131743135));
        this.v3 = e14;
        this.f3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Vg));
        this.f3.getPopupLayout().setFitItems(true);
        int i24 = org.telegram.ui.ActionBar.m6.Yg;
        e12.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        e13.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        this.k3.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        this.l3.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        L1(this.m3, org.telegram.ui.ActionBar.m6.v0(i24));
        int i25 = org.telegram.ui.ActionBar.m6.mh;
        e14.d(org.telegram.ui.ActionBar.m6.v0(i25), org.telegram.ui.ActionBar.m6.v0(i25));
        e10.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        f13.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        f14.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        f15.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        e11.d(org.telegram.ui.ActionBar.m6.v0(i24), org.telegram.ui.ActionBar.m6.v0(i24));
        if (this.V2 != null) {
            p1();
        }
        if (s1()) {
            this.k2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.k2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Y1(false);
        this.J1.getTitleTextView().setOnClickListener(new t00(this, 3));
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        x10 x10Var = new x10(this, launchActivity);
        this.l4 = x10Var;
        y10 y10Var = new y10(this);
        this.M4 = y10Var;
        final int i26 = 0;
        x10Var.setClipToPadding(false);
        y10Var.S();
        y10Var.o = org.telegram.ui.Components.nr.f;
        y10Var.d = 350L;
        y10Var.c = 350L;
        y10Var.e = 350L;
        x10Var.setItemAnimator(y10Var);
        x10Var.setOnScrollListener(new z10(this));
        x10Var.setClipChildren(false);
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        x10Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.v10 v10Var2 = new org.telegram.ui.Components.v10(t3Var, this.a, this);
        this.o4 = v10Var2;
        x10Var.setAdapter(v10Var2);
        v10Var2.F(x10Var, false);
        x10Var.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) { // from class: org.telegram.ui.u00
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i152, View view4) {
                switch (i26) {
                    case 0:
                        org.telegram.ui.Components.u10 u10Var2 = (org.telegram.ui.Components.u10) view4;
                        org.telegram.messenger.u3 videoParticipant = u10Var2.getVideoParticipant();
                        f40 f40Var2 = this.b;
                        if (videoParticipant != null) {
                            f40Var2.i1(u10Var2.getVideoParticipant());
                            break;
                        } else {
                            f40Var2.i1(new org.telegram.messenger.u3(u10Var2.getParticipant(), false));
                            break;
                        }
                    default:
                        f40 f40Var3 = this.b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view4;
                        if (rVar.getParticipant() != null) {
                            f40Var3.i1(rVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        x10Var.setOnItemLongClickListener(new w00(this, i26));
        x10Var.setVisibility(8);
        x10Var.i(new a20());
        int i27 = 5;
        b20 b20Var = new b20(this, launchActivity, this.L1, x10Var, this.X3, this.V2, this);
        this.Z3 = b20Var;
        b20Var.setClipChildren(false);
        v10Var2.E(this.X3, b20Var);
        if (this.m4 != null) {
            this.n4.G(this.X3, b20Var);
        }
        c20 c20Var = new c20(this, launchActivity);
        this.C4 = c20Var;
        d20 d20Var = new d20(this, launchActivity, this.J1, this.L1, c20Var);
        this.m1 = d20Var;
        d20Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        d20Var.setInvalidateWithParent(true);
        c20Var.setProfileGalleryView(d20Var);
        e20 e20Var = new e20(this, launchActivity);
        this.B4 = e20Var;
        e20Var.setVisibility(8);
        d20Var.setVisibility(0);
        d20Var.b(new f20(this));
        g20 g20Var = new g20(this, launchActivity);
        this.a4 = g20Var;
        this.b.addView(b20Var);
        b20Var.addView(x10Var, c8.ma.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.p1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.I4 = view4;
        int[] iArr = this.L4;
        iArr[0] = this.U3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.L4);
        this.K4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.b.addView(view4, c8.ma.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.J4 = view5;
        view5.setBackgroundColor(this.L4[0]);
        this.b.addView(view5, c8.ma.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.X1 = hVar;
        hVar.setDelegate(new h20(this));
        hVar.setClickCellDelegate(new i20(this));
        org.telegram.messenger.t3 t3Var2 = this.V2;
        if (t3Var2 != null) {
            hVar.D0(this.o1.a, t3Var2.g(false));
        }
        this.b.addView(hVar, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.voip.s0 s0Var = new org.telegram.ui.Components.voip.s0(launchActivity);
        this.o3 = s0Var;
        s0Var.setOnContentHeightChanged(new v00(this, 1));
        this.b.addView(s0Var, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.p3 = new ai.s2(new j20(this));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.H1 = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.nr.h);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.p1);
        k20 k20Var = new k20(this, launchActivity, this.G1, LaunchActivity.Q(), this.J0);
        this.C1 = k20Var;
        k20Var.K = true;
        k20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Y1)});
        k20Var.getEditText().setLinkTextColor(-11683585);
        k20Var.setHint(org.telegram.messenger.hd.M0(2131743683));
        k20Var.getEditText().addTextChangedListener(new l20(this));
        k20Var.s();
        m20 m20Var = new m20(this, launchActivity);
        this.B1 = m20Var;
        this.b.addView(m20Var, c8.ma.c(-1.0f, -1));
        o20 o20Var = new o20(launchActivity);
        this.A1 = o20Var;
        o20Var.addView(k20Var, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        o20Var.addView(o6Var, c8.ma.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.b.addView(o20Var, c8.ma.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.E1 = imageView3;
        int i28 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(W(i28), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i28), this.J0);
        int i29 = org.telegram.ui.ActionBar.m6.f7;
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i29, h6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new t00(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.D1 = imageView4;
        org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(W(i28), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i28), this.J0);
        org.telegram.ui.ActionBar.t6.s(imageView4, org.telegram.ui.ActionBar.m6.v6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new t00(this, i27));
        o20Var.addView(imageView3, c8.ma.e(48, 48, 85));
        o20Var.addView(imageView4, c8.ma.e(48, 48, 85));
        this.b.addView(g20Var);
        e20Var.addView(d20Var, c8.ma.c(-1.0f, -1));
        e20Var.addView(c20Var, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(e20Var, c8.ma.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        R0(false);
        this.K1.f();
        if (F5) {
            this.n4.I(this.m4, false);
        }
        this.D2 = this.K1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.N1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.v3.T(this.U2) && (chat2 = this.U2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, c8.ma.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(launchActivity);
            tb0Var.setTextColor(-1);
            tb0Var.setSelectorColor(-9598483);
            tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            tb0Var.setItemCount(5);
            p20 p20Var = new p20(launchActivity);
            p20Var.setItemCount(5);
            p20Var.setTextColor(-1);
            p20Var.setSelectorColor(-9598483);
            p20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            q20 q20Var = new q20(launchActivity);
            q20Var.setItemCount(5);
            q20Var.setTextColor(-1);
            q20Var.setSelectorColor(-9598483);
            q20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            r20 r20Var = new r20(launchActivity);
            this.O1 = r20Var;
            r20Var.setLines(1);
            r20Var.setSingleLine(true);
            r20Var.setEllipsize(TextUtils.TruncateAt.END);
            r20Var.setGravity(17);
            r20Var.setTextColor(-1);
            r20Var.setTypeface(org.telegram.messenger.g0.o());
            r20Var.setTextSize(1, 14.0f);
            this.b.addView(r20Var, c8.ma.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r20Var.setOnClickListener(new org.telegram.messenger.video.f(this, tb0Var, p20Var, q20Var, chat, cVar, inputPeer2, 1));
            t20 t20Var = new t20(launchActivity, tb0Var, p20Var, q20Var);
            this.M1 = t20Var;
            t20Var.setWeightSum(1.0f);
            t20Var.setOrientation(0);
            this.b.addView(t20Var, c8.ma.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i30 = calendar.get(1);
            int i31 = calendar.get(6);
            t20Var.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
            tb0Var.setMinValue(0);
            tb0Var.setMaxValue(365);
            tb0Var.setWrapSelectorWheel(false);
            tb0Var.setFormatter(new y00(currentTimeMillis, calendar, i30, 0));
            a1.d dVar = new a1.d(this, tb0Var, p20Var, q20Var, 14);
            f40Var = this;
            tb0Var.setOnValueChangedListener(dVar);
            p20Var.setMinValue(0);
            p20Var.setMaxValue(23);
            t20Var.addView(p20Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ls.t4));
            p20Var.setFormatter(new org.telegram.ui.Components.xb0(26));
            p20Var.setOnValueChangedListener(dVar);
            q20Var.setMinValue(0);
            q20Var.setMaxValue(59);
            q20Var.setValue(0);
            q20Var.setFormatter(new org.telegram.ui.Components.xb0(27));
            t20Var.addView(q20Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ls.t4));
            q20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i32 = calendar.get(6);
            int i33 = calendar.get(12);
            int i34 = calendar.get(11);
            tb0Var.setValue(i31 != i32 ? 1 : 0);
            q20Var.setValue(i33);
            p20Var.setValue(i34);
            org.telegram.ui.Components.c5.g(r20Var, textView, 0L, 604800L, 2, tb0Var, p20Var, q20Var);
        } else {
            f40Var = this;
        }
        u20 u20Var = new u20(f40Var, (ViewGroup) f40Var.getWindow().getDecorView(), f40Var.b);
        f40Var.b4 = u20Var;
        u20Var.E = new v20(f40Var);
        d20Var.setPinchToZoomHelper(u20Var);
        final int i35 = 0;
        f40Var.s1.setOnClickListener(new View.OnClickListener(f40Var) { // from class: org.telegram.ui.z00
            public final /* synthetic */ f40 b;

            {
                this.b = f40Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                switch (i35) {
                    case 0:
                        f40 f40Var2 = this.b;
                        LaunchActivity launchActivity2 = f40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.ls.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                f40Var2.W1(true, false);
                                f40Var2.V1(false);
                                f40Var2.V2.z();
                                f40Var2.R0(true);
                                f40Var2.p1.requestLayout();
                                break;
                            } else {
                                f40Var2.e2[0].d(1, false);
                                if (f40Var2.u2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    f40Var2.u2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.b.getPaddingBottom());
                                    f40Var2.c.addView(f40Var2.u2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        f40 f40Var3 = this.b;
                        f40Var3.Z3.e();
                        org.telegram.messenger.t3 t3Var22 = f40Var3.V2;
                        if (t3Var22 != null && !t3Var22.j()) {
                            f40Var3.P1();
                            f40.x1(launchActivity, new v00(f40Var3, 6), false, false);
                            break;
                        } else {
                            f40Var3.dismiss();
                            break;
                        }
                }
            }
        });
        f40Var.U1(false);
        f40Var.P1();
        f40Var.V1(false);
        f40Var.W1(false, false);
        f40Var.H1(0.0f);
        f40Var.X1();
        f40Var.b.addView(new FrameLayout(launchActivity), c8.ma.e(-1, org.telegram.messenger.ls.e3, 87));
        f40Var.v1.setOnClickListener(new t00(f40Var, 6));
        f40Var.W0();
        c8.ra.a(f40Var.s1);
        c8.ra.a(f40Var.t1);
        c8.ra.a(f40Var.q1);
        c8.ra.a(f40Var.r1);
        c8.ra.a(f40Var.w1);
        c8.ra.a(f40Var.u1);
        c8.ra.a(f40Var.v1);
        r0.i0.l(f40Var.b, new w00(f40Var, 1));
    }

    public static void C1(org.telegram.messenger.t3 t3Var, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (t3Var != null) {
            ArrayList arrayList = t3Var.f;
            ArrayList arrayList2 = t3Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(j3);
            if (groupCallParticipant != null) {
                t3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                t3Var.g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.gj.B1(((org.telegram.messenger.u3) arrayList.get(i7)).a.peer) == org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = t3Var.b;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.v2, new Object[0]);
    }

    public static void J0(final f40 f40Var, Activity activity, org.telegram.messenger.t3 t3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z10;
        final org.telegram.messenger.s3 s3Var;
        org.telegram.messenger.c cVar = f40Var.o1;
        ArrayList arrayList = f40Var.A2;
        z30 z30Var = f40Var.K1;
        if (view instanceof org.telegram.ui.Components.voip.r) {
            f40Var.i1(((org.telegram.ui.Components.voip.r) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g4) {
            f40Var.M1((org.telegram.ui.Cells.g4) view);
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (!(view instanceof org.telegram.ui.Cells.z3)) {
            if (i7 != z30Var.x) {
                if (i7 != z30Var.y) {
                    if (i7 == z30Var.E) {
                        f40Var.B1();
                        return;
                    }
                    return;
                }
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                if (t3Var2 == null || t3Var2.b == null) {
                    return;
                }
                wg.e1 e1Var = new wg.e1(activity, f40Var.a, new fi.h0());
                org.telegram.messenger.t3 t3Var3 = f40Var.V2;
                e1Var.t2.addAll(t3Var3 != null ? (Collection) Collection.-EL.stream(t3Var3.e).map(new aa.l(12)).collect(Collectors.toSet()) : null);
                e1Var.l1(false, true);
                e1Var.s2 = new v00(f40Var, 5);
                e1Var.l1(false, true);
                e1Var.u2 = new bi.o6(22, f40Var, t3Var);
                e1Var.show();
                return;
            }
            if (org.telegram.messenger.v3.T(f40Var.U2) && (chat = f40Var.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)) {
                f40Var.n1(false);
                return;
            }
            TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(cVar.a).P0(f40Var.m1());
            if (P0 == null) {
                return;
            }
            f40Var.r2 = false;
            Context context = f40Var.getContext();
            int i12 = cVar.a;
            TLRPC.Chat chat2 = f40Var.U2;
            org.telegram.messenger.t3 t3Var4 = f40Var.V2;
            org.telegram.ui.Components.v20 v20Var = new org.telegram.ui.Components.v20(context, i12, chat2, P0, t3Var4.d, t3Var4.n);
            f40Var.D3 = v20Var;
            v20Var.setOnDismissListener(new b10(f40Var, 2));
            org.telegram.ui.Components.v20 v20Var2 = f40Var.D3;
            v20Var2.b2 = new k10(f40Var);
            v20Var2.show();
            return;
        }
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (z3Var.getUser() == null) {
            return;
        }
        if (!f40Var.s1()) {
            f40Var.d2.O0(f40Var.a);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", z3Var.getUser().id);
            if (z3Var.a.getImageReceiver().L()) {
                bundle.putBoolean("expandPhoto", true);
            }
            f40Var.d2.t0(new ProfileActivity(bundle, null));
            f40Var.dismiss();
            return;
        }
        int i13 = i7 - z30Var.n;
        if (i13 < 0 || i13 >= f40Var.V2.m.size()) {
            int i14 = i7 - z30Var.s;
            if (i14 < 0 || i14 >= f40Var.V2.l.size()) {
                int i15 = i7 - z30Var.f;
                if (f40Var.n2) {
                    if (i15 >= 0 && i15 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i15);
                        z10 = false;
                    }
                    l10 = null;
                    z10 = false;
                } else {
                    if (i15 >= 0 && i15 < f40Var.V2.j.size()) {
                        l10 = (Long) f40Var.V2.j.get(i15);
                        z10 = false;
                    }
                    l10 = null;
                    z10 = false;
                }
                if (z10 && (s3Var = (org.telegram.messenger.s3) f40Var.V2.k.get(l10)) != null) {
                    org.telegram.ui.Components.a70 G = org.telegram.ui.Components.a70.G(f40Var.c, f40Var.J0, z3Var);
                    G.l(R.drawable.msg_endcall, org.telegram.messenger.hd.N0(2131749267, null), new Runnable(f40Var) { // from class: org.telegram.ui.d10
                        public final /* synthetic */ f40 b;

                        {
                            this.b = f40Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.s3 s3Var2 = s3Var;
                                    declineconferencecallinvite.msg_id = s3Var2.a;
                                    final f40 f40Var2 = this.b;
                                    final int i16 = 1;
                                    ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.e10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var3 = f40Var2;
                                                    if (!z11) {
                                                        f40Var3.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var3.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var2;
                                                    if (!z12) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.t3 t3Var5 = f40Var2.V2;
                                    if (t3Var5 != null) {
                                        s3Var2.b = false;
                                        t3Var5.k.put(l10, s3Var2);
                                        f40Var2.R0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.s3 s3Var3 = s3Var;
                                    declineconferencecallinvite2.msg_id = s3Var3.a;
                                    final f40 f40Var3 = this.b;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.e10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var32 = f40Var3;
                                                    if (!z11) {
                                                        f40Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var3;
                                                    if (!z12) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(s3Var3.a));
                                    org.telegram.messenger.np.u1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.t3 t3Var6 = f40Var3.V2;
                                    if (t3Var6 != null) {
                                        ArrayList arrayList3 = t3Var6.j;
                                        Long l11 = l10;
                                        arrayList3.remove(l11);
                                        f40Var3.V2.n.remove(l11);
                                        f40Var3.V2.k.remove(l11);
                                        f40Var3.R0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, s3Var.a());
                    G.c(R.drawable.msg_remove, org.telegram.messenger.hd.N0(2131749278, null), new Runnable(f40Var) { // from class: org.telegram.ui.d10
                        public final /* synthetic */ f40 b;

                        {
                            this.b = f40Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.s3 s3Var2 = s3Var;
                                    declineconferencecallinvite.msg_id = s3Var2.a;
                                    final f40 f40Var2 = this.b;
                                    final int i16 = 1;
                                    ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.e10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var32 = f40Var2;
                                                    if (!z11) {
                                                        f40Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var2;
                                                    if (!z12) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.t3 t3Var5 = f40Var2.V2;
                                    if (t3Var5 != null) {
                                        s3Var2.b = false;
                                        t3Var5.k.put(l10, s3Var2);
                                        f40Var2.R0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.s3 s3Var3 = s3Var;
                                    declineconferencecallinvite2.msg_id = s3Var3.a;
                                    final f40 f40Var3 = this.b;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.e10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var32 = f40Var3;
                                                    if (!z11) {
                                                        f40Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var3;
                                                    if (!z12) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(s3Var3.a));
                                    org.telegram.messenger.np.u1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.t3 t3Var6 = f40Var3.V2;
                                    if (t3Var6 != null) {
                                        ArrayList arrayList3 = t3Var6.j;
                                        Long l11 = l10;
                                        arrayList3.remove(l11);
                                        f40Var3.V2.n.remove(l11);
                                        f40Var3.V2.k.remove(l11);
                                        f40Var3.R0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    G.X(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.x2.getColor()));
                    G.s = 96;
                    G.a0();
                }
                return;
            }
            l10 = (Long) f40Var.V2.l.get(i7 - z30Var.s);
        } else {
            l10 = (Long) f40Var.V2.m.get(i7 - z30Var.n);
        }
        z10 = true;
        if (z10) {
            return;
        }
        org.telegram.ui.Components.a70 G2 = org.telegram.ui.Components.a70.G(f40Var.c, f40Var.J0, z3Var);
        G2.l(R.drawable.msg_endcall, org.telegram.messenger.hd.N0(2131749267, null), new Runnable(f40Var) { // from class: org.telegram.ui.d10
            public final /* synthetic */ f40 b;

            {
                this.b = f40Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.s3 s3Var2 = s3Var;
                        declineconferencecallinvite.msg_id = s3Var2.a;
                        final f40 f40Var2 = this.b;
                        final int i16 = 1;
                        ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.e10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var2;
                                        if (!z11) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var2;
                                        if (!z12) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.t3 t3Var5 = f40Var2.V2;
                        if (t3Var5 != null) {
                            s3Var2.b = false;
                            t3Var5.k.put(l10, s3Var2);
                            f40Var2.R0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.s3 s3Var3 = s3Var;
                        declineconferencecallinvite2.msg_id = s3Var3.a;
                        final f40 f40Var3 = this.b;
                        final int i17 = 0;
                        ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.e10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var3;
                                        if (!z11) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var3;
                                        if (!z12) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(s3Var3.a));
                        org.telegram.messenger.np.u1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.t3 t3Var6 = f40Var3.V2;
                        if (t3Var6 != null) {
                            ArrayList arrayList3 = t3Var6.j;
                            Long l11 = l10;
                            arrayList3.remove(l11);
                            f40Var3.V2.n.remove(l11);
                            f40Var3.V2.k.remove(l11);
                            f40Var3.R0(true);
                            break;
                        }
                        break;
                }
            }
        }, s3Var.a());
        G2.c(R.drawable.msg_remove, org.telegram.messenger.hd.N0(2131749278, null), new Runnable(f40Var) { // from class: org.telegram.ui.d10
            public final /* synthetic */ f40 b;

            {
                this.b = f40Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.s3 s3Var2 = s3Var;
                        declineconferencecallinvite.msg_id = s3Var2.a;
                        final f40 f40Var2 = this.b;
                        final int i16 = 1;
                        ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.e10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var2;
                                        if (!z11) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var2;
                                        if (!z12) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.t3 t3Var5 = f40Var2.V2;
                        if (t3Var5 != null) {
                            s3Var2.b = false;
                            t3Var5.k.put(l10, s3Var2);
                            f40Var2.R0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.s3 s3Var3 = s3Var;
                        declineconferencecallinvite2.msg_id = s3Var3.a;
                        final f40 f40Var3 = this.b;
                        final int i17 = 0;
                        ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.e10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var3;
                                        if (!z11) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var32.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var3;
                                        if (!z12) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.np.u1(f40Var4.a).V3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(s3Var3.a));
                        org.telegram.messenger.np.u1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.t3 t3Var6 = f40Var3.V2;
                        if (t3Var6 != null) {
                            ArrayList arrayList3 = t3Var6.j;
                            Long l11 = l10;
                            arrayList3.remove(l11);
                            f40Var3.V2.n.remove(l11);
                            f40Var3.V2.k.remove(l11);
                            f40Var3.R0(true);
                            break;
                        }
                        break;
                }
            }
        }, false);
        G2.X(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.x2.getColor()));
        G2.s = 96;
        G2.a0();
    }

    public static void K0(f40 f40Var, org.telegram.ui.Components.voip.r rVar, boolean z10) {
        if (f40Var.J) {
            return;
        }
        if (z10 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(f40Var.X3, f40Var.Z3, rVar, null, null, rVar.getParticipant(), f40Var.V2, f40Var));
        } else {
            if (z10 || rVar.getRenderer() == null) {
                return;
            }
            rVar.getRenderer().setPrimaryView(null);
            rVar.setRenderer(null);
        }
    }

    public static void L0(f40 f40Var, int i7, int[] iArr) {
        if (f40Var.v1()) {
            int i10 = org.telegram.ui.ActionBar.m6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ch, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.qh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bh, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ph, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.qh, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.oh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.sh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.th, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.rh, false);
        } else if (t1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bi, false);
            iArr[1] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ci, false);
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.di, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Eh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bh, false), org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        }
        if (t1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bi, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.sh, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.yh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zh, false));
        }
    }

    public static void L1(org.telegram.ui.ActionBar.y0 y0Var, int i7) {
        if (y0Var != null) {
            y0Var.d(i7, i7);
            if (y0Var.getRightIcon() != null) {
                y0Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static String M0() {
        return org.telegram.messenger.k6.i[(int) Math.floor(Math.random() * 8)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void N0(f40 f40Var) {
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        if (t3Var == null || t3Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.t3 t3Var2 = f40Var.V2;
        togglegroupcallsettings.call = t3Var2.g(t3Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(f40Var.V2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.o1.a);
        org.telegram.messenger.q5 q5Var = Utilities.d;
        Objects.requireNonNull(q5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.x3(q5Var), new f10(f40Var, 1));
    }

    public static void O0(f40 f40Var, boolean z10) {
        if (f40Var.V2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        togglegroupcallsettings.call = t3Var.g(t3Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        f40Var.w5 = Boolean.valueOf(z10);
        f40Var.O1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.o1.a);
        org.telegram.messenger.q5 q5Var = Utilities.d;
        Objects.requireNonNull(q5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.x3(q5Var), new f10(f40Var, 0));
    }

    public static int P0(f40 f40Var, int i7) {
        o10 o10Var = f40Var.p1;
        org.telegram.ui.Components.voip.r h12 = f40Var.h1();
        if (h12 == null) {
            return TLObject.FLAG_31;
        }
        int measuredHeight = ((o10Var.getMeasuredHeight() / 2) + o10Var.getTop()) - (f40Var.u1.getMeasuredHeight() / 2);
        int measuredHeight2 = h12.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        return i5.c.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q0(f40 f40Var) {
        d30 d30Var = f40Var.J1;
        n30 n30Var = f40Var.L1;
        int childCount = n30Var.getChildCount();
        float f10 = 2.1474836E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (RecyclerView.R(n30Var.getChildAt(i7)) >= 0) {
                f10 = Math.min(f10, r8.getTop());
            }
        }
        if (f10 < 0.0f || f10 == 2.1474836E9f) {
            f10 = childCount != 0 ? 0.0f : n30Var.getPaddingTop();
        }
        int i10 = 1;
        boolean z10 = f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)));
        float L = f10 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && d30Var.getTag() == null) || (!z10 && d30Var.getTag() != null)) {
            d30Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = f40Var.c2;
            if (animatorSet != null) {
                animatorSet.cancel();
                f40Var.c2 = null;
            }
            f40Var.G0(d30Var.getTag() == null);
            ViewPropertyAnimator duration = d30Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -org.telegram.messenger.g0.L(14.0f)).setDuration(300L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
            duration.setInterpolator(nrVar).start();
            d30Var.getTitleTextView().animate().translationY(z10 ? 0.0f : org.telegram.messenger.g0.L(23.0f)).setDuration(300L).setInterpolator(nrVar).start();
            ObjectAnimator objectAnimator = f40Var.T4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                f40Var.T4.cancel();
            }
            org.telegram.ui.ActionBar.m5 subtitleTextView = d30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.m5, Float>) property, d30Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
            f40Var.T4 = ofFloat;
            ofFloat.setDuration(300L);
            f40Var.T4.setInterpolator(nrVar);
            f40Var.T4.addListener(new c30(null == true ? 1 : 0, f40Var, z10));
            f40Var.T4.start();
            ObjectAnimator objectAnimator2 = f40Var.U4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d30Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.m5, Float>) property, z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
            f40Var.U4 = ofFloat2;
            ofFloat2.setDuration(300L);
            f40Var.U4.setInterpolator(nrVar);
            f40Var.U4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            f40Var.c2 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = f40Var.c2;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(d30Var, (Property<d30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(f40Var.I1, (Property<u10, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(f40Var.b2, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            f40Var.c2.addListener(new a30(f40Var, i10));
            f40Var.c2.start();
            f40Var.Z3.w.setClickable(!z10 || E5);
        }
        if (f40Var.t2 != L) {
            f40Var.K1(L);
        }
    }

    public static void f1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (C5 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                C5 = new f40(launchActivity, cVar, org.telegram.messenger.np.u1(cVar.a).i1(chat.id, false, null), chat, inputPeer, z10, str);
            } else {
                org.telegram.messenger.t3 t3Var = VoIPService.getSharedInstance().groupCall;
                if (t3Var == null) {
                    return;
                }
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(cVar.a).O0(Long.valueOf(t3Var.c));
                t3Var.b(true);
                C5 = new f40(launchActivity, cVar, t3Var, O0, null, z10, str);
            }
            C5.d2 = launchActivity;
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(23));
        }
    }

    public static String j1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 0) {
            return org.telegram.messenger.hd.N0(2131743254, null);
        }
        if (i7 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.hd.N0(2131743255, null) : org.telegram.messenger.hd.N0(2131743256, null);
        }
        if (i7 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.hd.N0(2131743258, null) : str;
    }

    public static String k1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i7 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.hd.N0(2131743253, null) : org.telegram.messenger.hd.a0(null, null, 2131743252, str) : i7 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.hd.N0(2131743250, null) : org.telegram.messenger.hd.N0(2131743251, null) : org.telegram.messenger.hd.N0(2131743249, null);
    }

    public static boolean t1(int i7) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.b.rtmp_stream) || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7;
    }

    public static void x1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        int i7 = 0;
        if (z11 || !org.telegram.messenger.v3.w(14, chat)) {
            C1(t3Var, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        boolean isConference = sharedInstance.isConference();
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (isConference) {
            t1Var.S = org.telegram.messenger.hd.N0(2131743223, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131743224, null);
        } else if (org.telegram.messenger.v3.W(chat)) {
            t1Var.S = org.telegram.messenger.hd.N0(2131743226, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131743227, null);
        } else {
            t1Var.S = org.telegram.messenger.hd.N0(2131743116, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131743117, null);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        if (!sharedInstance.isConference() || (t3Var != null && (groupCall = t3Var.b) != null && groupCall.creator)) {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, 1);
            d2VarArr[0] = d2Var;
            d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            if (z10) {
                d2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false));
            } else {
                d2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) d2VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.m6.ih;
                int i11 = org.telegram.ui.ActionBar.m6.gh;
                int i12 = org.telegram.ui.ActionBar.m6.eh;
                checkBoxSquare.s = i10;
                checkBoxSquare.w = i11;
                checkBoxSquare.x = i12;
                checkBoxSquare.invalidate();
            }
            d2VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131743225, null), "", false, false, false);
            } else if (org.telegram.messenger.v3.W(chat)) {
                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131743228, null), "", false, false, false);
            } else {
                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131743118, null), "", false, false, false);
            }
            d2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
            g10.addView(d2VarArr[0], c8.ma.o(-1, -2));
            d2VarArr[0].setOnClickListener(new c10(d2VarArr, i7));
        }
        alertDialog$Builder.o(g10);
        t1Var.J = org.telegram.ui.ActionBar.m6.gh;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131743119, null), new bg.f0(t3Var, d2VarArr, selfId, runnable, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        if (z10) {
            t1Var.Q0 = false;
        }
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                t1Var.getWindow().setType(2038);
            } else {
                t1Var.getWindow().setType(2003);
            }
            t1Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
        }
        t1Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.mh, null);
        }
        t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        String str3;
        String str4;
        String str5;
        if (v1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            org.telegram.messenger.g0.g(str);
            if (org.telegram.messenger.g0.G3()) {
                o1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.d2;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) launchActivity.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
            if (g2Var instanceof bn) {
                z12 = ((bn) g2Var).sa();
                this.s2 = true;
                this.r2 = true;
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
                    str5 = org.telegram.messenger.v3.W(this.U2) ? org.telegram.messenger.hd.a0("VoipChannelInviteText", null, 2131743235, str4) : org.telegram.messenger.hd.a0("VoipGroupInviteText", null, 2131743127, str4);
                }
                b30 b30Var = new b30(this, getContext(), str5, str3, str4, str3);
                this.m2 = b30Var;
                b30Var.o2 = new f(this, 17);
                b30Var.setOnDismissListener(new b10(this, 3));
                org.telegram.messenger.g0.h3(new v00(this, 8), !z12 ? 200L : 0L);
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
        b30 b30Var2 = new b30(this, getContext(), str5, str3, str4, str3);
        this.m2 = b30Var2;
        b30Var2.o2 = new f(this, 17);
        b30Var2.setOnDismissListener(new b10(this, 3));
        org.telegram.messenger.g0.h3(new v00(this, 8), !z12 ? 200L : 0L);
    }

    public final void B1() {
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var == null || t3Var.b == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
        t1Var.r(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.V2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new z9(this, t1Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r11v13, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, org.telegram.ui.Components.q9] */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean[], java.lang.String, org.telegram.ui.ActionBar.h6, org.telegram.ui.ActionBar.q1] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.String, org.telegram.ui.ActionBar.h6] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(TLRPC.GroupCallParticipant groupCallParticipant, final long j3, int i7) {
        String str;
        ?? r14;
        TextView textView;
        VoIPService voIPService;
        int i10;
        String str2;
        String str3;
        ?? r142;
        int i11;
        String str4;
        int i12;
        EditText editText;
        String str5;
        float f10;
        String N0;
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        org.telegram.messenger.c cVar = this.o1;
        TLObject c22 = j3 > 0 ? org.telegram.messenger.np.u1(cVar.a).c2(Long.valueOf(j3)) : org.telegram.messenger.np.u1(cVar.a).O0(Long.valueOf(-j3));
        int i13 = 8;
        if (i7 == 0 || i7 == 2 || i7 == 3) {
            if (i7 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(c22, Boolean.TRUE, null, null, null, null);
                o1().k(0L, 30, c22, null, null, null);
                return;
            }
            ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i14 = org.telegram.ui.ActionBar.m6.gh;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.J = i14;
            TextView textView2 = new TextView(getContext());
            int i15 = org.telegram.ui.ActionBar.m6.Yg;
            org.telegram.ui.ActionBar.t6.U(textView2, i15, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            ?? frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var.u(org.telegram.messenger.g0.L(12.0f));
            ?? q9Var = new org.telegram.ui.Components.q9(getContext());
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            b9Var.p(c22);
            boolean z11 = c22 instanceof TLRPC.User;
            if (z11) {
                TLRPC.User user = (TLRPC.User) c22;
                q9Var.f(user, b9Var);
                str = org.telegram.messenger.p10.k(user, true);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) c22;
                q9Var.f(chat, b9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            org.telegram.messenger.f3.l(textView3, i15, null, 1, 20.0f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.U2;
            String str6 = chat2 != null ? chat2.title : "";
            if (i7 != 2) {
                textView3.setText(org.telegram.messenger.hd.N0(2131743157, null));
                org.telegram.messenger.f3.q(null, null, 2131743158, new Object[]{str, str6}, textView2);
            } else if (s1()) {
                textView3.setText(org.telegram.messenger.hd.N0(2131743176, null));
                org.telegram.messenger.f3.q(null, null, 2131743177, new Object[]{str}, textView2);
            } else {
                textView3.setText(org.telegram.messenger.hd.N0(2131743100, null));
                if (org.telegram.messenger.v3.W(this.U2)) {
                    org.telegram.messenger.f3.q(null, null, 2131743219, new Object[]{str, str6}, textView2);
                } else {
                    org.telegram.messenger.f3.q(null, null, 2131743101, new Object[]{str, str6}, textView2);
                }
            }
            boolean z12 = org.telegram.messenger.hd.a0;
            frameLayout.addView(textView3, c8.ma.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 76, 11.0f, z12 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i7 == 2) {
                r14 = 0;
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131743066, null), new at(i13, this, c22));
            } else {
                r14 = 0;
                r14 = 0;
                if (z11) {
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131743159, null), new di.h(this, (TLRPC.User) c22, j3, 7));
                }
            }
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, r14), r14);
            t1Var.j(org.telegram.ui.ActionBar.m6.x0(r14, org.telegram.ui.ActionBar.m6.lh, false));
            t1Var.show();
            if (i7 != 2 || (textView = (TextView) t1Var.d(-1)) == null) {
                return;
            }
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.mh, r14);
            return;
        }
        if (i7 == 6) {
            this.d2.O0(this.a);
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            this.d2.t0(new bn(bundle));
            dismiss();
            return;
        }
        if (i7 == 8) {
            this.d2.O0(this.a);
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d2.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
            if ((g2Var instanceof bn) && ((bn) g2Var).a() == j3) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j3 > 0) {
                bundle2.putLong("user_id", j3);
            } else {
                bundle2.putLong("chat_id", -j3);
            }
            this.d2.t0(new bn(bundle2));
            dismiss();
            return;
        }
        if (i7 == 7) {
            sharedInstance.editCallMember(c22, Boolean.TRUE, null, null, Boolean.FALSE, null);
            S1(2, true);
            return;
        }
        int i16 = 9;
        if (i7 == 9) {
            org.telegram.ui.Components.x30 x30Var = this.g4;
            if (x30Var == null || !x30Var.g()) {
                TLRPC.User f11 = org.telegram.messenger.k10.i(cVar.a).f();
                org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(0, true, true);
                this.g4 = x30Var2;
                x30Var2.I = true;
                x30Var2.S = true;
                x30Var2.H = true;
                x30Var2.K = true;
                x30Var2.T = true;
                x30Var2.a = this.d2.M().getLastFragment();
                org.telegram.ui.Components.x30 x30Var3 = this.g4;
                o30 o30Var = new o30(this, j3);
                this.h4 = o30Var;
                x30Var3.b = o30Var;
                TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                x30Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new v00(this, i16), new hi.f1(5), 0);
                return;
            }
            return;
        }
        if (i7 != 10) {
            if (i7 != 11) {
                if (i7 == 5) {
                    sharedInstance.editCallMember(c22, Boolean.TRUE, null, null, null, null);
                    o1().m(0L, c22, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    voIPService = sharedInstance;
                    i10 = 1;
                    voIPService.editCallMember(c22, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    voIPService = sharedInstance;
                    i10 = 1;
                    voIPService.editCallMember(c22, Boolean.FALSE, null, 10000, null, null);
                }
                voIPService.setParticipantVolume(groupCallParticipant, org.telegram.messenger.v3.H(groupCallParticipant));
                o1().k(0L, i7 == i10 ? 31 : 36, c22, null, null, null);
                return;
            }
            Context context = getContext();
            int i17 = this.a;
            Pattern pattern = org.telegram.ui.Components.c5.a;
            if (org.telegram.messenger.n5.E(j3)) {
                TLRPC.User c23 = org.telegram.messenger.np.u1(i17).c2(Long.valueOf(j3));
                str2 = c23.first_name;
                str3 = c23.last_name;
            } else {
                str2 = org.telegram.messenger.np.u1(i17).O0(Long.valueOf(-j3)).title;
                str3 = null;
            }
            ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
            if (j3 > 0) {
                i11 = 2131743170;
                r142 = 0;
            } else {
                r142 = 0;
                i11 = 2131743169;
            }
            String N02 = org.telegram.messenger.hd.N0(i11, r142);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = N02;
            ?? g10 = org.telegram.messenger.f3.g(context, 1);
            EditText editText2 = new EditText(context);
            int i18 = org.telegram.ui.ActionBar.m6.Yg;
            org.telegram.ui.ActionBar.t6.U(editText2, i18, r142);
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j3 > 0 ? 5 : 6);
            if (j3 > 0) {
                i12 = 2131750677;
                str4 = null;
            } else {
                str4 = null;
                i12 = 2131743168;
            }
            editText2.setHint(org.telegram.messenger.hd.N0(i12, str4));
            editText2.setBackground(org.telegram.ui.ActionBar.m6.U(context));
            editText2.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            editText2.requestFocus();
            if (j3 > 0) {
                editText = new EditText(context);
                org.telegram.ui.ActionBar.t6.U(editText, i18, null);
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(org.telegram.messenger.hd.N0(2131748839, null));
                editText.setBackground(org.telegram.ui.ActionBar.m6.U(context));
                editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            } else {
                editText = null;
            }
            org.telegram.messenger.g0.I3(editText2);
            g10.addView(editText2, c8.ma.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                g10.addView(editText, c8.ma.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str2);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder2.o(g10);
            ki.l1 l1Var = new ki.l1(editText2, j3, i17, editText);
            alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131745750, null), l1Var);
            alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            t1Var2.O = new di.u1(6, editText2, editText);
            t1Var2.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
            t1Var2.show();
            t1Var2.p(org.telegram.ui.ActionBar.m6.x0(null, i18, false));
            ld ldVar = new ld(1, t1Var2, l1Var);
            if (editText != null) {
                editText.setOnEditorActionListener(ldVar);
                return;
            } else {
                editText2.setOnEditorActionListener(ldVar);
                return;
            }
        }
        String str7 = groupCallParticipant.about;
        Context context2 = getContext();
        int i19 = this.a;
        Pattern pattern2 = org.telegram.ui.Components.c5.a;
        ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
        if (j3 > 0) {
            str5 = null;
            f10 = 8.0f;
            N0 = org.telegram.messenger.hd.N0(2131743520, null);
        } else {
            str5 = null;
            f10 = 8.0f;
            N0 = org.telegram.messenger.hd.N0(2131751447, null);
        }
        String str8 = N0;
        final org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
        t1Var3.S = str8;
        t1Var3.U = org.telegram.messenger.hd.N0(j3 > 0 ? 2131743151 : 2131751450, str5);
        ?? frameLayout2 = new FrameLayout(context2);
        frameLayout2.setClipChildren(false);
        if (j3 < 0) {
            long j10 = -j3;
            if (org.telegram.messenger.np.u1(i19).P0(j10) == null) {
                z10 = 0;
                org.telegram.messenger.np.u1(i19).b3(ConnectionsManager.generateClassGuid(), j10, true);
                NumberTextView numberTextView = new NumberTextView(context2);
                EditText editText3 = new EditText(context2);
                int i20 = org.telegram.ui.ActionBar.m6.Yg;
                org.telegram.ui.ActionBar.t6.U(editText3, i20, null);
                editText3.setHint(j3 <= 0 ? org.telegram.messenger.hd.N0(2131743520, null) : org.telegram.messenger.hd.N0(2131751447, null));
                editText3.setTextSize(1, 16.0f);
                editText3.setBackground(org.telegram.ui.ActionBar.m6.U(context2));
                editText3.setMaxLines(4);
                editText3.setRawInputType(147457);
                editText3.setImeOptions(6);
                int i21 = j3 <= 0 ? 70 : org.telegram.messenger.ls.e4;
                org.telegram.ui.Components.t3 t3Var = new org.telegram.ui.Components.t3(i21, context2, numberTextView);
                InputFilter[] inputFilterArr = new InputFilter[1];
                inputFilterArr[z10] = t3Var;
                editText3.setFilters(inputFilterArr);
                numberTextView.setCenterAlign(true);
                numberTextView.setTextSize(15);
                numberTextView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, z10));
                numberTextView.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView, c8.ma.d(20, 20.0f, !org.telegram.messenger.hd.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                editText3.setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(f10));
                editText3.addTextChangedListener(new org.telegram.ui.Components.jq(i21, numberTextView));
                org.telegram.messenger.g0.X3(numberTextView, false, 0.0f, true, false);
                editText3.setText(str7);
                editText3.setSelection(editText3.getText().toString().length());
                alertDialog$Builder3.o(frameLayout2);
                final c4.n nVar = new c4.n(j3, i19, editText3, 3);
                alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131745750, null), nVar);
                alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                t1Var3.O = new org.telegram.ui.Components.r1(editText3, 1);
                frameLayout2.addView(editText3, c8.ma.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                editText3.requestFocus();
                org.telegram.messenger.g0.I3(editText3);
                editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.y1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i22, KeyEvent keyEvent) {
                        if (i22 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                            org.telegram.ui.ActionBar.t1 t1Var4 = t1Var3;
                            if (t1Var4.isShowing()) {
                                nVar.h(t1Var4, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                t1Var3.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
                t1Var3.show();
                t1Var3.p(org.telegram.ui.ActionBar.m6.x0(null, i20, false));
            }
        }
        z10 = 0;
        NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText32 = new EditText(context2);
        int i202 = org.telegram.ui.ActionBar.m6.Yg;
        org.telegram.ui.ActionBar.t6.U(editText32, i202, null);
        editText32.setHint(j3 <= 0 ? org.telegram.messenger.hd.N0(2131743520, null) : org.telegram.messenger.hd.N0(2131751447, null));
        editText32.setTextSize(1, 16.0f);
        editText32.setBackground(org.telegram.ui.ActionBar.m6.U(context2));
        editText32.setMaxLines(4);
        editText32.setRawInputType(147457);
        editText32.setImeOptions(6);
        if (j3 <= 0) {
        }
        org.telegram.ui.Components.t3 t3Var2 = new org.telegram.ui.Components.t3(i21, context2, numberTextView2);
        InputFilter[] inputFilterArr2 = new InputFilter[1];
        inputFilterArr2[z10] = t3Var2;
        editText32.setFilters(inputFilterArr2);
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, z10));
        numberTextView2.setImportantForAccessibility(2);
        frameLayout2.addView(numberTextView2, c8.ma.d(20, 20.0f, !org.telegram.messenger.hd.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
        editText32.setPadding(!org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(f10), !org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(f10));
        editText32.addTextChangedListener(new org.telegram.ui.Components.jq(i21, numberTextView2));
        org.telegram.messenger.g0.X3(numberTextView2, false, 0.0f, true, false);
        editText32.setText(str7);
        editText32.setSelection(editText32.getText().toString().length());
        alertDialog$Builder3.o(frameLayout2);
        final c4.n nVar2 = new c4.n(j3, i19, editText32, 3);
        alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131745750, null), nVar2);
        alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        t1Var3.O = new org.telegram.ui.Components.r1(editText32, 1);
        frameLayout2.addView(editText32, c8.ma.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText32.requestFocus();
        org.telegram.messenger.g0.I3(editText32);
        editText32.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.y1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView4, int i22, KeyEvent keyEvent) {
                if (i22 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                    org.telegram.ui.ActionBar.t1 t1Var4 = t1Var3;
                    if (t1Var4.isShowing()) {
                        nVar2.h(t1Var4, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        t1Var3.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
        t1Var3.show();
        t1Var3.p(org.telegram.ui.ActionBar.m6.x0(null, i202, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(boolean z10, org.telegram.ui.Cells.g4 g4Var) {
        int i7;
        float f10;
        final float f11;
        float f12;
        org.telegram.ui.Components.voip.y yVar;
        org.telegram.ui.Components.voip.y yVar2;
        float paddingLeft = this.b.getPaddingLeft() + org.telegram.messenger.g0.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + org.telegram.messenger.g0.L(14.0f);
        boolean z11 = this.a5;
        d20 d20Var = this.m1;
        n30 n30Var = this.L1;
        if (z11) {
            f11 = (n30Var.getX() + (g4Var.getX() + g4Var.getAvatarImageView().getX())) - paddingLeft;
            f10 = (n30Var.getY() + (g4Var.getY() + g4Var.getAvatarImageView().getY())) - paddingTop;
            f12 = g4Var.getAvatarImageView().getMeasuredHeight() / n30Var.getMeasuredWidth();
            i7 = (int) ((g4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f12);
        } else {
            if (this.Y4 == null) {
                this.N4 = true;
            } else {
                this.N4 = z10 || d20Var.E0.k(d20Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.r rVar = this.X4;
            b20 b20Var = this.Z3;
            if (rVar == null || !this.N4) {
                org.telegram.ui.Components.u10 u10Var = this.Z4;
                if (u10Var != null) {
                    org.telegram.ui.Components.voip.y yVar3 = this.Y4;
                    x10 x10Var = this.l4;
                    if (yVar3 == null) {
                        float x10 = (b20Var.getX() + (x10Var.getX() + (this.Z4.getX() + u10Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y10 = (b20Var.getY() + (x10Var.getY() + (this.Z4.getY() + this.Z4.getAvatarImageView().getY()))) - paddingTop;
                        f12 = this.Z4.getAvatarImageView().getMeasuredHeight() / n30Var.getMeasuredWidth();
                        i7 = (int) ((this.Z4.getAvatarImageView().getMeasuredHeight() >> 1) / f12);
                        f10 = y10;
                        f11 = x10;
                        if (!this.N4 && (yVar = this.Y4) != null) {
                            yVar.invalidate();
                            b20Var.invalidate();
                            org.telegram.ui.Components.voip.y yVar4 = this.Y4;
                            yVar4.h = false;
                            yVar4.j(false);
                            this.Y4 = null;
                        }
                    } else if (this.N4) {
                        f11 = (b20Var.getX() + (x10Var.getX() + u10Var.getX())) - paddingLeft;
                        f10 = (b20Var.getY() + (x10Var.getY() + this.Z4.getY())) - paddingTop;
                        i7 = 0;
                    }
                }
                i7 = 0;
                f10 = 0.0f;
                f11 = 0.0f;
                f12 = 0.96f;
                if (!this.N4) {
                    yVar.invalidate();
                    b20Var.invalidate();
                    org.telegram.ui.Components.voip.y yVar42 = this.Y4;
                    yVar42.h = false;
                    yVar42.j(false);
                    this.Y4 = null;
                }
            } else {
                float x11 = (n30Var.getX() + rVar.getX()) - paddingLeft;
                f10 = ((n30Var.getY() + this.X4.getY()) + org.telegram.messenger.g0.L(2.0f)) - paddingTop;
                i7 = 0;
                f11 = x11;
            }
            f12 = 1.0f;
            if (!this.N4) {
            }
        }
        final float f13 = f10;
        final float f14 = f12;
        c20 c20Var = this.C4;
        if (z10) {
            e20 e20Var = this.B4;
            e20Var.setScaleX(f14);
            e20Var.setScaleY(f14);
            e20Var.setTranslationX(f11);
            e20Var.setTranslationY(f13);
            c20Var.setAlpha(0.0f);
        }
        d20Var.N(i7, i7);
        if (this.f4) {
            g20 g20Var = this.a4;
            if (z10) {
                g20Var.setAlpha(0.0f);
            }
            org.telegram.messenger.o10.n(g20Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.o10.n(c20Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (yVar2 = this.Y4) != null) {
            yVar2.h = false;
            yVar2.j(true);
            if (d20Var.E0.k(d20Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.u uVar = this.Y4.a;
                uVar.F = false;
                uVar.G = 0L;
                this.X4 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i10 = i7;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.a10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var = f40.this;
                f40Var.c4 = floatValue;
                f40Var.Z3.n = floatValue;
                float f15 = (floatValue * 1.0f) + ((1.0f - floatValue) * f14);
                e20 e20Var2 = f40Var.B4;
                e20Var2.setScaleX(f15);
                e20Var2.setScaleY(f15);
                e20Var2.setTranslationX((1.0f - f40Var.c4) * f11);
                e20Var2.setTranslationY((1.0f - f40Var.c4) * f13);
                if (!f40Var.f4) {
                    f40Var.V4.setAlpha((int) (f40Var.c4 * 100.0f));
                }
                org.telegram.ui.Components.voip.y yVar5 = f40Var.Y4;
                if (yVar5 != null) {
                    yVar5.a.setRoundCorners((1.0f - f40Var.c4) * org.telegram.messenger.g0.L(8.0f));
                }
                e20Var2.invalidate();
                f40Var.b.invalidate();
                d20 d20Var2 = f40Var.m1;
                int i11 = (int) ((1.0f - f40Var.c4) * i10);
                d20Var2.N(i11, i11);
            }
        });
        this.c5 = org.telegram.messenger.ls.f(this.o1.a).q(new int[]{org.telegram.messenger.ls.b0, org.telegram.messenger.ls.Y1, org.telegram.messenger.ls.D}, this.c5, true);
        org.telegram.ui.Components.voip.y yVar5 = this.X4 != null ? this.Y4 : null;
        if (yVar5 != null) {
            yVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, yVar5, z10, 10));
        if (this.a5 || this.Y4 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.setDuration(220L);
            this.Y4.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.u uVar2 = this.Y4.a;
            if (uVar2.F) {
                uVar2.H.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        V0();
    }

    public final void F1() {
        m4 m4Var = this.z4;
        org.telegram.messenger.g0.r(m4Var);
        if (!this.y4 || this.P2 == null || VoIPService.getSharedInstance() == null || !v1() || this.L1 == null || !org.telegram.messenger.qc.e(512)) {
            return;
        }
        org.telegram.messenger.g0.h3(m4Var, 30L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void G1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        this.C1.setText("");
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var == null || t3Var.b == null || (g10 = t3Var.g(t3Var.a)) == null) {
            return;
        }
        org.telegram.messenger.t3 t3Var2 = this.V2;
        long j3 = t3Var2.b.id;
        TLRPC.Peer peer = t3Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? org.telegram.messenger.n5.o(peer) : org.telegram.messenger.k10.i(this.a).n, tL_textWithEntities, j3, g10);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            b1();
            Z0();
            a1();
            float f12 = 1.0f - this.y5.e;
            o10 o10Var = this.p1;
            o10Var.setAlpha(f12);
            this.Z3.setProgressToHideUi(f10);
            this.l4.invalidate();
            this.b.invalidate();
            o10Var.invalidate();
        }
        if (i7 == 3) {
            c1();
            b1();
            d1();
            Y0();
            this.b.invalidate();
        }
        if (i7 == 4) {
            b1();
            this.B1.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 5) {
            b1();
            this.b.invalidate();
        }
    }

    public final void H1(float f10) {
        this.T3 = f10;
        b20 b20Var = this.Z3;
        float max = Math.max(f10, b20Var == null ? 0.0f : b20Var.c);
        int i7 = org.telegram.ui.ActionBar.m6.ah;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.Xg;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.U3 = S0;
        this.I1.setBackgroundColor(S0);
        this.f3.I(-14472653);
        this.a2.setColorFilter(new PorterDuffColorFilter(this.U3, PorterDuff.Mode.MULTIPLY));
        this.H0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.kh, false));
        g.b bVar = this.k2;
        if (bVar != null) {
            bVar.b = S02;
            uv uvVar = (uv) bVar.i;
            if (uvVar != null) {
                uvVar.invalidate();
            }
        }
        this.x2.setColor(S02);
        this.z1.setColor(S02);
        this.A1.invalidate();
        n30 n30Var = this.L1;
        n30Var.setGlowColor(S02);
        int i11 = this.E3;
        if (i11 == 3 || t1(i11)) {
            this.w1.invalidate();
        }
        View view = this.I4;
        if (view != null) {
            int i12 = this.U3;
            int[] iArr = this.L4;
            iArr[0] = i12;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.K4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.K4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.J4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.uh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.vh, false));
        this.u1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ch, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.fh, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ih, false));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0);
        int childCount = n30Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = n30Var.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.a4) {
                org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) childAt;
                if (s1()) {
                    a4Var.a(w02, w02);
                } else {
                    a4Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.g4;
                d30 d30Var = this.J1;
                if (z10) {
                    ((org.telegram.ui.Cells.g4) childAt).f(d30Var.getTag() != null ? org.telegram.ui.ActionBar.m6.ih : org.telegram.ui.ActionBar.m6.dh, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                    ((org.telegram.ui.Cells.z3) childAt).a(d30Var.getTag() != null ? org.telegram.ui.ActionBar.m6.ih : org.telegram.ui.ActionBar.m6.dh, S05);
                }
            }
        }
        this.b.invalidate();
        n30Var.invalidate();
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I() {
        return !this.Z3.b;
    }

    public final void I1(float f10) {
        n30 n30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        v4.f1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f10 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.K2 = min;
        this.L2 = (min - this.J2) / 265.0f;
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var == null || (n30Var = this.L1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(org.telegram.messenger.gj.B1(this.v2))) == null) {
            return;
        }
        b20 b20Var = this.Z3;
        if (b20Var.b) {
            int i7 = 0;
            while (true) {
                x10 x10Var = this.l4;
                if (i7 >= x10Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) x10Var.getChildAt(i7);
                if (org.telegram.messenger.gj.B1(u10Var.getParticipant().peer) == org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                    u10Var.setAmplitude(f10 * 15.0f);
                }
                i7++;
            }
        } else {
            int indexOf = (this.n2 ? this.y2 : this.V2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = n30Var.K(indexOf + this.K1.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) view).setAmplitude(f10 * 15.0f);
                    if (view == this.W4 && !this.k4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        b20Var.k(groupCallParticipant, f10 * 15.0f);
    }

    public final void J1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f5 = i7;
        this.g5 = i10;
        this.h5 = i11;
        this.i5 = i12;
        this.j5 = i13;
        this.k5 = i14;
        this.l5 = i15;
        this.m5 = i16;
        this.n5 = i17;
        this.o5 = i18;
        this.p5 = i19;
        this.q5 = i20;
        this.r5 = i21;
        this.s5 = i22;
        this.t5 = i23;
        this.u5 = i24;
    }

    public final void K1(float f10) {
        int i7;
        this.t2 = f10;
        this.L1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float L = f10 - org.telegram.messenger.g0.L(74.0f);
        float f11 = this.t0 + L;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        u30 u30Var = this.P2;
        b20 b20Var = this.Z3;
        v10 v10Var = this.a3;
        t10 t10Var = this.Z2;
        if (f11 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L) - this.t0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.t0) - org.telegram.messenger.g0.L(14.0f))));
            i7 = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 17.0f : 13.0f) * min);
            if (u30Var != null) {
                u30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.T3) > 1.0E-4f) {
                H1(Math.min(1.0f, min));
            }
            float z10 = org.telegram.ui.Cells.c0.z(min, 0.1f, 1.2f, 1.0f);
            t10Var.setScaleX(Math.max(0.9f, z10));
            t10Var.setScaleY(Math.max(0.9f, z10));
            float f12 = 1.0f - (min * 1.2f);
            t10Var.setAlpha((1.0f - b20Var.c) * Math.max(0.0f, f12));
            v10Var.setScaleX(Math.max(0.9f, z10));
            v10Var.setScaleY(Math.max(0.9f, z10));
            v10Var.setAlpha((1.0f - b20Var.c) * Math.max(0.0f, f12));
        } else {
            t10Var.setScaleX(1.0f);
            t10Var.setScaleY(1.0f);
            t10Var.setAlpha(1.0f - b20Var.c);
            v10Var.setScaleX(1.0f);
            v10Var.setScaleY(1.0f);
            v10Var.setAlpha(1.0f - b20Var.c);
            if (this.T3 > 1.0E-4f) {
                H1(0.0f);
            }
            i7 = 0;
        }
        b1();
        float f13 = i7;
        this.y3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.e3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (u30Var != null) {
            u30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        t20 t20Var = this.M1;
        if (t20Var != null) {
            t20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.b.invalidate();
        Z1();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        ArrayList arrayList = this.X3;
        ArrayList arrayList2 = this.Y3;
        b20 b20Var = this.Z3;
        if (b20Var != null) {
            if (this.p4 != null) {
                this.L1.getViewTreeObserver().removeOnPreDrawListener(this.p4);
                this.p4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i7)).f();
                b20Var.removeView((View) arrayList2.get(i7));
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i7)).e();
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i7)).b(true);
            }
            arrayList.clear();
            if (b20Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(b20Var);
            }
        }
        ai.s2 s2Var = this.p3;
        if (s2Var.d) {
            s2Var.d = false;
            Thread thread = s2Var.e;
            if (thread != null) {
                thread.interrupt();
                s2Var.e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.L();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (C5 == this) {
            C5 = null;
        }
        D5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.c20.k(getContext());
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null) {
            ArrayList arrayList3 = t3Var.e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            t3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x04be, code lost:
    
        if (org.telegram.messenger.v3.w(2, r35.U2) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0308, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0323, code lost:
    
        if (r12 == (-m1())) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02bf, code lost:
    
        if (r2.admin_rights.manage_call != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M1(View view) {
        org.telegram.ui.Cells.g4 g4Var;
        c40 c40Var;
        Integer num;
        Integer num2;
        ViewGroup viewGroup;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num3;
        boolean z10;
        int i7;
        TLRPC.GroupCall groupCall;
        long j3;
        org.telegram.messenger.gc m10;
        org.telegram.messenger.gc m11;
        boolean z11;
        o30 o30Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        int y10;
        float y11;
        int measuredHeight;
        int i10;
        boolean z12;
        ?? r52;
        String str;
        String str2;
        int i11;
        String str3;
        int i12;
        TLRPC.ChatParticipants chatParticipants;
        Integer valueOf = Integer.valueOf(R.drawable.msg_msgbubble3);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_voice_muted);
        int i13 = 4;
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_voice_unmuted);
        if (!this.S1.k() && getContext() != null) {
            if (this.b5 || this.e4) {
                g1(true);
                return false;
            }
            h30 h30Var = this.e5;
            if (h30Var != null) {
                h30Var.dismiss();
                this.e5 = null;
                return false;
            }
            e1();
            if (view instanceof org.telegram.ui.Components.voip.r) {
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                if (rVar.getParticipant() != this.V2.z) {
                    g4Var = new org.telegram.ui.Cells.g4(rVar.getContext());
                    g4Var.e(this.o1, rVar.getParticipant().a, this.V2, org.telegram.messenger.gj.B1(this.v2), null, false);
                    org.telegram.ui.Components.n5 n5Var = g4Var.s;
                    if (n5Var != null) {
                        n5Var.f();
                    }
                    this.a5 = false;
                    this.X4 = rVar;
                    this.Y4 = rVar.getRenderer();
                    if (!F5 && !E5) {
                        this.b.addView(g4Var, c8.ma.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (g4Var != null) {
                        boolean z13 = (E5 || F5 || org.telegram.messenger.g0.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = g4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new uh(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new w00(this, i13));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.D4 = linearLayout;
                            org.telegram.ui.Components.ge0 ge0Var = new org.telegram.ui.Components.ge0(getContext(), linearLayout, linearLayout2);
                            ge0Var.setMinimumWidth(org.telegram.messenger.g0.L(240.0f));
                            ge0Var.setOrientation(1);
                            boolean z14 = z13;
                            int S0 = org.telegram.messenger.g0.S0(this.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.kh, false));
                            if (linearLayout2 == null || g4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                c40Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                ge0Var.addView(linearLayout2, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                c40Var = new c40(this, getContext(), participant);
                                linearLayout2.addView(c40Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            ge0Var.addView(linearLayout, c8.ma.k(0.0f, c40Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(getContext(), ge0Var);
                            l1Var.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var, c8.ma.c(-2.0f, -2));
                            long B1 = org.telegram.messenger.gj.B1(participant.peer);
                            c40 c40Var2 = c40Var;
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            org.telegram.messenger.c cVar = this.o1;
                            if (!z15) {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                            } else if (org.telegram.messenger.v3.T(this.U2)) {
                                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(cVar.a);
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num = 6;
                                num2 = 8;
                                long j10 = participant.peer.user_id;
                                num3 = valueOf2;
                                viewGroup = linearLayout;
                                a0.h hVar = (a0.h) u12.A1.f(m1());
                                TLRPC.ChannelParticipant channelParticipant = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j10);
                                if (channelParticipant != null) {
                                    if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
                                    }
                                    z10 = true;
                                }
                                z10 = false;
                            } else {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(cVar.a).P0(m1());
                                if (P0 != null && (chatParticipants = P0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i14);
                                        TLRPC.ChatFull chatFull = P0;
                                        int i15 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i14++;
                                            P0 = chatFull;
                                            size = i15;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            if (g4Var.c()) {
                                if (s1() && g4Var.L) {
                                    str = null;
                                    org.telegram.ui.Cells.c0.v(null, 2131743149, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(org.telegram.messenger.hd.N0(g4Var.b.getImageReceiver().L() ? 2131743260 : 2131742997, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                if (B1 > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i12 = 2131743262;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i12 = 2131743172;
                                    }
                                    arrayList.add(org.telegram.messenger.hd.N0(i12, str3));
                                } else {
                                    arrayList.add(org.telegram.messenger.hd.N0(TextUtils.isEmpty(participant.about) ? 2131743261 : 2131743171, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (B1 > 0) {
                                    i11 = 2131743170;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i11 = 2131743169;
                                }
                                arrayList.add(org.telegram.messenger.hd.N0(i11, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (T0()) {
                                if (!s1() && z10 && participant.muted) {
                                    if (s1() && participant.muted_by_you) {
                                        arrayList.add(org.telegram.messenger.hd.N0(2131743073, null));
                                        arrayList2.add(valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    arrayList.add(org.telegram.messenger.hd.N0(2131743114, null));
                                    arrayList2.add(num3);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(org.telegram.messenger.hd.N0(2131743155, null));
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(valueOf3);
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j11 = peer.channel_id;
                                    if (j11 != 0 && !org.telegram.messenger.v3.m0(this.a, j11)) {
                                        org.telegram.ui.Cells.c0.v(null, 2131743108, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num2);
                                        if (s1()) {
                                            i7 = z10 ? 2 : 2;
                                        } else {
                                            org.telegram.messenger.t3 t3Var = this.V2;
                                            if (t3Var != null && (groupCall = t3Var.b) != null && groupCall.creator) {
                                                org.telegram.ui.Cells.c0.v(null, 2131743066, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i7));
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Cells.c0.v(null, 2131743106, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num);
                                if (s1()) {
                                }
                            } else {
                                Integer num4 = num;
                                Integer num5 = num2;
                                if (participant.muted_by_you) {
                                    arrayList.add(org.telegram.messenger.hd.N0(2131743073, null));
                                    arrayList2.add(valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    arrayList.add(org.telegram.messenger.hd.N0(2131743113, null));
                                    arrayList2.add(num3);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j12 = peer2.channel_id;
                                    if (j12 != 0 && !org.telegram.messenger.v3.m0(this.a, j12)) {
                                        arrayList.add(org.telegram.messenger.hd.N0(2131743108, null));
                                        arrayList2.add(valueOf);
                                        arrayList3.add(num5);
                                    }
                                }
                                arrayList.add(org.telegram.messenger.hd.N0(2131743107, null));
                                arrayList2.add(valueOf);
                                arrayList3.add(num4);
                            }
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (i16 < size2) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(getContext(), i16 == 0, i16 == size2 + (-1));
                                if (((Integer) arrayList3.get(i16)).intValue() != 2) {
                                    int i17 = org.telegram.ui.ActionBar.m6.Yg;
                                    z12 = false;
                                    r52 = 0;
                                    y0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i17, false), org.telegram.ui.ActionBar.m6.x0(null, i17, false));
                                } else {
                                    z12 = false;
                                    r52 = 0;
                                    int i18 = org.telegram.ui.ActionBar.m6.mh;
                                    y0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i18, false), org.telegram.ui.ActionBar.m6.x0(null, i18, false));
                                }
                                y0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.x0(r52, org.telegram.ui.ActionBar.m6.Vg, z12));
                                y0Var.j((CharSequence) arrayList.get(i16), ((Integer) arrayList2.get(i16)).intValue(), r52);
                                viewGroup.addView(y0Var);
                                y0Var.setTag(arrayList3.get(i16));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                y0Var.setOnClickListener(new fi.k5(this, i16, arrayList4, groupCallParticipant, 5));
                                i16++;
                                arrayList3 = arrayList4;
                                participant = groupCallParticipant;
                            }
                            l1Var.addView(ge0Var, c8.ma.x(-2, -2, 51));
                            n30 n30Var = this.L1;
                            n30Var.C0();
                            this.T1.X = false;
                            this.W4 = g4Var;
                            g4Var.setAboutVisible(true);
                            this.b.invalidate();
                            n30Var.invalidate();
                            AnimatorSet animatorSet = this.d5;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            this.d4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            if (B1 > 0) {
                                int i19 = cVar.a;
                                int i20 = cVar.a;
                                TLRPC.User c22 = org.telegram.messenger.np.u1(i19).c2(Long.valueOf(B1));
                                m10 = org.telegram.messenger.gc.m(i20, 0, c22);
                                m11 = org.telegram.messenger.gc.m(i20, 1, c22);
                                j3 = B1;
                                if (org.telegram.messenger.np.u1(this.a).d2(j3) == null) {
                                    org.telegram.messenger.np.u1(this.a).n3(c22, false, 0);
                                }
                            } else {
                                j3 = B1;
                                int i21 = cVar.a;
                                int i22 = cVar.a;
                                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i21).O0(Long.valueOf(-j3));
                                m10 = org.telegram.messenger.gc.m(i22, 0, O0);
                                m11 = org.telegram.messenger.gc.m(i22, 1, O0);
                            }
                            org.telegram.ui.Components.voip.y yVar = this.Y4;
                            boolean z16 = yVar != null && yVar.w;
                            if (m10 != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.q9 avatarImageView = this.W4.getAvatarImageView();
                                    d20 d20Var = this.m1;
                                    d20Var.setParentAvatarImage(avatarImageView);
                                    d20Var.setHasActiveVideo(z16);
                                    d20Var.M(j3, true);
                                    d20Var.setCreateThumbFromParent(true);
                                    d20Var.H(null, m10, m11, true);
                                    org.telegram.ui.Components.voip.y yVar2 = this.Y4;
                                    if (yVar2 != null) {
                                        yVar2.h = true;
                                        yVar2.j(true);
                                    }
                                    if (org.telegram.messenger.gj.B1(this.v2) == j3 && this.g4 != null && (o30Var = this.h4) != null && (fileLocation = o30Var.c) != null) {
                                        d20Var.A(o30Var.d, org.telegram.messenger.gc.e(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.e4 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.d4, c8.ma.c(-2.0f, -2));
                                this.f4 = true;
                                g20 g20Var = this.a4;
                                if (g20Var == null) {
                                    i10 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.u0 * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - org.telegram.messenger.g0.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -org.telegram.messenger.g0.m);
                                    this.d2.M().getView().draw(canvas);
                                    canvas.drawColor(i0.a.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -org.telegram.messenger.g0.m);
                                    this.E4 = true;
                                    this.b.draw(canvas);
                                    i10 = 0;
                                    this.E4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / org.telegram.messenger.ls.K2));
                                    g20Var.setBackground(new BitmapDrawable(createBitmap));
                                    g20Var.setAlpha(0.0f);
                                    g20Var.setVisibility(0);
                                    g20Var.bringToFront();
                                }
                                this.b5 = true;
                                this.B4.setVisibility(i10);
                                if (c40Var2 != null) {
                                    c40Var2.invalidate();
                                }
                                E1(true, g4Var);
                                org.telegram.ui.Components.u10 u10Var = this.Z4;
                                if (u10Var != null) {
                                    u10Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.e4 = false;
                            h30 h30Var2 = new h30(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            this.e5 = h30Var2;
                            h30Var2.e = true;
                            h30Var2.c = org.telegram.messenger.ls.x3;
                            h30Var2.setOutsideTouchable(true);
                            this.e5.setClippingEnabled(true);
                            this.e5.setAnimationStyle(R.style.PopupContextAnimation);
                            this.e5.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            this.e5.setInputMethodMode(2);
                            this.e5.setSoftInputMode(0);
                            this.e5.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.u10 u10Var2 = this.Z4;
                            if (u10Var2 != null) {
                                boolean z17 = E5;
                                b20 b20Var = this.Z3;
                                x10 x10Var = this.l4;
                                if (z17) {
                                    x10 = org.telegram.messenger.g0.L(32.0f) + (((int) (b20Var.getX() + (x10Var.getX() + u10Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                    y10 = ((int) (b20Var.getY() + (x10Var.getY() + this.Z4.getY()))) - org.telegram.messenger.g0.L(6.0f);
                                } else {
                                    int x11 = ((int) (b20Var.getX() + (x10Var.getX() + u10Var2.getX()))) - org.telegram.messenger.g0.L(14.0f);
                                    y10 = (int) ((b20Var.getY() + (x10Var.getY() + this.Z4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight());
                                    x10 = x11;
                                }
                            } else {
                                x10 = (int) (((n30Var.getX() + n30Var.getMeasuredWidth()) + org.telegram.messenger.g0.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                if (this.a5) {
                                    y11 = g4Var.getY() + n30Var.getY();
                                    measuredHeight = g4Var.getClipHeight();
                                } else if (this.X4 != null) {
                                    y11 = this.X4.getY() + n30Var.getY();
                                    measuredHeight = this.X4.getMeasuredHeight();
                                } else {
                                    y10 = (int) n30Var.getY();
                                }
                                y10 = (int) (y11 + measuredHeight);
                            }
                            this.e5.showAtLocation(n30Var, 51, x10, y10);
                            this.d5 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.V4, org.telegram.ui.Components.r6.b, 0, 100));
                            this.d5.playTogether(arrayList5);
                            this.d5.setDuration(150L);
                            this.d5.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.u10) {
                    org.telegram.ui.Components.u10 u10Var3 = (org.telegram.ui.Components.u10) view;
                    if (u10Var3.getParticipant() != this.V2.z.a) {
                        g4Var = new org.telegram.ui.Cells.g4(u10Var3.getContext());
                        g4Var.e(this.o1, u10Var3.getParticipant(), this.V2, org.telegram.messenger.gj.B1(this.v2), null, false);
                        org.telegram.ui.Components.n5 n5Var2 = g4Var.s;
                        if (n5Var2 != null) {
                            n5Var2.f();
                        }
                        this.a5 = false;
                        this.Z4 = u10Var3;
                        org.telegram.ui.Components.voip.y renderer = u10Var3.getRenderer();
                        this.Y4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Y4 = null;
                        }
                        this.b.addView(g4Var, c8.ma.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    g4Var = (org.telegram.ui.Cells.g4) view;
                    this.a5 = true;
                }
                if (g4Var != null) {
                }
            }
        }
        return false;
    }

    public final void N1(View view) {
        if (this.h2 == null) {
            org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(8, getContext(), null, true);
            this.h2 = m30Var;
            m30Var.setAlpha(0.0f);
            this.h2.setVisibility(4);
            this.h2.setShowingDuration(3000L);
            this.b.addView(this.h2, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.v3.W(this.U2)) {
                this.h2.setText(org.telegram.messenger.hd.N0(2131743220, null));
            } else {
                this.h2.setText(org.telegram.messenger.hd.N0(2131743102, null));
            }
            this.h2.b();
        }
        this.h2.setExtraTranslationY(-org.telegram.messenger.g0.m);
        this.h2.c(view);
    }

    public final void O1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.messenger.t3 t3Var = this.V2;
        org.telegram.ui.Components.voip.q2 q2Var = this.v1;
        org.telegram.ui.Components.voip.q2 q2Var2 = this.r1;
        org.telegram.ui.Components.voip.q2 q2Var3 = this.t1;
        org.telegram.ui.Components.voip.q2 q2Var4 = this.q1;
        org.telegram.ui.Components.voip.q2 q2Var5 = this.s1;
        org.telegram.ui.Components.voip.q2 q2Var6 = this.u1;
        org.telegram.ui.Components.voip.q2 q2Var7 = this.w1;
        o10 o10Var = this.p1;
        boolean z15 = false;
        if (t3Var == null || t3Var.j()) {
            o10Var.c(q2Var7, this.Q2 > 0.1f, z10);
            o10Var.c(q2Var6, this.Q2 > 0.1f, z10);
            o10Var.c(q2Var3, this.Q2 > 0.1f, z10);
            o10Var.c(q2Var5, false, z10);
            o10Var.c(q2Var4, false, z10);
            o10Var.c(q2Var2, false, z10);
            o10Var.c(q2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.v2));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || T0()) ? false : true;
        Boolean bool = this.w5;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.V2.b;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.V2.c()) && !z16) || v1()) {
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
        if (E5) {
            z13 = false;
            z14 = false;
        }
        o10Var.c(q2Var7, true, z10);
        o10Var.c(q2Var6, true, z10);
        o10Var.c(q2Var5, z12, z10);
        o10Var.c(q2Var4, z14, z10);
        o10Var.c(q2Var3, z15, z10);
        o10Var.c(q2Var2, z13, z10);
        o10Var.c(q2Var, z11, z10);
    }

    public final void P1() {
        org.telegram.messenger.t3 t3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.t3 t3Var2 = this.V2;
        org.telegram.ui.ActionBar.q0 q0Var = this.f3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.h3;
        if (t3Var2 == null || t3Var2.j()) {
            this.g3.setVisibility(4);
            q0Var2.setVisibility(8);
            if (this.V2 == null) {
                q0Var.setVisibility(8);
                return;
            }
        }
        if (this.g2) {
            return;
        }
        org.telegram.messenger.c cVar = this.o1;
        int i7 = cVar.a;
        int i10 = cVar.a;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(m1()));
        if (O0 != null) {
            this.U2 = O0;
        }
        boolean y10 = org.telegram.messenger.v3.y(3, this.U2);
        org.telegram.ui.ActionBar.y0 y0Var = this.i3;
        if (y10 || (((!org.telegram.messenger.v3.T(this.U2) || ((chat2 = this.U2) != null && chat2.megagroup)) && (org.telegram.messenger.v3.t0(this.U2) || org.telegram.messenger.v3.y(3, this.U2))) || (org.telegram.messenger.v3.T(this.U2) && (chat = this.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)))) {
            y0Var.setVisibility(0);
        } else {
            y0Var.setVisibility(8);
        }
        org.telegram.messenger.t3 t3Var3 = this.V2;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.x3;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.w3;
        if (t3Var3 == null || (groupCall2 = t3Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            y0Var3.setVisibility(8);
            y0Var2.setVisibility(8);
        } else {
            y0Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            y0Var2.setVisibility(this.V2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.v2));
        org.telegram.messenger.t3 t3Var4 = this.V2;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.l3;
        if (t3Var4 == null || t3Var4.j() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            y0Var4.setVisibility(8);
        } else {
            y0Var4.setVisibility(0);
        }
        y0Var4.setIcon(org.telegram.messenger.cz.I0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        y0Var4.setSubtext(org.telegram.messenger.hd.N0(org.telegram.messenger.cz.I0 ? 2131743035 : 2131743036, null));
        org.telegram.messenger.t3 t3Var5 = this.V2;
        this.m3.setVisibility((t3Var5 == null || t3Var5.j() || v1() || !DictationAsr.D()) ? 8 : 0);
        R1(false);
        Q1();
        boolean T0 = T0();
        org.telegram.ui.ActionBar.y0 y0Var5 = this.v3;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.j3;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.r3;
        org.telegram.ui.ActionBar.y0 y0Var8 = this.s3;
        if (T0) {
            y0Var5.setVisibility(0);
            y0Var6.setVisibility(0);
            if (v1()) {
                y0Var7.setVisibility(0);
                y0Var8.setVisibility(8);
            } else if (this.V2.j()) {
                y0Var7.setVisibility(8);
                y0Var8.setVisibility(8);
            } else {
                y0Var7.setVisibility(0);
            }
            if (s1()) {
                y0Var7.setVisibility(8);
                y0Var6.setVisibility(8);
            }
            if (!this.V2.c() || this.V2.j() || v1()) {
                y0Var8.setVisibility(8);
            } else {
                y0Var8.setVisibility(0);
            }
            q0Var2.setVisibility(8);
            boolean z10 = this.V2.w;
            a40 a40Var = this.Y2;
            a40Var.f = z10;
            a40Var.d = 1.0f;
            a40Var.invalidateSelf();
            if (this.V2.w) {
                if (this.C3 == null) {
                    v00 v00Var = new v00(this, 7);
                    this.C3 = v00Var;
                    org.telegram.messenger.g0.h3(v00Var, 1000L);
                }
                y0Var7.setText(org.telegram.messenger.hd.N0(2131743078, null));
            } else {
                v00 v00Var2 = this.C3;
                if (v00Var2 != null) {
                    org.telegram.messenger.g0.r(v00Var2);
                    this.C3 = null;
                }
                y0Var7.setText(org.telegram.messenger.hd.N0(2131743103, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                y0Var8.j(org.telegram.messenger.hd.N0(2131743191, null), R.drawable.msg_screencast, null);
            } else {
                y0Var8.j(org.telegram.messenger.hd.N0(2131743189, null), R.drawable.msg_screencast_off, null);
            }
            T1();
        } else {
            boolean z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || T0()) ? false : true;
            boolean z12 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z11 || (!(this.V2.c() || z12) || this.V2.j() || v1())) {
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(8);
            } else if (z12) {
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(0);
                y0Var8.j(org.telegram.messenger.hd.N0(2131743189, null), R.drawable.msg_screencast_off, null);
                y0Var8.setContentDescription(org.telegram.messenger.hd.N0(2131743189, null));
            } else {
                y0Var8.j(org.telegram.messenger.hd.N0(2131743191, null), R.drawable.msg_screencast, null);
                y0Var8.setContentDescription(org.telegram.messenger.hd.N0(2131743191, null));
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(0);
            }
            y0Var5.setVisibility(8);
            y0Var6.setVisibility(8);
            y0Var7.setVisibility(8);
        }
        boolean T02 = T0();
        org.telegram.ui.ActionBar.y0 y0Var9 = this.q3;
        if (T02 && this.V2.b.can_change_join_muted && !s1()) {
            y0Var9.setVisibility(0);
        } else {
            y0Var9.setVisibility(8);
        }
        q0Var.R(4, (s1() && ((t3Var = this.V2) == null || (groupCall = t3Var.b) == null || !groupCall.creator)) ? false : true);
        this.k3.setVisibility((!v1() || this.V2.j()) ? 0 : 8);
        int visibility = y0Var6.getVisibility();
        TextView textView = this.z3;
        if (visibility == 0 || y0Var9.getVisibility() == 0 || y0Var.getVisibility() == 0 || y0Var8.getVisibility() == 0 || y0Var7.getVisibility() == 0 || y0Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f2;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.W2) || v1() || this.v2 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.gj.B1(this.v2);
            kVar.setObject(org.telegram.messenger.n5.E(B1) ? org.telegram.messenger.np.u1(i10).c2(Long.valueOf(B1)) : org.telegram.messenger.np.u1(i10).O0(Long.valueOf(-B1)));
        }
        TLRPC.Chat chat3 = this.U2;
        if (chat3 == null || org.telegram.messenger.v3.W(chat3) || !v1() || y0Var.getVisibility() != 8) {
            q0Var.setVisibility(0);
        } else {
            q0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.e3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.y3.getLayoutParams()).rightMargin = 0;
        this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void Q1() {
        org.telegram.messenger.t3 t3Var;
        if (this.p3 == null) {
            return;
        }
        int i7 = 0;
        boolean z10 = (!ai.s2.a() || (t3Var = this.V2) == null || t3Var.j() || v1() || C5 != this) ? false : true;
        if (z10 && !this.p3.d) {
            final ai.s2 s2Var = this.p3;
            Context context = getContext();
            int i10 = this.o1.a;
            TLRPC.Chat chat = this.U2;
            long j3 = chat != null ? -chat.id : 0L;
            if (s2Var.d) {
                return;
            }
            s2Var.d = true;
            final android.support.v4.media.session.a0 T = DictationAsr.T(ai.w0.c(context, j3), false);
            boolean x10 = DictationAsr.x();
            s2Var.c = x10;
            if (x10) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.d(context);
                }
            }
            StringBuilder sb2 = new StringBuilder("live captions: ");
            sb2.append(T);
            p5.c.t(sb2, s2Var.c ? ", tinylid" : "", "Dictation");
            s2Var.a.getClass();
            DictationAsr.f0((ai.t) T.b, new ai.u() { // from class: ai.n2
                @Override // ai.u
                public final void a(boolean z11) {
                    s2 s2Var2 = s2.this;
                    android.support.v4.media.session.a0 a0Var = T;
                    if (s2Var2.d) {
                        s2Var2.a.getClass();
                        if (!z11) {
                            s2Var2.d = false;
                            return;
                        }
                        NativeInstance.setIncomingAudioCapture(true);
                        Thread thread = new Thread(new a1.e(18, s2Var2, a0Var), "LiveCaptions");
                        s2Var2.e = thread;
                        thread.start();
                    }
                }
            });
            return;
        }
        if (z10 || !this.p3.d) {
            return;
        }
        ai.s2 s2Var2 = this.p3;
        if (s2Var2.d) {
            s2Var2.d = false;
            Thread thread = s2Var2.e;
            if (thread != null) {
                thread.interrupt();
                s2Var2.e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        org.telegram.ui.Components.voip.s0 s0Var = this.o3;
        s0Var.getClass();
        ArrayList arrayList = new ArrayList(s0Var.a);
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) obj;
            s0Var.a.remove(r0Var);
            s0Var.removeView(r0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b7 A[LOOP:3: B:140:0x02b1->B:142:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5 A[LOOP:1: B:89:0x01a3->B:90:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z10) {
        n30 n30Var;
        z30 z30Var;
        b20 b20Var;
        n30 n30Var2;
        boolean z11;
        int i7;
        ArrayList arrayList;
        int i10;
        int size;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        n30 n30Var3;
        b20 b20Var2;
        boolean z12;
        x10 x10Var;
        ?? r02;
        ?? r82;
        org.telegram.messenger.t3 t3Var;
        boolean z13;
        org.telegram.messenger.u3 u3Var;
        org.telegram.messenger.u3 u3Var2;
        v4.f1 G;
        f fVar;
        int i14;
        f40 f40Var = this;
        z30 z30Var2 = f40Var.K1;
        b20 b20Var3 = f40Var.Z3;
        if (b20Var3 == null || (n30Var = f40Var.L1) == null || f40Var.V2 == null || f40Var.n2) {
            return;
        }
        if (b20Var3.b) {
            b20Var3.setVisibleParticipant(true);
        }
        long B1 = org.telegram.messenger.gj.B1(f40Var.V2.J);
        if (B1 != org.telegram.messenger.gj.B1(f40Var.v2) && f40Var.V2.d.f(B1) != null) {
            f40Var.v2 = f40Var.V2.J;
        }
        int childCount = n30Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = n30Var.getChildAt(i17);
            v4.f1 G2 = n30Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = f40Var.l2;
        arrayList3.clear();
        if (!F5) {
            arrayList3.addAll(f40Var.V2.f);
        } else if (b20Var3.b) {
            arrayList3.addAll(f40Var.V2.f);
            org.telegram.messenger.u3 u3Var3 = b20Var3.e;
            if (u3Var3 != null) {
                arrayList3.remove(u3Var3);
            }
        }
        if (n30Var.getItemAnimator() != null && !z10) {
            n30Var.setItemAnimator(null);
        } else if (n30Var.getItemAnimator() == null && z10) {
            n30Var.setItemAnimator(f40Var.S1);
        }
        try {
            fVar = new f(z30Var2, 18);
            try {
                try {
                    z11 = true;
                } catch (Exception e10) {
                    e = e10;
                    z30Var = z30Var2;
                    z11 = true;
                }
            } catch (Exception e11) {
                e = e11;
                z30Var = z30Var2;
                n30Var2 = n30Var;
                z11 = true;
                i7 = childCount;
                arrayList = arrayList3;
                i10 = i16;
                b20Var = b20Var3;
            }
        } catch (Exception e12) {
            e = e12;
            z30Var = z30Var2;
            b20Var = b20Var3;
            n30Var2 = n30Var;
            z11 = true;
            i7 = childCount;
            arrayList = arrayList3;
            i10 = i16;
        }
        try {
            try {
                try {
                    i14 = i16;
                    try {
                        b20Var = b20Var3;
                    } catch (Exception e13) {
                        e = e13;
                        b20Var = b20Var3;
                    }
                } catch (Exception e14) {
                    e = e14;
                    i10 = i16;
                    b20Var = b20Var3;
                    n30Var2 = n30Var;
                    i7 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e15) {
                e = e15;
                z30Var = z30Var2;
                arrayList = arrayList3;
                i10 = i16;
                b20Var = b20Var3;
                n30Var2 = n30Var;
                i7 = childCount;
            }
        } catch (Exception e16) {
            e = e16;
            z30Var = z30Var2;
            i7 = childCount;
            arrayList = arrayList3;
            i10 = i16;
            b20Var = b20Var3;
            n30Var2 = n30Var;
            org.telegram.messenger.a8.g(e, z11);
            z30Var.f();
            ArrayList arrayList4 = f40Var.V2.e;
            size = arrayList4.size();
            while (i11 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList5 = f40Var.y2;
            arrayList5.clear();
            arrayList5.addAll(f40Var.V2.g);
            ArrayList arrayList6 = f40Var.z2;
            arrayList6.clear();
            arrayList2 = arrayList;
            arrayList6.addAll(arrayList2);
            ArrayList arrayList7 = f40Var.A2;
            arrayList7.clear();
            arrayList7.addAll(f40Var.V2.j);
            ArrayList arrayList8 = f40Var.B2;
            arrayList8.clear();
            arrayList8.addAll(f40Var.V2.m);
            ArrayList arrayList9 = f40Var.C2;
            arrayList9.clear();
            arrayList9.addAll(f40Var.V2.l);
            z30 z30Var3 = z30Var;
            f40Var.D2 = z30Var3.G;
            i12 = i7;
            i13 = 0;
            while (i13 < i12) {
            }
            n30Var3 = n30Var2;
            boolean c10 = b20Var.c();
            b20Var2 = b20Var;
            if (b20Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.v10 v10Var = f40Var.o4;
            x10Var = f40Var.l4;
            v10Var.G(x10Var, z11);
            if (x10Var.getVisibility() == 0) {
            }
            if (F5) {
            }
            if (n30Var3.getVisibility() == 0) {
            }
            r02 = f40Var.Y3;
            r02.clear();
            r02.addAll(f40Var.X3);
            while (r82 < r02.size()) {
            }
            t3Var = f40Var.V2;
            if (t3Var != null) {
            }
            org.telegram.messenger.t3 t3Var2 = f40Var.V2;
            if (t3Var2 != null) {
            }
            f40Var.B5.a(z13, z10);
            if (z13 == f40Var.H4) {
            }
        }
        try {
            n30Var2 = n30Var;
            try {
                try {
                    try {
                    } catch (Exception e17) {
                        e = e17;
                    }
                } catch (Exception e18) {
                    e = e18;
                    i7 = childCount;
                    arrayList = arrayList3;
                    i10 = i14;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i10 = i14;
                    i7 = childCount;
                    f40Var = this;
                    z30Var = z30Var2;
                    try {
                        f40Var.J1(z30Var2.L, z30Var2.x, z30Var2.d, z30Var2.e, z30Var2.f, z30Var2.h, z30Var2.n, z30Var2.r, z30Var2.s, z30Var2.w, z30Var2.H, z30Var2.I, z30Var2.J, z30Var2.K, z30Var2.y, z30Var2.E);
                        z30Var.E();
                        z11 = true;
                        try {
                            v4.o.c(f40Var.v5, true).b(fVar);
                        } catch (Exception e19) {
                            e = e19;
                            org.telegram.messenger.a8.g(e, z11);
                            z30Var.f();
                            ArrayList arrayList42 = f40Var.V2.e;
                            size = arrayList42.size();
                            while (i11 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList52 = f40Var.y2;
                            arrayList52.clear();
                            arrayList52.addAll(f40Var.V2.g);
                            ArrayList arrayList62 = f40Var.z2;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = f40Var.A2;
                            arrayList72.clear();
                            arrayList72.addAll(f40Var.V2.j);
                            ArrayList arrayList82 = f40Var.B2;
                            arrayList82.clear();
                            arrayList82.addAll(f40Var.V2.m);
                            ArrayList arrayList92 = f40Var.C2;
                            arrayList92.clear();
                            arrayList92.addAll(f40Var.V2.l);
                            z30 z30Var32 = z30Var;
                            f40Var.D2 = z30Var32.G;
                            i12 = i7;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            n30Var3 = n30Var2;
                            boolean c102 = b20Var.c();
                            b20Var2 = b20Var;
                            if (b20Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.v10 v10Var2 = f40Var.o4;
                                x10Var = f40Var.l4;
                                v10Var2.G(x10Var, z11);
                                if (x10Var.getVisibility() == 0) {
                                }
                                if (F5) {
                                }
                                if (n30Var3.getVisibility() == 0) {
                                }
                                r02 = f40Var.Y3;
                                r02.clear();
                                r02.addAll(f40Var.X3);
                                while (r82 < r02.size()) {
                                }
                                t3Var = f40Var.V2;
                                if (t3Var != null) {
                                }
                                org.telegram.messenger.t3 t3Var22 = f40Var.V2;
                                if (t3Var22 != null) {
                                }
                                f40Var.B5.a(z13, z10);
                                if (z13 == f40Var.H4) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.v10 v10Var22 = f40Var.o4;
                            x10Var = f40Var.l4;
                            v10Var22.G(x10Var, z11);
                            if (x10Var.getVisibility() == 0) {
                            }
                            if (F5) {
                            }
                            if (n30Var3.getVisibility() == 0) {
                            }
                            r02 = f40Var.Y3;
                            r02.clear();
                            r02.addAll(f40Var.X3);
                            while (r82 < r02.size()) {
                            }
                            t3Var = f40Var.V2;
                            if (t3Var != null) {
                            }
                            org.telegram.messenger.t3 t3Var222 = f40Var.V2;
                            if (t3Var222 != null) {
                            }
                            f40Var.B5.a(z13, z10);
                            if (z13 == f40Var.H4) {
                            }
                        }
                    } catch (Exception e20) {
                        e = e20;
                        z11 = true;
                    }
                } catch (Exception e21) {
                    e = e21;
                    f40Var = this;
                    arrayList = arrayList3;
                    i10 = i14;
                    z11 = true;
                    i7 = childCount;
                    z30Var = z30Var2;
                    org.telegram.messenger.a8.g(e, z11);
                    z30Var.f();
                    ArrayList arrayList422 = f40Var.V2.e;
                    size = arrayList422.size();
                    while (i11 < size) {
                    }
                    if (view != null) {
                    }
                    ArrayList arrayList522 = f40Var.y2;
                    arrayList522.clear();
                    arrayList522.addAll(f40Var.V2.g);
                    ArrayList arrayList622 = f40Var.z2;
                    arrayList622.clear();
                    arrayList2 = arrayList;
                    arrayList622.addAll(arrayList2);
                    ArrayList arrayList722 = f40Var.A2;
                    arrayList722.clear();
                    arrayList722.addAll(f40Var.V2.j);
                    ArrayList arrayList822 = f40Var.B2;
                    arrayList822.clear();
                    arrayList822.addAll(f40Var.V2.m);
                    ArrayList arrayList922 = f40Var.C2;
                    arrayList922.clear();
                    arrayList922.addAll(f40Var.V2.l);
                    z30 z30Var322 = z30Var;
                    f40Var.D2 = z30Var322.G;
                    i12 = i7;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    n30Var3 = n30Var2;
                    boolean c1022 = b20Var.c();
                    b20Var2 = b20Var;
                    if (b20Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.v10 v10Var222 = f40Var.o4;
                    x10Var = f40Var.l4;
                    v10Var222.G(x10Var, z11);
                    if (x10Var.getVisibility() == 0) {
                    }
                    if (F5) {
                    }
                    if (n30Var3.getVisibility() == 0) {
                    }
                    r02 = f40Var.Y3;
                    r02.clear();
                    r02.addAll(f40Var.X3);
                    while (r82 < r02.size()) {
                    }
                    t3Var = f40Var.V2;
                    if (t3Var != null) {
                    }
                    org.telegram.messenger.t3 t3Var2222 = f40Var.V2;
                    if (t3Var2222 != null) {
                    }
                    f40Var.B5.a(z13, z10);
                    if (z13 == f40Var.H4) {
                    }
                }
            } catch (Exception e22) {
                e = e22;
                i7 = childCount;
                arrayList = arrayList3;
                i10 = i14;
                z30Var = z30Var2;
                org.telegram.messenger.a8.g(e, z11);
                z30Var.f();
                ArrayList arrayList4222 = f40Var.V2.e;
                size = arrayList4222.size();
                while (i11 < size) {
                }
                if (view != null) {
                }
                ArrayList arrayList5222 = f40Var.y2;
                arrayList5222.clear();
                arrayList5222.addAll(f40Var.V2.g);
                ArrayList arrayList6222 = f40Var.z2;
                arrayList6222.clear();
                arrayList2 = arrayList;
                arrayList6222.addAll(arrayList2);
                ArrayList arrayList7222 = f40Var.A2;
                arrayList7222.clear();
                arrayList7222.addAll(f40Var.V2.j);
                ArrayList arrayList8222 = f40Var.B2;
                arrayList8222.clear();
                arrayList8222.addAll(f40Var.V2.m);
                ArrayList arrayList9222 = f40Var.C2;
                arrayList9222.clear();
                arrayList9222.addAll(f40Var.V2.l);
                z30 z30Var3222 = z30Var;
                f40Var.D2 = z30Var3222.G;
                i12 = i7;
                i13 = 0;
                while (i13 < i12) {
                }
                n30Var3 = n30Var2;
                boolean c10222 = b20Var.c();
                b20Var2 = b20Var;
                if (b20Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.v10 v10Var2222 = f40Var.o4;
                x10Var = f40Var.l4;
                v10Var2222.G(x10Var, z11);
                if (x10Var.getVisibility() == 0) {
                }
                if (F5) {
                }
                if (n30Var3.getVisibility() == 0) {
                }
                r02 = f40Var.Y3;
                r02.clear();
                r02.addAll(f40Var.X3);
                while (r82 < r02.size()) {
                }
                t3Var = f40Var.V2;
                if (t3Var != null) {
                }
                org.telegram.messenger.t3 t3Var22222 = f40Var.V2;
                if (t3Var22222 != null) {
                }
                f40Var.B5.a(z13, z10);
                if (z13 == f40Var.H4) {
                }
            }
        } catch (Exception e23) {
            e = e23;
            n30Var2 = n30Var;
            i7 = childCount;
            arrayList = arrayList3;
            i10 = i14;
            z30Var = z30Var2;
            org.telegram.messenger.a8.g(e, z11);
            z30Var.f();
            ArrayList arrayList42222 = f40Var.V2.e;
            size = arrayList42222.size();
            while (i11 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = f40Var.y2;
            arrayList52222.clear();
            arrayList52222.addAll(f40Var.V2.g);
            ArrayList arrayList62222 = f40Var.z2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = f40Var.A2;
            arrayList72222.clear();
            arrayList72222.addAll(f40Var.V2.j);
            ArrayList arrayList82222 = f40Var.B2;
            arrayList82222.clear();
            arrayList82222.addAll(f40Var.V2.m);
            ArrayList arrayList92222 = f40Var.C2;
            arrayList92222.clear();
            arrayList92222.addAll(f40Var.V2.l);
            z30 z30Var32222 = z30Var;
            f40Var.D2 = z30Var32222.G;
            i12 = i7;
            i13 = 0;
            while (i13 < i12) {
            }
            n30Var3 = n30Var2;
            boolean c102222 = b20Var.c();
            b20Var2 = b20Var;
            if (b20Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.v10 v10Var22222 = f40Var.o4;
            x10Var = f40Var.l4;
            v10Var22222.G(x10Var, z11);
            if (x10Var.getVisibility() == 0) {
            }
            if (F5) {
            }
            if (n30Var3.getVisibility() == 0) {
            }
            r02 = f40Var.Y3;
            r02.clear();
            r02.addAll(f40Var.X3);
            while (r82 < r02.size()) {
            }
            t3Var = f40Var.V2;
            if (t3Var != null) {
            }
            org.telegram.messenger.t3 t3Var222222 = f40Var.V2;
            if (t3Var222222 != null) {
            }
            f40Var.B5.a(z13, z10);
            if (z13 == f40Var.H4) {
            }
        }
        ArrayList arrayList422222 = f40Var.V2.e;
        size = arrayList422222.size();
        for (i11 = 0; i11 < size; i11++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i11)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            f40Var.T1.h1(i10, view.getTop() - n30Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = f40Var.y2;
        arrayList522222.clear();
        arrayList522222.addAll(f40Var.V2.g);
        ArrayList arrayList622222 = f40Var.z2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = f40Var.A2;
        arrayList722222.clear();
        arrayList722222.addAll(f40Var.V2.j);
        ArrayList arrayList822222 = f40Var.B2;
        arrayList822222.clear();
        arrayList822222.addAll(f40Var.V2.m);
        ArrayList arrayList922222 = f40Var.C2;
        arrayList922222.clear();
        arrayList922222.addAll(f40Var.V2.l);
        z30 z30Var322222 = z30Var;
        f40Var.D2 = z30Var322222.G;
        i12 = i7;
        i13 = 0;
        while (i13 < i12) {
            n30 n30Var4 = n30Var2;
            View childAt2 = n30Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.g4) || (childAt2 instanceof org.telegram.ui.Cells.z3)) && (G = n30Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt2).setDrawDivider(G.b() != z30Var322222.G + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.z3) childAt2).setDrawDivider(G.b() != z30Var322222.G + (-2) ? z11 : false);
                }
            }
            i13++;
            n30Var2 = n30Var4;
        }
        n30Var3 = n30Var2;
        boolean c1022222 = b20Var.c();
        b20Var2 = b20Var;
        if (b20Var2.b && (u3Var2 = b20Var2.e) != null && !org.telegram.messenger.t3.C(u3Var2.a, u3Var2.b, f40Var.V2)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                f40Var.i1(null);
            } else if (c1022222) {
                z12 = false;
                f40Var.i1((org.telegram.messenger.u3) arrayList2.get(0));
            }
            org.telegram.ui.Components.v10 v10Var222222 = f40Var.o4;
            x10Var = f40Var.l4;
            v10Var222222.G(x10Var, z11);
            if (x10Var.getVisibility() == 0) {
                org.telegram.messenger.g0.Z3(x10Var);
            }
            if (F5) {
                f40Var.n4.I(f40Var.m4, z11);
            }
            if (n30Var3.getVisibility() == 0) {
                org.telegram.messenger.g0.Z3(n30Var3);
            }
            r02 = f40Var.Y3;
            r02.clear();
            r02.addAll(f40Var.X3);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.y) r02.get(r82)).j(z11);
            }
            t3Var = f40Var.V2;
            if (t3Var != null && b20Var2.b && (u3Var = b20Var2.e) != null) {
                t3Var.d.f(org.telegram.messenger.gj.B1(u3Var.a.peer));
            }
            org.telegram.messenger.t3 t3Var2222222 = f40Var.V2;
            z13 = (t3Var2222222 != null || t3Var2222222.f.isEmpty()) ? z12 : z11;
            f40Var.B5.a(z13, z10);
            if (z13 == f40Var.H4) {
                f40Var.H4 = z13;
                if (F5) {
                    f40Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.v10 v10Var2222222 = f40Var.o4;
        x10Var = f40Var.l4;
        v10Var2222222.G(x10Var, z11);
        if (x10Var.getVisibility() == 0) {
        }
        if (F5) {
        }
        if (n30Var3.getVisibility() == 0) {
        }
        r02 = f40Var.Y3;
        r02.clear();
        r02.addAll(f40Var.X3);
        while (r82 < r02.size()) {
        }
        t3Var = f40Var.V2;
        if (t3Var != null) {
            t3Var.d.f(org.telegram.messenger.gj.B1(u3Var.a.peer));
        }
        org.telegram.messenger.t3 t3Var22222222 = f40Var.V2;
        if (t3Var22222222 != null) {
        }
        f40Var.B5.a(z13, z10);
        if (z13 == f40Var.H4) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1.d == (r0 ? 1.0f : 0.0f)) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(boolean z10) {
        boolean a10 = ai.s2.a();
        org.telegram.ui.Components.voip.q0 q0Var = this.n3;
        if (q0Var.e == a10) {
            if (q0Var.f == null) {
            }
            this.m3.setSubtext(org.telegram.messenger.hd.N0(!a10 ? 2131745051 : 2131745052, null));
        }
        q0Var.e = a10;
        ValueAnimator valueAnimator = q0Var.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            q0Var.f = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q0Var.d, a10 ? 1.0f : 0.0f);
            q0Var.f = ofFloat;
            ofFloat.setDuration(a10 ? 420L : 340L);
            q0Var.f.setInterpolator(org.telegram.ui.Components.nr.h);
            q0Var.f.addUpdateListener(new hi.j3(q0Var, 18));
            q0Var.f.start();
        } else {
            q0Var.d = a10 ? 1.0f : 0.0f;
            q0Var.invalidateSelf();
        }
        this.m3.setSubtext(org.telegram.messenger.hd.N0(!a10 ? 2131745051 : 2131745052, null));
    }

    public final int S0() {
        n30 n30Var = this.L1;
        int childCount = n30Var.getChildCount();
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = n30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i7 = Math.min(i7, childAt.getTop());
            }
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(int i7, boolean z10) {
        boolean P;
        boolean P2;
        String N0;
        String str;
        boolean z11;
        boolean z12;
        boolean P3;
        boolean P4;
        int i10;
        e40[] e40VarArr;
        boolean z13;
        e40 e40Var;
        e40 e40Var2;
        boolean z14;
        boolean z15;
        b20 b20Var = this.Z3;
        boolean z16 = b20Var != null && b20Var.b && (org.telegram.messenger.g0.Q1() || E5 == u1());
        if (!v1() && this.E3 == i7 && z10) {
            return;
        }
        org.telegram.ui.Components.oh0 oh0Var = this.E2;
        if (i7 == 7) {
            str = org.telegram.messenger.hd.N0(2131743148, null);
            P4 = oh0Var.P(org.telegram.messenger.ls.g3);
        } else {
            if (i7 != 6) {
                if (i7 != 5) {
                    if (i7 == 0) {
                        String N02 = org.telegram.messenger.hd.N0(2131743072, null);
                        N0 = org.telegram.messenger.hd.N0(2131743056, null);
                        int i11 = this.E3;
                        if (i11 == 3) {
                            int i12 = oh0Var.f;
                            z11 = (i12 == 136 || i12 == 173 || i12 == 274 || i12 == 311) ? oh0Var.P(99) : false;
                        } else {
                            z11 = i11 == 5 ? oh0Var.P(404) : i11 == 7 ? oh0Var.P(376) : i11 == 6 ? oh0Var.P(org.telegram.messenger.ls.M3) : i11 == 2 ? oh0Var.P(36) : oh0Var.P(99);
                        }
                        str = N02;
                    } else if (i7 == 1) {
                        str = org.telegram.messenger.hd.N0(s1() ? 2131742987 : 2131742986, null);
                        P3 = oh0Var.P(this.E3 == 4 ? 99 : 69);
                    } else if (s1() && i7 == 2) {
                        str = org.telegram.messenger.hd.N0(2131743046, null);
                        z11 = oh0Var.P(99);
                        N0 = "";
                    } else {
                        if (i7 != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.v2));
                            boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || T0()) ? false : true;
                            if (z17) {
                                int i13 = this.E3;
                                if (i13 == 7) {
                                    P2 = oh0Var.P(org.telegram.messenger.ls.i5);
                                } else if (i13 == 6) {
                                    P2 = oh0Var.P(org.telegram.messenger.ls.x4);
                                } else if (i13 == 1) {
                                    P2 = oh0Var.P(org.telegram.messenger.ls.D2);
                                } else {
                                    P = oh0Var.P(org.telegram.messenger.ls.S1);
                                }
                                P = P2;
                            } else {
                                int i14 = this.E3;
                                if (i14 == 5) {
                                    P2 = oh0Var.P(404);
                                    P = P2;
                                } else if (i14 == 7) {
                                    P = oh0Var.P(376);
                                } else if (i14 == 6) {
                                    P = oh0Var.P(org.telegram.messenger.ls.M3);
                                } else if (i14 == 2 || i14 == 4) {
                                    P = oh0Var.P(36);
                                } else {
                                    P = oh0Var.P(99);
                                }
                            }
                            if (i7 == 3) {
                                str = org.telegram.messenger.hd.N0(2131751797, null);
                                z11 = P;
                                z12 = z17;
                                N0 = "";
                            } else {
                                String N03 = org.telegram.messenger.hd.N0(2131743046, null);
                                boolean z18 = z17;
                                N0 = org.telegram.messenger.hd.N0(2131743045, null);
                                str = N03;
                                z11 = P;
                                z12 = z18;
                            }
                            if (v1() && i7 != 3 && !this.V2.j()) {
                                str = org.telegram.messenger.hd.N0(!z16 ? 2131743115 : 2131743133, null);
                                boolean z19 = this.F3 == z16;
                                this.F3 = z16;
                                z11 = z19;
                                N0 = "";
                            }
                            String E = TextUtils.isEmpty(N0) ? a8.p0.E(str, " ", N0) : str;
                            org.telegram.ui.Components.voip.q2 q2Var = this.w1;
                            q2Var.setContentDescription(E);
                            q2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                            p10 p10Var = this.x1;
                            ImageView imageView = this.y1;
                            if (z10) {
                                this.E3 = i7;
                                oh0Var.N(oh0Var.f - 1, false, true);
                                if (!v1() || this.V2.j()) {
                                    imageView.setVisibility(8);
                                    p10Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((b20Var != null && b20Var.b && (org.telegram.messenger.g0.Q1() || E5 == u1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    p10Var.setVisibility(8);
                                }
                            } else {
                                if (z11) {
                                    if (i7 == 5) {
                                        oh0Var.M(376);
                                    } else if (i7 == 7) {
                                        oh0Var.M(org.telegram.messenger.ls.D2);
                                    } else if (i7 == 6) {
                                        oh0Var.M(org.telegram.messenger.ls.i5);
                                    } else if (i7 == 0) {
                                        int i15 = this.E3;
                                        if (i15 == 5) {
                                            oh0Var.M(376);
                                        } else if (i15 == 7) {
                                            oh0Var.M(org.telegram.messenger.ls.P5);
                                        } else if (i15 == 6) {
                                            oh0Var.M(org.telegram.messenger.ls.g3);
                                        } else if (i15 == 2) {
                                            oh0Var.M(0);
                                        } else {
                                            oh0Var.M(69);
                                        }
                                    } else if (i7 == 1 || (this.E3 == 2 && s1())) {
                                        oh0Var.M(this.E3 != 4 ? 36 : 69);
                                    } else if (i7 == 4) {
                                        oh0Var.M(99);
                                    } else if (z12) {
                                        int i16 = this.E3;
                                        if (i16 == 7) {
                                            oh0Var.M(org.telegram.messenger.ls.x4);
                                        } else if (i16 == 6) {
                                            oh0Var.M(org.telegram.messenger.ls.M3);
                                        } else if (i16 == 1) {
                                            oh0Var.M(org.telegram.messenger.ls.S1);
                                        } else {
                                            oh0Var.M(99);
                                        }
                                    } else {
                                        int i17 = this.E3;
                                        if (i17 == 5) {
                                            oh0Var.M(376);
                                        } else if (i17 == 7) {
                                            oh0Var.M(org.telegram.messenger.ls.P5);
                                        } else if (i17 == 6) {
                                            oh0Var.M(org.telegram.messenger.ls.g3);
                                        } else if (i17 == 2 || i17 == 4) {
                                            oh0Var.M(0);
                                        } else {
                                            oh0Var.M(69);
                                        }
                                    }
                                }
                                p10Var.d();
                                if (!v1() || this.V2.j()) {
                                    imageView.setVisibility(8);
                                    p10Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((b20Var != null && b20Var.b && (org.telegram.messenger.g0.Q1() || E5 == u1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    p10Var.setVisibility(8);
                                }
                                this.E3 = i7;
                            }
                            q2Var.invalidate();
                            i10 = this.E3;
                            e40VarArr = this.J3;
                            if (e40VarArr[i10] == null) {
                                e40VarArr[i10] = new e40(i10);
                                int i18 = this.E3;
                                if (i18 == 3) {
                                    e40VarArr[i18].g = null;
                                } else if (t1(i18)) {
                                    e40VarArr[this.E3].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bi, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    int i19 = this.E3;
                                    if (i19 != 1) {
                                        z13 = false;
                                        e40VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                        e40Var = e40VarArr[this.E3];
                                        e40Var2 = this.M3;
                                        if (e40Var != e40Var2) {
                                            this.L3 = e40Var2;
                                            this.M3 = e40Var;
                                            if (e40Var2 == null || !z10) {
                                                this.K3 = 1.0f;
                                                this.L3 = null;
                                            } else {
                                                this.K3 = 0.0f;
                                            }
                                        }
                                        if (!z10) {
                                            e40 e40Var3 = this.M3;
                                            if (e40Var3 != null) {
                                                int i20 = e40Var3.i;
                                                z15 = true;
                                                z14 = (i20 == 1 || i20 == 0) ? true : z13;
                                                if (i20 == 3) {
                                                    z15 = z13;
                                                }
                                            } else {
                                                z14 = z13;
                                                z15 = z14;
                                            }
                                            this.O3 = z14 ? 1.0f : 0.0f;
                                            this.P3 = z15 ? 1.0f : 0.0f;
                                        }
                                        this.p1.invalidate();
                                    }
                                    e40VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                            }
                            z13 = false;
                            e40Var = e40VarArr[this.E3];
                            e40Var2 = this.M3;
                            if (e40Var != e40Var2) {
                            }
                            if (!z10) {
                            }
                            this.p1.invalidate();
                        }
                        str = org.telegram.messenger.hd.N0(2131743042, null);
                        String N04 = org.telegram.messenger.hd.N0(2131743043, null);
                        z11 = oh0Var.P(org.telegram.messenger.ls.S1);
                        N0 = N04;
                    }
                    z12 = false;
                    if (v1()) {
                        str = org.telegram.messenger.hd.N0(!z16 ? 2131743115 : 2131743133, null);
                        if (this.F3 == z16) {
                        }
                        this.F3 = z16;
                        z11 = z19;
                        N0 = "";
                    }
                    if (TextUtils.isEmpty(N0)) {
                    }
                    org.telegram.ui.Components.voip.q2 q2Var2 = this.w1;
                    q2Var2.setContentDescription(E);
                    q2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                    p10 p10Var2 = this.x1;
                    ImageView imageView2 = this.y1;
                    if (z10) {
                    }
                    q2Var2.invalidate();
                    i10 = this.E3;
                    e40VarArr = this.J3;
                    if (e40VarArr[i10] == null) {
                    }
                    z13 = false;
                    e40Var = e40VarArr[this.E3];
                    e40Var2 = this.M3;
                    if (e40Var != e40Var2) {
                    }
                    if (!z10) {
                    }
                    this.p1.invalidate();
                }
                str = org.telegram.messenger.hd.N0(2131743085, null);
                P3 = oh0Var.P(377);
                z11 = P3;
                N0 = "";
                z12 = false;
                if (v1()) {
                }
                if (TextUtils.isEmpty(N0)) {
                }
                org.telegram.ui.Components.voip.q2 q2Var22 = this.w1;
                q2Var22.setContentDescription(E);
                q2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                p10 p10Var22 = this.x1;
                ImageView imageView22 = this.y1;
                if (z10) {
                }
                q2Var22.invalidate();
                i10 = this.E3;
                e40VarArr = this.J3;
                if (e40VarArr[i10] == null) {
                }
                z13 = false;
                e40Var = e40VarArr[this.E3];
                e40Var2 = this.M3;
                if (e40Var != e40Var2) {
                }
                if (!z10) {
                }
                this.p1.invalidate();
            }
            str = org.telegram.messenger.hd.N0(2131743093, null);
            P4 = oh0Var.P(org.telegram.messenger.ls.P5);
        }
        N0 = "";
        z11 = P4;
        z12 = false;
        if (v1()) {
        }
        if (TextUtils.isEmpty(N0)) {
        }
        org.telegram.ui.Components.voip.q2 q2Var222 = this.w1;
        q2Var222.setContentDescription(E);
        q2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
        p10 p10Var222 = this.x1;
        ImageView imageView222 = this.y1;
        if (z10) {
        }
        q2Var222.invalidate();
        i10 = this.E3;
        e40VarArr = this.J3;
        if (e40VarArr[i10] == null) {
        }
        z13 = false;
        e40Var = e40VarArr[this.E3];
        e40Var2 = this.M3;
        if (e40Var != e40Var2) {
        }
        if (!z10) {
        }
        this.p1.invalidate();
    }

    public final boolean T0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return org.telegram.messenger.v3.w(14, this.U2);
        }
        org.telegram.messenger.t3 t3Var = this.V2;
        return (t3Var == null || (groupCall = t3Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void T1() {
        if (this.V2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.o1.a).getCurrentTime();
        org.telegram.messenger.t3 t3Var = this.V2;
        int i7 = currentTime - t3Var.b.record_start_date;
        boolean z10 = t3Var.w;
        org.telegram.ui.ActionBar.y0 y0Var = this.r3;
        if (z10) {
            y0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            y0Var.setSubtext(null);
        }
    }

    public final void U0() {
        if (this.Q3) {
            this.Q3 = false;
            org.telegram.messenger.g0.r(this.x4);
        }
        if (this.R3) {
            this.R3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.w1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void U1(boolean z10) {
        float interpolation;
        float f10;
        t20 t20Var = this.M1;
        if ((t20Var == null || this.V2 != null) && this.S2 == null) {
            this.R2 = 1.0f;
            this.Q2 = 1.0f;
            if (t20Var == null) {
                return;
            }
        }
        if (!z10) {
            s10 s10Var = this.v4;
            org.telegram.messenger.g0.r(s10Var);
            s10Var.run();
            org.telegram.messenger.t3 t3Var = this.V2;
            n30 n30Var = this.L1;
            if (t3Var == null || t3Var.j()) {
                n30Var.setVisibility(4);
            } else {
                n30Var.setVisibility(0);
            }
            boolean W = org.telegram.messenger.v3.W(this.U2);
            org.telegram.ui.ActionBar.y0 y0Var = this.v3;
            if (W) {
                y0Var.setText(org.telegram.messenger.hd.N0(2131743243, null));
            } else {
                y0Var.setText(org.telegram.messenger.hd.N0(2131743150, null));
            }
        }
        float f11 = this.Q2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.nr.f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.R2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
            this.R2 = nrVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * nrVar.getInterpolation(this.Q2 / 0.6f);
            f10 = this.Q2 / 0.6f;
        }
        O1(true);
        float f12 = 1.0f - f10;
        t20Var.setAlpha(f12);
        this.P1.setAlpha(f10);
        this.R1.setAlpha(f10);
        m30 m30Var = this.Q1;
        m30Var.setAlpha(f10);
        m30Var.setScaleX(interpolation);
        m30Var.setScaleY(interpolation);
        r20 r20Var = this.O1;
        r20Var.setScaleX(f12);
        r20Var.setScaleY(f12);
        r20Var.setAlpha(f12);
        this.N1.setAlpha(f12);
        this.f3.setAlpha(f10);
        int i7 = f12 != 0.0f ? 0 : 4;
        if (i7 != t20Var.getVisibility()) {
            t20Var.setVisibility(i7);
            r20Var.setVisibility(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0() {
        boolean z10;
        if (!this.b5) {
            g20 g20Var = this.a4;
            if (g20Var.getVisibility() == 0 && g20Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.k4 == z10) {
                    this.k4 = z10;
                    this.p1.invalidate();
                    this.b.invalidate();
                    this.L1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.k4 == z10) {
        }
    }

    public final void V1(boolean z10) {
        org.telegram.ui.Components.voip.q2 q2Var = this.t1;
        if (q2Var == null || q2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        o10 o10Var = this.p1;
        if (sharedInstance == null || v1()) {
            q2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, org.telegram.messenger.hd.N0(2131743192, null), false, z10);
            boolean z11 = org.telegram.messenger.v3.t0(this.U2) || (org.telegram.messenger.v3.N(this.U2) && org.telegram.messenger.v3.w(3, this.U2));
            mh.a aVar = (mh.a) o10Var.c.get(q2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                q2Var.setEnabled(z11);
            }
            q2Var.b(true, false);
            return;
        }
        mh.a aVar2 = (mh.a) o10Var.c.get(q2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            q2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            q2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.hd.N0(2131743258, null), false, z10);
        } else if (z13) {
            q2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.hd.N0(2131742994, null), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            q2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.hd.N0(2131743256, null), false, z10);
        } else {
            q2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.hd.N0(2131742994, null), false, z10);
        }
        q2Var.b(z13, z10);
        l1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i7 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.V1 != i7) {
            this.V1 = i7;
            org.telegram.messenger.g0.P3(this.W1, i7);
        }
        org.telegram.ui.Components.voip.q2 q2Var2 = this.r1;
        if (q2Var2.getVisibility() == 0) {
            q2Var2.c(0, -1, 0, 1.0f, true, j1(l1()), false, z10);
            q2Var2.b(l1() != 1, z10);
        }
    }

    public final void W0() {
        this.A1.setTranslationY((-this.B3.d()) + this.b.getPaddingBottom());
        this.B1.invalidate();
        c1();
        b1();
        Z0();
        a1();
        d1();
        this.p1.setAlpha(1.0f - this.y5.e);
        X0();
        Y0();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
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
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W1(boolean z10, boolean z11) {
        long j3;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        int i11;
        boolean z18;
        org.telegram.ui.Components.voip.q2 q2Var;
        org.telegram.ui.Components.voip.q2 q2Var2;
        org.telegram.ui.Components.voip.q2 q2Var3;
        boolean z19;
        boolean v12;
        int i12;
        org.telegram.messenger.t3 t3Var = this.V2;
        org.telegram.ui.Components.voip.q2 q2Var4 = this.u1;
        int i13 = 6;
        if (t3Var == null || t3Var.j()) {
            if (T0()) {
                i13 = 5;
            } else if (this.V2.b.schedule_start_subscribed) {
                i13 = 7;
            }
            S1(i13, z10);
            q2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.uh, false), 0.3f, false, org.telegram.messenger.hd.N0(2131752029, null), false, false);
            U1(false);
            return;
        }
        O1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j3 = 0;
        } else {
            j3 = 0;
            if ((this.o2 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.o2) > 3000) && ((i12 = this.S3) == 1 || i12 == 2 || i12 == 6 || i12 == 5)) {
                U0();
                S1(3, z10);
                i7 = 4;
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.v2));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !T0();
                if (!((z13 && this.V2.c()) || z12) || v1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z15 = false;
                    z14 = true;
                }
                if (z12) {
                    z16 = !z13;
                    i10 = 0;
                } else {
                    z16 = false;
                    i10 = 1;
                }
                if (E5) {
                    z17 = z16;
                    i11 = i10;
                } else {
                    z17 = false;
                    i11 = 0;
                }
                int i14 = i11 + (!z15 ? 2 : 0) + (!z14 ? i7 : 0);
                b20 b20Var = this.Z3;
                int i15 = i14 + ((b20Var == null && b20Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.j2 | 2) == (i15 | 2);
                this.j2 = i15;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.q2 q2Var5 = this.s1;
                if (z14) {
                    q2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.hd.N0(2131743244, null), !z20, z10);
                    q2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.q2 q2Var6 = this.q1;
                if (i11 != 0) {
                    q2Var6.c(0, -1, 0, 1.0f, true, org.telegram.messenger.hd.N0(2131743161, null), false, false);
                    q2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.q2 q2Var7 = this.r1;
                if (z17) {
                    q2Var = q2Var6;
                    q2Var2 = q2Var5;
                    q2Var3 = q2Var7;
                    z19 = z10;
                } else {
                    l1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i16 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.V1 != i16) {
                        this.V1 = i16;
                        org.telegram.messenger.g0.P3(this.W1, i16);
                    }
                    q2Var2 = q2Var5;
                    q2Var = q2Var6;
                    q2Var7.c(0, -1, 0, 1.0f, true, j1(l1()), false, z10);
                    q2Var3 = q2Var7;
                    z19 = z10;
                    q2Var3.b(l1() != 1, z19);
                }
                org.telegram.ui.Components.voip.q2 q2Var8 = q2Var3;
                q2Var4.c(!v1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.uh, false), 0.3f, false, org.telegram.messenger.hd.N0(2131743119, null), false, false);
                if (z18 && z15) {
                    V1(false);
                }
                q2Var2.d(true, z19);
                q2Var.d(true, z19);
                q2Var8.d(true, z19);
                v12 = v1();
                v10 v10Var = this.a3;
                if (v12) {
                    v10Var.setVisibility(8);
                } else {
                    v10Var.setVisibility(0);
                    boolean z21 = ((Integer) v10Var.getTag()).intValue() == 3;
                    int i17 = this.S3;
                    final boolean z22 = i17 == 3;
                    v10Var.setTag(Integer.valueOf(i17));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.c3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.b3;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i18 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.c3 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.x00
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int S0 = org.telegram.messenger.g0.S0(floatValue, 1.0f, color, i18);
                                    f40 f40Var = f40.this;
                                    f40Var.b3.setColor(S0);
                                    f40Var.a3.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    f40Var.d3 = floatValue;
                                    u30 u30Var = f40Var.P2;
                                    if (u30Var == null || !f40Var.y4) {
                                        return;
                                    }
                                    u30Var.invalidate();
                                }
                            });
                            this.c3.setDuration(300L);
                            this.c3.setInterpolator(org.telegram.ui.Components.nr.f);
                            this.c3.addListener(new a30(this, 2));
                            this.c3.start();
                        } else {
                            paint.setColor(this.S3 == 3 ? -1163700 : -12761513);
                            v10Var.invalidate();
                        }
                    }
                }
                if (v1() || !org.telegram.messenger.qc.e(512)) {
                }
                if (this.S3 == 3) {
                    this.y4 = true;
                    F1();
                    return;
                } else {
                    this.y4 = false;
                    org.telegram.messenger.g0.r(this.z4);
                    return;
                }
            }
        }
        if (this.w2 != null) {
            o1().k(0L, 37, this.w2, this.U2, null, null);
            this.w2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.v2));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || T0()) {
            i7 = 4;
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                U0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                S1(0, z10);
            } else {
                S1(1, z10);
            }
        } else {
            U0();
            if (groupCallParticipant2.raise_hand_rating != j3) {
                i7 = 4;
                S1(4, z10);
            } else {
                i7 = 4;
                S1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.v2));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (E5) {
        }
        int i142 = i11 + (!z15 ? 2 : 0) + (!z14 ? i7 : 0);
        b20 b20Var2 = this.Z3;
        int i152 = i142 + ((b20Var2 == null && b20Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.j2 | 2) == (i152 | 2)) {
        }
        this.j2 = i152;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.q2 q2Var52 = this.s1;
        if (z14) {
        }
        org.telegram.ui.Components.voip.q2 q2Var62 = this.q1;
        if (i11 != 0) {
        }
        org.telegram.ui.Components.voip.q2 q2Var72 = this.r1;
        if (z17) {
        }
        org.telegram.ui.Components.voip.q2 q2Var82 = q2Var3;
        q2Var4.c(!v1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.uh, false), 0.3f, false, org.telegram.messenger.hd.N0(2131743119, null), false, false);
        if (z18) {
            V1(false);
        }
        q2Var2.d(true, z19);
        q2Var.d(true, z19);
        q2Var82.d(true, z19);
        v12 = v1();
        v10 v10Var2 = this.a3;
        if (v12) {
        }
        if (v1()) {
        }
    }

    public final void X0() {
        float f10 = this.B3.b.a;
        int i7 = f10 > 0.0f ? 0 : 8;
        o20 o20Var = this.A1;
        o20Var.setAlpha(f10);
        m20 m20Var = this.B1;
        m20Var.setAlpha(f10);
        if (o20Var.getVisibility() != i7) {
            o20Var.setVisibility(i7);
            m20Var.setVisibility(i7);
            if (i7 == 8) {
                k20 k20Var = this.C1;
                if (k20Var.isFocused()) {
                    k20Var.clearFocus();
                }
            }
        }
    }

    public final void X1() {
        boolean z10;
        d40 d40Var;
        d30 d30Var = this.J1;
        if (d30Var == null || this.V2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i7 = 0;
        for (int i10 = 0; i10 < this.V2.P.m(); i10++) {
            long j3 = this.V2.P.j(i10);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.P.f(j3);
            if (!groupCallParticipant.self) {
                b20 b20Var = this.Z3;
                b20Var.getClass();
                if (b20Var.x.get(org.telegram.messenger.gj.B1(groupCallParticipant.peer)) <= 0 && this.A4.get(j3, 0) != 1) {
                    long B1 = org.telegram.messenger.gj.B1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i7 < 2) {
                        TLRPC.User c22 = B1 > 0 ? org.telegram.messenger.np.u1(this.a).c2(Long.valueOf(B1)) : null;
                        TLRPC.Chat O0 = B1 <= 0 ? org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(B1)) : null;
                        if (c22 != null || O0 != null) {
                            if (i7 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (c22 != null) {
                                spannableStringBuilder.append(org.telegram.messenger.p10.k(c22, true), new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0);
                            } else {
                                spannableStringBuilder.append(O0.title, new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0);
                            }
                        }
                    }
                    i7++;
                    if (i7 == 2) {
                        break;
                    }
                }
            }
        }
        if (i7 > 0) {
            String K0 = org.telegram.messenger.hd.K0(i7, "MembersAreSpeakingToast");
            int indexOf = K0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            d30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.m5 subtitleTextView = d30Var.getSubtitleTextView();
        String str = v1() ? "ViewersWatching" : "Participants";
        int i11 = this.V2.b.participants_count;
        z30 z30Var = this.K1;
        subtitleTextView.k(org.telegram.messenger.hd.G(i11 + ((z30Var.N.v1() || z30Var.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), str, new Object[0]));
        if (v1() && (d40Var = this.A3) != null) {
            d40Var.setWatchersCount(this.V2.b.participants_count);
        }
        if (z10 != this.t4) {
            this.t4 = z10;
            d30Var.invalidate();
            d30Var.getSubtitleTextView().setPivotX(0.0f);
            d30Var.getSubtitleTextView().setPivotY(d30Var.getMeasuredHeight() >> 1);
            d30Var.getSubtitleTextView().animate().scaleX(this.t4 ? 0.98f : 1.0f).scaleY(this.t4 ? 0.9f : 1.0f).alpha(this.t4 ? 0.0f : 1.0f).setDuration(150L);
            org.telegram.messenger.g0.V3(d30Var.getAdditionalSubtitleTextView(), this.t4);
        }
    }

    public final void Y0() {
        org.telegram.ui.Components.xi0 xi0Var = this.F1;
        if (xi0Var != null) {
            float f10 = this.B3.b.a * this.z5.e;
            xi0Var.setAlpha(f10);
            int i7 = f10 > 0.0f ? 0 : 8;
            if (this.F1.getVisibility() != i7) {
                this.F1.setVisibility(i7);
                if (i7 == 8) {
                    this.F1.n();
                }
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.F1;
            if (xi0Var2.O0 || f10 != 1.0f) {
                return;
            }
            xi0Var2.O0 = true;
        }
    }

    public final void Y1(boolean z10) {
        org.telegram.messenger.t3 t3Var = this.V2;
        t10 t10Var = this.Z2;
        if (t3Var == null) {
            if (org.telegram.messenger.v3.W(this.U2)) {
                t10Var.b(org.telegram.messenger.hd.N0(2131743217, null), z10);
                return;
            } else {
                t10Var.b(org.telegram.messenger.hd.N0(2131743096, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(t3Var.b.title);
        d30 d30Var = this.J1;
        if (isEmpty) {
            TLRPC.Chat chat = this.U2;
            if (chat != null && !chat.title.equals(d30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.U2.title, true, 180L, null);
                    d30Var.getTitleTextView().setOnClickListener(new t00(this, 9));
                } else {
                    d30Var.setTitle(this.U2.title);
                }
                if (!org.telegram.messenger.v3.W(this.U2)) {
                    t10Var.b(org.telegram.messenger.hd.N0(2131743061, null), z10);
                } else if (v1()) {
                    t10Var.b(this.U2.title, z10);
                } else {
                    t10Var.b(org.telegram.messenger.hd.N0(2131743202, null), z10);
                }
            } else if (this.U2 == null) {
                d30Var.setTitle(org.telegram.messenger.hd.N0(2131751811, null));
                t10Var.b(org.telegram.messenger.hd.N0(2131751811, null), z10);
            }
        } else if (!this.V2.b.title.equals(d30Var.getTitle())) {
            if (z10) {
                this.J1.N(this.V2.b.title, true, 180L, null);
                d30Var.getTitleTextView().setOnClickListener(new t00(this, 8));
            } else {
                d30Var.setTitle(this.V2.b.title);
            }
            t10Var.b(this.V2.b.title, z10);
        }
        org.telegram.ui.ActionBar.m5 titleTextView = d30Var.getTitleTextView();
        if (!this.V2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                t10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                t10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new b40(titleTextView));
            TextView textView = t10Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(textView), (Drawable) null);
            TextView nextTextView = t10Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(nextTextView), (Drawable) null);
        }
    }

    public final void Z0() {
        boolean z10 = F5;
        o10 o10Var = this.p1;
        if (z10) {
            o10Var.setTranslationX(0.0f);
            o10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.y5;
        if (z11) {
            o10Var.setTranslationX(aVar.e * org.telegram.messenger.g0.L(94.0f));
            o10Var.setTranslationY(0.0f);
        } else {
            o10Var.setTranslationX(0.0f);
            o10Var.setTranslationY(aVar.e * org.telegram.messenger.g0.L(94.0f));
        }
    }

    public final void Z1() {
        float f10;
        org.telegram.ui.Components.lb lbVar;
        if (this.F == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.t2 - L;
        if (this.t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.t0) / ((L - this.t0) - org.telegram.messenger.g0.L(14.0f)));
            f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r0) * f10);
        } else {
            f10 = 0.0f;
        }
        this.F.setTranslationY(org.telegram.messenger.g0.T1(((-r0.getTop()) - this.F.getHeight()) + f11 + this.b.getPaddingTop() + org.telegram.messenger.g0.L(10.0f), this.J1.getY() + (-this.F.getTop()) + r4.getHeight(), f10));
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar == null || (lbVar = gcVar.e) == null || lbVar.getParent() == null || lbVar.getParent().getParent() != this.F) {
            return;
        }
        lbVar.setTop(f10 > 0.5f);
    }

    public final void a1() {
        boolean z10 = F5;
        x10 x10Var = this.l4;
        if (z10) {
            x10Var.setTranslationX(0.0f);
            x10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.y5;
        if (z11) {
            x10Var.setTranslationX(aVar.e * org.telegram.messenger.g0.L(94.0f));
            x10Var.setTranslationY(0.0f);
        } else {
            x10Var.setTranslationX(0.0f);
            x10Var.setTranslationY(aVar.e * org.telegram.messenger.g0.L(94.0f));
        }
    }

    public final void b1() {
        float f10 = this.A5.f;
        rh.h hVar = this.B3;
        float T1 = org.telegram.messenger.g0.T1(F5 ? (1.0f - this.B5.e) * org.telegram.messenger.g0.L(-91.0f) : E5 ? 0.0f : ((this.y5.e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.Z3.c)) - org.telegram.messenger.g0.L(91.0f), -((hVar.d() - this.b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.z5.e) + org.telegram.messenger.g0.L(10.0f)), hVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.t2) + T1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        org.telegram.ui.Components.voip.s0 s0Var = this.o3;
        int contentHeight = s0Var != null ? s0Var.getContentHeight() : 0;
        if (s0Var != null) {
            s0Var.setTranslationY(T1);
        }
        float f11 = contentHeight;
        nh.h hVar2 = this.X1;
        hVar2.setTranslationY(T1 - f11);
        hVar2.setVisibleHeight((int) Math.max(0.0f, max - f11));
    }

    public final void c1() {
        if (this.F1 != null) {
            this.F1.setTranslationY((-this.B3.d()) + this.b.getPaddingBottom() + ((-this.z5.e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void d1() {
        float f10 = this.z5.e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.E1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        imageView.setClickable(f10 > 0.9f);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.D1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        imageView2.setClickable(f11 > 0.9f);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String N0;
        org.telegram.messenger.u3 u3Var;
        VoIPService sharedInstance;
        int i11;
        int i12;
        int i13 = org.telegram.messenger.ls.w2;
        n30 n30Var = this.L1;
        String[] strArr = null;
        int i14 = 0;
        int i15 = 1;
        if (i7 == i13) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.t3 t3Var = this.V2;
            if (t3Var == null || t3Var.b.id != l10.longValue()) {
                return;
            }
            org.telegram.messenger.t3 t3Var2 = this.V2;
            if (t3Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j3 = this.o2;
            int i16 = 3;
            org.telegram.messenger.c cVar = this.o1;
            if (j3 == 0 && (((i12 = this.E3) == 7 || i12 == 5 || i12 == 6) && !t3Var2.j())) {
                try {
                    Intent intent = new Intent(this.d2, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", m1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.W2);
                    intent.putExtra("peerChannelId", this.T2.channel_id);
                    intent.putExtra("peerChatId", this.T2.chat_id);
                    intent.putExtra("peerUserId", this.T2.user_id);
                    intent.putExtra("hash", this.X2);
                    intent.putExtra("peerAccessHash", this.T2.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", cVar.a);
                    intent.putExtra("scheduleDate", this.j4);
                    this.d2.startService(intent);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                this.o2 = SystemClock.elapsedRealtime();
                org.telegram.messenger.g0.h3(new v00(this, i16), 3000L);
            }
            if (!this.p2 && VoIPService.getSharedInstance() != null) {
                this.V2.b(false);
                p1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            P1();
            int childCount = n30Var.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = n30Var.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).a(true, false);
                }
            }
            if (this.W4 != null) {
                this.n2 = true;
            } else {
                R0(true);
            }
            X1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.E3 == 4;
            W1(true, booleanValue);
            Y1(true);
            if (z10 && ((i11 = this.E3) == 1 || i11 == 0)) {
                o1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l11 = (Long) objArr[3];
                long longValue = l11.longValue();
                if (longValue == 0 || v1()) {
                    return;
                }
                if (s1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList arrayList = org.telegram.messenger.np.u1(cVar.a).y;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size) {
                                break;
                            }
                            Object obj = arrayList.get(i18);
                            i18++;
                            if (((TLRPC.Dialog) obj).id == longValue) {
                                i14 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (org.telegram.messenger.n5.E(longValue)) {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(cVar.a).c2(l11);
                    if (c22 != null) {
                        if (this.V2.b.participants_count < 250 || org.telegram.messenger.p10.x(c22) || c22.verified || i14 != 0) {
                            o1().k(0L, 44, c22, this.U2, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(cVar.a).O0(Long.valueOf(-longValue));
                if (O0 != null) {
                    if (this.V2.b.participants_count < 250 || !org.telegram.messenger.v3.r0(O0) || O0.verified || i14 != 0) {
                        o1().k(0L, 44, O0, this.U2, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.y2) {
            b20 b20Var = this.Z3;
            if (b20Var.b && this.V2 != null) {
                boolean c10 = b20Var.c();
                org.telegram.messenger.t3 t3Var3 = this.V2;
                if (t3Var3 != null && b20Var.b && (u3Var = b20Var.e) != null && t3Var3.d.f(org.telegram.messenger.gj.B1(u3Var.a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.u3 u3Var2 = null;
                    int i19 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.l2;
                        if (i19 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.u3 u3Var3 = (org.telegram.messenger.u3) arrayList2.get(i19);
                        if (this.V2.P.g(null, org.telegram.messenger.gj.B1(u3Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = u3Var3.a;
                            if (!groupCallParticipant3.muted_by_you && b20Var.d != org.telegram.messenger.gj.B1(groupCallParticipant3.peer)) {
                                u3Var2 = u3Var3;
                            }
                        }
                        i19++;
                    }
                    if (u3Var2 != null) {
                        i1(u3Var2);
                    }
                }
            }
            b20Var.setVisibleParticipant(true);
            X1();
            return;
        }
        if (i7 == org.telegram.messenger.ls.Q4) {
            I1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i7 == org.telegram.messenger.ls.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    N0 = org.telegram.messenger.v3.W(this.U2) ? org.telegram.messenger.hd.N0(2131743207, null) : org.telegram.messenger.hd.N0(2131743074, null);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    N0 = org.telegram.messenger.v3.W(this.U2) ? org.telegram.messenger.hd.N0(2131743233, null) : org.telegram.messenger.hd.N0(2131743125, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131751093, null) + "\n" + str;
                }
                AlertDialog$Builder K = org.telegram.ui.Components.c5.K(getContext(), org.telegram.messenger.hd.N0(2131743061, null), N0);
                K.j(new b10(this, i15));
                try {
                    K.p();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == m1()) {
                P1();
                W1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.gj.B1(this.v2);
            org.telegram.messenger.t3 t3Var4 = this.V2;
            if (t3Var4 == null || chatFull.id != (-B1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) t3Var4.d.f(B1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            R0(true);
            org.telegram.messenger.g0.Z3(n30Var);
            if (this.D4 != null) {
                while (i14 < this.D4.getChildCount()) {
                    View childAt2 = this.D4.getChildAt(i14);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.y0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).j(org.telegram.messenger.hd.N0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743261 : 2131743171, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.u1) {
            if (((Long) objArr[0]).longValue() == m1()) {
                P1();
                W1(isShowing(), false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.B2) {
            int childCount2 = n30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i14 < childCount2) {
                v4.f1 G = n30Var.G(n30Var.getChildAt(i14));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                        if (g4Var.getParticipant() != null) {
                            g4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i14++;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.E0) {
            Long l12 = (Long) objArr[0];
            long B12 = org.telegram.messenger.gj.B1(this.v2);
            if (this.V2 == null || B12 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(B12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            R0(true);
            org.telegram.messenger.g0.Z3(n30Var);
            if (this.D4 != null) {
                while (i14 < this.D4.getChildCount()) {
                    View childAt3 = this.D4.getChildAt(i14);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.y0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.y0) childAt3).j(org.telegram.messenger.hd.N0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743262 : 2131743172, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.j0) {
            R0(true);
            org.telegram.messenger.g0.Z3(n30Var);
            return;
        }
        if (i7 == org.telegram.messenger.ls.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i20 = org.telegram.messenger.np.I8;
            int i21 = intValue & 16;
            if (i21 != 0) {
                R0(true);
            }
            if (i21 == 0 && (intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            org.telegram.messenger.g0.Z3(n30Var);
            return;
        }
        if (i7 == org.telegram.messenger.ls.z2) {
            w20 w20Var = this.u2;
            if (w20Var != null) {
                w20Var.b(true, true);
            }
            P1();
            return;
        }
        if (i7 == org.telegram.messenger.ls.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.k2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        LaunchActivity launchActivity = this.d2;
        launchActivity.a1.remove(this.u4);
        this.d2.setRequestedOrientation(-1);
        D5 = false;
        org.telegram.ui.Components.v20 v20Var = this.D3;
        if (v20Var != null) {
            v20Var.dismiss();
        }
        this.n2 = true;
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.o1;
        int i7 = cVar.a;
        int i10 = cVar.a;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.M0);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.w2);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.T);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.u1);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.B2);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.E0);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.j0);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.r);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.z2);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.y2);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.U3);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.Q4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.D2);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.d2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.d2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                o1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1() {
        org.telegram.ui.Components.voip.y yVar = this.Y4;
        if (yVar != null) {
            yVar.a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.y yVar2 = this.Y4;
            yVar2.h = false;
            yVar2.j(false);
            this.Y4.invalidate();
            this.Z3.invalidate();
        }
        org.telegram.ui.Cells.g4 g4Var = this.W4;
        if (g4Var != null && !this.a5 && g4Var.getParent() != null) {
            this.b.removeView(this.W4);
        }
        org.telegram.ui.Cells.g4 g4Var2 = this.W4;
        if (g4Var2 != null) {
            g4Var2.setProgressToAvatarPreview(0.0f);
            this.W4.setAboutVisible(false);
            this.W4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.u10 u10Var = this.Z4;
        if (u10Var != null) {
            u10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.W4 = null;
        this.X4 = null;
        this.Z4 = null;
        this.Y4 = null;
    }

    public final void g1(boolean z10) {
        if (this.b5 || !this.e4) {
            return;
        }
        if (z10) {
            this.b5 = true;
            E1(false, this.W4);
            return;
        }
        e1();
        this.b.removeView(this.d4);
        this.d4 = null;
        this.B4.setVisibility(8);
        this.b.invalidate();
        this.e4 = false;
        this.T1.X = true;
        this.L1.invalidate();
        this.a4.setVisibility(8);
        if (this.n2) {
            this.n2 = false;
            R0(true);
        }
        V0();
    }

    public final org.telegram.ui.Components.voip.r h1() {
        int i7 = 0;
        while (true) {
            n30 n30Var = this.L1;
            if (i7 >= n30Var.getChildCount()) {
                return null;
            }
            View childAt = n30Var.getChildAt(i7);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.r) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.r) childAt;
            }
            i7++;
        }
    }

    public final void i1(org.telegram.messenger.u3 u3Var) {
        org.telegram.messenger.u3 u3Var2;
        if (u3Var == null) {
            this.d2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            b20 b20Var = this.Z3;
            if (b20Var.r != null) {
                return;
            }
            boolean z10 = F5;
            n30 n30Var = this.L1;
            int i7 = 0;
            if (!z10) {
                if (this.p4 != null) {
                    n30Var.getViewTreeObserver().removeOnPreDrawListener(this.p4);
                    this.p4 = null;
                }
                if (u3Var == null) {
                    if (n30Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = n30Var.getViewTreeObserver();
                        z20 z20Var = new z20(this, 1);
                        this.p4 = z20Var;
                        viewTreeObserver.addOnPreDrawListener(z20Var);
                        return;
                    }
                    n30Var.setVisibility(0);
                    R0(false);
                    this.n2 = true;
                    ViewTreeObserver viewTreeObserver2 = n30Var.getViewTreeObserver();
                    z20 z20Var2 = new z20(this, 0);
                    this.p4 = z20Var2;
                    viewTreeObserver2.addOnPreDrawListener(z20Var2);
                    return;
                }
                x10 x10Var = this.l4;
                if (x10Var.getVisibility() == 0) {
                    b20Var.j(u3Var);
                    org.telegram.messenger.g0.Z3(x10Var);
                    return;
                }
                x10Var.setVisibility(0);
                org.telegram.ui.Components.v10 v10Var = this.o4;
                v10Var.G(x10Var, false);
                this.n2 = true;
                if (!b20Var.b) {
                    ArrayList arrayList = v10Var.e;
                    v4.c0 c0Var = (v4.c0) x10Var.getLayoutManager();
                    if (c0Var != null) {
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.u3) arrayList.get(i7)).equals(u3Var)) {
                                c0Var.h1(i7, org.telegram.messenger.g0.L(13.0f));
                                break;
                            }
                            i7++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = n30Var.getViewTreeObserver();
                pw pwVar = new pw(1, this, u3Var);
                this.p4 = pwVar;
                viewTreeObserver3.addOnPreDrawListener(pwVar);
                return;
            }
            if (this.p4 != null) {
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this.p4);
                this.p4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            i40 i40Var = this.n4;
            ArrayList arrayList3 = this.X3;
            ArrayList arrayList4 = this.Y3;
            if (u3Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList4.get(i10);
                    org.telegram.ui.Components.voip.r rVar = yVar.c;
                    if (rVar != null) {
                        rVar.setRenderer(null);
                        org.telegram.ui.Components.u10 u10Var = yVar.d;
                        if (u10Var != null) {
                            u10Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.r rVar2 = yVar.e;
                        if (rVar2 != null) {
                            rVar2.setRenderer(null);
                        }
                        arrayList2.add(yVar.x);
                        yVar.b(false);
                        yVar.animate().alpha(0.0f).setListener(new x20(this, yVar, 0));
                    }
                }
                this.O4 = false;
                i40Var.H(this.m4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) arrayList4.get(i11);
                    if (yVar2.e != null && ((u3Var2 = yVar2.x) == null || !u3Var2.equals(u3Var))) {
                        arrayList2.add(yVar2.x);
                        yVar2.b(false);
                        org.telegram.ui.Components.u10 u10Var2 = yVar2.d;
                        if (u10Var2 != null) {
                            u10Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.r rVar3 = yVar2.c;
                        if (rVar3 != null) {
                            rVar3.setRenderer(null);
                        }
                        yVar2.animate().alpha(0.0f).setListener(new x20(this, yVar2, 1));
                    }
                }
                this.O4 = true;
                i40Var.r = false;
                if (!arrayList2.isEmpty()) {
                    org.telegram.messenger.g0.g3(new ss(21, this, arrayList2));
                }
            }
            boolean z11 = !b20Var.b;
            ViewTreeObserver viewTreeObserver4 = n30Var.getViewTreeObserver();
            lh lhVar = new lh(this, u3Var, z11);
            this.p4 = lhVar;
            viewTreeObserver4.addOnPreDrawListener(lhVar);
        }
    }

    public final int l1() {
        Integer num = this.x5;
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

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        D5 = true;
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
        org.telegram.ui.Components.c20.k(getContext());
        return false;
    }

    public final long m1() {
        TLRPC.Chat chat = this.U2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void n1(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.o1;
        int i7 = cVar.a;
        int i10 = cVar.a;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(m1()));
        if (O0 != null && !org.telegram.messenger.v3.t0(O0)) {
            TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i10).P0(m1());
            String K = org.telegram.messenger.v3.K(this.U2, false);
            String m10 = !TextUtils.isEmpty(K) ? p5.c.m(org.telegram.messenger.np.u1(i10).X2, "/", K, new StringBuilder()) : (P0 == null || (tL_chatInviteExported = P0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(m10)) {
                A1(null, m10, true, z10);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = org.telegram.messenger.np.n1(this.U2);
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new di.o8(this, P0, z10, 6));
            return;
        }
        if (this.V2 == null) {
            return;
        }
        int i11 = 0;
        while (i11 < 2) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            org.telegram.messenger.t3 t3Var = this.V2;
            exportgroupcallinvite.call = t3Var.g(t3Var.a);
            exportgroupcallinvite.can_self_unmute = i11 == 1;
            ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.ad(this, i11, z10, 2));
            i11++;
        }
    }

    public final UndoView o1() {
        if (!F5) {
            b20 b20Var = this.Z3;
            if (b20Var.b) {
                return b20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.e2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.b.removeView(undoViewArr[0]);
            this.b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        V1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            I1(0.0f);
        }
        n30 n30Var = this.L1;
        if (n30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.Z3(n30Var);
        }
        x10 x10Var = this.l4;
        if (x10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.Z3(x10Var);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        w20 w20Var = this.u2;
        if (w20Var != null) {
            w20Var.b(false, false);
            return;
        }
        if (this.e4) {
            g1(true);
        } else if (this.Z3.b) {
            i1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        w20 w20Var = this.u2;
        if (w20Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        w20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.d2;
        launchActivity.a1.add(this.u4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        this.S3 = i7;
        W1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p1() {
        VoIPService sharedInstance;
        if (this.p2 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.p2 = true;
        this.y2.addAll(this.V2.g);
        this.z2.addAll(this.l2);
        this.A2.addAll(this.V2.j);
        this.B2.addAll(this.V2.m);
        this.C2.addAll(this.V2.l);
        this.S3 = sharedInstance.getCallState();
        if (this.V2 == null) {
            org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
            this.V2 = t3Var;
            this.o4.c = t3Var;
            this.Z3.setGroupCall(t3Var);
            this.n4.c = this.V2;
        }
        int i7 = 0;
        nh.h hVar = this.X1;
        if (hVar != null) {
            hVar.D0(this.o1.a, this.V2.g(false));
        }
        this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
        ArrayList arrayList = this.V2.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = r7.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        m30 m30Var = this.Q1;
        if (m30Var == null || m30Var.getVisibility() != 0) {
            return;
        }
        this.u1.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.uh, false), 0.3f, false, org.telegram.messenger.hd.N0(2131743119, null), false, true);
        V1(true);
        this.v3.setText(org.telegram.messenger.hd.N0(org.telegram.messenger.v3.W(this.U2) ? 2131743236 : 2131743135, null));
        n30 n30Var = this.L1;
        n30Var.setVisibility(0);
        org.telegram.ui.ActionBar.q0 q0Var = this.g3;
        q0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n30Var, (Property<n30, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n30Var, (Property<n30, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.m5 m5Var = this.P1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.R1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(m5Var2, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(m5Var2, (Property<org.telegram.ui.ActionBar.m5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(m5Var2, (Property<org.telegram.ui.ActionBar.m5, Float>) property, 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.nr.g);
        animatorSet.addListener(new a30(this, i7));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void q1(final long j3, final boolean z10) {
        if (this.V2 != null) {
            org.telegram.messenger.c cVar = this.o1;
            final TLRPC.User c22 = org.telegram.messenger.np.u1(cVar.a).c2(Long.valueOf(j3));
            if (c22 != null) {
                int i7 = 3;
                final org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.t3 t3Var = this.V2;
                invitetogroupcall.call = t3Var.g(t3Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = c22.id;
                tL_inputUser.access_hash = c22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.a).sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.g10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        f40 f40Var = f40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                        if (tLObject == null) {
                            org.telegram.messenger.g0.g3(new di.m(f40Var, t1VarArr2, z10, tL_error, j10, invitetogroupcall));
                            return;
                        }
                        org.telegram.messenger.np.u1(f40Var.o1.a).V3((TLRPC.Updates) tLObject, false);
                        org.telegram.messenger.g0.g3(new di.j2(f40Var, j10, t1VarArr2, c22, 19));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f21(this, t1VarArr, sendRequest, i7), 500L);
                }
            }
        }
    }

    public final boolean r1() {
        int L = org.telegram.messenger.g0.L(74.0f);
        float f10 = this.t2 - L;
        return (((((float) this.t0) + f10) > ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 1 : ((((float) this.t0) + f10) == ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - f10) - ((float) this.t0)) / ((float) ((L - this.t0) - org.telegram.messenger.g0.L(14.0f)))) : 0.0f) > 0.5f;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.Z1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fh, false));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f3;
            if (q0Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Yg;
                q0Var.P(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
                q0Var.P(org.telegram.ui.ActionBar.m6.x0(null, i7, false), true);
                q0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false);
            L1(this.w3, x02);
            L1(this.x3, x02);
            L1(this.k3, x02);
            L1(this.l3, x02);
            L1(this.m3, x02);
            L1(this.v3, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.mh, false));
            L1(this.i3, x02);
            L1(this.j3, x02);
            L1(this.q3, x02);
            L1(this.r3, x02);
            L1(this.s3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean s1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        wi.n nVar;
        super.show();
        org.telegram.ui.Components.voip.j1 j1Var = org.telegram.ui.Components.voip.j1.w;
        if (j1Var != null && (nVar = j1Var.a) != null && nVar.e()) {
            org.telegram.ui.Components.voip.j1 j1Var2 = org.telegram.ui.Components.voip.j1.w;
            if (j1Var2.a != null) {
                org.telegram.ui.Components.voip.t0 t0Var = j1Var2.e;
                j1Var2.e = null;
                j1Var2.b.a = null;
                j1Var2.a.a(new org.telegram.ui.Components.rh(11, j1Var2, t0Var));
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(19));
            }
        }
        Q1();
    }

    public final boolean u1() {
        return v1() && !this.V2.f.isEmpty() && (((org.telegram.messenger.u3) this.V2.f.get(0)).c == 0.0f || ((org.telegram.messenger.u3) this.V2.f.get(0)).c >= 1.0f);
    }

    public final boolean v1() {
        org.telegram.messenger.t3 t3Var = this.V2;
        return t3Var != null && t3Var.b.rtmp_stream;
    }

    public final void w1(org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.r2) {
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d2.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
        if (g2Var instanceof bn) {
            boolean sa2 = ((bn) g2Var).sa();
            this.r2 = true;
            this.s2 = true;
            org.telegram.messenger.g0.h3(new yn(w2Var, editTextBoldCursor, z10, t1Var, 7), sa2 ? 200L : 0L);
            return;
        }
        this.r2 = true;
        this.s2 = true;
        if (w2Var != null) {
            w2Var.A0(true);
        } else if (t1Var != null) {
            t1Var.l(true);
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new qg(editTextBoldCursor, 2), 100L);
        }
    }

    public final void y1() {
        H5 = true;
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(false);
        }
        l30 l30Var = this.G1;
        org.telegram.ui.Components.m71 m71Var = l30Var.w;
        if (m71Var != null) {
            m71Var.c(false);
        }
        l30Var.G = true;
        this.C1.r();
    }

    public final void z1() {
        H5 = false;
        this.K1.f();
        x10 x10Var = this.l4;
        if (x10Var.getVisibility() == 0) {
            this.o4.G(x10Var, false);
        }
        if (F5) {
            this.n4.I(this.m4, false);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        l30 l30Var = this.G1;
        org.telegram.ui.Components.m71 m71Var = l30Var.w;
        if (m71Var != null) {
            m71Var.c(true);
        }
        l30Var.G = false;
        this.C1.s();
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
