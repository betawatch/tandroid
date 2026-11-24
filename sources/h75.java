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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h75 extends fx0 implements gk7, VoIPService.StateListener, x74 {
    public static h75 s5;
    public static boolean t5;
    public static boolean u5;
    public static boolean v5;
    public static boolean w5;
    public final o55 A1;
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
    public t09 D1;
    public final oy8 D2;
    public final g75[] D3;
    public final b55 D4;
    public final p65 E1;
    public final oy8 E2;
    public float E3;
    public boolean E4;
    public final hn F1;
    public boolean F2;
    public g75 F3;
    public boolean F4;
    public final x45 G1;
    public final fk0 G2;
    public g75 G3;
    public RenderNode G4;
    public final c65 H1;
    public final fk0 H2;
    public long H3;
    public float H4;
    public final c75 I1;
    public float I2;
    public float I3;
    public final String[] I4;
    public final r65 J1;
    public float J2;
    public float J3;
    public ObjectAnimator J4;
    public final x55 K1;
    public float K2;
    public boolean K3;
    public ObjectAnimator K4;
    public final TextView L1;
    public RadialGradient L2;
    public boolean L3;
    public final s55 L4;
    public final v55 M1;
    public final Matrix M2;
    public int M3;
    public y95 M4;
    public final jia N1;
    public final Paint N2;
    public float N3;
    public o75 N4;
    public final q65 O1;
    public float O2;
    public int O3;
    public h85 O4;
    public final jia P1;
    public float P2;
    public boolean P3;
    public m75 P4;
    public final x65 Q1;
    public ValueAnimator Q2;
    public final int[] Q3;
    public boolean Q4;
    public final vb4 R1;
    public TLRPC.InputPeer R2;
    public final ArrayList R3;
    public boolean R4;
    public final ImageReceiver S1;
    public TLRPC.Chat S2;
    public final ArrayList S3;
    public int S4;
    public int T1;
    public fc2 T2;
    public final e55 T3;
    public AnimatorSet T4;
    public final ImageView U1;
    public final boolean U2;
    public final k55 U3;
    public m65 U4;
    public final b85 V1;
    public final String V2;
    public final y55 V3;
    public int V4;
    public final int W1;
    public final d75 W2;
    public float W3;
    public int W4;
    public final RadialProgressView X1;
    public final v45 X2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout X3;
    public int X4;
    public final Drawable Y1;
    public final y45 Y2;
    public boolean Y3;
    public int Y4;
    public final View Z1;
    public final Paint Z2;
    public boolean Z3;
    public int Z4;
    public AnimatorSet a2;
    public final LinearLayout a3;
    public wl5 a4;
    public int a5;
    public LaunchActivity b2;
    public final r7 b3;
    public t65 b4;
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
    public final a55 e4;
    public int e5;
    public ke5 f2;
    public final a8 f3;
    public final o39 f4;
    public int f5;
    public ke5 g2;
    public final a8 g3;
    public final r95 g4;
    public int g5;
    public int h2;
    public final a8 h3;
    public final n75 h4;
    public int h5;
    public pc i2;
    public final a8 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final ArrayList j2;
    public final r66 j3;
    public final wd1 j4;
    public int j5;
    public j65 k2;
    public final t66 k3;
    public boolean k4;
    public int k5;
    public final g55 l1;
    public boolean l2;
    public final q66 l3;
    public final ArrayList l4;
    public final n65 l5;
    public final l45 m1;
    public long m2;
    public final a8 m3;
    public boolean m4;
    public Boolean m5;
    public final j5 n1;
    public boolean n2;
    public final a8 n3;
    public final w35 n4;
    public Integer n5;
    public final r45 o1;
    public boolean o2;
    public final a8 o3;
    public final w45 o4;
    public final fm0 o5;
    public final dic p1;
    public final RectF p2;
    public final a8 p3;
    public final ql3 p4;
    public final fm0 p5;
    public final dic q1;
    public boolean q2;
    public final a8 q3;
    public final w35 q4;
    public final y74 q5;
    public final dic r1;
    public boolean r2;
    public final a8 r3;
    public final LongSparseIntArray r4;
    public final fm0 r5;
    public final dic s1;
    public float s2;
    public final a8 s3;
    public final i55 s4;
    public final dic t1;
    public a65 t2;
    public final a8 t3;
    public final f55 t4;
    public final dic u1;
    public TLRPC.Peer u2;
    public final LinearLayout u3;
    public LinearLayout u4;
    public final dic v1;
    public TLObject v2;
    public final TextView v3;
    public boolean v4;
    public final s45 w1;
    public final Paint w2;
    public final fyc w3;
    public final oy8 w4;
    public final Paint x1;
    public final ArrayList x2;
    public w35 x3;
    public byte x4;
    public final r55 y1;
    public final ArrayList y2;
    public rb5 y3;
    public boolean y4;
    public final q55 z1;
    public final ArrayList z2;
    public byte z3;
    public final View z4;

    public h75(final LaunchActivity launchActivity, j5 j5Var, fc2 fc2Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super((wjb) null, (Context) launchActivity, true, true);
        int i;
        final h75 h75Var;
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
        this.w3 = new fyc(new w35(this, (byte) 4));
        byte b = 0;
        this.z3 = (byte) 0;
        this.B3 = new Paint(7);
        this.C3 = new Paint(7);
        this.D3 = new g75[8];
        this.E3 = 1.0f;
        this.P3 = true;
        this.Q3 = new int[4];
        this.R3 = new ArrayList();
        this.S3 = new ArrayList();
        this.j4 = new wd1();
        this.l4 = new ArrayList();
        this.n4 = new w35(this, b);
        this.o4 = new w45(this);
        this.p4 = new ql3((byte) 11);
        this.q4 = new w35(this, (byte) 2);
        this.r4 = new LongSparseIntArray();
        this.C4 = new int[2];
        this.F4 = true;
        this.I4 = new String[2];
        this.S4 = -1;
        this.l5 = new n65(this);
        s33 s33Var = s33.f;
        this.o5 = new fm0(2, this, s33Var, 350L);
        this.p5 = new fm0(3, this, s33Var, 220L, true);
        this.q5 = new y74(4, this, s33Var, 350L);
        this.r5 = new fm0(5, this, s33Var, 350L);
        gl.S(getWindow());
        this.S0 = true;
        this.n1 = j5Var;
        this.T2 = fc2Var;
        this.R2 = inputPeer;
        this.S2 = chat;
        this.V2 = str;
        this.a = j5Var.a;
        this.U2 = z;
        this.J0 = new e53();
        this.Q0 = true;
        this.R0 = true;
        this.W1 = na7.q1(this.a).k4.B.f();
        this.V = true;
        v5 = false;
        u5 = false;
        w5 = false;
        this.z0 = new h55(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.G0 = -1;
        this.L4 = new s55(this);
        setOnDismissListener(new b45(this, b));
        this.q0 = (byte) 75;
        c75 c75Var = new c75(this, launchActivity);
        this.I1 = c75Var;
        pg2 pg2Var = new pg2(true);
        int i2 = bkb.gh;
        pg2Var.b(bkb.u0(i2));
        pg2Var.d();
        c65 c65Var = new c65(this, launchActivity, pg2Var);
        this.H1 = c65Var;
        c65Var.setSubtitle("");
        c65Var.getSubtitleTextView().setVisibility(0);
        c65Var.r();
        c65Var.getAdditionalSubtitleTextView().setPadding(gl.L(24.0f), 0, 0, 0);
        gl.Q3(1.0f, c65Var.getAdditionalSubtitleTextView(), this.m4, false);
        c65Var.getAdditionalSubtitleTextView().setTextColor(bkb.u0(i2));
        int i3 = bkb.bh;
        zkb.l(c65Var, 6, i3, null);
        c65Var.setBackButtonImage(R.drawable.ic_ab_back);
        c65Var.setOccupyStatusBar(false);
        c65Var.setAllowOverlayTitle(false);
        int i4 = bkb.Xg;
        zkb.l(c65Var, 1, i4, null);
        zkb.l(c65Var, 3, bkb.y8, null);
        zkb.c(c65Var, i4);
        zkb.l(c65Var, 6, i3, null);
        c65Var.setActionBarMenuOnItemClick(new k65(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new x35(this, (byte) 2);
        j5Var.c().b(this, kk7.v2);
        j5Var.c().b(this, kk7.L0);
        j5Var.c().b(this, kk7.S);
        j5Var.c().b(this, kk7.t1);
        j5Var.c().b(this, kk7.A2);
        j5Var.c().b(this, kk7.D0);
        j5Var.c().b(this, kk7.i0);
        j5Var.c().b(this, 2);
        j5Var.c().b(this, kk7.y2);
        j5Var.c().b(this, kk7.x2);
        j5Var.c().b(this, kk7.T3);
        kk7.e().b(this, kk7.P4);
        kk7.e().b(this, kk7.C2);
        this.Y1 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        oy8 oy8Var = new oy8(R.raw.voip_filled, gl.L(46.0f), gl.L(46.0f), true, null);
        this.D2 = oy8Var;
        this.E2 = new oy8(R.raw.hand_2, gl.L(46.0f), gl.L(46.0f), true, null);
        p65 p65Var = new p65(this, launchActivity);
        this.E1 = p65Var;
        this.b = p65Var;
        p65Var.setClipToPadding(false);
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
            jia jiaVar = new jia(launchActivity);
            this.N1 = jiaVar;
            jiaVar.setGravity(17);
            jiaVar.setTextColor(-1);
            jiaVar.setTypeface(gl.o());
            jiaVar.setTextSize(18);
            jiaVar.k(k96.L0(2131743193));
            this.b.addView(jiaVar, nme.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            q65 q65Var = new q65(this, launchActivity);
            this.O1 = q65Var;
            q65Var.setGravity(17);
            q65Var.setTextColor(-1);
            q65Var.setTypeface(gl.o());
            q65Var.setTextSize(60);
            this.b.addView(q65Var, nme.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            jia jiaVar2 = new jia(launchActivity);
            this.P1 = jiaVar2;
            jiaVar2.setGravity(17);
            jiaVar2.setTextColor(-1);
            jiaVar2.setTypeface(gl.o());
            jiaVar2.setTextSize(18);
            this.b.addView(jiaVar2, nme.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        r65 r65Var = new r65(this, launchActivity);
        this.J1 = r65Var;
        r65Var.setClipToPadding(false);
        r65Var.setClipChildren(false);
        x65 x65Var = new x65(this);
        this.Q1 = x65Var;
        x65Var.o = s33Var;
        x65Var.d = (short) 350;
        x65Var.c = (short) 350;
        x65Var.e = (short) 350;
        x65Var.C = false;
        r65Var.setItemAnimator(x65Var);
        r65Var.setOnScrollListener(new s65(this));
        r65Var.setVerticalScrollBarEnabled(false);
        getContext();
        vb4 vb4Var = new vb4(u5 ? 6 : 2, r65Var);
        this.R1 = vb4Var;
        r65Var.setLayoutManager(vb4Var);
        l45 l45Var = new l45(this);
        this.m1 = l45Var;
        vb4Var.O = l45Var;
        r65Var.i(new m45(this));
        vb4Var.W = false;
        this.b.addView(r65Var, nme.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        r65Var.setAdapter(c75Var);
        r65Var.setTopBottomSelectorRadius(13);
        zkb.I(bkb.Ug, r65Var);
        r65Var.setOnItemClickListener(new lt2((Object) this, (Object) launchActivity, (Object) fc2Var, (byte) 13));
        r65Var.setOnItemLongClickListener(new x35(this, (byte) 3));
        o39 o39Var = new o39(launchActivity);
        this.f4 = o39Var;
        this.b.addView(o39Var, nme.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        r95 r95Var = new r95(fc2Var, this.a, this);
        this.g4 = r95Var;
        o39Var.setAdapter(r95Var);
        r35 r35Var = new r35(6, false);
        o39Var.setLayoutManager(r35Var);
        r35Var.O = new o45(this);
        final byte b2 = 1;
        o39Var.setOnItemClickListener(new c39(this) { // from class: v35
            public final /* synthetic */ h75 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i6, View view) {
                byte b3 = b2;
                h75 h75Var2 = this.b;
                switch (b3) {
                    case 0:
                        m75 m75Var = (m75) view;
                        if (m75Var.getVideoParticipant() != null) {
                            h75Var2.V0(m75Var.getVideoParticipant());
                            break;
                        } else {
                            h75Var2.V0(new gc2(m75Var.getParticipant(), false));
                            break;
                        }
                    default:
                        o75 o75Var = (o75) view;
                        if (o75Var.getParticipant() != null) {
                            h75Var2.V0(o75Var.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        gb3 gb3Var = new gb3();
        gb3Var.C = false;
        gb3Var.o = s33Var;
        gb3Var.d = (short) 350;
        gb3Var.c = (short) 350;
        gb3Var.e = (short) 350;
        o39Var.setItemAnimator(new p45(this));
        o39Var.setOnScrollListener(new q45(this));
        r95Var.H(o39Var, false, false);
        o39Var.setVisibility(8);
        r45 r45Var = new r45(this, launchActivity);
        this.o1 = r45Var;
        int u0 = bkb.u0(bkb.zh);
        int red = Color.red(u0);
        int green = Color.green(u0);
        int blue = Color.blue(u0);
        this.M2 = new Matrix();
        this.L2 = new RadialGradient(0.0f, 0.0f, gl.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.N2 = paint;
        paint.setShader(this.L2);
        fk0 fk0Var = new fk0(9);
        this.G2 = fk0Var;
        fk0 fk0Var2 = new fk0(12);
        this.H2 = fk0Var2;
        fk0Var.a = gl.L(62.0f) * 0.45454547f;
        fk0Var.b = gl.L(72.0f) * 0.45454547f;
        fk0Var.b();
        fk0Var2.a = gl.L(65.0f) * 0.45454547f;
        fk0Var2.b = gl.L(75.0f) * 0.45454547f;
        fk0Var2.b();
        int i6 = bkb.yh;
        fk0Var.d.setColor(bm2.o(bkb.u0(i6), 38));
        fk0Var2.d.setColor(bm2.o(bkb.u0(i6), 76));
        dic dicVar = new dic(launchActivity, 50.0f);
        this.s1 = dicVar;
        dicVar.setCheckable(true);
        dicVar.setTextSize(12);
        r45Var.a(dicVar);
        dicVar.setOnClickListener(new u35(this, (byte) 6));
        dic dicVar2 = new dic(launchActivity, 50.0f);
        this.r1 = dicVar2;
        dicVar2.setCheckable(true);
        dicVar2.setTextSize(12);
        dicVar2.d(false, false);
        dicVar2.setCrossOffset(-gl.N(3.5f));
        dicVar2.c(R.drawable.calls_video, -1, 0, 1.0f, true, k96.L0(2131743247), false, false);
        dic dicVar3 = new dic(launchActivity, 50.0f);
        this.p1 = dicVar3;
        dicVar3.setCheckable(true);
        dicVar3.setTextSize(12);
        dicVar3.d(false, false);
        ry8 ry8Var = new ry8(launchActivity);
        dicVar3.addView(ry8Var, nme.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        oy8 oy8Var2 = new oy8(R.raw.camera_flip, gl.L(24.0f), gl.L(24.0f), true, null);
        this.w4 = oy8Var2;
        ry8Var.setAnimation(oy8Var2);
        dicVar3.setOnClickListener(new u35(this, (byte) 7));
        r45Var.a(dicVar3);
        dic dicVar4 = new dic(launchActivity, 50.0f);
        this.q1 = dicVar4;
        dicVar4.setCheckable(true);
        dicVar4.setTextSize(12);
        dicVar4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.T1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        dicVar4.addView(imageView, nme.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        dicVar4.setOnClickListener(new u35(this, (byte) 10));
        r45Var.a(dicVar4);
        r45Var.a(dicVar2);
        dic dicVar5 = new dic(launchActivity, 50.0f);
        this.t1 = dicVar5;
        dicVar5.setTextSize(12);
        dicVar5.c(R.drawable.calls_decline, -1, bkb.u0(bkb.th), 0.3f, false, k96.L0(2131743122), false, false);
        final byte b3 = 1;
        dicVar5.setOnClickListener(new View.OnClickListener(this) { // from class: a45
            public final /* synthetic */ h75 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                LaunchActivity launchActivity2 = launchActivity;
                h75 h75Var2 = this.b;
                switch (b4) {
                    case 0:
                        LaunchActivity launchActivity3 = h75Var2.b2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            h75Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, kk7.o1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                h75Var2.L1(true, false);
                                h75Var2.K1(false);
                                h75Var2.T2.B();
                                h75Var2.D0(true);
                                h75Var2.o1.requestLayout();
                                break;
                            } else {
                                h75Var2.c2[0].d(1, false);
                                if (h75Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    a65 a65Var = new a65(h75Var2, launchActivity2, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    h75Var2.t2 = a65Var;
                                    a65Var.setBottomPadding(h75Var2.b.getPaddingBottom());
                                    h75Var2.c.addView(h75Var2.t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        e55 e55Var = h75Var2.T3;
                        ez3 ez3Var = e55Var.i0;
                        if (e55Var.h0) {
                            gl.r(ez3Var);
                        }
                        gl.d3(ez3Var, 3000L);
                        e55Var.h0 = true;
                        fc2 fc2Var2 = h75Var2.T2;
                        if (fc2Var2 != null && !fc2Var2.k()) {
                            h75Var2.E1();
                            h75.l1(launchActivity2, new w35(h75Var2, (byte) 6), false, false);
                            break;
                        } else {
                            h75Var2.dismiss();
                            break;
                        }
                }
            }
        });
        dic dicVar6 = new dic(launchActivity, 50.0f);
        this.u1 = dicVar6;
        dicVar6.setCheckable(true);
        dicVar6.b(true, false);
        dicVar6.setTextSize(12);
        dicVar6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, k96.L0(2131743052), false, false);
        s45 s45Var = new s45(this, launchActivity);
        this.w1 = s45Var;
        s45Var.setAnimation(oy8Var);
        s45Var.setScaleType(ImageView.ScaleType.CENTER);
        dic dicVar7 = new dic(launchActivity, 50.0f);
        this.v1 = dicVar7;
        dicVar7.setDrawBackground(false);
        dicVar7.setTextSize(12);
        dicVar7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        dicVar7.addView(s45Var, nme.e(50, 50, 49));
        r45Var.a(dicVar7);
        dicVar7.setOnClickListener(new u45(this));
        r45Var.a(dicVar6);
        r45Var.a(dicVar5);
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.X1 = radialProgressView;
        radialProgressView.setSize(gl.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(bkb.u0(bkb.Eh));
        c65Var.setAlpha(0.0f);
        c65Var.getBackButton().setScaleX(0.9f);
        c65Var.getBackButton().setScaleY(0.9f);
        c65Var.getBackButton().setTranslationX(-gl.L(14.0f));
        c65Var.getTitleTextView().setTranslationY(gl.L(23.0f));
        c65Var.getSubtitleTextView().setTranslationY(gl.L(20.0f));
        c65Var.getAdditionalSubtitleTextView().setTranslationY(gl.L(20.0f));
        r7 r7Var = new r7(launchActivity, (r6) null, bkb.u0(i));
        this.b3 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setIcon(R.drawable.ic_ab_other);
        r7Var.setContentDescription(k96.L0(2131754838));
        r7Var.setSubMenuOpenSide(2);
        r7Var.setDelegate(new x35(this, (byte) 5));
        int i7 = bkb.Yg;
        zkb.Q(r7Var, bkb.e0(bkb.u0(i7), 6), null, zkb.M(i7));
        r7Var.setOnClickListener(new u35(this, (byte) 11));
        r7Var.O(bkb.u0(i), false);
        r7Var.O(bkb.u0(i), true);
        r7 r7Var2 = new r7(launchActivity, (r6) null, bkb.u0(i));
        this.c3 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(R.drawable.msg_voice_pip);
        r7Var2.setContentDescription(k96.L0(2131754807));
        zkb.Q(r7Var2, bkb.e0(bkb.u0(i7), 6), null, zkb.M(i7));
        r7Var2.setOnClickListener(new u35(this, (byte) 12));
        r7 r7Var3 = new r7(launchActivity, (r6) null, bkb.u0(i));
        this.d3 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        r7Var3.setIcon(R.drawable.msg_screencast);
        r7Var3.setContentDescription(k96.L0(2131754807));
        zkb.Q(r7Var3, bkb.e0(bkb.u0(i7), 6), null, zkb.M(i7));
        r7Var3.setOnClickListener(new u35(this, b));
        v45 v45Var = new v45(this, launchActivity, launchActivity);
        this.X2 = v45Var;
        x45 x45Var = new x45(launchActivity);
        this.G1 = x45Var;
        x45Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.Z2 = paint2;
        paint2.setColor(-12761513);
        y45 y45Var = new y45(this, getContext());
        this.Y2 = y45Var;
        zkb.X(y45Var, i, this.J0);
        y45Var.setTextSize(1, 11.0f);
        y45Var.setText(k96.L0(2131743232));
        y45Var.setMaxLines(1);
        y45Var.setGravity(17);
        y45Var.setTypeface(gl.o());
        y45Var.setPadding(gl.L(8.0f), gl.L(0.0f), gl.L(8.0f), gl.L(0.0f));
        if (!i1()) {
            y45Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a3 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(v45Var, nme.l(1.0f, 0, -2));
        linearLayout.addView(y45Var, nme.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView(x45Var, nme.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, nme.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(c65Var, nme.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.u3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r7Var3, nme.o(48, 48));
        linearLayout2.addView(r7Var2, nme.o(48, 48));
        linearLayout2.addView(r7Var, nme.o(48, 48));
        this.b.addView(linearLayout2, nme.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.Z1 = view;
        view.setAlpha(0.0f);
        zkb.h(bkb.U5, null, view);
        this.b.addView(view, nme.c(1.0f, -1));
        for (int i8 = 0; i8 < 2; i8++) {
            this.c2[i8] = new z45(this, launchActivity);
            this.c2[i8].setAdditionalTranslationY(gl.L(10.0f));
            this.c2[i8].setTranslationZ(gl.L(5.0f));
            this.b.addView(this.c2[i8], nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        k5 k5Var = new k5(launchActivity, true);
        this.d2 = k5Var;
        k5Var.setTag(R.id.fit_width_tag, Integer.valueOf(kk7.O3));
        this.b3.h(k5Var, gl.L(48.0f));
        this.b3.setShowSubmenuByMove(false);
        int i9 = bkb.Ug;
        zkb.Q(k5Var, bkb.Y(bkb.u0(i9), 6, 6), null, zkb.M(i9));
        r7 r7Var4 = this.b3;
        a8 d = r7Var4.d(1, 0, null, k96.L0(2131743159), true, true, r7Var4.n0);
        this.p3 = d;
        d.m(true, false);
        r7 r7Var5 = this.b3;
        a8 d2 = r7Var5.d(2, 0, null, k96.L0(2131743112), true, true, r7Var5.n0);
        this.q3 = d2;
        d2.m(false, true);
        int i10 = bkb.mh;
        d.setCheckColor(i10);
        d.d(bkb.u0(i10), bkb.u0(i10));
        d2.setCheckColor(i10);
        d2.d(bkb.u0(i10), bkb.u0(i10));
        Paint paint3 = new Paint(1);
        paint3.setColor(bkb.u0(bkb.Xg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(gl.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        a8 f = this.b3.f(null, k96.L0(2131743157), 10, true, R.drawable.msg_voice_speaker);
        this.g3 = f;
        f.setItemHeight(56);
        a8 f2 = this.b3.f(null, k96.L0(2131743040), 11, true, R.drawable.msg_noise_on);
        this.h3 = f2;
        f2.setItemHeight(56);
        r66 r66Var = new r66(q66.a());
        this.j3 = r66Var;
        a8 f3 = this.b3.f(r66Var, k96.L0(2131745059), 14, false, 0);
        this.i3 = f3;
        f3.setItemHeight(56);
        f3.setRightIcon(R.drawable.msg_settings);
        f3.setSubtext(k96.L0(q66.a() ? 2131745057 : 2131745058));
        f3.getRightIcon().setBackground(bkb.e0(bkb.u0(i9), 1));
        int i11 = (k96.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f3.getRightIcon();
        boolean z2 = k96.a0;
        rightIcon.setLayoutParams(nme.d(40, 40.0f, i11, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(bm2.f(0.3f, bkb.u0(bkb.Wg), -16777216));
        boolean z3 = k96.a0;
        FrameLayout.LayoutParams d3 = nme.d(-1, 28.0f, i11, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d3.width = 1;
        view2.setLayoutParams(d3);
        f3.addView(view2);
        View[] viewArr = {f3.getTextView(), f3.getSubtextView()};
        for (int i12 = 0; i12 < 2; i12++) {
            View view3 = viewArr[i12];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = k96.a0 ? gl.L(60.0f) : 0;
                layoutParams.rightMargin = k96.a0 ? 0 : gl.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        this.i3.getRightIcon().setContentDescription(k96.L0(2131745041));
        this.i3.getRightIcon().setOnClickListener(new u35(this, (byte) 1));
        TextView b4 = this.b3.b(bm2.f(0.3f, bkb.u0(bkb.Wg), -16777216));
        this.v3 = b4;
        ((ViewGroup.MarginLayoutParams) b4.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b4.getLayoutParams()).bottomMargin = 0;
        a8 f4 = this.b3.f(this.W2, k96.L0(hc2.W(this.S2) ? 2131743243 : 2131743142), 6, true, R.drawable.msg_edit);
        this.f3 = f4;
        a8 f5 = this.b3.f(this.W2, k96.L0(2131743143), 7, false, R.drawable.msg_permissions);
        this.m3 = f5;
        a8 e = this.b3.e(3, R.drawable.msg_link, k96.L0(2131743095));
        this.e3 = e;
        d75 d75Var = new d75();
        this.W2 = d75Var;
        a8 e2 = this.b3.e(9, R.drawable.msg_screencast, k96.L0(2131743194));
        this.o3 = e2;
        a8 f6 = this.b3.f(d75Var, k96.L0(2131743106), 5, true, 0);
        this.n3 = f6;
        d75Var.g = f6.getImageView();
        a8 e3 = this.b3.e(12, R.drawable.menu_stream_comments_24, k96.L0(2131743242));
        this.s3 = e3;
        a8 e4 = this.b3.e(13, R.drawable._menu_stream_comments_off_24, k96.L0(2131743244));
        this.t3 = e4;
        a8 e5 = this.b3.e(4, R.drawable.msg_cancel, k96.L0(g1() ? 2131743137 : hc2.W(this.S2) ? 2131743239 : 2131743138));
        this.r3 = e5;
        this.b3.setPopupItemsSelectorColor(bkb.u0(bkb.Ug));
        this.b3.getPopupLayout().setFitItems(true);
        int i13 = bkb.Xg;
        e3.d(bkb.u0(i13), bkb.u0(i13));
        e4.d(bkb.u0(i13), bkb.u0(i13));
        this.g3.d(bkb.u0(i13), bkb.u0(i13));
        this.h3.d(bkb.u0(i13), bkb.u0(i13));
        z1(this.i3, bkb.u0(i13));
        int i14 = bkb.lh;
        e5.d(bkb.u0(i14), bkb.u0(i14));
        e.d(bkb.u0(i13), bkb.u0(i13));
        f4.d(bkb.u0(i13), bkb.u0(i13));
        f5.d(bkb.u0(i13), bkb.u0(i13));
        f6.d(bkb.u0(i13), bkb.u0(i13));
        e2.d(bkb.u0(i13), bkb.u0(i13));
        if (this.T2 != null) {
            d1();
        }
        if (g1()) {
            this.i2 = new pc();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.i2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        N1(false);
        this.H1.getTitleTextView().setOnClickListener(new u35(this, (byte) 2));
        a55 a55Var = new a55(this, launchActivity);
        this.e4 = a55Var;
        b55 b55Var = new b55(this);
        this.D4 = b55Var;
        final byte b5 = 0;
        a55Var.setClipToPadding(false);
        b55Var.C = false;
        b55Var.o = s33.f;
        b55Var.d = (short) 350;
        b55Var.c = (short) 350;
        b55Var.e = (short) 350;
        a55Var.setItemAnimator(b55Var);
        a55Var.setOnScrollListener(new c55(this));
        a55Var.setClipChildren(false);
        t26 t26Var = new t26();
        t26Var.i1(0);
        a55Var.setLayoutManager(t26Var);
        n75 n75Var = new n75(fc2Var, this.a, this);
        this.h4 = n75Var;
        a55Var.setAdapter(n75Var);
        n75Var.F(a55Var, false);
        a55Var.setOnItemClickListener(new c39(this) { // from class: v35
            public final /* synthetic */ h75 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i62, View view4) {
                byte b32 = b5;
                h75 h75Var2 = this.b;
                switch (b32) {
                    case 0:
                        m75 m75Var = (m75) view4;
                        if (m75Var.getVideoParticipant() != null) {
                            h75Var2.V0(m75Var.getVideoParticipant());
                            break;
                        } else {
                            h75Var2.V0(new gc2(m75Var.getParticipant(), false));
                            break;
                        }
                    default:
                        o75 o75Var = (o75) view4;
                        if (o75Var.getParticipant() != null) {
                            h75Var2.V0(o75Var.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        a55Var.setOnItemLongClickListener(new x35(this, b5));
        a55Var.setVisibility(8);
        a55Var.i(new d55());
        e55 e55Var = new e55(this, launchActivity, this.J1, a55Var, this.R3, this.T2, this);
        this.T3 = e55Var;
        e55Var.setClipChildren(false);
        n75Var.E(this.R3, e55Var);
        if (this.f4 != null) {
            this.g4.G(this.R3, e55Var);
        }
        f55 f55Var = new f55(this, launchActivity);
        this.t4 = f55Var;
        g55 g55Var = new g55(this, launchActivity, this.H1, this.J1, f55Var);
        this.l1 = g55Var;
        g55Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        g55Var.setInvalidateWithParent(true);
        f55Var.setProfileGalleryView(g55Var);
        i55 i55Var = new i55(this, launchActivity);
        this.s4 = i55Var;
        i55Var.setVisibility(8);
        g55Var.setVisibility(0);
        g55Var.b(new j55(this));
        k55 k55Var = new k55(this, launchActivity);
        this.U3 = k55Var;
        this.b.addView(e55Var);
        e55Var.addView(a55Var, nme.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.o1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.z4 = view4;
        int[] iArr = this.C4;
        iArr[0] = this.O3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.C4);
        this.B4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.b.addView(view4, nme.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.A4 = view5;
        view5.setBackgroundColor(this.C4[0]);
        this.b.addView(view5, nme.e(-1, 0, 83));
        b85 b85Var = new b85(launchActivity);
        this.V1 = b85Var;
        b85Var.setDelegate(new l55(this));
        b85Var.setClickCellDelegate(new m55(this));
        fc2 fc2Var2 = this.T2;
        if (fc2Var2 != null) {
            b85Var.E0(this.n1.a, fc2Var2.h(false));
        }
        this.b.addView(b85Var, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        t66 t66Var = new t66(launchActivity);
        this.k3 = t66Var;
        t66Var.setOnContentHeightChanged(new w35(this, (byte) 1));
        this.b.addView(t66Var, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l3 = new q66(new n55(this));
        hn hnVar = new hn(launchActivity, false, true, true);
        this.F1 = hnVar;
        hnVar.setGravity(17);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTextColor(-1);
        hnVar.b(0.4f, 320L, s33.h);
        hnVar.setTypeface(gl.o());
        this.b.addView(this.o1);
        o55 o55Var = new o55(this, launchActivity, this.E1, LaunchActivity.Q(), this.J0);
        this.A1 = o55Var;
        o55Var.K = true;
        o55Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.W1)});
        o55Var.getEditText().setLinkTextColor(-11683585);
        o55Var.setHint(k96.L0(2131743689));
        o55Var.getEditText().addTextChangedListener(new p55(this));
        o55Var.s();
        q55 q55Var = new q55(this, launchActivity);
        this.z1 = q55Var;
        this.b.addView(q55Var, nme.c(-1.0f, -1));
        r55 r55Var = new r55(launchActivity);
        this.y1 = r55Var;
        r55Var.addView(o55Var, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        r55Var.addView(hnVar, nme.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        hnVar.setTranslationY(-gl.L(20.0f));
        this.b.addView(r55Var, nme.e(-1, -2, 80));
        ImageView imageView2 = new ImageView(launchActivity);
        this.C1 = imageView2;
        int i15 = bkb.h6;
        zkb.R(imageView2, bkb.f0(T(i15), 1, -1), null, zkb.M(i15), this.J0);
        int i16 = bkb.e7;
        wjb wjbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView2, i16, wjbVar, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.arrow_more);
        imageView2.setOnClickListener(new u35(this, (byte) 3));
        ImageView imageView3 = new ImageView(launchActivity);
        this.B1 = imageView3;
        zkb.R(imageView3, bkb.f0(T(i15), 1, -1), null, zkb.M(i15), this.J0);
        zkb.s(imageView3, bkb.u6, this.J0, mode);
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_send);
        imageView3.setOnClickListener(new u35(this, (byte) 4));
        r55Var.addView(imageView2, nme.e(48, 48, 85));
        r55Var.addView(imageView3, nme.e(48, 48, 85));
        this.b.addView(k55Var);
        i55Var.addView(g55Var, nme.c(-1.0f, -1));
        i55Var.addView(f55Var, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(i55Var, nme.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
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
            if (hc2.T(this.S2) && (chat2 = this.S2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, nme.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            hn7 hn7Var = new hn7(launchActivity);
            hn7Var.setTextColor(-1);
            hn7Var.setSelectorColor(-9598483);
            hn7Var.setTextOffset(gl.L(10.0f));
            hn7Var.setItemCount(5);
            t55 t55Var = new t55(launchActivity);
            t55Var.setItemCount(5);
            t55Var.setTextColor(-1);
            t55Var.setSelectorColor(-9598483);
            t55Var.setTextOffset(-gl.L(10.0f));
            u55 u55Var = new u55(launchActivity);
            u55Var.setItemCount(5);
            u55Var.setTextColor(-1);
            u55Var.setSelectorColor(-9598483);
            u55Var.setTextOffset(-gl.L(34.0f));
            v55 v55Var = new v55(launchActivity);
            this.M1 = v55Var;
            v55Var.setLines(1);
            v55Var.setSingleLine(true);
            v55Var.setEllipsize(TextUtils.TruncateAt.END);
            v55Var.setGravity(17);
            v55Var.setTextColor(-1);
            v55Var.setTypeface(gl.o());
            v55Var.setTextSize(1, 14.0f);
            this.b.addView(v55Var, nme.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            v55Var.setOnClickListener(new y35(this, hn7Var, t55Var, u55Var, chat, j5Var, inputPeer2, (byte) 0));
            x55 x55Var = new x55(launchActivity, hn7Var, t55Var, u55Var);
            this.K1 = x55Var;
            x55Var.setWeightSum(1.0f);
            x55Var.setOrientation(0);
            this.b.addView(x55Var, nme.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            int i18 = calendar.get(6);
            x55Var.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
            hn7Var.setMinValue(0);
            hn7Var.setMaxValue(365);
            hn7Var.setWrapSelectorWheel(false);
            hn7Var.setFormatter(new om0(currentTimeMillis, calendar, i17, (byte) 1));
            lt ltVar = new lt((Object) this, (Object) hn7Var, (Object) t55Var, (Object) u55Var, (byte) 12);
            hn7Var.setOnValueChangedListener(ltVar);
            t55Var.setMinValue(0);
            t55Var.setMaxValue(23);
            x55Var.addView(t55Var, nme.l(0.2f, 0, kk7.s4));
            t55Var.setFormatter(new wn4((byte) 8));
            t55Var.setOnValueChangedListener(ltVar);
            u55Var.setMinValue(0);
            u55Var.setMaxValue(59);
            u55Var.setValue(0);
            u55Var.setFormatter(new wn4((byte) 9));
            x55Var.addView(u55Var, nme.l(0.3f, 0, kk7.s4));
            u55Var.setOnValueChangedListener(ltVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i19 = calendar.get(6);
            int i20 = calendar.get(12);
            int i21 = calendar.get(11);
            hn7Var.setValue(i18 != i19 ? 1 : 0);
            u55Var.setValue(i20);
            t55Var.setValue(i21);
            h75Var = this;
            ij.g(v55Var, textView, 0L, 604800L, 2, hn7Var, t55Var, u55Var);
        } else {
            h75Var = this;
        }
        y55 y55Var = new y55(h75Var, (ViewGroup) h75Var.getWindow().getDecorView(), h75Var.b);
        h75Var.V3 = y55Var;
        y55Var.E = new z55(h75Var);
        g55Var.setPinchToZoomHelper(y55Var);
        final byte b6 = 0;
        h75Var.r1.setOnClickListener(new View.OnClickListener(h75Var) { // from class: a45
            public final /* synthetic */ h75 b;

            {
                this.b = h75Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                byte b42 = b6;
                LaunchActivity launchActivity2 = launchActivity;
                h75 h75Var2 = this.b;
                switch (b42) {
                    case 0:
                        LaunchActivity launchActivity3 = h75Var2.b2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            h75Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, kk7.o1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                h75Var2.L1(true, false);
                                h75Var2.K1(false);
                                h75Var2.T2.B();
                                h75Var2.D0(true);
                                h75Var2.o1.requestLayout();
                                break;
                            } else {
                                h75Var2.c2[0].d(1, false);
                                if (h75Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    a65 a65Var = new a65(h75Var2, launchActivity2, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    h75Var2.t2 = a65Var;
                                    a65Var.setBottomPadding(h75Var2.b.getPaddingBottom());
                                    h75Var2.c.addView(h75Var2.t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        e55 e55Var2 = h75Var2.T3;
                        ez3 ez3Var = e55Var2.i0;
                        if (e55Var2.h0) {
                            gl.r(ez3Var);
                        }
                        gl.d3(ez3Var, 3000L);
                        e55Var2.h0 = true;
                        fc2 fc2Var22 = h75Var2.T2;
                        if (fc2Var22 != null && !fc2Var22.k()) {
                            h75Var2.E1();
                            h75.l1(launchActivity2, new w35(h75Var2, (byte) 6), false, false);
                            break;
                        } else {
                            h75Var2.dismiss();
                            break;
                        }
                }
            }
        });
        h75Var.J1(false);
        h75Var.E1();
        h75Var.K1(false);
        h75Var.L1(false, false);
        h75Var.u1(0.0f);
        h75Var.M1();
        h75Var.b.addView(new FrameLayout(launchActivity), nme.e(-1, kk7.d3, 87));
        h75Var.u1.setOnClickListener(new u35(h75Var, (byte) 5));
        h75Var.J0();
        ote.a(h75Var.r1);
        ote.a(h75Var.s1);
        ote.a(h75Var.p1);
        ote.a(h75Var.q1);
        ote.a(h75Var.v1);
        ote.a(h75Var.t1);
        ote.a(h75Var.u1);
        ViewGroup viewGroup2 = h75Var.b;
        x35 x35Var = new x35(h75Var, (byte) 1);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(viewGroup2, x35Var);
    }

    public static void S0(LaunchActivity launchActivity, j5 j5Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        LaunchActivity launchActivity2;
        h75 h75Var;
        TLRPC.GroupCall groupCall;
        fc2 fc2Var;
        if (s5 == null && on9.Q0 == null) {
            if (inputPeer != null) {
                fc2 e1 = na7.q1(j5Var.a).e1(chat.id, false, null);
                if (e1 != null && (groupCall = e1.b) != null && groupCall.rtmp_stream && !e1.k()) {
                    return;
                }
                launchActivity2 = launchActivity;
                h75 h75Var2 = new h75(launchActivity2, j5Var, e1, chat, inputPeer, z, str);
                s5 = h75Var2;
                h75Var = h75Var2;
            } else {
                if (VoIPService.getSharedInstance() == null || (fc2Var = VoIPService.getSharedInstance().groupCall) == null) {
                    return;
                }
                TLRPC.GroupCall groupCall2 = fc2Var.b;
                if (groupCall2 != null && groupCall2.rtmp_stream && !fc2Var.k()) {
                    if (on9.Q0 != null || launchActivity == null) {
                        return;
                    }
                    on9 on9Var = new on9(launchActivity, j5Var, fc2Var, na7.q1(j5Var.a).K0(Long.valueOf(fc2Var.c)));
                    on9.Q0 = on9Var;
                    on9Var.show();
                    return;
                }
                TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(fc2Var.c));
                fc2Var.b(true);
                h75Var = new h75(launchActivity, j5Var, fc2Var, K0, null, z, str);
                s5 = h75Var;
                launchActivity2 = launchActivity;
            }
            h75Var.b2 = launchActivity2;
            gl.c3(new ql3((byte) 10));
        }
    }

    public static String W0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 0) {
            return k96.M0(2131743257, null);
        }
        if (i == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? k96.M0(2131743258, null) : k96.M0(2131743259, null);
        }
        if (i != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? k96.M0(2131743261, null) : str;
    }

    public static String X0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? k96.M0(2131743256, null) : k96.a0(null, null, 2131743255, str) : i == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? k96.M0(2131743253, null) : k96.M0(2131743254, null) : k96.M0(2131743252, null);
    }

    public static String b1() {
        return ow3.i[(int) Math.floor(Math.random() * 8.0d)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static boolean h1(int i) {
        return i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    public static void l1(Context context, Runnable runnable, boolean z, boolean z2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            fc2 fc2Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (z2 || !hc2.w(14, chat)) {
                q1(fc2Var, false, selfId, runnable);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
            boolean isConference = sharedInstance.isConference();
            hd hdVar = alertDialog$Builder.a;
            if (isConference) {
                hdVar.S = k96.M0(2131743226, null);
                hdVar.U = k96.M0(2131743227, null);
            } else if (hc2.W(chat)) {
                hdVar.S = k96.M0(2131743229, null);
                hdVar.U = k96.M0(2131743230, null);
            } else {
                hdVar.S = k96.M0(2131743119, null);
                hdVar.U = k96.M0(2131743120, null);
            }
            sharedInstance.getAccount();
            ag2[] ag2VarArr = new ag2[1];
            LinearLayout j = de9.j(context, 1);
            if (!sharedInstance.isConference() || (fc2Var != null && (groupCall = fc2Var.b) != null && groupCall.creator)) {
                ag2 ag2Var = new ag2(context, 1);
                ag2VarArr[0] = ag2Var;
                ag2Var.setBackground(bkb.L0(false));
                if (z) {
                    ag2VarArr[0].setTextColor(bkb.w0(null, bkb.i5, false));
                } else {
                    ag2VarArr[0].setTextColor(bkb.w0(null, bkb.Xg, false));
                    CheckBoxSquare checkBoxSquare = (CheckBoxSquare) ag2VarArr[0].getCheckBoxView();
                    int i = bkb.hh;
                    int i2 = bkb.fh;
                    int i3 = bkb.dh;
                    checkBoxSquare.s = i;
                    checkBoxSquare.w = i2;
                    checkBoxSquare.x = i3;
                    checkBoxSquare.invalidate();
                }
                ag2VarArr[0].setTag(0);
                if (sharedInstance.isConference()) {
                    ag2VarArr[0].e(k96.M0(2131743228, null), "", false, false, false);
                } else if (hc2.W(chat)) {
                    ag2VarArr[0].e(k96.M0(2131743231, null), "", false, false, false);
                } else {
                    ag2VarArr[0].e(k96.M0(2131743121, null), "", false, false, false);
                }
                ag2VarArr[0].setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                j.addView(ag2VarArr[0], nme.o(-1, -2));
                ag2VarArr[0].setOnClickListener(new yd(ag2VarArr, (byte) 2));
            }
            alertDialog$Builder.n(j);
            hdVar.J = bkb.fh;
            alertDialog$Builder.j(k96.M0(2131743122, null), new qm1((Object) fc2Var, (Object) ag2VarArr, selfId, (Object) runnable, (byte) 4));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            if (z) {
                hdVar.Q0 = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    hdVar.getWindow().setType(2038);
                } else {
                    hdVar.getWindow().setType(2003);
                }
                hdVar.getWindow().clearFlags(2);
            }
            if (!z) {
                hdVar.j(bkb.w0(null, bkb.kh, false));
            }
            hdVar.show();
            if (z) {
                return;
            }
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.lh, null);
            }
            hdVar.o(bkb.w0(null, bkb.Xg, false));
        }
    }

    public static void q1(fc2 fc2Var, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (fc2Var != null) {
            ArrayList arrayList = fc2Var.f;
            ArrayList arrayList2 = fc2Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(j);
            if (groupCallParticipant != null) {
                fc2Var.d.e(j);
                arrayList2.remove(groupCallParticipant);
                fc2Var.g.remove(groupCallParticipant);
                int i = 0;
                while (i < arrayList.size()) {
                    if (k27.B1(((gc2) arrayList.get(i)).a.peer) == k27.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = fc2Var.b;
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
        kk7.e().k(kk7.u2, new Object[0]);
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
    
        if (hc2.w(2, r35.S2) != false) goto L183;
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
        y95 y95Var;
        f75 f75Var;
        Integer num;
        Integer num2;
        ViewGroup viewGroup;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num3;
        boolean z;
        int i;
        TLRPC.GroupCall groupCall;
        long j;
        gl5 m;
        gl5 m2;
        boolean z2;
        t65 t65Var;
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
            m65 m65Var = this.U4;
            if (m65Var != null) {
                m65Var.dismiss();
                this.U4 = null;
                return false;
            }
            R0();
            if (view instanceof o75) {
                o75 o75Var = (o75) view;
                if (o75Var.getParticipant() != this.T2.z) {
                    y95Var = new y95(o75Var.getContext());
                    y95Var.e(this.n1, o75Var.getParticipant().a, this.T2, k27.B1(this.u2), null, false);
                    tl tlVar = y95Var.s;
                    if (tlVar != null) {
                        tlVar.f();
                    }
                    this.Q4 = false;
                    this.N4 = o75Var;
                    this.O4 = o75Var.getRenderer();
                    if (!v5 && !u5) {
                        this.b.addView(y95Var, nme.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (y95Var != null) {
                        boolean z4 = (u5 || v5 || gl.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = y95Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new bp1(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new x35(this, b));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.u4 = linearLayout;
                            l65 l65Var = new l65(getContext(), linearLayout, linearLayout2);
                            l65Var.setMinimumWidth(gl.L(240.0f));
                            l65Var.setOrientation(1);
                            boolean z5 = z4;
                            int R0 = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, bkb.jh, false));
                            if (linearLayout2 == null || y95Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                f75Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                l65Var.addView(linearLayout2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                f75Var = new f75(this, getContext(), participant);
                                linearLayout2.addView(f75Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(gl.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            l65Var.addView(linearLayout, nme.k(0.0f, f75Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            xc xcVar = new xc(getContext(), l65Var);
                            xcVar.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(xcVar, nme.c(-2.0f, -2));
                            long B1 = k27.B1(participant.peer);
                            f75 f75Var2 = f75Var;
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
                            } else if (hc2.T(this.S2)) {
                                na7 q1 = na7.q1(j5Var.a);
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num = 6;
                                num2 = 8;
                                long j2 = participant.peer.user_id;
                                num3 = valueOf2;
                                viewGroup = linearLayout;
                                vf6 vf6Var = (vf6) q1.q1.f(Z0());
                                TLRPC.ChannelParticipant channelParticipant = vf6Var == null ? null : (TLRPC.ChannelParticipant) vf6Var.f(j2);
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
                                TLRPC.ChatFull L0 = na7.q1(j5Var.a).L0(Z0());
                                if (L0 != null && (chatParticipants = L0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i5);
                                        TLRPC.ChatFull chatFull = L0;
                                        int i6 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i5++;
                                            L0 = chatFull;
                                            size = i6;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z = false;
                            }
                            if (y95Var.c()) {
                                if (g1() && y95Var.L) {
                                    str = null;
                                    b00.r(null, 2131743152, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(k96.M0(y95Var.b.getImageReceiver().E() ? 2131743263 : 2131743000, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                String str4 = participant.about;
                                if (B1 > 0) {
                                    if (TextUtils.isEmpty(str4)) {
                                        i4 = 2131743265;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i4 = 2131743175;
                                    }
                                    arrayList.add(k96.M0(i4, str3));
                                } else {
                                    arrayList.add(k96.M0(TextUtils.isEmpty(str4) ? 2131743264 : 2131743174, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (B1 > 0) {
                                    i3 = 2131743173;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i3 = 2131743172;
                                }
                                arrayList.add(k96.M0(i3, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (G0()) {
                                if (!g1() && z && participant.muted) {
                                    if (g1() && participant.muted_by_you) {
                                        b00.s(null, 2131743076, arrayList, arrayList2, valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    b00.s(null, 2131743117, arrayList, arrayList2, num3);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(k96.M0(2131743158, null));
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
                                    if (j3 != 0 && !hc2.m0(this.a, j3)) {
                                        b00.r(null, 2131743111, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num2);
                                        if (g1()) {
                                            i = z ? 2 : 2;
                                        } else {
                                            fc2 fc2Var = this.T2;
                                            if (fc2Var != null && (groupCall = fc2Var.b) != null && groupCall.creator) {
                                                b00.r(null, 2131743069, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i));
                                            }
                                        }
                                    }
                                }
                                b00.r(null, 2131743109, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num);
                                if (g1()) {
                                }
                            } else {
                                Integer num4 = num;
                                Integer num5 = num2;
                                if (participant.muted_by_you) {
                                    b00.s(null, 2131743076, arrayList, arrayList2, valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    b00.s(null, 2131743116, arrayList, arrayList2, num3);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j4 = peer2.channel_id;
                                    if (j4 != 0 && !hc2.m0(this.a, j4)) {
                                        b00.s(null, 2131743111, arrayList, arrayList2, valueOf);
                                        arrayList3.add(num5);
                                    }
                                }
                                b00.s(null, 2131743110, arrayList, arrayList2, valueOf);
                                arrayList3.add(num4);
                            }
                            int size2 = arrayList.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                a8 a8Var = new a8(getContext(), i7 == 0, i7 == size2 + (-1));
                                if (((Integer) arrayList3.get(i7)).intValue() != 2) {
                                    int i8 = bkb.Xg;
                                    z3 = false;
                                    r5 = 0;
                                    a8Var.d(bkb.w0(null, i8, false), bkb.w0(null, i8, false));
                                } else {
                                    z3 = false;
                                    r5 = 0;
                                    int i9 = bkb.lh;
                                    a8Var.d(bkb.w0(null, i9, false), bkb.w0(null, i9, false));
                                }
                                a8Var.setSelectorColor(bkb.w0(r5, bkb.Ug, z3));
                                a8Var.j((CharSequence) arrayList.get(i7), ((Integer) arrayList2.get(i7)).intValue(), r5);
                                viewGroup.addView(a8Var);
                                a8Var.setTag(arrayList3.get(i7));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                a8Var.setOnClickListener(new pg((Object) this, i7, (Object) arrayList4, (Object) groupCallParticipant, (byte) 4));
                                i7++;
                                arrayList3 = arrayList4;
                                participant = groupCallParticipant;
                            }
                            xcVar.addView(l65Var, nme.x(-2, -2, 51));
                            r65 r65Var = this.J1;
                            r65Var.D0();
                            this.R1.X = false;
                            this.M4 = y95Var;
                            y95Var.setAboutVisible(true);
                            this.b.invalidate();
                            r65Var.invalidate();
                            AnimatorSet animatorSet = this.T4;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            this.X3 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            if (B1 > 0) {
                                int i10 = j5Var.a;
                                int i11 = j5Var.a;
                                TLRPC.User V1 = na7.q1(i10).V1(Long.valueOf(B1));
                                m = gl5.m(i11, 0, V1);
                                m2 = gl5.m(i11, 1, V1);
                                j = B1;
                                if (na7.q1(this.a).W1(j) == null) {
                                    na7.q1(this.a).i3(0, V1, false);
                                }
                            } else {
                                j = B1;
                                int i12 = j5Var.a;
                                int i13 = j5Var.a;
                                TLRPC.Chat K0 = na7.q1(i12).K0(Long.valueOf(-j));
                                m = gl5.m(i13, 0, K0);
                                m2 = gl5.m(i13, 1, K0);
                            }
                            h85 h85Var = this.O4;
                            boolean z7 = h85Var != null && h85Var.w;
                            if (m != null || z7) {
                                if (z5) {
                                    be0 avatarImageView = this.M4.getAvatarImageView();
                                    g55 g55Var = this.l1;
                                    g55Var.setParentAvatarImage(avatarImageView);
                                    g55Var.setHasActiveVideo(z7);
                                    g55Var.M(j, true);
                                    g55Var.setCreateThumbFromParent(true);
                                    g55Var.H(null, m, m2, true);
                                    h85 h85Var2 = this.O4;
                                    if (h85Var2 != null) {
                                        h85Var2.h = true;
                                        h85Var2.j(true);
                                    }
                                    if (k27.B1(this.u2) == j && this.a4 != null && (t65Var = this.b4) != null && (fileLocation = t65Var.c) != null) {
                                        g55Var.A(t65Var.d, gl5.e(fileLocation));
                                    }
                                }
                                z2 = z5;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                boolean z8 = true;
                                this.Y3 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.X3, nme.c(-2.0f, -2));
                                this.Z3 = true;
                                k55 k55Var = this.U3;
                                if (k55Var == null) {
                                    i2 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.u0 << 1)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - gl.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -gl.m);
                                    this.b2.N().getView().draw(canvas);
                                    canvas.drawColor(bm2.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -gl.m);
                                    this.v4 = true;
                                    this.b.draw(canvas);
                                    i2 = 0;
                                    this.v4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / kk7.J2));
                                    k55Var.setBackground(new BitmapDrawable(createBitmap));
                                    k55Var.setAlpha(0.0f);
                                    k55Var.setVisibility(0);
                                    k55Var.bringToFront();
                                    z8 = true;
                                }
                                this.R4 = z8;
                                this.s4.setVisibility(i2);
                                if (f75Var2 != null) {
                                    f75Var2.invalidate();
                                }
                                s1(z8, y95Var);
                                m75 m75Var = this.P4;
                                if (m75Var != null) {
                                    m75Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return z8;
                            }
                            this.Y3 = false;
                            m65 m65Var2 = new m65(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            this.U4 = m65Var2;
                            m65Var2.e = true;
                            m65Var2.c = (short) 220;
                            m65Var2.setOutsideTouchable(true);
                            this.U4.setClippingEnabled(true);
                            this.U4.setAnimationStyle(R.style.PopupContextAnimation);
                            this.U4.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                            this.U4.setInputMethodMode(2);
                            this.U4.setSoftInputMode(0);
                            this.U4.getContentView().setFocusableInTouchMode(true);
                            m75 m75Var2 = this.P4;
                            if (m75Var2 != null) {
                                boolean z9 = u5;
                                e55 e55Var = this.T3;
                                a55 a55Var = this.e4;
                                if (z9) {
                                    x = gl.L(32.0f) + (((int) (e55Var.getX() + (a55Var.getX() + m75Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                    y = ((int) (e55Var.getY() + (a55Var.getY() + this.P4.getY()))) - gl.L(6.0f);
                                } else {
                                    int x2 = ((int) (e55Var.getX() + (a55Var.getX() + m75Var2.getX()))) - gl.L(14.0f);
                                    y = (int) ((e55Var.getY() + (a55Var.getY() + this.P4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight());
                                    x = x2;
                                }
                            } else {
                                x = (int) (((r65Var.getX() + r65Var.getMeasuredWidth()) + gl.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                if (this.Q4) {
                                    y2 = y95Var.getY() + r65Var.getY();
                                    measuredHeight = y95Var.getClipHeight();
                                } else if (this.N4 != null) {
                                    y2 = this.N4.getY() + r65Var.getY();
                                    measuredHeight = this.N4.getMeasuredHeight();
                                } else {
                                    y = (int) r65Var.getY();
                                }
                                y = (int) (y2 + measuredHeight);
                            }
                            this.U4.showAtLocation(r65Var, 51, x, y);
                            this.T4 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.L4, rn.b, 0, 100));
                            this.T4.playTogether(arrayList5);
                            this.T4.setDuration(150L);
                            this.T4.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof m75) {
                    m75 m75Var3 = (m75) view;
                    if (m75Var3.getParticipant() != this.T2.z.a) {
                        y95Var = new y95(m75Var3.getContext());
                        y95Var.e(this.n1, m75Var3.getParticipant(), this.T2, k27.B1(this.u2), null, false);
                        tl tlVar2 = y95Var.s;
                        if (tlVar2 != null) {
                            tlVar2.f();
                        }
                        this.Q4 = false;
                        this.P4 = m75Var3;
                        h85 renderer = m75Var3.getRenderer();
                        this.O4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.O4 = null;
                        }
                        this.b.addView(y95Var, nme.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    y95Var = (y95) view;
                    this.Q4 = true;
                }
                if (y95Var != null) {
                }
            }
        }
        return false;
    }

    public final void B1(View view) {
        if (this.f2 == null) {
            ke5 ke5Var = new ke5(8, null, getContext(), true);
            this.f2 = ke5Var;
            ke5Var.setAlpha(0.0f);
            this.f2.setVisibility(4);
            this.f2.setShowingDuration(3000L);
            this.b.addView(this.f2, nme.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            boolean W = hc2.W(this.S2);
            ke5 ke5Var2 = this.f2;
            if (W) {
                ke5Var2.setText(k96.M0(2131743223, null));
            } else {
                ke5Var2.setText(k96.M0(2131743105, null));
            }
            this.f2.b();
        }
        this.f2.setExtraTranslationY(-gl.m);
        this.f2.c(view);
    }

    public final void C1() {
        fc2 fc2Var = this.T2;
        if (fc2Var == null || fc2Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        fc2 fc2Var2 = this.T2;
        togglegroupcallsettings.call = fc2Var2.h(fc2Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(this.T2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        co3 co3Var = Utilities.d;
        Objects.requireNonNull(co3Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ge2(co3Var, (byte) 0), new g45(this, (byte) 1));
    }

    @Override // fx0
    public final boolean D() {
        return false;
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
        r65 r65Var;
        c75 c75Var;
        e55 e55Var;
        r65 r65Var2;
        boolean z2;
        int i;
        ArrayList arrayList;
        int i2;
        int size;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        r65 r65Var3;
        e55 e55Var2;
        boolean z3;
        a55 a55Var;
        ?? r0;
        ?? r8;
        fc2 fc2Var;
        boolean z4;
        gc2 gc2Var;
        gc2 gc2Var2;
        s49 G;
        gi3 gi3Var;
        h75 h75Var = this;
        c75 c75Var2 = h75Var.I1;
        e55 e55Var3 = h75Var.T3;
        if (e55Var3 == null || (r65Var = h75Var.J1) == null || h75Var.T2 == null || h75Var.l2) {
            return;
        }
        if (e55Var3.b) {
            e55Var3.setVisibleParticipant(true);
        }
        long B1 = k27.B1(h75Var.T2.J);
        if (B1 != k27.B1(h75Var.u2) && h75Var.T2.d.f(B1) != null) {
            h75Var.u2 = h75Var.T2.J;
        }
        int childCount = r65Var.getChildCount();
        int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = r65Var.getChildAt(i8);
            s49 G2 = r65Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i6)) {
                i7 = G2.c();
                i6 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = h75Var.j2;
        arrayList3.clear();
        if (!v5) {
            arrayList3.addAll(h75Var.T2.f);
        } else if (e55Var3.b) {
            arrayList3.addAll(h75Var.T2.f);
            gc2 gc2Var3 = e55Var3.e;
            if (gc2Var3 != null) {
                arrayList3.remove(gc2Var3);
            }
        }
        if (r65Var.getItemAnimator() != null && !z) {
            r65Var.setItemAnimator(null);
        } else if (r65Var.getItemAnimator() == null && z) {
            r65Var.setItemAnimator(h75Var.Q1);
        }
        try {
            gi3Var = new gi3(c75Var2);
            try {
                try {
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    c75Var = c75Var2;
                    z2 = true;
                }
            } catch (Exception e2) {
                e = e2;
                c75Var = c75Var2;
                r65Var2 = r65Var;
                z2 = true;
                i = childCount;
                arrayList = arrayList3;
                i2 = i7;
                e55Var = e55Var3;
            }
        } catch (Exception e3) {
            e = e3;
            c75Var = c75Var2;
            e55Var = e55Var3;
            r65Var2 = r65Var;
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
                        e55Var = e55Var3;
                    } catch (Exception e4) {
                        e = e4;
                        e55Var = e55Var3;
                    }
                    try {
                        r65Var2 = r65Var;
                        try {
                            try {
                                try {
                                    try {
                                        arrayList = arrayList3;
                                        i2 = i9;
                                        i = childCount;
                                        h75Var = this;
                                        c75Var = c75Var2;
                                        try {
                                            h75Var.x1(c75Var2.L, c75Var2.x, c75Var2.d, c75Var2.e, c75Var2.f, c75Var2.h, c75Var2.n, c75Var2.r, c75Var2.s, c75Var2.w, c75Var2.H, c75Var2.I, c75Var2.J, c75Var2.K, c75Var2.y, c75Var2.E);
                                            c75Var.E();
                                            z2 = true;
                                            try {
                                                vu7.a(h75Var.l5, true).b(gi3Var);
                                            } catch (Exception e5) {
                                                e = e5;
                                                fa4.g(e, z2);
                                                c75Var.f();
                                                ArrayList arrayList4 = h75Var.T2.e;
                                                size = arrayList4.size();
                                                while (i3 < size) {
                                                }
                                                if (view != null) {
                                                }
                                                ArrayList arrayList5 = h75Var.x2;
                                                arrayList5.clear();
                                                arrayList5.addAll(h75Var.T2.g);
                                                ArrayList arrayList6 = h75Var.y2;
                                                arrayList6.clear();
                                                arrayList2 = arrayList;
                                                arrayList6.addAll(arrayList2);
                                                ArrayList arrayList7 = h75Var.z2;
                                                arrayList7.clear();
                                                arrayList7.addAll(h75Var.T2.j);
                                                ArrayList arrayList8 = h75Var.A2;
                                                arrayList8.clear();
                                                arrayList8.addAll(h75Var.T2.m);
                                                ArrayList arrayList9 = h75Var.B2;
                                                arrayList9.clear();
                                                arrayList9.addAll(h75Var.T2.l);
                                                c75 c75Var3 = c75Var;
                                                h75Var.C2 = c75Var3.G;
                                                i4 = i;
                                                i5 = 0;
                                                while (true) {
                                                    r65Var3 = r65Var2;
                                                    if (i5 < i4) {
                                                    }
                                                    i5++;
                                                    r65Var2 = r65Var3;
                                                }
                                                boolean c = e55Var.c();
                                                e55Var2 = e55Var;
                                                if (e55Var2.b) {
                                                    if (!arrayList2.isEmpty()) {
                                                    }
                                                    n75 n75Var = h75Var.h4;
                                                    a55Var = h75Var.e4;
                                                    n75Var.G(a55Var, z2);
                                                    if (a55Var.getVisibility() == 0) {
                                                    }
                                                    if (v5) {
                                                    }
                                                    if (r65Var3.getVisibility() == 0) {
                                                    }
                                                    r0 = h75Var.S3;
                                                    r0.clear();
                                                    r0.addAll(h75Var.R3);
                                                    while (r8 < r0.size()) {
                                                    }
                                                    fc2Var = h75Var.T2;
                                                    if (fc2Var != null) {
                                                    }
                                                    fc2 fc2Var2 = h75Var.T2;
                                                    if (fc2Var2 != null) {
                                                    }
                                                    h75Var.r5.a(z4, z);
                                                    if (z4 == h75Var.y4) {
                                                    }
                                                }
                                                z3 = false;
                                                n75 n75Var2 = h75Var.h4;
                                                a55Var = h75Var.e4;
                                                n75Var2.G(a55Var, z2);
                                                if (a55Var.getVisibility() == 0) {
                                                }
                                                if (v5) {
                                                }
                                                if (r65Var3.getVisibility() == 0) {
                                                }
                                                r0 = h75Var.S3;
                                                r0.clear();
                                                r0.addAll(h75Var.R3);
                                                while (r8 < r0.size()) {
                                                }
                                                fc2Var = h75Var.T2;
                                                if (fc2Var != null) {
                                                }
                                                fc2 fc2Var22 = h75Var.T2;
                                                if (fc2Var22 != null) {
                                                }
                                                h75Var.r5.a(z4, z);
                                                if (z4 == h75Var.y4) {
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            z2 = true;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        h75Var = this;
                                        arrayList = arrayList3;
                                        i2 = i9;
                                        z2 = true;
                                        i = childCount;
                                        c75Var = c75Var2;
                                        fa4.g(e, z2);
                                        c75Var.f();
                                        ArrayList arrayList42 = h75Var.T2.e;
                                        size = arrayList42.size();
                                        while (i3 < size) {
                                        }
                                        if (view != null) {
                                        }
                                        ArrayList arrayList52 = h75Var.x2;
                                        arrayList52.clear();
                                        arrayList52.addAll(h75Var.T2.g);
                                        ArrayList arrayList62 = h75Var.y2;
                                        arrayList62.clear();
                                        arrayList2 = arrayList;
                                        arrayList62.addAll(arrayList2);
                                        ArrayList arrayList72 = h75Var.z2;
                                        arrayList72.clear();
                                        arrayList72.addAll(h75Var.T2.j);
                                        ArrayList arrayList82 = h75Var.A2;
                                        arrayList82.clear();
                                        arrayList82.addAll(h75Var.T2.m);
                                        ArrayList arrayList92 = h75Var.B2;
                                        arrayList92.clear();
                                        arrayList92.addAll(h75Var.T2.l);
                                        c75 c75Var32 = c75Var;
                                        h75Var.C2 = c75Var32.G;
                                        i4 = i;
                                        i5 = 0;
                                        while (true) {
                                            r65Var3 = r65Var2;
                                            if (i5 < i4) {
                                            }
                                            i5++;
                                            r65Var2 = r65Var3;
                                        }
                                        boolean c2 = e55Var.c();
                                        e55Var2 = e55Var;
                                        if (e55Var2.b) {
                                        }
                                        z3 = false;
                                        n75 n75Var22 = h75Var.h4;
                                        a55Var = h75Var.e4;
                                        n75Var22.G(a55Var, z2);
                                        if (a55Var.getVisibility() == 0) {
                                        }
                                        if (v5) {
                                        }
                                        if (r65Var3.getVisibility() == 0) {
                                        }
                                        r0 = h75Var.S3;
                                        r0.clear();
                                        r0.addAll(h75Var.R3);
                                        while (r8 < r0.size()) {
                                        }
                                        fc2Var = h75Var.T2;
                                        if (fc2Var != null) {
                                        }
                                        fc2 fc2Var222 = h75Var.T2;
                                        if (fc2Var222 != null) {
                                        }
                                        h75Var.r5.a(z4, z);
                                        if (z4 == h75Var.y4) {
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
                            c75Var = c75Var2;
                            fa4.g(e, z2);
                            c75Var.f();
                            ArrayList arrayList422 = h75Var.T2.e;
                            size = arrayList422.size();
                            while (i3 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList522 = h75Var.x2;
                            arrayList522.clear();
                            arrayList522.addAll(h75Var.T2.g);
                            ArrayList arrayList622 = h75Var.y2;
                            arrayList622.clear();
                            arrayList2 = arrayList;
                            arrayList622.addAll(arrayList2);
                            ArrayList arrayList722 = h75Var.z2;
                            arrayList722.clear();
                            arrayList722.addAll(h75Var.T2.j);
                            ArrayList arrayList822 = h75Var.A2;
                            arrayList822.clear();
                            arrayList822.addAll(h75Var.T2.m);
                            ArrayList arrayList922 = h75Var.B2;
                            arrayList922.clear();
                            arrayList922.addAll(h75Var.T2.l);
                            c75 c75Var322 = c75Var;
                            h75Var.C2 = c75Var322.G;
                            i4 = i;
                            i5 = 0;
                            while (true) {
                                r65Var3 = r65Var2;
                                if (i5 < i4) {
                                }
                                i5++;
                                r65Var2 = r65Var3;
                            }
                            boolean c22 = e55Var.c();
                            e55Var2 = e55Var;
                            if (e55Var2.b) {
                            }
                            z3 = false;
                            n75 n75Var222 = h75Var.h4;
                            a55Var = h75Var.e4;
                            n75Var222.G(a55Var, z2);
                            if (a55Var.getVisibility() == 0) {
                            }
                            if (v5) {
                            }
                            if (r65Var3.getVisibility() == 0) {
                            }
                            r0 = h75Var.S3;
                            r0.clear();
                            r0.addAll(h75Var.R3);
                            while (r8 < r0.size()) {
                            }
                            fc2Var = h75Var.T2;
                            if (fc2Var != null) {
                            }
                            fc2 fc2Var2222 = h75Var.T2;
                            if (fc2Var2222 != null) {
                            }
                            h75Var.r5.a(z4, z);
                            if (z4 == h75Var.y4) {
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        r65Var2 = r65Var;
                        i = childCount;
                        arrayList = arrayList3;
                        i2 = i9;
                        c75Var = c75Var2;
                        fa4.g(e, z2);
                        c75Var.f();
                        ArrayList arrayList4222 = h75Var.T2.e;
                        size = arrayList4222.size();
                        while (i3 < size) {
                        }
                        if (view != null) {
                        }
                        ArrayList arrayList5222 = h75Var.x2;
                        arrayList5222.clear();
                        arrayList5222.addAll(h75Var.T2.g);
                        ArrayList arrayList6222 = h75Var.y2;
                        arrayList6222.clear();
                        arrayList2 = arrayList;
                        arrayList6222.addAll(arrayList2);
                        ArrayList arrayList7222 = h75Var.z2;
                        arrayList7222.clear();
                        arrayList7222.addAll(h75Var.T2.j);
                        ArrayList arrayList8222 = h75Var.A2;
                        arrayList8222.clear();
                        arrayList8222.addAll(h75Var.T2.m);
                        ArrayList arrayList9222 = h75Var.B2;
                        arrayList9222.clear();
                        arrayList9222.addAll(h75Var.T2.l);
                        c75 c75Var3222 = c75Var;
                        h75Var.C2 = c75Var3222.G;
                        i4 = i;
                        i5 = 0;
                        while (true) {
                            r65Var3 = r65Var2;
                            if (i5 < i4) {
                            }
                            i5++;
                            r65Var2 = r65Var3;
                        }
                        boolean c222 = e55Var.c();
                        e55Var2 = e55Var;
                        if (e55Var2.b) {
                        }
                        z3 = false;
                        n75 n75Var2222 = h75Var.h4;
                        a55Var = h75Var.e4;
                        n75Var2222.G(a55Var, z2);
                        if (a55Var.getVisibility() == 0) {
                        }
                        if (v5) {
                        }
                        if (r65Var3.getVisibility() == 0) {
                        }
                        r0 = h75Var.S3;
                        r0.clear();
                        r0.addAll(h75Var.R3);
                        while (r8 < r0.size()) {
                        }
                        fc2Var = h75Var.T2;
                        if (fc2Var != null) {
                        }
                        fc2 fc2Var22222 = h75Var.T2;
                        if (fc2Var22222 != null) {
                        }
                        h75Var.r5.a(z4, z);
                        if (z4 == h75Var.y4) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    i2 = i7;
                    e55Var = e55Var3;
                    r65Var2 = r65Var;
                    i = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e13) {
                e = e13;
                c75Var = c75Var2;
                arrayList = arrayList3;
                i2 = i7;
                e55Var = e55Var3;
                r65Var2 = r65Var;
                i = childCount;
            }
        } catch (Exception e14) {
            e = e14;
            c75Var = c75Var2;
            i = childCount;
            arrayList = arrayList3;
            i2 = i7;
            e55Var = e55Var3;
            r65Var2 = r65Var;
            fa4.g(e, z2);
            c75Var.f();
            ArrayList arrayList42222 = h75Var.T2.e;
            size = arrayList42222.size();
            while (i3 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = h75Var.x2;
            arrayList52222.clear();
            arrayList52222.addAll(h75Var.T2.g);
            ArrayList arrayList62222 = h75Var.y2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = h75Var.z2;
            arrayList72222.clear();
            arrayList72222.addAll(h75Var.T2.j);
            ArrayList arrayList82222 = h75Var.A2;
            arrayList82222.clear();
            arrayList82222.addAll(h75Var.T2.m);
            ArrayList arrayList92222 = h75Var.B2;
            arrayList92222.clear();
            arrayList92222.addAll(h75Var.T2.l);
            c75 c75Var32222 = c75Var;
            h75Var.C2 = c75Var32222.G;
            i4 = i;
            i5 = 0;
            while (true) {
                r65Var3 = r65Var2;
                if (i5 < i4) {
                }
                i5++;
                r65Var2 = r65Var3;
            }
            boolean c2222 = e55Var.c();
            e55Var2 = e55Var;
            if (e55Var2.b) {
            }
            z3 = false;
            n75 n75Var22222 = h75Var.h4;
            a55Var = h75Var.e4;
            n75Var22222.G(a55Var, z2);
            if (a55Var.getVisibility() == 0) {
            }
            if (v5) {
            }
            if (r65Var3.getVisibility() == 0) {
            }
            r0 = h75Var.S3;
            r0.clear();
            r0.addAll(h75Var.R3);
            while (r8 < r0.size()) {
            }
            fc2Var = h75Var.T2;
            if (fc2Var != null) {
            }
            fc2 fc2Var222222 = h75Var.T2;
            if (fc2Var222222 != null) {
            }
            h75Var.r5.a(z4, z);
            if (z4 == h75Var.y4) {
            }
        }
        ArrayList arrayList422222 = h75Var.T2.e;
        size = arrayList422222.size();
        for (i3 = 0; i3 < size; i3++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i3)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            h75Var.R1.g1(i2, view.getTop() - r65Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = h75Var.x2;
        arrayList522222.clear();
        arrayList522222.addAll(h75Var.T2.g);
        ArrayList arrayList622222 = h75Var.y2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = h75Var.z2;
        arrayList722222.clear();
        arrayList722222.addAll(h75Var.T2.j);
        ArrayList arrayList822222 = h75Var.A2;
        arrayList822222.clear();
        arrayList822222.addAll(h75Var.T2.m);
        ArrayList arrayList922222 = h75Var.B2;
        arrayList922222.clear();
        arrayList922222.addAll(h75Var.T2.l);
        c75 c75Var322222 = c75Var;
        h75Var.C2 = c75Var322222.G;
        i4 = i;
        i5 = 0;
        while (true) {
            r65Var3 = r65Var2;
            if (i5 < i4) {
                break;
            }
            View childAt2 = r65Var3.getChildAt(i5);
            if (((childAt2 instanceof y95) || (childAt2 instanceof p75)) && (G = r65Var3.G(childAt2)) != null) {
                if (childAt2 instanceof y95) {
                    ((y95) childAt2).setDrawDivider(G.b() != c75Var322222.G + (-2) ? z2 : false);
                } else {
                    ((p75) childAt2).setDrawDivider(G.b() != c75Var322222.G + (-2) ? z2 : false);
                }
            }
            i5++;
            r65Var2 = r65Var3;
        }
        boolean c22222 = e55Var.c();
        e55Var2 = e55Var;
        if (e55Var2.b && (gc2Var2 = e55Var2.e) != null && !fc2.E(gc2Var2.a, gc2Var2.b, h75Var.T2)) {
            if (!arrayList2.isEmpty()) {
                z3 = false;
                h75Var.V0(null);
            } else if (c22222) {
                z3 = false;
                h75Var.V0((gc2) arrayList2.get(0));
            }
            n75 n75Var222222 = h75Var.h4;
            a55Var = h75Var.e4;
            n75Var222222.G(a55Var, z2);
            if (a55Var.getVisibility() == 0) {
                gl.V3(a55Var);
            }
            if (v5) {
                h75Var.g4.I(h75Var.f4, z2);
            }
            if (r65Var3.getVisibility() == 0) {
                gl.V3(r65Var3);
            }
            r0 = h75Var.S3;
            r0.clear();
            r0.addAll(h75Var.R3);
            for (r8 = z3; r8 < r0.size(); r8++) {
                ((h85) r0.get(r8)).j(z2);
            }
            fc2Var = h75Var.T2;
            if (fc2Var != null && e55Var2.b && (gc2Var = e55Var2.e) != null) {
                fc2Var.d.f(k27.B1(gc2Var.a.peer));
            }
            fc2 fc2Var2222222 = h75Var.T2;
            z4 = (fc2Var2222222 != null || fc2Var2222222.f.isEmpty()) ? z3 : z2;
            h75Var.r5.a(z4, z);
            if (z4 == h75Var.y4) {
                h75Var.y4 = z4;
                if (v5) {
                    h75Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z3 = false;
        n75 n75Var2222222 = h75Var.h4;
        a55Var = h75Var.e4;
        n75Var2222222.G(a55Var, z2);
        if (a55Var.getVisibility() == 0) {
        }
        if (v5) {
        }
        if (r65Var3.getVisibility() == 0) {
        }
        r0 = h75Var.S3;
        r0.clear();
        r0.addAll(h75Var.R3);
        while (r8 < r0.size()) {
        }
        fc2Var = h75Var.T2;
        if (fc2Var != null) {
            fc2Var.d.f(k27.B1(gc2Var.a.peer));
        }
        fc2 fc2Var22222222 = h75Var.T2;
        if (fc2Var22222222 != null) {
        }
        h75Var.r5.a(z4, z);
        if (z4 == h75Var.y4) {
        }
    }

    public final void D1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        fc2 fc2Var = this.T2;
        dic dicVar = this.u1;
        dic dicVar2 = this.q1;
        dic dicVar3 = this.s1;
        dic dicVar4 = this.p1;
        dic dicVar5 = this.r1;
        dic dicVar6 = this.t1;
        dic dicVar7 = this.v1;
        r45 r45Var = this.o1;
        boolean z7 = false;
        if (fc2Var == null || fc2Var.k()) {
            r45Var.c(dicVar7, this.O2 > 0.1f, z);
            r45Var.c(dicVar6, this.O2 > 0.1f, z);
            r45Var.c(dicVar3, this.O2 > 0.1f, z);
            r45Var.c(dicVar5, false, z);
            r45Var.c(dicVar4, false, z);
            r45Var.c(dicVar2, false, z);
            r45Var.c(dicVar, false, z);
            return;
        }
        boolean z8 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
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
        r45Var.c(dicVar7, true, z);
        r45Var.c(dicVar6, true, z);
        r45Var.c(dicVar5, z4, z);
        r45Var.c(dicVar4, z7, z);
        r45Var.c(dicVar3, z3, z);
        r45Var.c(dicVar2, z5, z);
        r45Var.c(dicVar, z2, z);
    }

    @Override // fx0
    public final boolean E() {
        return !this.T3.b;
    }

    public final void E0(o75 o75Var, boolean z) {
        if (this.J) {
            return;
        }
        if (!z) {
            if (o75Var.getRenderer() != null) {
                o75Var.getRenderer().setPrimaryView(null);
                o75Var.setRenderer(null);
                return;
            }
            return;
        }
        if (o75Var.getRenderer() == null) {
            o75Var.setRenderer(h85.c(this.R3, this.T3, o75Var, null, null, o75Var.getParticipant(), this.T2, this));
        }
    }

    public final void E1() {
        fc2 fc2Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        fc2 fc2Var2 = this.T2;
        r7 r7Var = this.b3;
        r7 r7Var2 = this.d3;
        if (fc2Var2 == null || fc2Var2.k()) {
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
        TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(Z0()));
        if (K0 != null) {
            this.S2 = K0;
        }
        boolean y = hc2.y(3, this.S2);
        a8 a8Var = this.e3;
        if (y || (((!hc2.T(this.S2) || ((chat2 = this.S2) != null && chat2.megagroup)) && (hc2.t0(this.S2) || hc2.y(3, this.S2))) || (hc2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && hc2.t0(chat)))) {
            a8Var.setVisibility(0);
        } else {
            a8Var.setVisibility(8);
        }
        fc2 fc2Var3 = this.T2;
        a8 a8Var2 = this.t3;
        a8 a8Var3 = this.s3;
        if (fc2Var3 == null || (groupCall2 = fc2Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            a8Var3.setVisibility(8);
            a8Var2.setVisibility(8);
        } else {
            a8Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            a8Var2.setVisibility(this.T2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
        fc2 fc2Var4 = this.T2;
        a8 a8Var4 = this.h3;
        if (fc2Var4 == null || fc2Var4.k() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            a8Var4.setVisibility(8);
        } else {
            a8Var4.setVisibility(0);
        }
        a8Var4.setIcon(gba.E0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        a8Var4.setSubtext(k96.M0(gba.E0 ? 2131743038 : 2131743039, null));
        fc2 fc2Var5 = this.T2;
        int i = (fc2Var5 == null || fc2Var5.k() || !DictationAsr.E()) ? 8 : 0;
        a8 a8Var5 = this.i3;
        a8Var5.setVisibility(i);
        boolean a = q66.a();
        this.j3.a(a, false);
        a8Var5.setSubtext(k96.M0(a ? 2131745057 : 2131745058, null));
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
            d75 d75Var = this.W2;
            d75Var.f = z;
            d75Var.d = 1.0f;
            d75Var.invalidateSelf();
            boolean z2 = this.T2.w;
            w35 w35Var = this.x3;
            if (z2) {
                if (w35Var == null) {
                    w35 w35Var2 = new w35(this, (byte) 7);
                    this.x3 = w35Var2;
                    gl.d3(w35Var2, 1000L);
                }
                a8Var8.setText(k96.M0(2131743081, null));
            } else {
                if (w35Var != null) {
                    gl.r(w35Var);
                    this.x3 = null;
                }
                a8Var8.setText(k96.M0(2131743106, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                a8Var9.j(k96.M0(2131743194, null), R.drawable.msg_screencast, null);
            } else {
                a8Var9.j(k96.M0(2131743192, null), R.drawable.msg_screencast_off, null);
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
                a8Var9.j(k96.M0(2131743192, null), R.drawable.msg_screencast_off, null);
                a8Var9.setContentDescription(k96.M0(2131743192, null));
            } else {
                a8Var9.j(k96.M0(2131743194, null), R.drawable.msg_screencast, null);
                a8Var9.setContentDescription(k96.M0(2131743194, null));
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
        r7Var.Q(4, (g1() && ((fc2Var = this.T2) == null || (groupCall = fc2Var.b) == null || !groupCall.creator)) ? false : true);
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
            long B1 = k27.B1(this.u2);
            boolean D = cf3.D(B1);
            int i2 = j5Var.a;
            k5Var.setObject(D ? na7.q1(i2).V1(Long.valueOf(B1)) : na7.q1(i2).K0(Long.valueOf(-B1)));
        }
        TLRPC.Chat chat3 = this.S2;
        if (chat3 == null || hc2.W(chat3) || !i1() || a8Var.getVisibility() != 8) {
            r7Var.setVisibility(0);
        } else {
            r7Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != gl.L(96.0f)) {
            layoutParams.rightMargin = gl.L(96.0f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.u3.getLayoutParams()).rightMargin = 0;
        this.H1.setTitleRightMargin(gl.L(48.0f) << 1);
    }

    public final int F0() {
        r65 r65Var = this.J1;
        int childCount = r65Var.getChildCount();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = r65Var.getChildAt(i2);
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
        r65 r65Var = this.J1;
        int childCount = r65Var.getChildCount();
        float f = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            if (RecyclerView.R(r65Var.getChildAt(i)) >= 0) {
                f = Math.min(f, r7.getTop());
            }
        }
        if (f < 0.0f || f == 2.1474836E9f) {
            f = childCount != 0 ? 0.0f : r65Var.getPaddingTop();
        }
        byte b = 1;
        boolean z = f <= ((float) (a.getCurrentActionBarHeight() - gl.L(14.0f)));
        float L = f + gl.L(14.0f) + a.getCurrentActionBarHeight();
        c65 c65Var = this.H1;
        Object tag = c65Var.getTag();
        if (z) {
            if (tag == null) {
                num = 1;
                c65Var.setTag(num);
                animatorSet = this.a2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.a2 = null;
                }
                z0(c65Var.getTag() != null);
                ViewPropertyAnimator duration = c65Var.getBackButton().animate().scaleX(!z ? 1.0f : 0.9f).scaleY(z ? 1.0f : 0.9f).translationX(!z ? 0.0f : -gl.L(14.0f)).setDuration(300L);
                s33 s33Var = s33.f;
                duration.setInterpolator(s33Var).start();
                c65Var.getTitleTextView().animate().translationY(!z ? 0.0f : gl.L(23.0f)).setDuration(300L).setInterpolator(s33Var).start();
                objectAnimator = this.J4;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.J4.cancel();
                }
                jia subtitleTextView = c65Var.getSubtitleTextView();
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<jia, Float>) property, c65Var.getSubtitleTextView().getTranslationY(), !z ? 0.0f : gl.L(20.0f));
                this.J4 = ofFloat;
                ofFloat.setDuration(300L);
                this.J4.setInterpolator(s33Var);
                this.J4.addListener(new id4((byte) 4, this, z));
                this.J4.start();
                objectAnimator2 = this.K4;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c65Var.getAdditionalSubtitleTextView(), (Property<jia, Float>) property, !z ? 0.0f : gl.L(20.0f));
                this.K4 = ofFloat2;
                ofFloat2.setDuration(300L);
                this.K4.setInterpolator(s33Var);
                this.K4.start();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.a2 = animatorSet2;
                animatorSet2.setDuration(140L);
                AnimatorSet animatorSet3 = this.a2;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c65Var, (Property<c65, Float>) property2, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G1, (Property<x45, Float>) property2, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<View, Float>) property2, !z ? 1.0f : 0.0f));
                this.a2.addListener(new h65(this, b));
                this.a2.start();
                this.T3.w.setClickable(z || u5);
            }
        } else if (tag != null) {
            num = null;
            c65Var.setTag(num);
            animatorSet = this.a2;
            if (animatorSet != null) {
            }
            z0(c65Var.getTag() != null);
            ViewPropertyAnimator duration2 = c65Var.getBackButton().animate().scaleX(!z ? 1.0f : 0.9f).scaleY(z ? 1.0f : 0.9f).translationX(!z ? 0.0f : -gl.L(14.0f)).setDuration(300L);
            s33 s33Var2 = s33.f;
            duration2.setInterpolator(s33Var2).start();
            c65Var.getTitleTextView().animate().translationY(!z ? 0.0f : gl.L(23.0f)).setDuration(300L).setInterpolator(s33Var2).start();
            objectAnimator = this.J4;
            if (objectAnimator != null) {
            }
            jia subtitleTextView2 = c65Var.getSubtitleTextView();
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(subtitleTextView2, (Property<jia, Float>) property3, c65Var.getSubtitleTextView().getTranslationY(), !z ? 0.0f : gl.L(20.0f));
            this.J4 = ofFloat3;
            ofFloat3.setDuration(300L);
            this.J4.setInterpolator(s33Var2);
            this.J4.addListener(new id4((byte) 4, this, z));
            this.J4.start();
            objectAnimator2 = this.K4;
            if (objectAnimator2 != null) {
            }
            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(c65Var.getAdditionalSubtitleTextView(), (Property<jia, Float>) property3, !z ? 0.0f : gl.L(20.0f));
            this.K4 = ofFloat22;
            ofFloat22.setDuration(300L);
            this.K4.setInterpolator(s33Var2);
            this.K4.start();
            AnimatorSet animatorSet22 = new AnimatorSet();
            this.a2 = animatorSet22;
            animatorSet22.setDuration(140L);
            AnimatorSet animatorSet32 = this.a2;
            Property property22 = View.ALPHA;
            animatorSet32.playTogether(ObjectAnimator.ofFloat(c65Var, (Property<c65, Float>) property22, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G1, (Property<x45, Float>) property22, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<View, Float>) property22, !z ? 1.0f : 0.0f));
            this.a2.addListener(new h65(this, b));
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
            return hc2.w(14, this.S2);
        }
        fc2 fc2Var = this.T2;
        return (fc2Var == null || (groupCall = fc2Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void G1() {
        fc2 fc2Var;
        if (this.l3 != null) {
            int i = 0;
            boolean z = q66.a() && (fc2Var = this.T2) != null && !fc2Var.k() && s5 == this;
            q66 q66Var = this.l3;
            if (!z) {
                if (q66Var.d) {
                    q66 q66Var2 = this.l3;
                    if (q66Var2.d) {
                        q66Var2.d = false;
                        Thread thread = q66Var2.e;
                        if (thread != null) {
                            thread.interrupt();
                            q66Var2.e = null;
                        }
                        try {
                            NativeInstance.setIncomingAudioCapture(false);
                        } catch (Throwable unused) {
                        }
                    }
                    t66 t66Var = this.k3;
                    t66Var.getClass();
                    ArrayList arrayList = new ArrayList(t66Var.a);
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        s66 s66Var = (s66) obj;
                        t66Var.a.remove(s66Var);
                        t66Var.removeView(s66Var);
                    }
                    return;
                }
                return;
            }
            if (q66Var.d) {
                return;
            }
            final q66 q66Var3 = this.l3;
            Context context = getContext();
            int i2 = this.n1.a;
            TLRPC.Chat chat = this.S2;
            long j = chat != null ? -chat.id : 0L;
            if (q66Var3.d) {
                return;
            }
            q66Var3.d = true;
            final xl3 V = DictationAsr.V(qm3.c(context, j));
            boolean x = DictationAsr.x();
            q66Var3.c = x;
            if (x) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.a(context);
                }
            }
            StringBuilder sb = new StringBuilder("live captions: ");
            sb.append(V);
            ir2.x(sb, q66Var3.c ? ", tinylid" : "", "Dictation");
            DictationAsr.i0((vl3) V.b, false, new wl3() { // from class: n66
                @Override // wl3
                public final void a(boolean z2) {
                    q66 q66Var4 = q66.this;
                    xl3 xl3Var = V;
                    if (q66Var4.d) {
                        if (!z2) {
                            q66Var4.d = false;
                            return;
                        }
                        NativeInstance.setIncomingAudioCapture(true);
                        Thread thread2 = new Thread(new kz5(q66Var4, xl3Var, (byte) 7), "LiveCaptions");
                        q66Var4.e = thread2;
                        thread2.start();
                    }
                }
            });
        }
    }

    public final void H0() {
        if (this.K3) {
            this.K3 = false;
            gl.r(this.q4);
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
        g75[] g75VarArr;
        boolean z3;
        g75 g75Var;
        g75 g75Var2;
        boolean z4;
        boolean z5;
        int i2;
        if (!i1() && this.z3 == i && z) {
            return;
        }
        String str2 = "";
        oy8 oy8Var = this.D2;
        if (i == 7) {
            M0 = k96.M0(2131743151, null);
            K5 = oy8Var.K(kk7.f3);
        } else {
            if (i != 6) {
                if (i != 5) {
                    if (i == 0) {
                        M0 = k96.M0(2131743075, null);
                        str2 = k96.M0(2131743059, null);
                        byte b2 = this.z3;
                        if (b2 == 3) {
                            int i3 = oy8Var.f;
                            K3 = (i3 == 136 || i3 == 173 || i3 == 274 || i3 == 311) ? oy8Var.K(99) : false;
                        } else if (b2 == 5) {
                            K3 = oy8Var.K(404);
                        } else if (b2 == 7) {
                            K3 = oy8Var.K(376);
                        } else if (b2 == 6) {
                            K3 = oy8Var.K(kk7.L3);
                        } else if (b2 == 2) {
                            K4 = oy8Var.K(36);
                        } else {
                            K3 = oy8Var.K(99);
                        }
                    } else if (i == 1) {
                        M0 = k96.M0(g1() ? 2131742990 : 2131742989, null);
                        K3 = oy8Var.K(this.z3 == 4 ? 99 : 69);
                    } else if (g1() && i == 2) {
                        M0 = k96.M0(2131743049, null);
                        K3 = oy8Var.K(99);
                    } else {
                        if (i != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
                            boolean z6 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || G0()) ? false : true;
                            byte b3 = this.z3;
                            if (z6) {
                                K2 = b3 == 7 ? oy8Var.K(kk7.h5) : b3 == 6 ? oy8Var.K(kk7.w4) : b3 == 1 ? oy8Var.K(kk7.C2) : oy8Var.K(kk7.R1);
                            } else if (b3 == 5) {
                                K2 = oy8Var.K(404);
                            } else if (b3 == 7) {
                                K2 = oy8Var.K(376);
                            } else {
                                if (b3 != 6) {
                                    K = (b3 == 2 || b3 == 4) ? oy8Var.K(36) : oy8Var.K(99);
                                    if (i != 3) {
                                        M0 = k96.M0(2131751797, null);
                                    } else {
                                        M0 = k96.M0(2131743049, null);
                                        str2 = k96.M0(2131743048, null);
                                    }
                                    z2 = z6;
                                    str = str2;
                                    String y = !TextUtils.isEmpty(str) ? tb4.y(M0, " ", str) : M0;
                                    dic dicVar = this.v1;
                                    dicVar.setContentDescription(y);
                                    dicVar.c(0, 0, 0, 1.0f, true, M0, false, z);
                                    s45 s45Var = this.w1;
                                    if (z) {
                                        if (K) {
                                            if (i == 5) {
                                                oy8Var.H(376);
                                            } else if (i == 7) {
                                                oy8Var.H(kk7.C2);
                                            } else if (i == 6) {
                                                oy8Var.H(kk7.h5);
                                            } else if (i == 0) {
                                                byte b4 = this.z3;
                                                if (b4 == 5) {
                                                    oy8Var.H(376);
                                                } else if (b4 == 7) {
                                                    oy8Var.H(kk7.O5);
                                                } else if (b4 == 6) {
                                                    oy8Var.H(kk7.f3);
                                                } else if (b4 == 2) {
                                                    oy8Var.H(0);
                                                    i2 = 0;
                                                    s45Var.d();
                                                    s45Var.setVisibility(i2);
                                                    this.z3 = i;
                                                } else {
                                                    oy8Var.H(69);
                                                }
                                            } else {
                                                if (i == 1 || (this.z3 == 2 && g1())) {
                                                    i2 = 0;
                                                    oy8Var.H(this.z3 != 4 ? 36 : 69);
                                                } else if (i == 4) {
                                                    oy8Var.H(99);
                                                } else {
                                                    byte b5 = this.z3;
                                                    if (z2) {
                                                        if (b5 == 7) {
                                                            oy8Var.H(kk7.w4);
                                                        } else if (b5 == 6) {
                                                            oy8Var.H(kk7.L3);
                                                        } else if (b5 == 1) {
                                                            oy8Var.H(kk7.R1);
                                                        } else {
                                                            oy8Var.H(99);
                                                        }
                                                    } else if (b5 == 5) {
                                                        oy8Var.H(376);
                                                    } else if (b5 == 7) {
                                                        oy8Var.H(kk7.O5);
                                                    } else if (b5 == 6) {
                                                        oy8Var.H(kk7.f3);
                                                    } else if (b5 == 2 || b5 == 4) {
                                                        i2 = 0;
                                                        oy8Var.H(0);
                                                    } else {
                                                        oy8Var.H(69);
                                                    }
                                                }
                                                s45Var.d();
                                                s45Var.setVisibility(i2);
                                                this.z3 = i;
                                            }
                                        }
                                        i2 = 0;
                                        s45Var.d();
                                        s45Var.setVisibility(i2);
                                        this.z3 = i;
                                    } else {
                                        this.z3 = i;
                                        oy8Var.I(oy8Var.f - 1, false, true);
                                        s45Var.setVisibility(0);
                                    }
                                    dicVar.invalidate();
                                    b = this.z3;
                                    g75VarArr = this.D3;
                                    if (g75VarArr[b] == null) {
                                        g75VarArr[b] = new g75(b);
                                        byte b6 = this.z3;
                                        if (b6 == 3) {
                                            g75VarArr[b6].g = null;
                                        } else {
                                            boolean h1 = h1(b6);
                                            byte b7 = this.z3;
                                            if (h1) {
                                                g75VarArr[b7].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{bkb.w0(null, bkb.Yh, false), bkb.w0(null, bkb.ai, false), bkb.w0(null, bkb.Zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            } else {
                                                if (b7 != 1) {
                                                    g75 g75Var3 = g75VarArr[b7];
                                                    z3 = false;
                                                    g75Var3.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{bkb.w0(null, bkb.zh, false), bkb.w0(null, bkb.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                                    g75Var = g75VarArr[this.z3];
                                                    g75Var2 = this.G3;
                                                    if (g75Var == g75Var2) {
                                                        this.F3 = g75Var2;
                                                        this.G3 = g75Var;
                                                        if (g75Var2 == null || !z) {
                                                            this.E3 = 1.0f;
                                                            this.F3 = null;
                                                        } else {
                                                            this.E3 = 0.0f;
                                                        }
                                                    } else {
                                                        g75Var = g75Var2;
                                                    }
                                                    if (!z) {
                                                        if (g75Var != null) {
                                                            byte b8 = g75Var.i;
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
                                                g75VarArr[b7].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{bkb.w0(null, bkb.vh, false), bkb.w0(null, bkb.xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            }
                                        }
                                    }
                                    z3 = false;
                                    g75Var = g75VarArr[this.z3];
                                    g75Var2 = this.G3;
                                    if (g75Var == g75Var2) {
                                    }
                                    if (!z) {
                                    }
                                    this.o1.invalidate();
                                }
                                K2 = oy8Var.K(kk7.L3);
                            }
                            K = K2;
                            if (i != 3) {
                            }
                            z2 = z6;
                            str = str2;
                            if (!TextUtils.isEmpty(str)) {
                            }
                            dic dicVar2 = this.v1;
                            dicVar2.setContentDescription(y);
                            dicVar2.c(0, 0, 0, 1.0f, true, M0, false, z);
                            s45 s45Var2 = this.w1;
                            if (z) {
                            }
                            dicVar2.invalidate();
                            b = this.z3;
                            g75VarArr = this.D3;
                            if (g75VarArr[b] == null) {
                            }
                            z3 = false;
                            g75Var = g75VarArr[this.z3];
                            g75Var2 = this.G3;
                            if (g75Var == g75Var2) {
                            }
                            if (!z) {
                            }
                            this.o1.invalidate();
                        }
                        M0 = k96.M0(2131743045, null);
                        str2 = k96.M0(2131743046, null);
                        K3 = oy8Var.K(kk7.R1);
                    }
                    K = K3;
                    str = str2;
                    z2 = false;
                    if (!TextUtils.isEmpty(str)) {
                    }
                    dic dicVar22 = this.v1;
                    dicVar22.setContentDescription(y);
                    dicVar22.c(0, 0, 0, 1.0f, true, M0, false, z);
                    s45 s45Var22 = this.w1;
                    if (z) {
                    }
                    dicVar22.invalidate();
                    b = this.z3;
                    g75VarArr = this.D3;
                    if (g75VarArr[b] == null) {
                    }
                    z3 = false;
                    g75Var = g75VarArr[this.z3];
                    g75Var2 = this.G3;
                    if (g75Var == g75Var2) {
                    }
                    if (!z) {
                    }
                    this.o1.invalidate();
                }
                M0 = k96.M0(2131743088, null);
                K4 = oy8Var.K(377);
                K = K4;
                str = str2;
                z2 = false;
                if (!TextUtils.isEmpty(str)) {
                }
                dic dicVar222 = this.v1;
                dicVar222.setContentDescription(y);
                dicVar222.c(0, 0, 0, 1.0f, true, M0, false, z);
                s45 s45Var222 = this.w1;
                if (z) {
                }
                dicVar222.invalidate();
                b = this.z3;
                g75VarArr = this.D3;
                if (g75VarArr[b] == null) {
                }
                z3 = false;
                g75Var = g75VarArr[this.z3];
                g75Var2 = this.G3;
                if (g75Var == g75Var2) {
                }
                if (!z) {
                }
                this.o1.invalidate();
            }
            M0 = k96.M0(2131743096, null);
            K5 = oy8Var.K(kk7.O5);
        }
        str = "";
        K = K5;
        z2 = false;
        if (!TextUtils.isEmpty(str)) {
        }
        dic dicVar2222 = this.v1;
        dicVar2222.setContentDescription(y);
        dicVar2222.c(0, 0, 0, 1.0f, true, M0, false, z);
        s45 s45Var2222 = this.w1;
        if (z) {
        }
        dicVar2222.invalidate();
        b = this.z3;
        g75VarArr = this.D3;
        if (g75VarArr[b] == null) {
        }
        z3 = false;
        g75Var = g75VarArr[this.z3];
        g75Var2 = this.G3;
        if (g75Var == g75Var2) {
        }
        if (!z) {
        }
        this.o1.invalidate();
    }

    @Override // fx0
    public final void I() {
        LaunchActivity launchActivity;
        fc2 fc2Var;
        fc2 fc2Var2;
        TLRPC.GroupCall groupCall;
        ArrayList arrayList = this.R3;
        ArrayList arrayList2 = this.S3;
        e55 e55Var = this.T3;
        if (e55Var != null) {
            if (this.i4 != null) {
                this.J1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                ((h85) arrayList2.get(i)).f();
                e55Var.removeView((View) arrayList2.get(i));
                ((h85) arrayList2.get(i)).e();
                ((h85) arrayList2.get(i)).b(true);
            }
            arrayList.clear();
            if (e55Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(e55Var);
            }
        }
        q66 q66Var = this.l3;
        if (q66Var.d) {
            q66Var.d = false;
            Thread thread = q66Var.e;
            if (thread != null) {
                thread.interrupt();
                q66Var.e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.I();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (s5 == this) {
            s5 = null;
        }
        t5 = false;
        VoIPService.audioLevelsCallback = null;
        o85.k(getContext());
        fc2 fc2Var3 = this.T2;
        if (fc2Var3 != null) {
            ArrayList arrayList3 = fc2Var3.e;
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).videoIndex = 0;
            }
            fc2Var3.B();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        if (!this.o2 || (launchActivity = this.b2) == null || launchActivity.isFinishing() || (fc2Var = this.T2) == null) {
            return;
        }
        LaunchActivity launchActivity2 = this.b2;
        j5 j5Var = this.n1;
        long j = fc2Var.b.id;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || (fc2Var2 = sharedInstance.groupCall) == null || (groupCall = fc2Var2.b) == null || groupCall.id != j) {
            kk7.e().a(new i65(j, launchActivity2, j5Var), kk7.u2);
        } else {
            S0(launchActivity2, j5Var, null, null, false, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        boolean z;
        if (!this.R4) {
            k55 k55Var = this.U3;
            if (k55Var.getVisibility() == 0 && k55Var.getAlpha() == 1.0f) {
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
        fc2 fc2Var = this.T2;
        int i = currentTime - fc2Var.b.record_start_date;
        boolean z = fc2Var.w;
        a8 a8Var = this.n3;
        if (z) {
            a8Var.setSubtext(gl.g0(i, false, false));
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
        x55 x55Var = this.K1;
        if ((x55Var == null || this.T2 != null) && this.Q2 == null) {
            this.P2 = 1.0f;
            this.O2 = 1.0f;
            if (x55Var == null) {
                return;
            }
        }
        if (!z) {
            w45 w45Var = this.o4;
            gl.r(w45Var);
            w45Var.run();
            fc2 fc2Var = this.T2;
            r65 r65Var = this.J1;
            if (fc2Var == null || fc2Var.k()) {
                r65Var.setVisibility(4);
            } else {
                r65Var.setVisibility(0);
            }
            boolean W = hc2.W(this.S2);
            a8 a8Var = this.r3;
            if (W) {
                a8Var.setText(k96.M0(2131743246, null));
            } else {
                a8Var.setText(k96.M0(2131743153, null));
            }
        }
        float f2 = this.O2;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (s33.f.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.P2 = 1.0f;
            f = 1.0f;
        } else {
            s33 s33Var = s33.f;
            this.P2 = s33Var.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * s33Var.getInterpolation(this.O2 / 0.6f);
            f = this.O2 / 0.6f;
        }
        D1(true);
        float f3 = 1.0f - f;
        x55Var.setAlpha(f3);
        this.N1.setAlpha(f);
        this.P1.setAlpha(f);
        q65 q65Var = this.O1;
        q65Var.setAlpha(f);
        q65Var.setScaleX(interpolation);
        q65Var.setScaleY(interpolation);
        v55 v55Var = this.M1;
        v55Var.setScaleX(f3);
        v55Var.setScaleY(f3);
        v55Var.setAlpha(f3);
        this.L1.setAlpha(f3);
        this.b3.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != x55Var.getVisibility()) {
            x55Var.setVisibility(i);
            v55Var.setVisibility(i);
        }
    }

    public final void K0() {
        float f = this.w3.b.a;
        int i = f > 0.0f ? 0 : 8;
        r55 r55Var = this.y1;
        r55Var.setAlpha(f);
        q55 q55Var = this.z1;
        q55Var.setAlpha(f);
        if (r55Var.getVisibility() != i) {
            r55Var.setVisibility(i);
            q55Var.setVisibility(i);
            if (i == 8) {
                o55 o55Var = this.A1;
                if (o55Var.isFocused()) {
                    o55Var.clearFocus();
                }
            }
        }
    }

    public final void K1(boolean z) {
        dic dicVar = this.s1;
        if (dicVar == null || dicVar.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r45 r45Var = this.o1;
        if (sharedInstance == null) {
            dicVar.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, k96.M0(2131743195, null), false, z);
            boolean z2 = hc2.t0(this.S2) || (hc2.N(this.S2) && hc2.w(3, this.S2));
            i75 i75Var = (i75) r45Var.c.get(dicVar);
            if (i75Var != null) {
                i75Var.d.a(z2, z);
                dicVar.setEnabled(z2);
            }
            dicVar.b(true, false);
            return;
        }
        i75 i75Var2 = (i75) r45Var.c.get(dicVar);
        if (i75Var2 != null) {
            i75Var2.d.a(true, z);
            dicVar.setEnabled(true);
        }
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z4 = !z3 && sharedInstance.isSpeakerphoneOn();
        if (z3) {
            dicVar.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, k96.M0(2131743261, null), false, z);
        } else if (z4) {
            dicVar.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, k96.M0(2131742997, null), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            dicVar.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, k96.M0(2131743259, null), false, z);
        } else {
            dicVar.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, k96.M0(2131742997, null), false, z);
        }
        dicVar.b(z4, z);
        Y0();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.T1 != i) {
            this.T1 = i;
            gl.L3(this.U1, i);
        }
        dic dicVar2 = this.q1;
        if (dicVar2.getVisibility() == 0) {
            dicVar2.c(0, -1, 0, 1.0f, true, W0(Y0()), false, z);
            dicVar2.b(Y0() != 1, z);
        }
    }

    public final void L0() {
        t09 t09Var = this.D1;
        if (t09Var != null) {
            float f = this.w3.b.a * this.p5.e;
            t09Var.setAlpha(f);
            int i = f > 0.0f ? 0 : 8;
            if (this.D1.getVisibility() != i) {
                this.D1.setVisibility(i);
                if (i == 8) {
                    this.D1.k();
                }
            }
            t09 t09Var2 = this.D1;
            if (t09Var2.O0 || f != 1.0f) {
                return;
            }
            t09Var2.O0 = true;
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
        dic dicVar;
        dic dicVar2;
        dic dicVar3;
        boolean z10;
        fc2 fc2Var = this.T2;
        dic dicVar4 = this.t1;
        int i3 = 6;
        if (fc2Var == null || fc2Var.k()) {
            if (G0()) {
                i3 = 5;
            } else if (this.T2.b.schedule_start_subscribed) {
                i3 = 7;
            }
            H1(i3, z);
            dicVar4.c(R.drawable.calls_decline, -1, bkb.w0(null, bkb.th, false), 0.3f, false, k96.M0(2131752029, null), false, false);
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
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
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
                e55 e55Var = this.T3;
                int i6 = i5 + ((e55Var == null && e55Var.b) ? 8 : 0) + (!z8 ? 16 : 0);
                z9 = (this.h2 | 2) == (i6 | 2);
                this.h2 = i6;
                boolean z11 = z3;
                dic dicVar5 = this.r1;
                if (z5) {
                    dicVar5.c(R.drawable.calls_video, -1, 0, 1.0f, true, k96.M0(2131743247, null), !z11, z);
                    dicVar5.b(true, false);
                }
                dic dicVar6 = this.p1;
                if (i2 != 0) {
                    dicVar6.c(0, -1, 0, 1.0f, true, k96.M0(2131743164, null), false, false);
                    dicVar6.b(true, false);
                }
                dic dicVar7 = this.q1;
                if (z8) {
                    dicVar = dicVar6;
                    dicVar2 = dicVar5;
                    dicVar3 = dicVar7;
                    z10 = z;
                } else {
                    Y0();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i7 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.T1 != i7) {
                        this.T1 = i7;
                        gl.L3(this.U1, i7);
                    }
                    dicVar2 = dicVar5;
                    dicVar = dicVar6;
                    dicVar7.c(0, -1, 0, 1.0f, true, W0(Y0()), false, z);
                    dicVar3 = dicVar7;
                    z10 = z;
                    dicVar3.b(Y0() != 1, z10);
                }
                dic dicVar8 = dicVar3;
                dicVar4.c(R.drawable.calls_decline, -1, bkb.w0(null, bkb.th, false), 0.3f, false, k96.M0(2131743122, null), false, false);
                if (z9 && z6) {
                    K1(false);
                }
                dicVar2.d(true, z10);
                dicVar.d(true, z10);
                dicVar8.d(true, z10);
            }
        }
        if (this.v2 != null) {
            c1().k(0L, 37, this.v2, this.S2, null, null);
            this.v2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
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
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
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
        e55 e55Var2 = this.T3;
        int i62 = i52 + ((e55Var2 == null && e55Var2.b) ? 8 : 0) + (!z8 ? 16 : 0);
        if ((this.h2 | 2) == (i62 | 2)) {
        }
        this.h2 = i62;
        boolean z112 = z3;
        dic dicVar52 = this.r1;
        if (z5) {
        }
        dic dicVar62 = this.p1;
        if (i2 != 0) {
        }
        dic dicVar72 = this.q1;
        if (z8) {
        }
        dic dicVar82 = dicVar3;
        dicVar4.c(R.drawable.calls_decline, -1, bkb.w0(null, bkb.th, false), 0.3f, false, k96.M0(2131743122, null), false, false);
        if (z9) {
            K1(false);
        }
        dicVar2.d(true, z10);
        dicVar.d(true, z10);
        dicVar82.d(true, z10);
    }

    public final void M0() {
        boolean z = v5;
        r45 r45Var = this.o1;
        if (z) {
            r45Var.setTranslationX(0.0f);
            r45Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            r45Var.setTranslationX(fm0Var.e * gl.L(94.0f));
            r45Var.setTranslationY(0.0f);
        } else {
            r45Var.setTranslationX(0.0f);
            r45Var.setTranslationY(fm0Var.e * gl.L(94.0f));
        }
    }

    public final void M1() {
        boolean z;
        TLRPC.Chat K0;
        TLRPC.User user;
        c65 c65Var = this.H1;
        if (c65Var == null || this.T2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.T2.P.m(); i2++) {
            long j = this.T2.P.j(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.P.f(j);
            if (!groupCallParticipant.self) {
                e55 e55Var = this.T3;
                e55Var.getClass();
                if (e55Var.x.get(k27.B1(groupCallParticipant.peer)) <= 0 && this.r4.get(j, 0) != 1) {
                    long B1 = k27.B1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i < 2) {
                        int i3 = this.a;
                        if (B1 > 0) {
                            user = na7.q1(i3).V1(Long.valueOf(B1));
                            K0 = null;
                        } else {
                            K0 = na7.q1(i3).K0(Long.valueOf(B1));
                            user = null;
                        }
                        if (user != null || K0 != null) {
                            if (i != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(l7c.k(user, true), new z3c(gl.o()), 0);
                            } else {
                                spannableStringBuilder.append(K0.title, new z3c(gl.o()), 0);
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
            String J0 = k96.J0(i, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            c65Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        c65Var.getSubtitleTextView().k(k96.G(this.T2.b.participants_count + ((this.I1.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), i1() ? "ViewersWatching" : "Participants", new Object[0]));
        if (z != this.m4) {
            this.m4 = z;
            c65Var.invalidate();
            c65Var.getSubtitleTextView().setPivotX(0.0f);
            c65Var.getSubtitleTextView().setPivotY(c65Var.getMeasuredHeight() >> 1);
            c65Var.getSubtitleTextView().animate().scaleX(this.m4 ? 0.98f : 1.0f).scaleY(this.m4 ? 0.9f : 1.0f).alpha(this.m4 ? 0.0f : 1.0f).setDuration(150L);
            gl.R3(c65Var.getAdditionalSubtitleTextView(), this.m4);
        }
    }

    public final void N0() {
        boolean z = v5;
        a55 a55Var = this.e4;
        if (z) {
            a55Var.setTranslationX(0.0f);
            a55Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            a55Var.setTranslationX(fm0Var.e * gl.L(94.0f));
            a55Var.setTranslationY(0.0f);
        } else {
            a55Var.setTranslationX(0.0f);
            a55Var.setTranslationY(fm0Var.e * gl.L(94.0f));
        }
    }

    public final void N1(boolean z) {
        fc2 fc2Var = this.T2;
        v45 v45Var = this.X2;
        if (fc2Var == null) {
            if (hc2.W(this.S2)) {
                v45Var.b(k96.M0(2131743220, null), z);
                return;
            } else {
                v45Var.b(k96.M0(2131743099, null), z);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(fc2Var.b.title);
        c65 c65Var = this.H1;
        if (isEmpty) {
            TLRPC.Chat chat = this.S2;
            if (chat != null && !chat.title.equals(c65Var.getTitle())) {
                TLRPC.Chat chat2 = this.S2;
                c65 c65Var2 = this.H1;
                if (z) {
                    c65Var2.N(chat2.title, true, 180L, null);
                    c65Var.getTitleTextView().setOnClickListener(new u35(this, (byte) 9));
                } else {
                    c65Var2.setTitle(chat2.title);
                }
                if (!hc2.W(this.S2)) {
                    v45Var.b(k96.M0(2131743064, null), z);
                } else if (i1()) {
                    v45Var.b(this.S2.title, z);
                } else {
                    v45Var.b(k96.M0(2131743205, null), z);
                }
            } else if (this.S2 == null) {
                c65Var.setTitle(k96.M0(2131751811, null));
                v45Var.b(k96.M0(2131751811, null), z);
            }
        } else if (!this.T2.b.title.equals(c65Var.getTitle())) {
            fc2 fc2Var2 = this.T2;
            c65 c65Var3 = this.H1;
            if (z) {
                c65Var3.N(fc2Var2.b.title, true, 180L, null);
                c65Var.getTitleTextView().setOnClickListener(new u35(this, (byte) 8));
            } else {
                c65Var3.setTitle(fc2Var2.b.title);
            }
            v45Var.b(this.T2.b.title, z);
        }
        jia titleTextView = c65Var.getTitleTextView();
        if (!this.T2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                v45Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                v45Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new e75(titleTextView));
            TextView textView = v45Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new e75(textView), (Drawable) null);
            TextView nextTextView = v45Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new e75(nextTextView), (Drawable) null);
        }
    }

    public final void O0() {
        int i;
        float f = this.q5.f;
        fyc fycVar = this.w3;
        float R1 = gl.R1(v5 ? (1.0f - this.r5.e) * gl.L(-91.0f) : u5 ? 0.0f : ((this.o5.e * gl.L(94.0f)) - (gl.L(104.0f) * this.T3.c)) - gl.L(91.0f), -((fycVar.d() - this.b.getPaddingBottom()) + f + (gl.L(68.0f) * this.p5.e) + gl.L(10.0f)), fycVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + R1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - gl.L(250.0f));
        t66 t66Var = this.k3;
        if (t66Var != null) {
            i = t66Var.getContentHeight();
            t66Var.setTranslationY(R1);
        } else {
            i = 0;
        }
        float f2 = i;
        b85 b85Var = this.V1;
        b85Var.setTranslationY(R1 - f2);
        b85Var.setVisibleHeight((int) Math.max(0.0f, max - f2));
    }

    public final void O1() {
        float f;
        q11 q11Var;
        if (this.F != null) {
            int L = gl.L(74.0f);
            float f2 = this.s2 - L;
            if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / ((L - this.t0) - gl.L(14.0f)));
                f2 -= (int) ((a.getCurrentActionBarHeight() - r0) * f);
            } else {
                f = 0.0f;
            }
            this.F.setTranslationY(gl.R1(((-r0.getTop()) - this.F.getHeight()) + f2 + this.b.getPaddingTop() + gl.L(10.0f), this.H1.getY() + (-this.F.getTop()) + r4.getHeight(), f));
            m21 m21Var = m21.w;
            if (m21Var == null || (q11Var = m21Var.e) == null || q11Var.getParent() == null || q11Var.getParent().getParent() != this.F) {
                return;
            }
            q11Var.setTop(f > 0.5f);
        }
    }

    public final void P0() {
        if (this.D1 != null) {
            this.D1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.p5.e) * gl.L(64.0f)));
        }
    }

    public final void Q0() {
        float f = this.p5.e;
        float R1 = gl.R1(0.25f, 1.0f, f);
        ImageView imageView = this.C1;
        imageView.setScaleX(R1);
        imageView.setScaleY(gl.R1(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        imageView.setClickable(f > 0.9f);
        float f2 = 1.0f - f;
        float R12 = gl.R1(0.25f, 1.0f, f2);
        ImageView imageView2 = this.B1;
        imageView2.setScaleX(R12);
        imageView2.setScaleY(gl.R1(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        imageView2.setClickable(f2 > 0.9f);
    }

    public final void R0() {
        h85 h85Var = this.O4;
        if (h85Var != null) {
            h85Var.a.setRoundCorners(gl.L(8.0f));
            h85 h85Var2 = this.O4;
            h85Var2.h = false;
            h85Var2.j(false);
            this.O4.invalidate();
            this.T3.invalidate();
        }
        y95 y95Var = this.M4;
        if (y95Var != null && !this.Q4 && y95Var.getParent() != null) {
            this.b.removeView(this.M4);
        }
        y95 y95Var2 = this.M4;
        if (y95Var2 != null) {
            y95Var2.setProgressToAvatarPreview(0.0f);
            this.M4.setAboutVisible(false);
            this.M4.getAvatarImageView().setAlpha(1.0f);
        }
        m75 m75Var = this.P4;
        if (m75Var != null) {
            m75Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.M4 = null;
        this.N4 = null;
        this.P4 = null;
        this.O4 = null;
    }

    @Override // fx0
    public final ArrayList S() {
        return new ArrayList();
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
            int i2 = bkb.Ah;
            iArr[0] = bkb.w0(null, i2, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.Bh, false), bkb.w0(null, bkb.ph, false));
            iArr[2] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, i2, false));
        } else if (i == 0) {
            iArr[0] = bkb.w0(null, bkb.zh, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.oh, false), bkb.w0(null, bkb.ph, false));
            iArr[2] = bkb.w0(null, bkb.nh, false);
        } else if (i == 1) {
            iArr[0] = bkb.w0(null, bkb.wh, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.rh, false), bkb.w0(null, bkb.sh, false));
            iArr[2] = bkb.w0(null, bkb.qh, false);
        } else if (h1(i)) {
            iArr[0] = bkb.w0(null, bkb.ai, false);
            iArr[1] = bkb.w0(null, bkb.bi, false);
            iArr[2] = bkb.w0(null, bkb.ci, false);
        } else {
            int i3 = bkb.Ah;
            iArr[0] = bkb.w0(null, i3, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.Ch, false), bkb.w0(null, bkb.Dh, false));
            iArr[2] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, i3, false));
        }
        if (h1(i)) {
            iArr[3] = bm2.f(0.5f, bkb.w0(null, bkb.Yh, false), bkb.w0(null, bkb.ai, false));
        } else if (i == 1) {
            iArr[3] = bm2.f(0.75f, bkb.w0(null, bkb.rh, false), bm2.f(0.5f, bkb.w0(null, bkb.vh, false), bkb.w0(null, bkb.xh, false)));
        } else {
            iArr[3] = bm2.f(0.5f, bkb.w0(null, bkb.zh, false), bkb.w0(null, bkb.yh, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(gc2 gc2Var) {
        gc2 gc2Var2;
        if (gc2Var == null) {
            this.b2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            e55 e55Var = this.T3;
            if (e55Var.r != null) {
                return;
            }
            boolean z = v5;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.i4;
            r65 r65Var = this.J1;
            byte b = 1;
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!z) {
                if (onPreDrawListener != null) {
                    r65Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                if (gc2Var == null) {
                    if (r65Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = r65Var.getViewTreeObserver();
                        g65 g65Var = new g65(this, b);
                        this.i4 = g65Var;
                        viewTreeObserver.addOnPreDrawListener(g65Var);
                        return;
                    }
                    r65Var.setVisibility(0);
                    D0(false);
                    this.l2 = true;
                    ViewTreeObserver viewTreeObserver2 = r65Var.getViewTreeObserver();
                    g65 g65Var2 = new g65(this, objArr == true ? 1 : 0);
                    this.i4 = g65Var2;
                    viewTreeObserver2.addOnPreDrawListener(g65Var2);
                    return;
                }
                a55 a55Var = this.e4;
                if (a55Var.getVisibility() == 0) {
                    e55Var.h(gc2Var);
                    gl.V3(a55Var);
                    return;
                }
                a55Var.setVisibility(0);
                n75 n75Var = this.h4;
                n75Var.G(a55Var, false);
                this.l2 = true;
                if (!e55Var.b) {
                    ArrayList arrayList = n75Var.e;
                    t26 t26Var = (t26) a55Var.getLayoutManager();
                    if (t26Var != null) {
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            if (((gc2) arrayList.get(i)).equals(gc2Var)) {
                                t26Var.g1(i, gl.L(13.0f));
                                break;
                            }
                            i++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = r65Var.getViewTreeObserver();
                ni3 ni3Var = new ni3(this, gc2Var, b);
                this.i4 = ni3Var;
                viewTreeObserver3.addOnPreDrawListener(ni3Var);
                return;
            }
            if (onPreDrawListener != null) {
                r65Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            r95 r95Var = this.g4;
            ArrayList arrayList3 = this.R3;
            ArrayList arrayList4 = this.S3;
            if (gc2Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    h85 h85Var = (h85) arrayList4.get(i2);
                    o75 o75Var = h85Var.c;
                    if (o75Var != null) {
                        o75Var.setRenderer(null);
                        m75 m75Var = h85Var.d;
                        if (m75Var != null) {
                            m75Var.setRenderer(null);
                        }
                        o75 o75Var2 = h85Var.e;
                        if (o75Var2 != null) {
                            o75Var2.setRenderer(null);
                        }
                        arrayList2.add(h85Var.x);
                        h85Var.b(false);
                        h85Var.animate().alpha(0.0f).setListener(new b65(this, h85Var, objArr2 == true ? 1 : 0));
                    }
                }
                this.F4 = false;
                r95Var.H(this.f4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    h85 h85Var2 = (h85) arrayList4.get(i3);
                    if (h85Var2.e != null && ((gc2Var2 = h85Var2.x) == null || !gc2Var2.equals(gc2Var))) {
                        arrayList2.add(h85Var2.x);
                        h85Var2.b(false);
                        m75 m75Var2 = h85Var2.d;
                        if (m75Var2 != null) {
                            m75Var2.setRenderer(null);
                        }
                        o75 o75Var3 = h85Var2.c;
                        if (o75Var3 != null) {
                            o75Var3.setRenderer(null);
                        }
                        h85Var2.animate().alpha(0.0f).setListener(new b65(this, h85Var2, b));
                    }
                }
                this.F4 = true;
                r95Var.r = false;
                if (!arrayList2.isEmpty()) {
                    gl.c3(new vc4(this, arrayList2, (byte) 23));
                }
            }
            boolean z2 = !e55Var.b;
            ViewTreeObserver viewTreeObserver4 = r65Var.getViewTreeObserver();
            so1 so1Var = new so1(this, gc2Var, z2);
            this.i4 = so1Var;
            viewTreeObserver4.addOnPreDrawListener(so1Var);
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
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(Z0()));
        byte b = 0;
        if (K0 != null && !hc2.t0(K0)) {
            TLRPC.ChatFull L0 = na7.q1(i2).L0(Z0());
            String K = hc2.K(this.S2, false);
            String o = !TextUtils.isEmpty(K) ? ls6.o(na7.q1(i2).N2, "/", K, new StringBuilder()) : (L0 == null || (tL_chatInviteExported = L0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(o)) {
                o1(null, o, true, z);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = na7.j1(this.S2);
            ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new mi1((Object) this, (Object) L0, z, (byte) 4));
            return;
        }
        if (this.T2 != null) {
            int i3 = 0;
            while (i3 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                fc2 fc2Var = this.T2;
                exportgroupcallinvite.call = fc2Var.h(fc2Var.a);
                exportgroupcallinvite.can_self_unmute = i3 == 1;
                ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new c45(this, i3, z, b));
                i3++;
            }
        }
    }

    public final UndoView c1() {
        if (!v5) {
            e55 e55Var = this.T3;
            if (e55Var.b) {
                return e55Var.getUndoView();
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
        fc2 fc2Var = this.T2;
        if (fc2Var == null) {
            fc2 fc2Var2 = sharedInstance.groupCall;
            this.T2 = fc2Var2;
            this.h4.c = fc2Var2;
            this.T3.setGroupCall(fc2Var2);
            fc2Var = this.T2;
            this.g4.c = fc2Var;
        }
        byte b = 0;
        b85 b85Var = this.V1;
        if (b85Var != null) {
            b85Var.E0(this.n1.a, fc2Var.h(false));
        }
        this.H1.setTitleRightMargin(gl.L(48.0f) << 1);
        ArrayList arrayList = this.T2.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i)).lastActiveDate = r6.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        q65 q65Var = this.O1;
        if (q65Var == null || q65Var.getVisibility() != 0) {
            return;
        }
        this.t1.c(R.drawable.calls_decline, -1, bkb.w0(null, bkb.th, false), 0.3f, false, k96.M0(2131743122, null), false, true);
        K1(true);
        this.r3.setText(k96.M0(hc2.W(this.S2) ? 2131743239 : 2131743138, null));
        r65 r65Var = this.J1;
        r65Var.setVisibility(0);
        r7 r7Var = this.c3;
        r7Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r65Var, (Property<r65, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r65Var, (Property<r65, Float>) View.TRANSLATION_Y, gl.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(q65Var, (Property<q65, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q65Var, (Property<q65, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q65Var, (Property<q65, Float>) property, 0.0f);
        jia jiaVar = this.N1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property, 0.0f);
        jia jiaVar2 = this.P1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(jiaVar2, (Property<jia, Float>) property2, 0.0f), ObjectAnimator.ofFloat(jiaVar2, (Property<jia, Float>) property3, 0.0f), ObjectAnimator.ofFloat(jiaVar2, (Property<jia, Float>) property, 0.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(s33.g);
        animatorSet.addListener(new h65(this, b));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        gc2 gc2Var;
        VoIPService sharedInstance;
        byte b;
        byte b2;
        int i3 = kk7.v2;
        r65 r65Var = this.J1;
        String[] strArr = null;
        int i4 = 0;
        byte b3 = 1;
        if (i == i3) {
            Long l = (Long) objArr[1];
            fc2 fc2Var = this.T2;
            if (fc2Var == null || fc2Var.b.id != l.longValue()) {
                return;
            }
            fc2 fc2Var2 = this.T2;
            if (fc2Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j = this.m2;
            byte b4 = 3;
            j5 j5Var = this.n1;
            if (j == 0 && (((b2 = this.z3) == 7 || b2 == 5 || b2 == 6) && !fc2Var2.k())) {
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
                    fa4.g(th, true);
                }
                this.m2 = SystemClock.elapsedRealtime();
                gl.d3(new w35(this, b4), 3000L);
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
            int childCount = r65Var.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = r65Var.getChildAt(i5);
                if (childAt instanceof y95) {
                    ((y95) childAt).a(true, false);
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
                        ArrayList arrayList = na7.q1(j5Var.a).y;
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
                    if (cf3.D(longValue)) {
                        TLRPC.User V1 = na7.q1(j5Var.a).V1(l2);
                        if (V1 != null) {
                            if (this.T2.b.participants_count < 250 || l7c.y(V1) || V1.verified || i4 != 0) {
                                c1().k(0L, 44, V1, this.S2, null, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-longValue));
                    if (K0 != null) {
                        if (this.T2.b.participants_count < 250 || !hc2.r0(K0) || K0.verified || i4 != 0) {
                            c1().k(0L, 44, K0, this.S2, null, null);
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
        if (i == kk7.x2) {
            e55 e55Var = this.T3;
            if (e55Var.b && this.T2 != null) {
                boolean c = e55Var.c();
                fc2 fc2Var3 = this.T2;
                if (fc2Var3 != null && e55Var.b && (gc2Var = e55Var.e) != null && fc2Var3.d.f(k27.B1(gc2Var.a.peer)) == null) {
                    c = true;
                }
                if (c) {
                    gc2 gc2Var2 = null;
                    while (true) {
                        ArrayList arrayList2 = this.j2;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        gc2 gc2Var3 = (gc2) arrayList2.get(i4);
                        if (this.T2.P.g(null, k27.B1(gc2Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = gc2Var3.a;
                            if (!groupCallParticipant3.muted_by_you && e55Var.d != k27.B1(groupCallParticipant3.peer)) {
                                gc2Var2 = gc2Var3;
                            }
                        }
                        i4++;
                    }
                    if (gc2Var2 != null) {
                        V0(gc2Var2);
                    }
                }
            }
            e55Var.setVisibleParticipant(true);
            M1();
            return;
        }
        if (i == kk7.P4) {
            w1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i == kk7.L0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                AlertDialog$Builder K = ij.K(getContext(), k96.M0(2131743064, null), "GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str) ? hc2.W(this.S2) ? k96.M0(2131743210, null) : k96.M0(2131743077, null) : ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) ? hc2.W(this.S2) ? k96.M0(2131743236, null) : k96.M0(2131743128, null) : b00.j(new StringBuilder(k96.M0(2131751093, null)), "\n", str));
                K.i(new b45(this, b3));
                try {
                    K.o();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i == kk7.C2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == Z0()) {
                E1();
                L1(isShowing(), false);
            }
            long B1 = k27.B1(this.u2);
            fc2 fc2Var4 = this.T2;
            if (fc2Var4 == null || chatFull.id != (-B1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) fc2Var4.d.f(B1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            D0(true);
            gl.V3(r65Var);
            if (this.u4 != null) {
                while (i4 < this.u4.getChildCount()) {
                    View childAt2 = this.u4.getChildAt(i4);
                    if ((childAt2 instanceof a8) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((a8) childAt2).j(k96.M0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743264 : 2131743174, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (i == kk7.t1) {
            if (((Long) objArr[0]).longValue() == Z0()) {
                E1();
                L1(isShowing(), false);
                return;
            }
            return;
        }
        if (i == kk7.A2) {
            int childCount2 = r65Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i4 < childCount2) {
                s49 G = r65Var.G(r65Var.getChildAt(i4));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof y95) {
                        y95 y95Var = (y95) view;
                        if (y95Var.getParticipant() != null) {
                            y95Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i4++;
            }
            return;
        }
        if (i == kk7.D0) {
            Long l3 = (Long) objArr[0];
            long B12 = k27.B1(this.u2);
            if (this.T2 == null || B12 != l3.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(B12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            D0(true);
            gl.V3(r65Var);
            if (this.u4 != null) {
                while (i4 < this.u4.getChildCount()) {
                    View childAt3 = this.u4.getChildAt(i4);
                    if ((childAt3 instanceof a8) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((a8) childAt3).j(k96.M0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743265 : 2131743175, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (i == kk7.i0) {
            D0(true);
            gl.V3(r65Var);
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i7 = na7.q5;
            if ((intValue & 16) != 0) {
                D0(true);
            } else if ((intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            gl.V3(r65Var);
            return;
        }
        if (i == kk7.y2) {
            a65 a65Var = this.t2;
            if (a65Var != null) {
                a65Var.a(true, true);
            }
            E1();
            return;
        }
        if (i == kk7.T3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            pc pcVar = this.i2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            pcVar.b(strArr);
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.remove(this.n4);
        this.b2.setRequestedOrientation(-1);
        t5 = false;
        rb5 rb5Var = this.y3;
        if (rb5Var != null) {
            rb5Var.dismiss();
        }
        this.l2 = true;
        kk7.e().k(kk7.E2, new Object[0]);
        j5 j5Var = this.n1;
        int i = j5Var.a;
        int i2 = j5Var.a;
        kk7.f(i).n(this, kk7.L0);
        kk7.f(i2).n(this, kk7.v2);
        kk7.f(i2).n(this, kk7.S);
        kk7.f(i2).n(this, kk7.t1);
        kk7.f(i2).n(this, kk7.A2);
        kk7.f(i2).n(this, kk7.D0);
        kk7.f(i2).n(this, kk7.i0);
        kk7.f(i2).n(this, 2);
        kk7.f(i2).n(this, kk7.y2);
        kk7.f(i2).n(this, kk7.x2);
        kk7.f(i2).n(this, kk7.T3);
        kk7.e().n(this, kk7.P4);
        kk7.e().n(this, kk7.C2);
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
            TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(j));
            if (V1 != null) {
                byte b = 0;
                hd[] hdVarArr = {new hd(3, null, getContext())};
                TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                fc2 fc2Var = this.T2;
                invitetogroupcall.call = fc2Var.h(fc2Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = V1.id;
                tL_inputUser.access_hash = V1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(j5Var.a).sendRequest(invitetogroupcall, new i45(this, j, hdVarArr, V1, z, invitetogroupcall));
                if (sendRequest != 0) {
                    gl.d3(new j45(this, hdVarArr, sendRequest, b), 500L);
                }
            }
        }
    }

    public final boolean f1() {
        int L = gl.L(74.0f);
        float f = this.s2 - L;
        return (((((float) this.t0) + f) > ((float) a.getCurrentActionBarHeight()) ? 1 : ((((float) this.t0) + f) == ((float) a.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) a.getCurrentActionBarHeight()) - f) - ((float) this.t0)) / ((float) ((L - this.t0) - gl.L(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean g1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public final boolean i1() {
        fc2 fc2Var = this.T2;
        return fc2Var != null && fc2Var.b.rtmp_stream;
    }

    @Override // fx0
    public final boolean j0() {
        t5 = true;
        kk7.e().k(kk7.E2, new Object[0]);
        o85.k(getContext());
        return false;
    }

    public final void j1(LaunchActivity launchActivity, fc2 fc2Var, View view, int i) {
        TLRPC.Chat chat;
        final Long l;
        boolean z;
        final ec2 ec2Var;
        if (view instanceof o75) {
            V0(((o75) view).getParticipant());
            return;
        }
        if (view instanceof y95) {
            A1((y95) view);
            return;
        }
        boolean z2 = view instanceof p75;
        final byte b = 0;
        final byte b2 = 1;
        c75 c75Var = this.I1;
        if (!z2) {
            if (i != c75Var.x) {
                if (i != c75Var.y) {
                    if (i == c75Var.E) {
                        p1();
                        return;
                    }
                    return;
                }
                fc2 fc2Var2 = this.T2;
                if (fc2Var2 == null || fc2Var2.b == null) {
                    return;
                }
                s7c s7cVar = new s7c(launchActivity, this.a, new e53());
                fc2 fc2Var3 = this.T2;
                s7cVar.s2.addAll(fc2Var3 != null ? (Collection) Collection.-EL.stream(fc2Var3.e).map(new xz((byte) 8)).collect(Collectors.toSet()) : null);
                s7cVar.f1(false, true);
                s7cVar.r2 = new w35(this, (byte) 5);
                s7cVar.f1(false, true);
                s7cVar.t2 = new ae2((Object) this, (Object) fc2Var, (byte) 25);
                s7cVar.show();
                return;
            }
            if (hc2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && hc2.t0(chat)) {
                a1(false);
                return;
            }
            j5 j5Var = this.n1;
            TLRPC.ChatFull L0 = na7.q1(j5Var.a).L0(Z0());
            if (L0 != null) {
                this.q2 = false;
                Context context = getContext();
                int i2 = j5Var.a;
                TLRPC.Chat chat2 = this.S2;
                fc2 fc2Var4 = this.T2;
                rb5 rb5Var = new rb5(context, i2, chat2, L0, fc2Var4.d, fc2Var4.n);
                this.y3 = rb5Var;
                rb5Var.setOnDismissListener(new b45(this, (byte) 2));
                rb5 rb5Var2 = this.y3;
                rb5Var2.a2 = new n45(this);
                rb5Var2.show();
                return;
            }
            return;
        }
        p75 p75Var = (p75) view;
        if (p75Var.getUser() != null) {
            if (!g1()) {
                this.b2.N0(this.a);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", p75Var.getUser().id);
                if (p75Var.a.getImageReceiver().E()) {
                    bundle.putBoolean("expandPhoto", true);
                }
                this.b2.t0(new ProfileActivity(bundle, null));
                dismiss();
                return;
            }
            int i3 = i - c75Var.n;
            if (i3 < 0 || i3 >= this.T2.m.size()) {
                int i4 = i - c75Var.s;
                if (i4 < 0 || i4 >= this.T2.l.size()) {
                    int i5 = i - c75Var.f;
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
                    if (!z || (ec2Var = (ec2) this.T2.k.get(l)) == null) {
                    }
                    cs5 G = cs5.G(this.c, this.J0, p75Var);
                    G.k(R.drawable.msg_endcall, k96.M0(2131749268, null), new Runnable(this) { // from class: d45
                        public final /* synthetic */ h75 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            final byte b4 = 0;
                            Long l2 = l;
                            ec2 ec2Var2 = ec2Var;
                            final h75 h75Var = this.b;
                            final byte b5 = 1;
                            h75Var.getClass();
                            switch (b3) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite.msg_id = ec2Var2.a;
                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: f45
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b5;
                                            h75 h75Var2 = h75Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    fc2 fc2Var5 = h75Var.T2;
                                    if (fc2Var5 != null) {
                                        ec2Var2.b = false;
                                        fc2Var5.k.put(l2, ec2Var2);
                                        h75Var.D0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite2.msg_id = ec2Var2.a;
                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: f45
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            h75 h75Var2 = h75Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(ec2Var2.a));
                                    na7.q1(h75Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                    fc2 fc2Var6 = h75Var.T2;
                                    if (fc2Var6 != null) {
                                        fc2Var6.j.remove(l2);
                                        h75Var.T2.n.remove(l2);
                                        h75Var.T2.k.remove(l2);
                                        h75Var.D0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, ec2Var.a());
                    G.b(R.drawable.msg_remove, k96.M0(2131749279, null), new Runnable(this) { // from class: d45
                        public final /* synthetic */ h75 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final byte b4 = 0;
                            Long l2 = l;
                            ec2 ec2Var2 = ec2Var;
                            final h75 h75Var = this.b;
                            final byte b5 = 1;
                            h75Var.getClass();
                            switch (b3) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite.msg_id = ec2Var2.a;
                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: f45
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b5;
                                            h75 h75Var2 = h75Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    fc2 fc2Var5 = h75Var.T2;
                                    if (fc2Var5 != null) {
                                        ec2Var2.b = false;
                                        fc2Var5.k.put(l2, ec2Var2);
                                        h75Var.D0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite2.msg_id = ec2Var2.a;
                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: f45
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            h75 h75Var2 = h75Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        h75Var2.getClass();
                                                        break;
                                                    } else {
                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(ec2Var2.a));
                                    na7.q1(h75Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                    fc2 fc2Var6 = h75Var.T2;
                                    if (fc2Var6 != null) {
                                        fc2Var6.j.remove(l2);
                                        h75Var.T2.n.remove(l2);
                                        h75Var.T2.k.remove(l2);
                                        h75Var.D0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    G.X(bkb.c0(gl.L(8.0f), gl.L(8.0f), this.w2.getColor()));
                    G.s = (short) 96;
                    G.a0();
                    return;
                }
                l = (Long) this.T2.l.get(i - c75Var.s);
            } else {
                l = (Long) this.T2.m.get(i - c75Var.n);
            }
            z = true;
            if (z) {
            }
        }
    }

    public final void k1(fx0 fx0Var, hd hdVar, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (this.q2) {
            return;
        }
        d dVar = (d) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
        if (dVar instanceof mu1) {
            boolean U9 = ((mu1) dVar).U9();
            this.q2 = true;
            this.r2 = true;
            gl.d3(new rg((Object) fx0Var, (Object) editTextBoldCursor, z, (Object) hdVar, (byte) 19), U9 ? 200L : 0L);
            return;
        }
        this.q2 = true;
        this.r2 = true;
        if (fx0Var != null) {
            fx0Var.v0(true);
        } else if (hdVar != null) {
            hdVar.k(true);
        }
        if (z) {
            gl.d3(new l(editTextBoldCursor, (byte) 5), 100L);
        }
    }

    public final void m1() {
        w5 = true;
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((h85) arrayList.get(i)).j(false);
        }
        p65 p65Var = this.E1;
        brc brcVar = p65Var.w;
        if (brcVar != null) {
            brcVar.b(false);
        }
        p65Var.G = true;
        this.A1.r();
    }

    public final void n1() {
        w5 = false;
        this.I1.f();
        a55 a55Var = this.e4;
        if (a55Var.getVisibility() == 0) {
            this.h4.G(a55Var, false);
        }
        if (v5) {
            this.g4.I(this.f4, false);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((h85) arrayList.get(i)).j(true);
        }
        p65 p65Var = this.E1;
        brc brcVar = p65Var.w;
        if (brcVar != null) {
            brcVar.b(true);
        }
        p65Var.G = false;
        this.A1.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
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
            gl.g(str);
            if (gl.C3()) {
                c1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.b2;
        if (launchActivity != null) {
            d dVar = (d) launchActivity.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
            if (dVar instanceof mu1) {
                z3 = ((mu1) dVar).U9();
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
                    str5 = hc2.W(this.S2) ? k96.a0("VoipChannelInviteText", null, 2131743238, str4) : k96.a0("VoipGroupInviteText", null, 2131743130, str4);
                }
                j65 j65Var = new j65(this, getContext(), str5, str3, str4, str3);
                this.k2 = j65Var;
                j65Var.n2 = new pj4((Object) this, (byte) 5);
                j65Var.setOnDismissListener(new b45(this, (byte) 3));
                gl.d3(new w35(this, (byte) 8), !z3 ? 200L : 0L);
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
        j65 j65Var2 = new j65(this, getContext(), str5, str3, str4, str3);
        this.k2 = j65Var2;
        j65Var2.n2 = new pj4((Object) this, (byte) 5);
        j65Var2.setOnDismissListener(new b45(this, (byte) 3));
        gl.d3(new w35(this, (byte) 8), !z3 ? 200L : 0L);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        K1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            w1(0.0f);
        }
        r65 r65Var = this.J1;
        if (r65Var.getVisibility() == 0) {
            gl.V3(r65Var);
        }
        a55 a55Var = this.e4;
        if (a55Var.getVisibility() == 0) {
            gl.V3(a55Var);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((h85) arrayList.get(i)).j(true);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        a65 a65Var = this.t2;
        if (a65Var != null) {
            a65Var.a(false, false);
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
            ((h85) arrayList.get(i)).j(true);
        }
        a65 a65Var = this.t2;
        if (a65Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        a65Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // fx0, android.app.Dialog
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

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 2) {
            O0();
            M0();
            N0();
            float f3 = 1.0f - this.o5.e;
            r45 r45Var = this.o1;
            r45Var.setAlpha(f3);
            this.T3.setProgressToHideUi(f);
            this.e4.invalidate();
            this.b.invalidate();
            r45Var.invalidate();
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

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            RadialProgressView radialProgressView = this.X1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(bkb.w0(null, bkb.Eh, false));
            }
            r7 r7Var = this.b3;
            if (r7Var != null) {
                int i = bkb.Xg;
                r7Var.O(bkb.w0(null, i, false), false);
                r7Var.O(bkb.w0(null, i, false), true);
                r7Var.setPopupItemsSelectorColor(bkb.w0(null, bkb.Ug, false));
            }
            int w0 = bkb.w0(null, bkb.Xg, false);
            z1(this.s3, w0);
            z1(this.t3, w0);
            z1(this.g3, w0);
            z1(this.h3, w0);
            z1(this.i3, w0);
            z1(this.r3, bkb.w0(null, bkb.lh, false));
            z1(this.e3, w0);
            z1(this.f3, w0);
            z1(this.m3, w0);
            z1(this.n3, w0);
            z1(this.o3, w0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p1() {
        fc2 fc2Var = this.T2;
        if (fc2Var == null || fc2Var.b == null) {
            return;
        }
        hd hdVar = new hd(3, null, getContext());
        hdVar.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.T2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new en0((Object) this, (Object) hdVar, (Object) exportgroupcallinvite, (byte) 29));
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
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, be0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean[], ed, java.lang.String, wjb] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String, wjb] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r6v4, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
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
            TLObject V1 = j > 0 ? na7.q1(j5Var.a).V1(Long.valueOf(j)) : na7.q1(j5Var.a).K0(Long.valueOf(-j));
            if (i == 0 || i == 2 || i == 3) {
                if (i == 0) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().editCallMember(V1, Boolean.TRUE, null, null, null, null);
                        c1().k(0L, 30, V1, null, null, null);
                        return;
                    }
                    return;
                }
                ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
                int i5 = bkb.fh;
                hd hdVar = alertDialog$Builder.a;
                hdVar.J = i5;
                TextView textView2 = new TextView(getContext());
                int i6 = bkb.Xg;
                zkb.X(textView2, i6, null);
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((k96.a0 ? 5 : 3) | 48);
                ?? frameLayout = new FrameLayout(getContext());
                alertDialog$Builder.n(frameLayout);
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.s(gl.L(12.0f));
                ?? be0Var = new be0(getContext());
                be0Var.setRoundRadius(gl.L(20.0f));
                frameLayout.addView(be0Var, nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                pb0Var.o(V1);
                boolean z2 = V1 instanceof TLRPC.User;
                if (z2) {
                    TLRPC.User user = (TLRPC.User) V1;
                    be0Var.f(user, pb0Var);
                    str = l7c.k(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) V1;
                    be0Var.f(chat, pb0Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                tb4.w(textView3, i6, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((k96.a0 ? 5 : 3) | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.S2;
                String str5 = chat2 != null ? chat2.title : "";
                if (i != 2) {
                    textView3.setText(k96.M0(2131743160, null));
                    de9.r(null, null, 2131743161, new Object[]{str, str5}, textView2);
                } else if (g1()) {
                    textView3.setText(k96.M0(2131743179, null));
                    de9.r(null, null, 2131743180, new Object[]{str}, textView2);
                } else {
                    textView3.setText(k96.M0(2131743103, null));
                    if (hc2.W(this.S2)) {
                        de9.r(null, null, 2131743222, new Object[]{str, str5}, textView2);
                    } else {
                        de9.r(null, null, 2131743104, new Object[]{str, str5}, textView2);
                    }
                }
                boolean z3 = k96.a0;
                frameLayout.addView(textView3, nme.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 21 : 76, 11.0f, z3 ? 76 : 21, 0.0f));
                frameLayout.addView(textView2, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i == 2) {
                    r13 = 0;
                    alertDialog$Builder.j(k96.M0(2131743069, null), new h45(this, V1, (byte) 0));
                } else {
                    r13 = 0;
                    r13 = 0;
                    if (z2) {
                        alertDialog$Builder.j(k96.M0(2131743162, null), new hs0((Object) this, V1, j, (byte) 4));
                    }
                }
                alertDialog$Builder.g(k96.M0(2131752577, r13), r13);
                hdVar.j(bkb.w0(r13, bkb.kh, false));
                hdVar.show();
                if (i != 2 || (textView = (TextView) hdVar.c(-1)) == null) {
                    return;
                }
                zkb.X(textView, bkb.lh, r13);
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
                this.b2.t0(new mu1(bundle));
                dismiss();
                return;
            }
            if (i == 8) {
                this.b2.N0(this.a);
                d dVar = (d) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
                if ((dVar instanceof mu1) && ((mu1) dVar).a() == j) {
                    dismiss();
                    return;
                }
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                this.b2.t0(new mu1(bundle2));
                dismiss();
                return;
            }
            if (i == 7) {
                sharedInstance.editCallMember(V1, Boolean.TRUE, null, null, Boolean.FALSE, null);
                H1(2, true);
                return;
            }
            byte b2 = 9;
            if (i == 9) {
                wl5 wl5Var = this.a4;
                if (wl5Var == null || !wl5Var.g()) {
                    TLRPC.User f = y6c.h(j5Var.a).f();
                    wl5 wl5Var2 = new wl5(0, true, true);
                    this.a4 = wl5Var2;
                    wl5Var2.I = true;
                    wl5Var2.S = true;
                    wl5Var2.H = true;
                    wl5Var2.K = true;
                    wl5Var2.T = true;
                    wl5Var2.a = this.b2.N().getLastFragment();
                    wl5 wl5Var3 = this.a4;
                    t65 t65Var = new t65(this, j);
                    this.b4 = t65Var;
                    wl5Var3.b = t65Var;
                    TLRPC.UserProfilePhoto userProfilePhoto = f.photo;
                    wl5Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new w35(this, b2), new g5(b), 0);
                    return;
                }
                return;
            }
            if (i == 10) {
                String str6 = groupCallParticipant.about;
                Context context = getContext();
                int i7 = this.a;
                Pattern pattern = ij.a;
                ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                String M0 = j > 0 ? k96.M0(2131743526, null) : k96.M0(2131751447, null);
                final hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M0;
                hdVar2.U = k96.M0(j > 0 ? 2131743154 : 2131751450, null);
                ?? frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                if (j < 0) {
                    long j2 = -j;
                    if (na7.q1(i7).L0(j2) == null) {
                        z = 0;
                        na7.q1(i7).Y2(ConnectionsManager.generateClassGuid(), j2, true);
                        NumberTextView numberTextView = new NumberTextView(context);
                        EditText editText2 = new EditText(context);
                        int i8 = bkb.Xg;
                        zkb.X(editText2, i8, null);
                        editText2.setHint(j <= 0 ? k96.M0(2131743526, null) : k96.M0(2131751447, null));
                        editText2.setTextSize(1, 16.0f);
                        editText2.setBackground(bkb.T(context));
                        editText2.setMaxLines(4);
                        editText2.setRawInputType(147457);
                        editText2.setImeOptions(6);
                        int i9 = j <= 0 ? 70 : kk7.d4;
                        vh vhVar = new vh(i9, context, numberTextView);
                        InputFilter[] inputFilterArr = new InputFilter[1];
                        inputFilterArr[z] = vhVar;
                        editText2.setFilters(inputFilterArr);
                        numberTextView.setCenterAlign(true);
                        numberTextView.setTextSize(15);
                        numberTextView.setTextColor(bkb.w0(null, bkb.A6, z));
                        numberTextView.setImportantForAccessibility(2);
                        frameLayout2.addView(numberTextView, nme.d(20, 20.0f, !k96.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                        editText2.setPadding(!k96.a0 ? gl.L(24.0f) : 0, gl.L(8.0f), !k96.a0 ? 0 : gl.L(24.0f), gl.L(8.0f));
                        editText2.addTextChangedListener(new wh(i9, numberTextView));
                        gl.T3(numberTextView, false, 0.0f, true, false);
                        editText2.setText(str6);
                        editText2.setSelection(editText2.getText().toString().length());
                        alertDialog$Builder2.n(frameLayout2);
                        final gf gfVar = new gf(j, i7, (Object) editText2, (byte) 0);
                        alertDialog$Builder2.j(k96.M0(2131745754, null), gfVar);
                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                        hdVar2.O = new ve(editText2, 1 == true ? 1 : 0);
                        frameLayout2.addView(editText2, nme.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                        editText2.requestFocus();
                        gl.E3(editText2);
                        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hf
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView4, int i10, KeyEvent keyEvent) {
                                if (i10 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                                    hd hdVar3 = hdVar2;
                                    if (hdVar3.isShowing()) {
                                        gfVar.u(hdVar3, 0);
                                        return true;
                                    }
                                }
                                return false;
                            }
                        });
                        hdVar2.j(bkb.w0(null, bkb.kh, false));
                        hdVar2.show();
                        hdVar2.o(bkb.w0(null, i8, false));
                        return;
                    }
                }
                z = 0;
                NumberTextView numberTextView2 = new NumberTextView(context);
                EditText editText22 = new EditText(context);
                int i82 = bkb.Xg;
                zkb.X(editText22, i82, null);
                editText22.setHint(j <= 0 ? k96.M0(2131743526, null) : k96.M0(2131751447, null));
                editText22.setTextSize(1, 16.0f);
                editText22.setBackground(bkb.T(context));
                editText22.setMaxLines(4);
                editText22.setRawInputType(147457);
                editText22.setImeOptions(6);
                if (j <= 0) {
                }
                vh vhVar2 = new vh(i9, context, numberTextView2);
                InputFilter[] inputFilterArr2 = new InputFilter[1];
                inputFilterArr2[z] = vhVar2;
                editText22.setFilters(inputFilterArr2);
                numberTextView2.setCenterAlign(true);
                numberTextView2.setTextSize(15);
                numberTextView2.setTextColor(bkb.w0(null, bkb.A6, z));
                numberTextView2.setImportantForAccessibility(2);
                frameLayout2.addView(numberTextView2, nme.d(20, 20.0f, !k96.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                editText22.setPadding(!k96.a0 ? gl.L(24.0f) : 0, gl.L(8.0f), !k96.a0 ? 0 : gl.L(24.0f), gl.L(8.0f));
                editText22.addTextChangedListener(new wh(i9, numberTextView2));
                gl.T3(numberTextView2, false, 0.0f, true, false);
                editText22.setText(str6);
                editText22.setSelection(editText22.getText().toString().length());
                alertDialog$Builder2.n(frameLayout2);
                final gf gfVar2 = new gf(j, i7, (Object) editText22, (byte) 0);
                alertDialog$Builder2.j(k96.M0(2131745754, null), gfVar2);
                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                hdVar2.O = new ve(editText22, 1 == true ? 1 : 0);
                frameLayout2.addView(editText22, nme.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                editText22.requestFocus();
                gl.E3(editText22);
                editText22.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hf
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i10, KeyEvent keyEvent) {
                        if (i10 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                            hd hdVar3 = hdVar2;
                            if (hdVar3.isShowing()) {
                                gfVar2.u(hdVar3, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                hdVar2.j(bkb.w0(null, bkb.kh, false));
                hdVar2.show();
                hdVar2.o(bkb.w0(null, i82, false));
                return;
            }
            if (i != 11) {
                if (i == 5) {
                    sharedInstance.editCallMember(V1, Boolean.TRUE, null, null, null, null);
                    c1().m(V1, 35, 0L);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    i2 = 1;
                    sharedInstance.editCallMember(V1, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    i2 = 1;
                    sharedInstance.editCallMember(V1, Boolean.FALSE, null, 10000, null, null);
                }
                sharedInstance.setParticipantVolume(groupCallParticipant, hc2.H(groupCallParticipant));
                c1().k(0L, i == i2 ? 31 : 36, V1, null, null, null);
                return;
            }
            Context context2 = getContext();
            int i10 = this.a;
            Pattern pattern2 = ij.a;
            if (cf3.D(j)) {
                TLRPC.User V12 = na7.q1(i10).V1(Long.valueOf(j));
                str2 = V12.first_name;
                str3 = V12.last_name;
            } else {
                str2 = na7.q1(i10).K0(Long.valueOf(-j)).title;
                str3 = null;
            }
            ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
            if (j > 0) {
                i3 = 2131743173;
                r15 = 0;
            } else {
                r15 = 0;
                i3 = 2131743172;
            }
            String M02 = k96.M0(i3, r15);
            hd hdVar3 = alertDialog$Builder3.a;
            hdVar3.S = M02;
            ?? j3 = de9.j(context2, 1);
            EditText editText3 = new EditText(context2);
            int i11 = bkb.Xg;
            zkb.X(editText3, i11, r15);
            editText3.setTextSize(1, 16.0f);
            editText3.setMaxLines(1);
            editText3.setLines(1);
            editText3.setSingleLine(true);
            editText3.setGravity(k96.a0 ? 5 : 3);
            editText3.setInputType(49152);
            editText3.setImeOptions(j > 0 ? 5 : 6);
            if (j > 0) {
                i4 = 2131750677;
                str4 = null;
            } else {
                str4 = null;
                i4 = 2131743171;
            }
            editText3.setHint(k96.M0(i4, str4));
            editText3.setBackground(bkb.T(context2));
            editText3.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
            editText3.requestFocus();
            if (j > 0) {
                editText = new EditText(context2);
                zkb.X(editText, i11, null);
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(k96.a0 ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(k96.M0(2131748840, null));
                editText.setBackground(bkb.T(context2));
                editText.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
            } else {
                editText = null;
            }
            gl.E3(editText3);
            j3.addView(editText3, nme.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                j3.addView(editText, nme.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText3.setText(str2);
            editText3.setSelection(editText3.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder3.n(j3);
            EditText editText4 = editText;
            bf bfVar = new bf(editText3, j, i10, editText4);
            alertDialog$Builder3.j(k96.M0(2131745754, null), bfVar);
            alertDialog$Builder3.g(k96.M0(2131752577, null), null);
            byte b3 = 0;
            hdVar3.O = new cf(editText3, editText4, b3);
            hdVar3.j(bkb.w0(null, bkb.kh, false));
            hdVar3.show();
            hdVar3.o(bkb.w0(null, i11, false));
            df dfVar = new df(hdVar3, bfVar, b3);
            if (editText4 != null) {
                editText4.setOnEditorActionListener(dfVar);
            } else {
                editText3.setOnEditorActionListener(dfVar);
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
    public final void s1(boolean z, y95 y95Var) {
        boolean z2;
        int i;
        float f;
        final float f2;
        float f3;
        h85 h85Var;
        char c;
        float f4;
        float f5;
        ValueAnimator ofFloat;
        h85 h85Var2;
        h85 h85Var3;
        float paddingLeft = this.b.getPaddingLeft() + gl.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + gl.L(14.0f);
        boolean z3 = this.Q4;
        g55 g55Var = this.l1;
        r65 r65Var = this.J1;
        if (z3) {
            f2 = (r65Var.getX() + (y95Var.getX() + y95Var.getAvatarImageView().getX())) - paddingLeft;
            f = (r65Var.getY() + (y95Var.getY() + y95Var.getAvatarImageView().getY())) - paddingTop;
            f3 = y95Var.getAvatarImageView().getMeasuredHeight() / r65Var.getMeasuredWidth();
            i = (int) ((y95Var.getAvatarImageView().getMeasuredHeight() >> 1) / f3);
        } else {
            if (this.O4 == null) {
                this.E4 = true;
                z2 = true;
            } else {
                if (!z) {
                    if (g55Var.E0.k(g55Var.getCurrentItem()) != 0) {
                        z2 = false;
                        this.E4 = z2;
                    }
                }
                z2 = true;
                this.E4 = z2;
            }
            o75 o75Var = this.N4;
            e55 e55Var = this.T3;
            if (o75Var == null || !z2) {
                m75 m75Var = this.P4;
                if (m75Var != null) {
                    h85 h85Var4 = this.O4;
                    a55 a55Var = this.e4;
                    if (h85Var4 == null) {
                        float x = (e55Var.getX() + (a55Var.getX() + (this.P4.getX() + m75Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y = (e55Var.getY() + (a55Var.getY() + (this.P4.getY() + this.P4.getAvatarImageView().getY()))) - paddingTop;
                        f3 = this.P4.getAvatarImageView().getMeasuredHeight() / r65Var.getMeasuredWidth();
                        i = (int) ((this.P4.getAvatarImageView().getMeasuredHeight() >> 1) / f3);
                        f = y;
                        f2 = x;
                        if (!this.E4 && (h85Var = this.O4) != null) {
                            h85Var.invalidate();
                            e55Var.invalidate();
                            h85 h85Var5 = this.O4;
                            h85Var5.h = false;
                            h85Var5.j(false);
                            this.O4 = null;
                        }
                    } else if (z2) {
                        f2 = (e55Var.getX() + (a55Var.getX() + m75Var.getX())) - paddingLeft;
                        f = (e55Var.getY() + (a55Var.getY() + this.P4.getY())) - paddingTop;
                        i = 0;
                    }
                }
                i = 0;
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.96f;
                if (!this.E4) {
                    h85Var.invalidate();
                    e55Var.invalidate();
                    h85 h85Var52 = this.O4;
                    h85Var52.h = false;
                    h85Var52.j(false);
                    this.O4 = null;
                }
            } else {
                float x2 = (r65Var.getX() + o75Var.getX()) - paddingLeft;
                f = ((r65Var.getY() + this.N4.getY()) + gl.L(2.0f)) - paddingTop;
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
        f55 f55Var = this.t4;
        if (z) {
            i55 i55Var = this.s4;
            i55Var.setScaleX(f7);
            i55Var.setScaleY(f7);
            i55Var.setTranslationX(f2);
            i55Var.setTranslationY(f6);
            f55Var.setAlpha(0.0f);
        }
        g55Var.N(i2, i2);
        if (this.Z3) {
            k55 k55Var = this.U3;
            if (z) {
                k55Var.setAlpha(0.0f);
            }
            ug8.s(k55Var.animate(), z ? 1.0f : 0.0f, 220L);
        }
        ug8.s(f55Var.animate(), z ? 1.0f : 0.0f, 220L);
        if (!z && (h85Var3 = this.O4) != null) {
            h85Var3.h = false;
            h85Var3.j(true);
            if (g55Var.E0.k(g55Var.getCurrentItem()) != 0) {
                d85 d85Var = this.O4.a;
                d85Var.F = false;
                c = 0;
                d85Var.G = 0L;
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
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z35
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        h75 h75Var = h75.this;
                        h75Var.W3 = floatValue;
                        h75Var.T3.n = floatValue;
                        float f8 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
                        i55 i55Var2 = h75Var.s4;
                        i55Var2.setScaleX(f8);
                        i55Var2.setScaleY(f8);
                        i55Var2.setTranslationX((1.0f - h75Var.W3) * f2);
                        i55Var2.setTranslationY((1.0f - h75Var.W3) * f6);
                        if (!h75Var.Z3) {
                            h75Var.L4.setAlpha((int) (h75Var.W3 * 100.0f));
                        }
                        h85 h85Var6 = h75Var.O4;
                        if (h85Var6 != null) {
                            h85Var6.a.setRoundCorners((1.0f - h75Var.W3) * gl.L(8.0f));
                        }
                        i55Var2.invalidate();
                        h75Var.b.invalidate();
                        g55 g55Var2 = h75Var.l1;
                        int i3 = (int) ((1.0f - h75Var.W3) * i2);
                        g55Var2.N(i3, i3);
                    }
                });
                this.S4 = kk7.f(this.n1.a).q(new int[]{kk7.a0, kk7.X1, kk7.C}, this.S4, true);
                h85Var2 = this.N4 != null ? this.O4 : null;
                if (h85Var2 != null) {
                    h85Var2.f = true;
                }
                ofFloat.addListener(new qw((Object) this, (Object) h85Var2, z, (byte) 4));
                if (!this.Q4 || this.O4 == null) {
                    ofFloat.setInterpolator(s33.f);
                    ofFloat.setDuration(220L);
                    ofFloat.start();
                } else {
                    ofFloat.setInterpolator(s33.f);
                    ofFloat.setDuration(220L);
                    this.O4.a.setAnimateNextDuration(220L);
                    d85 d85Var2 = this.O4.a;
                    if (d85Var2.F) {
                        d85Var2.H.add(ofFloat);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z35
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h75 h75Var = h75.this;
                h75Var.W3 = floatValue;
                h75Var.T3.n = floatValue;
                float f8 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
                i55 i55Var2 = h75Var.s4;
                i55Var2.setScaleX(f8);
                i55Var2.setScaleY(f8);
                i55Var2.setTranslationX((1.0f - h75Var.W3) * f2);
                i55Var2.setTranslationY((1.0f - h75Var.W3) * f6);
                if (!h75Var.Z3) {
                    h75Var.L4.setAlpha((int) (h75Var.W3 * 100.0f));
                }
                h85 h85Var6 = h75Var.O4;
                if (h85Var6 != null) {
                    h85Var6.a.setRoundCorners((1.0f - h75Var.W3) * gl.L(8.0f));
                }
                i55Var2.invalidate();
                h75Var.b.invalidate();
                g55 g55Var2 = h75Var.l1;
                int i3 = (int) ((1.0f - h75Var.W3) * i2);
                g55Var2.N(i3, i3);
            }
        });
        this.S4 = kk7.f(this.n1.a).q(new int[]{kk7.a0, kk7.X1, kk7.C}, this.S4, true);
        if (this.N4 != null) {
        }
        if (h85Var2 != null) {
        }
        ofFloat.addListener(new qw((Object) this, (Object) h85Var2, z, (byte) 4));
        if (this.Q4) {
        }
        ofFloat.setInterpolator(s33.f);
        ofFloat.setDuration(220L);
        ofFloat.start();
        I0();
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        G1();
    }

    public final void t1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall h;
        this.A1.setText("");
        fc2 fc2Var = this.T2;
        if (fc2Var == null || fc2Var.b == null || (h = fc2Var.h(fc2Var.a)) == null) {
            return;
        }
        fc2 fc2Var2 = this.T2;
        long j = fc2Var2.b.id;
        TLRPC.Peer peer = fc2Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? cf3.n(peer) : y6c.h(this.a).n, tL_textWithEntities, j, h);
    }

    public final void u1(float f) {
        this.N3 = f;
        e55 e55Var = this.T3;
        float max = Math.max(f, e55Var == null ? 0.0f : e55Var.c);
        int i = bkb.Zg;
        int w0 = bkb.w0(null, i, false);
        int i2 = bkb.Wg;
        int R0 = gl.R0(f, 1.0f, w0, bkb.w0(null, i2, false));
        this.O3 = R0;
        this.G1.setBackgroundColor(R0);
        this.b3.I(-14472653);
        this.Y1.setColorFilter(new PorterDuffColorFilter(this.O3, PorterDuff.Mode.MULTIPLY));
        this.H0 = gl.R0(max, 1.0f, bkb.w0(null, i, false), bkb.w0(null, i2, false));
        int R02 = gl.R0(f, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, bkb.jh, false));
        pc pcVar = this.i2;
        if (pcVar != null) {
            pcVar.b = R02;
            sb sbVar = (sb) pcVar.i;
            if (sbVar != null) {
                sbVar.invalidate();
            }
        }
        this.w2.setColor(R02);
        this.x1.setColor(R02);
        this.y1.invalidate();
        r65 r65Var = this.J1;
        r65Var.setGlowColor(R02);
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
        int R03 = gl.R0(f, 1.0f, bkb.w0(null, bkb.th, false), bkb.w0(null, bkb.uh, false));
        this.t1.a(R03, R03);
        int R04 = gl.R0(f, 1.0f, bkb.w0(null, bkb.bh, false), bkb.w0(null, bkb.eh, false));
        int R05 = gl.R0(f, 1.0f, bkb.w0(null, bkb.ch, false), bkb.w0(null, bkb.hh, false));
        int v0 = bkb.v0(bkb.Ei, this.J0);
        int childCount = r65Var.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = r65Var.getChildAt(i4);
            if (childAt instanceof s95) {
                s95 s95Var = (s95) childAt;
                if (g1()) {
                    s95Var.a(v0, v0);
                } else {
                    s95Var.a(R05, R04);
                }
            } else {
                boolean z = childAt instanceof y95;
                c65 c65Var = this.H1;
                if (z) {
                    ((y95) childAt).f(c65Var.getTag() != null ? bkb.hh : bkb.ch, R05);
                } else if (childAt instanceof p75) {
                    ((p75) childAt).a(c65Var.getTag() != null ? bkb.hh : bkb.ch, R05);
                }
            }
        }
        this.b.invalidate();
        r65Var.invalidate();
        this.c.invalidate();
    }

    public final void v1(boolean z) {
        if (this.T2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        fc2 fc2Var = this.T2;
        togglegroupcallsettings.call = fc2Var.h(fc2Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.m5 = Boolean.valueOf(z);
        D1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        co3 co3Var = Utilities.d;
        Objects.requireNonNull(co3Var);
        byte b = 0;
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ge2(co3Var, b), new g45(this, b));
    }

    public final void w1(float f) {
        r65 r65Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s49 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        fc2 fc2Var = this.T2;
        if (fc2Var == null || (r65Var = this.J1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(k27.B1(this.u2))) == null) {
            return;
        }
        e55 e55Var = this.T3;
        if (e55Var.b) {
            int i = 0;
            while (true) {
                a55 a55Var = this.e4;
                if (i >= a55Var.getChildCount()) {
                    break;
                }
                m75 m75Var = (m75) a55Var.getChildAt(i);
                if (k27.B1(m75Var.getParticipant().peer) == k27.B1(groupCallParticipant.peer)) {
                    m75Var.setAmplitude(f * 15.0f);
                }
                i++;
            }
        } else {
            int indexOf = (this.l2 ? this.x2 : this.T2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = r65Var.K(indexOf + this.I1.d)) != null) {
                View view = K.a;
                if (view instanceof y95) {
                    ((y95) view).setAmplitude(f * 15.0f);
                    if (view == this.M4 && !this.d4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        e55Var.i(groupCallParticipant, f * 15.0f);
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
        float L = f - gl.L(74.0f);
        float f2 = this.t0 + L;
        float currentActionBarHeight = a.getCurrentActionBarHeight() << 1;
        e55 e55Var = this.T3;
        y45 y45Var = this.Y2;
        v45 v45Var = this.X2;
        if (f2 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((a.getCurrentActionBarHeight() << 1) - L) - this.t0) / (a.getCurrentActionBarHeight() + ((r0 - this.t0) - gl.L(14.0f))));
            i = (int) (gl.L(gl.O1() ? 17.0f : 13.0f) * min);
            if (Math.abs(Math.min(1.0f, min) - this.N3) > 1.0E-4f) {
                u1(Math.min(1.0f, min));
            }
            float v = oo1.v(min, 0.1f, 1.2f, 1.0f);
            v45Var.setScaleX(Math.max(0.9f, v));
            v45Var.setScaleY(Math.max(0.9f, v));
            float f3 = 1.0f - (min * 1.2f);
            v45Var.setAlpha((1.0f - e55Var.c) * Math.max(0.0f, f3));
            y45Var.setScaleX(Math.max(0.9f, v));
            y45Var.setScaleY(Math.max(0.9f, v));
            y45Var.setAlpha((1.0f - e55Var.c) * Math.max(0.0f, f3));
        } else {
            v45Var.setScaleX(1.0f);
            v45Var.setScaleY(1.0f);
            v45Var.setAlpha(1.0f - e55Var.c);
            y45Var.setScaleX(1.0f);
            y45Var.setScaleY(1.0f);
            y45Var.setAlpha(1.0f - e55Var.c);
            if (this.N3 > 1.0E-4f) {
                u1(0.0f);
            }
            i = 0;
        }
        O0();
        float f4 = i;
        this.u3.setTranslationY(Math.max(gl.L(4.0f), (f - gl.L(53.0f)) - f4));
        this.a3.setTranslationY(Math.max(gl.L(4.0f), (f - gl.L(44.0f)) - f4));
        x55 x55Var = this.K1;
        if (x55Var != null) {
            x55Var.setTranslationY(Math.max(gl.L(4.0f), (f - gl.L(44.0f)) - f4));
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

    @Override // x74
    public final void F(float f, int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
