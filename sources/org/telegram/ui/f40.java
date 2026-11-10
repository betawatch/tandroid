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
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
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
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls, VoIPService.StateListener, te.b {
    public static boolean A5;
    public static volatile org.telegram.messenger.q5 B5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public static boolean C5;
    public static f40 x5;
    public static boolean y5;
    public static boolean z5;
    public final m20 A1;
    public final ArrayList A2;
    public boolean A3;
    public final org.telegram.ui.Components.zg0 A4;
    public final k20 B1;
    public final ArrayList B2;
    public boolean B3;
    public int B4;
    public final ImageView C1;
    public int C2;
    public final Paint C3;
    public boolean C4;
    public final ImageView D1;
    public final org.telegram.ui.Components.zg0 D2;
    public final Paint D3;
    public final View D4;
    public org.telegram.ui.Components.ii0 E1;
    public final org.telegram.ui.Components.zg0 E2;
    public final e40[] E3;
    public final View E4;
    public final l30 F1;
    public boolean F2;
    public float F3;
    public GradientDrawable F4;
    public final org.telegram.ui.Components.i6 G1;
    public final org.telegram.ui.Components.q9 G2;
    public e40 G3;
    public final int[] G4;
    public final v10 H1;
    public final org.telegram.ui.Components.q9 H2;
    public e40 H3;
    public final z10 H4;
    public final c30 I1;
    public float I2;
    public long I3;
    public boolean I4;
    public final z30 J1;
    public float J2;
    public float J3;
    public boolean J4;
    public final n30 K1;
    public float K2;
    public float K3;
    public RenderNode K4;
    public final t20 L1;
    public RadialGradient L2;
    public boolean L3;
    public float L4;
    public final TextView M1;
    public final Matrix M2;
    public boolean M3;
    public boolean M4;
    public final r20 N1;
    public final Paint N2;
    public int N3;
    public final String[] N4;
    public final org.telegram.ui.ActionBar.m5 O1;
    public final u30 O2;
    public float O3;
    public ObjectAnimator O4;
    public final m30 P1;
    public float P2;
    public int P3;
    public ObjectAnimator P4;
    public final org.telegram.ui.ActionBar.m5 Q1;
    public float Q2;
    public boolean Q3;
    public final y20 Q4;
    public final t30 R1;
    public ValueAnimator R2;
    public final int[] R3;
    public org.telegram.ui.Cells.f4 R4;
    public final org.telegram.ui.Components.ky S1;
    public TLRPC.InputPeer S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.voip.r S4;
    public final ImageReceiver T1;
    public TLRPC.Chat T2;
    public final ArrayList T3;
    public org.telegram.ui.Components.voip.y T4;
    public int U1;
    public org.telegram.messenger.r3 U2;
    public final c20 U3;
    public org.telegram.ui.Components.g10 U4;
    public final ImageView V1;
    public final boolean V2;
    public final h20 V3;
    public boolean V4;
    public final nh.h W1;
    public final String W2;
    public final u20 W3;
    public boolean W4;
    public final int X1;
    public final a40 X2;
    public float X3;
    public int X4;
    public final RadialProgressView Y1;
    public final u10 Y2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout Y3;
    public AnimatorSet Y4;
    public final Drawable Z1;
    public final w10 Z2;
    public boolean Z3;
    public h30 Z4;
    public final View a2;
    public final Paint a3;
    public boolean a4;
    public int a5;
    public AnimatorSet b2;
    public ValueAnimator b3;
    public org.telegram.ui.Components.j30 b4;
    public int b5;
    public LaunchActivity c2;
    public float c3;
    public o30 c4;
    public int c5;
    public final UndoView[] d2;
    public final LinearLayout d3;
    public Boolean d4;
    public int d5;
    public final org.telegram.ui.Cells.k e2;
    public final org.telegram.ui.ActionBar.r0 e3;
    public int e4;
    public int e5;
    public boolean f2;
    public final org.telegram.ui.ActionBar.r0 f3;
    public boolean f4;
    public int f5;
    public org.telegram.ui.Components.y20 g2;
    public final org.telegram.ui.ActionBar.r0 g3;
    public final y10 g4;
    public int g5;
    public org.telegram.ui.Components.y20 h2;
    public final org.telegram.ui.ActionBar.z0 h3;
    public final org.telegram.ui.Components.pj0 h4;
    public int h5;
    public int i2;
    public final org.telegram.ui.ActionBar.z0 i3;
    public final i40 i4;
    public int i5;
    public g.b j2;
    public final org.telegram.ui.ActionBar.z0 j3;
    public final org.telegram.ui.Components.h10 j4;
    public int j5;
    public final ArrayList k2;
    public final org.telegram.ui.ActionBar.z0 k3;
    public ViewTreeObserver.OnPreDrawListener k4;
    public int k5;
    public final e20 l1;
    public b30 l2;
    public final org.telegram.ui.ActionBar.z0 l3;
    public final org.telegram.ui.Components.voip.n l4;
    public int l5;
    public final j10 m1;
    public boolean m2;
    public final org.telegram.ui.ActionBar.z0 m3;
    public boolean m4;
    public int m5;
    public final org.telegram.messenger.c n1;
    public long n2;
    public final org.telegram.ui.ActionBar.z0 n3;
    public final ArrayList n4;
    public int n5;
    public final p10 o1;
    public boolean o2;
    public final org.telegram.ui.ActionBar.z0 o3;
    public boolean o4;
    public int o5;
    public final org.telegram.ui.Components.voip.n2 p1;
    public final RectF p2;
    public final org.telegram.ui.ActionBar.z0 p3;
    public final v00 p4;
    public int p5;
    public final org.telegram.ui.Components.voip.n2 q1;
    public boolean q2;
    public final org.telegram.ui.ActionBar.z0 q3;
    public final t10 q4;
    public final i30 q5;
    public final org.telegram.ui.Components.voip.n2 r1;
    public boolean r2;
    public final org.telegram.ui.ActionBar.z0 r3;
    public final org.telegram.ui.Components.us r4;
    public Boolean r5;
    public final org.telegram.ui.Components.voip.n2 s1;
    public float s2;
    public final org.telegram.ui.ActionBar.z0 s3;
    public final v00 s4;
    public Integer s5;
    public final org.telegram.ui.Components.voip.n2 t1;
    public w20 t2;
    public final LinearLayout t3;
    public boolean t4;
    public final te.a t5;
    public final org.telegram.ui.Components.voip.n2 u1;
    public TLRPC.Peer u2;
    public final TextView u3;
    public final m4 u4;
    public final te.a u5;
    public final org.telegram.ui.Components.voip.n2 v1;
    public TLObject v2;
    public final d40 v3;
    public final LongSparseIntArray v4;
    public final te.c v5;
    public final q10 w1;
    public final Paint w2;
    public final rh.h w3;
    public final f20 w4;
    public final te.a w5;
    public final ImageView x1;
    public final ArrayList x2;
    public v00 x3;
    public final d20 x4;
    public final Paint y1;
    public final ArrayList y2;
    public org.telegram.ui.Components.h20 y3;
    public LinearLayout y4;
    public final n20 z1;
    public final ArrayList z2;
    public int z3;
    public boolean z4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public f40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.h6) null, true, true);
        int i7;
        final f40 f40Var;
        final ?? r10;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.y1 = new Paint(1);
        this.d2 = new UndoView[2];
        this.k2 = new ArrayList();
        this.p2 = new RectF();
        this.w2 = new Paint(1);
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.w3 = new rh.h(new v00(this, 4));
        int i10 = 0;
        this.z3 = 0;
        this.A3 = false;
        this.C3 = new Paint(7);
        this.D3 = new Paint(7);
        this.E3 = new e40[8];
        this.F3 = 1.0f;
        this.Q3 = true;
        this.R3 = new int[4];
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.l4 = new org.telegram.ui.Components.voip.n();
        this.n4 = new ArrayList();
        this.p4 = new v00(this, i10);
        this.q4 = new t10(this);
        this.r4 = new org.telegram.ui.Components.us(18);
        this.s4 = new v00(this, 1);
        this.t4 = false;
        this.u4 = new m4(this, 7);
        this.v4 = new LongSparseIntArray();
        this.G4 = new int[2];
        this.J4 = true;
        this.N4 = new String[2];
        this.X4 = -1;
        this.q5 = new i30(this);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
        this.t5 = new te.a(2, this, wqVar, 350L);
        this.u5 = new te.a(3, this, wqVar, 220L, true);
        this.v5 = new te.c(4, this, wqVar, 350L);
        this.w5 = new te.a(5, this, wqVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.n1 = cVar;
        this.U2 = r3Var;
        this.S2 = inputPeer;
        this.T2 = chat;
        this.W2 = str;
        this.a = cVar.a;
        this.V2 = z9;
        this.I0 = new di.i0();
        this.P0 = true;
        this.Q0 = true;
        this.X1 = org.telegram.messenger.qp.s1(this.a).x7.x.U();
        this.U = true;
        A5 = false;
        z5 = false;
        C5 = false;
        this.y0 = new o20(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.F0 = -1;
        this.Q4 = new y20(this);
        setOnDismissListener(new z00(this, i10));
        z0();
        z30 z30Var = new z30(this, launchActivity);
        this.J1 = z30Var;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(true);
        int i11 = org.telegram.ui.ActionBar.m6.eh;
        apVar.b(org.telegram.ui.ActionBar.m6.v0(i11));
        apVar.d();
        c30 c30Var = new c30(this, launchActivity, apVar);
        this.I1 = c30Var;
        c30Var.setSubtitle("");
        c30Var.getSubtitleTextView().setVisibility(0);
        c30Var.q();
        c30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.W3(1.0f, c30Var.getAdditionalSubtitleTextView(), this.o4, false);
        c30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.m6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.m6.Zg;
        org.telegram.ui.ActionBar.t6.l(c30Var, 6, i12, null);
        c30Var.setBackButtonImage(R.drawable.ic_ab_back);
        c30Var.setOccupyStatusBar(false);
        c30Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.m6.Vg;
        org.telegram.ui.ActionBar.t6.l(c30Var, 1, i13, null);
        org.telegram.ui.ActionBar.t6.l(c30Var, 3, org.telegram.ui.ActionBar.m6.z8, null);
        org.telegram.ui.ActionBar.t6.d(c30Var, i13);
        org.telegram.ui.ActionBar.t6.l(c30Var, 6, i12, null);
        c30Var.setActionBarMenuOnItemClick(new k30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.u2 = tL_peerUser;
            i7 = i13;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i7 = i13;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.u2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.u2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.u2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new u00(this, 2);
        cVar.b().c(this, org.telegram.messenger.qs.w2);
        cVar.b().c(this, org.telegram.messenger.qs.M0);
        cVar.b().c(this, org.telegram.messenger.qs.T);
        cVar.b().c(this, org.telegram.messenger.qs.u1);
        cVar.b().c(this, org.telegram.messenger.qs.B2);
        cVar.b().c(this, org.telegram.messenger.qs.E0);
        cVar.b().c(this, org.telegram.messenger.qs.j0);
        cVar.b().c(this, org.telegram.messenger.qs.r);
        cVar.b().c(this, org.telegram.messenger.qs.z2);
        cVar.b().c(this, org.telegram.messenger.qs.y2);
        cVar.b().c(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D2);
        this.Z1 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.voip_filled, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.D2 = zg0Var;
        this.E2 = new org.telegram.ui.Components.zg0(R.raw.hand_2, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        l30 l30Var = new l30(this, launchActivity);
        this.F1 = l30Var;
        this.b = l30Var;
        l30Var.setClipToPadding(false);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i14 = this.t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        this.b.setKeepScreenOn(true);
        this.b.setClipChildren(false);
        this.T1 = new ImageReceiver(this.b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.O1 = m5Var;
            m5Var.setGravity(17);
            m5Var.setTextColor(-1);
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setTextSize(18);
            m5Var.k(org.telegram.messenger.id.L0(2131743435));
            this.b.addView(m5Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            m30 m30Var = new m30(this, launchActivity);
            this.P1 = m30Var;
            m30Var.setGravity(17);
            m30Var.setTextColor(-1);
            m30Var.setTypeface(org.telegram.messenger.g0.o());
            m30Var.setTextSize(60);
            this.b.addView(m30Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.Q1 = m5Var2;
            m5Var2.setGravity(17);
            m5Var2.setTextColor(-1);
            m5Var2.setTypeface(org.telegram.messenger.g0.o());
            m5Var2.setTextSize(18);
            this.b.addView(m5Var2, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (u1()) {
            u30 u30Var = new u30(this, launchActivity);
            this.O2 = u30Var;
            this.b.addView(u30Var, c8.ha.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        n30 n30Var = new n30(this, launchActivity);
        this.K1 = n30Var;
        n30Var.setClipToPadding(false);
        n30Var.setClipChildren(false);
        t30 t30Var = new t30(this);
        this.R1 = t30Var;
        t30Var.o = wqVar;
        t30Var.d = 350L;
        t30Var.c = 350L;
        t30Var.e = 350L;
        t30Var.S();
        n30Var.setItemAnimator(t30Var);
        n30Var.setOnScrollListener(new i10(this));
        n30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.ky kyVar = new org.telegram.ui.Components.ky(z5 ? 6 : 2, n30Var);
        this.S1 = kyVar;
        n30Var.setLayoutManager(kyVar);
        j10 j10Var = new j10(this);
        this.m1 = j10Var;
        kyVar.z1(j10Var);
        n30Var.i(new k10(this));
        kyVar.C1();
        this.b.addView(n30Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        n30Var.setAdapter(z30Var);
        n30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.t6.I(org.telegram.ui.ActionBar.m6.Sg, n30Var);
        n30Var.setOnItemClickListener(new a7(this, launchActivity, r3Var, 14));
        n30Var.setOnItemLongClickListener(new u00(this, 3));
        if (u1()) {
            d40 d40Var = new d40(this, getContext());
            this.v3 = d40Var;
            this.b.addView(d40Var, c8.ha.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(launchActivity);
        this.h4 = pj0Var;
        this.b.addView(pj0Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        i40 i40Var = new i40(r3Var, this.a, this);
        this.i4 = i40Var;
        pj0Var.setAdapter(i40Var);
        v4.s sVar = new v4.s(6, false);
        pj0Var.setLayoutManager(sVar);
        sVar.z1(new m10(this));
        final int i15 = 1;
        pj0Var.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) { // from class: org.telegram.ui.t00
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i16, View view) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view;
                        org.telegram.messenger.s3 videoParticipant = g10Var.getVideoParticipant();
                        f40 f40Var2 = this.b;
                        if (videoParticipant != null) {
                            f40Var2.h1(g10Var.getVideoParticipant());
                            break;
                        } else {
                            f40Var2.h1(new org.telegram.messenger.s3(g10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        f40 f40Var3 = this.b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                        if (rVar.getParticipant() != null) {
                            f40Var3.h1(rVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        v4.k kVar = new v4.k();
        kVar.S();
        kVar.o = wqVar;
        kVar.d = 350L;
        kVar.c = 350L;
        kVar.e = 350L;
        pj0Var.setItemAnimator(new n10(this));
        pj0Var.setOnScrollListener(new o10(this));
        i40Var.H(pj0Var, false, false);
        pj0Var.setVisibility(8);
        p10 p10Var = new p10(this, launchActivity);
        this.o1 = p10Var;
        int v02 = org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.M2 = new Matrix();
        this.L2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.N2 = paint;
        paint.setShader(this.L2);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(9);
        this.G2 = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(12);
        this.H2 = q9Var2;
        q9Var.a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        q9Var.b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        q9Var.b();
        q9Var2.a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        q9Var2.b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        q9Var2.b();
        int i16 = org.telegram.ui.ActionBar.m6.wh;
        q9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i16), 38));
        q9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i16), 76));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.s1 = n2Var;
        n2Var.setCheckable(true);
        n2Var.setTextSize(12);
        p10Var.a(n2Var);
        n2Var.setOnClickListener(new s00(this, 6));
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.r1 = n2Var2;
        n2Var2.setCheckable(true);
        n2Var2.setTextSize(12);
        n2Var2.d(false, false);
        n2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        n2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743489), false, false);
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.p1 = n2Var3;
        n2Var3.setCheckable(true);
        n2Var3.setTextSize(12);
        n2Var3.d(false, false);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(launchActivity);
        n2Var3.addView(ch0Var, c8.ha.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.zg0 zg0Var2 = new org.telegram.ui.Components.zg0(R.raw.camera_flip, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.A4 = zg0Var2;
        ch0Var.setAnimation(zg0Var2);
        n2Var3.setOnClickListener(new s00(this, 9));
        p10Var.a(n2Var3);
        org.telegram.ui.Components.voip.n2 n2Var4 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.q1 = n2Var4;
        n2Var4.setCheckable(true);
        n2Var4.setTextSize(12);
        n2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.V1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.U1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        n2Var4.addView(imageView, c8.ha.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        n2Var4.setOnClickListener(new s00(this, 10));
        p10Var.a(n2Var4);
        p10Var.a(n2Var2);
        org.telegram.ui.Components.voip.n2 n2Var5 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.t1 = n2Var5;
        n2Var5.setTextSize(12);
        n2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.rh), 0.3f, false, org.telegram.messenger.id.L0(2131743364), false, false);
        final int i17 = 1;
        n2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y00
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        f40 f40Var2 = this.b;
                        LaunchActivity launchActivity2 = f40Var2.c2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.c2.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.qs.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                f40Var2.T1(true, false);
                                f40Var2.S1(false);
                                f40Var2.U2.z();
                                f40Var2.Q0(true);
                                f40Var2.o1.requestLayout();
                                break;
                            } else {
                                f40Var2.d2[0].d(1, false);
                                if (f40Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    f40Var2.t2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.b.getPaddingBottom());
                                    f40Var2.c.addView(f40Var2.t2);
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
                        f40Var3.U3.e();
                        org.telegram.messenger.r3 r3Var2 = f40Var3.U2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            f40Var3.O1();
                            f40.w1(launchActivity, new v00(f40Var3, 5), false, false);
                            break;
                        } else {
                            f40Var3.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var6 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.u1 = n2Var6;
        n2Var6.setCheckable(true);
        n2Var6.b(true, false);
        n2Var6.setTextSize(12);
        n2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743294), false, false);
        q10 q10Var = new q10(this, launchActivity);
        this.w1 = q10Var;
        q10Var.setAnimation(zg0Var);
        q10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.n2 n2Var7 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.v1 = n2Var7;
        n2Var7.setDrawBackground(false);
        n2Var7.setTextSize(12);
        n2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        n2Var7.addView(q10Var, c8.ha.e(50, 50, 49));
        p10Var.a(n2Var7);
        n2Var7.setOnClickListener(new s10(this));
        p10Var.a(n2Var6);
        p10Var.a(n2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.x1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        n2Var7.addView(imageView2, c8.ha.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.U2 != null && u1() && !this.U2.j()) {
            imageView2.setVisibility(0);
            q10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.Y1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Ch));
        c30Var.setAlpha(0.0f);
        c30Var.getBackButton().setScaleX(0.9f);
        c30Var.getBackButton().setScaleY(0.9f);
        c30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        c30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        c30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        c30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i7));
        this.e3 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setIcon(R.drawable.ic_ab_other);
        r0Var.setContentDescription(org.telegram.messenger.id.L0(2131754839));
        r0Var.setSubMenuOpenSide(2);
        r0Var.setDelegate(new u00(this, 5));
        int i18 = org.telegram.ui.ActionBar.m6.Wg;
        org.telegram.ui.ActionBar.t6.R(r0Var, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i18), 6), null, org.telegram.ui.ActionBar.t6.M(i18));
        r0Var.setOnClickListener(new s00(this, 11));
        r0Var.O(org.telegram.ui.ActionBar.m6.v0(i7), false);
        r0Var.O(org.telegram.ui.ActionBar.m6.v0(i7), true);
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i7));
        this.f3 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(R.drawable.msg_voice_pip);
        r0Var2.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.t6.R(r0Var2, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i18), 6), null, org.telegram.ui.ActionBar.t6.M(i18));
        r0Var2.setOnClickListener(new s00(this, 0));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i7));
        this.g3 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        r0Var3.setIcon(R.drawable.msg_screencast);
        r0Var3.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.t6.R(r0Var3, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i18), 6), null, org.telegram.ui.ActionBar.t6.M(i18));
        r0Var3.setOnClickListener(new s00(this, 1));
        u10 u10Var = new u10(this, launchActivity, launchActivity);
        this.Y2 = u10Var;
        v10 v10Var = new v10(launchActivity);
        this.H1 = v10Var;
        v10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.a3 = paint2;
        paint2.setColor(-12761513);
        w10 w10Var = new w10(this, getContext());
        this.Z2 = w10Var;
        org.telegram.ui.ActionBar.t6.U(w10Var, i7, this.I0);
        w10Var.setTextSize(1, 11.0f);
        w10Var.setText(org.telegram.messenger.id.L0(2131743474));
        w10Var.setMaxLines(1);
        w10Var.setGravity(17);
        w10Var.setTypeface(org.telegram.messenger.g0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        w10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        w10Var.setTag(-1);
        if (!u1()) {
            w10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(u10Var, c8.ha.l(1.0f, 0, -2));
        linearLayout.addView(w10Var, c8.ha.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView(v10Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(c30Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.t3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r0Var3, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var2, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var, c8.ha.o(48, 48));
        this.b.addView(linearLayout2, c8.ha.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.a2 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.b.addView(view, c8.ha.c(1.0f, -1));
        for (int i19 = 0; i19 < 2; i19++) {
            this.d2[i19] = new x10(this, launchActivity);
            this.d2[i19].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.d2[i19].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.b.addView(this.d2[i19], c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.e2 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, Integer.valueOf(org.telegram.messenger.qs.P3));
        this.e3.g(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.e3.setShowSubmenuByMove(false);
        int i20 = org.telegram.ui.ActionBar.m6.Sg;
        org.telegram.ui.ActionBar.t6.R(kVar2, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.v0(i20), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i20));
        org.telegram.ui.ActionBar.r0 r0Var4 = this.e3;
        org.telegram.ui.ActionBar.z0 d = r0Var4.d(1, 0, null, org.telegram.messenger.id.L0(2131743401), true, true, r0Var4.m0);
        this.o3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.r0 r0Var5 = this.e3;
        org.telegram.ui.ActionBar.z0 d2 = r0Var5.d(2, 0, null, org.telegram.messenger.id.L0(2131743354), true, true, r0Var5.m0);
        this.p3 = d2;
        d2.m(false, true);
        int i21 = org.telegram.ui.ActionBar.m6.kh;
        d.setCheckColor(i21);
        d.d(org.telegram.ui.ActionBar.m6.v0(i21), org.telegram.ui.ActionBar.m6.v0(i21));
        d2.setCheckColor(i21);
        d2.d(org.telegram.ui.ActionBar.m6.v0(i21), org.telegram.ui.ActionBar.m6.v0(i21));
        Paint paint3 = new Paint(1);
        int i22 = org.telegram.ui.ActionBar.m6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.m6.v0(i22));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.r0 r0Var6 = this.e3;
        org.telegram.ui.ActionBar.z0 d10 = r0Var6.d(10, R.drawable.msg_voice_speaker, null, org.telegram.messenger.id.L0(2131743399), true, false, r0Var6.m0);
        this.j3 = d10;
        d10.setItemHeight(56);
        org.telegram.ui.ActionBar.r0 r0Var7 = this.e3;
        org.telegram.ui.ActionBar.z0 d11 = r0Var7.d(11, R.drawable.msg_noise_on, null, org.telegram.messenger.id.L0(2131743282), true, false, r0Var7.m0);
        this.k3 = d11;
        d11.setItemHeight(56);
        TextView b10 = this.e3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Ug), -16777216));
        this.u3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.r0 r0Var8 = this.e3;
        org.telegram.ui.ActionBar.z0 d12 = r0Var8.d(6, R.drawable.msg_edit, this.X2, org.telegram.messenger.id.L0(org.telegram.messenger.t3.W(this.T2) ? 2131743485 : 2131743384), true, false, r0Var8.m0);
        this.i3 = d12;
        org.telegram.ui.ActionBar.r0 r0Var9 = this.e3;
        org.telegram.ui.ActionBar.z0 d13 = r0Var9.d(7, R.drawable.msg_permissions, this.X2, org.telegram.messenger.id.L0(2131743385), false, false, r0Var9.m0);
        this.l3 = d13;
        org.telegram.ui.ActionBar.z0 e10 = this.e3.e(3, R.drawable.msg_link, org.telegram.messenger.id.L0(2131743337));
        this.h3 = e10;
        a40 a40Var = new a40();
        this.X2 = a40Var;
        org.telegram.ui.ActionBar.z0 e11 = this.e3.e(9, R.drawable.msg_screencast, org.telegram.messenger.id.L0(2131743436));
        this.n3 = e11;
        org.telegram.ui.ActionBar.r0 r0Var10 = this.e3;
        org.telegram.ui.ActionBar.z0 d14 = r0Var10.d(5, 0, a40Var, org.telegram.messenger.id.L0(2131743348), true, false, r0Var10.m0);
        this.m3 = d14;
        a40Var.a(d14.getImageView());
        org.telegram.ui.ActionBar.z0 e12 = this.e3.e(12, R.drawable.menu_stream_comments_24, org.telegram.messenger.id.L0(2131743484));
        this.r3 = e12;
        org.telegram.ui.ActionBar.z0 e13 = this.e3.e(13, R.drawable._menu_stream_comments_off_24, org.telegram.messenger.id.L0(2131743486));
        this.s3 = e13;
        org.telegram.ui.ActionBar.z0 e14 = this.e3.e(4, R.drawable.msg_cancel, org.telegram.messenger.id.L0(r1() ? 2131743379 : org.telegram.messenger.t3.W(this.T2) ? 2131743481 : 2131743380));
        this.q3 = e14;
        this.e3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.v0(i20));
        this.e3.getPopupLayout().setFitItems(true);
        e12.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        e13.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        d10.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        d11.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        int i23 = org.telegram.ui.ActionBar.m6.jh;
        e14.d(org.telegram.ui.ActionBar.m6.v0(i23), org.telegram.ui.ActionBar.m6.v0(i23));
        e10.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        d12.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        d13.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        d14.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        e11.d(org.telegram.ui.ActionBar.m6.v0(i22), org.telegram.ui.ActionBar.m6.v0(i22));
        if (this.U2 != null) {
            o1();
        }
        if (r1()) {
            this.j2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.j2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        V1(false);
        this.I1.getTitleTextView().setOnClickListener(new s00(this, 2));
        y10 y10Var = new y10(this, launchActivity);
        this.g4 = y10Var;
        z10 z10Var = new z10(this);
        this.H4 = z10Var;
        final int i24 = 0;
        y10Var.setClipToPadding(false);
        z10Var.S();
        z10Var.o = org.telegram.ui.Components.wq.f;
        z10Var.d = 350L;
        z10Var.c = 350L;
        z10Var.e = 350L;
        y10Var.setItemAnimator(z10Var);
        y10Var.setOnScrollListener(new a20(this));
        y10Var.setClipChildren(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        y10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.h10 h10Var = new org.telegram.ui.Components.h10(r3Var, this.a, this);
        this.j4 = h10Var;
        y10Var.setAdapter(h10Var);
        h10Var.F(y10Var, false);
        y10Var.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) { // from class: org.telegram.ui.t00
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i162, View view2) {
                switch (i24) {
                    case 0:
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view2;
                        org.telegram.messenger.s3 videoParticipant = g10Var.getVideoParticipant();
                        f40 f40Var2 = this.b;
                        if (videoParticipant != null) {
                            f40Var2.h1(g10Var.getVideoParticipant());
                            break;
                        } else {
                            f40Var2.h1(new org.telegram.messenger.s3(g10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        f40 f40Var3 = this.b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view2;
                        if (rVar.getParticipant() != null) {
                            f40Var3.h1(rVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        y10Var.setOnItemLongClickListener(new u00(this, i24));
        y10Var.setVisibility(8);
        y10Var.i(new b20());
        c20 c20Var = new c20(this, launchActivity, this.K1, y10Var, this.S3, this.U2, this);
        this.U3 = c20Var;
        c20Var.setClipChildren(false);
        h10Var.E(this.S3, c20Var);
        if (this.h4 != null) {
            this.i4.G(this.S3, c20Var);
        }
        d20 d20Var = new d20(this, launchActivity);
        this.x4 = d20Var;
        e20 e20Var = new e20(this, launchActivity, this.I1, this.K1, d20Var);
        this.l1 = e20Var;
        e20Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        e20Var.setInvalidateWithParent(true);
        d20Var.setProfileGalleryView(e20Var);
        f20 f20Var = new f20(this, launchActivity);
        this.w4 = f20Var;
        f20Var.setVisibility(8);
        e20Var.setVisibility(0);
        e20Var.b(new g20(this));
        h20 h20Var = new h20(this, launchActivity);
        this.V3 = h20Var;
        this.b.addView(c20Var);
        c20Var.addView(y10Var, c8.ha.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.o1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.D4 = view2;
        int[] iArr = this.G4;
        iArr[0] = this.P3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.G4);
        this.F4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.b.addView(view2, c8.ha.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.E4 = view3;
        view3.setBackgroundColor(this.G4[0]);
        this.b.addView(view3, c8.ha.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.W1 = hVar;
        hVar.setDelegate(new i20(this));
        hVar.setClickCellDelegate(new j20(this));
        org.telegram.messenger.r3 r3Var2 = this.U2;
        if (r3Var2 != null) {
            hVar.D0(this.n1.a, r3Var2.g(false));
        }
        this.b.addView(hVar, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(launchActivity, false, true, true);
        this.G1 = i6Var;
        i6Var.setGravity(17);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setTextColor(-1);
        i6Var.b(0.4f, 320L, org.telegram.ui.Components.wq.h);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.o1);
        k20 k20Var = new k20(this, launchActivity, this.F1, LaunchActivity.Q(), this.I0);
        this.B1 = k20Var;
        k20Var.J = true;
        k20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.X1)});
        k20Var.getEditText().setLinkTextColor(-11683585);
        k20Var.setHint(org.telegram.messenger.id.L0(2131743928));
        k20Var.getEditText().addTextChangedListener(new l20(this));
        k20Var.s();
        m20 m20Var = new m20(this, launchActivity);
        this.A1 = m20Var;
        this.b.addView(m20Var, c8.ha.c(-1.0f, -1));
        n20 n20Var = new n20(launchActivity);
        this.z1 = n20Var;
        n20Var.addView(k20Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        n20Var.addView(i6Var, c8.ha.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        i6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.b.addView(n20Var, c8.ha.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.D1 = imageView3;
        int i25 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(V(i25), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i25), this.I0);
        int i26 = org.telegram.ui.ActionBar.m6.f7;
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i26, h6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new s00(this, 3));
        ImageView imageView4 = new ImageView(launchActivity);
        this.C1 = imageView4;
        org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(V(i25), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i25), this.I0);
        org.telegram.ui.ActionBar.t6.s(imageView4, org.telegram.ui.ActionBar.m6.v6, this.I0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new s00(this, 4));
        n20Var.addView(imageView3, c8.ha.e(48, 48, 85));
        n20Var.addView(imageView4, c8.ha.e(48, 48, 85));
        this.b.addView(h20Var);
        f20Var.addView(e20Var, c8.ha.c(-1.0f, -1));
        f20Var.addView(d20Var, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(f20Var, c8.ha.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.J1.f();
        if (A5) {
            this.i4.I(this.h4, false);
        }
        this.C2 = this.J1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.M1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.T2) && (chat2 = this.T2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, c8.ha.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(launchActivity);
            hb0Var.setTextColor(-1);
            hb0Var.setSelectorColor(-9598483);
            hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            hb0Var.setItemCount(5);
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
            this.N1 = r20Var;
            r20Var.setLines(1);
            r20Var.setSingleLine(true);
            r20Var.setEllipsize(TextUtils.TruncateAt.END);
            r20Var.setGravity(17);
            r20Var.setTextColor(-1);
            r20Var.setTypeface(org.telegram.messenger.g0.o());
            r20Var.setTextSize(1, 14.0f);
            this.b.addView(r20Var, c8.ha.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r10 = 0;
            r20Var.setOnClickListener(new org.telegram.messenger.video.f(this, hb0Var, p20Var, q20Var, chat, cVar, inputPeer2, 1));
            t20 t20Var = new t20(launchActivity, hb0Var, p20Var, q20Var);
            this.L1 = t20Var;
            t20Var.setWeightSum(1.0f);
            t20Var.setOrientation(0);
            this.b.addView(t20Var, c8.ha.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i27 = calendar.get(1);
            int i28 = calendar.get(6);
            t20Var.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
            hb0Var.setMinValue(0);
            hb0Var.setMaxValue(365);
            hb0Var.setWrapSelectorWheel(false);
            hb0Var.setFormatter(new w00(currentTimeMillis, calendar, i27, 0));
            a1.d dVar = new a1.d(this, hb0Var, p20Var, q20Var, 14);
            f40Var = this;
            hb0Var.setOnValueChangedListener(dVar);
            p20Var.setMinValue(0);
            p20Var.setMaxValue(23);
            t20Var.addView(p20Var, c8.ha.l(0.2f, 0, org.telegram.messenger.qs.t4));
            p20Var.setFormatter(new org.telegram.ui.Components.il0(19));
            p20Var.setOnValueChangedListener(dVar);
            q20Var.setMinValue(0);
            q20Var.setMaxValue(59);
            q20Var.setValue(0);
            q20Var.setFormatter(new org.telegram.ui.Components.il0(20));
            t20Var.addView(q20Var, c8.ha.l(0.3f, 0, org.telegram.messenger.qs.t4));
            q20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i29 = calendar.get(6);
            int i30 = calendar.get(12);
            int i31 = calendar.get(11);
            hb0Var.setValue(i28 != i29 ? 1 : 0);
            q20Var.setValue(i30);
            p20Var.setValue(i31);
            org.telegram.ui.Components.u4.g(r20Var, textView, 0L, 604800L, 2, hb0Var, p20Var, q20Var);
        } else {
            f40Var = this;
            r10 = 0;
        }
        u20 u20Var = new u20(f40Var, (ViewGroup) f40Var.getWindow().getDecorView(), f40Var.b);
        f40Var.W3 = u20Var;
        u20Var.E = new v20(f40Var);
        e20Var.setPinchToZoomHelper(u20Var);
        f40Var.r1.setOnClickListener(new View.OnClickListener(f40Var) { // from class: org.telegram.ui.y00
            public final /* synthetic */ f40 b;

            {
                this.b = f40Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (r10) {
                    case 0:
                        f40 f40Var2 = this.b;
                        LaunchActivity launchActivity2 = f40Var2.c2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.c2.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.qs.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                f40Var2.T1(true, false);
                                f40Var2.S1(false);
                                f40Var2.U2.z();
                                f40Var2.Q0(true);
                                f40Var2.o1.requestLayout();
                                break;
                            } else {
                                f40Var2.d2[0].d(1, false);
                                if (f40Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    f40Var2.t2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.b.getPaddingBottom());
                                    f40Var2.c.addView(f40Var2.t2);
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
                        f40Var3.U3.e();
                        org.telegram.messenger.r3 r3Var22 = f40Var3.U2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            f40Var3.O1();
                            f40.w1(launchActivity, new v00(f40Var3, 5), false, false);
                            break;
                        } else {
                            f40Var3.dismiss();
                            break;
                        }
                }
            }
        });
        f40Var.R1(r10);
        f40Var.O1();
        f40Var.S1(r10);
        f40Var.T1(r10, r10);
        f40Var.G1(0.0f);
        f40Var.U1();
        f40Var.b.addView(new FrameLayout(launchActivity), c8.ha.e(-1, org.telegram.messenger.qs.e3, 87));
        f40Var.u1.setOnClickListener(new s00(f40Var, 5));
        f40Var.V0();
        c8.ka.a(f40Var.r1);
        c8.ka.a(f40Var.s1);
        c8.ka.a(f40Var.p1);
        c8.ka.a(f40Var.q1);
        c8.ka.a(f40Var.v1);
        c8.ka.a(f40Var.t1);
        c8.ka.a(f40Var.u1);
        r0.i0.l(f40Var.b, new u00(f40Var, 1));
    }

    public static void B1(org.telegram.messenger.r3 r3Var, boolean z9, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z9 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f;
            ArrayList arrayList2 = r3Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null) {
                r3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                r3Var.g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.ij.B1(((org.telegram.messenger.s3) arrayList.get(i7)).a.peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = r3Var.b;
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
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.v2, new Object[0]);
    }

    public static void I0(final f40 f40Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z9;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = f40Var.n1;
        ArrayList arrayList = f40Var.z2;
        z30 z30Var = f40Var.J1;
        if (view instanceof org.telegram.ui.Components.voip.r) {
            f40Var.h1(((org.telegram.ui.Components.voip.r) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f4) {
            f40Var.L1((org.telegram.ui.Cells.f4) view);
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (!(view instanceof org.telegram.ui.Cells.y3)) {
            if (i7 != z30Var.x) {
                if (i7 != z30Var.y) {
                    if (i7 == z30Var.D) {
                        f40Var.A1();
                        return;
                    }
                    return;
                }
                org.telegram.messenger.r3 r3Var2 = f40Var.U2;
                if (r3Var2 == null || r3Var2.b == null) {
                    return;
                }
                wg.f1 f1Var = new wg.f1(activity, f40Var.a, null, 4, new di.i0());
                org.telegram.messenger.r3 r3Var3 = f40Var.U2;
                f1Var.x2.addAll(r3Var3 != null ? (Collection) Collection.-EL.stream(r3Var3.e).map(new aa.l(12)).collect(Collectors.toSet()) : null);
                f1Var.o1(false, true);
                f1Var.v2 = new v00(f40Var, 3);
                f1Var.o1(false, true);
                f1Var.y2 = new bi.p5(17, f40Var, r3Var);
                f1Var.show();
                return;
            }
            if (org.telegram.messenger.t3.T(f40Var.T2) && (chat = f40Var.T2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                f40Var.m1(false);
                return;
            }
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.a).N0(f40Var.l1());
            if (N0 == null) {
                return;
            }
            f40Var.q2 = false;
            Context context = f40Var.getContext();
            int i12 = cVar.a;
            TLRPC.Chat chat2 = f40Var.T2;
            org.telegram.messenger.r3 r3Var4 = f40Var.U2;
            org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, i12, chat2, N0, r3Var4.d, r3Var4.n);
            f40Var.y3 = h20Var;
            h20Var.setOnDismissListener(new z00(f40Var, 2));
            org.telegram.ui.Components.h20 h20Var2 = f40Var.y3;
            h20Var2.a2 = new l10(f40Var);
            h20Var2.show();
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        if (y3Var.getUser() == null) {
            return;
        }
        if (!f40Var.r1()) {
            f40Var.c2.O0(f40Var.a);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", y3Var.getUser().id);
            if (y3Var.a.getImageReceiver().L()) {
                bundle.putBoolean("expandPhoto", true);
            }
            f40Var.c2.t0(new ProfileActivity(bundle, null));
            f40Var.dismiss();
            return;
        }
        int i13 = i7 - z30Var.n;
        if (i13 < 0 || i13 >= f40Var.U2.m.size()) {
            int i14 = i7 - z30Var.s;
            if (i14 < 0 || i14 >= f40Var.U2.l.size()) {
                int i15 = i7 - z30Var.f;
                if (f40Var.m2) {
                    if (i15 >= 0 && i15 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i15);
                        z9 = false;
                    }
                    l10 = null;
                    z9 = false;
                } else {
                    if (i15 >= 0 && i15 < f40Var.U2.j.size()) {
                        l10 = (Long) f40Var.U2.j.get(i15);
                        z9 = false;
                    }
                    l10 = null;
                    z9 = false;
                }
                if (z9 && (q3Var = (org.telegram.messenger.q3) f40Var.U2.k.get(l10)) != null) {
                    org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(f40Var.c, f40Var.I0, y3Var);
                    F.l(R.drawable.msg_endcall, org.telegram.messenger.id.M0(2131749460, null), new Runnable(f40Var) { // from class: org.telegram.ui.c10
                        public final /* synthetic */ f40 b;

                        {
                            this.b = f40Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                    declineconferencecallinvite.msg_id = q3Var2.a;
                                    final f40 f40Var2 = this.b;
                                    final int i16 = 1;
                                    ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.d10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var3 = f40Var2;
                                                    if (!z10) {
                                                        f40Var3.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var3.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var2;
                                                    if (!z11) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.r3 r3Var5 = f40Var2.U2;
                                    if (r3Var5 != null) {
                                        q3Var2.b = false;
                                        r3Var5.k.put(l10, q3Var2);
                                        f40Var2.Q0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                    declineconferencecallinvite2.msg_id = q3Var3.a;
                                    final f40 f40Var3 = this.b;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.d10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var32 = f40Var3;
                                                    if (!z10) {
                                                        f40Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var3;
                                                    if (!z11) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(q3Var3.a));
                                    org.telegram.messenger.qp.s1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.r3 r3Var6 = f40Var3.U2;
                                    if (r3Var6 != null) {
                                        ArrayList arrayList3 = r3Var6.j;
                                        Long l11 = l10;
                                        arrayList3.remove(l11);
                                        f40Var3.U2.n.remove(l11);
                                        f40Var3.U2.k.remove(l11);
                                        f40Var3.Q0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, q3Var.a());
                    F.c(R.drawable.msg_remove, org.telegram.messenger.id.M0(2131749471, null), new Runnable(f40Var) { // from class: org.telegram.ui.c10
                        public final /* synthetic */ f40 b;

                        {
                            this.b = f40Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                    declineconferencecallinvite.msg_id = q3Var2.a;
                                    final f40 f40Var2 = this.b;
                                    final int i16 = 1;
                                    ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.d10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var32 = f40Var2;
                                                    if (!z10) {
                                                        f40Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var2;
                                                    if (!z11) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.r3 r3Var5 = f40Var2.U2;
                                    if (r3Var5 != null) {
                                        q3Var2.b = false;
                                        r3Var5.k.put(l10, q3Var2);
                                        f40Var2.Q0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                    declineconferencecallinvite2.msg_id = q3Var3.a;
                                    final f40 f40Var3 = this.b;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.d10
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var32 = f40Var3;
                                                    if (!z10) {
                                                        f40Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    f40 f40Var4 = f40Var3;
                                                    if (!z11) {
                                                        f40Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(q3Var3.a));
                                    org.telegram.messenger.qp.s1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.r3 r3Var6 = f40Var3.U2;
                                    if (r3Var6 != null) {
                                        ArrayList arrayList3 = r3Var6.j;
                                        Long l11 = l10;
                                        arrayList3.remove(l11);
                                        f40Var3.U2.n.remove(l11);
                                        f40Var3.U2.k.remove(l11);
                                        f40Var3.Q0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    F.W(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.w2.getColor()));
                    F.s = 96;
                    F.Z();
                }
                return;
            }
            l10 = (Long) f40Var.U2.l.get(i7 - z30Var.s);
        } else {
            l10 = (Long) f40Var.U2.m.get(i7 - z30Var.n);
        }
        z9 = true;
        if (z9) {
            return;
        }
        org.telegram.ui.Components.k60 F2 = org.telegram.ui.Components.k60.F(f40Var.c, f40Var.I0, y3Var);
        F2.l(R.drawable.msg_endcall, org.telegram.messenger.id.M0(2131749460, null), new Runnable(f40Var) { // from class: org.telegram.ui.c10
            public final /* synthetic */ f40 b;

            {
                this.b = f40Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var2 = q3Var;
                        declineconferencecallinvite.msg_id = q3Var2.a;
                        final f40 f40Var2 = this.b;
                        final int i16 = 1;
                        ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.d10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        boolean z10 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var2;
                                        if (!z10) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var2;
                                        if (!z11) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.r3 r3Var5 = f40Var2.U2;
                        if (r3Var5 != null) {
                            q3Var2.b = false;
                            r3Var5.k.put(l10, q3Var2);
                            f40Var2.Q0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var3 = q3Var;
                        declineconferencecallinvite2.msg_id = q3Var3.a;
                        final f40 f40Var3 = this.b;
                        final int i17 = 0;
                        ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.d10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z10 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var3;
                                        if (!z10) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var3;
                                        if (!z11) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(q3Var3.a));
                        org.telegram.messenger.qp.s1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.r3 r3Var6 = f40Var3.U2;
                        if (r3Var6 != null) {
                            ArrayList arrayList3 = r3Var6.j;
                            Long l11 = l10;
                            arrayList3.remove(l11);
                            f40Var3.U2.n.remove(l11);
                            f40Var3.U2.k.remove(l11);
                            f40Var3.Q0(true);
                            break;
                        }
                        break;
                }
            }
        }, q3Var.a());
        F2.c(R.drawable.msg_remove, org.telegram.messenger.id.M0(2131749471, null), new Runnable(f40Var) { // from class: org.telegram.ui.c10
            public final /* synthetic */ f40 b;

            {
                this.b = f40Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var2 = q3Var;
                        declineconferencecallinvite.msg_id = q3Var2.a;
                        final f40 f40Var2 = this.b;
                        final int i16 = 1;
                        ConnectionsManager.getInstance(f40Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.d10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        boolean z10 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var2;
                                        if (!z10) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var2;
                                        if (!z11) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.r3 r3Var5 = f40Var2.U2;
                        if (r3Var5 != null) {
                            q3Var2.b = false;
                            r3Var5.k.put(l10, q3Var2);
                            f40Var2.Q0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var3 = q3Var;
                        declineconferencecallinvite2.msg_id = q3Var3.a;
                        final f40 f40Var3 = this.b;
                        final int i17 = 0;
                        ConnectionsManager.getInstance(f40Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.d10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z10 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var32 = f40Var3;
                                        if (!z10) {
                                            f40Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        f40 f40Var4 = f40Var3;
                                        if (!z11) {
                                            f40Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.qp.s1(f40Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(q3Var3.a));
                        org.telegram.messenger.qp.s1(f40Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.r3 r3Var6 = f40Var3.U2;
                        if (r3Var6 != null) {
                            ArrayList arrayList3 = r3Var6.j;
                            Long l11 = l10;
                            arrayList3.remove(l11);
                            f40Var3.U2.n.remove(l11);
                            f40Var3.U2.k.remove(l11);
                            f40Var3.Q0(true);
                            break;
                        }
                        break;
                }
            }
        }, false);
        F2.W(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.w2.getColor()));
        F2.s = 96;
        F2.Z();
    }

    public static void J0(f40 f40Var, org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (f40Var.I) {
            return;
        }
        if (z9 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(f40Var.S3, f40Var.U3, rVar, null, null, rVar.getParticipant(), f40Var.U2, f40Var));
        } else {
            if (z9 || rVar.getRenderer() == null) {
                return;
            }
            rVar.getRenderer().setPrimaryView(null);
            rVar.setRenderer(null);
        }
    }

    public static void K0(f40 f40Var, int i7, int[] iArr) {
        if (f40Var.u1()) {
            int i10 = org.telegram.ui.ActionBar.m6.yh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.nh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.mh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.nh, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.uh, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ph, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.qh, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.oh, false);
        } else if (s1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ai, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.yh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        }
        if (s1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ph, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.th, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.vh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.xh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wh, false));
        }
    }

    public static void K1(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        if (z0Var != null) {
            z0Var.d(i7, i7);
        }
    }

    public static String L0() {
        return org.telegram.messenger.j6.i[(int) Math.floor(Math.random() * 8)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void M0(f40 f40Var) {
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        if (r3Var == null || r3Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var2 = f40Var.U2;
        togglegroupcallsettings.call = r3Var2.g(r3Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(f40Var.U2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.n1.a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new e10(f40Var, 1));
    }

    public static void N0(f40 f40Var, boolean z9) {
        if (f40Var.U2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        togglegroupcallsettings.call = r3Var.g(r3Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z9);
        f40Var.r5 = Boolean.valueOf(z9);
        f40Var.N1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.n1.a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new e10(f40Var, 0));
    }

    public static int O0(f40 f40Var, int i7) {
        p10 p10Var = f40Var.o1;
        org.telegram.ui.Components.voip.r g12 = f40Var.g1();
        if (g12 == null) {
            return TLObject.FLAG_31;
        }
        int measuredHeight = ((p10Var.getMeasuredHeight() / 2) + p10Var.getTop()) - (f40Var.t1.getMeasuredHeight() / 2);
        int measuredHeight2 = g12.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i7;
        return jg.g.D(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void P0(f40 f40Var) {
        c30 c30Var = f40Var.I1;
        n30 n30Var = f40Var.K1;
        int childCount = n30Var.getChildCount();
        float f10 = 2.14748365E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (RecyclerView.R(n30Var.getChildAt(i7)) >= 0) {
                f10 = Math.min(f10, r8.getTop());
            }
        }
        if (f10 < 0.0f || f10 == 2.14748365E9f) {
            f10 = childCount != 0 ? 0.0f : n30Var.getPaddingTop();
        }
        int i10 = 1;
        boolean z9 = f10 <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)));
        float L = f10 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z9 && c30Var.getTag() == null) || (!z9 && c30Var.getTag() != null)) {
            c30Var.setTag(z9 ? 1 : null);
            AnimatorSet animatorSet = f40Var.b2;
            if (animatorSet != null) {
                animatorSet.cancel();
                f40Var.b2 = null;
            }
            f40Var.G0(c30Var.getTag() == null);
            ViewPropertyAnimator duration = c30Var.getBackButton().animate().scaleX(z9 ? 1.0f : 0.9f).scaleY(z9 ? 1.0f : 0.9f).translationX(z9 ? 0.0f : -org.telegram.messenger.g0.L(14.0f)).setDuration(300L);
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
            duration.setInterpolator(wqVar).start();
            c30Var.getTitleTextView().animate().translationY(z9 ? 0.0f : org.telegram.messenger.g0.L(23.0f)).setDuration(300L).setInterpolator(wqVar).start();
            ObjectAnimator objectAnimator = f40Var.O4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                f40Var.O4.cancel();
            }
            org.telegram.ui.ActionBar.m5 subtitleTextView = c30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.m5, Float>) property, c30Var.getSubtitleTextView().getTranslationY(), z9 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
            f40Var.O4 = ofFloat;
            ofFloat.setDuration(300L);
            f40Var.O4.setInterpolator(wqVar);
            f40Var.O4.addListener(new org.telegram.ui.Components.s9(29, f40Var, z9));
            f40Var.O4.start();
            ObjectAnimator objectAnimator2 = f40Var.P4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c30Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.m5, Float>) property, z9 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
            f40Var.P4 = ofFloat2;
            ofFloat2.setDuration(300L);
            f40Var.P4.setInterpolator(wqVar);
            f40Var.P4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            f40Var.b2 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = f40Var.b2;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(c30Var, (Property<c30, Float>) property2, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(f40Var.H1, (Property<v10, Float>) property2, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(f40Var.a2, (Property<View, Float>) property2, z9 ? 1.0f : 0.0f));
            f40Var.b2.addListener(new a30(f40Var, i10));
            f40Var.b2.start();
            f40Var.U3.w.setClickable(!z9 || z5);
        }
        if (f40Var.s2 != L) {
            f40Var.J1(L);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        if (x5 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                x5 = new f40(launchActivity, cVar, org.telegram.messenger.qp.s1(cVar.a).g1(chat.id, false, null), chat, inputPeer, z9, str);
            } else {
                org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                if (r3Var == null) {
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(r3Var.c));
                r3Var.b(true);
                x5 = new f40(launchActivity, cVar, r3Var, M0, null, z9, str);
            }
            x5.c2 = launchActivity;
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(17));
        }
    }

    public static String i1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 0) {
            return org.telegram.messenger.id.M0(2131743499, null);
        }
        if (i7 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.id.M0(2131743500, null) : org.telegram.messenger.id.M0(2131743501, null);
        }
        if (i7 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.id.M0(2131743503, null) : str;
    }

    public static String j1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i7 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.id.M0(2131743498, null) : org.telegram.messenger.id.a0(null, null, 2131743497, str) : i7 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.id.M0(2131743495, null) : org.telegram.messenger.id.M0(2131743496, null) : org.telegram.messenger.id.M0(2131743494, null);
    }

    public static boolean s1(int i7) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.b.rtmp_stream) || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7;
    }

    public static void w1(Context context, Runnable runnable, boolean z9, boolean z10) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        int i7 = 0;
        if (z10 || !org.telegram.messenger.t3.w(14, chat)) {
            B1(r3Var, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        boolean isConference = sharedInstance.isConference();
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (isConference) {
            u1Var.R = org.telegram.messenger.id.M0(2131743468, null);
            u1Var.T = org.telegram.messenger.id.M0(2131743469, null);
        } else if (org.telegram.messenger.t3.W(chat)) {
            u1Var.R = org.telegram.messenger.id.M0(2131743471, null);
            u1Var.T = org.telegram.messenger.id.M0(2131743472, null);
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131743361, null);
            u1Var.T = org.telegram.messenger.id.M0(2131743362, null);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.b) != null && groupCall.creator)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
            c2VarArr[0] = c2Var;
            c2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            if (z9) {
                c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false));
            } else {
                c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.m6.fh;
                int i11 = org.telegram.ui.ActionBar.m6.dh;
                int i12 = org.telegram.ui.ActionBar.m6.bh;
                checkBoxSquare.s = i10;
                checkBoxSquare.w = i11;
                checkBoxSquare.x = i12;
                checkBoxSquare.invalidate();
            }
            c2VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                c2VarArr[0].e(org.telegram.messenger.id.M0(2131743470, null), "", false, false, false);
            } else if (org.telegram.messenger.t3.W(chat)) {
                c2VarArr[0].e(org.telegram.messenger.id.M0(2131743473, null), "", false, false, false);
            } else {
                c2VarArr[0].e(org.telegram.messenger.id.M0(2131743363, null), "", false, false, false);
            }
            c2VarArr[0].setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
            f10.addView(c2VarArr[0], c8.ha.o(-1, -2));
            c2VarArr[0].setOnClickListener(new b10(c2VarArr, i7));
        }
        alertDialog$Builder.o(f10);
        u1Var.I = org.telegram.ui.ActionBar.m6.dh;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743364, null), new bg.e0(r3Var, c2VarArr, selfId, runnable, 4));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        if (z9) {
            u1Var.P0 = false;
        }
        if (z9) {
            if (Build.VERSION.SDK_INT >= 26) {
                u1Var.getWindow().setType(2038);
            } else {
                u1Var.getWindow().setType(2003);
            }
            u1Var.getWindow().clearFlags(2);
        }
        if (!z9) {
            u1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ih, false));
        }
        u1Var.show();
        if (z9) {
            return;
        }
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.jh, null);
        }
        u1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
    }

    public final void A1() {
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var == null || r3Var.b == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
        u1Var.r(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.U2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new z9(this, u1Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.String, org.telegram.ui.ActionBar.h6] */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean[], java.lang.String, org.telegram.ui.ActionBar.h6, org.telegram.ui.ActionBar.r1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public final void C1(TLRPC.GroupCallParticipant groupCallParticipant, final long j3, int i7) {
        String str;
        ?? r13;
        TextView textView;
        int i10;
        String str2;
        String str3;
        ?? r132;
        int i11;
        String str4;
        int i12;
        EditText editText;
        String str5;
        float f10;
        String M0;
        int i13;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.messenger.c cVar = this.n1;
        TLObject a22 = i14 > 0 ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(j3)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(-j3));
        int i15 = 5;
        if (i7 == 0 || i7 == 2 || i7 == 3) {
            if (i7 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(a22, Boolean.TRUE, null, null, null, null);
                n1().k(0L, 30, a22, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i16 = org.telegram.ui.ActionBar.m6.dh;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.I = i16;
            TextView textView2 = new TextView(getContext());
            int i17 = org.telegram.ui.ActionBar.m6.Vg;
            org.telegram.ui.ActionBar.t6.U(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            v8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(k9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            v8Var.p(a22);
            boolean z9 = a22 instanceof TLRPC.User;
            if (z9) {
                TLRPC.User user = (TLRPC.User) a22;
                k9Var.e(user, v8Var);
                str = org.telegram.messenger.t10.j(user, true);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) a22;
                k9Var.e(chat, v8Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            org.telegram.messenger.k5.n(textView3, i17, null, 1, 20.0f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.T2;
            String str6 = chat2 != null ? chat2.title : "";
            if (i7 != 2) {
                textView3.setText(org.telegram.messenger.id.M0(2131743402, null));
                org.telegram.messenger.k5.r(null, null, 2131743403, new Object[]{str, str6}, textView2);
            } else if (r1()) {
                textView3.setText(org.telegram.messenger.id.M0(2131743421, null));
                org.telegram.messenger.k5.r(null, null, 2131743422, new Object[]{str}, textView2);
            } else {
                textView3.setText(org.telegram.messenger.id.M0(2131743345, null));
                if (org.telegram.messenger.t3.W(this.T2)) {
                    org.telegram.messenger.k5.r(null, null, 2131743464, new Object[]{str, str6}, textView2);
                } else {
                    org.telegram.messenger.k5.r(null, null, 2131743346, new Object[]{str, str6}, textView2);
                }
            }
            boolean z10 = org.telegram.messenger.id.a0;
            frameLayout.addView(textView3, c8.ha.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i7 == 2) {
                r13 = 0;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743311, null), new su(5, this, a22));
            } else {
                r13 = 0;
                r13 = 0;
                if (z9) {
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743404, null), new bi.i(this, (TLRPC.User) a22, j3, 6));
                }
            }
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, r13), r13);
            u1Var.j(org.telegram.ui.ActionBar.m6.x0(r13, org.telegram.ui.ActionBar.m6.ih, false));
            u1Var.show();
            if (i7 != 2 || (textView = (TextView) u1Var.d(-1)) == null) {
                return;
            }
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.jh, r13);
            return;
        }
        if (i7 == 6) {
            this.c2.O0(this.a);
            Bundle bundle = new Bundle();
            if (i14 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            this.c2.t0(new cn(bundle));
            dismiss();
            return;
        }
        int i18 = 8;
        if (i7 == 8) {
            this.c2.O0(this.a);
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c2.M().getFragmentStack().get(this.c2.M().getFragmentStack().size() - 1);
            if ((f2Var instanceof cn) && ((cn) f2Var).a() == j3) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (i14 > 0) {
                bundle2.putLong("user_id", j3);
            } else {
                bundle2.putLong("chat_id", -j3);
            }
            this.c2.t0(new cn(bundle2));
            dismiss();
            return;
        }
        int i19 = 7;
        if (i7 == 7) {
            sharedInstance.editCallMember(a22, Boolean.TRUE, null, null, Boolean.FALSE, null);
            P1(2, true);
            return;
        }
        if (i7 == 9) {
            org.telegram.ui.Components.j30 j30Var = this.b4;
            if (j30Var == null || !j30Var.g()) {
                TLRPC.User f11 = org.telegram.messenger.p10.i(cVar.a).f();
                org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(0, true, true);
                this.b4 = j30Var2;
                j30Var2.H = true;
                j30Var2.R = true;
                j30Var2.G = true;
                j30Var2.J = true;
                j30Var2.S = true;
                j30Var2.a = this.c2.M().getLastFragment();
                org.telegram.ui.Components.j30 j30Var3 = this.b4;
                o30 o30Var = new o30(this, j3);
                this.c4 = o30Var;
                j30Var3.b = o30Var;
                TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                j30Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new v00(this, i18), new fi.d1(i15), 0);
                return;
            }
            return;
        }
        if (i7 == 10) {
            String str7 = groupCallParticipant.about;
            Context context = getContext();
            int i20 = this.a;
            Pattern pattern = org.telegram.ui.Components.u4.a;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
            if (i14 > 0) {
                str5 = null;
                f10 = 8.0f;
                M0 = org.telegram.messenger.id.M0(2131743765, null);
            } else {
                str5 = null;
                f10 = 8.0f;
                M0 = org.telegram.messenger.id.M0(2131751459, null);
            }
            String str8 = M0;
            final org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.R = str8;
            u1Var2.T = org.telegram.messenger.id.M0(i14 > 0 ? 2131743396 : 2131751462, str5);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            if (i14 < 0) {
                i13 = i14;
                long j10 = -j3;
                if (org.telegram.messenger.qp.s1(i20).N0(j10) == null) {
                    org.telegram.messenger.qp.s1(i20).V2(ConnectionsManager.generateClassGuid(), j10, true);
                }
            } else {
                i13 = i14;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i21 = org.telegram.ui.ActionBar.m6.Vg;
            org.telegram.ui.ActionBar.t6.U(editText2, i21, null);
            editText2.setHint(org.telegram.messenger.id.M0(i13 <= 0 ? 2131751459 : 2131743765, null));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.m6.U(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i22 = i13 > 0 ? 70 : org.telegram.messenger.qs.e4;
            editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.l3(i22, context, numberTextView)});
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, false));
            numberTextView.setImportantForAccessibility(2);
            frameLayout2.addView(numberTextView, c8.ha.d(20, 20.0f, org.telegram.messenger.id.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(f10));
            editText2.addTextChangedListener(new org.telegram.ui.Components.sp(i22, numberTextView));
            org.telegram.messenger.g0.Z3(numberTextView, false, 0.0f, true, false);
            editText2.setText(str7);
            editText2.setSelection(editText2.getText().toString().length());
            alertDialog$Builder2.o(frameLayout2);
            final c4.n nVar = new c4.n(j3, i20, editText2, 3);
            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131745946, null), nVar);
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var2.N = new org.telegram.ui.Components.h1(editText2, 1);
            frameLayout2.addView(editText2, c8.ha.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            org.telegram.messenger.g0.K3(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.o1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i23, KeyEvent keyEvent) {
                    if (i23 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
                        if (u1Var3.isShowing()) {
                            nVar.g(u1Var3, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            u1Var2.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ih, false));
            u1Var2.show();
            u1Var2.p(org.telegram.ui.ActionBar.m6.x0(null, i21, false));
            return;
        }
        if (i7 != 11) {
            if (i7 == 5) {
                sharedInstance.editCallMember(a22, Boolean.TRUE, null, null, null, null);
                n1().m(0L, a22, 35);
                sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                return;
            }
            if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                i10 = 1;
                sharedInstance.editCallMember(a22, Boolean.FALSE, null, null, null, null);
            } else {
                groupCallParticipant.volume = 10000;
                groupCallParticipant.volume_by_admin = false;
                i10 = 1;
                sharedInstance.editCallMember(a22, Boolean.FALSE, null, 10000, null, null);
            }
            sharedInstance.setParticipantVolume(groupCallParticipant, org.telegram.messenger.t3.H(groupCallParticipant));
            n1().k(0L, i7 == i10 ? 31 : 36, a22, null, null, null);
            return;
        }
        Context context2 = getContext();
        int i23 = this.a;
        Pattern pattern2 = org.telegram.ui.Components.u4.a;
        if (org.telegram.messenger.m5.E(j3)) {
            TLRPC.User a23 = org.telegram.messenger.qp.s1(i23).a2(Long.valueOf(j3));
            str2 = a23.first_name;
            str3 = a23.last_name;
        } else {
            str2 = org.telegram.messenger.qp.s1(i23).M0(Long.valueOf(-j3)).title;
            str3 = null;
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
        if (i14 > 0) {
            i11 = 2131743415;
            r132 = 0;
        } else {
            r132 = 0;
            i11 = 2131743414;
        }
        String M02 = org.telegram.messenger.id.M0(i11, r132);
        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
        u1Var3.R = M02;
        LinearLayout f12 = org.telegram.messenger.k5.f(context2, 1);
        EditText editText3 = new EditText(context2);
        int i24 = org.telegram.ui.ActionBar.m6.Vg;
        org.telegram.ui.ActionBar.t6.U(editText3, i24, r132);
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(i14 > 0 ? 5 : 6);
        if (i14 > 0) {
            i12 = 2131750694;
            str4 = null;
        } else {
            str4 = null;
            i12 = 2131743413;
        }
        editText3.setHint(org.telegram.messenger.id.M0(i12, str4));
        editText3.setBackground(org.telegram.ui.ActionBar.m6.U(context2));
        editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        editText3.requestFocus();
        if (i14 > 0) {
            editText = new EditText(context2);
            org.telegram.ui.ActionBar.t6.U(editText, i24, null);
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(org.telegram.messenger.id.M0(2131749032, null));
            editText.setBackground(org.telegram.ui.ActionBar.m6.U(context2));
            editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        } else {
            editText = null;
        }
        org.telegram.messenger.g0.K3(editText3);
        f12.addView(editText3, c8.ha.t(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            f12.addView(editText, c8.ha.t(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder3.o(f12);
        org.telegram.ui.ActionBar.r1 n1Var = new hi.n1(editText3, j3, i23, editText);
        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131745946, null), n1Var);
        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
        u1Var3.N = new bi.u3(i19, editText3, editText);
        u1Var3.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ih, false));
        u1Var3.show();
        u1Var3.p(org.telegram.ui.ActionBar.m6.x0(null, i24, false));
        nd ndVar = new nd(1, u1Var3, n1Var);
        if (editText != null) {
            editText.setOnEditorActionListener(ndVar);
        } else {
            editText3.setOnEditorActionListener(ndVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(boolean z9, org.telegram.ui.Cells.f4 f4Var) {
        int i7;
        float f10;
        final float f11;
        float f12;
        org.telegram.ui.Components.voip.y yVar;
        org.telegram.ui.Components.voip.y yVar2;
        float paddingLeft = this.b.getPaddingLeft() + org.telegram.messenger.g0.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + org.telegram.messenger.g0.L(14.0f);
        boolean z10 = this.V4;
        e20 e20Var = this.l1;
        n30 n30Var = this.K1;
        if (z10) {
            f11 = (n30Var.getX() + (f4Var.getX() + f4Var.getAvatarImageView().getX())) - paddingLeft;
            f10 = (n30Var.getY() + (f4Var.getY() + f4Var.getAvatarImageView().getY())) - paddingTop;
            f12 = f4Var.getAvatarImageView().getMeasuredHeight() / n30Var.getMeasuredWidth();
            i7 = (int) ((f4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f12);
        } else {
            if (this.T4 == null) {
                this.I4 = true;
            } else {
                this.I4 = z9 || e20Var.D0.k(e20Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.r rVar = this.S4;
            c20 c20Var = this.U3;
            if (rVar == null || !this.I4) {
                org.telegram.ui.Components.g10 g10Var = this.U4;
                if (g10Var != null) {
                    org.telegram.ui.Components.voip.y yVar3 = this.T4;
                    y10 y10Var = this.g4;
                    if (yVar3 == null) {
                        float x10 = (c20Var.getX() + (y10Var.getX() + (this.U4.getX() + g10Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y10 = (c20Var.getY() + (y10Var.getY() + (this.U4.getY() + this.U4.getAvatarImageView().getY()))) - paddingTop;
                        f12 = this.U4.getAvatarImageView().getMeasuredHeight() / n30Var.getMeasuredWidth();
                        i7 = (int) ((this.U4.getAvatarImageView().getMeasuredHeight() >> 1) / f12);
                        f10 = y10;
                        f11 = x10;
                        if (!this.I4 && (yVar = this.T4) != null) {
                            yVar.invalidate();
                            c20Var.invalidate();
                            org.telegram.ui.Components.voip.y yVar4 = this.T4;
                            yVar4.h = false;
                            yVar4.j(false);
                            this.T4 = null;
                        }
                    } else if (this.I4) {
                        f11 = (c20Var.getX() + (y10Var.getX() + g10Var.getX())) - paddingLeft;
                        f10 = (c20Var.getY() + (y10Var.getY() + this.U4.getY())) - paddingTop;
                        i7 = 0;
                    }
                }
                i7 = 0;
                f10 = 0.0f;
                f11 = 0.0f;
                f12 = 0.96f;
                if (!this.I4) {
                    yVar.invalidate();
                    c20Var.invalidate();
                    org.telegram.ui.Components.voip.y yVar42 = this.T4;
                    yVar42.h = false;
                    yVar42.j(false);
                    this.T4 = null;
                }
            } else {
                float x11 = (n30Var.getX() + rVar.getX()) - paddingLeft;
                f10 = ((n30Var.getY() + this.S4.getY()) + org.telegram.messenger.g0.L(2.0f)) - paddingTop;
                i7 = 0;
                f11 = x11;
            }
            f12 = 1.0f;
            if (!this.I4) {
            }
        }
        final float f13 = f10;
        final float f14 = f12;
        d20 d20Var = this.x4;
        if (z9) {
            f20 f20Var = this.w4;
            f20Var.setScaleX(f14);
            f20Var.setScaleY(f14);
            f20Var.setTranslationX(f11);
            f20Var.setTranslationY(f13);
            d20Var.setAlpha(0.0f);
        }
        e20Var.N(i7, i7);
        if (this.a4) {
            h20 h20Var = this.V3;
            if (z9) {
                h20Var.setAlpha(0.0f);
            }
            org.telegram.messenger.camera.q.k(h20Var.animate(), z9 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.camera.q.k(d20Var.animate(), z9 ? 1.0f : 0.0f, 220L);
        if (!z9 && (yVar2 = this.T4) != null) {
            yVar2.h = false;
            yVar2.j(true);
            if (e20Var.D0.k(e20Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.u uVar = this.T4.a;
                uVar.E = false;
                uVar.F = 0L;
                this.S4 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
        final int i10 = i7;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.a10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var = f40.this;
                f40Var.X3 = floatValue;
                f40Var.U3.n = floatValue;
                float f15 = (floatValue * 1.0f) + ((1.0f - floatValue) * f14);
                f20 f20Var2 = f40Var.w4;
                f20Var2.setScaleX(f15);
                f20Var2.setScaleY(f15);
                f20Var2.setTranslationX((1.0f - f40Var.X3) * f11);
                f20Var2.setTranslationY((1.0f - f40Var.X3) * f13);
                if (!f40Var.a4) {
                    f40Var.Q4.setAlpha((int) (f40Var.X3 * 100.0f));
                }
                org.telegram.ui.Components.voip.y yVar5 = f40Var.T4;
                if (yVar5 != null) {
                    yVar5.a.setRoundCorners((1.0f - f40Var.X3) * org.telegram.messenger.g0.L(8.0f));
                }
                f20Var2.invalidate();
                f40Var.b.invalidate();
                e20 e20Var2 = f40Var.l1;
                int i11 = (int) ((1.0f - f40Var.X3) * i10);
                e20Var2.N(i11, i11);
            }
        });
        this.X4 = org.telegram.messenger.qs.f(this.n1.a).q(new int[]{org.telegram.messenger.qs.b0, org.telegram.messenger.qs.Y1, org.telegram.messenger.qs.D}, this.X4, true);
        org.telegram.ui.Components.voip.y yVar5 = this.S4 != null ? this.T4 : null;
        if (yVar5 != null) {
            yVar5.f = true;
        }
        ofFloat.addListener(new ai.g0(this, yVar5, z9, 10));
        if (this.V4 || this.T4 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.wq.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.wq.f);
            ofFloat.setDuration(220L);
            this.T4.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.u uVar2 = this.T4.a;
            if (uVar2.E) {
                uVar2.G.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        U0();
    }

    public final void E1() {
        m4 m4Var = this.u4;
        org.telegram.messenger.g0.r(m4Var);
        if (!this.t4 || this.O2 == null || VoIPService.getSharedInstance() == null || !u1() || this.K1 == null || !org.telegram.messenger.sc.e(512)) {
            return;
        }
        org.telegram.messenger.g0.i3(m4Var, 30L);
    }

    public final void F1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        this.B1.setText("");
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var == null || r3Var.b == null || (g10 = r3Var.g(r3Var.a)) == null) {
            return;
        }
        org.telegram.messenger.r3 r3Var2 = this.U2;
        long j3 = r3Var2.b.id;
        TLRPC.Peer peer = r3Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? org.telegram.messenger.m5.o(peer) : org.telegram.messenger.p10.i(this.a).n, tL_textWithEntities, j3, g10);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void G1(float f10) {
        this.O3 = f10;
        c20 c20Var = this.U3;
        float max = Math.max(f10, c20Var == null ? 0.0f : c20Var.c);
        int i7 = org.telegram.ui.ActionBar.m6.Xg;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.Ug;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.P3 = S0;
        this.H1.setBackgroundColor(S0);
        this.e3.H(-14472653);
        this.Z1.setColorFilter(new PorterDuffColorFilter(this.P3, PorterDuff.Mode.MULTIPLY));
        this.G0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hh, false));
        g.b bVar = this.j2;
        if (bVar != null) {
            bVar.b = S02;
            o00 o00Var = (o00) bVar.i;
            if (o00Var != null) {
                o00Var.invalidate();
            }
        }
        this.w2.setColor(S02);
        this.y1.setColor(S02);
        this.z1.invalidate();
        n30 n30Var = this.K1;
        n30Var.setGlowColor(S02);
        int i11 = this.z3;
        if (i11 == 3 || s1(i11)) {
            this.v1.invalidate();
        }
        View view = this.D4;
        if (view != null) {
            int i12 = this.P3;
            int[] iArr = this.G4;
            iArr[0] = i12;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.F4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.F4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.E4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.rh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.sh, false));
        this.t1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ch, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.fh, false));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0);
        int childCount = n30Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = n30Var.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                if (r1()) {
                    z3Var.a(w02, w02);
                } else {
                    z3Var.a(S05, S04);
                }
            } else {
                boolean z9 = childAt instanceof org.telegram.ui.Cells.f4;
                c30 c30Var = this.I1;
                if (z9) {
                    ((org.telegram.ui.Cells.f4) childAt).f(c30Var.getTag() != null ? org.telegram.ui.ActionBar.m6.fh : org.telegram.ui.ActionBar.m6.ah, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    ((org.telegram.ui.Cells.y3) childAt).a(c30Var.getTag() != null ? org.telegram.ui.ActionBar.m6.fh : org.telegram.ui.ActionBar.m6.ah, S05);
                }
            }
        }
        this.b.invalidate();
        n30Var.invalidate();
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean H() {
        return !this.U3.b;
    }

    public final void H1(float f10) {
        n30 n30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        v4.d1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f10 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var == null || (n30Var = this.K1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.ij.B1(this.u2))) == null) {
            return;
        }
        c20 c20Var = this.U3;
        if (c20Var.b) {
            int i7 = 0;
            while (true) {
                y10 y10Var = this.g4;
                if (i7 >= y10Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) y10Var.getChildAt(i7);
                if (org.telegram.messenger.ij.B1(g10Var.getParticipant().peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                    g10Var.setAmplitude(f10 * 15.0f);
                }
                i7++;
            }
        } else {
            int indexOf = (this.m2 ? this.x2 : this.U2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = n30Var.K(indexOf + this.J1.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                    if (view == this.R4 && !this.f4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        c20Var.k(groupCallParticipant, f10 * 15.0f);
    }

    public final void I1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.a5 = i7;
        this.b5 = i10;
        this.c5 = i11;
        this.d5 = i12;
        this.e5 = i13;
        this.f5 = i14;
        this.g5 = i15;
        this.h5 = i16;
        this.i5 = i17;
        this.j5 = i18;
        this.k5 = i19;
        this.l5 = i20;
        this.m5 = i21;
        this.n5 = i22;
        this.o5 = i23;
        this.p5 = i24;
    }

    public final void J1(float f10) {
        int i7;
        this.s2 = f10;
        this.K1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float L = f10 - org.telegram.messenger.g0.L(74.0f);
        float f11 = this.s0 + L;
        float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2;
        u30 u30Var = this.O2;
        c20 c20Var = this.U3;
        w10 w10Var = this.Z2;
        u10 u10Var = this.Y2;
        if (f11 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - L) - this.s0) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((r0 - this.s0) - org.telegram.messenger.g0.L(14.0f))));
            i7 = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 17.0f : 13.0f) * min);
            if (u30Var != null) {
                u30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.O3) > 1.0E-4f) {
                G1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.f1.x(min, 0.1f, 1.2f, 1.0f);
            u10Var.setScaleX(Math.max(0.9f, x10));
            u10Var.setScaleY(Math.max(0.9f, x10));
            float f12 = 1.0f - (min * 1.2f);
            u10Var.setAlpha((1.0f - c20Var.c) * Math.max(0.0f, f12));
            w10Var.setScaleX(Math.max(0.9f, x10));
            w10Var.setScaleY(Math.max(0.9f, x10));
            w10Var.setAlpha((1.0f - c20Var.c) * Math.max(0.0f, f12));
        } else {
            u10Var.setScaleX(1.0f);
            u10Var.setScaleY(1.0f);
            u10Var.setAlpha(1.0f - c20Var.c);
            w10Var.setScaleX(1.0f);
            w10Var.setScaleY(1.0f);
            w10Var.setAlpha(1.0f - c20Var.c);
            if (this.O3 > 1.0E-4f) {
                G1(0.0f);
            }
            i7 = 0;
        }
        a1();
        float f13 = i7;
        this.t3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.d3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (u30Var != null) {
            u30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        t20 t20Var = this.L1;
        if (t20Var != null) {
            t20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.b.invalidate();
        W1();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        c20 c20Var = this.U3;
        if (c20Var != null) {
            if (this.k4 != null) {
                this.K1.getViewTreeObserver().removeOnPreDrawListener(this.k4);
                this.k4 = null;
            }
            ArrayList arrayList = this.T3;
            arrayList.clear();
            ArrayList arrayList2 = this.S3;
            arrayList.addAll(arrayList2);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).f();
                c20Var.removeView((View) arrayList.get(i7));
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).e();
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).b(true);
            }
            arrayList2.clear();
            if (c20Var.getParent() != null) {
                arrayList2.clear();
                this.b.removeView(c20Var);
            }
        }
        super.K();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (x5 == this) {
            x5 = null;
        }
        y5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.p10.k(getContext());
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            r3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x04be, code lost:
    
        if (org.telegram.messenger.t3.w(2, r35.T2) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0308, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0323, code lost:
    
        if (r12 == (-l1())) goto L108;
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
    public final boolean L1(View view) {
        org.telegram.ui.Cells.f4 f4Var;
        c40 c40Var;
        Integer num;
        Integer num2;
        ViewGroup viewGroup;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num3;
        boolean z9;
        int i7;
        TLRPC.GroupCall groupCall;
        long j3;
        org.telegram.messenger.hc m10;
        org.telegram.messenger.hc m11;
        boolean z10;
        o30 o30Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        int y10;
        float y11;
        int measuredHeight;
        int i10;
        boolean z11;
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
        if (!this.R1.k() && getContext() != null) {
            if (this.W4 || this.Z3) {
                f1(true);
                return false;
            }
            h30 h30Var = this.Z4;
            if (h30Var != null) {
                h30Var.dismiss();
                this.Z4 = null;
                return false;
            }
            d1();
            if (view instanceof org.telegram.ui.Components.voip.r) {
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                if (rVar.getParticipant() != this.U2.z) {
                    f4Var = new org.telegram.ui.Cells.f4(rVar.getContext());
                    f4Var.e(this.n1, rVar.getParticipant().a, this.U2, org.telegram.messenger.ij.B1(this.u2), null, false);
                    org.telegram.ui.Components.f5 f5Var = f4Var.s;
                    if (f5Var != null) {
                        f5Var.f();
                    }
                    this.V4 = false;
                    this.S4 = rVar;
                    this.T4 = rVar.getRenderer();
                    if (!A5 && !z5) {
                        this.b.addView(f4Var, c8.ha.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (f4Var != null) {
                        boolean z12 = (z5 || A5 || org.telegram.messenger.g0.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = f4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new wh(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new u00(this, i13));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.y4 = linearLayout;
                            org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(getContext(), linearLayout, linearLayout2);
                            vd0Var.setMinimumWidth(org.telegram.messenger.g0.L(240.0f));
                            vd0Var.setOrientation(1);
                            boolean z13 = z12;
                            int S0 = org.telegram.messenger.g0.S0(this.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hh, false));
                            if (linearLayout2 == null || f4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                c40Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                vd0Var.addView(linearLayout2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                c40Var = new c40(this, getContext(), participant);
                                linearLayout2.addView(c40Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            vd0Var.addView(linearLayout, c8.ha.k(0.0f, c40Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(getContext(), vd0Var);
                            m1Var.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var, c8.ha.c(-2.0f, -2));
                            long B1 = org.telegram.messenger.ij.B1(participant.peer);
                            c40 c40Var2 = c40Var;
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z14 = participant.peer instanceof TLRPC.TL_peerUser;
                            org.telegram.messenger.c cVar = this.n1;
                            if (!z14) {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                            } else if (org.telegram.messenger.t3.T(this.T2)) {
                                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(cVar.a);
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num = 6;
                                num2 = 8;
                                long j10 = participant.peer.user_id;
                                num3 = valueOf2;
                                viewGroup = linearLayout;
                                a0.h hVar = (a0.h) s12.x1.f(l1());
                                TLRPC.ChannelParticipant channelParticipant = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j10);
                                if (channelParticipant != null) {
                                    if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
                                    }
                                    z9 = true;
                                }
                                z9 = false;
                            } else {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.a).N0(l1());
                                if (N0 != null && (chatParticipants = N0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i14);
                                        TLRPC.ChatFull chatFull = N0;
                                        int i15 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i14++;
                                            N0 = chatFull;
                                            size = i15;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z9 = false;
                            }
                            if (f4Var.c()) {
                                if (r1() && f4Var.K) {
                                    str = null;
                                    org.telegram.ui.Cells.f1.t(null, 2131743394, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(org.telegram.messenger.id.M0(f4Var.b.getImageReceiver().L() ? 2131743505 : 2131743242, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                if (B1 > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i12 = 2131743507;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i12 = 2131743417;
                                    }
                                    arrayList.add(org.telegram.messenger.id.M0(i12, str3));
                                } else {
                                    arrayList.add(org.telegram.messenger.id.M0(TextUtils.isEmpty(participant.about) ? 2131743506 : 2131743416, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (B1 > 0) {
                                    i11 = 2131743415;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i11 = 2131743414;
                                }
                                arrayList.add(org.telegram.messenger.id.M0(i11, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (S0()) {
                                if (!r1() && z9 && participant.muted) {
                                    if (r1() && participant.muted_by_you) {
                                        arrayList.add(org.telegram.messenger.id.M0(2131743318, null));
                                        arrayList2.add(valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    arrayList.add(org.telegram.messenger.id.M0(2131743359, null));
                                    arrayList2.add(num3);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(org.telegram.messenger.id.M0(2131743400, null));
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
                                    if (j11 != 0 && !org.telegram.messenger.t3.m0(this.a, j11)) {
                                        org.telegram.ui.Cells.f1.t(null, 2131743353, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num2);
                                        if (r1()) {
                                            i7 = z9 ? 2 : 2;
                                        } else {
                                            org.telegram.messenger.r3 r3Var = this.U2;
                                            if (r3Var != null && (groupCall = r3Var.b) != null && groupCall.creator) {
                                                org.telegram.ui.Cells.f1.t(null, 2131743311, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i7));
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Cells.f1.t(null, 2131743351, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num);
                                if (r1()) {
                                }
                            } else {
                                Integer num4 = num;
                                Integer num5 = num2;
                                if (participant.muted_by_you) {
                                    arrayList.add(org.telegram.messenger.id.M0(2131743318, null));
                                    arrayList2.add(valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    arrayList.add(org.telegram.messenger.id.M0(2131743358, null));
                                    arrayList2.add(num3);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j12 = peer2.channel_id;
                                    if (j12 != 0 && !org.telegram.messenger.t3.m0(this.a, j12)) {
                                        arrayList.add(org.telegram.messenger.id.M0(2131743353, null));
                                        arrayList2.add(valueOf);
                                        arrayList3.add(num5);
                                    }
                                }
                                arrayList.add(org.telegram.messenger.id.M0(2131743352, null));
                                arrayList2.add(valueOf);
                                arrayList3.add(num4);
                            }
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (i16 < size2) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(getContext(), i16 == 0, i16 == size2 + (-1));
                                if (((Integer) arrayList3.get(i16)).intValue() != 2) {
                                    int i17 = org.telegram.ui.ActionBar.m6.Vg;
                                    z11 = false;
                                    r52 = 0;
                                    z0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i17, false), org.telegram.ui.ActionBar.m6.x0(null, i17, false));
                                } else {
                                    z11 = false;
                                    r52 = 0;
                                    int i18 = org.telegram.ui.ActionBar.m6.jh;
                                    z0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i18, false), org.telegram.ui.ActionBar.m6.x0(null, i18, false));
                                }
                                z0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.x0(r52, org.telegram.ui.ActionBar.m6.Sg, z11));
                                z0Var.j((CharSequence) arrayList.get(i16), ((Integer) arrayList2.get(i16)).intValue(), r52);
                                viewGroup.addView(z0Var);
                                z0Var.setTag(arrayList3.get(i16));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                z0Var.setOnClickListener(new di.u5(this, i16, arrayList4, groupCallParticipant, 3));
                                i16++;
                                arrayList3 = arrayList4;
                                participant = groupCallParticipant;
                            }
                            m1Var.addView(vd0Var, c8.ha.x(-2, -2, 51));
                            n30 n30Var = this.K1;
                            n30Var.C0();
                            this.S1.X = false;
                            this.R4 = f4Var;
                            f4Var.setAboutVisible(true);
                            this.b.invalidate();
                            n30Var.invalidate();
                            AnimatorSet animatorSet = this.Y4;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            this.Y3 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            if (B1 > 0) {
                                int i19 = cVar.a;
                                int i20 = cVar.a;
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(B1));
                                m10 = org.telegram.messenger.hc.m(i20, 0, a22);
                                m11 = org.telegram.messenger.hc.m(i20, 1, a22);
                                j3 = B1;
                                if (org.telegram.messenger.qp.s1(this.a).b2(j3) == null) {
                                    org.telegram.messenger.qp.s1(this.a).g3(a22, false, 0);
                                }
                            } else {
                                j3 = B1;
                                int i21 = cVar.a;
                                int i22 = cVar.a;
                                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i21).M0(Long.valueOf(-j3));
                                m10 = org.telegram.messenger.hc.m(i22, 0, M0);
                                m11 = org.telegram.messenger.hc.m(i22, 1, M0);
                            }
                            org.telegram.ui.Components.voip.y yVar = this.T4;
                            boolean z15 = yVar != null && yVar.w;
                            if (m10 != null || z15) {
                                if (z13) {
                                    org.telegram.ui.Components.k9 avatarImageView = this.R4.getAvatarImageView();
                                    e20 e20Var = this.l1;
                                    e20Var.setParentAvatarImage(avatarImageView);
                                    e20Var.setHasActiveVideo(z15);
                                    e20Var.M(j3, true);
                                    e20Var.setCreateThumbFromParent(true);
                                    e20Var.H(null, m10, m11, true);
                                    org.telegram.ui.Components.voip.y yVar2 = this.T4;
                                    if (yVar2 != null) {
                                        yVar2.h = true;
                                        yVar2.j(true);
                                    }
                                    if (org.telegram.messenger.ij.B1(this.u2) == j3 && this.b4 != null && (o30Var = this.c4) != null && (fileLocation = o30Var.c) != null) {
                                        e20Var.A(o30Var.d, org.telegram.messenger.hc.e(fileLocation));
                                    }
                                }
                                z10 = z13;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                this.Z3 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.Y3, c8.ha.c(-2.0f, -2));
                                this.a4 = true;
                                h20 h20Var = this.V3;
                                if (h20Var == null) {
                                    i10 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.t0 * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - org.telegram.messenger.g0.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -org.telegram.messenger.g0.m);
                                    this.c2.M().getView().draw(canvas);
                                    canvas.drawColor(i0.a.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -org.telegram.messenger.g0.m);
                                    this.z4 = true;
                                    this.b.draw(canvas);
                                    i10 = 0;
                                    this.z4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / org.telegram.messenger.qs.K2));
                                    h20Var.setBackground(new BitmapDrawable(createBitmap));
                                    h20Var.setAlpha(0.0f);
                                    h20Var.setVisibility(0);
                                    h20Var.bringToFront();
                                }
                                this.W4 = true;
                                this.w4.setVisibility(i10);
                                if (c40Var2 != null) {
                                    c40Var2.invalidate();
                                }
                                D1(true, f4Var);
                                org.telegram.ui.Components.g10 g10Var = this.U4;
                                if (g10Var != null) {
                                    g10Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.Z3 = false;
                            h30 h30Var2 = new h30(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            this.Z4 = h30Var2;
                            h30Var2.e = true;
                            h30Var2.c = org.telegram.messenger.qs.x3;
                            h30Var2.setOutsideTouchable(true);
                            this.Z4.setClippingEnabled(true);
                            this.Z4.setAnimationStyle(R.style.PopupContextAnimation);
                            this.Z4.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            this.Z4.setInputMethodMode(2);
                            this.Z4.setSoftInputMode(0);
                            this.Z4.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.g10 g10Var2 = this.U4;
                            if (g10Var2 != null) {
                                boolean z16 = z5;
                                c20 c20Var = this.U3;
                                y10 y10Var = this.g4;
                                if (z16) {
                                    x10 = org.telegram.messenger.g0.L(32.0f) + (((int) (c20Var.getX() + (y10Var.getX() + g10Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                    y10 = ((int) (c20Var.getY() + (y10Var.getY() + this.U4.getY()))) - org.telegram.messenger.g0.L(6.0f);
                                } else {
                                    int x11 = ((int) (c20Var.getX() + (y10Var.getX() + g10Var2.getX()))) - org.telegram.messenger.g0.L(14.0f);
                                    y10 = (int) ((c20Var.getY() + (y10Var.getY() + this.U4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight());
                                    x10 = x11;
                                }
                            } else {
                                x10 = (int) (((n30Var.getX() + n30Var.getMeasuredWidth()) + org.telegram.messenger.g0.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                if (this.V4) {
                                    y11 = f4Var.getY() + n30Var.getY();
                                    measuredHeight = f4Var.getClipHeight();
                                } else if (this.S4 != null) {
                                    y11 = this.S4.getY() + n30Var.getY();
                                    measuredHeight = this.S4.getMeasuredHeight();
                                } else {
                                    y10 = (int) n30Var.getY();
                                }
                                y10 = (int) (y11 + measuredHeight);
                            }
                            this.Z4.showAtLocation(n30Var, 51, x10, y10);
                            this.Y4 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.Q4, org.telegram.ui.Components.l6.b, 0, 100));
                            this.Y4.playTogether(arrayList5);
                            this.Y4.setDuration(150L);
                            this.Y4.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.g10) {
                    org.telegram.ui.Components.g10 g10Var3 = (org.telegram.ui.Components.g10) view;
                    if (g10Var3.getParticipant() != this.U2.z.a) {
                        f4Var = new org.telegram.ui.Cells.f4(g10Var3.getContext());
                        f4Var.e(this.n1, g10Var3.getParticipant(), this.U2, org.telegram.messenger.ij.B1(this.u2), null, false);
                        org.telegram.ui.Components.f5 f5Var2 = f4Var.s;
                        if (f5Var2 != null) {
                            f5Var2.f();
                        }
                        this.V4 = false;
                        this.U4 = g10Var3;
                        org.telegram.ui.Components.voip.y renderer = g10Var3.getRenderer();
                        this.T4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.T4 = null;
                        }
                        this.b.addView(f4Var, c8.ha.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    f4Var = (org.telegram.ui.Cells.f4) view;
                    this.V4 = true;
                }
                if (f4Var != null) {
                }
            }
        }
        return false;
    }

    public final void M1(View view) {
        if (this.g2 == null) {
            org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(8, getContext(), null, true);
            this.g2 = y20Var;
            y20Var.setAlpha(0.0f);
            this.g2.setVisibility(4);
            this.g2.setShowingDuration(3000L);
            this.b.addView(this.g2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.T2)) {
                this.g2.setText(org.telegram.messenger.id.M0(2131743465, null));
            } else {
                this.g2.setText(org.telegram.messenger.id.M0(2131743347, null));
            }
            this.g2.b();
        }
        this.g2.setExtraTranslationY(-org.telegram.messenger.g0.m);
        this.g2.c(view);
    }

    public final void N1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.messenger.r3 r3Var = this.U2;
        org.telegram.ui.Components.voip.n2 n2Var = this.u1;
        org.telegram.ui.Components.voip.n2 n2Var2 = this.q1;
        org.telegram.ui.Components.voip.n2 n2Var3 = this.s1;
        org.telegram.ui.Components.voip.n2 n2Var4 = this.p1;
        org.telegram.ui.Components.voip.n2 n2Var5 = this.r1;
        org.telegram.ui.Components.voip.n2 n2Var6 = this.t1;
        org.telegram.ui.Components.voip.n2 n2Var7 = this.v1;
        p10 p10Var = this.o1;
        boolean z14 = false;
        if (r3Var == null || r3Var.j()) {
            p10Var.c(n2Var7, this.P2 > 0.1f, z9);
            p10Var.c(n2Var6, this.P2 > 0.1f, z9);
            p10Var.c(n2Var3, this.P2 > 0.1f, z9);
            p10Var.c(n2Var5, false, z9);
            p10Var.c(n2Var4, false, z9);
            p10Var.c(n2Var2, false, z9);
            p10Var.c(n2Var, false, z9);
            return;
        }
        boolean z15 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.u2));
        boolean z16 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
        Boolean bool = this.r5;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.U2.b;
            z10 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z16 || !this.U2.c()) && !z15) || u1()) {
            z11 = false;
            z14 = true;
        } else {
            z11 = true;
        }
        if (z15) {
            z13 = true;
            z12 = false;
        } else {
            z12 = !z16;
            z13 = false;
        }
        if (z5) {
            z12 = false;
            z13 = false;
        }
        p10Var.c(n2Var7, true, z9);
        p10Var.c(n2Var6, true, z9);
        p10Var.c(n2Var5, z11, z9);
        p10Var.c(n2Var4, z13, z9);
        p10Var.c(n2Var3, z14, z9);
        p10Var.c(n2Var2, z12, z9);
        p10Var.c(n2Var, z10, z9);
    }

    public final void O1() {
        org.telegram.messenger.r3 r3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.r3 r3Var2 = this.U2;
        org.telegram.ui.ActionBar.r0 r0Var = this.e3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.g3;
        if (r3Var2 == null || r3Var2.j()) {
            this.f3.setVisibility(4);
            r0Var2.setVisibility(8);
            if (this.U2 == null) {
                r0Var.setVisibility(8);
                return;
            }
        }
        if (this.f2) {
            return;
        }
        org.telegram.messenger.c cVar = this.n1;
        int i7 = cVar.a;
        int i10 = cVar.a;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(l1()));
        if (M0 != null) {
            this.T2 = M0;
        }
        boolean y10 = org.telegram.messenger.t3.y(3, this.T2);
        org.telegram.ui.ActionBar.z0 z0Var = this.h3;
        if (y10 || (((!org.telegram.messenger.t3.T(this.T2) || ((chat2 = this.T2) != null && chat2.megagroup)) && (org.telegram.messenger.t3.t0(this.T2) || org.telegram.messenger.t3.y(3, this.T2))) || (org.telegram.messenger.t3.T(this.T2) && (chat = this.T2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
            z0Var.setVisibility(0);
        } else {
            z0Var.setVisibility(8);
        }
        org.telegram.messenger.r3 r3Var3 = this.U2;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.s3;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.r3;
        if (r3Var3 == null || (groupCall2 = r3Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            z0Var3.setVisibility(8);
            z0Var2.setVisibility(8);
        } else {
            z0Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            z0Var2.setVisibility(this.U2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.u2));
        org.telegram.messenger.r3 r3Var4 = this.U2;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.k3;
        if (r3Var4 == null || r3Var4.j() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            z0Var4.setVisibility(8);
        } else {
            z0Var4.setVisibility(0);
        }
        z0Var4.setIcon(org.telegram.messenger.iz.I0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        z0Var4.setSubtext(org.telegram.messenger.id.M0(org.telegram.messenger.iz.I0 ? 2131743280 : 2131743281, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.z0 z0Var5 = this.q3;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.i3;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.m3;
        org.telegram.ui.ActionBar.z0 z0Var8 = this.n3;
        if (S0) {
            z0Var5.setVisibility(0);
            z0Var6.setVisibility(0);
            if (u1()) {
                z0Var7.setVisibility(0);
                z0Var8.setVisibility(8);
            } else if (this.U2.j()) {
                z0Var7.setVisibility(8);
                z0Var8.setVisibility(8);
            } else {
                z0Var7.setVisibility(0);
            }
            if (r1()) {
                z0Var7.setVisibility(8);
                z0Var6.setVisibility(8);
            }
            if (!this.U2.c() || this.U2.j() || u1()) {
                z0Var8.setVisibility(8);
            } else {
                z0Var8.setVisibility(0);
            }
            r0Var2.setVisibility(8);
            boolean z9 = this.U2.w;
            a40 a40Var = this.X2;
            a40Var.f = z9;
            a40Var.d = 1.0f;
            a40Var.invalidateSelf();
            if (this.U2.w) {
                if (this.x3 == null) {
                    v00 v00Var = new v00(this, 6);
                    this.x3 = v00Var;
                    org.telegram.messenger.g0.i3(v00Var, 1000L);
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743323, null));
            } else {
                v00 v00Var2 = this.x3;
                if (v00Var2 != null) {
                    org.telegram.messenger.g0.r(v00Var2);
                    this.x3 = null;
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743348, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                z0Var8.j(org.telegram.messenger.id.M0(2131743436, null), R.drawable.msg_screencast, null);
            } else {
                z0Var8.j(org.telegram.messenger.id.M0(2131743434, null), R.drawable.msg_screencast_off, null);
            }
            Q1();
        } else {
            boolean z10 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
            boolean z11 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z10 || (!(this.U2.c() || z11) || this.U2.j() || u1())) {
                r0Var2.setVisibility(8);
                z0Var8.setVisibility(8);
            } else if (z11) {
                r0Var2.setVisibility(8);
                z0Var8.setVisibility(0);
                z0Var8.j(org.telegram.messenger.id.M0(2131743434, null), R.drawable.msg_screencast_off, null);
                z0Var8.setContentDescription(org.telegram.messenger.id.M0(2131743434, null));
            } else {
                z0Var8.j(org.telegram.messenger.id.M0(2131743436, null), R.drawable.msg_screencast, null);
                z0Var8.setContentDescription(org.telegram.messenger.id.M0(2131743436, null));
                r0Var2.setVisibility(8);
                z0Var8.setVisibility(0);
            }
            z0Var5.setVisibility(8);
            z0Var6.setVisibility(8);
            z0Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.z0 z0Var9 = this.l3;
        if (S02 && this.U2.b.can_change_join_muted && !r1()) {
            z0Var9.setVisibility(0);
        } else {
            z0Var9.setVisibility(8);
        }
        r0Var.Q(4, (r1() && ((r3Var = this.U2) == null || (groupCall = r3Var.b) == null || !groupCall.creator)) ? false : true);
        this.j3.setVisibility((!u1() || this.U2.j()) ? 0 : 8);
        int visibility = z0Var6.getVisibility();
        TextView textView = this.u3;
        if (visibility == 0 || z0Var9.getVisibility() == 0 || z0Var.getVisibility() == 0 || z0Var8.getVisibility() == 0 || z0Var7.getVisibility() == 0 || z0Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.e2;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.V2) || u1() || this.u2 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.ij.B1(this.u2);
            kVar.setObject(org.telegram.messenger.m5.E(B1) ? org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(B1)) : org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-B1)));
        }
        TLRPC.Chat chat3 = this.T2;
        if (chat3 == null || org.telegram.messenger.t3.W(chat3) || !u1() || z0Var.getVisibility() != 8) {
            r0Var.setVisibility(0);
        } else {
            r0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.d3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.t3.getLayoutParams()).rightMargin = 0;
        this.I1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
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
    public final void P1(int i7, boolean z9) {
        boolean P;
        boolean P2;
        String M0;
        String str;
        boolean z10;
        boolean z11;
        boolean P3;
        boolean P4;
        int i10;
        e40[] e40VarArr;
        boolean z12;
        e40 e40Var;
        e40 e40Var2;
        boolean z13;
        boolean z14;
        c20 c20Var = this.U3;
        boolean z15 = c20Var != null && c20Var.b && (org.telegram.messenger.g0.Q1() || z5 == t1());
        if (!u1() && this.z3 == i7 && z9) {
            return;
        }
        org.telegram.ui.Components.zg0 zg0Var = this.D2;
        if (i7 == 7) {
            str = org.telegram.messenger.id.M0(2131743393, null);
            P4 = zg0Var.P(org.telegram.messenger.qs.g3);
        } else {
            if (i7 != 6) {
                if (i7 != 5) {
                    if (i7 == 0) {
                        String M02 = org.telegram.messenger.id.M0(2131743317, null);
                        M0 = org.telegram.messenger.id.M0(2131743301, null);
                        int i11 = this.z3;
                        if (i11 == 3) {
                            int i12 = zg0Var.f;
                            z10 = (i12 == 136 || i12 == 173 || i12 == 274 || i12 == 311) ? zg0Var.P(99) : false;
                        } else {
                            z10 = i11 == 5 ? zg0Var.P(404) : i11 == 7 ? zg0Var.P(376) : i11 == 6 ? zg0Var.P(org.telegram.messenger.qs.M3) : i11 == 2 ? zg0Var.P(36) : zg0Var.P(99);
                        }
                        str = M02;
                    } else if (i7 == 1) {
                        str = org.telegram.messenger.id.M0(r1() ? 2131743232 : 2131743231, null);
                        P3 = zg0Var.P(this.z3 == 4 ? 99 : 69);
                    } else if (r1() && i7 == 2) {
                        str = org.telegram.messenger.id.M0(2131743291, null);
                        z10 = zg0Var.P(99);
                        M0 = "";
                    } else {
                        if (i7 != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.u2));
                            boolean z16 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
                            if (z16) {
                                int i13 = this.z3;
                                if (i13 == 7) {
                                    P2 = zg0Var.P(org.telegram.messenger.qs.i5);
                                } else if (i13 == 6) {
                                    P2 = zg0Var.P(org.telegram.messenger.qs.x4);
                                } else if (i13 == 1) {
                                    P2 = zg0Var.P(org.telegram.messenger.qs.D2);
                                } else {
                                    P = zg0Var.P(org.telegram.messenger.qs.S1);
                                }
                                P = P2;
                            } else {
                                int i14 = this.z3;
                                if (i14 == 5) {
                                    P2 = zg0Var.P(404);
                                    P = P2;
                                } else if (i14 == 7) {
                                    P = zg0Var.P(376);
                                } else if (i14 == 6) {
                                    P = zg0Var.P(org.telegram.messenger.qs.M3);
                                } else if (i14 == 2 || i14 == 4) {
                                    P = zg0Var.P(36);
                                } else {
                                    P = zg0Var.P(99);
                                }
                            }
                            if (i7 == 3) {
                                str = org.telegram.messenger.id.M0(2131751809, null);
                                z10 = P;
                                z11 = z16;
                                M0 = "";
                            } else {
                                String M03 = org.telegram.messenger.id.M0(2131743291, null);
                                boolean z17 = z16;
                                M0 = org.telegram.messenger.id.M0(2131743290, null);
                                str = M03;
                                z10 = P;
                                z11 = z17;
                            }
                            if (u1() && i7 != 3 && !this.U2.j()) {
                                str = org.telegram.messenger.id.M0(!z15 ? 2131743360 : 2131743378, null);
                                boolean z18 = this.A3 == z15;
                                this.A3 = z15;
                                z10 = z18;
                                M0 = "";
                            }
                            String D = TextUtils.isEmpty(M0) ? a8.p0.D(str, " ", M0) : str;
                            org.telegram.ui.Components.voip.n2 n2Var = this.v1;
                            n2Var.setContentDescription(D);
                            n2Var.c(0, 0, 0, 1.0f, true, str, false, z9);
                            q10 q10Var = this.w1;
                            ImageView imageView = this.x1;
                            if (z9) {
                                this.z3 = i7;
                                zg0Var.N(zg0Var.f - 1, false, true);
                                if (!u1() || this.U2.j()) {
                                    imageView.setVisibility(8);
                                    q10Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((c20Var != null && c20Var.b && (org.telegram.messenger.g0.Q1() || z5 == t1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    q10Var.setVisibility(8);
                                }
                            } else {
                                if (z10) {
                                    if (i7 == 5) {
                                        zg0Var.M(376);
                                    } else if (i7 == 7) {
                                        zg0Var.M(org.telegram.messenger.qs.D2);
                                    } else if (i7 == 6) {
                                        zg0Var.M(org.telegram.messenger.qs.i5);
                                    } else if (i7 == 0) {
                                        int i15 = this.z3;
                                        if (i15 == 5) {
                                            zg0Var.M(376);
                                        } else if (i15 == 7) {
                                            zg0Var.M(org.telegram.messenger.qs.P5);
                                        } else if (i15 == 6) {
                                            zg0Var.M(org.telegram.messenger.qs.g3);
                                        } else if (i15 == 2) {
                                            zg0Var.M(0);
                                        } else {
                                            zg0Var.M(69);
                                        }
                                    } else if (i7 == 1 || (this.z3 == 2 && r1())) {
                                        zg0Var.M(this.z3 != 4 ? 36 : 69);
                                    } else if (i7 == 4) {
                                        zg0Var.M(99);
                                    } else if (z11) {
                                        int i16 = this.z3;
                                        if (i16 == 7) {
                                            zg0Var.M(org.telegram.messenger.qs.x4);
                                        } else if (i16 == 6) {
                                            zg0Var.M(org.telegram.messenger.qs.M3);
                                        } else if (i16 == 1) {
                                            zg0Var.M(org.telegram.messenger.qs.S1);
                                        } else {
                                            zg0Var.M(99);
                                        }
                                    } else {
                                        int i17 = this.z3;
                                        if (i17 == 5) {
                                            zg0Var.M(376);
                                        } else if (i17 == 7) {
                                            zg0Var.M(org.telegram.messenger.qs.P5);
                                        } else if (i17 == 6) {
                                            zg0Var.M(org.telegram.messenger.qs.g3);
                                        } else if (i17 == 2 || i17 == 4) {
                                            zg0Var.M(0);
                                        } else {
                                            zg0Var.M(69);
                                        }
                                    }
                                }
                                q10Var.d();
                                if (!u1() || this.U2.j()) {
                                    imageView.setVisibility(8);
                                    q10Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((c20Var != null && c20Var.b && (org.telegram.messenger.g0.Q1() || z5 == t1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    q10Var.setVisibility(8);
                                }
                                this.z3 = i7;
                            }
                            n2Var.invalidate();
                            i10 = this.z3;
                            e40VarArr = this.E3;
                            if (e40VarArr[i10] == null) {
                                e40VarArr[i10] = new e40(i10);
                                int i18 = this.z3;
                                if (i18 == 3) {
                                    e40VarArr[i18].g = null;
                                } else if (s1(i18)) {
                                    e40VarArr[this.z3].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    int i19 = this.z3;
                                    if (i19 != 1) {
                                        z12 = false;
                                        e40VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.xh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                        e40Var = e40VarArr[this.z3];
                                        e40Var2 = this.H3;
                                        if (e40Var != e40Var2) {
                                            this.G3 = e40Var2;
                                            this.H3 = e40Var;
                                            if (e40Var2 == null || !z9) {
                                                this.F3 = 1.0f;
                                                this.G3 = null;
                                            } else {
                                                this.F3 = 0.0f;
                                            }
                                        }
                                        if (!z9) {
                                            e40 e40Var3 = this.H3;
                                            if (e40Var3 != null) {
                                                int i20 = e40Var3.i;
                                                z14 = true;
                                                z13 = (i20 == 1 || i20 == 0) ? true : z12;
                                                if (i20 == 3) {
                                                    z14 = z12;
                                                }
                                            } else {
                                                z13 = z12;
                                                z14 = z13;
                                            }
                                            this.J3 = z13 ? 1.0f : 0.0f;
                                            this.K3 = z14 ? 1.0f : 0.0f;
                                        }
                                        this.o1.invalidate();
                                    }
                                    e40VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.th, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                            }
                            z12 = false;
                            e40Var = e40VarArr[this.z3];
                            e40Var2 = this.H3;
                            if (e40Var != e40Var2) {
                            }
                            if (!z9) {
                            }
                            this.o1.invalidate();
                        }
                        str = org.telegram.messenger.id.M0(2131743287, null);
                        String M04 = org.telegram.messenger.id.M0(2131743288, null);
                        z10 = zg0Var.P(org.telegram.messenger.qs.S1);
                        M0 = M04;
                    }
                    z11 = false;
                    if (u1()) {
                        str = org.telegram.messenger.id.M0(!z15 ? 2131743360 : 2131743378, null);
                        if (this.A3 == z15) {
                        }
                        this.A3 = z15;
                        z10 = z18;
                        M0 = "";
                    }
                    if (TextUtils.isEmpty(M0)) {
                    }
                    org.telegram.ui.Components.voip.n2 n2Var2 = this.v1;
                    n2Var2.setContentDescription(D);
                    n2Var2.c(0, 0, 0, 1.0f, true, str, false, z9);
                    q10 q10Var2 = this.w1;
                    ImageView imageView2 = this.x1;
                    if (z9) {
                    }
                    n2Var2.invalidate();
                    i10 = this.z3;
                    e40VarArr = this.E3;
                    if (e40VarArr[i10] == null) {
                    }
                    z12 = false;
                    e40Var = e40VarArr[this.z3];
                    e40Var2 = this.H3;
                    if (e40Var != e40Var2) {
                    }
                    if (!z9) {
                    }
                    this.o1.invalidate();
                }
                str = org.telegram.messenger.id.M0(2131743330, null);
                P3 = zg0Var.P(377);
                z10 = P3;
                M0 = "";
                z11 = false;
                if (u1()) {
                }
                if (TextUtils.isEmpty(M0)) {
                }
                org.telegram.ui.Components.voip.n2 n2Var22 = this.v1;
                n2Var22.setContentDescription(D);
                n2Var22.c(0, 0, 0, 1.0f, true, str, false, z9);
                q10 q10Var22 = this.w1;
                ImageView imageView22 = this.x1;
                if (z9) {
                }
                n2Var22.invalidate();
                i10 = this.z3;
                e40VarArr = this.E3;
                if (e40VarArr[i10] == null) {
                }
                z12 = false;
                e40Var = e40VarArr[this.z3];
                e40Var2 = this.H3;
                if (e40Var != e40Var2) {
                }
                if (!z9) {
                }
                this.o1.invalidate();
            }
            str = org.telegram.messenger.id.M0(2131743338, null);
            P4 = zg0Var.P(org.telegram.messenger.qs.P5);
        }
        M0 = "";
        z10 = P4;
        z11 = false;
        if (u1()) {
        }
        if (TextUtils.isEmpty(M0)) {
        }
        org.telegram.ui.Components.voip.n2 n2Var222 = this.v1;
        n2Var222.setContentDescription(D);
        n2Var222.c(0, 0, 0, 1.0f, true, str, false, z9);
        q10 q10Var222 = this.w1;
        ImageView imageView222 = this.x1;
        if (z9) {
        }
        n2Var222.invalidate();
        i10 = this.z3;
        e40VarArr = this.E3;
        if (e40VarArr[i10] == null) {
        }
        z12 = false;
        e40Var = e40VarArr[this.z3];
        e40Var2 = this.H3;
        if (e40Var != e40Var2) {
        }
        if (!z9) {
        }
        this.o1.invalidate();
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
    public final void Q0(boolean z9) {
        n30 n30Var;
        z30 z30Var;
        c20 c20Var;
        n30 n30Var2;
        boolean z10;
        int i7;
        ArrayList arrayList;
        int i10;
        int size;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        n30 n30Var3;
        c20 c20Var2;
        boolean z11;
        y10 y10Var;
        ?? r02;
        ?? r82;
        org.telegram.messenger.r3 r3Var;
        boolean z12;
        org.telegram.messenger.s3 s3Var;
        org.telegram.messenger.s3 s3Var2;
        v4.d1 G;
        f fVar;
        int i14;
        f40 f40Var = this;
        z30 z30Var2 = f40Var.J1;
        c20 c20Var3 = f40Var.U3;
        if (c20Var3 == null || (n30Var = f40Var.K1) == null || f40Var.U2 == null || f40Var.m2) {
            return;
        }
        if (c20Var3.b) {
            c20Var3.setVisibleParticipant(true);
        }
        long B1 = org.telegram.messenger.ij.B1(f40Var.U2.J);
        if (B1 != org.telegram.messenger.ij.B1(f40Var.u2) && f40Var.U2.d.f(B1) != null) {
            f40Var.u2 = f40Var.U2.J;
        }
        int childCount = n30Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = n30Var.getChildAt(i17);
            v4.d1 G2 = n30Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = f40Var.k2;
        arrayList3.clear();
        if (!A5) {
            arrayList3.addAll(f40Var.U2.f);
        } else if (c20Var3.b) {
            arrayList3.addAll(f40Var.U2.f);
            org.telegram.messenger.s3 s3Var3 = c20Var3.e;
            if (s3Var3 != null) {
                arrayList3.remove(s3Var3);
            }
        }
        if (n30Var.getItemAnimator() != null && !z9) {
            n30Var.setItemAnimator(null);
        } else if (n30Var.getItemAnimator() == null && z9) {
            n30Var.setItemAnimator(f40Var.R1);
        }
        try {
            fVar = new f(z30Var2, 18);
            try {
                try {
                    z10 = true;
                } catch (Exception e10) {
                    e = e10;
                    z30Var = z30Var2;
                    z10 = true;
                }
            } catch (Exception e11) {
                e = e11;
                z30Var = z30Var2;
                n30Var2 = n30Var;
                z10 = true;
                i7 = childCount;
                arrayList = arrayList3;
                i10 = i16;
                c20Var = c20Var3;
            }
        } catch (Exception e12) {
            e = e12;
            z30Var = z30Var2;
            c20Var = c20Var3;
            n30Var2 = n30Var;
            z10 = true;
            i7 = childCount;
            arrayList = arrayList3;
            i10 = i16;
        }
        try {
            try {
                try {
                    i14 = i16;
                    try {
                        c20Var = c20Var3;
                    } catch (Exception e13) {
                        e = e13;
                        c20Var = c20Var3;
                    }
                } catch (Exception e14) {
                    e = e14;
                    i10 = i16;
                    c20Var = c20Var3;
                    n30Var2 = n30Var;
                    i7 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e15) {
                e = e15;
                z30Var = z30Var2;
                arrayList = arrayList3;
                i10 = i16;
                c20Var = c20Var3;
                n30Var2 = n30Var;
                i7 = childCount;
            }
        } catch (Exception e16) {
            e = e16;
            z30Var = z30Var2;
            i7 = childCount;
            arrayList = arrayList3;
            i10 = i16;
            c20Var = c20Var3;
            n30Var2 = n30Var;
            org.telegram.messenger.a8.g(e, z10);
            z30Var.f();
            ArrayList arrayList4 = f40Var.U2.e;
            size = arrayList4.size();
            while (i11 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList5 = f40Var.x2;
            arrayList5.clear();
            arrayList5.addAll(f40Var.U2.g);
            ArrayList arrayList6 = f40Var.y2;
            arrayList6.clear();
            arrayList2 = arrayList;
            arrayList6.addAll(arrayList2);
            ArrayList arrayList7 = f40Var.z2;
            arrayList7.clear();
            arrayList7.addAll(f40Var.U2.j);
            ArrayList arrayList8 = f40Var.A2;
            arrayList8.clear();
            arrayList8.addAll(f40Var.U2.m);
            ArrayList arrayList9 = f40Var.B2;
            arrayList9.clear();
            arrayList9.addAll(f40Var.U2.l);
            z30 z30Var3 = z30Var;
            f40Var.C2 = z30Var3.F;
            i12 = i7;
            i13 = 0;
            while (i13 < i12) {
            }
            n30Var3 = n30Var2;
            boolean c10 = c20Var.c();
            c20Var2 = c20Var;
            if (c20Var2.b) {
            }
            z11 = false;
            org.telegram.ui.Components.h10 h10Var = f40Var.j4;
            y10Var = f40Var.g4;
            h10Var.G(y10Var, z10);
            if (y10Var.getVisibility() == 0) {
            }
            if (A5) {
            }
            if (n30Var3.getVisibility() == 0) {
            }
            r02 = f40Var.T3;
            r02.clear();
            r02.addAll(f40Var.S3);
            while (r82 < r02.size()) {
            }
            r3Var = f40Var.U2;
            if (r3Var != null) {
            }
            org.telegram.messenger.r3 r3Var2 = f40Var.U2;
            if (r3Var2 != null) {
            }
            f40Var.w5.a(z12, z9);
            if (z12 == f40Var.C4) {
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
                    z10 = true;
                }
                try {
                    arrayList = arrayList3;
                    i10 = i14;
                    i7 = childCount;
                    f40Var = this;
                    z30Var = z30Var2;
                    try {
                        f40Var.I1(z30Var2.K, z30Var2.x, z30Var2.d, z30Var2.e, z30Var2.f, z30Var2.h, z30Var2.n, z30Var2.r, z30Var2.s, z30Var2.w, z30Var2.G, z30Var2.H, z30Var2.I, z30Var2.J, z30Var2.y, z30Var2.D);
                        z30Var.E();
                        z10 = true;
                        try {
                            v4.o.c(f40Var.q5, true).b(fVar);
                        } catch (Exception e19) {
                            e = e19;
                            org.telegram.messenger.a8.g(e, z10);
                            z30Var.f();
                            ArrayList arrayList42 = f40Var.U2.e;
                            size = arrayList42.size();
                            while (i11 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList52 = f40Var.x2;
                            arrayList52.clear();
                            arrayList52.addAll(f40Var.U2.g);
                            ArrayList arrayList62 = f40Var.y2;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = f40Var.z2;
                            arrayList72.clear();
                            arrayList72.addAll(f40Var.U2.j);
                            ArrayList arrayList82 = f40Var.A2;
                            arrayList82.clear();
                            arrayList82.addAll(f40Var.U2.m);
                            ArrayList arrayList92 = f40Var.B2;
                            arrayList92.clear();
                            arrayList92.addAll(f40Var.U2.l);
                            z30 z30Var32 = z30Var;
                            f40Var.C2 = z30Var32.F;
                            i12 = i7;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            n30Var3 = n30Var2;
                            boolean c102 = c20Var.c();
                            c20Var2 = c20Var;
                            if (c20Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.h10 h10Var2 = f40Var.j4;
                                y10Var = f40Var.g4;
                                h10Var2.G(y10Var, z10);
                                if (y10Var.getVisibility() == 0) {
                                }
                                if (A5) {
                                }
                                if (n30Var3.getVisibility() == 0) {
                                }
                                r02 = f40Var.T3;
                                r02.clear();
                                r02.addAll(f40Var.S3);
                                while (r82 < r02.size()) {
                                }
                                r3Var = f40Var.U2;
                                if (r3Var != null) {
                                }
                                org.telegram.messenger.r3 r3Var22 = f40Var.U2;
                                if (r3Var22 != null) {
                                }
                                f40Var.w5.a(z12, z9);
                                if (z12 == f40Var.C4) {
                                }
                            }
                            z11 = false;
                            org.telegram.ui.Components.h10 h10Var22 = f40Var.j4;
                            y10Var = f40Var.g4;
                            h10Var22.G(y10Var, z10);
                            if (y10Var.getVisibility() == 0) {
                            }
                            if (A5) {
                            }
                            if (n30Var3.getVisibility() == 0) {
                            }
                            r02 = f40Var.T3;
                            r02.clear();
                            r02.addAll(f40Var.S3);
                            while (r82 < r02.size()) {
                            }
                            r3Var = f40Var.U2;
                            if (r3Var != null) {
                            }
                            org.telegram.messenger.r3 r3Var222 = f40Var.U2;
                            if (r3Var222 != null) {
                            }
                            f40Var.w5.a(z12, z9);
                            if (z12 == f40Var.C4) {
                            }
                        }
                    } catch (Exception e20) {
                        e = e20;
                        z10 = true;
                    }
                } catch (Exception e21) {
                    e = e21;
                    f40Var = this;
                    arrayList = arrayList3;
                    i10 = i14;
                    z10 = true;
                    i7 = childCount;
                    z30Var = z30Var2;
                    org.telegram.messenger.a8.g(e, z10);
                    z30Var.f();
                    ArrayList arrayList422 = f40Var.U2.e;
                    size = arrayList422.size();
                    while (i11 < size) {
                    }
                    if (view != null) {
                    }
                    ArrayList arrayList522 = f40Var.x2;
                    arrayList522.clear();
                    arrayList522.addAll(f40Var.U2.g);
                    ArrayList arrayList622 = f40Var.y2;
                    arrayList622.clear();
                    arrayList2 = arrayList;
                    arrayList622.addAll(arrayList2);
                    ArrayList arrayList722 = f40Var.z2;
                    arrayList722.clear();
                    arrayList722.addAll(f40Var.U2.j);
                    ArrayList arrayList822 = f40Var.A2;
                    arrayList822.clear();
                    arrayList822.addAll(f40Var.U2.m);
                    ArrayList arrayList922 = f40Var.B2;
                    arrayList922.clear();
                    arrayList922.addAll(f40Var.U2.l);
                    z30 z30Var322 = z30Var;
                    f40Var.C2 = z30Var322.F;
                    i12 = i7;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    n30Var3 = n30Var2;
                    boolean c1022 = c20Var.c();
                    c20Var2 = c20Var;
                    if (c20Var2.b) {
                    }
                    z11 = false;
                    org.telegram.ui.Components.h10 h10Var222 = f40Var.j4;
                    y10Var = f40Var.g4;
                    h10Var222.G(y10Var, z10);
                    if (y10Var.getVisibility() == 0) {
                    }
                    if (A5) {
                    }
                    if (n30Var3.getVisibility() == 0) {
                    }
                    r02 = f40Var.T3;
                    r02.clear();
                    r02.addAll(f40Var.S3);
                    while (r82 < r02.size()) {
                    }
                    r3Var = f40Var.U2;
                    if (r3Var != null) {
                    }
                    org.telegram.messenger.r3 r3Var2222 = f40Var.U2;
                    if (r3Var2222 != null) {
                    }
                    f40Var.w5.a(z12, z9);
                    if (z12 == f40Var.C4) {
                    }
                }
            } catch (Exception e22) {
                e = e22;
                i7 = childCount;
                arrayList = arrayList3;
                i10 = i14;
                z30Var = z30Var2;
                org.telegram.messenger.a8.g(e, z10);
                z30Var.f();
                ArrayList arrayList4222 = f40Var.U2.e;
                size = arrayList4222.size();
                while (i11 < size) {
                }
                if (view != null) {
                }
                ArrayList arrayList5222 = f40Var.x2;
                arrayList5222.clear();
                arrayList5222.addAll(f40Var.U2.g);
                ArrayList arrayList6222 = f40Var.y2;
                arrayList6222.clear();
                arrayList2 = arrayList;
                arrayList6222.addAll(arrayList2);
                ArrayList arrayList7222 = f40Var.z2;
                arrayList7222.clear();
                arrayList7222.addAll(f40Var.U2.j);
                ArrayList arrayList8222 = f40Var.A2;
                arrayList8222.clear();
                arrayList8222.addAll(f40Var.U2.m);
                ArrayList arrayList9222 = f40Var.B2;
                arrayList9222.clear();
                arrayList9222.addAll(f40Var.U2.l);
                z30 z30Var3222 = z30Var;
                f40Var.C2 = z30Var3222.F;
                i12 = i7;
                i13 = 0;
                while (i13 < i12) {
                }
                n30Var3 = n30Var2;
                boolean c10222 = c20Var.c();
                c20Var2 = c20Var;
                if (c20Var2.b) {
                }
                z11 = false;
                org.telegram.ui.Components.h10 h10Var2222 = f40Var.j4;
                y10Var = f40Var.g4;
                h10Var2222.G(y10Var, z10);
                if (y10Var.getVisibility() == 0) {
                }
                if (A5) {
                }
                if (n30Var3.getVisibility() == 0) {
                }
                r02 = f40Var.T3;
                r02.clear();
                r02.addAll(f40Var.S3);
                while (r82 < r02.size()) {
                }
                r3Var = f40Var.U2;
                if (r3Var != null) {
                }
                org.telegram.messenger.r3 r3Var22222 = f40Var.U2;
                if (r3Var22222 != null) {
                }
                f40Var.w5.a(z12, z9);
                if (z12 == f40Var.C4) {
                }
            }
        } catch (Exception e23) {
            e = e23;
            n30Var2 = n30Var;
            i7 = childCount;
            arrayList = arrayList3;
            i10 = i14;
            z30Var = z30Var2;
            org.telegram.messenger.a8.g(e, z10);
            z30Var.f();
            ArrayList arrayList42222 = f40Var.U2.e;
            size = arrayList42222.size();
            while (i11 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = f40Var.x2;
            arrayList52222.clear();
            arrayList52222.addAll(f40Var.U2.g);
            ArrayList arrayList62222 = f40Var.y2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = f40Var.z2;
            arrayList72222.clear();
            arrayList72222.addAll(f40Var.U2.j);
            ArrayList arrayList82222 = f40Var.A2;
            arrayList82222.clear();
            arrayList82222.addAll(f40Var.U2.m);
            ArrayList arrayList92222 = f40Var.B2;
            arrayList92222.clear();
            arrayList92222.addAll(f40Var.U2.l);
            z30 z30Var32222 = z30Var;
            f40Var.C2 = z30Var32222.F;
            i12 = i7;
            i13 = 0;
            while (i13 < i12) {
            }
            n30Var3 = n30Var2;
            boolean c102222 = c20Var.c();
            c20Var2 = c20Var;
            if (c20Var2.b) {
            }
            z11 = false;
            org.telegram.ui.Components.h10 h10Var22222 = f40Var.j4;
            y10Var = f40Var.g4;
            h10Var22222.G(y10Var, z10);
            if (y10Var.getVisibility() == 0) {
            }
            if (A5) {
            }
            if (n30Var3.getVisibility() == 0) {
            }
            r02 = f40Var.T3;
            r02.clear();
            r02.addAll(f40Var.S3);
            while (r82 < r02.size()) {
            }
            r3Var = f40Var.U2;
            if (r3Var != null) {
            }
            org.telegram.messenger.r3 r3Var222222 = f40Var.U2;
            if (r3Var222222 != null) {
            }
            f40Var.w5.a(z12, z9);
            if (z12 == f40Var.C4) {
            }
        }
        ArrayList arrayList422222 = f40Var.U2.e;
        size = arrayList422222.size();
        for (i11 = 0; i11 < size; i11++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i11)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            f40Var.S1.h1(i10, view.getTop() - n30Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = f40Var.x2;
        arrayList522222.clear();
        arrayList522222.addAll(f40Var.U2.g);
        ArrayList arrayList622222 = f40Var.y2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = f40Var.z2;
        arrayList722222.clear();
        arrayList722222.addAll(f40Var.U2.j);
        ArrayList arrayList822222 = f40Var.A2;
        arrayList822222.clear();
        arrayList822222.addAll(f40Var.U2.m);
        ArrayList arrayList922222 = f40Var.B2;
        arrayList922222.clear();
        arrayList922222.addAll(f40Var.U2.l);
        z30 z30Var322222 = z30Var;
        f40Var.C2 = z30Var322222.F;
        i12 = i7;
        i13 = 0;
        while (i13 < i12) {
            n30 n30Var4 = n30Var2;
            View childAt2 = n30Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.f4) || (childAt2 instanceof org.telegram.ui.Cells.y3)) && (G = n30Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt2).setDrawDivider(G.b() != z30Var322222.F + (-2) ? z10 : false);
                } else {
                    ((org.telegram.ui.Cells.y3) childAt2).setDrawDivider(G.b() != z30Var322222.F + (-2) ? z10 : false);
                }
            }
            i13++;
            n30Var2 = n30Var4;
        }
        n30Var3 = n30Var2;
        boolean c1022222 = c20Var.c();
        c20Var2 = c20Var;
        if (c20Var2.b && (s3Var2 = c20Var2.e) != null && !org.telegram.messenger.r3.C(s3Var2.a, s3Var2.b, f40Var.U2)) {
            if (!arrayList2.isEmpty()) {
                z11 = false;
                f40Var.h1(null);
            } else if (c1022222) {
                z11 = false;
                f40Var.h1((org.telegram.messenger.s3) arrayList2.get(0));
            }
            org.telegram.ui.Components.h10 h10Var222222 = f40Var.j4;
            y10Var = f40Var.g4;
            h10Var222222.G(y10Var, z10);
            if (y10Var.getVisibility() == 0) {
                org.telegram.messenger.g0.b4(y10Var);
            }
            if (A5) {
                f40Var.i4.I(f40Var.h4, z10);
            }
            if (n30Var3.getVisibility() == 0) {
                org.telegram.messenger.g0.b4(n30Var3);
            }
            r02 = f40Var.T3;
            r02.clear();
            r02.addAll(f40Var.S3);
            for (r82 = z11; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.y) r02.get(r82)).j(z10);
            }
            r3Var = f40Var.U2;
            if (r3Var != null && c20Var2.b && (s3Var = c20Var2.e) != null) {
                r3Var.d.f(org.telegram.messenger.ij.B1(s3Var.a.peer));
            }
            org.telegram.messenger.r3 r3Var2222222 = f40Var.U2;
            z12 = (r3Var2222222 != null || r3Var2222222.f.isEmpty()) ? z11 : z10;
            f40Var.w5.a(z12, z9);
            if (z12 == f40Var.C4) {
                f40Var.C4 = z12;
                if (A5) {
                    f40Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z11 = false;
        org.telegram.ui.Components.h10 h10Var2222222 = f40Var.j4;
        y10Var = f40Var.g4;
        h10Var2222222.G(y10Var, z10);
        if (y10Var.getVisibility() == 0) {
        }
        if (A5) {
        }
        if (n30Var3.getVisibility() == 0) {
        }
        r02 = f40Var.T3;
        r02.clear();
        r02.addAll(f40Var.S3);
        while (r82 < r02.size()) {
        }
        r3Var = f40Var.U2;
        if (r3Var != null) {
            r3Var.d.f(org.telegram.messenger.ij.B1(s3Var.a.peer));
        }
        org.telegram.messenger.r3 r3Var22222222 = f40Var.U2;
        if (r3Var22222222 != null) {
        }
        f40Var.w5.a(z12, z9);
        if (z12 == f40Var.C4) {
        }
    }

    public final void Q1() {
        if (this.U2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.U2;
        int i7 = currentTime - r3Var.b.record_start_date;
        boolean z9 = r3Var.w;
        org.telegram.ui.ActionBar.z0 z0Var = this.m3;
        if (z9) {
            z0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            z0Var.setSubtext(null);
        }
    }

    public final int R0() {
        n30 n30Var = this.K1;
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

    public final void R1(boolean z9) {
        float interpolation;
        float f10;
        t20 t20Var = this.L1;
        if ((t20Var == null || this.U2 != null) && this.R2 == null) {
            this.Q2 = 1.0f;
            this.P2 = 1.0f;
            if (t20Var == null) {
                return;
            }
        }
        if (!z9) {
            t10 t10Var = this.q4;
            org.telegram.messenger.g0.r(t10Var);
            t10Var.run();
            org.telegram.messenger.r3 r3Var = this.U2;
            n30 n30Var = this.K1;
            if (r3Var == null || r3Var.j()) {
                n30Var.setVisibility(4);
            } else {
                n30Var.setVisibility(0);
            }
            boolean W = org.telegram.messenger.t3.W(this.T2);
            org.telegram.ui.ActionBar.z0 z0Var = this.q3;
            if (W) {
                z0Var.setText(org.telegram.messenger.id.M0(2131743488, null));
            } else {
                z0Var.setText(org.telegram.messenger.id.M0(2131743395, null));
            }
        }
        float f11 = this.P2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.wq.f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.Q2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
            this.Q2 = wqVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * wqVar.getInterpolation(this.P2 / 0.6f);
            f10 = this.P2 / 0.6f;
        }
        N1(true);
        float f12 = 1.0f - f10;
        t20Var.setAlpha(f12);
        this.O1.setAlpha(f10);
        this.Q1.setAlpha(f10);
        m30 m30Var = this.P1;
        m30Var.setAlpha(f10);
        m30Var.setScaleX(interpolation);
        m30Var.setScaleY(interpolation);
        r20 r20Var = this.N1;
        r20Var.setScaleX(f12);
        r20Var.setScaleY(f12);
        r20Var.setAlpha(f12);
        this.M1.setAlpha(f12);
        this.e3.setAlpha(f10);
        int i7 = f12 != 0.0f ? 0 : 4;
        if (i7 != t20Var.getVisibility()) {
            t20Var.setVisibility(i7);
            r20Var.setVisibility(i7);
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return org.telegram.messenger.t3.w(14, this.T2);
        }
        org.telegram.messenger.r3 r3Var = this.U2;
        return (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void S1(boolean z9) {
        org.telegram.ui.Components.voip.n2 n2Var = this.s1;
        if (n2Var == null || n2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        p10 p10Var = this.o1;
        if (sharedInstance == null || u1()) {
            n2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, org.telegram.messenger.id.M0(2131743437, null), false, z9);
            boolean z10 = org.telegram.messenger.t3.t0(this.T2) || (org.telegram.messenger.t3.N(this.T2) && org.telegram.messenger.t3.w(3, this.T2));
            mh.a aVar = (mh.a) p10Var.c.get(n2Var);
            if (aVar != null) {
                aVar.d.a(z10, z9);
                n2Var.setEnabled(z10);
            }
            n2Var.b(true, false);
            return;
        }
        mh.a aVar2 = (mh.a) p10Var.c.get(n2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z9);
            n2Var.setEnabled(true);
        }
        boolean z11 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z12 = !z11 && sharedInstance.isSpeakerphoneOn();
        if (z11) {
            n2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743503, null), false, z9);
        } else if (z12) {
            n2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.id.M0(2131743239, null), false, z9);
        } else if (sharedInstance.isHeadsetPlugged()) {
            n2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743501, null), false, z9);
        } else {
            n2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743239, null), false, z9);
        }
        n2Var.b(z12, z9);
        k1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i7 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.U1 != i7) {
            this.U1 = i7;
            org.telegram.messenger.g0.R3(this.V1, i7);
        }
        org.telegram.ui.Components.voip.n2 n2Var2 = this.q1;
        if (n2Var2.getVisibility() == 0) {
            n2Var2.c(0, -1, 0, 1.0f, true, i1(k1()), false, z9);
            n2Var2.b(k1() != 1, z9);
        }
    }

    public final void T0() {
        if (this.L3) {
            this.L3 = false;
            org.telegram.messenger.g0.r(this.s4);
        }
        if (this.M3) {
            this.M3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.v1.onTouchEvent(obtain);
            obtain.recycle();
        }
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
    public final void T1(boolean z9, boolean z10) {
        long j3;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        int i11;
        boolean z17;
        org.telegram.ui.Components.voip.n2 n2Var;
        org.telegram.ui.Components.voip.n2 n2Var2;
        org.telegram.ui.Components.voip.n2 n2Var3;
        boolean z18;
        boolean u12;
        int i12;
        org.telegram.messenger.r3 r3Var = this.U2;
        org.telegram.ui.Components.voip.n2 n2Var4 = this.t1;
        int i13 = 6;
        if (r3Var == null || r3Var.j()) {
            if (S0()) {
                i13 = 5;
            } else if (this.U2.b.schedule_start_subscribed) {
                i13 = 7;
            }
            P1(i13, z9);
            n2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131752041, null), false, false);
            R1(false);
            return;
        }
        N1(z9);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j3 = 0;
        } else {
            j3 = 0;
            if ((this.n2 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.n2) > 3000) && ((i12 = this.N3) == 1 || i12 == 2 || i12 == 6 || i12 == 5)) {
                T0();
                P1(3, z9);
                i7 = 4;
                z11 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.u2));
                z12 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0();
                if (!((z12 && this.U2.c()) || z11) || u1()) {
                    z13 = false;
                    z14 = true;
                } else {
                    z14 = false;
                    z13 = true;
                }
                if (z11) {
                    z15 = !z12;
                    i10 = 0;
                } else {
                    z15 = false;
                    i10 = 1;
                }
                if (z5) {
                    z16 = z15;
                    i11 = i10;
                } else {
                    z16 = false;
                    i11 = 0;
                }
                int i14 = i11 + (!z14 ? 2 : 0) + (!z13 ? i7 : 0);
                c20 c20Var = this.U3;
                int i15 = i14 + ((c20Var == null && c20Var.b) ? 8 : 0) + (!z16 ? 16 : 0);
                z17 = (this.i2 | 2) == (i15 | 2);
                this.i2 = i15;
                boolean z19 = z11;
                org.telegram.ui.Components.voip.n2 n2Var5 = this.r1;
                if (z13) {
                    n2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.id.M0(2131743489, null), !z19, z9);
                    n2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.n2 n2Var6 = this.p1;
                if (i11 != 0) {
                    n2Var6.c(0, -1, 0, 1.0f, true, org.telegram.messenger.id.M0(2131743406, null), false, false);
                    n2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.n2 n2Var7 = this.q1;
                if (z16) {
                    n2Var = n2Var6;
                    n2Var2 = n2Var5;
                    n2Var3 = n2Var7;
                    z18 = z9;
                } else {
                    k1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i16 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.U1 != i16) {
                        this.U1 = i16;
                        org.telegram.messenger.g0.R3(this.V1, i16);
                    }
                    n2Var2 = n2Var5;
                    n2Var = n2Var6;
                    n2Var7.c(0, -1, 0, 1.0f, true, i1(k1()), false, z9);
                    n2Var3 = n2Var7;
                    z18 = z9;
                    n2Var3.b(k1() != 1, z18);
                }
                org.telegram.ui.Components.voip.n2 n2Var8 = n2Var3;
                n2Var4.c(!u1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131743364, null), false, false);
                if (z17 && z14) {
                    S1(false);
                }
                n2Var2.d(true, z18);
                n2Var.d(true, z18);
                n2Var8.d(true, z18);
                u12 = u1();
                w10 w10Var = this.Z2;
                if (u12) {
                    w10Var.setVisibility(8);
                } else {
                    w10Var.setVisibility(0);
                    boolean z20 = ((Integer) w10Var.getTag()).intValue() == 3;
                    int i17 = this.N3;
                    final boolean z21 = i17 == 3;
                    w10Var.setTag(Integer.valueOf(i17));
                    if (z20 != z21) {
                        ValueAnimator valueAnimator = this.b3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.a3;
                        if (z18) {
                            final int color = paint.getColor();
                            final int i18 = z21 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.b3 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.x00
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int S0 = org.telegram.messenger.g0.S0(floatValue, 1.0f, color, i18);
                                    f40 f40Var = f40.this;
                                    f40Var.a3.setColor(S0);
                                    f40Var.Z2.invalidate();
                                    if (!z21) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    f40Var.c3 = floatValue;
                                    u30 u30Var = f40Var.O2;
                                    if (u30Var == null || !f40Var.t4) {
                                        return;
                                    }
                                    u30Var.invalidate();
                                }
                            });
                            this.b3.setDuration(300L);
                            this.b3.setInterpolator(org.telegram.ui.Components.wq.f);
                            this.b3.addListener(new a30(this, 2));
                            this.b3.start();
                        } else {
                            paint.setColor(this.N3 == 3 ? -1163700 : -12761513);
                            w10Var.invalidate();
                        }
                    }
                }
                if (u1() || !org.telegram.messenger.sc.e(512)) {
                }
                if (this.N3 == 3) {
                    this.t4 = true;
                    E1();
                    return;
                } else {
                    this.t4 = false;
                    org.telegram.messenger.g0.r(this.u4);
                    return;
                }
            }
        }
        if (this.v2 != null) {
            n1().k(0L, 37, this.v2, this.T2, null, null);
            this.v2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.u2));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || S0()) {
            i7 = 4;
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z10 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                T0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                P1(0, z9);
            } else {
                P1(1, z9);
            }
        } else {
            T0();
            if (groupCallParticipant2.raise_hand_rating != j3) {
                i7 = 4;
                P1(4, z9);
            } else {
                i7 = 4;
                P1(2, z9);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.u2));
        if (groupCallParticipant3 == null) {
        }
        if (z12) {
        }
        z13 = false;
        z14 = true;
        if (z11) {
        }
        if (z5) {
        }
        int i142 = i11 + (!z14 ? 2 : 0) + (!z13 ? i7 : 0);
        c20 c20Var2 = this.U3;
        int i152 = i142 + ((c20Var2 == null && c20Var2.b) ? 8 : 0) + (!z16 ? 16 : 0);
        if ((this.i2 | 2) == (i152 | 2)) {
        }
        this.i2 = i152;
        boolean z192 = z11;
        org.telegram.ui.Components.voip.n2 n2Var52 = this.r1;
        if (z13) {
        }
        org.telegram.ui.Components.voip.n2 n2Var62 = this.p1;
        if (i11 != 0) {
        }
        org.telegram.ui.Components.voip.n2 n2Var72 = this.q1;
        if (z16) {
        }
        org.telegram.ui.Components.voip.n2 n2Var82 = n2Var3;
        n2Var4.c(!u1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131743364, null), false, false);
        if (z17) {
            S1(false);
        }
        n2Var2.d(true, z18);
        n2Var.d(true, z18);
        n2Var82.d(true, z18);
        u12 = u1();
        w10 w10Var2 = this.Z2;
        if (u12) {
        }
        if (u1()) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z9;
        if (!this.W4) {
            h20 h20Var = this.V3;
            if (h20Var.getVisibility() == 0 && h20Var.getAlpha() == 1.0f) {
                z9 = true;
                if (this.f4 == z9) {
                    this.f4 = z9;
                    this.o1.invalidate();
                    this.b.invalidate();
                    this.K1.invalidate();
                    return;
                }
                return;
            }
        }
        z9 = false;
        if (this.f4 == z9) {
        }
    }

    public final void U1() {
        boolean z9;
        d40 d40Var;
        c30 c30Var = this.I1;
        if (c30Var == null || this.U2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i7 = 0;
        for (int i10 = 0; i10 < this.U2.P.m(); i10++) {
            long j3 = this.U2.P.j(i10);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.P.f(j3);
            if (!groupCallParticipant.self) {
                c20 c20Var = this.U3;
                c20Var.getClass();
                if (c20Var.x.get(org.telegram.messenger.ij.B1(groupCallParticipant.peer)) <= 0 && this.v4.get(j3, 0) != 1) {
                    long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i7 < 2) {
                        TLRPC.User a22 = B1 > 0 ? org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(B1)) : null;
                        TLRPC.Chat M0 = B1 <= 0 ? org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(B1)) : null;
                        if (a22 != null || M0 != null) {
                            if (i7 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (a22 != null) {
                                spannableStringBuilder.append(org.telegram.messenger.t10.j(a22, true), new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0);
                            } else {
                                spannableStringBuilder.append(M0.title, new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0);
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
            String K0 = org.telegram.messenger.id.K0(i7, "MembersAreSpeakingToast");
            int indexOf = K0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            c30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.m5 subtitleTextView = c30Var.getSubtitleTextView();
        String str = u1() ? "ViewersWatching" : "Participants";
        int i11 = this.U2.b.participants_count;
        z30 z30Var = this.J1;
        subtitleTextView.k(org.telegram.messenger.id.G(i11 + ((z30Var.M.u1() || z30Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), str, new Object[0]));
        if (u1() && (d40Var = this.v3) != null) {
            d40Var.setWatchersCount(this.U2.b.participants_count);
        }
        if (z9 != this.o4) {
            this.o4 = z9;
            c30Var.invalidate();
            c30Var.getSubtitleTextView().setPivotX(0.0f);
            c30Var.getSubtitleTextView().setPivotY(c30Var.getMeasuredHeight() >> 1);
            c30Var.getSubtitleTextView().animate().scaleX(this.o4 ? 0.98f : 1.0f).scaleY(this.o4 ? 0.9f : 1.0f).alpha(this.o4 ? 0.0f : 1.0f).setDuration(150L);
            org.telegram.messenger.g0.X3(c30Var.getAdditionalSubtitleTextView(), this.o4);
        }
    }

    public final void V0() {
        this.z1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom());
        this.A1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.o1.setAlpha(1.0f - this.t5.e);
        W0();
        X0();
    }

    public final void V1(boolean z9) {
        org.telegram.messenger.r3 r3Var = this.U2;
        u10 u10Var = this.Y2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.T2)) {
                u10Var.b(org.telegram.messenger.id.M0(2131743462, null), z9);
                return;
            } else {
                u10Var.b(org.telegram.messenger.id.M0(2131743341, null), z9);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.b.title);
        c30 c30Var = this.I1;
        if (isEmpty) {
            TLRPC.Chat chat = this.T2;
            if (chat != null && !chat.title.equals(c30Var.getTitle())) {
                if (z9) {
                    this.I1.M(this.T2.title, true, 180L, null);
                    c30Var.getTitleTextView().setOnClickListener(new s00(this, 8));
                } else {
                    c30Var.setTitle(this.T2.title);
                }
                if (!org.telegram.messenger.t3.W(this.T2)) {
                    u10Var.b(org.telegram.messenger.id.M0(2131743306, null), z9);
                } else if (u1()) {
                    u10Var.b(this.T2.title, z9);
                } else {
                    u10Var.b(org.telegram.messenger.id.M0(2131743447, null), z9);
                }
            } else if (this.T2 == null) {
                c30Var.setTitle(org.telegram.messenger.id.M0(2131751823, null));
                u10Var.b(org.telegram.messenger.id.M0(2131751823, null), z9);
            }
        } else if (!this.U2.b.title.equals(c30Var.getTitle())) {
            if (z9) {
                this.I1.M(this.U2.b.title, true, 180L, null);
                c30Var.getTitleTextView().setOnClickListener(new s00(this, 7));
            } else {
                c30Var.setTitle(this.U2.b.title);
            }
            u10Var.b(this.U2.b.title, z9);
        }
        org.telegram.ui.ActionBar.m5 titleTextView = c30Var.getTitleTextView();
        if (!this.U2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                u10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                u10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new b40(titleTextView));
            TextView textView = u10Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(textView), (Drawable) null);
            TextView nextTextView = u10Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(nextTextView), (Drawable) null);
        }
    }

    public final void W0() {
        float f10 = this.w3.b.a;
        int i7 = f10 > 0.0f ? 0 : 8;
        n20 n20Var = this.z1;
        n20Var.setAlpha(f10);
        m20 m20Var = this.A1;
        m20Var.setAlpha(f10);
        if (n20Var.getVisibility() != i7) {
            n20Var.setVisibility(i7);
            m20Var.setVisibility(i7);
            if (i7 == 8) {
                k20 k20Var = this.B1;
                if (k20Var.isFocused()) {
                    k20Var.clearFocus();
                }
            }
        }
    }

    public final void W1() {
        float f10;
        org.telegram.ui.Components.fb fbVar;
        if (this.E == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.s2 - L;
        if (this.s0 + f11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f11) - this.s0) / ((L - this.s0) - org.telegram.messenger.g0.L(14.0f)));
            f11 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r0) * f10);
        } else {
            f10 = 0.0f;
        }
        this.E.setTranslationY(org.telegram.messenger.g0.T1(((-r0.getTop()) - this.E.getHeight()) + f11 + this.b.getPaddingTop() + org.telegram.messenger.g0.L(10.0f), this.I1.getY() + (-this.E.getTop()) + r4.getHeight(), f10));
        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.w;
        if (bcVar == null || (fbVar = bcVar.e) == null || fbVar.getParent() == null || fbVar.getParent().getParent() != this.E) {
            return;
        }
        fbVar.setTop(f10 > 0.5f);
    }

    public final void X0() {
        org.telegram.ui.Components.ii0 ii0Var = this.E1;
        if (ii0Var != null) {
            float f10 = this.w3.b.a * this.u5.e;
            ii0Var.setAlpha(f10);
            int i7 = f10 > 0.0f ? 0 : 8;
            if (this.E1.getVisibility() != i7) {
                this.E1.setVisibility(i7);
                if (i7 == 8) {
                    this.E1.n();
                }
            }
            org.telegram.ui.Components.ii0 ii0Var2 = this.E1;
            if (ii0Var2.N0 || f10 != 1.0f) {
                return;
            }
            ii0Var2.N0 = true;
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.t5.e;
            p10 p10Var = this.o1;
            p10Var.setAlpha(f12);
            this.U3.setProgressToHideUi(f10);
            this.g4.invalidate();
            this.b.invalidate();
            p10Var.invalidate();
        }
        if (i7 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.b.invalidate();
        }
        if (i7 == 4) {
            a1();
            this.A1.invalidate();
            this.B1.invalidate();
        }
        if (i7 == 5) {
            a1();
            this.b.invalidate();
        }
    }

    public final void Y0() {
        boolean z9 = A5;
        p10 p10Var = this.o1;
        if (z9) {
            p10Var.setTranslationX(0.0f);
            p10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = z5;
        te.a aVar = this.t5;
        if (z10) {
            p10Var.setTranslationX(aVar.e * org.telegram.messenger.g0.L(94.0f));
            p10Var.setTranslationY(0.0f);
        } else {
            p10Var.setTranslationX(0.0f);
            p10Var.setTranslationY(aVar.e * org.telegram.messenger.g0.L(94.0f));
        }
    }

    public final void Z0() {
        boolean z9 = A5;
        y10 y10Var = this.g4;
        if (z9) {
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = z5;
        te.a aVar = this.t5;
        if (z10) {
            y10Var.setTranslationX(aVar.e * org.telegram.messenger.g0.L(94.0f));
            y10Var.setTranslationY(0.0f);
        } else {
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(aVar.e * org.telegram.messenger.g0.L(94.0f));
        }
    }

    public final void a1() {
        float f10 = this.v5.f;
        rh.h hVar = this.w3;
        float T1 = org.telegram.messenger.g0.T1(A5 ? (1.0f - this.w5.e) * org.telegram.messenger.g0.L(-91.0f) : z5 ? 0.0f : ((this.t5.e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.U3.c)) - org.telegram.messenger.g0.L(91.0f), -((hVar.d() - this.b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.u5.e) + org.telegram.messenger.g0.L(10.0f)), hVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + T1) - this.s0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        nh.h hVar2 = this.W1;
        hVar2.setTranslationY(T1);
        hVar2.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.E1 != null) {
            this.E1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.u5.e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        float f10 = this.u5.e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.D1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        imageView.setClickable(f10 > 0.9f);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.C1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        imageView2.setClickable(f11 > 0.9f);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.y yVar = this.T4;
        if (yVar != null) {
            yVar.a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.y yVar2 = this.T4;
            yVar2.h = false;
            yVar2.j(false);
            this.T4.invalidate();
            this.U3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.R4;
        if (f4Var != null && !this.V4 && f4Var.getParent() != null) {
            this.b.removeView(this.R4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.R4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.R4.setAboutVisible(false);
            this.R4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.g10 g10Var = this.U4;
        if (g10Var != null) {
            g10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.R4 = null;
        this.S4 = null;
        this.U4 = null;
        this.T4 = null;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String M0;
        org.telegram.messenger.s3 s3Var;
        VoIPService sharedInstance;
        int i11;
        int i12;
        int i13 = org.telegram.messenger.qs.w2;
        n30 n30Var = this.K1;
        String[] strArr = null;
        int i14 = 0;
        int i15 = 1;
        if (i7 == i13) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.U2;
            if (r3Var == null || r3Var.b.id != l10.longValue()) {
                return;
            }
            org.telegram.messenger.r3 r3Var2 = this.U2;
            if (r3Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j3 = this.n2;
            int i16 = 2;
            org.telegram.messenger.c cVar = this.n1;
            if (j3 == 0 && (((i12 = this.z3) == 7 || i12 == 5 || i12 == 6) && !r3Var2.j())) {
                try {
                    Intent intent = new Intent(this.c2, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", l1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.V2);
                    intent.putExtra("peerChannelId", this.S2.channel_id);
                    intent.putExtra("peerChatId", this.S2.chat_id);
                    intent.putExtra("peerUserId", this.S2.user_id);
                    intent.putExtra("hash", this.W2);
                    intent.putExtra("peerAccessHash", this.S2.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", cVar.a);
                    intent.putExtra("scheduleDate", this.e4);
                    this.c2.startService(intent);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                this.n2 = SystemClock.elapsedRealtime();
                org.telegram.messenger.g0.i3(new v00(this, i16), 3000L);
            }
            if (!this.o2 && VoIPService.getSharedInstance() != null) {
                this.U2.b(false);
                o1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            O1();
            int childCount = n30Var.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = n30Var.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt).a(true, false);
                }
            }
            if (this.R4 != null) {
                this.m2 = true;
            } else {
                Q0(true);
            }
            U1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z9 = this.z3 == 4;
            T1(true, booleanValue);
            V1(true);
            if (z9 && ((i11 = this.z3) == 1 || i11 == 0)) {
                n1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l11 = (Long) objArr[3];
                long longValue = l11.longValue();
                if (longValue == 0 || u1()) {
                    return;
                }
                if (r1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList arrayList = org.telegram.messenger.qp.s1(cVar.a).y;
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
                if (org.telegram.messenger.m5.E(longValue)) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.a).a2(l11);
                    if (a22 != null) {
                        if (this.U2.b.participants_count < 250 || org.telegram.messenger.t10.w(a22) || a22.verified || i14 != 0) {
                            n1().k(0L, 44, a22, this.T2, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(-longValue));
                if (M02 != null) {
                    if (this.U2.b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i14 != 0) {
                        n1().k(0L, 44, M02, this.T2, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.y2) {
            c20 c20Var = this.U3;
            if (c20Var.b && this.U2 != null) {
                boolean c10 = c20Var.c();
                org.telegram.messenger.r3 r3Var3 = this.U2;
                if (r3Var3 != null && c20Var.b && (s3Var = c20Var.e) != null && r3Var3.d.f(org.telegram.messenger.ij.B1(s3Var.a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i19 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.k2;
                        if (i19 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i19);
                        if (this.U2.P.g(null, org.telegram.messenger.ij.B1(s3Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.a;
                            if (!groupCallParticipant3.muted_by_you && c20Var.d != org.telegram.messenger.ij.B1(groupCallParticipant3.peer)) {
                                s3Var2 = s3Var3;
                            }
                        }
                        i19++;
                    }
                    if (s3Var2 != null) {
                        h1(s3Var2);
                    }
                }
            }
            c20Var.setVisibleParticipant(true);
            U1();
            return;
        }
        if (i7 == org.telegram.messenger.qs.N4) {
            H1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i7 == org.telegram.messenger.qs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    M0 = org.telegram.messenger.t3.W(this.T2) ? org.telegram.messenger.id.M0(2131743452, null) : org.telegram.messenger.id.M0(2131743319, null);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.t3.W(this.T2) ? org.telegram.messenger.id.M0(2131743478, null) : org.telegram.messenger.id.M0(2131743370, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131751105, null) + "\n" + str;
                }
                AlertDialog$Builder K = org.telegram.ui.Components.u4.K(getContext(), org.telegram.messenger.id.M0(2131743306, null), M0);
                K.j(new z00(this, i15));
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
        if (i7 == org.telegram.messenger.qs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == l1()) {
                O1();
                T1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.ij.B1(this.u2);
            org.telegram.messenger.r3 r3Var4 = this.U2;
            if (r3Var4 == null || chatFull.id != (-B1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(B1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            Q0(true);
            org.telegram.messenger.g0.b4(n30Var);
            if (this.y4 != null) {
                while (i14 < this.y4.getChildCount()) {
                    View childAt2 = this.y4.getChildAt(i14);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.z0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.z0) childAt2).j(org.telegram.messenger.id.M0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743506 : 2131743416, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.u1) {
            if (((Long) objArr[0]).longValue() == l1()) {
                O1();
                T1(isShowing(), false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.B2) {
            int childCount2 = n30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i14 < childCount2) {
                v4.d1 G = n30Var.G(n30Var.getChildAt(i14));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                        if (f4Var.getParticipant() != null) {
                            f4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i14++;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.E0) {
            Long l12 = (Long) objArr[0];
            long B12 = org.telegram.messenger.ij.B1(this.u2);
            if (this.U2 == null || B12 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(B12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            Q0(true);
            org.telegram.messenger.g0.b4(n30Var);
            if (this.y4 != null) {
                while (i14 < this.y4.getChildCount()) {
                    View childAt3 = this.y4.getChildAt(i14);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.z0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.z0) childAt3).j(org.telegram.messenger.id.M0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743507 : 2131743417, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.j0) {
            Q0(true);
            org.telegram.messenger.g0.b4(n30Var);
            return;
        }
        if (i7 == org.telegram.messenger.qs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i20 = org.telegram.messenger.qp.C8;
            int i21 = intValue & 16;
            if (i21 != 0) {
                Q0(true);
            }
            if (i21 == 0 && (intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            org.telegram.messenger.g0.b4(n30Var);
            return;
        }
        if (i7 == org.telegram.messenger.qs.z2) {
            w20 w20Var = this.t2;
            if (w20Var != null) {
                w20Var.b(true, true);
            }
            O1();
            return;
        }
        if (i7 == org.telegram.messenger.qs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.j2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        LaunchActivity launchActivity = this.c2;
        launchActivity.Z0.remove(this.p4);
        this.c2.setRequestedOrientation(-1);
        y5 = false;
        org.telegram.ui.Components.h20 h20Var = this.y3;
        if (h20Var != null) {
            h20Var.dismiss();
        }
        this.m2 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.n1;
        int i7 = cVar.a;
        int i10 = cVar.a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.M0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.w2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.u1);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.B2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.E0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.j0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.z2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.y2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.c2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.c2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z9 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z9 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z9);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                n1().j(z9 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z9) {
        if (this.W4 || !this.Z3) {
            return;
        }
        if (z9) {
            this.W4 = true;
            D1(false, this.R4);
            return;
        }
        d1();
        this.b.removeView(this.Y3);
        this.Y3 = null;
        this.w4.setVisibility(8);
        this.b.invalidate();
        this.Z3 = false;
        this.S1.X = true;
        this.K1.invalidate();
        this.V3.setVisibility(8);
        if (this.m2) {
            this.m2 = false;
            Q0(true);
        }
        U0();
    }

    public final org.telegram.ui.Components.voip.r g1() {
        int i7 = 0;
        while (true) {
            n30 n30Var = this.K1;
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

    public final void h1(org.telegram.messenger.s3 s3Var) {
        org.telegram.messenger.s3 s3Var2;
        if (s3Var == null) {
            this.c2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            c20 c20Var = this.U3;
            if (c20Var.r != null) {
                return;
            }
            boolean z9 = A5;
            n30 n30Var = this.K1;
            int i7 = 0;
            if (!z9) {
                if (this.k4 != null) {
                    n30Var.getViewTreeObserver().removeOnPreDrawListener(this.k4);
                    this.k4 = null;
                }
                if (s3Var == null) {
                    if (n30Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = n30Var.getViewTreeObserver();
                        z20 z20Var = new z20(this, 1);
                        this.k4 = z20Var;
                        viewTreeObserver.addOnPreDrawListener(z20Var);
                        return;
                    }
                    n30Var.setVisibility(0);
                    Q0(false);
                    this.m2 = true;
                    ViewTreeObserver viewTreeObserver2 = n30Var.getViewTreeObserver();
                    z20 z20Var2 = new z20(this, 0);
                    this.k4 = z20Var2;
                    viewTreeObserver2.addOnPreDrawListener(z20Var2);
                    return;
                }
                y10 y10Var = this.g4;
                if (y10Var.getVisibility() == 0) {
                    c20Var.j(s3Var);
                    org.telegram.messenger.g0.b4(y10Var);
                    return;
                }
                y10Var.setVisibility(0);
                org.telegram.ui.Components.h10 h10Var = this.j4;
                h10Var.G(y10Var, false);
                this.m2 = true;
                if (!c20Var.b) {
                    ArrayList arrayList = h10Var.e;
                    v4.b0 b0Var = (v4.b0) y10Var.getLayoutManager();
                    if (b0Var != null) {
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.s3) arrayList.get(i7)).equals(s3Var)) {
                                b0Var.h1(i7, org.telegram.messenger.g0.L(13.0f));
                                break;
                            }
                            i7++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = n30Var.getViewTreeObserver();
                nw nwVar = new nw(1, this, s3Var);
                this.k4 = nwVar;
                viewTreeObserver3.addOnPreDrawListener(nwVar);
                return;
            }
            if (this.k4 != null) {
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this.k4);
                this.k4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            i40 i40Var = this.i4;
            ArrayList arrayList3 = this.S3;
            ArrayList arrayList4 = this.T3;
            if (s3Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList4.get(i10);
                    org.telegram.ui.Components.voip.r rVar = yVar.c;
                    if (rVar != null) {
                        rVar.setRenderer(null);
                        org.telegram.ui.Components.g10 g10Var = yVar.d;
                        if (g10Var != null) {
                            g10Var.setRenderer(null);
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
                this.J4 = false;
                i40Var.H(this.h4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) arrayList4.get(i11);
                    if (yVar2.e != null && ((s3Var2 = yVar2.x) == null || !s3Var2.equals(s3Var))) {
                        arrayList2.add(yVar2.x);
                        yVar2.b(false);
                        org.telegram.ui.Components.g10 g10Var2 = yVar2.d;
                        if (g10Var2 != null) {
                            g10Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.r rVar3 = yVar2.c;
                        if (rVar3 != null) {
                            rVar3.setRenderer(null);
                        }
                        yVar2.animate().alpha(0.0f).setListener(new x20(this, yVar2, 1));
                    }
                }
                this.J4 = true;
                i40Var.r = false;
                if (!arrayList2.isEmpty()) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(29, this, arrayList2));
                }
            }
            boolean z10 = !c20Var.b;
            ViewTreeObserver viewTreeObserver4 = n30Var.getViewTreeObserver();
            nh nhVar = new nh(this, s3Var, z10);
            this.k4 = nhVar;
            viewTreeObserver4.addOnPreDrawListener(nhVar);
        }
    }

    public final int k1() {
        Integer num = this.s5;
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

    public final long l1() {
        TLRPC.Chat chat = this.T2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        y5 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.ui.Components.p10.k(getContext());
        return false;
    }

    public final void m1(boolean z9) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.n1;
        int i7 = cVar.a;
        int i10 = cVar.a;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(l1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(l1());
            String K = org.telegram.messenger.t3.K(this.T2, false);
            String n10 = !TextUtils.isEmpty(K) ? org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(i10).U2, "/", K, new StringBuilder()) : (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(n10)) {
                z1(null, n10, true, z9);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.l1(this.T2);
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new bi.u9(this, N0, z9, 6));
            return;
        }
        if (this.U2 == null) {
            return;
        }
        int i11 = 0;
        while (i11 < 2) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            org.telegram.messenger.r3 r3Var = this.U2;
            exportgroupcallinvite.call = r3Var.g(r3Var.a);
            exportgroupcallinvite.can_self_unmute = i11 == 1;
            ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.cd(this, i11, z9, 2));
            i11++;
        }
    }

    public final UndoView n1() {
        if (!A5) {
            c20 c20Var = this.U3;
            if (c20Var.b) {
                return c20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.d2;
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

    public final void o1() {
        VoIPService sharedInstance;
        if (this.o2 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.o2 = true;
        this.x2.addAll(this.U2.g);
        this.y2.addAll(this.k2);
        this.z2.addAll(this.U2.j);
        this.A2.addAll(this.U2.m);
        this.B2.addAll(this.U2.l);
        this.N3 = sharedInstance.getCallState();
        if (this.U2 == null) {
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            this.U2 = r3Var;
            this.j4.c = r3Var;
            this.U3.setGroupCall(r3Var);
            this.i4.c = this.U2;
        }
        int i7 = 0;
        nh.h hVar = this.W1;
        if (hVar != null) {
            hVar.D0(this.n1.a, this.U2.g(false));
        }
        this.I1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
        ArrayList arrayList = this.U2.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = r7.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        m30 m30Var = this.P1;
        if (m30Var == null || m30Var.getVisibility() != 0) {
            return;
        }
        this.t1.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131743364, null), false, true);
        S1(true);
        this.q3.setText(org.telegram.messenger.id.M0(org.telegram.messenger.t3.W(this.T2) ? 2131743481 : 2131743380, null));
        n30 n30Var = this.K1;
        n30Var.setVisibility(0);
        org.telegram.ui.ActionBar.r0 r0Var = this.f3;
        r0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n30Var, (Property<n30, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n30Var, (Property<n30, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.m5 m5Var = this.O1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.Q1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(m5Var2, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(m5Var2, (Property<org.telegram.ui.ActionBar.m5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(m5Var2, (Property<org.telegram.ui.ActionBar.m5, Float>) property, 0.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.wq.g);
        animatorSet.addListener(new a30(this, i7));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        S1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            H1(0.0f);
        }
        n30 n30Var = this.K1;
        if (n30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(n30Var);
        }
        y10 y10Var = this.g4;
        if (y10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(y10Var);
        }
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        w20 w20Var = this.t2;
        if (w20Var != null) {
            w20Var.b(false, false);
            return;
        }
        if (this.Z3) {
            f1(true);
        } else if (this.U3.b) {
            h1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z9) {
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        w20 w20Var = this.t2;
        if (w20Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        w20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.c2;
        launchActivity.Z0.add(this.p4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        this.N3 = i7;
        T1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public final void p1(final long j3, final boolean z9) {
        if (this.U2 != null) {
            org.telegram.messenger.c cVar = this.n1;
            final TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(j3));
            if (a22 != null) {
                int i7 = 0;
                final org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.U2;
                invitetogroupcall.call = r3Var.g(r3Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.a).sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.g10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        f40 f40Var = f40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                        if (tLObject == null) {
                            org.telegram.messenger.g0.h3(new bi.o(f40Var, u1VarArr2, z9, tL_error, j10, invitetogroupcall));
                            return;
                        }
                        org.telegram.messenger.qp.s1(f40Var.n1.a).O3((TLRPC.Updates) tLObject, false);
                        org.telegram.messenger.g0.h3(new bi.w2(f40Var, j10, u1VarArr2, a22, 20));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new h10(this, u1VarArr, sendRequest, i7), 500L);
                }
            }
        }
    }

    public final boolean q1() {
        int L = org.telegram.messenger.g0.L(74.0f);
        float f10 = this.s2 - L;
        return (((((float) this.s0) + f10) > ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 1 : ((((float) this.s0) + f10) == ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - f10) - ((float) this.s0)) / ((float) ((L - this.s0) - org.telegram.messenger.g0.L(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean r1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.Y1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ch, false));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.e3;
            if (r0Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Vg;
                r0Var.O(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
                r0Var.O(org.telegram.ui.ActionBar.m6.x0(null, i7, false), true);
                r0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false);
            K1(this.r3, x02);
            K1(this.s3, x02);
            K1(this.j3, x02);
            K1(this.k3, x02);
            K1(this.q3, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.jh, false));
            K1(this.h3, x02);
            K1(this.i3, x02);
            K1(this.l3, x02);
            K1(this.m3, x02);
            K1(this.n3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        ti.o oVar;
        super.show();
        org.telegram.ui.Components.voip.g1 g1Var = org.telegram.ui.Components.voip.g1.w;
        if (g1Var == null || (oVar = g1Var.a) == null || !oVar.e()) {
            return;
        }
        org.telegram.ui.Components.voip.g1 g1Var2 = org.telegram.ui.Components.voip.g1.w;
        if (g1Var2.a == null) {
            return;
        }
        org.telegram.ui.Components.voip.q0 q0Var = g1Var2.e;
        g1Var2.e = null;
        g1Var2.b.a = null;
        g1Var2.a.a(new org.telegram.ui.Components.ex(7, g1Var2, q0Var));
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(13));
    }

    public final boolean t1() {
        return u1() && !this.U2.f.isEmpty() && (((org.telegram.messenger.s3) this.U2.f.get(0)).c == 0.0f || ((org.telegram.messenger.s3) this.U2.f.get(0)).c >= 1.0f);
    }

    public final boolean u1() {
        org.telegram.messenger.r3 r3Var = this.U2;
        return r3Var != null && r3Var.b.rtmp_stream;
    }

    public final void v1(org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        if (this.q2) {
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c2.M().getFragmentStack().get(this.c2.M().getFragmentStack().size() - 1);
        if (f2Var instanceof cn) {
            boolean ra2 = ((cn) f2Var).ra();
            this.q2 = true;
            this.r2 = true;
            org.telegram.messenger.g0.i3(new xn(w2Var, editTextBoldCursor, z9, u1Var, 7), ra2 ? 200L : 0L);
            return;
        }
        this.q2 = true;
        this.r2 = true;
        if (w2Var != null) {
            w2Var.A0(true);
        } else if (u1Var != null) {
            u1Var.l(true);
        }
        if (z9) {
            org.telegram.messenger.g0.i3(new rg(editTextBoldCursor, 2), 100L);
        }
    }

    public final void x1() {
        C5 = true;
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(false);
        }
        l30 l30Var = this.F1;
        org.telegram.ui.Components.y61 y61Var = l30Var.w;
        if (y61Var != null) {
            y61Var.c(false);
        }
        l30Var.F = true;
        this.B1.r();
    }

    public final void y1() {
        C5 = false;
        this.J1.f();
        y10 y10Var = this.g4;
        if (y10Var.getVisibility() == 0) {
            this.j4.G(y10Var, false);
        }
        if (A5) {
            this.i4.I(this.h4, false);
        }
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        l30 l30Var = this.F1;
        org.telegram.ui.Components.y61 y61Var = l30Var.w;
        if (y61Var != null) {
            y61Var.c(true);
        }
        l30Var.F = false;
        this.B1.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(String str, String str2, boolean z9, boolean z10) {
        boolean z11;
        String str3;
        String str4;
        String str5;
        if (u1() && str != null) {
            str2 = null;
        }
        if (z10) {
            if (str == null) {
                str = str2;
            }
            org.telegram.messenger.g0.g(str);
            if (org.telegram.messenger.g0.I3()) {
                n1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.c2;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) launchActivity.M().getFragmentStack().get(this.c2.M().getFragmentStack().size() - 1);
            if (f2Var instanceof cn) {
                z11 = ((cn) f2Var).ra();
                this.r2 = true;
                this.q2 = true;
                if (str == null && str2 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                if (str3 == null || !z9) {
                    str5 = str4;
                } else {
                    str5 = org.telegram.messenger.t3.W(this.T2) ? org.telegram.messenger.id.a0("VoipChannelInviteText", null, 2131743480, str4) : org.telegram.messenger.id.a0("VoipGroupInviteText", null, 2131743372, str4);
                }
                b30 b30Var = new b30(this, getContext(), str5, str3, str4, str3);
                this.l2 = b30Var;
                b30Var.n2 = new f(this, 17);
                b30Var.setOnDismissListener(new z00(this, 3));
                org.telegram.messenger.g0.i3(new v00(this, 7), !z11 ? 200L : 0L);
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
        b30 b30Var2 = new b30(this, getContext(), str5, str3, str4, str3);
        this.l2 = b30Var2;
        b30Var2.n2 = new f(this, 17);
        b30Var2.setOnDismissListener(new z00(this, 3));
        org.telegram.messenger.g0.i3(new v00(this, 7), !z11 ? 200L : 0L);
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
