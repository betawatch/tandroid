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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us, VoIPService.StateListener, fe.e {
    public static b50 u5;
    public static boolean v5;
    public static boolean w5;
    public static boolean x5;
    public static volatile org.telegram.messenger.s5 y5 = new org.telegram.messenger.s5("updateTextureLightningQueue", true);
    public static boolean z5;
    public final ImageView A1;
    public final org.telegram.ui.Components.bi0 A2;
    public final Paint A3;
    public final View A4;
    public org.telegram.ui.Components.mj0 B1;
    public final org.telegram.ui.Components.bi0 B2;
    public final a50[] B3;
    public final View B4;
    public final g40 C1;
    public boolean C2;
    public float C3;
    public GradientDrawable C4;
    public final org.telegram.ui.Components.f6 D1;
    public final org.telegram.ui.Components.m9 D2;
    public a50 D3;
    public final int[] D4;
    public final r20 E1;
    public final org.telegram.ui.Components.m9 E2;
    public a50 E3;
    public final v20 E4;
    public final y30 F1;
    public float F2;
    public long F3;
    public boolean F4;
    public final v40 G1;
    public float G2;
    public float G3;
    public boolean G4;
    public final i40 H1;
    public float H2;
    public float H3;
    public RenderNode H4;
    public final p30 I1;
    public RadialGradient I2;
    public boolean I3;
    public float I4;
    public final TextView J1;
    public final Matrix J2;
    public boolean J3;
    public boolean J4;
    public final n30 K1;
    public final Paint K2;
    public int K3;
    public final String[] K4;
    public final org.telegram.ui.ActionBar.u5 L1;
    public final q40 L2;
    public float L3;
    public ObjectAnimator L4;
    public final h40 M1;
    public float M2;
    public int M3;
    public ObjectAnimator M4;
    public final org.telegram.ui.ActionBar.u5 N1;
    public float N2;
    public boolean N3;
    public final u30 N4;
    public final p40 O1;
    public ValueAnimator O2;
    public final int[] O3;
    public org.telegram.ui.Cells.h4 O4;
    public final org.telegram.ui.Components.zy P1;
    public TLRPC.InputPeer P2;
    public final ArrayList P3;
    public org.telegram.ui.Components.voip.k P4;
    public final ImageReceiver Q1;
    public TLRPC.Chat Q2;
    public final ArrayList Q3;
    public org.telegram.ui.Components.voip.r Q4;
    public int R1;
    public org.telegram.messenger.u3 R2;
    public final y20 R3;
    public org.telegram.ui.Components.y10 R4;
    public final ImageView S1;
    public final boolean S2;
    public final d30 S3;
    public boolean S4;
    public final dh.k T1;
    public final String T2;
    public final q30 T3;
    public boolean T4;
    public final int U1;
    public final w40 U2;
    public float U3;
    public int U4;
    public final RadialProgressView V1;
    public final q20 V2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout V3;
    public AnimatorSet V4;
    public final Drawable W1;
    public final s20 W2;
    public boolean W3;
    public c40 W4;
    public final View X1;
    public final Paint X2;
    public boolean X3;
    public int X4;
    public AnimatorSet Y1;
    public ValueAnimator Y2;
    public org.telegram.ui.Components.b40 Y3;
    public int Y4;
    public LaunchActivity Z1;
    public float Z2;
    public j40 Z3;
    public int Z4;
    public final UndoView[] a2;
    public final LinearLayout a3;
    public Boolean a4;
    public int a5;
    public final org.telegram.ui.Cells.j b2;
    public final org.telegram.ui.ActionBar.t0 b3;
    public int b4;
    public int b5;
    public boolean c2;
    public final org.telegram.ui.ActionBar.t0 c3;
    public boolean c4;
    public int c5;
    public org.telegram.ui.Components.q30 d2;
    public final org.telegram.ui.ActionBar.t0 d3;
    public final u20 d4;
    public int d5;
    public org.telegram.ui.Components.q30 e2;
    public final org.telegram.ui.ActionBar.b1 e3;
    public final org.telegram.ui.Components.tk0 e4;
    public int e5;
    public int f2;
    public final org.telegram.ui.ActionBar.b1 f3;
    public final e50 f4;
    public int f5;
    public g.b g2;
    public final org.telegram.ui.ActionBar.b1 g3;
    public final org.telegram.ui.Components.z10 g4;
    public int g5;
    public final ArrayList h2;
    public final org.telegram.ui.ActionBar.b1 h3;
    public ViewTreeObserver.OnPreDrawListener h4;
    public int h5;
    public final a30 i1;
    public x30 i2;
    public final org.telegram.ui.ActionBar.b1 i3;
    public final org.telegram.ui.Components.voip.g i4;
    public int i5;
    public final f20 j1;
    public boolean j2;
    public final org.telegram.ui.ActionBar.b1 j3;
    public boolean j4;
    public int j5;
    public final org.telegram.messenger.c k1;
    public long k2;
    public final org.telegram.ui.ActionBar.b1 k3;
    public final ArrayList k4;
    public int k5;
    public final l20 l1;
    public boolean l2;
    public final org.telegram.ui.ActionBar.b1 l3;
    public boolean l4;
    public int l5;
    public final org.telegram.ui.Components.voip.b2 m1;
    public final RectF m2;
    public final org.telegram.ui.ActionBar.b1 m3;
    public final t10 m4;
    public int m5;
    public final org.telegram.ui.Components.voip.b2 n1;
    public boolean n2;
    public final org.telegram.ui.ActionBar.b1 n3;
    public final p20 n4;
    public final d40 n5;
    public final org.telegram.ui.Components.voip.b2 o1;
    public boolean o2;
    public final org.telegram.ui.ActionBar.b1 o3;
    public final org.telegram.ui.Components.voip.m0 o4;
    public Boolean o5;
    public final org.telegram.ui.Components.voip.b2 p1;
    public float p2;
    public final org.telegram.ui.ActionBar.b1 p3;
    public final t10 p4;
    public Integer p5;
    public final org.telegram.ui.Components.voip.b2 q1;
    public s30 q2;
    public final LinearLayout q3;
    public boolean q4;
    public final fe.b q5;
    public final org.telegram.ui.Components.voip.b2 r1;
    public TLRPC.Peer r2;
    public final TextView r3;
    public final m4 r4;
    public final fe.b r5;
    public final org.telegram.ui.Components.voip.b2 s1;
    public TLObject s2;
    public final z40 s3;
    public final LongSparseIntArray s4;
    public final fe.f s5;
    public final m20 t1;
    public final Paint t2;
    public final hh.i t3;
    public final b30 t4;
    public final fe.b t5;
    public final ImageView u1;
    public final ArrayList u2;
    public t10 u3;
    public final z20 u4;
    public final Paint v1;
    public final ArrayList v2;
    public org.telegram.ui.Components.z20 v3;
    public LinearLayout v4;
    public final j30 w1;
    public final ArrayList w2;
    public int w3;
    public boolean w4;
    public final i30 x1;
    public final ArrayList x2;
    public boolean x3;
    public final org.telegram.ui.Components.bi0 x4;
    public final g30 y1;
    public final ArrayList y2;
    public boolean y3;
    public int y4;
    public final ImageView z1;
    public int z2;
    public final Paint z3;
    public boolean z4;

    public b50(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.u3 u3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.p6) null, true, true);
        int i10;
        final b50 b50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.v1 = new Paint(1);
        this.a2 = new UndoView[2];
        this.h2 = new ArrayList();
        this.m2 = new RectF();
        this.t2 = new Paint(1);
        this.u2 = new ArrayList();
        this.v2 = new ArrayList();
        this.w2 = new ArrayList();
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.t3 = new hh.i(new t10(this, 8));
        int i11 = 0;
        this.w3 = 0;
        this.x3 = false;
        this.z3 = new Paint(7);
        this.A3 = new Paint(7);
        this.B3 = new a50[8];
        this.C3 = 1.0f;
        this.N3 = true;
        this.O3 = new int[4];
        this.P3 = new ArrayList();
        this.Q3 = new ArrayList();
        this.i4 = new org.telegram.ui.Components.voip.g();
        this.k4 = new ArrayList();
        this.m4 = new t10(this, i11);
        this.n4 = new p20(this);
        this.o4 = new org.telegram.ui.Components.voip.m0(4);
        this.p4 = new t10(this, 1);
        this.q4 = false;
        this.r4 = new m4(this, 7);
        this.s4 = new LongSparseIntArray();
        this.D4 = new int[2];
        this.G4 = true;
        this.K4 = new String[2];
        this.U4 = -1;
        this.n5 = new d40(this);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        this.q5 = new fe.b(2, this, grVar, 350L);
        this.r5 = new fe.b(3, this, grVar, 220L, true);
        this.s5 = new fe.f(4, this, grVar, 350L);
        this.t5 = new fe.b(5, this, grVar, 350L);
        org.telegram.messenger.i0.S(getWindow());
        D0();
        this.k1 = cVar;
        this.R2 = u3Var;
        this.P2 = inputPeer;
        this.Q2 = chat;
        this.T2 = str;
        this.a = cVar.a;
        this.S2 = z10;
        this.I0 = new org.telegram.ui.Components.ro0();
        this.P0 = true;
        this.Q0 = true;
        this.U1 = org.telegram.messenger.vp.r1(this.a).y7.x.b0();
        this.U = true;
        x5 = false;
        w5 = false;
        z5 = false;
        this.y0 = new k30(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.F0 = -1;
        this.N4 = new u30(this);
        setOnDismissListener(new w10(this, i11));
        z0();
        v40 v40Var = new v40(this, launchActivity);
        this.G1 = v40Var;
        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(true);
        int i12 = org.telegram.ui.ActionBar.t6.eh;
        ipVar.b(org.telegram.ui.ActionBar.t6.v0(i12));
        ipVar.d();
        y30 y30Var = new y30(this, launchActivity, ipVar);
        this.F1 = y30Var;
        y30Var.setSubtitle("");
        y30Var.getSubtitleTextView().setVisibility(0);
        y30Var.n();
        y30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.i0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.i0.V3(1.0f, y30Var.getAdditionalSubtitleTextView(), this.l4, false);
        y30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.t6.v0(i12));
        int i13 = org.telegram.ui.ActionBar.t6.Zg;
        org.telegram.ui.ActionBar.a7.m(y30Var, 6, i13, null);
        y30Var.setBackButtonImage(R.drawable.ic_ab_back);
        y30Var.setOccupyStatusBar(false);
        y30Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.t6.Vg;
        org.telegram.ui.ActionBar.a7.m(y30Var, 1, i14, null);
        int i15 = 3;
        org.telegram.ui.ActionBar.a7.m(y30Var, 3, org.telegram.ui.ActionBar.t6.z8, null);
        org.telegram.ui.ActionBar.a7.e(y30Var, i14);
        org.telegram.ui.ActionBar.a7.m(y30Var, 6, i13, null);
        y30Var.setActionBarMenuOnItemClick(new f40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.r2 = tL_peerUser;
            i10 = i14;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i10 = i14;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.r2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.r2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.r2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new q10(this, i15);
        cVar.b().c(this, org.telegram.messenger.zs.w2);
        cVar.b().c(this, org.telegram.messenger.zs.M0);
        cVar.b().c(this, org.telegram.messenger.zs.T);
        cVar.b().c(this, org.telegram.messenger.zs.u1);
        cVar.b().c(this, org.telegram.messenger.zs.B2);
        cVar.b().c(this, org.telegram.messenger.zs.E0);
        cVar.b().c(this, org.telegram.messenger.zs.j0);
        cVar.b().c(this, org.telegram.messenger.zs.r);
        cVar.b().c(this, org.telegram.messenger.zs.z2);
        cVar.b().c(this, org.telegram.messenger.zs.y2);
        cVar.b().c(this, org.telegram.messenger.zs.R3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.N4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.D2);
        this.W1 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.voip_filled, org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(46.0f), true, null);
        this.A2 = bi0Var;
        this.B2 = new org.telegram.ui.Components.bi0(R.raw.hand_2, org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(46.0f), true, null);
        g40 g40Var = new g40(this, launchActivity);
        this.C1 = g40Var;
        this.b = g40Var;
        g40Var.setClipToPadding(false);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i16 = this.t0;
        viewGroup.setPadding(i16, 0, i16, 0);
        this.b.setKeepScreenOn(true);
        this.b.setClipChildren(false);
        this.Q1 = new ImageReceiver(this.b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(launchActivity);
            this.L1 = u5Var;
            u5Var.setGravity(17);
            u5Var.setTextColor(-1);
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setTextSize(18);
            u5Var.k(org.telegram.messenger.cd.K0(2131743461));
            this.b.addView(u5Var, w7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            h40 h40Var = new h40(this, launchActivity);
            this.M1 = h40Var;
            h40Var.setGravity(17);
            h40Var.setTextColor(-1);
            h40Var.setTypeface(org.telegram.messenger.i0.o());
            h40Var.setTextSize(60);
            this.b.addView(h40Var, w7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(launchActivity);
            this.N1 = u5Var2;
            u5Var2.setGravity(17);
            u5Var2.setTextColor(-1);
            u5Var2.setTypeface(org.telegram.messenger.i0.o());
            u5Var2.setTextSize(18);
            this.b.addView(u5Var2, w7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (t1()) {
            q40 q40Var = new q40(this, launchActivity);
            this.L2 = q40Var;
            this.b.addView(q40Var, w7.b6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        i40 i40Var = new i40(this, launchActivity);
        this.H1 = i40Var;
        i40Var.setClipToPadding(false);
        i40Var.setClipChildren(false);
        p40 p40Var = new p40(this);
        this.O1 = p40Var;
        p40Var.o = grVar;
        p40Var.d = 350L;
        p40Var.c = 350L;
        p40Var.e = 350L;
        p40Var.S();
        i40Var.setItemAnimator(p40Var);
        i40Var.setOnScrollListener(new e20(this));
        i40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.zy zyVar = new org.telegram.ui.Components.zy(w5 ? 6 : 2, i40Var);
        this.P1 = zyVar;
        i40Var.setLayoutManager(zyVar);
        f20 f20Var = new f20(this);
        this.j1 = f20Var;
        zyVar.z1(f20Var);
        i40Var.i(new g20(this));
        zyVar.C1();
        this.b.addView(i40Var, w7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        i40Var.setAdapter(v40Var);
        i40Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.a7.J(org.telegram.ui.ActionBar.t6.Sg, i40Var);
        i40Var.setOnItemClickListener(new a7(this, launchActivity, u3Var, 14));
        i40Var.setOnItemLongClickListener(new q10(this, 4));
        if (t1()) {
            z40 z40Var = new z40(this, getContext());
            this.s3 = z40Var;
            this.b.addView(z40Var, w7.b6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(launchActivity);
        this.e4 = tk0Var;
        this.b.addView(tk0Var, w7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        e50 e50Var = new e50(u3Var, this.a, this);
        this.f4 = e50Var;
        tk0Var.setAdapter(e50Var);
        s4.r rVar = new s4.r(6, false);
        tk0Var.setLayoutManager(rVar);
        rVar.z1(new i20(this));
        final int i17 = 1;
        tk0Var.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) { // from class: org.telegram.ui.s10
            public final /* synthetic */ b50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i18, View view) {
                switch (i17) {
                    case 0:
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
                        org.telegram.messenger.v3 videoParticipant = y10Var.getVideoParticipant();
                        b50 b50Var2 = this.b;
                        if (videoParticipant != null) {
                            b50Var2.g1(y10Var.getVideoParticipant());
                            break;
                        } else {
                            b50Var2.g1(new org.telegram.messenger.v3(y10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        b50 b50Var3 = this.b;
                        b50Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
                        if (kVar.getParticipant() != null) {
                            b50Var3.g1(kVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.o = grVar;
        jVar.d = 350L;
        jVar.c = 350L;
        jVar.e = 350L;
        tk0Var.setItemAnimator(new j20(this));
        tk0Var.setOnScrollListener(new k20(this));
        e50Var.H(tk0Var, false, false);
        tk0Var.setVisibility(8);
        l20 l20Var = new l20(this, launchActivity);
        this.l1 = l20Var;
        int v02 = org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.J2 = new Matrix();
        this.I2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.K2 = paint;
        paint.setShader(this.I2);
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(9);
        this.D2 = m9Var;
        org.telegram.ui.Components.m9 m9Var2 = new org.telegram.ui.Components.m9(12);
        this.E2 = m9Var2;
        m9Var.a = org.telegram.messenger.i0.L(62.0f) * 0.45454547f;
        m9Var.b = org.telegram.messenger.i0.L(72.0f) * 0.45454547f;
        m9Var.b();
        m9Var2.a = org.telegram.messenger.i0.L(65.0f) * 0.45454547f;
        m9Var2.b = org.telegram.messenger.i0.L(75.0f) * 0.45454547f;
        m9Var2.b();
        int i18 = org.telegram.ui.ActionBar.t6.wh;
        m9Var.d.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.v0(i18), 38));
        m9Var2.d.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.v0(i18), 76));
        org.telegram.ui.Components.voip.b2 b2Var = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.p1 = b2Var;
        b2Var.setCheckable(true);
        b2Var.setTextSize(12);
        l20Var.a(b2Var);
        b2Var.setOnClickListener(new r10(this, 7));
        org.telegram.ui.Components.voip.b2 b2Var2 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.o1 = b2Var2;
        b2Var2.setCheckable(true);
        b2Var2.setTextSize(12);
        b2Var2.d(false, false);
        b2Var2.setCrossOffset(-org.telegram.messenger.i0.N(3.5f));
        b2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.cd.K0(2131743515), false, false);
        org.telegram.ui.Components.voip.b2 b2Var3 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.m1 = b2Var3;
        b2Var3.setCheckable(true);
        b2Var3.setTextSize(12);
        b2Var3.d(false, false);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(launchActivity);
        b2Var3.addView(ei0Var, w7.b6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.bi0 bi0Var2 = new org.telegram.ui.Components.bi0(R.raw.camera_flip, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        this.x4 = bi0Var2;
        ei0Var.setAnimation(bi0Var2);
        b2Var3.setOnClickListener(new r10(this, 10));
        l20Var.a(b2Var3);
        org.telegram.ui.Components.voip.b2 b2Var4 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.n1 = b2Var4;
        b2Var4.setCheckable(true);
        b2Var4.setTextSize(12);
        b2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.R1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        b2Var4.addView(imageView, w7.b6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        b2Var4.setOnClickListener(new r10(this, 11));
        l20Var.a(b2Var4);
        l20Var.a(b2Var2);
        org.telegram.ui.Components.voip.b2 b2Var5 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.q1 = b2Var5;
        b2Var5.setTextSize(12);
        b2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.rh), 0.3f, false, org.telegram.messenger.cd.K0(2131743390), false, false);
        final int i19 = 1;
        b2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v10
            public final /* synthetic */ b50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        b50 b50Var2 = this.b;
                        LaunchActivity launchActivity2 = b50Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            b50Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.zs.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                b50Var2.Q1(true, false);
                                b50Var2.P1(false);
                                b50Var2.R2.z();
                                b50Var2.Q0(true);
                                b50Var2.l1.requestLayout();
                                break;
                            } else {
                                b50Var2.a2[0].d(1, false);
                                if (b50Var2.q2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    s30 s30Var = new s30(b50Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    b50Var2.q2 = s30Var;
                                    s30Var.setBottomPadding(b50Var2.b.getPaddingBottom());
                                    b50Var2.c.addView(b50Var2.q2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        b50 b50Var3 = this.b;
                        b50Var3.R3.e();
                        org.telegram.messenger.u3 u3Var2 = b50Var3.R2;
                        if (u3Var2 != null && !u3Var2.j()) {
                            b50Var3.L1();
                            b50.v1(launchActivity, new t10(b50Var3, 5), false, false);
                            break;
                        } else {
                            b50Var3.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.b2 b2Var6 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.r1 = b2Var6;
        b2Var6.setCheckable(true);
        b2Var6.b(true, false);
        b2Var6.setTextSize(12);
        b2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, org.telegram.messenger.cd.K0(2131743320), false, false);
        m20 m20Var = new m20(this, launchActivity);
        this.t1 = m20Var;
        m20Var.setAnimation(bi0Var);
        m20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.b2 b2Var7 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.s1 = b2Var7;
        b2Var7.setDrawBackground(false);
        b2Var7.setTextSize(12);
        b2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        b2Var7.addView(m20Var, w7.b6.e(50, 50, 49));
        l20Var.a(b2Var7);
        b2Var7.setOnClickListener(new o20(this));
        l20Var.a(b2Var6);
        l20Var.a(b2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.u1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        b2Var7.addView(imageView2, w7.b6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.R2 != null && t1() && !this.R2.j()) {
            imageView2.setVisibility(0);
            m20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.V1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.Ch));
        y30Var.setAlpha(0.0f);
        y30Var.getBackButton().setScaleX(0.9f);
        y30Var.getBackButton().setScaleY(0.9f);
        y30Var.getBackButton().setTranslationX(-org.telegram.messenger.i0.L(14.0f));
        y30Var.getTitleTextView().setTranslationY(org.telegram.messenger.i0.L(23.0f));
        y30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(20.0f));
        y30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.v0(i10));
        this.b3 = t0Var;
        int i20 = 0;
        t0Var.setLongClickEnabled(false);
        t0Var.setIcon(R.drawable.ic_ab_other);
        t0Var.setContentDescription(org.telegram.messenger.cd.K0(2131754839));
        t0Var.setSubMenuOpenSide(2);
        t0Var.setDelegate(new q10(this, i20));
        int i21 = org.telegram.ui.ActionBar.t6.Wg;
        org.telegram.ui.ActionBar.a7.S(t0Var, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.v0(i21), 6), null, org.telegram.ui.ActionBar.a7.N(i21));
        t0Var.setOnClickListener(new r10(this, i20));
        t0Var.O(org.telegram.ui.ActionBar.t6.v0(i10), false);
        t0Var.O(org.telegram.ui.ActionBar.t6.v0(i10), true);
        org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.v0(i10));
        this.c3 = t0Var2;
        t0Var2.setLongClickEnabled(false);
        t0Var2.setIcon(R.drawable.msg_voice_pip);
        t0Var2.setContentDescription(org.telegram.messenger.cd.K0(2131754808));
        org.telegram.ui.ActionBar.a7.S(t0Var2, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.v0(i21), 6), null, org.telegram.ui.ActionBar.a7.N(i21));
        t0Var2.setOnClickListener(new r10(this, 1));
        org.telegram.ui.ActionBar.t0 t0Var3 = new org.telegram.ui.ActionBar.t0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.v0(i10));
        this.d3 = t0Var3;
        t0Var3.setLongClickEnabled(false);
        t0Var3.setIcon(R.drawable.msg_screencast);
        t0Var3.setContentDescription(org.telegram.messenger.cd.K0(2131754808));
        org.telegram.ui.ActionBar.a7.S(t0Var3, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.v0(i21), 6), null, org.telegram.ui.ActionBar.a7.N(i21));
        t0Var3.setOnClickListener(new r10(this, 2));
        q20 q20Var = new q20(this, launchActivity, launchActivity);
        this.V2 = q20Var;
        r20 r20Var = new r20(launchActivity);
        this.E1 = r20Var;
        r20Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.X2 = paint2;
        paint2.setColor(-12761513);
        s20 s20Var = new s20(this, getContext());
        this.W2 = s20Var;
        org.telegram.ui.ActionBar.a7.V(s20Var, i10, this.I0);
        s20Var.setTextSize(1, 11.0f);
        s20Var.setText(org.telegram.messenger.cd.K0(2131743500));
        s20Var.setMaxLines(1);
        s20Var.setGravity(17);
        s20Var.setTypeface(org.telegram.messenger.i0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        s20Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f));
        s20Var.setTag(-1);
        if (!t1()) {
            s20Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(q20Var, w7.b6.l(1.0f, 0, -2));
        linearLayout.addView(s20Var, w7.b6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView(r20Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, w7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(y30Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.q3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(t0Var3, w7.b6.o(48, 48));
        linearLayout2.addView(t0Var2, w7.b6.o(48, 48));
        linearLayout2.addView(t0Var, w7.b6.o(48, 48));
        this.b.addView(linearLayout2, w7.b6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.X1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, null);
        this.b.addView(view, w7.b6.c(1.0f, -1));
        for (int i22 = 0; i22 < 2; i22++) {
            this.a2[i22] = new t20(this, launchActivity);
            this.a2[i22].setAdditionalTranslationY(org.telegram.messenger.i0.L(10.0f));
            this.a2[i22].setTranslationZ(org.telegram.messenger.i0.L(5.0f));
            this.b.addView(this.a2[i22], w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.j jVar2 = new org.telegram.ui.Cells.j(launchActivity, true);
        this.b2 = jVar2;
        jVar2.setTag(R.id.fit_width_tag, Integer.valueOf(org.telegram.messenger.zs.P3));
        this.b3.g(jVar2, org.telegram.messenger.i0.L(48.0f));
        this.b3.setShowSubmenuByMove(false);
        int i23 = org.telegram.ui.ActionBar.t6.Sg;
        org.telegram.ui.ActionBar.a7.S(jVar2, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.v0(i23), 6, 6), null, org.telegram.ui.ActionBar.a7.N(i23));
        org.telegram.ui.ActionBar.t0 t0Var4 = this.b3;
        org.telegram.ui.ActionBar.b1 d = t0Var4.d(1, 0, null, org.telegram.messenger.cd.K0(2131743427), true, true, t0Var4.m0);
        this.l3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.t0 t0Var5 = this.b3;
        org.telegram.ui.ActionBar.b1 d10 = t0Var5.d(2, 0, null, org.telegram.messenger.cd.K0(2131743380), true, true, t0Var5.m0);
        this.m3 = d10;
        d10.m(false, true);
        int i24 = org.telegram.ui.ActionBar.t6.kh;
        d.setCheckColor(i24);
        d.d(org.telegram.ui.ActionBar.t6.v0(i24), org.telegram.ui.ActionBar.t6.v0(i24));
        d10.setCheckColor(i24);
        d10.d(org.telegram.ui.ActionBar.t6.v0(i24), org.telegram.ui.ActionBar.t6.v0(i24));
        Paint paint3 = new Paint(1);
        int i25 = org.telegram.ui.ActionBar.t6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.t6.v0(i25));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.t0 t0Var6 = this.b3;
        org.telegram.ui.ActionBar.b1 d11 = t0Var6.d(10, R.drawable.msg_voice_speaker, null, org.telegram.messenger.cd.K0(2131743425), true, false, t0Var6.m0);
        this.g3 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.t0 t0Var7 = this.b3;
        org.telegram.ui.ActionBar.b1 d12 = t0Var7.d(11, R.drawable.msg_noise_on, null, org.telegram.messenger.cd.K0(2131743308), true, false, t0Var7.m0);
        this.h3 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.b3.b(i0.b.f(0.3f, org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.Ug), -16777216));
        this.r3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.t0 t0Var8 = this.b3;
        org.telegram.ui.ActionBar.b1 d13 = t0Var8.d(6, R.drawable.msg_edit, this.U2, org.telegram.messenger.cd.K0(org.telegram.messenger.w3.W(this.Q2) ? 2131743511 : 2131743410), true, false, t0Var8.m0);
        this.f3 = d13;
        org.telegram.ui.ActionBar.t0 t0Var9 = this.b3;
        org.telegram.ui.ActionBar.b1 d14 = t0Var9.d(7, R.drawable.msg_permissions, this.U2, org.telegram.messenger.cd.K0(2131743411), false, false, t0Var9.m0);
        this.i3 = d14;
        org.telegram.ui.ActionBar.b1 e = this.b3.e(3, R.drawable.msg_link, org.telegram.messenger.cd.K0(2131743363));
        this.e3 = e;
        w40 w40Var = new w40();
        this.U2 = w40Var;
        org.telegram.ui.ActionBar.b1 e7 = this.b3.e(9, R.drawable.msg_screencast, org.telegram.messenger.cd.K0(2131743462));
        this.k3 = e7;
        org.telegram.ui.ActionBar.t0 t0Var10 = this.b3;
        org.telegram.ui.ActionBar.b1 d15 = t0Var10.d(5, 0, w40Var, org.telegram.messenger.cd.K0(2131743374), true, false, t0Var10.m0);
        this.j3 = d15;
        w40Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.b1 e10 = this.b3.e(12, R.drawable.menu_stream_comments_24, org.telegram.messenger.cd.K0(2131743510));
        this.o3 = e10;
        org.telegram.ui.ActionBar.b1 e11 = this.b3.e(13, R.drawable._menu_stream_comments_off_24, org.telegram.messenger.cd.K0(2131743512));
        this.p3 = e11;
        int i26 = 4;
        org.telegram.ui.ActionBar.b1 e12 = this.b3.e(4, R.drawable.msg_cancel, org.telegram.messenger.cd.K0(q1() ? 2131743405 : org.telegram.messenger.w3.W(this.Q2) ? 2131743507 : 2131743406));
        this.n3 = e12;
        this.b3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.t6.v0(i23));
        this.b3.getPopupLayout().setFitItems(true);
        e10.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        e11.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        d11.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        d12.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        int i27 = org.telegram.ui.ActionBar.t6.jh;
        e12.d(org.telegram.ui.ActionBar.t6.v0(i27), org.telegram.ui.ActionBar.t6.v0(i27));
        e.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        d13.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        d14.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        d15.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        e7.d(org.telegram.ui.ActionBar.t6.v0(i25), org.telegram.ui.ActionBar.t6.v0(i25));
        if (this.R2 != null) {
            n1();
        }
        if (q1()) {
            this.g2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.g2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        S1(false);
        this.F1.getTitleTextView().setOnClickListener(new r10(this, 3));
        u20 u20Var = new u20(this, launchActivity);
        this.d4 = u20Var;
        v20 v20Var = new v20(this);
        this.E4 = v20Var;
        final int i28 = 0;
        u20Var.setClipToPadding(false);
        v20Var.S();
        v20Var.o = org.telegram.ui.Components.gr.f;
        v20Var.d = 350L;
        v20Var.c = 350L;
        v20Var.e = 350L;
        u20Var.setItemAnimator(v20Var);
        u20Var.setOnScrollListener(new w20(this));
        u20Var.setClipChildren(false);
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        u20Var.setLayoutManager(a0Var);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(u3Var, this.a, this);
        this.g4 = z10Var;
        u20Var.setAdapter(z10Var);
        z10Var.F(u20Var, false);
        u20Var.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) { // from class: org.telegram.ui.s10
            public final /* synthetic */ b50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i182, View view2) {
                switch (i28) {
                    case 0:
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view2;
                        org.telegram.messenger.v3 videoParticipant = y10Var.getVideoParticipant();
                        b50 b50Var2 = this.b;
                        if (videoParticipant != null) {
                            b50Var2.g1(y10Var.getVideoParticipant());
                            break;
                        } else {
                            b50Var2.g1(new org.telegram.messenger.v3(y10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        b50 b50Var3 = this.b;
                        b50Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view2;
                        if (kVar.getParticipant() != null) {
                            b50Var3.g1(kVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        u20Var.setOnItemLongClickListener(new q10(this, 1));
        u20Var.setVisibility(8);
        u20Var.i(new x20());
        y20 y20Var = new y20(this, launchActivity, this.H1, u20Var, this.P3, this.R2, this);
        this.R3 = y20Var;
        y20Var.setClipChildren(false);
        z10Var.E(this.P3, y20Var);
        if (this.e4 != null) {
            this.f4.G(this.P3, y20Var);
        }
        z20 z20Var = new z20(this, launchActivity);
        this.u4 = z20Var;
        a30 a30Var = new a30(this, launchActivity, this.F1, this.H1, z20Var);
        this.i1 = a30Var;
        a30Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        a30Var.setInvalidateWithParent(true);
        z20Var.setProfileGalleryView(a30Var);
        b30 b30Var = new b30(this, launchActivity);
        this.t4 = b30Var;
        b30Var.setVisibility(8);
        a30Var.setVisibility(0);
        a30Var.b(new c30(this));
        d30 d30Var = new d30(this, launchActivity);
        this.S3 = d30Var;
        this.b.addView(y20Var);
        y20Var.addView(u20Var, w7.b6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.l1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.A4 = view2;
        int[] iArr = this.D4;
        iArr[0] = this.M3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.D4);
        this.C4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.b.addView(view2, w7.b6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.B4 = view3;
        view3.setBackgroundColor(this.D4[0]);
        this.b.addView(view3, w7.b6.e(-1, 0, 83));
        dh.k kVar = new dh.k(launchActivity);
        this.T1 = kVar;
        kVar.setDelegate(new e30(this));
        kVar.setClickCellDelegate(new f30(this));
        org.telegram.messenger.u3 u3Var2 = this.R2;
        if (u3Var2 != null) {
            kVar.D0(this.k1.a, u3Var2.g(false));
        }
        this.b.addView(kVar, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(launchActivity, false, true, true);
        this.D1 = f6Var;
        f6Var.setGravity(17);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTextColor(-1);
        f6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        this.b.addView(this.l1);
        g30 g30Var = new g30(this, launchActivity, this.C1, LaunchActivity.Q(), this.I0);
        this.y1 = g30Var;
        g30Var.J = true;
        g30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.U1)});
        g30Var.getEditText().setLinkTextColor(-11683585);
        g30Var.setHint(org.telegram.messenger.cd.K0(2131743953));
        g30Var.getEditText().addTextChangedListener(new h30(this));
        g30Var.s();
        i30 i30Var = new i30(this, launchActivity);
        this.x1 = i30Var;
        this.b.addView(i30Var, w7.b6.c(-1.0f, -1));
        j30 j30Var = new j30(launchActivity);
        this.w1 = j30Var;
        j30Var.addView(g30Var, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        j30Var.addView(f6Var, w7.b6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        f6Var.setTranslationY(-org.telegram.messenger.i0.L(20.0f));
        this.b.addView(j30Var, w7.b6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.A1 = imageView3;
        int i29 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(W(i29), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i29), this.I0);
        int i30 = org.telegram.ui.ActionBar.t6.f7;
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView3, i30, p6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new r10(this, i26));
        ImageView imageView4 = new ImageView(launchActivity);
        this.z1 = imageView4;
        org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(W(i29), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i29), this.I0);
        org.telegram.ui.ActionBar.a7.t(imageView4, org.telegram.ui.ActionBar.t6.v6, this.I0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new r10(this, 5));
        j30Var.addView(imageView3, w7.b6.e(48, 48, 85));
        j30Var.addView(imageView4, w7.b6.e(48, 48, 85));
        this.b.addView(d30Var);
        b30Var.addView(a30Var, w7.b6.c(-1.0f, -1));
        b30Var.addView(z20Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(b30Var, w7.b6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        final int i31 = 0;
        Q0(false);
        this.G1.f();
        if (x5) {
            this.f4.I(this.e4, false);
        }
        this.z2 = this.G1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.J1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.w3.T(this.Q2) && (chat2 = this.Q2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, w7.b6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(launchActivity);
            ac0Var.setTextColor(-1);
            ac0Var.setSelectorColor(-9598483);
            ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
            ac0Var.setItemCount(5);
            l30 l30Var = new l30(launchActivity);
            l30Var.setItemCount(5);
            l30Var.setTextColor(-1);
            l30Var.setSelectorColor(-9598483);
            l30Var.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
            m30 m30Var = new m30(launchActivity);
            m30Var.setItemCount(5);
            m30Var.setTextColor(-1);
            m30Var.setSelectorColor(-9598483);
            m30Var.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
            n30 n30Var = new n30(launchActivity);
            this.K1 = n30Var;
            n30Var.setLines(1);
            n30Var.setSingleLine(true);
            n30Var.setEllipsize(TextUtils.TruncateAt.END);
            n30Var.setGravity(17);
            n30Var.setTextColor(-1);
            n30Var.setTypeface(org.telegram.messenger.i0.o());
            n30Var.setTextSize(1, 14.0f);
            this.b.addView(n30Var, w7.b6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            n30Var.setOnClickListener(new org.telegram.messenger.video.f(this, ac0Var, l30Var, m30Var, chat, cVar, inputPeer2, 1));
            p30 p30Var = new p30(launchActivity, ac0Var, l30Var, m30Var);
            this.I1 = p30Var;
            p30Var.setWeightSum(1.0f);
            p30Var.setOrientation(0);
            this.b.addView(p30Var, w7.b6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i32 = calendar.get(1);
            int i33 = calendar.get(6);
            p30Var.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
            ac0Var.setMinValue(0);
            ac0Var.setMaxValue(365);
            ac0Var.setWrapSelectorWheel(false);
            ac0Var.setFormatter(new mg.d(currentTimeMillis, calendar, i32, 1));
            a1.d dVar = new a1.d(this, ac0Var, l30Var, m30Var, 10);
            b50Var = this;
            ac0Var.setOnValueChangedListener(dVar);
            l30Var.setMinValue(0);
            l30Var.setMaxValue(23);
            p30Var.addView(l30Var, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
            l30Var.setFormatter(new org.telegram.ui.Components.z11(10));
            l30Var.setOnValueChangedListener(dVar);
            m30Var.setMinValue(0);
            m30Var.setMaxValue(59);
            m30Var.setValue(0);
            m30Var.setFormatter(new org.telegram.ui.Components.z11(11));
            p30Var.addView(m30Var, w7.b6.l(0.3f, 0, org.telegram.messenger.zs.t4));
            m30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i34 = calendar.get(6);
            int i35 = calendar.get(12);
            int i36 = calendar.get(11);
            ac0Var.setValue(i33 != i34 ? 1 : 0);
            m30Var.setValue(i35);
            l30Var.setValue(i36);
            org.telegram.ui.Components.s4.g(n30Var, textView, 0L, 604800L, 2, ac0Var, l30Var, m30Var);
        } else {
            b50Var = this;
        }
        q30 q30Var = new q30(b50Var, (ViewGroup) b50Var.getWindow().getDecorView(), b50Var.b);
        b50Var.T3 = q30Var;
        q30Var.E = new r30(b50Var);
        a30Var.setPinchToZoomHelper(q30Var);
        b50Var.o1.setOnClickListener(new View.OnClickListener(b50Var) { // from class: org.telegram.ui.v10
            public final /* synthetic */ b50 b;

            {
                this.b = b50Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i31) {
                    case 0:
                        b50 b50Var2 = this.b;
                        LaunchActivity launchActivity2 = b50Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            b50Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.zs.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                b50Var2.Q1(true, false);
                                b50Var2.P1(false);
                                b50Var2.R2.z();
                                b50Var2.Q0(true);
                                b50Var2.l1.requestLayout();
                                break;
                            } else {
                                b50Var2.a2[0].d(1, false);
                                if (b50Var2.q2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    s30 s30Var = new s30(b50Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    b50Var2.q2 = s30Var;
                                    s30Var.setBottomPadding(b50Var2.b.getPaddingBottom());
                                    b50Var2.c.addView(b50Var2.q2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        b50 b50Var3 = this.b;
                        b50Var3.R3.e();
                        org.telegram.messenger.u3 u3Var22 = b50Var3.R2;
                        if (u3Var22 != null && !u3Var22.j()) {
                            b50Var3.L1();
                            b50.v1(launchActivity, new t10(b50Var3, 5), false, false);
                            break;
                        } else {
                            b50Var3.dismiss();
                            break;
                        }
                }
            }
        });
        b50Var.O1(false);
        b50Var.L1();
        b50Var.P1(false);
        b50Var.Q1(false, false);
        b50Var.D1(0.0f);
        b50Var.R1();
        b50Var.b.addView(new FrameLayout(launchActivity), w7.b6.e(-1, org.telegram.messenger.zs.e3, 87));
        b50Var.r1.setOnClickListener(new r10(b50Var, 6));
        b50Var.V0();
        w7.e6.a(b50Var.o1);
        w7.e6.a(b50Var.p1);
        w7.e6.a(b50Var.m1);
        w7.e6.a(b50Var.n1);
        w7.e6.a(b50Var.s1);
        w7.e6.a(b50Var.q1);
        w7.e6.a(b50Var.r1);
        r0.h0.l(b50Var.b, new q10(b50Var, 2));
    }

    public static void H1(org.telegram.ui.ActionBar.b1 b1Var, int i10) {
        if (b1Var != null) {
            b1Var.d(i10, i10);
        }
    }

    public static void I0(final b50 b50Var, Activity activity, org.telegram.messenger.u3 u3Var, View view, int i10) {
        TLRPC.Chat chat;
        final Long l4;
        boolean z10;
        final org.telegram.messenger.t3 t3Var;
        org.telegram.messenger.c cVar = b50Var.k1;
        ArrayList arrayList = b50Var.w2;
        v40 v40Var = b50Var.G1;
        if (view instanceof org.telegram.ui.Components.voip.k) {
            b50Var.g1(((org.telegram.ui.Components.voip.k) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h4) {
            b50Var.I1((org.telegram.ui.Cells.h4) view);
            return;
        }
        final int i11 = 0;
        final int i12 = 1;
        if (!(view instanceof org.telegram.ui.Cells.a4)) {
            if (i10 != v40Var.x) {
                if (i10 != v40Var.y) {
                    if (i10 == v40Var.D) {
                        b50Var.x1();
                        return;
                    }
                    return;
                }
                org.telegram.messenger.u3 u3Var2 = b50Var.R2;
                if (u3Var2 == null || u3Var2.b == null) {
                    return;
                }
                mg.i2 i2Var = new mg.i2(activity, b50Var.a, null, 4, new org.telegram.ui.Components.ro0());
                org.telegram.messenger.u3 u3Var3 = b50Var.R2;
                i2Var.u2.addAll(u3Var3 != null ? (Collection) Collection.-EL.stream(u3Var3.e).map(new k2.f(10)).collect(Collectors.toSet()) : null);
                i2Var.o1(false, true);
                i2Var.s2 = new t10(b50Var, 3);
                i2Var.o1(false, true);
                i2Var.v2 = new ih.s(11, b50Var, u3Var);
                i2Var.show();
                return;
            }
            if (org.telegram.messenger.w3.T(b50Var.Q2) && (chat = b50Var.Q2) != null && !chat.megagroup && org.telegram.messenger.w3.t0(chat)) {
                b50Var.l1(false);
                return;
            }
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(cVar.a).M0(b50Var.k1());
            if (M0 == null) {
                return;
            }
            b50Var.n2 = false;
            Context context = b50Var.getContext();
            int i13 = cVar.a;
            TLRPC.Chat chat2 = b50Var.Q2;
            org.telegram.messenger.u3 u3Var4 = b50Var.R2;
            org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(context, i13, chat2, M0, u3Var4.d, u3Var4.n);
            b50Var.v3 = z20Var;
            z20Var.setOnDismissListener(new w10(b50Var, 2));
            org.telegram.ui.Components.z20 z20Var2 = b50Var.v3;
            z20Var2.X1 = new h20(b50Var);
            z20Var2.show();
            return;
        }
        org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
        if (a4Var.getUser() == null) {
            return;
        }
        if (!b50Var.q1()) {
            b50Var.Z1.O0(b50Var.a);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a4Var.getUser().id);
            if (a4Var.a.getImageReceiver().L()) {
                bundle.putBoolean("expandPhoto", true);
            }
            b50Var.Z1.t0(new ProfileActivity(bundle, null));
            b50Var.dismiss();
            return;
        }
        int i14 = i10 - v40Var.n;
        if (i14 < 0 || i14 >= b50Var.R2.m.size()) {
            int i15 = i10 - v40Var.s;
            if (i15 < 0 || i15 >= b50Var.R2.l.size()) {
                int i16 = i10 - v40Var.f;
                if (b50Var.j2) {
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        l4 = (Long) arrayList.get(i16);
                        z10 = false;
                    }
                    l4 = null;
                    z10 = false;
                } else {
                    if (i16 >= 0 && i16 < b50Var.R2.j.size()) {
                        l4 = (Long) b50Var.R2.j.get(i16);
                        z10 = false;
                    }
                    l4 = null;
                    z10 = false;
                }
                if (z10 && (t3Var = (org.telegram.messenger.t3) b50Var.R2.k.get(l4)) != null) {
                    org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(b50Var.c, b50Var.I0, a4Var);
                    F.l(R.drawable.msg_endcall, org.telegram.messenger.cd.L0(2131749469, null), new Runnable(b50Var) { // from class: org.telegram.ui.y10
                        public final /* synthetic */ b50 b;

                        {
                            this.b = b50Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.t3 t3Var2 = t3Var;
                                    declineconferencecallinvite.msg_id = t3Var2.a;
                                    final b50 b50Var2 = this.b;
                                    final int i17 = 1;
                                    ConnectionsManager.getInstance(b50Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.a20
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var3 = b50Var2;
                                                    if (!z11) {
                                                        b50Var3.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var3.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var4 = b50Var2;
                                                    if (!z12) {
                                                        b50Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.u3 u3Var5 = b50Var2.R2;
                                    if (u3Var5 != null) {
                                        t3Var2.b = false;
                                        u3Var5.k.put(l4, t3Var2);
                                        b50Var2.Q0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.t3 t3Var3 = t3Var;
                                    declineconferencecallinvite2.msg_id = t3Var3.a;
                                    final b50 b50Var3 = this.b;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(b50Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.a20
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var32 = b50Var3;
                                                    if (!z11) {
                                                        b50Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var4 = b50Var3;
                                                    if (!z12) {
                                                        b50Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(t3Var3.a));
                                    org.telegram.messenger.vp.r1(b50Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.u3 u3Var6 = b50Var3.R2;
                                    if (u3Var6 != null) {
                                        ArrayList arrayList3 = u3Var6.j;
                                        Long l10 = l4;
                                        arrayList3.remove(l10);
                                        b50Var3.R2.n.remove(l10);
                                        b50Var3.R2.k.remove(l10);
                                        b50Var3.Q0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, t3Var.a());
                    F.c(R.drawable.msg_remove, org.telegram.messenger.cd.L0(2131749480, null), new Runnable(b50Var) { // from class: org.telegram.ui.y10
                        public final /* synthetic */ b50 b;

                        {
                            this.b = b50Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.t3 t3Var2 = t3Var;
                                    declineconferencecallinvite.msg_id = t3Var2.a;
                                    final b50 b50Var2 = this.b;
                                    final int i17 = 1;
                                    ConnectionsManager.getInstance(b50Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.a20
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var32 = b50Var2;
                                                    if (!z11) {
                                                        b50Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var4 = b50Var2;
                                                    if (!z12) {
                                                        b50Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.u3 u3Var5 = b50Var2.R2;
                                    if (u3Var5 != null) {
                                        t3Var2.b = false;
                                        u3Var5.k.put(l4, t3Var2);
                                        b50Var2.Q0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.t3 t3Var3 = t3Var;
                                    declineconferencecallinvite2.msg_id = t3Var3.a;
                                    final b50 b50Var3 = this.b;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(b50Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.a20
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var32 = b50Var3;
                                                    if (!z11) {
                                                        b50Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    b50 b50Var4 = b50Var3;
                                                    if (!z12) {
                                                        b50Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(t3Var3.a));
                                    org.telegram.messenger.vp.r1(b50Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.u3 u3Var6 = b50Var3.R2;
                                    if (u3Var6 != null) {
                                        ArrayList arrayList3 = u3Var6.j;
                                        Long l10 = l4;
                                        arrayList3.remove(l10);
                                        b50Var3.R2.n.remove(l10);
                                        b50Var3.R2.k.remove(l10);
                                        b50Var3.Q0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    F.W(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), b50Var.t2.getColor()));
                    F.s = 96;
                    F.Z();
                }
                return;
            }
            l4 = (Long) b50Var.R2.l.get(i10 - v40Var.s);
        } else {
            l4 = (Long) b50Var.R2.m.get(i10 - v40Var.n);
        }
        z10 = true;
        if (z10) {
            return;
        }
        org.telegram.ui.Components.z60 F2 = org.telegram.ui.Components.z60.F(b50Var.c, b50Var.I0, a4Var);
        F2.l(R.drawable.msg_endcall, org.telegram.messenger.cd.L0(2131749469, null), new Runnable(b50Var) { // from class: org.telegram.ui.y10
            public final /* synthetic */ b50 b;

            {
                this.b = b50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.t3 t3Var2 = t3Var;
                        declineconferencecallinvite.msg_id = t3Var2.a;
                        final b50 b50Var2 = this.b;
                        final int i17 = 1;
                        ConnectionsManager.getInstance(b50Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.a20
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var32 = b50Var2;
                                        if (!z11) {
                                            b50Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var4 = b50Var2;
                                        if (!z12) {
                                            b50Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.u3 u3Var5 = b50Var2.R2;
                        if (u3Var5 != null) {
                            t3Var2.b = false;
                            u3Var5.k.put(l4, t3Var2);
                            b50Var2.Q0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.t3 t3Var3 = t3Var;
                        declineconferencecallinvite2.msg_id = t3Var3.a;
                        final b50 b50Var3 = this.b;
                        final int i18 = 0;
                        ConnectionsManager.getInstance(b50Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.a20
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i18) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var32 = b50Var3;
                                        if (!z11) {
                                            b50Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var4 = b50Var3;
                                        if (!z12) {
                                            b50Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(t3Var3.a));
                        org.telegram.messenger.vp.r1(b50Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.u3 u3Var6 = b50Var3.R2;
                        if (u3Var6 != null) {
                            ArrayList arrayList3 = u3Var6.j;
                            Long l10 = l4;
                            arrayList3.remove(l10);
                            b50Var3.R2.n.remove(l10);
                            b50Var3.R2.k.remove(l10);
                            b50Var3.Q0(true);
                            break;
                        }
                        break;
                }
            }
        }, t3Var.a());
        F2.c(R.drawable.msg_remove, org.telegram.messenger.cd.L0(2131749480, null), new Runnable(b50Var) { // from class: org.telegram.ui.y10
            public final /* synthetic */ b50 b;

            {
                this.b = b50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.t3 t3Var2 = t3Var;
                        declineconferencecallinvite.msg_id = t3Var2.a;
                        final b50 b50Var2 = this.b;
                        final int i17 = 1;
                        ConnectionsManager.getInstance(b50Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.a20
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var32 = b50Var2;
                                        if (!z11) {
                                            b50Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var4 = b50Var2;
                                        if (!z12) {
                                            b50Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.u3 u3Var5 = b50Var2.R2;
                        if (u3Var5 != null) {
                            t3Var2.b = false;
                            u3Var5.k.put(l4, t3Var2);
                            b50Var2.Q0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.t3 t3Var3 = t3Var;
                        declineconferencecallinvite2.msg_id = t3Var3.a;
                        final b50 b50Var3 = this.b;
                        final int i18 = 0;
                        ConnectionsManager.getInstance(b50Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.a20
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i18) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var32 = b50Var3;
                                        if (!z11) {
                                            b50Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var32.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        b50 b50Var4 = b50Var3;
                                        if (!z12) {
                                            b50Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.vp.r1(b50Var4.a).L3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(t3Var3.a));
                        org.telegram.messenger.vp.r1(b50Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.u3 u3Var6 = b50Var3.R2;
                        if (u3Var6 != null) {
                            ArrayList arrayList3 = u3Var6.j;
                            Long l10 = l4;
                            arrayList3.remove(l10);
                            b50Var3.R2.n.remove(l10);
                            b50Var3.R2.k.remove(l10);
                            b50Var3.Q0(true);
                            break;
                        }
                        break;
                }
            }
        }, false);
        F2.W(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), b50Var.t2.getColor()));
        F2.s = 96;
        F2.Z();
    }

    public static void J0(b50 b50Var, org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (b50Var.I) {
            return;
        }
        if (z10 && kVar.getRenderer() == null) {
            kVar.setRenderer(org.telegram.ui.Components.voip.r.c(b50Var.P3, b50Var.R3, kVar, null, null, kVar.getParticipant(), b50Var.R2, b50Var));
        } else {
            if (z10 || kVar.getRenderer() == null) {
                return;
            }
            kVar.getRenderer().setPrimaryView(null);
            kVar.setRenderer(null);
        }
    }

    public static void K0(b50 b50Var, int i10, int[] iArr) {
        if (b50Var.t1()) {
            int i11 = org.telegram.ui.ActionBar.t6.yh;
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.nh, false));
            iArr[2] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xh, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.mh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.nh, false));
            iArr[2] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.lh, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.uh, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ph, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.qh, false));
            iArr[2] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.oh, false);
        } else if (r1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ai, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.yh;
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ah, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bh, false));
            iArr[2] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        }
        if (r1(i10)) {
            iArr[3] = i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.b.f(0.75f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ph, false), i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.th, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.vh, false)));
        } else {
            iArr[3] = i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wh, false));
        }
    }

    public static String L0() {
        return org.telegram.messenger.l6.i[(int) Math.floor(Math.random() * 8)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void M0(b50 b50Var) {
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        if (u3Var == null || u3Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.u3 u3Var2 = b50Var.R2;
        togglegroupcallsettings.call = u3Var2.g(u3Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(b50Var.R2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(b50Var.k1.a);
        org.telegram.messenger.r5 r5Var = Utilities.d;
        Objects.requireNonNull(r5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.y3(r5Var), new c20(b50Var, 1));
    }

    public static void N0(b50 b50Var, boolean z10) {
        if (b50Var.R2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        togglegroupcallsettings.call = u3Var.g(u3Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        b50Var.o5 = Boolean.valueOf(z10);
        b50Var.K1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(b50Var.k1.a);
        org.telegram.messenger.r5 r5Var = Utilities.d;
        Objects.requireNonNull(r5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.y3(r5Var), new c20(b50Var, 0));
    }

    public static org.telegram.ui.Components.voip.k O0(b50 b50Var) {
        i40 i40Var = b50Var.H1;
        for (int i10 = 0; i10 < i40Var.getChildCount(); i10++) {
            View childAt = i40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.k) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.k) childAt;
            }
        }
        return null;
    }

    public static void P0(b50 b50Var) {
        y30 y30Var = b50Var.F1;
        i40 i40Var = b50Var.H1;
        int childCount = i40Var.getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(i40Var.getChildAt(i10)) >= 0) {
                f7 = Math.min(f7, r8.getTop());
            }
        }
        if (f7 < 0.0f || f7 == 2.14748365E9f) {
            f7 = childCount != 0 ? 0.0f : i40Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f7 <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(14.0f)));
        float L = f7 + org.telegram.messenger.i0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && y30Var.getTag() == null) || (!z10 && y30Var.getTag() != null)) {
            y30Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = b50Var.Y1;
            if (animatorSet != null) {
                animatorSet.cancel();
                b50Var.Y1 = null;
            }
            b50Var.G0(y30Var.getTag() == null);
            ViewPropertyAnimator duration = y30Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -org.telegram.messenger.i0.L(14.0f)).setDuration(300L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            duration.setInterpolator(grVar).start();
            y30Var.getTitleTextView().animate().translationY(z10 ? 0.0f : org.telegram.messenger.i0.L(23.0f)).setDuration(300L).setInterpolator(grVar).start();
            ObjectAnimator objectAnimator = b50Var.L4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                b50Var.L4.cancel();
            }
            org.telegram.ui.ActionBar.u5 subtitleTextView = y30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.u5, Float>) property, y30Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : org.telegram.messenger.i0.L(20.0f));
            b50Var.L4 = ofFloat;
            ofFloat.setDuration(300L);
            b50Var.L4.setInterpolator(grVar);
            b50Var.L4.addListener(new org.telegram.ui.Components.ha0(15, b50Var, z10));
            b50Var.L4.start();
            ObjectAnimator objectAnimator2 = b50Var.M4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(y30Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.u5, Float>) property, z10 ? 0.0f : org.telegram.messenger.i0.L(20.0f));
            b50Var.M4 = ofFloat2;
            ofFloat2.setDuration(300L);
            b50Var.M4.setInterpolator(grVar);
            b50Var.M4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            b50Var.Y1 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = b50Var.Y1;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(y30Var, (Property<y30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(b50Var.E1, (Property<r20, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(b50Var.X1, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            b50Var.Y1.addListener(new w30(b50Var, i11));
            b50Var.Y1.start();
            b50Var.R3.w.setClickable(!z10 || w5);
        }
        if (b50Var.p2 != L) {
            b50Var.G1(L);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (u5 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                u5 = new b50(launchActivity, cVar, org.telegram.messenger.vp.r1(cVar.a).f1(chat.id, false, null), chat, inputPeer, z10, str);
            } else {
                org.telegram.messenger.u3 u3Var = VoIPService.getSharedInstance().groupCall;
                if (u3Var == null) {
                    return;
                }
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(cVar.a).L0(Long.valueOf(u3Var.c));
                u3Var.b(true);
                u5 = new b50(launchActivity, cVar, u3Var, L0, null, z10, str);
            }
            u5.Z1 = launchActivity;
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(3));
        }
    }

    public static String h1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 0) {
            return org.telegram.messenger.cd.L0(2131743525, null);
        }
        if (i10 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.cd.L0(2131743526, null) : org.telegram.messenger.cd.L0(2131743527, null);
        }
        if (i10 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.cd.L0(2131743529, null) : str;
    }

    public static String i1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i10 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.cd.L0(2131743524, null) : org.telegram.messenger.cd.a0(null, null, 2131743523, str) : i10 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.cd.L0(2131743521, null) : org.telegram.messenger.cd.L0(2131743522, null) : org.telegram.messenger.cd.L0(2131743520, null);
    }

    public static boolean r1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.b.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static void v1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        int i10 = 0;
        if (z11 || !org.telegram.messenger.w3.w(14, chat)) {
            y1(u3Var, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        boolean isConference = sharedInstance.isConference();
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (isConference) {
            x1Var.R = org.telegram.messenger.cd.L0(2131743494, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131743495, null);
        } else if (org.telegram.messenger.w3.W(chat)) {
            x1Var.R = org.telegram.messenger.cd.L0(2131743497, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131743498, null);
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131743387, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131743388, null);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        if (!sharedInstance.isConference() || (u3Var != null && (groupCall = u3Var.b) != null && groupCall.creator)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
            c2VarArr[0] = c2Var;
            c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            if (z10) {
                c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false));
            } else {
                c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                int i11 = org.telegram.ui.ActionBar.t6.fh;
                int i12 = org.telegram.ui.ActionBar.t6.dh;
                int i13 = org.telegram.ui.ActionBar.t6.bh;
                checkBoxSquare.s = i11;
                checkBoxSquare.w = i12;
                checkBoxSquare.x = i13;
                checkBoxSquare.invalidate();
            }
            c2VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131743496, null), "", false, false, false);
            } else if (org.telegram.messenger.w3.W(chat)) {
                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131743499, null), "", false, false, false);
            } else {
                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131743389, null), "", false, false, false);
            }
            c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
            f7.addView(c2VarArr[0], w7.b6.o(-1, -2));
            c2VarArr[0].setOnClickListener(new u10(c2VarArr, i10));
        }
        alertDialog$Builder.o(f7);
        x1Var.I = org.telegram.ui.ActionBar.t6.dh;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743390, null), new vg(u3Var, c2VarArr, selfId, runnable, 1));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        if (z10) {
            x1Var.R0 = false;
        }
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                x1Var.getWindow().setType(2038);
            } else {
                x1Var.getWindow().setType(2003);
            }
            x1Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ih, false));
        }
        x1Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.jh, null);
        }
        x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false));
    }

    public static void y1(org.telegram.messenger.u3 u3Var, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (u3Var != null) {
            ArrayList arrayList = u3Var.f;
            ArrayList arrayList2 = u3Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(j10);
            if (groupCallParticipant != null) {
                u3Var.d.e(j10);
                arrayList2.remove(groupCallParticipant);
                u3Var.g.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (org.telegram.messenger.jj.C1(((org.telegram.messenger.v3) arrayList.get(i10)).a.peer) == org.telegram.messenger.jj.C1(groupCallParticipant.peer)) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                TLRPC.GroupCall groupCall = u3Var.b;
                groupCall.participants_count--;
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.v2, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(boolean z10, org.telegram.ui.Cells.h4 h4Var) {
        int i10;
        float f7;
        final float f10;
        float f11;
        org.telegram.ui.Components.voip.r rVar;
        org.telegram.ui.Components.voip.r rVar2;
        float paddingLeft = this.b.getPaddingLeft() + org.telegram.messenger.i0.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + org.telegram.messenger.i0.L(14.0f);
        boolean z11 = this.S4;
        a30 a30Var = this.i1;
        i40 i40Var = this.H1;
        if (z11) {
            f10 = (i40Var.getX() + (h4Var.getX() + h4Var.getAvatarImageView().getX())) - paddingLeft;
            f7 = (i40Var.getY() + (h4Var.getY() + h4Var.getAvatarImageView().getY())) - paddingTop;
            f11 = h4Var.getAvatarImageView().getMeasuredHeight() / i40Var.getMeasuredWidth();
            i10 = (int) ((h4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
        } else {
            if (this.Q4 == null) {
                this.F4 = true;
            } else {
                this.F4 = z10 || a30Var.D0.k(a30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.k kVar = this.P4;
            y20 y20Var = this.R3;
            if (kVar == null || !this.F4) {
                org.telegram.ui.Components.y10 y10Var = this.R4;
                if (y10Var != null) {
                    org.telegram.ui.Components.voip.r rVar3 = this.Q4;
                    u20 u20Var = this.d4;
                    if (rVar3 == null) {
                        float x10 = (y20Var.getX() + (u20Var.getX() + (this.R4.getX() + y10Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y3 = (y20Var.getY() + (u20Var.getY() + (this.R4.getY() + this.R4.getAvatarImageView().getY()))) - paddingTop;
                        f11 = this.R4.getAvatarImageView().getMeasuredHeight() / i40Var.getMeasuredWidth();
                        i10 = (int) ((this.R4.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
                        f7 = y3;
                        f10 = x10;
                        if (!this.F4 && (rVar = this.Q4) != null) {
                            rVar.invalidate();
                            y20Var.invalidate();
                            org.telegram.ui.Components.voip.r rVar4 = this.Q4;
                            rVar4.h = false;
                            rVar4.j(false);
                            this.Q4 = null;
                        }
                    } else if (this.F4) {
                        f10 = (y20Var.getX() + (u20Var.getX() + y10Var.getX())) - paddingLeft;
                        f7 = (y20Var.getY() + (u20Var.getY() + this.R4.getY())) - paddingTop;
                        i10 = 0;
                    }
                }
                i10 = 0;
                f7 = 0.0f;
                f10 = 0.0f;
                f11 = 0.96f;
                if (!this.F4) {
                    rVar.invalidate();
                    y20Var.invalidate();
                    org.telegram.ui.Components.voip.r rVar42 = this.Q4;
                    rVar42.h = false;
                    rVar42.j(false);
                    this.Q4 = null;
                }
            } else {
                float x11 = (i40Var.getX() + kVar.getX()) - paddingLeft;
                f7 = ((i40Var.getY() + this.P4.getY()) + org.telegram.messenger.i0.L(2.0f)) - paddingTop;
                i10 = 0;
                f10 = x11;
            }
            f11 = 1.0f;
            if (!this.F4) {
            }
        }
        final float f12 = f7;
        final float f13 = f11;
        z20 z20Var = this.u4;
        if (z10) {
            b30 b30Var = this.t4;
            b30Var.setScaleX(f13);
            b30Var.setScaleY(f13);
            b30Var.setTranslationX(f10);
            b30Var.setTranslationY(f12);
            z20Var.setAlpha(0.0f);
        }
        a30Var.N(i10, i10);
        if (this.X3) {
            d30 d30Var = this.S3;
            if (z10) {
                d30Var.setAlpha(0.0f);
            }
            org.telegram.messenger.z20.l(d30Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.z20.l(z20Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (rVar2 = this.Q4) != null) {
            rVar2.h = false;
            rVar2.j(true);
            if (a30Var.D0.k(a30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.n nVar = this.Q4.a;
                nVar.E = false;
                nVar.F = 0L;
                this.P4 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i11 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.z10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50 b50Var = b50.this;
                b50Var.U3 = floatValue;
                b50Var.R3.n = floatValue;
                float f14 = (floatValue * 1.0f) + ((1.0f - floatValue) * f13);
                b30 b30Var2 = b50Var.t4;
                b30Var2.setScaleX(f14);
                b30Var2.setScaleY(f14);
                b30Var2.setTranslationX((1.0f - b50Var.U3) * f10);
                b30Var2.setTranslationY((1.0f - b50Var.U3) * f12);
                if (!b50Var.X3) {
                    b50Var.N4.setAlpha((int) (b50Var.U3 * 100.0f));
                }
                org.telegram.ui.Components.voip.r rVar5 = b50Var.Q4;
                if (rVar5 != null) {
                    rVar5.a.setRoundCorners((1.0f - b50Var.U3) * org.telegram.messenger.i0.L(8.0f));
                }
                b30Var2.invalidate();
                b50Var.b.invalidate();
                a30 a30Var2 = b50Var.i1;
                int i12 = (int) ((1.0f - b50Var.U3) * i11);
                a30Var2.N(i12, i12);
            }
        });
        this.U4 = org.telegram.messenger.zs.f(this.k1.a).q(new int[]{org.telegram.messenger.zs.b0, org.telegram.messenger.zs.Y1, org.telegram.messenger.zs.D}, this.U4, true);
        org.telegram.ui.Components.voip.r rVar5 = this.P4 != null ? this.Q4 : null;
        if (rVar5 != null) {
            rVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, rVar5, z10, 7));
        if (this.S4 || this.Q4 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.setDuration(220L);
            this.Q4.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.n nVar2 = this.Q4.a;
            if (nVar2.E) {
                nVar2.G.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        U0();
    }

    public final void B1() {
        m4 m4Var = this.r4;
        org.telegram.messenger.i0.r(m4Var);
        if (!this.q4 || this.L2 == null || VoIPService.getSharedInstance() == null || !t1() || this.H1 == null || !org.telegram.messenger.sc.e(512)) {
            return;
        }
        org.telegram.messenger.i0.h3(m4Var, 30L);
    }

    public final void C1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        this.y1.setText("");
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var == null || u3Var.b == null || (g10 = u3Var.g(u3Var.a)) == null) {
            return;
        }
        org.telegram.messenger.u3 u3Var2 = this.R2;
        long j10 = u3Var2.b.id;
        TLRPC.Peer peer = u3Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? org.telegram.messenger.o5.o(peer) : org.telegram.messenger.d20.i(this.a).n, tL_textWithEntities, j10, g10);
    }

    public final void D1(float f7) {
        this.L3 = f7;
        y20 y20Var = this.R3;
        float max = Math.max(f7, y20Var == null ? 0.0f : y20Var.c);
        int i10 = org.telegram.ui.ActionBar.t6.Xg;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.t6.Ug;
        int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, x02, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.M3 = S0;
        this.E1.setBackgroundColor(S0);
        this.b3.H(-14472653);
        this.W1.setColorFilter(new PorterDuffColorFilter(this.M3, PorterDuff.Mode.MULTIPLY));
        this.G0 = org.telegram.messenger.i0.S0(max, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int S02 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.hh, false));
        g.b bVar = this.g2;
        if (bVar != null) {
            bVar.b = S02;
            bi.t0 t0Var = (bi.t0) bVar.i;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
        this.t2.setColor(S02);
        this.v1.setColor(S02);
        this.w1.invalidate();
        i40 i40Var = this.H1;
        i40Var.setGlowColor(S02);
        int i12 = this.w3;
        if (i12 == 3 || r1(i12)) {
            this.s1.invalidate();
        }
        View view = this.A4;
        if (view != null) {
            int i13 = this.M3;
            int[] iArr = this.D4;
            iArr[0] = i13;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.C4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.C4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.B4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.rh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.sh, false));
        this.q1.a(S03, S03);
        int S04 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ch, false));
        int S05 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ah, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.fh, false));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0);
        int childCount = i40Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = i40Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                if (q1()) {
                    b4Var.a(w02, w02);
                } else {
                    b4Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.h4;
                y30 y30Var = this.F1;
                if (z10) {
                    ((org.telegram.ui.Cells.h4) childAt).f(y30Var.getTag() != null ? org.telegram.ui.ActionBar.t6.fh : org.telegram.ui.ActionBar.t6.ah, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.a4) {
                    ((org.telegram.ui.Cells.a4) childAt).a(y30Var.getTag() != null ? org.telegram.ui.ActionBar.t6.fh : org.telegram.ui.ActionBar.t6.ah, S05);
                }
            }
        }
        this.b.invalidate();
        i40Var.invalidate();
        this.c.invalidate();
    }

    public final void E1(float f7) {
        i40 i40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s4.c1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f7 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.G2 = min;
        this.H2 = (min - this.F2) / 265.0f;
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var == null || (i40Var = this.H1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(org.telegram.messenger.jj.C1(this.r2))) == null) {
            return;
        }
        y20 y20Var = this.R3;
        if (y20Var.b) {
            int i10 = 0;
            while (true) {
                u20 u20Var = this.d4;
                if (i10 >= u20Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) u20Var.getChildAt(i10);
                if (org.telegram.messenger.jj.C1(y10Var.getParticipant().peer) == org.telegram.messenger.jj.C1(groupCallParticipant.peer)) {
                    y10Var.setAmplitude(f7 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.j2 ? this.u2 : this.R2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = i40Var.K(indexOf + this.G1.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) view).setAmplitude(f7 * 15.0f);
                    if (view == this.O4 && !this.c4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        y20Var.k(groupCallParticipant, f7 * 15.0f);
    }

    public final void F1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.X4 = i10;
        this.Y4 = i11;
        this.Z4 = i12;
        this.a5 = i13;
        this.b5 = i14;
        this.c5 = i15;
        this.d5 = i16;
        this.e5 = i17;
        this.f5 = i18;
        this.g5 = i19;
        this.h5 = i20;
        this.i5 = i21;
        this.j5 = i22;
        this.k5 = i23;
        this.l5 = i24;
        this.m5 = i25;
    }

    public final void G1(float f7) {
        int i10;
        this.p2 = f7;
        this.H1.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float L = f7 - org.telegram.messenger.i0.L(74.0f);
        float f10 = this.s0 + L;
        float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2;
        q40 q40Var = this.L2;
        y20 y20Var = this.R3;
        s20 s20Var = this.W2;
        q20 q20Var = this.V2;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - L) - this.s0) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((r0 - this.s0) - org.telegram.messenger.i0.L(14.0f))));
            i10 = (int) (org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 17.0f : 13.0f) * min);
            if (q40Var != null) {
                q40Var.setShadowOffset((int) (org.telegram.messenger.i0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.L3) > 1.0E-4f) {
                D1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.f1.x(min, 0.1f, 1.2f, 1.0f);
            q20Var.setScaleX(Math.max(0.9f, x10));
            q20Var.setScaleY(Math.max(0.9f, x10));
            float f11 = 1.0f - (min * 1.2f);
            q20Var.setAlpha((1.0f - y20Var.c) * Math.max(0.0f, f11));
            s20Var.setScaleX(Math.max(0.9f, x10));
            s20Var.setScaleY(Math.max(0.9f, x10));
            s20Var.setAlpha((1.0f - y20Var.c) * Math.max(0.0f, f11));
        } else {
            q20Var.setScaleX(1.0f);
            q20Var.setScaleY(1.0f);
            q20Var.setAlpha(1.0f - y20Var.c);
            s20Var.setScaleX(1.0f);
            s20Var.setScaleY(1.0f);
            s20Var.setAlpha(1.0f - y20Var.c);
            if (this.L3 > 1.0E-4f) {
                D1(0.0f);
            }
            i10 = 0;
        }
        a1();
        float f12 = i10;
        this.q3.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), (f7 - org.telegram.messenger.i0.L(53.0f)) - f12));
        this.a3.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), (f7 - org.telegram.messenger.i0.L(44.0f)) - f12));
        if (q40Var != null) {
            q40Var.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), f7 - org.telegram.messenger.i0.L(37.0f)));
        }
        p30 p30Var = this.I1;
        if (p30Var != null) {
            p30Var.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), (f7 - org.telegram.messenger.i0.L(44.0f)) - f12));
        }
        this.b.invalidate();
        T1();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean I() {
        return !this.R3.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x04be, code lost:
    
        if (org.telegram.messenger.w3.w(2, r36.Q2) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x030a, code lost:
    
        if ((r11 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r14 == (-k1())) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c1, code lost:
    
        if (r2.admin_rights.manage_call != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r5v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I1(View view) {
        org.telegram.ui.Cells.h4 h4Var;
        y40 y40Var;
        Integer num;
        org.telegram.ui.Components.qe0 qe0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        ViewGroup viewGroup;
        Integer num2;
        boolean z10;
        int i10;
        TLRPC.GroupCall groupCall;
        long j10;
        org.telegram.messenger.ic m10;
        org.telegram.messenger.ic m11;
        boolean z11;
        j40 j40Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        int y3;
        float y10;
        int measuredHeight;
        int i11;
        boolean z12;
        ?? r52;
        String str;
        String str2;
        int i12;
        String str3;
        int i13;
        TLRPC.ChatParticipants chatParticipants;
        Integer valueOf = Integer.valueOf(R.drawable.msg_msgbubble3);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_voice_muted);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_voice_unmuted);
        if (!this.O1.k() && getContext() != null) {
            if (this.T4 || this.W3) {
                f1(true);
                return false;
            }
            c40 c40Var = this.W4;
            if (c40Var != null) {
                c40Var.dismiss();
                this.W4 = null;
                return false;
            }
            d1();
            if (view instanceof org.telegram.ui.Components.voip.k) {
                org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
                if (kVar.getParticipant() != this.R2.z) {
                    h4Var = new org.telegram.ui.Cells.h4(kVar.getContext());
                    h4Var.e(this.k1, kVar.getParticipant().a, this.R2, org.telegram.messenger.jj.C1(this.r2), null, false);
                    org.telegram.ui.Components.d5 d5Var = h4Var.s;
                    if (d5Var != null) {
                        d5Var.f();
                    }
                    this.S4 = false;
                    this.P4 = kVar;
                    this.Q4 = kVar.getRenderer();
                    if (!x5 && !w5) {
                        this.b.addView(h4Var, w7.b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (h4Var != null) {
                        boolean z13 = (w5 || x5 || org.telegram.messenger.i0.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = h4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qi(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new q10(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.v4 = linearLayout;
                            org.telegram.ui.Components.qe0 qe0Var2 = new org.telegram.ui.Components.qe0(getContext(), linearLayout, linearLayout2);
                            qe0Var2.setMinimumWidth(org.telegram.messenger.i0.L(240.0f));
                            qe0Var2.setOrientation(1);
                            boolean z14 = z13;
                            int S0 = org.telegram.messenger.i0.S0(this.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.hh, false));
                            if (linearLayout2 == null || h4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                y40Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                qe0Var2.addView(linearLayout2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                y40 y40Var2 = new y40(this, getContext(), participant);
                                linearLayout2.addView(y40Var2, -1, 48);
                                y40Var = y40Var2;
                            }
                            linearLayout.setMinimumWidth(org.telegram.messenger.i0.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            qe0Var2.addView(linearLayout, w7.b6.k(0.0f, y40Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(getContext(), qe0Var2);
                            p1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p1Var2, w7.b6.c(-2.0f, -2));
                            long C1 = org.telegram.messenger.jj.C1(participant.peer);
                            y40 y40Var3 = y40Var;
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            org.telegram.messenger.c cVar = this.k1;
                            if (!z15) {
                                num = 8;
                                qe0Var = qe0Var2;
                                p1Var = p1Var2;
                                viewGroup = linearLayout;
                                num2 = 6;
                            } else if (org.telegram.messenger.w3.T(this.Q2)) {
                                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(cVar.a);
                                qe0Var = qe0Var2;
                                p1Var = p1Var2;
                                viewGroup = linearLayout;
                                long j11 = participant.peer.user_id;
                                num2 = 6;
                                num = 8;
                                a0.h hVar = (a0.h) r12.x1.f(k1());
                                TLRPC.ChannelParticipant channelParticipant = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j11);
                                if (channelParticipant != null) {
                                    if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
                                    }
                                    z10 = true;
                                }
                                z10 = false;
                            } else {
                                num = 8;
                                qe0Var = qe0Var2;
                                p1Var = p1Var2;
                                viewGroup = linearLayout;
                                num2 = 6;
                                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(cVar.a).M0(k1());
                                if (M0 != null && (chatParticipants = M0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i14);
                                        TLRPC.ChatFull chatFull = M0;
                                        int i15 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i14++;
                                            M0 = chatFull;
                                            size = i15;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            if (h4Var.c()) {
                                if (q1() && h4Var.K) {
                                    str = null;
                                    org.telegram.ui.Cells.f1.t(null, 2131743420, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(org.telegram.messenger.cd.L0(h4Var.b.getImageReceiver().L() ? 2131743531 : 2131743268, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                if (C1 > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i13 = 2131743533;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i13 = 2131743443;
                                    }
                                    arrayList.add(org.telegram.messenger.cd.L0(i13, str3));
                                } else {
                                    arrayList.add(org.telegram.messenger.cd.L0(TextUtils.isEmpty(participant.about) ? 2131743532 : 2131743442, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (C1 > 0) {
                                    i12 = 2131743441;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i12 = 2131743440;
                                }
                                arrayList.add(org.telegram.messenger.cd.L0(i12, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (S0()) {
                                if (!q1() && z10 && participant.muted) {
                                    if (q1() && participant.muted_by_you) {
                                        arrayList.add(org.telegram.messenger.cd.L0(2131743344, null));
                                        arrayList2.add(valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    arrayList.add(org.telegram.messenger.cd.L0(2131743385, null));
                                    arrayList2.add(valueOf2);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(org.telegram.messenger.cd.L0(2131743426, null));
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(valueOf3);
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j12 = peer.channel_id;
                                    if (j12 != 0 && !org.telegram.messenger.w3.m0(this.a, j12)) {
                                        org.telegram.ui.Cells.f1.t(null, 2131743379, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num);
                                        if (q1()) {
                                            i10 = z10 ? 2 : 2;
                                        } else {
                                            org.telegram.messenger.u3 u3Var = this.R2;
                                            if (u3Var != null && (groupCall = u3Var.b) != null && groupCall.creator) {
                                                org.telegram.ui.Cells.f1.t(null, 2131743337, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i10));
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Cells.f1.t(null, 2131743377, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num2);
                                if (q1()) {
                                }
                            } else {
                                Integer num3 = num;
                                if (participant.muted_by_you) {
                                    arrayList.add(org.telegram.messenger.cd.L0(2131743344, null));
                                    arrayList2.add(valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    arrayList.add(org.telegram.messenger.cd.L0(2131743384, null));
                                    arrayList2.add(valueOf2);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j13 = peer2.channel_id;
                                    if (j13 != 0 && !org.telegram.messenger.w3.m0(this.a, j13)) {
                                        arrayList.add(org.telegram.messenger.cd.L0(2131743379, null));
                                        arrayList2.add(valueOf);
                                        arrayList3.add(num3);
                                    }
                                }
                                arrayList.add(org.telegram.messenger.cd.L0(2131743378, null));
                                arrayList2.add(valueOf);
                                arrayList3.add(num2);
                            }
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (i16 < size2) {
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), i16 == 0, i16 == size2 + (-1));
                                if (((Integer) arrayList3.get(i16)).intValue() != 2) {
                                    int i17 = org.telegram.ui.ActionBar.t6.Vg;
                                    z12 = false;
                                    r52 = 0;
                                    b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i17, false), org.telegram.ui.ActionBar.t6.x0(null, i17, false));
                                } else {
                                    z12 = false;
                                    r52 = 0;
                                    int i18 = org.telegram.ui.ActionBar.t6.jh;
                                    b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i18, false), org.telegram.ui.ActionBar.t6.x0(null, i18, false));
                                }
                                b1Var.setSelectorColor(org.telegram.ui.ActionBar.t6.x0(r52, org.telegram.ui.ActionBar.t6.Sg, z12));
                                b1Var.j((CharSequence) arrayList.get(i16), ((Integer) arrayList2.get(i16)).intValue(), r52);
                                viewGroup.addView(b1Var);
                                b1Var.setTag(arrayList3.get(i16));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                b1Var.setOnClickListener(new ya(this, i16, arrayList3, groupCallParticipant, 2));
                                i16++;
                                participant = groupCallParticipant;
                            }
                            p1Var.addView(qe0Var, w7.b6.x(-2, -2, 51));
                            i40 i40Var = this.H1;
                            i40Var.C0();
                            this.P1.X = false;
                            this.O4 = h4Var;
                            h4Var.setAboutVisible(true);
                            this.b.invalidate();
                            i40Var.invalidate();
                            AnimatorSet animatorSet = this.V4;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.V3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (C1 > 0) {
                                int i19 = cVar.a;
                                int i20 = cVar.a;
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i19).Z1(Long.valueOf(C1));
                                m10 = org.telegram.messenger.ic.m(i20, 0, Z1);
                                m11 = org.telegram.messenger.ic.m(i20, 1, Z1);
                                j10 = C1;
                                if (org.telegram.messenger.vp.r1(this.a).a2(j10) == null) {
                                    org.telegram.messenger.vp.r1(this.a).e3(Z1, false, 0);
                                }
                            } else {
                                j10 = C1;
                                int i21 = cVar.a;
                                int i22 = cVar.a;
                                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i21).L0(Long.valueOf(-j10));
                                m10 = org.telegram.messenger.ic.m(i22, 0, L0);
                                m11 = org.telegram.messenger.ic.m(i22, 1, L0);
                            }
                            org.telegram.ui.Components.voip.r rVar = this.Q4;
                            boolean z16 = rVar != null && rVar.w;
                            if (m10 != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.g9 avatarImageView = this.O4.getAvatarImageView();
                                    a30 a30Var = this.i1;
                                    a30Var.setParentAvatarImage(avatarImageView);
                                    a30Var.setHasActiveVideo(z16);
                                    a30Var.M(j10, true);
                                    a30Var.setCreateThumbFromParent(true);
                                    a30Var.H(null, m10, m11, true);
                                    org.telegram.ui.Components.voip.r rVar2 = this.Q4;
                                    if (rVar2 != null) {
                                        rVar2.h = true;
                                        rVar2.j(true);
                                    }
                                    if (org.telegram.messenger.jj.C1(this.r2) == j10 && this.Y3 != null && (j40Var = this.Z3) != null && (fileLocation = j40Var.c) != null) {
                                        a30Var.A(j40Var.d, org.telegram.messenger.ic.e(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.W3 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.V3, w7.b6.c(-2.0f, -2));
                                this.X3 = true;
                                d30 d30Var = this.S3;
                                if (d30Var == null) {
                                    i11 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.t0 * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - org.telegram.messenger.i0.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -org.telegram.messenger.i0.m);
                                    this.Z1.M().getView().draw(canvas);
                                    canvas.drawColor(i0.b.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -org.telegram.messenger.i0.m);
                                    this.w4 = true;
                                    this.b.draw(canvas);
                                    i11 = 0;
                                    this.w4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / org.telegram.messenger.zs.K2));
                                    d30Var.setBackground(new BitmapDrawable(createBitmap));
                                    d30Var.setAlpha(0.0f);
                                    d30Var.setVisibility(0);
                                    d30Var.bringToFront();
                                }
                                this.T4 = true;
                                this.t4.setVisibility(i11);
                                if (y40Var3 != null) {
                                    y40Var3.invalidate();
                                }
                                A1(true, h4Var);
                                org.telegram.ui.Components.y10 y10Var = this.R4;
                                if (y10Var != null) {
                                    y10Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.W3 = false;
                            c40 c40Var2 = new c40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.W4 = c40Var2;
                            c40Var2.e = true;
                            c40Var2.c = org.telegram.messenger.zs.x3;
                            c40Var2.setOutsideTouchable(true);
                            this.W4.setClippingEnabled(true);
                            this.W4.setAnimationStyle(R.style.PopupContextAnimation);
                            this.W4.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            this.W4.setInputMethodMode(2);
                            this.W4.setSoftInputMode(0);
                            this.W4.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.y10 y10Var2 = this.R4;
                            if (y10Var2 != null) {
                                boolean z17 = w5;
                                y20 y20Var = this.R3;
                                u20 u20Var = this.d4;
                                if (z17) {
                                    x10 = org.telegram.messenger.i0.L(32.0f) + (((int) (y20Var.getX() + (u20Var.getX() + y10Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    y3 = ((int) (y20Var.getY() + (u20Var.getY() + this.R4.getY()))) - org.telegram.messenger.i0.L(6.0f);
                                } else {
                                    int x11 = ((int) (y20Var.getX() + (u20Var.getX() + y10Var2.getX()))) - org.telegram.messenger.i0.L(14.0f);
                                    y3 = (int) ((y20Var.getY() + (u20Var.getY() + this.R4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight());
                                    x10 = x11;
                                }
                            } else {
                                x10 = (int) (((i40Var.getX() + i40Var.getMeasuredWidth()) + org.telegram.messenger.i0.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.S4) {
                                    y10 = h4Var.getY() + i40Var.getY();
                                    measuredHeight = h4Var.getClipHeight();
                                } else if (this.P4 != null) {
                                    y10 = this.P4.getY() + i40Var.getY();
                                    measuredHeight = this.P4.getMeasuredHeight();
                                } else {
                                    y3 = (int) i40Var.getY();
                                }
                                y3 = (int) (y10 + measuredHeight);
                            }
                            this.W4.showAtLocation(i40Var, 51, x10, y3);
                            this.V4 = new AnimatorSet();
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(ObjectAnimator.ofInt(this.N4, org.telegram.ui.Components.i6.b, 0, 100));
                            this.V4.playTogether(arrayList4);
                            this.V4.setDuration(150L);
                            this.V4.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.y10) {
                    org.telegram.ui.Components.y10 y10Var3 = (org.telegram.ui.Components.y10) view;
                    if (y10Var3.getParticipant() != this.R2.z.a) {
                        h4Var = new org.telegram.ui.Cells.h4(y10Var3.getContext());
                        h4Var.e(this.k1, y10Var3.getParticipant(), this.R2, org.telegram.messenger.jj.C1(this.r2), null, false);
                        org.telegram.ui.Components.d5 d5Var2 = h4Var.s;
                        if (d5Var2 != null) {
                            d5Var2.f();
                        }
                        this.S4 = false;
                        this.R4 = y10Var3;
                        org.telegram.ui.Components.voip.r renderer = y10Var3.getRenderer();
                        this.Q4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Q4 = null;
                        }
                        this.b.addView(h4Var, w7.b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    h4Var = (org.telegram.ui.Cells.h4) view;
                    this.S4 = true;
                }
                if (h4Var != null) {
                }
            }
        }
        return false;
    }

    public final void J1(View view) {
        if (this.d2 == null) {
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(8, getContext(), null, true);
            this.d2 = q30Var;
            q30Var.setAlpha(0.0f);
            this.d2.setVisibility(4);
            this.d2.setShowingDuration(3000L);
            this.b.addView(this.d2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.w3.W(this.Q2)) {
                this.d2.setText(org.telegram.messenger.cd.L0(2131743491, null));
            } else {
                this.d2.setText(org.telegram.messenger.cd.L0(2131743373, null));
            }
            this.d2.d();
        }
        this.d2.setExtraTranslationY(-org.telegram.messenger.i0.m);
        this.d2.f(view, true);
    }

    public final void K1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.messenger.u3 u3Var = this.R2;
        org.telegram.ui.Components.voip.b2 b2Var = this.r1;
        org.telegram.ui.Components.voip.b2 b2Var2 = this.n1;
        org.telegram.ui.Components.voip.b2 b2Var3 = this.p1;
        org.telegram.ui.Components.voip.b2 b2Var4 = this.m1;
        org.telegram.ui.Components.voip.b2 b2Var5 = this.o1;
        org.telegram.ui.Components.voip.b2 b2Var6 = this.q1;
        org.telegram.ui.Components.voip.b2 b2Var7 = this.s1;
        l20 l20Var = this.l1;
        boolean z15 = false;
        if (u3Var == null || u3Var.j()) {
            l20Var.c(b2Var7, this.M2 > 0.1f, z10);
            l20Var.c(b2Var6, this.M2 > 0.1f, z10);
            l20Var.c(b2Var3, this.M2 > 0.1f, z10);
            l20Var.c(b2Var5, false, z10);
            l20Var.c(b2Var4, false, z10);
            l20Var.c(b2Var2, false, z10);
            l20Var.c(b2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.r2));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
        Boolean bool = this.o5;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.R2.b;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.R2.c()) && !z16) || t1()) {
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
        if (w5) {
            z13 = false;
            z14 = false;
        }
        l20Var.c(b2Var7, true, z10);
        l20Var.c(b2Var6, true, z10);
        l20Var.c(b2Var5, z12, z10);
        l20Var.c(b2Var4, z14, z10);
        l20Var.c(b2Var3, z15, z10);
        l20Var.c(b2Var2, z13, z10);
        l20Var.c(b2Var, z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        y20 y20Var = this.R3;
        if (y20Var != null) {
            if (this.h4 != null) {
                this.H1.getViewTreeObserver().removeOnPreDrawListener(this.h4);
                this.h4 = null;
            }
            ArrayList arrayList = this.Q3;
            arrayList.clear();
            ArrayList arrayList2 = this.P3;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).f();
                y20Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (y20Var.getParent() != null) {
                arrayList2.clear();
                this.b.removeView(y20Var);
            }
        }
        super.L();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (u5 == this) {
            u5 = null;
        }
        v5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.g20.j(getContext());
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var != null) {
            ArrayList arrayList3 = u3Var.e;
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i11)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i11)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i11)).videoIndex = 0;
            }
            u3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final void L1() {
        org.telegram.messenger.u3 u3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.u3 u3Var2 = this.R2;
        org.telegram.ui.ActionBar.t0 t0Var = this.b3;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.d3;
        if (u3Var2 == null || u3Var2.j()) {
            this.c3.setVisibility(4);
            t0Var2.setVisibility(8);
            if (this.R2 == null) {
                t0Var.setVisibility(8);
                return;
            }
        }
        if (this.c2) {
            return;
        }
        org.telegram.messenger.c cVar = this.k1;
        int i10 = cVar.a;
        int i11 = cVar.a;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(k1()));
        if (L0 != null) {
            this.Q2 = L0;
        }
        boolean y3 = org.telegram.messenger.w3.y(3, this.Q2);
        org.telegram.ui.ActionBar.b1 b1Var = this.e3;
        if (y3 || (((!org.telegram.messenger.w3.T(this.Q2) || ((chat2 = this.Q2) != null && chat2.megagroup)) && (org.telegram.messenger.w3.t0(this.Q2) || org.telegram.messenger.w3.y(3, this.Q2))) || (org.telegram.messenger.w3.T(this.Q2) && (chat = this.Q2) != null && !chat.megagroup && org.telegram.messenger.w3.t0(chat)))) {
            b1Var.setVisibility(0);
        } else {
            b1Var.setVisibility(8);
        }
        org.telegram.messenger.u3 u3Var3 = this.R2;
        org.telegram.ui.ActionBar.b1 b1Var2 = this.p3;
        org.telegram.ui.ActionBar.b1 b1Var3 = this.o3;
        if (u3Var3 == null || (groupCall2 = u3Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            b1Var3.setVisibility(8);
            b1Var2.setVisibility(8);
        } else {
            b1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            b1Var2.setVisibility(this.R2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.r2));
        org.telegram.messenger.u3 u3Var4 = this.R2;
        org.telegram.ui.ActionBar.b1 b1Var4 = this.h3;
        if (u3Var4 == null || u3Var4.j() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            b1Var4.setVisibility(8);
        } else {
            b1Var4.setVisibility(0);
        }
        b1Var4.setIcon(org.telegram.messenger.tz.I0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        b1Var4.setSubtext(org.telegram.messenger.cd.L0(org.telegram.messenger.tz.I0 ? 2131743306 : 2131743307, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.b1 b1Var5 = this.n3;
        org.telegram.ui.ActionBar.b1 b1Var6 = this.f3;
        org.telegram.ui.ActionBar.b1 b1Var7 = this.j3;
        org.telegram.ui.ActionBar.b1 b1Var8 = this.k3;
        if (S0) {
            b1Var5.setVisibility(0);
            b1Var6.setVisibility(0);
            if (t1()) {
                b1Var7.setVisibility(0);
                b1Var8.setVisibility(8);
            } else if (this.R2.j()) {
                b1Var7.setVisibility(8);
                b1Var8.setVisibility(8);
            } else {
                b1Var7.setVisibility(0);
            }
            if (q1()) {
                b1Var7.setVisibility(8);
                b1Var6.setVisibility(8);
            }
            if (!this.R2.c() || this.R2.j() || t1()) {
                b1Var8.setVisibility(8);
            } else {
                b1Var8.setVisibility(0);
            }
            t0Var2.setVisibility(8);
            boolean z10 = this.R2.w;
            w40 w40Var = this.U2;
            w40Var.f = z10;
            w40Var.d = 1.0f;
            w40Var.invalidateSelf();
            if (this.R2.w) {
                if (this.u3 == null) {
                    t10 t10Var = new t10(this, 6);
                    this.u3 = t10Var;
                    org.telegram.messenger.i0.h3(t10Var, 1000L);
                }
                b1Var7.setText(org.telegram.messenger.cd.L0(2131743349, null));
            } else {
                t10 t10Var2 = this.u3;
                if (t10Var2 != null) {
                    org.telegram.messenger.i0.r(t10Var2);
                    this.u3 = null;
                }
                b1Var7.setText(org.telegram.messenger.cd.L0(2131743374, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                b1Var8.j(org.telegram.messenger.cd.L0(2131743462, null), R.drawable.msg_screencast, null);
            } else {
                b1Var8.j(org.telegram.messenger.cd.L0(2131743460, null), R.drawable.msg_screencast_off, null);
            }
            N1();
        } else {
            boolean z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
            boolean z12 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z11 || (!(this.R2.c() || z12) || this.R2.j() || t1())) {
                t0Var2.setVisibility(8);
                b1Var8.setVisibility(8);
            } else if (z12) {
                t0Var2.setVisibility(8);
                b1Var8.setVisibility(0);
                b1Var8.j(org.telegram.messenger.cd.L0(2131743460, null), R.drawable.msg_screencast_off, null);
                b1Var8.setContentDescription(org.telegram.messenger.cd.L0(2131743460, null));
            } else {
                b1Var8.j(org.telegram.messenger.cd.L0(2131743462, null), R.drawable.msg_screencast, null);
                b1Var8.setContentDescription(org.telegram.messenger.cd.L0(2131743462, null));
                t0Var2.setVisibility(8);
                b1Var8.setVisibility(0);
            }
            b1Var5.setVisibility(8);
            b1Var6.setVisibility(8);
            b1Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.b1 b1Var9 = this.i3;
        if (S02 && this.R2.b.can_change_join_muted && !q1()) {
            b1Var9.setVisibility(0);
        } else {
            b1Var9.setVisibility(8);
        }
        t0Var.Q(4, (q1() && ((u3Var = this.R2) == null || (groupCall = u3Var.b) == null || !groupCall.creator)) ? false : true);
        this.g3.setVisibility((!t1() || this.R2.j()) ? 0 : 8);
        int visibility = b1Var6.getVisibility();
        TextView textView = this.r3;
        if (visibility == 0 || b1Var9.getVisibility() == 0 || b1Var.getVisibility() == 0 || b1Var8.getVisibility() == 0 || b1Var7.getVisibility() == 0 || b1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.j jVar = this.b2;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.S2) || t1() || this.r2 == null) {
            jVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            long C1 = org.telegram.messenger.jj.C1(this.r2);
            jVar.setObject(org.telegram.messenger.o5.E(C1) ? org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(C1)) : org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-C1)));
        }
        TLRPC.Chat chat3 = this.Q2;
        if (chat3 == null || org.telegram.messenger.w3.W(chat3) || !t1() || b1Var.getVisibility() != 8) {
            t0Var.setVisibility(0);
        } else {
            t0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.i0.L(f7)) {
            layoutParams.rightMargin = org.telegram.messenger.i0.L(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.q3.getLayoutParams()).rightMargin = 0;
        this.F1.setTitleRightMargin(org.telegram.messenger.i0.L(48.0f) * 2);
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
    public final void M1(int i10, boolean z10) {
        boolean P;
        boolean P2;
        String L0;
        String str;
        boolean z11;
        boolean z12;
        boolean P3;
        boolean P4;
        int i11;
        a50[] a50VarArr;
        boolean z13;
        a50 a50Var;
        a50 a50Var2;
        boolean z14;
        boolean z15;
        y20 y20Var = this.R3;
        boolean z16 = y20Var != null && y20Var.b && (org.telegram.messenger.i0.Q1() || w5 == s1());
        if (!t1() && this.w3 == i10 && z10) {
            return;
        }
        org.telegram.ui.Components.bi0 bi0Var = this.A2;
        if (i10 == 7) {
            str = org.telegram.messenger.cd.L0(2131743419, null);
            P4 = bi0Var.P(org.telegram.messenger.zs.g3);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        String L02 = org.telegram.messenger.cd.L0(2131743343, null);
                        L0 = org.telegram.messenger.cd.L0(2131743327, null);
                        int i12 = this.w3;
                        if (i12 == 3) {
                            int i13 = bi0Var.f;
                            z11 = (i13 == 136 || i13 == 173 || i13 == 274 || i13 == 311) ? bi0Var.P(99) : false;
                        } else {
                            z11 = i12 == 5 ? bi0Var.P(404) : i12 == 7 ? bi0Var.P(376) : i12 == 6 ? bi0Var.P(org.telegram.messenger.zs.M3) : i12 == 2 ? bi0Var.P(36) : bi0Var.P(99);
                        }
                        str = L02;
                    } else if (i10 == 1) {
                        str = org.telegram.messenger.cd.L0(q1() ? 2131743258 : 2131743257, null);
                        P3 = bi0Var.P(this.w3 == 4 ? 99 : 69);
                    } else if (q1() && i10 == 2) {
                        str = org.telegram.messenger.cd.L0(2131743317, null);
                        z11 = bi0Var.P(99);
                        L0 = "";
                    } else {
                        if (i10 != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.r2));
                            boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
                            if (z17) {
                                int i14 = this.w3;
                                if (i14 == 7) {
                                    P2 = bi0Var.P(org.telegram.messenger.zs.i5);
                                } else if (i14 == 6) {
                                    P2 = bi0Var.P(org.telegram.messenger.zs.x4);
                                } else if (i14 == 1) {
                                    P2 = bi0Var.P(org.telegram.messenger.zs.D2);
                                } else {
                                    P = bi0Var.P(org.telegram.messenger.zs.S1);
                                }
                                P = P2;
                            } else {
                                int i15 = this.w3;
                                if (i15 == 5) {
                                    P2 = bi0Var.P(404);
                                    P = P2;
                                } else if (i15 == 7) {
                                    P = bi0Var.P(376);
                                } else if (i15 == 6) {
                                    P = bi0Var.P(org.telegram.messenger.zs.M3);
                                } else if (i15 == 2 || i15 == 4) {
                                    P = bi0Var.P(36);
                                } else {
                                    P = bi0Var.P(99);
                                }
                            }
                            if (i10 == 3) {
                                str = org.telegram.messenger.cd.L0(2131751809, null);
                                z11 = P;
                                z12 = z17;
                                L0 = "";
                            } else {
                                String L03 = org.telegram.messenger.cd.L0(2131743317, null);
                                boolean z18 = z17;
                                L0 = org.telegram.messenger.cd.L0(2131743316, null);
                                str = L03;
                                z11 = P;
                                z12 = z18;
                            }
                            if (t1() && i10 != 3 && !this.R2.j()) {
                                str = org.telegram.messenger.cd.L0(!z16 ? 2131743386 : 2131743404, null);
                                boolean z19 = this.x3 == z16;
                                this.x3 = z16;
                                z11 = z19;
                                L0 = "";
                            }
                            String C = TextUtils.isEmpty(L0) ? a1.g.C(str, " ", L0) : str;
                            org.telegram.ui.Components.voip.b2 b2Var = this.s1;
                            b2Var.setContentDescription(C);
                            b2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                            m20 m20Var = this.t1;
                            ImageView imageView = this.u1;
                            if (z10) {
                                this.w3 = i10;
                                bi0Var.N(bi0Var.f - 1, false, true);
                                if (!t1() || this.R2.j()) {
                                    imageView.setVisibility(8);
                                    m20Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((y20Var != null && y20Var.b && (org.telegram.messenger.i0.Q1() || w5 == s1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    m20Var.setVisibility(8);
                                }
                            } else {
                                if (z11) {
                                    if (i10 == 5) {
                                        bi0Var.M(376);
                                    } else if (i10 == 7) {
                                        bi0Var.M(org.telegram.messenger.zs.D2);
                                    } else if (i10 == 6) {
                                        bi0Var.M(org.telegram.messenger.zs.i5);
                                    } else if (i10 == 0) {
                                        int i16 = this.w3;
                                        if (i16 == 5) {
                                            bi0Var.M(376);
                                        } else if (i16 == 7) {
                                            bi0Var.M(org.telegram.messenger.zs.P5);
                                        } else if (i16 == 6) {
                                            bi0Var.M(org.telegram.messenger.zs.g3);
                                        } else if (i16 == 2) {
                                            bi0Var.M(0);
                                        } else {
                                            bi0Var.M(69);
                                        }
                                    } else if (i10 == 1 || (this.w3 == 2 && q1())) {
                                        bi0Var.M(this.w3 != 4 ? 36 : 69);
                                    } else if (i10 == 4) {
                                        bi0Var.M(99);
                                    } else if (z12) {
                                        int i17 = this.w3;
                                        if (i17 == 7) {
                                            bi0Var.M(org.telegram.messenger.zs.x4);
                                        } else if (i17 == 6) {
                                            bi0Var.M(org.telegram.messenger.zs.M3);
                                        } else if (i17 == 1) {
                                            bi0Var.M(org.telegram.messenger.zs.S1);
                                        } else {
                                            bi0Var.M(99);
                                        }
                                    } else {
                                        int i18 = this.w3;
                                        if (i18 == 5) {
                                            bi0Var.M(376);
                                        } else if (i18 == 7) {
                                            bi0Var.M(org.telegram.messenger.zs.P5);
                                        } else if (i18 == 6) {
                                            bi0Var.M(org.telegram.messenger.zs.g3);
                                        } else if (i18 == 2 || i18 == 4) {
                                            bi0Var.M(0);
                                        } else {
                                            bi0Var.M(69);
                                        }
                                    }
                                }
                                m20Var.d();
                                if (!t1() || this.R2.j()) {
                                    imageView.setVisibility(8);
                                    m20Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((y20Var != null && y20Var.b && (org.telegram.messenger.i0.Q1() || w5 == s1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    m20Var.setVisibility(8);
                                }
                                this.w3 = i10;
                            }
                            b2Var.invalidate();
                            i11 = this.w3;
                            a50VarArr = this.B3;
                            if (a50VarArr[i11] == null) {
                                a50VarArr[i11] = new a50(i11);
                                int i19 = this.w3;
                                if (i19 == 3) {
                                    a50VarArr[i19].g = null;
                                } else if (r1(i19)) {
                                    a50VarArr[this.w3].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    int i20 = this.w3;
                                    if (i20 != 1) {
                                        z13 = false;
                                        a50VarArr[i20].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                        a50Var = a50VarArr[this.w3];
                                        a50Var2 = this.E3;
                                        if (a50Var != a50Var2) {
                                            this.D3 = a50Var2;
                                            this.E3 = a50Var;
                                            if (a50Var2 == null || !z10) {
                                                this.C3 = 1.0f;
                                                this.D3 = null;
                                            } else {
                                                this.C3 = 0.0f;
                                            }
                                        }
                                        if (!z10) {
                                            a50 a50Var3 = this.E3;
                                            if (a50Var3 != null) {
                                                int i21 = a50Var3.i;
                                                z15 = true;
                                                z14 = (i21 == 1 || i21 == 0) ? true : z13;
                                                if (i21 == 3) {
                                                    z15 = z13;
                                                }
                                            } else {
                                                z14 = z13;
                                                z15 = z14;
                                            }
                                            this.G3 = z14 ? 1.0f : 0.0f;
                                            this.H3 = z15 ? 1.0f : 0.0f;
                                        }
                                        this.l1.invalidate();
                                    }
                                    a50VarArr[i20].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.th, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                            }
                            z13 = false;
                            a50Var = a50VarArr[this.w3];
                            a50Var2 = this.E3;
                            if (a50Var != a50Var2) {
                            }
                            if (!z10) {
                            }
                            this.l1.invalidate();
                        }
                        str = org.telegram.messenger.cd.L0(2131743313, null);
                        String L04 = org.telegram.messenger.cd.L0(2131743314, null);
                        z11 = bi0Var.P(org.telegram.messenger.zs.S1);
                        L0 = L04;
                    }
                    z12 = false;
                    if (t1()) {
                        str = org.telegram.messenger.cd.L0(!z16 ? 2131743386 : 2131743404, null);
                        if (this.x3 == z16) {
                        }
                        this.x3 = z16;
                        z11 = z19;
                        L0 = "";
                    }
                    if (TextUtils.isEmpty(L0)) {
                    }
                    org.telegram.ui.Components.voip.b2 b2Var2 = this.s1;
                    b2Var2.setContentDescription(C);
                    b2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                    m20 m20Var2 = this.t1;
                    ImageView imageView2 = this.u1;
                    if (z10) {
                    }
                    b2Var2.invalidate();
                    i11 = this.w3;
                    a50VarArr = this.B3;
                    if (a50VarArr[i11] == null) {
                    }
                    z13 = false;
                    a50Var = a50VarArr[this.w3];
                    a50Var2 = this.E3;
                    if (a50Var != a50Var2) {
                    }
                    if (!z10) {
                    }
                    this.l1.invalidate();
                }
                str = org.telegram.messenger.cd.L0(2131743356, null);
                P3 = bi0Var.P(377);
                z11 = P3;
                L0 = "";
                z12 = false;
                if (t1()) {
                }
                if (TextUtils.isEmpty(L0)) {
                }
                org.telegram.ui.Components.voip.b2 b2Var22 = this.s1;
                b2Var22.setContentDescription(C);
                b2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                m20 m20Var22 = this.t1;
                ImageView imageView22 = this.u1;
                if (z10) {
                }
                b2Var22.invalidate();
                i11 = this.w3;
                a50VarArr = this.B3;
                if (a50VarArr[i11] == null) {
                }
                z13 = false;
                a50Var = a50VarArr[this.w3];
                a50Var2 = this.E3;
                if (a50Var != a50Var2) {
                }
                if (!z10) {
                }
                this.l1.invalidate();
            }
            str = org.telegram.messenger.cd.L0(2131743364, null);
            P4 = bi0Var.P(org.telegram.messenger.zs.P5);
        }
        L0 = "";
        z11 = P4;
        z12 = false;
        if (t1()) {
        }
        if (TextUtils.isEmpty(L0)) {
        }
        org.telegram.ui.Components.voip.b2 b2Var222 = this.s1;
        b2Var222.setContentDescription(C);
        b2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
        m20 m20Var222 = this.t1;
        ImageView imageView222 = this.u1;
        if (z10) {
        }
        b2Var222.invalidate();
        i11 = this.w3;
        a50VarArr = this.B3;
        if (a50VarArr[i11] == null) {
        }
        z13 = false;
        a50Var = a50VarArr[this.w3];
        a50Var2 = this.E3;
        if (a50Var != a50Var2) {
        }
        if (!z10) {
        }
        this.l1.invalidate();
    }

    public final void N1() {
        if (this.R2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.k1.a).getCurrentTime();
        org.telegram.messenger.u3 u3Var = this.R2;
        int i10 = currentTime - u3Var.b.record_start_date;
        boolean z10 = u3Var.w;
        org.telegram.ui.ActionBar.b1 b1Var = this.j3;
        if (z10) {
            b1Var.setSubtext(org.telegram.messenger.i0.g0(i10, false, false));
        } else {
            b1Var.setSubtext(null);
        }
    }

    public final void O1(boolean z10) {
        float interpolation;
        float f7;
        p30 p30Var = this.I1;
        if ((p30Var == null || this.R2 != null) && this.O2 == null) {
            this.N2 = 1.0f;
            this.M2 = 1.0f;
            if (p30Var == null) {
                return;
            }
        }
        if (!z10) {
            p20 p20Var = this.n4;
            org.telegram.messenger.i0.r(p20Var);
            p20Var.run();
            org.telegram.messenger.u3 u3Var = this.R2;
            i40 i40Var = this.H1;
            if (u3Var == null || u3Var.j()) {
                i40Var.setVisibility(4);
            } else {
                i40Var.setVisibility(0);
            }
            boolean W = org.telegram.messenger.w3.W(this.Q2);
            org.telegram.ui.ActionBar.b1 b1Var = this.n3;
            if (W) {
                b1Var.setText(org.telegram.messenger.cd.L0(2131743514, null));
            } else {
                b1Var.setText(org.telegram.messenger.cd.L0(2131743421, null));
            }
        }
        float f10 = this.M2;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.gr.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.N2 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            this.N2 = grVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * grVar.getInterpolation(this.M2 / 0.6f);
            f7 = this.M2 / 0.6f;
        }
        K1(true);
        float f11 = 1.0f - f7;
        p30Var.setAlpha(f11);
        this.L1.setAlpha(f7);
        this.N1.setAlpha(f7);
        h40 h40Var = this.M1;
        h40Var.setAlpha(f7);
        h40Var.setScaleX(interpolation);
        h40Var.setScaleY(interpolation);
        n30 n30Var = this.K1;
        n30Var.setScaleX(f11);
        n30Var.setScaleY(f11);
        n30Var.setAlpha(f11);
        this.J1.setAlpha(f11);
        this.b3.setAlpha(f7);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != p30Var.getVisibility()) {
            p30Var.setVisibility(i10);
            n30Var.setVisibility(i10);
        }
    }

    public final void P1(boolean z10) {
        org.telegram.ui.Components.voip.b2 b2Var = this.p1;
        if (b2Var == null || b2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        l20 l20Var = this.l1;
        if (sharedInstance == null || t1()) {
            b2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, org.telegram.messenger.cd.L0(2131743463, null), false, z10);
            boolean z11 = org.telegram.messenger.w3.t0(this.Q2) || (org.telegram.messenger.w3.N(this.Q2) && org.telegram.messenger.w3.w(3, this.Q2));
            ch.a aVar = (ch.a) l20Var.c.get(b2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                b2Var.setEnabled(z11);
            }
            b2Var.b(true, false);
            return;
        }
        ch.a aVar2 = (ch.a) l20Var.c.get(b2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            b2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            b2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743529, null), false, z10);
        } else if (z13) {
            b2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            b2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743527, null), false, z10);
        } else {
            b2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z10);
        }
        b2Var.b(z13, z10);
        j1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.R1 != i10) {
            this.R1 = i10;
            org.telegram.messenger.i0.Q3(this.S1, i10);
        }
        org.telegram.ui.Components.voip.b2 b2Var2 = this.n1;
        if (b2Var2.getVisibility() == 0) {
            b2Var2.c(0, -1, 0, 1.0f, true, h1(j1()), false, z10);
            b2Var2.b(j1() != 1, z10);
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
    public final void Q0(boolean z10) {
        i40 i40Var;
        v40 v40Var;
        y20 y20Var;
        i40 i40Var2;
        boolean z11;
        int i10;
        ArrayList arrayList;
        int i11;
        int size;
        int i12;
        ArrayList arrayList2;
        int i13;
        int i14;
        i40 i40Var3;
        y20 y20Var2;
        boolean z12;
        u20 u20Var;
        ?? r02;
        ?? r82;
        org.telegram.messenger.u3 u3Var;
        boolean z13;
        org.telegram.messenger.v3 v3Var;
        org.telegram.messenger.v3 v3Var2;
        s4.c1 G;
        e eVar;
        int i15;
        b50 b50Var = this;
        v40 v40Var2 = b50Var.G1;
        y20 y20Var3 = b50Var.R3;
        if (y20Var3 == null || (i40Var = b50Var.H1) == null || b50Var.R2 == null || b50Var.j2) {
            return;
        }
        if (y20Var3.b) {
            y20Var3.setVisibleParticipant(true);
        }
        long C1 = org.telegram.messenger.jj.C1(b50Var.R2.J);
        if (C1 != org.telegram.messenger.jj.C1(b50Var.r2) && b50Var.R2.d.f(C1) != null) {
            b50Var.r2 = b50Var.R2.J;
        }
        int childCount = i40Var.getChildCount();
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = i40Var.getChildAt(i18);
            s4.c1 G2 = i40Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i16)) {
                i17 = G2.c();
                i16 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = b50Var.h2;
        arrayList3.clear();
        if (!x5) {
            arrayList3.addAll(b50Var.R2.f);
        } else if (y20Var3.b) {
            arrayList3.addAll(b50Var.R2.f);
            org.telegram.messenger.v3 v3Var3 = y20Var3.e;
            if (v3Var3 != null) {
                arrayList3.remove(v3Var3);
            }
        }
        if (i40Var.getItemAnimator() != null && !z10) {
            i40Var.setItemAnimator(null);
        } else if (i40Var.getItemAnimator() == null && z10) {
            i40Var.setItemAnimator(b50Var.O1);
        }
        try {
            eVar = new e(v40Var2, 18);
            try {
                try {
                    z11 = true;
                } catch (Exception e) {
                    e = e;
                    v40Var = v40Var2;
                    z11 = true;
                }
            } catch (Exception e7) {
                e = e7;
                v40Var = v40Var2;
                i40Var2 = i40Var;
                z11 = true;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i17;
                y20Var = y20Var3;
            }
        } catch (Exception e10) {
            e = e10;
            v40Var = v40Var2;
            y20Var = y20Var3;
            i40Var2 = i40Var;
            z11 = true;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i17;
        }
        try {
            try {
                try {
                    i15 = i17;
                    try {
                        y20Var = y20Var3;
                    } catch (Exception e11) {
                        e = e11;
                        y20Var = y20Var3;
                    }
                } catch (Exception e12) {
                    e = e12;
                    i11 = i17;
                    y20Var = y20Var3;
                    i40Var2 = i40Var;
                    i10 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e13) {
                e = e13;
                v40Var = v40Var2;
                arrayList = arrayList3;
                i11 = i17;
                y20Var = y20Var3;
                i40Var2 = i40Var;
                i10 = childCount;
            }
        } catch (Exception e14) {
            e = e14;
            v40Var = v40Var2;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i17;
            y20Var = y20Var3;
            i40Var2 = i40Var;
            org.telegram.messenger.f8.g(e, z11);
            v40Var.f();
            ArrayList arrayList4 = b50Var.R2.e;
            size = arrayList4.size();
            while (i12 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList5 = b50Var.u2;
            arrayList5.clear();
            arrayList5.addAll(b50Var.R2.g);
            ArrayList arrayList6 = b50Var.v2;
            arrayList6.clear();
            arrayList2 = arrayList;
            arrayList6.addAll(arrayList2);
            ArrayList arrayList7 = b50Var.w2;
            arrayList7.clear();
            arrayList7.addAll(b50Var.R2.j);
            ArrayList arrayList8 = b50Var.x2;
            arrayList8.clear();
            arrayList8.addAll(b50Var.R2.m);
            ArrayList arrayList9 = b50Var.y2;
            arrayList9.clear();
            arrayList9.addAll(b50Var.R2.l);
            v40 v40Var3 = v40Var;
            b50Var.z2 = v40Var3.F;
            i13 = i10;
            i14 = 0;
            while (i14 < i13) {
            }
            i40Var3 = i40Var2;
            boolean c10 = y20Var.c();
            y20Var2 = y20Var;
            if (y20Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.z10 z10Var = b50Var.g4;
            u20Var = b50Var.d4;
            z10Var.G(u20Var, z11);
            if (u20Var.getVisibility() == 0) {
            }
            if (x5) {
            }
            if (i40Var3.getVisibility() == 0) {
            }
            r02 = b50Var.Q3;
            r02.clear();
            r02.addAll(b50Var.P3);
            while (r82 < r02.size()) {
            }
            u3Var = b50Var.R2;
            if (u3Var != null) {
            }
            org.telegram.messenger.u3 u3Var2 = b50Var.R2;
            if (u3Var2 != null) {
            }
            b50Var.t5.a(z13, z10);
            if (z13 == b50Var.z4) {
            }
        }
        try {
            i40Var2 = i40Var;
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
                    i11 = i15;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i11 = i15;
                    i10 = childCount;
                    b50Var = this;
                    v40Var = v40Var2;
                    try {
                        b50Var.F1(v40Var2.K, v40Var2.x, v40Var2.d, v40Var2.e, v40Var2.f, v40Var2.h, v40Var2.n, v40Var2.r, v40Var2.s, v40Var2.w, v40Var2.G, v40Var2.H, v40Var2.I, v40Var2.J, v40Var2.y, v40Var2.D);
                        v40Var.E();
                        z11 = true;
                        try {
                            s4.n.c(b50Var.n5, true).b(eVar);
                        } catch (Exception e17) {
                            e = e17;
                            org.telegram.messenger.f8.g(e, z11);
                            v40Var.f();
                            ArrayList arrayList42 = b50Var.R2.e;
                            size = arrayList42.size();
                            while (i12 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList52 = b50Var.u2;
                            arrayList52.clear();
                            arrayList52.addAll(b50Var.R2.g);
                            ArrayList arrayList62 = b50Var.v2;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = b50Var.w2;
                            arrayList72.clear();
                            arrayList72.addAll(b50Var.R2.j);
                            ArrayList arrayList82 = b50Var.x2;
                            arrayList82.clear();
                            arrayList82.addAll(b50Var.R2.m);
                            ArrayList arrayList92 = b50Var.y2;
                            arrayList92.clear();
                            arrayList92.addAll(b50Var.R2.l);
                            v40 v40Var32 = v40Var;
                            b50Var.z2 = v40Var32.F;
                            i13 = i10;
                            i14 = 0;
                            while (i14 < i13) {
                            }
                            i40Var3 = i40Var2;
                            boolean c102 = y20Var.c();
                            y20Var2 = y20Var;
                            if (y20Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.z10 z10Var2 = b50Var.g4;
                                u20Var = b50Var.d4;
                                z10Var2.G(u20Var, z11);
                                if (u20Var.getVisibility() == 0) {
                                }
                                if (x5) {
                                }
                                if (i40Var3.getVisibility() == 0) {
                                }
                                r02 = b50Var.Q3;
                                r02.clear();
                                r02.addAll(b50Var.P3);
                                while (r82 < r02.size()) {
                                }
                                u3Var = b50Var.R2;
                                if (u3Var != null) {
                                }
                                org.telegram.messenger.u3 u3Var22 = b50Var.R2;
                                if (u3Var22 != null) {
                                }
                                b50Var.t5.a(z13, z10);
                                if (z13 == b50Var.z4) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.z10 z10Var22 = b50Var.g4;
                            u20Var = b50Var.d4;
                            z10Var22.G(u20Var, z11);
                            if (u20Var.getVisibility() == 0) {
                            }
                            if (x5) {
                            }
                            if (i40Var3.getVisibility() == 0) {
                            }
                            r02 = b50Var.Q3;
                            r02.clear();
                            r02.addAll(b50Var.P3);
                            while (r82 < r02.size()) {
                            }
                            u3Var = b50Var.R2;
                            if (u3Var != null) {
                            }
                            org.telegram.messenger.u3 u3Var222 = b50Var.R2;
                            if (u3Var222 != null) {
                            }
                            b50Var.t5.a(z13, z10);
                            if (z13 == b50Var.z4) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        z11 = true;
                    }
                } catch (Exception e19) {
                    e = e19;
                    b50Var = this;
                    arrayList = arrayList3;
                    i11 = i15;
                    z11 = true;
                    i10 = childCount;
                    v40Var = v40Var2;
                    org.telegram.messenger.f8.g(e, z11);
                    v40Var.f();
                    ArrayList arrayList422 = b50Var.R2.e;
                    size = arrayList422.size();
                    while (i12 < size) {
                    }
                    if (view != null) {
                    }
                    ArrayList arrayList522 = b50Var.u2;
                    arrayList522.clear();
                    arrayList522.addAll(b50Var.R2.g);
                    ArrayList arrayList622 = b50Var.v2;
                    arrayList622.clear();
                    arrayList2 = arrayList;
                    arrayList622.addAll(arrayList2);
                    ArrayList arrayList722 = b50Var.w2;
                    arrayList722.clear();
                    arrayList722.addAll(b50Var.R2.j);
                    ArrayList arrayList822 = b50Var.x2;
                    arrayList822.clear();
                    arrayList822.addAll(b50Var.R2.m);
                    ArrayList arrayList922 = b50Var.y2;
                    arrayList922.clear();
                    arrayList922.addAll(b50Var.R2.l);
                    v40 v40Var322 = v40Var;
                    b50Var.z2 = v40Var322.F;
                    i13 = i10;
                    i14 = 0;
                    while (i14 < i13) {
                    }
                    i40Var3 = i40Var2;
                    boolean c1022 = y20Var.c();
                    y20Var2 = y20Var;
                    if (y20Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.z10 z10Var222 = b50Var.g4;
                    u20Var = b50Var.d4;
                    z10Var222.G(u20Var, z11);
                    if (u20Var.getVisibility() == 0) {
                    }
                    if (x5) {
                    }
                    if (i40Var3.getVisibility() == 0) {
                    }
                    r02 = b50Var.Q3;
                    r02.clear();
                    r02.addAll(b50Var.P3);
                    while (r82 < r02.size()) {
                    }
                    u3Var = b50Var.R2;
                    if (u3Var != null) {
                    }
                    org.telegram.messenger.u3 u3Var2222 = b50Var.R2;
                    if (u3Var2222 != null) {
                    }
                    b50Var.t5.a(z13, z10);
                    if (z13 == b50Var.z4) {
                    }
                }
            } catch (Exception e20) {
                e = e20;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i15;
                v40Var = v40Var2;
                org.telegram.messenger.f8.g(e, z11);
                v40Var.f();
                ArrayList arrayList4222 = b50Var.R2.e;
                size = arrayList4222.size();
                while (i12 < size) {
                }
                if (view != null) {
                }
                ArrayList arrayList5222 = b50Var.u2;
                arrayList5222.clear();
                arrayList5222.addAll(b50Var.R2.g);
                ArrayList arrayList6222 = b50Var.v2;
                arrayList6222.clear();
                arrayList2 = arrayList;
                arrayList6222.addAll(arrayList2);
                ArrayList arrayList7222 = b50Var.w2;
                arrayList7222.clear();
                arrayList7222.addAll(b50Var.R2.j);
                ArrayList arrayList8222 = b50Var.x2;
                arrayList8222.clear();
                arrayList8222.addAll(b50Var.R2.m);
                ArrayList arrayList9222 = b50Var.y2;
                arrayList9222.clear();
                arrayList9222.addAll(b50Var.R2.l);
                v40 v40Var3222 = v40Var;
                b50Var.z2 = v40Var3222.F;
                i13 = i10;
                i14 = 0;
                while (i14 < i13) {
                }
                i40Var3 = i40Var2;
                boolean c10222 = y20Var.c();
                y20Var2 = y20Var;
                if (y20Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.z10 z10Var2222 = b50Var.g4;
                u20Var = b50Var.d4;
                z10Var2222.G(u20Var, z11);
                if (u20Var.getVisibility() == 0) {
                }
                if (x5) {
                }
                if (i40Var3.getVisibility() == 0) {
                }
                r02 = b50Var.Q3;
                r02.clear();
                r02.addAll(b50Var.P3);
                while (r82 < r02.size()) {
                }
                u3Var = b50Var.R2;
                if (u3Var != null) {
                }
                org.telegram.messenger.u3 u3Var22222 = b50Var.R2;
                if (u3Var22222 != null) {
                }
                b50Var.t5.a(z13, z10);
                if (z13 == b50Var.z4) {
                }
            }
        } catch (Exception e21) {
            e = e21;
            i40Var2 = i40Var;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i15;
            v40Var = v40Var2;
            org.telegram.messenger.f8.g(e, z11);
            v40Var.f();
            ArrayList arrayList42222 = b50Var.R2.e;
            size = arrayList42222.size();
            while (i12 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = b50Var.u2;
            arrayList52222.clear();
            arrayList52222.addAll(b50Var.R2.g);
            ArrayList arrayList62222 = b50Var.v2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = b50Var.w2;
            arrayList72222.clear();
            arrayList72222.addAll(b50Var.R2.j);
            ArrayList arrayList82222 = b50Var.x2;
            arrayList82222.clear();
            arrayList82222.addAll(b50Var.R2.m);
            ArrayList arrayList92222 = b50Var.y2;
            arrayList92222.clear();
            arrayList92222.addAll(b50Var.R2.l);
            v40 v40Var32222 = v40Var;
            b50Var.z2 = v40Var32222.F;
            i13 = i10;
            i14 = 0;
            while (i14 < i13) {
            }
            i40Var3 = i40Var2;
            boolean c102222 = y20Var.c();
            y20Var2 = y20Var;
            if (y20Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.z10 z10Var22222 = b50Var.g4;
            u20Var = b50Var.d4;
            z10Var22222.G(u20Var, z11);
            if (u20Var.getVisibility() == 0) {
            }
            if (x5) {
            }
            if (i40Var3.getVisibility() == 0) {
            }
            r02 = b50Var.Q3;
            r02.clear();
            r02.addAll(b50Var.P3);
            while (r82 < r02.size()) {
            }
            u3Var = b50Var.R2;
            if (u3Var != null) {
            }
            org.telegram.messenger.u3 u3Var222222 = b50Var.R2;
            if (u3Var222222 != null) {
            }
            b50Var.t5.a(z13, z10);
            if (z13 == b50Var.z4) {
            }
        }
        ArrayList arrayList422222 = b50Var.R2.e;
        size = arrayList422222.size();
        for (i12 = 0; i12 < size; i12++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i12)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            b50Var.P1.h1(i11, view.getTop() - i40Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = b50Var.u2;
        arrayList522222.clear();
        arrayList522222.addAll(b50Var.R2.g);
        ArrayList arrayList622222 = b50Var.v2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = b50Var.w2;
        arrayList722222.clear();
        arrayList722222.addAll(b50Var.R2.j);
        ArrayList arrayList822222 = b50Var.x2;
        arrayList822222.clear();
        arrayList822222.addAll(b50Var.R2.m);
        ArrayList arrayList922222 = b50Var.y2;
        arrayList922222.clear();
        arrayList922222.addAll(b50Var.R2.l);
        v40 v40Var322222 = v40Var;
        b50Var.z2 = v40Var322222.F;
        i13 = i10;
        i14 = 0;
        while (i14 < i13) {
            i40 i40Var4 = i40Var2;
            View childAt2 = i40Var4.getChildAt(i14);
            if (((childAt2 instanceof org.telegram.ui.Cells.h4) || (childAt2 instanceof org.telegram.ui.Cells.a4)) && (G = i40Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) childAt2).setDrawDivider(G.b() != v40Var322222.F + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.a4) childAt2).setDrawDivider(G.b() != v40Var322222.F + (-2) ? z11 : false);
                }
            }
            i14++;
            i40Var2 = i40Var4;
        }
        i40Var3 = i40Var2;
        boolean c1022222 = y20Var.c();
        y20Var2 = y20Var;
        if (y20Var2.b && (v3Var2 = y20Var2.e) != null && !org.telegram.messenger.u3.C(v3Var2.a, v3Var2.b, b50Var.R2)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                b50Var.g1(null);
            } else if (c1022222) {
                z12 = false;
                b50Var.g1((org.telegram.messenger.v3) arrayList2.get(0));
            }
            org.telegram.ui.Components.z10 z10Var222222 = b50Var.g4;
            u20Var = b50Var.d4;
            z10Var222222.G(u20Var, z11);
            if (u20Var.getVisibility() == 0) {
                org.telegram.messenger.i0.a4(u20Var);
            }
            if (x5) {
                b50Var.f4.I(b50Var.e4, z11);
            }
            if (i40Var3.getVisibility() == 0) {
                org.telegram.messenger.i0.a4(i40Var3);
            }
            r02 = b50Var.Q3;
            r02.clear();
            r02.addAll(b50Var.P3);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.r) r02.get(r82)).j(z11);
            }
            u3Var = b50Var.R2;
            if (u3Var != null && y20Var2.b && (v3Var = y20Var2.e) != null) {
                u3Var.d.f(org.telegram.messenger.jj.C1(v3Var.a.peer));
            }
            org.telegram.messenger.u3 u3Var2222222 = b50Var.R2;
            z13 = (u3Var2222222 != null || u3Var2222222.f.isEmpty()) ? z12 : z11;
            b50Var.t5.a(z13, z10);
            if (z13 == b50Var.z4) {
                b50Var.z4 = z13;
                if (x5) {
                    b50Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.z10 z10Var2222222 = b50Var.g4;
        u20Var = b50Var.d4;
        z10Var2222222.G(u20Var, z11);
        if (u20Var.getVisibility() == 0) {
        }
        if (x5) {
        }
        if (i40Var3.getVisibility() == 0) {
        }
        r02 = b50Var.Q3;
        r02.clear();
        r02.addAll(b50Var.P3);
        while (r82 < r02.size()) {
        }
        u3Var = b50Var.R2;
        if (u3Var != null) {
            u3Var.d.f(org.telegram.messenger.jj.C1(v3Var.a.peer));
        }
        org.telegram.messenger.u3 u3Var22222222 = b50Var.R2;
        if (u3Var22222222 != null) {
        }
        b50Var.t5.a(z13, z10);
        if (z13 == b50Var.z4) {
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
    public final void Q1(boolean z10, boolean z11) {
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
        org.telegram.ui.Components.voip.b2 b2Var;
        org.telegram.ui.Components.voip.b2 b2Var2;
        org.telegram.ui.Components.voip.b2 b2Var3;
        boolean z19;
        boolean t12;
        int i13;
        org.telegram.messenger.u3 u3Var = this.R2;
        org.telegram.ui.Components.voip.b2 b2Var4 = this.q1;
        int i14 = 6;
        if (u3Var == null || u3Var.j()) {
            if (S0()) {
                i14 = 5;
            } else if (this.R2.b.schedule_start_subscribed) {
                i14 = 7;
            }
            M1(i14, z10);
            b2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.rh, false), 0.3f, false, org.telegram.messenger.cd.L0(2131752041, null), false, false);
            O1(false);
            return;
        }
        K1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
            if ((this.k2 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.k2) > 3000) && ((i13 = this.K3) == 1 || i13 == 2 || i13 == 6 || i13 == 5)) {
                T0();
                M1(3, z10);
                i10 = 4;
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.r2));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0();
                if (!((z13 && this.R2.c()) || z12) || t1()) {
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
                if (w5) {
                    z17 = z16;
                    i12 = i11;
                } else {
                    z17 = false;
                    i12 = 0;
                }
                int i15 = i12 + (!z15 ? 2 : 0) + (!z14 ? i10 : 0);
                y20 y20Var = this.R3;
                int i16 = i15 + ((y20Var == null && y20Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.f2 | 2) == (i16 | 2);
                this.f2 = i16;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.b2 b2Var5 = this.o1;
                if (z14) {
                    b2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.cd.L0(2131743515, null), !z20, z10);
                    b2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.b2 b2Var6 = this.m1;
                if (i12 != 0) {
                    b2Var6.c(0, -1, 0, 1.0f, true, org.telegram.messenger.cd.L0(2131743432, null), false, false);
                    b2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.b2 b2Var7 = this.n1;
                if (z17) {
                    b2Var = b2Var6;
                    b2Var2 = b2Var5;
                    b2Var3 = b2Var7;
                    z19 = z10;
                } else {
                    j1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i17 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.R1 != i17) {
                        this.R1 = i17;
                        org.telegram.messenger.i0.Q3(this.S1, i17);
                    }
                    b2Var2 = b2Var5;
                    b2Var = b2Var6;
                    b2Var7.c(0, -1, 0, 1.0f, true, h1(j1()), false, z10);
                    b2Var3 = b2Var7;
                    z19 = z10;
                    b2Var3.b(j1() != 1, z19);
                }
                org.telegram.ui.Components.voip.b2 b2Var8 = b2Var3;
                b2Var4.c(!t1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.rh, false), 0.3f, false, org.telegram.messenger.cd.L0(2131743390, null), false, false);
                if (z18 && z15) {
                    P1(false);
                }
                b2Var2.d(true, z19);
                b2Var.d(true, z19);
                b2Var8.d(true, z19);
                t12 = t1();
                s20 s20Var = this.W2;
                if (t12) {
                    s20Var.setVisibility(8);
                } else {
                    s20Var.setVisibility(0);
                    boolean z21 = ((Integer) s20Var.getTag()).intValue() == 3;
                    int i18 = this.K3;
                    final boolean z22 = i18 == 3;
                    s20Var.setTag(Integer.valueOf(i18));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.Y2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.X2;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i19 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.Y2 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.x10
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int S0 = org.telegram.messenger.i0.S0(floatValue, 1.0f, color, i19);
                                    b50 b50Var = b50.this;
                                    b50Var.X2.setColor(S0);
                                    b50Var.W2.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    b50Var.Z2 = floatValue;
                                    q40 q40Var = b50Var.L2;
                                    if (q40Var == null || !b50Var.q4) {
                                        return;
                                    }
                                    q40Var.invalidate();
                                }
                            });
                            this.Y2.setDuration(300L);
                            this.Y2.setInterpolator(org.telegram.ui.Components.gr.f);
                            this.Y2.addListener(new w30(this, 2));
                            this.Y2.start();
                        } else {
                            paint.setColor(this.K3 == 3 ? -1163700 : -12761513);
                            s20Var.invalidate();
                        }
                    }
                }
                if (t1() || !org.telegram.messenger.sc.e(512)) {
                }
                if (this.K3 == 3) {
                    this.q4 = true;
                    B1();
                    return;
                } else {
                    this.q4 = false;
                    org.telegram.messenger.i0.r(this.r4);
                    return;
                }
            }
        }
        if (this.s2 != null) {
            m1().k(0L, 37, this.s2, this.Q2, null, null);
            this.s2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.r2));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || S0()) {
            i10 = 4;
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                T0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                M1(0, z10);
            } else {
                M1(1, z10);
            }
        } else {
            T0();
            if (groupCallParticipant2.raise_hand_rating != j10) {
                i10 = 4;
                M1(4, z10);
            } else {
                i10 = 4;
                M1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.r2));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (w5) {
        }
        int i152 = i12 + (!z15 ? 2 : 0) + (!z14 ? i10 : 0);
        y20 y20Var2 = this.R3;
        int i162 = i152 + ((y20Var2 == null && y20Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.f2 | 2) == (i162 | 2)) {
        }
        this.f2 = i162;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.b2 b2Var52 = this.o1;
        if (z14) {
        }
        org.telegram.ui.Components.voip.b2 b2Var62 = this.m1;
        if (i12 != 0) {
        }
        org.telegram.ui.Components.voip.b2 b2Var72 = this.n1;
        if (z17) {
        }
        org.telegram.ui.Components.voip.b2 b2Var82 = b2Var3;
        b2Var4.c(!t1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.rh, false), 0.3f, false, org.telegram.messenger.cd.L0(2131743390, null), false, false);
        if (z18) {
            P1(false);
        }
        b2Var2.d(true, z19);
        b2Var.d(true, z19);
        b2Var82.d(true, z19);
        t12 = t1();
        s20 s20Var2 = this.W2;
        if (t12) {
        }
        if (t1()) {
        }
    }

    public final int R0() {
        i40 i40Var = this.H1;
        int childCount = i40Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = i40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void R1() {
        boolean z10;
        z40 z40Var;
        y30 y30Var = this.F1;
        if (y30Var == null || this.R2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.R2.P.m(); i11++) {
            long j10 = this.R2.P.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.P.f(j10);
            if (!groupCallParticipant.self) {
                y20 y20Var = this.R3;
                y20Var.getClass();
                if (y20Var.x.get(org.telegram.messenger.jj.C1(groupCallParticipant.peer)) <= 0 && this.s4.get(j10, 0) != 1) {
                    long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i10 < 2) {
                        TLRPC.User Z1 = C1 > 0 ? org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(C1)) : null;
                        TLRPC.Chat L0 = C1 <= 0 ? org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(C1)) : null;
                        if (Z1 != null || L0 != null) {
                            if (i10 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (Z1 != null) {
                                spannableStringBuilder.append(org.telegram.messenger.h20.j(Z1, true), new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0);
                            } else {
                                spannableStringBuilder.append(L0.title, new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0);
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
            String J0 = org.telegram.messenger.cd.J0(i10, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            y30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u5 subtitleTextView = y30Var.getSubtitleTextView();
        String str = t1() ? "ViewersWatching" : "Participants";
        int i12 = this.R2.b.participants_count;
        v40 v40Var = this.G1;
        subtitleTextView.k(org.telegram.messenger.cd.G(i12 + ((v40Var.M.t1() || v40Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), str, new Object[0]));
        if (t1() && (z40Var = this.s3) != null) {
            z40Var.setWatchersCount(this.R2.b.participants_count);
        }
        if (z10 != this.l4) {
            this.l4 = z10;
            y30Var.invalidate();
            y30Var.getSubtitleTextView().setPivotX(0.0f);
            y30Var.getSubtitleTextView().setPivotY(y30Var.getMeasuredHeight() >> 1);
            y30Var.getSubtitleTextView().animate().scaleX(this.l4 ? 0.98f : 1.0f).scaleY(this.l4 ? 0.9f : 1.0f).alpha(this.l4 ? 0.0f : 1.0f).setDuration(150L);
            org.telegram.messenger.i0.W3(y30Var.getAdditionalSubtitleTextView(), this.l4);
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return org.telegram.messenger.w3.w(14, this.Q2);
        }
        org.telegram.messenger.u3 u3Var = this.R2;
        return (u3Var == null || (groupCall = u3Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void S1(boolean z10) {
        org.telegram.messenger.u3 u3Var = this.R2;
        q20 q20Var = this.V2;
        if (u3Var == null) {
            if (org.telegram.messenger.w3.W(this.Q2)) {
                q20Var.b(org.telegram.messenger.cd.L0(2131743488, null), z10);
                return;
            } else {
                q20Var.b(org.telegram.messenger.cd.L0(2131743367, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(u3Var.b.title);
        y30 y30Var = this.F1;
        if (isEmpty) {
            TLRPC.Chat chat = this.Q2;
            if (chat != null && !chat.title.equals(y30Var.getTitle())) {
                if (z10) {
                    this.F1.K(this.Q2.title, true, 180L, null);
                    y30Var.getTitleTextView().setOnClickListener(new r10(this, 9));
                } else {
                    y30Var.setTitle(this.Q2.title);
                }
                if (!org.telegram.messenger.w3.W(this.Q2)) {
                    q20Var.b(org.telegram.messenger.cd.L0(2131743332, null), z10);
                } else if (t1()) {
                    q20Var.b(this.Q2.title, z10);
                } else {
                    q20Var.b(org.telegram.messenger.cd.L0(2131743473, null), z10);
                }
            } else if (this.Q2 == null) {
                y30Var.setTitle(org.telegram.messenger.cd.L0(2131751823, null));
                q20Var.b(org.telegram.messenger.cd.L0(2131751823, null), z10);
            }
        } else if (!this.R2.b.title.equals(y30Var.getTitle())) {
            if (z10) {
                this.F1.K(this.R2.b.title, true, 180L, null);
                y30Var.getTitleTextView().setOnClickListener(new r10(this, 8));
            } else {
                y30Var.setTitle(this.R2.b.title);
            }
            q20Var.b(this.R2.b.title, z10);
        }
        org.telegram.ui.ActionBar.u5 titleTextView = y30Var.getTitleTextView();
        if (!this.R2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                q20Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                q20Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new x40(titleTextView));
            TextView textView = q20Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new x40(textView), (Drawable) null);
            TextView nextTextView = q20Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new x40(nextTextView), (Drawable) null);
        }
    }

    public final void T0() {
        if (this.I3) {
            this.I3 = false;
            org.telegram.messenger.i0.r(this.p4);
        }
        if (this.J3) {
            this.J3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.s1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1() {
        float f7;
        org.telegram.ui.Components.bb bbVar;
        if (this.E == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(74.0f);
        float f10 = this.p2 - L;
        if (this.s0 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.s0) / ((L - this.s0) - org.telegram.messenger.i0.L(14.0f)));
            f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r0) * f7);
        } else {
            f7 = 0.0f;
        }
        this.E.setTranslationY(org.telegram.messenger.i0.T1(((-r0.getTop()) - this.E.getHeight()) + f10 + this.b.getPaddingTop() + org.telegram.messenger.i0.L(10.0f), this.F1.getY() + (-this.E.getTop()) + r4.getHeight(), f7));
        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
        if (wbVar == null || (bbVar = wbVar.e) == null || bbVar.getParent() == null || bbVar.getParent().getParent() != this.E) {
            return;
        }
        bbVar.setTop(f7 > 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z10;
        if (!this.T4) {
            d30 d30Var = this.S3;
            if (d30Var.getVisibility() == 0 && d30Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.c4 == z10) {
                    this.c4 = z10;
                    this.l1.invalidate();
                    this.b.invalidate();
                    this.H1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.c4 == z10) {
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        return new ArrayList();
    }

    public final void V0() {
        this.w1.setTranslationY((-this.t3.d()) + this.b.getPaddingBottom());
        this.x1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.l1.setAlpha(1.0f - this.q5.e);
        W0();
        X0();
    }

    public final void W0() {
        float f7 = this.t3.b.a;
        int i10 = f7 > 0.0f ? 0 : 8;
        j30 j30Var = this.w1;
        j30Var.setAlpha(f7);
        i30 i30Var = this.x1;
        i30Var.setAlpha(f7);
        if (j30Var.getVisibility() != i10) {
            j30Var.setVisibility(i10);
            i30Var.setVisibility(i10);
            if (i10 == 8) {
                g30 g30Var = this.y1;
                if (g30Var.isFocused()) {
                    g30Var.clearFocus();
                }
            }
        }
    }

    public final void X0() {
        org.telegram.ui.Components.mj0 mj0Var = this.B1;
        if (mj0Var != null) {
            float f7 = this.t3.b.a * this.r5.e;
            mj0Var.setAlpha(f7);
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.B1.getVisibility() != i10) {
                this.B1.setVisibility(i10);
                if (i10 == 8) {
                    this.B1.n();
                }
            }
            org.telegram.ui.Components.mj0 mj0Var2 = this.B1;
            if (mj0Var2.N0 || f7 != 1.0f) {
                return;
            }
            mj0Var2.N0 = true;
        }
    }

    public final void Y0() {
        boolean z10 = x5;
        l20 l20Var = this.l1;
        if (z10) {
            l20Var.setTranslationX(0.0f);
            l20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = w5;
        fe.b bVar = this.q5;
        if (z11) {
            l20Var.setTranslationX(bVar.e * org.telegram.messenger.i0.L(94.0f));
            l20Var.setTranslationY(0.0f);
        } else {
            l20Var.setTranslationX(0.0f);
            l20Var.setTranslationY(bVar.e * org.telegram.messenger.i0.L(94.0f));
        }
    }

    public final void Z0() {
        boolean z10 = x5;
        u20 u20Var = this.d4;
        if (z10) {
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = w5;
        fe.b bVar = this.q5;
        if (z11) {
            u20Var.setTranslationX(bVar.e * org.telegram.messenger.i0.L(94.0f));
            u20Var.setTranslationY(0.0f);
        } else {
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(bVar.e * org.telegram.messenger.i0.L(94.0f));
        }
    }

    public final void a1() {
        float f7 = this.s5.f;
        hh.i iVar = this.t3;
        float T1 = org.telegram.messenger.i0.T1(x5 ? (1.0f - this.t5.e) * org.telegram.messenger.i0.L(-91.0f) : w5 ? 0.0f : ((this.q5.e * org.telegram.messenger.i0.L(94.0f)) - (org.telegram.messenger.i0.L(104.0f) * this.R3.c)) - org.telegram.messenger.i0.L(91.0f), -((iVar.d() - this.b.getPaddingBottom()) + f7 + (org.telegram.messenger.i0.L(68.0f) * this.r5.e) + org.telegram.messenger.i0.L(10.0f)), iVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.p2) + T1) - this.s0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.i0.L(250.0f));
        dh.k kVar = this.T1;
        kVar.setTranslationY(T1);
        kVar.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.B1 != null) {
            this.B1.setTranslationY((-this.t3.d()) + this.b.getPaddingBottom() + ((-this.r5.e) * org.telegram.messenger.i0.L(64.0f)));
        }
    }

    public final void c1() {
        float f7 = this.r5.e;
        float T1 = org.telegram.messenger.i0.T1(0.25f, 1.0f, f7);
        ImageView imageView = this.A1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        imageView.setClickable(f7 > 0.9f);
        float f10 = 1.0f - f7;
        float T12 = org.telegram.messenger.i0.T1(0.25f, 1.0f, f10);
        ImageView imageView2 = this.z1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.i0.T1(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        imageView2.setClickable(f10 > 0.9f);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.r rVar = this.Q4;
        if (rVar != null) {
            rVar.a.setRoundCorners(org.telegram.messenger.i0.L(8.0f));
            org.telegram.ui.Components.voip.r rVar2 = this.Q4;
            rVar2.h = false;
            rVar2.j(false);
            this.Q4.invalidate();
            this.R3.invalidate();
        }
        org.telegram.ui.Cells.h4 h4Var = this.O4;
        if (h4Var != null && !this.S4 && h4Var.getParent() != null) {
            this.b.removeView(this.O4);
        }
        org.telegram.ui.Cells.h4 h4Var2 = this.O4;
        if (h4Var2 != null) {
            h4Var2.setProgressToAvatarPreview(0.0f);
            this.O4.setAboutVisible(false);
            this.O4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.y10 y10Var = this.R4;
        if (y10Var != null) {
            y10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.O4 = null;
        this.P4 = null;
        this.R4 = null;
        this.Q4 = null;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String L0;
        org.telegram.messenger.v3 v3Var;
        VoIPService sharedInstance;
        int i12;
        int i13;
        int i14 = org.telegram.messenger.zs.w2;
        i40 i40Var = this.H1;
        String[] strArr = null;
        int i15 = 0;
        int i16 = 1;
        if (i10 == i14) {
            Long l4 = (Long) objArr[1];
            org.telegram.messenger.u3 u3Var = this.R2;
            if (u3Var == null || u3Var.b.id != l4.longValue()) {
                return;
            }
            org.telegram.messenger.u3 u3Var2 = this.R2;
            if (u3Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.k2;
            int i17 = 2;
            org.telegram.messenger.c cVar = this.k1;
            if (j10 == 0 && (((i13 = this.w3) == 7 || i13 == 5 || i13 == 6) && !u3Var2.j())) {
                try {
                    Intent intent = new Intent(this.Z1, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", k1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.S2);
                    intent.putExtra("peerChannelId", this.P2.channel_id);
                    intent.putExtra("peerChatId", this.P2.chat_id);
                    intent.putExtra("peerUserId", this.P2.user_id);
                    intent.putExtra("hash", this.T2);
                    intent.putExtra("peerAccessHash", this.P2.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", cVar.a);
                    intent.putExtra("scheduleDate", this.b4);
                    this.Z1.startService(intent);
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
                this.k2 = SystemClock.elapsedRealtime();
                org.telegram.messenger.i0.h3(new t10(this, i17), 3000L);
            }
            if (!this.l2 && VoIPService.getSharedInstance() != null) {
                this.R2.b(false);
                n1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            L1();
            int childCount = i40Var.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt = i40Var.getChildAt(i18);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) childAt).a(true, false);
                }
            }
            if (this.O4 != null) {
                this.j2 = true;
            } else {
                Q0(true);
            }
            R1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.w3 == 4;
            Q1(true, booleanValue);
            S1(true);
            if (z10 && ((i12 = this.w3) == 1 || i12 == 0)) {
                m1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l10 = (Long) objArr[3];
                long longValue = l10.longValue();
                if (longValue == 0 || t1()) {
                    return;
                }
                if (q1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList arrayList = org.telegram.messenger.vp.r1(cVar.a).y;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size) {
                                break;
                            }
                            Object obj = arrayList.get(i19);
                            i19++;
                            if (((TLRPC.Dialog) obj).id == longValue) {
                                i15 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (org.telegram.messenger.o5.E(longValue)) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(cVar.a).Z1(l10);
                    if (Z1 != null) {
                        if (this.R2.b.participants_count < 250 || org.telegram.messenger.h20.w(Z1) || Z1.verified || i15 != 0) {
                            m1().k(0L, 44, Z1, this.Q2, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(cVar.a).L0(Long.valueOf(-longValue));
                if (L02 != null) {
                    if (this.R2.b.participants_count < 250 || !org.telegram.messenger.w3.r0(L02) || L02.verified || i15 != 0) {
                        m1().k(0L, 44, L02, this.Q2, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.y2) {
            y20 y20Var = this.R3;
            if (y20Var.b && this.R2 != null) {
                boolean c10 = y20Var.c();
                org.telegram.messenger.u3 u3Var3 = this.R2;
                if (u3Var3 != null && y20Var.b && (v3Var = y20Var.e) != null && u3Var3.d.f(org.telegram.messenger.jj.C1(v3Var.a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.v3 v3Var2 = null;
                    int i20 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.h2;
                        if (i20 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.v3 v3Var3 = (org.telegram.messenger.v3) arrayList2.get(i20);
                        if (this.R2.P.g(null, org.telegram.messenger.jj.C1(v3Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = v3Var3.a;
                            if (!groupCallParticipant3.muted_by_you && y20Var.d != org.telegram.messenger.jj.C1(groupCallParticipant3.peer)) {
                                v3Var2 = v3Var3;
                            }
                        }
                        i20++;
                    }
                    if (v3Var2 != null) {
                        g1(v3Var2);
                    }
                }
            }
            y20Var.setVisibleParticipant(true);
            R1();
            return;
        }
        if (i10 == org.telegram.messenger.zs.N4) {
            E1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i10 == org.telegram.messenger.zs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    L0 = org.telegram.messenger.w3.W(this.Q2) ? org.telegram.messenger.cd.L0(2131743478, null) : org.telegram.messenger.cd.L0(2131743345, null);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    L0 = org.telegram.messenger.w3.W(this.Q2) ? org.telegram.messenger.cd.L0(2131743504, null) : org.telegram.messenger.cd.L0(2131743396, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131751106, null) + "\n" + str;
                }
                AlertDialog$Builder M = org.telegram.ui.Components.s4.M(getContext(), org.telegram.messenger.cd.L0(2131743332, null), L0);
                M.j(new w10(this, i16));
                try {
                    M.p();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == k1()) {
                L1();
                Q1(isShowing(), false);
            }
            long C1 = org.telegram.messenger.jj.C1(this.r2);
            org.telegram.messenger.u3 u3Var4 = this.R2;
            if (u3Var4 == null || chatFull.id != (-C1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) u3Var4.d.f(C1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            Q0(true);
            org.telegram.messenger.i0.a4(i40Var);
            if (this.v4 != null) {
                while (i15 < this.v4.getChildCount()) {
                    View childAt2 = this.v4.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.b1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.b1) childAt2).j(org.telegram.messenger.cd.L0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743532 : 2131743442, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.u1) {
            if (((Long) objArr[0]).longValue() == k1()) {
                L1();
                Q1(isShowing(), false);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.B2) {
            int childCount2 = i40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                s4.c1 G = i40Var.G(i40Var.getChildAt(i15));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        if (h4Var.getParticipant() != null) {
                            h4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i15++;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.E0) {
            Long l11 = (Long) objArr[0];
            long C12 = org.telegram.messenger.jj.C1(this.r2);
            if (this.R2 == null || C12 != l11.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(C12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            Q0(true);
            org.telegram.messenger.i0.a4(i40Var);
            if (this.v4 != null) {
                while (i15 < this.v4.getChildCount()) {
                    View childAt3 = this.v4.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.b1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.b1) childAt3).j(org.telegram.messenger.cd.L0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743533 : 2131743443, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.j0) {
            Q0(true);
            org.telegram.messenger.i0.a4(i40Var);
            return;
        }
        if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i21 = org.telegram.messenger.vp.D8;
            int i22 = intValue & 16;
            if (i22 != 0) {
                Q0(true);
            }
            if (i22 == 0 && (intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            org.telegram.messenger.i0.a4(i40Var);
            return;
        }
        if (i10 == org.telegram.messenger.zs.z2) {
            s30 s30Var = this.q2;
            if (s30Var != null) {
                s30Var.b(true, true);
            }
            L1();
            return;
        }
        if (i10 == org.telegram.messenger.zs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.g2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        LaunchActivity launchActivity = this.Z1;
        launchActivity.b1.remove(this.m4);
        this.Z1.setRequestedOrientation(-1);
        v5 = false;
        org.telegram.ui.Components.z20 z20Var = this.v3;
        if (z20Var != null) {
            z20Var.dismiss();
        }
        this.j2 = true;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.k1;
        int i10 = cVar.a;
        int i11 = cVar.a;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.M0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.w2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.u1);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.B2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.E0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.j0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.z2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.y2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.R3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.N4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D2);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.Z1 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.Z1.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                m1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z10) {
        if (this.T4 || !this.W3) {
            return;
        }
        if (z10) {
            this.T4 = true;
            A1(false, this.O4);
            return;
        }
        d1();
        this.b.removeView(this.V3);
        this.V3 = null;
        this.t4.setVisibility(8);
        this.b.invalidate();
        this.W3 = false;
        this.P1.X = true;
        this.H1.invalidate();
        this.S3.setVisibility(8);
        if (this.j2) {
            this.j2 = false;
            Q0(true);
        }
        U0();
    }

    public final void g1(org.telegram.messenger.v3 v3Var) {
        org.telegram.messenger.v3 v3Var2;
        if (v3Var == null) {
            this.Z1.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            y20 y20Var = this.R3;
            if (y20Var.r != null) {
                return;
            }
            boolean z10 = x5;
            i40 i40Var = this.H1;
            int i10 = 0;
            if (!z10) {
                if (this.h4 != null) {
                    i40Var.getViewTreeObserver().removeOnPreDrawListener(this.h4);
                    this.h4 = null;
                }
                if (v3Var == null) {
                    if (i40Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = i40Var.getViewTreeObserver();
                        v30 v30Var = new v30(this, 1);
                        this.h4 = v30Var;
                        viewTreeObserver.addOnPreDrawListener(v30Var);
                        return;
                    }
                    i40Var.setVisibility(0);
                    Q0(false);
                    this.j2 = true;
                    ViewTreeObserver viewTreeObserver2 = i40Var.getViewTreeObserver();
                    v30 v30Var2 = new v30(this, 0);
                    this.h4 = v30Var2;
                    viewTreeObserver2.addOnPreDrawListener(v30Var2);
                    return;
                }
                u20 u20Var = this.d4;
                if (u20Var.getVisibility() == 0) {
                    y20Var.j(v3Var);
                    org.telegram.messenger.i0.a4(u20Var);
                    return;
                }
                u20Var.setVisibility(0);
                org.telegram.ui.Components.z10 z10Var = this.g4;
                z10Var.G(u20Var, false);
                this.j2 = true;
                if (!y20Var.b) {
                    ArrayList arrayList = z10Var.e;
                    s4.a0 a0Var = (s4.a0) u20Var.getLayoutManager();
                    if (a0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.v3) arrayList.get(i10)).equals(v3Var)) {
                                a0Var.h1(i10, org.telegram.messenger.i0.L(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = i40Var.getViewTreeObserver();
                mh.f fVar = new mh.f(2, this, v3Var);
                this.h4 = fVar;
                viewTreeObserver3.addOnPreDrawListener(fVar);
                return;
            }
            if (this.h4 != null) {
                i40Var.getViewTreeObserver().removeOnPreDrawListener(this.h4);
                this.h4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            e50 e50Var = this.f4;
            ArrayList arrayList3 = this.P3;
            ArrayList arrayList4 = this.Q3;
            if (v3Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.k kVar = rVar.c;
                    if (kVar != null) {
                        kVar.setRenderer(null);
                        org.telegram.ui.Components.y10 y10Var = rVar.d;
                        if (y10Var != null) {
                            y10Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.k kVar2 = rVar.e;
                        if (kVar2 != null) {
                            kVar2.setRenderer(null);
                        }
                        arrayList2.add(rVar.x);
                        rVar.b(false);
                        rVar.animate().alpha(0.0f).setListener(new t30(this, rVar, 0));
                    }
                }
                this.G4 = false;
                e50Var.H(this.e4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) arrayList4.get(i12);
                    if (rVar2.e != null && ((v3Var2 = rVar2.x) == null || !v3Var2.equals(v3Var))) {
                        arrayList2.add(rVar2.x);
                        rVar2.b(false);
                        org.telegram.ui.Components.y10 y10Var2 = rVar2.d;
                        if (y10Var2 != null) {
                            y10Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.k kVar3 = rVar2.c;
                        if (kVar3 != null) {
                            kVar3.setRenderer(null);
                        }
                        rVar2.animate().alpha(0.0f).setListener(new t30(this, rVar2, 1));
                    }
                }
                this.G4 = true;
                e50Var.r = false;
                if (!arrayList2.isEmpty()) {
                    org.telegram.messenger.i0.g3(new xs(21, this, arrayList2));
                }
            }
            boolean z11 = !y20Var.b;
            ViewTreeObserver viewTreeObserver4 = i40Var.getViewTreeObserver();
            gi giVar = new gi(this, v3Var, z11);
            this.h4 = giVar;
            viewTreeObserver4.addOnPreDrawListener(giVar);
        }
    }

    public final int j1() {
        Integer num = this.p5;
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

    public final long k1() {
        TLRPC.Chat chat = this.Q2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void l1(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.k1;
        int i10 = cVar.a;
        int i11 = cVar.a;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(k1()));
        if (L0 != null && !org.telegram.messenger.w3.t0(L0)) {
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i11).M0(k1());
            String K = org.telegram.messenger.w3.K(this.Q2, false);
            String o10 = !TextUtils.isEmpty(K) ? a1.g.o(org.telegram.messenger.vp.r1(i11).U2, "/", K, new StringBuilder()) : (M0 == null || (tL_chatInviteExported = M0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(o10)) {
                w1(null, o10, true, z10);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = org.telegram.messenger.vp.k1(this.Q2);
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_exportChatInvite, new wd(this, M0, z10, 3));
            return;
        }
        if (this.R2 == null) {
            return;
        }
        int i12 = 0;
        while (i12 < 2) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            org.telegram.messenger.u3 u3Var = this.R2;
            exportgroupcallinvite.call = u3Var.g(u3Var.a);
            exportgroupcallinvite.can_self_unmute = i12 == 1;
            ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new org.telegram.messenger.yc(this, i12, z10, 2));
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean m0() {
        v5 = true;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.F2, new Object[0]);
        org.telegram.ui.Components.g20.j(getContext());
        return false;
    }

    public final UndoView m1() {
        if (!x5) {
            y20 y20Var = this.R3;
            if (y20Var.b) {
                return y20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.a2;
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

    public final void n1() {
        VoIPService sharedInstance;
        if (this.l2 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.l2 = true;
        this.u2.addAll(this.R2.g);
        this.v2.addAll(this.h2);
        this.w2.addAll(this.R2.j);
        this.x2.addAll(this.R2.m);
        this.y2.addAll(this.R2.l);
        this.K3 = sharedInstance.getCallState();
        if (this.R2 == null) {
            org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
            this.R2 = u3Var;
            this.g4.c = u3Var;
            this.R3.setGroupCall(u3Var);
            this.f4.c = this.R2;
        }
        int i10 = 0;
        dh.k kVar = this.T1;
        if (kVar != null) {
            kVar.D0(this.k1.a, this.R2.g(false));
        }
        this.F1.setTitleRightMargin(org.telegram.messenger.i0.L(48.0f) * 2);
        ArrayList arrayList = this.R2.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i11)).lastActiveDate = r7.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        h40 h40Var = this.M1;
        if (h40Var == null || h40Var.getVisibility() != 0) {
            return;
        }
        this.q1.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.rh, false), 0.3f, false, org.telegram.messenger.cd.L0(2131743390, null), false, true);
        P1(true);
        this.n3.setText(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.W(this.Q2) ? 2131743507 : 2131743406, null));
        i40 i40Var = this.H1;
        i40Var.setVisibility(0);
        org.telegram.ui.ActionBar.t0 t0Var = this.c3;
        t0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i40Var, (Property<i40, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i40Var, (Property<i40, Float>) View.TRANSLATION_Y, org.telegram.messenger.i0.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.u5 u5Var = this.L1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.N1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(u5Var2, (Property<org.telegram.ui.ActionBar.u5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(u5Var2, (Property<org.telegram.ui.ActionBar.u5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(u5Var2, (Property<org.telegram.ui.ActionBar.u5, Float>) property, 0.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.gr.g);
        animatorSet.addListener(new w30(this, i10));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void o1(final long j10, final boolean z10) {
        if (this.R2 != null) {
            org.telegram.messenger.c cVar = this.k1;
            final TLRPC.User Z1 = org.telegram.messenger.vp.r1(cVar.a).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                final org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.u3 u3Var = this.R2;
                invitetogroupcall.call = u3Var.g(u3Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = Z1.id;
                tL_inputUser.access_hash = Z1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.a).sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.d20
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        b50 b50Var = b50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                        if (tLObject == null) {
                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.hf(b50Var, x1VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        org.telegram.messenger.vp.r1(b50Var.k1.a).L3((TLRPC.Updates) tLObject, false);
                        org.telegram.messenger.i0.g3(new ag.a3(b50Var, j11, x1VarArr2, Z1, 8));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.Components.ji0(this, x1VarArr, sendRequest, 17), 500L);
                }
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        P1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            E1(0.0f);
        }
        i40 i40Var = this.H1;
        if (i40Var.getVisibility() == 0) {
            org.telegram.messenger.i0.a4(i40Var);
        }
        u20 u20Var = this.d4;
        if (u20Var.getVisibility() == 0) {
            org.telegram.messenger.i0.a4(u20Var);
        }
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        s30 s30Var = this.q2;
        if (s30Var != null) {
            s30Var.b(false, false);
            return;
        }
        if (this.W3) {
            f1(true);
        } else if (this.R3.b) {
            g1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
        }
        s30 s30Var = this.q2;
        if (s30Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        s30Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.Z1;
        launchActivity.b1.add(this.m4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        this.K3 = i10;
        Q1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public final boolean p1() {
        int L = org.telegram.messenger.i0.L(74.0f);
        float f7 = this.p2 - L;
        return (((((float) this.s0) + f7) > ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 1 : ((((float) this.s0) + f7) == ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - f7) - ((float) this.s0)) / ((float) ((L - this.s0) - org.telegram.messenger.i0.L(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean q1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.V1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ch, false));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.b3;
            if (t0Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Vg;
                t0Var.O(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.x0(null, i10, false), true);
                t0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false);
            H1(this.o3, x02);
            H1(this.p3, x02);
            H1(this.g3, x02);
            H1(this.h3, x02);
            H1(this.n3, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.jh, false));
            H1(this.e3, x02);
            H1(this.f3, x02);
            H1(this.i3, x02);
            H1(this.j3, x02);
            H1(this.k3, x02);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final boolean s1() {
        return t1() && !this.R2.f.isEmpty() && (((org.telegram.messenger.v3) this.R2.f.get(0)).c == 0.0f || ((org.telegram.messenger.v3) this.R2.f.get(0)).c >= 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.s0.d0.V) {
            org.telegram.ui.Components.voip.s0.b();
        }
    }

    public final boolean t1() {
        org.telegram.messenger.u3 u3Var = this.R2;
        return u3Var != null && u3Var.b.rtmp_stream;
    }

    public final void u1(org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.x1 x1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.n2) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
        if (k2Var instanceof un) {
            boolean fa2 = ((un) k2Var).fa();
            this.n2 = true;
            this.o2 = true;
            org.telegram.messenger.i0.h3(new kp(z2Var, editTextBoldCursor, z10, x1Var, 5), fa2 ? 200L : 0L);
            return;
        }
        this.n2 = true;
        this.o2 = true;
        if (z2Var != null) {
            z2Var.A0(true);
        } else if (x1Var != null) {
            x1Var.l(true);
        }
        if (z10) {
            org.telegram.messenger.i0.h3(new bh(editTextBoldCursor, 2), 100L);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 2) {
            a1();
            Y0();
            Z0();
            float f11 = 1.0f - this.q5.e;
            l20 l20Var = this.l1;
            l20Var.setAlpha(f11);
            this.R3.setProgressToHideUi(f7);
            this.d4.invalidate();
            this.b.invalidate();
            l20Var.invalidate();
        }
        if (i10 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.b.invalidate();
        }
        if (i10 == 4) {
            a1();
            this.x1.invalidate();
            this.y1.invalidate();
        }
        if (i10 == 5) {
            a1();
            this.b.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1(String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        String str3;
        String str4;
        String str5;
        if (t1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            org.telegram.messenger.i0.g(str);
            if (org.telegram.messenger.i0.H3()) {
                m1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.Z1;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) launchActivity.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
            if (k2Var instanceof un) {
                z12 = ((un) k2Var).fa();
                this.o2 = true;
                this.n2 = true;
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
                    str5 = org.telegram.messenger.w3.W(this.Q2) ? org.telegram.messenger.cd.a0("VoipChannelInviteText", null, 2131743506, str4) : org.telegram.messenger.cd.a0("VoipGroupInviteText", null, 2131743398, str4);
                }
                x30 x30Var = new x30(this, getContext(), str5, str3, str4, str3);
                this.i2 = x30Var;
                x30Var.k2 = new e(this, 17);
                x30Var.setOnDismissListener(new w10(this, 3));
                org.telegram.messenger.i0.h3(new t10(this, 7), !z12 ? 200L : 0L);
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
        x30 x30Var2 = new x30(this, getContext(), str5, str3, str4, str3);
        this.i2 = x30Var2;
        x30Var2.k2 = new e(this, 17);
        x30Var2.setOnDismissListener(new w10(this, 3));
        org.telegram.messenger.i0.h3(new t10(this, 7), !z12 ? 200L : 0L);
    }

    public final void x1() {
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var == null || u3Var.b == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
        x1Var.r(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.R2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new aa(this, x1Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean[], java.lang.String, org.telegram.ui.ActionBar.p6, org.telegram.ui.ActionBar.u1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.String, org.telegram.ui.ActionBar.p6] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public final void z1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        String str;
        ?? r14;
        TextView textView;
        int i11;
        String str2;
        String str3;
        ?? r142;
        int i12;
        String str4;
        int i13;
        EditText editText;
        String str5;
        float f7;
        String L0;
        boolean z10;
        FrameLayout frameLayout;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        org.telegram.messenger.c cVar = this.k1;
        TLObject Z1 = j10 > 0 ? org.telegram.messenger.vp.r1(cVar.a).Z1(Long.valueOf(j10)) : org.telegram.messenger.vp.r1(cVar.a).L0(Long.valueOf(-j10));
        int i14 = 5;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            if (i10 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(Z1, Boolean.TRUE, null, null, null, null);
                m1().k(0L, 30, Z1, null, null, null);
                return;
            }
            ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i15 = org.telegram.ui.ActionBar.t6.dh;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.I = i15;
            TextView textView2 = new TextView(getContext());
            int i16 = org.telegram.ui.ActionBar.t6.Vg;
            org.telegram.ui.ActionBar.a7.V(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
            ?? frameLayout2 = new FrameLayout(getContext());
            alertDialog$Builder.o(frameLayout2);
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.u(org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
            frameLayout2.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            r8Var.p(Z1);
            boolean z11 = Z1 instanceof TLRPC.User;
            if (z11) {
                TLRPC.User user = (TLRPC.User) Z1;
                g9Var.e(user, r8Var);
                str = org.telegram.messenger.h20.j(user, true);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) Z1;
                g9Var.e(chat, r8Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            org.telegram.messenger.m5.m(textView3, i16, null, 1, 20.0f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.Q2;
            String str6 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(org.telegram.messenger.cd.L0(2131743428, null));
                org.telegram.messenger.m5.q(null, null, 2131743429, new Object[]{str, str6}, textView2);
            } else if (q1()) {
                textView3.setText(org.telegram.messenger.cd.L0(2131743447, null));
                org.telegram.messenger.m5.q(null, null, 2131743448, new Object[]{str}, textView2);
            } else {
                textView3.setText(org.telegram.messenger.cd.L0(2131743371, null));
                if (org.telegram.messenger.w3.W(this.Q2)) {
                    org.telegram.messenger.m5.q(null, null, 2131743490, new Object[]{str, str6}, textView2);
                } else {
                    org.telegram.messenger.m5.q(null, null, 2131743372, new Object[]{str, str6}, textView2);
                }
            }
            boolean z12 = org.telegram.messenger.cd.X;
            frameLayout2.addView(textView3, w7.b6.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 76, 11.0f, z12 ? 76 : 21, 0.0f));
            frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                r14 = 0;
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743337, null), new rv(6, this, Z1));
            } else {
                r14 = 0;
                r14 = 0;
                if (z11) {
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743430, null), new org.telegram.messenger.voip.d0(this, (TLRPC.User) Z1, j10, 3));
                }
            }
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r14), r14);
            x1Var.j(org.telegram.ui.ActionBar.t6.x0(r14, org.telegram.ui.ActionBar.t6.ih, false));
            x1Var.show();
            if (i10 != 2 || (textView = (TextView) x1Var.d(-1)) == null) {
                return;
            }
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.jh, r14);
            return;
        }
        if (i10 == 6) {
            this.Z1.O0(this.a);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.Z1.t0(new un(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.Z1.O0(this.a);
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
            if ((k2Var instanceof un) && ((un) k2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.Z1.t0(new un(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(Z1, Boolean.TRUE, null, null, Boolean.FALSE, null);
            M1(2, true);
            return;
        }
        int i17 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.b40 b40Var = this.Y3;
            if (b40Var == null || !b40Var.g()) {
                TLRPC.User f10 = org.telegram.messenger.d20.i(cVar.a).f();
                org.telegram.ui.Components.b40 b40Var2 = new org.telegram.ui.Components.b40(0, true, true);
                this.Y3 = b40Var2;
                b40Var2.H = true;
                b40Var2.R = true;
                b40Var2.G = true;
                b40Var2.J = true;
                b40Var2.S = true;
                b40Var2.a = this.Z1.M().getLastFragment();
                org.telegram.ui.Components.b40 b40Var3 = this.Y3;
                j40 j40Var = new j40(this, j10);
                this.Z3 = j40Var;
                b40Var3.b = j40Var;
                TLRPC.UserProfilePhoto userProfilePhoto = f10.photo;
                b40Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new t10(this, i17), new jg.z(i14), 0);
                return;
            }
            return;
        }
        if (i10 == 10) {
            String str7 = groupCallParticipant.about;
            Context context = getContext();
            int i18 = this.a;
            Pattern pattern = org.telegram.ui.Components.s4.a;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
            if (j10 > 0) {
                str5 = null;
                f7 = 8.0f;
                L0 = org.telegram.messenger.cd.L0(2131743791, null);
            } else {
                str5 = null;
                f7 = 8.0f;
                L0 = org.telegram.messenger.cd.L0(2131751460, null);
            }
            String str8 = L0;
            final org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.R = str8;
            x1Var2.T = org.telegram.messenger.cd.L0(j10 > 0 ? 2131743422 : 2131751463, str5);
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setClipChildren(false);
            if (j10 < 0) {
                frameLayout = frameLayout3;
                long j11 = -j10;
                z10 = false;
                if (org.telegram.messenger.vp.r1(i18).M0(j11) == null) {
                    org.telegram.messenger.vp.r1(i18).T2(ConnectionsManager.generateClassGuid(), j11, true);
                    z10 = false;
                }
            } else {
                z10 = 0;
                frameLayout = frameLayout3;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i19 = org.telegram.ui.ActionBar.t6.Vg;
            org.telegram.ui.ActionBar.a7.V(editText2, i19, null);
            editText2.setHint(j10 > 0 ? org.telegram.messenger.cd.L0(2131743791, null) : org.telegram.messenger.cd.L0(2131751460, null));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.t6.U(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i20 = j10 > 0 ? 70 : org.telegram.messenger.zs.e4;
            org.telegram.ui.Components.k3 k3Var = new org.telegram.ui.Components.k3(i20, context, numberTextView);
            InputFilter[] inputFilterArr = new InputFilter[1];
            inputFilterArr[z10] = k3Var;
            editText2.setFilters(inputFilterArr);
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, z10));
            numberTextView.setImportantForAccessibility(2);
            ViewGroup viewGroup = frameLayout;
            viewGroup.addView(numberTextView, w7.b6.d(20, 20.0f, org.telegram.messenger.cd.X ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(24.0f) : 0, org.telegram.messenger.i0.L(f7), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(f7));
            editText2.addTextChangedListener(new org.telegram.ui.Components.zp(i20, numberTextView));
            org.telegram.messenger.i0.Y3(numberTextView, false, 0.0f, true, false);
            editText2.setText(str7);
            editText2.setSelection(editText2.getText().toString().length());
            alertDialog$Builder2.o(viewGroup);
            final j2.d dVar = new j2.d(j10, i18, editText2, 4);
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131745963, null), dVar);
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var2.N = new org.telegram.ui.Components.i1(editText2, 1);
            viewGroup.addView(editText2, w7.b6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            org.telegram.messenger.i0.J3(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.o1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i21, KeyEvent keyEvent) {
                    if (i21 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
                        if (x1Var3.isShowing()) {
                            dVar.h(x1Var3, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            x1Var2.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ih, false));
            x1Var2.show();
            x1Var2.p(org.telegram.ui.ActionBar.t6.x0(null, i19, false));
            return;
        }
        if (i10 != 11) {
            if (i10 == 5) {
                sharedInstance.editCallMember(Z1, Boolean.TRUE, null, null, null, null);
                m1().m(0L, Z1, 35);
                sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                return;
            }
            if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                i11 = 1;
                sharedInstance.editCallMember(Z1, Boolean.FALSE, null, null, null, null);
            } else {
                groupCallParticipant.volume = 10000;
                groupCallParticipant.volume_by_admin = false;
                i11 = 1;
                sharedInstance.editCallMember(Z1, Boolean.FALSE, null, 10000, null, null);
            }
            sharedInstance.setParticipantVolume(groupCallParticipant, org.telegram.messenger.w3.H(groupCallParticipant));
            m1().k(0L, i10 == i11 ? 31 : 36, Z1, null, null, null);
            return;
        }
        Context context2 = getContext();
        int i21 = this.a;
        Pattern pattern2 = org.telegram.ui.Components.s4.a;
        if (org.telegram.messenger.o5.E(j10)) {
            TLRPC.User Z12 = org.telegram.messenger.vp.r1(i21).Z1(Long.valueOf(j10));
            str2 = Z12.first_name;
            str3 = Z12.last_name;
        } else {
            str2 = org.telegram.messenger.vp.r1(i21).L0(Long.valueOf(-j10)).title;
            str3 = null;
        }
        ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
        if (j10 > 0) {
            i12 = 2131743441;
            r142 = 0;
        } else {
            r142 = 0;
            i12 = 2131743440;
        }
        String L02 = org.telegram.messenger.cd.L0(i12, r142);
        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
        x1Var3.R = L02;
        LinearLayout f11 = org.telegram.messenger.m5.f(context2, 1);
        EditText editText3 = new EditText(context2);
        int i22 = org.telegram.ui.ActionBar.t6.Vg;
        org.telegram.ui.ActionBar.a7.V(editText3, i22, r142);
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(j10 > 0 ? 5 : 6);
        if (j10 > 0) {
            i13 = 2131750695;
            str4 = null;
        } else {
            str4 = null;
            i13 = 2131743439;
        }
        editText3.setHint(org.telegram.messenger.cd.L0(i13, str4));
        editText3.setBackground(org.telegram.ui.ActionBar.t6.U(context2));
        editText3.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        editText3.requestFocus();
        if (j10 > 0) {
            editText = new EditText(context2);
            org.telegram.ui.ActionBar.a7.V(editText, i22, null);
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(org.telegram.messenger.cd.L0(2131749042, null));
            editText.setBackground(org.telegram.ui.ActionBar.t6.U(context2));
            editText.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        } else {
            editText = null;
        }
        org.telegram.messenger.i0.J3(editText3);
        f11.addView(editText3, w7.b6.t(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            f11.addView(editText, w7.b6.t(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder3.o(f11);
        di.a aVar = new di.a(editText3, j10, i21, editText);
        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131745963, null), aVar);
        alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        x1Var3.N = new mg.g(3, editText3, editText);
        x1Var3.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ih, false));
        x1Var3.show();
        x1Var3.p(org.telegram.ui.ActionBar.t6.x0(null, i22, false));
        xd xdVar = new xd(1, x1Var3, aVar);
        if (editText != null) {
            editText.setOnEditorActionListener(xdVar);
        } else {
            editText3.setOnEditorActionListener(xdVar);
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
