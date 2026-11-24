// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import java.util.WeakHashMap;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g95 extends my0 implements jm7, VoIPService.StateListener, g94 {
    public static g95 s5;
    public static boolean t5;
    public static boolean u5;
    public static boolean v5;
    public static boolean w5;
    public final m75 A1;
    public final ArrayList A2;
    public boolean A3;
    public final View A4;
    public final ImageView B1;
    public final ArrayList B2;
    public final Paint B3;
    public GradientDrawable B4;
    public final ImageView C1;
    public int C2;
    public final Paint C3;
    public final int[] C4;
    public v29 D1;
    public final p09 D2;
    public final f95[] D3;
    public final z65 D4;
    public final n85 E1;
    public final p09 E2;
    public float E3;
    public boolean E4;
    public final io F1;
    public boolean F2;
    public f95 F3;
    public boolean F4;
    public final v65 G1;
    public final fl0 G2;
    public f95 G3;
    public RenderNode G4;
    public final a85 H1;
    public final fl0 H2;
    public long H3;
    public float H4;
    public final b95 I1;
    public float I2;
    public float I3;
    public final String[] I4;
    public final p85 J1;
    public float J2;
    public float J3;
    public ObjectAnimator J4;
    public final v75 K1;
    public float K2;
    public boolean K3;
    public ObjectAnimator K4;
    public final TextView L1;
    public RadialGradient L2;
    public boolean L3;
    public final q75 L4;
    public final t75 M1;
    public final Matrix M2;
    public int M3;
    public wb5 M4;
    public final lka N1;
    public final Paint N2;
    public float N3;
    public n95 N4;
    public final o85 O1;
    public float O2;
    public int O3;
    public ha5 O4;
    public final lka P1;
    public float P2;
    public boolean P3;
    public l95 P4;
    public final w85 Q1;
    public ValueAnimator Q2;
    public final int[] Q3;
    public boolean Q4;
    public final vd4 R1;
    public TLRPC.InputPeer R2;
    public final ArrayList R3;
    public boolean R4;
    public final ImageReceiver S1;
    public TLRPC.Chat S2;
    public final ArrayList S3;
    public int S4;
    public int T1;
    public qd2 T2;
    public final c75 T3;
    public AnimatorSet T4;
    public final ImageView U1;
    public final boolean U2;
    public final i75 U3;
    public k85 U4;
    public final aa5 V1;
    public final String V2;
    public final w75 V3;
    public int V4;
    public final int W1;
    public final c95 W2;
    public float W3;
    public int W4;
    public final RadialProgressView X1;
    public final t65 X2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout X3;
    public int X4;
    public final Drawable Y1;
    public final w65 Y2;
    public boolean Y3;
    public int Y4;
    public final View Z1;
    public final Paint Z2;
    public boolean Z3;
    public int Z4;
    public AnimatorSet a2;
    public final LinearLayout a3;
    public wn5 a4;
    public int a5;
    public LaunchActivity b2;
    public final r7 b3;
    public r85 b4;
    public int b5;
    public final UndoView[] c2;
    public final r7 c3;
    public int c4;
    public int c5;
    public final k5 d2;
    public final r7 d3;
    public boolean d4;
    public int d5;
    public boolean e2;
    public final a8 e3;
    public final y65 e4;
    public int e5;
    public ig5 f2;
    public final a8 f3;
    public final r59 f4;
    public int f5;
    public ig5 g2;
    public final a8 g3;
    public final pb5 g4;
    public int g5;
    public int h2;
    public final a8 h3;
    public final m95 h4;
    public int h5;
    public pd i2;
    public final a8 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final ArrayList j2;
    public final r86 j3;
    public final ef1 j4;
    public int j5;
    public h85 k2;
    public final t86 k3;
    public boolean k4;
    public int k5;
    public final e75 l1;
    public boolean l2;
    public final q86 l3;
    public final ArrayList l4;
    public final l85 l5;
    public final j65 m1;
    public long m2;
    public final a8 m3;
    public boolean m4;
    public Boolean m5;
    public final j5 n1;
    public boolean n2;
    public final a8 n3;
    public final v55 n4;
    public Integer n5;
    public final p65 o1;
    public boolean o2;
    public final a8 o3;
    public final u65 o4;
    public final fn0 o5;
    public final dkc p1;
    public final RectF p2;
    public final a8 p3;
    public final bn3 p4;
    public final fn0 p5;
    public final dkc q1;
    public boolean q2;
    public final a8 q3;
    public final v55 q4;
    public final h94 q5;
    public final dkc r1;
    public boolean r2;
    public final a8 r3;
    public final LongSparseIntArray r4;
    public final fn0 r5;
    public final dkc s1;
    public float s2;
    public final a8 s3;
    public final g75 s4;
    public final dkc t1;
    public y75 t2;
    public final a8 t3;
    public final d75 t4;
    public final dkc u1;
    public TLRPC.Peer u2;
    public final LinearLayout u3;
    public LinearLayout u4;
    public final dkc v1;
    public TLObject v2;
    public final TextView v3;
    public boolean v4;
    public final q65 w1;
    public final Paint w2;
    public final g0d w3;
    public final p09 w4;
    public final Paint x1;
    public final ArrayList x2;
    public v55 x3;
    public byte x4;
    public final p75 y1;
    public final ArrayList y2;
    public pd5 y3;
    public boolean y4;
    public final o75 z1;
    public final ArrayList z2;
    public byte z3;
    public final View z4;

    public g95(final LaunchActivity launchActivity, j5 j5Var, qd2 qd2Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super((ylb) null, (Context) launchActivity, true, true);
        int i;
        final LaunchActivity launchActivity2;
        final g95 g95Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.x1 = new Paint(1);
        this.c2 = new UndoView[2];
        this.j2 = new ArrayList();
        this.p2 = new RectF();
        this.w2 = new Paint(1);
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.w3 = new g0d(new v55(this, (byte) 4));
        byte b = 0;
        this.z3 = (byte) 0;
        this.B3 = new Paint(7);
        this.C3 = new Paint(7);
        this.D3 = new f95[8];
        this.E3 = 1.0f;
        this.P3 = true;
        this.Q3 = new int[4];
        this.R3 = new ArrayList();
        this.S3 = new ArrayList();
        this.j4 = new ef1();
        this.l4 = new ArrayList();
        this.n4 = new v55(this, b);
        this.o4 = new u65(this);
        this.p4 = new bn3((byte) 11);
        this.q4 = new v55(this, (byte) 2);
        this.r4 = new LongSparseIntArray();
        this.C4 = new int[2];
        this.F4 = true;
        this.I4 = new String[2];
        this.S4 = -1;
        this.l5 = new l85(this);
        d53 d53Var = d53.f;
        this.o5 = new fn0(2, this, d53Var, 350L);
        this.p5 = new fn0(3, this, d53Var, 220L, true);
        this.q5 = new h94(4, this, d53Var, 350L);
        this.r5 = new fn0(5, this, d53Var, 350L);
        gm.S(getWindow());
        this.S0 = true;
        this.n1 = j5Var;
        this.T2 = qd2Var;
        this.R2 = inputPeer;
        this.S2 = chat;
        this.V2 = str;
        this.a = j5Var.a;
        this.U2 = z;
        this.J0 = new q63();
        this.Q0 = true;
        this.R0 = true;
        this.W1 = oc7.r1(this.a).l4.B.f();
        this.V = true;
        v5 = false;
        u5 = false;
        w5 = false;
        this.z0 = new f75(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.G0 = -1;
        this.L4 = new q75(this);
        setOnDismissListener(new a65(this, b));
        this.q0 = (byte) 75;
        b95 b95Var = new b95(this, launchActivity);
        this.I1 = b95Var;
        di2 di2Var = new di2(true);
        int i2 = cmb.gh;
        di2Var.b(cmb.u0(i2));
        di2Var.d();
        a85 a85Var = new a85(this, launchActivity, di2Var);
        this.H1 = a85Var;
        a85Var.setSubtitle("");
        a85Var.getSubtitleTextView().setVisibility(0);
        a85Var.r();
        a85Var.getAdditionalSubtitleTextView().setPadding(gm.L(24.0f), 0, 0, 0);
        gm.Q3(1.0f, a85Var.getAdditionalSubtitleTextView(), this.m4, false);
        a85Var.getAdditionalSubtitleTextView().setTextColor(cmb.u0(i2));
        int i3 = cmb.bh;
        anb.l(a85Var, 6, i3, null);
        a85Var.setBackButtonImage(R.drawable.ic_ab_back);
        a85Var.setOccupyStatusBar(false);
        a85Var.setAllowOverlayTitle(false);
        int i4 = cmb.Xg;
        anb.l(a85Var, 1, i4, null);
        anb.l(a85Var, 3, cmb.y8, null);
        anb.c(a85Var, i4);
        anb.l(a85Var, 6, i3, null);
        a85Var.setActionBarMenuOnItemClick(new i85(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.u2 = tL_peerUser;
            i = i4;
            tL_peerUser.user_id = j5Var.e().e();
        } else {
            i = i4;
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
        VoIPService.audioLevelsCallback = new w55(this, (byte) 2);
        j5Var.c().b(this, nm7.w2);
        j5Var.c().b(this, nm7.M0);
        j5Var.c().b(this, nm7.T);
        j5Var.c().b(this, nm7.u1);
        j5Var.c().b(this, nm7.B2);
        j5Var.c().b(this, nm7.E0);
        j5Var.c().b(this, nm7.j0);
        j5Var.c().b(this, 2);
        j5Var.c().b(this, nm7.z2);
        j5Var.c().b(this, nm7.y2);
        j5Var.c().b(this, nm7.U3);
        nm7.e().b(this, nm7.R4);
        nm7.e().b(this, nm7.D2);
        this.Y1 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        p09 p09Var = new p09(R.raw.voip_filled, gm.L(46.0f), gm.L(46.0f), true, null);
        this.D2 = p09Var;
        this.E2 = new p09(R.raw.hand_2, gm.L(46.0f), gm.L(46.0f), true, null);
        n85 n85Var = new n85(this, launchActivity);
        this.E1 = n85Var;
        this.b = n85Var;
        n85Var.setClipToPadding(false);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        this.b.setKeepScreenOn(true);
        this.b.setClipChildren(false);
        this.S1 = new ImageReceiver(this.b);
        if (inputPeer != null) {
            lka lkaVar = new lka(launchActivity);
            this.N1 = lkaVar;
            lkaVar.setGravity(17);
            lkaVar.setTextColor(-1);
            lkaVar.setTypeface(gm.o());
            lkaVar.setTextSize(18);
            lkaVar.k(jb6.L0(2131743119));
            this.b.addView(lkaVar, qoe.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            o85 o85Var = new o85(this, launchActivity);
            this.O1 = o85Var;
            o85Var.setGravity(17);
            o85Var.setTextColor(-1);
            o85Var.setTypeface(gm.o());
            o85Var.setTextSize(60);
            this.b.addView(o85Var, qoe.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            lka lkaVar2 = new lka(launchActivity);
            this.P1 = lkaVar2;
            lkaVar2.setGravity(17);
            lkaVar2.setTextColor(-1);
            lkaVar2.setTypeface(gm.o());
            lkaVar2.setTextSize(18);
            this.b.addView(lkaVar2, qoe.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        p85 p85Var = new p85(this, launchActivity);
        this.J1 = p85Var;
        p85Var.setClipToPadding(false);
        p85Var.setClipChildren(false);
        w85 w85Var = new w85(this);
        this.Q1 = w85Var;
        w85Var.o = d53Var;
        w85Var.d = (short) 350;
        w85Var.c = (short) 350;
        w85Var.e = (short) 350;
        w85Var.C = false;
        p85Var.setItemAnimator(w85Var);
        p85Var.setOnScrollListener(new q85(this));
        p85Var.setVerticalScrollBarEnabled(false);
        getContext();
        vd4 vd4Var = new vd4(u5 ? 6 : 2, p85Var);
        this.R1 = vd4Var;
        p85Var.setLayoutManager(vd4Var);
        j65 j65Var = new j65(this);
        this.m1 = j65Var;
        vd4Var.O = j65Var;
        p85Var.i(new k65(this));
        vd4Var.W = false;
        this.b.addView(p85Var, qoe.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        p85Var.setAdapter(b95Var);
        p85Var.setTopBottomSelectorRadius(13);
        anb.I(cmb.Ug, p85Var);
        p85Var.setOnItemClickListener(new wu2((Object) this, (Object) launchActivity, (Object) qd2Var, (byte) 13));
        p85Var.setOnItemLongClickListener(new w55(this, (byte) 3));
        r59 r59Var = new r59(launchActivity);
        this.f4 = r59Var;
        this.b.addView(r59Var, qoe.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        pb5 pb5Var = new pb5(qd2Var, this.a, this);
        this.g4 = pb5Var;
        r59Var.setAdapter(pb5Var);
        q55 q55Var = new q55(6, false);
        r59Var.setLayoutManager(q55Var);
        q55Var.O = new m65(this);
        final byte b2 = 1;
        r59Var.setOnItemClickListener(new f59(this) { // from class: u55
            public final /* synthetic */ g95 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i6, View view) {
                byte b3 = b2;
                g95 g95Var2 = this.b;
                switch (b3) {
                    case 0:
                        l95 l95Var = (l95) view;
                        if (l95Var.getVideoParticipant() != null) {
                            g95Var2.V0(l95Var.getVideoParticipant());
                            break;
                        } else {
                            g95Var2.V0(new rd2(l95Var.getParticipant(), false));
                            break;
                        }
                    default:
                        n95 n95Var = (n95) view;
                        if (n95Var.getParticipant() != null) {
                            g95Var2.V0(n95Var.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        sc3 sc3Var = new sc3();
        sc3Var.C = false;
        sc3Var.o = d53Var;
        sc3Var.d = (short) 350;
        sc3Var.c = (short) 350;
        sc3Var.e = (short) 350;
        r59Var.setItemAnimator(new n65(this));
        r59Var.setOnScrollListener(new o65(this));
        pb5Var.H(r59Var, false, false);
        r59Var.setVisibility(8);
        p65 p65Var = new p65(this, launchActivity);
        this.o1 = p65Var;
        int u0 = cmb.u0(cmb.zh);
        int red = Color.red(u0);
        int green = Color.green(u0);
        int blue = Color.blue(u0);
        this.M2 = new Matrix();
        this.L2 = new RadialGradient(0.0f, 0.0f, gm.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.N2 = paint;
        paint.setShader(this.L2);
        fl0 fl0Var = new fl0(9);
        this.G2 = fl0Var;
        fl0 fl0Var2 = new fl0(12);
        this.H2 = fl0Var2;
        fl0Var.a = gm.L(62.0f) * 0.45454547f;
        fl0Var.b = gm.L(72.0f) * 0.45454547f;
        fl0Var.b();
        fl0Var2.a = gm.L(65.0f) * 0.45454547f;
        fl0Var2.b = gm.L(75.0f) * 0.45454547f;
        fl0Var2.b();
        int i6 = cmb.yh;
        fl0Var.d.setColor(on2.p(cmb.u0(i6), 38));
        fl0Var2.d.setColor(on2.p(cmb.u0(i6), 76));
        dkc dkcVar = new dkc(launchActivity, 50.0f);
        this.s1 = dkcVar;
        dkcVar.setCheckable(true);
        dkcVar.setTextSize(12);
        p65Var.a(dkcVar);
        dkcVar.setOnClickListener(new t55(this, (byte) 6));
        dkc dkcVar2 = new dkc(launchActivity, 50.0f);
        this.r1 = dkcVar2;
        dkcVar2.setCheckable(true);
        dkcVar2.setTextSize(12);
        dkcVar2.d(false, false);
        dkcVar2.setCrossOffset(-gm.N(3.5f));
        dkcVar2.c(R.drawable.calls_video, -1, 0, 1.0f, true, jb6.L0(2131743173), false, false);
        dkc dkcVar3 = new dkc(launchActivity, 50.0f);
        this.p1 = dkcVar3;
        dkcVar3.setCheckable(true);
        dkcVar3.setTextSize(12);
        dkcVar3.d(false, false);
        s09 s09Var = new s09(launchActivity);
        dkcVar3.addView(s09Var, qoe.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        p09 p09Var2 = new p09(R.raw.camera_flip, gm.L(24.0f), gm.L(24.0f), true, null);
        this.w4 = p09Var2;
        s09Var.setAnimation(p09Var2);
        dkcVar3.setOnClickListener(new t55(this, (byte) 7));
        p65Var.a(dkcVar3);
        dkc dkcVar4 = new dkc(launchActivity, 50.0f);
        this.q1 = dkcVar4;
        dkcVar4.setCheckable(true);
        dkcVar4.setTextSize(12);
        dkcVar4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.T1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        dkcVar4.addView(imageView, qoe.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        dkcVar4.setOnClickListener(new t55(this, (byte) 10));
        p65Var.a(dkcVar4);
        p65Var.a(dkcVar2);
        dkc dkcVar5 = new dkc(launchActivity, 50.0f);
        this.t1 = dkcVar5;
        dkcVar5.setTextSize(12);
        dkcVar5.c(R.drawable.calls_decline, -1, cmb.u0(cmb.th), 0.3f, false, jb6.L0(2131743048), false, false);
        final byte b3 = 1;
        dkcVar5.setOnClickListener(new View.OnClickListener(this) { // from class: z55
            public final /* synthetic */ g95 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                LaunchActivity launchActivity3 = launchActivity;
                g95 g95Var2 = this.b;
                switch (b4) {
                    case 0:
                        LaunchActivity launchActivity4 = g95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            g95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, nm7.o1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                g95Var2.L1(true, false);
                                g95Var2.K1(false);
                                g95Var2.T2.B();
                                g95Var2.D0(true);
                                g95Var2.o1.requestLayout();
                                break;
                            } else {
                                g95Var2.c2[0].d(1, false);
                                if (g95Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    y75 y75Var = new y75(g95Var2, launchActivity3, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    g95Var2.t2 = y75Var;
                                    y75Var.setBottomPadding(g95Var2.b.getPaddingBottom());
                                    g95Var2.c.addView(g95Var2.t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        c75 c75Var = g95Var2.T3;
                        o04 o04Var = c75Var.i0;
                        if (c75Var.h0) {
                            gm.r(o04Var);
                        }
                        gm.d3(o04Var, 3000L);
                        c75Var.h0 = true;
                        qd2 qd2Var2 = g95Var2.T2;
                        if (qd2Var2 != null && !qd2Var2.k()) {
                            g95Var2.E1();
                            g95.l1(launchActivity3, new v55(g95Var2, (byte) 6), false, false);
                            break;
                        } else {
                            g95Var2.dismiss();
                            break;
                        }
                }
            }
        });
        dkc dkcVar6 = new dkc(launchActivity, 50.0f);
        this.u1 = dkcVar6;
        dkcVar6.setCheckable(true);
        dkcVar6.b(true, false);
        dkcVar6.setTextSize(12);
        dkcVar6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, jb6.L0(2131742978), false, false);
        q65 q65Var = new q65(this, launchActivity);
        this.w1 = q65Var;
        q65Var.setAnimation(p09Var);
        q65Var.setScaleType(ImageView.ScaleType.CENTER);
        dkc dkcVar7 = new dkc(launchActivity, 50.0f);
        this.v1 = dkcVar7;
        dkcVar7.setDrawBackground(false);
        dkcVar7.setTextSize(12);
        dkcVar7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        dkcVar7.addView(q65Var, qoe.e(50, 50, 49));
        p65Var.a(dkcVar7);
        dkcVar7.setOnClickListener(new s65(this));
        p65Var.a(dkcVar6);
        p65Var.a(dkcVar5);
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.X1 = radialProgressView;
        radialProgressView.setSize(gm.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(cmb.u0(cmb.Eh));
        a85Var.setAlpha(0.0f);
        a85Var.getBackButton().setScaleX(0.9f);
        a85Var.getBackButton().setScaleY(0.9f);
        a85Var.getBackButton().setTranslationX(-gm.L(14.0f));
        a85Var.getTitleTextView().setTranslationY(gm.L(23.0f));
        a85Var.getSubtitleTextView().setTranslationY(gm.L(20.0f));
        a85Var.getAdditionalSubtitleTextView().setTranslationY(gm.L(20.0f));
        r7 r7Var = new r7(launchActivity, (r6) null, cmb.u0(i));
        this.b3 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setIcon(R.drawable.ic_ab_other);
        r7Var.setContentDescription(jb6.L0(2131754838));
        r7Var.setSubMenuOpenSide(2);
        r7Var.setDelegate(new w55(this, (byte) 5));
        int i7 = cmb.Yg;
        anb.Q(r7Var, cmb.e0(cmb.u0(i7), 6), null, anb.M(i7));
        r7Var.setOnClickListener(new t55(this, (byte) 11));
        r7Var.O(cmb.u0(i), false);
        r7Var.O(cmb.u0(i), true);
        r7 r7Var2 = new r7(launchActivity, (r6) null, cmb.u0(i));
        this.c3 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(R.drawable.msg_voice_pip);
        r7Var2.setContentDescription(jb6.L0(2131754807));
        anb.Q(r7Var2, cmb.e0(cmb.u0(i7), 6), null, anb.M(i7));
        r7Var2.setOnClickListener(new t55(this, (byte) 12));
        r7 r7Var3 = new r7(launchActivity, (r6) null, cmb.u0(i));
        this.d3 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        r7Var3.setIcon(R.drawable.msg_screencast);
        r7Var3.setContentDescription(jb6.L0(2131754807));
        anb.Q(r7Var3, cmb.e0(cmb.u0(i7), 6), null, anb.M(i7));
        r7Var3.setOnClickListener(new t55(this, b));
        t65 t65Var = new t65(this, launchActivity, launchActivity);
        this.X2 = t65Var;
        v65 v65Var = new v65(launchActivity);
        this.G1 = v65Var;
        v65Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.Z2 = paint2;
        paint2.setColor(-12761513);
        w65 w65Var = new w65(this, getContext());
        this.Y2 = w65Var;
        anb.X(w65Var, i, this.J0);
        w65Var.setTextSize(1, 11.0f);
        w65Var.setText(jb6.L0(2131743158));
        w65Var.setMaxLines(1);
        w65Var.setGravity(17);
        w65Var.setTypeface(gm.o());
        w65Var.setPadding(gm.L(8.0f), gm.L(0.0f), gm.L(8.0f), gm.L(0.0f));
        if (!i1()) {
            w65Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a3 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(t65Var, qoe.l(1.0f, 0, -2));
        linearLayout.addView(w65Var, qoe.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView(v65Var, qoe.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, qoe.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(a85Var, qoe.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.u3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r7Var3, qoe.o(48, 48));
        linearLayout2.addView(r7Var2, qoe.o(48, 48));
        linearLayout2.addView(r7Var, qoe.o(48, 48));
        this.b.addView(linearLayout2, qoe.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.Z1 = view;
        view.setAlpha(0.0f);
        anb.h(cmb.U5, null, view);
        this.b.addView(view, qoe.c(1.0f, -1));
        for (int i8 = 0; i8 < 2; i8++) {
            this.c2[i8] = new x65(this, launchActivity);
            this.c2[i8].setAdditionalTranslationY(gm.L(10.0f));
            this.c2[i8].setTranslationZ(gm.L(5.0f));
            this.b.addView(this.c2[i8], qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        k5 k5Var = new k5(launchActivity, true);
        this.d2 = k5Var;
        k5Var.setTag(R.id.fit_width_tag, Integer.valueOf(nm7.O3));
        this.b3.h(k5Var, gm.L(48.0f));
        this.b3.setShowSubmenuByMove(false);
        int i9 = cmb.Ug;
        anb.Q(k5Var, cmb.Y(cmb.u0(i9), 6, 6), null, anb.M(i9));
        r7 r7Var4 = this.b3;
        a8 d = r7Var4.d(1, 0, null, jb6.L0(2131743085), true, true, r7Var4.n0);
        this.p3 = d;
        d.m(true, false);
        r7 r7Var5 = this.b3;
        a8 d2 = r7Var5.d(2, 0, null, jb6.L0(2131743038), true, true, r7Var5.n0);
        this.q3 = d2;
        d2.m(false, true);
        int i10 = cmb.mh;
        d.setCheckColor(i10);
        d.d(cmb.u0(i10), cmb.u0(i10));
        d2.setCheckColor(i10);
        d2.d(cmb.u0(i10), cmb.u0(i10));
        Paint paint3 = new Paint(1);
        paint3.setColor(cmb.u0(cmb.Xg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(gm.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        a8 f = this.b3.f(null, jb6.L0(2131743083), 10, true, R.drawable.msg_voice_speaker);
        this.g3 = f;
        f.setItemHeight(56);
        a8 f2 = this.b3.f(null, jb6.L0(2131742966), 11, true, R.drawable.msg_noise_on);
        this.h3 = f2;
        f2.setItemHeight(56);
        r86 r86Var = new r86(q86.a());
        this.j3 = r86Var;
        a8 f3 = this.b3.f(r86Var, jb6.L0(2131744985), 14, false, 0);
        this.i3 = f3;
        f3.setItemHeight(56);
        f3.setRightIcon(R.drawable.msg_settings);
        f3.setSubtext(jb6.L0(q86.a() ? 2131744983 : 2131744984));
        f3.getRightIcon().setBackground(cmb.e0(cmb.u0(i9), 1));
        int i11 = (jb6.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f3.getRightIcon();
        boolean z2 = jb6.a0;
        rightIcon.setLayoutParams(qoe.d(40, 40.0f, i11, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(on2.f(0.3f, cmb.u0(cmb.Wg), -16777216));
        boolean z3 = jb6.a0;
        FrameLayout.LayoutParams d3 = qoe.d(-1, 28.0f, i11, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d3.width = 1;
        view2.setLayoutParams(d3);
        f3.addView(view2);
        View[] viewArr = {f3.getTextView(), f3.getSubtextView()};
        for (int i12 = 0; i12 < 2; i12++) {
            View view3 = viewArr[i12];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = jb6.a0 ? gm.L(60.0f) : 0;
                layoutParams.rightMargin = jb6.a0 ? 0 : gm.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        this.i3.getRightIcon().setContentDescription(jb6.L0(2131744967));
        this.i3.getRightIcon().setOnClickListener(new t55(this, (byte) 1));
        TextView b4 = this.b3.b(on2.f(0.3f, cmb.u0(cmb.Wg), -16777216));
        this.v3 = b4;
        ((ViewGroup.MarginLayoutParams) b4.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b4.getLayoutParams()).bottomMargin = 0;
        a8 f4 = this.b3.f(this.W2, jb6.L0(sd2.W(this.S2) ? 2131743169 : 2131743068), 6, true, R.drawable.msg_edit);
        this.f3 = f4;
        a8 f5 = this.b3.f(this.W2, jb6.L0(2131743069), 7, false, R.drawable.msg_permissions);
        this.m3 = f5;
        a8 e = this.b3.e(3, R.drawable.msg_link, jb6.L0(2131743021));
        this.e3 = e;
        c95 c95Var = new c95();
        this.W2 = c95Var;
        a8 e2 = this.b3.e(9, R.drawable.msg_screencast, jb6.L0(2131743120));
        this.o3 = e2;
        a8 f6 = this.b3.f(c95Var, jb6.L0(2131743032), 5, true, 0);
        this.n3 = f6;
        c95Var.g = f6.getImageView();
        a8 e3 = this.b3.e(12, R.drawable.menu_stream_comments_24, jb6.L0(2131743168));
        this.s3 = e3;
        a8 e4 = this.b3.e(13, R.drawable._menu_stream_comments_off_24, jb6.L0(2131743170));
        this.t3 = e4;
        a8 e5 = this.b3.e(4, R.drawable.msg_cancel, jb6.L0(g1() ? 2131743063 : sd2.W(this.S2) ? 2131743165 : 2131743064));
        this.r3 = e5;
        this.b3.setPopupItemsSelectorColor(cmb.u0(cmb.Ug));
        this.b3.getPopupLayout().setFitItems(true);
        int i13 = cmb.Xg;
        e3.d(cmb.u0(i13), cmb.u0(i13));
        e4.d(cmb.u0(i13), cmb.u0(i13));
        this.g3.d(cmb.u0(i13), cmb.u0(i13));
        this.h3.d(cmb.u0(i13), cmb.u0(i13));
        z1(this.i3, cmb.u0(i13));
        int i14 = cmb.lh;
        e5.d(cmb.u0(i14), cmb.u0(i14));
        e.d(cmb.u0(i13), cmb.u0(i13));
        f4.d(cmb.u0(i13), cmb.u0(i13));
        f5.d(cmb.u0(i13), cmb.u0(i13));
        f6.d(cmb.u0(i13), cmb.u0(i13));
        e2.d(cmb.u0(i13), cmb.u0(i13));
        if (this.T2 != null) {
            d1();
        }
        if (g1()) {
            this.i2 = new pd();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.i2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        N1(false);
        this.H1.getTitleTextView().setOnClickListener(new t55(this, (byte) 2));
        y65 y65Var = new y65(this, launchActivity);
        this.e4 = y65Var;
        z65 z65Var = new z65(this);
        this.D4 = z65Var;
        final byte b5 = 0;
        y65Var.setClipToPadding(false);
        z65Var.C = false;
        z65Var.o = d53.f;
        z65Var.d = (short) 350;
        z65Var.c = (short) 350;
        z65Var.e = (short) 350;
        y65Var.setItemAnimator(z65Var);
        y65Var.setOnScrollListener(new a75(this));
        y65Var.setClipChildren(false);
        u46 u46Var = new u46();
        u46Var.i1(0);
        y65Var.setLayoutManager(u46Var);
        m95 m95Var = new m95(qd2Var, this.a, this);
        this.h4 = m95Var;
        y65Var.setAdapter(m95Var);
        m95Var.F(y65Var, false);
        y65Var.setOnItemClickListener(new f59(this) { // from class: u55
            public final /* synthetic */ g95 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i62, View view4) {
                byte b32 = b5;
                g95 g95Var2 = this.b;
                switch (b32) {
                    case 0:
                        l95 l95Var = (l95) view4;
                        if (l95Var.getVideoParticipant() != null) {
                            g95Var2.V0(l95Var.getVideoParticipant());
                            break;
                        } else {
                            g95Var2.V0(new rd2(l95Var.getParticipant(), false));
                            break;
                        }
                    default:
                        n95 n95Var = (n95) view4;
                        if (n95Var.getParticipant() != null) {
                            g95Var2.V0(n95Var.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        y65Var.setOnItemLongClickListener(new w55(this, b5));
        y65Var.setVisibility(8);
        y65Var.i(new b75());
        c75 c75Var = new c75(this, launchActivity, this.J1, y65Var, this.R3, this.T2, this);
        this.T3 = c75Var;
        c75Var.setClipChildren(false);
        m95Var.E(this.R3, c75Var);
        if (this.f4 != null) {
            this.g4.G(this.R3, c75Var);
        }
        d75 d75Var = new d75(this, launchActivity);
        this.t4 = d75Var;
        e75 e75Var = new e75(this, launchActivity, this.H1, this.J1, d75Var);
        this.l1 = e75Var;
        e75Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        e75Var.setInvalidateWithParent(true);
        d75Var.setProfileGalleryView(e75Var);
        g75 g75Var = new g75(this, launchActivity);
        this.s4 = g75Var;
        g75Var.setVisibility(8);
        e75Var.setVisibility(0);
        e75Var.b(new h75(this));
        i75 i75Var = new i75(this, launchActivity);
        this.U3 = i75Var;
        this.b.addView(c75Var);
        c75Var.addView(y65Var, qoe.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.o1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.z4 = view4;
        int[] iArr = this.C4;
        iArr[0] = this.O3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.C4);
        this.B4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.b.addView(view4, qoe.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.A4 = view5;
        view5.setBackgroundColor(this.C4[0]);
        this.b.addView(view5, qoe.e(-1, 0, 83));
        aa5 aa5Var = new aa5(launchActivity);
        this.V1 = aa5Var;
        aa5Var.setDelegate(new j75(this));
        aa5Var.setClickCellDelegate(new k75(this));
        qd2 qd2Var2 = this.T2;
        if (qd2Var2 != null) {
            aa5Var.E0(this.n1.a, qd2Var2.h(false));
        }
        this.b.addView(aa5Var, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        t86 t86Var = new t86(launchActivity);
        this.k3 = t86Var;
        t86Var.setOnContentHeightChanged(new v55(this, (byte) 1));
        this.b.addView(t86Var, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l3 = new q86(new l75(this));
        io ioVar = new io(launchActivity, false, true, true);
        this.F1 = ioVar;
        ioVar.setGravity(17);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTextColor(-1);
        ioVar.b(0.4f, 320L, d53.h);
        ioVar.setTypeface(gm.o());
        this.b.addView(this.o1);
        m75 m75Var = new m75(this, launchActivity, this.E1, LaunchActivity.Q(), this.J0);
        this.A1 = m75Var;
        m75Var.K = true;
        m75Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.W1)});
        m75Var.getEditText().setLinkTextColor(-11683585);
        m75Var.setHint(jb6.L0(2131743615));
        m75Var.getEditText().addTextChangedListener(new n75(this));
        m75Var.s();
        o75 o75Var = new o75(this, launchActivity);
        this.z1 = o75Var;
        this.b.addView(o75Var, qoe.c(-1.0f, -1));
        p75 p75Var = new p75(launchActivity);
        this.y1 = p75Var;
        p75Var.addView(m75Var, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        p75Var.addView(ioVar, qoe.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        ioVar.setTranslationY(-gm.L(20.0f));
        this.b.addView(p75Var, qoe.e(-1, -2, 80));
        ImageView imageView2 = new ImageView(launchActivity);
        this.C1 = imageView2;
        int i15 = cmb.h6;
        anb.R(imageView2, cmb.f0(S(i15), 1, -1), null, anb.M(i15), this.J0);
        int i16 = cmb.e7;
        ylb ylbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView2, i16, ylbVar, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.arrow_more);
        imageView2.setOnClickListener(new t55(this, (byte) 3));
        ImageView imageView3 = new ImageView(launchActivity);
        this.B1 = imageView3;
        anb.R(imageView3, cmb.f0(S(i15), 1, -1), null, anb.M(i15), this.J0);
        anb.s(imageView3, cmb.u6, this.J0, mode);
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_send);
        imageView3.setOnClickListener(new t55(this, (byte) 4));
        p75Var.addView(imageView2, qoe.e(48, 48, 85));
        p75Var.addView(imageView3, qoe.e(48, 48, 85));
        this.b.addView(i75Var);
        g75Var.addView(e75Var, qoe.c(-1.0f, -1));
        g75Var.addView(d75Var, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(g75Var, qoe.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        D0(false);
        this.I1.f();
        if (v5) {
            this.g4.I(this.f4, false);
        }
        this.C2 = this.I1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.L1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (sd2.T(this.S2) && (chat2 = this.S2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, qoe.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            lp7 lp7Var = new lp7(launchActivity);
            lp7Var.setTextColor(-1);
            lp7Var.setSelectorColor(-9598483);
            lp7Var.setTextOffset(gm.L(10.0f));
            lp7Var.setItemCount(5);
            r75 r75Var = new r75(launchActivity);
            r75Var.setItemCount(5);
            r75Var.setTextColor(-1);
            r75Var.setSelectorColor(-9598483);
            r75Var.setTextOffset(-gm.L(10.0f));
            s75 s75Var = new s75(launchActivity);
            s75Var.setItemCount(5);
            s75Var.setTextColor(-1);
            s75Var.setSelectorColor(-9598483);
            s75Var.setTextOffset(-gm.L(34.0f));
            t75 t75Var = new t75(launchActivity);
            this.M1 = t75Var;
            t75Var.setLines(1);
            t75Var.setSingleLine(true);
            t75Var.setEllipsize(TextUtils.TruncateAt.END);
            t75Var.setGravity(17);
            t75Var.setTextColor(-1);
            t75Var.setTypeface(gm.o());
            t75Var.setTextSize(1, 14.0f);
            this.b.addView(t75Var, qoe.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            t75Var.setOnClickListener(new x55(this, lp7Var, r75Var, s75Var, chat, j5Var, inputPeer2, (byte) 0));
            v75 v75Var = new v75(launchActivity2, lp7Var, r75Var, s75Var);
            this.K1 = v75Var;
            v75Var.setWeightSum(1.0f);
            v75Var.setOrientation(0);
            this.b.addView(v75Var, qoe.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            int i18 = calendar.get(6);
            v75Var.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
            lp7Var.setMinValue(0);
            lp7Var.setMaxValue(365);
            lp7Var.setWrapSelectorWheel(false);
            lp7Var.setFormatter(new on0(currentTimeMillis, calendar, i17, (byte) 1));
            lu luVar = new lu((Object) this, (Object) lp7Var, (Object) r75Var, (Object) s75Var, (byte) 12);
            g95Var = this;
            lp7Var.setOnValueChangedListener(luVar);
            r75Var.setMinValue(0);
            r75Var.setMaxValue(23);
            v75Var.addView(r75Var, qoe.l(0.2f, 0, nm7.s4));
            r75Var.setFormatter(new zo4((byte) 10));
            r75Var.setOnValueChangedListener(luVar);
            s75Var.setMinValue(0);
            s75Var.setMaxValue(59);
            s75Var.setValue(0);
            s75Var.setFormatter(new zo4((byte) 11));
            v75Var.addView(s75Var, qoe.l(0.3f, 0, nm7.s4));
            s75Var.setOnValueChangedListener(luVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i19 = calendar.get(6);
            int i20 = calendar.get(12);
            int i21 = calendar.get(11);
            lp7Var.setValue(i18 != i19 ? 1 : 0);
            s75Var.setValue(i20);
            r75Var.setValue(i21);
            ik.g(t75Var, textView, 0L, 604800L, 2, lp7Var, r75Var, s75Var);
        } else {
            launchActivity2 = launchActivity;
            g95Var = this;
        }
        w75 w75Var = new w75(g95Var, (ViewGroup) g95Var.getWindow().getDecorView(), g95Var.b);
        g95Var.V3 = w75Var;
        w75Var.E = new x75(g95Var);
        e75Var.setPinchToZoomHelper(w75Var);
        final byte b6 = 0;
        g95Var.r1.setOnClickListener(new View.OnClickListener(g95Var) { // from class: z55
            public final /* synthetic */ g95 b;

            {
                this.b = g95Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                byte b42 = b6;
                LaunchActivity launchActivity3 = launchActivity2;
                g95 g95Var2 = this.b;
                switch (b42) {
                    case 0:
                        LaunchActivity launchActivity4 = g95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            g95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, nm7.o1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                g95Var2.L1(true, false);
                                g95Var2.K1(false);
                                g95Var2.T2.B();
                                g95Var2.D0(true);
                                g95Var2.o1.requestLayout();
                                break;
                            } else {
                                g95Var2.c2[0].d(1, false);
                                if (g95Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    y75 y75Var = new y75(g95Var2, launchActivity3, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    g95Var2.t2 = y75Var;
                                    y75Var.setBottomPadding(g95Var2.b.getPaddingBottom());
                                    g95Var2.c.addView(g95Var2.t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        c75 c75Var2 = g95Var2.T3;
                        o04 o04Var = c75Var2.i0;
                        if (c75Var2.h0) {
                            gm.r(o04Var);
                        }
                        gm.d3(o04Var, 3000L);
                        c75Var2.h0 = true;
                        qd2 qd2Var22 = g95Var2.T2;
                        if (qd2Var22 != null && !qd2Var22.k()) {
                            g95Var2.E1();
                            g95.l1(launchActivity3, new v55(g95Var2, (byte) 6), false, false);
                            break;
                        } else {
                            g95Var2.dismiss();
                            break;
                        }
                }
            }
        });
        g95Var.J1(false);
        g95Var.E1();
        g95Var.K1(false);
        g95Var.L1(false, false);
        g95Var.u1(0.0f);
        g95Var.M1();
        g95Var.b.addView(new FrameLayout(launchActivity2), qoe.e(-1, nm7.d3, 87));
        g95Var.u1.setOnClickListener(new t55(g95Var, (byte) 5));
        g95Var.J0();
        rve.a(g95Var.r1);
        rve.a(g95Var.s1);
        rve.a(g95Var.p1);
        rve.a(g95Var.q1);
        rve.a(g95Var.v1);
        rve.a(g95Var.t1);
        rve.a(g95Var.u1);
        ViewGroup viewGroup2 = g95Var.b;
        w55 w55Var = new w55(g95Var, (byte) 1);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(viewGroup2, w55Var);
    }

    public static void S0(LaunchActivity launchActivity, j5 j5Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        LaunchActivity launchActivity2;
        g95 g95Var;
        TLRPC.GroupCall groupCall;
        qd2 qd2Var;
        if (s5 == null && pp9.Q0 == null) {
            if (inputPeer != null) {
                qd2 f1 = oc7.r1(j5Var.a).f1(chat.id, false, null);
                if (f1 != null && (groupCall = f1.b) != null && groupCall.rtmp_stream && !f1.k()) {
                    return;
                }
                launchActivity2 = launchActivity;
                g95 g95Var2 = new g95(launchActivity2, j5Var, f1, chat, inputPeer, z, str);
                s5 = g95Var2;
                g95Var = g95Var2;
            } else {
                if (VoIPService.getSharedInstance() == null || (qd2Var = VoIPService.getSharedInstance().groupCall) == null) {
                    return;
                }
                TLRPC.GroupCall groupCall2 = qd2Var.b;
                if (groupCall2 != null && groupCall2.rtmp_stream && !qd2Var.k()) {
                    if (pp9.Q0 != null || launchActivity == null) {
                        return;
                    }
                    pp9 pp9Var = new pp9(launchActivity, j5Var, qd2Var, oc7.r1(j5Var.a).L0(Long.valueOf(qd2Var.c)));
                    pp9.Q0 = pp9Var;
                    pp9Var.show();
                    return;
                }
                TLRPC.Chat L0 = oc7.r1(j5Var.a).L0(Long.valueOf(qd2Var.c));
                qd2Var.b(true);
                g95Var = new g95(launchActivity, j5Var, qd2Var, L0, null, z, str);
                s5 = g95Var;
                launchActivity2 = launchActivity;
            }
            g95Var.b2 = launchActivity2;
            gm.c3(new bn3((byte) 10));
        }
    }

    public static String W0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 0) {
            return jb6.M0(2131743183, null);
        }
        if (i == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? jb6.M0(2131743184, null) : jb6.M0(2131743185, null);
        }
        if (i != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? jb6.M0(2131743187, null) : str;
    }

    public static String X0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? jb6.M0(2131743182, null) : jb6.a0(null, null, 2131743181, str) : i == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? jb6.M0(2131743179, null) : jb6.M0(2131743180, null) : jb6.M0(2131743178, null);
    }

    public static String b1() {
        return zx3.i[(int) Math.floor(Math.random() * 8.0d)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static boolean h1(int i) {
        return i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    public static void l1(Context context, Runnable runnable, boolean z, boolean z2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            qd2 qd2Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (z2 || !sd2.w(14, chat)) {
                q1(qd2Var, false, selfId, runnable);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
            boolean isConference = sharedInstance.isConference();
            he heVar = alertDialog$Builder.a;
            if (isConference) {
                heVar.S = jb6.M0(2131743152, null);
                heVar.U = jb6.M0(2131743153, null);
            } else if (sd2.W(chat)) {
                heVar.S = jb6.M0(2131743155, null);
                heVar.U = jb6.M0(2131743156, null);
            } else {
                heVar.S = jb6.M0(2131743045, null);
                heVar.U = jb6.M0(2131743046, null);
            }
            sharedInstance.getAccount();
            oh2[] oh2VarArr = new oh2[1];
            LinearLayout i = hg9.i(context, 1);
            if (!sharedInstance.isConference() || (qd2Var != null && (groupCall = qd2Var.b) != null && groupCall.creator)) {
                oh2 oh2Var = new oh2(context, 1);
                oh2VarArr[0] = oh2Var;
                oh2Var.setBackground(cmb.L0(false));
                if (z) {
                    oh2VarArr[0].setTextColor(cmb.w0(null, cmb.i5, false));
                } else {
                    oh2VarArr[0].setTextColor(cmb.w0(null, cmb.Xg, false));
                    CheckBoxSquare checkBoxSquare = (CheckBoxSquare) oh2VarArr[0].getCheckBoxView();
                    int i2 = cmb.hh;
                    int i3 = cmb.fh;
                    int i4 = cmb.dh;
                    checkBoxSquare.s = i2;
                    checkBoxSquare.w = i3;
                    checkBoxSquare.x = i4;
                    checkBoxSquare.invalidate();
                }
                oh2VarArr[0].setTag(0);
                if (sharedInstance.isConference()) {
                    oh2VarArr[0].e(jb6.M0(2131743154, null), "", false, false, false);
                } else if (sd2.W(chat)) {
                    oh2VarArr[0].e(jb6.M0(2131743157, null), "", false, false, false);
                } else {
                    oh2VarArr[0].e(jb6.M0(2131743047, null), "", false, false, false);
                }
                oh2VarArr[0].setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                i.addView(oh2VarArr[0], qoe.o(-1, -2));
                oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, (byte) 2));
            }
            alertDialog$Builder.n(i);
            heVar.J = cmb.fh;
            alertDialog$Builder.j(jb6.M0(2131743048, null), new zn1((Object) qd2Var, (Object) oh2VarArr, selfId, (Object) runnable, (byte) 4));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            if (z) {
                heVar.Q0 = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    heVar.getWindow().setType(2038);
                } else {
                    heVar.getWindow().setType(2003);
                }
                heVar.getWindow().clearFlags(2);
            }
            if (!z) {
                heVar.j(cmb.w0(null, cmb.kh, false));
            }
            heVar.show();
            if (z) {
                return;
            }
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.lh, null);
            }
            heVar.o(cmb.w0(null, cmb.Xg, false));
        }
    }

    public static void q1(qd2 qd2Var, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (qd2Var != null) {
            ArrayList arrayList = qd2Var.f;
            ArrayList arrayList2 = qd2Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(j);
            if (groupCallParticipant != null) {
                qd2Var.d.e(j);
                arrayList2.remove(groupCallParticipant);
                qd2Var.g.remove(groupCallParticipant);
                int i = 0;
                while (i < arrayList.size()) {
                    if (k47.B1(((rd2) arrayList.get(i)).a.peer) == k47.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = qd2Var.b;
                groupCall.participants_count--;
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i2);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        nm7.e().k(nm7.v2, new Object[0]);
    }

    public static void z1(a8 a8Var, int i) {
        if (a8Var != null) {
            a8Var.d(i, i);
            if (a8Var.getRightIcon() != null) {
                a8Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x049e, code lost:
    
        if (sd2.w(2, r35.S2) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02fa, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0313, code lost:
    
        if (r12 == (-Z0())) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b1, code lost:
    
        if (r2.admin_rights.manage_call != false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011c  */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A1(View view) {
        wb5 wb5Var;
        e95 e95Var;
        Integer num;
        Integer num2;
        ViewGroup viewGroup;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num3;
        boolean z;
        int i;
        TLRPC.GroupCall groupCall;
        long j;
        gn5 m;
        gn5 m2;
        boolean z2;
        r85 r85Var;
        TLRPC.FileLocation fileLocation;
        int x;
        int y;
        float y2;
        int measuredHeight;
        int i2;
        boolean z3;
        ?? r5;
        String str;
        String str2;
        int i3;
        String str3;
        int i4;
        TLRPC.ChatParticipants chatParticipants;
        Integer valueOf = Integer.valueOf(R.drawable.msg_msgbubble3);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_voice_muted);
        byte b = 4;
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_voice_unmuted);
        if (!this.Q1.k() && getContext() != null) {
            if (this.R4 || this.Y3) {
                T0(true);
                return false;
            }
            k85 k85Var = this.U4;
            if (k85Var != null) {
                k85Var.dismiss();
                this.U4 = null;
                return false;
            }
            R0();
            if (view instanceof n95) {
                n95 n95Var = (n95) view;
                if (n95Var.getParticipant() != this.T2.z) {
                    wb5Var = new wb5(n95Var.getContext());
                    wb5Var.e(this.n1, n95Var.getParticipant().a, this.T2, k47.B1(this.u2), null, false);
                    tm tmVar = wb5Var.s;
                    if (tmVar != null) {
                        tmVar.f();
                    }
                    this.Q4 = false;
                    this.N4 = n95Var;
                    this.O4 = n95Var.getRenderer();
                    if (!v5 && !u5) {
                        this.b.addView(wb5Var, qoe.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (wb5Var != null) {
                        boolean z4 = (u5 || v5 || gm.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = wb5Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new oq1(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new w55(this, b));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.u4 = linearLayout;
                            j85 j85Var = new j85(getContext(), linearLayout, linearLayout2);
                            j85Var.setMinimumWidth(gm.L(240.0f));
                            j85Var.setOrientation(1);
                            boolean z5 = z4;
                            int R0 = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, cmb.jh, false));
                            if (linearLayout2 == null || wb5Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                e95Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                j85Var.addView(linearLayout2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                e95Var = new e95(this, getContext(), participant);
                                linearLayout2.addView(e95Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(gm.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            j85Var.addView(linearLayout, qoe.k(0.0f, e95Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            xd xdVar = new xd(getContext(), j85Var);
                            xdVar.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(xdVar, qoe.c(-2.0f, -2));
                            long B1 = k47.B1(participant.peer);
                            e95 e95Var2 = e95Var;
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z6 = participant.peer instanceof TLRPC.TL_peerUser;
                            j5 j5Var = this.n1;
                            if (!z6) {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                            } else if (sd2.T(this.S2)) {
                                oc7 r1 = oc7.r1(j5Var.a);
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num = 6;
                                num2 = 8;
                                long j2 = participant.peer.user_id;
                                num3 = valueOf2;
                                viewGroup = linearLayout;
                                vh6 vh6Var = (vh6) r1.q1.f(Z0());
                                TLRPC.ChannelParticipant channelParticipant = vh6Var == null ? null : (TLRPC.ChannelParticipant) vh6Var.f(j2);
                                if (channelParticipant != null) {
                                    if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
                                    }
                                    z = true;
                                }
                                z = false;
                            } else {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                                TLRPC.ChatFull M0 = oc7.r1(j5Var.a).M0(Z0());
                                if (M0 != null && (chatParticipants = M0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i5);
                                        TLRPC.ChatFull chatFull = M0;
                                        int i6 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i5++;
                                            M0 = chatFull;
                                            size = i6;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z = false;
                            }
                            if (wb5Var.c()) {
                                if (g1() && wb5Var.L) {
                                    str = null;
                                    b10.r(null, 2131743078, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(jb6.M0(wb5Var.b.getImageReceiver().E() ? 2131743189 : 2131742926, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                String str4 = participant.about;
                                if (B1 > 0) {
                                    if (TextUtils.isEmpty(str4)) {
                                        i4 = 2131743191;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i4 = 2131743101;
                                    }
                                    arrayList.add(jb6.M0(i4, str3));
                                } else {
                                    arrayList.add(jb6.M0(TextUtils.isEmpty(str4) ? 2131743190 : 2131743100, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (B1 > 0) {
                                    i3 = 2131743099;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i3 = 2131743098;
                                }
                                arrayList.add(jb6.M0(i3, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (G0()) {
                                if (!g1() && z && participant.muted) {
                                    if (g1() && participant.muted_by_you) {
                                        b10.s(null, 2131743002, arrayList, arrayList2, valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    b10.s(null, 2131743043, arrayList, arrayList2, num3);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(jb6.M0(2131743084, null));
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(valueOf3);
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j3 = peer.channel_id;
                                    if (j3 != 0 && !sd2.m0(this.a, j3)) {
                                        b10.r(null, 2131743037, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num2);
                                        if (g1()) {
                                            i = z ? 2 : 2;
                                        } else {
                                            qd2 qd2Var = this.T2;
                                            if (qd2Var != null && (groupCall = qd2Var.b) != null && groupCall.creator) {
                                                b10.r(null, 2131742995, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i));
                                            }
                                        }
                                    }
                                }
                                b10.r(null, 2131743035, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num);
                                if (g1()) {
                                }
                            } else {
                                Integer num4 = num;
                                Integer num5 = num2;
                                if (participant.muted_by_you) {
                                    b10.s(null, 2131743002, arrayList, arrayList2, valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    b10.s(null, 2131743042, arrayList, arrayList2, num3);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j4 = peer2.channel_id;
                                    if (j4 != 0 && !sd2.m0(this.a, j4)) {
                                        b10.s(null, 2131743037, arrayList, arrayList2, valueOf);
                                        arrayList3.add(num5);
                                    }
                                }
                                b10.s(null, 2131743036, arrayList, arrayList2, valueOf);
                                arrayList3.add(num4);
                            }
                            int size2 = arrayList.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                a8 a8Var = new a8(getContext(), i7 == 0, i7 == size2 + (-1));
                                if (((Integer) arrayList3.get(i7)).intValue() != 2) {
                                    int i8 = cmb.Xg;
                                    z3 = false;
                                    r5 = 0;
                                    a8Var.d(cmb.w0(null, i8, false), cmb.w0(null, i8, false));
                                } else {
                                    z3 = false;
                                    r5 = 0;
                                    int i9 = cmb.lh;
                                    a8Var.d(cmb.w0(null, i9, false), cmb.w0(null, i9, false));
                                }
                                a8Var.setSelectorColor(cmb.w0(r5, cmb.Ug, z3));
                                a8Var.j((CharSequence) arrayList.get(i7), ((Integer) arrayList2.get(i7)).intValue(), r5);
                                viewGroup.addView(a8Var);
                                a8Var.setTag(arrayList3.get(i7));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                a8Var.setOnClickListener(new ph((Object) this, i7, (Object) arrayList4, (Object) groupCallParticipant, (byte) 4));
                                i7++;
                                arrayList3 = arrayList4;
                                participant = groupCallParticipant;
                            }
                            xdVar.addView(j85Var, qoe.x(-2, -2, 51));
                            p85 p85Var = this.J1;
                            p85Var.D0();
                            this.R1.X = false;
                            this.M4 = wb5Var;
                            wb5Var.setAboutVisible(true);
                            this.b.invalidate();
                            p85Var.invalidate();
                            AnimatorSet animatorSet = this.T4;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            this.X3 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            if (B1 > 0) {
                                int i10 = j5Var.a;
                                int i11 = j5Var.a;
                                TLRPC.User W1 = oc7.r1(i10).W1(Long.valueOf(B1));
                                m = gn5.m(i11, 0, W1);
                                m2 = gn5.m(i11, 1, W1);
                                j = B1;
                                if (oc7.r1(this.a).X1(j) == null) {
                                    oc7.r1(this.a).k3(0, W1, false);
                                }
                            } else {
                                j = B1;
                                int i12 = j5Var.a;
                                int i13 = j5Var.a;
                                TLRPC.Chat L0 = oc7.r1(i12).L0(Long.valueOf(-j));
                                m = gn5.m(i13, 0, L0);
                                m2 = gn5.m(i13, 1, L0);
                            }
                            ha5 ha5Var = this.O4;
                            boolean z7 = ha5Var != null && ha5Var.w;
                            if (m != null || z7) {
                                if (z5) {
                                    bf0 avatarImageView = this.M4.getAvatarImageView();
                                    e75 e75Var = this.l1;
                                    e75Var.setParentAvatarImage(avatarImageView);
                                    e75Var.setHasActiveVideo(z7);
                                    e75Var.M(j, true);
                                    e75Var.setCreateThumbFromParent(true);
                                    e75Var.H(null, m, m2, true);
                                    ha5 ha5Var2 = this.O4;
                                    if (ha5Var2 != null) {
                                        ha5Var2.h = true;
                                        ha5Var2.j(true);
                                    }
                                    if (k47.B1(this.u2) == j && this.a4 != null && (r85Var = this.b4) != null && (fileLocation = r85Var.c) != null) {
                                        e75Var.A(r85Var.d, gn5.e(fileLocation));
                                    }
                                }
                                z2 = z5;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                boolean z8 = true;
                                this.Y3 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.X3, qoe.c(-2.0f, -2));
                                this.Z3 = true;
                                i75 i75Var = this.U3;
                                if (i75Var == null) {
                                    i2 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.u0 << 1)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - gm.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -gm.m);
                                    this.b2.N().getView().draw(canvas);
                                    canvas.drawColor(on2.p(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -gm.m);
                                    this.v4 = true;
                                    this.b.draw(canvas);
                                    i2 = 0;
                                    this.v4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / nm7.J2));
                                    i75Var.setBackground(new BitmapDrawable(createBitmap));
                                    i75Var.setAlpha(0.0f);
                                    i75Var.setVisibility(0);
                                    i75Var.bringToFront();
                                    z8 = true;
                                }
                                this.R4 = z8;
                                this.s4.setVisibility(i2);
                                if (e95Var2 != null) {
                                    e95Var2.invalidate();
                                }
                                s1(z8, wb5Var);
                                l95 l95Var = this.P4;
                                if (l95Var != null) {
                                    l95Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return z8;
                            }
                            this.Y3 = false;
                            k85 k85Var2 = new k85(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            this.U4 = k85Var2;
                            k85Var2.e = true;
                            k85Var2.c = (short) 220;
                            k85Var2.setOutsideTouchable(true);
                            this.U4.setClippingEnabled(true);
                            this.U4.setAnimationStyle(R.style.PopupContextAnimation);
                            this.U4.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                            this.U4.setInputMethodMode(2);
                            this.U4.setSoftInputMode(0);
                            this.U4.getContentView().setFocusableInTouchMode(true);
                            l95 l95Var2 = this.P4;
                            if (l95Var2 != null) {
                                boolean z9 = u5;
                                c75 c75Var = this.T3;
                                y65 y65Var = this.e4;
                                if (z9) {
                                    x = gm.L(32.0f) + (((int) (c75Var.getX() + (y65Var.getX() + l95Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                    y = ((int) (c75Var.getY() + (y65Var.getY() + this.P4.getY()))) - gm.L(6.0f);
                                } else {
                                    int x2 = ((int) (c75Var.getX() + (y65Var.getX() + l95Var2.getX()))) - gm.L(14.0f);
                                    y = (int) ((c75Var.getY() + (y65Var.getY() + this.P4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight());
                                    x = x2;
                                }
                            } else {
                                x = (int) (((p85Var.getX() + p85Var.getMeasuredWidth()) + gm.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                if (this.Q4) {
                                    y2 = wb5Var.getY() + p85Var.getY();
                                    measuredHeight = wb5Var.getClipHeight();
                                } else if (this.N4 != null) {
                                    y2 = this.N4.getY() + p85Var.getY();
                                    measuredHeight = this.N4.getMeasuredHeight();
                                } else {
                                    y = (int) p85Var.getY();
                                }
                                y = (int) (y2 + measuredHeight);
                            }
                            this.U4.showAtLocation(p85Var, 51, x, y);
                            this.T4 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.L4, so.b, 0, 100));
                            this.T4.playTogether(arrayList5);
                            this.T4.setDuration(150L);
                            this.T4.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof l95) {
                    l95 l95Var3 = (l95) view;
                    if (l95Var3.getParticipant() != this.T2.z.a) {
                        wb5Var = new wb5(l95Var3.getContext());
                        wb5Var.e(this.n1, l95Var3.getParticipant(), this.T2, k47.B1(this.u2), null, false);
                        tm tmVar2 = wb5Var.s;
                        if (tmVar2 != null) {
                            tmVar2.f();
                        }
                        this.Q4 = false;
                        this.P4 = l95Var3;
                        ha5 renderer = l95Var3.getRenderer();
                        this.O4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.O4 = null;
                        }
                        this.b.addView(wb5Var, qoe.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    wb5Var = (wb5) view;
                    this.Q4 = true;
                }
                if (wb5Var != null) {
                }
            }
        }
        return false;
    }

    public final void B1(View view) {
        if (this.f2 == null) {
            ig5 ig5Var = new ig5(8, null, getContext(), true);
            this.f2 = ig5Var;
            ig5Var.setAlpha(0.0f);
            this.f2.setVisibility(4);
            this.f2.setShowingDuration(3000L);
            this.b.addView(this.f2, qoe.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            boolean W = sd2.W(this.S2);
            ig5 ig5Var2 = this.f2;
            if (W) {
                ig5Var2.setText(jb6.M0(2131743149, null));
            } else {
                ig5Var2.setText(jb6.M0(2131743031, null));
            }
            this.f2.b();
        }
        this.f2.setExtraTranslationY(-gm.m);
        this.f2.c(view);
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final void C1() {
        qd2 qd2Var = this.T2;
        if (qd2Var == null || qd2Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        qd2 qd2Var2 = this.T2;
        togglegroupcallsettings.call = qd2Var2.h(qd2Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(this.T2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        mp3 mp3Var = Utilities.d;
        Objects.requireNonNull(mp3Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new rf2(mp3Var, (byte) 0), new f65(this, (byte) 1));
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 2) {
            O0();
            M0();
            N0();
            float f3 = 1.0f - this.o5.e;
            p65 p65Var = this.o1;
            p65Var.setAlpha(f3);
            this.T3.setProgressToHideUi(f);
            this.e4.invalidate();
            this.b.invalidate();
            p65Var.invalidate();
        }
        if (i == 3) {
            P0();
            O0();
            Q0();
            L0();
            this.b.invalidate();
        }
        if (i == 4) {
            O0();
            this.z1.invalidate();
            this.A1.invalidate();
        }
        if (i == 5) {
            O0();
            this.b.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244 A[EDGE_INSN: B:119:0x0244->B:120:0x0244 BREAK  A[LOOP:2: B:94:0x0200->B:101:0x023f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ad A[LOOP:3: B:140:0x02a7->B:142:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d A[LOOP:1: B:88:0x019b->B:89:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0(boolean z) {
        p85 p85Var;
        b95 b95Var;
        c75 c75Var;
        p85 p85Var2;
        boolean z2;
        int i;
        ArrayList arrayList;
        int i2;
        int size;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        p85 p85Var3;
        c75 c75Var2;
        boolean z3;
        y65 y65Var;
        ?? r0;
        ?? r8;
        qd2 qd2Var;
        boolean z4;
        rd2 rd2Var;
        rd2 rd2Var2;
        u69 G;
        lj4 lj4Var;
        g95 g95Var = this;
        b95 b95Var2 = g95Var.I1;
        c75 c75Var3 = g95Var.T3;
        if (c75Var3 == null || (p85Var = g95Var.J1) == null || g95Var.T2 == null || g95Var.l2) {
            return;
        }
        if (c75Var3.b) {
            c75Var3.setVisibleParticipant(true);
        }
        long B1 = k47.B1(g95Var.T2.J);
        if (B1 != k47.B1(g95Var.u2) && g95Var.T2.d.f(B1) != null) {
            g95Var.u2 = g95Var.T2.J;
        }
        int childCount = p85Var.getChildCount();
        int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = p85Var.getChildAt(i8);
            u69 G2 = p85Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i6)) {
                i7 = G2.c();
                i6 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = g95Var.j2;
        arrayList3.clear();
        if (!v5) {
            arrayList3.addAll(g95Var.T2.f);
        } else if (c75Var3.b) {
            arrayList3.addAll(g95Var.T2.f);
            rd2 rd2Var3 = c75Var3.e;
            if (rd2Var3 != null) {
                arrayList3.remove(rd2Var3);
            }
        }
        if (p85Var.getItemAnimator() != null && !z) {
            p85Var.setItemAnimator(null);
        } else if (p85Var.getItemAnimator() == null && z) {
            p85Var.setItemAnimator(g95Var.Q1);
        }
        try {
            lj4Var = new lj4(b95Var2);
            try {
                try {
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    b95Var = b95Var2;
                    z2 = true;
                }
            } catch (Exception e2) {
                e = e2;
                b95Var = b95Var2;
                p85Var2 = p85Var;
                z2 = true;
                i = childCount;
                arrayList = arrayList3;
                i2 = i7;
                c75Var = c75Var3;
            }
        } catch (Exception e3) {
            e = e3;
            b95Var = b95Var2;
            c75Var = c75Var3;
            p85Var2 = p85Var;
            z2 = true;
            i = childCount;
            arrayList = arrayList3;
            i2 = i7;
        }
        try {
            try {
                try {
                    int i9 = i7;
                    try {
                        c75Var = c75Var3;
                    } catch (Exception e4) {
                        e = e4;
                        c75Var = c75Var3;
                    }
                    try {
                        p85Var2 = p85Var;
                        try {
                            try {
                                try {
                                    try {
                                        arrayList = arrayList3;
                                        i2 = i9;
                                        i = childCount;
                                        g95Var = this;
                                        b95Var = b95Var2;
                                        try {
                                            g95Var.x1(b95Var2.L, b95Var2.x, b95Var2.d, b95Var2.e, b95Var2.f, b95Var2.h, b95Var2.n, b95Var2.r, b95Var2.s, b95Var2.w, b95Var2.H, b95Var2.I, b95Var2.J, b95Var2.K, b95Var2.y, b95Var2.E);
                                            b95Var.E();
                                            z2 = true;
                                            try {
                                                ww7.a(g95Var.l5, true).b(lj4Var);
                                            } catch (Exception e5) {
                                                e = e5;
                                                fc4.g(e, z2);
                                                b95Var.f();
                                                ArrayList arrayList4 = g95Var.T2.e;
                                                size = arrayList4.size();
                                                while (i3 < size) {
                                                }
                                                if (view != null) {
                                                }
                                                ArrayList arrayList5 = g95Var.x2;
                                                arrayList5.clear();
                                                arrayList5.addAll(g95Var.T2.g);
                                                ArrayList arrayList6 = g95Var.y2;
                                                arrayList6.clear();
                                                arrayList2 = arrayList;
                                                arrayList6.addAll(arrayList2);
                                                ArrayList arrayList7 = g95Var.z2;
                                                arrayList7.clear();
                                                arrayList7.addAll(g95Var.T2.j);
                                                ArrayList arrayList8 = g95Var.A2;
                                                arrayList8.clear();
                                                arrayList8.addAll(g95Var.T2.m);
                                                ArrayList arrayList9 = g95Var.B2;
                                                arrayList9.clear();
                                                arrayList9.addAll(g95Var.T2.l);
                                                b95 b95Var3 = b95Var;
                                                g95Var.C2 = b95Var3.G;
                                                i4 = i;
                                                i5 = 0;
                                                while (true) {
                                                    p85Var3 = p85Var2;
                                                    if (i5 < i4) {
                                                    }
                                                    i5++;
                                                    p85Var2 = p85Var3;
                                                }
                                                boolean c = c75Var.c();
                                                c75Var2 = c75Var;
                                                if (c75Var2.b) {
                                                    if (!arrayList2.isEmpty()) {
                                                    }
                                                    m95 m95Var = g95Var.h4;
                                                    y65Var = g95Var.e4;
                                                    m95Var.G(y65Var, z2);
                                                    if (y65Var.getVisibility() == 0) {
                                                    }
                                                    if (v5) {
                                                    }
                                                    if (p85Var3.getVisibility() == 0) {
                                                    }
                                                    r0 = g95Var.S3;
                                                    r0.clear();
                                                    r0.addAll(g95Var.R3);
                                                    while (r8 < r0.size()) {
                                                    }
                                                    qd2Var = g95Var.T2;
                                                    if (qd2Var != null) {
                                                    }
                                                    qd2 qd2Var2 = g95Var.T2;
                                                    if (qd2Var2 != null) {
                                                    }
                                                    g95Var.r5.a(z4, z);
                                                    if (z4 == g95Var.y4) {
                                                    }
                                                }
                                                z3 = false;
                                                m95 m95Var2 = g95Var.h4;
                                                y65Var = g95Var.e4;
                                                m95Var2.G(y65Var, z2);
                                                if (y65Var.getVisibility() == 0) {
                                                }
                                                if (v5) {
                                                }
                                                if (p85Var3.getVisibility() == 0) {
                                                }
                                                r0 = g95Var.S3;
                                                r0.clear();
                                                r0.addAll(g95Var.R3);
                                                while (r8 < r0.size()) {
                                                }
                                                qd2Var = g95Var.T2;
                                                if (qd2Var != null) {
                                                }
                                                qd2 qd2Var22 = g95Var.T2;
                                                if (qd2Var22 != null) {
                                                }
                                                g95Var.r5.a(z4, z);
                                                if (z4 == g95Var.y4) {
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            z2 = true;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        g95Var = this;
                                        arrayList = arrayList3;
                                        i2 = i9;
                                        z2 = true;
                                        i = childCount;
                                        b95Var = b95Var2;
                                        fc4.g(e, z2);
                                        b95Var.f();
                                        ArrayList arrayList42 = g95Var.T2.e;
                                        size = arrayList42.size();
                                        while (i3 < size) {
                                        }
                                        if (view != null) {
                                        }
                                        ArrayList arrayList52 = g95Var.x2;
                                        arrayList52.clear();
                                        arrayList52.addAll(g95Var.T2.g);
                                        ArrayList arrayList62 = g95Var.y2;
                                        arrayList62.clear();
                                        arrayList2 = arrayList;
                                        arrayList62.addAll(arrayList2);
                                        ArrayList arrayList72 = g95Var.z2;
                                        arrayList72.clear();
                                        arrayList72.addAll(g95Var.T2.j);
                                        ArrayList arrayList82 = g95Var.A2;
                                        arrayList82.clear();
                                        arrayList82.addAll(g95Var.T2.m);
                                        ArrayList arrayList92 = g95Var.B2;
                                        arrayList92.clear();
                                        arrayList92.addAll(g95Var.T2.l);
                                        b95 b95Var32 = b95Var;
                                        g95Var.C2 = b95Var32.G;
                                        i4 = i;
                                        i5 = 0;
                                        while (true) {
                                            p85Var3 = p85Var2;
                                            if (i5 < i4) {
                                            }
                                            i5++;
                                            p85Var2 = p85Var3;
                                        }
                                        boolean c2 = c75Var.c();
                                        c75Var2 = c75Var;
                                        if (c75Var2.b) {
                                        }
                                        z3 = false;
                                        m95 m95Var22 = g95Var.h4;
                                        y65Var = g95Var.e4;
                                        m95Var22.G(y65Var, z2);
                                        if (y65Var.getVisibility() == 0) {
                                        }
                                        if (v5) {
                                        }
                                        if (p85Var3.getVisibility() == 0) {
                                        }
                                        r0 = g95Var.S3;
                                        r0.clear();
                                        r0.addAll(g95Var.R3);
                                        while (r8 < r0.size()) {
                                        }
                                        qd2Var = g95Var.T2;
                                        if (qd2Var != null) {
                                        }
                                        qd2 qd2Var222 = g95Var.T2;
                                        if (qd2Var222 != null) {
                                        }
                                        g95Var.r5.a(z4, z);
                                        if (z4 == g95Var.y4) {
                                        }
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                i = childCount;
                                arrayList = arrayList3;
                                i2 = i9;
                                z2 = true;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i = childCount;
                            arrayList = arrayList3;
                            i2 = i9;
                            b95Var = b95Var2;
                            fc4.g(e, z2);
                            b95Var.f();
                            ArrayList arrayList422 = g95Var.T2.e;
                            size = arrayList422.size();
                            while (i3 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList522 = g95Var.x2;
                            arrayList522.clear();
                            arrayList522.addAll(g95Var.T2.g);
                            ArrayList arrayList622 = g95Var.y2;
                            arrayList622.clear();
                            arrayList2 = arrayList;
                            arrayList622.addAll(arrayList2);
                            ArrayList arrayList722 = g95Var.z2;
                            arrayList722.clear();
                            arrayList722.addAll(g95Var.T2.j);
                            ArrayList arrayList822 = g95Var.A2;
                            arrayList822.clear();
                            arrayList822.addAll(g95Var.T2.m);
                            ArrayList arrayList922 = g95Var.B2;
                            arrayList922.clear();
                            arrayList922.addAll(g95Var.T2.l);
                            b95 b95Var322 = b95Var;
                            g95Var.C2 = b95Var322.G;
                            i4 = i;
                            i5 = 0;
                            while (true) {
                                p85Var3 = p85Var2;
                                if (i5 < i4) {
                                }
                                i5++;
                                p85Var2 = p85Var3;
                            }
                            boolean c22 = c75Var.c();
                            c75Var2 = c75Var;
                            if (c75Var2.b) {
                            }
                            z3 = false;
                            m95 m95Var222 = g95Var.h4;
                            y65Var = g95Var.e4;
                            m95Var222.G(y65Var, z2);
                            if (y65Var.getVisibility() == 0) {
                            }
                            if (v5) {
                            }
                            if (p85Var3.getVisibility() == 0) {
                            }
                            r0 = g95Var.S3;
                            r0.clear();
                            r0.addAll(g95Var.R3);
                            while (r8 < r0.size()) {
                            }
                            qd2Var = g95Var.T2;
                            if (qd2Var != null) {
                            }
                            qd2 qd2Var2222 = g95Var.T2;
                            if (qd2Var2222 != null) {
                            }
                            g95Var.r5.a(z4, z);
                            if (z4 == g95Var.y4) {
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        p85Var2 = p85Var;
                        i = childCount;
                        arrayList = arrayList3;
                        i2 = i9;
                        b95Var = b95Var2;
                        fc4.g(e, z2);
                        b95Var.f();
                        ArrayList arrayList4222 = g95Var.T2.e;
                        size = arrayList4222.size();
                        while (i3 < size) {
                        }
                        if (view != null) {
                        }
                        ArrayList arrayList5222 = g95Var.x2;
                        arrayList5222.clear();
                        arrayList5222.addAll(g95Var.T2.g);
                        ArrayList arrayList6222 = g95Var.y2;
                        arrayList6222.clear();
                        arrayList2 = arrayList;
                        arrayList6222.addAll(arrayList2);
                        ArrayList arrayList7222 = g95Var.z2;
                        arrayList7222.clear();
                        arrayList7222.addAll(g95Var.T2.j);
                        ArrayList arrayList8222 = g95Var.A2;
                        arrayList8222.clear();
                        arrayList8222.addAll(g95Var.T2.m);
                        ArrayList arrayList9222 = g95Var.B2;
                        arrayList9222.clear();
                        arrayList9222.addAll(g95Var.T2.l);
                        b95 b95Var3222 = b95Var;
                        g95Var.C2 = b95Var3222.G;
                        i4 = i;
                        i5 = 0;
                        while (true) {
                            p85Var3 = p85Var2;
                            if (i5 < i4) {
                            }
                            i5++;
                            p85Var2 = p85Var3;
                        }
                        boolean c222 = c75Var.c();
                        c75Var2 = c75Var;
                        if (c75Var2.b) {
                        }
                        z3 = false;
                        m95 m95Var2222 = g95Var.h4;
                        y65Var = g95Var.e4;
                        m95Var2222.G(y65Var, z2);
                        if (y65Var.getVisibility() == 0) {
                        }
                        if (v5) {
                        }
                        if (p85Var3.getVisibility() == 0) {
                        }
                        r0 = g95Var.S3;
                        r0.clear();
                        r0.addAll(g95Var.R3);
                        while (r8 < r0.size()) {
                        }
                        qd2Var = g95Var.T2;
                        if (qd2Var != null) {
                        }
                        qd2 qd2Var22222 = g95Var.T2;
                        if (qd2Var22222 != null) {
                        }
                        g95Var.r5.a(z4, z);
                        if (z4 == g95Var.y4) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    i2 = i7;
                    c75Var = c75Var3;
                    p85Var2 = p85Var;
                    i = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e13) {
                e = e13;
                b95Var = b95Var2;
                arrayList = arrayList3;
                i2 = i7;
                c75Var = c75Var3;
                p85Var2 = p85Var;
                i = childCount;
            }
        } catch (Exception e14) {
            e = e14;
            b95Var = b95Var2;
            i = childCount;
            arrayList = arrayList3;
            i2 = i7;
            c75Var = c75Var3;
            p85Var2 = p85Var;
            fc4.g(e, z2);
            b95Var.f();
            ArrayList arrayList42222 = g95Var.T2.e;
            size = arrayList42222.size();
            while (i3 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = g95Var.x2;
            arrayList52222.clear();
            arrayList52222.addAll(g95Var.T2.g);
            ArrayList arrayList62222 = g95Var.y2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = g95Var.z2;
            arrayList72222.clear();
            arrayList72222.addAll(g95Var.T2.j);
            ArrayList arrayList82222 = g95Var.A2;
            arrayList82222.clear();
            arrayList82222.addAll(g95Var.T2.m);
            ArrayList arrayList92222 = g95Var.B2;
            arrayList92222.clear();
            arrayList92222.addAll(g95Var.T2.l);
            b95 b95Var32222 = b95Var;
            g95Var.C2 = b95Var32222.G;
            i4 = i;
            i5 = 0;
            while (true) {
                p85Var3 = p85Var2;
                if (i5 < i4) {
                }
                i5++;
                p85Var2 = p85Var3;
            }
            boolean c2222 = c75Var.c();
            c75Var2 = c75Var;
            if (c75Var2.b) {
            }
            z3 = false;
            m95 m95Var22222 = g95Var.h4;
            y65Var = g95Var.e4;
            m95Var22222.G(y65Var, z2);
            if (y65Var.getVisibility() == 0) {
            }
            if (v5) {
            }
            if (p85Var3.getVisibility() == 0) {
            }
            r0 = g95Var.S3;
            r0.clear();
            r0.addAll(g95Var.R3);
            while (r8 < r0.size()) {
            }
            qd2Var = g95Var.T2;
            if (qd2Var != null) {
            }
            qd2 qd2Var222222 = g95Var.T2;
            if (qd2Var222222 != null) {
            }
            g95Var.r5.a(z4, z);
            if (z4 == g95Var.y4) {
            }
        }
        ArrayList arrayList422222 = g95Var.T2.e;
        size = arrayList422222.size();
        for (i3 = 0; i3 < size; i3++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i3)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            g95Var.R1.g1(i2, view.getTop() - p85Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = g95Var.x2;
        arrayList522222.clear();
        arrayList522222.addAll(g95Var.T2.g);
        ArrayList arrayList622222 = g95Var.y2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = g95Var.z2;
        arrayList722222.clear();
        arrayList722222.addAll(g95Var.T2.j);
        ArrayList arrayList822222 = g95Var.A2;
        arrayList822222.clear();
        arrayList822222.addAll(g95Var.T2.m);
        ArrayList arrayList922222 = g95Var.B2;
        arrayList922222.clear();
        arrayList922222.addAll(g95Var.T2.l);
        b95 b95Var322222 = b95Var;
        g95Var.C2 = b95Var322222.G;
        i4 = i;
        i5 = 0;
        while (true) {
            p85Var3 = p85Var2;
            if (i5 < i4) {
                break;
            }
            View childAt2 = p85Var3.getChildAt(i5);
            if (((childAt2 instanceof wb5) || (childAt2 instanceof o95)) && (G = p85Var3.G(childAt2)) != null) {
                if (childAt2 instanceof wb5) {
                    ((wb5) childAt2).setDrawDivider(G.b() != b95Var322222.G + (-2) ? z2 : false);
                } else {
                    ((o95) childAt2).setDrawDivider(G.b() != b95Var322222.G + (-2) ? z2 : false);
                }
            }
            i5++;
            p85Var2 = p85Var3;
        }
        boolean c22222 = c75Var.c();
        c75Var2 = c75Var;
        if (c75Var2.b && (rd2Var2 = c75Var2.e) != null && !qd2.E(rd2Var2.a, rd2Var2.b, g95Var.T2)) {
            if (!arrayList2.isEmpty()) {
                z3 = false;
                g95Var.V0(null);
            } else if (c22222) {
                z3 = false;
                g95Var.V0((rd2) arrayList2.get(0));
            }
            m95 m95Var222222 = g95Var.h4;
            y65Var = g95Var.e4;
            m95Var222222.G(y65Var, z2);
            if (y65Var.getVisibility() == 0) {
                gm.V3(y65Var);
            }
            if (v5) {
                g95Var.g4.I(g95Var.f4, z2);
            }
            if (p85Var3.getVisibility() == 0) {
                gm.V3(p85Var3);
            }
            r0 = g95Var.S3;
            r0.clear();
            r0.addAll(g95Var.R3);
            for (r8 = z3; r8 < r0.size(); r8++) {
                ((ha5) r0.get(r8)).j(z2);
            }
            qd2Var = g95Var.T2;
            if (qd2Var != null && c75Var2.b && (rd2Var = c75Var2.e) != null) {
                qd2Var.d.f(k47.B1(rd2Var.a.peer));
            }
            qd2 qd2Var2222222 = g95Var.T2;
            z4 = (qd2Var2222222 != null || qd2Var2222222.f.isEmpty()) ? z3 : z2;
            g95Var.r5.a(z4, z);
            if (z4 == g95Var.y4) {
                g95Var.y4 = z4;
                if (v5) {
                    g95Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z3 = false;
        m95 m95Var2222222 = g95Var.h4;
        y65Var = g95Var.e4;
        m95Var2222222.G(y65Var, z2);
        if (y65Var.getVisibility() == 0) {
        }
        if (v5) {
        }
        if (p85Var3.getVisibility() == 0) {
        }
        r0 = g95Var.S3;
        r0.clear();
        r0.addAll(g95Var.R3);
        while (r8 < r0.size()) {
        }
        qd2Var = g95Var.T2;
        if (qd2Var != null) {
            qd2Var.d.f(k47.B1(rd2Var.a.peer));
        }
        qd2 qd2Var22222222 = g95Var.T2;
        if (qd2Var22222222 != null) {
        }
        g95Var.r5.a(z4, z);
        if (z4 == g95Var.y4) {
        }
    }

    public final void D1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        qd2 qd2Var = this.T2;
        dkc dkcVar = this.u1;
        dkc dkcVar2 = this.q1;
        dkc dkcVar3 = this.s1;
        dkc dkcVar4 = this.p1;
        dkc dkcVar5 = this.r1;
        dkc dkcVar6 = this.t1;
        dkc dkcVar7 = this.v1;
        p65 p65Var = this.o1;
        boolean z7 = false;
        if (qd2Var == null || qd2Var.k()) {
            p65Var.c(dkcVar7, this.O2 > 0.1f, z);
            p65Var.c(dkcVar6, this.O2 > 0.1f, z);
            p65Var.c(dkcVar3, this.O2 > 0.1f, z);
            p65Var.c(dkcVar5, false, z);
            p65Var.c(dkcVar4, false, z);
            p65Var.c(dkcVar2, false, z);
            p65Var.c(dkcVar, false, z);
            return;
        }
        boolean z8 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
        boolean z9 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || G0()) ? false : true;
        Boolean bool = this.m5;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.T2.b;
            z2 = groupCall != null && groupCall.messages_enabled;
        }
        if ((z9 || !this.T2.c()) && !z8) {
            z3 = true;
            z4 = false;
        } else {
            z4 = true;
            z3 = false;
        }
        if (z8) {
            z6 = true;
            z5 = false;
        } else {
            z5 = !z9;
            z6 = false;
        }
        if (u5) {
            z5 = false;
        } else {
            z7 = z6;
        }
        p65Var.c(dkcVar7, true, z);
        p65Var.c(dkcVar6, true, z);
        p65Var.c(dkcVar5, z4, z);
        p65Var.c(dkcVar4, z7, z);
        p65Var.c(dkcVar3, z3, z);
        p65Var.c(dkcVar2, z5, z);
        p65Var.c(dkcVar, z2, z);
    }

    @Override // my0
    public final boolean E() {
        return !this.T3.b;
    }

    public final void E0(n95 n95Var, boolean z) {
        if (this.J) {
            return;
        }
        if (!z) {
            if (n95Var.getRenderer() != null) {
                n95Var.getRenderer().setPrimaryView(null);
                n95Var.setRenderer(null);
                return;
            }
            return;
        }
        if (n95Var.getRenderer() == null) {
            n95Var.setRenderer(ha5.c(this.R3, this.T3, n95Var, null, null, n95Var.getParticipant(), this.T2, this));
        }
    }

    public final void E1() {
        qd2 qd2Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        qd2 qd2Var2 = this.T2;
        r7 r7Var = this.b3;
        r7 r7Var2 = this.d3;
        if (qd2Var2 == null || qd2Var2.k()) {
            this.c3.setVisibility(4);
            r7Var2.setVisibility(8);
            if (this.T2 == null) {
                r7Var.setVisibility(8);
                return;
            }
        }
        if (this.e2) {
            return;
        }
        j5 j5Var = this.n1;
        TLRPC.Chat L0 = oc7.r1(j5Var.a).L0(Long.valueOf(Z0()));
        if (L0 != null) {
            this.S2 = L0;
        }
        boolean y = sd2.y(3, this.S2);
        a8 a8Var = this.e3;
        if (y || (((!sd2.T(this.S2) || ((chat2 = this.S2) != null && chat2.megagroup)) && (sd2.t0(this.S2) || sd2.y(3, this.S2))) || (sd2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && sd2.t0(chat)))) {
            a8Var.setVisibility(0);
        } else {
            a8Var.setVisibility(8);
        }
        qd2 qd2Var3 = this.T2;
        a8 a8Var2 = this.t3;
        a8 a8Var3 = this.s3;
        if (qd2Var3 == null || (groupCall2 = qd2Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            a8Var3.setVisibility(8);
            a8Var2.setVisibility(8);
        } else {
            a8Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            a8Var2.setVisibility(this.T2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
        qd2 qd2Var4 = this.T2;
        a8 a8Var4 = this.h3;
        if (qd2Var4 == null || qd2Var4.k() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            a8Var4.setVisibility(8);
        } else {
            a8Var4.setVisibility(0);
        }
        a8Var4.setIcon(gda.E0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        a8Var4.setSubtext(jb6.M0(gda.E0 ? 2131742964 : 2131742965, null));
        qd2 qd2Var5 = this.T2;
        int i = (qd2Var5 == null || qd2Var5.k() || !DictationAsr.E()) ? 8 : 0;
        a8 a8Var5 = this.i3;
        a8Var5.setVisibility(i);
        boolean a = q86.a();
        this.j3.a(a, false);
        a8Var5.setSubtext(jb6.M0(a ? 2131744983 : 2131744984, null));
        G1();
        boolean G0 = G0();
        a8 a8Var6 = this.r3;
        a8 a8Var7 = this.f3;
        a8 a8Var8 = this.n3;
        a8 a8Var9 = this.o3;
        if (G0) {
            a8Var6.setVisibility(0);
            a8Var7.setVisibility(0);
            if (i1()) {
                a8Var8.setVisibility(0);
                a8Var9.setVisibility(8);
            } else if (this.T2.k()) {
                a8Var8.setVisibility(8);
                a8Var9.setVisibility(8);
            } else {
                a8Var8.setVisibility(0);
            }
            if (g1()) {
                a8Var8.setVisibility(8);
                a8Var7.setVisibility(8);
            }
            if (!this.T2.c() || this.T2.k()) {
                a8Var9.setVisibility(8);
            } else {
                a8Var9.setVisibility(0);
            }
            r7Var2.setVisibility(8);
            boolean z = this.T2.w;
            c95 c95Var = this.W2;
            c95Var.f = z;
            c95Var.d = 1.0f;
            c95Var.invalidateSelf();
            boolean z2 = this.T2.w;
            v55 v55Var = this.x3;
            if (z2) {
                if (v55Var == null) {
                    v55 v55Var2 = new v55(this, (byte) 7);
                    this.x3 = v55Var2;
                    gm.d3(v55Var2, 1000L);
                }
                a8Var8.setText(jb6.M0(2131743007, null));
            } else {
                if (v55Var != null) {
                    gm.r(v55Var);
                    this.x3 = null;
                }
                a8Var8.setText(jb6.M0(2131743032, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                a8Var9.j(jb6.M0(2131743120, null), R.drawable.msg_screencast, null);
            } else {
                a8Var9.j(jb6.M0(2131743118, null), R.drawable.msg_screencast_off, null);
            }
            I1();
        } else {
            boolean z3 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || G0()) ? false : true;
            boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z3 || (!(this.T2.c() || z4) || this.T2.k())) {
                r7Var2.setVisibility(8);
                a8Var9.setVisibility(8);
            } else if (z4) {
                r7Var2.setVisibility(8);
                a8Var9.setVisibility(0);
                a8Var9.j(jb6.M0(2131743118, null), R.drawable.msg_screencast_off, null);
                a8Var9.setContentDescription(jb6.M0(2131743118, null));
            } else {
                a8Var9.j(jb6.M0(2131743120, null), R.drawable.msg_screencast, null);
                a8Var9.setContentDescription(jb6.M0(2131743120, null));
                r7Var2.setVisibility(8);
                a8Var9.setVisibility(0);
            }
            a8Var6.setVisibility(8);
            a8Var7.setVisibility(8);
            a8Var8.setVisibility(8);
        }
        boolean G02 = G0();
        a8 a8Var10 = this.m3;
        if (G02 && this.T2.b.can_change_join_muted && !g1()) {
            a8Var10.setVisibility(0);
        } else {
            a8Var10.setVisibility(8);
        }
        r7Var.Q(4, (g1() && ((qd2Var = this.T2) == null || (groupCall = qd2Var.b) == null || !groupCall.creator)) ? false : true);
        this.g3.setVisibility(0);
        int visibility = a8Var7.getVisibility();
        TextView textView = this.v3;
        if (visibility == 0 || a8Var10.getVisibility() == 0 || a8Var.getVisibility() == 0 || a8Var9.getVisibility() == 0 || a8Var8.getVisibility() == 0 || a8Var6.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        k5 k5Var = this.d2;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.U2) || i1() || this.u2 == null) {
            k5Var.setVisibility(8);
        } else {
            k5Var.setVisibility(0);
            long B1 = k47.B1(this.u2);
            boolean D = pg3.D(B1);
            int i2 = j5Var.a;
            k5Var.setObject(D ? oc7.r1(i2).W1(Long.valueOf(B1)) : oc7.r1(i2).L0(Long.valueOf(-B1)));
        }
        TLRPC.Chat chat3 = this.S2;
        if (chat3 == null || sd2.W(chat3) || !i1() || a8Var.getVisibility() != 8) {
            r7Var.setVisibility(0);
        } else {
            r7Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != gm.L(96.0f)) {
            layoutParams.rightMargin = gm.L(96.0f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.u3.getLayoutParams()).rightMargin = 0;
        this.H1.setTitleRightMargin(gm.L(48.0f) << 1);
    }

    public final int F0() {
        p85 p85Var = this.J1;
        int childCount = p85Var.getChildCount();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = p85Var.getChildAt(i2);
            if (RecyclerView.R(childAt) >= 0) {
                i = Math.min(i, childAt.getTop());
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F1() {
        Integer num;
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        p85 p85Var = this.J1;
        int childCount = p85Var.getChildCount();
        float f = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            if (RecyclerView.R(p85Var.getChildAt(i)) >= 0) {
                f = Math.min(f, r7.getTop());
            }
        }
        if (f < 0.0f || f == 2.1474836E9f) {
            f = childCount != 0 ? 0.0f : p85Var.getPaddingTop();
        }
        byte b = 1;
        boolean z = f <= ((float) (a.getCurrentActionBarHeight() - gm.L(14.0f)));
        float L = f + gm.L(14.0f) + a.getCurrentActionBarHeight();
        a85 a85Var = this.H1;
        Object tag = a85Var.getTag();
        if (z) {
            if (tag == null) {
                num = 1;
                a85Var.setTag(num);
                animatorSet = this.a2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.a2 = null;
                }
                z0(a85Var.getTag() != null);
                ViewPropertyAnimator duration = a85Var.getBackButton().animate().scaleX(!z ? 1.0f : 0.9f).scaleY(z ? 1.0f : 0.9f).translationX(!z ? 0.0f : -gm.L(14.0f)).setDuration(300L);
                d53 d53Var = d53.f;
                duration.setInterpolator(d53Var).start();
                a85Var.getTitleTextView().animate().translationY(!z ? 0.0f : gm.L(23.0f)).setDuration(300L).setInterpolator(d53Var).start();
                objectAnimator = this.J4;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.J4.cancel();
                }
                lka subtitleTextView = a85Var.getSubtitleTextView();
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<lka, Float>) property, a85Var.getSubtitleTextView().getTranslationY(), !z ? 0.0f : gm.L(20.0f));
                this.J4 = ofFloat;
                ofFloat.setDuration(300L);
                this.J4.setInterpolator(d53Var);
                this.J4.addListener(new jf4((byte) 4, this, z));
                this.J4.start();
                objectAnimator2 = this.K4;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a85Var.getAdditionalSubtitleTextView(), (Property<lka, Float>) property, !z ? 0.0f : gm.L(20.0f));
                this.K4 = ofFloat2;
                ofFloat2.setDuration(300L);
                this.K4.setInterpolator(d53Var);
                this.K4.start();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.a2 = animatorSet2;
                animatorSet2.setDuration(140L);
                AnimatorSet animatorSet3 = this.a2;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(a85Var, (Property<a85, Float>) property2, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G1, (Property<v65, Float>) property2, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<View, Float>) property2, !z ? 1.0f : 0.0f));
                this.a2.addListener(new f85(this, b));
                this.a2.start();
                this.T3.w.setClickable(z || u5);
            }
        } else if (tag != null) {
            num = null;
            a85Var.setTag(num);
            animatorSet = this.a2;
            if (animatorSet != null) {
            }
            z0(a85Var.getTag() != null);
            ViewPropertyAnimator duration2 = a85Var.getBackButton().animate().scaleX(!z ? 1.0f : 0.9f).scaleY(z ? 1.0f : 0.9f).translationX(!z ? 0.0f : -gm.L(14.0f)).setDuration(300L);
            d53 d53Var2 = d53.f;
            duration2.setInterpolator(d53Var2).start();
            a85Var.getTitleTextView().animate().translationY(!z ? 0.0f : gm.L(23.0f)).setDuration(300L).setInterpolator(d53Var2).start();
            objectAnimator = this.J4;
            if (objectAnimator != null) {
            }
            lka subtitleTextView2 = a85Var.getSubtitleTextView();
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(subtitleTextView2, (Property<lka, Float>) property3, a85Var.getSubtitleTextView().getTranslationY(), !z ? 0.0f : gm.L(20.0f));
            this.J4 = ofFloat3;
            ofFloat3.setDuration(300L);
            this.J4.setInterpolator(d53Var2);
            this.J4.addListener(new jf4((byte) 4, this, z));
            this.J4.start();
            objectAnimator2 = this.K4;
            if (objectAnimator2 != null) {
            }
            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(a85Var.getAdditionalSubtitleTextView(), (Property<lka, Float>) property3, !z ? 0.0f : gm.L(20.0f));
            this.K4 = ofFloat22;
            ofFloat22.setDuration(300L);
            this.K4.setInterpolator(d53Var2);
            this.K4.start();
            AnimatorSet animatorSet22 = new AnimatorSet();
            this.a2 = animatorSet22;
            animatorSet22.setDuration(140L);
            AnimatorSet animatorSet32 = this.a2;
            Property property22 = View.ALPHA;
            animatorSet32.playTogether(ObjectAnimator.ofFloat(a85Var, (Property<a85, Float>) property22, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G1, (Property<v65, Float>) property22, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<View, Float>) property22, !z ? 1.0f : 0.0f));
            this.a2.addListener(new f85(this, b));
            this.a2.start();
            this.T3.w.setClickable(z || u5);
        }
        if (this.s2 != L) {
            y1(L);
        }
    }

    public final boolean G0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return sd2.w(14, this.S2);
        }
        qd2 qd2Var = this.T2;
        return (qd2Var == null || (groupCall = qd2Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void G1() {
        qd2 qd2Var;
        if (this.l3 != null) {
            int i = 0;
            boolean z = q86.a() && (qd2Var = this.T2) != null && !qd2Var.k() && s5 == this;
            q86 q86Var = this.l3;
            if (!z) {
                if (q86Var.d) {
                    q86 q86Var2 = this.l3;
                    if (q86Var2.d) {
                        q86Var2.d = false;
                        Thread thread = q86Var2.e;
                        if (thread != null) {
                            thread.interrupt();
                            q86Var2.e = null;
                        }
                        try {
                            NativeInstance.setIncomingAudioCapture(false);
                        } catch (Throwable unused) {
                        }
                    }
                    t86 t86Var = this.k3;
                    t86Var.getClass();
                    ArrayList arrayList = new ArrayList(t86Var.a);
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        s86 s86Var = (s86) obj;
                        t86Var.a.remove(s86Var);
                        t86Var.removeView(s86Var);
                    }
                    return;
                }
                return;
            }
            if (q86Var.d) {
                return;
            }
            final q86 q86Var3 = this.l3;
            Context context = getContext();
            int i2 = this.n1.a;
            TLRPC.Chat chat = this.S2;
            long j = chat != null ? -chat.id : 0L;
            if (q86Var3.d) {
                return;
            }
            q86Var3.d = true;
            final in3 V = DictationAsr.V(bo3.c(context, j));
            boolean x = DictationAsr.x();
            q86Var3.c = x;
            if (x) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.a(context);
                }
            }
            StringBuilder sb = new StringBuilder("live captions: ");
            sb.append(V);
            ts2.w(sb, q86Var3.c ? ", tinylid" : "", "Dictation");
            DictationAsr.i0((gn3) V.b, false, new hn3() { // from class: n86
                @Override // hn3
                public final void a(boolean z2) {
                    q86 q86Var4 = q86.this;
                    in3 in3Var = V;
                    if (q86Var4.d) {
                        if (!z2) {
                            q86Var4.d = false;
                            return;
                        }
                        NativeInstance.setIncomingAudioCapture(true);
                        Thread thread2 = new Thread(new k16(q86Var4, in3Var, (byte) 8), "LiveCaptions");
                        q86Var4.e = thread2;
                        thread2.start();
                    }
                }
            });
        }
    }

    @Override // my0
    public final void H() {
        LaunchActivity launchActivity;
        qd2 qd2Var;
        qd2 qd2Var2;
        TLRPC.GroupCall groupCall;
        ArrayList arrayList = this.R3;
        ArrayList arrayList2 = this.S3;
        c75 c75Var = this.T3;
        if (c75Var != null) {
            if (this.i4 != null) {
                this.J1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                ((ha5) arrayList2.get(i)).f();
                c75Var.removeView((View) arrayList2.get(i));
                ((ha5) arrayList2.get(i)).e();
                ((ha5) arrayList2.get(i)).b(true);
            }
            arrayList.clear();
            if (c75Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(c75Var);
            }
        }
        q86 q86Var = this.l3;
        if (q86Var.d) {
            q86Var.d = false;
            Thread thread = q86Var.e;
            if (thread != null) {
                thread.interrupt();
                q86Var.e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.H();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (s5 == this) {
            s5 = null;
        }
        t5 = false;
        VoIPService.audioLevelsCallback = null;
        oa5.k(getContext());
        qd2 qd2Var3 = this.T2;
        if (qd2Var3 != null) {
            ArrayList arrayList3 = qd2Var3.e;
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).videoIndex = 0;
            }
            qd2Var3.B();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        if (!this.o2 || (launchActivity = this.b2) == null || launchActivity.isFinishing() || (qd2Var = this.T2) == null) {
            return;
        }
        LaunchActivity launchActivity2 = this.b2;
        j5 j5Var = this.n1;
        long j = qd2Var.b.id;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || (qd2Var2 = sharedInstance.groupCall) == null || (groupCall = qd2Var2.b) == null || groupCall.id != j) {
            nm7.e().a(new g85(j, launchActivity2, j5Var), nm7.v2);
        } else {
            S0(launchActivity2, j5Var, null, null, false, null);
        }
    }

    public final void H0() {
        if (this.K3) {
            this.K3 = false;
            gm.r(this.q4);
        }
        if (this.L3) {
            this.L3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.v1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H1(int i, boolean z) {
        boolean K;
        boolean K2;
        String M0;
        boolean z2;
        String str;
        boolean K3;
        boolean K4;
        boolean K5;
        byte b;
        f95[] f95VarArr;
        boolean z3;
        f95 f95Var;
        f95 f95Var2;
        boolean z4;
        boolean z5;
        int i2;
        if (!i1() && this.z3 == i && z) {
            return;
        }
        String str2 = "";
        p09 p09Var = this.D2;
        if (i == 7) {
            M0 = jb6.M0(2131743077, null);
            K5 = p09Var.K(nm7.f3);
        } else {
            if (i != 6) {
                if (i != 5) {
                    if (i == 0) {
                        M0 = jb6.M0(2131743001, null);
                        str2 = jb6.M0(2131742985, null);
                        byte b2 = this.z3;
                        if (b2 == 3) {
                            int i3 = p09Var.f;
                            K3 = (i3 == 136 || i3 == 173 || i3 == 274 || i3 == 311) ? p09Var.K(99) : false;
                        } else if (b2 == 5) {
                            K3 = p09Var.K(404);
                        } else if (b2 == 7) {
                            K3 = p09Var.K(376);
                        } else if (b2 == 6) {
                            K3 = p09Var.K(237);
                        } else if (b2 == 2) {
                            K4 = p09Var.K(36);
                        } else {
                            K3 = p09Var.K(99);
                        }
                    } else if (i == 1) {
                        M0 = jb6.M0(g1() ? 2131742916 : 2131742915, null);
                        K3 = p09Var.K(this.z3 == 4 ? 99 : 69);
                    } else if (g1() && i == 2) {
                        M0 = jb6.M0(2131742975, null);
                        K3 = p09Var.K(99);
                    } else {
                        if (i != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
                            boolean z6 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || G0()) ? false : true;
                            byte b3 = this.z3;
                            if (z6) {
                                K2 = b3 == 7 ? p09Var.K(nm7.h5) : b3 == 6 ? p09Var.K(nm7.w4) : b3 == 1 ? p09Var.K(nm7.C2) : p09Var.K(nm7.R1);
                            } else if (b3 == 5) {
                                K2 = p09Var.K(404);
                            } else if (b3 == 7) {
                                K2 = p09Var.K(376);
                            } else {
                                if (b3 != 6) {
                                    K = (b3 == 2 || b3 == 4) ? p09Var.K(36) : p09Var.K(99);
                                    if (i != 3) {
                                        M0 = jb6.M0(2131751746, null);
                                    } else {
                                        M0 = jb6.M0(2131742975, null);
                                        str2 = jb6.M0(2131742974, null);
                                    }
                                    z2 = z6;
                                    str = str2;
                                    String o = !TextUtils.isEmpty(str) ? kt6.o(M0, " ", str) : M0;
                                    dkc dkcVar = this.v1;
                                    dkcVar.setContentDescription(o);
                                    dkcVar.c(0, 0, 0, 1.0f, true, M0, false, z);
                                    q65 q65Var = this.w1;
                                    if (z) {
                                        if (K) {
                                            if (i == 5) {
                                                p09Var.H(376);
                                            } else if (i == 7) {
                                                p09Var.H(nm7.C2);
                                            } else if (i == 6) {
                                                p09Var.H(nm7.h5);
                                            } else if (i == 0) {
                                                byte b4 = this.z3;
                                                if (b4 == 5) {
                                                    p09Var.H(376);
                                                } else if (b4 == 7) {
                                                    p09Var.H(nm7.O5);
                                                } else if (b4 == 6) {
                                                    p09Var.H(nm7.f3);
                                                } else if (b4 == 2) {
                                                    p09Var.H(0);
                                                    i2 = 0;
                                                    q65Var.d();
                                                    q65Var.setVisibility(i2);
                                                    this.z3 = i;
                                                } else {
                                                    p09Var.H(69);
                                                }
                                            } else {
                                                if (i == 1 || (this.z3 == 2 && g1())) {
                                                    i2 = 0;
                                                    p09Var.H(this.z3 != 4 ? 36 : 69);
                                                } else if (i == 4) {
                                                    p09Var.H(99);
                                                } else {
                                                    byte b5 = this.z3;
                                                    if (z2) {
                                                        if (b5 == 7) {
                                                            p09Var.H(nm7.w4);
                                                        } else if (b5 == 6) {
                                                            p09Var.H(237);
                                                        } else if (b5 == 1) {
                                                            p09Var.H(nm7.R1);
                                                        } else {
                                                            p09Var.H(99);
                                                        }
                                                    } else if (b5 == 5) {
                                                        p09Var.H(376);
                                                    } else if (b5 == 7) {
                                                        p09Var.H(nm7.O5);
                                                    } else if (b5 == 6) {
                                                        p09Var.H(nm7.f3);
                                                    } else if (b5 == 2 || b5 == 4) {
                                                        i2 = 0;
                                                        p09Var.H(0);
                                                    } else {
                                                        p09Var.H(69);
                                                    }
                                                }
                                                q65Var.d();
                                                q65Var.setVisibility(i2);
                                                this.z3 = i;
                                            }
                                        }
                                        i2 = 0;
                                        q65Var.d();
                                        q65Var.setVisibility(i2);
                                        this.z3 = i;
                                    } else {
                                        this.z3 = i;
                                        p09Var.I(p09Var.f - 1, false, true);
                                        q65Var.setVisibility(0);
                                    }
                                    dkcVar.invalidate();
                                    b = this.z3;
                                    f95VarArr = this.D3;
                                    if (f95VarArr[b] == null) {
                                        f95VarArr[b] = new f95(b);
                                        byte b6 = this.z3;
                                        if (b6 == 3) {
                                            f95VarArr[b6].g = null;
                                        } else {
                                            boolean h1 = h1(b6);
                                            byte b7 = this.z3;
                                            if (h1) {
                                                f95VarArr[b7].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{cmb.w0(null, cmb.Yh, false), cmb.w0(null, cmb.ai, false), cmb.w0(null, cmb.Zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            } else {
                                                if (b7 != 1) {
                                                    f95 f95Var3 = f95VarArr[b7];
                                                    z3 = false;
                                                    f95Var3.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{cmb.w0(null, cmb.zh, false), cmb.w0(null, cmb.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                                    f95Var = f95VarArr[this.z3];
                                                    f95Var2 = this.G3;
                                                    if (f95Var == f95Var2) {
                                                        this.F3 = f95Var2;
                                                        this.G3 = f95Var;
                                                        if (f95Var2 == null || !z) {
                                                            this.E3 = 1.0f;
                                                            this.F3 = null;
                                                        } else {
                                                            this.E3 = 0.0f;
                                                        }
                                                    } else {
                                                        f95Var = f95Var2;
                                                    }
                                                    if (!z) {
                                                        if (f95Var != null) {
                                                            byte b8 = f95Var.i;
                                                            boolean z7 = (b8 == 1 || b8 == 0) ? true : z3;
                                                            z4 = b8 != 3 ? true : z3;
                                                            z5 = z7;
                                                        } else {
                                                            z4 = z3;
                                                            z5 = z4;
                                                        }
                                                        this.I3 = z5 ? 1.0f : 0.0f;
                                                        this.J3 = z4 ? 1.0f : 0.0f;
                                                    }
                                                    this.o1.invalidate();
                                                }
                                                f95VarArr[b7].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{cmb.w0(null, cmb.vh, false), cmb.w0(null, cmb.xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            }
                                        }
                                    }
                                    z3 = false;
                                    f95Var = f95VarArr[this.z3];
                                    f95Var2 = this.G3;
                                    if (f95Var == f95Var2) {
                                    }
                                    if (!z) {
                                    }
                                    this.o1.invalidate();
                                }
                                K2 = p09Var.K(237);
                            }
                            K = K2;
                            if (i != 3) {
                            }
                            z2 = z6;
                            str = str2;
                            if (!TextUtils.isEmpty(str)) {
                            }
                            dkc dkcVar2 = this.v1;
                            dkcVar2.setContentDescription(o);
                            dkcVar2.c(0, 0, 0, 1.0f, true, M0, false, z);
                            q65 q65Var2 = this.w1;
                            if (z) {
                            }
                            dkcVar2.invalidate();
                            b = this.z3;
                            f95VarArr = this.D3;
                            if (f95VarArr[b] == null) {
                            }
                            z3 = false;
                            f95Var = f95VarArr[this.z3];
                            f95Var2 = this.G3;
                            if (f95Var == f95Var2) {
                            }
                            if (!z) {
                            }
                            this.o1.invalidate();
                        }
                        M0 = jb6.M0(2131742971, null);
                        str2 = jb6.M0(2131742972, null);
                        K3 = p09Var.K(nm7.R1);
                    }
                    K = K3;
                    str = str2;
                    z2 = false;
                    if (!TextUtils.isEmpty(str)) {
                    }
                    dkc dkcVar22 = this.v1;
                    dkcVar22.setContentDescription(o);
                    dkcVar22.c(0, 0, 0, 1.0f, true, M0, false, z);
                    q65 q65Var22 = this.w1;
                    if (z) {
                    }
                    dkcVar22.invalidate();
                    b = this.z3;
                    f95VarArr = this.D3;
                    if (f95VarArr[b] == null) {
                    }
                    z3 = false;
                    f95Var = f95VarArr[this.z3];
                    f95Var2 = this.G3;
                    if (f95Var == f95Var2) {
                    }
                    if (!z) {
                    }
                    this.o1.invalidate();
                }
                M0 = jb6.M0(2131743014, null);
                K4 = p09Var.K(377);
                K = K4;
                str = str2;
                z2 = false;
                if (!TextUtils.isEmpty(str)) {
                }
                dkc dkcVar222 = this.v1;
                dkcVar222.setContentDescription(o);
                dkcVar222.c(0, 0, 0, 1.0f, true, M0, false, z);
                q65 q65Var222 = this.w1;
                if (z) {
                }
                dkcVar222.invalidate();
                b = this.z3;
                f95VarArr = this.D3;
                if (f95VarArr[b] == null) {
                }
                z3 = false;
                f95Var = f95VarArr[this.z3];
                f95Var2 = this.G3;
                if (f95Var == f95Var2) {
                }
                if (!z) {
                }
                this.o1.invalidate();
            }
            M0 = jb6.M0(2131743022, null);
            K5 = p09Var.K(nm7.O5);
        }
        str = "";
        K = K5;
        z2 = false;
        if (!TextUtils.isEmpty(str)) {
        }
        dkc dkcVar2222 = this.v1;
        dkcVar2222.setContentDescription(o);
        dkcVar2222.c(0, 0, 0, 1.0f, true, M0, false, z);
        q65 q65Var2222 = this.w1;
        if (z) {
        }
        dkcVar2222.invalidate();
        b = this.z3;
        f95VarArr = this.D3;
        if (f95VarArr[b] == null) {
        }
        z3 = false;
        f95Var = f95VarArr[this.z3];
        f95Var2 = this.G3;
        if (f95Var == f95Var2) {
        }
        if (!z) {
        }
        this.o1.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        boolean z;
        if (!this.R4) {
            i75 i75Var = this.U3;
            if (i75Var.getVisibility() == 0 && i75Var.getAlpha() == 1.0f) {
                z = true;
                if (this.d4 == z) {
                    this.d4 = z;
                    this.o1.invalidate();
                    this.b.invalidate();
                    this.J1.invalidate();
                    return;
                }
                return;
            }
        }
        z = false;
        if (this.d4 == z) {
        }
    }

    public final void I1() {
        if (this.T2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.a).getCurrentTime();
        qd2 qd2Var = this.T2;
        int i = currentTime - qd2Var.b.record_start_date;
        boolean z = qd2Var.w;
        a8 a8Var = this.n3;
        if (z) {
            a8Var.setSubtext(gm.g0(i, false, false));
        } else {
            a8Var.setSubtext(null);
        }
    }

    public final void J0() {
        this.y1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom());
        this.z1.invalidate();
        P0();
        O0();
        M0();
        N0();
        Q0();
        this.o1.setAlpha(1.0f - this.o5.e);
        K0();
        L0();
    }

    public final void J1(boolean z) {
        float interpolation;
        float f;
        v75 v75Var = this.K1;
        if ((v75Var == null || this.T2 != null) && this.Q2 == null) {
            this.P2 = 1.0f;
            this.O2 = 1.0f;
            if (v75Var == null) {
                return;
            }
        }
        if (!z) {
            u65 u65Var = this.o4;
            gm.r(u65Var);
            u65Var.run();
            qd2 qd2Var = this.T2;
            p85 p85Var = this.J1;
            if (qd2Var == null || qd2Var.k()) {
                p85Var.setVisibility(4);
            } else {
                p85Var.setVisibility(0);
            }
            boolean W = sd2.W(this.S2);
            a8 a8Var = this.r3;
            if (W) {
                a8Var.setText(jb6.M0(2131743172, null));
            } else {
                a8Var.setText(jb6.M0(2131743079, null));
            }
        }
        float f2 = this.O2;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (d53.f.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.P2 = 1.0f;
            f = 1.0f;
        } else {
            d53 d53Var = d53.f;
            this.P2 = d53Var.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * d53Var.getInterpolation(this.O2 / 0.6f);
            f = this.O2 / 0.6f;
        }
        D1(true);
        float f3 = 1.0f - f;
        v75Var.setAlpha(f3);
        this.N1.setAlpha(f);
        this.P1.setAlpha(f);
        o85 o85Var = this.O1;
        o85Var.setAlpha(f);
        o85Var.setScaleX(interpolation);
        o85Var.setScaleY(interpolation);
        t75 t75Var = this.M1;
        t75Var.setScaleX(f3);
        t75Var.setScaleY(f3);
        t75Var.setAlpha(f3);
        this.L1.setAlpha(f3);
        this.b3.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != v75Var.getVisibility()) {
            v75Var.setVisibility(i);
            t75Var.setVisibility(i);
        }
    }

    public final void K0() {
        float f = this.w3.b.a;
        int i = f > 0.0f ? 0 : 8;
        p75 p75Var = this.y1;
        p75Var.setAlpha(f);
        o75 o75Var = this.z1;
        o75Var.setAlpha(f);
        if (p75Var.getVisibility() != i) {
            p75Var.setVisibility(i);
            o75Var.setVisibility(i);
            if (i == 8) {
                m75 m75Var = this.A1;
                if (m75Var.isFocused()) {
                    m75Var.clearFocus();
                }
            }
        }
    }

    public final void K1(boolean z) {
        dkc dkcVar = this.s1;
        if (dkcVar == null || dkcVar.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        p65 p65Var = this.o1;
        if (sharedInstance == null) {
            dkcVar.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, jb6.M0(2131743121, null), false, z);
            boolean z2 = sd2.t0(this.S2) || (sd2.N(this.S2) && sd2.w(3, this.S2));
            h95 h95Var = (h95) p65Var.c.get(dkcVar);
            if (h95Var != null) {
                h95Var.d.a(z2, z);
                dkcVar.setEnabled(z2);
            }
            dkcVar.b(true, false);
            return;
        }
        h95 h95Var2 = (h95) p65Var.c.get(dkcVar);
        if (h95Var2 != null) {
            h95Var2.d.a(true, z);
            dkcVar.setEnabled(true);
        }
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z4 = !z3 && sharedInstance.isSpeakerphoneOn();
        if (z3) {
            dkcVar.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, jb6.M0(2131743187, null), false, z);
        } else if (z4) {
            dkcVar.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, jb6.M0(2131742923, null), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            dkcVar.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, jb6.M0(2131743185, null), false, z);
        } else {
            dkcVar.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, jb6.M0(2131742923, null), false, z);
        }
        dkcVar.b(z4, z);
        Y0();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.T1 != i) {
            this.T1 = i;
            gm.L3(this.U1, i);
        }
        dkc dkcVar2 = this.q1;
        if (dkcVar2.getVisibility() == 0) {
            dkcVar2.c(0, -1, 0, 1.0f, true, W0(Y0()), false, z);
            dkcVar2.b(Y0() != 1, z);
        }
    }

    public final void L0() {
        v29 v29Var = this.D1;
        if (v29Var != null) {
            float f = this.w3.b.a * this.p5.e;
            v29Var.setAlpha(f);
            int i = f > 0.0f ? 0 : 8;
            if (this.D1.getVisibility() != i) {
                this.D1.setVisibility(i);
                if (i == 8) {
                    this.D1.k();
                }
            }
            v29 v29Var2 = this.D1;
            if (v29Var2.O0 || f != 1.0f) {
                return;
            }
            v29Var2.O0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r28.m2) > 3000) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(boolean z, boolean z2) {
        long j;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        boolean z8;
        int i2;
        boolean z9;
        dkc dkcVar;
        dkc dkcVar2;
        dkc dkcVar3;
        boolean z10;
        qd2 qd2Var = this.T2;
        dkc dkcVar4 = this.t1;
        int i3 = 6;
        if (qd2Var == null || qd2Var.k()) {
            if (G0()) {
                i3 = 5;
            } else if (this.T2.b.schedule_start_subscribed) {
                i3 = 7;
            }
            H1(i3, z);
            dkcVar4.c(R.drawable.calls_decline, -1, cmb.w0(null, cmb.th, false), 0.3f, false, jb6.M0(2131751978, null), false, false);
            J1(false);
            return;
        }
        D1(z);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j = 0;
        } else {
            if (this.m2 != 0) {
                j = 0;
            } else {
                j = 0;
            }
            int i4 = this.M3;
            if (i4 == 1 || i4 == 2 || i4 == 6 || i4 == 5) {
                H0();
                H1(3, z);
                z3 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
                z4 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !G0();
                if ((z4 && this.T2.c()) || z3) {
                    z6 = false;
                    z5 = true;
                } else {
                    z5 = false;
                    z6 = true;
                }
                if (z3) {
                    z7 = !z4;
                    i = 0;
                } else {
                    z7 = false;
                    i = 1;
                }
                if (u5) {
                    z8 = z7;
                    i2 = i;
                } else {
                    z8 = false;
                    i2 = 0;
                }
                int i5 = i2 + (!z6 ? 2 : 0) + (z5 ? 4 : 0);
                c75 c75Var = this.T3;
                int i6 = i5 + ((c75Var == null && c75Var.b) ? 8 : 0) + (!z8 ? 16 : 0);
                z9 = (this.h2 | 2) == (i6 | 2);
                this.h2 = i6;
                boolean z11 = z3;
                dkc dkcVar5 = this.r1;
                if (z5) {
                    dkcVar5.c(R.drawable.calls_video, -1, 0, 1.0f, true, jb6.M0(2131743173, null), !z11, z);
                    dkcVar5.b(true, false);
                }
                dkc dkcVar6 = this.p1;
                if (i2 != 0) {
                    dkcVar6.c(0, -1, 0, 1.0f, true, jb6.M0(2131743090, null), false, false);
                    dkcVar6.b(true, false);
                }
                dkc dkcVar7 = this.q1;
                if (z8) {
                    dkcVar = dkcVar6;
                    dkcVar2 = dkcVar5;
                    dkcVar3 = dkcVar7;
                    z10 = z;
                } else {
                    Y0();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i7 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.T1 != i7) {
                        this.T1 = i7;
                        gm.L3(this.U1, i7);
                    }
                    dkcVar2 = dkcVar5;
                    dkcVar = dkcVar6;
                    dkcVar7.c(0, -1, 0, 1.0f, true, W0(Y0()), false, z);
                    dkcVar3 = dkcVar7;
                    z10 = z;
                    dkcVar3.b(Y0() != 1, z10);
                }
                dkc dkcVar8 = dkcVar3;
                dkcVar4.c(R.drawable.calls_decline, -1, cmb.w0(null, cmb.th, false), 0.3f, false, jb6.M0(2131743048, null), false, false);
                if (z9 && z6) {
                    K1(false);
                }
                dkcVar2.d(true, z10);
                dkcVar.d(true, z10);
                dkcVar8.d(true, z10);
            }
        }
        if (this.v2 != null) {
            c1().k(0L, 37, this.v2, this.S2, null, null);
            this.v2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || G0()) {
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z2 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                H0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                H1(0, z);
            } else {
                H1(1, z);
            }
        } else {
            H0();
            if (groupCallParticipant2.raise_hand_rating != j) {
                H1(4, z);
            } else {
                H1(2, z);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
        if (groupCallParticipant3 == null) {
        }
        if (z4) {
        }
        z5 = false;
        z6 = true;
        if (z3) {
        }
        if (u5) {
        }
        int i52 = i2 + (!z6 ? 2 : 0) + (z5 ? 4 : 0);
        c75 c75Var2 = this.T3;
        int i62 = i52 + ((c75Var2 == null && c75Var2.b) ? 8 : 0) + (!z8 ? 16 : 0);
        if ((this.h2 | 2) == (i62 | 2)) {
        }
        this.h2 = i62;
        boolean z112 = z3;
        dkc dkcVar52 = this.r1;
        if (z5) {
        }
        dkc dkcVar62 = this.p1;
        if (i2 != 0) {
        }
        dkc dkcVar72 = this.q1;
        if (z8) {
        }
        dkc dkcVar82 = dkcVar3;
        dkcVar4.c(R.drawable.calls_decline, -1, cmb.w0(null, cmb.th, false), 0.3f, false, jb6.M0(2131743048, null), false, false);
        if (z9) {
            K1(false);
        }
        dkcVar2.d(true, z10);
        dkcVar.d(true, z10);
        dkcVar82.d(true, z10);
    }

    public final void M0() {
        boolean z = v5;
        p65 p65Var = this.o1;
        if (z) {
            p65Var.setTranslationX(0.0f);
            p65Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fn0 fn0Var = this.o5;
        if (z2) {
            p65Var.setTranslationX(fn0Var.e * gm.L(94.0f));
            p65Var.setTranslationY(0.0f);
        } else {
            p65Var.setTranslationX(0.0f);
            p65Var.setTranslationY(fn0Var.e * gm.L(94.0f));
        }
    }

    public final void M1() {
        boolean z;
        TLRPC.Chat L0;
        TLRPC.User user;
        a85 a85Var = this.H1;
        if (a85Var == null || this.T2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.T2.P.m(); i2++) {
            long j = this.T2.P.j(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.P.f(j);
            if (!groupCallParticipant.self) {
                c75 c75Var = this.T3;
                c75Var.getClass();
                if (c75Var.x.get(k47.B1(groupCallParticipant.peer)) <= 0 && this.r4.get(j, 0) != 1) {
                    long B1 = k47.B1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i < 2) {
                        int i3 = this.a;
                        if (B1 > 0) {
                            user = oc7.r1(i3).W1(Long.valueOf(B1));
                            L0 = null;
                        } else {
                            L0 = oc7.r1(i3).L0(Long.valueOf(B1));
                            user = null;
                        }
                        if (user != null || L0 != null) {
                            if (i != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(m9c.k(user, true), new z5c(gm.o()), 0);
                            } else {
                                spannableStringBuilder.append(L0.title, new z5c(gm.o()), 0);
                            }
                        }
                    }
                    i++;
                    if (i == 2) {
                        break;
                    }
                }
            }
        }
        if (i > 0) {
            String J0 = jb6.J0(i, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            a85Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        a85Var.getSubtitleTextView().k(jb6.G(this.T2.b.participants_count + ((this.I1.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), i1() ? "ViewersWatching" : "Participants", new Object[0]));
        if (z != this.m4) {
            this.m4 = z;
            a85Var.invalidate();
            a85Var.getSubtitleTextView().setPivotX(0.0f);
            a85Var.getSubtitleTextView().setPivotY(a85Var.getMeasuredHeight() >> 1);
            a85Var.getSubtitleTextView().animate().scaleX(this.m4 ? 0.98f : 1.0f).scaleY(this.m4 ? 0.9f : 1.0f).alpha(this.m4 ? 0.0f : 1.0f).setDuration(150L);
            gm.R3(a85Var.getAdditionalSubtitleTextView(), this.m4);
        }
    }

    public final void N0() {
        boolean z = v5;
        y65 y65Var = this.e4;
        if (z) {
            y65Var.setTranslationX(0.0f);
            y65Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fn0 fn0Var = this.o5;
        if (z2) {
            y65Var.setTranslationX(fn0Var.e * gm.L(94.0f));
            y65Var.setTranslationY(0.0f);
        } else {
            y65Var.setTranslationX(0.0f);
            y65Var.setTranslationY(fn0Var.e * gm.L(94.0f));
        }
    }

    public final void N1(boolean z) {
        qd2 qd2Var = this.T2;
        t65 t65Var = this.X2;
        if (qd2Var == null) {
            if (sd2.W(this.S2)) {
                t65Var.b(jb6.M0(2131743146, null), z);
                return;
            } else {
                t65Var.b(jb6.M0(2131743025, null), z);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(qd2Var.b.title);
        a85 a85Var = this.H1;
        if (isEmpty) {
            TLRPC.Chat chat = this.S2;
            if (chat != null && !chat.title.equals(a85Var.getTitle())) {
                TLRPC.Chat chat2 = this.S2;
                a85 a85Var2 = this.H1;
                if (z) {
                    a85Var2.N(chat2.title, true, 180L, null);
                    a85Var.getTitleTextView().setOnClickListener(new t55(this, (byte) 9));
                } else {
                    a85Var2.setTitle(chat2.title);
                }
                if (!sd2.W(this.S2)) {
                    t65Var.b(jb6.M0(2131742990, null), z);
                } else if (i1()) {
                    t65Var.b(this.S2.title, z);
                } else {
                    t65Var.b(jb6.M0(2131743131, null), z);
                }
            } else if (this.S2 == null) {
                a85Var.setTitle(jb6.M0(2131751760, null));
                t65Var.b(jb6.M0(2131751760, null), z);
            }
        } else if (!this.T2.b.title.equals(a85Var.getTitle())) {
            qd2 qd2Var2 = this.T2;
            a85 a85Var3 = this.H1;
            if (z) {
                a85Var3.N(qd2Var2.b.title, true, 180L, null);
                a85Var.getTitleTextView().setOnClickListener(new t55(this, (byte) 8));
            } else {
                a85Var3.setTitle(qd2Var2.b.title);
            }
            t65Var.b(this.T2.b.title, z);
        }
        lka titleTextView = a85Var.getTitleTextView();
        if (!this.T2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                t65Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                t65Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new d95(titleTextView));
            TextView textView = t65Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new d95(textView), (Drawable) null);
            TextView nextTextView = t65Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new d95(nextTextView), (Drawable) null);
        }
    }

    public final void O0() {
        int i;
        float f = this.q5.f;
        g0d g0dVar = this.w3;
        float R1 = gm.R1(v5 ? (1.0f - this.r5.e) * gm.L(-91.0f) : u5 ? 0.0f : ((this.o5.e * gm.L(94.0f)) - (gm.L(104.0f) * this.T3.c)) - gm.L(91.0f), -((g0dVar.d() - this.b.getPaddingBottom()) + f + (gm.L(68.0f) * this.p5.e) + gm.L(10.0f)), g0dVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + R1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - gm.L(250.0f));
        t86 t86Var = this.k3;
        if (t86Var != null) {
            i = t86Var.getContentHeight();
            t86Var.setTranslationY(R1);
        } else {
            i = 0;
        }
        float f2 = i;
        aa5 aa5Var = this.V1;
        aa5Var.setTranslationY(R1 - f2);
        aa5Var.setVisibleHeight((int) Math.max(0.0f, max - f2));
    }

    public final void O1() {
        float f;
        y21 y21Var;
        if (this.F != null) {
            int L = gm.L(74.0f);
            float f2 = this.s2 - L;
            if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / ((L - this.t0) - gm.L(14.0f)));
                f2 -= (int) ((a.getCurrentActionBarHeight() - r0) * f);
            } else {
                f = 0.0f;
            }
            this.F.setTranslationY(gm.R1(((-r0.getTop()) - this.F.getHeight()) + f2 + this.b.getPaddingTop() + gm.L(10.0f), this.H1.getY() + (-this.F.getTop()) + r4.getHeight(), f));
            u31 u31Var = u31.x;
            if (u31Var == null || (y21Var = u31Var.e) == null || y21Var.getParent() == null || y21Var.getParent().getParent() != this.F) {
                return;
            }
            y21Var.setTop(f > 0.5f);
        }
    }

    public final void P0() {
        if (this.D1 != null) {
            this.D1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.p5.e) * gm.L(64.0f)));
        }
    }

    public final void Q0() {
        float f = this.p5.e;
        float R1 = gm.R1(0.25f, 1.0f, f);
        ImageView imageView = this.C1;
        imageView.setScaleX(R1);
        imageView.setScaleY(gm.R1(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        imageView.setClickable(f > 0.9f);
        float f2 = 1.0f - f;
        float R12 = gm.R1(0.25f, 1.0f, f2);
        ImageView imageView2 = this.B1;
        imageView2.setScaleX(R12);
        imageView2.setScaleY(gm.R1(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        imageView2.setClickable(f2 > 0.9f);
    }

    @Override // my0
    public final ArrayList R() {
        return new ArrayList();
    }

    public final void R0() {
        ha5 ha5Var = this.O4;
        if (ha5Var != null) {
            ha5Var.a.setRoundCorners(gm.L(8.0f));
            ha5 ha5Var2 = this.O4;
            ha5Var2.h = false;
            ha5Var2.j(false);
            this.O4.invalidate();
            this.T3.invalidate();
        }
        wb5 wb5Var = this.M4;
        if (wb5Var != null && !this.Q4 && wb5Var.getParent() != null) {
            this.b.removeView(this.M4);
        }
        wb5 wb5Var2 = this.M4;
        if (wb5Var2 != null) {
            wb5Var2.setProgressToAvatarPreview(0.0f);
            this.M4.setAboutVisible(false);
            this.M4.getAvatarImageView().setAlpha(1.0f);
        }
        l95 l95Var = this.P4;
        if (l95Var != null) {
            l95Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.M4 = null;
        this.N4 = null;
        this.P4 = null;
        this.O4 = null;
    }

    public final void T0(boolean z) {
        if (this.R4 || !this.Y3) {
            return;
        }
        if (z) {
            this.R4 = true;
            s1(false, this.M4);
            return;
        }
        R0();
        this.b.removeView(this.X3);
        this.X3 = null;
        this.s4.setVisibility(8);
        this.b.invalidate();
        this.Y3 = false;
        this.R1.X = true;
        this.J1.invalidate();
        this.U3.setVisibility(8);
        if (this.l2) {
            this.l2 = false;
            D0(true);
        }
        I0();
    }

    public final void U0(int[] iArr, int i) {
        if (i1()) {
            int i2 = cmb.Ah;
            iArr[0] = cmb.w0(null, i2, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.Bh, false), cmb.w0(null, cmb.ph, false));
            iArr[2] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, i2, false));
        } else if (i == 0) {
            iArr[0] = cmb.w0(null, cmb.zh, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.oh, false), cmb.w0(null, cmb.ph, false));
            iArr[2] = cmb.w0(null, cmb.nh, false);
        } else if (i == 1) {
            iArr[0] = cmb.w0(null, cmb.wh, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.rh, false), cmb.w0(null, cmb.sh, false));
            iArr[2] = cmb.w0(null, cmb.qh, false);
        } else if (h1(i)) {
            iArr[0] = cmb.w0(null, cmb.ai, false);
            iArr[1] = cmb.w0(null, cmb.bi, false);
            iArr[2] = cmb.w0(null, cmb.ci, false);
        } else {
            int i3 = cmb.Ah;
            iArr[0] = cmb.w0(null, i3, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.Ch, false), cmb.w0(null, cmb.Dh, false));
            iArr[2] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, i3, false));
        }
        if (h1(i)) {
            iArr[3] = on2.f(0.5f, cmb.w0(null, cmb.Yh, false), cmb.w0(null, cmb.ai, false));
        } else if (i == 1) {
            iArr[3] = on2.f(0.75f, cmb.w0(null, cmb.rh, false), on2.f(0.5f, cmb.w0(null, cmb.vh, false), cmb.w0(null, cmb.xh, false)));
        } else {
            iArr[3] = on2.f(0.5f, cmb.w0(null, cmb.zh, false), cmb.w0(null, cmb.yh, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(rd2 rd2Var) {
        rd2 rd2Var2;
        if (rd2Var == null) {
            this.b2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            c75 c75Var = this.T3;
            if (c75Var.r != null) {
                return;
            }
            boolean z = v5;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.i4;
            p85 p85Var = this.J1;
            byte b = 1;
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!z) {
                if (onPreDrawListener != null) {
                    p85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                if (rd2Var == null) {
                    if (p85Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = p85Var.getViewTreeObserver();
                        e85 e85Var = new e85(this, b);
                        this.i4 = e85Var;
                        viewTreeObserver.addOnPreDrawListener(e85Var);
                        return;
                    }
                    p85Var.setVisibility(0);
                    D0(false);
                    this.l2 = true;
                    ViewTreeObserver viewTreeObserver2 = p85Var.getViewTreeObserver();
                    e85 e85Var2 = new e85(this, objArr == true ? 1 : 0);
                    this.i4 = e85Var2;
                    viewTreeObserver2.addOnPreDrawListener(e85Var2);
                    return;
                }
                y65 y65Var = this.e4;
                if (y65Var.getVisibility() == 0) {
                    c75Var.h(rd2Var);
                    gm.V3(y65Var);
                    return;
                }
                y65Var.setVisibility(0);
                m95 m95Var = this.h4;
                m95Var.G(y65Var, false);
                this.l2 = true;
                if (!c75Var.b) {
                    ArrayList arrayList = m95Var.e;
                    u46 u46Var = (u46) y65Var.getLayoutManager();
                    if (u46Var != null) {
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            if (((rd2) arrayList.get(i)).equals(rd2Var)) {
                                u46Var.g1(i, gm.L(13.0f));
                                break;
                            }
                            i++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = p85Var.getViewTreeObserver();
                xj3 xj3Var = new xj3(this, rd2Var, b);
                this.i4 = xj3Var;
                viewTreeObserver3.addOnPreDrawListener(xj3Var);
                return;
            }
            if (onPreDrawListener != null) {
                p85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            pb5 pb5Var = this.g4;
            ArrayList arrayList3 = this.R3;
            ArrayList arrayList4 = this.S3;
            if (rd2Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    ha5 ha5Var = (ha5) arrayList4.get(i2);
                    n95 n95Var = ha5Var.c;
                    if (n95Var != null) {
                        n95Var.setRenderer(null);
                        l95 l95Var = ha5Var.d;
                        if (l95Var != null) {
                            l95Var.setRenderer(null);
                        }
                        n95 n95Var2 = ha5Var.e;
                        if (n95Var2 != null) {
                            n95Var2.setRenderer(null);
                        }
                        arrayList2.add(ha5Var.x);
                        ha5Var.b(false);
                        ha5Var.animate().alpha(0.0f).setListener(new z75(this, ha5Var, objArr2 == true ? 1 : 0));
                    }
                }
                this.F4 = false;
                pb5Var.H(this.f4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    ha5 ha5Var2 = (ha5) arrayList4.get(i3);
                    if (ha5Var2.e != null && ((rd2Var2 = ha5Var2.x) == null || !rd2Var2.equals(rd2Var))) {
                        arrayList2.add(ha5Var2.x);
                        ha5Var2.b(false);
                        l95 l95Var2 = ha5Var2.d;
                        if (l95Var2 != null) {
                            l95Var2.setRenderer(null);
                        }
                        n95 n95Var3 = ha5Var2.c;
                        if (n95Var3 != null) {
                            n95Var3.setRenderer(null);
                        }
                        ha5Var2.animate().alpha(0.0f).setListener(new z75(this, ha5Var2, b));
                    }
                }
                this.F4 = true;
                pb5Var.r = false;
                if (!arrayList2.isEmpty()) {
                    gm.c3(new ve4(this, arrayList2, (byte) 24));
                }
            }
            boolean z2 = !c75Var.b;
            ViewTreeObserver viewTreeObserver4 = p85Var.getViewTreeObserver();
            fq1 fq1Var = new fq1(this, rd2Var, z2);
            this.i4 = fq1Var;
            viewTreeObserver4.addOnPreDrawListener(fq1Var);
        }
    }

    public final int Y0() {
        Integer num = this.n5;
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

    public final long Z0() {
        TLRPC.Chat chat = this.S2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void a1(boolean z) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        j5 j5Var = this.n1;
        int i = j5Var.a;
        int i2 = j5Var.a;
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(Z0()));
        byte b = 0;
        if (L0 != null && !sd2.t0(L0)) {
            TLRPC.ChatFull M0 = oc7.r1(i2).M0(Z0());
            String K = sd2.K(this.S2, false);
            String p = !TextUtils.isEmpty(K) ? kt6.p(oc7.r1(i2).N2, "/", K, new StringBuilder()) : (M0 == null || (tL_chatInviteExported = M0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(p)) {
                o1(null, p, true, z);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = oc7.k1(this.S2);
            ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new vj1((Object) this, (Object) M0, z, (byte) 4));
            return;
        }
        if (this.T2 != null) {
            int i3 = 0;
            while (i3 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                qd2 qd2Var = this.T2;
                exportgroupcallinvite.call = qd2Var.h(qd2Var.a);
                exportgroupcallinvite.can_self_unmute = i3 == 1;
                ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new b65(this, i3, z, b));
                i3++;
            }
        }
    }

    public final UndoView c1() {
        if (!v5) {
            c75 c75Var = this.T3;
            if (c75Var.b) {
                return c75Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.c2;
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

    public final void d1() {
        VoIPService sharedInstance;
        if (this.n2 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.n2 = true;
        this.x2.addAll(this.T2.g);
        this.y2.addAll(this.j2);
        this.z2.addAll(this.T2.j);
        this.A2.addAll(this.T2.m);
        this.B2.addAll(this.T2.l);
        this.M3 = sharedInstance.getCallState();
        qd2 qd2Var = this.T2;
        if (qd2Var == null) {
            qd2 qd2Var2 = sharedInstance.groupCall;
            this.T2 = qd2Var2;
            this.h4.c = qd2Var2;
            this.T3.setGroupCall(qd2Var2);
            qd2Var = this.T2;
            this.g4.c = qd2Var;
        }
        byte b = 0;
        aa5 aa5Var = this.V1;
        if (aa5Var != null) {
            aa5Var.E0(this.n1.a, qd2Var.h(false));
        }
        this.H1.setTitleRightMargin(gm.L(48.0f) << 1);
        ArrayList arrayList = this.T2.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i)).lastActiveDate = r6.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        o85 o85Var = this.O1;
        if (o85Var == null || o85Var.getVisibility() != 0) {
            return;
        }
        this.t1.c(R.drawable.calls_decline, -1, cmb.w0(null, cmb.th, false), 0.3f, false, jb6.M0(2131743048, null), false, true);
        K1(true);
        this.r3.setText(jb6.M0(sd2.W(this.S2) ? 2131743165 : 2131743064, null));
        p85 p85Var = this.J1;
        p85Var.setVisibility(0);
        r7 r7Var = this.c3;
        r7Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p85Var, (Property<p85, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(p85Var, (Property<p85, Float>) View.TRANSLATION_Y, gm.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o85Var, (Property<o85, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o85Var, (Property<o85, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o85Var, (Property<o85, Float>) property, 0.0f);
        lka lkaVar = this.N1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property, 0.0f);
        lka lkaVar2 = this.P1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(lkaVar2, (Property<lka, Float>) property2, 0.0f), ObjectAnimator.ofFloat(lkaVar2, (Property<lka, Float>) property3, 0.0f), ObjectAnimator.ofFloat(lkaVar2, (Property<lka, Float>) property, 0.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(d53.g);
        animatorSet.addListener(new f85(this, b));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        rd2 rd2Var;
        VoIPService sharedInstance;
        byte b;
        byte b2;
        int i3 = nm7.w2;
        p85 p85Var = this.J1;
        String[] strArr = null;
        int i4 = 0;
        byte b3 = 1;
        if (i == i3) {
            Long l = (Long) objArr[1];
            qd2 qd2Var = this.T2;
            if (qd2Var == null || qd2Var.b.id != l.longValue()) {
                return;
            }
            qd2 qd2Var2 = this.T2;
            if (qd2Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j = this.m2;
            byte b4 = 3;
            j5 j5Var = this.n1;
            if (j == 0 && (((b2 = this.z3) == 7 || b2 == 5 || b2 == 6) && !qd2Var2.k())) {
                try {
                    Intent intent = new Intent(this.b2, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", Z0());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.U2);
                    intent.putExtra("peerChannelId", this.R2.channel_id);
                    intent.putExtra("peerChatId", this.R2.chat_id);
                    intent.putExtra("peerUserId", this.R2.user_id);
                    intent.putExtra("hash", this.V2);
                    intent.putExtra("peerAccessHash", this.R2.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", j5Var.a);
                    intent.putExtra("scheduleDate", this.c4);
                    this.b2.startService(intent);
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                this.m2 = SystemClock.elapsedRealtime();
                gm.d3(new v55(this, b4), 3000L);
            }
            if (i1() && !this.T2.k()) {
                if (this.o2) {
                    return;
                }
                this.o2 = true;
                dismiss();
                return;
            }
            if (!this.n2 && VoIPService.getSharedInstance() != null) {
                this.T2.b(false);
                d1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            E1();
            int childCount = p85Var.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = p85Var.getChildAt(i5);
                if (childAt instanceof wb5) {
                    ((wb5) childAt).a(true, false);
                }
            }
            if (this.M4 != null) {
                this.l2 = true;
            } else {
                D0(true);
            }
            M1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.z3 == 4;
            L1(true, booleanValue);
            N1(true);
            if (z && ((b = this.z3) == 1 || b == 0)) {
                c1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l2 = (Long) objArr[3];
                long longValue = l2.longValue();
                if (longValue != 0) {
                    if (g1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                        return;
                    }
                    try {
                        ArrayList arrayList = oc7.r1(j5Var.a).y;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size) {
                                    break;
                                }
                                Object obj = arrayList.get(i6);
                                i6++;
                                if (((TLRPC.Dialog) obj).id == longValue) {
                                    i4 = 1;
                                    break;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (pg3.D(longValue)) {
                        TLRPC.User W1 = oc7.r1(j5Var.a).W1(l2);
                        if (W1 != null) {
                            if (this.T2.b.participants_count < 250 || m9c.y(W1) || W1.verified || i4 != 0) {
                                c1().k(0L, 44, W1, this.S2, null, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat L0 = oc7.r1(j5Var.a).L0(Long.valueOf(-longValue));
                    if (L0 != null) {
                        if (this.T2.b.participants_count < 250 || !sd2.r0(L0) || L0.verified || i4 != 0) {
                            c1().k(0L, 44, L0, this.S2, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.y2) {
            c75 c75Var = this.T3;
            if (c75Var.b && this.T2 != null) {
                boolean c = c75Var.c();
                qd2 qd2Var3 = this.T2;
                if (qd2Var3 != null && c75Var.b && (rd2Var = c75Var.e) != null && qd2Var3.d.f(k47.B1(rd2Var.a.peer)) == null) {
                    c = true;
                }
                if (c) {
                    rd2 rd2Var2 = null;
                    while (true) {
                        ArrayList arrayList2 = this.j2;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        rd2 rd2Var3 = (rd2) arrayList2.get(i4);
                        if (this.T2.P.g(null, k47.B1(rd2Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = rd2Var3.a;
                            if (!groupCallParticipant3.muted_by_you && c75Var.d != k47.B1(groupCallParticipant3.peer)) {
                                rd2Var2 = rd2Var3;
                            }
                        }
                        i4++;
                    }
                    if (rd2Var2 != null) {
                        V0(rd2Var2);
                    }
                }
            }
            c75Var.setVisibleParticipant(true);
            M1();
            return;
        }
        if (i == nm7.R4) {
            w1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i == nm7.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                AlertDialog$Builder K = ik.K(getContext(), jb6.M0(2131742990, null), "GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str) ? sd2.W(this.S2) ? jb6.M0(2131743136, null) : jb6.M0(2131743003, null) : ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) ? sd2.W(this.S2) ? jb6.M0(2131743162, null) : jb6.M0(2131743054, null) : b10.j(new StringBuilder(jb6.M0(2131751042, null)), "\n", str));
                K.i(new a65(this, b3));
                try {
                    K.o();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i == nm7.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == Z0()) {
                E1();
                L1(isShowing(), false);
            }
            long B1 = k47.B1(this.u2);
            qd2 qd2Var4 = this.T2;
            if (qd2Var4 == null || chatFull.id != (-B1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) qd2Var4.d.f(B1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            D0(true);
            gm.V3(p85Var);
            if (this.u4 != null) {
                while (i4 < this.u4.getChildCount()) {
                    View childAt2 = this.u4.getChildAt(i4);
                    if ((childAt2 instanceof a8) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((a8) childAt2).j(jb6.M0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743190 : 2131743100, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (i == nm7.u1) {
            if (((Long) objArr[0]).longValue() == Z0()) {
                E1();
                L1(isShowing(), false);
                return;
            }
            return;
        }
        if (i == nm7.B2) {
            int childCount2 = p85Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i4 < childCount2) {
                u69 G = p85Var.G(p85Var.getChildAt(i4));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof wb5) {
                        wb5 wb5Var = (wb5) view;
                        if (wb5Var.getParticipant() != null) {
                            wb5Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i4++;
            }
            return;
        }
        if (i == nm7.E0) {
            Long l3 = (Long) objArr[0];
            long B12 = k47.B1(this.u2);
            if (this.T2 == null || B12 != l3.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(B12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            D0(true);
            gm.V3(p85Var);
            if (this.u4 != null) {
                while (i4 < this.u4.getChildCount()) {
                    View childAt3 = this.u4.getChildAt(i4);
                    if ((childAt3 instanceof a8) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((a8) childAt3).j(jb6.M0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743191 : 2131743101, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (i == nm7.j0) {
            D0(true);
            gm.V3(p85Var);
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i7 = oc7.s5;
            if ((intValue & 16) != 0) {
                D0(true);
            } else if ((intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            gm.V3(p85Var);
            return;
        }
        if (i == nm7.z2) {
            y75 y75Var = this.t2;
            if (y75Var != null) {
                y75Var.a(true, true);
            }
            E1();
            return;
        }
        if (i == nm7.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            pd pdVar = this.i2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            pdVar.b(strArr);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.remove(this.n4);
        this.b2.setRequestedOrientation(-1);
        t5 = false;
        pd5 pd5Var = this.y3;
        if (pd5Var != null) {
            pd5Var.dismiss();
        }
        this.l2 = true;
        nm7.e().k(nm7.F2, new Object[0]);
        j5 j5Var = this.n1;
        int i = j5Var.a;
        int i2 = j5Var.a;
        nm7.f(i).n(this, nm7.M0);
        nm7.f(i2).n(this, nm7.w2);
        nm7.f(i2).n(this, nm7.T);
        nm7.f(i2).n(this, nm7.u1);
        nm7.f(i2).n(this, nm7.B2);
        nm7.f(i2).n(this, nm7.E0);
        nm7.f(i2).n(this, nm7.j0);
        nm7.f(i2).n(this, 2);
        nm7.f(i2).n(this, nm7.z2);
        nm7.f(i2).n(this, nm7.y2);
        nm7.f(i2).n(this, nm7.U3);
        nm7.e().n(this, nm7.R4);
        nm7.e().n(this, nm7.D2);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.b2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.b2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                c1().j(z ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(long j, boolean z) {
        if (this.T2 != null) {
            j5 j5Var = this.n1;
            TLRPC.User W1 = oc7.r1(j5Var.a).W1(Long.valueOf(j));
            if (W1 != null) {
                byte b = 0;
                he[] heVarArr = {new he(3, null, getContext())};
                TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                qd2 qd2Var = this.T2;
                invitetogroupcall.call = qd2Var.h(qd2Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = W1.id;
                tL_inputUser.access_hash = W1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(j5Var.a).sendRequest(invitetogroupcall, new g65(this, j, heVarArr, W1, z, invitetogroupcall));
                if (sendRequest != 0) {
                    gm.d3(new h65(this, heVarArr, sendRequest, b), 500L);
                }
            }
        }
    }

    public final boolean f1() {
        int L = gm.L(74.0f);
        float f = this.s2 - L;
        return (((((float) this.t0) + f) > ((float) a.getCurrentActionBarHeight()) ? 1 : ((((float) this.t0) + f) == ((float) a.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) a.getCurrentActionBarHeight()) - f) - ((float) this.t0)) / ((float) ((L - this.t0) - gm.L(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean g1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public final boolean i1() {
        qd2 qd2Var = this.T2;
        return qd2Var != null && qd2Var.b.rtmp_stream;
    }

    @Override // my0
    public final boolean j0() {
        t5 = true;
        nm7.e().k(nm7.F2, new Object[0]);
        oa5.k(getContext());
        return false;
    }

    public final void j1(LaunchActivity launchActivity, qd2 qd2Var, View view, int i) {
        TLRPC.Chat chat;
        final Long l;
        boolean z;
        final pd2 pd2Var;
        if (view instanceof n95) {
            V0(((n95) view).getParticipant());
            return;
        }
        if (view instanceof wb5) {
            A1((wb5) view);
            return;
        }
        boolean z2 = view instanceof o95;
        final byte b = 0;
        final byte b2 = 1;
        b95 b95Var = this.I1;
        if (!z2) {
            if (i != b95Var.x) {
                if (i != b95Var.y) {
                    if (i == b95Var.E) {
                        p1();
                        return;
                    }
                    return;
                }
                qd2 qd2Var2 = this.T2;
                if (qd2Var2 == null || qd2Var2.b == null) {
                    return;
                }
                t9c t9cVar = new t9c(launchActivity, this.a, new q63());
                qd2 qd2Var3 = this.T2;
                t9cVar.s2.addAll(qd2Var3 != null ? (Collection) Collection.-EL.stream(qd2Var3.e).map(new x00((byte) 8)).collect(Collectors.toSet()) : null);
                t9cVar.f1(false, true);
                t9cVar.r2 = new v55(this, (byte) 5);
                t9cVar.f1(false, true);
                t9cVar.t2 = new lf2((Object) this, (Object) qd2Var, (byte) 27);
                t9cVar.show();
                return;
            }
            if (sd2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && sd2.t0(chat)) {
                a1(false);
                return;
            }
            j5 j5Var = this.n1;
            TLRPC.ChatFull M0 = oc7.r1(j5Var.a).M0(Z0());
            if (M0 != null) {
                this.q2 = false;
                Context context = getContext();
                int i2 = j5Var.a;
                TLRPC.Chat chat2 = this.S2;
                qd2 qd2Var4 = this.T2;
                pd5 pd5Var = new pd5(context, i2, chat2, M0, qd2Var4.d, qd2Var4.n);
                this.y3 = pd5Var;
                pd5Var.setOnDismissListener(new a65(this, (byte) 2));
                pd5 pd5Var2 = this.y3;
                pd5Var2.a2 = new l65(this);
                pd5Var2.show();
                return;
            }
            return;
        }
        o95 o95Var = (o95) view;
        if (o95Var.getUser() != null) {
            if (!g1()) {
                this.b2.N0(this.a);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", o95Var.getUser().id);
                if (o95Var.a.getImageReceiver().E()) {
                    bundle.putBoolean("expandPhoto", true);
                }
                this.b2.t0(new ProfileActivity(bundle, null));
                dismiss();
                return;
            }
            int i3 = i - b95Var.n;
            if (i3 < 0 || i3 >= this.T2.m.size()) {
                int i4 = i - b95Var.s;
                if (i4 < 0 || i4 >= this.T2.l.size()) {
                    int i5 = i - b95Var.f;
                    if (this.l2) {
                        if (i5 >= 0) {
                            ArrayList arrayList = this.z2;
                            if (i5 < arrayList.size()) {
                                l = (Long) arrayList.get(i5);
                                z = false;
                            }
                        }
                        l = null;
                        z = false;
                    } else {
                        if (i5 >= 0 && i5 < this.T2.j.size()) {
                            l = (Long) this.T2.j.get(i5);
                            z = false;
                        }
                        l = null;
                        z = false;
                    }
                    if (!z || (pd2Var = (pd2) this.T2.k.get(l)) == null) {
                    }
                    bu5 G = bu5.G(this.c, this.J0, o95Var);
                    G.k(R.drawable.msg_endcall, jb6.M0(2131749217, null), new Runnable(this) { // from class: c65
                        public final /* synthetic */ g95 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            final byte b4 = 0;
                            Long l2 = l;
                            pd2 pd2Var2 = pd2Var;
                            final g95 g95Var = this.b;
                            final byte b5 = 1;
                            g95Var.getClass();
                            switch (b3) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite.msg_id = pd2Var2.a;
                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: e65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b5;
                                            g95 g95Var2 = g95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    qd2 qd2Var5 = g95Var.T2;
                                    if (qd2Var5 != null) {
                                        pd2Var2.b = false;
                                        qd2Var5.k.put(l2, pd2Var2);
                                        g95Var.D0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite2.msg_id = pd2Var2.a;
                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: e65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            g95 g95Var2 = g95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(pd2Var2.a));
                                    oc7.r1(g95Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                    qd2 qd2Var6 = g95Var.T2;
                                    if (qd2Var6 != null) {
                                        qd2Var6.j.remove(l2);
                                        g95Var.T2.n.remove(l2);
                                        g95Var.T2.k.remove(l2);
                                        g95Var.D0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, pd2Var.a());
                    G.b(R.drawable.msg_remove, jb6.M0(2131749228, null), new Runnable(this) { // from class: c65
                        public final /* synthetic */ g95 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final byte b4 = 0;
                            Long l2 = l;
                            pd2 pd2Var2 = pd2Var;
                            final g95 g95Var = this.b;
                            final byte b5 = 1;
                            g95Var.getClass();
                            switch (b3) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite.msg_id = pd2Var2.a;
                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: e65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b5;
                                            g95 g95Var2 = g95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    qd2 qd2Var5 = g95Var.T2;
                                    if (qd2Var5 != null) {
                                        pd2Var2.b = false;
                                        qd2Var5.k.put(l2, pd2Var2);
                                        g95Var.D0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite2.msg_id = pd2Var2.a;
                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: e65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            g95 g95Var2 = g95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        g95Var2.getClass();
                                                        break;
                                                    } else {
                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(pd2Var2.a));
                                    oc7.r1(g95Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                    qd2 qd2Var6 = g95Var.T2;
                                    if (qd2Var6 != null) {
                                        qd2Var6.j.remove(l2);
                                        g95Var.T2.n.remove(l2);
                                        g95Var.T2.k.remove(l2);
                                        g95Var.D0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    G.X(cmb.c0(gm.L(8.0f), gm.L(8.0f), this.w2.getColor()));
                    G.s = (short) 96;
                    G.a0();
                    return;
                }
                l = (Long) this.T2.l.get(i - b95Var.s);
            } else {
                l = (Long) this.T2.m.get(i - b95Var.n);
            }
            z = true;
            if (z) {
            }
        }
    }

    public final void k1(my0 my0Var, he heVar, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (this.q2) {
            return;
        }
        d dVar = (d) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
        if (dVar instanceof yv1) {
            boolean ea = ((yv1) dVar).ea();
            this.q2 = true;
            this.r2 = true;
            gm.d3(new rh((Object) my0Var, (Object) editTextBoldCursor, z, (Object) heVar, (byte) 19), ea ? 200L : 0L);
            return;
        }
        this.q2 = true;
        this.r2 = true;
        if (my0Var != null) {
            my0Var.v0(true);
        } else if (heVar != null) {
            heVar.k(true);
        }
        if (z) {
            gm.d3(new l(editTextBoldCursor, (byte) 5), 100L);
        }
    }

    public final void m1() {
        w5 = true;
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(false);
        }
        n85 n85Var = this.E1;
        dtc dtcVar = n85Var.w;
        if (dtcVar != null) {
            dtcVar.b(false);
        }
        n85Var.G = true;
        this.A1.r();
    }

    public final void n1() {
        w5 = false;
        this.I1.f();
        y65 y65Var = this.e4;
        if (y65Var.getVisibility() == 0) {
            this.h4.G(y65Var, false);
        }
        if (v5) {
            this.g4.I(this.f4, false);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(true);
        }
        n85 n85Var = this.E1;
        dtc dtcVar = n85Var.w;
        if (dtcVar != null) {
            dtcVar.b(true);
        }
        n85Var.G = false;
        this.A1.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(String str, String str2, boolean z, boolean z2) {
        boolean z3;
        String str3;
        String str4;
        String str5;
        if (i1() && str != null) {
            str2 = null;
        }
        if (z2) {
            if (str == null) {
                str = str2;
            }
            gm.g(str);
            if (gm.C3()) {
                c1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.b2;
        if (launchActivity != null) {
            d dVar = (d) launchActivity.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
            if (dVar instanceof yv1) {
                z3 = ((yv1) dVar).ea();
                this.r2 = true;
                this.q2 = true;
                if (str == null && str2 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                if (str3 == null || !z) {
                    str5 = str4;
                } else {
                    str5 = sd2.W(this.S2) ? jb6.a0("VoipChannelInviteText", null, 2131743164, str4) : jb6.a0("VoipGroupInviteText", null, 2131743056, str4);
                }
                h85 h85Var = new h85(this, getContext(), str5, str3, str4, str3);
                this.k2 = h85Var;
                byte b = 8;
                h85Var.n2 = new k44(this, b);
                h85Var.setOnDismissListener(new a65(this, (byte) 3));
                gm.d3(new v55(this, b), !z3 ? 200L : 0L);
            }
        }
        z3 = false;
        if (str == null) {
        }
        str3 = str;
        str4 = str2;
        if (str3 == null) {
        }
        str5 = str4;
        h85 h85Var2 = new h85(this, getContext(), str5, str3, str4, str3);
        this.k2 = h85Var2;
        byte b2 = 8;
        h85Var2.n2 = new k44(this, b2);
        h85Var2.setOnDismissListener(new a65(this, (byte) 3));
        gm.d3(new v55(this, b2), !z3 ? 200L : 0L);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        K1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            w1(0.0f);
        }
        p85 p85Var = this.J1;
        if (p85Var.getVisibility() == 0) {
            gm.V3(p85Var);
        }
        y65 y65Var = this.e4;
        if (y65Var.getVisibility() == 0) {
            gm.V3(y65Var);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(true);
        }
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        y75 y75Var = this.t2;
        if (y75Var != null) {
            y75Var.a(false, false);
            return;
        }
        if (this.Y3) {
            T0(true);
        } else if (this.T3.b) {
            V0(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(true);
        }
        y75 y75Var = this.t2;
        if (y75Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        y75Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // my0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.add(this.n4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        this.M3 = i;
        L1(isShowing(), false);
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
            RadialProgressView radialProgressView = this.X1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(cmb.w0(null, cmb.Eh, false));
            }
            r7 r7Var = this.b3;
            if (r7Var != null) {
                int i = cmb.Xg;
                r7Var.O(cmb.w0(null, i, false), false);
                r7Var.O(cmb.w0(null, i, false), true);
                r7Var.setPopupItemsSelectorColor(cmb.w0(null, cmb.Ug, false));
            }
            int w0 = cmb.w0(null, cmb.Xg, false);
            z1(this.s3, w0);
            z1(this.t3, w0);
            z1(this.g3, w0);
            z1(this.h3, w0);
            z1(this.i3, w0);
            z1(this.r3, cmb.w0(null, cmb.lh, false));
            z1(this.e3, w0);
            z1(this.f3, w0);
            z1(this.m3, w0);
            z1(this.n3, w0);
            z1(this.o3, w0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p1() {
        qd2 qd2Var = this.T2;
        if (qd2Var == null || qd2Var.b == null) {
            return;
        }
        he heVar = new he(3, null, getContext());
        heVar.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.T2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new eo0((Object) this, (Object) heVar, (Object) exportgroupcallinvite, (byte) 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, bf0] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean[], ee, java.lang.String, ylb] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String, ylb] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r6v4, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(TLRPC.GroupCallParticipant groupCallParticipant, final long j, int i) {
        String str;
        ?? r13;
        TextView textView;
        int i2;
        String str2;
        String str3;
        ?? r15;
        int i3;
        String str4;
        int i4;
        EditText editText;
        boolean z;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            j5 j5Var = this.n1;
            TLObject W1 = j > 0 ? oc7.r1(j5Var.a).W1(Long.valueOf(j)) : oc7.r1(j5Var.a).L0(Long.valueOf(-j));
            if (i == 0 || i == 2 || i == 3) {
                if (i == 0) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().editCallMember(W1, Boolean.TRUE, null, null, null, null);
                        c1().k(0L, 30, W1, null, null, null);
                        return;
                    }
                    return;
                }
                ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
                int i5 = cmb.fh;
                he heVar = alertDialog$Builder.a;
                heVar.J = i5;
                TextView textView2 = new TextView(getContext());
                int i6 = cmb.Xg;
                anb.X(textView2, i6, null);
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
                ?? frameLayout = new FrameLayout(getContext());
                alertDialog$Builder.n(frameLayout);
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.s(gm.L(12.0f));
                ?? bf0Var = new bf0(getContext());
                bf0Var.setRoundRadius(gm.L(20.0f));
                frameLayout.addView(bf0Var, qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                pc0Var.o(W1);
                boolean z2 = W1 instanceof TLRPC.User;
                if (z2) {
                    TLRPC.User user = (TLRPC.User) W1;
                    bf0Var.f(user, pc0Var);
                    str = m9c.k(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) W1;
                    bf0Var.f(chat, pc0Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                td4.x(textView3, i6, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((jb6.a0 ? 5 : 3) | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.S2;
                String str5 = chat2 != null ? chat2.title : "";
                if (i != 2) {
                    textView3.setText(jb6.M0(2131743086, null));
                    hg9.q(null, null, 2131743087, new Object[]{str, str5}, textView2);
                } else if (g1()) {
                    textView3.setText(jb6.M0(2131743105, null));
                    hg9.q(null, null, 2131743106, new Object[]{str}, textView2);
                } else {
                    textView3.setText(jb6.M0(2131743029, null));
                    if (sd2.W(this.S2)) {
                        hg9.q(null, null, 2131743148, new Object[]{str, str5}, textView2);
                    } else {
                        hg9.q(null, null, 2131743030, new Object[]{str, str5}, textView2);
                    }
                }
                boolean z3 = jb6.a0;
                frameLayout.addView(textView3, qoe.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 21 : 76, 11.0f, z3 ? 76 : 21, 0.0f));
                frameLayout.addView(textView2, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i == 2) {
                    r13 = 0;
                    alertDialog$Builder.j(jb6.M0(2131742995, null), new nv4(this, W1, 1 == true ? 1 : 0));
                } else {
                    r13 = 0;
                    r13 = 0;
                    if (z2) {
                        alertDialog$Builder.j(jb6.M0(2131743088, null), new pt0((Object) this, W1, j, (byte) 4));
                    }
                }
                alertDialog$Builder.g(jb6.M0(2131752542, r13), r13);
                heVar.j(cmb.w0(r13, cmb.kh, false));
                heVar.show();
                if (i != 2 || (textView = (TextView) heVar.c(-1)) == null) {
                    return;
                }
                anb.X(textView, cmb.lh, r13);
                return;
            }
            byte b = 6;
            if (i == 6) {
                this.b2.N0(this.a);
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                this.b2.t0(new yv1(bundle));
                dismiss();
                return;
            }
            if (i == 8) {
                this.b2.N0(this.a);
                d dVar = (d) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
                if ((dVar instanceof yv1) && ((yv1) dVar).a() == j) {
                    dismiss();
                    return;
                }
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                this.b2.t0(new yv1(bundle2));
                dismiss();
                return;
            }
            if (i == 7) {
                sharedInstance.editCallMember(W1, Boolean.TRUE, null, null, Boolean.FALSE, null);
                H1(2, true);
                return;
            }
            byte b2 = 9;
            if (i == 9) {
                wn5 wn5Var = this.a4;
                if (wn5Var == null || !wn5Var.g()) {
                    TLRPC.User f = z8c.h(j5Var.a).f();
                    wn5 wn5Var2 = new wn5(0, true, true);
                    this.a4 = wn5Var2;
                    wn5Var2.I = true;
                    wn5Var2.S = true;
                    wn5Var2.H = true;
                    wn5Var2.K = true;
                    wn5Var2.T = true;
                    wn5Var2.a = this.b2.N().getLastFragment();
                    wn5 wn5Var3 = this.a4;
                    r85 r85Var = new r85(this, j);
                    this.b4 = r85Var;
                    wn5Var3.b = r85Var;
                    TLRPC.UserProfilePhoto userProfilePhoto = f.photo;
                    wn5Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new v55(this, b2), new g5(b), 0);
                    return;
                }
                return;
            }
            if (i == 10) {
                String str6 = groupCallParticipant.about;
                Context context = getContext();
                int i7 = this.a;
                Pattern pattern = ik.a;
                ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                String M0 = j > 0 ? jb6.M0(2131743452, null) : jb6.M0(2131751396, null);
                final he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M0;
                heVar2.U = jb6.M0(j > 0 ? 2131743080 : 2131751399, null);
                ?? frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                if (j < 0) {
                    long j2 = -j;
                    if (oc7.r1(i7).M0(j2) == null) {
                        z = 0;
                        oc7.r1(i7).a3(ConnectionsManager.generateClassGuid(), j2, true);
                        NumberTextView numberTextView = new NumberTextView(context);
                        EditText editText2 = new EditText(context);
                        int i8 = cmb.Xg;
                        anb.X(editText2, i8, null);
                        editText2.setHint(j <= 0 ? jb6.M0(2131743452, null) : jb6.M0(2131751396, null));
                        editText2.setTextSize(1, 16.0f);
                        editText2.setBackground(cmb.T(context));
                        editText2.setMaxLines(4);
                        editText2.setRawInputType(147457);
                        editText2.setImeOptions(6);
                        int i9 = j <= 0 ? 70 : nm7.d4;
                        vi viVar = new vi(i9, context, numberTextView);
                        InputFilter[] inputFilterArr = new InputFilter[1];
                        inputFilterArr[z] = viVar;
                        editText2.setFilters(inputFilterArr);
                        numberTextView.setCenterAlign(true);
                        numberTextView.setTextSize(15);
                        numberTextView.setTextColor(cmb.w0(null, cmb.A6, z));
                        numberTextView.setImportantForAccessibility(2);
                        frameLayout2.addView(numberTextView, qoe.d(20, 20.0f, !jb6.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                        editText2.setPadding(!jb6.a0 ? gm.L(24.0f) : 0, gm.L(8.0f), !jb6.a0 ? 0 : gm.L(24.0f), gm.L(8.0f));
                        editText2.addTextChangedListener(new wi(i9, numberTextView));
                        gm.T3(numberTextView, false, 0.0f, true, false);
                        editText2.setText(str6);
                        editText2.setSelection(editText2.getText().toString().length());
                        alertDialog$Builder2.n(frameLayout2);
                        final hg hgVar = new hg(j, i7, (Object) editText2, (byte) 0);
                        alertDialog$Builder2.j(jb6.M0(2131745680, null), hgVar);
                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                        heVar2.O = new wf(editText2, 1 == true ? 1 : 0);
                        frameLayout2.addView(editText2, qoe.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                        editText2.requestFocus();
                        gm.E3(editText2);
                        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ig
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView4, int i10, KeyEvent keyEvent) {
                                if (i10 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                                    he heVar3 = heVar2;
                                    if (heVar3.isShowing()) {
                                        hgVar.r(heVar3, 0);
                                        return true;
                                    }
                                }
                                return false;
                            }
                        });
                        heVar2.j(cmb.w0(null, cmb.kh, false));
                        heVar2.show();
                        heVar2.o(cmb.w0(null, i8, false));
                        return;
                    }
                }
                z = 0;
                NumberTextView numberTextView2 = new NumberTextView(context);
                EditText editText22 = new EditText(context);
                int i82 = cmb.Xg;
                anb.X(editText22, i82, null);
                editText22.setHint(j <= 0 ? jb6.M0(2131743452, null) : jb6.M0(2131751396, null));
                editText22.setTextSize(1, 16.0f);
                editText22.setBackground(cmb.T(context));
                editText22.setMaxLines(4);
                editText22.setRawInputType(147457);
                editText22.setImeOptions(6);
                if (j <= 0) {
                }
                vi viVar2 = new vi(i9, context, numberTextView2);
                InputFilter[] inputFilterArr2 = new InputFilter[1];
                inputFilterArr2[z] = viVar2;
                editText22.setFilters(inputFilterArr2);
                numberTextView2.setCenterAlign(true);
                numberTextView2.setTextSize(15);
                numberTextView2.setTextColor(cmb.w0(null, cmb.A6, z));
                numberTextView2.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView2, qoe.d(20, 20.0f, !jb6.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                editText22.setPadding(!jb6.a0 ? gm.L(24.0f) : 0, gm.L(8.0f), !jb6.a0 ? 0 : gm.L(24.0f), gm.L(8.0f));
                editText22.addTextChangedListener(new wi(i9, numberTextView2));
                gm.T3(numberTextView2, false, 0.0f, true, false);
                editText22.setText(str6);
                editText22.setSelection(editText22.getText().toString().length());
                alertDialog$Builder2.n(frameLayout2);
                final hg hgVar2 = new hg(j, i7, (Object) editText22, (byte) 0);
                alertDialog$Builder2.j(jb6.M0(2131745680, null), hgVar2);
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                heVar2.O = new wf(editText22, 1 == true ? 1 : 0);
                frameLayout2.addView(editText22, qoe.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                editText22.requestFocus();
                gm.E3(editText22);
                editText22.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ig
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i10, KeyEvent keyEvent) {
                        if (i10 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                            he heVar3 = heVar2;
                            if (heVar3.isShowing()) {
                                hgVar2.r(heVar3, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                heVar2.j(cmb.w0(null, cmb.kh, false));
                heVar2.show();
                heVar2.o(cmb.w0(null, i82, false));
                return;
            }
            if (i != 11) {
                if (i == 5) {
                    sharedInstance.editCallMember(W1, Boolean.TRUE, null, null, null, null);
                    c1().m(W1, 35, 0L);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    i2 = 1;
                    sharedInstance.editCallMember(W1, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    i2 = 1;
                    sharedInstance.editCallMember(W1, Boolean.FALSE, null, 10000, null, null);
                }
                sharedInstance.setParticipantVolume(groupCallParticipant, sd2.H(groupCallParticipant));
                c1().k(0L, i == i2 ? 31 : 36, W1, null, null, null);
                return;
            }
            Context context2 = getContext();
            int i10 = this.a;
            Pattern pattern2 = ik.a;
            if (pg3.D(j)) {
                TLRPC.User W12 = oc7.r1(i10).W1(Long.valueOf(j));
                str2 = W12.first_name;
                str3 = W12.last_name;
            } else {
                str2 = oc7.r1(i10).L0(Long.valueOf(-j)).title;
                str3 = null;
            }
            ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
            if (j > 0) {
                i3 = 2131743099;
                r15 = 0;
            } else {
                r15 = 0;
                i3 = 2131743098;
            }
            String M02 = jb6.M0(i3, r15);
            he heVar3 = alertDialog$Builder3.a;
            heVar3.S = M02;
            ?? i11 = hg9.i(context2, 1);
            EditText editText3 = new EditText(context2);
            int i12 = cmb.Xg;
            anb.X(editText3, i12, r15);
            editText3.setTextSize(1, 16.0f);
            editText3.setMaxLines(1);
            editText3.setLines(1);
            editText3.setSingleLine(true);
            editText3.setGravity(jb6.a0 ? 5 : 3);
            editText3.setInputType(49152);
            editText3.setImeOptions(j > 0 ? 5 : 6);
            if (j > 0) {
                i4 = 2131750626;
                str4 = null;
            } else {
                str4 = null;
                i4 = 2131743097;
            }
            editText3.setHint(jb6.M0(i4, str4));
            editText3.setBackground(cmb.T(context2));
            editText3.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
            editText3.requestFocus();
            if (j > 0) {
                editText = new EditText(context2);
                anb.X(editText, i12, null);
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(jb6.a0 ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(jb6.M0(2131748789, null));
                editText.setBackground(cmb.T(context2));
                editText.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
            } else {
                editText = null;
            }
            gm.E3(editText3);
            i11.addView(editText3, qoe.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                i11.addView(editText, qoe.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText3.setText(str2);
            editText3.setSelection(editText3.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder3.n(i11);
            EditText editText4 = editText;
            cg cgVar = new cg(editText3, j, i10, editText4);
            alertDialog$Builder3.j(jb6.M0(2131745680, null), cgVar);
            alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
            byte b3 = 0;
            heVar3.O = new dg(editText3, editText4, b3);
            heVar3.j(cmb.w0(null, cmb.kh, false));
            heVar3.show();
            heVar3.o(cmb.w0(null, i12, false));
            eg egVar = new eg(heVar3, cgVar, b3);
            if (editText4 != null) {
                editText4.setOnEditorActionListener(egVar);
            } else {
                editText3.setOnEditorActionListener(egVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s1(boolean z, wb5 wb5Var) {
        boolean z2;
        int i;
        float f;
        final float f2;
        float f3;
        ha5 ha5Var;
        char c;
        float f4;
        float f5;
        ValueAnimator ofFloat;
        ha5 ha5Var2;
        ha5 ha5Var3;
        float paddingLeft = this.b.getPaddingLeft() + gm.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + gm.L(14.0f);
        boolean z3 = this.Q4;
        e75 e75Var = this.l1;
        p85 p85Var = this.J1;
        if (z3) {
            f2 = (p85Var.getX() + (wb5Var.getX() + wb5Var.getAvatarImageView().getX())) - paddingLeft;
            f = (p85Var.getY() + (wb5Var.getY() + wb5Var.getAvatarImageView().getY())) - paddingTop;
            f3 = wb5Var.getAvatarImageView().getMeasuredHeight() / p85Var.getMeasuredWidth();
            i = (int) ((wb5Var.getAvatarImageView().getMeasuredHeight() >> 1) / f3);
        } else {
            if (this.O4 == null) {
                this.E4 = true;
                z2 = true;
            } else {
                if (!z) {
                    if (e75Var.E0.k(e75Var.getCurrentItem()) != 0) {
                        z2 = false;
                        this.E4 = z2;
                    }
                }
                z2 = true;
                this.E4 = z2;
            }
            n95 n95Var = this.N4;
            c75 c75Var = this.T3;
            if (n95Var == null || !z2) {
                l95 l95Var = this.P4;
                if (l95Var != null) {
                    ha5 ha5Var4 = this.O4;
                    y65 y65Var = this.e4;
                    if (ha5Var4 == null) {
                        float x = (c75Var.getX() + (y65Var.getX() + (this.P4.getX() + l95Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y = (c75Var.getY() + (y65Var.getY() + (this.P4.getY() + this.P4.getAvatarImageView().getY()))) - paddingTop;
                        f3 = this.P4.getAvatarImageView().getMeasuredHeight() / p85Var.getMeasuredWidth();
                        i = (int) ((this.P4.getAvatarImageView().getMeasuredHeight() >> 1) / f3);
                        f = y;
                        f2 = x;
                        if (!this.E4 && (ha5Var = this.O4) != null) {
                            ha5Var.invalidate();
                            c75Var.invalidate();
                            ha5 ha5Var5 = this.O4;
                            ha5Var5.h = false;
                            ha5Var5.j(false);
                            this.O4 = null;
                        }
                    } else if (z2) {
                        f2 = (c75Var.getX() + (y65Var.getX() + l95Var.getX())) - paddingLeft;
                        f = (c75Var.getY() + (y65Var.getY() + this.P4.getY())) - paddingTop;
                        i = 0;
                    }
                }
                i = 0;
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.96f;
                if (!this.E4) {
                    ha5Var.invalidate();
                    c75Var.invalidate();
                    ha5 ha5Var52 = this.O4;
                    ha5Var52.h = false;
                    ha5Var52.j(false);
                    this.O4 = null;
                }
            } else {
                float x2 = (p85Var.getX() + n95Var.getX()) - paddingLeft;
                f = ((p85Var.getY() + this.N4.getY()) + gm.L(2.0f)) - paddingTop;
                i = 0;
                f2 = x2;
            }
            f3 = 1.0f;
            if (!this.E4) {
            }
        }
        final float f6 = f;
        final float f7 = f3;
        final int i2 = i;
        d75 d75Var = this.t4;
        if (z) {
            g75 g75Var = this.s4;
            g75Var.setScaleX(f7);
            g75Var.setScaleY(f7);
            g75Var.setTranslationX(f2);
            g75Var.setTranslationY(f6);
            d75Var.setAlpha(0.0f);
        }
        e75Var.N(i2, i2);
        if (this.Z3) {
            i75 i75Var = this.U3;
            if (z) {
                i75Var.setAlpha(0.0f);
            }
            wi8.s(i75Var.animate(), z ? 1.0f : 0.0f, 220L);
        }
        wi8.s(d75Var.animate(), z ? 1.0f : 0.0f, 220L);
        if (!z && (ha5Var3 = this.O4) != null) {
            ha5Var3.h = false;
            ha5Var3.j(true);
            if (e75Var.E0.k(e75Var.getCurrentItem()) != 0) {
                da5 da5Var = this.O4.a;
                da5Var.F = false;
                c = 0;
                da5Var.G = 0L;
                this.N4 = null;
                if (z) {
                    f4 = 1.0f;
                    f5 = 0.0f;
                } else {
                    f4 = 0.0f;
                    f5 = 1.0f;
                }
                float[] fArr = new float[2];
                fArr[c] = f4;
                fArr[1] = f5;
                ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y55
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g95 g95Var = g95.this;
                        g95Var.W3 = floatValue;
                        g95Var.T3.n = floatValue;
                        float f8 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
                        g75 g75Var2 = g95Var.s4;
                        g75Var2.setScaleX(f8);
                        g75Var2.setScaleY(f8);
                        g75Var2.setTranslationX((1.0f - g95Var.W3) * f2);
                        g75Var2.setTranslationY((1.0f - g95Var.W3) * f6);
                        if (!g95Var.Z3) {
                            g95Var.L4.setAlpha((int) (g95Var.W3 * 100.0f));
                        }
                        ha5 ha5Var6 = g95Var.O4;
                        if (ha5Var6 != null) {
                            ha5Var6.a.setRoundCorners((1.0f - g95Var.W3) * gm.L(8.0f));
                        }
                        g75Var2.invalidate();
                        g95Var.b.invalidate();
                        e75 e75Var2 = g95Var.l1;
                        int i3 = (int) ((1.0f - g95Var.W3) * i2);
                        e75Var2.N(i3, i3);
                    }
                });
                this.S4 = nm7.f(this.n1.a).p(new int[]{nm7.b0, nm7.Y1, nm7.C}, this.S4, true);
                ha5Var2 = this.N4 != null ? this.O4 : null;
                if (ha5Var2 != null) {
                    ha5Var2.f = true;
                }
                ofFloat.addListener(new qx((Object) this, (Object) ha5Var2, z, (byte) 4));
                if (!this.Q4 || this.O4 == null) {
                    ofFloat.setInterpolator(d53.f);
                    ofFloat.setDuration(220L);
                    ofFloat.start();
                } else {
                    ofFloat.setInterpolator(d53.f);
                    ofFloat.setDuration(220L);
                    this.O4.a.setAnimateNextDuration(220L);
                    da5 da5Var2 = this.O4.a;
                    if (da5Var2.F) {
                        da5Var2.H.add(ofFloat);
                    } else {
                        ofFloat.start();
                    }
                }
                I0();
            }
        }
        c = 0;
        if (z) {
        }
        float[] fArr2 = new float[2];
        fArr2[c] = f4;
        fArr2[1] = f5;
        ofFloat = ValueAnimator.ofFloat(fArr2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y55
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g95 g95Var = g95.this;
                g95Var.W3 = floatValue;
                g95Var.T3.n = floatValue;
                float f8 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
                g75 g75Var2 = g95Var.s4;
                g75Var2.setScaleX(f8);
                g75Var2.setScaleY(f8);
                g75Var2.setTranslationX((1.0f - g95Var.W3) * f2);
                g75Var2.setTranslationY((1.0f - g95Var.W3) * f6);
                if (!g95Var.Z3) {
                    g95Var.L4.setAlpha((int) (g95Var.W3 * 100.0f));
                }
                ha5 ha5Var6 = g95Var.O4;
                if (ha5Var6 != null) {
                    ha5Var6.a.setRoundCorners((1.0f - g95Var.W3) * gm.L(8.0f));
                }
                g75Var2.invalidate();
                g95Var.b.invalidate();
                e75 e75Var2 = g95Var.l1;
                int i3 = (int) ((1.0f - g95Var.W3) * i2);
                e75Var2.N(i3, i3);
            }
        });
        this.S4 = nm7.f(this.n1.a).p(new int[]{nm7.b0, nm7.Y1, nm7.C}, this.S4, true);
        if (this.N4 != null) {
        }
        if (ha5Var2 != null) {
        }
        ofFloat.addListener(new qx((Object) this, (Object) ha5Var2, z, (byte) 4));
        if (this.Q4) {
        }
        ofFloat.setInterpolator(d53.f);
        ofFloat.setDuration(220L);
        ofFloat.start();
        I0();
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        G1();
    }

    public final void t1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall h;
        this.A1.setText("");
        qd2 qd2Var = this.T2;
        if (qd2Var == null || qd2Var.b == null || (h = qd2Var.h(qd2Var.a)) == null) {
            return;
        }
        qd2 qd2Var2 = this.T2;
        long j = qd2Var2.b.id;
        TLRPC.Peer peer = qd2Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? pg3.n(peer) : z8c.h(this.a).n, tL_textWithEntities, j, h);
    }

    public final void u1(float f) {
        this.N3 = f;
        c75 c75Var = this.T3;
        float max = Math.max(f, c75Var == null ? 0.0f : c75Var.c);
        int i = cmb.Zg;
        int w0 = cmb.w0(null, i, false);
        int i2 = cmb.Wg;
        int R0 = gm.R0(f, 1.0f, w0, cmb.w0(null, i2, false));
        this.O3 = R0;
        this.G1.setBackgroundColor(R0);
        this.b3.I(-14472653);
        this.Y1.setColorFilter(new PorterDuffColorFilter(this.O3, PorterDuff.Mode.MULTIPLY));
        this.H0 = gm.R0(max, 1.0f, cmb.w0(null, i, false), cmb.w0(null, i2, false));
        int R02 = gm.R0(f, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, cmb.jh, false));
        pd pdVar = this.i2;
        if (pdVar != null) {
            pdVar.b = R02;
            sb sbVar = (sb) pdVar.i;
            if (sbVar != null) {
                sbVar.invalidate();
            }
        }
        this.w2.setColor(R02);
        this.x1.setColor(R02);
        this.y1.invalidate();
        p85 p85Var = this.J1;
        p85Var.setGlowColor(R02);
        byte b = this.z3;
        if (b == 3 || h1(b)) {
            this.v1.invalidate();
        }
        View view = this.z4;
        if (view != null) {
            int i3 = this.O3;
            int[] iArr = this.C4;
            iArr[0] = i3;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.B4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.B4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.A4.setBackgroundColor(iArr[0]);
        }
        int R03 = gm.R0(f, 1.0f, cmb.w0(null, cmb.th, false), cmb.w0(null, cmb.uh, false));
        this.t1.a(R03, R03);
        int R04 = gm.R0(f, 1.0f, cmb.w0(null, cmb.bh, false), cmb.w0(null, cmb.eh, false));
        int R05 = gm.R0(f, 1.0f, cmb.w0(null, cmb.ch, false), cmb.w0(null, cmb.hh, false));
        int v0 = cmb.v0(cmb.Ei, this.J0);
        int childCount = p85Var.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = p85Var.getChildAt(i4);
            if (childAt instanceof qb5) {
                qb5 qb5Var = (qb5) childAt;
                if (g1()) {
                    qb5Var.a(v0, v0);
                } else {
                    qb5Var.a(R05, R04);
                }
            } else {
                boolean z = childAt instanceof wb5;
                a85 a85Var = this.H1;
                if (z) {
                    ((wb5) childAt).f(a85Var.getTag() != null ? cmb.hh : cmb.ch, R05);
                } else if (childAt instanceof o95) {
                    ((o95) childAt).a(a85Var.getTag() != null ? cmb.hh : cmb.ch, R05);
                }
            }
        }
        this.b.invalidate();
        p85Var.invalidate();
        this.c.invalidate();
    }

    public final void v1(boolean z) {
        if (this.T2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        qd2 qd2Var = this.T2;
        togglegroupcallsettings.call = qd2Var.h(qd2Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.m5 = Boolean.valueOf(z);
        D1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        mp3 mp3Var = Utilities.d;
        Objects.requireNonNull(mp3Var);
        byte b = 0;
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new rf2(mp3Var, b), new f65(this, b));
    }

    public final void w1(float f) {
        p85 p85Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        u69 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        qd2 qd2Var = this.T2;
        if (qd2Var == null || (p85Var = this.J1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(k47.B1(this.u2))) == null) {
            return;
        }
        c75 c75Var = this.T3;
        if (c75Var.b) {
            int i = 0;
            while (true) {
                y65 y65Var = this.e4;
                if (i >= y65Var.getChildCount()) {
                    break;
                }
                l95 l95Var = (l95) y65Var.getChildAt(i);
                if (k47.B1(l95Var.getParticipant().peer) == k47.B1(groupCallParticipant.peer)) {
                    l95Var.setAmplitude(f * 15.0f);
                }
                i++;
            }
        } else {
            int indexOf = (this.l2 ? this.x2 : this.T2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = p85Var.K(indexOf + this.I1.d)) != null) {
                View view = K.a;
                if (view instanceof wb5) {
                    ((wb5) view).setAmplitude(f * 15.0f);
                    if (view == this.M4 && !this.d4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        c75Var.i(groupCallParticipant, f * 15.0f);
    }

    public final void x1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.V4 = i;
        this.W4 = i2;
        this.X4 = i3;
        this.Y4 = i4;
        this.Z4 = i5;
        this.a5 = i6;
        this.b5 = i7;
        this.c5 = i8;
        this.d5 = i9;
        this.e5 = i10;
        this.f5 = i11;
        this.g5 = i12;
        this.h5 = i13;
        this.i5 = i14;
        this.j5 = i15;
        this.k5 = i16;
    }

    public final void y1(float f) {
        int i;
        this.s2 = f;
        this.J1.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float L = f - gm.L(74.0f);
        float f2 = this.t0 + L;
        float currentActionBarHeight = a.getCurrentActionBarHeight() << 1;
        c75 c75Var = this.T3;
        w65 w65Var = this.Y2;
        t65 t65Var = this.X2;
        if (f2 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((a.getCurrentActionBarHeight() << 1) - L) - this.t0) / (a.getCurrentActionBarHeight() + ((r0 - this.t0) - gm.L(14.0f))));
            i = (int) (gm.L(gm.O1() ? 17.0f : 13.0f) * min);
            if (Math.abs(Math.min(1.0f, min) - this.N3) > 1.0E-4f) {
                u1(Math.min(1.0f, min));
            }
            float v = aq1.v(min, 0.1f, 1.2f, 1.0f);
            t65Var.setScaleX(Math.max(0.9f, v));
            t65Var.setScaleY(Math.max(0.9f, v));
            float f3 = 1.0f - (min * 1.2f);
            t65Var.setAlpha((1.0f - c75Var.c) * Math.max(0.0f, f3));
            w65Var.setScaleX(Math.max(0.9f, v));
            w65Var.setScaleY(Math.max(0.9f, v));
            w65Var.setAlpha((1.0f - c75Var.c) * Math.max(0.0f, f3));
        } else {
            t65Var.setScaleX(1.0f);
            t65Var.setScaleY(1.0f);
            t65Var.setAlpha(1.0f - c75Var.c);
            w65Var.setScaleX(1.0f);
            w65Var.setScaleY(1.0f);
            w65Var.setAlpha(1.0f - c75Var.c);
            if (this.N3 > 1.0E-4f) {
                u1(0.0f);
            }
            i = 0;
        }
        O0();
        float f4 = i;
        this.u3.setTranslationY(Math.max(gm.L(4.0f), (f - gm.L(53.0f)) - f4));
        this.a3.setTranslationY(Math.max(gm.L(4.0f), (f - gm.L(44.0f)) - f4));
        v75 v75Var = this.K1;
        if (v75Var != null) {
            v75Var.setTranslationY(Math.max(gm.L(4.0f), (f - gm.L(44.0f)) - f4));
        }
        this.b.invalidate();
        O1();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
