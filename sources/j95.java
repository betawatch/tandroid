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
import org.telegram.messenger.voip.CallAudioDevice;
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
import org.telegram.ui.ActionBar.e;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j95 extends nx0 implements fn7, VoIPService.StateListener, s84 {
    public static j95 s5;
    public static boolean t5;
    public static boolean u5;
    public static boolean v5;
    public static boolean w5;
    public final q75 A1;
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
    public i49 D1;
    public final b29 D2;
    public final i95[] D3;
    public final d75 D4;
    public final r85 E1;
    public final b29 E2;
    public float E3;
    public boolean E4;
    public final in F1;
    public boolean F2;
    public i95 F3;
    public boolean F4;
    public final z65 G1;
    public final gk0 G2;
    public i95 G3;
    public RenderNode G4;
    public final e85 H1;
    public final gk0 H2;
    public long H3;
    public float H4;
    public final e95 I1;
    public float I2;
    public float I3;
    public final String[] I4;
    public final t85 J1;
    public float J2;
    public float J3;
    public ObjectAnimator J4;
    public final z75 K1;
    public float K2;
    public boolean K3;
    public ObjectAnimator K4;
    public final TextView L1;
    public RadialGradient L2;
    public boolean L3;
    public final u75 L4;
    public final x75 M1;
    public final Matrix M2;
    public int M3;
    public zb5 M4;
    public final ema N1;
    public final Paint N2;
    public float N3;
    public q95 N4;
    public final s85 O1;
    public float O2;
    public int O3;
    public ka5 O4;
    public final ema P1;
    public float P2;
    public boolean P3;
    public o95 P4;
    public final z85 Q1;
    public ValueAnimator Q2;
    public final int[] Q3;
    public boolean Q4;
    public final sd4 R1;
    public TLRPC.InputPeer R2;
    public final ArrayList R3;
    public boolean R4;
    public final ImageReceiver S1;
    public TLRPC.Chat S2;
    public final ArrayList S3;
    public int S4;
    public int T1;
    public vc2 T2;
    public final g75 T3;
    public AnimatorSet T4;
    public final ImageView U1;
    public final boolean U2;
    public final m75 U3;
    public o85 U4;
    public final da5 V1;
    public final String V2;
    public final a85 V3;
    public int V4;
    public final int W1;
    public final f95 W2;
    public float W3;
    public int W4;
    public final RadialProgressView X1;
    public final x65 X2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout X3;
    public int X4;
    public final Drawable Y1;
    public final a75 Y2;
    public boolean Y3;
    public int Y4;
    public final View Z1;
    public final Paint Z2;
    public boolean Z3;
    public int Z4;
    public AnimatorSet a2;
    public final LinearLayout a3;
    public zn5 a4;
    public int a5;
    public LaunchActivity b2;
    public final s7 b3;
    public v85 b4;
    public int b5;
    public final UndoView[] c2;
    public final s7 c3;
    public int c4;
    public int c5;
    public final l5 d2;
    public final s7 d3;
    public boolean d4;
    public int d5;
    public boolean e2;
    public final b8 e3;
    public final c75 e4;
    public int e5;
    public lg5 f2;
    public final b8 f3;
    public final d79 f4;
    public int f5;
    public lg5 g2;
    public final b8 g3;
    public final sb5 g4;
    public int g5;
    public int h2;
    public final b8 h3;
    public final p95 h4;
    public int h5;
    public qc i2;
    public final b8 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final ArrayList j2;
    public final v86 j3;
    public final fe1 j4;
    public int j5;
    public l85 k2;
    public final x86 k3;
    public boolean k4;
    public int k5;
    public final i75 l1;
    public boolean l2;
    public final u86 l3;
    public final ArrayList l4;
    public final p85 l5;
    public final n65 m1;
    public long m2;
    public final b8 m3;
    public boolean m4;
    public Boolean m5;
    public final k5 n1;
    public boolean n2;
    public final b8 n3;
    public final z55 n4;
    public Integer n5;
    public final t65 o1;
    public boolean o2;
    public final b8 o3;
    public final y65 o4;
    public final fm0 o5;
    public final kmc p1;
    public final RectF p2;
    public final b8 p3;
    public final jm3 p4;
    public final fm0 p5;
    public final kmc q1;
    public boolean q2;
    public final b8 q3;
    public final z55 q4;
    public final t84 q5;
    public final kmc r1;
    public boolean r2;
    public final b8 r3;
    public final LongSparseIntArray r4;
    public final fm0 r5;
    public final kmc s1;
    public float s2;
    public final b8 s3;
    public final k75 s4;
    public final kmc t1;
    public c85 t2;
    public final b8 t3;
    public final h75 t4;
    public final kmc u1;
    public TLRPC.Peer u2;
    public final LinearLayout u3;
    public LinearLayout u4;
    public final kmc v1;
    public TLObject v2;
    public final TextView v3;
    public boolean v4;
    public final u65 w1;
    public final Paint w2;
    public final v2d w3;
    public final b29 w4;
    public final Paint x1;
    public final ArrayList x2;
    public z55 x3;
    public byte x4;
    public final t75 y1;
    public final ArrayList y2;
    public sd5 y3;
    public boolean y4;
    public final s75 z1;
    public final ArrayList z2;
    public byte z3;
    public final View z4;

    public j95(final LaunchActivity launchActivity, k5 k5Var, vc2 vc2Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super((vnb) null, (Context) launchActivity, true, true);
        int i;
        final LaunchActivity launchActivity2;
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
        this.w3 = new v2d(new z55(this, (byte) 4));
        byte b = 0;
        this.z3 = (byte) 0;
        this.B3 = new Paint(7);
        this.C3 = new Paint(7);
        this.D3 = new i95[8];
        this.E3 = 1.0f;
        this.P3 = true;
        this.Q3 = new int[4];
        this.R3 = new ArrayList();
        this.S3 = new ArrayList();
        this.j4 = new fe1();
        this.l4 = new ArrayList();
        this.n4 = new z55(this, b);
        this.o4 = new y65(this);
        this.p4 = new jm3((byte) 13);
        this.q4 = new z55(this, (byte) 2);
        this.r4 = new LongSparseIntArray();
        this.C4 = new int[2];
        this.F4 = true;
        this.I4 = new String[2];
        this.S4 = -1;
        this.l5 = new p85(this);
        k43 k43Var = k43.f;
        this.o5 = new fm0(2, this, k43Var, 350L);
        this.p5 = new fm0(3, this, k43Var, 220L, true);
        this.q5 = new t84(4, this, k43Var, 350L);
        final j95 j95Var = this;
        j95Var.r5 = new fm0(5, this, k43Var, 350L);
        hl.S(j95Var.getWindow());
        j95Var.S0 = true;
        j95Var.n1 = k5Var;
        j95Var.T2 = vc2Var;
        j95Var.R2 = inputPeer;
        j95Var.S2 = chat;
        j95Var.V2 = str;
        j95Var.a = k5Var.a;
        j95Var.U2 = z;
        j95Var.J0 = new w53();
        j95Var.Q0 = true;
        j95Var.R0 = true;
        j95Var.W1 = uc7.s1(j95Var.a).k4.D.f();
        j95Var.V = true;
        v5 = false;
        u5 = false;
        w5 = false;
        j95Var.z0 = new j75(j95Var);
        j95Var.s = true;
        j95Var.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            j95Var.getWindow().setNavigationBarColor(-16777216);
        }
        j95Var.w = true;
        j95Var.G0 = -1;
        j95Var.L4 = new u75(j95Var);
        j95Var.setOnDismissListener(new e65(j95Var, b));
        j95Var.q0 = (byte) 75;
        e95 e95Var = new e95(j95Var, launchActivity);
        j95Var.I1 = e95Var;
        hh2 hh2Var = new hh2(true);
        int i2 = aob.hh;
        hh2Var.b(aob.u0(i2));
        hh2Var.d();
        e85 e85Var = new e85(j95Var, launchActivity, hh2Var);
        j95Var.H1 = e85Var;
        e85Var.setSubtitle("");
        e85Var.getSubtitleTextView().setVisibility(0);
        e85Var.r();
        e85Var.getAdditionalSubtitleTextView().setPadding(hl.L(24.0f), 0, 0, 0);
        hl.Q3(1.0f, e85Var.getAdditionalSubtitleTextView(), j95Var.m4, false);
        e85Var.getAdditionalSubtitleTextView().setTextColor(aob.u0(i2));
        int i3 = aob.ch;
        yob.l(e85Var, 6, i3, null);
        e85Var.setBackButtonImage(R.drawable.ic_ab_back);
        e85Var.setOccupyStatusBar(false);
        e85Var.setAllowOverlayTitle(false);
        int i4 = aob.Yg;
        yob.l(e85Var, 1, i4, null);
        yob.l(e85Var, 3, aob.z8, null);
        yob.c(e85Var, i4);
        yob.l(e85Var, 6, i3, null);
        e85Var.setActionBarMenuOnItemClick(new m85(j95Var, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            j95Var.u2 = tL_peerUser;
            i = i4;
            tL_peerUser.user_id = k5Var.e().e();
        } else {
            i = i4;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                j95Var.u2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                j95Var.u2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                j95Var.u2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new a65(j95Var, (byte) 2);
        k5Var.c().b(j95Var, jn7.w2);
        k5Var.c().b(j95Var, jn7.M0);
        k5Var.c().b(j95Var, jn7.T);
        k5Var.c().b(j95Var, jn7.u1);
        k5Var.c().b(j95Var, jn7.B2);
        k5Var.c().b(j95Var, jn7.E0);
        k5Var.c().b(j95Var, jn7.j0);
        k5Var.c().b(j95Var, 2);
        k5Var.c().b(j95Var, jn7.z2);
        k5Var.c().b(j95Var, jn7.y2);
        k5Var.c().b(j95Var, jn7.U3);
        jn7.e().b(j95Var, jn7.Q4);
        jn7.e().b(j95Var, jn7.D2);
        j95Var.Y1 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        b29 b29Var = new b29(R.raw.voip_filled, hl.L(46.0f), hl.L(46.0f), true, null);
        j95Var.D2 = b29Var;
        j95Var.E2 = new b29(R.raw.hand_2, hl.L(46.0f), hl.L(46.0f), true, null);
        r85 r85Var = new r85(j95Var, launchActivity);
        j95Var.E1 = r85Var;
        j95Var.b = r85Var;
        r85Var.setClipToPadding(false);
        j95Var.b.setFocusable(true);
        j95Var.b.setFocusableInTouchMode(true);
        j95Var.b.setWillNotDraw(false);
        ViewGroup viewGroup = j95Var.b;
        int i5 = j95Var.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        j95Var.b.setKeepScreenOn(true);
        j95Var.b.setClipChildren(false);
        j95Var.S1 = new ImageReceiver(j95Var.b);
        if (inputPeer != null) {
            ema emaVar = new ema(launchActivity);
            j95Var.N1 = emaVar;
            emaVar.setGravity(17);
            emaVar.setTextColor(-1);
            emaVar.setTypeface(hl.o());
            emaVar.setTextSize(18);
            emaVar.k(ob6.L0(2131743087));
            j95Var.b.addView(emaVar, tre.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            s85 s85Var = new s85(j95Var, launchActivity);
            j95Var.O1 = s85Var;
            s85Var.setGravity(17);
            s85Var.setTextColor(-1);
            s85Var.setTypeface(hl.o());
            s85Var.setTextSize(60);
            j95Var.b.addView(s85Var, tre.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            ema emaVar2 = new ema(launchActivity);
            j95Var.P1 = emaVar2;
            emaVar2.setGravity(17);
            emaVar2.setTextColor(-1);
            emaVar2.setTypeface(hl.o());
            emaVar2.setTextSize(18);
            j95Var.b.addView(emaVar2, tre.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        t85 t85Var = new t85(j95Var, launchActivity);
        j95Var.J1 = t85Var;
        t85Var.setClipToPadding(false);
        t85Var.setClipChildren(false);
        z85 z85Var = new z85(j95Var);
        j95Var.Q1 = z85Var;
        z85Var.o = k43Var;
        z85Var.d = (short) 350;
        z85Var.c = (short) 350;
        z85Var.e = (short) 350;
        z85Var.C = false;
        t85Var.setItemAnimator(z85Var);
        t85Var.setOnScrollListener(new u85(j95Var));
        t85Var.setVerticalScrollBarEnabled(false);
        j95Var.getContext();
        sd4 sd4Var = new sd4(u5 ? 6 : 2, t85Var);
        j95Var.R1 = sd4Var;
        t85Var.setLayoutManager(sd4Var);
        n65 n65Var = new n65(j95Var);
        j95Var.m1 = n65Var;
        sd4Var.O = n65Var;
        t85Var.i(new o65(j95Var));
        sd4Var.W = false;
        j95Var.b.addView(t85Var, tre.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        t85Var.setAdapter(e95Var);
        t85Var.setTopBottomSelectorRadius(13);
        yob.I(aob.Vg, t85Var);
        t85Var.setOnItemClickListener(new fu2((Object) j95Var, (Object) launchActivity, (Object) vc2Var, (byte) 13));
        t85Var.setOnItemLongClickListener(new a65(j95Var, (byte) 3));
        d79 d79Var = new d79(launchActivity);
        j95Var.f4 = d79Var;
        j95Var.b.addView(d79Var, tre.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        sb5 sb5Var = new sb5(vc2Var, j95Var.a, j95Var);
        j95Var.g4 = sb5Var;
        d79Var.setAdapter(sb5Var);
        u55 u55Var = new u55(6, false);
        d79Var.setLayoutManager(u55Var);
        u55Var.O = new q65(j95Var);
        final byte b2 = 1;
        d79Var.setOnItemClickListener(new r69(j95Var) { // from class: y55
            public final /* synthetic */ j95 b;

            {
                this.b = j95Var;
            }

            @Override // r69
            public final void e(int i6, View view) {
                byte b3 = b2;
                j95 j95Var2 = this.b;
                switch (b3) {
                    case 0:
                        o95 o95Var = (o95) view;
                        if (o95Var.getVideoParticipant() != null) {
                            j95Var2.W0(o95Var.getVideoParticipant());
                            break;
                        } else {
                            j95Var2.W0(new wc2(o95Var.getParticipant(), false));
                            break;
                        }
                    default:
                        q95 q95Var = (q95) view;
                        if (q95Var.getParticipant() != null) {
                            j95Var2.W0(q95Var.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        zb3 zb3Var = new zb3();
        zb3Var.C = false;
        zb3Var.o = k43Var;
        zb3Var.d = (short) 350;
        zb3Var.c = (short) 350;
        zb3Var.e = (short) 350;
        d79Var.setItemAnimator(new r65(j95Var));
        d79Var.setOnScrollListener(new s65(j95Var));
        sb5Var.H(d79Var, false, false);
        d79Var.setVisibility(8);
        t65 t65Var = new t65(j95Var, launchActivity);
        j95Var.o1 = t65Var;
        int u0 = aob.u0(aob.Ah);
        int red = Color.red(u0);
        int green = Color.green(u0);
        int blue = Color.blue(u0);
        j95Var.M2 = new Matrix();
        j95Var.L2 = new RadialGradient(0.0f, 0.0f, hl.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        j95Var.N2 = paint;
        paint.setShader(j95Var.L2);
        gk0 gk0Var = new gk0(9);
        j95Var.G2 = gk0Var;
        gk0 gk0Var2 = new gk0(12);
        j95Var.H2 = gk0Var2;
        gk0Var.a = hl.L(62.0f) * 0.45454547f;
        gk0Var.b = hl.L(72.0f) * 0.45454547f;
        gk0Var.b();
        gk0Var2.a = hl.L(65.0f) * 0.45454547f;
        gk0Var2.b = hl.L(75.0f) * 0.45454547f;
        gk0Var2.b();
        int i6 = aob.zh;
        gk0Var.d.setColor(vm2.o(aob.u0(i6), 38));
        gk0Var2.d.setColor(vm2.o(aob.u0(i6), 76));
        kmc kmcVar = new kmc(launchActivity, 50.0f);
        j95Var.s1 = kmcVar;
        kmcVar.setCheckable(true);
        kmcVar.setTextSize(12);
        t65Var.a(kmcVar);
        kmcVar.setOnClickListener(new x55(j95Var, (byte) 6));
        kmc kmcVar2 = new kmc(launchActivity, 50.0f);
        j95Var.r1 = kmcVar2;
        kmcVar2.setCheckable(true);
        kmcVar2.setTextSize(12);
        kmcVar2.d(false, false);
        kmcVar2.setCrossOffset(-hl.N(3.5f));
        kmcVar2.c(R.drawable.calls_video, -1, 0, 1.0f, true, ob6.L0(2131743141), false, false);
        kmc kmcVar3 = new kmc(launchActivity, 50.0f);
        j95Var.p1 = kmcVar3;
        kmcVar3.setCheckable(true);
        kmcVar3.setTextSize(12);
        kmcVar3.d(false, false);
        e29 e29Var = new e29(launchActivity);
        kmcVar3.addView(e29Var, tre.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        b29 b29Var2 = new b29(R.raw.camera_flip, hl.L(24.0f), hl.L(24.0f), true, null);
        j95Var.w4 = b29Var2;
        e29Var.setAnimation(b29Var2);
        kmcVar3.setOnClickListener(new x55(j95Var, (byte) 9));
        t65Var.a(kmcVar3);
        kmc kmcVar4 = new kmc(launchActivity, 50.0f);
        j95Var.q1 = kmcVar4;
        kmcVar4.setCheckable(true);
        kmcVar4.setTextSize(12);
        kmcVar4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        j95Var.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        j95Var.T1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        kmcVar4.addView(imageView, tre.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        kmcVar4.setOnClickListener(new x55(j95Var, (byte) 10));
        t65Var.a(kmcVar4);
        t65Var.a(kmcVar2);
        kmc kmcVar5 = new kmc(launchActivity, 50.0f);
        j95Var.t1 = kmcVar5;
        kmcVar5.setTextSize(12);
        kmcVar5.c(R.drawable.calls_decline, -1, aob.u0(aob.uh), 0.3f, false, ob6.L0(2131743016), false, false);
        final byte b3 = 1;
        kmcVar5.setOnClickListener(new View.OnClickListener(j95Var) { // from class: d65
            public final /* synthetic */ j95 b;

            {
                this.b = j95Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                LaunchActivity launchActivity3 = launchActivity;
                j95 j95Var2 = this.b;
                switch (b4) {
                    case 0:
                        LaunchActivity launchActivity4 = j95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            j95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, jn7.o1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                j95Var2.M1(true, false);
                                j95Var2.L1(false);
                                j95Var2.T2.B();
                                j95Var2.E0(true);
                                j95Var2.o1.requestLayout();
                                break;
                            } else {
                                j95Var2.c2[0].d(1, false);
                                if (j95Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    c85 c85Var = new c85(j95Var2, launchActivity3, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    j95Var2.t2 = c85Var;
                                    c85Var.setBottomPadding(j95Var2.b.getPaddingBottom());
                                    j95Var2.c.addView(j95Var2.t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        g75 g75Var = j95Var2.T3;
                        zz3 zz3Var = g75Var.i0;
                        if (g75Var.h0) {
                            hl.r(zz3Var);
                        }
                        hl.d3(zz3Var, 3000L);
                        g75Var.h0 = true;
                        vc2 vc2Var2 = j95Var2.T2;
                        if (vc2Var2 != null && !vc2Var2.k()) {
                            j95Var2.F1();
                            j95.m1(launchActivity3, new z55(j95Var2, (byte) 5), false, false);
                            break;
                        } else {
                            j95Var2.dismiss();
                            break;
                        }
                }
            }
        });
        kmc kmcVar6 = new kmc(launchActivity, 50.0f);
        j95Var.u1 = kmcVar6;
        kmcVar6.setCheckable(true);
        kmcVar6.b(true, false);
        kmcVar6.setTextSize(12);
        kmcVar6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, ob6.L0(2131742946), false, false);
        u65 u65Var = new u65(j95Var, launchActivity);
        j95Var.w1 = u65Var;
        u65Var.setAnimation(b29Var);
        u65Var.setScaleType(ImageView.ScaleType.CENTER);
        kmc kmcVar7 = new kmc(launchActivity, 50.0f);
        j95Var.v1 = kmcVar7;
        kmcVar7.setDrawBackground(false);
        kmcVar7.setTextSize(12);
        kmcVar7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        kmcVar7.addView(u65Var, tre.e(50, 50, 49));
        t65Var.a(kmcVar7);
        kmcVar7.setOnClickListener(new w65(j95Var));
        t65Var.a(kmcVar6);
        t65Var.a(kmcVar5);
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        j95Var.X1 = radialProgressView;
        radialProgressView.setSize(hl.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(aob.u0(aob.Fh));
        e85Var.setAlpha(0.0f);
        e85Var.getBackButton().setScaleX(0.9f);
        e85Var.getBackButton().setScaleY(0.9f);
        e85Var.getBackButton().setTranslationX(-hl.L(14.0f));
        e85Var.getTitleTextView().setTranslationY(hl.L(23.0f));
        e85Var.getSubtitleTextView().setTranslationY(hl.L(20.0f));
        e85Var.getAdditionalSubtitleTextView().setTranslationY(hl.L(20.0f));
        s7 s7Var = new s7(launchActivity, (s6) null, aob.u0(i));
        j95Var.b3 = s7Var;
        s7Var.setLongClickEnabled(false);
        s7Var.setIcon(R.drawable.ic_ab_other);
        s7Var.setContentDescription(ob6.L0(2131754834));
        s7Var.setSubMenuOpenSide(2);
        s7Var.setDelegate(new a65(j95Var, (byte) 5));
        int i7 = aob.Zg;
        yob.Q(s7Var, aob.e0(aob.u0(i7), 6), null, yob.M(i7));
        s7Var.setOnClickListener(new x55(j95Var, (byte) 11));
        s7Var.O(aob.u0(i), false);
        s7Var.O(aob.u0(i), true);
        s7 s7Var2 = new s7(launchActivity, (s6) null, aob.u0(i));
        j95Var.c3 = s7Var2;
        s7Var2.setLongClickEnabled(false);
        s7Var2.setIcon(R.drawable.msg_voice_pip);
        s7Var2.setContentDescription(ob6.L0(2131754803));
        yob.Q(s7Var2, aob.e0(aob.u0(i7), 6), null, yob.M(i7));
        s7Var2.setOnClickListener(new x55(j95Var, (byte) 12));
        s7 s7Var3 = new s7(launchActivity, (s6) null, aob.u0(i));
        j95Var.d3 = s7Var3;
        s7Var3.setLongClickEnabled(false);
        s7Var3.setIcon(R.drawable.msg_screencast);
        s7Var3.setContentDescription(ob6.L0(2131754803));
        yob.Q(s7Var3, aob.e0(aob.u0(i7), 6), null, yob.M(i7));
        s7Var3.setOnClickListener(new x55(j95Var, b));
        x65 x65Var = new x65(j95Var, launchActivity, launchActivity);
        j95Var.X2 = x65Var;
        z65 z65Var = new z65(launchActivity);
        j95Var.G1 = z65Var;
        z65Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        j95Var.Z2 = paint2;
        paint2.setColor(-12761513);
        a75 a75Var = new a75(j95Var, j95Var.getContext());
        j95Var.Y2 = a75Var;
        yob.X(a75Var, i, j95Var.J0);
        a75Var.setTextSize(1, 11.0f);
        a75Var.setText(ob6.L0(2131743126));
        a75Var.setMaxLines(1);
        a75Var.setGravity(17);
        a75Var.setTypeface(hl.o());
        a75Var.setPadding(hl.L(8.0f), hl.L(0.0f), hl.L(8.0f), hl.L(0.0f));
        if (!j95Var.j1()) {
            a75Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(j95Var.getContext());
        j95Var.a3 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(x65Var, tre.l(1.0f, 0, -2));
        linearLayout.addView(a75Var, tre.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        j95Var.b.addView(z65Var, tre.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        j95Var.b.addView(linearLayout, tre.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        j95Var.b.addView(e85Var, tre.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        j95Var.u3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(s7Var3, tre.o(48, 48));
        linearLayout2.addView(s7Var2, tre.o(48, 48));
        linearLayout2.addView(s7Var, tre.o(48, 48));
        j95Var.b.addView(linearLayout2, tre.e(-2, 48, 53));
        View view = new View(launchActivity);
        j95Var.Z1 = view;
        view.setAlpha(0.0f);
        yob.h(aob.V5, null, view);
        j95Var.b.addView(view, tre.c(1.0f, -1));
        for (int i8 = 0; i8 < 2; i8++) {
            j95Var.c2[i8] = new b75(j95Var, launchActivity);
            j95Var.c2[i8].setAdditionalTranslationY(hl.L(10.0f));
            j95Var.c2[i8].setTranslationZ(hl.L(5.0f));
            j95Var.b.addView(j95Var.c2[i8], tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        l5 l5Var = new l5(launchActivity, true);
        j95Var.d2 = l5Var;
        l5Var.setTag(R.id.fit_width_tag, Integer.valueOf(jn7.O3));
        j95Var.b3.h(l5Var, hl.L(48.0f));
        j95Var.b3.setShowSubmenuByMove(false);
        int i9 = aob.Vg;
        yob.Q(l5Var, aob.Y(aob.u0(i9), 6, 6), null, yob.M(i9));
        s7 s7Var4 = j95Var.b3;
        b8 d = s7Var4.d(1, 0, null, ob6.L0(2131743053), true, true, s7Var4.n0);
        j95Var.p3 = d;
        d.m(true, false);
        s7 s7Var5 = j95Var.b3;
        b8 d2 = s7Var5.d(2, 0, null, ob6.L0(2131743006), true, true, s7Var5.n0);
        j95Var.q3 = d2;
        d2.m(false, true);
        int i10 = aob.nh;
        d.setCheckColor(i10);
        d.d(aob.u0(i10), aob.u0(i10));
        d2.setCheckColor(i10);
        d2.d(aob.u0(i10), aob.u0(i10));
        Paint paint3 = new Paint(1);
        paint3.setColor(aob.u0(aob.Yg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(hl.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        b8 f = j95Var.b3.f(null, ob6.L0(2131743051), 10, true, R.drawable.msg_voice_speaker);
        j95Var.g3 = f;
        f.setItemHeight(56);
        b8 f2 = j95Var.b3.f(null, ob6.L0(2131742934), 11, true, R.drawable.msg_noise_on);
        j95Var.h3 = f2;
        f2.setItemHeight(56);
        v86 v86Var = new v86(u86.a());
        j95Var.j3 = v86Var;
        b8 f3 = j95Var.b3.f(v86Var, ob6.L0(2131744966), 14, false, 0);
        j95Var.i3 = f3;
        f3.setItemHeight(56);
        f3.setRightIcon(R.drawable.msg_settings);
        f3.setSubtext(ob6.L0(u86.a() ? 2131744964 : 2131744965));
        f3.getRightIcon().setBackground(aob.e0(aob.u0(i9), 1));
        int i11 = (ob6.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f3.getRightIcon();
        boolean z2 = ob6.a0;
        rightIcon.setLayoutParams(tre.d(40, 40.0f, i11, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(vm2.f(0.3f, aob.u0(aob.Xg), -16777216));
        boolean z3 = ob6.a0;
        FrameLayout.LayoutParams d3 = tre.d(-1, 28.0f, i11, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d3.width = 1;
        view2.setLayoutParams(d3);
        f3.addView(view2);
        View[] viewArr = {f3.getTextView(), f3.getSubtextView()};
        for (int i12 = 0; i12 < 2; i12++) {
            View view3 = viewArr[i12];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = ob6.a0 ? hl.L(60.0f) : 0;
                layoutParams.rightMargin = ob6.a0 ? 0 : hl.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        j95Var.i3.getRightIcon().setContentDescription(ob6.L0(2131744940));
        j95Var.i3.getRightIcon().setOnClickListener(new x55(j95Var, (byte) 1));
        TextView b4 = j95Var.b3.b(vm2.f(0.3f, aob.u0(aob.Xg), -16777216));
        j95Var.v3 = b4;
        ((ViewGroup.MarginLayoutParams) b4.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b4.getLayoutParams()).bottomMargin = 0;
        b8 f4 = j95Var.b3.f(j95Var.W2, ob6.L0(xc2.W(j95Var.S2) ? 2131743137 : 2131743036), 6, true, R.drawable.msg_edit);
        j95Var.f3 = f4;
        b8 f5 = j95Var.b3.f(j95Var.W2, ob6.L0(2131743037), 7, false, R.drawable.msg_permissions);
        j95Var.m3 = f5;
        b8 e = j95Var.b3.e(3, R.drawable.msg_link, ob6.L0(2131742989));
        j95Var.e3 = e;
        f95 f95Var = new f95();
        j95Var.W2 = f95Var;
        b8 e2 = j95Var.b3.e(9, R.drawable.msg_screencast, ob6.L0(2131743088));
        j95Var.o3 = e2;
        b8 f6 = j95Var.b3.f(f95Var, ob6.L0(2131743000), 5, true, 0);
        j95Var.n3 = f6;
        f95Var.g = f6.getImageView();
        b8 e3 = j95Var.b3.e(12, R.drawable.menu_stream_comments_24, ob6.L0(2131743136));
        j95Var.s3 = e3;
        b8 e4 = j95Var.b3.e(13, R.drawable._menu_stream_comments_off_24, ob6.L0(2131743138));
        j95Var.t3 = e4;
        b8 e5 = j95Var.b3.e(4, R.drawable.msg_cancel, ob6.L0(j95Var.h1() ? 2131743031 : xc2.W(j95Var.S2) ? 2131743133 : 2131743032));
        j95Var.r3 = e5;
        j95Var.b3.setPopupItemsSelectorColor(aob.u0(aob.Vg));
        j95Var.b3.getPopupLayout().setFitItems(true);
        int i13 = aob.Yg;
        e3.d(aob.u0(i13), aob.u0(i13));
        e4.d(aob.u0(i13), aob.u0(i13));
        j95Var.g3.d(aob.u0(i13), aob.u0(i13));
        j95Var.h3.d(aob.u0(i13), aob.u0(i13));
        A1(j95Var.i3, aob.u0(i13));
        int i14 = aob.mh;
        e5.d(aob.u0(i14), aob.u0(i14));
        e.d(aob.u0(i13), aob.u0(i13));
        f4.d(aob.u0(i13), aob.u0(i13));
        f5.d(aob.u0(i13), aob.u0(i13));
        f6.d(aob.u0(i13), aob.u0(i13));
        e2.d(aob.u0(i13), aob.u0(i13));
        if (j95Var.T2 != null) {
            j95Var.e1();
        }
        if (j95Var.h1()) {
            j95Var.i2 = new qc();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            j95Var.i2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        j95Var.O1(false);
        j95Var.H1.getTitleTextView().setOnClickListener(new x55(j95Var, (byte) 2));
        c75 c75Var = new c75(j95Var, launchActivity);
        j95Var.e4 = c75Var;
        d75 d75Var = new d75(j95Var);
        j95Var.D4 = d75Var;
        final byte b5 = 0;
        c75Var.setClipToPadding(false);
        d75Var.C = false;
        d75Var.o = k43.f;
        d75Var.d = (short) 350;
        d75Var.c = (short) 350;
        d75Var.e = (short) 350;
        c75Var.setItemAnimator(d75Var);
        c75Var.setOnScrollListener(new e75(j95Var));
        c75Var.setClipChildren(false);
        x46 x46Var = new x46();
        x46Var.i1(0);
        c75Var.setLayoutManager(x46Var);
        p95 p95Var = new p95(vc2Var, j95Var.a, j95Var);
        j95Var.h4 = p95Var;
        c75Var.setAdapter(p95Var);
        p95Var.F(c75Var, false);
        c75Var.setOnItemClickListener(new r69(j95Var) { // from class: y55
            public final /* synthetic */ j95 b;

            {
                this.b = j95Var;
            }

            @Override // r69
            public final void e(int i62, View view4) {
                byte b32 = b5;
                j95 j95Var2 = this.b;
                switch (b32) {
                    case 0:
                        o95 o95Var = (o95) view4;
                        if (o95Var.getVideoParticipant() != null) {
                            j95Var2.W0(o95Var.getVideoParticipant());
                            break;
                        } else {
                            j95Var2.W0(new wc2(o95Var.getParticipant(), false));
                            break;
                        }
                    default:
                        q95 q95Var = (q95) view4;
                        if (q95Var.getParticipant() != null) {
                            j95Var2.W0(q95Var.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        c75Var.setOnItemLongClickListener(new a65(j95Var, b5));
        c75Var.setVisibility(8);
        c75Var.i(new f75());
        g75 g75Var = new g75(j95Var, launchActivity, j95Var.J1, c75Var, j95Var.R3, j95Var.T2, this);
        j95Var.T3 = g75Var;
        g75Var.setClipChildren(false);
        p95Var.E(j95Var.R3, g75Var);
        if (j95Var.f4 != null) {
            j95Var.g4.G(j95Var.R3, g75Var);
        }
        h75 h75Var = new h75(j95Var, launchActivity);
        j95Var.t4 = h75Var;
        i75 i75Var = new i75(j95Var, launchActivity, j95Var.H1, j95Var.J1, h75Var);
        j95Var.l1 = i75Var;
        i75Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        i75Var.setInvalidateWithParent(true);
        h75Var.setProfileGalleryView(i75Var);
        k75 k75Var = new k75(j95Var, launchActivity);
        j95Var.s4 = k75Var;
        k75Var.setVisibility(8);
        i75Var.setVisibility(0);
        i75Var.b(new l75(j95Var));
        m75 m75Var = new m75(j95Var, launchActivity);
        j95Var.U3 = m75Var;
        j95Var.b.addView(g75Var);
        g75Var.addView(c75Var, tre.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        j95Var.o1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        j95Var.z4 = view4;
        int[] iArr = j95Var.C4;
        iArr[0] = j95Var.O3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, j95Var.C4);
        j95Var.B4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        j95Var.b.addView(view4, tre.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        j95Var.A4 = view5;
        view5.setBackgroundColor(j95Var.C4[0]);
        j95Var.b.addView(view5, tre.e(-1, 0, 83));
        da5 da5Var = new da5(launchActivity);
        j95Var.V1 = da5Var;
        da5Var.setDelegate(new n75(j95Var));
        da5Var.setClickCellDelegate(new o75(j95Var));
        vc2 vc2Var2 = j95Var.T2;
        if (vc2Var2 != null) {
            da5Var.F0(j95Var.n1.a, vc2Var2.h(false));
        }
        j95Var.b.addView(da5Var, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        x86 x86Var = new x86(launchActivity);
        j95Var.k3 = x86Var;
        x86Var.setOnContentHeightChanged(new z55(j95Var, (byte) 1));
        j95Var.b.addView(x86Var, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        j95Var.l3 = new u86(new p75(j95Var));
        in inVar = new in(launchActivity, false, true, true);
        j95Var.F1 = inVar;
        inVar.setGravity(17);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTextColor(-1);
        inVar.b(0.4f, 320L, k43.h);
        inVar.setTypeface(hl.o());
        j95Var.b.addView(j95Var.o1);
        q75 q75Var = new q75(j95Var, launchActivity, j95Var.E1, LaunchActivity.Q(), j95Var.J0);
        j95Var.A1 = q75Var;
        q75Var.K = true;
        q75Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(j95Var.W1)});
        q75Var.getEditText().setLinkTextColor(-11683585);
        q75Var.setHint(ob6.L0(2131743583));
        q75Var.getEditText().addTextChangedListener(new r75(j95Var));
        q75Var.s();
        s75 s75Var = new s75(j95Var, launchActivity);
        j95Var.z1 = s75Var;
        j95Var.b.addView(s75Var, tre.c(-1.0f, -1));
        t75 t75Var = new t75(launchActivity);
        j95Var.y1 = t75Var;
        t75Var.addView(q75Var, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        t75Var.addView(inVar, tre.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        inVar.setTranslationY(-hl.L(20.0f));
        j95Var.b.addView(t75Var, tre.e(-1, -2, 80));
        ImageView imageView2 = new ImageView(launchActivity);
        j95Var.C1 = imageView2;
        int i15 = aob.i6;
        yob.R(imageView2, aob.f0(j95Var.T(i15), 1, -1), null, yob.M(i15), j95Var.J0);
        int i16 = aob.f7;
        vnb vnbVar = j95Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView2, i16, vnbVar, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.arrow_more);
        imageView2.setOnClickListener(new x55(j95Var, (byte) 3));
        ImageView imageView3 = new ImageView(launchActivity);
        j95Var.B1 = imageView3;
        yob.R(imageView3, aob.f0(j95Var.T(i15), 1, -1), null, yob.M(i15), j95Var.J0);
        yob.s(imageView3, aob.v6, j95Var.J0, mode);
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_send);
        imageView3.setOnClickListener(new x55(j95Var, (byte) 4));
        t75Var.addView(imageView2, tre.e(48, 48, 85));
        t75Var.addView(imageView3, tre.e(48, 48, 85));
        j95Var.b.addView(m75Var);
        k75Var.addView(i75Var, tre.c(-1.0f, -1));
        k75Var.addView(h75Var, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        j95Var.b.addView(k75Var, tre.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        j95Var.E0(false);
        j95Var.I1.f();
        if (v5) {
            j95Var.g4.I(j95Var.f4, false);
        }
        j95Var.C2 = j95Var.I1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            j95Var.L1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (xc2.T(j95Var.S2) && (chat2 = j95Var.S2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            j95Var.b.addView(textView, tre.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            hq7 hq7Var = new hq7(launchActivity);
            hq7Var.setTextColor(-1);
            hq7Var.setSelectorColor(-9598483);
            hq7Var.setTextOffset(hl.L(10.0f));
            hq7Var.setItemCount(5);
            v75 v75Var = new v75(launchActivity);
            v75Var.setItemCount(5);
            v75Var.setTextColor(-1);
            v75Var.setSelectorColor(-9598483);
            v75Var.setTextOffset(-hl.L(10.0f));
            w75 w75Var = new w75(launchActivity);
            w75Var.setItemCount(5);
            w75Var.setTextColor(-1);
            w75Var.setSelectorColor(-9598483);
            w75Var.setTextOffset(-hl.L(34.0f));
            x75 x75Var = new x75(launchActivity);
            j95Var.M1 = x75Var;
            x75Var.setLines(1);
            x75Var.setSingleLine(true);
            x75Var.setEllipsize(TextUtils.TruncateAt.END);
            x75Var.setGravity(17);
            x75Var.setTextColor(-1);
            x75Var.setTypeface(hl.o());
            x75Var.setTextSize(1, 14.0f);
            j95Var.b.addView(x75Var, tre.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            x75Var.setOnClickListener(new b65(j95Var, hq7Var, v75Var, w75Var, chat, k5Var, inputPeer2, (byte) 0));
            z75 z75Var = new z75(launchActivity2, hq7Var, v75Var, w75Var);
            j95Var.K1 = z75Var;
            z75Var.setWeightSum(1.0f);
            z75Var.setOrientation(0);
            j95Var.b.addView(z75Var, tre.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            int i18 = calendar.get(6);
            z75Var.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
            hq7Var.setMinValue(0);
            hq7Var.setMaxValue(365);
            hq7Var.setWrapSelectorWheel(false);
            hq7Var.setFormatter(new pm0(currentTimeMillis, calendar, i17, (byte) 1));
            pt ptVar = new pt((Object) this, (Object) hq7Var, (Object) v75Var, (Object) w75Var, (byte) 12);
            hq7Var.setOnValueChangedListener(ptVar);
            v75Var.setMinValue(0);
            v75Var.setMaxValue(23);
            z75Var.addView(v75Var, tre.l(0.2f, 0, jn7.s4));
            v75Var.setFormatter(new xi4((byte) 20));
            v75Var.setOnValueChangedListener(ptVar);
            w75Var.setMinValue(0);
            w75Var.setMaxValue(59);
            w75Var.setValue(0);
            w75Var.setFormatter(new xi4((byte) 21));
            z75Var.addView(w75Var, tre.l(0.3f, 0, jn7.s4));
            w75Var.setOnValueChangedListener(ptVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i19 = calendar.get(6);
            int i20 = calendar.get(12);
            int i21 = calendar.get(11);
            hq7Var.setValue(i18 != i19 ? 1 : 0);
            w75Var.setValue(i20);
            v75Var.setValue(i21);
            j95Var = this;
            jj.g(x75Var, textView, 0L, 604800L, 2, hq7Var, v75Var, w75Var);
        } else {
            launchActivity2 = launchActivity;
        }
        a85 a85Var = new a85(j95Var, (ViewGroup) j95Var.getWindow().getDecorView(), j95Var.b);
        j95Var.V3 = a85Var;
        a85Var.E = new b85(j95Var);
        i75Var.setPinchToZoomHelper(a85Var);
        final byte b6 = 0;
        j95Var.r1.setOnClickListener(new View.OnClickListener(j95Var) { // from class: d65
            public final /* synthetic */ j95 b;

            {
                this.b = j95Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                byte b42 = b6;
                LaunchActivity launchActivity3 = launchActivity2;
                j95 j95Var2 = this.b;
                switch (b42) {
                    case 0:
                        LaunchActivity launchActivity4 = j95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            j95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, jn7.o1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                j95Var2.M1(true, false);
                                j95Var2.L1(false);
                                j95Var2.T2.B();
                                j95Var2.E0(true);
                                j95Var2.o1.requestLayout();
                                break;
                            } else {
                                j95Var2.c2[0].d(1, false);
                                if (j95Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    c85 c85Var = new c85(j95Var2, launchActivity3, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    j95Var2.t2 = c85Var;
                                    c85Var.setBottomPadding(j95Var2.b.getPaddingBottom());
                                    j95Var2.c.addView(j95Var2.t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        g75 g75Var2 = j95Var2.T3;
                        zz3 zz3Var = g75Var2.i0;
                        if (g75Var2.h0) {
                            hl.r(zz3Var);
                        }
                        hl.d3(zz3Var, 3000L);
                        g75Var2.h0 = true;
                        vc2 vc2Var22 = j95Var2.T2;
                        if (vc2Var22 != null && !vc2Var22.k()) {
                            j95Var2.F1();
                            j95.m1(launchActivity3, new z55(j95Var2, (byte) 5), false, false);
                            break;
                        } else {
                            j95Var2.dismiss();
                            break;
                        }
                }
            }
        });
        j95Var.K1(false);
        j95Var.F1();
        j95Var.L1(false);
        j95Var.M1(false, false);
        j95Var.v1(0.0f);
        j95Var.N1();
        j95Var.b.addView(new FrameLayout(launchActivity2), tre.e(-1, jn7.d3, 87));
        j95Var.u1.setOnClickListener(new x55(j95Var, (byte) 5));
        j95Var.K0();
        iye.a(j95Var.r1);
        iye.a(j95Var.s1);
        iye.a(j95Var.p1);
        iye.a(j95Var.q1);
        iye.a(j95Var.v1);
        iye.a(j95Var.t1);
        iye.a(j95Var.u1);
        ViewGroup viewGroup2 = j95Var.b;
        a65 a65Var = new a65(j95Var, (byte) 1);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(viewGroup2, a65Var);
    }

    public static void A1(b8 b8Var, int i) {
        if (b8Var != null) {
            b8Var.d(i, i);
            if (b8Var.getRightIcon() != null) {
                b8Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static void T0(LaunchActivity launchActivity, k5 k5Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        LaunchActivity launchActivity2;
        j95 j95Var;
        TLRPC.GroupCall groupCall;
        vc2 vc2Var;
        if (s5 == null && er9.Q0 == null) {
            if (inputPeer != null) {
                vc2 g1 = uc7.s1(k5Var.a).g1(chat.id, false, null);
                if (g1 != null && (groupCall = g1.b) != null && groupCall.rtmp_stream && !g1.k()) {
                    return;
                }
                launchActivity2 = launchActivity;
                j95 j95Var2 = new j95(launchActivity2, k5Var, g1, chat, inputPeer, z, str);
                s5 = j95Var2;
                j95Var = j95Var2;
            } else {
                if (VoIPService.getSharedInstance() == null || (vc2Var = VoIPService.getSharedInstance().groupCall) == null) {
                    return;
                }
                TLRPC.GroupCall groupCall2 = vc2Var.b;
                if (groupCall2 != null && groupCall2.rtmp_stream && !vc2Var.k()) {
                    if (er9.Q0 != null || launchActivity == null) {
                        return;
                    }
                    er9 er9Var = new er9(launchActivity, k5Var, vc2Var, uc7.s1(k5Var.a).M0(Long.valueOf(vc2Var.c)));
                    er9.Q0 = er9Var;
                    er9Var.show();
                    return;
                }
                TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(vc2Var.c));
                vc2Var.b(true);
                j95Var = new j95(launchActivity, k5Var, vc2Var, M0, null, z, str);
                s5 = j95Var;
                launchActivity2 = launchActivity;
            }
            j95Var.b2 = launchActivity2;
            hl.c3(new jm3((byte) 12));
        }
    }

    public static String X0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 0) {
            return ob6.M0(2131743151, null);
        }
        if (i == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? ob6.M0(2131743152, null) : ob6.M0(2131743153, null);
        }
        if (i != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? ob6.M0(2131743155, null) : str;
    }

    public static String Y0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? ob6.M0(2131743150, null) : ob6.a0(null, null, 2131743149, str) : i == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? ob6.M0(2131743147, null) : ob6.M0(2131743148, null) : ob6.M0(2131743146, null);
    }

    public static String c1() {
        return jx3.i[(int) Math.floor(Math.random() * 8.0d)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static boolean i1(int i) {
        return i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    public static void m1(Context context, Runnable runnable, boolean z, boolean z2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            vc2 vc2Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (z2 || !xc2.w(14, chat)) {
                r1(vc2Var, false, selfId, runnable);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
            boolean isConference = sharedInstance.isConference();
            id idVar = alertDialog$Builder.a;
            if (isConference) {
                idVar.S = ob6.M0(2131743120, null);
                idVar.U = ob6.M0(2131743121, null);
            } else if (xc2.W(chat)) {
                idVar.S = ob6.M0(2131743123, null);
                idVar.U = ob6.M0(2131743124, null);
            } else {
                idVar.S = ob6.M0(2131743013, null);
                idVar.U = ob6.M0(2131743014, null);
            }
            sharedInstance.getAccount();
            sg2[] sg2VarArr = new sg2[1];
            LinearLayout j = uh9.j(context, 1);
            if (!sharedInstance.isConference() || (vc2Var != null && (groupCall = vc2Var.b) != null && groupCall.creator)) {
                sg2 sg2Var = new sg2(context, 1);
                sg2VarArr[0] = sg2Var;
                sg2Var.setBackground(aob.L0(false));
                if (z) {
                    sg2VarArr[0].setTextColor(aob.w0(null, aob.j5, false));
                } else {
                    sg2VarArr[0].setTextColor(aob.w0(null, aob.Yg, false));
                    CheckBoxSquare checkBoxSquare = (CheckBoxSquare) sg2VarArr[0].getCheckBoxView();
                    int i = aob.ih;
                    int i2 = aob.gh;
                    int i3 = aob.eh;
                    checkBoxSquare.s = i;
                    checkBoxSquare.w = i2;
                    checkBoxSquare.x = i3;
                    checkBoxSquare.invalidate();
                }
                sg2VarArr[0].setTag(0);
                if (sharedInstance.isConference()) {
                    sg2VarArr[0].e(ob6.M0(2131743122, null), "", false, false, false);
                } else if (xc2.W(chat)) {
                    sg2VarArr[0].e(ob6.M0(2131743125, null), "", false, false, false);
                } else {
                    sg2VarArr[0].e(ob6.M0(2131743015, null), "", false, false, false);
                }
                sg2VarArr[0].setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                j.addView(sg2VarArr[0], tre.o(-1, -2));
                sg2VarArr[0].setOnClickListener(new je(sg2VarArr, (byte) 2));
            }
            alertDialog$Builder.n(j);
            idVar.J = aob.gh;
            alertDialog$Builder.j(ob6.M0(2131743016, null), new jn1((Object) vc2Var, (Object) sg2VarArr, selfId, (Object) runnable, (byte) 4));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            if (z) {
                idVar.Q0 = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    idVar.getWindow().setType(2038);
                } else {
                    idVar.getWindow().setType(2003);
                }
                idVar.getWindow().clearFlags(2);
            }
            if (!z) {
                idVar.j(aob.w0(null, aob.lh, false));
            }
            idVar.show();
            if (z) {
                return;
            }
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.mh, null);
            }
            idVar.o(aob.w0(null, aob.Yg, false));
        }
    }

    public static void r1(vc2 vc2Var, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (vc2Var != null) {
            ArrayList arrayList = vc2Var.f;
            ArrayList arrayList2 = vc2Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(j);
            if (groupCallParticipant != null) {
                vc2Var.d.e(j);
                arrayList2.remove(groupCallParticipant);
                vc2Var.g.remove(groupCallParticipant);
                int i = 0;
                while (i < arrayList.size()) {
                    if (r47.B1(((wc2) arrayList.get(i)).a.peer) == r47.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = vc2Var.b;
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
        jn7.e().k(jn7.v2, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x049e, code lost:
    
        if (xc2.w(2, r35.S2) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02fa, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0313, code lost:
    
        if (r12 == (-a1())) goto L101;
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
    public final boolean B1(View view) {
        zb5 zb5Var;
        h95 h95Var;
        Integer num;
        Integer num2;
        ViewGroup viewGroup;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num3;
        boolean z;
        int i;
        TLRPC.GroupCall groupCall;
        long j;
        jn5 m;
        jn5 m2;
        boolean z2;
        v85 v85Var;
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
                U0(true);
                return false;
            }
            o85 o85Var = this.U4;
            if (o85Var != null) {
                o85Var.dismiss();
                this.U4 = null;
                return false;
            }
            S0();
            if (view instanceof q95) {
                q95 q95Var = (q95) view;
                if (q95Var.getParticipant() != this.T2.z) {
                    zb5Var = new zb5(q95Var.getContext());
                    zb5Var.e(this.n1, q95Var.getParticipant().a, this.T2, r47.B1(this.u2), null, false);
                    ul ulVar = zb5Var.s;
                    if (ulVar != null) {
                        ulVar.f();
                    }
                    this.Q4 = false;
                    this.N4 = q95Var;
                    this.O4 = q95Var.getRenderer();
                    if (!v5 && !u5) {
                        this.b.addView(zb5Var, tre.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (zb5Var != null) {
                        boolean z4 = (u5 || v5 || hl.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = zb5Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new pp1(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new a65(this, b));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.u4 = linearLayout;
                            n85 n85Var = new n85(getContext(), linearLayout, linearLayout2);
                            n85Var.setMinimumWidth(hl.L(240.0f));
                            n85Var.setOrientation(1);
                            boolean z5 = z4;
                            int R0 = hl.R0(this.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, aob.kh, false));
                            if (linearLayout2 == null || zb5Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                h95Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                n85Var.addView(linearLayout2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                h95Var = new h95(this, getContext(), participant);
                                linearLayout2.addView(h95Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(hl.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            n85Var.addView(linearLayout, tre.k(0.0f, h95Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            yc ycVar = new yc(getContext(), n85Var);
                            ycVar.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(ycVar, tre.c(-2.0f, -2));
                            long B1 = r47.B1(participant.peer);
                            h95 h95Var2 = h95Var;
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z6 = participant.peer instanceof TLRPC.TL_peerUser;
                            k5 k5Var = this.n1;
                            if (!z6) {
                                num = 6;
                                num2 = 8;
                                viewGroup = linearLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num3 = valueOf2;
                            } else if (xc2.T(this.S2)) {
                                uc7 s1 = uc7.s1(k5Var.a);
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                num = 6;
                                num2 = 8;
                                long j2 = participant.peer.user_id;
                                num3 = valueOf2;
                                viewGroup = linearLayout;
                                zh6 zh6Var = (zh6) s1.q1.f(a1());
                                TLRPC.ChannelParticipant channelParticipant = zh6Var == null ? null : (TLRPC.ChannelParticipant) zh6Var.f(j2);
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
                                TLRPC.ChatFull N0 = uc7.s1(k5Var.a).N0(a1());
                                if (N0 != null && (chatParticipants = N0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i5);
                                        TLRPC.ChatFull chatFull = N0;
                                        int i6 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i5++;
                                            N0 = chatFull;
                                            size = i6;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z = false;
                            }
                            if (zb5Var.c()) {
                                if (h1() && zb5Var.L) {
                                    str = null;
                                    c00.s(null, 2131743046, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(ob6.M0(zb5Var.b.getImageReceiver().E() ? 2131743157 : 2131742894, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                String str4 = participant.about;
                                if (B1 > 0) {
                                    if (TextUtils.isEmpty(str4)) {
                                        i4 = 2131743159;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i4 = 2131743069;
                                    }
                                    arrayList.add(ob6.M0(i4, str3));
                                } else {
                                    arrayList.add(ob6.M0(TextUtils.isEmpty(str4) ? 2131743158 : 2131743068, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (B1 > 0) {
                                    i3 = 2131743067;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i3 = 2131743066;
                                }
                                arrayList.add(ob6.M0(i3, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (H0()) {
                                if (!h1() && z && participant.muted) {
                                    if (h1() && participant.muted_by_you) {
                                        c00.t(null, 2131742970, arrayList, arrayList2, valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    c00.t(null, 2131743011, arrayList, arrayList2, num3);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(ob6.M0(2131743052, null));
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
                                    if (j3 != 0 && !xc2.m0(this.a, j3)) {
                                        c00.s(null, 2131743005, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num2);
                                        if (h1()) {
                                            i = z ? 2 : 2;
                                        } else {
                                            vc2 vc2Var = this.T2;
                                            if (vc2Var != null && (groupCall = vc2Var.b) != null && groupCall.creator) {
                                                c00.s(null, 2131742963, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i));
                                            }
                                        }
                                    }
                                }
                                c00.s(null, 2131743003, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num);
                                if (h1()) {
                                }
                            } else {
                                Integer num4 = num;
                                Integer num5 = num2;
                                if (participant.muted_by_you) {
                                    c00.t(null, 2131742970, arrayList, arrayList2, valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    c00.t(null, 2131743010, arrayList, arrayList2, num3);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j4 = peer2.channel_id;
                                    if (j4 != 0 && !xc2.m0(this.a, j4)) {
                                        c00.t(null, 2131743005, arrayList, arrayList2, valueOf);
                                        arrayList3.add(num5);
                                    }
                                }
                                c00.t(null, 2131743004, arrayList, arrayList2, valueOf);
                                arrayList3.add(num4);
                            }
                            int size2 = arrayList.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                b8 b8Var = new b8(getContext(), i7 == 0, i7 == size2 + (-1));
                                if (((Integer) arrayList3.get(i7)).intValue() != 2) {
                                    int i8 = aob.Yg;
                                    z3 = false;
                                    r5 = 0;
                                    b8Var.d(aob.w0(null, i8, false), aob.w0(null, i8, false));
                                } else {
                                    z3 = false;
                                    r5 = 0;
                                    int i9 = aob.mh;
                                    b8Var.d(aob.w0(null, i9, false), aob.w0(null, i9, false));
                                }
                                b8Var.setSelectorColor(aob.w0(r5, aob.Vg, z3));
                                b8Var.j((CharSequence) arrayList.get(i7), ((Integer) arrayList2.get(i7)).intValue(), r5);
                                viewGroup.addView(b8Var);
                                b8Var.setTag(arrayList3.get(i7));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                b8Var.setOnClickListener(new jf((Object) this, i7, (Object) arrayList4, (Object) groupCallParticipant, (byte) 4));
                                i7++;
                                arrayList3 = arrayList4;
                                participant = groupCallParticipant;
                            }
                            ycVar.addView(n85Var, tre.x(-2, -2, 51));
                            t85 t85Var = this.J1;
                            t85Var.E0();
                            this.R1.X = false;
                            this.M4 = zb5Var;
                            zb5Var.setAboutVisible(true);
                            this.b.invalidate();
                            t85Var.invalidate();
                            AnimatorSet animatorSet = this.T4;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            this.X3 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            if (B1 > 0) {
                                int i10 = k5Var.a;
                                int i11 = k5Var.a;
                                TLRPC.User X1 = uc7.s1(i10).X1(Long.valueOf(B1));
                                m = jn5.m(i11, 0, X1);
                                m2 = jn5.m(i11, 1, X1);
                                j = B1;
                                if (uc7.s1(this.a).Y1(j) == null) {
                                    uc7.s1(this.a).o3(0, X1, false);
                                }
                            } else {
                                j = B1;
                                int i12 = k5Var.a;
                                int i13 = k5Var.a;
                                TLRPC.Chat M0 = uc7.s1(i12).M0(Long.valueOf(-j));
                                m = jn5.m(i13, 0, M0);
                                m2 = jn5.m(i13, 1, M0);
                            }
                            ka5 ka5Var = this.O4;
                            boolean z7 = ka5Var != null && ka5Var.w;
                            if (m != null || z7) {
                                if (z5) {
                                    de0 avatarImageView = this.M4.getAvatarImageView();
                                    i75 i75Var = this.l1;
                                    i75Var.setParentAvatarImage(avatarImageView);
                                    i75Var.setHasActiveVideo(z7);
                                    i75Var.M(j, true);
                                    i75Var.setCreateThumbFromParent(true);
                                    i75Var.H(null, m, m2, true);
                                    ka5 ka5Var2 = this.O4;
                                    if (ka5Var2 != null) {
                                        ka5Var2.h = true;
                                        ka5Var2.j(true);
                                    }
                                    if (r47.B1(this.u2) == j && this.a4 != null && (v85Var = this.b4) != null && (fileLocation = v85Var.c) != null) {
                                        i75Var.A(v85Var.d, jn5.e(fileLocation));
                                    }
                                }
                                z2 = z5;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                boolean z8 = true;
                                this.Y3 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.X3, tre.c(-2.0f, -2));
                                this.Z3 = true;
                                m75 m75Var = this.U3;
                                if (m75Var == null) {
                                    i2 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.u0 << 1)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - hl.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -hl.m);
                                    this.b2.N().getView().draw(canvas);
                                    canvas.drawColor(vm2.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -hl.m);
                                    this.v4 = true;
                                    this.b.draw(canvas);
                                    i2 = 0;
                                    this.v4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / jn7.J2));
                                    m75Var.setBackground(new BitmapDrawable(createBitmap));
                                    m75Var.setAlpha(0.0f);
                                    m75Var.setVisibility(0);
                                    m75Var.bringToFront();
                                    z8 = true;
                                }
                                this.R4 = z8;
                                this.s4.setVisibility(i2);
                                if (h95Var2 != null) {
                                    h95Var2.invalidate();
                                }
                                t1(z8, zb5Var);
                                o95 o95Var = this.P4;
                                if (o95Var != null) {
                                    o95Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return z8;
                            }
                            this.Y3 = false;
                            o85 o85Var2 = new o85(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            this.U4 = o85Var2;
                            o85Var2.e = true;
                            o85Var2.c = (short) 220;
                            o85Var2.setOutsideTouchable(true);
                            this.U4.setClippingEnabled(true);
                            this.U4.setAnimationStyle(R.style.PopupContextAnimation);
                            this.U4.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                            this.U4.setInputMethodMode(2);
                            this.U4.setSoftInputMode(0);
                            this.U4.getContentView().setFocusableInTouchMode(true);
                            o95 o95Var2 = this.P4;
                            if (o95Var2 != null) {
                                boolean z9 = u5;
                                g75 g75Var = this.T3;
                                c75 c75Var = this.e4;
                                if (z9) {
                                    x = hl.L(32.0f) + (((int) (g75Var.getX() + (c75Var.getX() + o95Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                    y = ((int) (g75Var.getY() + (c75Var.getY() + this.P4.getY()))) - hl.L(6.0f);
                                } else {
                                    int x2 = ((int) (g75Var.getX() + (c75Var.getX() + o95Var2.getX()))) - hl.L(14.0f);
                                    y = (int) ((g75Var.getY() + (c75Var.getY() + this.P4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight());
                                    x = x2;
                                }
                            } else {
                                x = (int) (((t85Var.getX() + t85Var.getMeasuredWidth()) + hl.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth());
                                if (this.Q4) {
                                    y2 = zb5Var.getY() + t85Var.getY();
                                    measuredHeight = zb5Var.getClipHeight();
                                } else if (this.N4 != null) {
                                    y2 = this.N4.getY() + t85Var.getY();
                                    measuredHeight = this.N4.getMeasuredHeight();
                                } else {
                                    y = (int) t85Var.getY();
                                }
                                y = (int) (y2 + measuredHeight);
                            }
                            this.U4.showAtLocation(t85Var, 51, x, y);
                            this.T4 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.L4, sn.b, 0, 100));
                            this.T4.playTogether(arrayList5);
                            this.T4.setDuration(150L);
                            this.T4.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof o95) {
                    o95 o95Var3 = (o95) view;
                    if (o95Var3.getParticipant() != this.T2.z.a) {
                        zb5Var = new zb5(o95Var3.getContext());
                        zb5Var.e(this.n1, o95Var3.getParticipant(), this.T2, r47.B1(this.u2), null, false);
                        ul ulVar2 = zb5Var.s;
                        if (ulVar2 != null) {
                            ulVar2.f();
                        }
                        this.Q4 = false;
                        this.P4 = o95Var3;
                        ka5 renderer = o95Var3.getRenderer();
                        this.O4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.O4 = null;
                        }
                        this.b.addView(zb5Var, tre.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    zb5Var = (zb5) view;
                    this.Q4 = true;
                }
                if (zb5Var != null) {
                }
            }
        }
        return false;
    }

    public final void C1(View view) {
        if (this.f2 == null) {
            lg5 lg5Var = new lg5(8, null, getContext(), true);
            this.f2 = lg5Var;
            lg5Var.setAlpha(0.0f);
            this.f2.setVisibility(4);
            this.f2.setShowingDuration(3000L);
            this.b.addView(this.f2, tre.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            boolean W = xc2.W(this.S2);
            lg5 lg5Var2 = this.f2;
            if (W) {
                lg5Var2.setText(ob6.M0(2131743117, null));
            } else {
                lg5Var2.setText(ob6.M0(2131742999, null));
            }
            this.f2.b();
        }
        this.f2.setExtraTranslationY(-hl.m);
        this.f2.c(view);
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final void D1() {
        vc2 vc2Var = this.T2;
        if (vc2Var == null || vc2Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        vc2 vc2Var2 = this.T2;
        togglegroupcallsettings.call = vc2Var2.h(vc2Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(this.T2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        to3 to3Var = Utilities.d;
        Objects.requireNonNull(to3Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new pe2(to3Var, (byte) 0), new h65(this, (byte) 1));
    }

    @Override // nx0
    public final boolean E() {
        return !this.T3.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0245 A[EDGE_INSN: B:119:0x0245->B:120:0x0245 BREAK  A[LOOP:2: B:94:0x0201->B:101:0x0240], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae A[LOOP:3: B:140:0x02a8->B:142:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e A[LOOP:1: B:88:0x019c->B:89:0x019e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(boolean z) {
        t85 t85Var;
        e95 e95Var;
        g75 g75Var;
        t85 t85Var2;
        boolean z2;
        int i;
        ArrayList arrayList;
        int i2;
        int size;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        t85 t85Var3;
        g75 g75Var2;
        boolean z3;
        c75 c75Var;
        ?? r0;
        ?? r8;
        vc2 vc2Var;
        boolean z4;
        wc2 wc2Var;
        wc2 wc2Var2;
        f89 H;
        kj4 kj4Var;
        j95 j95Var = this;
        e95 e95Var2 = j95Var.I1;
        g75 g75Var3 = j95Var.T3;
        if (g75Var3 == null || (t85Var = j95Var.J1) == null || j95Var.T2 == null || j95Var.l2) {
            return;
        }
        if (g75Var3.b) {
            g75Var3.setVisibleParticipant(true);
        }
        long B1 = r47.B1(j95Var.T2.J);
        if (B1 != r47.B1(j95Var.u2) && j95Var.T2.d.f(B1) != null) {
            j95Var.u2 = j95Var.T2.J;
        }
        int childCount = t85Var.getChildCount();
        int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = t85Var.getChildAt(i8);
            f89 H2 = t85Var.H(childAt);
            if (H2 != null && H2.b() != -1 && H2.c() != -1 && (view == null || childAt.getTop() < i6)) {
                i7 = H2.c();
                i6 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = j95Var.j2;
        arrayList3.clear();
        if (!v5) {
            arrayList3.addAll(j95Var.T2.f);
        } else if (g75Var3.b) {
            arrayList3.addAll(j95Var.T2.f);
            wc2 wc2Var3 = g75Var3.e;
            if (wc2Var3 != null) {
                arrayList3.remove(wc2Var3);
            }
        }
        if (t85Var.getItemAnimator() != null && !z) {
            t85Var.setItemAnimator(null);
        } else if (t85Var.getItemAnimator() == null && z) {
            t85Var.setItemAnimator(j95Var.Q1);
        }
        try {
            kj4Var = new kj4((Object) e95Var2, (byte) 6);
            try {
                try {
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    e95Var = e95Var2;
                    z2 = true;
                }
            } catch (Exception e2) {
                e = e2;
                e95Var = e95Var2;
                t85Var2 = t85Var;
                z2 = true;
                i = childCount;
                arrayList = arrayList3;
                i2 = i7;
                g75Var = g75Var3;
            }
        } catch (Exception e3) {
            e = e3;
            e95Var = e95Var2;
            g75Var = g75Var3;
            t85Var2 = t85Var;
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
                        g75Var = g75Var3;
                    } catch (Exception e4) {
                        e = e4;
                        g75Var = g75Var3;
                    }
                    try {
                        t85Var2 = t85Var;
                        try {
                            try {
                                try {
                                    try {
                                        arrayList = arrayList3;
                                        i2 = i9;
                                        i = childCount;
                                        j95Var = this;
                                        e95Var = e95Var2;
                                        try {
                                            j95Var.y1(e95Var2.L, e95Var2.x, e95Var2.d, e95Var2.e, e95Var2.f, e95Var2.h, e95Var2.n, e95Var2.r, e95Var2.s, e95Var2.w, e95Var2.H, e95Var2.I, e95Var2.J, e95Var2.K, e95Var2.y, e95Var2.E);
                                            e95Var.E();
                                            z2 = true;
                                        } catch (Exception e5) {
                                            e = e5;
                                            z2 = true;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        j95Var = this;
                                        arrayList = arrayList3;
                                        i2 = i9;
                                        z2 = true;
                                        i = childCount;
                                        e95Var = e95Var2;
                                        cc4.g(e, z2);
                                        e95Var.f();
                                        ArrayList arrayList4 = j95Var.T2.e;
                                        size = arrayList4.size();
                                        while (i3 < size) {
                                        }
                                        if (view != null) {
                                        }
                                        ArrayList arrayList5 = j95Var.x2;
                                        arrayList5.clear();
                                        arrayList5.addAll(j95Var.T2.g);
                                        ArrayList arrayList6 = j95Var.y2;
                                        arrayList6.clear();
                                        arrayList2 = arrayList;
                                        arrayList6.addAll(arrayList2);
                                        ArrayList arrayList7 = j95Var.z2;
                                        arrayList7.clear();
                                        arrayList7.addAll(j95Var.T2.j);
                                        ArrayList arrayList8 = j95Var.A2;
                                        arrayList8.clear();
                                        arrayList8.addAll(j95Var.T2.m);
                                        ArrayList arrayList9 = j95Var.B2;
                                        arrayList9.clear();
                                        arrayList9.addAll(j95Var.T2.l);
                                        e95 e95Var3 = e95Var;
                                        j95Var.C2 = e95Var3.G;
                                        i4 = i;
                                        i5 = 0;
                                        while (true) {
                                            t85Var3 = t85Var2;
                                            if (i5 < i4) {
                                            }
                                            i5++;
                                            t85Var2 = t85Var3;
                                        }
                                        boolean c = g75Var.c();
                                        g75Var2 = g75Var;
                                        if (g75Var2.b) {
                                            if (!arrayList2.isEmpty()) {
                                            }
                                            p95 p95Var = j95Var.h4;
                                            c75Var = j95Var.e4;
                                            p95Var.G(c75Var, z2);
                                            if (c75Var.getVisibility() == 0) {
                                            }
                                            if (v5) {
                                            }
                                            if (t85Var3.getVisibility() == 0) {
                                            }
                                            r0 = j95Var.S3;
                                            r0.clear();
                                            r0.addAll(j95Var.R3);
                                            while (r8 < r0.size()) {
                                            }
                                            vc2Var = j95Var.T2;
                                            if (vc2Var != null) {
                                            }
                                            vc2 vc2Var2 = j95Var.T2;
                                            if (vc2Var2 != null) {
                                            }
                                            j95Var.r5.a(z4, z);
                                            if (z4 == j95Var.y4) {
                                            }
                                        }
                                        z3 = false;
                                        p95 p95Var2 = j95Var.h4;
                                        c75Var = j95Var.e4;
                                        p95Var2.G(c75Var, z2);
                                        if (c75Var.getVisibility() == 0) {
                                        }
                                        if (v5) {
                                        }
                                        if (t85Var3.getVisibility() == 0) {
                                        }
                                        r0 = j95Var.S3;
                                        r0.clear();
                                        r0.addAll(j95Var.R3);
                                        while (r8 < r0.size()) {
                                        }
                                        vc2Var = j95Var.T2;
                                        if (vc2Var != null) {
                                        }
                                        vc2 vc2Var22 = j95Var.T2;
                                        if (vc2Var22 != null) {
                                        }
                                        j95Var.r5.a(z4, z);
                                        if (z4 == j95Var.y4) {
                                        }
                                    }
                                    try {
                                        cy7.a(j95Var.l5, true).b(kj4Var);
                                    } catch (Exception e7) {
                                        e = e7;
                                        cc4.g(e, z2);
                                        e95Var.f();
                                        ArrayList arrayList42 = j95Var.T2.e;
                                        size = arrayList42.size();
                                        while (i3 < size) {
                                        }
                                        if (view != null) {
                                        }
                                        ArrayList arrayList52 = j95Var.x2;
                                        arrayList52.clear();
                                        arrayList52.addAll(j95Var.T2.g);
                                        ArrayList arrayList62 = j95Var.y2;
                                        arrayList62.clear();
                                        arrayList2 = arrayList;
                                        arrayList62.addAll(arrayList2);
                                        ArrayList arrayList72 = j95Var.z2;
                                        arrayList72.clear();
                                        arrayList72.addAll(j95Var.T2.j);
                                        ArrayList arrayList82 = j95Var.A2;
                                        arrayList82.clear();
                                        arrayList82.addAll(j95Var.T2.m);
                                        ArrayList arrayList92 = j95Var.B2;
                                        arrayList92.clear();
                                        arrayList92.addAll(j95Var.T2.l);
                                        e95 e95Var32 = e95Var;
                                        j95Var.C2 = e95Var32.G;
                                        i4 = i;
                                        i5 = 0;
                                        while (true) {
                                            t85Var3 = t85Var2;
                                            if (i5 < i4) {
                                            }
                                            i5++;
                                            t85Var2 = t85Var3;
                                        }
                                        boolean c2 = g75Var.c();
                                        g75Var2 = g75Var;
                                        if (g75Var2.b) {
                                        }
                                        z3 = false;
                                        p95 p95Var22 = j95Var.h4;
                                        c75Var = j95Var.e4;
                                        p95Var22.G(c75Var, z2);
                                        if (c75Var.getVisibility() == 0) {
                                        }
                                        if (v5) {
                                        }
                                        if (t85Var3.getVisibility() == 0) {
                                        }
                                        r0 = j95Var.S3;
                                        r0.clear();
                                        r0.addAll(j95Var.R3);
                                        while (r8 < r0.size()) {
                                        }
                                        vc2Var = j95Var.T2;
                                        if (vc2Var != null) {
                                        }
                                        vc2 vc2Var222 = j95Var.T2;
                                        if (vc2Var222 != null) {
                                        }
                                        j95Var.r5.a(z4, z);
                                        if (z4 == j95Var.y4) {
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
                            e95Var = e95Var2;
                            cc4.g(e, z2);
                            e95Var.f();
                            ArrayList arrayList422 = j95Var.T2.e;
                            size = arrayList422.size();
                            while (i3 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList522 = j95Var.x2;
                            arrayList522.clear();
                            arrayList522.addAll(j95Var.T2.g);
                            ArrayList arrayList622 = j95Var.y2;
                            arrayList622.clear();
                            arrayList2 = arrayList;
                            arrayList622.addAll(arrayList2);
                            ArrayList arrayList722 = j95Var.z2;
                            arrayList722.clear();
                            arrayList722.addAll(j95Var.T2.j);
                            ArrayList arrayList822 = j95Var.A2;
                            arrayList822.clear();
                            arrayList822.addAll(j95Var.T2.m);
                            ArrayList arrayList922 = j95Var.B2;
                            arrayList922.clear();
                            arrayList922.addAll(j95Var.T2.l);
                            e95 e95Var322 = e95Var;
                            j95Var.C2 = e95Var322.G;
                            i4 = i;
                            i5 = 0;
                            while (true) {
                                t85Var3 = t85Var2;
                                if (i5 < i4) {
                                }
                                i5++;
                                t85Var2 = t85Var3;
                            }
                            boolean c22 = g75Var.c();
                            g75Var2 = g75Var;
                            if (g75Var2.b) {
                            }
                            z3 = false;
                            p95 p95Var222 = j95Var.h4;
                            c75Var = j95Var.e4;
                            p95Var222.G(c75Var, z2);
                            if (c75Var.getVisibility() == 0) {
                            }
                            if (v5) {
                            }
                            if (t85Var3.getVisibility() == 0) {
                            }
                            r0 = j95Var.S3;
                            r0.clear();
                            r0.addAll(j95Var.R3);
                            while (r8 < r0.size()) {
                            }
                            vc2Var = j95Var.T2;
                            if (vc2Var != null) {
                            }
                            vc2 vc2Var2222 = j95Var.T2;
                            if (vc2Var2222 != null) {
                            }
                            j95Var.r5.a(z4, z);
                            if (z4 == j95Var.y4) {
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        t85Var2 = t85Var;
                        i = childCount;
                        arrayList = arrayList3;
                        i2 = i9;
                        e95Var = e95Var2;
                        cc4.g(e, z2);
                        e95Var.f();
                        ArrayList arrayList4222 = j95Var.T2.e;
                        size = arrayList4222.size();
                        while (i3 < size) {
                        }
                        if (view != null) {
                        }
                        ArrayList arrayList5222 = j95Var.x2;
                        arrayList5222.clear();
                        arrayList5222.addAll(j95Var.T2.g);
                        ArrayList arrayList6222 = j95Var.y2;
                        arrayList6222.clear();
                        arrayList2 = arrayList;
                        arrayList6222.addAll(arrayList2);
                        ArrayList arrayList7222 = j95Var.z2;
                        arrayList7222.clear();
                        arrayList7222.addAll(j95Var.T2.j);
                        ArrayList arrayList8222 = j95Var.A2;
                        arrayList8222.clear();
                        arrayList8222.addAll(j95Var.T2.m);
                        ArrayList arrayList9222 = j95Var.B2;
                        arrayList9222.clear();
                        arrayList9222.addAll(j95Var.T2.l);
                        e95 e95Var3222 = e95Var;
                        j95Var.C2 = e95Var3222.G;
                        i4 = i;
                        i5 = 0;
                        while (true) {
                            t85Var3 = t85Var2;
                            if (i5 < i4) {
                            }
                            i5++;
                            t85Var2 = t85Var3;
                        }
                        boolean c222 = g75Var.c();
                        g75Var2 = g75Var;
                        if (g75Var2.b) {
                        }
                        z3 = false;
                        p95 p95Var2222 = j95Var.h4;
                        c75Var = j95Var.e4;
                        p95Var2222.G(c75Var, z2);
                        if (c75Var.getVisibility() == 0) {
                        }
                        if (v5) {
                        }
                        if (t85Var3.getVisibility() == 0) {
                        }
                        r0 = j95Var.S3;
                        r0.clear();
                        r0.addAll(j95Var.R3);
                        while (r8 < r0.size()) {
                        }
                        vc2Var = j95Var.T2;
                        if (vc2Var != null) {
                        }
                        vc2 vc2Var22222 = j95Var.T2;
                        if (vc2Var22222 != null) {
                        }
                        j95Var.r5.a(z4, z);
                        if (z4 == j95Var.y4) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    i2 = i7;
                    g75Var = g75Var3;
                    t85Var2 = t85Var;
                    i = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e13) {
                e = e13;
                e95Var = e95Var2;
                arrayList = arrayList3;
                i2 = i7;
                g75Var = g75Var3;
                t85Var2 = t85Var;
                i = childCount;
            }
        } catch (Exception e14) {
            e = e14;
            e95Var = e95Var2;
            i = childCount;
            arrayList = arrayList3;
            i2 = i7;
            g75Var = g75Var3;
            t85Var2 = t85Var;
            cc4.g(e, z2);
            e95Var.f();
            ArrayList arrayList42222 = j95Var.T2.e;
            size = arrayList42222.size();
            while (i3 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = j95Var.x2;
            arrayList52222.clear();
            arrayList52222.addAll(j95Var.T2.g);
            ArrayList arrayList62222 = j95Var.y2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = j95Var.z2;
            arrayList72222.clear();
            arrayList72222.addAll(j95Var.T2.j);
            ArrayList arrayList82222 = j95Var.A2;
            arrayList82222.clear();
            arrayList82222.addAll(j95Var.T2.m);
            ArrayList arrayList92222 = j95Var.B2;
            arrayList92222.clear();
            arrayList92222.addAll(j95Var.T2.l);
            e95 e95Var32222 = e95Var;
            j95Var.C2 = e95Var32222.G;
            i4 = i;
            i5 = 0;
            while (true) {
                t85Var3 = t85Var2;
                if (i5 < i4) {
                }
                i5++;
                t85Var2 = t85Var3;
            }
            boolean c2222 = g75Var.c();
            g75Var2 = g75Var;
            if (g75Var2.b) {
            }
            z3 = false;
            p95 p95Var22222 = j95Var.h4;
            c75Var = j95Var.e4;
            p95Var22222.G(c75Var, z2);
            if (c75Var.getVisibility() == 0) {
            }
            if (v5) {
            }
            if (t85Var3.getVisibility() == 0) {
            }
            r0 = j95Var.S3;
            r0.clear();
            r0.addAll(j95Var.R3);
            while (r8 < r0.size()) {
            }
            vc2Var = j95Var.T2;
            if (vc2Var != null) {
            }
            vc2 vc2Var222222 = j95Var.T2;
            if (vc2Var222222 != null) {
            }
            j95Var.r5.a(z4, z);
            if (z4 == j95Var.y4) {
            }
        }
        ArrayList arrayList422222 = j95Var.T2.e;
        size = arrayList422222.size();
        for (i3 = 0; i3 < size; i3++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i3)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            j95Var.R1.g1(i2, view.getTop() - t85Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = j95Var.x2;
        arrayList522222.clear();
        arrayList522222.addAll(j95Var.T2.g);
        ArrayList arrayList622222 = j95Var.y2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = j95Var.z2;
        arrayList722222.clear();
        arrayList722222.addAll(j95Var.T2.j);
        ArrayList arrayList822222 = j95Var.A2;
        arrayList822222.clear();
        arrayList822222.addAll(j95Var.T2.m);
        ArrayList arrayList922222 = j95Var.B2;
        arrayList922222.clear();
        arrayList922222.addAll(j95Var.T2.l);
        e95 e95Var322222 = e95Var;
        j95Var.C2 = e95Var322222.G;
        i4 = i;
        i5 = 0;
        while (true) {
            t85Var3 = t85Var2;
            if (i5 < i4) {
                break;
            }
            View childAt2 = t85Var3.getChildAt(i5);
            if (((childAt2 instanceof zb5) || (childAt2 instanceof r95)) && (H = t85Var3.H(childAt2)) != null) {
                if (childAt2 instanceof zb5) {
                    ((zb5) childAt2).setDrawDivider(H.b() != e95Var322222.G + (-2) ? z2 : false);
                } else {
                    ((r95) childAt2).setDrawDivider(H.b() != e95Var322222.G + (-2) ? z2 : false);
                }
            }
            i5++;
            t85Var2 = t85Var3;
        }
        boolean c22222 = g75Var.c();
        g75Var2 = g75Var;
        if (g75Var2.b && (wc2Var2 = g75Var2.e) != null && !vc2.E(wc2Var2.a, wc2Var2.b, j95Var.T2)) {
            if (!arrayList2.isEmpty()) {
                z3 = false;
                j95Var.W0(null);
            } else if (c22222) {
                z3 = false;
                j95Var.W0((wc2) arrayList2.get(0));
            }
            p95 p95Var222222 = j95Var.h4;
            c75Var = j95Var.e4;
            p95Var222222.G(c75Var, z2);
            if (c75Var.getVisibility() == 0) {
                hl.V3(c75Var);
            }
            if (v5) {
                j95Var.g4.I(j95Var.f4, z2);
            }
            if (t85Var3.getVisibility() == 0) {
                hl.V3(t85Var3);
            }
            r0 = j95Var.S3;
            r0.clear();
            r0.addAll(j95Var.R3);
            for (r8 = z3; r8 < r0.size(); r8++) {
                ((ka5) r0.get(r8)).j(z2);
            }
            vc2Var = j95Var.T2;
            if (vc2Var != null && g75Var2.b && (wc2Var = g75Var2.e) != null) {
                vc2Var.d.f(r47.B1(wc2Var.a.peer));
            }
            vc2 vc2Var2222222 = j95Var.T2;
            z4 = (vc2Var2222222 != null || vc2Var2222222.f.isEmpty()) ? z3 : z2;
            j95Var.r5.a(z4, z);
            if (z4 == j95Var.y4) {
                j95Var.y4 = z4;
                if (v5) {
                    j95Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z3 = false;
        p95 p95Var2222222 = j95Var.h4;
        c75Var = j95Var.e4;
        p95Var2222222.G(c75Var, z2);
        if (c75Var.getVisibility() == 0) {
        }
        if (v5) {
        }
        if (t85Var3.getVisibility() == 0) {
        }
        r0 = j95Var.S3;
        r0.clear();
        r0.addAll(j95Var.R3);
        while (r8 < r0.size()) {
        }
        vc2Var = j95Var.T2;
        if (vc2Var != null) {
            vc2Var.d.f(r47.B1(wc2Var.a.peer));
        }
        vc2 vc2Var22222222 = j95Var.T2;
        if (vc2Var22222222 != null) {
        }
        j95Var.r5.a(z4, z);
        if (z4 == j95Var.y4) {
        }
    }

    public final void E1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        vc2 vc2Var = this.T2;
        kmc kmcVar = this.u1;
        kmc kmcVar2 = this.q1;
        kmc kmcVar3 = this.s1;
        kmc kmcVar4 = this.p1;
        kmc kmcVar5 = this.r1;
        kmc kmcVar6 = this.t1;
        kmc kmcVar7 = this.v1;
        t65 t65Var = this.o1;
        boolean z7 = false;
        if (vc2Var == null || vc2Var.k()) {
            t65Var.c(kmcVar7, this.O2 > 0.1f, z);
            t65Var.c(kmcVar6, this.O2 > 0.1f, z);
            t65Var.c(kmcVar3, this.O2 > 0.1f, z);
            t65Var.c(kmcVar5, false, z);
            t65Var.c(kmcVar4, false, z);
            t65Var.c(kmcVar2, false, z);
            t65Var.c(kmcVar, false, z);
            return;
        }
        boolean z8 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
        boolean z9 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || H0()) ? false : true;
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
        t65Var.c(kmcVar7, true, z);
        t65Var.c(kmcVar6, true, z);
        t65Var.c(kmcVar5, z4, z);
        t65Var.c(kmcVar4, z7, z);
        t65Var.c(kmcVar3, z3, z);
        t65Var.c(kmcVar2, z5, z);
        t65Var.c(kmcVar, z2, z);
    }

    public final void F0(q95 q95Var, boolean z) {
        if (this.J) {
            return;
        }
        if (!z) {
            if (q95Var.getRenderer() != null) {
                q95Var.getRenderer().setPrimaryView(null);
                q95Var.setRenderer(null);
                return;
            }
            return;
        }
        if (q95Var.getRenderer() == null) {
            q95Var.setRenderer(ka5.c(this.R3, this.T3, q95Var, null, null, q95Var.getParticipant(), this.T2, this));
        }
    }

    public final void F1() {
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        vc2 vc2Var2 = this.T2;
        s7 s7Var = this.b3;
        s7 s7Var2 = this.d3;
        if (vc2Var2 == null || vc2Var2.k()) {
            this.c3.setVisibility(4);
            s7Var2.setVisibility(8);
            if (this.T2 == null) {
                s7Var.setVisibility(8);
                return;
            }
        }
        if (this.e2) {
            return;
        }
        k5 k5Var = this.n1;
        TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(a1()));
        if (M0 != null) {
            this.S2 = M0;
        }
        boolean y = xc2.y(3, this.S2);
        b8 b8Var = this.e3;
        if (y || (((!xc2.T(this.S2) || ((chat2 = this.S2) != null && chat2.megagroup)) && (xc2.t0(this.S2) || xc2.y(3, this.S2))) || (xc2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && xc2.t0(chat)))) {
            b8Var.setVisibility(0);
        } else {
            b8Var.setVisibility(8);
        }
        vc2 vc2Var3 = this.T2;
        b8 b8Var2 = this.t3;
        b8 b8Var3 = this.s3;
        if (vc2Var3 == null || (groupCall2 = vc2Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            b8Var3.setVisibility(8);
            b8Var2.setVisibility(8);
        } else {
            b8Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            b8Var2.setVisibility(this.T2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
        vc2 vc2Var4 = this.T2;
        b8 b8Var4 = this.h3;
        if (vc2Var4 == null || vc2Var4.k() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            b8Var4.setVisibility(8);
        } else {
            b8Var4.setVisibility(0);
        }
        b8Var4.setIcon(xea.E0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        b8Var4.setSubtext(ob6.M0(xea.E0 ? 2131742932 : 2131742933, null));
        vc2 vc2Var5 = this.T2;
        int i = (vc2Var5 == null || vc2Var5.k() || !DictationAsr.G()) ? 8 : 0;
        b8 b8Var5 = this.i3;
        b8Var5.setVisibility(i);
        boolean a = u86.a();
        this.j3.a(a, false);
        b8Var5.setSubtext(ob6.M0(a ? 2131744964 : 2131744965, null));
        H1();
        boolean H0 = H0();
        b8 b8Var6 = this.r3;
        b8 b8Var7 = this.f3;
        b8 b8Var8 = this.n3;
        b8 b8Var9 = this.o3;
        if (H0) {
            b8Var6.setVisibility(0);
            b8Var7.setVisibility(0);
            if (j1()) {
                b8Var8.setVisibility(0);
                b8Var9.setVisibility(8);
            } else if (this.T2.k()) {
                b8Var8.setVisibility(8);
                b8Var9.setVisibility(8);
            } else {
                b8Var8.setVisibility(0);
            }
            if (h1()) {
                b8Var8.setVisibility(8);
                b8Var7.setVisibility(8);
            }
            if (!this.T2.c() || this.T2.k()) {
                b8Var9.setVisibility(8);
            } else {
                b8Var9.setVisibility(0);
            }
            s7Var2.setVisibility(8);
            boolean z = this.T2.w;
            f95 f95Var = this.W2;
            f95Var.f = z;
            f95Var.d = 1.0f;
            f95Var.invalidateSelf();
            boolean z2 = this.T2.w;
            z55 z55Var = this.x3;
            if (z2) {
                if (z55Var == null) {
                    z55 z55Var2 = new z55(this, (byte) 6);
                    this.x3 = z55Var2;
                    hl.d3(z55Var2, 1000L);
                }
                b8Var8.setText(ob6.M0(2131742975, null));
            } else {
                if (z55Var != null) {
                    hl.r(z55Var);
                    this.x3 = null;
                }
                b8Var8.setText(ob6.M0(2131743000, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                b8Var9.j(ob6.M0(2131743088, null), R.drawable.msg_screencast, null);
            } else {
                b8Var9.j(ob6.M0(2131743086, null), R.drawable.msg_screencast_off, null);
            }
            J1();
        } else {
            boolean z3 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || H0()) ? false : true;
            boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z3 || (!(this.T2.c() || z4) || this.T2.k())) {
                s7Var2.setVisibility(8);
                b8Var9.setVisibility(8);
            } else if (z4) {
                s7Var2.setVisibility(8);
                b8Var9.setVisibility(0);
                b8Var9.j(ob6.M0(2131743086, null), R.drawable.msg_screencast_off, null);
                b8Var9.setContentDescription(ob6.M0(2131743086, null));
            } else {
                b8Var9.j(ob6.M0(2131743088, null), R.drawable.msg_screencast, null);
                b8Var9.setContentDescription(ob6.M0(2131743088, null));
                s7Var2.setVisibility(8);
                b8Var9.setVisibility(0);
            }
            b8Var6.setVisibility(8);
            b8Var7.setVisibility(8);
            b8Var8.setVisibility(8);
        }
        boolean H02 = H0();
        b8 b8Var10 = this.m3;
        if (H02 && this.T2.b.can_change_join_muted && !h1()) {
            b8Var10.setVisibility(0);
        } else {
            b8Var10.setVisibility(8);
        }
        s7Var.Q(4, (h1() && ((vc2Var = this.T2) == null || (groupCall = vc2Var.b) == null || !groupCall.creator)) ? false : true);
        this.g3.setVisibility(0);
        int visibility = b8Var7.getVisibility();
        TextView textView = this.v3;
        if (visibility == 0 || b8Var10.getVisibility() == 0 || b8Var.getVisibility() == 0 || b8Var9.getVisibility() == 0 || b8Var8.getVisibility() == 0 || b8Var6.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        l5 l5Var = this.d2;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.U2) || j1() || this.u2 == null) {
            l5Var.setVisibility(8);
        } else {
            l5Var.setVisibility(0);
            long B1 = r47.B1(this.u2);
            boolean D = wf3.D(B1);
            int i2 = k5Var.a;
            l5Var.setObject(D ? uc7.s1(i2).X1(Long.valueOf(B1)) : uc7.s1(i2).M0(Long.valueOf(-B1)));
        }
        TLRPC.Chat chat3 = this.S2;
        if (chat3 == null || xc2.W(chat3) || !j1() || b8Var.getVisibility() != 8) {
            s7Var.setVisibility(0);
        } else {
            s7Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != hl.L(96.0f)) {
            layoutParams.rightMargin = hl.L(96.0f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.u3.getLayoutParams()).rightMargin = 0;
        this.H1.setTitleRightMargin(hl.L(48.0f) << 1);
    }

    public final int G0() {
        t85 t85Var = this.J1;
        int childCount = t85Var.getChildCount();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = t85Var.getChildAt(i2);
            if (RecyclerView.S(childAt) >= 0) {
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
    public final void G1() {
        Integer num;
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        t85 t85Var = this.J1;
        int childCount = t85Var.getChildCount();
        float f = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            if (RecyclerView.S(t85Var.getChildAt(i)) >= 0) {
                f = Math.min(f, r7.getTop());
            }
        }
        if (f < 0.0f || f == 2.1474836E9f) {
            f = childCount != 0 ? 0.0f : t85Var.getPaddingTop();
        }
        byte b = 1;
        boolean z = f <= ((float) (a.getCurrentActionBarHeight() - hl.L(14.0f)));
        float L = f + hl.L(14.0f) + a.getCurrentActionBarHeight();
        e85 e85Var = this.H1;
        Object tag = e85Var.getTag();
        if (z) {
            if (tag == null) {
                num = 1;
                e85Var.setTag(num);
                animatorSet = this.a2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.a2 = null;
                }
                A0(e85Var.getTag() != null);
                ViewPropertyAnimator duration = e85Var.getBackButton().animate().scaleX(!z ? 1.0f : 0.9f).scaleY(z ? 1.0f : 0.9f).translationX(!z ? 0.0f : -hl.L(14.0f)).setDuration(300L);
                k43 k43Var = k43.f;
                duration.setInterpolator(k43Var).start();
                e85Var.getTitleTextView().animate().translationY(!z ? 0.0f : hl.L(23.0f)).setDuration(300L).setInterpolator(k43Var).start();
                objectAnimator = this.J4;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.J4.cancel();
                }
                ema subtitleTextView = e85Var.getSubtitleTextView();
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<ema, Float>) property, e85Var.getSubtitleTextView().getTranslationY(), !z ? 0.0f : hl.L(20.0f));
                this.J4 = ofFloat;
                ofFloat.setDuration(300L);
                this.J4.setInterpolator(k43Var);
                this.J4.addListener(new gf4((byte) 4, this, z));
                this.J4.start();
                objectAnimator2 = this.K4;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e85Var.getAdditionalSubtitleTextView(), (Property<ema, Float>) property, !z ? 0.0f : hl.L(20.0f));
                this.K4 = ofFloat2;
                ofFloat2.setDuration(300L);
                this.K4.setInterpolator(k43Var);
                this.K4.start();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.a2 = animatorSet2;
                animatorSet2.setDuration(140L);
                AnimatorSet animatorSet3 = this.a2;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(e85Var, (Property<e85, Float>) property2, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G1, (Property<z65, Float>) property2, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<View, Float>) property2, !z ? 1.0f : 0.0f));
                this.a2.addListener(new j85(this, b));
                this.a2.start();
                this.T3.w.setClickable(z || u5);
            }
        } else if (tag != null) {
            num = null;
            e85Var.setTag(num);
            animatorSet = this.a2;
            if (animatorSet != null) {
            }
            A0(e85Var.getTag() != null);
            ViewPropertyAnimator duration2 = e85Var.getBackButton().animate().scaleX(!z ? 1.0f : 0.9f).scaleY(z ? 1.0f : 0.9f).translationX(!z ? 0.0f : -hl.L(14.0f)).setDuration(300L);
            k43 k43Var2 = k43.f;
            duration2.setInterpolator(k43Var2).start();
            e85Var.getTitleTextView().animate().translationY(!z ? 0.0f : hl.L(23.0f)).setDuration(300L).setInterpolator(k43Var2).start();
            objectAnimator = this.J4;
            if (objectAnimator != null) {
            }
            ema subtitleTextView2 = e85Var.getSubtitleTextView();
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(subtitleTextView2, (Property<ema, Float>) property3, e85Var.getSubtitleTextView().getTranslationY(), !z ? 0.0f : hl.L(20.0f));
            this.J4 = ofFloat3;
            ofFloat3.setDuration(300L);
            this.J4.setInterpolator(k43Var2);
            this.J4.addListener(new gf4((byte) 4, this, z));
            this.J4.start();
            objectAnimator2 = this.K4;
            if (objectAnimator2 != null) {
            }
            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(e85Var.getAdditionalSubtitleTextView(), (Property<ema, Float>) property3, !z ? 0.0f : hl.L(20.0f));
            this.K4 = ofFloat22;
            ofFloat22.setDuration(300L);
            this.K4.setInterpolator(k43Var2);
            this.K4.start();
            AnimatorSet animatorSet22 = new AnimatorSet();
            this.a2 = animatorSet22;
            animatorSet22.setDuration(140L);
            AnimatorSet animatorSet32 = this.a2;
            Property property22 = View.ALPHA;
            animatorSet32.playTogether(ObjectAnimator.ofFloat(e85Var, (Property<e85, Float>) property22, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G1, (Property<z65, Float>) property22, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<View, Float>) property22, !z ? 1.0f : 0.0f));
            this.a2.addListener(new j85(this, b));
            this.a2.start();
            this.T3.w.setClickable(z || u5);
        }
        if (this.s2 != L) {
            z1(L);
        }
    }

    @Override // nx0
    public final void H() {
        LaunchActivity launchActivity;
        vc2 vc2Var;
        vc2 vc2Var2;
        TLRPC.GroupCall groupCall;
        ArrayList arrayList = this.R3;
        ArrayList arrayList2 = this.S3;
        g75 g75Var = this.T3;
        if (g75Var != null) {
            if (this.i4 != null) {
                this.J1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                ((ka5) arrayList2.get(i)).f();
                g75Var.removeView((View) arrayList2.get(i));
                ((ka5) arrayList2.get(i)).e();
                ((ka5) arrayList2.get(i)).b(true);
            }
            arrayList.clear();
            if (g75Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(g75Var);
            }
        }
        u86 u86Var = this.l3;
        if (u86Var.d) {
            u86Var.d = false;
            Thread thread = u86Var.e;
            if (thread != null) {
                thread.interrupt();
                u86Var.e = null;
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
        ra5.k(getContext());
        vc2 vc2Var3 = this.T2;
        if (vc2Var3 != null) {
            ArrayList arrayList3 = vc2Var3.e;
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).videoIndex = 0;
            }
            vc2Var3.B();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        if (!this.o2 || (launchActivity = this.b2) == null || launchActivity.isFinishing() || (vc2Var = this.T2) == null) {
            return;
        }
        LaunchActivity launchActivity2 = this.b2;
        k5 k5Var = this.n1;
        long j = vc2Var.b.id;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || (vc2Var2 = sharedInstance.groupCall) == null || (groupCall = vc2Var2.b) == null || groupCall.id != j) {
            jn7.e().a(new k85(j, launchActivity2, k5Var), jn7.v2);
        } else {
            T0(launchActivity2, k5Var, null, null, false, null);
        }
    }

    public final boolean H0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return xc2.w(14, this.S2);
        }
        vc2 vc2Var = this.T2;
        return (vc2Var == null || (groupCall = vc2Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void H1() {
        vc2 vc2Var;
        if (this.l3 != null) {
            int i = 0;
            boolean z = u86.a() && (vc2Var = this.T2) != null && !vc2Var.k() && s5 == this;
            u86 u86Var = this.l3;
            if (!z) {
                if (u86Var.d) {
                    u86 u86Var2 = this.l3;
                    if (u86Var2.d) {
                        u86Var2.d = false;
                        Thread thread = u86Var2.e;
                        if (thread != null) {
                            thread.interrupt();
                            u86Var2.e = null;
                        }
                        try {
                            NativeInstance.setIncomingAudioCapture(false);
                        } catch (Throwable unused) {
                        }
                    }
                    x86 x86Var = this.k3;
                    x86Var.getClass();
                    ArrayList arrayList = new ArrayList(x86Var.a);
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        w86 w86Var = (w86) obj;
                        x86Var.a.remove(w86Var);
                        x86Var.removeView(w86Var);
                    }
                    return;
                }
                return;
            }
            if (u86Var.d) {
                return;
            }
            final u86 u86Var3 = this.l3;
            Context context = getContext();
            int i2 = this.n1.a;
            TLRPC.Chat chat = this.S2;
            long j = chat != null ? -chat.id : 0L;
            if (u86Var3.d) {
                return;
            }
            u86Var3.d = true;
            final pm3 X = DictationAsr.X(in3.c(context, j));
            boolean y = DictationAsr.y();
            u86Var3.c = y;
            if (y) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.y()) {
                    DictationLid.a(context);
                }
            }
            StringBuilder sb = new StringBuilder("live captions: ");
            sb.append(X);
            bs2.x(sb, u86Var3.c ? ", tinylid" : "", "Dictation");
            DictationAsr.k0((nm3) X.b, false, new om3() { // from class: r86
                @Override // om3
                public final void a(boolean z2) {
                    u86 u86Var4 = u86.this;
                    pm3 pm3Var = X;
                    if (u86Var4.d) {
                        if (!z2) {
                            u86Var4.d = false;
                            return;
                        }
                        NativeInstance.setIncomingAudioCapture(true);
                        Thread thread2 = new Thread(new z56(u86Var4, pm3Var, (byte) 4), "LiveCaptions");
                        u86Var4.e = thread2;
                        thread2.start();
                    }
                }
            });
        }
    }

    public final void I0() {
        if (this.K3) {
            this.K3 = false;
            hl.r(this.q4);
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
    public final void I1(int i, boolean z) {
        boolean K;
        boolean K2;
        String M0;
        boolean z2;
        String str;
        boolean K3;
        boolean K4;
        boolean K5;
        byte b;
        i95[] i95VarArr;
        boolean z3;
        i95 i95Var;
        i95 i95Var2;
        boolean z4;
        boolean z5;
        int i2;
        if (!j1() && this.z3 == i && z) {
            return;
        }
        String str2 = "";
        b29 b29Var = this.D2;
        if (i == 7) {
            M0 = ob6.M0(2131743045, null);
            K5 = b29Var.K(jn7.f3);
        } else {
            if (i != 6) {
                if (i != 5) {
                    if (i == 0) {
                        M0 = ob6.M0(2131742969, null);
                        str2 = ob6.M0(2131742953, null);
                        byte b2 = this.z3;
                        if (b2 == 3) {
                            int i3 = b29Var.f;
                            K3 = (i3 == 136 || i3 == 173 || i3 == 274 || i3 == 311) ? b29Var.K(99) : false;
                        } else if (b2 == 5) {
                            K3 = b29Var.K(404);
                        } else if (b2 == 7) {
                            K3 = b29Var.K(376);
                        } else if (b2 == 6) {
                            K3 = b29Var.K(237);
                        } else if (b2 == 2) {
                            K4 = b29Var.K(36);
                        } else {
                            K3 = b29Var.K(99);
                        }
                    } else if (i == 1) {
                        M0 = ob6.M0(h1() ? 2131742884 : 2131742883, null);
                        K3 = b29Var.K(this.z3 == 4 ? 99 : 69);
                    } else if (h1() && i == 2) {
                        M0 = ob6.M0(2131742943, null);
                        K3 = b29Var.K(99);
                    } else {
                        if (i != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
                            boolean z6 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || H0()) ? false : true;
                            byte b3 = this.z3;
                            if (z6) {
                                K2 = b3 == 7 ? b29Var.K(jn7.h5) : b3 == 6 ? b29Var.K(jn7.w4) : b3 == 1 ? b29Var.K(jn7.C2) : b29Var.K(jn7.R1);
                            } else if (b3 == 5) {
                                K2 = b29Var.K(404);
                            } else if (b3 == 7) {
                                K2 = b29Var.K(376);
                            } else {
                                if (b3 != 6) {
                                    K = (b3 == 2 || b3 == 4) ? b29Var.K(36) : b29Var.K(99);
                                    if (i != 3) {
                                        M0 = ob6.M0(2131751774, null);
                                    } else {
                                        M0 = ob6.M0(2131742943, null);
                                        str2 = ob6.M0(2131742942, null);
                                    }
                                    z2 = z6;
                                    str = str2;
                                    String y = !TextUtils.isEmpty(str) ? qd4.y(M0, " ", str) : M0;
                                    kmc kmcVar = this.v1;
                                    kmcVar.setContentDescription(y);
                                    kmcVar.c(0, 0, 0, 1.0f, true, M0, false, z);
                                    u65 u65Var = this.w1;
                                    if (z) {
                                        if (K) {
                                            if (i == 5) {
                                                b29Var.H(376);
                                            } else if (i == 7) {
                                                b29Var.H(jn7.C2);
                                            } else if (i == 6) {
                                                b29Var.H(jn7.h5);
                                            } else if (i == 0) {
                                                byte b4 = this.z3;
                                                if (b4 == 5) {
                                                    b29Var.H(376);
                                                } else if (b4 == 7) {
                                                    b29Var.H(jn7.O5);
                                                } else if (b4 == 6) {
                                                    b29Var.H(jn7.f3);
                                                } else if (b4 == 2) {
                                                    b29Var.H(0);
                                                    i2 = 0;
                                                    u65Var.d();
                                                    u65Var.setVisibility(i2);
                                                    this.z3 = i;
                                                } else {
                                                    b29Var.H(69);
                                                }
                                            } else {
                                                if (i == 1 || (this.z3 == 2 && h1())) {
                                                    i2 = 0;
                                                    b29Var.H(this.z3 != 4 ? 36 : 69);
                                                } else if (i == 4) {
                                                    b29Var.H(99);
                                                } else {
                                                    byte b5 = this.z3;
                                                    if (z2) {
                                                        if (b5 == 7) {
                                                            b29Var.H(jn7.w4);
                                                        } else if (b5 == 6) {
                                                            b29Var.H(237);
                                                        } else if (b5 == 1) {
                                                            b29Var.H(jn7.R1);
                                                        } else {
                                                            b29Var.H(99);
                                                        }
                                                    } else if (b5 == 5) {
                                                        b29Var.H(376);
                                                    } else if (b5 == 7) {
                                                        b29Var.H(jn7.O5);
                                                    } else if (b5 == 6) {
                                                        b29Var.H(jn7.f3);
                                                    } else if (b5 == 2 || b5 == 4) {
                                                        i2 = 0;
                                                        b29Var.H(0);
                                                    } else {
                                                        b29Var.H(69);
                                                    }
                                                }
                                                u65Var.d();
                                                u65Var.setVisibility(i2);
                                                this.z3 = i;
                                            }
                                        }
                                        i2 = 0;
                                        u65Var.d();
                                        u65Var.setVisibility(i2);
                                        this.z3 = i;
                                    } else {
                                        this.z3 = i;
                                        b29Var.I(b29Var.f - 1, false, true);
                                        u65Var.setVisibility(0);
                                    }
                                    kmcVar.invalidate();
                                    b = this.z3;
                                    i95VarArr = this.D3;
                                    if (i95VarArr[b] == null) {
                                        i95VarArr[b] = new i95(b);
                                        byte b6 = this.z3;
                                        if (b6 == 3) {
                                            i95VarArr[b6].g = null;
                                        } else {
                                            boolean i1 = i1(b6);
                                            byte b7 = this.z3;
                                            if (i1) {
                                                i95VarArr[b7].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{aob.w0(null, aob.Zh, false), aob.w0(null, aob.bi, false), aob.w0(null, aob.ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            } else {
                                                if (b7 != 1) {
                                                    i95 i95Var3 = i95VarArr[b7];
                                                    z3 = false;
                                                    i95Var3.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{aob.w0(null, aob.Ah, false), aob.w0(null, aob.zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                                    i95Var = i95VarArr[this.z3];
                                                    i95Var2 = this.G3;
                                                    if (i95Var == i95Var2) {
                                                        this.F3 = i95Var2;
                                                        this.G3 = i95Var;
                                                        if (i95Var2 == null || !z) {
                                                            this.E3 = 1.0f;
                                                            this.F3 = null;
                                                        } else {
                                                            this.E3 = 0.0f;
                                                        }
                                                    } else {
                                                        i95Var = i95Var2;
                                                    }
                                                    if (!z) {
                                                        if (i95Var != null) {
                                                            byte b8 = i95Var.i;
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
                                                i95VarArr[b7].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{aob.w0(null, aob.wh, false), aob.w0(null, aob.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            }
                                        }
                                    }
                                    z3 = false;
                                    i95Var = i95VarArr[this.z3];
                                    i95Var2 = this.G3;
                                    if (i95Var == i95Var2) {
                                    }
                                    if (!z) {
                                    }
                                    this.o1.invalidate();
                                }
                                K2 = b29Var.K(237);
                            }
                            K = K2;
                            if (i != 3) {
                            }
                            z2 = z6;
                            str = str2;
                            if (!TextUtils.isEmpty(str)) {
                            }
                            kmc kmcVar2 = this.v1;
                            kmcVar2.setContentDescription(y);
                            kmcVar2.c(0, 0, 0, 1.0f, true, M0, false, z);
                            u65 u65Var2 = this.w1;
                            if (z) {
                            }
                            kmcVar2.invalidate();
                            b = this.z3;
                            i95VarArr = this.D3;
                            if (i95VarArr[b] == null) {
                            }
                            z3 = false;
                            i95Var = i95VarArr[this.z3];
                            i95Var2 = this.G3;
                            if (i95Var == i95Var2) {
                            }
                            if (!z) {
                            }
                            this.o1.invalidate();
                        }
                        M0 = ob6.M0(2131742939, null);
                        str2 = ob6.M0(2131742940, null);
                        K3 = b29Var.K(jn7.R1);
                    }
                    K = K3;
                    str = str2;
                    z2 = false;
                    if (!TextUtils.isEmpty(str)) {
                    }
                    kmc kmcVar22 = this.v1;
                    kmcVar22.setContentDescription(y);
                    kmcVar22.c(0, 0, 0, 1.0f, true, M0, false, z);
                    u65 u65Var22 = this.w1;
                    if (z) {
                    }
                    kmcVar22.invalidate();
                    b = this.z3;
                    i95VarArr = this.D3;
                    if (i95VarArr[b] == null) {
                    }
                    z3 = false;
                    i95Var = i95VarArr[this.z3];
                    i95Var2 = this.G3;
                    if (i95Var == i95Var2) {
                    }
                    if (!z) {
                    }
                    this.o1.invalidate();
                }
                M0 = ob6.M0(2131742982, null);
                K4 = b29Var.K(377);
                K = K4;
                str = str2;
                z2 = false;
                if (!TextUtils.isEmpty(str)) {
                }
                kmc kmcVar222 = this.v1;
                kmcVar222.setContentDescription(y);
                kmcVar222.c(0, 0, 0, 1.0f, true, M0, false, z);
                u65 u65Var222 = this.w1;
                if (z) {
                }
                kmcVar222.invalidate();
                b = this.z3;
                i95VarArr = this.D3;
                if (i95VarArr[b] == null) {
                }
                z3 = false;
                i95Var = i95VarArr[this.z3];
                i95Var2 = this.G3;
                if (i95Var == i95Var2) {
                }
                if (!z) {
                }
                this.o1.invalidate();
            }
            M0 = ob6.M0(2131742990, null);
            K5 = b29Var.K(jn7.O5);
        }
        str = "";
        K = K5;
        z2 = false;
        if (!TextUtils.isEmpty(str)) {
        }
        kmc kmcVar2222 = this.v1;
        kmcVar2222.setContentDescription(y);
        kmcVar2222.c(0, 0, 0, 1.0f, true, M0, false, z);
        u65 u65Var2222 = this.w1;
        if (z) {
        }
        kmcVar2222.invalidate();
        b = this.z3;
        i95VarArr = this.D3;
        if (i95VarArr[b] == null) {
        }
        z3 = false;
        i95Var = i95VarArr[this.z3];
        i95Var2 = this.G3;
        if (i95Var == i95Var2) {
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
    public final void J0() {
        boolean z;
        if (!this.R4) {
            m75 m75Var = this.U3;
            if (m75Var.getVisibility() == 0 && m75Var.getAlpha() == 1.0f) {
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

    public final void J1() {
        if (this.T2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.a).getCurrentTime();
        vc2 vc2Var = this.T2;
        int i = currentTime - vc2Var.b.record_start_date;
        boolean z = vc2Var.w;
        b8 b8Var = this.n3;
        if (z) {
            b8Var.setSubtext(hl.g0(i, false, false));
        } else {
            b8Var.setSubtext(null);
        }
    }

    public final void K0() {
        this.y1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom());
        this.z1.invalidate();
        Q0();
        P0();
        N0();
        O0();
        R0();
        this.o1.setAlpha(1.0f - this.o5.e);
        L0();
        M0();
    }

    public final void K1(boolean z) {
        float interpolation;
        float f;
        z75 z75Var = this.K1;
        if ((z75Var == null || this.T2 != null) && this.Q2 == null) {
            this.P2 = 1.0f;
            this.O2 = 1.0f;
            if (z75Var == null) {
                return;
            }
        }
        if (!z) {
            y65 y65Var = this.o4;
            hl.r(y65Var);
            y65Var.run();
            vc2 vc2Var = this.T2;
            t85 t85Var = this.J1;
            if (vc2Var == null || vc2Var.k()) {
                t85Var.setVisibility(4);
            } else {
                t85Var.setVisibility(0);
            }
            boolean W = xc2.W(this.S2);
            b8 b8Var = this.r3;
            if (W) {
                b8Var.setText(ob6.M0(2131743140, null));
            } else {
                b8Var.setText(ob6.M0(2131743047, null));
            }
        }
        float f2 = this.O2;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (k43.f.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.P2 = 1.0f;
            f = 1.0f;
        } else {
            k43 k43Var = k43.f;
            this.P2 = k43Var.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * k43Var.getInterpolation(this.O2 / 0.6f);
            f = this.O2 / 0.6f;
        }
        E1(true);
        float f3 = 1.0f - f;
        z75Var.setAlpha(f3);
        this.N1.setAlpha(f);
        this.P1.setAlpha(f);
        s85 s85Var = this.O1;
        s85Var.setAlpha(f);
        s85Var.setScaleX(interpolation);
        s85Var.setScaleY(interpolation);
        x75 x75Var = this.M1;
        x75Var.setScaleX(f3);
        x75Var.setScaleY(f3);
        x75Var.setAlpha(f3);
        this.L1.setAlpha(f3);
        this.b3.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != z75Var.getVisibility()) {
            z75Var.setVisibility(i);
            x75Var.setVisibility(i);
        }
    }

    public final void L0() {
        float f = this.w3.b.a;
        int i = f > 0.0f ? 0 : 8;
        t75 t75Var = this.y1;
        t75Var.setAlpha(f);
        s75 s75Var = this.z1;
        s75Var.setAlpha(f);
        if (t75Var.getVisibility() != i) {
            t75Var.setVisibility(i);
            s75Var.setVisibility(i);
            if (i == 8) {
                q75 q75Var = this.A1;
                if (q75Var.isFocused()) {
                    q75Var.clearFocus();
                }
            }
        }
    }

    public final void L1(boolean z) {
        kmc kmcVar = this.s1;
        if (kmcVar == null || kmcVar.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t65 t65Var = this.o1;
        if (sharedInstance == null) {
            kmcVar.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, ob6.M0(2131743089, null), false, z);
            boolean z2 = xc2.t0(this.S2) || (xc2.N(this.S2) && xc2.w(3, this.S2));
            k95 k95Var = (k95) t65Var.c.get(kmcVar);
            if (k95Var != null) {
                k95Var.d.a(z2, z);
                kmcVar.setEnabled(z2);
            }
            kmcVar.b(true, false);
            return;
        }
        k95 k95Var2 = (k95) t65Var.c.get(kmcVar);
        if (k95Var2 != null) {
            k95Var2.d.a(true, z);
            kmcVar.setEnabled(true);
        }
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z4 = !z3 && sharedInstance.isSpeakerphoneOn();
        if (z3) {
            kmcVar.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, ob6.M0(2131743155, null), false, z);
        } else if (z4) {
            kmcVar.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, ob6.M0(2131742891, null), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            kmcVar.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, ob6.M0(2131743153, null), false, z);
        } else {
            kmcVar.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, ob6.M0(2131742891, null), false, z);
        }
        kmcVar.b(z4, z);
        Z0();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.T1 != i) {
            this.T1 = i;
            hl.L3(this.U1, i);
        }
        kmc kmcVar2 = this.q1;
        if (kmcVar2.getVisibility() == 0) {
            kmcVar2.c(0, -1, 0, 1.0f, true, X0(Z0()), false, z);
            kmcVar2.b(Z0() != 1, z);
        }
    }

    public final void M0() {
        i49 i49Var = this.D1;
        if (i49Var != null) {
            float f = this.w3.b.a * this.p5.e;
            i49Var.setAlpha(f);
            int i = f > 0.0f ? 0 : 8;
            if (this.D1.getVisibility() != i) {
                this.D1.setVisibility(i);
                if (i == 8) {
                    this.D1.k();
                }
            }
            i49 i49Var2 = this.D1;
            if (i49Var2.O0 || f != 1.0f) {
                return;
            }
            i49Var2.O0 = true;
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
    public final void M1(boolean z, boolean z2) {
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
        kmc kmcVar;
        kmc kmcVar2;
        kmc kmcVar3;
        boolean z10;
        vc2 vc2Var = this.T2;
        kmc kmcVar4 = this.t1;
        int i3 = 6;
        if (vc2Var == null || vc2Var.k()) {
            if (H0()) {
                i3 = 5;
            } else if (this.T2.b.schedule_start_subscribed) {
                i3 = 7;
            }
            I1(i3, z);
            kmcVar4.c(R.drawable.calls_decline, -1, aob.w0(null, aob.uh, false), 0.3f, false, ob6.M0(2131752006, null), false, false);
            K1(false);
            return;
        }
        E1(z);
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
                I0();
                I1(3, z);
                z3 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
                z4 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !H0();
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
                g75 g75Var = this.T3;
                int i6 = i5 + ((g75Var == null && g75Var.b) ? 8 : 0) + (!z8 ? 16 : 0);
                z9 = (this.h2 | 2) == (i6 | 2);
                this.h2 = i6;
                boolean z11 = z3;
                kmc kmcVar5 = this.r1;
                if (z5) {
                    kmcVar5.c(R.drawable.calls_video, -1, 0, 1.0f, true, ob6.M0(2131743141, null), !z11, z);
                    kmcVar5.b(true, false);
                }
                kmc kmcVar6 = this.p1;
                if (i2 != 0) {
                    kmcVar6.c(0, -1, 0, 1.0f, true, ob6.M0(2131743058, null), false, false);
                    kmcVar6.b(true, false);
                }
                kmc kmcVar7 = this.q1;
                if (z8) {
                    kmcVar = kmcVar6;
                    kmcVar2 = kmcVar5;
                    kmcVar3 = kmcVar7;
                    z10 = z;
                } else {
                    Z0();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i7 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.T1 != i7) {
                        this.T1 = i7;
                        hl.L3(this.U1, i7);
                    }
                    kmcVar2 = kmcVar5;
                    kmcVar = kmcVar6;
                    kmcVar7.c(0, -1, 0, 1.0f, true, X0(Z0()), false, z);
                    kmcVar3 = kmcVar7;
                    z10 = z;
                    kmcVar3.b(Z0() != 1, z10);
                }
                kmc kmcVar8 = kmcVar3;
                kmcVar4.c(R.drawable.calls_decline, -1, aob.w0(null, aob.uh, false), 0.3f, false, ob6.M0(2131743016, null), false, false);
                if (z9 && z6) {
                    L1(false);
                }
                kmcVar2.d(true, z10);
                kmcVar.d(true, z10);
                kmcVar8.d(true, z10);
            }
        }
        if (this.v2 != null) {
            d1().k(0L, 37, this.v2, this.S2, null, null);
            this.v2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || H0()) {
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z2 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                I0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                I1(0, z);
            } else {
                I1(1, z);
            }
        } else {
            I0();
            if (groupCallParticipant2.raise_hand_rating != j) {
                I1(4, z);
            } else {
                I1(2, z);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
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
        g75 g75Var2 = this.T3;
        int i62 = i52 + ((g75Var2 == null && g75Var2.b) ? 8 : 0) + (!z8 ? 16 : 0);
        if ((this.h2 | 2) == (i62 | 2)) {
        }
        this.h2 = i62;
        boolean z112 = z3;
        kmc kmcVar52 = this.r1;
        if (z5) {
        }
        kmc kmcVar62 = this.p1;
        if (i2 != 0) {
        }
        kmc kmcVar72 = this.q1;
        if (z8) {
        }
        kmc kmcVar82 = kmcVar3;
        kmcVar4.c(R.drawable.calls_decline, -1, aob.w0(null, aob.uh, false), 0.3f, false, ob6.M0(2131743016, null), false, false);
        if (z9) {
            L1(false);
        }
        kmcVar2.d(true, z10);
        kmcVar.d(true, z10);
        kmcVar82.d(true, z10);
    }

    public final void N0() {
        boolean z = v5;
        t65 t65Var = this.o1;
        if (z) {
            t65Var.setTranslationX(0.0f);
            t65Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            t65Var.setTranslationX(fm0Var.e * hl.L(94.0f));
            t65Var.setTranslationY(0.0f);
        } else {
            t65Var.setTranslationX(0.0f);
            t65Var.setTranslationY(fm0Var.e * hl.L(94.0f));
        }
    }

    public final void N1() {
        boolean z;
        TLRPC.Chat M0;
        TLRPC.User user;
        e85 e85Var = this.H1;
        if (e85Var == null || this.T2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.T2.P.m(); i2++) {
            long j = this.T2.P.j(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.P.f(j);
            if (!groupCallParticipant.self) {
                g75 g75Var = this.T3;
                g75Var.getClass();
                if (g75Var.x.get(r47.B1(groupCallParticipant.peer)) <= 0 && this.r4.get(j, 0) != 1) {
                    long B1 = r47.B1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i < 2) {
                        int i3 = this.a;
                        if (B1 > 0) {
                            user = uc7.s1(i3).X1(Long.valueOf(B1));
                            M0 = null;
                        } else {
                            M0 = uc7.s1(i3).M0(Long.valueOf(B1));
                            user = null;
                        }
                        if (user != null || M0 != null) {
                            if (i != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(lbc.k(user, true), new y7c(hl.o()), 0);
                            } else {
                                spannableStringBuilder.append(M0.title, new y7c(hl.o()), 0);
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
            String J0 = ob6.J0(i, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            e85Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        e85Var.getSubtitleTextView().k(ob6.G(this.T2.b.participants_count + ((this.I1.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), j1() ? "ViewersWatching" : "Participants", new Object[0]));
        if (z != this.m4) {
            this.m4 = z;
            e85Var.invalidate();
            e85Var.getSubtitleTextView().setPivotX(0.0f);
            e85Var.getSubtitleTextView().setPivotY(e85Var.getMeasuredHeight() >> 1);
            e85Var.getSubtitleTextView().animate().scaleX(this.m4 ? 0.98f : 1.0f).scaleY(this.m4 ? 0.9f : 1.0f).alpha(this.m4 ? 0.0f : 1.0f).setDuration(150L);
            hl.R3(e85Var.getAdditionalSubtitleTextView(), this.m4);
        }
    }

    public final void O0() {
        boolean z = v5;
        c75 c75Var = this.e4;
        if (z) {
            c75Var.setTranslationX(0.0f);
            c75Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            c75Var.setTranslationX(fm0Var.e * hl.L(94.0f));
            c75Var.setTranslationY(0.0f);
        } else {
            c75Var.setTranslationX(0.0f);
            c75Var.setTranslationY(fm0Var.e * hl.L(94.0f));
        }
    }

    public final void O1(boolean z) {
        vc2 vc2Var = this.T2;
        x65 x65Var = this.X2;
        if (vc2Var == null) {
            if (xc2.W(this.S2)) {
                x65Var.b(ob6.M0(2131743114, null), z);
                return;
            } else {
                x65Var.b(ob6.M0(2131742993, null), z);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(vc2Var.b.title);
        e85 e85Var = this.H1;
        if (isEmpty) {
            TLRPC.Chat chat = this.S2;
            if (chat != null && !chat.title.equals(e85Var.getTitle())) {
                TLRPC.Chat chat2 = this.S2;
                e85 e85Var2 = this.H1;
                if (z) {
                    e85Var2.N(chat2.title, true, 180L, null);
                    e85Var.getTitleTextView().setOnClickListener(new x55(this, (byte) 8));
                } else {
                    e85Var2.setTitle(chat2.title);
                }
                if (!xc2.W(this.S2)) {
                    x65Var.b(ob6.M0(2131742958, null), z);
                } else if (j1()) {
                    x65Var.b(this.S2.title, z);
                } else {
                    x65Var.b(ob6.M0(2131743099, null), z);
                }
            } else if (this.S2 == null) {
                e85Var.setTitle(ob6.M0(2131751788, null));
                x65Var.b(ob6.M0(2131751788, null), z);
            }
        } else if (!this.T2.b.title.equals(e85Var.getTitle())) {
            vc2 vc2Var2 = this.T2;
            e85 e85Var3 = this.H1;
            if (z) {
                e85Var3.N(vc2Var2.b.title, true, 180L, null);
                e85Var.getTitleTextView().setOnClickListener(new x55(this, (byte) 7));
            } else {
                e85Var3.setTitle(vc2Var2.b.title);
            }
            x65Var.b(this.T2.b.title, z);
        }
        ema titleTextView = e85Var.getTitleTextView();
        if (!this.T2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                x65Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                x65Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new g95(titleTextView));
            TextView textView = x65Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new g95(textView), (Drawable) null);
            TextView nextTextView = x65Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new g95(nextTextView), (Drawable) null);
        }
    }

    public final void P0() {
        int i;
        float f = this.q5.f;
        v2d v2dVar = this.w3;
        float R1 = hl.R1(v5 ? (1.0f - this.r5.e) * hl.L(-91.0f) : u5 ? 0.0f : ((this.o5.e * hl.L(94.0f)) - (hl.L(104.0f) * this.T3.c)) - hl.L(91.0f), -((v2dVar.d() - this.b.getPaddingBottom()) + f + (hl.L(68.0f) * this.p5.e) + hl.L(10.0f)), v2dVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + R1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - hl.L(250.0f));
        x86 x86Var = this.k3;
        if (x86Var != null) {
            i = x86Var.getContentHeight();
            x86Var.setTranslationY(R1);
        } else {
            i = 0;
        }
        float f2 = i;
        da5 da5Var = this.V1;
        da5Var.setTranslationY(R1 - f2);
        da5Var.setVisibleHeight((int) Math.max(0.0f, max - f2));
    }

    public final void P1() {
        float f;
        z11 z11Var;
        if (this.F != null) {
            int L = hl.L(74.0f);
            float f2 = this.s2 - L;
            if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / ((L - this.t0) - hl.L(14.0f)));
                f2 -= (int) ((a.getCurrentActionBarHeight() - r0) * f);
            } else {
                f = 0.0f;
            }
            this.F.setTranslationY(hl.R1(((-r0.getTop()) - this.F.getHeight()) + f2 + this.b.getPaddingTop() + hl.L(10.0f), this.H1.getY() + (-this.F.getTop()) + r4.getHeight(), f));
            v21 v21Var = v21.x;
            if (v21Var == null || (z11Var = v21Var.e) == null || z11Var.getParent() == null || z11Var.getParent().getParent() != this.F) {
                return;
            }
            z11Var.setTop(f > 0.5f);
        }
    }

    public final void Q0() {
        if (this.D1 != null) {
            this.D1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.p5.e) * hl.L(64.0f)));
        }
    }

    public final void R0() {
        float f = this.p5.e;
        float R1 = hl.R1(0.25f, 1.0f, f);
        ImageView imageView = this.C1;
        imageView.setScaleX(R1);
        imageView.setScaleY(hl.R1(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        imageView.setClickable(f > 0.9f);
        float f2 = 1.0f - f;
        float R12 = hl.R1(0.25f, 1.0f, f2);
        ImageView imageView2 = this.B1;
        imageView2.setScaleX(R12);
        imageView2.setScaleY(hl.R1(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        imageView2.setClickable(f2 > 0.9f);
    }

    @Override // nx0
    public final ArrayList S() {
        return new ArrayList();
    }

    public final void S0() {
        ka5 ka5Var = this.O4;
        if (ka5Var != null) {
            ka5Var.a.setRoundCorners(hl.L(8.0f));
            ka5 ka5Var2 = this.O4;
            ka5Var2.h = false;
            ka5Var2.j(false);
            this.O4.invalidate();
            this.T3.invalidate();
        }
        zb5 zb5Var = this.M4;
        if (zb5Var != null && !this.Q4 && zb5Var.getParent() != null) {
            this.b.removeView(this.M4);
        }
        zb5 zb5Var2 = this.M4;
        if (zb5Var2 != null) {
            zb5Var2.setProgressToAvatarPreview(0.0f);
            this.M4.setAboutVisible(false);
            this.M4.getAvatarImageView().setAlpha(1.0f);
        }
        o95 o95Var = this.P4;
        if (o95Var != null) {
            o95Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.M4 = null;
        this.N4 = null;
        this.P4 = null;
        this.O4 = null;
    }

    public final void U0(boolean z) {
        if (this.R4 || !this.Y3) {
            return;
        }
        if (z) {
            this.R4 = true;
            t1(false, this.M4);
            return;
        }
        S0();
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
            E0(true);
        }
        J0();
    }

    public final void V0(int[] iArr, int i) {
        if (j1()) {
            int i2 = aob.Bh;
            iArr[0] = aob.w0(null, i2, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.Ch, false), aob.w0(null, aob.qh, false));
            iArr[2] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, i2, false));
        } else if (i == 0) {
            iArr[0] = aob.w0(null, aob.Ah, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.ph, false), aob.w0(null, aob.qh, false));
            iArr[2] = aob.w0(null, aob.oh, false);
        } else if (i == 1) {
            iArr[0] = aob.w0(null, aob.xh, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.sh, false), aob.w0(null, aob.th, false));
            iArr[2] = aob.w0(null, aob.rh, false);
        } else if (i1(i)) {
            iArr[0] = aob.w0(null, aob.bi, false);
            iArr[1] = aob.w0(null, aob.ci, false);
            iArr[2] = aob.w0(null, aob.di, false);
        } else {
            int i3 = aob.Bh;
            iArr[0] = aob.w0(null, i3, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.Dh, false), aob.w0(null, aob.Eh, false));
            iArr[2] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, i3, false));
        }
        if (i1(i)) {
            iArr[3] = vm2.f(0.5f, aob.w0(null, aob.Zh, false), aob.w0(null, aob.bi, false));
        } else if (i == 1) {
            iArr[3] = vm2.f(0.75f, aob.w0(null, aob.sh, false), vm2.f(0.5f, aob.w0(null, aob.wh, false), aob.w0(null, aob.yh, false)));
        } else {
            iArr[3] = vm2.f(0.5f, aob.w0(null, aob.Ah, false), aob.w0(null, aob.zh, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W0(wc2 wc2Var) {
        wc2 wc2Var2;
        if (wc2Var == null) {
            this.b2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            g75 g75Var = this.T3;
            if (g75Var.r != null) {
                return;
            }
            boolean z = v5;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.i4;
            t85 t85Var = this.J1;
            byte b = 1;
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!z) {
                if (onPreDrawListener != null) {
                    t85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                if (wc2Var == null) {
                    if (t85Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = t85Var.getViewTreeObserver();
                        i85 i85Var = new i85(this, b);
                        this.i4 = i85Var;
                        viewTreeObserver.addOnPreDrawListener(i85Var);
                        return;
                    }
                    t85Var.setVisibility(0);
                    E0(false);
                    this.l2 = true;
                    ViewTreeObserver viewTreeObserver2 = t85Var.getViewTreeObserver();
                    i85 i85Var2 = new i85(this, objArr == true ? 1 : 0);
                    this.i4 = i85Var2;
                    viewTreeObserver2.addOnPreDrawListener(i85Var2);
                    return;
                }
                c75 c75Var = this.e4;
                if (c75Var.getVisibility() == 0) {
                    g75Var.h(wc2Var);
                    hl.V3(c75Var);
                    return;
                }
                c75Var.setVisibility(0);
                p95 p95Var = this.h4;
                p95Var.G(c75Var, false);
                this.l2 = true;
                if (!g75Var.b) {
                    ArrayList arrayList = p95Var.e;
                    x46 x46Var = (x46) c75Var.getLayoutManager();
                    if (x46Var != null) {
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            if (((wc2) arrayList.get(i)).equals(wc2Var)) {
                                x46Var.g1(i, hl.L(13.0f));
                                break;
                            }
                            i++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = t85Var.getViewTreeObserver();
                z zVar = new z(this, wc2Var, (byte) 3);
                this.i4 = zVar;
                viewTreeObserver3.addOnPreDrawListener(zVar);
                return;
            }
            if (onPreDrawListener != null) {
                t85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            sb5 sb5Var = this.g4;
            ArrayList arrayList3 = this.R3;
            ArrayList arrayList4 = this.S3;
            if (wc2Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    ka5 ka5Var = (ka5) arrayList4.get(i2);
                    q95 q95Var = ka5Var.c;
                    if (q95Var != null) {
                        q95Var.setRenderer(null);
                        o95 o95Var = ka5Var.d;
                        if (o95Var != null) {
                            o95Var.setRenderer(null);
                        }
                        q95 q95Var2 = ka5Var.e;
                        if (q95Var2 != null) {
                            q95Var2.setRenderer(null);
                        }
                        arrayList2.add(ka5Var.x);
                        ka5Var.b(false);
                        ka5Var.animate().alpha(0.0f).setListener(new d85(this, ka5Var, objArr2 == true ? 1 : 0));
                    }
                }
                this.F4 = false;
                sb5Var.H(this.f4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    ka5 ka5Var2 = (ka5) arrayList4.get(i3);
                    if (ka5Var2.e != null && ((wc2Var2 = ka5Var2.x) == null || !wc2Var2.equals(wc2Var))) {
                        arrayList2.add(ka5Var2.x);
                        ka5Var2.b(false);
                        o95 o95Var2 = ka5Var2.d;
                        if (o95Var2 != null) {
                            o95Var2.setRenderer(null);
                        }
                        q95 q95Var3 = ka5Var2.c;
                        if (q95Var3 != null) {
                            q95Var3.setRenderer(null);
                        }
                        ka5Var2.animate().alpha(0.0f).setListener(new d85(this, ka5Var2, b));
                    }
                }
                this.F4 = true;
                sb5Var.r = false;
                if (!arrayList2.isEmpty()) {
                    hl.c3(new se4(this, arrayList2, (byte) 20));
                }
            }
            boolean z2 = !g75Var.b;
            ViewTreeObserver viewTreeObserver4 = t85Var.getViewTreeObserver();
            gp1 gp1Var = new gp1(this, wc2Var, z2);
            this.i4 = gp1Var;
            viewTreeObserver4.addOnPreDrawListener(gp1Var);
        }
    }

    public final int Z0() {
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

    public final long a1() {
        TLRPC.Chat chat = this.S2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void b1(boolean z) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        k5 k5Var = this.n1;
        int i = k5Var.a;
        int i2 = k5Var.a;
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(a1()));
        byte b = 0;
        if (M0 != null && !xc2.t0(M0)) {
            TLRPC.ChatFull N0 = uc7.s1(i2).N0(a1());
            String K = xc2.K(this.S2, false);
            String o = !TextUtils.isEmpty(K) ? qu6.o(uc7.s1(i2).N2, "/", K, new StringBuilder()) : (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(o)) {
                p1(null, o, true, z);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = uc7.l1(this.S2);
            ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new vi1((Object) this, (Object) N0, z, (byte) 4));
            return;
        }
        if (this.T2 != null) {
            int i3 = 0;
            while (i3 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                vc2 vc2Var = this.T2;
                exportgroupcallinvite.call = vc2Var.h(vc2Var.a);
                exportgroupcallinvite.can_self_unmute = i3 == 1;
                ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new f65(this, i3, z, b));
                i3++;
            }
        }
    }

    public final UndoView d1() {
        if (!v5) {
            g75 g75Var = this.T3;
            if (g75Var.b) {
                return g75Var.getUndoView();
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

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        wc2 wc2Var;
        VoIPService sharedInstance;
        byte b;
        byte b2;
        int i3 = jn7.w2;
        t85 t85Var = this.J1;
        String[] strArr = null;
        int i4 = 0;
        byte b3 = 1;
        if (i == i3) {
            Long l = (Long) objArr[1];
            vc2 vc2Var = this.T2;
            if (vc2Var == null || vc2Var.b.id != l.longValue()) {
                return;
            }
            vc2 vc2Var2 = this.T2;
            if (vc2Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j = this.m2;
            byte b4 = 3;
            k5 k5Var = this.n1;
            if (j == 0 && (((b2 = this.z3) == 7 || b2 == 5 || b2 == 6) && !vc2Var2.k())) {
                try {
                    Intent intent = new Intent(this.b2, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", a1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.U2);
                    intent.putExtra("peerChannelId", this.R2.channel_id);
                    intent.putExtra("peerChatId", this.R2.chat_id);
                    intent.putExtra("peerUserId", this.R2.user_id);
                    intent.putExtra("hash", this.V2);
                    intent.putExtra("peerAccessHash", this.R2.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", k5Var.a);
                    intent.putExtra("scheduleDate", this.c4);
                    this.b2.startService(intent);
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                this.m2 = SystemClock.elapsedRealtime();
                hl.d3(new z55(this, b4), 3000L);
            }
            if (j1() && !this.T2.k()) {
                if (this.o2) {
                    return;
                }
                this.o2 = true;
                dismiss();
                return;
            }
            if (!this.n2 && VoIPService.getSharedInstance() != null) {
                this.T2.b(false);
                e1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            F1();
            int childCount = t85Var.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t85Var.getChildAt(i5);
                if (childAt instanceof zb5) {
                    ((zb5) childAt).a(true, false);
                }
            }
            if (this.M4 != null) {
                this.l2 = true;
            } else {
                E0(true);
            }
            N1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.z3 == 4;
            M1(true, booleanValue);
            O1(true);
            if (z && ((b = this.z3) == 1 || b == 0)) {
                d1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l2 = (Long) objArr[3];
                long longValue = l2.longValue();
                if (longValue != 0) {
                    if (h1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                        return;
                    }
                    try {
                        ArrayList arrayList = uc7.s1(k5Var.a).y;
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
                    if (wf3.D(longValue)) {
                        TLRPC.User X1 = uc7.s1(k5Var.a).X1(l2);
                        if (X1 != null) {
                            if (this.T2.b.participants_count < 250 || lbc.y(X1) || X1.verified || i4 != 0) {
                                d1().k(0L, 44, X1, this.S2, null, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-longValue));
                    if (M0 != null) {
                        if (this.T2.b.participants_count < 250 || !xc2.r0(M0) || M0.verified || i4 != 0) {
                            d1().k(0L, 44, M0, this.S2, null, null);
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
        if (i == jn7.y2) {
            g75 g75Var = this.T3;
            if (g75Var.b && this.T2 != null) {
                boolean c = g75Var.c();
                vc2 vc2Var3 = this.T2;
                if (vc2Var3 != null && g75Var.b && (wc2Var = g75Var.e) != null && vc2Var3.d.f(r47.B1(wc2Var.a.peer)) == null) {
                    c = true;
                }
                if (c) {
                    wc2 wc2Var2 = null;
                    while (true) {
                        ArrayList arrayList2 = this.j2;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        wc2 wc2Var3 = (wc2) arrayList2.get(i4);
                        if (this.T2.P.g(r47.B1(wc2Var3.a.peer), null) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = wc2Var3.a;
                            if (!groupCallParticipant3.muted_by_you && g75Var.d != r47.B1(groupCallParticipant3.peer)) {
                                wc2Var2 = wc2Var3;
                            }
                        }
                        i4++;
                    }
                    if (wc2Var2 != null) {
                        W0(wc2Var2);
                    }
                }
            }
            g75Var.setVisibleParticipant(true);
            N1();
            return;
        }
        if (i == jn7.Q4) {
            x1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i == jn7.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                AlertDialog$Builder K = jj.K(getContext(), ob6.M0(2131742958, null), "GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str) ? xc2.W(this.S2) ? ob6.M0(2131743104, null) : ob6.M0(2131742971, null) : ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) ? xc2.W(this.S2) ? ob6.M0(2131743130, null) : ob6.M0(2131743022, null) : c00.k(new StringBuilder(ob6.M0(2131751070, null)), "\n", str));
                K.i(new e65(this, b3));
                try {
                    K.o();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i == jn7.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == a1()) {
                F1();
                M1(isShowing(), false);
            }
            long B1 = r47.B1(this.u2);
            vc2 vc2Var4 = this.T2;
            if (vc2Var4 == null || chatFull.id != (-B1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) vc2Var4.d.f(B1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            E0(true);
            hl.V3(t85Var);
            if (this.u4 != null) {
                while (i4 < this.u4.getChildCount()) {
                    View childAt2 = this.u4.getChildAt(i4);
                    if ((childAt2 instanceof b8) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((b8) childAt2).j(ob6.M0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743158 : 2131743068, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (i == jn7.u1) {
            if (((Long) objArr[0]).longValue() == a1()) {
                F1();
                M1(isShowing(), false);
                return;
            }
            return;
        }
        if (i == jn7.B2) {
            int childCount2 = t85Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i4 < childCount2) {
                f89 H = t85Var.H(t85Var.getChildAt(i4));
                if (H != null) {
                    View view = H.a;
                    if (view instanceof zb5) {
                        zb5 zb5Var = (zb5) view;
                        if (zb5Var.getParticipant() != null) {
                            zb5Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i4++;
            }
            return;
        }
        if (i == jn7.E0) {
            Long l3 = (Long) objArr[0];
            long B12 = r47.B1(this.u2);
            if (this.T2 == null || B12 != l3.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(B12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            E0(true);
            hl.V3(t85Var);
            if (this.u4 != null) {
                while (i4 < this.u4.getChildCount()) {
                    View childAt3 = this.u4.getChildAt(i4);
                    if ((childAt3 instanceof b8) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((b8) childAt3).j(ob6.M0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743159 : 2131743069, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (i == jn7.j0) {
            E0(true);
            hl.V3(t85Var);
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i7 = uc7.r5;
            if ((intValue & 16) != 0) {
                E0(true);
            } else if ((intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            hl.V3(t85Var);
            return;
        }
        if (i == jn7.z2) {
            c85 c85Var = this.t2;
            if (c85Var != null) {
                c85Var.a(true, true);
            }
            F1();
            return;
        }
        if (i == jn7.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            qc qcVar = this.i2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            qcVar.b(strArr);
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.remove(this.n4);
        this.b2.setRequestedOrientation(-1);
        t5 = false;
        sd5 sd5Var = this.y3;
        if (sd5Var != null) {
            sd5Var.dismiss();
        }
        this.l2 = true;
        jn7.e().k(jn7.F2, new Object[0]);
        k5 k5Var = this.n1;
        int i = k5Var.a;
        int i2 = k5Var.a;
        jn7.f(i).n(this, jn7.M0);
        jn7.f(i2).n(this, jn7.w2);
        jn7.f(i2).n(this, jn7.T);
        jn7.f(i2).n(this, jn7.u1);
        jn7.f(i2).n(this, jn7.B2);
        jn7.f(i2).n(this, jn7.E0);
        jn7.f(i2).n(this, jn7.j0);
        jn7.f(i2).n(this, 2);
        jn7.f(i2).n(this, jn7.z2);
        jn7.f(i2).n(this, jn7.y2);
        jn7.f(i2).n(this, jn7.U3);
        jn7.e().n(this, jn7.Q4);
        jn7.e().n(this, jn7.D2);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.b2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = CallAudioDevice.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.b2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            CallAudioDevice.setSpeakerMute(z);
            if (isSpeakerMuted != CallAudioDevice.isSpeakerMuted()) {
                d1().j(z ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1() {
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
        vc2 vc2Var = this.T2;
        if (vc2Var == null) {
            vc2 vc2Var2 = sharedInstance.groupCall;
            this.T2 = vc2Var2;
            this.h4.c = vc2Var2;
            this.T3.setGroupCall(vc2Var2);
            vc2Var = this.T2;
            this.g4.c = vc2Var;
        }
        byte b = 0;
        da5 da5Var = this.V1;
        if (da5Var != null) {
            da5Var.F0(this.n1.a, vc2Var.h(false));
        }
        this.H1.setTitleRightMargin(hl.L(48.0f) << 1);
        ArrayList arrayList = this.T2.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i)).lastActiveDate = r6.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        s85 s85Var = this.O1;
        if (s85Var == null || s85Var.getVisibility() != 0) {
            return;
        }
        this.t1.c(R.drawable.calls_decline, -1, aob.w0(null, aob.uh, false), 0.3f, false, ob6.M0(2131743016, null), false, true);
        L1(true);
        this.r3.setText(ob6.M0(xc2.W(this.S2) ? 2131743133 : 2131743032, null));
        t85 t85Var = this.J1;
        t85Var.setVisibility(0);
        s7 s7Var = this.c3;
        s7Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t85Var, (Property<t85, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t85Var, (Property<t85, Float>) View.TRANSLATION_Y, hl.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s85Var, (Property<s85, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s85Var, (Property<s85, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s85Var, (Property<s85, Float>) property, 0.0f);
        ema emaVar = this.N1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, 0.0f);
        ema emaVar2 = this.P1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(emaVar2, (Property<ema, Float>) property2, 0.0f), ObjectAnimator.ofFloat(emaVar2, (Property<ema, Float>) property3, 0.0f), ObjectAnimator.ofFloat(emaVar2, (Property<ema, Float>) property, 0.0f), ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(k43.g);
        animatorSet.addListener(new j85(this, b));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void f1(long j, boolean z) {
        if (this.T2 != null) {
            k5 k5Var = this.n1;
            TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(j));
            if (X1 != null) {
                byte b = 0;
                id[] idVarArr = {new id(3, null, getContext())};
                TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                vc2 vc2Var = this.T2;
                invitetogroupcall.call = vc2Var.h(vc2Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = X1.id;
                tL_inputUser.access_hash = X1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(k5Var.a).sendRequest(invitetogroupcall, new k65(this, j, idVarArr, X1, z, invitetogroupcall));
                if (sendRequest != 0) {
                    hl.d3(new l65(this, idVarArr, sendRequest, b), 500L);
                }
            }
        }
    }

    public final boolean g1() {
        int L = hl.L(74.0f);
        float f = this.s2 - L;
        return (((((float) this.t0) + f) > ((float) a.getCurrentActionBarHeight()) ? 1 : ((((float) this.t0) + f) == ((float) a.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) a.getCurrentActionBarHeight()) - f) - ((float) this.t0)) / ((float) ((L - this.t0) - hl.L(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean h1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // nx0
    public final boolean j0() {
        t5 = true;
        jn7.e().k(jn7.F2, new Object[0]);
        ra5.k(getContext());
        return false;
    }

    public final boolean j1() {
        vc2 vc2Var = this.T2;
        return vc2Var != null && vc2Var.b.rtmp_stream;
    }

    public final void k1(LaunchActivity launchActivity, vc2 vc2Var, View view, int i) {
        TLRPC.Chat chat;
        final Long l;
        boolean z;
        final uc2 uc2Var;
        if (view instanceof q95) {
            W0(((q95) view).getParticipant());
            return;
        }
        if (view instanceof zb5) {
            B1((zb5) view);
            return;
        }
        boolean z2 = view instanceof r95;
        final byte b = 0;
        final byte b2 = 1;
        e95 e95Var = this.I1;
        if (!z2) {
            if (i != e95Var.x) {
                if (i != e95Var.y) {
                    if (i == e95Var.E) {
                        q1();
                        return;
                    }
                    return;
                }
                vc2 vc2Var2 = this.T2;
                if (vc2Var2 == null || vc2Var2.b == null) {
                    return;
                }
                sbc sbcVar = new sbc(launchActivity, this.a, new w53());
                vc2 vc2Var3 = this.T2;
                sbcVar.s2.addAll(vc2Var3 != null ? (Collection) Collection.-EL.stream(vc2Var3.e).map(new yz((byte) 8)).collect(Collectors.toSet()) : null);
                sbcVar.g1(false, true);
                sbcVar.r2 = new z55(this, (byte) 9);
                sbcVar.g1(false, true);
                sbcVar.t2 = new qe2((Object) this, (Object) vc2Var, (byte) 25);
                sbcVar.show();
                return;
            }
            if (xc2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && xc2.t0(chat)) {
                b1(false);
                return;
            }
            k5 k5Var = this.n1;
            TLRPC.ChatFull N0 = uc7.s1(k5Var.a).N0(a1());
            if (N0 != null) {
                this.q2 = false;
                Context context = getContext();
                int i2 = k5Var.a;
                TLRPC.Chat chat2 = this.S2;
                vc2 vc2Var4 = this.T2;
                sd5 sd5Var = new sd5(context, i2, chat2, N0, vc2Var4.d, vc2Var4.n);
                this.y3 = sd5Var;
                sd5Var.setOnDismissListener(new e65(this, (byte) 3));
                sd5 sd5Var2 = this.y3;
                sd5Var2.a2 = new p65(this);
                sd5Var2.show();
                return;
            }
            return;
        }
        r95 r95Var = (r95) view;
        if (r95Var.getUser() != null) {
            if (!h1()) {
                this.b2.N0(this.a);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", r95Var.getUser().id);
                if (r95Var.a.getImageReceiver().E()) {
                    bundle.putBoolean("expandPhoto", true);
                }
                this.b2.t0(new ProfileActivity(bundle, null));
                dismiss();
                return;
            }
            int i3 = i - e95Var.n;
            if (i3 < 0 || i3 >= this.T2.m.size()) {
                int i4 = i - e95Var.s;
                if (i4 < 0 || i4 >= this.T2.l.size()) {
                    int i5 = i - e95Var.f;
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
                    if (!z || (uc2Var = (uc2) this.T2.k.get(l)) == null) {
                    }
                    fu5 G = fu5.G(this.c, this.J0, r95Var);
                    G.k(R.drawable.msg_endcall, ob6.M0(2131749214, null), new Runnable(this) { // from class: i65
                        public final /* synthetic */ j95 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            final byte b4 = 0;
                            Long l2 = l;
                            uc2 uc2Var2 = uc2Var;
                            final j95 j95Var = this.b;
                            final byte b5 = 1;
                            j95Var.getClass();
                            switch (b3) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite.msg_id = uc2Var2.a;
                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: j65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b5;
                                            j95 j95Var2 = j95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    vc2 vc2Var5 = j95Var.T2;
                                    if (vc2Var5 != null) {
                                        uc2Var2.b = false;
                                        vc2Var5.k.put(l2, uc2Var2);
                                        j95Var.E0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite2.msg_id = uc2Var2.a;
                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: j65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            j95 j95Var2 = j95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(uc2Var2.a));
                                    uc7.s1(j95Var.a).X(arrayList2, null, null, 0L, 0, true, 0);
                                    vc2 vc2Var6 = j95Var.T2;
                                    if (vc2Var6 != null) {
                                        vc2Var6.j.remove(l2);
                                        j95Var.T2.n.remove(l2);
                                        j95Var.T2.k.remove(l2);
                                        j95Var.E0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, uc2Var.a());
                    G.b(R.drawable.msg_remove, ob6.M0(2131749225, null), new Runnable(this) { // from class: i65
                        public final /* synthetic */ j95 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final byte b4 = 0;
                            Long l2 = l;
                            uc2 uc2Var2 = uc2Var;
                            final j95 j95Var = this.b;
                            final byte b5 = 1;
                            j95Var.getClass();
                            switch (b3) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite.msg_id = uc2Var2.a;
                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: j65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b5;
                                            j95 j95Var2 = j95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    vc2 vc2Var5 = j95Var.T2;
                                    if (vc2Var5 != null) {
                                        uc2Var2.b = false;
                                        vc2Var5.k.put(l2, uc2Var2);
                                        j95Var.E0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    declineconferencecallinvite2.msg_id = uc2Var2.a;
                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: j65
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            j95 j95Var2 = j95Var;
                                            switch (b6) {
                                                case 0:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    if (!(tLObject instanceof TLRPC.Updates)) {
                                                        j95Var2.getClass();
                                                        break;
                                                    } else {
                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(uc2Var2.a));
                                    uc7.s1(j95Var.a).X(arrayList2, null, null, 0L, 0, true, 0);
                                    vc2 vc2Var6 = j95Var.T2;
                                    if (vc2Var6 != null) {
                                        vc2Var6.j.remove(l2);
                                        j95Var.T2.n.remove(l2);
                                        j95Var.T2.k.remove(l2);
                                        j95Var.E0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    G.X(aob.c0(hl.L(8.0f), hl.L(8.0f), this.w2.getColor()));
                    G.s = (short) 96;
                    G.a0();
                    return;
                }
                l = (Long) this.T2.l.get(i - e95Var.s);
            } else {
                l = (Long) this.T2.m.get(i - e95Var.n);
            }
            z = true;
            if (z) {
            }
        }
    }

    public final void l1(nx0 nx0Var, id idVar, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (this.q2) {
            return;
        }
        e eVar = (e) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
        if (eVar instanceof zu1) {
            boolean fa = ((zu1) eVar).fa();
            this.q2 = true;
            this.r2 = true;
            hl.d3(new lg((Object) nx0Var, (Object) editTextBoldCursor, z, (Object) idVar, (byte) 19), fa ? 200L : 0L);
            return;
        }
        this.q2 = true;
        this.r2 = true;
        if (nx0Var != null) {
            nx0Var.w0(true);
        } else if (idVar != null) {
            idVar.k(true);
        }
        if (z) {
            hl.d3(new l(editTextBoldCursor, (byte) 5), 100L);
        }
    }

    public final void n1() {
        w5 = true;
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ka5) arrayList.get(i)).j(false);
        }
        r85 r85Var = this.E1;
        pvc pvcVar = r85Var.w;
        if (pvcVar != null) {
            pvcVar.b(false);
        }
        r85Var.G = true;
        this.A1.r();
    }

    public final void o1() {
        w5 = false;
        this.I1.f();
        c75 c75Var = this.e4;
        if (c75Var.getVisibility() == 0) {
            this.h4.G(c75Var, false);
        }
        if (v5) {
            this.g4.I(this.f4, false);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ka5) arrayList.get(i)).j(true);
        }
        r85 r85Var = this.E1;
        pvc pvcVar = r85Var.w;
        if (pvcVar != null) {
            pvcVar.b(true);
        }
        r85Var.G = false;
        this.A1.s();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        L1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            x1(0.0f);
        }
        t85 t85Var = this.J1;
        if (t85Var.getVisibility() == 0) {
            hl.V3(t85Var);
        }
        c75 c75Var = this.e4;
        if (c75Var.getVisibility() == 0) {
            hl.V3(c75Var);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ka5) arrayList.get(i)).j(true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        c85 c85Var = this.t2;
        if (c85Var != null) {
            c85Var.a(false, false);
            return;
        }
        if (this.Y3) {
            U0(true);
        } else if (this.T3.b) {
            W0(null);
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
            ((ka5) arrayList.get(i)).j(true);
        }
        c85 c85Var = this.t2;
        if (c85Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        c85Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // nx0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.add(this.n4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        this.M3 = i;
        M1(isShowing(), false);
    }

    @Override // nx0
    public final void p0() {
        try {
            super.p0();
            RadialProgressView radialProgressView = this.X1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(aob.w0(null, aob.Fh, false));
            }
            s7 s7Var = this.b3;
            if (s7Var != null) {
                int i = aob.Yg;
                s7Var.O(aob.w0(null, i, false), false);
                s7Var.O(aob.w0(null, i, false), true);
                s7Var.setPopupItemsSelectorColor(aob.w0(null, aob.Vg, false));
            }
            int w0 = aob.w0(null, aob.Yg, false);
            A1(this.s3, w0);
            A1(this.t3, w0);
            A1(this.g3, w0);
            A1(this.h3, w0);
            A1(this.i3, w0);
            A1(this.r3, aob.w0(null, aob.mh, false));
            A1(this.e3, w0);
            A1(this.f3, w0);
            A1(this.m3, w0);
            A1(this.n3, w0);
            A1(this.o3, w0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p1(String str, String str2, boolean z, boolean z2) {
        boolean z3;
        String str3;
        String str4;
        String str5;
        if (j1() && str != null) {
            str2 = null;
        }
        if (z2) {
            if (str == null) {
                str = str2;
            }
            hl.g(str);
            if (hl.C3()) {
                d1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.b2;
        if (launchActivity != null) {
            e eVar = (e) launchActivity.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
            if (eVar instanceof zu1) {
                z3 = ((zu1) eVar).fa();
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
                    str5 = xc2.W(this.S2) ? ob6.a0("VoipChannelInviteText", null, 2131743132, str4) : ob6.a0("VoipGroupInviteText", null, 2131743024, str4);
                }
                l85 l85Var = new l85(this, getContext(), str5, str3, str4, str3);
                this.k2 = l85Var;
                byte b = 7;
                l85Var.n2 = new v34(this, b);
                l85Var.setOnDismissListener(new e65(this, (byte) 2));
                hl.d3(new z55(this, b), !z3 ? 200L : 0L);
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
        l85 l85Var2 = new l85(this, getContext(), str5, str3, str4, str3);
        this.k2 = l85Var2;
        byte b2 = 7;
        l85Var2.n2 = new v34(this, b2);
        l85Var2.setOnDismissListener(new e65(this, (byte) 2));
        hl.d3(new z55(this, b2), !z3 ? 200L : 0L);
    }

    public final void q1() {
        vc2 vc2Var = this.T2;
        if (vc2Var == null || vc2Var.b == null) {
            return;
        }
        id idVar = new id(3, null, getContext());
        idVar.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.T2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new fn0((Object) this, (Object) idVar, (Object) exportgroupcallinvite, (byte) 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean[], fd, java.lang.String, vnb] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String, vnb] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void s1(TLRPC.GroupCallParticipant groupCallParticipant, final long j, int i) {
        String str;
        ?? r12;
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
        FrameLayout frameLayout;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            k5 k5Var = this.n1;
            TLObject X1 = j > 0 ? uc7.s1(k5Var.a).X1(Long.valueOf(j)) : uc7.s1(k5Var.a).M0(Long.valueOf(-j));
            if (i == 0 || i == 2 || i == 3) {
                if (i == 0) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().editCallMember(X1, Boolean.TRUE, null, null, null, null);
                        d1().k(0L, 30, X1, null, null, null);
                        return;
                    }
                    return;
                }
                ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
                int i5 = aob.gh;
                id idVar = alertDialog$Builder.a;
                idVar.J = i5;
                TextView textView2 = new TextView(getContext());
                int i6 = aob.Yg;
                yob.X(textView2, i6, null);
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((ob6.a0 ? 5 : 3) | 48);
                ?? frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder.n(frameLayout2);
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.s(hl.L(12.0f));
                de0 de0Var = new de0(getContext());
                de0Var.setRoundRadius(hl.L(20.0f));
                frameLayout2.addView(de0Var, tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                rb0Var.o(X1);
                boolean z2 = X1 instanceof TLRPC.User;
                if (z2) {
                    TLRPC.User user = (TLRPC.User) X1;
                    de0Var.f(user, rb0Var);
                    str = lbc.k(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) X1;
                    de0Var.f(chat, rb0Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                qd4.w(textView3, i6, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((ob6.a0 ? 5 : 3) | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.S2;
                String str5 = chat2 != null ? chat2.title : "";
                if (i != 2) {
                    textView3.setText(ob6.M0(2131743054, null));
                    uh9.r(null, null, 2131743055, new Object[]{str, str5}, textView2);
                } else if (h1()) {
                    textView3.setText(ob6.M0(2131743073, null));
                    uh9.r(null, null, 2131743074, new Object[]{str}, textView2);
                } else {
                    textView3.setText(ob6.M0(2131742997, null));
                    if (xc2.W(this.S2)) {
                        uh9.r(null, null, 2131743116, new Object[]{str, str5}, textView2);
                    } else {
                        uh9.r(null, null, 2131742998, new Object[]{str, str5}, textView2);
                    }
                }
                boolean z3 = ob6.a0;
                frameLayout2.addView(textView3, tre.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 21 : 76, 11.0f, z3 ? 76 : 21, 0.0f));
                frameLayout2.addView(textView2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i == 2) {
                    r12 = 0;
                    alertDialog$Builder.j(ob6.M0(2131742963, null), new u34(this, X1, (byte) 5));
                } else {
                    r12 = 0;
                    r12 = 0;
                    if (z2) {
                        alertDialog$Builder.j(ob6.M0(2131743056, null), new ps0((Object) this, X1, j, (byte) 4));
                    }
                }
                alertDialog$Builder.g(ob6.M0(2131752570, r12), r12);
                idVar.j(aob.w0(r12, aob.lh, false));
                idVar.show();
                if (i != 2 || (textView = (TextView) idVar.c(-1)) == null) {
                    return;
                }
                yob.X(textView, aob.mh, r12);
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
                this.b2.t0(new zu1(bundle));
                dismiss();
                return;
            }
            if (i == 8) {
                this.b2.N0(this.a);
                e eVar = (e) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
                if ((eVar instanceof zu1) && ((zu1) eVar).a() == j) {
                    dismiss();
                    return;
                }
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                this.b2.t0(new zu1(bundle2));
                dismiss();
                return;
            }
            if (i == 7) {
                sharedInstance.editCallMember(X1, Boolean.TRUE, null, null, Boolean.FALSE, null);
                I1(2, true);
                return;
            }
            byte b2 = 10;
            if (i == 9) {
                zn5 zn5Var = this.a4;
                if (zn5Var == null || !zn5Var.g()) {
                    TLRPC.User f = yac.h(k5Var.a).f();
                    zn5 zn5Var2 = new zn5(0, true, true);
                    this.a4 = zn5Var2;
                    zn5Var2.I = true;
                    zn5Var2.S = true;
                    zn5Var2.H = true;
                    zn5Var2.K = true;
                    zn5Var2.T = true;
                    zn5Var2.a = this.b2.N().getLastFragment();
                    zn5 zn5Var3 = this.a4;
                    v85 v85Var = new v85(this, j);
                    this.b4 = v85Var;
                    zn5Var3.b = v85Var;
                    TLRPC.UserProfilePhoto userProfilePhoto = f.photo;
                    zn5Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new z55(this, b2), new h5(b), 0);
                    return;
                }
                return;
            }
            if (i == 10) {
                String str6 = groupCallParticipant.about;
                Context context = getContext();
                int i7 = this.a;
                Pattern pattern = jj.a;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                String M0 = j > 0 ? ob6.M0(2131743420, null) : ob6.M0(2131751424, null);
                final id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M0;
                idVar2.U = ob6.M0(j > 0 ? 2131743048 : 2131751427, null);
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setClipChildren(false);
                if (j < 0) {
                    frameLayout = frameLayout3;
                    long j2 = -j;
                    z = false;
                    if (uc7.s1(i7).N0(j2) == null) {
                        uc7.s1(i7).e3(ConnectionsManager.generateClassGuid(), j2, true);
                        z = false;
                    }
                } else {
                    z = 0;
                    frameLayout = frameLayout3;
                }
                NumberTextView numberTextView = new NumberTextView(context);
                EditText editText2 = new EditText(context);
                int i8 = aob.Yg;
                yob.X(editText2, i8, null);
                editText2.setHint(j > 0 ? ob6.M0(2131743420, null) : ob6.M0(2131751424, null));
                editText2.setTextSize(1, 16.0f);
                editText2.setBackground(aob.T(context));
                editText2.setMaxLines(4);
                editText2.setRawInputType(147457);
                editText2.setImeOptions(6);
                int i9 = j > 0 ? 70 : jn7.d4;
                wh whVar = new wh(i9, context, numberTextView);
                InputFilter[] inputFilterArr = new InputFilter[1];
                inputFilterArr[z] = whVar;
                editText2.setFilters(inputFilterArr);
                numberTextView.setCenterAlign(true);
                numberTextView.setTextSize(15);
                numberTextView.setTextColor(aob.w0(null, aob.B6, z));
                numberTextView.setImportantForAccessibility(2);
                ViewGroup viewGroup = frameLayout;
                viewGroup.addView(numberTextView, tre.d(20, 20.0f, ob6.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
                editText2.setPadding(ob6.a0 ? hl.L(24.0f) : 0, hl.L(8.0f), ob6.a0 ? 0 : hl.L(24.0f), hl.L(8.0f));
                editText2.addTextChangedListener(new xh(i9, numberTextView));
                hl.T3(numberTextView, false, 0.0f, true, false);
                editText2.setText(str6);
                editText2.setSelection(editText2.getText().toString().length());
                alertDialog$Builder2.n(viewGroup);
                final lf lfVar = new lf(j, i7, (Object) editText2, (byte) 0);
                alertDialog$Builder2.j(ob6.M0(2131745674, null), lfVar);
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                idVar2.O = new we(editText2, true ? 1 : 0);
                viewGroup.addView(editText2, tre.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                editText2.requestFocus();
                hl.E3(editText2);
                editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mf
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView4, int i10, KeyEvent keyEvent) {
                        if (i10 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                            id idVar3 = idVar2;
                            if (idVar3.isShowing()) {
                                lfVar.w(idVar3, 0);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                idVar2.j(aob.w0(null, aob.lh, false));
                idVar2.show();
                idVar2.o(aob.w0(null, i8, false));
                return;
            }
            if (i != 11) {
                if (i == 5) {
                    sharedInstance.editCallMember(X1, Boolean.TRUE, null, null, null, null);
                    d1().m(0L, X1, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    i2 = 1;
                    sharedInstance.editCallMember(X1, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    i2 = 1;
                    sharedInstance.editCallMember(X1, Boolean.FALSE, null, 10000, null, null);
                }
                sharedInstance.setParticipantVolume(groupCallParticipant, xc2.H(groupCallParticipant));
                d1().k(0L, i == i2 ? 31 : 36, X1, null, null, null);
                return;
            }
            Context context2 = getContext();
            int i10 = this.a;
            Pattern pattern2 = jj.a;
            if (wf3.D(j)) {
                TLRPC.User X12 = uc7.s1(i10).X1(Long.valueOf(j));
                str2 = X12.first_name;
                str3 = X12.last_name;
            } else {
                str2 = uc7.s1(i10).M0(Long.valueOf(-j)).title;
                str3 = null;
            }
            ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
            if (j > 0) {
                i3 = 2131743067;
                r15 = 0;
            } else {
                r15 = 0;
                i3 = 2131743066;
            }
            String M02 = ob6.M0(i3, r15);
            id idVar3 = alertDialog$Builder3.a;
            idVar3.S = M02;
            LinearLayout j3 = uh9.j(context2, 1);
            EditText editText3 = new EditText(context2);
            int i11 = aob.Yg;
            yob.X(editText3, i11, r15);
            editText3.setTextSize(1, 16.0f);
            editText3.setMaxLines(1);
            editText3.setLines(1);
            editText3.setSingleLine(true);
            editText3.setGravity(ob6.a0 ? 5 : 3);
            editText3.setInputType(49152);
            editText3.setImeOptions(j > 0 ? 5 : 6);
            if (j > 0) {
                i4 = 2131750654;
                str4 = null;
            } else {
                str4 = null;
                i4 = 2131743065;
            }
            editText3.setHint(ob6.M0(i4, str4));
            editText3.setBackground(aob.T(context2));
            editText3.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
            editText3.requestFocus();
            if (j > 0) {
                editText = new EditText(context2);
                yob.X(editText, i11, null);
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(ob6.a0 ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(ob6.M0(2131748786, null));
                editText.setBackground(aob.T(context2));
                editText.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
            } else {
                editText = null;
            }
            hl.E3(editText3);
            j3.addView(editText3, tre.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                j3.addView(editText, tre.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText3.setText(str2);
            editText3.setSelection(editText3.getText().toString().length());
            if (editText != null) {
                editText.setText(str3);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder3.n(j3);
            EditText editText4 = editText;
            ff ffVar = new ff(editText3, j, i10, editText4);
            alertDialog$Builder3.j(ob6.M0(2131745674, null), ffVar);
            alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
            byte b3 = 0;
            idVar3.O = new gf(editText3, editText4, b3);
            idVar3.j(aob.w0(null, aob.lh, false));
            idVar3.show();
            idVar3.o(aob.w0(null, i11, false));
            hf hfVar = new hf(idVar3, ffVar, b3);
            if (editText4 != null) {
                editText4.setOnEditorActionListener(hfVar);
            } else {
                editText3.setOnEditorActionListener(hfVar);
            }
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        H1();
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 2) {
            P0();
            N0();
            O0();
            float f3 = 1.0f - this.o5.e;
            t65 t65Var = this.o1;
            t65Var.setAlpha(f3);
            this.T3.setProgressToHideUi(f);
            this.e4.invalidate();
            this.b.invalidate();
            t65Var.invalidate();
        }
        if (i == 3) {
            Q0();
            P0();
            R0();
            M0();
            this.b.invalidate();
        }
        if (i == 4) {
            P0();
            this.z1.invalidate();
            this.A1.invalidate();
        }
        if (i == 5) {
            P0();
            this.b.invalidate();
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
    public final void t1(boolean z, zb5 zb5Var) {
        boolean z2;
        int i;
        float f;
        final float f2;
        float f3;
        ka5 ka5Var;
        char c;
        float f4;
        float f5;
        ValueAnimator ofFloat;
        ka5 ka5Var2;
        ka5 ka5Var3;
        float paddingLeft = this.b.getPaddingLeft() + hl.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + hl.L(14.0f);
        boolean z3 = this.Q4;
        i75 i75Var = this.l1;
        t85 t85Var = this.J1;
        if (z3) {
            f2 = (t85Var.getX() + (zb5Var.getX() + zb5Var.getAvatarImageView().getX())) - paddingLeft;
            f = (t85Var.getY() + (zb5Var.getY() + zb5Var.getAvatarImageView().getY())) - paddingTop;
            f3 = zb5Var.getAvatarImageView().getMeasuredHeight() / t85Var.getMeasuredWidth();
            i = (int) ((zb5Var.getAvatarImageView().getMeasuredHeight() >> 1) / f3);
        } else {
            if (this.O4 == null) {
                this.E4 = true;
                z2 = true;
            } else {
                if (!z) {
                    if (i75Var.E0.k(i75Var.getCurrentItem()) != 0) {
                        z2 = false;
                        this.E4 = z2;
                    }
                }
                z2 = true;
                this.E4 = z2;
            }
            q95 q95Var = this.N4;
            g75 g75Var = this.T3;
            if (q95Var == null || !z2) {
                o95 o95Var = this.P4;
                if (o95Var != null) {
                    ka5 ka5Var4 = this.O4;
                    c75 c75Var = this.e4;
                    if (ka5Var4 == null) {
                        float x = (g75Var.getX() + (c75Var.getX() + (this.P4.getX() + o95Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y = (g75Var.getY() + (c75Var.getY() + (this.P4.getY() + this.P4.getAvatarImageView().getY()))) - paddingTop;
                        f3 = this.P4.getAvatarImageView().getMeasuredHeight() / t85Var.getMeasuredWidth();
                        i = (int) ((this.P4.getAvatarImageView().getMeasuredHeight() >> 1) / f3);
                        f = y;
                        f2 = x;
                        if (!this.E4 && (ka5Var = this.O4) != null) {
                            ka5Var.invalidate();
                            g75Var.invalidate();
                            ka5 ka5Var5 = this.O4;
                            ka5Var5.h = false;
                            ka5Var5.j(false);
                            this.O4 = null;
                        }
                    } else if (z2) {
                        f2 = (g75Var.getX() + (c75Var.getX() + o95Var.getX())) - paddingLeft;
                        f = (g75Var.getY() + (c75Var.getY() + this.P4.getY())) - paddingTop;
                        i = 0;
                    }
                }
                i = 0;
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.96f;
                if (!this.E4) {
                    ka5Var.invalidate();
                    g75Var.invalidate();
                    ka5 ka5Var52 = this.O4;
                    ka5Var52.h = false;
                    ka5Var52.j(false);
                    this.O4 = null;
                }
            } else {
                float x2 = (t85Var.getX() + q95Var.getX()) - paddingLeft;
                f = ((t85Var.getY() + this.N4.getY()) + hl.L(2.0f)) - paddingTop;
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
        h75 h75Var = this.t4;
        if (z) {
            k75 k75Var = this.s4;
            k75Var.setScaleX(f7);
            k75Var.setScaleY(f7);
            k75Var.setTranslationX(f2);
            k75Var.setTranslationY(f6);
            h75Var.setAlpha(0.0f);
        }
        i75Var.N(i2, i2);
        if (this.Z3) {
            m75 m75Var = this.U3;
            if (z) {
                m75Var.setAlpha(0.0f);
            }
            ik8.s(m75Var.animate(), z ? 1.0f : 0.0f, 220L);
        }
        ik8.s(h75Var.animate(), z ? 1.0f : 0.0f, 220L);
        if (!z && (ka5Var3 = this.O4) != null) {
            ka5Var3.h = false;
            ka5Var3.j(true);
            if (i75Var.E0.k(i75Var.getCurrentItem()) != 0) {
                ga5 ga5Var = this.O4.a;
                ga5Var.F = false;
                c = 0;
                ga5Var.G = 0L;
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
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c65
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        j95 j95Var = j95.this;
                        j95Var.W3 = floatValue;
                        j95Var.T3.n = floatValue;
                        float f8 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
                        k75 k75Var2 = j95Var.s4;
                        k75Var2.setScaleX(f8);
                        k75Var2.setScaleY(f8);
                        k75Var2.setTranslationX((1.0f - j95Var.W3) * f2);
                        k75Var2.setTranslationY((1.0f - j95Var.W3) * f6);
                        if (!j95Var.Z3) {
                            j95Var.L4.setAlpha((int) (j95Var.W3 * 100.0f));
                        }
                        ka5 ka5Var6 = j95Var.O4;
                        if (ka5Var6 != null) {
                            ka5Var6.a.setRoundCorners((1.0f - j95Var.W3) * hl.L(8.0f));
                        }
                        k75Var2.invalidate();
                        j95Var.b.invalidate();
                        i75 i75Var2 = j95Var.l1;
                        int i3 = (int) ((1.0f - j95Var.W3) * i2);
                        i75Var2.N(i3, i3);
                    }
                });
                this.S4 = jn7.f(this.n1.a).p(new int[]{jn7.b0, jn7.Y1, jn7.C}, this.S4, true);
                ka5Var2 = this.N4 != null ? this.O4 : null;
                if (ka5Var2 != null) {
                    ka5Var2.f = true;
                }
                ofFloat.addListener(new rw((Object) this, (Object) ka5Var2, z, (byte) 4));
                if (!this.Q4 || this.O4 == null) {
                    ofFloat.setInterpolator(k43.f);
                    ofFloat.setDuration(220L);
                    ofFloat.start();
                } else {
                    ofFloat.setInterpolator(k43.f);
                    ofFloat.setDuration(220L);
                    this.O4.a.setAnimateNextDuration(220L);
                    ga5 ga5Var2 = this.O4.a;
                    if (ga5Var2.F) {
                        ga5Var2.H.add(ofFloat);
                    } else {
                        ofFloat.start();
                    }
                }
                J0();
            }
        }
        c = 0;
        if (z) {
        }
        float[] fArr2 = new float[2];
        fArr2[c] = f4;
        fArr2[1] = f5;
        ofFloat = ValueAnimator.ofFloat(fArr2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c65
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j95 j95Var = j95.this;
                j95Var.W3 = floatValue;
                j95Var.T3.n = floatValue;
                float f8 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
                k75 k75Var2 = j95Var.s4;
                k75Var2.setScaleX(f8);
                k75Var2.setScaleY(f8);
                k75Var2.setTranslationX((1.0f - j95Var.W3) * f2);
                k75Var2.setTranslationY((1.0f - j95Var.W3) * f6);
                if (!j95Var.Z3) {
                    j95Var.L4.setAlpha((int) (j95Var.W3 * 100.0f));
                }
                ka5 ka5Var6 = j95Var.O4;
                if (ka5Var6 != null) {
                    ka5Var6.a.setRoundCorners((1.0f - j95Var.W3) * hl.L(8.0f));
                }
                k75Var2.invalidate();
                j95Var.b.invalidate();
                i75 i75Var2 = j95Var.l1;
                int i3 = (int) ((1.0f - j95Var.W3) * i2);
                i75Var2.N(i3, i3);
            }
        });
        this.S4 = jn7.f(this.n1.a).p(new int[]{jn7.b0, jn7.Y1, jn7.C}, this.S4, true);
        if (this.N4 != null) {
        }
        if (ka5Var2 != null) {
        }
        ofFloat.addListener(new rw((Object) this, (Object) ka5Var2, z, (byte) 4));
        if (this.Q4) {
        }
        ofFloat.setInterpolator(k43.f);
        ofFloat.setDuration(220L);
        ofFloat.start();
        J0();
    }

    public final void u1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall h;
        this.A1.setText("");
        vc2 vc2Var = this.T2;
        if (vc2Var == null || vc2Var.b == null || (h = vc2Var.h(vc2Var.a)) == null) {
            return;
        }
        vc2 vc2Var2 = this.T2;
        long j = vc2Var2.b.id;
        TLRPC.Peer peer = vc2Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? wf3.n(peer) : yac.h(this.a).n, tL_textWithEntities, j, h);
    }

    public final void v1(float f) {
        this.N3 = f;
        g75 g75Var = this.T3;
        float max = Math.max(f, g75Var == null ? 0.0f : g75Var.c);
        int i = aob.ah;
        int w0 = aob.w0(null, i, false);
        int i2 = aob.Xg;
        int R0 = hl.R0(f, 1.0f, w0, aob.w0(null, i2, false));
        this.O3 = R0;
        this.G1.setBackgroundColor(R0);
        this.b3.I(-14472653);
        this.Y1.setColorFilter(new PorterDuffColorFilter(this.O3, PorterDuff.Mode.MULTIPLY));
        this.H0 = hl.R0(max, 1.0f, aob.w0(null, i, false), aob.w0(null, i2, false));
        int R02 = hl.R0(f, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, aob.kh, false));
        qc qcVar = this.i2;
        if (qcVar != null) {
            qcVar.b = R02;
            tb tbVar = (tb) qcVar.i;
            if (tbVar != null) {
                tbVar.invalidate();
            }
        }
        this.w2.setColor(R02);
        this.x1.setColor(R02);
        this.y1.invalidate();
        t85 t85Var = this.J1;
        t85Var.setGlowColor(R02);
        byte b = this.z3;
        if (b == 3 || i1(b)) {
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
        int R03 = hl.R0(f, 1.0f, aob.w0(null, aob.uh, false), aob.w0(null, aob.vh, false));
        this.t1.a(R03, R03);
        int R04 = hl.R0(f, 1.0f, aob.w0(null, aob.ch, false), aob.w0(null, aob.fh, false));
        int R05 = hl.R0(f, 1.0f, aob.w0(null, aob.dh, false), aob.w0(null, aob.ih, false));
        int v0 = aob.v0(aob.Fi, this.J0);
        int childCount = t85Var.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = t85Var.getChildAt(i4);
            if (childAt instanceof tb5) {
                tb5 tb5Var = (tb5) childAt;
                if (h1()) {
                    tb5Var.a(v0, v0);
                } else {
                    tb5Var.a(R05, R04);
                }
            } else {
                boolean z = childAt instanceof zb5;
                e85 e85Var = this.H1;
                if (z) {
                    ((zb5) childAt).f(e85Var.getTag() != null ? aob.ih : aob.dh, R05);
                } else if (childAt instanceof r95) {
                    ((r95) childAt).a(e85Var.getTag() != null ? aob.ih : aob.dh, R05);
                }
            }
        }
        this.b.invalidate();
        t85Var.invalidate();
        this.c.invalidate();
    }

    public final void w1(boolean z) {
        if (this.T2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        vc2 vc2Var = this.T2;
        togglegroupcallsettings.call = vc2Var.h(vc2Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.m5 = Boolean.valueOf(z);
        E1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        to3 to3Var = Utilities.d;
        Objects.requireNonNull(to3Var);
        byte b = 0;
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new pe2(to3Var, b), new h65(this, b));
    }

    public final void x1(float f) {
        t85 t85Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f89 L;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        vc2 vc2Var = this.T2;
        if (vc2Var == null || (t85Var = this.J1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(r47.B1(this.u2))) == null) {
            return;
        }
        g75 g75Var = this.T3;
        if (g75Var.b) {
            int i = 0;
            while (true) {
                c75 c75Var = this.e4;
                if (i >= c75Var.getChildCount()) {
                    break;
                }
                o95 o95Var = (o95) c75Var.getChildAt(i);
                if (r47.B1(o95Var.getParticipant().peer) == r47.B1(groupCallParticipant.peer)) {
                    o95Var.setAmplitude(f * 15.0f);
                }
                i++;
            }
        } else {
            int indexOf = (this.l2 ? this.x2 : this.T2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (L = t85Var.L(indexOf + this.I1.d)) != null) {
                View view = L.a;
                if (view instanceof zb5) {
                    ((zb5) view).setAmplitude(f * 15.0f);
                    if (view == this.M4 && !this.d4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        g75Var.i(groupCallParticipant, f * 15.0f);
    }

    public final void y1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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

    public final void z1(float f) {
        int i;
        this.s2 = f;
        this.J1.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float L = f - hl.L(74.0f);
        float f2 = this.t0 + L;
        float currentActionBarHeight = a.getCurrentActionBarHeight() << 1;
        g75 g75Var = this.T3;
        a75 a75Var = this.Y2;
        x65 x65Var = this.X2;
        if (f2 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((a.getCurrentActionBarHeight() << 1) - L) - this.t0) / (a.getCurrentActionBarHeight() + ((r0 - this.t0) - hl.L(14.0f))));
            i = (int) (hl.L(hl.O1() ? 17.0f : 13.0f) * min);
            if (Math.abs(Math.min(1.0f, min) - this.N3) > 1.0E-4f) {
                v1(Math.min(1.0f, min));
            }
            float v = bp1.v(min, 0.1f, 1.2f, 1.0f);
            x65Var.setScaleX(Math.max(0.9f, v));
            x65Var.setScaleY(Math.max(0.9f, v));
            float f3 = 1.0f - (min * 1.2f);
            x65Var.setAlpha((1.0f - g75Var.c) * Math.max(0.0f, f3));
            a75Var.setScaleX(Math.max(0.9f, v));
            a75Var.setScaleY(Math.max(0.9f, v));
            a75Var.setAlpha((1.0f - g75Var.c) * Math.max(0.0f, f3));
        } else {
            x65Var.setScaleX(1.0f);
            x65Var.setScaleY(1.0f);
            x65Var.setAlpha(1.0f - g75Var.c);
            a75Var.setScaleX(1.0f);
            a75Var.setScaleY(1.0f);
            a75Var.setAlpha(1.0f - g75Var.c);
            if (this.N3 > 1.0E-4f) {
                v1(0.0f);
            }
            i = 0;
        }
        P0();
        float f4 = i;
        this.u3.setTranslationY(Math.max(hl.L(4.0f), (f - hl.L(53.0f)) - f4));
        this.a3.setTranslationY(Math.max(hl.L(4.0f), (f - hl.L(44.0f)) - f4));
        z75 z75Var = this.K1;
        if (z75Var != null) {
            z75Var.setTranslationY(Math.max(hl.L(4.0f), (f - hl.L(44.0f)) - f4));
        }
        this.b.invalidate();
        P1();
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

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
