package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.Objects;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.d implements jm7, hk3, gha, vn5, cga, aj6 {
    public static final RectF e7 = new RectF();
    public static final int f7 = gm.L(16.0f);
    public ylb A0;
    public boolean A1;
    public String A2;
    public int A3;
    public int A4;
    public boolean A5;
    public s09 A6;
    public byte B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public boolean B5;
    public final int[] B6;
    public gn5 C0;
    public vh6 C1;
    public int C2;
    public int C3;
    public int C4;
    public ImageReceiver C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public FrameLayout D5;
    public CharSequence D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public FrameLayout[] E5;
    public CharSequence E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public SpannableStringBuilder F5;
    public boolean F6;
    public tm G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public SpannableStringBuilder G5;
    public float G6;
    public tm H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public b61[] H5;
    public float H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public i71 I5;
    public float I6;
    public x43 J;
    public boolean J0;
    public byte J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public FrameLayout J5;
    public float J6;
    public x43 K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public b61 K5;
    public vq8 K6;
    public hs9 L;
    public boolean L0;
    public boolean L1;
    public gn5 L2;
    public int L3;
    public int L4;
    public float L5;
    public cr8 L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public int M4;
    public View M5;
    public hg5 M6;
    public mq8 N;
    public boolean N0;
    public boolean N1;
    public xib N2;
    public int N3;
    public int N4;
    public int N5;
    public int N6;
    public wp8 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public Boolean O6;
    public a1b P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public int P5;
    public TLRPC.TL_emojiStatusCollectible P6;
    public boolean Q;
    public zja Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public int Q6;
    public fha R;
    public zja R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public nm0 R5;
    public boolean R6;
    public boolean S;
    public zja S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public final lj4 S5;
    public int S6;
    public ita T;
    public zja T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public fr8 T5;
    public int T6;
    public sb U;
    public zja U0;
    public int U1;
    public int U2;
    public int U3;
    public int U4;
    public float U5;
    public int U6;
    public p09 V;
    public a8 V0;
    public float V1;
    public int V2;
    public int V3;
    public int V4;
    public int V5;
    public final jz4 V6;
    public p09 W;
    public a8 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public boolean W4;
    public float W5;
    public final km0 W6;
    public hg5 X;
    public a8 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public final fn0 X5;
    public dh0 X6;
    public ne6 Y;
    public ImageView Y0;
    public s34 Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public gp8 Y5;
    public final Paint Y6;
    public su Z;
    public a8 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public final ArrayList Z4;
    public AnimatorSet Z5;
    public Drawable Z6;
    public po8 a;
    public qn8 a0;
    public trc a1;
    public float a2;
    public int a3;
    public int a4;
    public final ArrayList a5;
    public AnimatorSet a6;
    public Drawable a7;
    public r59 b;
    public jc7 b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public byte b5;
    public float b6;
    public Drawable b7;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ro8 c;
    public mt8 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public boolean c5;
    public boolean c6;
    public pn2 c7;
    public lq8 d;
    public yq8 d0;
    public xq8 d1;
    public float d2;
    public int d3;
    public int d4;
    public boolean d5;
    public final ep8 d6;
    public final int[] d7;
    public uq8 e;
    public yn e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public dp8 e5;
    public View e6;
    public mt1 f;
    public yo8 f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public View f5;
    public int f6;
    public AnimatorSet g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public float g5;
    public int g6;
    public String h;
    public sb5 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public int h5;
    public CharSequence h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public int i5;
    public boolean i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public int j5;
    public final cp8 j6;
    public ImageView k0;
    public boolean k1;
    public ValueAnimator k2;
    public int k3;
    public int k4;
    public long k5;
    public float[] k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public boolean l5;
    public float l6;
    public sqb m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public boolean m5;
    public float m6;
    public String n;
    public lr8 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public String n5;
    public boolean n6;
    public zo8 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public String o5;
    public fq8 o6;
    public nq8 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public String p5;
    public float p6;
    public pc0 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public nk3 q5;
    public final RectF q6;
    public ap8 r;
    public wn5 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public f02 r5;
    public float r6;
    public s09 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public final HashSet s5;
    public ec7 s6;
    public sqb t0;
    public boolean t1;
    public tr0 t2;
    public int t3;
    public int t4;
    public dq8 t5;
    public final SparseIntArray t6;
    public bt8 u0;
    public int u1;
    public up0 u2;
    public int u3;
    public int u4;
    public final ep8 u5;
    public int u6;
    public bp8 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public final kp8 v5;
    public AnimatorSet v6;
    public AnimatorSet w;
    public xs8 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public boolean w5;
    public int w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public ir8 x2;
    public int x3;
    public int x4;
    public up8 x5;
    public int x6;
    public Drawable y;
    public final xo8 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public float y5;
    public boolean y6;
    public final Paint z0;
    public boolean z1;
    public zq8 z2;
    public int z3;
    public int z4;
    public float z5;
    public boolean z6;

    public ProfileActivity(Bundle bundle, fha fhaVar) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        this.y0 = new xo8(this, (byte) 0);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new vh6();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.R1 = 1.0f;
        this.Z1 = new HashMap();
        this.n2 = new float[]{0.0f, 1.0f};
        this.r2 = new Paint();
        this.C2 = -1;
        this.M2 = new Rect();
        this.Z4 = new ArrayList();
        this.a5 = new ArrayList();
        this.b5 = (byte) 0;
        this.c5 = true;
        this.d5 = true;
        this.h5 = 0;
        this.i5 = 0;
        this.j5 = 0;
        this.k5 = 0L;
        this.s5 = new HashSet();
        this.u5 = new ep8(this, (byte) 0);
        this.v5 = new kp8(this);
        this.S5 = new lj4(this);
        this.W5 = 1.0f;
        this.X5 = new fn0(0, new tn8(this, (byte) 7), d53.h, 380L, true);
        this.d6 = new ep8(this, (byte) 1);
        this.j6 = new cp8(this, (byte) 2);
        this.k6 = null;
        this.q6 = new RectF();
        this.t6 = new SparseIntArray();
        this.v6 = null;
        this.w6 = -1;
        this.B6 = new int[3];
        this.C6 = -1.0f;
        jz4 jz4Var = new jz4();
        this.V6 = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.W6 = km0Var;
        this.Y6 = new Paint();
        this.d7 = new int[7];
        this.R = fhaVar;
        km0Var.g = new g79(0, false);
    }

    public static void G1(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = e7;
        if (zgc.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            tl0.b(new ms0(view, (byte) 7), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void O2(String str, StringBuilder sb) {
        String[] supportedTypes;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i2].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i));
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb.append("\n");
            sb.append(arrayList.size());
            sb.append("+");
            sb.append(arrayList2.size());
            sb.append(" ");
            sb.append(str.substring(6));
            sb.append(" codecs:\n");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i3)).intValue());
                sb.append("{d} ");
                sb.append(codecInfoAt2.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType.getMaxSupportedInstances());
                sb.append(")");
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (i4 > 0 || !arrayList.isEmpty()) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i4)).intValue());
                sb.append("{e} ");
                sb.append(codecInfoAt3.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType2.getMaxSupportedInstances());
                sb.append(")");
            }
            sb.append("\n");
        } catch (Exception unused) {
        }
    }

    public static SpannableStringBuilder Q1(String str, int i, ylb ylbVar) {
        int v0 = cmb.v0(i, ylbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        op8 op8Var = new op8(9);
        op8Var.w = str;
        if (op8Var.c != null) {
            op8Var.c = null;
            op8Var.a();
        }
        op8Var.f = v0;
        op8Var.n = false;
        spannableStringBuilder.setSpan(op8Var, 0, spannableStringBuilder.length(), 0);
        of4[] of4VarArr = (of4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), of4.class);
        if (of4VarArr != null) {
            for (of4 of4Var : of4VarArr) {
                of4Var.getClass();
                of4Var.f = cmb.v0(i, ylbVar);
                of4Var.r = i;
                of4Var.s = ylbVar;
                of4Var.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static ProfileActivity S2(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void p3(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        he heVar = new he(3, null, activity);
        heVar.j0 = false;
        heVar.show();
        Utilities.e.c(new yl6((Object) heVar, z, (Object) activity, (byte) 17));
    }

    public static void s3(FrameLayout frameLayout, float f) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(f7 * f);
        frameLayout.setAlpha(1.0f - f);
        frameLayout.setVisibility(f < 1.0f ? 0 : 4);
    }

    public static void x3(int i, View view) {
        if (view == null || view.getLayoutParams() == null || view.getLayoutParams().height == i) {
            return;
        }
        view.getLayoutParams().height = i;
        if (view.isLaidOut()) {
            view.setBottom(view.getTop() + i);
        } else {
            view.requestLayout();
        }
    }

    public static void y3(zja zjaVar, boolean z, boolean z2) {
        if (wi8.A(zjaVar)) {
            zjaVar.Y(z, z2);
        } else if (zjaVar != null) {
            zjaVar.setVisibility(z ? 0 : 8);
        }
    }

    public final void A1() {
        org.telegram.ui.ActionBar.a aVar;
        if (this.O == null || (aVar = this.actionBar) == null) {
            return;
        }
        int i = aVar.getOccupyStatusBar() ? gm.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
        int[] iArr = nha.t2;
        int y = kt6.y(6.666f, eh0.d(currentActionBarHeight - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()), currentActionBarHeight);
        int c = eh0.c(i) + currentActionBarHeight + y;
        this.f6 = c;
        this.O.i1(y, c, eh0.c(this.U6), this.U6 + this.S6);
        this.g6 = gm.L(44.0f) + currentActionBarHeight;
        X3();
        I1();
    }

    public final void A2(Context context, long j, View view, int i, float f, float f2) {
        TLRPC.User W1;
        lq8 lq8Var;
        if (getParentActivity() != null) {
            this.a.D0();
            byte b = 2;
            byte b2 = 0;
            if (i >= this.n4 && i < this.o4) {
                mc B0 = getMessagesController().B0();
                int i2 = i - this.n4;
                TL_agent.settings settingsVar = B0.d;
                if (settingsVar == null || i2 >= settingsVar.keys.size()) {
                    return;
                }
                String str = B0.d.keys.get(i2).provider;
                if (TextUtils.equals(str, B0.d.active_provider)) {
                    return;
                }
                TL_agent.settings settingsVar2 = B0.d;
                if (settingsVar2 != null) {
                    settingsVar2.active_provider = str;
                    B0.i();
                }
                TL_agent.setActiveProvider setactiveprovider = new TL_agent.setActiveProvider();
                setactiveprovider.provider = str;
                ConnectionsManager.getInstance(B0.a).sendRequestTyped(setactiveprovider, new kc(b2), new lc(B0, b));
                return;
            }
            if (i == this.p4) {
                c3();
                return;
            }
            if (i == this.T3) {
                TLRPC.User W12 = getMessagesController().W1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.starref_program != null) {
                    long e = getUserConfig().e();
                    ku0.g(this.currentAccount).f(getParentActivity(), e, this.e1, new p2c((Object) this, (Object) context, e, (byte) 7));
                    return;
                } else {
                    if (W12 == null || !W12.bot_can_edit) {
                        return;
                    }
                    presentFragment(new bc(this.e1));
                    return;
                }
            }
            if (i == this.R3) {
                boolean z = !getMessagesController().o2(j, this.g1, null);
                getNotificationsController().G(j, this.g1, z);
                c41.A(this, z, null).j();
                S3();
                int i3 = this.R3;
                if (i3 < 0 || (lq8Var = this.d) == null) {
                    return;
                }
                lq8Var.g(i3);
                return;
            }
            if (i == this.a4) {
                TLRPC.User W13 = getMessagesController().W1(Long.valueOf(this.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", W13.id);
                bundle.putBoolean("addContact", true);
                bundle.putString("phone", this.n5);
                bundle.putString("first_name_card", this.o5);
                bundle.putString("last_name_card", this.p5);
                tu2 tu2Var = new tu2(bundle, this.A0);
                tu2Var.P = new wn8(this, W13);
                presentFragment(tu2Var);
                return;
            }
            if (i == this.X3) {
                TextView textView = (TextView) ik.f0(getParentActivity(), jb6.M0(2131751445, null), jb6.M0(2131751529, null), jb6.M0(2131751528, null), jb6.M0(2131751535, null), new ao8(this, b), this.A0, false).c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                    return;
                }
                return;
            }
            if (i == this.Y3) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = jb6.M0(2131745944, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745965, null);
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.k5));
                oh2[] oh2VarArr = new oh2[1];
                byte b3 = 4;
                if (L0 != null && sd2.w(2, L0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    oh2 oh2Var = new oh2(1, this.A0, getParentActivity());
                    oh2VarArr[0] = oh2Var;
                    oh2Var.setBackgroundDrawable(cmb.L0(false));
                    oh2VarArr[0].e(jb6.M0(2131753692, null), "", true, false, false);
                    oh2VarArr[0].setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                    linearLayout.addView(oh2VarArr[0], qoe.o(-1, -2));
                    oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, b3));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(jb6.M0(2131745963, null), new cz6((Object) this, (Object) oh2VarArr, (byte) 28));
                alertDialog$Builder.g(jb6.M0(2131752542, null), new i98(b3));
                TextView textView2 = (TextView) alertDialog$Builder.o().c(-1);
                if (textView2 != null) {
                    anb.X(textView2, cmb.p7, null);
                    return;
                }
                return;
            }
            if (i == this.z4) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("chat_id", (int) (this.i1 & 4294967295L));
                presentFragment(new xl5(bundle2));
                return;
            }
            if (i == this.y4) {
                showDialog(ik.S(getParentActivity(), this.E2, this.A0).a);
                return;
            }
            if (i == this.O3) {
                X2(view, f, f2, false);
                return;
            }
            if (i == this.T4) {
                getMessagesController().n5(null, this.e1);
                if (c41.a(this)) {
                    c41.d(this, false).j();
                    return;
                }
                return;
            }
            if (i == this.b4) {
                kr0.a(this, this.currentAccount, getMessagesController().W1(Long.valueOf(this.e1)));
                return;
            }
            byte b4 = 9;
            if (i == this.d4) {
                try {
                    this.actionBar.getActionBarMenuOnItemClick().b(9);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            }
            if (i == this.V3) {
                a3();
                return;
            }
            if (i == this.W3) {
                da9.F0(a(), this);
                return;
            }
            if (i >= this.C4 && i < this.D4) {
                boolean isEmpty = this.D2.isEmpty();
                TLRPC.ChatFull chatFull = this.v2;
                g(!isEmpty ? chatFull.participants.participants.get(((Integer) this.D2.get(i - this.C4)).intValue()) : chatFull.participants.participants.get(i - this.C4), false, false, view);
                return;
            }
            if (i == this.E4) {
                b3();
                return;
            }
            if (i == this.M3) {
                j3(f, f2, i, view);
                return;
            }
            if (i == this.t4) {
                if (this.F2 != null) {
                    showDialog(new pp2(this, this.F2.linked_community_id, null, null));
                    return;
                } else {
                    if (this.e1 == 0 || (W1 = getMessagesController().W1(Long.valueOf(this.e1))) == null) {
                        return;
                    }
                    showDialog(new pp2(this, W1.linked_community_id, null, null));
                    return;
                }
            }
            if (i == this.J3) {
                if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                    pc6 pc6Var = new pc6(5);
                    long j2 = this.f1;
                    TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) this.v2.location;
                    pc6Var.m0 = -j2;
                    pc6Var.H0 = tL_channelLocation;
                    presentFragment(pc6Var);
                    return;
                }
                return;
            }
            if (i == this.U4) {
                W2(false);
                return;
            }
            if (i == this.F4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", this.f1);
                bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                wg2 wg2Var = new wg2(bundle3);
                wg2Var.B0(this.v2);
                presentFragment(wg2Var);
                return;
            }
            if (i == this.G4) {
                presentFragment(new qv0(this.f1));
                return;
            }
            if (i == this.H4) {
                Bundle bundle4 = new Bundle();
                bundle4.putLong("chat_id", this.f1);
                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                wg2 wg2Var2 = new wg2(bundle4);
                wg2Var2.B0(this.v2);
                presentFragment(wg2Var2);
                return;
            }
            if (i == this.I4) {
                this.S0.performClick();
                return;
            }
            if (i == this.J4) {
                presentFragment(new au0(0, this.e1));
                return;
            }
            if (i == this.K4) {
                presentFragment(new au0(1, this.e1));
                return;
            }
            if (i == this.L4) {
                Bundle bundle5 = new Bundle();
                bundle5.putLong("chat_id", this.f1);
                bundle5.putBoolean("start_from_monetization", true);
                presentFragment(new xza(bundle5));
                return;
            }
            if (i == this.O4) {
                Bundle bundle6 = new Bundle();
                bundle6.putLong("chat_id", this.f1);
                bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                wg2 wg2Var3 = new wg2(bundle6);
                wg2Var3.B0(this.v2);
                presentFragment(wg2Var3);
                return;
            }
            if (i == this.g3) {
                presentFragment(new NotificationsSettingsActivity());
                return;
            }
            if (i == this.i3) {
                PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
                TL_account.TL_password tL_password = this.I2;
                privacySettingsActivity.d = tL_password;
                if (tL_password != null) {
                    privacySettingsActivity.B0();
                }
                presentFragment(privacySettingsActivity);
                return;
            }
            if (i == this.j3) {
                presentFragment(new DataSettingsActivity());
                return;
            }
            if (i == this.k3) {
                presentFragment(new ThemeActivity(0));
                return;
            }
            if (i == this.l3) {
                presentFragment(new FiltersSetupActivity());
                return;
            }
            if (i == this.n3) {
                presentFragment(new StickersActivity(0, null));
                return;
            }
            if (i == this.m3) {
                presentFragment(new m86());
                return;
            }
            if (i == this.o3) {
                presentFragment(new SessionsActivity(0));
                return;
            }
            if (i == this.r3) {
                showDialog(ik.R(this, this.A0));
                return;
            }
            if (i == this.s3) {
                l11.u(getParentActivity(), jb6.M0(2131743925, null));
                return;
            }
            if (i == this.t3) {
                l11.u(getParentActivity(), jb6.M0(2131746516, null));
                return;
            }
            if (i == this.w3) {
                p3(getParentActivity(), false);
                return;
            }
            if (i == this.x3) {
                p3(getParentActivity(), true);
                return;
            }
            if (i == this.y3) {
                fc4.a();
                return;
            }
            if (i == this.z3) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.A0, getParentActivity());
                    String M02 = jb6.M0(2131754085, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.U = M02;
                    heVar2.S = jb6.M0(R.string.AppName, null);
                    alertDialog$Builder2.j(jb6.M0(2131747564, null), new tn8(this, b4));
                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                    showDialog(heVar2);
                    return;
                }
                return;
            }
            if (i == this.h3) {
                presentFragment(new LanguageSelectActivity());
                return;
            }
            if (i == this.W2) {
                presentFragment(new uf1(null));
                return;
            }
            if (i == this.X2) {
                presentFragment(new UserInfoActivity());
                return;
            }
            if (i == this.U2) {
                presentFragment(new u8(3));
                return;
            }
            if (i == this.P2) {
                a3();
                return;
            }
            if (i == this.f4) {
                presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            }
            if (i == this.g4) {
                presentFragment(new nxa());
                return;
            }
            if (i == this.h4) {
                presentFragment(new yfb());
                return;
            }
            if (i == this.i4) {
                presentFragment(new PremiumPreviewFragment(1, "settings"));
                return;
            }
            if (i == this.j4) {
                yw4.f1(false, ok0.a(this.currentAccount).b());
                return;
            }
            if (i == this.botPermissionLocation) {
                tr0 tr0Var = this.t2;
                if (tr0Var != null) {
                    tr0Var.k(!tr0Var.f(), new mn8(this, view, b4));
                    return;
                }
                return;
            }
            if (i == this.botPermissionBiometry) {
                up0 up0Var = this.u2;
                if (up0Var != null) {
                    boolean z2 = !up0Var.e;
                    up0Var.f = true;
                    up0Var.e = z2;
                    up0Var.i();
                    ((xib) view).setChecked(this.u2.e);
                    return;
                }
                return;
            }
            if (i == this.botPermissionEmojiStatus) {
                xib xibVar = (xib) view;
                xibVar.setChecked(!xibVar.d());
                if (this.w4 > 0) {
                    getConnectionsManager().cancelRequest(this.w4, true);
                }
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = getMessagesController().n1(this.e1);
                boolean d = xibVar.d();
                toggleuseremojistatuspermission.enabled = d;
                TLRPC.UserFull userFull2 = this.w2;
                if (userFull2 != null) {
                    userFull2.bot_can_manage_emoji_status = d;
                }
                int sendRequest = getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new jl7(this, r1, (byte) 12));
                this.w4 = sendRequest;
                int[] iArr = {sendRequest};
                return;
            }
            if (i == this.P3) {
                this.W4 = !this.W4;
                m3();
                view.requestLayout();
                this.d.g(this.P3);
                int i4 = this.w6;
                if (i4 >= 0) {
                    this.c.g1(i4, this.x6 - this.a.getPaddingTop());
                    return;
                }
                return;
            }
            if (i == this.Q3) {
                g3(false);
                return;
            }
            if (i == this.R2) {
                if (this.w2 != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putLong("chat_id", this.w2.personal_channel_id);
                    presentFragment(new yv1(bundle7));
                    return;
                }
                return;
            }
            if (i != this.V2) {
                if (i == this.I3) {
                    S1(i, view);
                    return;
                } else {
                    j3(f, f2, i, view);
                    return;
                }
            }
            cr8 cr8Var = this.L6;
            if ((cr8Var == null || !cr8Var.a()) && !T1(i, view)) {
                hjb hjbVar = (hjb) view;
                if (hjbVar.d.getDrawable() != null) {
                    Z2(hjbVar.getImageView());
                }
            }
        }
    }

    public final void A3(CharSequence charSequence) {
        this.h6 = charSequence;
        g4();
    }

    public final int B1(int i, Boolean bool) {
        if (this.s6 == null) {
            return i;
        }
        int v0 = cmb.v0(cmb.r8, this.A0);
        int f = on2.f(0.5f, this.s6.m(cmb.I.o()), this.s6.n(cmb.I.o()));
        if (cmb.c1(v0)) {
            return cmb.C(cmb.I.o(), v0, f, i, (bool == null || bool.booleanValue()) ? f : cmb.p1(0.7f, f));
        }
        return (bool == null || bool.booleanValue()) ? f : cmb.a(-0.2f, 0.2f, cmb.p1(0.7f, f));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B2(int i) {
        boolean z;
        if (i >= 0) {
            Object valueOf = Integer.valueOf(this.U2);
            uq8 uq8Var = this.e;
            if (uq8Var.x) {
                int size = uq8Var.r.size();
                uq8 uq8Var2 = this.e;
                if (i < size) {
                    valueOf = uq8Var2.r.get(i);
                } else {
                    int k = ts2.k(1, i, uq8Var2.r);
                    if (k >= 0 && k < this.e.s.size()) {
                        valueOf = this.e.s.get(k);
                    }
                }
            } else {
                if (!uq8Var.w.isEmpty()) {
                    i--;
                }
                if (i < 0 || i >= this.e.w.size()) {
                    int k2 = ts2.k(1, i, this.e.w);
                    if (k2 >= 0 && k2 < this.e.d.size()) {
                        valueOf = this.e.d.get(k2);
                        z = false;
                        if (!(valueOf instanceof tq8)) {
                            tq8 tq8Var = (tq8) valueOf;
                            tk5 parentLayout = getParentLayout();
                            tq8Var.b.run();
                            gm.f3(parentLayout, tq8Var.c);
                        } else if (valueOf instanceof bc7) {
                            nm7.f(this.currentAccount).k(nm7.c1, this.e.F, ((bc7) valueOf).c);
                        }
                        if (z || valueOf == null) {
                        }
                        this.e.E(valueOf);
                        return;
                    }
                } else {
                    valueOf = this.e.w.get(i);
                }
            }
            z = true;
            if (!(valueOf instanceof tq8)) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B3(int i) {
        SharedPreferences d1 = oc7.d1();
        if (gm.O1()) {
            return;
        }
        this.K1 = i != 0;
        this.L1 = i != 0;
        k4();
        if (d1.getBoolean("view_animations", true)) {
            this.J1 = i;
        } else if (i == 2) {
            this.n1 = true;
        }
    }

    public final void C1() {
        int f;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null || this.f == null || this.d1 == null || this.T0 == null || this.Q0 == null || this.R0 == null || this.S0 == null || this.p0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.b6);
        ep8 ep8Var = this.d6;
        ep8Var.getClass();
        ep8Var.a(aVar, valueOf);
        if (this.b6 > 0.0f || this.l2 <= 0.0f) {
            return;
        }
        mt1 mt1Var = this.f;
        int i = -1;
        if (this.s6 != null) {
            f = -1;
        } else {
            f = on2.f(this.l2, cmb.v0(cmb.li, this.A0), -1);
        }
        mt1Var.setTextColor(f);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        if (this.s6 == null) {
            i = on2.f(this.l2, cmb.v0(cmb.u8, this.A0), -1);
        }
        aVar2.H(i, false);
    }

    public final void C2() {
        TLRPC.Document e;
        u31 h;
        if (this.K2 == null) {
            int i = 0;
            if (!this.q1 || getMessagesController().H3()) {
                if (U1()) {
                    return;
                }
                d3(false);
                return;
            }
            ArrayList l = getMessagesController().g4.l(this.f1);
            if (l != null) {
                TLRPC.TL_forumTopic tL_forumTopic = null;
                while (tL_forumTopic == null) {
                    if (i >= l.size()) {
                        return;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l.get(i);
                    if (tL_forumTopic2 != null && tL_forumTopic2.id == this.g1) {
                        tL_forumTopic = tL_forumTopic2;
                    }
                    i++;
                }
                long j = tL_forumTopic.icon_emoji_id;
                if (j == 0 || (e = vm.e(this.currentAccount, j)) == null || (h = c41.b0(this).h(e, 1, new ao8(this, (byte) 3))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public final void C3(TLRPC.UserFull userFull, ir8 ir8Var, zq8 zq8Var) {
        this.w2 = userFull;
        ita itaVar = this.T;
        if (itaVar != null) {
            itaVar.set(userFull.stars_rating);
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.setStories(this.w2.stories);
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.a();
        }
        yo8 yo8Var = this.f0;
        if (yo8Var != null) {
            yo8Var.setHasStories(P2());
        }
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.setUserInfo(this.w2);
        }
        ir8 ir8Var2 = this.x2;
        if (ir8Var2 == null) {
            this.x2 = ir8Var;
        } else {
            ir8Var = ir8Var2;
        }
        if (ir8Var == null) {
            ir8Var = new ir8(this.currentAccount);
            this.x2 = ir8Var;
        }
        v56 v56Var = new v56(this, (byte) 24);
        if (ir8Var.c) {
            v56Var.run();
        } else {
            ir8Var.h.add(v56Var);
        }
        this.x2.b(this.w2);
        zq8 zq8Var2 = this.z2;
        if (zq8Var2 == null) {
            this.z2 = zq8Var;
        } else {
            zq8Var = zq8Var2;
        }
        boolean z = true;
        if (zq8Var == null) {
            zq8Var = zq8.c(this.currentAccount, this.w2, zq8Var);
            this.z2 = zq8Var;
            this.y2 = zq8Var != null;
        }
        if (zq8Var != null) {
            v56 v56Var2 = new v56(this, (byte) 19);
            if (zq8Var.b) {
                v56Var2.run();
            } else {
                zq8Var.h.add(v56Var2);
            }
        }
        zja zjaVar = this.T0;
        if (zjaVar != null) {
            TL_account.RequirementToContact L2 = getMessagesController().L2(this.e1);
            if (L2 != null && !(L2 instanceof TL_account.requirementToContactEmpty)) {
                z = false;
            }
            zjaVar.Q(20, z);
            boolean p2 = p2();
            zja zjaVar2 = this.T0;
            if (p2) {
                zjaVar2.S(44);
            } else {
                zjaVar2.u(44);
            }
        }
    }

    public final void D1() {
        if (this.k6 != null) {
            ValueAnimator valueAnimator = this.k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.k2.cancel();
            }
            float l = Utilities.l(this.Q1 / this.F1);
            if (l > 0.0f) {
                float f = (l - 0.5f) / 0.5f;
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) - gm.L(21.0f));
                this.c2 = gm.R1(0.42f, this.k6[0], l);
                this.a2 = gm.R1(this.p6, this.k6[1], l);
                this.b2 = gm.R1(translationY, this.k6[2], l);
                this.d2 = gm.R1(this.k6[11], 0.0f, l);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.Y.setTranslationX(this.a2);
                this.Y.setTranslationY(this.b2);
                ita itaVar = this.T;
                if (itaVar != null) {
                    itaVar.setAlpha(l);
                }
                this.f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                bp8 bp8Var = this.v0;
                if (bp8Var != null) {
                    bp8Var.invalidate();
                }
                xs8 xs8Var = this.w0;
                if (xs8Var != null) {
                    xs8Var.e = gm.R1(0.0f, this.k6[4], f);
                    this.w0.f = gm.R1(0.0f, this.k6[5], l);
                    xs8 xs8Var2 = this.w0;
                    xs8Var2.h = true;
                    xs8Var2.invalidate();
                }
                vq8 vq8Var = this.K6;
                if (vq8Var != null) {
                    vq8Var.setAlpha((int) gm.R1(0.0f, this.k6[6], l));
                }
                float L = (((this.c2 * 100.0f) / 42.0f) * gm.L(42.0f)) - gm.L(42.0f);
                this.i0.setTranslationX(this.Y.getX() + gm.L(16.0f) + L);
                this.i0.setTranslationY(this.Y.getY() + gm.L(-10.0f) + L);
                this.j0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                this.j0.setTranslationY(this.Y.getY() + gm.L(26.5f) + L);
                this.k0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                this.k0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L);
                this.l0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                this.l0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L);
                float R1 = gm.R1(k2(0), this.k6[7], l);
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) - (gm.p * 21.0f)))) + gm.L(1.3f);
                float N = gm.N(22.7f) + floor;
                this.f2 = gm.R1(floor, this.k6[8], l);
                this.h2 = gm.R1(N, this.k6[9], l);
                float L2 = (this.p6 - gm.L(109.0f)) + gm.L(48.0f);
                float R12 = gm.R1(l2(L2, 0, this.f), this.k6[12], l);
                float R13 = gm.R1(l2(L2 + this.z5, 1, this.r) - this.z5, this.k6[13], l);
                this.f.setTranslationX(R12);
                this.f.setTranslationY(this.f2);
                this.r.setTranslationX(this.z5 + R13);
                this.r.setTranslationY(this.h2);
                this.e2 = R12;
                this.g2 = R13;
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R14 = gm.R1(k2(1), 1.0f, l);
                this.r.setScaleX(R14);
                this.r.setScaleY(R14);
                N3();
                T3(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0));
                R2((int) this.k6[10], l, true);
                qn8 qn8Var = this.a0;
                if (qn8Var != null) {
                    qn8Var.setAlpha(gm.R1(0.0f, this.k6[3], f));
                }
            }
        }
    }

    public final void D2(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(getUserConfig().e()));
            if (W1 == null) {
                W1 = getUserConfig().f();
                if (W1 == null) {
                    return;
                } else {
                    getMessagesController().c4(W1, false, false);
                }
            } else {
                getUserConfig().v(W1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, nm7.f2, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : bc4.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            W1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.J2 != null) {
                bc4.G(this.currentAccount);
                File J = bc4.J(w, null, true, true);
                bc4.G(this.currentAccount);
                bc4.J(this.J2, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.J2.volume_id);
                sb.append("_");
                String k = hg9.k(sb, this.J2.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@50_50"), gn5.m(this.currentAccount, 1, W1));
            }
            if (x != null && str != null) {
                bc4.G(this.currentAccount);
                new File(str).renameTo(bc4.J(x, "mp4", true, true));
            } else if (w2 != null && this.K2 != null) {
                bc4.G(this.currentAccount);
                File J2 = bc4.J(w2, null, true, true);
                bc4.G(this.currentAccount);
                bc4.J(this.K2, null, true, true).renameTo(J2);
            }
            getMessagesController().T0(W1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(W1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull X1 = getMessagesController().X1(this.e1);
            if (X1 != null) {
                X1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(X1, false);
            }
        }
        this.p2 = (gm.O1() || this.o2 || !this.f0.getImageReceiver().E() || gm.A1()) ? false : true;
        this.J2 = null;
        this.K2 = null;
        zo8 zo8Var = this.o0;
        zo8Var.I0 = true;
        zo8Var.L0 = this.L2;
        zo8Var.r1 = null;
        zo8Var.s1 = null;
        zo8Var.setCreateThumbFromParent(false);
        h4(true);
        F3(false, true);
        getNotificationCenter().k(2, Integer.valueOf(oc7.s5));
        getNotificationCenter().k(nm7.j0, new Object[0]);
        getUserConfig().u(true);
    }

    public final void D3(View view, float f) {
        if (this.p2) {
            if (this.q2) {
                this.a.x0(0, ((view.getTop() - this.a.getMeasuredWidth()) - Y1()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0), d53.h);
                return;
            } else {
                this.a.x0(0, view.getTop() - e2(), d53.h);
                return;
            }
        }
        boolean z = Y1() > 0;
        if (z) {
            float f2 = this.Q1;
            if (f2 > 0.0f && ((f2 < e2() * 0.6f || f < -1000.0f) && this.Q1 > Y1() * 0.6f)) {
                this.a.x0(0, (int) (this.Q1 - Y1()), d53.h);
                return;
            }
        }
        if (z) {
            float f3 = this.Q1;
            if (f3 > 0.0f && f3 < Y1() * 0.6f) {
                this.a.x0(0, (int) this.Q1, d53.h);
                return;
            }
        }
        if (!z) {
            float f4 = this.Q1;
            if (f4 > 0.0f && f < -1000.0f) {
                this.a.x0(0, (int) f4, d53.h);
                return;
            }
        }
        if (this.Q1 > 0.0f) {
            this.a.x0(0, view.getTop() - e2(), d53.h);
        }
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    public final float E1() {
        return Utilities.l((this.Q1 - Y1()) / f2());
    }

    public final /* synthetic */ void E2(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.J2 = fileLocation;
            this.K2 = photoSize2.location;
            this.f0.m(gn5.e(fileLocation), "50_50", this.q0, null);
            if (this.P2 != -1) {
                i4();
                lq8 lq8Var = this.d;
                if (lq8Var != null) {
                    lq8Var.f();
                }
                Q2(true);
            }
            zo8 zo8Var = this.o0;
            gn5 e = gn5.e(this.K2);
            this.L2 = e;
            zo8Var.A(e, gn5.e(this.J2));
            F3(true, false);
        } else {
            if (this.J2 == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.u6 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jl7(this, str, (byte) 11));
        }
        this.actionBar.t().requestLayout();
    }

    public final void E3() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        fr8 fr8Var = new fr8(this.glassEngine, baseSimpleGlass);
        this.T5 = fr8Var;
        xq8 xq8Var = this.d1;
        if (xq8Var != null) {
            int i = xq8Var.I;
            boolean z = xq8Var.c;
            if (fr8Var.i != i || fr8Var.j != z) {
                fr8Var.i = i;
                fr8Var.j = z;
                fr8Var.a();
            }
        }
        this.T5.b(this.U5);
        qn8 qn8Var = this.a0;
        if (qn8Var != null) {
            qn8Var.setGlassFactory(this.T5.c);
        }
        mt8 mt8Var = this.c0;
        if (mt8Var != null) {
            mt8Var.setGlassFactory(this.T5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.T5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        baseSimpleGlass.g(this.x5, this.simpleActionBar, this.A0);
        rja rjaVar = this.simpleActionBar;
        fr8 fr8Var2 = this.T5;
        km0 km0Var = fr8Var2.e;
        lz4 lz4Var = fr8Var2.f;
        rjaVar.p0 = km0Var;
        rjaVar.q0 = lz4Var;
        rjaVar.setBackground(null);
        this.R5 = qqd.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.S5);
        Z3();
        baseSimpleGlass.o = this.X6;
        View view = new View(getParentActivity());
        this.e6 = view;
        view.setAlpha(0.0f);
        this.x5.getViewTreeObserver().addOnPreDrawListener(new cc(this, (byte) 6));
        this.O.e(this.e6);
        View view2 = this.e6;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.M5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        up8 up8Var = this.x5;
        up8Var.addView(this.M5, up8Var.indexOfChild(this.Z), qoe.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new v56(this, (byte) 23));
        A1();
        W3();
    }

    public final void F1() {
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) - gm.L(21.0f));
        this.c2 = 1.38f;
        this.d2 = 0.0f;
        X1();
        k3();
        R2(0, 1.0f, true);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.g2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.A5 ? 0 : this.r.getPaddingLeft())));
        this.H6 = this.A5 ? 0.0f : this.r.getPaddingLeft();
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final void F2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            u31 Q = c41.b0(this).Q(R.raw.contact_check, 36, jb6.M0(2131746591, null));
            Q.j = 5000;
            Q.j();
            return;
        }
        int i = userFull.flags2;
        if (tL_birthday == null) {
            userFull.flags2 = i & (-33);
        } else {
            userFull.flags2 = i | 32;
        }
        userFull.birthday = tL_birthday;
        getMessagesStorage().g2(userFull, false);
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            ts2.u(null, 2131743566, c41.b0(this), R.raw.error, 36);
            return;
        }
        if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = jb6.M0(2131746587, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131746588, null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            showDialog(heVar);
        }
    }

    public final void F3(boolean z, boolean z2) {
        if (this.h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.g0 = null;
        }
        if (!z2) {
            sb5 sb5Var = this.h0;
            if (z) {
                sb5Var.setAlpha(1.0f);
                this.h0.setVisibility(0);
                return;
            } else {
                sb5Var.setAlpha(0.0f);
                this.h0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g0 = animatorSet2;
        sb5 sb5Var2 = this.h0;
        byte b = 1;
        if (z) {
            sb5Var2.setVisibility(0);
            this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<sb5, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(sb5Var2, (Property<sb5, Float>) View.ALPHA, 0.0f));
        }
        this.g0.setDuration(180L);
        this.g0.addListener(new mp8(this, z, b));
        this.g0.start();
    }

    public final boolean G2(boolean[] zArr, boolean z, org.telegram.ui.ActionBar.d dVar, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        oc7.r1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean z2 = sd2.T(this.F2) && !this.F2.megagroup;
        int i = ew5.t1;
        ew5.E0(parentActivity, this, c41.b0(this), z2);
        if (!z || this.U4 != -1) {
            i4();
            lq8 lq8Var = this.d;
            if (lq8Var != null) {
                lq8Var.f();
            }
        }
        if (dVar instanceof yv1) {
            ((yv1) dVar).Wb(false, true);
        }
        return false;
    }

    public final void G3() {
        my0 my0Var;
        zx0 zx0Var;
        int i;
        TextView[] textViewArr;
        final byte b;
        Activity parentActivity = getParentActivity();
        final TLRPC.UserFull userFull = this.w2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        byte b2 = 0;
        ylb ylbVar = null;
        my0 i2 = wi8.i(getParentActivity(), false, 1, null);
        zx0 zx0Var2 = i2.y0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_rating_crown, 0, 0, this.A0);
        limitPreviewView.setHideNegativeValues(a() != z8c.h(this.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-gm.L(14.0f));
        linearLayout.addView(limitPreviewView, qoe.t(-1, -2, 17, 0, 20, 0, 10));
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, qoe.t(-1, -2, 17, 40, -12, 40, 20));
            int i3 = 2;
            l66[] l66VarArr = new l66[2];
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i3;
                byte b3 = b2;
                a31 a31Var = new a31(parentActivity, ylbVar, (byte) 6);
                l66VarArr[i4] = a31Var;
                a31Var.setGravity(17);
                l66VarArr[i4].setTextSize(1, 12.0f);
                anb.X(l66VarArr[i4], cmb.x6, null);
                anb.G(l66VarArr[i4], cmb.Wc, null);
                frameLayout.addView(l66VarArr[i4], qoe.e(-1, -1, nm7.D1));
                l66VarArr[i4].setAlpha(i4 == 0 ? 1.0f : 0.0f);
                l66VarArr[i4].setScaleX(i4 == 0 ? 1.0f : 0.8f);
                l66VarArr[i4].setScaleY(i4 == 0 ? 1.0f : 0.8f);
                i4++;
                i3 = i5;
                b2 = b3;
            }
            final byte b4 = b2;
            int i6 = i3;
            final ci7 ci7Var = new ci7(l66VarArr, (byte) 19);
            byte b5 = a() == z8c.h(this.currentAccount).e() ? (byte) 1 : b4;
            long j = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            byte b6 = b5;
            long j2 = (-j) - (tl_starsRating != null ? tl_starsRating.stars - j : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) / 86400);
            long j3 = userFull.stars_my_pending_rating.stars;
            long j4 = userFull.stars_rating.stars;
            long j5 = j3 - j4;
            if ((j4 >= 0 || b6 != 0) && (b6 == 0 || j2 <= 0)) {
                my0Var = i2;
                textViewArr = l66VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = jb6.H(',', "StarRatingFuture", max);
                String H2 = jb6.H(',', "StarRatingFuturePendingPoints", (int) j5);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[b4] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i6] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                zx0Var = zx0Var2;
                spannableStringBuilder.append((CharSequence) gm.D2(gm.N2(jb6.M0(2131744875, null), -1, i6, new Runnable() { // from class: ho8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b7 = b4;
                        ci7 ci7Var2 = ci7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ci7Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ci7Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                }, null), true));
                b = b4;
                textViewArr[b4].setOnClickListener(new View.OnClickListener() { // from class: io8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b7 = b;
                        ci7 ci7Var2 = ci7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ci7Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ci7Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[b].setText(spannableStringBuilder);
            } else {
                textViewArr = l66VarArr;
                my0Var = i2;
                anb.X(l66VarArr[b4], cmb.p7, null);
                if (b6 != 0) {
                    textViewArr[b4].setText(gm.S2(jb6.H(',', "StarRatingLevelNegativeYou", (int) j2)));
                } else {
                    TextView textView = textViewArr[b4];
                    Object[] objArr = new Object[1];
                    objArr[b4] = pg3.k(z8c.t0, a());
                    textView.setText(gm.S2(jb6.a0(null, null, 2131744861, objArr)));
                }
                zx0Var = zx0Var2;
                b = b4;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = jb6.H(',', "StarRatingFuturePreview1", max);
            String H4 = jb6.H(',', "StarRatingFuturePreview2", (int) j5);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[b] = H3;
            final byte b7 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[2] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) gm.D2(gm.N2(jb6.M0(2131744874, null), -1, 2, new Runnable() { // from class: ho8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b72 = b7;
                    ci7 ci7Var2 = ci7Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (b72) {
                        case 0:
                            RectF rectF = ProfileActivity.e7;
                            limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            ci7Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.e7;
                            limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            ci7Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            }, null), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: io8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b7;
                    ci7 ci7Var2 = ci7Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (b72) {
                        case 0:
                            RectF rectF = ProfileActivity.e7;
                            limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            ci7Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.e7;
                            limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            ci7Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            my0Var = i2;
            zx0Var = zx0Var2;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTypeface(gm.o());
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131744856, null));
        textView2.setTextSize(1, 20.0f);
        int i7 = cmb.F6;
        anb.X(textView2, i7, this.A0);
        linearLayout.addView(textView2, qoe.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView3 = new TextView(parentActivity);
        textView3.setGravity(17);
        if (userFull.id == z8c.h(this.currentAccount).e()) {
            textView3.setText(gm.S2(jb6.M0(2131744857, null)));
            i = 1;
        } else {
            i = 1;
            hg9.q(null, null, 2131744887, new Object[]{pg3.k(z8c.t0, a())}, textView3);
        }
        textView3.setTextSize(i, 14.0f);
        anb.X(textView3, i7, this.A0);
        linearLayout.addView(textView3, qoe.t(-1, -2, 17, 20, 0, 20, 12));
        lj8 lj8Var = new lj8(parentActivity, this.A0);
        lj8Var.a.l(jb6.M0(2131744855, null), false);
        String M0 = jb6.M0(2131744890, null);
        int i8 = cmb.Ei;
        lj8Var.b.setText(jb6.V(null, null, 2131744886, Q1(M0, i8, this.A0)));
        lj8Var.d.setVisibility(8);
        ImageView imageView = lj8Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        ylb ylbVar2 = this.A0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        anb.s(imageView, i7, ylbVar2, mode);
        linearLayout.addView(lj8Var, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        lj8 lj8Var2 = new lj8(parentActivity, this.A0);
        lj8Var2.a.l(jb6.M0(2131744854, null), false);
        lj8Var2.b.setText(jb6.V(null, null, 2131744885, Q1(jb6.M0(2131744890, null), i8, this.A0)));
        lj8Var2.d.setVisibility(8);
        ImageView imageView2 = lj8Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        anb.s(imageView2, i7, this.A0, mode);
        linearLayout.addView(lj8Var2, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        lj8 lj8Var3 = new lj8(parentActivity, this.A0);
        lj8Var3.a.l(jb6.M0(2131744853, null), false);
        String M02 = jb6.M0(2131744888, null);
        int f = cmb.I.o() ? on2.f(0.25f, cmb.v0(cmb.l6, this.A0), -16777216) : cmb.v0(cmb.x6, this.A0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
        op8 op8Var = new op8(9);
        op8Var.w = M02;
        if (op8Var.c != null) {
            op8Var.c = null;
            op8Var.a();
        }
        op8Var.f = f;
        op8Var.n = false;
        spannableStringBuilder3.setSpan(op8Var, 0, spannableStringBuilder3.length(), 0);
        lj8Var3.b.setText(jb6.V(null, null, 2131744884, spannableStringBuilder3));
        lj8Var3.d.setVisibility(8);
        ImageView imageView3 = lj8Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        anb.s(imageView3, i7, this.A0, mode);
        linearLayout.addView(lj8Var3, qoe.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        b61 b61Var = new b61(this.A0, parentActivity, true);
        b61Var.setOnClickListener(new vz(zx0Var, (byte) 1));
        b61Var.i(wsa.k2(jb6.M0(2131743575, null)), false, true);
        linearLayout.addView(b61Var, qoe.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        my0 my0Var2 = my0Var;
        my0Var2.O = linearLayout;
        my0Var2.show();
    }

    @Override // vn5
    public final void H(float f) {
        sb5 sb5Var = this.h0;
        if (sb5Var == null) {
            return;
        }
        sb5Var.setProgress(f);
        this.o0.O(this.L2, f);
    }

    public final void H1() {
        u69 u69Var;
        View view;
        if (this.a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.a.getChildCount() <= 0 || this.G1) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= this.a.getChildCount()) {
                    view = null;
                    break;
                } else {
                    if (RecyclerView.R(this.a.getChildAt(i)) == 0) {
                        view = this.a.getChildAt(i);
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                po8 po8Var = this.a;
                View F = po8Var.F(view);
                u69Var = (b59) (F != null ? po8Var.T(F) : null);
            }
            int top = view == null ? 0 : view.getTop();
            int i2 = (top < 0 || (u69Var != null ? u69Var.b() : -1) != 0) ? 0 : top;
            float a = view == null ? 1.0f : pqe.a((-top) / gm.L(12.0f), 0.0f, 1.0f);
            if (this.W5 != a) {
                this.W5 = a;
                Y3();
            }
            byte b = 1;
            boolean z = this.r0 == null && this.actionBar.o0;
            int i3 = this.S4;
            if (i3 != -1 && !z) {
                b59 b59Var = (b59) this.a.K(i3);
                z = b59Var != null && b59Var.a.getTop() <= 0;
            }
            if (this.c6 != z) {
                this.c6 = z;
                I1();
                AnimatorSet animatorSet = this.Z5;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = this.a6;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                a4(true);
                g4();
                l4(false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.d6, z ? 1.0f : 0.0f));
                this.O.L0.setOpen(z);
                if (z) {
                    arrayList.add(ObjectAnimator.ofFloat(this, this.u5, 0.0f));
                }
                if (this.v0 != null || this.w0 != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bo8(this, (byte) 3));
                    arrayList.add(ofFloat);
                }
                K1();
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.Z5 = animatorSet3;
                animatorSet3.playTogether(arrayList);
                this.Z5.setInterpolator(d53.f);
                this.Z5.addListener(new cp8(this, b));
                this.Z5.setDuration(150L);
                this.Z5.start();
                nm7.e().k(nm7.v4, Boolean.TRUE);
            }
            float f = i2;
            if (this.Q1 == f || this.H1) {
                return;
            }
            this.Q1 = f;
            this.d1.invalidate();
            if (this.J1 != 0) {
                this.M1 = this.Q1 > ((float) Y1());
            }
            Q2(true);
        }
    }

    public final void H2(TLRPC.User user, String str, boolean z, boolean z2) {
        xhb.c(getParentActivity(), this.currentAccount, a(), user, str, z, z2, this.A0);
    }

    public final void H3() {
        Long l;
        if (this.Y5 != null) {
            return;
        }
        mz9[] mz9VarArr = new mz9[1];
        Rect rect = gm.Q;
        mt1 mt1Var = this.f;
        if (mt1Var != null) {
            Drawable rightDrawable = mt1Var.getRightDrawable();
            mt1 mt1Var2 = this.f;
            if (rightDrawable == null) {
                rect.set(mt1Var2.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(mt1Var2.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i = this.f.getScaleX() < 1.5f ? 16 : 32;
        int L = (-(this.Z.getHeight() - rect.centerY())) - gm.L(i);
        float L2 = gm.L(324.0f);
        Point point = gm.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b = pqe.b(centerX - (min / 2), 0, point.x - min);
        fp8 fp8Var = new fp8(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b)), this.F2 == null ? 0 : 9, this.A0, i, mz9VarArr);
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 != null) {
            fp8Var.setExpireDateHint(pg3.g(W1.emoji_status));
        }
        Long l2 = this.F;
        if (l2 != null) {
            fp8Var.setSelected(l2);
        } else {
            tm tmVar = this.G;
            if (tmVar != null) {
                Drawable drawable = tmVar.f[0];
                if (drawable instanceof vm) {
                    l = Long.valueOf(((vm) drawable).h());
                    fp8Var.setSelected(l);
                }
            }
            l = null;
            fp8Var.setSelected(l);
        }
        fp8Var.setSaveState(3);
        fp8Var.y(this.G, this.f);
        gp8 gp8Var = new gp8(this, fp8Var);
        this.Y5 = gp8Var;
        mz9VarArr[0] = gp8Var;
        int[] iArr = new int[2];
        mt1 mt1Var3 = this.f;
        if (mt1Var3 != null) {
            mt1Var3.getLocationOnScreen(iArr);
        }
        mz9VarArr[0].showAsDropDown(this.fragmentView, b, L, 51);
        mz9VarArr[0].a();
    }

    @Override // cga
    public final void I() {
        n3(false);
    }

    public final void I1() {
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.setPagesVisibleOverscanTop((this.c6 || this.b6 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final /* synthetic */ void I2() {
        oc7.r1(this.currentAccount).h0(null);
        this.V.H(0);
        this.W.H(0);
    }

    public final void I3() {
        int i = 0;
        this.O.L0.setReordering(false);
        wp8 wp8Var = this.O;
        kfa kfaVar = wp8Var.L0;
        if (wp8Var.y1 != null && kfaVar != null) {
            boolean m0 = wp8Var.m0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = kfaVar.getTabIds();
            int size = tabIds.size();
            while (i < size) {
                Integer num = tabIds.get(i);
                i++;
                TLRPC.ProfileTab Y = nha.Y(num.intValue(), m0);
                if (Y != null) {
                    arrayList.add(Y);
                }
            }
        }
        this.O.N1(true);
        this.J5.animate().translationY(gm.L(69.0f)).setDuration(180L).setInterpolator(d53.h).withEndAction(new v56(this, (byte) 25)).start();
        c41.b0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final void J1() {
        byte b = this.J1;
        float f = 0.0f;
        if (b == 1 && (!this.w5 || this.G1)) {
            this.C6 = 0.0f;
        } else if (b != 2 || (this.w5 && !this.G1)) {
            long j = this.e1;
            long j2 = z8c.h(this.currentAccount).n;
            float f2 = this.l2;
            float f3 = this.y5;
            if (j == j2) {
                this.C6 = (1.0f - f3) * f2;
            } else {
                this.C6 = f2 * f3;
            }
        } else {
            ap8 ap8Var = this.r;
            this.C6 = ap8Var == null ? 0.0f : ap8Var.getAlpha();
        }
        boolean z = this.e1 == z8c.h(this.currentAccount).n;
        if (z && this.A5) {
            this.z5 = gm.L(28.0f) * this.C6;
            ap8 ap8Var2 = this.r;
            if (ap8Var2 != null) {
                ap8Var2.setTranslationX(h2(this.G6, this.I6));
                this.Z.invalidate();
            }
        }
        if (z) {
            if (this.A5) {
                f = this.l2;
            }
        } else if (this.B5) {
            f = this.C6;
        }
        vq8 vq8Var = this.K6;
        if (vq8Var != null) {
            vq8Var.e = 1.0f - f;
            vq8Var.invalidateSelf();
        }
        this.F6 = f > 0.5f;
        g4();
    }

    public final void J2(TLRPC.User user) {
        if (this.a4 >= 0) {
            if (this.S4 == -1) {
                i4();
                this.d.f();
            } else {
                c4(false, false);
            }
        }
        if (this.S4 == -1) {
            if (this.o2 || gm.O1()) {
                this.a.setPadding(0, e2(), 0, 0);
                this.k2.cancel();
                float[] fArr = this.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                r3(1.0f);
                this.Q1 = e2();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 0);
                int i = 0;
                int i2 = 0;
                while (true) {
                    lq8 lq8Var = this.d;
                    if (i >= lq8Var.e.O2) {
                        break;
                    }
                    u69 a = lq8Var.a(null, lq8Var.d(i));
                    View view = a.a;
                    this.d.t(a, i);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i2 += view.getMeasuredHeight();
                    i++;
                }
                int max = Math.max(0, this.fragmentView.getMeasuredHeight() - ((e2() + i2) + currentActionBarHeight));
                po8 po8Var = this.a;
                po8Var.setPadding(0, po8Var.getPaddingTop(), 0, max);
            }
        }
        this.M.m(user, 8, this.i1);
    }

    public final void J3() {
        if (!this.q2) {
            ap8 ap8Var = this.r;
            if (ap8Var != null) {
                Object tag = ap8Var.getTag();
                boolean z = tag instanceof Integer;
                ap8 ap8Var2 = this.r;
                if (z) {
                    ap8Var2.setTextColor(B1(cmb.v0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    ap8Var2.setTextColor(B1(cmb.v0(cmb.A8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.s6 != null ? -1 : cmb.v0(cmb.fd, this.A0), PorterDuff.Mode.MULTIPLY);
            }
            hs9 hs9Var = this.L;
            if (hs9Var != null) {
                hs9Var.b(cmb.v0(cmb.g8, this.A0));
            }
            mt1 mt1Var = this.f;
            if (mt1Var != null) {
                mt1Var.setTextColor(cmb.v0(cmb.li, this.A0));
            }
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                aVar.H(this.s6 == null ? cmb.v0(cmb.u8, this.A0) : -1, false);
                this.actionBar.G(this.s6 != null ? 553648127 : cmb.v0(cmb.e8, this.A0), false);
            }
        }
        P3();
        p4();
    }

    public final void K1() {
        ita itaVar = this.T;
        if (itaVar != null) {
            itaVar.setVisibility(!this.c6 && this.i6);
        }
    }

    public final void K2(ValueAnimator valueAnimator, float f, boolean z) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.V1 = floatValue;
        float f2 = (floatValue - 0.5f) / 0.5f;
        float f3 = (0.5f - floatValue) / 0.5f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = -f;
        this.U1 = (int) ((1.0f - floatValue) * f4);
        this.b.setTranslationY(floatValue * f);
        this.P.setTranslationY(f * this.V1);
        this.a.setTranslationY((1.0f - this.V1) * f4);
        this.a.setScaleX(1.0f - ((1.0f - this.V1) * 0.01f));
        this.a.setScaleY(1.0f - ((1.0f - this.V1) * 0.01f));
        this.a.setAlpha(this.V1);
        Q2(true);
        this.a.setAlpha(f2);
        this.b.setAlpha(1.0f - this.V1);
        this.b.setScaleX((this.V1 * 0.05f) + 1.0f);
        this.b.setScaleY((this.V1 * 0.05f) + 1.0f);
        this.P.setAlpha(1.0f - f2);
        this.Y.setAlpha(f2);
        this.f0.setAlpha(f2);
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.setAlpha(f2);
        }
        this.f.setAlpha(f2);
        this.r.setAlpha(this.c6 ? 0.0f : f2);
        this.U0.getSearchField().setAlpha(f3);
        if (z && this.V1 < 0.7f) {
            zja zjaVar = this.U0;
            if (zjaVar.G.getWidth() != 0 && !zjaVar.e.isFocused()) {
                zjaVar.e.requestFocus();
                gm.E3(zjaVar.e);
            }
        }
        this.U0.getSearchContainer().setVisibility(this.V1 < 0.5f ? 0 : 8);
        int i = this.V1 > 0.5f ? 0 : 8;
        zja zjaVar2 = this.T0;
        if (zjaVar2 != null) {
            zjaVar2.setVisibility(i);
            this.T0.setAlpha(f2);
        }
        this.U0.setVisibility(i);
        this.actionBar.B(this.V1 < 0.5f);
        zja zjaVar3 = this.T0;
        if (zjaVar3 != null) {
            zjaVar3.setAlpha(f2);
        }
        this.U0.setAlpha(f2);
        this.d1.invalidate();
        this.fragmentView.invalidate();
    }

    public final void K3() {
        ne6 ne6Var;
        if (this.a0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0);
        qn8 qn8Var = this.a0;
        boolean z = this.G1;
        qn8Var.e = z;
        if (z && this.J1 == 2 && (ne6Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * ne6Var.getHeight());
            this.a0.setAlpha(this.T1);
            qn8 qn8Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            qn8Var2.x = gm.L(74.0f);
            qn8Var2.setTranslationY(measuredWidth);
            qn8Var2.invalidate();
        } else {
            qn8Var.f = -1.0f;
            float f = currentActionBarHeight;
            float L = (this.Q1 + f) - gm.L((this.Q4 || this.R4) ? 25.0f : 0.0f);
            float min = Math.min(gm.L(74.0f), L - f);
            qn8 qn8Var3 = this.a0;
            qn8Var3.x = min;
            qn8Var3.setTranslationY(L - min);
            qn8Var3.invalidate();
        }
        ImageView imageView = this.P0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.a0.getClass();
        if (this.P0.getVisibility() == 0) {
            this.P0.setVisibility(8);
        }
        if (this.P0.getTag() instanceof r7) {
            ((r7) this.P0.getTag()).setAlpha(1.0f);
        }
    }

    public final void L1(int i) {
        boolean t0 = nha.t0(this.O.getClosestTab());
        if (i == this.Q6 && t0 == this.R6) {
            return;
        }
        this.Q6 = i;
        this.R6 = t0;
        if (t0) {
            b61[] b61VarArr = this.H5;
            if (i > 0) {
                b61VarArr[0].i(jb6.G(i, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                b61VarArr[0].i(this.G5, true, true);
                return;
            }
        }
        if (i > 0 || !oc7.r1(this.currentAccount).e5()) {
            this.H5[0].i(jb6.G(i, "ArchiveStories", new Object[0]), true, true);
        } else {
            this.H5[0].i(this.F5, true, true);
        }
    }

    public final void L2() {
        n57.b(getParentActivity(), this.currentAccount, a(), true, null, new v56(this, (byte) 21), this.A0);
    }

    public final void L3() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.w2;
        int i = (userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period;
        this.t0.b(i);
        this.a1.B(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x03cd, code lost:
    
        if (sd2.q0(r1, oc7.r1(r1).g4.f(r2.id, r13)) != false) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0746  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z15;
        TLRPC.ChatFull chatFull2;
        wn5 wn5Var;
        qn8 qn8Var;
        boolean z16;
        boolean z17;
        boolean z18;
        long j;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null || this.T0 == null) {
            return;
        }
        Context context = aVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.T0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.O0 = false;
        this.M0 = false;
        this.L0 = false;
        this.N0 = false;
        this.A1 = false;
        boolean z19 = true;
        if (this.e1 == 0) {
            if (this.f1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                this.p1 = false;
                if (this.g1 == 0 && sd2.w(1, L0)) {
                    N1(context);
                }
                if (sd2.T(L0)) {
                    if (this.q1) {
                        int i = this.currentAccount;
                        long j2 = this.g1;
                        if (!sd2.y(15, L0)) {
                            if (L0 != null && L0.forum) {
                            }
                        }
                        this.O0 = true;
                    } else if (sd2.N(L0) || (L0.megagroup && sd2.w(1, L0))) {
                        this.O0 = true;
                    }
                    if (this.v2 != null) {
                        if (sd2.w(14, L0) && this.v2.call == null) {
                            this.T0.e(15, R.drawable.msg_voicechat, (!L0.megagroup || L0.gigagroup) ? jb6.M0(2131744593, null) : jb6.M0(2131744591, null));
                            this.p1 = true;
                            if (!L0.megagroup || L0.gigagroup) {
                                z15 = false;
                                z12 = true;
                                chatFull2 = this.v2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().N1().i(a())) && this.g1 == 0) {
                                    this.T0.e(19, R.drawable.msg_stats, jb6.M0(2131744581, null));
                                }
                                qd2 f1 = getMessagesController().f1(this.f1, false, null);
                                this.M0 = f1 == null;
                                z11 = f1 == null || z15;
                            } else {
                                z15 = true;
                            }
                        } else {
                            z15 = false;
                        }
                        z12 = false;
                        chatFull2 = this.v2;
                        if (!chatFull2.can_view_stats) {
                        }
                        this.T0.e(19, R.drawable.msg_stats, jb6.M0(2131744581, null));
                        qd2 f12 = getMessagesController().f1(this.f1, false, null);
                        this.M0 = f12 == null;
                        if (f12 == null) {
                        }
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                    getMessagesController().N1();
                    if (L0 == null || !sd2.R(L0) || (!L0.creator && ((tL_chatAdminRights2 = L0.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().N1();
                        if (L0 != null && sd2.R(L0) && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.T0.e(39, R.drawable.msg_archive, jb6.M0(2131747543, null));
                        }
                        z13 = false;
                    } else {
                        this.T0.e(39, R.drawable.msg_archive, jb6.M0(2131747543, null));
                        z13 = true;
                    }
                    if (!L0.megagroup) {
                        if (sd2.t0(L0)) {
                            this.T0.e(10, R.drawable.msg_share, jb6.M0(2131752935, null));
                            z3 = !L0.creator;
                        } else {
                            z3 = false;
                        }
                        boolean z20 = e21.a;
                        if (getMessagesController().I3()) {
                            z14 = false;
                        } else {
                            jva.v(this.currentAccount, false).T();
                            this.T0.e(38, R.drawable.msg_gift_premium, jb6.M0(2131746369, null));
                            zja zjaVar = this.T0;
                            TLRPC.ChatFull chatFull3 = this.v2;
                            zjaVar.Q(38, chatFull3 != null && chatFull3.stargifts_available);
                            z14 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z6 = false;
                        } else {
                            this.T0.e(22, R.drawable.msg_discussion, jb6.M0(2131743239, null));
                            z6 = true;
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
                        }
                        TLRPC.Chat chat = this.F2;
                        if (chat.creator) {
                            this.T0.a(-1);
                            this.T0.e(7, R.drawable.msg_leave, jb6.M0(2131748761, null));
                            this.T0.e(45, R.drawable.msg_delete, jb6.M0(2131752368, null)).c(cmb.p7, cmb.o7);
                        } else if (chat.left || chat.kicked) {
                            z8 = z14;
                            z7 = z12;
                            z4 = z13;
                            z19 = false;
                            z5 = z11;
                        } else {
                            this.T0.e(7, R.drawable.msg_leave, jb6.M0(2131748761, null));
                        }
                        z8 = z14;
                        z7 = z12;
                        z4 = z13;
                        z19 = false;
                        z5 = z11;
                        z2 = true;
                        wn5Var = this.r0;
                        zja zjaVar2 = this.T0;
                        if (wn5Var == null) {
                        }
                        if (s2()) {
                        }
                        if (this.e1 != 0) {
                            a8 e = this.T0.e(24, R.drawable.msg_report, jb6.M0(2131745964, null));
                            int i2 = cmb.o7;
                            e.c(i2, i2);
                        }
                        if (z19) {
                            this.T0.e(31, R.drawable.msg_leave, jb6.M0(2131748500, null));
                        }
                        if (!this.q2) {
                        }
                        this.L0 = this.M0;
                        qn8Var = this.a0;
                        if (qn8Var == null) {
                        }
                        a4(z);
                        l4(z16);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || sd2.N(L0)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, jb6.M0(2131745491, null));
                    }
                    if (this.q1) {
                        int i3 = this.currentAccount;
                        long j3 = this.g1;
                        if (j3 != 1 && sd2.e(i3, L0, oc7.r1(i3).g4.f(L0.id, j3))) {
                            this.T0.e(23, R.drawable.msg_delete, jb6.J0(1, "DeleteTopics"));
                        }
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
                    }
                    if (L0.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, jb6.M0(2131748748, null));
                        this.T0.e(45, R.drawable.msg_delete, jb6.M0(2131751467, null)).c(cmb.p7, cmb.o7);
                    } else if (L0.left || L0.kicked || this.q1) {
                        z7 = z12;
                        z4 = z13;
                        z3 = false;
                        z19 = false;
                        z6 = false;
                        z8 = false;
                        z5 = z11;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, jb6.M0(2131748748, null));
                    }
                    z7 = z12;
                    z4 = z13;
                    z3 = false;
                    z19 = false;
                    z6 = false;
                    z8 = false;
                    z5 = z11;
                    z2 = true;
                    wn5Var = this.r0;
                    zja zjaVar22 = this.T0;
                    if (wn5Var == null) {
                        zjaVar22.e(33, R.drawable.msg_openprofile, jb6.M0(2131745276, null));
                        this.T0.e(21, R.drawable.msg_gallery, jb6.M0(2131745663, null));
                        this.T0.e(35, R.drawable.msg_delete, jb6.M0(2131751535, null));
                    } else {
                        zjaVar22.e(21, R.drawable.msg_gallery, jb6.M0(2131745663, null));
                    }
                    if (s2()) {
                        this.T0.u(21);
                    }
                    if (this.e1 != 0 && !this.s2 && !this.s1) {
                        a8 e2 = this.T0.e(24, R.drawable.msg_report, jb6.M0(2131745964, null));
                        int i22 = cmb.o7;
                        e2.c(i22, i22);
                    }
                    if (z19 && !this.s1) {
                        this.T0.e(31, R.drawable.msg_leave, jb6.M0(2131748500, null));
                    }
                    if (!this.q2) {
                        this.T0.u(21);
                        this.T0.u(33);
                        this.T0.S(36);
                        this.T0.u(34);
                        this.T0.u(35);
                    }
                    this.L0 = this.M0;
                    qn8Var = this.a0;
                    if (qn8Var == null) {
                        qn8Var.G = true;
                        qn8Var.o(4, z3);
                        this.a0.o(5, this.M0);
                        this.a0.o(6, this.N0);
                        this.a0.o(2, z6);
                        this.a0.o(9, z2);
                        this.a0.o(12, z4);
                        this.a0.o(10, z5);
                        this.a0.o(11, z7);
                        this.a0.o(3, z8);
                        z16 = false;
                        this.N0 = false;
                        this.M0 = false;
                        if (!z6) {
                            if (this.q1) {
                                this.a0.o(0, true);
                            } else {
                                if (this.f1 != 0) {
                                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.f1));
                                    if (sd2.c0(L02) || sd2.n0(L02)) {
                                        z16 = false;
                                        this.a0.o(0, true);
                                    } else if (!sd2.T(L02)) {
                                        z16 = false;
                                        this.a0.o(0, true);
                                    }
                                }
                                z16 = false;
                            }
                        }
                        qn8 qn8Var2 = this.a0;
                        if (qn8Var2.G) {
                            qn8Var2.G = z16;
                            qn8Var2.d();
                        }
                    } else {
                        z16 = false;
                    }
                    a4(z);
                    l4(z16);
                }
                if (this.v2 != null) {
                    if (sd2.w(14, L0) && this.v2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, jb6.M0(2131744591, null));
                        this.p1 = true;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qd2 f13 = getMessagesController().f1(this.f1, false, null);
                    this.M0 = f13 != null;
                    if (f13 != null || z10) {
                        z9 = true;
                        if (sd2.w(1, L0)) {
                            this.O0 = true;
                        }
                        if (!sd2.k0(L0) && !sd2.l0(L0) && ((chatFull = this.v2) == null || !chatFull.participants_hidden || sd2.N(L0))) {
                            this.A1 = true;
                            this.T0.e(17, R.drawable.msg_search, jb6.M0(2131745491, null));
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
                        }
                        this.T0.e(7, R.drawable.msg_leave, jb6.M0(2131751510, null));
                        z5 = z9;
                        z2 = true;
                        z3 = false;
                        z4 = false;
                    }
                }
                z9 = false;
                if (sd2.w(1, L0)) {
                }
                if (!sd2.k0(L0)) {
                    this.A1 = true;
                    this.T0.e(17, R.drawable.msg_search, jb6.M0(2131745491, null));
                }
                if (this.g1 == 0) {
                }
                this.T0.e(7, R.drawable.msg_leave, jb6.M0(2131751510, null));
                z5 = z9;
                z2 = true;
                z3 = false;
                z4 = false;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            z19 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            wn5Var = this.r0;
            zja zjaVar222 = this.T0;
            if (wn5Var == null) {
            }
            if (s2()) {
            }
            if (this.e1 != 0) {
            }
            if (z19) {
            }
            if (!this.q2) {
            }
            this.L0 = this.M0;
            qn8Var = this.a0;
            if (qn8Var == null) {
            }
            a4(z);
            l4(z16);
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 == null) {
            return;
        }
        if (m9c.D(W1)) {
            if (this.s1) {
                qn8 qn8Var3 = this.a0;
                if (qn8Var3 != null) {
                    this.O0 = !(qn8Var3.F == 6);
                } else {
                    this.O0 = true;
                }
            }
            if (!this.J0) {
                this.T0.e(30, R.drawable.msg_edit, jb6.M0(2131751215, null));
                if (this.r0 != null) {
                    this.T0.e(36, R.drawable.msg_addphoto, jb6.M0(2131754389, null));
                }
            }
            this.V0 = this.T0.e(40, R.drawable.menu_profile_colors, jb6.M0(2131746413, null));
            O3();
            if (this.s1) {
                this.X0 = this.T0.e(43, R.drawable.menu_username_change, jb6.M0(2131746353, null));
                this.W0 = this.T0.e(42, R.drawable.msg_link2, jb6.M0(2131746412, null));
                b4();
            }
            z17 = false;
            z18 = false;
        } else {
            if (W1.bot && W1.bot_can_edit) {
                this.O0 = true;
            }
            TLRPC.UserFull userFull = this.w2;
            if (userFull != null && userFull.phone_calls_available) {
                this.M0 = true;
                this.N0 = userFull.video_calls_available;
            }
            if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                if (this.E2 == null) {
                    N1(context);
                }
                if (!TextUtils.isEmpty(W1.phone)) {
                    this.T0.e(3, R.drawable.msg_share, jb6.M0(2131745195, null));
                }
                this.T0.e(2, R.drawable.msg_block, !this.k1 ? jb6.M0(2131753658, null) : jb6.M0(2131743598, null));
                this.T0.e(4, R.drawable.msg_edit, jb6.M0(2131751219, null));
                this.T0.e(5, R.drawable.msg_delete, jb6.M0(2131751489, null));
            } else if (oc7.G2(W1)) {
                if (this.k1) {
                    this.T0.e(2, R.drawable.msg_block, jb6.M0(2131743598, null));
                }
                this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
            } else if (a() != 489000) {
                if (this.E2 == null) {
                    N1(context);
                }
                this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
                boolean z21 = this.s2;
                zja zjaVar3 = this.T0;
                if (z21) {
                    zjaVar3.e(10, R.drawable.msg_share, jb6.M0(2131752935, null));
                    z17 = true;
                } else {
                    zjaVar3.e(1, R.drawable.msg_addcontact, jb6.M0(2131754450, null));
                    z17 = false;
                }
                if (!TextUtils.isEmpty(W1.phone)) {
                    this.T0.e(3, R.drawable.msg_share, jb6.M0(2131745195, null));
                }
                boolean z22 = this.s2;
                zja zjaVar4 = this.T0;
                if (z22) {
                    zjaVar4.e(44, R.drawable.menu_privacy_policy, jb6.M0(2131752966, null));
                    boolean p2 = p2();
                    zja zjaVar5 = this.T0;
                    if (p2) {
                        zjaVar5.S(44);
                    } else {
                        zjaVar5.u(44);
                    }
                    a8 e3 = this.T0.e(24, R.drawable.msg_report, jb6.M0(2131745964, null));
                    int i4 = cmb.o7;
                    e3.c(i4, i4);
                    boolean z23 = this.k1;
                    zja zjaVar6 = this.T0;
                    if (z23) {
                        zjaVar6.e(2, R.drawable.msg_retry, jb6.M0(2131752948, null));
                    } else {
                        zjaVar6.e(2, R.drawable.msg_block2, jb6.M0(2131751511, null)).c(i4, i4);
                    }
                } else {
                    zjaVar4.e(2, R.drawable.msg_block, !this.k1 ? jb6.M0(2131753658, null) : jb6.M0(2131743598, null));
                }
                if (!m9c.z(W1) && !this.s2 && this.E2 == null && !this.k1) {
                    j = this.e1;
                    if (j != 333000 && j != 777000 && j != 42777) {
                        boolean z24 = e21.a;
                        if (!W1.self || W1.bot || oc7.G2(W1) || getMessagesController().I3()) {
                            z18 = false;
                        } else {
                            jva.v(this.currentAccount, false).T();
                            this.T0.e(38, R.drawable.msg_gift_premium, jb6.M0(2131746370, null));
                            z18 = true;
                        }
                        if (getMessagesController().l4.n0.f && !oc7.G2(W1) && !m9c.C(W1.id)) {
                            this.T0.e(48, R.drawable.ic_gram, jb6.M0(2131742680, null));
                        }
                        this.T0.e(20, R.drawable.msg_secret, jb6.M0(2131744601, null));
                        zja zjaVar7 = this.T0;
                        TL_account.RequirementToContact L2 = getMessagesController().L2(this.e1);
                        zjaVar7.Q(20, L2 != null || (L2 instanceof TL_account.requirementToContactEmpty));
                        if (this.w2 != null) {
                            this.T0.e(46, R.drawable.menu_share_off_24, jb6.M0(2131751365, null));
                            this.T0.e(47, R.drawable.menu_share_on_24, jb6.M0(2131751087, null));
                            TLRPC.UserFull userFull2 = this.w2;
                            boolean z25 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.T0.Q(46, z25);
                            this.T0.Q(47, !z25);
                        }
                        if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                            this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
                        }
                        z19 = false;
                    }
                }
                z18 = false;
                if (!this.s2) {
                    this.T0.e(14, R.drawable.msg_home, jb6.M0(2131754387, null));
                }
                z19 = false;
            }
            z17 = false;
            if (!m9c.z(W1)) {
                j = this.e1;
                if (j != 333000) {
                    boolean z242 = e21.a;
                    if (W1.self) {
                    }
                    z18 = false;
                    if (getMessagesController().l4.n0.f) {
                        this.T0.e(48, R.drawable.ic_gram, jb6.M0(2131742680, null));
                    }
                    this.T0.e(20, R.drawable.msg_secret, jb6.M0(2131744601, null));
                    zja zjaVar72 = this.T0;
                    TL_account.RequirementToContact L22 = getMessagesController().L2(this.e1);
                    zjaVar72.Q(20, L22 != null || (L22 instanceof TL_account.requirementToContactEmpty));
                    if (this.w2 != null) {
                    }
                    if (!this.s2) {
                    }
                    z19 = false;
                }
            }
            z18 = false;
            if (!this.s2) {
            }
            z19 = false;
        }
        z8 = z18;
        z4 = false;
        z5 = false;
        z6 = false;
        z7 = false;
        z3 = z17;
        z2 = false;
        wn5Var = this.r0;
        zja zjaVar2222 = this.T0;
        if (wn5Var == null) {
        }
        if (s2()) {
        }
        if (this.e1 != 0) {
        }
        if (z19) {
        }
        if (!this.q2) {
        }
        this.L0 = this.M0;
        qn8Var = this.a0;
        if (qn8Var == null) {
        }
        a4(z);
        l4(z16);
    }

    public final void M2(TLRPC.EmojiStatus emojiStatus, TLRPC.User user, mt1 mt1Var) {
        gn5 b;
        String str;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            l11.u(getParentActivity(), "https://" + getMessagesController().N2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        yj8 yj8Var = new yj8(this, this.currentAccount, user, null, null, this.A0);
        mt1Var.getLocationOnScreen(new int[2]);
        yj8Var.q2 = mt1Var.i0;
        yj8Var.r2 = mt1Var.j0;
        yj8Var.u2 = mt1Var.getScaleX();
        yj8Var.s2 = mt1Var.getLeft();
        yj8Var.t2 = mt1Var.getTop();
        yj8Var.v2 = mt1Var;
        Drawable rightDrawable = mt1Var.getRightDrawable();
        tm tmVar = this.G;
        if (rightDrawable == tmVar && tmVar != null) {
            Drawable drawable = tmVar.f[0];
            if (drawable instanceof vm) {
                yj8Var.u2 *= 0.98f;
                TLRPC.Document document = ((vm) drawable).e;
                if (document != null) {
                    bf0 bf0Var = new bf0(getParentActivity());
                    meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                    TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = gn5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && k47.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = gn5.b(document);
                        str = "160_160";
                    }
                    gn5 gn5Var = b;
                    String str2 = str;
                    bf0Var.setLayerNum(7);
                    bf0Var.setRoundRadius(gm.L(4.0f));
                    bf0Var.j(gn5Var, str2, gn5.c(w, document), "140_140", d, document);
                    if (((vm) this.G.f[0]).c()) {
                        bf0Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.u6, this.A0), PorterDuff.Mode.SRC_IN));
                        yj8Var.x2 = k47.i1(document);
                    } else {
                        yj8Var.x2 = k47.i1(document);
                    }
                    yj8Var.w2 = bf0Var;
                    yj8Var.z2 = true;
                }
            }
        }
        showDialog(yj8Var);
    }

    public final void M3() {
        if (this.D5 != null) {
            wp8 wp8Var = this.O;
            boolean z = ((wp8Var == null || !wp8Var.isAttachedToWindow()) ? (float) gm.L(72.0f) : ((float) gm.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
            fn0 fn0Var = this.X5;
            fn0Var.a(z, true);
            float f = fn0Var.e;
            this.D5.setTranslationY(gm.U1(f, gm.L(60.0f), 0));
            this.D5.setAlpha(f);
            this.D5.setVisibility(f <= 0.0f ? 4 : 0);
            u31 u31Var = u31.x;
            if (u31Var != null) {
                u31Var.l();
            }
        }
    }

    public final void N1(Context context) {
        int i;
        this.a1 = new trc(context, this.T0.getPopupLayout().getSwipeBack(), new ai4((Object) this, (byte) 23), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int v0 = cmb.v0(cmb.m6, this.A0);
            trc trcVar = this.a1;
            l66 l66Var = (l66) trcVar.e;
            if (l66Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) jb6.M0(2131753813, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) gm.K2(jb6.M0(2131753812, null), v0, new f00(trcVar, (byte) 6)));
                l66Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null) {
            TLRPC.ChatFull chatFull = this.v2;
            i = chatFull != null ? chatFull.ttl_period : 0;
        } else {
            i = userFull.ttl_period;
        }
        sqb a = sqb.a(i);
        this.t0 = a;
        this.Z0 = this.T0.i(0, a, jb6.M0(2131753811, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        L3();
    }

    public final void N2(boolean z) {
        boolean c0 = sd2.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        ik.r(this, false, chat, null, false, c0 || z || (chat != null && chat.creator), z, !c0, new tn8(this, (byte) 3));
    }

    public final void N3() {
        hg5 hg5Var = this.M6;
        if (hg5Var != null) {
            hg5Var.o(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-hg5Var.getPaddingLeft()));
            float S1 = gm.S1(this.m2, this.n2);
            this.M6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - gm.L(24.0f)) + gm.U1(S1, gm.L(6.0f), -gm.L(12.0f)));
            this.M6.i(on2.f(S1, this.N6, 1342177280));
            boolean z = this.Q1 >= ((float) gm.L(82.0f));
            Boolean bool = this.O6;
            if (bool == null || bool.booleanValue() != z) {
                ViewPropertyAnimator animate = this.M6.animate();
                this.O6 = Boolean.valueOf(z);
                wi8.t(animate.alpha(z ? 1.0f : 0.0f), d53.g, 200L);
            }
        }
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
        sb5 sb5Var = this.h0;
        if (sb5Var == null) {
            return;
        }
        sb5Var.setProgress(0.0f);
    }

    public final void O1() {
        if (this.fragmentView == null || !this.z6 || this.z2 == null || getParentActivity() == null) {
            return;
        }
        cr8 cr8Var = this.L6;
        if (cr8Var != null) {
            cr8Var.b(this.z2);
            this.L6.invalidate();
        } else {
            cr8 cr8Var2 = new cr8(this, this.z2);
            this.L6 = cr8Var2;
            ((FrameLayout) this.fragmentView).addView(cr8Var2, qoe.e(-1, -1, 55));
        }
    }

    public final void O3() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().p()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.E8, this.A0), PorterDuff.Mode.SRC_IN));
        this.b7 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new o38(drawable, drawable2, gm.L(1.0f), -gm.L(1.0f)));
    }

    public final void P1(Context context) {
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            gm.B2(rjaVar);
        }
        lp8 lp8Var = new lp8(this, context, this.A0);
        this.simpleActionBar = lp8Var;
        lp8Var.setTitlesAlpha(0.0f);
        if (!this.w5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new wg0(this, (byte) 4));
        boolean z = this.J0;
        rja rjaVar2 = this.simpleActionBar;
        if (z) {
            rjaVar2.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(jb6.M0(2131746233, null));
        } else {
            rjaVar2.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 3));
        if (this.J0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new u0(this, backButton, (byte) 6));
    }

    public final boolean P2() {
        return getMessagesController().N1().J(a()) && !this.q1;
    }

    public final void P3() {
        Q3(this.r6);
    }

    @Override // gha
    public final void Q() {
        fha fhaVar;
        wp8 wp8Var = this.O;
        if (wp8Var != null && (fhaVar = this.R) != null) {
            wp8Var.setNewMediaCounts(fhaVar.c);
        }
        if (this.d != null) {
            c4(false, false);
        }
        W();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q2(boolean z) {
        float f;
        float f2;
        bf0 currentItemView;
        float f3;
        float f4;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0);
        float E1 = E1();
        V3();
        po8 po8Var = this.a;
        if (po8Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) po8Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        o4(z);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) e2()) || this.Q1 >= ((float) ((Y1() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.n6 && this.G1) {
            D1();
            return;
        }
        int e2 = e2();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                this.a0.o(2, (!sd2.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            o4(z);
            float translationY = this.actionBar.getTranslationY() + (hg9.u(E1, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? gm.m : 0) - gm.L(21.0f));
            if (this.G1) {
                this.b2 = translationY;
            } else {
                bt8 bt8Var = this.u0;
                if (bt8Var != null) {
                    f4 = -gm.L(29.0f);
                    yl7 yl7Var = bt8Var.n;
                    if (yl7Var != null && yl7Var.c) {
                        f4 = yl7Var.e.centerY();
                    }
                } else {
                    f4 = -gm.L(29.0f);
                }
                this.b2 = gm.R1(f4, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) - gm.L(21.0f)), E1);
            }
            float f5 = this.G1 ? this.S1 : this.Q1;
            float f6 = e2;
            if (f5 > f6 || this.q2) {
                f = 2.0f;
                float x = kt6.x(f5 - f6, (this.a.getMeasuredWidth() - currentActionBarHeight) - f2(), 1.0f, 0.0f);
                this.i2 = x;
                f2 = 18.0f;
                this.c2 = (gm.R1(2.2857144f, 3.2857144f, Math.min(1.0f, x * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                bp8 bp8Var = this.v0;
                if (bp8Var != null) {
                    bp8Var.invalidate();
                }
                xs8 xs8Var = this.w0;
                if (xs8Var != null) {
                    xs8Var.invalidate();
                }
                float min = Math.min(gm.N(2000.0f), Math.max(gm.N(1100.0f), Math.abs(this.j2))) / gm.N(1100.0f);
                Y1();
                boolean z2 = this.p2;
                int i = nm7.v4;
                float[] fArr = this.n2;
                if (!z2 || (!this.G0 && this.i2 < 0.33f)) {
                    if (this.q2) {
                        this.q2 = false;
                        nm7.e().k(i, Boolean.TRUE);
                        zja zjaVar = this.T0;
                        if (zjaVar != null) {
                            zjaVar.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        zja zjaVar2 = this.U0;
                        if (zjaVar2 != null) {
                            zjaVar2.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().w0(false);
                        float S1 = gm.S1(this.m2, fArr);
                        fArr[0] = S1;
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(d53.j);
                        boolean z3 = this.o2;
                        ValueAnimator valueAnimator = this.k2;
                        if (z3) {
                            valueAnimator.setDuration(0L);
                        } else {
                            valueAnimator.setDuration((long) ((S1 * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(cmb.v0(cmb.Z6, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            boolean z4 = currentItemView.getImageReceiver().t() instanceof jbc;
                            yo8 yo8Var = this.f0;
                            if (z4) {
                                yo8Var.b0 = false;
                            } else {
                                yo8Var.b0 = true;
                                yo8Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new cp8(this, (byte) 5));
                        this.f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.o0.setAlpha(0.0f);
                        this.k2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    X1();
                    ValueAnimator valueAnimator2 = this.k2;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        k3();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(h2(this.g2, this.H6));
                        this.r.setTranslationY(i2(this.h2));
                        N3();
                    }
                } else {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            boolean s2 = s2();
                            zja zjaVar3 = this.T0;
                            if (s2) {
                                zjaVar3.u(21);
                            } else {
                                zjaVar3.S(21);
                            }
                            if (this.r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        zja zjaVar4 = this.U0;
                        if (zjaVar4 != null) {
                            zjaVar4.setEnabled(false);
                        }
                        this.q2 = true;
                        nm7.e().k(i, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        float S12 = gm.S1(this.m2, fArr);
                        fArr[0] = S12;
                        fArr[1] = 1.0f;
                        bp8 bp8Var2 = this.v0;
                        if (bp8Var2 == null || bp8Var2.x.isEmpty()) {
                            this.k2.setInterpolator(d53.j);
                            this.k2.setDuration((long) (((1.0f - S12) * 250.0f) / min));
                        } else {
                            this.k2.setInterpolator(new l94());
                            this.k2.setDuration((long) ((((1.0f - S12) * 1.3f) * 250.0f) / min));
                        }
                        this.k2.addListener(new cp8(this, (byte) 4));
                        View m = this.c.m(0);
                        if (!this.P1 && m != null) {
                            this.O1 = true;
                            this.a.y0(((m.getTop() - this.a.getMeasuredWidth()) - Y1()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0), (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
                            this.a.P0 = false;
                        }
                        this.l6 = this.f.getTranslationY();
                        this.m6 = this.r.getTranslationY();
                        this.k2.start();
                        this.o0.setAlpha(0.0f);
                        this.o0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.o0.getLayoutParams();
                    int i2 = layoutParams2.height;
                    layoutParams2.width = this.a.getMeasuredWidth();
                    float f8 = currentActionBarHeight + f5;
                    int i3 = (int) f8;
                    layoutParams2.height = i3;
                    if (i2 != i3) {
                        this.o0.requestLayout();
                    }
                    if (!this.k2.isRunning()) {
                        float L = (this.G1 && this.J1 == 2) ? (-(1.0f - this.T1)) * gm.L(50.0f) : 0.0f;
                        this.f.setTranslationX(gm.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f8 - Y1()) - gm.N(30.0f)) - this.f.getBottom()) + L);
                        this.r.setTranslationX(h2(gm.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(i2((((f8 - Y1()) - gm.N(10.0f)) - this.r.getBottom()) + L));
                        N3();
                    }
                }
            } else {
                f = 2.0f;
                f2 = 18.0f;
            }
            boolean z5 = this.G1;
            if (z5 && this.J1 == 2) {
                float f9 = this.p6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / f) + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) - (gm.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = gm.U1(this.T1, 42, nm7.T1) / 100.0f;
                this.d2 = 0.0f;
                bp8 bp8Var3 = this.v0;
                if (bp8Var3 != null) {
                    bp8Var3.setExpandProgress(1.0f);
                }
                xs8 xs8Var2 = this.w0;
                if (xs8Var2 != null) {
                    xs8Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) gm.R1(n2(), 0.0f, this.T1));
                this.Y.setTranslationX(gm.R1(f9, 0.0f, this.T1));
                this.Y.setTranslationY(gm.R1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - gm.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + gm.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + gm.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + gm.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + gm.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + gm.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + gm.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + gm.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + gm.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                yo8 yo8Var2 = this.f0;
                float f10 = this.T1;
                float f11 = this.c2;
                yo8Var2.I = f10;
                yo8Var2.J = f11;
                yo8Var2.H = true;
                this.N.e(false, f10);
                this.actionBar.H(on2.f(this.T1, this.s6 != null ? -1 : cmb.v0(cmb.u8, this.A0), -1), false);
                hs9 hs9Var = this.L;
                if (hs9Var != null) {
                    hs9Var.b(on2.f(this.T1, cmb.v0(cmb.g8, this.A0), -1275068417));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.s6 == null ? on2.f(this.T1, cmb.v0(cmb.fd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                x43 x43Var = this.J;
                if (x43Var != null) {
                    x43Var.a(this.T1);
                    this.f.invalidate();
                }
                x43 x43Var2 = this.K;
                if (x43Var2 != null) {
                    x43Var2.a(this.T1);
                    this.f.invalidate();
                }
                Q3(this.T1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams3.width = (int) gm.R1(gm.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams3.height = (int) gm.R1(gm.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                N3();
            } else if (f5 <= f6) {
                if (z5) {
                    this.c2 = gm.U1(E1, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f3 = 1.0f;
                } else {
                    bt8 bt8Var2 = this.u0;
                    this.c2 = gm.R1(bt8Var2 != null ? bt8Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, E1) / 100.0f;
                    f3 = 1.0f;
                    this.d2 = 1.0f - E1;
                }
                qn8 qn8Var = this.a0;
                if (qn8Var != null) {
                    if (this.G1) {
                        qn8Var.setAlpha(this.T1);
                    } else {
                        qn8Var.setAlpha(f3);
                    }
                }
                bp8 bp8Var4 = this.v0;
                if (bp8Var4 != null) {
                    bp8Var4.invalidate();
                }
                xs8 xs8Var3 = this.w0;
                if (xs8Var3 != null) {
                    xs8Var3.h = this.G1;
                    float l = Utilities.l((E1 - 0.3f) / 0.7f);
                    if (xs8Var3.f != l) {
                        xs8Var3.f = l;
                        xs8Var3.invalidate();
                    }
                }
                float R1 = this.G1 ? gm.R1(k2(0), 1.12f, E1) : (0.12f * E1) + 1.0f;
                ValueAnimator valueAnimator3 = this.k2;
                if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    X1();
                    this.Y.setTranslationY((float) Math.ceil(this.b2));
                    float L2 = (((this.c2 * 100.0f) / 42.0f) * gm.L(42.0f)) - gm.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + gm.L(16.0f) + L2);
                    this.i0.setTranslationY(this.Y.getY() + gm.L(-10.0f) + L2);
                    this.j0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L2);
                    this.j0.setTranslationY(this.Y.getY() + gm.L(26.5f) + L2);
                    this.k0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L2);
                    this.k0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L2);
                    this.l0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L2);
                    this.l0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L2);
                } else {
                    ValueAnimator valueAnimator4 = this.k2;
                    cp8 cp8Var = this.j6;
                    valueAnimator4.removeListener(cp8Var);
                    this.k2.addListener(cp8Var);
                }
                float N = ((gm.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.G1 ? this.T1 : E1)) + ((float) Math.floor(translationY));
                this.f2 = td4.A(1.0f, this.T1, 0.0f, (gm.L(7.0f) * E1) + gm.L(1.3f) + N);
                this.h2 = (((float) Math.floor(gm.p * 11.0f)) * E1) + N + gm.L(24.0f);
                float L3 = this.G1 ? (this.p6 - gm.L(109.0f)) + gm.L(48.0f) : -gm.N(46.0f);
                vq8 vq8Var = this.K6;
                if (vq8Var != null) {
                    vq8Var.setAlpha((int) (255.0f * E1));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R12 = this.G1 ? gm.R1(k2(1), 1.0f, E1) : 1.0f;
                this.r.setScaleX(R12);
                this.r.setScaleY(R12);
                R2(0, E1, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f12 = measuredWidth2 / f;
                float min2 = f12 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * R1) * 0.5f) + layoutParams4.leftMargin);
                float f13 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.A5 || this.r.getExactWidth() > (f13 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f12 - ((Math.min(this.r.getExactWidth(), f13) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.e2 = min2;
                this.g2 = min3;
                this.H6 = paddingLeft;
                if (this.G1) {
                    min2 = gm.R1(l2(L3, 0, this.f), min2, E1);
                    min3 = gm.R1(l2(L3, 1, this.r), min3, E1);
                }
                ValueAnimator valueAnimator5 = this.k2;
                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(h2(min3, this.H6 * E1));
                    this.r.setTranslationY(i2(this.h2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i4 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((gm.O1() ? gm.L(490.0f) : gm.q.x) - gm.L(f2)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i4) {
                    this.f.requestLayout();
                }
                N3();
            }
            ValueAnimator valueAnimator6 = this.k2;
            if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
                R2(0, E1, true);
            }
        }
        T3(currentActionBarHeight);
        if (E1 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void Q3(float f) {
        int R0;
        ec7 ec7Var = this.s6;
        if (ec7Var != null) {
            R0 = on2.f(0.25f, ec7Var.m(cmb.I.o()), -1);
        } else {
            R0 = gm.R0(this.b6, 1.0f, cmb.v0(cmb.pi, this.A0), cmb.v0(cmb.Ej, this.A0));
        }
        int f2 = on2.f(f, R0, -1);
        int i = cmb.Ej;
        int f3 = on2.f(Math.max(this.b6, this.L5), f2, cmb.v0(i, this.A0));
        tm tmVar = this.G;
        if (tmVar != null) {
            tmVar.k(Integer.valueOf(f3));
        }
        tm tmVar2 = this.H;
        if (tmVar2 != null) {
            tmVar2.k(Integer.valueOf(on2.f(this.b6, on2.f(f, R0, -1711276033), cmb.v0(i, this.A0))));
        }
        this.e0.setColor(f3);
        this.r6 = f;
    }

    public final void R1(float f) {
        ValueAnimator ofFloat;
        byte b = 0;
        boolean z = f > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.v6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.v6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new bo8(this, b));
        this.v6.playTogether(arrayList);
        this.v6.setDuration(z ? 150L : 220L);
        if (!z) {
            this.v6.addListener(new cp8(this, (byte) 6));
        }
        this.v6.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R2(int i, float f, boolean z) {
        float scaleX;
        float f2;
        int i2;
        int i3;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.Q1 > e2() || ((valueAnimator = this.k2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f < 1.0f) {
                f2 = 1.12f;
                scaleX = 1.0f;
                int L = !gm.O1() ? gm.L(490.0f) : gm.q.x;
                rja rjaVar = this.simpleActionBar;
                int max = L - (((int) Math.max(gm.L(64.0f), (rjaVar == null ? rjaVar.t().getTargetPillWidth() : gm.L(46.0f)) + gm.L(18.0f))) << 1);
                int i4 = (int) (max / (i == 0 ? scaleX : 1.0f));
                if (i == 0) {
                    i2 = i;
                } else {
                    int L2 = L - (gm.L(18.0f) << 1);
                    int i5 = (int) (L2 / f2);
                    i2 = L2;
                    i = i5;
                }
                d53 d53Var = d53.i;
                int U1 = gm.U1(d53Var.getInterpolation(f), i4, i);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i6 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(U1);
                if (z) {
                    int min = Math.min(layoutParams.width, (int) (((L - gm.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                    layoutParams.width = min;
                    if (min != i6) {
                        this.f.requestLayout();
                    }
                }
                int U12 = gm.U1(d53Var.getInterpolation(f), max, i2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                i3 = layoutParams2.width;
                ceil = (int) Math.ceil(U12);
                layoutParams2.width = ceil;
                if (i3 == ceil) {
                    this.r.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(this.f.getScaleX(), 1.12f);
        }
        f2 = scaleX;
        if (!gm.O1()) {
        }
        rja rjaVar2 = this.simpleActionBar;
        int max2 = L - (((int) Math.max(gm.L(64.0f), (rjaVar2 == null ? rjaVar2.t().getTargetPillWidth() : gm.L(46.0f)) + gm.L(18.0f))) << 1);
        int i42 = (int) (max2 / (i == 0 ? scaleX : 1.0f));
        if (i == 0) {
        }
        d53 d53Var2 = d53.i;
        int U13 = gm.U1(d53Var2.getInterpolation(f), i42, i);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i62 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(U13);
        if (z) {
        }
        int U122 = gm.U1(d53Var2.getInterpolation(f), max2, i2);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i3 = layoutParams22.width;
        ceil = (int) Math.ceil(U122);
        layoutParams22.width = ceil;
        if (i3 == ceil) {
        }
    }

    public final void R3() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    public final void S1(int i, View view) {
        bu5 I = bu5.I(this, view);
        I.X(this.a.V0(view, false));
        I.w = false;
        I.k(R.drawable.msg_copy, jb6.M0(2131751704, null), new v56(this, (byte) 4), this.w2 != null);
        I.b(R.drawable.msg_edit, jb6.M0(2131751272, null), new v56(this, (byte) 5), false);
        I.b(R.drawable.msg_delete, jb6.M0(2131746054, null), new ge7((Object) this, i, (byte) 7), true);
        I.a0();
    }

    public final void S3() {
        if (this.q1 || !sd2.c0(this.F2)) {
            return;
        }
        lo7 notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new of2((Object) notificationsController, -this.f1, (Object) new jo8(this, (byte) 0), (byte) 6));
    }

    public final boolean T1(final int i, View view) {
        TLRPC.User f;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final byte b = 0;
        if (this.s1 && (f = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().X1(f.id);
            }
            if (userFull != null) {
                String M0 = jb6.M0(2131751704, null);
                String M02 = jb6.M0(2131743879, null);
                if (i == this.L3 || i == this.K3 || i == this.X2) {
                    str = userFull.about;
                    if (i == this.X2) {
                        M02 = jb6.M0(2131753686, null);
                    }
                } else if (i == this.P3) {
                    str = ss7.k0(this.currentAccount, f, userFull.business_work_hours);
                    M0 = jb6.M0(2131746398, null);
                    M02 = jb6.M0(2131752714, null);
                } else if (i == this.Q3) {
                    str = userFull.business_location.address;
                    M0 = jb6.M0(2131746393, null);
                    M02 = jb6.M0(2131752646, null);
                } else if (i == this.M3) {
                    str = m9c.p(f);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    M0 = jb6.M0(2131746411, null);
                    M02 = jb6.M0(2131743352, null);
                } else if (i == this.H3) {
                    str = f.phone;
                    M02 = jb6.M0(2131747028, null);
                } else if (i == this.V2) {
                    str = UserInfoActivity.d0(this.w2.birthday);
                    M02 = jb6.M0(2131753681, null);
                } else {
                    str = null;
                }
                bu5 I = bu5.I(this, view);
                I.X(this.a.V0(view, false));
                I.w = false;
                I.i = (byte) 3;
                if (i == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.b(R.drawable.msg_view_file, jb6.M0(2131746389, null), new v56(this, (byte) 7), false);
                    }
                    I.b(R.drawable.msg_map, jb6.M0(2131746391, null), new v56(this, (byte) 9), false);
                }
                final byte b2 = 1;
                if (str != null) {
                    I.b(R.drawable.msg_copy, M0, new ak8(this, str, M02, b2), false);
                }
                if (i == this.P3) {
                    I.b(R.drawable.msg_edit, jb6.M0(2131746397, null), new v56(this, (byte) 10), false);
                    I.b(R.drawable.msg_delete, jb6.M0(2131746396, null), new Runnable(this) { // from class: zn8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            final int i2 = i;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b3) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131752715, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131752716, null);
                                    final byte b4 = 1;
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() { // from class: co8
                                        @Override // ee
                                        public final void r(he heVar2, int i3) {
                                            byte b5 = b4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b5) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131752647, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131752648, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() { // from class: co8
                                        @Override // ee
                                        public final void r(he heVar22, int i3) {
                                            byte b52 = b5;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i == this.Q3) {
                    I.b(R.drawable.msg_edit, jb6.M0(2131746392, null), new v56(this, (byte) 11), false);
                    I.b(R.drawable.msg_delete, jb6.M0(2131746390, null), new Runnable(this) { // from class: zn8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final int i2 = i;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b3) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131752715, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131752716, null);
                                    final byte b4 = 1;
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() { // from class: co8
                                        @Override // ee
                                        public final void r(he heVar22, int i3) {
                                            byte b52 = b4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131752647, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131752648, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() { // from class: co8
                                        @Override // ee
                                        public final void r(he heVar22, int i3) {
                                            byte b52 = b5;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i == this.M3) {
                    I.b(R.drawable.msg_edit, jb6.M0(2131746353, null), new v56(this, (byte) 12), false);
                } else if (i == this.L3 || i == this.K3 || i == this.X2) {
                    I.b(R.drawable.msg_edit, jb6.M0(2131746410, null), new v56(this, (byte) 13), false);
                } else if (i == this.H3) {
                    I.b(R.drawable.menu_storage_path, jb6.M0(2131746379, null), new v56(this, (byte) 14), false);
                } else if (i == this.V2) {
                    I.b(R.drawable.msg_edit, jb6.M0(2131746458, null), new Runnable(this) { // from class: xn8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b3) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    profileActivity.showDialog((my0) ik.l(profileActivity.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), userFull2.birthday, new u35(profileActivity, userFull2, (byte) 20), new v56(profileActivity, (byte) 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131753682, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131753683, null);
                                    final byte b4 = 1;
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() { // from class: do8
                                        @Override // ee
                                        public final void r(he heVar2, int i2) {
                                            byte b5 = b4;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b5) {
                                                case 0:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.e7;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().i2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131746415, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131746416, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() { // from class: do8
                                        @Override // ee
                                        public final void r(he heVar22, int i2) {
                                            byte b52 = b5;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.e7;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.e7;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().i2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    break;
                            }
                        }
                    }, false);
                    I.b(R.drawable.msg_delete, jb6.M0(2131746054, null), new Runnable(this) { // from class: xn8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b3) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    profileActivity.showDialog((my0) ik.l(profileActivity.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), userFull2.birthday, new u35(profileActivity, userFull2, (byte) 20), new v56(profileActivity, (byte) 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131753682, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131753683, null);
                                    final byte b4 = 1;
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() { // from class: do8
                                        @Override // ee
                                        public final void r(he heVar22, int i2) {
                                            byte b52 = b4;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.e7;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.e7;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().i2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131746415, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131746416, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() { // from class: do8
                                        @Override // ee
                                        public final void r(he heVar22, int i2) {
                                            byte b52 = b5;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.e7;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.e7;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().i2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i == this.R2) {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(userFull.personal_channel_id));
                    if (L0 != null && sd2.K(L0, false) != null) {
                        I.b(R.drawable.msg_copy, jb6.M0(2131746414, null), new mn8(this, L0, (byte) 5), false);
                    }
                    I.b(R.drawable.msg_edit, jb6.M0(2131746417, null), new v56(this, (byte) 8), false);
                    final byte b3 = 2;
                    I.b(R.drawable.msg_delete, jb6.M0(2131746054, null), new Runnable(this) { // from class: xn8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b32) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    profileActivity.showDialog((my0) ik.l(profileActivity.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), userFull2.birthday, new u35(profileActivity, userFull2, (byte) 20), new v56(profileActivity, (byte) 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131753682, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131753683, null);
                                    final byte b4 = 1;
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() { // from class: do8
                                        @Override // ee
                                        public final void r(he heVar22, int i2) {
                                            byte b52 = b4;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.e7;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.e7;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().i2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131746415, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131746416, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() { // from class: do8
                                        @Override // ee
                                        public final void r(he heVar22, int i2) {
                                            byte b52 = b5;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b52) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.e7;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.e7;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().i2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                    profileActivity2.c4(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    break;
                            }
                        }
                    }, true);
                }
                if (I.y() > 0) {
                    I.a0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void T2(boolean z) {
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 != null) {
            if (this.s2 && !oc7.G2(W1)) {
                if (!this.k1 || z) {
                    ik.r(this, false, this.F2, W1, this.E2 != null, true, false, true, new wn8(this, W1));
                    return;
                } else {
                    getMessagesController().n5(new v56(this, (byte) 6), this.e1);
                    finishFragment();
                    return;
                }
            }
            if (this.k1) {
                getMessagesController().n5(null, this.e1);
                if (c41.a(this)) {
                    c41.d(this, false).j();
                    return;
                }
                return;
            }
            if (this.l1) {
                ik.g0(this, this.e1, W1, null, this.E2, false, null, new zf1(this, (byte) 5), this.A0);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
            String M0 = jb6.M0(2131753657, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0("AreYouSureBlockContact2", null, 2131754084, bw2.m(0, W1.first_name, W1.last_name)));
            alertDialog$Builder.j(jb6.M0(2131753658, null), new tn8(this, (byte) 2));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, this.A0);
            }
        }
    }

    public final void T3(float f) {
        mq8 mq8Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((mq8Var = this.N) != null && (valueAnimator = mq8Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f);
            this.N.requestLayout();
        }
        xq8 xq8Var = this.d1;
        if (xq8Var != null) {
            xq8Var.F.setTranslate(0.0f, this.b2 - xq8Var.y);
            xq8 xq8Var2 = this.d1;
            RadialGradient radialGradient = xq8Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(xq8Var2.F);
            }
            this.d1.invalidate();
        }
        R3();
        K3();
        d4();
    }

    @Override // vn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1((vn5) this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 5));
    }

    public final boolean U1() {
        View view;
        if ((this.J0 || (!gm.O1() && !this.o2)) && this.f0.getImageReceiver().E() && !gm.A1()) {
            this.G0 = true;
            this.p2 = true;
            int i = 0;
            while (true) {
                if (i >= this.a.getChildCount()) {
                    view = null;
                    break;
                }
                if (RecyclerView.R(this.a.getChildAt(i)) == 0) {
                    view = this.a.getChildAt(i);
                    break;
                }
                i++;
            }
            if (view != null) {
                po8 po8Var = this.a;
                View F = po8Var.F(view);
                u69 T = F != null ? po8Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.x0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), d53.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void U2(boolean z) {
        boolean z2 = false;
        if (this.e1 != 0) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
            if (W1 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z2 = true;
                }
                sic.m(W1, z, z2, getParentActivity(), this.w2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            qd2 f1 = getMessagesController().f1(this.f1, false, null);
            TLRPC.Chat chat = this.F2;
            if (f1 != null) {
                sic.l(chat, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            j5 accountInstance = getAccountInstance();
            if (getParentActivity() != null) {
                wv5.D0(getParentActivity(), -chat.id, accountInstance, new jq9(chat, this, accountInstance, (byte) 11));
            }
        }
    }

    public final void U3() {
        float min = Math.min(this.d2, 0.25f) / 0.25f;
        boolean z = this.q1;
        bt8 bt8Var = this.u0;
        if (z) {
            bt8Var.setAlpha(1.0f - min);
            this.u0.setBlurIntensity(0.0f);
            this.u0.setGooeyEnabled(false);
            this.u0.setVisibility(this.d2 >= 1.0f ? 8 : 0);
        } else {
            bt8Var.setHideProgress(this.d2);
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null && this.J1 != 2) {
            float f = this.d2;
            bp8Var.setAlpha(f > 0.0f ? gm.R1(1.0f, 0.0f, gm.x1(f, 0.0f, 0.5f)) : 1.0f);
        }
        W3();
    }

    public final void V1() {
        TLRPC.Chat chat = this.F2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.v2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i = 0; i < this.v2.participants.participants.size(); i++) {
            TLRPC.ChatParticipant chatParticipant = this.v2.participants.participants.get(i);
            this.C1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void V2() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || !m9c.c(userFull)) {
            if (this.F2 != null) {
                jg5.h.a();
            }
            showDialog(new ux4(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.d S = LaunchActivity.S();
            if (S != null) {
                b10.u(jb6.a0(null, null, 2131743429, pg3.s(a())), c41.b0(S), R.raw.error, 36);
            }
        }
    }

    public final void V3() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null && aVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float E1 = 1.0f - ((1.0f - E1()) * this.simpleActionBar.getActionModeFactor());
            su suVar = this.Z;
            if (suVar == null || this.R1 == E1) {
                return;
            }
            this.R1 = E1;
            suVar.invalidate();
        }
    }

    @Override // cga
    public final void W() {
        int i;
        int i2;
        wp8 wp8Var = this.O;
        if (wp8Var == null || this.r == null) {
            return;
        }
        int closestTab = wp8Var.getClosestTab();
        int[] iArr = this.R.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i3 = iArr[0];
                if (i3 <= 0) {
                    A3(jb6.M0(2131745143, null));
                    return;
                } else {
                    A3(jb6.G(i3, "Media", new Object[0]));
                    return;
                }
            }
            if (this.O.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                A3(jb6.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.O.getPhotosVideosTypeFilter() == 2 || (i2 = iArr[6]) <= 0) {
                A3(jb6.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            A3(jb6.G(i2, "Photos", new Object[0]) + ", " + jb6.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i4 = iArr[1];
            if (i4 <= 0) {
                A3(jb6.M0(2131750763, null));
                return;
            } else {
                A3(jb6.G(i4, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i5 = iArr[2];
            if (i5 <= 0) {
                A3(jb6.M0(2131743207, null));
                return;
            } else {
                A3(jb6.G(i5, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i6 = iArr[3];
            if (i6 <= 0) {
                A3(jb6.M0(2131745145, null));
                return;
            } else {
                A3(jb6.G(i6, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i7 = iArr[4];
            if (i7 <= 0) {
                A3(jb6.M0(2131748076, null));
                return;
            } else {
                A3(jb6.G(i7, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i8 = iArr[5];
            if (i8 <= 0) {
                A3(jb6.M0(2131754879, null));
                return;
            } else {
                A3(jb6.G(i8, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            A3(jb6.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            A3(this.r.getText());
            return;
        }
        if (closestTab == 8 || nha.t0(closestTab)) {
            boolean z = this.s2;
            wp8 wp8Var2 = this.O;
            if (z) {
                A3(wp8Var2.O(false));
                return;
            } else if (wp8Var2.W(closestTab) > 0) {
                A3(jb6.G(this.O.W(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                A3(jb6.M0(2131746358, null));
                return;
            }
        }
        if (closestTab == 13) {
            A3(this.O.O(true));
            return;
        }
        if (closestTab == 9) {
            A3(jb6.G(this.O.W(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            qb7 K0 = oc7.r1(this.currentAccount).K0(a());
            A3(jb6.G(K0 == null ? 0 : K0.b.size() + K0.c, this.s2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                lea leaVar = this.O.b0;
                A3(jb6.H(',', "ProfileGiftsCount", leaVar != null ? leaVar.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i9 = iArr[8];
                    if (i9 <= 0) {
                        A3(jb6.M0(2131745137, null));
                        return;
                    } else {
                        A3(jb6.H(',', "ProfilePollsCount", i9));
                        return;
                    }
                }
                return;
            }
        }
        wr9 E1 = getMessagesController().E1();
        long a = a();
        ArrayList arrayList = E1.j;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i = 0;
                break;
            }
            vr9 vr9Var = (vr9) arrayList.get(i10);
            if (vr9Var.a == a) {
                i = vr9Var.e;
                break;
            }
            i10++;
        }
        A3(jb6.G(Math.max(1, i), "SavedMessagesCount", new Object[0]));
    }

    public final boolean W1() {
        tk5 tk5Var;
        if (this.J1 == 0 || (tk5Var = this.parentLayout) == null || tk5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof yv1)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void W2(boolean z) {
        boolean[] zArr = {true};
        getMessagesController().k(this.F2.id, getUserConfig().f(), null, this, true, new yl6((Object) this, z, (Object) zArr, (byte) 16), new wg((Object) this, (Object) zArr, z, (Object) this.parentLayout.getLastFragment(), (byte) 5));
        nm7.e().k(nm7.M4, new Object[0]);
    }

    public final void W3() {
        float f = 0.0f;
        if (!this.q1 && !this.G1) {
            int Y1 = Y1();
            f = Y1 > 0 ? pqe.a(1.0f - (this.Q1 / Y1), 0.0f, 1.0f) : pqe.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f2 = this.L5;
        if (f2 != f) {
            boolean z = ((f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1)) > 0) != ((f > 0.5f ? 1 : (f == 0.5f ? 0 : -1)) > 0);
            this.L5 = f;
            mt1 mt1Var = this.f;
            if (mt1Var != null) {
                mt1Var.setTextColor(this.O5);
            }
            ap8 ap8Var = this.r;
            if (ap8Var != null) {
                ap8Var.setTextColor(this.P5);
            }
            P3();
            if (z) {
                nm7.e().k(nm7.v4, Boolean.TRUE);
            }
            xq8 xq8Var = this.d1;
            if (xq8Var != null) {
                xq8Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        Z3();
        Y3();
    }

    public final void X1() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        float v = aq1.v(layoutParams.width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = v;
        if (this.G1) {
            v = gm.R1(this.p6, v, this.T1);
            this.a2 = v;
        }
        this.Y.setTranslationX(v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0052, code lost:
    
        if (r18 <= gm.L(76.0f)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X2(View view, float f, float f2, boolean z) {
        long j;
        float f3;
        float f4;
        long j2 = this.i1;
        if (j2 == 0) {
            j2 = this.e1;
            if (j2 == 0) {
                j2 = -this.f1;
            }
        }
        long j3 = j2;
        boolean o2 = getMessagesController().o2(j3, this.g1, null);
        if (z) {
            if (this.q1 || o2) {
                boolean z2 = !o2;
                getNotificationsController().G(j3, this.g1, z2);
                c41.A(this, z2, null).j();
                S3();
                this.a0.setNotifications(o2);
                return;
            }
        } else if (jb6.a0) {
        }
        if (jb6.a0 || f < view.getMeasuredWidth() - gm.L(76.0f)) {
            jd2 jd2Var = new jd2(getParentActivity(), this.currentAccount, null, true, new vh2((Object) this, j3, (byte) 5), this.A0);
            jd2Var.e(j3, this.g1, this.s5);
            if (gm.O1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f3 = view2.getX() + view2.getPaddingLeft() + f;
                f4 = view2.getY() + view2.getPaddingTop() + f2;
            } else {
                f3 = f;
                f4 = f2;
            }
            if (z) {
                f4 += this.a0.getHeight() - gm.L(12.0f);
            }
            jd2Var.d(this, view, f3, f4, z);
            return;
        }
        yn7 yn7Var = (yn7) view;
        boolean z3 = yn7Var.e.h;
        boolean z4 = !z3;
        boolean x = getNotificationsController().x(j3, null, false, false);
        String p = lo7.p(j3, this.g1, false);
        int i = this.currentAccount;
        if (z3) {
            SharedPreferences.Editor edit = oc7.r1(i).W3.edit();
            if (x) {
                edit.putInt("notify2_" + p, 2);
                j = 1;
            } else {
                edit.remove("notify2_" + p);
                j = 0L;
            }
            getNotificationsController().N(j3);
            if (this.g1 == 0) {
                getMessagesStorage().B1(j3, j);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j3);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (x) {
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
        } else {
            SharedPreferences.Editor edit2 = oc7.r1(i).W3.edit();
            if (x) {
                edit2.remove("notify2_" + p);
            } else {
                edit2.putInt("notify2_" + p, 0);
            }
            if (this.g1 == 0) {
                getMessagesStorage().B1(j3, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().R.f(j3);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        S3();
        getNotificationsController().c0(j3, this.g1, true);
        yn7Var.setChecked(z4);
        e4(true);
    }

    public final void X3() {
        wp8 wp8Var = this.O;
        if (wp8Var == null || this.g6 == 0) {
            return;
        }
        int topPanelShift = wp8Var.getTopPanelShift();
        int i = 0;
        if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
            if (this.O.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
            }
            i = topPanelShift;
        }
        int i2 = this.g6 + i;
        x3(i2, this.M5);
        x3(i2, this.e6);
    }

    @Override // cga
    public final boolean Y() {
        return this.A1;
    }

    public final int Y1() {
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            return gm.L(74 + ((this.Q4 || this.R4) ? 25 : 0));
        }
        return 0;
    }

    public final void Y2() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
                if (W1 == null) {
                    return;
                }
                if (this.G2 == null || (userFull = this.w2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().N2 + "/%s", m9c.p(W1));
                } else {
                    str = String.format("%s https://" + getMessagesController().N2 + "/%s", this.w2.about, m9c.p(W1));
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                if (L0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.v2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().N2 + "/%s", sd2.K(L0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().N2 + "/%s", this.v2.about, sd2.K(L0, false));
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            startActivityForResult(Intent.createChooser(intent, jb6.M0(2131752935, null)), 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void Y3() {
        if (this.M5 == null || this.e6 == null) {
            return;
        }
        wp8 wp8Var = this.O;
        boolean z = wp8Var != null && wp8Var.getParent() == this.a && this.O.isAttachedToWindow();
        float max = Math.max(Math.min(this.L5, this.W5), this.b6);
        this.M5.setAlpha(z ? 0.0f : max);
        this.M5.setVisibility((z || max <= 0.0f) ? 8 : 0);
        View view = this.e6;
        if (!z) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z) {
            this.e6.setTranslationY(-(this.O.getY() + this.a.getY()));
        }
    }

    public final int Z1(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof jbc ? ((jbc) imageReceiver.t()).a.a() : gm.p(this.f0.getImageReceiver().n());
    }

    public final void Z2(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new iy8(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.V2) {
            return;
        }
        if (this.e1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (m9c.c(this.w2)) {
            b10.u(jb6.a0(null, null, 2131743429, pg3.s(this.e1)), c41.b0(this), R.raw.error, 36);
        } else {
            showDialog(new ux4(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    public final void Z3() {
        if (this.simpleActionBar == null || this.R5 == null) {
            return;
        }
        fr8 fr8Var = this.T5;
        if (fr8Var != null) {
            float g2 = g2();
            if (fr8Var.l != g2) {
                fr8Var.l = g2;
                fr8Var.a();
            }
        }
        int f = on2.f(g2(), this.N5, cmb.v0(cmb.F6, this.A0));
        if (this.Q5 != f) {
            this.Q5 = f;
            rja rjaVar = this.simpleActionBar;
            rjaVar.m0 = true;
            rjaVar.g0 = f;
            rjaVar.updateColors();
        }
        int K1 = this.S5.K1();
        if (this.V5 != K1) {
            this.V5 = K1;
            rja rjaVar2 = this.simpleActionBar;
            im0 im0Var = rjaVar2.I;
            if (im0Var != null) {
                im0Var.updateColors();
                rjaVar2.J.updateColors();
                rjaVar2.K.updateColors();
            }
            rjaVar2.invalidate();
            bka bkaVar = rjaVar2.R;
            if (bkaVar != null) {
                bkaVar.invalidate();
            }
        }
    }

    public final long a() {
        long j = this.i1;
        if (j != 0) {
            return j;
        }
        long j2 = this.e1;
        return j2 != 0 ? j2 : -this.f1;
    }

    public final tm a2(long j) {
        if (this.H == null) {
            tm tmVar = new tm(gm.L(17.0f), 2, this.f, false);
            this.H = tmVar;
            int L = gm.L(1.0f);
            tmVar.J = 0;
            tmVar.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        tm tmVar2 = this.H;
        if (j != 0) {
            tmVar2.j(j, false);
        } else {
            tmVar2.g(null, false);
        }
        P3();
        return this.H;
    }

    public final void a3() {
        p09 p09Var;
        if (this.e1 == 0) {
            f3();
            return;
        }
        if (this.r0 == null) {
            e3();
            return;
        }
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
        if (W1 == null) {
            W1 = z8c.h(this.currentAccount).f();
        }
        if (W1 != null) {
            wn5 wn5Var = this.r0;
            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
            wn5Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new v56(this, (byte) 28), new qj8(this, (byte) 2), 0);
            this.V.H(0);
            this.V.K(43);
            this.W.H(0);
            this.W.K(43);
            qn8 qn8Var = this.a0;
            if (qn8Var != null) {
                nn8 i = qn8.i(14, qn8Var.a);
                if (i != null && (p09Var = i.k) != null) {
                    p09Var.start();
                }
            } else {
                this.s.d();
            }
            xib xibVar = this.N2;
            if (xibVar != null) {
                xibVar.getImageView().d();
            }
        }
    }

    public final void a4(boolean z) {
        wp8 wp8Var;
        if (this.T0 != null) {
            boolean z2 = false;
            boolean z3 = !this.c6 && ((wp8Var = this.O) == null || !wp8Var.o0());
            boolean z4 = this.q2;
            y3(this.Q0, z3 && !z4 && this.M0, z);
            y3(this.R0, z3 && !z4 && this.N0, z);
            y3(this.S0, z3 && this.O0, z);
            wp8 wp8Var2 = this.O;
            boolean z5 = (wp8Var2 == null || wp8Var2.J == null || !wp8Var2.f0(wp8Var2.getClosestTab()) || this.O.o0()) ? false : true;
            y3(this.T0, z3, z && !z5);
            wp8 wp8Var3 = this.O;
            if (wp8Var3 != null) {
                boolean z6 = this.c6;
                if (z && !z5) {
                    z2 = true;
                }
                if (wp8Var3.q2 != z6) {
                    wp8Var3.q2 = z6;
                    wp8Var3.B(z, z2);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.ki));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.g8));
        hashSet.add(Integer.valueOf(cmb.ri));
        hashSet.add(Integer.valueOf(cmb.li));
        hashSet.add(Integer.valueOf(cmb.fd));
        hashSet.add(Integer.valueOf(cmb.e8));
    }

    public final void b2(boolean z) {
        vh6 vh6Var;
        if (this.B1 || (vh6Var = this.C1) == null || this.v2 == null) {
            return;
        }
        this.B1 = true;
        final int i = (vh6Var.m() == 0 || !z) ? 0 : nm7.W4;
        final TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().g1(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = nm7.d3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: ko8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                RectF rectF = ProfileActivity.e7;
                gm.d3(new sn8(ProfileActivity.this, tL_error, tLObject, tL_channels_getParticipants, (byte) 0), i);
            }
        }), this.classGuid);
    }

    public final void b3() {
        Bundle l = ts2.l("addToGroup", true);
        l.putLong("chatId", this.F2.id);
        oc5 oc5Var = new oc5(l);
        TLRPC.ChatFull chatFull = this.v2;
        oc5Var.J = chatFull;
        byte b = 0;
        if (chatFull != null && chatFull.participants != null) {
            vh6 vh6Var = new vh6();
            for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                vh6Var.k(null, this.v2.participants.participants.get(i).user_id);
            }
            oc5Var.K = vh6Var;
        }
        oc5Var.y = new tn8(this, b);
        presentFragment(oc5Var);
    }

    public final void b4() {
        TLRPC.User W1;
        if (!this.s1 || this.X0 == null || this.W0 == null || (W1 = getMessagesController().W1(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z = m9c.p(W1) != null;
        this.X0.setIcon(z ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(jb6.M0(z ? 2131746353 : 2131746352, null));
        this.W0.setVisibility(m9c.p(W1) == null ? 8 : 0);
    }

    @Override // vn5
    public final boolean c() {
        return true;
    }

    public final tm c2(TLRPC.EmojiStatus emojiStatus, boolean z) {
        if (this.G == null) {
            tm tmVar = new tm(gm.L(24.0f), 2, this.f, false);
            this.G = tmVar;
            if (this.H0) {
                tmVar.a();
            }
        }
        if (this.G.d()) {
            z = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.G.j(tL_emojiStatus.document_id, z);
                this.G.m(false, z);
            } else {
                this.G.g(j2(), z);
                this.G.m(false, z);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z);
                this.G.m(true, z);
            } else {
                this.G.g(j2(), z);
                this.G.m(false, z);
            }
        } else {
            this.G.g(j2(), z);
            this.G.m(false, z);
        }
        P3();
        return this.G;
    }

    public final void c3() {
        if (getParentActivity() == null) {
            return;
        }
        new jc(getParentActivity(), this.currentAccount, new ao8(this, (byte) 0), this.A0).show();
    }

    public final void c4(boolean z, boolean z2) {
        if (this.d == null) {
            if (z) {
                f4(false);
            }
            i4();
            return;
        }
        if (!z2 && this.a.isInLayout()) {
            po8 po8Var = this.a;
            if (po8Var.H) {
                po8Var.post(new n28((byte) 2, (Object) this, z));
                return;
            }
            return;
        }
        yp8 yp8Var = new yp8(this);
        yp8Var.a = this.O2;
        yp8Var.e(yp8Var.b);
        ArrayList arrayList = yp8Var.d;
        arrayList.clear();
        ArrayList arrayList2 = yp8Var.e;
        arrayList2.clear();
        arrayList.addAll(this.Z4);
        arrayList2.addAll(this.a5);
        yp8Var.f = this.C4;
        yp8Var.g = this.D4;
        if (z) {
            f4(false);
        }
        m3();
        i4();
        yp8Var.e(yp8Var.c);
        try {
            ww7.a(yp8Var, true).c(this.d);
        } catch (Exception e) {
            fc4.g(e, true);
            this.d.f();
        }
        int i = this.w6;
        if (i >= 0) {
            this.c.g1(i, this.x6 - this.a.getPaddingTop());
        }
        gm.V3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        if (this.O.u0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void clearViews() {
        this.s6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 != null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.a createActionBar(Context context) {
        tk5 tk5Var;
        tk5 tk5Var2;
        LaunchActivity launchActivity;
        wv1 wv1Var;
        tz3 tz3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.d lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof yv1) && (wv1Var = ((yv1) lastFragment).Ba) != null && (tz3Var = wv1Var.f) != null) {
            if (tz3Var != null) {
                TLRPC.ChatTheme chatTheme = tz3Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                tL_starGiftUnique = null;
            }
            this.A0 = lastFragment.getResourceProvider();
        }
        byte b = 6;
        x20 x20Var = new x20(this, context, this.A0, b);
        boolean z = true;
        x20Var.setForceSkipTouches(true);
        x20Var.setBackgroundColor(0);
        x20Var.G(this.s6 != null ? 553648127 : cmb.v0(cmb.e8, this.A0), false);
        int i = cmb.u8;
        x20Var.H(cmb.v0(i, this.A0), false);
        x20Var.H(cmb.v0(i, this.A0), true);
        x20Var.setCastShadows(false);
        x20Var.setAddToContainer(false);
        x20Var.setClipContent(true);
        if (!this.J0 && (((tk5Var = this.parentLayout) == null || !((ActionBarLayout) tk5Var).b) && ((gm.O1() || this.inBubbleMode) && (!gm.O1() || this.inBubbleMode || (tk5Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.H1) == null || tk5Var2 != launchActivity.r0)))) {
            z = false;
        }
        x20Var.setOccupyStatusBar(z);
        if (!this.J0) {
            x20Var.setBackButtonDrawable(new ee0(false));
            x20Var.getBackButton().setTranslationX(gm.L(2.0f));
            ImageView backButton = x20Var.getBackButton();
            backButton.setOnLongClickListener(new u0(this, backButton, (byte) 5));
            return x20Var;
        }
        x20Var.setBackButtonDrawable(new ee0(false));
        x20Var.getBackButton().setTranslationX(gm.L(2.0f));
        x20Var.e.setContentDescription(jb6.M0(2131746233, null));
        x20Var.e.setImageResource(R.drawable.outline_header_qr_24);
        x20Var.e.setColorFilter(cmb.v0(i, this.A0), PorterDuff.Mode.SRC_IN);
        x20Var.e.setOnClickListener(new yn8(this, b));
        return x20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v252, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v257 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        km0 km0Var;
        int i;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i2;
        Object obj;
        ylb ylbVar;
        d53 d53Var;
        int i3;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        wv1 wv1Var;
        tz3 tz3Var;
        cmb.X(context);
        ?? r0 = 0;
        cmb.J(context, false);
        org.telegram.ui.ActionBar.d lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof yv1) && (wv1Var = ((yv1) lastFragment).Ba) != null && (tz3Var = wv1Var.f) != null) {
            if (tz3Var != null) {
                TLRPC.ChatTheme chatTheme = tz3Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.A0 = lastFragment.getResourceProvider();
        }
        this.U1 = 0;
        this.V1 = 1.0f;
        this.X1 = false;
        this.hasOwnBackground = true;
        this.Q1 = e2();
        this.actionBar.setActionBarMenuOnItemClick(new sp8(this, context));
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.L0();
        }
        long j = this.i1;
        if (j == 0) {
            j = this.e1;
            if (j == 0) {
                j = -this.f1;
            }
        }
        this.fragmentView = new up8(this, context);
        zgc zgcVar = new zgc(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        km0 km0Var2 = this.W6;
        km0Var2.e(zgcVar, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.s1) {
            this.D5 = new FrameLayout(context);
            this.E5 = new FrameLayout[2];
            this.H5 = new b61[2];
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                a6 a6Var = new a6(context);
                im0 b = getBaseSimpleGlass().c.b(a6Var, new bm0(cmb.c6, this.A0));
                b.q(gm.L(8.0f));
                b.r(gm.L(22.0f));
                a6Var.setBackground(b);
                this.E5[i4] = new FrameLayout(context);
                this.H5[i4] = new b61(context, this.A0);
                this.H5[i4].setRoundRadius(gm.L(19.0f));
                this.H5[i4].setUseWrapContent(true);
                this.H5[i4].setPadding(gm.L(16.0f), r0, gm.L(16.0f), r0);
                if (i4 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.F5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new pn2(R.drawable.filled_premium_camera), r0, 1, 33);
                    this.F5.append((CharSequence) "  ").append((CharSequence) jb6.L0(2131744498));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.G5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new pn2(R.drawable.filled_add_album), r0, 1, 33);
                    this.G5.append((CharSequence) "  ").append((CharSequence) jb6.L0(2131744493));
                    this.H5[i4].h(this.F5, r0);
                } else {
                    this.H5[i4].h(jb6.L0(2131744172), r0);
                }
                a6Var.setOnClickListener(new v0(this, i4, (byte) 18));
                rve.b(a6Var, 0.02f, 1.2f);
                this.H5[i4].setStateListAnimator(stateListAnimator);
                a6Var.addView(this.H5[i4], qoe.e(-2, -1, 17));
                this.E5[i4].addView(a6Var, qoe.e(-2, 60, 1));
                this.D5.addView(this.E5[i4], qoe.e(-1, -1, 87));
                if (i4 == 1 || !getMessagesController().e5()) {
                    s3(this.E5[i4], 1.0f);
                }
                i4++;
                r0 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.v2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.D2;
        if (this.x1) {
            km0Var = km0Var2;
            i = 6;
        } else if (this.t1 && (((userFull = this.w2) != null && userFull.stargifts_count > 0) || ((chatFull = this.v2) != null && chatFull.stargifts_count > 0))) {
            this.w1 = true;
            km0Var = km0Var2;
            i = 14;
        } else if (this.r1) {
            km0Var = km0Var2;
            i = 10;
        } else {
            km0Var = km0Var2;
            i = arrayList != null ? 7 : -1;
        }
        P1(context);
        km0 km0Var3 = km0Var;
        fha fhaVar = this.R;
        TLRPC.UserFull userFull3 = this.w2;
        long j2 = j;
        wp8 wp8Var2 = new wp8(this, context, j2, fhaVar, userFull3 != null ? userFull3.common_chats_count : 0, this.D2, this.v2, userFull3, i, this.y1, this, this, this.A0, getBaseSimpleGlass().c);
        this.O = wp8Var2;
        wp8Var2.setLayoutParams(new g69(-1, -1));
        byte b2 = 4;
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            this.c0 = new mt8(context);
            yq8 yq8Var = new yq8(context);
            this.d0 = yq8Var;
            this.c0.setTrailingView(yq8Var);
            fr8 fr8Var = this.T5;
            if (fr8Var != null) {
                this.c0.setGlassFactory(fr8Var.c);
            }
            this.d0.setOnClickListener(new yn8(this, b2));
            this.c0.setColor(this.s6);
            TLRPC.UserFull userFull4 = this.w2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            byte b3 = 5;
            this.c0.setOnClickListener(new yn8(this, b3));
            this.a0 = new qn8(context, gm.L(74.0f));
            q3();
            r12 = 0;
            e4(false);
            this.a0.setOnActionClickListener(new tn8(this, b3));
        } else {
            r12 = 0;
        }
        yja t = this.simpleActionBar.t();
        if (this.e1 == getUserConfig().n && !this.s1 && bw2.r(this.currentAccount).v(7) == null) {
            bw2.r(this.currentAccount).C();
        }
        if (this.r0 != null && !this.s1) {
            zja a = t.a(32, R.drawable.outline_header_search);
            a.M();
            a.K(new q20(this, (byte) 19));
            this.U0 = a;
            a.setContentDescription(jb6.L0(2131745493));
            this.U0.setSearchFieldHint(jb6.L0(2131745493));
            this.O.getSearchItem().setVisibility(8);
            if (this.O.getSearchOptionsItem() != null) {
                this.O.getSearchOptionsItem().setVisibility(8);
            }
            if (this.O.getSaveItem() != null) {
                this.O.getSaveItem().setVisibility(8);
            }
            if (this.n1) {
                this.U0.setVisibility(8);
            }
        }
        zja a2 = t.a(16, R.drawable.profile_video);
        this.R0 = a2;
        a2.setContentDescription(jb6.L0(2131743298));
        if (this.f1 != 0) {
            this.Q0 = t.a(15, R.drawable.msg_voicechat2);
            boolean W = sd2.W(this.F2);
            zja zjaVar = this.Q0;
            if (W) {
                zjaVar.setContentDescription(jb6.L0(2131743131));
            } else {
                zjaVar.setContentDescription(jb6.L0(2131742990));
            }
        } else {
            zja a3 = t.a(15, R.drawable.call);
            this.Q0 = a3;
            a3.setContentDescription(jb6.L0(2131752587));
        }
        if (this.s1) {
            zja a4 = t.a(41, R.drawable.group_edit_profile);
            this.S0 = a4;
            a4.setContentDescription(jb6.L0(2131751272));
        } else {
            zja a5 = t.a(12, R.drawable.group_edit_profile);
            this.S0 = a5;
            a5.setContentDescription(jb6.L0(2131751272));
        }
        zja a6 = t.a(10, R.drawable.ic_ab_other);
        this.T0 = a6;
        a6.setSubMenuDelegate(new oo8(this, r12));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        anb.s(imageView, cmb.u8, this.A0, PorterDuff.Mode.MULTIPLY);
        gm.Q3(0.8f, this.Y0, r12, r12);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, qoe.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(jb6.L0(2131754838));
        this.T0.L(km0Var3, qqd.h(this.resourceProvider));
        if (this.a == null || this.r0 == null) {
            i2 = -1;
            obj = null;
        } else {
            int K0 = this.c.K0();
            View m = this.c.m(K0);
            if (m != null) {
                m.getTop();
                this.a.getPaddingTop();
            } else {
                K0 = -1;
            }
            i2 = K0;
            obj = this.s.getTag();
        }
        M1(r12);
        this.d = new lq8(this, context);
        this.e = new uq8(this, context);
        pc0 pc0Var = new pc0();
        this.q0 = pc0Var;
        pc0Var.p = 2.3809524f;
        pc0Var.l = true;
        this.fragmentView.setWillNotDraw(r12);
        up8 up8Var = (up8) this.fragmentView;
        this.x5 = up8Var;
        up8Var.setClipChildren(r12);
        po8 po8Var = new po8(this, context, this.A0);
        this.a = po8Var;
        po8Var.setLegacySections(r12);
        this.a.r1();
        po8 po8Var2 = this.a;
        po8Var2.getClass();
        po8Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m);
        po8 po8Var3 = this.a;
        int i6 = cmb.Z6;
        anb.h(i6, this.A0, po8Var3);
        this.a.setVerticalScrollBarEnabled(r12);
        nfc nfcVar = new nfc(this.a, (ViewGroup) this.fragmentView, new ec5(this, (byte) 1));
        nfcVar.h = true;
        qo8 qo8Var = new qo8(this);
        this.a.setItemAnimator(qo8Var);
        qo8Var.e = (short) 320;
        qo8Var.d = (short) 320;
        qo8Var.c = (short) 320;
        qo8Var.m = r12;
        qo8Var.C = r12;
        d53 d53Var2 = d53.h;
        qo8Var.o(d53Var2);
        this.a.setClipToPadding(r12);
        this.a.setClipChildren(r12);
        this.a.setHideIfEmpty(r12);
        ro8 ro8Var = new ro8(this);
        this.c = ro8Var;
        ro8Var.i1(1);
        ro8 ro8Var2 = this.c;
        ro8Var2.r = r12;
        this.a.setLayoutManager(ro8Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, qoe.e(-1, -1, 51));
        this.a.setOnItemClickListener(new pt0((Object) this, (Object) context, j2, (byte) 5));
        this.a.setOnItemLongClickListener(new uo8(this, context));
        if (this.r1 || this.t1 || this.x1) {
            i4();
            I();
            this.y6 = true;
            this.w6 = this.S4;
            this.x6 = r12;
        }
        if (this.U0 != null) {
            r59 r59Var = new r59(context);
            this.b = r59Var;
            r59Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new u46(1, r12));
            anb.H(this.b, cmb.d8, this.A0);
            this.b.setAdapter(this.e);
            ylbVar = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            anb.h(cmb.c6, this.A0, this.b);
            frameLayout.addView(this.b, qoe.e(-1, -1, 51));
            this.b.setOnItemClickListener(new kg4(this, (byte) 27));
            this.b.setOnItemLongClickListener(new tn8(this, (byte) 6));
            this.b.setOnScrollListener(new vo8(this, r12));
            this.b.p1(1, true);
            a1b a1bVar = new a1b(context);
            this.P = a1bVar;
            a1bVar.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout.addView(this.P);
            this.e.G();
        } else {
            ylbVar = null;
        }
        if (this.E1 != 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.E1));
            if (this.H2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = oc7.h1(L0);
                d53Var = d53Var2;
                tL_channels_getParticipant.participant = getMessagesController().i1(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new eo8(this, (byte) 4));
            } else {
                d53Var = d53Var2;
            }
            a6 a6Var2 = new a6(context, (byte) 28);
            a6Var2.setWillNotDraw(r12);
            a6Var2.setPadding(r12, r12, r12, gm.n);
            frameLayout.addView(a6Var2, qoe.a(-1.0f, (gm.n / gm.p) + 51.0f, 83));
            a6Var2.setOnClickListener(new n06(this, L0, (byte) 25));
            TextView textView = new TextView(context);
            anb.X(textView, cmb.o7, this.A0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(gm.o());
            textView.setText(jb6.L0(2131753693));
            a6Var2.addView(textView, qoe.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, e2(), r12, gm.L(48.0f));
            this.a.setBottomGlowOffset(gm.L(48.0f));
        } else {
            d53Var = d53Var2;
            this.a.setPadding(r12, e2(), r12, r12);
        }
        xq8 xq8Var = new xq8(this, context);
        this.d1 = xq8Var;
        xq8Var.a(this.s6, r12);
        this.d1.setBackgroundColor(getThemedColor(i6));
        frameLayout.addView(this.d1);
        yn ynVar = new yn(context);
        this.e0 = ynVar;
        ynVar.setPivotX(gm.L(30.0f));
        this.e0.setPivotY(gm.L(30.0f));
        this.Y = new ne6((byte) 14, context, this);
        this.Z = new su((byte) 26, context, (Object) this);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.C5 = imageReceiver;
        imageReceiver.q0(gm.L(11.0f));
        gm.Q3(1.0f, this.Z, true, r12);
        this.Z.setClipChildren(r12);
        frameLayout.addView(this.Z, qoe.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        bt8 bt8Var = new bt8(context);
        this.u0 = bt8Var;
        bt8Var.addView(this.Y, qoe.e(100, 100, 51));
        this.Z.addView(this.u0, qoe.c(-1.0f, -1));
        yo8 yo8Var = new yo8(context);
        this.f0 = yo8Var;
        yo8Var.u(Y1());
        this.f0.getImageReceiver().x0 = true;
        this.f0.setRoundRadiusForExpand(n2());
        this.f0.setPivotX(0.0f);
        this.f0.setPivotY(0.0f);
        this.Y.addView(this.f0, qoe.c(-1.0f, -1));
        byte b4 = 11;
        this.f0.setOnClickListener(new yn8(this, b4));
        this.f0.setHasStories(P2());
        this.f0.setOnLongClickListener(new au(this, b4));
        sb5 sb5Var = new sb5(this, context);
        this.h0 = sb5Var;
        sb5Var.setSize(gm.L(26.0f));
        this.h0.setProgressColor(-1);
        this.h0.setNoProgress(r12);
        this.Y.addView(this.h0, qoe.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.i0 = imageView2;
        imageView2.setPadding(gm.L(10.0f), gm.L(10.0f), gm.L(5.0f), gm.L(5.0f));
        ImageView imageView3 = this.i0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setScaleX(0.85f);
        this.i0.setScaleY(0.85f);
        ImageView imageView4 = this.i0;
        sqb sqbVar = new sqb(context, ylbVar);
        this.m0 = sqbVar;
        imageView4.setImageDrawable(sqbVar);
        this.i0.setTranslationY(-1.0f);
        frameLayout.addView(this.i0, qoe.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.j0.setAlpha(0.0f);
        this.j0.setImageDrawable(new sl0());
        frameLayout.addView(this.j0, qoe.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        anb.s(this.k0, cmb.r8, this.A0, PorterDuff.Mode.SRC_IN);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, qoe.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.l0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.l0.setAlpha(0.0f);
        this.l0.setScaleY(0.0f);
        this.l0.setScaleX(0.0f);
        frameLayout.addView(this.l0, qoe.e(20, 20, 51));
        k4();
        F3(r12, r12);
        zo8 zo8Var = this.o0;
        if (zo8Var != null) {
            zo8Var.K();
        }
        lr8 lr8Var = this.n0;
        if (lr8Var != null) {
            lr8Var.c();
        }
        this.N = new mq8(this, context);
        lr8 lr8Var2 = new lr8(context);
        this.n0 = lr8Var2;
        lr8Var2.setSize(Y1());
        long j3 = this.e1;
        if (j3 == 0) {
            j3 = -this.f1;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        po8 po8Var4 = this.a;
        int i7 = i2;
        yo8 yo8Var2 = this.f0;
        getClassGuid();
        byte b5 = 1;
        this.o0 = new zo8(this, context, j3, aVar, po8Var4, yo8Var2, this.N, this.n0);
        if (this.e1 != getUserConfig().n && (userFull2 = this.w2) != null) {
            this.y5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.o0.setChatInfo(this.v2);
        }
        this.Z.addView(this.o0);
        this.Z.addView(this.n0, qoe.c(138.0f, -1));
        this.Z.addView(this.N);
        qn8 qn8Var = this.a0;
        if (qn8Var != null) {
            this.Z.addView(qn8Var, qoe.c(-1.0f, -1));
        }
        mt8 mt8Var = this.c0;
        if (mt8Var != null) {
            this.Z.addView(mt8Var, qoe.c(-1.0f, -1));
            this.Z.addView(this.d0, qoe.c(-1.0f, -1));
        }
        this.f0.setAvatarsViewPager(this.o0);
        nq8 nq8Var = new nq8(this, context);
        this.p0 = nq8Var;
        this.Z.addView(nq8Var, qoe.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        mt1 mt1Var = new mt1((byte) 3, context, this);
        this.f = mt1Var;
        mt1Var.setTextColor(getThemedColor(cmb.li));
        this.f.setPadding(r12, gm.L(6.0f), r12, gm.L(4.0f));
        this.f.setTextSizePx(gm.L(17.5f));
        this.f.setGravity(3);
        this.f.setTypeface(gm.o());
        this.f.setLeftDrawableTopPadding(-gm.L(1.3f));
        this.f.setPivotX(0.0f);
        this.f.setPivotY(0.0f);
        this.f.setScrollNonFitText(true);
        this.f.setFocusable(true);
        this.f.setEllipsizeByGradient(true);
        this.Z.addView(this.f, qoe.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        ap8 ap8Var = new ap8(this, context);
        this.r = ap8Var;
        ap8Var.setEllipsizeByGradient(true);
        this.r.setTextColor(B1(getThemedColor(cmb.A8), null));
        this.r.setTextSizePx(gm.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(gm.L(8.0f));
        this.r.setPivotY(gm.L(8.0f));
        this.r.setPadding(gm.L(4.0f), gm.L(2.0f), gm.L(4.0f), gm.L(2.0f));
        this.r.setFocusable(true);
        this.Z.addView(this.r, qoe.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        J1();
        this.Z.addView(this.e0);
        ita itaVar = new ita(context);
        this.T = itaVar;
        itaVar.setLayoutParams(qoe.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.A0);
        K1();
        this.T.setDelegate(new tn8(this, b5));
        this.T.setOnClickListener(new yn8(this, r12));
        TLRPC.UserFull userFull5 = this.w2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        this.v0 = new bp8(this, context, this.currentAccount, a(), this.q1, this.Y, this.f0, this.A0, context);
        l4(r12);
        TLRPC.UserFull userFull6 = this.w2;
        if (userFull6 != null) {
            this.v0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.v2;
            if (chatFull3 != null) {
                this.v0.setStories(chatFull3.stories);
            }
        }
        yo8 yo8Var3 = this.f0;
        if (yo8Var3 != null) {
            yo8Var3.setHasStories(P2());
        }
        this.Z.addView(this.v0, qoe.c(-1.0f, -1));
        xs8 xs8Var = new xs8(context, this.currentAccount, a(), this.Y);
        this.w0 = xs8Var;
        this.Z.addView(xs8Var, (int) r12, qoe.c(-1.0f, -1));
        byte b6 = 1;
        h4(true);
        s09 s09Var = new s09(context);
        this.s = s09Var;
        if (this.a0 != null) {
            s09Var.setVisibility(8);
        }
        q4();
        if (this.e1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(jb6.L0(2131743239));
        } else if (this.r0 != null) {
            this.V = new p09(R.raw.camera_outline, gm.L(56.0f), gm.L(56.0f), false, null);
            this.W = new p09(R.raw.camera_outline, gm.L(42.0f), gm.L(42.0f), false, null);
            qn8 qn8Var2 = this.a0;
            if (qn8Var2 != null) {
                qn8Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                qn8 qn8Var3 = this.a0;
                if (qn8Var3.G) {
                    qn8Var3.G = r12;
                    qn8Var3.d();
                }
            } else {
                this.s.setAnimation(this.V);
                this.s.setContentDescription(jb6.L0(2131754905));
                this.s.setPadding(gm.L(2.0f), r12, r12, gm.L(2.0f));
            }
        } else {
            qn8 qn8Var4 = this.a0;
            if (qn8Var4 != 0) {
                qn8Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(jb6.L0(2131754818));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, qoe.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new yn8(this, b6));
        Q2(r12);
        if (i7 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new vo8(this, b6));
        UndoView undoView = new UndoView(context, null, r12, this.A0);
        this.M = undoView;
        frameLayout.addView(undoView, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new bo8(this, b6));
        this.k2.setInterpolator(d53Var);
        this.k2.addListener(new cp8(this, r12));
        i4();
        W();
        byte b7 = 3;
        hg5 hg5Var = new hg5(getContext(), 3);
        hg5Var.p(true);
        hg5Var.h = gm.L(310.0f);
        hg5Var.d = 2300L;
        hg5Var.U = true;
        hg5Var.e = true;
        hg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
        hg5Var.v0 = gm.L(4.0f);
        this.X = hg5Var;
        hg5Var.setPadding(gm.L(8.0f), r12, gm.L(8.0f), r12);
        this.X.k(getBaseSimpleGlass().c);
        frameLayout.addView(this.X, qoe.e(-1, nm7.f2, 55));
        this.O.setForwardRestrictedHint(this.X);
        dp8 dp8Var = new dp8(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.e5 = dp8Var;
        byte b8 = 29;
        dp8Var.E = new k44(this, b8);
        this.o0.setPinchToZoomHelper(dp8Var);
        this.y0.setAlpha(r12);
        this.z0.setColor(getThemedColor(cmb.h6));
        n4();
        sb sbVar = new sb(b8, context, this);
        this.U = sbVar;
        int i8 = cmb.c6;
        sbVar.setForeground(new ColorDrawable(on2.p(getThemedColor(i8), 100)));
        this.U.setFocusable((boolean) r12);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new yn8(this, (byte) 2));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.x5.addView(this.U, qoe.c(-1.0f, -1));
        O1();
        if (this.s1) {
            i3 = 87;
            this.x5.addView(this.D5, qoe.e(-1, 60, 87));
        } else {
            i3 = 87;
        }
        qn8 qn8Var5 = this.a0;
        if (qn8Var5 != null && qn8Var5.k()) {
            ImageView imageView8 = new ImageView(context);
            this.P0 = imageView8;
            imageView8.setScaleType(scaleType);
            this.P0.setImageResource(R.drawable.call);
            this.P0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm.L(48.0f), org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? gm.m : r12;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.P0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.J5 = frameLayout2;
        anb.h(i8, this.A0, frameLayout2);
        View view = new View(context);
        anb.h(cmb.c7, this.A0, view);
        this.J5.addView(view, qoe.d(-1, 1.0f / gm.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.K5 = new b61(context, this.A0);
        this.K5.h(jb6.L0(2131745680), r12);
        this.J5.addView(this.K5, qoe.d(-1, 48.0f, nm7.D1, 10.0f, (1.0f / gm.p) + 10.0f, 10.0f, 10.0f));
        this.K5.setOnClickListener(new yn8(this, b7));
        this.J5.setVisibility(8);
        this.J5.setTranslationY(gm.L(69.0f));
        this.x5.addView(this.J5, qoe.e(-1, -2, i3));
        this.X6 = new dh0(this, nfcVar, (byte) 7);
        E3();
        View view2 = this.fragmentView;
        tn8 tn8Var = new tn8(this, (byte) 4);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(view2, tn8Var);
        return this.fragmentView;
    }

    public final int d2() {
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((aVar == null || !aVar.getOccupyStatusBar()) ? 0 : gm.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_photo) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r8 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d3(boolean z) {
        TLRPC.Chat L0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize x;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize x2;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z) {
            zo8 zo8Var = this.o0;
            int realPosition = zo8Var != null ? zo8Var.getRealPosition() : 0;
            zo8 zo8Var2 = this.o0;
            gn5 gn5Var = null;
            gn5 G = zo8Var2 != null ? zo8Var2.G(realPosition) : null;
            zo8 zo8Var3 = this.o0;
            TLRPC.Photo F = zo8Var3 != null ? zo8Var3.F(realPosition) : null;
            long j = this.e1;
            kp8 kp8Var = this.v5;
            if (j == 0) {
                if (this.f1 == 0 || (chatPhoto = (L0 = getMessagesController().L0(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.r0().T1(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                int i = chatPhoto2.dc_id;
                if (i != 0) {
                    chatPhoto2.photo_big.dc_id = i;
                }
                if (G == null || (fileLocation = G.f) == null) {
                    fileLocation = chatPhoto2.photo_big;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                if (F == null && (chatFull = this.v2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (x = bc4.x(1000, F.video_sizes)) != null) {
                    gn5Var = gn5.j(x, F);
                }
                PhotoViewer.r0().m1(null, fileLocation3, G, gn5Var, null, null, null, 0, kp8Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.r0().T1(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
            int i2 = userProfilePhoto2.dc_id;
            if (i2 != 0) {
                userProfilePhoto2.photo_big.dc_id = i2;
            }
            if (G == null || (fileLocation2 = G.f) == null) {
                fileLocation2 = userProfilePhoto2.photo_big;
            }
            TLRPC.FileLocation fileLocation4 = fileLocation2;
            if (F == null && (userFull = this.w2) != null) {
                if (userProfilePhoto2.personal) {
                    photo = userFull.personal_photo;
                }
                photo = userFull.profile_photo;
                boolean z2 = photo instanceof TLRPC.TL_photo;
                if (!z2 || photo.id != userProfilePhoto2.photo_id) {
                    TLRPC.Photo photo3 = userFull.fallback_photo;
                    if ((photo3 instanceof TLRPC.TL_photo) && photo3.id == userProfilePhoto2.photo_id) {
                        F = photo3;
                    }
                }
                F = photo;
            }
            if (F != null && !F.video_sizes.isEmpty() && (x2 = bc4.x(1000, F.video_sizes)) != null) {
                gn5Var = gn5.j(x2, F);
            }
            PhotoViewer.r0().m1(null, fileLocation4, G, gn5Var, null, null, null, 0, kp8Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void d4() {
        if (this.c0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0);
        boolean z = this.G1;
        if (z && this.J1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.T1);
            this.c0.f(gm.L(74.0f) + this.a.getMeasuredWidth(), Y1() - gm.L(74.0f));
            return;
        }
        if (z) {
            this.c0.setAlpha(this.T1);
        }
        float f = currentActionBarHeight;
        float L = this.Q1 + f + gm.L(74.0f);
        float min = Math.min(Y1(), L - f);
        this.c0.f(L - min, min - gm.L(74.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        lq8 lq8Var;
        tk5 tk5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User W1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        po8 po8Var;
        po8 po8Var2;
        b59 b59Var;
        byte b = 22;
        if (i == nm7.F5 || i == nm7.r3) {
            if (sd2.R(oc7.r1(this.currentAccount).L0(Long.valueOf(this.f1)))) {
                getMessagesController().N1().j(a(), new bn0(b), false, this.A0);
                return;
            }
            return;
        }
        byte b2 = 2;
        int i3 = 0;
        r8 = false;
        boolean z = false;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = oc7.s5;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.e1 != 0) {
                if (objArr2 != false) {
                    h4(true);
                }
                if ((intValue & 1024) == 0 || (po8Var2 = this.a) == null || (b59Var = (b59) po8Var2.L(this.H3, false)) == null) {
                    return;
                }
                this.d.t(b59Var, this.H3);
                return;
            }
            if (this.f1 != 0) {
                int i5 = intValue & TLObject.FLAG_13;
                if (i5 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i5 != 0) {
                        c4(true, false);
                    } else {
                        f4(true);
                    }
                    h4(true);
                }
                if (!objArr2 == true || (po8Var = this.a) == null) {
                    return;
                }
                int childCount = po8Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = this.a.getChildAt(i6);
                    if (childAt instanceof w8c) {
                        ((w8c) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == nm7.g1) {
            Long l = (Long) objArr[0];
            if (this.v2 == null || (chat = this.F2) == null || chat.id != l.longValue()) {
                return;
            }
            this.v2.online_count = ((Integer) objArr[1]).intValue();
            f4(true);
            h4(false);
            return;
        }
        if (i == nm7.N || i == nm7.b1) {
            M1(true);
            return;
        }
        if (i == nm7.a0) {
            if (this.j1) {
                gm.c3(new mn8(this, objArr, b2));
                return;
            }
            return;
        }
        if (i == nm7.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.E2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.E2 = encryptedChat;
            c4(false, false);
            s34 s34Var = this.Y1;
            if (s34Var != null) {
                s34Var.i();
                return;
            }
            return;
        }
        if (i == nm7.g0) {
            boolean z2 = this.k1;
            boolean z3 = getMessagesController().x0.indexOfKey(this.e1) >= 0;
            this.k1 = z3;
            if (z2 != z3) {
                M1(true);
                c4(false, false);
                return;
            }
            return;
        }
        if (i == nm7.w2) {
            Long l2 = (Long) objArr[0];
            if (this.F2 != null) {
                long longValue = l2.longValue();
                TLRPC.Chat chat2 = this.F2;
                if (longValue == chat2.id && sd2.w(14, chat2)) {
                    TLRPC.ChatFull M0 = oc7.r1(this.currentAccount).M0(l2.longValue());
                    if (M0 != null) {
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 != null) {
                            M0.participants = chatFull4.participants;
                        }
                        this.v2 = M0;
                    }
                    wp8 wp8Var = this.O;
                    if (wp8Var != null) {
                        wp8Var.setChatInfo(this.v2);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 != null) {
                        TLRPC.InputGroupCall inputGroupCall = chatFull5.call;
                        boolean z4 = this.p1;
                        if (inputGroupCall != null ? z4 : !z4) {
                            M1(false);
                        }
                    }
                    bp8 bp8Var = this.v0;
                    if (bp8Var != null && (chatFull3 = this.v2) != null) {
                        bp8Var.setStories(chatFull3.stories);
                    }
                    xs8 xs8Var = this.w0;
                    if (xs8Var != null) {
                        xs8Var.a();
                    }
                    yo8 yo8Var = this.f0;
                    if (yo8Var != null) {
                        yo8Var.setHasStories(P2());
                    }
                    if (l2.longValue() != 0) {
                        boolean z5 = e21.a;
                        r7 = (getMessagesController().I3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.Q(38, r7);
                        qn8 qn8Var = this.a0;
                        if (qn8Var != null) {
                            qn8Var.o(3, r7);
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
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.e1 != 0 && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null && chatFull6.id == W1.linked_community_id) {
                c4(true, false);
            }
            TLRPC.Chat chat3 = this.F2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                c4(true, false);
            }
            if (chatFull6.id == this.f1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull7 = this.v2;
                if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                    chatFull6.participants = chatFull7.participants;
                }
                Object[] objArr3 = chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull);
                this.v2 = chatFull6;
                if (this.m1 == 0) {
                    long j = chatFull6.migrated_from_chat_id;
                    if (j != 0) {
                        this.m1 = -j;
                        getMediaDataController().f0(0, this.classGuid, this.m1, this.g1, true);
                    }
                }
                V1();
                zo8 zo8Var = this.o0;
                if (zo8Var != null && !this.q1) {
                    zo8Var.setChatInfo(this.v2);
                }
                c4(true, false);
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                if (L0 != null) {
                    this.F2 = L0;
                    M1(true);
                }
                s34 s34Var2 = this.Y1;
                if (s34Var2 != null) {
                    s34Var2.i();
                }
                if (this.F2.megagroup && (objArr3 != false || !booleanValue)) {
                    b2(true);
                }
                L3();
                n4();
                bp8 bp8Var2 = this.v0;
                if (bp8Var2 != null && (chatFull = this.v2) != null) {
                    bp8Var2.setStories(chatFull.stories);
                }
                xs8 xs8Var2 = this.w0;
                if (xs8Var2 != null) {
                    xs8Var2.a();
                }
                yo8 yo8Var2 = this.f0;
                if (yo8Var2 != null) {
                    yo8Var2.setHasStories(P2());
                }
                wp8 wp8Var2 = this.O;
                if (wp8Var2 != null) {
                    wp8Var2.setChatInfo(this.v2);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == nm7.u) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (tk5Var = this.parentLayout) != null && tk5Var.getFragmentStack().contains(this)) {
                if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                    if (this.parentLayout.getLastFragment() == this) {
                        finishFragment();
                        return;
                    } else {
                        removeSelfFromStack(true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == nm7.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.e1) {
                this.G2 = botInfo;
                c4(false, false);
                return;
            }
            return;
        }
        if (i == nm7.E0) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.w2 = userFull;
                ita itaVar = this.T;
                if (itaVar != null) {
                    itaVar.set(userFull.stars_rating);
                }
                bp8 bp8Var3 = this.v0;
                if (bp8Var3 != null) {
                    bp8Var3.setStories(this.w2.stories);
                }
                xs8 xs8Var3 = this.w0;
                if (xs8Var3 != null) {
                    xs8Var3.a();
                }
                yo8 yo8Var3 = this.f0;
                if (yo8Var3 != null) {
                    yo8Var3.setHasStories(P2());
                }
                wp8 wp8Var3 = this.O;
                if (wp8Var3 != null) {
                    wp8Var3.setUserInfo(this.w2);
                }
                if (this.r0 != null) {
                    if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                        this.d.g(this.X2);
                    }
                    if (this.s1) {
                        c4(false, false);
                    }
                } else {
                    if (this.G1 || this.L0) {
                        this.I1 = true;
                    } else {
                        M1(true);
                    }
                    c4(false, false);
                    wp8 wp8Var4 = this.O;
                    if (wp8Var4 != null) {
                        wp8Var4.setCommonGroupsCount(this.w2.common_chats_count);
                        W();
                        fha fhaVar = this.R;
                        if (fhaVar == null || fhaVar.E) {
                            resumeDelayedFragmentAnimation();
                            Q2(true);
                        }
                    }
                }
                L3();
                n4();
                if (this.x2 == null && !u2()) {
                    ir8 ir8Var = new ir8(this.currentAccount);
                    this.x2 = ir8Var;
                    v56 v56Var = new v56(this, (byte) 18);
                    if (ir8Var.c) {
                        v56Var.run();
                    } else {
                        ir8Var.h.add(v56Var);
                    }
                    this.x2.b(this.w2);
                }
                if (!u2()) {
                    zq8 zq8Var = this.z2;
                    zq8 c = zq8.c(this.currentAccount, this.w2, zq8Var);
                    this.z2 = c;
                    this.y2 = c != zq8Var;
                    if (c != null) {
                        v56 v56Var2 = new v56(this, (byte) 19);
                        if (c.b) {
                            v56Var2.run();
                        } else {
                            c.h.add(v56Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    boolean p2 = p2();
                    zja zjaVar = this.T0;
                    if (p2) {
                        zjaVar.S(44);
                    } else {
                        zjaVar.u(44);
                    }
                    TLRPC.UserFull userFull2 = this.w2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z = true;
                    }
                    this.T0.Q(46, z);
                    this.T0.Q(47, !z);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.k0) {
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || a() != ((Long) objArr[0]).longValue()) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                k47 k47Var = (k47) arrayList.get(i7);
                if (this.E2 != null) {
                    TLRPC.MessageAction messageAction = k47Var.k.action;
                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (lq8Var = this.d) != null) {
                        lq8Var.f();
                    }
                }
            }
            return;
        }
        if (i == nm7.m4) {
            po8 po8Var3 = this.a;
            if (po8Var3 != null) {
                po8Var3.h1();
                return;
            }
            return;
        }
        if (i == nm7.B4) {
            c4(false, false);
            return;
        }
        if (i == nm7.s1) {
            int i8 = this.d3;
            int i9 = this.b3;
            int i10 = this.Z2;
            i4();
            lq8 lq8Var2 = this.d;
            if (lq8Var2 != null) {
                if (i8 == this.d3 && i9 == this.b3 && i10 == this.Z2) {
                    return;
                }
                lq8Var2.f();
                return;
            }
            return;
        }
        if (i == nm7.u5) {
            if (this.q1) {
                h4(false);
                return;
            }
            return;
        }
        if (i == nm7.D1) {
            uq8 uq8Var = this.e;
            if (uq8Var != null) {
                uq8Var.c = uq8.H(this);
                this.e.w.clear();
                this.e.J();
                uq8 uq8Var2 = this.e;
                uq8Var2.I(uq8Var2.E);
                return;
            }
            return;
        }
        if (i == nm7.c0) {
            h4(false);
            return;
        }
        if (i == nm7.z5 || i == nm7.J5) {
            yo8 yo8Var4 = this.f0;
            if (yo8Var4 != null) {
                yo8Var4.setHasStories(P2());
                this.f0.setRoundRadiusForExpand((int) gm.R1(n2(), 0.0f, this.l2));
            }
            bp8 bp8Var4 = this.v0;
            if (bp8Var4 != null) {
                TLRPC.UserFull userFull3 = this.w2;
                if (userFull3 != null) {
                    bp8Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.v2;
                if (chatFull8 != null) {
                    bp8Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        byte b3 = 20;
        if (i == nm7.k3) {
            zja zjaVar2 = this.T0;
            if (zjaVar2 != null) {
                TL_account.RequirementToContact L2 = getMessagesController().L2(this.e1);
                if (L2 != null && !(L2 instanceof TL_account.requirementToContactEmpty)) {
                    r7 = false;
                }
                zjaVar2.Q(20, r7);
            }
            O3();
            return;
        }
        if (i == nm7.j5) {
            O3();
            return;
        }
        if (i == nm7.A3) {
            c4(false, false);
            return;
        }
        if (i == nm7.E3) {
            c4(false, false);
            return;
        }
        if (i == nm7.c4) {
            if (r2()) {
                c4(false, false);
                return;
            }
            return;
        }
        if (i == nm7.F3) {
            c4(false, false);
            return;
        }
        if (i == nm7.y1) {
            if (a() == ((Long) objArr[0]).longValue()) {
                tk5 tk5Var2 = this.parentLayout;
                if (tk5Var2 == null || tk5Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i == nm7.h3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.S4 >= 0 || longValue3 != a()) {
                return;
            }
            i4();
            W();
            lq8 lq8Var3 = this.d;
            if (lq8Var3 != null) {
                lq8Var3.f();
                return;
            }
            return;
        }
        if (i == nm7.I3) {
            if (((Long) objArr[0]).longValue() != a() || u2()) {
                return;
            }
            if (this.S4 >= 0) {
                wp8 wp8Var5 = this.O;
                if (wp8Var5 != null) {
                    wp8Var5.N1(true);
                    return;
                }
                return;
            }
            i4();
            W();
            lq8 lq8Var4 = this.d;
            if (lq8Var4 != null) {
                lq8Var4.f();
            }
            gm.c3(new v56(this, b3));
            return;
        }
        if (i == nm7.Y3) {
            if (((Long) objArr[0]).longValue() != a() || this.e1 <= 0) {
                return;
            }
            TLRPC.UserFull X1 = getMessagesController().X1(this.e1);
            if (X1 != null) {
                this.w2 = X1;
            }
            i4();
            W();
            po8 po8Var4 = this.a;
            if (po8Var4 != null && po8Var4.d0()) {
                this.a.post(new v56(this, b));
                return;
            }
            lq8 lq8Var5 = this.d;
            if (lq8Var5 != null) {
                lq8Var5.f();
                return;
            }
            return;
        }
        if (i != nm7.Z3) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat4 = this.F2;
        if (chat4 == null || chat4.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        vh6 vh6Var = this.C1;
        if (vh6Var != null && (chatParticipant = (TLRPC.ChatParticipant) vh6Var.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.H2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.Z4;
            if (i3 >= arrayList2.size()) {
                gm.V3(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i3)).setRank(longValue5, str);
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        wn5 wn5Var = this.r0;
        if (wn5Var == null || !wn5Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        wn5 wn5Var = this.r0;
        return (wn5Var == null || dialog != wn5Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // cga
    public final r59 e() {
        return this.a;
    }

    public final int e2() {
        return Y1() + f2();
    }

    public final void e3() {
        TLRPC.User W1;
        if (this.e1 == 0 || W1() || (W1 = getMessagesController().W1(Long.valueOf(this.e1))) == null || (W1 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.e1);
        if (getMessagesController().A(bundle, this, null, null)) {
            boolean z = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!gm.O1() && z) {
                nm7 notificationCenter = getNotificationCenter();
                int i = nm7.s;
                notificationCenter.n(this, i);
                getNotificationCenter().k(i, new Object[0]);
            }
            int i2 = getArguments().getInt("nearby_distance", -1);
            if (i2 >= 0) {
                bundle.putInt("nearby_distance", i2);
            }
            yv1 yv1Var = new yv1(bundle);
            hs6 mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.z0;
            mediaDataController.o1();
            yv1Var.Y9 = document;
            yv1Var.Z9 = false;
            presentFragment(yv1Var, z);
            if (!gm.O1() || this.J0) {
                return;
            }
            finishFragment();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if ((r0 - getConnectionsManager().getCurrentTime()) <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r6 == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e4(boolean z) {
        int i;
        lq8 lq8Var;
        if (z && (i = this.O3) >= 0 && (lq8Var = this.d) != null) {
            lq8Var.g(i);
        }
        qn8 qn8Var = this.a0;
        if (qn8Var == null || this.s1) {
            return;
        }
        SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
        long j = this.i1;
        if (j == 0) {
            j = this.e1;
            if (j == 0) {
                j = -this.f1;
            }
        }
        long j2 = j;
        boolean z2 = false;
        String p = lo7.p(j2, this.g1, false);
        boolean contains = sharedPreferences.contains("notify2_" + p);
        int g = kt6.g("notify2_", p, sharedPreferences, 0);
        int g2 = kt6.g("notifyuntil_", p, sharedPreferences, 0);
        if (g != 3 || g2 == Integer.MAX_VALUE) {
            if (g == 0) {
                if (!contains) {
                    z2 = getNotificationsController().x(j2, null, false, false);
                }
                z2 = true;
            }
        }
        qn8Var.setNotifications(z2);
    }

    @Override // cga
    public final TLRPC.Chat f() {
        return this.F2;
    }

    public final int f2() {
        return Y1() == 0 ? gm.L(168.0f) : gm.L(152.0f);
    }

    public final void f3() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.v2.linked_chat_id);
        if (getMessagesController().A(bundle, this, null, null)) {
            presentFragment(new yv1(bundle));
        }
    }

    public final void f4(boolean z) {
        byte b;
        int i;
        TLRPC.UserStatus userStatus;
        boolean z2;
        int i2 = 0;
        this.C2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.D2.clear();
        TLRPC.ChatFull chatFull = this.v2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z2 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z2 || chatFull.participants_count <= 200) {
                return;
            }
            this.C2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            b = 1;
            if (i2 < this.v2.participants.participants.size()) {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.v2.participants.participants.get(i2).user_id));
                if (W1 != null && (userStatus = W1.status) != null && ((userStatus.expires > currentTime || W1.id == getUserConfig().e()) && W1.status.expires > 10000)) {
                    this.C2++;
                }
                this.D2.add(Integer.valueOf(i2));
                if (W1 != null) {
                    if (W1.bot) {
                        i = -110;
                    } else if (W1.self) {
                        i = 50000 + currentTime;
                    } else {
                        TLRPC.UserStatus userStatus2 = W1.status;
                        if (userStatus2 != null) {
                            i = userStatus2.expires;
                        }
                    }
                    i2 = td4.g(i, i2, 1, arrayList);
                }
                i = TLObject.FLAG_31;
                i2 = td4.g(i, i2, 1, arrayList);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        Collections.sort(this.D2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new xm1(arrayList, b))));
        if (z && this.d != null && this.C4 > 0) {
            gm.V3(this.a);
        }
        if (this.O == null || this.S4 == -1) {
            return;
        }
        if ((this.D2.size() > 5 || this.b5 == 2) && this.b5 != 1) {
            this.O.h1(this.D2, this.v2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0104, code lost:
    
        if (r24.inviter_id != getUserConfig().e()) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0106, code lost:
    
        if (r25 == false) goto L80;
     */
    @Override // cga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        TLRPC.Chat chat;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Drawable drawable;
        if (getParentActivity() == null) {
            return false;
        }
        if (!z) {
            if (chatParticipant.user_id == getUserConfig().e()) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", chatParticipant.user_id);
            bundle.putBoolean("preload_messages", true);
            presentFragment(new ProfileActivity(bundle, null));
            return true;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(chatParticipant.user_id));
        if (W1 == null) {
            return false;
        }
        long j = chatParticipant.user_id;
        this.B2 = j;
        boolean z17 = j == getUserConfig().e();
        if (sd2.T(this.F2)) {
            channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
            str = channelParticipant.rank;
            z5 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
            z4 = z5 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
            z3 = z17;
            getMessagesController().W1(Long.valueOf(chatParticipant.user_id));
            z6 = sd2.w(4, this.F2);
            boolean z18 = sd2.w(25, this.F2) && (!z4 || ((!z5 && channelParticipant.can_edit) || z3));
            if (z5 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                z6 = false;
                z18 = false;
            }
            if ((z3 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && sd2.h(this.F2)) {
                z18 = true;
            }
            z10 = sd2.w(2, this.F2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z5) || channelParticipant.can_edit);
            chat = this.F2;
            z11 = chat.gigagroup ? false : z10;
            z12 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
            z9 = z18;
        } else {
            z3 = z17;
            str = chatParticipant.rank;
            boolean z19 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
            z4 = z19 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
            z5 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
            TLRPC.Chat chat2 = this.F2;
            boolean z20 = chat2.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (sd2.w(2, chat2) || chatParticipant.inviter_id == getUserConfig().e()));
            TLRPC.Chat chat3 = this.F2;
            z6 = chat3.creator;
            if (sd2.w(25, chat3)) {
                z7 = z19;
                if (z4) {
                    if (!z5) {
                    }
                }
                z8 = true;
                chat = this.F2;
                z9 = z8;
                z10 = z20;
                z11 = chat.creator;
                z12 = z7;
                channelParticipant = null;
            } else {
                z7 = z19;
            }
            if (!z3 || !sd2.h(this.F2)) {
                z8 = false;
                chat = this.F2;
                z9 = z8;
                z10 = z20;
                z11 = chat.creator;
                z12 = z7;
                channelParticipant = null;
            }
            z8 = true;
            chat = this.F2;
            z9 = z8;
            z10 = z20;
            z11 = chat.creator;
            z12 = z7;
            channelParticipant = null;
        }
        if (z3) {
            if (sd2.h(chat) || (z4 && sd2.w(25, this.F2))) {
                z15 = false;
                z6 = false;
                z14 = true;
            } else {
                z14 = z9;
                z15 = false;
                z6 = false;
            }
            z13 = false;
        } else {
            z13 = z10;
            z14 = z9;
            z15 = z11;
        }
        boolean z21 = z6 || z14 || z15 || z13;
        if (z2 || !z21) {
            return z21;
        }
        TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
        boolean z22 = z12;
        un8 un8Var = new un8(this, channelParticipant2, W1, chatParticipant, z22, str);
        String str2 = str;
        if (view.getParent() instanceof r59) {
            z16 = false;
            drawable = ((r59) view.getParent()).V0(view, false);
        } else {
            z16 = false;
            drawable = null;
        }
        bu5 I = bu5.I(this, view);
        I.X(drawable);
        I.w = z16;
        I.k(R.drawable.msg_discussion, jb6.M0(2131745335, null), new rn8(this, W1, (byte) 1), !z3);
        if (!z3 && (z6 || z14 || z15 || z13)) {
            I.j();
        }
        I.k((z4 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, jb6.M0(z4 ? 2131751239 : TextUtils.isEmpty(str2) ? 2131754397 : 2131751212, null), new hy6(this, W1, str2, z4, z5), z14);
        I.k(R.drawable.msg_admins, jb6.M0(z22 ? 2131751241 : 2131745281, null), new q78(un8Var, (byte) 27), z6);
        I.k(R.drawable.msg_permissions, jb6.M0(2131752493, null), new hz7((Object) this, (Object) channelParticipant2, (Object) chatParticipant, (Object) W1, (Object) un8Var, (byte) 9), z15);
        I.l(R.drawable.msg_remove, new mn8(this, chatParticipant, (byte) 3), jb6.M0(2131748812, null), z13, true);
        I.V = nm7.T2;
        I.a0();
        return true;
    }

    public final float g2() {
        return Math.max(this.L5, this.b6);
    }

    public final void g3(boolean z) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        byte b = 0;
        if (tL_businessLocation.geo_point == null || z) {
            boolean z2 = e21.a;
            org.telegram.messenger.a.q();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        np8 np8Var = new np8(3, b);
        np8Var.setResourceProvider(this.A0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().x1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        np8Var.V0 = false;
        np8Var.G0(new k47(z8c.t0, tL_message, false, false));
        presentFragment(np8Var);
    }

    public final void g4() {
        CharSequence charSequence;
        ap8 ap8Var = this.r;
        if (ap8Var != null) {
            if ((!this.c6 || (charSequence = this.h6) == null) && (!this.F6 || (charSequence = this.E6) == null)) {
                charSequence = this.D6;
            }
            if (!ap8Var.o(charSequence, !this.G1) || this.fragmentView == null) {
                return;
            }
            Q2(false);
        }
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        t10 t10Var = new t10(this, (byte) 15);
        ArrayList arrayList = new ArrayList();
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            arrayList.addAll(wp8Var.getThemeDescriptions());
        }
        arrayList.add(new cnb(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (bnb) null, cmb.c8));
        arrayList.add(new cnb(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.mi));
        arrayList.add(new cnb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ni));
        arrayList.add(new cnb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oi));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.w6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.n6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.t6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.u6));
        arrayList.add(new cnb(this.a, 0, new Class[]{qaa.class}, new String[]{"detailTextView"}, (Drawable[]) null, (bnb) null, cmb.y6));
        int i = cmb.Ii;
        arrayList.add(new cnb(this.a, 0, new Class[]{qaa.class}, new String[]{"yesButton"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.Ei;
        arrayList.add(new cnb(this.a, 131072, new Class[]{qaa.class}, new String[]{"yesButton"}, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.Gi;
        arrayList.add(new cnb(this.a, 196608, new Class[]{qaa.class}, new String[]{"yesButton"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.a, 0, new Class[]{qaa.class}, new String[]{"noButton"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 131072, new Class[]{qaa.class}, new String[]{"noButton"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 196608, new Class[]{qaa.class}, new String[]{"noButton"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.a, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t10Var, cmb.m6));
        boolean z = this.c6;
        mt1 mt1Var = this.f;
        Drawable drawable = this.I;
        if (z) {
            arrayList.add(new cnb(mt1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (bnb) null, cmb.Ej));
            arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (bnb) null, cmb.c6));
            return arrayList;
        }
        arrayList.add(new cnb(mt1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (bnb) null, cmb.qi));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (bnb) null, cmb.pi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getThemedColor(int i) {
        return cmb.v0(i, this.A0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Drawable getThemedDrawable(String str) {
        ylb ylbVar = this.A0;
        Drawable drawable = ylbVar != null ? ylbVar.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    public final float h2(float f, float f2) {
        this.G6 = f;
        this.I6 = f2;
        byte b = this.J1;
        float l = Utilities.l(b == 2 ? 1.0f : (this.T1 >= 1.0f || b == 0) ? this.l2 : 0.0f);
        ita itaVar = this.T;
        return Math.max(0.0f, (m2() + this.z5) * l) + td4.A(1.0f, l, f2 * (itaVar != null ? itaVar.getVisibilityFactor() : 0.0f), f);
    }

    public final void h3(int i, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        boolean[] zArr = new boolean[1];
        hp8 hp8Var = new hp8(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i, zArr, user);
        hp8Var.Y0 = new ip8(this, i, chatParticipant, z, zArr);
        presentFragment(hp8Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:(1:285)(1:87)|88|(1:91)|(1:283)(1:97)|98|(2:100|(2:102|(1:104))(2:223|(1:230)(1:229)))(2:231|(1:233)(2:234|(1:282)(2:240|(1:242)(2:243|(2:245|(1:247)(1:248))(40:249|(1:251)(1:281)|252|(1:280)(1:266)|267|(2:269|(4:271|(1:279)(1:275)|276|(1:278)))|106|(1:222)(1:110)|111|112|113|(1:115)|116|(1:118)|119|(3:121|(1:123)|124)(1:219)|125|(1:127)(1:218)|128|(2:130|(1:132))(1:217)|133|(3:213|(1:215)|216)(2:137|(1:139)(1:212))|140|(2:208|(1:210)(1:211))(1:144)|(1:207)(1:150)|151|(1:206)|154|(2:156|(1:158))|159|(2:161|(1:163))|164|(3:166|(2:168|(1:194)(1:174))(1:195)|175)(4:196|(1:205)(1:202)|203|204)|176|(1:178)|179|(1:193)(1:185)|186|(1:188)|189)))))|105|106|(1:108)|222|111|112|113|(0)|116|(0)|119|(0)(0)|125|(0)(0)|128|(0)(0)|133|(1:135)|213|(0)|216|140|(1:142)|208|(0)(0)|(1:146)|207|151|(0)|206|154|(0)|159|(0)|164|(0)(0)|176|(0)|179|(2:181|183)|193|186|(0)|189) */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0659, code lost:
    
        if (r33.v2.can_view_participants != false) goto L336;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0852 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h4(boolean z) {
        Object obj;
        boolean z2;
        String str;
        CharSequence G;
        TLRPC.ChatParticipants chatParticipants;
        boolean z3;
        CharSequence charSequence;
        boolean l;
        boolean z4;
        long f;
        long j;
        gn5 m;
        gn5 m2;
        gn5 C;
        View m3;
        TLRPC.Chat chat;
        gn5 gn5Var;
        int i;
        TLRPC.VideoSize videoSize;
        jbc jbcVar;
        TLRPC.User user;
        gn5 gn5Var2;
        gn5 gn5Var3;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        boolean z5;
        rja rjaVar;
        vq8 vq8Var;
        Drawable drawable;
        boolean z6;
        boolean C2;
        boolean z7;
        boolean z8;
        f02 f02Var;
        String str2;
        TL_stars.Tl_starsRating tl_starsRating;
        TL_stars.Tl_starsRating tl_starsRating2;
        gn5 gn5Var4;
        nk3 nk3Var;
        dj3 dj3Var;
        if (this.Y == null || this.f == null || getParentActivity() == null) {
            return;
        }
        tk5 tk5Var = this.parentLayout;
        if (tk5Var == null || tk5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            Object obj2 = (org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = obj2 instanceof f02 ? obj2 : null;
            if (obj2 instanceof bj6) {
                obj2 = ((bj6) obj2).J;
            }
            if ((obj2 instanceof nk3) && (dj3Var = (nk3Var = (nk3) obj2).H3) != null) {
                kj3 kj3Var = dj3Var.a;
                if (wi8.A(kj3Var)) {
                    this.q5 = nk3Var;
                    obj = kj3Var;
                }
            }
        }
        if (obj instanceof yv1) {
            yv1 yv1Var = (yv1) obj;
            if (yv1Var.p1 != null && yv1Var.g4 == 8) {
                z2 = true;
                this.A5 = false;
                this.B5 = false;
                str = "";
                if (this.e1 == 0) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
                    if (W1 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                    boolean z9 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.q0.q(W1);
                    TLRPC.FileLocation fileLocation2 = fileLocation;
                    TLRPC.EmojiStatus emojiStatus = getMessagesController().H2(W1.id) ? null : W1.emoji_status;
                    ec7 ec7Var = this.s6;
                    ec7 a = ec7.a(emojiStatus);
                    this.s6 = a;
                    if (a == null) {
                        int n = m9c.n(W1);
                        fc7 fc7Var = oc7.r1(this.currentAccount).F3;
                        a = fc7Var == null ? null : fc7Var.d(n);
                        this.s6 = a;
                    }
                    if (ec7Var != a) {
                        p4();
                    }
                    xq8 xq8Var = this.d1;
                    if (xq8Var != null) {
                        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
                        xq8Var.b(z10 ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id : m9c.m(W1), z10);
                    }
                    ita itaVar = this.T;
                    if (itaVar != null) {
                        itaVar.b.a(this.s6);
                        itaVar.invalidate();
                    }
                    v3(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? emojiStatus : null);
                    gn5 m4 = gn5.m(z8c.t0, 0, W1);
                    gn5 m5 = gn5.m(z8c.t0, 1, W1);
                    gn5 m6 = gn5.m(z8c.t0, 4, W1);
                    TLRPC.UserFull userFull = this.w2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                        videoSize = bc4.R((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            jbcVar = new jbc(videoSize, W1.premium, 2);
                            gn5 C3 = this.o0.C(m5, m4);
                            if (this.J2 == null) {
                                this.o0.H(jbcVar, m4, m5, z);
                            }
                            if (this.K2 == null) {
                                if (videoSize != null) {
                                    this.f0.setImageDrawable(jbcVar);
                                } else {
                                    if (m6 == null || W1.photo.personal) {
                                        user = W1;
                                        gn5Var3 = m5;
                                        yo8 yo8Var = this.f0;
                                        yo8Var.a.Y(C3, "g", m4, "100_100", gn5Var3, "50_50", this.q0, 0L, null, user, 1);
                                        gn5Var2 = m4;
                                        yo8Var.e();
                                    } else {
                                        this.f0.getImageReceiver().z1 = true;
                                        yo8 yo8Var2 = this.f0;
                                        user = W1;
                                        gn5Var3 = m5;
                                        yo8Var2.a.Y(m6, "avatar", m4, "50_50", gn5Var3, "50_50", this.q0, 0L, null, user, 1);
                                        yo8Var2.e();
                                        gn5Var2 = m4;
                                    }
                                    int i2 = this.P2;
                                    if (gn5Var3 == null ? i2 == -1 : i2 != -1) {
                                        c4(false, false);
                                        Q2(true);
                                    }
                                    if (gn5Var2 != null || ((gn5Var4 = this.C0) != null && gn5Var2.s == gn5Var4.s)) {
                                        user2 = user;
                                    } else {
                                        this.C0 = gn5Var2;
                                        TLRPC.User user3 = user;
                                        getFileLoader().V(gn5Var2, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence r = m9c.r(user2);
                                    if (user2.id != getUserConfig().e()) {
                                        long j2 = user2.id;
                                        if (j2 == 489000) {
                                            str = jb6.M0(2131743303, null);
                                        } else if (j2 == 333000 || j2 == 777000 || j2 == 42777) {
                                            str = jb6.M0(2131745295, null);
                                        } else if (oc7.G2(user2)) {
                                            str = jb6.M0(2131744010, null);
                                        } else if (this.s2) {
                                            int i3 = user2.bot_active_users;
                                            str = i3 != 0 ? jb6.H(',', "BotUsers", i3) : m9c.e(user2);
                                        } else {
                                            boolean[] zArr = this.K0;
                                            zArr[0] = false;
                                            str = jb6.d0(this.currentAccount, user2, zArr, z9 ? new boolean[1] : null);
                                            boolean z11 = (zArr[0] || getUserConfig().p() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            ap8 ap8Var = this.r;
                                            z5 = z11;
                                            if (ap8Var != null) {
                                                z5 = z11;
                                                if (!this.c6) {
                                                    int i4 = (zArr[0] && this.s6 == null) ? cmb.ri : cmb.A8;
                                                    ap8Var.setTag(Integer.valueOf(i4));
                                                    z5 = z11;
                                                    if (!this.q2) {
                                                        this.r.setTextColor(B1(cmb.v0(i4, this.A0), Boolean.valueOf(zArr[0])));
                                                        z5 = z11;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.B5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            r = gw3.m(r, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z2) {
                                                this.f0.setAnimateFromImageReceiver(((yv1) obj).p1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(r, false);
                                            rjaVar = this.simpleActionBar;
                                            if (rjaVar != null) {
                                                rjaVar.setTitle(r);
                                            }
                                            this.r.setDrawablePadding(gm.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            ap8 ap8Var2 = this.r;
                                            if (z5) {
                                                vq8Var = null;
                                            } else {
                                                if (this.K6 == null) {
                                                    vq8 vq8Var2 = new vq8(jb6.M0(2131744579, null));
                                                    this.K6 = vq8Var2;
                                                    vq8Var2.setAlpha((int) (Math.min(1.0f, this.Q1 / e2()) * 255.0f));
                                                    this.K6.a(on2.f(this.l2, cmb.p1(0.5f, cmb.a(0.18f, -0.1f, this.c1)), 603979775));
                                                }
                                                vq8Var = this.K6;
                                            }
                                            ap8Var2.i(vq8Var);
                                            this.r.setRightDrawableOnClick(!z5 ? new yn8(this, (byte) 7) : null);
                                            if (this.E2 == null) {
                                                drawable = this.x;
                                                if (drawable == null) {
                                                    drawable = cmb.k4.getConstantState().newDrawable().mutate();
                                                    this.x = drawable;
                                                }
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z6 = user2.scam;
                                            if (!z6 || user2.fake) {
                                                mt1 mt1Var = this.f;
                                                int i5 = !z6 ? 1 : 0;
                                                if (this.L == null) {
                                                    hs9 hs9Var = new hs9(i5);
                                                    this.L = hs9Var;
                                                    hs9Var.b(cmb.v0(cmb.g8, this.A0));
                                                }
                                                mt1Var.j(this.L);
                                                this.n = jb6.M0(2131745596, null);
                                            } else {
                                                boolean z12 = user2.verified;
                                                mt1 mt1Var2 = this.f;
                                                if (z12) {
                                                    mt1Var2.j(o2());
                                                    this.n = jb6.M0(2131754738, null);
                                                } else {
                                                    mt1Var2.j(null);
                                                    this.n = null;
                                                }
                                            }
                                            if (!oc7.G2(user2) || pg3.f(emojiStatus) == 0) {
                                                getMessagesController().getClass();
                                                C2 = oc7.C2(user2);
                                                mt1 mt1Var3 = this.f;
                                                if (C2) {
                                                    mt1Var3.i(null);
                                                    this.h = null;
                                                    z7 = false;
                                                    z8 = false;
                                                } else {
                                                    mt1Var3.i(c2(null, true));
                                                    this.h = jb6.M0(2131754801, null);
                                                    z7 = true;
                                                    z8 = false;
                                                }
                                            } else {
                                                this.f.i(c2(emojiStatus, true));
                                                this.h = jb6.M0(2131754801, null);
                                                z8 = true;
                                                z7 = false;
                                            }
                                            if (drawable == null || this.E2 != null || user2.bot_verification_icon == 0) {
                                                this.f.setLeftDrawableOutside(false);
                                            } else {
                                                this.f.setLeftDrawableOutside(true);
                                                drawable = a2(user2.bot_verification_icon);
                                            }
                                            this.f.setLeftDrawable(drawable);
                                            if (!z8 || z7) {
                                                this.f.setRightDrawableOutside(true);
                                            }
                                            if (user2.self) {
                                                getMessagesController().getClass();
                                                if (oc7.C2(user2)) {
                                                    this.f.setRightDrawableOnClick(new yn8(this, (byte) 8));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (oc7.C2(user2)) {
                                                    TLRPC.EmojiStatus emojiStatus2 = emojiStatus;
                                                    mt1 mt1Var4 = this.f;
                                                    TLRPC.User user4 = user2;
                                                    user2 = user4;
                                                    mt1Var4.setRightDrawableOnClick(new ef((Object) this, (Object) emojiStatus2, (Object) user4, (Object) mt1Var4, (byte) 14));
                                                }
                                            }
                                            if (this.e1 != z8c.h(this.currentAccount).n) {
                                                if (this.A5) {
                                                    TLRPC.UserFull userFull2 = this.w2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str2 = null;
                                                        str = jb6.M0(2131747559, null);
                                                    } else {
                                                        str2 = null;
                                                        str = jb6.M0(2131744862, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str2 = null;
                                                }
                                                this.E6 = jb6.M0(2131750779, str2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) jb6.M0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751624 : 2131751625, null));
                                                spannableStringBuilder.setSpan(new gq3(), str.length() + 1, str.length() + 2, 0);
                                                this.E6 = spannableStringBuilder;
                                            }
                                            this.D6 = str;
                                            g4();
                                            f02Var = this.r5;
                                            if (f02Var != null) {
                                                f02Var.r();
                                            }
                                            this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                        }
                                    } else if (m9c.s(this.w2)) {
                                        this.A5 = true;
                                        TLRPC.PhotoSize w = bc4.w(this.w2.fallback_photo.sizes, 1000, false, null, false);
                                        if (w != null) {
                                            this.C5.c0(gn5.i(w, this.w2.fallback_photo), "50_50", null, 0L, null, z8c.h(this.currentAccount).f(), 0);
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.w2;
                                        str = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? jb6.M0(2131747559, null) : jb6.M0(2131744862, null).toLowerCase(Locale.ROOT);
                                    }
                                    z5 = false;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.B5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    r = gw3.m(r, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z2) {
                                    }
                                    this.f.l(r, false);
                                    rjaVar = this.simpleActionBar;
                                    if (rjaVar != null) {
                                    }
                                    this.r.setDrawablePadding(gm.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    ap8 ap8Var22 = this.r;
                                    if (z5) {
                                    }
                                    ap8Var22.i(vq8Var);
                                    this.r.setRightDrawableOnClick(!z5 ? new yn8(this, (byte) 7) : null);
                                    if (this.E2 == null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z6 = user2.scam;
                                    if (z6) {
                                    }
                                    mt1 mt1Var5 = this.f;
                                    int i52 = !z6 ? 1 : 0;
                                    if (this.L == null) {
                                    }
                                    mt1Var5.j(this.L);
                                    this.n = jb6.M0(2131745596, null);
                                    if (oc7.G2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    C2 = oc7.C2(user2);
                                    mt1 mt1Var32 = this.f;
                                    if (C2) {
                                    }
                                    if (drawable == null) {
                                    }
                                    this.f.setLeftDrawableOutside(false);
                                    this.f.setLeftDrawable(drawable);
                                    if (!z8) {
                                    }
                                    this.f.setRightDrawableOutside(true);
                                    if (user2.self) {
                                    }
                                    if (!user2.self) {
                                    }
                                    if (this.e1 != z8c.h(this.currentAccount).n) {
                                    }
                                    this.D6 = str;
                                    g4();
                                    f02Var = this.r5;
                                    if (f02Var != null) {
                                    }
                                    this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                }
                            }
                            user = W1;
                            gn5Var2 = m4;
                            gn5Var3 = m5;
                            int i22 = this.P2;
                            if (gn5Var3 == null) {
                                c4(false, false);
                                Q2(true);
                                if (gn5Var2 != null) {
                                }
                                user2 = user;
                                CharSequence r2 = m9c.r(user2);
                                if (user2.id != getUserConfig().e()) {
                                }
                                z5 = false;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.B5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                r2 = gw3.m(r2, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z2) {
                                }
                                this.f.l(r2, false);
                                rjaVar = this.simpleActionBar;
                                if (rjaVar != null) {
                                }
                                this.r.setDrawablePadding(gm.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                ap8 ap8Var222 = this.r;
                                if (z5) {
                                }
                                ap8Var222.i(vq8Var);
                                this.r.setRightDrawableOnClick(!z5 ? new yn8(this, (byte) 7) : null);
                                if (this.E2 == null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z6 = user2.scam;
                                if (z6) {
                                }
                                mt1 mt1Var52 = this.f;
                                int i522 = !z6 ? 1 : 0;
                                if (this.L == null) {
                                }
                                mt1Var52.j(this.L);
                                this.n = jb6.M0(2131745596, null);
                                if (oc7.G2(user2)) {
                                }
                                getMessagesController().getClass();
                                C2 = oc7.C2(user2);
                                mt1 mt1Var322 = this.f;
                                if (C2) {
                                }
                                if (drawable == null) {
                                }
                                this.f.setLeftDrawableOutside(false);
                                this.f.setLeftDrawable(drawable);
                                if (!z8) {
                                }
                                this.f.setRightDrawableOutside(true);
                                if (user2.self) {
                                }
                                if (!user2.self) {
                                }
                                if (this.e1 != z8c.h(this.currentAccount).n) {
                                }
                                this.D6 = str;
                                g4();
                                f02Var = this.r5;
                                if (f02Var != null) {
                                }
                                this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            } else {
                                c4(false, false);
                                Q2(true);
                                if (gn5Var2 != null) {
                                }
                                user2 = user;
                                CharSequence r22 = m9c.r(user2);
                                if (user2.id != getUserConfig().e()) {
                                }
                                z5 = false;
                                TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                                this.B5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                                r22 = gw3.m(r22, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z2) {
                                }
                                this.f.l(r22, false);
                                rjaVar = this.simpleActionBar;
                                if (rjaVar != null) {
                                }
                                this.r.setDrawablePadding(gm.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                ap8 ap8Var2222 = this.r;
                                if (z5) {
                                }
                                ap8Var2222.i(vq8Var);
                                this.r.setRightDrawableOnClick(!z5 ? new yn8(this, (byte) 7) : null);
                                if (this.E2 == null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z6 = user2.scam;
                                if (z6) {
                                }
                                mt1 mt1Var522 = this.f;
                                int i5222 = !z6 ? 1 : 0;
                                if (this.L == null) {
                                }
                                mt1Var522.j(this.L);
                                this.n = jb6.M0(2131745596, null);
                                if (oc7.G2(user2)) {
                                }
                                getMessagesController().getClass();
                                C2 = oc7.C2(user2);
                                mt1 mt1Var3222 = this.f;
                                if (C2) {
                                }
                                if (drawable == null) {
                                }
                                this.f.setLeftDrawableOutside(false);
                                this.f.setLeftDrawable(drawable);
                                if (!z8) {
                                }
                                this.f.setRightDrawableOutside(true);
                                if (user2.self) {
                                }
                                if (!user2.self) {
                                }
                                if (this.e1 != z8c.h(this.currentAccount).n) {
                                }
                                this.D6 = str;
                                g4();
                                f02Var = this.r5;
                                if (f02Var != null) {
                                }
                                this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            }
                        }
                    } else {
                        videoSize = null;
                    }
                    jbcVar = null;
                    gn5 C32 = this.o0.C(m5, m4);
                    if (this.J2 == null) {
                    }
                    if (this.K2 == null) {
                    }
                    user = W1;
                    gn5Var2 = m4;
                    gn5Var3 = m5;
                    int i222 = this.P2;
                    if (gn5Var3 == null) {
                    }
                } else if (this.f1 != 0) {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                    if (L0 != null) {
                        this.F2 = L0;
                    } else {
                        L0 = this.F2;
                    }
                    s34 s34Var = this.Y1;
                    if (s34Var != null) {
                        s34Var.i();
                    }
                    ec7 ec7Var2 = this.s6;
                    ec7 a2 = ec7.a(L0.emoji_status);
                    this.s6 = a2;
                    if (a2 == null) {
                        int I = sd2.I(L0);
                        fc7 fc7Var2 = oc7.r1(this.currentAccount).F3;
                        a2 = fc7Var2 == null ? null : fc7Var2.d(I);
                        this.s6 = a2;
                    }
                    if (ec7Var2 != a2) {
                        p4();
                    }
                    xq8 xq8Var2 = this.d1;
                    if (xq8Var2 != null) {
                        xq8Var2.b(sd2.J(L0), L0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus3 = L0.emoji_status;
                    v3(emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus3 : null);
                    TLRPC.TL_forumTopic f2 = this.q1 ? getMessagesController().g4.f(this.f1, this.g1) : null;
                    if (sd2.T(L0)) {
                        if (!this.q1) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.Chat chat2 = this.F2;
                                if (!chat2.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!sd2.N(chat2)) {
                                        }
                                    }
                                }
                            }
                            G = this.F2.megagroup ? jb6.M0(2131748536, null).toLowerCase() : sd2.t0(L0) ? jb6.M0(2131752260, null).toLowerCase() : jb6.M0(2131752271, null).toLowerCase();
                        }
                        if (this.q1) {
                            int i6 = f2 != null ? f2.totalMessagesCount - 1 : 0;
                            if (i6 > 0) {
                                jb6.G(i6, "messages", Integer.valueOf(i6));
                            } else {
                                jb6.a0("TopicProfileStatus", null, 2131743699, L0.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new pn2(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(L0.title).append(' ').append((CharSequence) spannableString);
                            z3 = true;
                            if (z2) {
                                yv1 yv1Var2 = (yv1) obj;
                                boolean z13 = yv1Var2.p1.getSubtitleTextView() instanceof lka;
                                pr1 pr1Var = yv1Var2.p1;
                                if (z13) {
                                    ((lka) pr1Var.getSubtitleTextView()).getText();
                                } else if (pr1Var.getSubtitleTextView() instanceof io) {
                                    ((io) yv1Var2.p1.getSubtitleTextView()).getText();
                                }
                                this.f0.setAnimateFromImageReceiver(yv1Var2.p1.getAvatarImageView().getImageReceiver());
                            }
                            if (!this.q1) {
                                charSequence = f2 != null ? f2.title : "";
                            } else if (sd2.p0(L0)) {
                                charSequence = jb6.M0(2131752156, null);
                            } else {
                                charSequence = L0.title;
                                if (charSequence == null) {
                                    charSequence = null;
                                }
                            }
                            if (charSequence == null) {
                                try {
                                    charSequence = gw3.m(charSequence, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                } catch (Exception unused) {
                                }
                                l = this.f.l(charSequence, false);
                                rja rjaVar2 = this.simpleActionBar;
                                if (rjaVar2 != null) {
                                    rjaVar2.setTitle(charSequence);
                                }
                            } else {
                                l = false;
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable((Drawable) null);
                            this.f.setRightDrawableOutside(false);
                            this.f.setRightDrawableOnClick(null);
                            this.n = null;
                            z4 = L0.scam;
                            if (!z4 || L0.fake) {
                                mt1 mt1Var6 = this.f;
                                int i7 = !z4 ? 1 : 0;
                                if (this.L == null) {
                                    hs9 hs9Var2 = new hs9(i7);
                                    this.L = hs9Var2;
                                    hs9Var2.b(cmb.v0(cmb.g8, this.A0));
                                }
                                mt1Var6.j(this.L);
                                this.h = jb6.M0(2131745596, null);
                            } else {
                                boolean z14 = L0.verified;
                                mt1 mt1Var7 = this.f;
                                if (z14) {
                                    mt1Var7.j(o2());
                                    this.h = jb6.M0(2131754738, null);
                                } else {
                                    mt1Var7.j(null);
                                    this.h = null;
                                }
                            }
                            f = pg3.f(L0.emoji_status);
                            mt1 mt1Var8 = this.f;
                            if (f == 0) {
                                mt1Var8.i(c2(L0.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (sd2.w(1, L0)) {
                                    this.f.setRightDrawableOnClick(new yn8(this, (byte) 9));
                                    if (this.S) {
                                        this.S = true;
                                        getMediaDataController().Z0();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus4 = L0.emoji_status;
                                    if (emojiStatus4 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new go8(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus4).slug, r9 ? (byte) 1 : (byte) 0));
                                    }
                                }
                            } else {
                                mt1Var8.i(null);
                            }
                            j = L0.bot_verification_icon;
                            mt1 mt1Var9 = this.f;
                            if (j == 0) {
                                mt1Var9.setLeftDrawableOutside(true);
                                this.f.setLeftDrawable(a2(L0.bot_verification_icon));
                            } else {
                                mt1Var9.setLeftDrawable((Drawable) null);
                            }
                            if (sd2.d0(this.currentAccount, this.i1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new pn2(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) jb6.M0(2131751863, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new gq3(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.D6 = G;
                            this.E6 = null;
                            g4();
                            if (this.q1) {
                                ap8 ap8Var3 = this.r;
                                if (z3) {
                                    ap8Var3.setOnClickListener(new yn8(this, (byte) 10));
                                } else {
                                    ap8Var3.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l) {
                                Q2(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                            TLRPC.FileLocation fileLocation3 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (!this.q1) {
                                no4.q(this.f0, f2, true, true, this.A0);
                                m2 = null;
                                C = null;
                                m = null;
                            } else if (sd2.p0(this.F2)) {
                                TLRPC.Chat t1 = getMessagesController().t1(this.F2.id);
                                this.q0.p(t1);
                                m = gn5.m(this.currentAccount, 0, t1);
                                m2 = gn5.m(this.currentAccount, 1, t1);
                                C = this.o0.C(m2, m);
                            } else {
                                this.q0.p(L0);
                                m = gn5.m(this.currentAccount, 0, L0);
                                m2 = gn5.m(this.currentAccount, 1, L0);
                                zo8 zo8Var = this.o0;
                                C = zo8Var != null ? zo8Var.C(m2, m) : null;
                            }
                            boolean H = this.o0.H(null, m, m2, z);
                            if ((m != null || H) && this.q2 && (m3 = this.c.m(0)) != null) {
                                this.a.x0(0, m3.getTop() - e2(), d53.h);
                            }
                            String str3 = (C == null && C.p == 2) ? "g" : null;
                            if (this.K2 == null || this.q1) {
                                chat = L0;
                            } else {
                                TLRPC.Chat chat3 = L0;
                                this.f0.j(C, str3, m2, "50_50", this.q0, chat3);
                                chat = chat3;
                            }
                            if (m != null && ((gn5Var = this.C0) == null || m.s != gn5Var.s)) {
                                this.C0 = m;
                                getFileLoader().V(m, chat, null, 0, 1);
                            }
                            this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        } else if (!this.F2.megagroup) {
                            jb6.S(new int[1], this.v2.participants_count);
                            boolean z15 = this.F2.megagroup;
                            TLRPC.ChatFull chatFull2 = this.v2;
                            if (z15) {
                                jb6.G(chatFull2.participants_count, "Members", new Object[0]);
                                G = jb6.H(',', "Members", this.v2.participants_count);
                            } else {
                                jb6.G(chatFull2.participants_count, "Subscribers", new Object[0]);
                                G = jb6.H(',', "Subscribers", this.v2.participants_count);
                            }
                        } else if (this.C2 <= 1 || (i = this.v2.participants_count) == 0) {
                            int i8 = this.v2.participants_count;
                            if (i8 == 0) {
                                G = L0.has_geo ? jb6.M0(2131748399, null).toLowerCase() : sd2.t0(L0) ? jb6.M0(2131748395, null).toLowerCase() : jb6.M0(2131748398, null).toLowerCase();
                            } else {
                                jb6.G(i8, "Members", new Object[0]);
                                G = jb6.H(',', "Members", this.v2.participants_count);
                            }
                        } else {
                            jb6.G(i, "Members", new Object[0]);
                            jb6.G(Math.min(this.C2, this.v2.participants_count), "OnlineCount", new Object[0]);
                            G = kt6.o(jb6.H(',', "Members", this.v2.participants_count), ", ", jb6.H(',', "OnlineCount", Math.min(this.C2, this.v2.participants_count)));
                        }
                    } else if (sd2.k0(L0)) {
                        G = jb6.M0(2131742492, null);
                    } else if (sd2.l0(L0)) {
                        G = jb6.M0(2131742498, null);
                    } else {
                        int i9 = L0.participants_count;
                        TLRPC.ChatFull chatFull3 = this.v2;
                        if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                            i9 = chatParticipants.participants.size();
                        }
                        G = (i9 == 0 || this.C2 <= 1) ? jb6.G(i9, "Members", new Object[0]) : kt6.o(jb6.G(i9, "Members", new Object[0]), ", ", jb6.G(this.C2, "OnlineCount", new Object[0]));
                    }
                    z3 = false;
                    if (z2) {
                    }
                    if (!this.q1) {
                    }
                    if (charSequence == null) {
                    }
                    this.f.setLeftDrawableOutside(false);
                    this.f.setLeftDrawable((Drawable) null);
                    this.f.setRightDrawableOutside(false);
                    this.f.setRightDrawableOnClick(null);
                    this.n = null;
                    z4 = L0.scam;
                    if (z4) {
                    }
                    mt1 mt1Var62 = this.f;
                    int i72 = !z4 ? 1 : 0;
                    if (this.L == null) {
                    }
                    mt1Var62.j(this.L);
                    this.h = jb6.M0(2131745596, null);
                    f = pg3.f(L0.emoji_status);
                    mt1 mt1Var82 = this.f;
                    if (f == 0) {
                    }
                    j = L0.bot_verification_icon;
                    mt1 mt1Var92 = this.f;
                    if (j == 0) {
                    }
                    if (sd2.d0(this.currentAccount, this.i1)) {
                    }
                    this.D6 = G;
                    this.E6 = null;
                    g4();
                    if (this.q1) {
                    }
                    if (l) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (!this.q1) {
                    }
                    boolean H2 = this.o0.H(null, m, m2, z);
                    if (m != null) {
                    }
                    this.a.x0(0, m3.getTop() - e2(), d53.h);
                    if (C == null) {
                    }
                    if (this.K2 == null) {
                    }
                    chat = L0;
                    if (m != null) {
                        this.C0 = m;
                        getFileLoader().V(m, chat, null, 0, 1);
                    }
                    this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                }
                Q2(true);
            }
        }
        z2 = false;
        this.A5 = false;
        this.B5 = false;
        str = "";
        if (this.e1 == 0) {
        }
        Q2(true);
    }

    public final float i2(float f) {
        this.J6 = f;
        byte b = this.J1;
        return td4.A(1.0f, Utilities.l(b == 2 ? 1.0f : (this.T1 >= 1.0f || b == 0) ? this.l2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * gm.L(3.0f) : 0.0f, f);
    }

    public final void i3(String str, p1 p1Var) {
        if (str.startsWith("@")) {
            getMessagesController().C3(str.substring(1), this, 0, p1Var);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            nk3 nk3Var = new nk3(null);
            nk3Var.p2 = str;
            presentFragment(nk3Var);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (dVar instanceof yv1) {
                finishFragment();
                ((yv1) dVar).a0.E1(null, str, false, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x020e, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0bb4, code lost:
    
        if ((e2() + (r2 + r1)) >= r19.a.getMeasuredHeight()) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        if (r10.b.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019f, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
    
        if (r10.b.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i4() {
        boolean z;
        int i;
        int i2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull4;
        int i3;
        int i4;
        po8 po8Var;
        qn8 qn8Var;
        mt8 mt8Var;
        int i5;
        int i6;
        TLRPC.UserFull userFull;
        int i7;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        ir8 ir8Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        e4(false);
        int i8 = this.O2;
        this.O2 = 0;
        this.P2 = -1;
        this.Q2 = -1;
        this.T2 = -1;
        this.U2 = -1;
        this.V2 = -1;
        this.W2 = -1;
        this.X2 = -1;
        this.R2 = -1;
        this.S2 = -1;
        this.Y2 = -1;
        this.b3 = -1;
        this.c3 = -1;
        this.Z2 = -1;
        this.a3 = -1;
        this.d3 = -1;
        this.e3 = -1;
        this.f3 = -1;
        this.g3 = -1;
        this.h3 = -1;
        this.f4 = -1;
        this.g4 = -1;
        this.h4 = -1;
        this.i4 = -1;
        this.j4 = -1;
        this.k4 = -1;
        this.i3 = -1;
        this.j3 = -1;
        this.k3 = -1;
        this.l3 = -1;
        this.m3 = -1;
        this.n3 = -1;
        this.o3 = -1;
        this.p3 = -1;
        this.q3 = -1;
        this.r3 = -1;
        this.s3 = -1;
        this.t3 = -1;
        this.u3 = -1;
        this.v3 = -1;
        this.w3 = -1;
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = -1;
        this.A3 = -1;
        this.l4 = -1;
        this.m4 = -1;
        this.n4 = -1;
        this.o4 = -1;
        this.p4 = -1;
        this.q4 = -1;
        this.v4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.x4 = -1;
        this.r4 = -1;
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = -1;
        this.V3 = -1;
        this.W3 = -1;
        this.Y3 = -1;
        this.X3 = -1;
        this.a4 = -1;
        this.B3 = -1;
        this.C3 = -1;
        this.E3 = -1;
        this.F3 = -1;
        this.G3 = -1;
        this.H3 = -1;
        this.I3 = -1;
        this.K3 = -1;
        this.J3 = -1;
        this.L3 = -1;
        this.M3 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.N3 = -1;
        this.Z3 = -1;
        this.O3 = -1;
        this.Q3 = -1;
        this.P3 = -1;
        this.S3 = -1;
        this.T3 = -1;
        this.U3 = -1;
        this.A4 = -1;
        this.D3 = -1;
        this.b4 = -1;
        this.c4 = -1;
        this.d4 = -1;
        this.e4 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.E4 = -1;
        this.F4 = -1;
        this.G4 = -1;
        this.H4 = -1;
        this.O4 = -1;
        this.P4 = -1;
        this.M4 = -1;
        this.S4 = -1;
        this.R3 = -1;
        this.I4 = -1;
        this.J4 = -1;
        this.K4 = -1;
        this.L4 = -1;
        this.N4 = -1;
        this.Q4 = false;
        boolean z2 = 1;
        int i9 = 1;
        z2 = 1;
        this.R4 = (this.e1 == 0 || (userFull7 = this.w2) == null || userFull7.wallet_card == null || (this.r0 != null && !this.s1)) ? false : true;
        this.T4 = -1;
        this.U4 = -1;
        this.V4 = -1;
        ArrayList arrayList2 = this.Z4;
        arrayList2.clear();
        ArrayList arrayList3 = this.a5;
        arrayList3.clear();
        fha fhaVar = this.R;
        if (fhaVar != null) {
            int[] iArr = fhaVar.c;
            int i10 = 0;
            while (true) {
                if (i10 >= iArr.length) {
                    z = false;
                    break;
                } else {
                    if (iArr[i10] > 0) {
                        z = true;
                        break;
                    }
                    i10++;
                }
            }
            if (!z) {
                z = this.R.f;
            }
            if (!z) {
                this.R.getClass();
            }
            if (!z && (userFull6 = this.w2) != null) {
                z = userFull6.stories_pinned_available;
            }
            if (!z && (userFull5 = this.w2) != null && (botInfo = userFull5.bot_info) != null) {
                z = botInfo.has_preview_medias;
            }
            if (!z && (((userFull4 = this.w2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.v2) != null && chatFull6.stargifts_count > 0))) {
                z = true;
            }
            if (!z && (chatFull5 = this.v2) != null) {
                z = chatFull5.stories_pinned_available;
            }
            if (!z) {
                long j = this.f1;
                if (j != 0) {
                    qb7 K0 = oc7.r1(this.currentAccount).K0(-j);
                    if (K0 != null) {
                    }
                }
                if (this.s2) {
                    long j2 = this.e1;
                    if (j2 != 0) {
                        qb7 K02 = oc7.r1(this.currentAccount).K0(j2);
                        if (K02 != null) {
                        }
                    }
                }
            }
            if (this.e1 == 0) {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull8 = this.w2;
                if (userFull8 != null && userFull8.saved_music != null && (this.r0 == null || this.s1)) {
                    this.Q4 = true;
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.Q4 || this.R4 || this.s6 != null || this.a0 == null) {
                        int i11 = this.O2;
                        this.O2 = i11 + 1;
                        this.C3 = i11;
                    } else {
                        int i12 = this.O2;
                        this.O2 = i12 + 1;
                        this.B3 = i12;
                    }
                }
                if (!m9c.D(W1) || this.s1) {
                    String p = m9c.p(W1);
                    TLRPC.UserFull userFull9 = this.w2;
                    Object[] objArr = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (W1 == null || TextUtils.isEmpty(p))) ? false : true;
                    Object[] objArr2 = (W1 == null || (TextUtils.isEmpty(W1.phone) && TextUtils.isEmpty(this.n5))) ? false : true;
                    if (!this.s2 && (userFull3 = this.w2) != null && userFull3.unofficial_security_risk) {
                        int i13 = this.O2;
                        this.r4 = i13;
                        this.O2 = i13 + 2;
                        this.s4 = i13 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.w2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((ir8Var = this.x2) != null && ir8Var.c && ir8Var.d.isEmpty())) {
                        i = 0;
                        i2 = i8;
                    } else {
                        i = 0;
                        i2 = i8;
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.w2.personal_channel_id));
                        if (L0 != null && (sd2.t0(L0) || !sd2.r0(L0))) {
                            int i14 = this.O2;
                            this.R2 = i14;
                            this.O2 = i14 + 2;
                            this.S2 = i14 + 1;
                        }
                    }
                    if (!this.s2 && (objArr2 != false || objArr == false)) {
                        int i15 = this.O2;
                        this.O2 = i15 + 1;
                        this.H3 = i15;
                    }
                    TLRPC.UserFull userFull11 = this.w2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i16 = this.O2;
                        this.O2 = i16 + 1;
                        this.K3 = i16;
                    }
                    if (W1 != null && p != null) {
                        int i17 = this.O2;
                        this.O2 = i17 + 1;
                        this.M3 = i17;
                    }
                    TLRPC.UserFull userFull12 = this.w2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i18 = this.O2;
                            this.O2 = i18 + 1;
                            this.V2 = i18;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i19 = this.O2;
                            this.O2 = i19 + 1;
                            this.P3 = i19;
                        }
                        if (userFull12.business_location != null) {
                            int i20 = this.O2;
                            this.O2 = i20 + 1;
                            this.Q3 = i20;
                        }
                        if (userFull12.note != null) {
                            int i21 = this.O2;
                            this.O2 = i21 + 1;
                            this.I3 = i21;
                        }
                    }
                    if (this.a0 == null && this.e1 != getUserConfig().e()) {
                        int i22 = this.O2;
                        this.O2 = i22 + 1;
                        this.O3 = i22;
                    }
                    if (this.s2 && W1 != null && W1.bot_has_main_app) {
                        int i23 = this.O2;
                        this.O2 = i23 + 1;
                        this.l4 = i23;
                    }
                    TL_agent.settings settingsVar = r2() ? getMessagesController().B0().d : null;
                    if (settingsVar != null && settingsVar.keys.isEmpty()) {
                        int i24 = this.O2;
                        this.O2 = i24 + 1;
                        this.m4 = i24;
                    }
                    int i25 = this.O2;
                    this.O2 = i25 + 1;
                    this.S3 = i25;
                    if (settingsVar != null && !settingsVar.keys.isEmpty()) {
                        int i26 = this.O2;
                        this.n4 = i26;
                        int size = settingsVar.keys.size() + i26;
                        this.o4 = size;
                        this.p4 = size;
                        this.O2 = size + 2;
                        this.q4 = size + 1;
                    }
                    if (W1 != null && W1.linked_community_id != 0) {
                        int i27 = this.O2;
                        this.t4 = i27;
                        this.O2 = i27 + 2;
                        this.u4 = i27 + 1;
                    }
                    if (this.s2 && (userFull2 = this.w2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().l4.C2.f()) {
                        int i28 = this.O2;
                        this.T3 = i28;
                        this.O2 = i28 + 2;
                        this.U3 = i28 + 1;
                    }
                    if (this.s2) {
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = tr0.d(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.u2 == null && getContext() != null) {
                            this.u2 = up0.b(getContext(), this.currentAccount, this.e1);
                        }
                        tr0 tr0Var = this.t2;
                        int i29 = (tr0Var == null || !tr0Var.d) ? i : 1;
                        up0 up0Var = this.u2;
                        int i30 = (up0Var == null || !up0Var.f) ? i : 1;
                        TLRPC.UserFull userFull13 = this.w2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!yaa.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                i7 = i;
                                if (i7 == 0 || i29 != 0 || i30 != 0) {
                                    int i31 = this.O2;
                                    int i32 = i31 + 1;
                                    this.O2 = i32;
                                    this.v4 = i31;
                                    if (i7 != 0) {
                                        int i33 = i31 + 2;
                                        this.O2 = i33;
                                        this.botPermissionEmojiStatus = i32;
                                        i32 = i33;
                                    }
                                    if (i29 != 0) {
                                        int i34 = i32 + 1;
                                        this.O2 = i34;
                                        this.botPermissionLocation = i32;
                                        i32 = i34;
                                    }
                                    if (i30 != 0) {
                                        int i35 = i32 + 1;
                                        this.O2 = i35;
                                        this.botPermissionBiometry = i32;
                                        i32 = i35;
                                    }
                                    this.O2 = i32 + 1;
                                    this.x4 = i32;
                                }
                            }
                        }
                        i7 = 1;
                        if (i7 == 0) {
                        }
                        int i312 = this.O2;
                        int i322 = i312 + 1;
                        this.O2 = i322;
                        this.v4 = i312;
                        if (i7 != 0) {
                        }
                        if (i29 != 0) {
                        }
                        if (i30 != 0) {
                        }
                        this.O2 = i322 + 1;
                        this.x4 = i322;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.E2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i36 = this.O2;
                        this.y4 = i36;
                        this.z4 = i36 + 1;
                        this.O2 = i36 + 3;
                        this.A4 = i36 + 2;
                    }
                    if (W1 != null && !this.s2 && encryptedChat == null && W1.id != getUserConfig().e() && this.k1) {
                        int i37 = this.O2;
                        this.T4 = i37;
                        this.O2 = i37 + 2;
                        this.V4 = i37 + 1;
                    }
                    if (this.s2 && W1 != null && W1.bot && W1.bot_can_edit) {
                        int i38 = this.O2;
                        this.b4 = i38;
                        this.O2 = i38 + 2;
                        this.c4 = i38 + 1;
                    }
                    if (W1 != null && W1.bot) {
                        TLRPC.UserFull userFull14 = this.w2;
                        if (userFull14 != null && userFull14.can_view_revenue && ku0.g(this.currentAccount).i(this.e1) > 0) {
                            int i39 = this.O2;
                            this.O2 = i39 + 1;
                            this.K4 = i39;
                        }
                        if (ku0.g(this.currentAccount).c(this.e1).amount > 0 || !ku0.g(this.currentAccount).k(this.e1).a[i].isEmpty()) {
                            int i40 = this.O2;
                            this.O2 = i40 + 1;
                            this.J4 = i40;
                        }
                    }
                    if (W1 != null && this.s2 && !W1.bot_nochats) {
                        int i41 = this.O2;
                        this.d4 = i41;
                        this.O2 = i41 + 2;
                        this.e4 = i41 + 1;
                    } else if (this.J4 >= 0) {
                        i6 = 1;
                        if (!this.s1 && this.m5 && W1 != null && !W1.contact && !W1.bot && !m9c.C(W1.id)) {
                            int i42 = this.O2;
                            this.O2 = i42 + 1;
                            this.a4 = i42;
                            i6 = 1;
                        }
                        if (!this.s1 && this.j5 != 0 && this.k5 < 0 && sd2.y(13, getMessagesController().L0(Long.valueOf(-this.k5)))) {
                            int i43 = this.O2;
                            this.O2 = i43 + 1;
                            this.X3 = i43;
                            i6 = 1;
                        }
                        if (!this.s1 || this.j5 == 0 || bw2.r(this.currentAccount).x(this.e1)) {
                            i9 = i6;
                        } else {
                            int i44 = this.O2;
                            this.O2 = i44 + 1;
                            this.Y3 = i44;
                        }
                        if (i9 != 0) {
                            int i45 = this.O2;
                            this.O2 = i45 + 1;
                            this.Z3 = i45;
                        }
                        if (!z || ((W1 != null && W1.bot && W1.bot_can_edit && W1.bot_has_main_app) || (!((userFull = this.w2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i46 = this.O2;
                            this.O2 = i46 + 1;
                            this.S4 = i46;
                        } else if (this.V4 == -1 && this.o1) {
                            int i47 = this.O2;
                            this.V3 = i47;
                            this.O2 = i47 + 2;
                            this.V4 = i47 + 1;
                        }
                    }
                    i6 = i;
                    if (!this.s1) {
                        int i422 = this.O2;
                        this.O2 = i422 + 1;
                        this.a4 = i422;
                        i6 = 1;
                    }
                    if (!this.s1) {
                        int i432 = this.O2;
                        this.O2 = i432 + 1;
                        this.X3 = i432;
                        i6 = 1;
                    }
                    if (this.s1) {
                    }
                    i9 = i6;
                    if (i9 != 0) {
                    }
                    if (z) {
                    }
                    int i462 = this.O2;
                    this.O2 = i462 + 1;
                    this.S4 = i462;
                } else {
                    if (this.K2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        zo8 zo8Var = this.o0;
                        if (zo8Var == null || zo8Var.getRealCount() == 0) {
                            int i48 = this.O2;
                            this.P2 = i48;
                            this.O2 = i48 + 2;
                            this.Q2 = i48 + 1;
                        }
                    }
                    int i49 = this.O2;
                    this.T2 = i49;
                    this.U2 = i49 + 1;
                    this.W2 = i49 + 2;
                    this.X2 = i49 + 3;
                    this.O2 = i49 + 5;
                    this.e3 = i49 + 4;
                    Set set = getMessagesController().u3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i50 = this.O2;
                        this.Z2 = i50;
                        this.O2 = i50 + 2;
                        this.a3 = i50 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i51 = this.O2;
                        this.b3 = i51;
                        this.O2 = i51 + 2;
                        this.Y2 = i51 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i52 = this.O2;
                        this.d3 = i52;
                        this.O2 = i52 + 2;
                        this.c3 = i52 + 1;
                    }
                    int i53 = this.O2;
                    this.f3 = i53;
                    this.k3 = i53 + 1;
                    this.i3 = i53 + 2;
                    this.g3 = i53 + 3;
                    this.j3 = i53 + 4;
                    this.O2 = i53 + 6;
                    this.m3 = i53 + 5;
                    if (getMessagesController().l4.H0.f() || !getMessagesController().G0.isEmpty()) {
                        int i54 = this.O2;
                        this.O2 = i54 + 1;
                        this.l3 = i54;
                    }
                    int i55 = this.O2;
                    this.o3 = i55;
                    this.h3 = i55 + 1;
                    this.O2 = i55 + 3;
                    this.p3 = i55 + 2;
                    if (!getMessagesController().H3()) {
                        int i56 = this.O2;
                        this.O2 = i56 + 1;
                        this.f4 = i56;
                    }
                    if (getMessagesController().c5()) {
                        int i57 = this.O2;
                        this.O2 = i57 + 1;
                        this.g4 = i57;
                    }
                    jva.v(this.currentAccount, true).m();
                    org.telegram.messenger.a.m();
                    int i58 = this.O2;
                    this.O2 = i58 + 1;
                    this.h4 = i58;
                    if (!getMessagesController().H3()) {
                        int i59 = this.O2;
                        this.O2 = i59 + 1;
                        this.i4 = i59;
                    }
                    if (!getMessagesController().I3()) {
                        int i60 = this.O2;
                        this.O2 = i60 + 1;
                        this.j4 = i60;
                    }
                    if (this.f4 >= 0 || this.g4 >= 0 || this.h4 >= 0 || this.i4 >= 0 || this.j4 >= 0) {
                        int i61 = this.O2;
                        this.O2 = i61 + 1;
                        this.k4 = i61;
                    }
                    int i62 = this.O2;
                    this.q3 = i62;
                    this.r3 = i62 + 1;
                    this.s3 = i62 + 2;
                    int i63 = i62 + 4;
                    this.O2 = i63;
                    this.t3 = i62 + 3;
                    boolean z3 = e21.a;
                    if (z3) {
                        this.u3 = i63;
                        i63 = i62 + 6;
                        this.O2 = i63;
                        this.v3 = i62 + 5;
                    }
                    if (z3) {
                        this.w3 = i63;
                        int i64 = i63 + 2;
                        this.x3 = i63 + 1;
                        i63 += 3;
                        this.O2 = i63;
                        this.y3 = i64;
                    }
                    this.z3 = i63;
                    this.O2 = i63 + 2;
                    this.A3 = i63 + 1;
                    i = 0;
                    i2 = i8;
                }
            } else {
                i = 0;
                i2 = i8;
                if (this.q1) {
                    if (this.B3 < 0 && this.C3 < 0) {
                        if (this.Q4 || this.R4 || this.s6 != null || this.a0 == null) {
                            int i65 = this.O2;
                            this.O2 = i65 + 1;
                            this.C3 = i65;
                        } else {
                            int i66 = this.O2;
                            this.O2 = i66 + 1;
                            this.B3 = i66;
                        }
                    }
                    int i67 = this.O2;
                    int i68 = i67 + 1;
                    this.O2 = i68;
                    this.M3 = i67;
                    if (this.a0 == null) {
                        int i69 = i67 + 2;
                        this.O2 = i69;
                        this.R3 = i68;
                        i68 = i69;
                    }
                    int i70 = i68 + 1;
                    this.O2 = i70;
                    this.S3 = i68;
                    if (z) {
                        this.O2 = i68 + 2;
                        this.S4 = i70;
                    }
                } else if (this.f1 != 0) {
                    TLRPC.ChatFull chatFull7 = this.v2;
                    if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.v2.location instanceof TLRPC.TL_channelLocation))) || sd2.t0(this.F2)) {
                        if (this.B3 < 0 && this.C3 < 0) {
                            if (this.Q4 || this.R4 || this.s6 != null || this.a0 == null) {
                                int i71 = this.O2;
                                this.O2 = i71 + 1;
                                this.C3 = i71;
                            } else {
                                int i72 = this.O2;
                                this.O2 = i72 + 1;
                                this.B3 = i72;
                            }
                        }
                        if (this.a0 == null) {
                            int i73 = this.O2;
                            this.O2 = i73 + 1;
                            this.E3 = i73;
                        }
                        TLRPC.ChatFull chatFull8 = this.v2;
                        if (chatFull8 != null) {
                            if (!TextUtils.isEmpty(chatFull8.about)) {
                                int i74 = this.O2;
                                this.O2 = i74 + 1;
                                this.L3 = i74;
                            }
                            if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                                int i75 = this.O2;
                                this.O2 = i75 + 1;
                                this.J3 = i75;
                            }
                        }
                        if (sd2.t0(this.F2)) {
                            int i76 = this.O2;
                            this.O2 = i76 + 1;
                            this.M3 = i76;
                        }
                    }
                    if (this.B3 < 0 && this.C3 < 0) {
                        if (this.Q4 || this.R4 || this.s6 != null || this.a0 == null) {
                            int i77 = this.O2;
                            this.O2 = i77 + 1;
                            this.C3 = i77;
                        } else {
                            int i78 = this.O2;
                            this.O2 = i78 + 1;
                            this.B3 = i78;
                        }
                    }
                    if (this.a0 == null) {
                        if (this.E3 != -1) {
                            int i79 = this.O2;
                            this.O2 = i79 + 1;
                            this.N3 = i79;
                        }
                        int i80 = this.O2;
                        this.O2 = i80 + 1;
                        this.O3 = i80;
                    }
                    int i81 = this.O2;
                    if (i81 > 0) {
                        int i82 = i81 + 1;
                        this.O2 = i82;
                        this.S3 = i81;
                        i81 = i82;
                    }
                    TLRPC.Chat chat = this.F2;
                    if (chat != null && chat.linked_community_id != 0) {
                        this.t4 = i81;
                        this.O2 = i81 + 2;
                        this.u4 = i81 + 1;
                    }
                    if (sd2.T(chat)) {
                        TLRPC.Chat chat2 = this.F2;
                        if (!chat2.megagroup) {
                            TLRPC.ChatFull chatFull9 = this.v2;
                            if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                                if (this.a0 == null) {
                                    int i83 = this.O2;
                                    this.O2 = i83 + 1;
                                    this.B4 = i83;
                                }
                                int i84 = this.O2;
                                int i85 = i84 + 1;
                                this.O2 = i85;
                                this.F4 = i84;
                                if (chatFull9.requests_pending > 0) {
                                    int i86 = i84 + 2;
                                    this.O2 = i86;
                                    this.G4 = i85;
                                    i85 = i86;
                                }
                                int i87 = i85 + 1;
                                this.O2 = i87;
                                this.H4 = i85;
                                if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                    this.O2 = i85 + 2;
                                    this.O4 = i87;
                                }
                                if ((chatFull9.can_view_stars_revenue && (ku0.g(this.currentAccount).c(-this.f1).amount > 0 || !ku0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.v2) != null && chatFull4.can_view_revenue && ku0.g(this.currentAccount).i(-this.f1) > 0)) {
                                    int i88 = this.O2;
                                    this.O2 = i88 + 1;
                                    this.L4 = i88;
                                }
                                int i89 = this.O2;
                                this.I4 = i89;
                                this.O2 = i89 + 2;
                                this.M4 = i89 + 1;
                            }
                            if (sd2.T(this.F2)) {
                                TLRPC.ChatFull chatFull10 = this.v2;
                                if (chatFull10 != null) {
                                    if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                        if (!sd2.r0(this.F2) && sd2.w(3, this.F2) && this.v2.participants_hidden) {
                                            int i90 = this.O2;
                                            this.E4 = i90;
                                            this.O2 = i90 + 2;
                                            this.P4 = i90 + 1;
                                        }
                                        wp8 wp8Var = this.O;
                                        if (wp8Var != null) {
                                            wp8Var.C1();
                                        }
                                    } else {
                                        if (sd2.w(3, this.F2) || (tL_chatBannedRights = this.F2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                            int i91 = this.O2;
                                            this.O2 = i91 + 1;
                                            this.E4 = i91;
                                        }
                                        if (this.v2.participants.participants.size() <= 5 || !z) {
                                            if (this.E4 == -1 && this.a0 == null) {
                                                int i92 = this.O2;
                                                this.O2 = i92 + 1;
                                                this.B4 = i92;
                                            }
                                            int i93 = this.O2;
                                            this.C4 = i93;
                                            int size2 = this.v2.participants.participants.size() + i93;
                                            this.D4 = size2;
                                            this.O2 = size2 + 1;
                                            this.P4 = size2;
                                            arrayList2.addAll(this.v2.participants.participants);
                                            ArrayList arrayList4 = this.D2;
                                            if (arrayList4 != null) {
                                                arrayList3.addAll(arrayList4);
                                            }
                                            wp8 wp8Var2 = this.O;
                                            if (wp8Var2 != null) {
                                                wp8Var2.h1(null, null);
                                            }
                                        } else {
                                            if (this.E4 != -1) {
                                                int i94 = this.O2;
                                                this.O2 = i94 + 1;
                                                this.P4 = i94;
                                            }
                                            wp8 wp8Var3 = this.O;
                                            if (wp8Var3 != null) {
                                                wp8Var3.h1(this.D2, this.v2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (this.q1 || (chatFull3 = this.v2) == null || !this.F2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                    if (!sd2.r0(this.F2) && sd2.w(3, this.F2) && (chatFull2 = this.v2) != null && chatFull2.participants_hidden) {
                                        int i95 = this.O2;
                                        this.E4 = i95;
                                        this.O2 = i95 + 2;
                                        this.P4 = i95 + 1;
                                    }
                                    wp8 wp8Var4 = this.O;
                                    if (wp8Var4 != null) {
                                        wp8Var4.C1();
                                    }
                                } else {
                                    if (!sd2.r0(this.F2) && sd2.w(3, this.F2) && this.v2.participants_count < getMessagesController().Q2) {
                                        int i96 = this.O2;
                                        this.O2 = i96 + 1;
                                        this.E4 = i96;
                                    }
                                    int size3 = this.v2.participants.participants.size();
                                    if ((size3 <= 5 || !z || this.b5 == 1) && this.b5 != 2) {
                                        if (this.E4 == -1 && this.a0 == null) {
                                            int i97 = this.O2;
                                            this.O2 = i97 + 1;
                                            this.B4 = i97;
                                        }
                                        int i98 = this.O2;
                                        this.C4 = i98;
                                        int i99 = i98 + size3;
                                        this.D4 = i99;
                                        this.O2 = i99 + 1;
                                        this.P4 = i99;
                                        arrayList2.addAll(this.v2.participants.participants);
                                        ArrayList arrayList5 = this.D2;
                                        if (arrayList5 != null) {
                                            arrayList3.addAll(arrayList5);
                                        }
                                        this.b5 = (byte) 1;
                                        wp8 wp8Var5 = this.O;
                                        if (wp8Var5 != null) {
                                            wp8Var5.h1(null, null);
                                        }
                                    } else {
                                        if (this.E4 != -1) {
                                            int i100 = this.O2;
                                            this.O2 = i100 + 1;
                                            this.P4 = i100;
                                        }
                                        if (this.O != null) {
                                            if (!this.D2.isEmpty()) {
                                                this.b5 = (byte) 2;
                                            }
                                            this.O.h1(this.D2, this.v2);
                                        }
                                    }
                                }
                                if (this.V4 == -1) {
                                    TLRPC.Chat chat3 = this.F2;
                                    if (chat3.left && !chat3.kicked) {
                                        long j3 = oc7.v1(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                        if (j3 <= 0 || System.currentTimeMillis() - j3 >= 120000) {
                                            qn8 qn8Var2 = this.a0;
                                            if (qn8Var2 == null || !qn8Var2.f()) {
                                                int i101 = this.O2;
                                                this.U4 = i101;
                                                this.O2 = i101 + 2;
                                                this.V4 = i101 + 1;
                                            }
                                            if (z) {
                                                int i102 = this.O2;
                                                this.O2 = i102 + 1;
                                                this.S4 = i102;
                                            }
                                            if (this.S4 == -1) {
                                                int i103 = this.O2;
                                                this.O2 = i103 + 1;
                                                this.D3 = i103;
                                            }
                                            if (this.actionBar != null) {
                                                i3 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : i);
                                            } else {
                                                i3 = i;
                                            }
                                            if (this.a != null && i2 <= this.O2) {
                                                i5 = this.F0;
                                                if (i5 != 0) {
                                                }
                                                i4 = i;
                                                po8Var = this.a;
                                                if (po8Var != null) {
                                                    po8Var.setTranslateSelectorPosition(this.P3);
                                                }
                                                qn8Var = this.a0;
                                                if (qn8Var != null) {
                                                    qn8Var.o(7, z2);
                                                }
                                                mt8Var = this.c0;
                                                if (mt8Var != null) {
                                                    TLRPC.UserFull userFull15 = this.w2;
                                                    if (userFull15 != null) {
                                                        mt8Var.setMusicDocument(userFull15.saved_music);
                                                    }
                                                    this.c0.setVisibility(this.Q4 ? i4 : 8);
                                                    if (this.R4) {
                                                        this.d0.setBalance(this.w2.wallet_card.balance);
                                                    }
                                                    yq8 yq8Var = this.d0;
                                                    if (!this.R4) {
                                                        i4 = 8;
                                                    }
                                                    yq8Var.setVisibility(i4);
                                                    this.c0.invalidate();
                                                    this.d0.invalidate();
                                                    return;
                                                }
                                                return;
                                            }
                                            i4 = i;
                                            this.D0 = i4;
                                            po8Var = this.a;
                                            if (po8Var != null) {
                                            }
                                            qn8Var = this.a0;
                                            if (qn8Var != null) {
                                            }
                                            mt8Var = this.c0;
                                            if (mt8Var != null) {
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = 0;
                            if (z) {
                            }
                            if (this.S4 == -1) {
                            }
                            if (this.actionBar != null) {
                            }
                            if (this.a != null) {
                                i5 = this.F0;
                                if (i5 != 0) {
                                }
                                i4 = i;
                                po8Var = this.a;
                                if (po8Var != null) {
                                }
                                qn8Var = this.a0;
                                if (qn8Var != null) {
                                }
                                mt8Var = this.c0;
                                if (mt8Var != null) {
                                }
                            }
                            i4 = i;
                            this.D0 = i4;
                            po8Var = this.a;
                            if (po8Var != null) {
                            }
                            qn8Var = this.a0;
                            if (qn8Var != null) {
                            }
                            mt8Var = this.c0;
                            if (mt8Var != null) {
                            }
                        }
                    }
                    TLRPC.ChatFull chatFull11 = this.v2;
                    if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (ku0.g(this.currentAccount).c(-this.f1).amount > 0 || !ku0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.v2) != null && chatFull.can_view_revenue && ku0.g(this.currentAccount).i(-this.f1) > 0)) {
                        int i104 = this.O2;
                        this.L4 = i104;
                        this.O2 = i104 + 2;
                        this.M4 = i104 + 1;
                    }
                    if (sd2.T(this.F2)) {
                    }
                    z2 = 0;
                    if (z) {
                    }
                    if (this.S4 == -1) {
                    }
                    if (this.actionBar != null) {
                    }
                    if (this.a != null) {
                    }
                    i4 = i;
                    this.D0 = i4;
                    po8Var = this.a;
                    if (po8Var != null) {
                    }
                    qn8Var = this.a0;
                    if (qn8Var != null) {
                    }
                    mt8Var = this.c0;
                    if (mt8Var != null) {
                    }
                }
            }
            z2 = i;
            if (this.S4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            i4 = i;
            this.D0 = i4;
            po8Var = this.a;
            if (po8Var != null) {
            }
            qn8Var = this.a0;
            if (qn8Var != null) {
            }
            mt8Var = this.c0;
            if (mt8Var != null) {
            }
        }
        z = false;
        if (!z) {
            z = userFull6.stories_pinned_available;
        }
        if (!z) {
            z = botInfo.has_preview_medias;
        }
        if (!z) {
            z = true;
        }
        if (!z) {
            z = chatFull5.stories_pinned_available;
        }
        if (!z) {
        }
        if (this.e1 == 0) {
        }
        z2 = i;
        if (this.S4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        i4 = i;
        this.D0 = i4;
        po8Var = this.a;
        if (po8Var != null) {
        }
        qn8Var = this.a0;
        if (qn8Var != null) {
        }
        mt8Var = this.c0;
        if (mt8Var != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.q2;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        int v0;
        if (this.q2) {
            return false;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.y()) {
            v0 = cmb.v0(cmb.v8, this.A0);
        } else if (this.c6 || this.L5 > 0.5f) {
            v0 = cmb.v0(cmb.c6, this.A0);
        } else {
            ec7 ec7Var = this.s6;
            v0 = ec7Var != null ? ec7Var.d(cmb.I.o()) : cmb.v0(cmb.r8, this.A0);
        }
        return on2.h(v0) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L18;
     */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wp8 wp8Var;
        zo8 zo8Var = this.o0;
        Rect rect = this.M2;
        if (zo8Var != null && zo8Var.getVisibility() == 0 && this.o0.getRealCount() > 1) {
            this.o0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.S4 != -1 && (wp8Var = this.O) != null) {
            if (wp8Var.u0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    wp8 wp8Var2 = this.O;
                    return wp8Var2.getSelectedTab() == wp8Var2.L0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    @Override // aj6
    public final nz4 j() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final x43 j2() {
        x43 x43Var = this.K;
        if (x43Var != null) {
            return x43Var;
        }
        Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.E = mutate;
        mutate.setColorFilter(cmb.v0(cmb.pi, this.A0), PorterDuff.Mode.MULTIPLY);
        x43 x43Var2 = new x43(this.E, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        this.K = x43Var2;
        return x43Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j3(float f, float f2, int i, View view) {
        TLRPC.Chat L0;
        String K;
        TLRPC.TL_username b;
        String sb;
        String str;
        TLRPC.UserFull userFull;
        TLRPC.UserFull userFull2;
        String str2;
        float f3;
        float f4;
        ViewGroup view2;
        View view3 = view;
        byte b2 = 13;
        byte b3 = 2;
        String str3 = "";
        String str4 = null;
        int i2 = 0;
        if (i == this.M3 || i == this.W2) {
            if (this.e1 == 0) {
                if (this.f1 != 0 && (L0 = getMessagesController().L0(Long.valueOf(this.f1))) != null && (this.g1 != 0 || sd2.t0(L0))) {
                    K = sd2.K(L0, false);
                    b = pg3.b(K, L0.usernames);
                    if (this.e1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
            K = m9c.p(W1);
            if (W1 != null && K != null) {
                b = pg3.b(K, W1.usernames);
                if (this.e1 != 0) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.f1));
                    if (sd2.t0(L02)) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().N2);
                        sb2.append("/");
                        sb2.append(sd2.K(L02, false));
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb2.append(str3);
                        sb = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().N2);
                        sb3.append("/c/");
                        sb3.append(L02.id);
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb3.append(str3);
                        sb = sb3.toString();
                    }
                    jp8 jp8Var = new jp8(this, getParentActivity(), sb, sb);
                    showDialog(jp8Var);
                    if (b != null && !b.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = b.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new fm8(this, b, jp8Var, b3)), getClassGuid());
                        return true;
                    }
                } else if (!T1(i, view3)) {
                    if (b != null && !b.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new jl7(this, b, b2)), getClassGuid());
                        return true;
                    }
                    try {
                        c41.b0(this).i(jb6.M0(2131743352, null)).j();
                        ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + K));
                        return true;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i != this.I3) {
            byte b4 = 0;
            if (i == this.H3 || i == this.U2) {
                if (!T1(i, view3)) {
                    TLRPC.User W12 = getMessagesController().W1(Long.valueOf(this.e1));
                    if (W12 != null && (str = W12.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        byte b5 = 3;
                        if (i == this.H3 && W12.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = W12.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new fm8(this, str5, W12, b5)), getClassGuid());
                            return true;
                        }
                        bu5 I = bu5.I(this, view3);
                        I.X(this.a.V0(view3, false));
                        I.w = false;
                        if (i == this.H3) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                I.b(R.drawable.msg_calls, jb6.M0(2131752553, null), new rn8(this, W12, b3), false);
                                if (this.w2.video_calls_available) {
                                    I.b(R.drawable.msg_videocall, jb6.M0(2131743295, null), new rn8(this, W12, b5), false);
                                }
                            }
                            if (!this.l5) {
                                I.b(R.drawable.msg_calls_regular, jb6.M0(2131752587, null), new rn8(this, W12, (byte) 4), false);
                            }
                        }
                        I.b(R.drawable.msg_copy, jb6.M0(2131751704, null), new rn8(this, W12, b4), false);
                        if (this.l5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.M0(2131754215, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i3 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, i3, 33);
                                spannableStringBuilder.setSpan(new do4(cmb.H6, this.A0), indexOf, i3, 33);
                            }
                            I.j();
                            I.o(13, gm.L(200.0f), spannableStringBuilder);
                            if (I.A() instanceof TextView) {
                                TextView textView = (TextView) I.A();
                                int i4 = cmb.H5;
                                anb.R(textView, cmb.Y(cmb.v0(i4, this.A0), 0, 6), null, anb.M(i4), this.A0);
                                textView.setOnClickListener(new x10(b2));
                            }
                        }
                        I.a0();
                        return true;
                    }
                }
                return true;
            }
            if (i == this.L3 || i == this.K3 || i == this.J3 || i == this.X2) {
                if (i != this.X2 || ((userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!T1(i, view3)) {
                        if (view3 instanceof s1) {
                            s1 s1Var = (s1) view3;
                            if (s1Var.c0 && s1Var.W <= 0.0f) {
                                s1Var.h();
                                return false;
                            }
                        }
                        if (i == this.J3) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i == this.L3) {
                            TLRPC.ChatFull chatFull2 = this.v2;
                            if (chatFull2 != null) {
                                str4 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.w2;
                            if (userFull4 != null) {
                                str4 = userFull4.about;
                            }
                        }
                        String str6 = str4;
                        if (!TextUtils.isEmpty(str6)) {
                            String[] strArr = {"und"};
                            boolean r = oc7.r1(this.currentAccount).i4.r();
                            boolean[] zArr = {i == this.X2 || i == this.L3 || i == this.K3};
                            String G0 = s1c.G0();
                            qu quVar = new qu(this, view3, str6, i, zArr, strArr, G0);
                            if (zArr[0]) {
                                eoe.b(str6, new mx1(this, strArr, zArr, G0, r, quVar), new h68((Object) quVar, (byte) 15), false);
                                return true;
                            }
                            quVar.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i == this.P3 || i == this.Q3) && getParentActivity() != null && (userFull2 = this.w2) != null) {
                if (i != this.P3) {
                    if (i == this.Q3 && !T1(i, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.w2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            hd2 hd2Var = new hd2(getParentActivity(), R.drawable.popup_fixed_alert, this.A0, i2, (byte) 1);
                            hd2Var.V = new Path();
                            hd2Var.setFitItems(true);
                            r7.c(false, false, hd2Var, R.drawable.msg_copy, jb6.M0(2131751704, null), false, this.A0).setOnClickListener(new ph((org.telegram.ui.ActionBar.d) this, (Object) atomicReference, (Serializable) str7, i, (byte) 6));
                            m8 m8Var = new m8(hd2Var, -2, -2);
                            m8Var.e = true;
                            m8Var.c = (short) 220;
                            m8Var.setOutsideTouchable(true);
                            m8Var.setClippingEnabled(true);
                            m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                            m8Var.setFocusable(true);
                            hd2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                            m8Var.setInputMethodMode(2);
                            m8Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(m8Var);
                            f3 = f;
                            f4 = f2;
                            while (view3 != null) {
                                f3 += view3.getX();
                                f4 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (gm.O1()) {
                                f3 += view2.getX() + view2.getPaddingLeft();
                                f4 += view2.getY() + view2.getPaddingTop();
                            }
                            m8Var.showAtLocation(getFragmentView(), 0, (int) (f3 - (hd2Var.getMeasuredWidth() / 2.0f)), (int) f4);
                            m8Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = ss7.k0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    hd2 hd2Var2 = new hd2(getParentActivity(), R.drawable.popup_fixed_alert, this.A0, i2, (byte) 1);
                    hd2Var2.V = new Path();
                    hd2Var2.setFitItems(true);
                    r7.c(false, false, hd2Var2, R.drawable.msg_copy, jb6.M0(2131751704, null), false, this.A0).setOnClickListener(new ph((org.telegram.ui.ActionBar.d) this, (Object) atomicReference2, (Serializable) str72, i, (byte) 6));
                    m8 m8Var2 = new m8(hd2Var2, -2, -2);
                    m8Var2.e = true;
                    m8Var2.c = (short) 220;
                    m8Var2.setOutsideTouchable(true);
                    m8Var2.setClippingEnabled(true);
                    m8Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    m8Var2.setFocusable(true);
                    hd2Var2.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                    m8Var2.setInputMethodMode(2);
                    m8Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(m8Var2);
                    f3 = f;
                    f4 = f2;
                    while (view3 != null && view3 != getFragmentView()) {
                        f3 += view3.getX();
                        f4 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (gm.O1() && (view2 = this.parentLayout.getView()) != null) {
                        f3 += view2.getX() + view2.getPaddingLeft();
                        f4 += view2.getY() + view2.getPaddingTop();
                    }
                    m8Var2.showAtLocation(getFragmentView(), 0, (int) (f3 - (hd2Var2.getMeasuredWidth() / 2.0f)), (int) f4);
                    m8Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final void j4(boolean z) {
        int i = z ? 8 : 0;
        this.a.setVisibility(i);
        this.b.setVisibility(z ? 0 : 8);
        this.U0.getSearchContainer().setVisibility(z ? 0 : 8);
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.setActive(!z);
        }
        this.actionBar.B(z);
        this.Y.setVisibility(i);
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.setVisibility(i);
        }
        this.f.setVisibility(i);
        this.r.setVisibility(i);
        zja zjaVar = this.T0;
        if (zjaVar != null) {
            zjaVar.setAlpha(1.0f);
            this.T0.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        bp8 bp8Var2 = this.v0;
        if (bp8Var2 != null) {
            bp8Var2.setAlpha(1.0f);
        }
        xs8 xs8Var2 = this.w0;
        if (xs8Var2 != null) {
            xs8Var2.setAlpha(1.0f);
        }
        this.f.setAlpha(1.0f);
        this.r.setAlpha(this.c6 ? 0.0f : 1.0f);
        this.U0.setAlpha(1.0f);
        this.a.setAlpha(1.0f);
        this.b.setAlpha(1.0f);
        this.P.setAlpha(1.0f);
        if (z) {
            this.b.setEmptyView(this.P);
        } else {
            this.P.setVisibility(8);
        }
    }

    public final float k2(int i) {
        View subtitleTextView;
        lka lkaVar;
        f02 f02Var = this.r5;
        if (f02Var == null || (f02Var instanceof yv1) || f02Var.p() == null) {
            return 1.0f;
        }
        z82 p = this.r5.p();
        if (i == 0) {
            subtitleTextView = p.getTitleTextView();
            lkaVar = this.f;
        } else {
            subtitleTextView = p.getSubtitleTextView();
            lkaVar = this.r;
        }
        float textSize = lkaVar.getPaint().getTextSize();
        if (!(subtitleTextView instanceof lka) || textSize <= 0.0f) {
            return 1.0f;
        }
        return ((lka) subtitleTextView).getPaint().getTextSize() / textSize;
    }

    public final void k3() {
        ValueAnimator valueAnimator;
        if (!this.q2 || (valueAnimator = this.k2) == null || !valueAnimator.isRunning()) {
            l3(E1(), org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0));
        } else {
            this.f2 = this.l6;
            this.h2 = this.m6;
        }
    }

    public final void k4() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.k0 == null || (imageView = this.l0) == null) {
            return;
        }
        if (!this.L1 || (chat = this.F2) == null || (chat.flags2 & 2048) == 0) {
            imageView.setTag(null);
            this.l0.setVisibility(8);
            this.k0.setTag(null);
            this.k0.setVisibility(8);
            return;
        }
        imageView.setTag(1);
        this.l0.setVisibility(0);
        this.k0.setTag(1);
        this.k0.setVisibility(0);
    }

    public final float l2(float f, int i, View view) {
        float left;
        int paddingLeft;
        f02 f02Var = this.r5;
        if (f02Var != null && !(f02Var instanceof yv1) && this.fragmentView != null && (view.getParent() instanceof View)) {
            z82 p = this.r5.p();
            org.telegram.ui.ActionBar.a actionBar = ((org.telegram.ui.ActionBar.d) this.r5).getActionBar();
            View view2 = null;
            if (i == 0) {
                if (p != null) {
                    view2 = p.getTitleTextView();
                }
            } else if (i == 1) {
                if (p != null) {
                    view2 = p.getSubtitleTextView();
                }
            } else if (actionBar != null) {
                view2 = actionBar.getBackButton();
            }
            if (view2 != null) {
                nk3 nk3Var = this.q5;
                View B = (nk3Var == null || nk3Var.getFragmentView() == null) ? this.r5.B() : this.q5.getFragmentView();
                RectF rectF = this.q6;
                if (zgc.c(view2, B, rectF)) {
                    float f2 = rectF.left;
                    if (zgc.c((View) view.getParent(), this.fragmentView, rectF)) {
                        if (i == 2) {
                            left = rectF.left;
                            paddingLeft = view.getLeft();
                        } else {
                            f2 += view2.getPaddingLeft();
                            left = rectF.left + view.getLeft();
                            paddingLeft = view.getPaddingLeft();
                        }
                        return f2 - (left + paddingLeft);
                    }
                }
            }
        }
        return f;
    }

    public final void l3(float f, float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - e2()) / ((this.a.getMeasuredWidth() - f2) - f2())));
        float N = ((gm.N(8.0f) + (gm.L(42.0f) * ((this.Q1 >= ((float) e2()) || max >= 0.33f) ? gm.R1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : b10.y(f, 72.0f, 24.0f, 42.0f)))) * f) + ((float) Math.floor(this.actionBar.getTranslationY() + (hg9.u(f, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? gm.m : 0) - (gm.p * 21.0f))));
        this.f2 = (gm.L(7.0f) * f) + gm.L(1.3f) + N;
        this.h2 = (((float) Math.floor(gm.p * 11.0f)) * f) + N + gm.L(24.0f);
    }

    public final void l4(boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        if ((this.v0 == null && this.w0 == null) || (aVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f = aVar.getOccupyStatusBar() ? gm.m : 0.0f;
        int L = gm.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            float z2 = aq1.z(this.actionBar.getHeight(), f, 2.0f, f);
            boolean z3 = Math.abs(right - bp8Var.g0) > 0.1f || Math.abs(menuPillLeft - bp8Var.h0) > 0.1f || Math.abs(z2 - bp8Var.i0) > 0.1f;
            bp8Var.g0 = right;
            bp8Var.h0 = menuPillLeft;
            if (z) {
                bp8Var.n0.e(true, menuPillLeft);
            }
            bp8Var.i0 = z2;
            if (z3) {
                bp8Var.invalidate();
            }
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            float z4 = aq1.z(this.actionBar.getHeight(), f, 2.0f, f);
            int f2 = f2();
            boolean z5 = Math.abs(right - xs8Var.r) > 0.1f || Math.abs(menuPillLeft - xs8Var.s) > 0.1f || Math.abs(z4 - xs8Var.w) > 0.1f;
            xs8Var.r = right;
            xs8Var.s = menuPillLeft;
            if (z) {
                xs8Var.E.e(true, menuPillLeft);
            }
            xs8Var.w = z4;
            xs8Var.y = f2 + z4;
            if (z5) {
                xs8Var.invalidate();
            }
        }
    }

    public final float m2() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * gm.L(22.0f);
    }

    public final void m3() {
        po8 po8Var = this.a;
        if (po8Var == null || this.c == null || po8Var.getChildCount() <= 0 || this.y6) {
            return;
        }
        View view = null;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = -1;
        for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
            int R = RecyclerView.R(this.a.getChildAt(i3));
            View childAt = this.a.getChildAt(i3);
            if (R != -1 && childAt.getTop() < i) {
                i = childAt.getTop();
                i2 = R;
                view = childAt;
            }
        }
        if (view != null) {
            this.w6 = i2;
            int top = view.getTop();
            this.x6 = top;
            if (this.w6 == 0 && !this.p2 && top > e2()) {
                this.x6 = e2();
            }
            this.c.g1(i2, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void m4() {
        try {
            sb sbVar = this.U;
            if (sbVar != null && (sbVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(on2.p(cmb.v0(cmb.c6, this.A0), 100));
            }
            float f = this.b6;
            Drawable drawable = this.E;
            int[] iArr = this.d7;
            if (drawable != null) {
                int R0 = gm.R0(f, 1.0f, cmb.v0(cmb.pi, this.A0), cmb.v0(cmb.Ej, this.A0));
                int i = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (R0 != i) {
                    drawable.setColorFilter(new PorterDuffColorFilter(R0, mode));
                }
                iArr[6] = R0;
            }
            Drawable drawable2 = this.Z6;
            if (drawable2 != null) {
                int v0 = cmb.v0(cmb.U6, this.A0);
                int i2 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (v0 != i2) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(v0, mode2));
                }
                iArr[3] = v0;
            }
            Drawable drawable3 = this.a7;
            if (drawable3 != null) {
                int v02 = cmb.v0(cmb.u8, this.A0);
                int i3 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (v02 != i3) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(v02, mode3));
                }
                iArr[4] = v02;
            }
            Drawable drawable4 = this.b7;
            if (drawable4 != null) {
                int v03 = cmb.v0(cmb.E8, this.A0);
                int i4 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (v03 != i4) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(v03, mode4));
                }
                iArr[5] = v03;
            }
            pn2 pn2Var = this.c7;
            if (pn2Var != null) {
                pn2Var.y = cmb.v0(cmb.mk, this.A0);
                if (this.a != null) {
                    for (int i5 = 0; i5 < this.a.getChildCount(); i5++) {
                        View childAt = this.a.getChildAt(i5);
                        if (childAt != null) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final int n2() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !sd2.c0(getMessagesController().L0(Long.valueOf(this.f1)))) {
            return gm.L(50.0f);
        }
        return gm.L(P2() ? 24.0f : 38.0f);
    }

    public final void n3(boolean z) {
        int i = this.S4;
        if (i >= 0) {
            if (!z) {
                this.c.g1(i, -this.a.getPaddingTop());
                return;
            }
            w46 w46Var = new w46(getParentActivity(), 2, 0.6f);
            w46Var.a = this.S4;
            w46Var.p = -this.a.getPaddingTop();
            this.c.v0(w46Var);
        }
    }

    public final void n4() {
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        gm.T3(this.Y0, this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && sd2.y(13, this.F2) && this.v2.ttl_period > 0)), 0.8f, true, this.w5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final x43 o2() {
        x43 x43Var = this.J;
        if (x43Var != null) {
            return x43Var;
        }
        this.y = cmb.P1.getConstantState().newDrawable().mutate();
        this.I = cmb.Q1.getConstantState().newDrawable().mutate();
        ec7 ec7Var = this.s6;
        if (ec7Var != null) {
            boolean o = ec7Var.o(cmb.I.o());
            ec7 ec7Var2 = this.s6;
            int a = cmb.a(0.1f, cmb.I.o() ? -0.1f : -0.08f, o ? ec7Var2.k() : ec7Var2.i());
            Drawable drawable = this.y;
            int R0 = gm.R0(this.b6, 1.0f, a, cmb.v0(cmb.Ej, this.A0));
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(R0, mode);
            this.I.setColorFilter(gm.R0(this.b6, 1.0f, -1, cmb.v0(cmb.c6, this.A0)), mode);
        }
        x43 x43Var2 = new x43(new sn2(this.y, this.I), getParentActivity().getDrawable(R.drawable.verified_profile));
        this.J = x43Var2;
        return x43Var2;
    }

    public final ValueAnimator o3(final boolean z) {
        if (z) {
            gm.V2(getParentActivity(), this.classGuid);
            gm.g3(getParentActivity(), this.classGuid);
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W1.cancel();
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.setActive(!z);
        }
        byte b = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, z ? 0.0f : 1.0f);
        final float f = this.Q1;
        this.b.setTranslationY(f);
        this.b.setVisibility(0);
        this.U0.setVisibility(0);
        this.a.setVisibility(0);
        Q2(true);
        this.Y.setVisibility(0);
        this.f.setVisibility(0);
        this.r.setVisibility(0);
        this.actionBar.B(this.V1 > 0.5f);
        int i = this.V1 > 0.5f ? 0 : 8;
        zja zjaVar = this.T0;
        if (zjaVar != null) {
            zjaVar.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.U0.getSearchContainer().setVisibility(this.V1 <= 0.5f ? 0 : 8);
        this.b.setEmptyView(this.P);
        this.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mo8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RectF rectF = ProfileActivity.e7;
                ProfileActivity.this.K2(ofFloat, f, z);
            }
        });
        ofFloat.addListener(new mp8(this, z, b));
        if (!z) {
            this.d5 = true;
            m3();
            gm.U2(getParentActivity(), this.classGuid);
            this.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(d53.f);
        this.W1 = ofFloat;
        return ofFloat;
    }

    public final void o4(boolean z) {
        boolean z2;
        TLRPC.ChatFull chatFull;
        float E1 = E1();
        this.i6 = E1 > 0.2f && !this.X1 && (this.r0 == null || this.P2 == -1);
        K1();
        s09 s09Var = this.s;
        if (s09Var == null || s09Var.getVisibility() == 8) {
            z2 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) + this.Q1) + this.U1) - gm.L(29.5f));
            z2 = E1 > 0.2f && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1);
            if (z2 && this.f1 != 0) {
                z2 = (!sd2.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0 || (this.E3 == -1 && this.F3 == -1)) ? false : true;
            }
            if (!this.G1) {
                if (z2 != (this.s.getTag() == null)) {
                    s09 s09Var2 = this.s;
                    if (z2) {
                        s09Var2.setTag(null);
                    } else {
                        s09Var2.setTag(0);
                    }
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        this.w = null;
                        animatorSet.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.w = animatorSet2;
                        byte b = 3;
                        if (z2) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new cp8(this, b));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z2 ? 1.0f : 0.2f);
                        this.s.setScaleY(z2 ? 1.0f : 0.2f);
                        this.s.setAlpha(z2 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - gm.L(40.0f);
            int i = this.actionBar.getOccupyStatusBar() ? gm.m : 0;
            bp8Var.j0 = measuredWidth;
            bp8Var.l0 = z2;
            bp8Var.k0 = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i;
            bp8Var.invalidate();
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.setExpandCoords(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0) + this.Q1 + this.U1);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        kfa kfaVar;
        if (super.onBackPressed(z)) {
            wp8 wp8Var = this.O;
            if (wp8Var == null || (kfaVar = wp8Var.L0) == null || !kfaVar.o0) {
                if (this.S4 == -1 || wp8Var == null || !wp8Var.F1) {
                    return this.actionBar.isEnabled();
                }
                if (z) {
                    wp8Var.E(true);
                }
            } else if (z) {
                I3();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.z6 = false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        q4();
        this.z6 = true;
        O1();
        if (!this.J0 || this.w5 || (view = this.fragmentView) == null) {
            return;
        }
        this.w5 = true;
        this.d5 = true;
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        View m;
        super.onConfigurationChanged(configuration);
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.onConfigurationChanged(configuration);
        }
        q2();
        if (this.o2 && this.q2 && (m = this.c.m(0)) != null) {
            this.a.scrollBy(0, m.getTop() - e2());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0535, code lost:
    
        if (((lka) r0.getSubtitleTextView()).getLeftDrawable() != null) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x086f  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        org.telegram.ui.ActionBar.a aVar;
        r7 r7Var;
        cr8 cr8Var;
        r7 r7Var2;
        Object obj;
        r6 r6Var;
        r7 j;
        String str;
        long j2;
        float f;
        float f2;
        float f3;
        boolean z2;
        TLRPC.Chat chat;
        nk3 nk3Var;
        dj3 dj3Var;
        if (!this.J0) {
            i4();
            if (this.J1 != 0 && this.M1 && !this.q2 && !this.N1) {
                ImageView imageView = this.j0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.i0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.l0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.l0.setScaleX(1.0f);
                    this.l0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.k0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.k0.setScaleX(1.0f);
                    this.k0.setScaleY(1.0f);
                }
                this.q5 = null;
                tk5 tk5Var = this.parentLayout;
                byte b = 2;
                if (tk5Var != null && tk5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof f02) {
                        this.r5 = (f02) obj2;
                    }
                    if (obj2 instanceof bj6) {
                        obj2 = ((bj6) obj2).J;
                    }
                    if ((obj2 instanceof nk3) && (dj3Var = (nk3Var = (nk3) obj2).H3) != null) {
                        kj3 kj3Var = dj3Var.a;
                        if (wi8.A(kj3Var)) {
                            this.q5 = nk3Var;
                            this.r5 = kj3Var;
                        }
                    }
                }
                Object obj3 = this.r5;
                if (obj3 == null || ((org.telegram.ui.ActionBar.d) obj3).getActionBar() == null) {
                    aVar = null;
                } else {
                    aVar = ((org.telegram.ui.ActionBar.d) this.r5).getActionBar();
                    aVar.setSkipDrawChild(true);
                }
                f02 f02Var = this.r5;
                boolean z3 = (f02Var instanceof yv1) && ((yv1) f02Var).e != null;
                if (f02Var != null) {
                    ImageView imageView5 = this.j0;
                    if (imageView5 != null) {
                        if (!(f02Var instanceof yv1) || (chat = ((yv1) f02Var).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.j0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.j0.setVisibility(0);
                        }
                    }
                    if (this.m0 != null) {
                        f02 f02Var2 = this.r5;
                        if ((f02Var2 instanceof yv1) && sd2.p0(((yv1) f02Var2).e)) {
                            this.i0.setTag(null);
                            this.i0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.E2;
                            if (encryptedChat != null) {
                                this.m0.b(encryptedChat.ttl);
                                this.i0.setTag(1);
                                this.i0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.w2;
                                if (userFull != null) {
                                    this.m0.b(userFull.ttl_period);
                                    if (!this.K1 || this.w2.ttl_period == 0) {
                                        this.i0.setTag(null);
                                        this.i0.setVisibility(8);
                                    } else {
                                        this.i0.setTag(1);
                                        this.i0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.v2;
                                    if (chatFull != null) {
                                        this.m0.b(chatFull.ttl_period);
                                        if (!this.K1 || this.v2.ttl_period == 0) {
                                            this.i0.setTag(null);
                                            this.i0.setVisibility(8);
                                        } else {
                                            this.i0.setTag(1);
                                            this.i0.setVisibility(0);
                                        }
                                    } else {
                                        this.i0.setTag(null);
                                        this.i0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    k4();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z) {
                    this.p6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    r7Var = null;
                    layoutParams.rightMargin = (int) ((gm.p * (-21.0f)) + gm.L(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
                        j2 = 0;
                        int ceil = (int) Math.ceil((gm.p * 21.0f) + (gm.q.x - gm.L(117.0f)));
                        float measureText = (this.f.getPaint().measureText(this.f.getText().toString()) * 1.12f) + this.f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        if (ceil < measureText) {
                            f = 1.0f;
                            str = "avatarAnimationProgress";
                            layoutParams2.width = (int) Math.ceil(r3 / 1.12f);
                        } else {
                            f = 1.0f;
                            str = "avatarAnimationProgress";
                            layoutParams2.width = -2;
                        }
                        this.f.setLayoutParams(layoutParams2);
                        this.S1 = e2();
                    } else {
                        str = "avatarAnimationProgress";
                        j2 = 0;
                        f = 1.0f;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        layoutParams3.width = (int) ((gm.q.x - gm.L(32.0f)) / 1.38f);
                        this.f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, str, 0.0f, 1.0f));
                    s09 s09Var = this.s;
                    if (s09Var != null && s09Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_X, f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_Y, f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.ALPHA, f));
                    }
                    bp8 bp8Var = this.v0;
                    if (bp8Var != null && this.J1 == 2) {
                        bp8Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<bp8, Float>) View.ALPHA, f));
                    }
                    if (this.J1 == 2) {
                        this.s0 = Z1(this.f0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.G(1090519039, false);
                        vq8 vq8Var = this.K6;
                        if (vq8Var != null) {
                            vq8Var.a(603979775);
                        }
                        mq8 mq8Var = this.N;
                        mq8Var.F = true;
                        mq8Var.setVisibility(0);
                    }
                    byte b2 = this.J1;
                    mt1 mt1Var = this.f;
                    if (b2 == 2) {
                        mt1Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<mt1, Float>) View.ALPHA, f));
                    } else {
                        mt1Var.setAlpha(f);
                    }
                    if (this.v0 != null) {
                        long a = a();
                        bp8 bp8Var2 = this.v0;
                        if (a > j2) {
                            bp8Var2.setAlpha(0.0f);
                            f2 = 1.0f;
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<bp8, Float>) View.ALPHA, 1.0f));
                        } else {
                            f2 = 1.0f;
                            bp8Var2.setAlpha(1.0f);
                            this.v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, "fragmentTransitionProgress", 1.0f));
                        }
                    } else {
                        f2 = 1.0f;
                    }
                    xs8 xs8Var = this.w0;
                    if (xs8Var != null) {
                        xs8Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.w0, (Property<xs8, Float>) View.ALPHA, f2));
                    }
                    if (this.i0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_X, 0.85f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_Y, 0.85f, 0.0f));
                    }
                    if (this.j0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.l0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.l0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.l0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.l0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.k0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.M0 && (this.f1 != j2 || z3)) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<zja, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<zja, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<zja, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        f3 = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    } else {
                        f3 = 1.0f;
                    }
                    yo8 yo8Var = this.f0;
                    if (yo8Var != null) {
                        yo8Var.setCrossfadeProgress(f3);
                        arrayList.add(ObjectAnimator.ofFloat(this.f0, xp8.h0, 0.0f));
                    }
                    f02 f02Var3 = this.r5;
                    if (f02Var3 != null) {
                        z82 p = f02Var3.p();
                        if (p != null) {
                            v82 v82Var = p.e;
                            nk3 nk3Var2 = this.q5;
                            View B = (nk3Var2 == null || nk3Var2.getFragmentView() == null) ? this.r5.B() : this.q5.getFragmentView();
                            RectF rectF = this.q6;
                            this.p6 = zgc.c(v82Var, B, rectF) ? rectF.left : 0.0f;
                            if (p.getSubtitleTextView() instanceof lka) {
                            }
                        }
                        if (!p.T[0] && !t2(p)) {
                            z2 = false;
                            setAvatarAnimationProgress(0.0f);
                        }
                        View subtitleTextView = p.getSubtitleTextView();
                        this.f5 = subtitleTextView;
                        this.g5 = ((this.r5 instanceof yv1) || subtitleTextView == null) ? 0.0f : this.r.getPaddingLeft() - this.f5.getPaddingLeft();
                        this.Z.invalidate();
                        this.r.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<ap8, Float>) View.ALPHA, 1.0f));
                        z2 = true;
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        byte b3 = this.J1;
                        ap8 ap8Var = this.r;
                        if (b3 == 2) {
                            ap8Var.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<ap8, Float>) View.ALPHA, 1.0f));
                        } else {
                            ap8Var.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    r7Var = null;
                    this.S1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    s09 s09Var2 = this.s;
                    if (s09Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(s09Var2, (Property<s09, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<s09, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<mt1, Float>) View.ALPHA, 0.0f));
                    }
                    bp8 bp8Var3 = this.v0;
                    if (bp8Var3 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(bp8Var3, (Property<bp8, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(bp8Var3, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    xs8 xs8Var2 = this.w0;
                    if (xs8Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(xs8Var2, (Property<xs8, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.i0.getTag() != null) {
                        this.i0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.j0.getTag() != null) {
                        this.j0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.l0.getTag() != null) {
                        this.l0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.l0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.l0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.l0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.k0.getTag() != null) {
                        this.k0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.M0 && (this.f1 != 0 || z3)) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<zja, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<zja, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<zja, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    yo8 yo8Var2 = this.f0;
                    if (yo8Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(yo8Var2, xp8.h0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.d dVar = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (dVar instanceof yv1) {
                        yv1 yv1Var = (yv1) dVar;
                        pr1 pr1Var = yv1Var.p1;
                        gm.K(pr1Var, new ak8((Object) this, (Object) pr1Var, (Object) yv1Var, (byte) 3));
                        View subtitleTextView2 = pr1Var.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof lka) && ((lka) subtitleTextView2).getLeftDrawable() != null) || pr1Var.T[0]) {
                            this.f5 = pr1Var.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<ap8, Float>) View.ALPHA, 0.0f));
                            animatorSet.playTogether(arrayList2);
                            cr8Var = this.L6;
                            if (cr8Var != null) {
                                cr8Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(d53.h).start();
                            }
                        }
                        if (this.J1 == 2) {
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<ap8, Float>) View.ALPHA, 0.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        cr8Var = this.L6;
                        if (cr8Var != null) {
                        }
                    } else {
                        f02 f02Var4 = this.r5;
                        if (f02Var4 != null && f02Var4.p() != null) {
                            z82 p2 = this.r5.p();
                            gm.K(p2, new mn8(this, p2, (byte) 7));
                            if (t2(p2)) {
                                View subtitleTextView3 = p2.getSubtitleTextView();
                                this.f5 = subtitleTextView3;
                                this.g5 = ((this.r5 instanceof yv1) || subtitleTextView3 == null) ? 0.0f : this.r.getPaddingLeft() - this.f5.getPaddingLeft();
                                this.Z.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<ap8, Float>) View.ALPHA, 0.0f));
                                animatorSet.playTogether(arrayList2);
                                cr8Var = this.L6;
                                if (cr8Var != null) {
                                }
                            }
                        }
                        if (this.J1 == 2) {
                        }
                        animatorSet.playTogether(arrayList2);
                        cr8Var = this.L6;
                        if (cr8Var != null) {
                        }
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bo8(this, b));
                animatorSet.playTogether(ofFloat);
                if (this.P0 == null || (obj = this.r5) == null || (r6Var = ((org.telegram.ui.ActionBar.d) obj).getActionBar().F) == null || (j = r6Var.j(32)) == null || j.getVisibility() != 0) {
                    r7Var2 = r7Var;
                } else {
                    j.setAlpha(0.0f);
                    if (z) {
                        this.P0.setVisibility(0);
                    }
                    this.P0.setTag(j);
                    r7Var2 = j;
                }
                animatorSet.addListener(new rb2((Object) this, (Object) aVar, (View) r7Var2, (Object) runnable, (byte) 3));
                animatorSet.setInterpolator(this.J1 == 2 ? d53.f : new DecelerateInterpolator());
                gm.d3(new pu(animatorSet, (byte) 1), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        po8 po8Var = this.a;
        if (po8Var != null) {
            po8Var.h1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x046f  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e;
        fha fhaVar;
        lq8 lq8Var;
        this.e1 = this.arguments.getLong("user_id", 0L);
        this.f1 = this.arguments.getLong("chat_id", 0L);
        this.g1 = this.arguments.getLong("topic_id", 0L);
        this.h1 = this.arguments.getBoolean("saved", false);
        this.r1 = this.arguments.getBoolean("similar", false);
        this.q1 = this.g1 != 0;
        this.E1 = this.arguments.getLong("ban_chat_id", 0L);
        this.j5 = this.arguments.getInt("report_reaction_message_id", 0);
        this.k5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.m5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.n5 = r58.h(this.arguments.getString("vcard_phone"), false);
        this.o5 = this.arguments.getString("vcard_first_name");
        this.p5 = this.arguments.getString("vcard_last_name");
        this.l1 = this.arguments.getBoolean("reportSpam", false);
        this.s1 = this.arguments.getBoolean("my_profile", false);
        this.t1 = this.arguments.getBoolean("open_gifts", false);
        this.v1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.u1 = this.arguments.getInt("open_gifts_collection", 0);
        this.x1 = this.arguments.getBoolean("open_common", false);
        this.y1 = this.arguments.getInt("open_story_album_id", -1);
        this.J0 = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.n1) {
            boolean z = this.arguments.getBoolean("expandPhoto", false);
            this.n1 = z;
            if (z) {
                this.l2 = 1.0f;
                this.o1 = true;
            }
        }
        if (this.e1 == 0) {
            if (this.f1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                this.F2 = L0;
                if (L0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new mn8(this, countDownLatch, (byte) 8));
                    try {
                        countDownLatch.await();
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    if (this.F2 != null) {
                        getMessagesController().V3(this.F2, true);
                    }
                }
                s34 s34Var = this.Y1;
                if (s34Var != null) {
                    s34Var.i();
                }
                if (this.F2.megagroup) {
                    b2(true);
                } else {
                    this.C1 = null;
                }
                getNotificationCenter().b(this, nm7.T);
                getNotificationCenter().b(this, nm7.g1);
                getNotificationCenter().b(this, nm7.w2);
                getNotificationCenter().b(this, nm7.b1);
                getNotificationCenter().b(this, nm7.r3);
                nm7.e().b(this, nm7.F5);
                this.D2 = new ArrayList();
                f4(true);
                if (this.v2 == null) {
                    this.v2 = getMessagesController().M0(this.f1);
                }
                if (sd2.T(this.F2)) {
                    getMessagesController().a3(this.classGuid, this.f1, true);
                } else if (this.v2 == null) {
                    this.v2 = getMessagesStorage().C0(this.f1, false, null, false, false, 0);
                }
                S3();
                e = getUserConfig().e();
                if (this.e1 != e) {
                }
                this.s1 = true;
                fhaVar = this.R;
                if (fhaVar != null) {
                    fhaVar.b(this);
                    this.R = null;
                    fhaVar = null;
                }
                if (fhaVar == null) {
                }
                fhaVar.y.add(this);
                getNotificationCenter().b(this, 2);
                getNotificationCenter().b(this, 1);
                getNotificationCenter().b(this, nm7.s);
                getNotificationCenter().b(this, nm7.u);
                getNotificationCenter().b(this, nm7.u5);
                getNotificationCenter().b(this, nm7.D1);
                getNotificationCenter().b(this, nm7.c0);
                getNotificationCenter().b(this, nm7.z5);
                getNotificationCenter().b(this, nm7.J5);
                getNotificationCenter().b(this, nm7.k3);
                getNotificationCenter().b(this, nm7.j5);
                getNotificationCenter().b(this, nm7.A3);
                getNotificationCenter().b(this, nm7.E3);
                getNotificationCenter().b(this, nm7.c4);
                if (r2()) {
                }
                getNotificationCenter().b(this, nm7.F3);
                getNotificationCenter().b(this, nm7.y1);
                getNotificationCenter().b(this, nm7.h3);
                getNotificationCenter().b(this, nm7.I3);
                getNotificationCenter().b(this, nm7.Y3);
                getNotificationCenter().b(this, nm7.Z3);
                nm7.e().b(this, nm7.m4);
                i4();
                lq8Var = this.d;
                if (lq8Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new eo8(this, (byte) 5));
                }
                setBulletinDelegate(new s20(this, (byte) 16));
                if (this.e1 != 0) {
                    getMessagesController().Q0(null);
                }
                q3();
                this.S6 = !this.J0 ? gm.L(72.0f) : 0;
                this.T6 = this.J0 ? gm.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j;
        if (j != 0) {
            this.E2 = getMessagesController().Z0(Integer.valueOf((int) (this.i1 & 4294967295L)));
        }
        s34 s34Var2 = this.Y1;
        if (s34Var2 != null) {
            s34Var2.i();
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 != null) {
            getNotificationCenter().b(this, nm7.N);
            getNotificationCenter().b(this, nm7.s1);
            getNotificationCenter().b(this, nm7.a0);
            getNotificationCenter().b(this, nm7.Y);
            getNotificationCenter().b(this, nm7.g0);
            getNotificationCenter().b(this, nm7.D0);
            getNotificationCenter().b(this, nm7.E0);
            getNotificationCenter().b(this, nm7.k0);
            nm7.e().b(this, nm7.B4);
            this.k1 = getMessagesController().x0.indexOfKey(this.e1) >= 0;
            if (W1.bot) {
                this.s2 = true;
                hs6 mediaDataController = getMediaDataController();
                long j2 = W1.id;
                mediaDataController.I0(j2, j2, true, this.classGuid, null);
            }
            this.w2 = getMessagesController().X1(this.e1);
            getMessagesController().b3(getMessagesController().W1(Long.valueOf(this.e1)), this.classGuid, true, null);
            this.C1 = null;
            if (m9c.D(W1)) {
                wn5 wn5Var = new wn5(0, true, true);
                this.r0 = wn5Var;
                wn5Var.I = true;
                wn5Var.a = this;
                wn5Var.b = this;
                getMediaDataController().z();
                getMessagesController().h3();
                getMessagesController().k3(this.classGuid, getUserConfig().f(), true);
            }
            this.h5 = this.arguments.getInt("actionBarColor", 0);
            e = getUserConfig().e();
            if ((this.e1 != e || this.i1 == e) && !this.s1) {
                this.s1 = true;
            }
            fhaVar = this.R;
            if (fhaVar != null && fhaVar.s != this.g1) {
                fhaVar.b(this);
                this.R = null;
                fhaVar = null;
            }
            if (fhaVar == null) {
                fhaVar = new fha(this);
                this.R = fhaVar;
            }
            fhaVar.y.add(this);
            getNotificationCenter().b(this, 2);
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, nm7.s);
            getNotificationCenter().b(this, nm7.u);
            getNotificationCenter().b(this, nm7.u5);
            getNotificationCenter().b(this, nm7.D1);
            getNotificationCenter().b(this, nm7.c0);
            getNotificationCenter().b(this, nm7.z5);
            getNotificationCenter().b(this, nm7.J5);
            getNotificationCenter().b(this, nm7.k3);
            getNotificationCenter().b(this, nm7.j5);
            getNotificationCenter().b(this, nm7.A3);
            getNotificationCenter().b(this, nm7.E3);
            getNotificationCenter().b(this, nm7.c4);
            if (r2()) {
                mc B0 = getMessagesController().B0();
                B0.g();
                B0.h();
            }
            getNotificationCenter().b(this, nm7.F3);
            getNotificationCenter().b(this, nm7.y1);
            getNotificationCenter().b(this, nm7.h3);
            getNotificationCenter().b(this, nm7.I3);
            getNotificationCenter().b(this, nm7.Y3);
            getNotificationCenter().b(this, nm7.Z3);
            nm7.e().b(this, nm7.m4);
            i4();
            lq8Var = this.d;
            if (lq8Var != null) {
                lq8Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().p0(this.e1, 0, null);
            }
            if (this.e1 != 0 && m9c.D(getMessagesController().W1(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new eo8(this, (byte) 5));
            }
            setBulletinDelegate(new s20(this, (byte) 16));
            if (this.e1 != 0 && m9c.D(getMessagesController().W1(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().Q0(null);
            }
            q3();
            this.S6 = !this.J0 ? gm.L(72.0f) : 0;
            this.T6 = this.J0 ? gm.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.L0();
        }
        fha fhaVar = this.R;
        if (fhaVar != null) {
            fhaVar.b(this);
        }
        fha fhaVar2 = this.R;
        if (fhaVar2 != null) {
            fhaVar2.y.remove(this);
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.s);
        getNotificationCenter().n(this, nm7.u);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, nm7.u5);
        getNotificationCenter().n(this, nm7.D1);
        getNotificationCenter().n(this, nm7.c0);
        getNotificationCenter().n(this, nm7.z5);
        getNotificationCenter().n(this, nm7.J5);
        getNotificationCenter().n(this, nm7.k3);
        getNotificationCenter().n(this, nm7.j5);
        getNotificationCenter().n(this, nm7.A3);
        getNotificationCenter().n(this, nm7.E3);
        getNotificationCenter().n(this, nm7.c4);
        getNotificationCenter().n(this, nm7.F3);
        getNotificationCenter().n(this, nm7.y1);
        getNotificationCenter().n(this, nm7.h3);
        getNotificationCenter().n(this, nm7.I3);
        getNotificationCenter().n(this, nm7.Y3);
        getNotificationCenter().n(this, nm7.Z3);
        nm7.e().n(this, nm7.m4);
        zo8 zo8Var = this.o0;
        if (zo8Var != null) {
            zo8Var.K();
        }
        lr8 lr8Var = this.n0;
        if (lr8Var != null) {
            lr8Var.c();
        }
        this.k6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, nm7.s1);
            getNotificationCenter().n(this, nm7.N);
            getNotificationCenter().n(this, nm7.a0);
            getNotificationCenter().n(this, nm7.Y);
            getNotificationCenter().n(this, nm7.g0);
            getNotificationCenter().n(this, nm7.D0);
            getNotificationCenter().n(this, nm7.E0);
            getNotificationCenter().n(this, nm7.k0);
            nm7.e().n(this, nm7.B4);
            getMessagesController().h1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            nm7.e().n(this, nm7.F5);
            getNotificationCenter().n(this, nm7.r3);
            getNotificationCenter().n(this, nm7.T);
            getNotificationCenter().n(this, nm7.g1);
            getNotificationCenter().n(this, nm7.w2);
            getNotificationCenter().n(this, nm7.b1);
        }
        yo8 yo8Var = this.f0;
        if (yo8Var != null) {
            yo8Var.setImageDrawable(null);
        }
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.c();
        }
        dp8 dp8Var = this.e5;
        if (dp8Var != null) {
            dp8Var.b();
        }
        zq8 zq8Var = this.z2;
        if (zq8Var != null && this.y2) {
            zq8Var.b(true);
            this.z2 = null;
        }
        i71 i71Var = this.I5;
        if (i71Var != null) {
            this.I5 = null;
            gm.c3(i71Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        vfa vfaVar;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.i();
        }
        s34 s34Var = this.Y1;
        if (s34Var != null) {
            s34Var.g();
        }
        wp8 wp8Var = this.O;
        if (wp8Var == null || (vfaVar = wp8Var.W) == null) {
            return;
        }
        vfaVar.e = false;
        if (vfaVar.c != null) {
            vfaVar.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2;
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.j(i, strArr, iArr);
        }
        if (i != 101 && i != 102) {
            if (i != 103 || this.F2 == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    z2 = true;
                    break;
                } else {
                    if (iArr[i2] != 0) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
            }
            if (iArr.length <= 0 || !z2) {
                sic.h(getParentActivity(), null, i);
                return;
            } else {
                sic.l(this.F2, null, getMessagesController().f1(this.f1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= iArr.length) {
                z = true;
                break;
            } else {
                if (iArr[i3] != 0) {
                    z = false;
                    break;
                }
                i3++;
            }
        }
        if (iArr.length <= 0 || !z) {
            sic.h(getParentActivity(), null, i);
            return;
        }
        boolean z3 = i == 102;
        TLRPC.UserFull userFull = this.w2;
        sic.m(W1, z3, userFull != null && userFull.video_calls_available, getParentActivity(), this.w2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        TLRPC.User W1;
        sb sbVar;
        super.onResume();
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.e1 = true;
            ufa ufaVar = wp8Var.K;
            if (ufaVar != null) {
                ufaVar.f();
            }
            aha ahaVar = wp8Var.N;
            if (ahaVar != null) {
                ahaVar.f();
            }
            bha bhaVar = wp8Var.M;
            if (bhaVar != null) {
                bhaVar.X(false);
            }
            for (int i = 0; i < wp8Var.n0.length; i++) {
                wp8Var.N(i);
            }
            vfa vfaVar = wp8Var.W;
            if (vfaVar != null) {
                vfaVar.e = true;
                if (vfaVar.c != null) {
                    vfaVar.a.onResume();
                }
            }
        }
        q2();
        lq8 lq8Var = this.d;
        if (lq8Var != null) {
            this.c5 = true;
            lq8Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.U) != null && sbVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.k();
            setParentActivityTitle(jb6.M0(2131745229, null));
        }
        h4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 9));
        }
        mt1 mt1Var = this.f;
        if (mt1Var != null) {
            setParentActivityTitle(mt1Var.getText());
        }
        if (this.e1 != 0 && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null && W1.photo == null && this.Q1 >= e2()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            r3(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = e2();
            this.p2 = false;
            this.c.g1(0, e2() - this.a.getPaddingTop());
        }
        s34 s34Var = this.Y1;
        if (s34Var != null) {
            s34Var.a();
        }
        b4();
        Q2(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(cmb.v0(cmb.h6, this.A0));
            J3();
            m4();
            C1();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        rja rjaVar;
        if (z && (rjaVar = this.simpleActionBar) != null) {
            rjaVar.setAlpha(1.0f);
        }
        if (z) {
            if (!z2) {
                byte b = this.J1;
                if (b != 0 && this.M1) {
                    if (b == 1) {
                        this.l2 = 0.0f;
                        ita itaVar = this.T;
                        if (itaVar != null) {
                            itaVar.setParentExpanded(0.0f);
                        }
                        qn8 qn8Var = this.a0;
                        if (qn8Var != null) {
                            qn8Var.setParentExpanded(0.0f);
                        }
                        t3(0.0f);
                        mt8 mt8Var = this.c0;
                        if (mt8Var != null) {
                            mt8Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    H1();
                    if (this.I1) {
                        M1(true);
                    }
                }
                if (!this.w5) {
                    this.w5 = true;
                    this.d5 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.Y4);
            sb sbVar = this.U;
            if (sbVar != null && sbVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        J1();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        sb sbVar = this.U;
        if (sbVar == null || sbVar.getVisibility() != 0) {
            return;
        }
        sb sbVar2 = this.U;
        if (z) {
            sbVar2.setAlpha(1.0f - f);
        } else {
            sbVar2.setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        ImageView imageView;
        qn8 qn8Var;
        super.onTransitionAnimationStart(z, z2);
        this.n6 = z;
        if (z && (qn8Var = this.a0) != null) {
            ArrayList arrayList = qn8Var.a;
            if (qn8Var.F == 6) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    nn8 nn8Var = (nn8) arrayList.get(i);
                    p09 p09Var = nn8Var.k;
                    if (p09Var != null) {
                        if (nn8Var.a == 15) {
                            p09Var.H(14);
                        } else {
                            p09Var.H(0);
                        }
                        nn8Var.k.start();
                    }
                }
            }
        }
        if (!z && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof r7)) {
            ((r7) this.P0.getTag()).setAlpha(1.0f);
        }
        if (z ? !z2 : z2) {
            if (this.J1 != 0 && this.M1 && !this.q2) {
                this.G1 = true;
                if (!z) {
                    float[] fArr = this.k6;
                    if (fArr == null) {
                        fArr = new float[14];
                        this.k6 = fArr;
                    }
                    this.F1 = this.Q1;
                    fArr[0] = this.Y.getScaleX();
                    this.k6[1] = this.Y.getTranslationX();
                    this.k6[2] = this.Y.getTranslationY();
                    qn8 qn8Var2 = this.a0;
                    if (qn8Var2 != null) {
                        this.k6[3] = qn8Var2.getAlpha();
                    }
                    xs8 xs8Var = this.w0;
                    if (xs8Var != null) {
                        float[] fArr2 = this.k6;
                        fArr2[4] = xs8Var.e;
                        fArr2[5] = xs8Var.f;
                    }
                    if (this.K6 != null) {
                        this.k6[6] = r0.getAlpha();
                    }
                    this.k6[7] = this.f.getScaleX();
                    this.k6[8] = this.f.getTranslationY();
                    this.k6[9] = this.r.getTranslationY();
                    this.k6[10] = this.f.getLayoutParams().width;
                    float[] fArr3 = this.k6;
                    fArr3[11] = this.d2;
                    fArr3[12] = this.f.getTranslationX();
                    this.k6[13] = this.r.getTranslationX();
                    hg5 hg5Var = this.M6;
                    if (hg5Var != null) {
                        hg5Var.f(true);
                    }
                }
            }
        }
        if (z) {
            if (this.r0 != null) {
                this.Y4 = getNotificationCenter().p(new int[]{nm7.r, nm7.s, nm7.W, nm7.X, nm7.E0, nm7.v4}, this.Y4, true);
            } else {
                this.Y4 = getNotificationCenter().p(new int[]{nm7.r, nm7.s, nm7.W, nm7.X, nm7.v4}, this.Y4, true);
            }
            if (!z2 && getParentActivity() != null) {
                this.i5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        J1();
    }

    public final boolean p2() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i = 0;
        if (!this.s2 || (userFull = this.w2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
        int size = arrayList.size();
        while (i < size) {
            TLRPC.BotCommand botCommand = arrayList.get(i);
            i++;
            if ("privacy".equals(botCommand.command)) {
                return true;
            }
        }
        return true;
    }

    public final void p4() {
        lea leaVar;
        kfa kfaVar;
        l66 l66Var;
        int v0;
        this.t6.clear();
        xq8 xq8Var = this.d1;
        if (xq8Var != null) {
            xq8Var.a(this.s6, true);
        }
        ap8 ap8Var = this.r;
        if (ap8Var != null) {
            this.r.setTextColor(on2.f(this.l2, B1(ap8Var.getTag() instanceof Integer ? cmb.v0(((Integer) this.r.getTag()).intValue(), this.A0) : cmb.v0(cmb.A8, this.A0), Boolean.valueOf(this.K0[0])), -1275068417));
        }
        vq8 vq8Var = this.K6;
        if (vq8Var != null) {
            vq8Var.a(on2.f(this.l2, cmb.p1(0.5f, cmb.a(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.H(on2.f(this.b6, this.s6 != null ? -1 : cmb.v0(cmb.u8, this.A0), cmb.v0(cmb.x8, this.A0)), false);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            ec7 ec7Var = this.s6;
            aVar2.G(on2.f(this.b6, ec7Var != null ? 1090519039 : ec7Var != null ? 553648127 : cmb.v0(cmb.e8, this.A0), cmb.v0(cmb.y8, this.A0)), false);
        }
        if (this.y != null) {
            ec7 ec7Var2 = this.s6;
            if (ec7Var2 != null) {
                int g = ec7Var2.g();
                boolean o = this.s6.o(cmb.I.o());
                ec7 ec7Var3 = this.s6;
                v0 = cmb.a(0.1f, cmb.I.o() ? -0.1f : -0.08f, on2.f(0.4f, g, o ? ec7Var3.k() : ec7Var3.i()));
            } else {
                v0 = cmb.v0(cmb.pi, this.A0);
            }
            this.y.setColorFilter(gm.R0(this.b6, 1.0f, v0, cmb.v0(cmb.Ej, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            this.I.setColorFilter(gm.R0(this.b6, 1.0f, this.s6 != null ? -1 : cmb.v0(cmb.qi, this.A0), cmb.v0(cmb.c6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        mt1 mt1Var = this.f;
        if (mt1Var != null) {
            mt1Var.setTextColor(on2.f(this.l2, on2.f(this.b6, this.s6 != null ? -1 : cmb.v0(cmb.li, this.A0), cmb.v0(cmb.Ej, this.A0)), -1));
        }
        trc trcVar = this.a1;
        if (trcVar != null && (l66Var = (l66) trcVar.e) != null) {
            l66Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.s6 == null ? on2.f(this.T1, cmb.v0(cmb.fd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        mt8 mt8Var = this.c0;
        if (mt8Var != null) {
            mt8Var.setColor(this.s6);
        }
        gm.d0(this.a, new ao8(this, (byte) 4));
        wp8 wp8Var = this.O;
        if (wp8Var != null && (kfaVar = wp8Var.L0) != null) {
            kfaVar.updateColors();
        }
        wp8 wp8Var2 = this.O;
        if (wp8Var2 != null && (leaVar = wp8Var2.b0) != null) {
            leaVar.m();
        }
        q4();
        P3();
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.f(true, true);
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.a();
        }
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        long j = ((bf7) arrayList.get(0)).a;
        Bundle l = ts2.l("scrollToTopOnResume", true);
        if (pg3.B(j)) {
            l.putInt("enc_id", (int) (4294967295L & j));
        } else if (pg3.D(j)) {
            l.putLong("user_id", j);
        } else if (pg3.y(j)) {
            l.putLong("chat_id", -j);
        }
        if (!getMessagesController().A(l, nk3Var, null, null)) {
            return false;
        }
        nm7 notificationCenter = getNotificationCenter();
        int i3 = nm7.s;
        notificationCenter.n(this, i3);
        getNotificationCenter().k(i3, new Object[0]);
        presentFragment(new yv1(l), true);
        removeSelfFromStack();
        getSendMessagesHelper().q0(y5a.g(getMessagesController().W1(Long.valueOf(this.e1)), j, null, null, null, null, z2, i, i2));
        if (!TextUtils.isEmpty(charSequence)) {
            a6a.Z(j5.a(this.currentAccount), charSequence, j, 0L, z2, i, i2);
        }
        return true;
    }

    public final void q2() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.o2 = point.x > point.y;
    }

    public final void q3() {
        qn8 qn8Var = this.a0;
        if (qn8Var != null) {
            if (this.s1) {
                qn8Var.F = (byte) 6;
                return;
            }
            if (this.q1) {
                qn8Var.F = (byte) 5;
                return;
            }
            if (this.s2) {
                qn8Var.F = (byte) 2;
                return;
            }
            if (this.e1 != 0) {
                qn8Var.F = (byte) 0;
                return;
            }
            if (this.f1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                if (!sd2.T(L0)) {
                    this.a0.F = (byte) 3;
                    return;
                }
                boolean n0 = sd2.n0(L0);
                qn8 qn8Var2 = this.a0;
                if (n0) {
                    qn8Var2.F = (byte) 3;
                } else if (sd2.c0(L0)) {
                    qn8Var2.F = (byte) 4;
                } else {
                    qn8Var2.F = (byte) 1;
                }
            }
        }
    }

    public final void q4() {
        if (this.s != null) {
            try {
                int v0 = cmb.v0(cmb.ni, this.A0);
                int v02 = cmb.v0(cmb.oi, this.A0);
                int v03 = cmb.v0(cmb.mi, this.A0);
                if (this.s6 != null && cmb.c1(v0)) {
                    v0 = cmb.a(0.05f, -0.04f, this.s6.c(false));
                    ec7 ec7Var = this.s6;
                    if (ec7Var != null) {
                        int d = ec7Var.d(cmb.I.o());
                        v02 = cmb.C(cmb.I.o(), cmb.v0(cmb.u6, this.A0), d, v02, d);
                    }
                    v03 = -1;
                }
                s09 s09Var = this.A6;
                s09 s09Var2 = this.s;
                int[] iArr = this.B6;
                if (s09Var == s09Var2 && iArr[0] == v0 && iArr[1] == v02 && iArr[2] == v03) {
                    return;
                }
                this.A6 = s09Var2;
                iArr[0] = v0;
                iArr[1] = v02;
                iArr[2] = v03;
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                sn2 sn2Var = new sn2(mutate, cmb.h0(gm.L(56.0f), v0, v02), 0, 0);
                int L = gm.L(56.0f);
                int L2 = gm.L(56.0f);
                sn2Var.e = L;
                sn2Var.f = L2;
                this.s.setBackground(sn2Var);
                this.s.setColorFilter(new PorterDuffColorFilter(v03, mode));
            } catch (Exception unused) {
            }
        }
    }

    public final boolean r2() {
        return this.e1 != 0 && getMessagesController().B0().f(this.e1);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r3(float f) {
        int v0;
        boolean z;
        vq8 vq8Var;
        int i;
        int f2;
        xs8 xs8Var;
        xq8 xq8Var;
        if (this.actionBar != null) {
            this.glassEngine.g();
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? gm.m : 0);
            this.m2 = f;
            float S1 = gm.S1(f, this.n2);
            this.l2 = S1;
            J1();
            this.Y.setScaleX(this.c2);
            this.Y.setScaleY(this.c2);
            this.Y.setTranslationY(gm.R1((float) Math.ceil(this.b2), 0.0f, S1));
            this.f0.setRoundRadiusForExpand((int) gm.R1(n2(), 0.0f, S1));
            yo8 yo8Var = this.f0;
            float f3 = this.c2;
            boolean z2 = this.q2;
            yo8Var.I = S1;
            yo8Var.J = f3;
            yo8Var.H = z2;
            bp8 bp8Var = this.v0;
            if (bp8Var != null) {
                bp8Var.setExpandProgress(S1);
            }
            xs8 xs8Var2 = this.w0;
            if (xs8Var2 != null) {
                xs8Var2.setExpandProgress(S1);
            }
            ita itaVar = this.T;
            if (itaVar != null) {
                itaVar.setParentExpanded(S1);
            }
            qn8 qn8Var = this.a0;
            if (qn8Var != null) {
                qn8Var.setParentExpanded(S1);
            }
            t3(S1);
            mt8 mt8Var = this.c0;
            if (mt8Var != null) {
                mt8Var.setParentExpanded(S1);
            }
            zja zjaVar = this.U0;
            if (zjaVar != null) {
                float f4 = 1.0f - S1;
                zjaVar.setAlpha(f4);
                this.U0.setScaleY(f4);
                this.U0.setVisibility(0);
                zja zjaVar2 = this.U0;
                zjaVar2.setClickable(zjaVar2.getAlpha() > 0.5f);
            }
            float E1 = E1();
            if (E1 >= 1.0f) {
                this.f0.setAlpha(1.0f);
            }
            if (!this.q2) {
                l3(E1, currentActionBarHeight);
            } else if (this.Q1 >= f2() && this.i2 < 0.33f) {
                k3();
            }
            hs9 hs9Var = this.L;
            if (hs9Var != null) {
                hs9Var.b(on2.f(S1, cmb.v0(cmb.g8, this.A0), -1275068417));
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.s6 != null ? -1 : on2.f(S1, cmb.v0(cmb.fd, this.A0), -1), PorterDuff.Mode.MULTIPLY);
            }
            x43 x43Var = this.J;
            if (x43Var != null) {
                x43Var.a(S1);
            }
            x43 x43Var2 = this.K;
            if (x43Var2 != null) {
                x43Var2.a(S1);
            }
            Q3(S1);
            float f5 = this.e2;
            float f6 = this.g2;
            float N = gm.N(8.0f);
            float N2 = gm.N(this.q2 ? 8.0f : -24.0f);
            float N3 = gm.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
            float f8 = currentActionBarHeight;
            float Y1 = (((this.Q1 + f8) - Y1()) - gm.N(30.0f)) - this.f.getBottom();
            float z3 = aq1.z(N3, f5, 2.0f, N + f5);
            float f9 = this.f2;
            float f10 = 1.0f - S1;
            float f11 = f10 * f10;
            float f12 = f10 * 2.0f * S1;
            float f13 = (z3 * f12) + (f5 * f11);
            float f14 = S1 * S1;
            float f15 = (N3 * f14) + f13;
            float z4 = (Y1 * f14) + (aq1.z(Y1, f9, 2.0f, N2 + f9) * f12) + (f9 * f11);
            float N4 = gm.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
            float Y12 = (((this.Q1 + f8) - Y1()) - gm.N(10.0f)) - this.r.getBottom();
            float z5 = aq1.z(N4, f6, 2.0f, N + f6);
            float f16 = this.h2;
            float f17 = (N4 * f14) + (z5 * f12) + (f6 * f11);
            float z6 = (f14 * Y12) + (f12 * aq1.z(Y12, f16, 2.0f, N2 + f16)) + (f11 * f16);
            float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? gm.m : 0)) - (gm.p * 21.0f)))) + gm.L(1.3f);
            float N5 = gm.N(22.7f) + floor;
            this.f.setTranslationX(f15);
            this.f.setTranslationY(Math.max(floor, z4));
            this.r.setTranslationX(h2(f17, Math.min(1.0f, E1) * this.H6));
            this.r.setTranslationY(i2(Math.max(N5, z6)));
            K3();
            d4();
            Object tag = this.r.getTag();
            if (tag instanceof Integer) {
                Integer num = (Integer) tag;
                v0 = cmb.v0(num.intValue(), this.A0);
                if (num.intValue() == cmb.ri) {
                    z = true;
                    this.r.setTextColor(on2.f(S1, B1(v0, Boolean.valueOf(z)), -1275068417));
                    if (this.Q1 > f2()) {
                        this.f.setPivotY(gm.U1(S1, 0, r4.getMeasuredHeight()));
                        float f18 = (0.12f * E1) + 1.0f;
                        this.f.setScaleX(gm.R1(f18, 1.38f, S1));
                        this.f.setScaleY(gm.R1(f18, 1.38f, S1));
                    }
                    R2(0, Math.min(1.0f, E1), true);
                    vq8Var = this.K6;
                    if (vq8Var != null) {
                        vq8Var.a(on2.f(this.l2, cmb.p1(0.5f, cmb.a(0.18f, -0.1f, this.c1)), 603979775));
                    }
                    mt1 mt1Var = this.f;
                    if (this.s6 == null) {
                        f2 = -1;
                        i = -1;
                    } else {
                        i = -1;
                        f2 = on2.f(this.l2, cmb.v0(cmb.li, this.A0), -1);
                    }
                    mt1Var.setTextColor(f2);
                    this.actionBar.H(this.s6 == null ? i : on2.f(S1, cmb.v0(cmb.u8, this.A0), i), false);
                    this.actionBar.setMenuOffsetSuppressed(true);
                    this.f0.setForegroundAlpha(S1);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                    layoutParams.width = (int) gm.R1(gm.N(100.0f), this.a.getMeasuredWidth() / this.c2, S1);
                    layoutParams.height = (int) gm.R1(gm.N(100.0f), (this.Q1 + f8) / this.c2, S1);
                    X1();
                    this.Y.requestLayout();
                    xs8Var = this.w0;
                    if (xs8Var != null) {
                        xs8Var.setExpandProgress(S1);
                    }
                    N3();
                    xq8Var = this.d1;
                    if (xq8Var == null && xq8Var.L) {
                        xq8Var.invalidate();
                        return;
                    }
                }
            } else {
                v0 = cmb.v0(cmb.A8, this.A0);
            }
            z = false;
            this.r.setTextColor(on2.f(S1, B1(v0, Boolean.valueOf(z)), -1275068417));
            if (this.Q1 > f2()) {
            }
            R2(0, Math.min(1.0f, E1), true);
            vq8Var = this.K6;
            if (vq8Var != null) {
            }
            mt1 mt1Var2 = this.f;
            if (this.s6 == null) {
            }
            mt1Var2.setTextColor(f2);
            this.actionBar.H(this.s6 == null ? i : on2.f(S1, cmb.v0(cmb.u8, this.A0), i), false);
            this.actionBar.setMenuOffsetSuppressed(true);
            this.f0.setForegroundAlpha(S1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
            layoutParams2.width = (int) gm.R1(gm.N(100.0f), this.a.getMeasuredWidth() / this.c2, S1);
            layoutParams2.height = (int) gm.R1(gm.N(100.0f), (this.Q1 + f8) / this.c2, S1);
            X1();
            this.Y.requestLayout();
            xs8Var = this.w0;
            if (xs8Var != null) {
            }
            N3();
            xq8Var = this.d1;
            if (xq8Var == null) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    public final boolean s2() {
        if (this.F2 != null) {
            return getMessagesController().l2(this.F2);
        }
        oc7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return oc7.M2(userFull);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.r0;
        if (wn5Var == null || (str = wn5Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f) {
        int v0;
        int v02;
        int v03;
        this.l2 = f;
        this.T1 = f;
        J1();
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setAlpha(f);
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.getBackButton().setTranslationX(gm.R1(l2(gm.L(2.0f), 2, this.actionBar.getBackButton()), gm.L(2.0f), f));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f);
            qn8 qn8Var = this.a0;
            if (qn8Var != null) {
                qn8Var.setParentExpanded(f);
            }
            t3(f);
            mt8 mt8Var = this.c0;
            if (mt8Var != null) {
                mt8Var.setParentExpanded(f);
            }
            ita itaVar = this.T;
            if (itaVar != null) {
                itaVar.setParentExpanded(f);
            }
            K3();
            d4();
        }
        this.a.setAlpha(f);
        this.a.setTranslationX(gm.L(48.0f) - (gm.L(48.0f) * f));
        if (this.J1 != 2 || (v0 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (sd2.S(this.currentAccount, this.f1)) {
                    boolean z = this.F2.megagroup;
                }
            }
            ylb ylbVar = this.A0;
            int[][] iArr = pc0.L;
            v0 = cmb.v0(cmb.Z6, ylbVar);
        }
        int i = this.h5;
        if (i == 0) {
            i = cmb.v0(cmb.r8, this.A0);
        }
        this.d1.setBackgroundColor(on2.f(f, on2.p(i, 0), v0));
        sqb sqbVar = this.m0;
        int f2 = on2.f(f, i, v0);
        sqbVar.k = true;
        sqbVar.b.setColor(f2);
        if (this.s6 != null) {
            v02 = -1;
        } else {
            if (this.e1 == 0) {
                if (sd2.S(this.currentAccount, this.f1)) {
                    boolean z2 = this.F2.megagroup;
                }
            }
            ylb ylbVar2 = this.A0;
            int[][] iArr2 = pc0.L;
            v02 = cmb.v0(cmb.f8, ylbVar2);
        }
        this.actionBar.H(on2.f(this.T1, cmb.v0(cmb.u8, this.A0), v02), false);
        int v04 = this.s6 == null ? cmb.v0(cmb.li, this.A0) : -1;
        int v05 = cmb.v0(cmb.z8, this.A0);
        mt1 mt1Var = this.f;
        if (mt1Var != null && this.J1 != 2) {
            mt1Var.setTextColor(on2.f(f, v05, v04));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            v03 = cmb.v0(cmb.ri, this.A0);
        } else {
            if (this.e1 == 0) {
                if (sd2.S(this.currentAccount, this.f1)) {
                    boolean z3 = this.F2.megagroup;
                }
            }
            ylb ylbVar3 = this.A0;
            int[][] iArr3 = pc0.L;
            v03 = cmb.v0(cmb.g8, ylbVar3);
        }
        int v06 = cmb.v0(zArr[0] ? cmb.oa : cmb.A8, this.A0);
        ap8 ap8Var = this.r;
        if (ap8Var != null && this.J1 != 2) {
            ap8Var.setTextColor(on2.f(f, v06, B1(v03, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f;
        long j = this.e1;
        if (j == 0) {
            j = this.f1;
        }
        ylb ylbVar4 = this.A0;
        int[][] iArr4 = pc0.L;
        int v07 = cmb.v0(cmb.o8[pc0.d(j)], ylbVar4);
        long j2 = this.e1;
        if (j2 == 0) {
            j2 = this.f1;
        }
        int c = pc0.c(j2);
        if (v07 != c) {
            this.q0.g(on2.f(f, c, v07));
            this.f0.invalidate();
        }
        int i2 = this.i5;
        if (i2 != 0) {
            setNavigationBarColor(on2.f(f, i2, getNavigationBarColor()));
        }
        this.d1.invalidate();
        Q2(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        fq8 fq8Var = this.o6;
        if (fq8Var != null) {
            fq8Var.invalidate();
        }
        if (a() > 0) {
            yo8 yo8Var = this.f0;
            if (yo8Var != null) {
                yo8Var.setProgressToStoriesInsets(this.T1);
            }
            bp8 bp8Var = this.v0;
            if (bp8Var != null) {
                bp8Var.setProgressToStoriesInsets(this.T1);
            }
            xs8 xs8Var = this.w0;
            if (xs8Var != null) {
                xs8Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setParentLayout(tk5 tk5Var) {
        super.setParentLayout(tk5Var);
        s34 s34Var = this.Y1;
        if (s34Var != null) {
            s34Var.g();
            this.Y1 = null;
        }
        if (tk5Var == null || tk5Var.getParentActivity() == null) {
            return;
        }
        this.Y1 = new s34(tk5Var.getParentActivity().getWindow(), new tn8(this, (byte) 8));
    }

    @Override // cga
    public final boolean t() {
        return this.n6;
    }

    public final boolean t2(z82 z82Var) {
        if ((this.r5 instanceof yv1) || !(z82Var.getSubtitleTextView() instanceof lka)) {
            return false;
        }
        return !TextUtils.equals(((lka) z82Var.getSubtitleTextView()).getText() != null ? r3.toString() : null, this.r.getText() != null ? this.r.getText().toString() : null);
    }

    public final void t3(float f) {
        this.U5 = f;
        fr8 fr8Var = this.T5;
        if (fr8Var != null) {
            fr8Var.b(f);
        }
        Z3();
    }

    @Override // aj6
    public final void u() {
        this.a.z0(0);
    }

    public final boolean u2() {
        return (this.r0 == null || this.s1) ? false : true;
    }

    public final void u3(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.v2 = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.m1 == 0) {
                this.m1 = -j;
                getMediaDataController().g0(this.m1, this.classGuid, this.g1);
            }
        }
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.setChatInfo(this.v2);
        }
        zo8 zo8Var = this.o0;
        if (zo8Var != null && !this.q1) {
            zo8Var.setChatInfo(this.v2);
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null && (chatFull3 = this.v2) != null) {
            bp8Var.setStories(chatFull3.stories);
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.a();
        }
        yo8 yo8Var = this.f0;
        if (yo8Var != null) {
            yo8Var.setHasStories(P2());
        }
        V1();
        if (this.f1 != 0) {
            boolean z = e21.a;
            boolean z2 = (getMessagesController().I3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.Q(38, z2);
            qn8 qn8Var = this.a0;
            if (qn8Var != null) {
                qn8Var.o(3, z2);
            }
        }
    }

    public final void v2() {
        boolean z;
        TLRPC.Document document;
        if (this.b0 == null) {
            if (MediaController.w().R0 != null && MediaController.w().R0.a == this.currentAccount && MediaController.w().R0.b == a()) {
                this.b0 = MediaController.w().R0;
            } else {
                jc7 jc7Var = new jc7(this.currentAccount, a());
                this.b0 = jc7Var;
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = jc7Var.c;
                    arrayList.clear();
                    jc7Var.b();
                    arrayList.add(0, jc7Var.d(document));
                }
            }
        }
        if (this.b0.c.isEmpty()) {
            return;
        }
        if (MediaController.w().R0 == this.b0 && MediaController.w().D((k47) this.b0.c.get(0))) {
            z = true;
        } else {
            MediaController.w().j();
            z = false;
        }
        MediaController.w().R0 = this.b0;
        MediaController.w().S0.clear();
        MediaController.w().S0.addAll(this.b0.c);
        if (!z) {
            MediaController.w().R((k47) this.b0.c.get(0));
        }
        showDialog(new i30(getParentActivity(), this.A0));
    }

    public final void v3(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.P6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.P6 = tL_emojiStatusCollectible;
            hg5 hg5Var = this.M6;
            byte b = 1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.O6 = null;
            this.M6 = new hg5(getParentActivity(), 3);
            this.N6 = cmb.v(tL_emojiStatusCollectible.center_color | (-16777216), cmb.p1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.M6.setPadding(gm.L(4.0f), 0, gm.L(4.0f), gm.L(2.0f));
            hg5 hg5Var2 = this.M6;
            int p1 = cmb.p1(0.5f, tL_emojiStatusCollectible.text_color | (-16777216));
            hg5Var2.M0 = true;
            hg5Var2.U0 = System.currentTimeMillis();
            hg5Var2.N0 = new Path();
            hg5Var2.O0 = gm.N(0.66f) / 2.0f;
            hg5Var2.P0 = new Paint(1);
            hg5Var2.Q0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gm.L(64.0f), 0.0f, new int[]{cmb.p1(0.0f, p1), cmb.p1(1.0f, p1), cmb.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            hg5Var2.T0 = linearGradient;
            hg5Var2.Q0.setShader(linearGradient);
            hg5Var2.R0 = new LinearGradient(0.0f, 0.0f, gm.L(64.0f), 0.0f, new int[]{cmb.p1(0.0f, p1), cmb.p1(0.5f, p1), cmb.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            hg5Var2.S0 = new Matrix();
            hg5Var2.P0.setShader(hg5Var2.R0);
            hg5Var2.Q0.setStyle(Paint.Style.STROKE);
            hg5Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
            hg5Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
            hg5Var2.Q0.setStrokeWidth(gm.N(0.66f));
            this.Z.addView(this.M6, qoe.c(24.0f, -1));
            this.M6.u(9.33f);
            hg5 hg5Var3 = this.M6;
            Typeface o = gm.o();
            hg5Var3.I.x(o);
            hg5Var3.K.setTypeface(o);
            this.M6.t(tL_emojiStatusCollectible.title);
            hg5 hg5Var4 = this.M6;
            hg5Var4.d = -1L;
            hg5Var4.m(5.66f, 2.66f, 5.66f, 2.66f);
            hg5 hg5Var5 = this.M6;
            hg5Var5.getClass();
            hg5Var5.E = gm.N(4.0f);
            hg5Var5.F = gm.N(2.66f);
            this.M6.r();
            this.M6.q(16.0f);
            this.M6.v();
            this.M6.setOnClickListener(new go8(this, tL_emojiStatusCollectible.slug, b));
            if (this.Q1 < gm.L(82.0f)) {
                this.O6 = Boolean.FALSE;
                this.M6.setAlpha(0.0f);
            }
            N3();
            hg5 hg5Var6 = this.M6;
            Objects.requireNonNull(hg5Var6);
            gm.d3(new hi(hg5Var6, (byte) 7), 6000L);
        }
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    public final void w2(float f, float f2, int i) {
        byte b = 0;
        switch (i) {
            case 0:
                boolean z = this.q1;
                if (!z) {
                    if (this.e1 == 0) {
                        if (this.f1 != 0) {
                            if (!sd2.c0(getMessagesController().L0(Long.valueOf(this.f1)))) {
                                if (!W1()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", this.f1);
                                    if (getMessagesController().A(bundle, this, null, null)) {
                                        presentFragment(new yv1(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", this.f1);
                                if (getMessagesController().A(bundle2, this, null, null)) {
                                    presentFragment(new yv1(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        e3();
                        break;
                    }
                } else if (z) {
                    W1();
                    break;
                }
                break;
            case 1:
                X2(this.a0, f, f2, true);
                break;
            case 2:
                f3();
                break;
            case 3:
                V2();
                break;
            case 4:
                Y2();
                break;
            case 5:
            case 10:
            case 11:
                U2(false);
                break;
            case 6:
                U2(true);
                break;
            case 7:
                W2(true);
                break;
            case 8:
                da9.F0(a(), this);
                break;
            case 9:
                N2(false);
                break;
            case 12:
                getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                he heVar = new he(3, this.A0, getParentActivity());
                heVar.q(200L);
                oc7.r1(this.currentAccount).N1().j(a(), new u35(this, heVar, (byte) 21), true, this.A0);
                break;
            case 13:
                T2(true);
                break;
            case 14:
                a3();
                break;
            case 15:
                TLRPC.User f3 = getUserConfig().f();
                if (f3 != null) {
                    bu5 I = bu5.I(this, this.a0);
                    I.w = false;
                    I.i = (byte) 3;
                    I.b(R.drawable.msg_qrcode, jb6.M0(2131746233, null), new v56(this, (byte) 26), false);
                    I.b(R.drawable.msg_copy, jb6.M0(2131746411, null), new lo8(f3, b), false);
                    I.b(R.drawable.msg_edit, jb6.M0(2131746353, null), new v56(this, (byte) 27), false);
                    I.Z = true;
                    I.b0(f - gm.L(8.0f), this.a0.getMeasuredHeight() - gm.L(16.0f));
                    I.a0();
                    break;
                }
                break;
            case 16:
                presentFragment(new UserInfoActivity());
                break;
            case 17:
                presentFragment(new daa(null));
                break;
        }
    }

    public final void w3(boolean z) {
        Drawable t = this.f0.getImageReceiver().t();
        String str = null;
        if (t instanceof jbc) {
            this.f0.v(null, null, t);
            return;
        }
        if (t instanceof kn) {
            kn knVar = (kn) t;
            this.f0.v(null, null, knVar);
            if (z) {
                knVar.f(this.f0);
                return;
            }
            return;
        }
        gn5 D = this.o0.D(0);
        if (D != null && D.p == 2) {
            str = "avatar";
        }
        this.f0.v(D, str, t);
    }

    public final /* synthetic */ void x2(Context context, long j, TL_payments.connectedBotStarRef connectedbotstarref) {
        int i = this.currentAccount;
        if (connectedbotstarref == null) {
            mh1.J0(context, i, this.w2.starref_program, getUserConfig().e(), this.A0, false);
        } else {
            mh1.K0(context, i, connectedbotstarref, j, this.A0);
        }
    }

    public final void y2(Boolean bool) {
        long j = this.e1;
        if (j == 0) {
            long j2 = this.f1;
            j = j2 != 0 ? -j2 : this.i1;
        }
        long j3 = j;
        boolean booleanValue = bool.booleanValue();
        int i = this.currentAccount;
        if (booleanValue) {
            oc7.r1(i).S(this.k5, j3);
        } else {
            oc7.r1(i).d0(this.k5, this.j5, j3);
        }
        this.j5 = 0;
        c4(false, false);
        b31 b31Var = new b31(getParentActivity(), this.A0);
        b31Var.d(R.raw.chats_infotip, new String[0]);
        b31Var.b.setText(jb6.M0(2131746137, null));
        c41.b0(this).b(b31Var, 1500).j();
    }

    @Override // aj6
    public final nz4 z() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void z2(oh2[] oh2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = getMessagesController().n1(this.e1);
        tL_messages_reportReaction.peer = getMessagesController().i1(this.k5);
        tL_messages_reportReaction.id = this.j5;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, new nf2((byte) 4));
        oh2 oh2Var = oh2VarArr[0];
        if (oh2Var != null && oh2Var.b()) {
            getMessagesController().b0(-this.k5, getMessagesController().W1(Long.valueOf(this.e1)));
        }
        this.j5 = 0;
        c4(false, false);
        c41.b0(this).E(this.A0).j();
    }

    public final void z3(dq8 dq8Var) {
        if (this.t5 == dq8Var) {
            return;
        }
        this.t5 = dq8Var;
        gm.d0(this.a, new ao8(this, (byte) 1));
    }

    @Override // aj6
    public final void F() {
    }

    @Override // vn5
    public final void T() {
    }

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }
}
